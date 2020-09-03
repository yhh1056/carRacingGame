package utils;

/**
 * author {yhh1056}
 * Create by {2020/09/03}
 */
public class Rule implements RuleInterface{
    public final int randomNumberBounds = 10;
    public final int moveToNumber = 4;
    @Override
    public boolean isMoved(int number) {
        return number >= moveToNumber;
    }

    @Override
    public String showWinner() {
        return null;
    }
}
