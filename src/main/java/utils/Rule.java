package utils;

/**
 * author {yhh1056}
 * Create by {2020/09/03}
 */
public class Rule implements RuleInterface{
    public final int randomNumberBounds = 10;
    public final int moveToNumber = 4;
    public final int winnerIndex = 0;
    public final char progressChar = '-';
    public final String comma = ",";
    public final String winnerMessage = " 우승했습니다.";
    public final String colon = " : ";
    public final String lineEnd = "\n";

    @Override
    public boolean isMoved(int number) {
        return number >= moveToNumber;
    }
}
