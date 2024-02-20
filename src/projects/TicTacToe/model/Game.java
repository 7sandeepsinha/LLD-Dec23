package projects.TicTacToe.model;

import projects.TicTacToe.exception.InvalidBotCountException;
import projects.TicTacToe.exception.InvalidPlayerSizeException;
import projects.TicTacToe.exception.InvalidSymbolSetupException;
import projects.TicTacToe.service.winningStrategy.WinningStrategy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Game {
    private Board currentBoard;
    private List<Player> players;
    private Player currentPlayer;
    private GameStatus gameStatus;
    private List<Move> moves;
    private List<Board> boardStates;
    private WinningStrategy winningStrategy;
    private int numberOfSymbols;

    private Game(Board currentBoard, List<Player> players, WinningStrategy winningStrategy) {
        this.currentBoard = currentBoard;
        this.players = players;
        this.currentPlayer = null;
        this.gameStatus = GameStatus.IN_PROGRESS;
        this.moves = new ArrayList<>();
        this.boardStates = new ArrayList<>();
        this.winningStrategy = winningStrategy;
        this.numberOfSymbols = players.size();
    }

    public Builder builder(){
        return new Builder();
    }

    public Board getCurrentBoard() {
        return currentBoard;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public List<Board> getBoardStates() {
        return boardStates;
    }

    public WinningStrategy getWinningStrategy() {
        return winningStrategy;
    }

    public int getNumberOfSymbols() {
        return numberOfSymbols;
    }

    public void setCurrentBoard(Board currentBoard) {
        this.currentBoard = currentBoard;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public void setBoardStates(List<Board> boardStates) {
        this.boardStates = boardStates;
    }

    public void setWinningStrategy(WinningStrategy winningStrategy) {
        this.winningStrategy = winningStrategy;
    }

    public void setNumberOfSymbols(int numberOfSymbols) {
        this.numberOfSymbols = numberOfSymbols;
    }

    public static class Builder{
        private int dimension;
        private Board currentBoard;
        private List<Player> players;
        private WinningStrategy winningStrategy;

        public Builder setCurrentBoard(Board currentBoard) {
            this.currentBoard = currentBoard;
            return this;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setWinningStrategy(WinningStrategy winningStrategy) {
            this.winningStrategy = winningStrategy;
            return this;
        }

        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }

        private void validateNumberOfPlayers(){
            // N, no bot -> players = N-1
            // N, bot present -> players = N-2
            if(players.size() < currentBoard.getDimension() - 2 || players.size() >= currentBoard.getDimension()){
                throw new InvalidPlayerSizeException("Player size should be N-2 or N-1 as per board size");
            }
        }

        private void validatePlayerSymbols(){
            HashSet<Character> symbols = new HashSet<>();
            //TODO : convert the below code in this method into Lambda Expression using streams
            for(Player player : players){
                symbols.add(player.getSymbol());
            }
            if(symbols.size() != players.size()){
                throw new InvalidSymbolSetupException("There should be unique symbols for all the players");
            }
        }

        private void validateBotCount(){
            int botCount = 0;
            //TODO : convert the below code in this method into Lambda Expression using streams
            for(Player player : players){
                if(player.getPlayerType().equals(PlayerType.BOT)){
                    botCount++;
                }
            }
            if(botCount > 1 || botCount < 0){
                throw new InvalidBotCountException("We can have maximum 1 bot per game");
            }
        }

        private void validate(){
            validateBotCount();
            validateNumberOfPlayers();
            validatePlayerSymbols();
        }

        public Game build(){
            validate();
            return new Game(new Board(dimension), players, winningStrategy);
        }
    }
}
