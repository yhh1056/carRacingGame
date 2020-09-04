package utils;

/**
 * author {yhh1056}
 * Create by {2020/09/04}
 */
public class Validator {
    public void isValidName(String[] carNames) {
        for (String name : carNames) {
            if (name.length() > 5) {
                throw new IllegalArgumentException("이름이 다섯글자가 넘습니다.");
            }
        }
    }
}
