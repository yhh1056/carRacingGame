package utils;

/**
 * author {yhh1056}
 * Create by {2020/09/03}
 */
public class Rule implements RuleInterface{
    public final int randomNumberBounds = 10;
    public final int moveToNumber = 4;
    public final int winnerIndex = 0;

    @Override
    public boolean isMoved(int number) {
        return number >= moveToNumber;
    }
}
