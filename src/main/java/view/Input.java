package view;

import java.util.Scanner;

/**
 * author {yhh1056}
 * Create by {2020/09/03}
 */
public class Input {
    private Scanner scanner;
    private User user;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public User getUserInputData() {
        String[] carNames = toSplitComma(inputCarNames());
        return new User(carNames, inputGameCount());
    }

    private String inputCarNames() {
        return scanner.nextLine();
    }

    private String[] toSplitComma(String inputCarNames) {
        return inputCarNames.split(",");
    }

    private int inputGameCount() {
        return Integer.parseInt(scanner.nextLine());
    }

}
