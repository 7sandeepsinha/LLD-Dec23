package projects.TicTacToe.service.botPlayingStrategy;

import projects.TicTacToe.model.Board;
import projects.TicTacToe.model.Move;
import projects.TicTacToe.model.Player;

public interface BotPlayingStrategy {

    Move makeMove(Board board, Player player);
}
