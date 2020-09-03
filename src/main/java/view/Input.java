package view;

import domain.User;
import utils.Rule;

import java.util.Scanner;

/**
 * author {yhh1056}
 * Create by {2020/09/03}
 */
public class Input extends Rule {
    private Scanner scanner;

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
        return inputCarNames.split(super.comma);
    }

    private int inputGameCount() {
        return Integer.parseInt(scanner.nextLine());
    }

}
