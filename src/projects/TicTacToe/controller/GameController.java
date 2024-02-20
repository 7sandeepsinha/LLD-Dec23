package projects.TicTacToe.controller;

import projects.TicTacToe.model.*;
import projects.TicTacToe.service.winningStrategy.WinningStrategy;

import java.util.List;

public class GameController {

    //create game will automatically start the game
    public Game createGame(int dimension, List<Player> players, WinningStrategy winningStrategy){
        return null;
    }

    public void displayBoard(Game game){
        game.getCurrentBoard().displayBoard();
    }

    public GameStatus getGameStatus(Game game){
        return null;
    }

    public Player getWinner(Game game){
        return null;
    }

    public Move executeMove(Game game, Player player){
        return null;
    }

    public Player checkWinner(Game game, Move lastMovePlayed){
        return null;
    }

    public Board undoMove(Game game, Move lastPlayedMove){
        return null;
    }

    public void replayGame(Game game){

    }






}
