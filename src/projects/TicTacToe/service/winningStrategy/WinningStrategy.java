package projects.TicTacToe.service.winningStrategy;

import projects.TicTacToe.model.Move;
import projects.TicTacToe.model.Player;
import projects.TicTacToe.model.Board;

public interface WinningStrategy {
    Player checkWinner(Board board, Move lastMove);
}
