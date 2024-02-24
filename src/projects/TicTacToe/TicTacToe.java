package projects.TicTacToe;

import projects.TicTacToe.controller.GameController;
import projects.TicTacToe.model.*;
import projects.TicTacToe.service.winningStrategy.WinningStrategyName;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        GameController gameController = new GameController();
        int id = 1;
        List<Player> players = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to TicTacToe Game");
        System.out.println("Please enter the dimension for the board");
        int dimension = sc.nextInt();
        System.out.println("Do you want a bot in the game ? Y or N");
        String botAns = sc.next();
        if(botAns.equalsIgnoreCase("Y")){
            Player bot = new Bot(id++, '$', BotDifficultyLevel.HARD);
            players.add(bot);
        }
        while(id < dimension){
            System.out.println("Please enter the player name:");
            String playerName = sc.next();
            System.out.println("Please enter the player symbol:");
            char symbol = sc.next().charAt(0);
            Player newPlayer = new Player(id++, playerName, symbol, PlayerType.HUMAN);
            players.add(newPlayer);
        }
        Collections.shuffle(players); //randomise the player list
        Game game = gameController.createGame(dimension, players, WinningStrategyName.ORDERONEWINNINGSTRATEGY );
        int playerIndex = -1;
        while(game.getGameStatus().equals(GameStatus.IN_PROGRESS)){
            System.out.println("Current board status");
            //TODO : add the undo logic, dont ask for undo when board is empty, and dont ask for undo when bot is the player, who played the last move.
            gameController.displayBoard(game);
            playerIndex++;
            playerIndex = playerIndex % players.size();
            Move movePlayed = gameController.executeMove(game, players.get(playerIndex));
            game.getMoves().add(movePlayed); // add moves
            game.getBoardStates().add(game.getCurrentBoard()); // add board states
            Player winner = gameController.checkWinner(game, movePlayed);
            if(winner != null){
                System.out.println("WINNER IS : " + winner.getName());
                break;
            }
            if(game.getMoves().size() == game.getCurrentBoard().getDimension() * game.getCurrentBoard().getDimension()){
                System.out.println("GAME IS DRAW");
                break;
            }
        }
        System.out.println("Final Board Status");
        gameController.displayBoard(game);
        System.out.println("Do you want to replay? ");
        //TODO : make the loop run again
    }
}
/*
        dimension = 5, players = 4
        id = 1 to 4
        if(bot is present) || b p1 p2 p3
        id++ -> id = 2

        while(id < dimension)
            p1 => id++ -> 3
            p2 => id++ -> 4
            p3 => id++ -> 5

                      0  1  2  3
    List<Players> => p1 p2 p3 p4
                     i

                     i%4 => 0%4 => 0
                            1%4 => 1
                            2%4 => 2
                            3%4 => 3
                            4%4 => 0
 */