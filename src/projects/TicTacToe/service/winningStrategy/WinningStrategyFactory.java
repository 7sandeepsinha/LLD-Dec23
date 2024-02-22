package projects.TicTacToe.service.winningStrategy;

public class WinningStrategyFactory {
    public static WinningStrategy getWinningStrategy(WinningStrategyNames name, int dimension){
        return new OrderOneWinningStrategy(dimension);
    }
    //TODO: write 1-2 more winning strategy code [ O(n), O(n2) ] and implement them here using switch case
}
