package view;

import domain.User;
import utils.Rule;
import utils.Validator;

import java.util.Scanner;

/**
 * author {yhh1056}
 * Create by {2020/09/03}
 */
public class Input extends Rule {
    private Scanner scanner;
    private Validator validator;

    public Input() {
        this.scanner = new Scanner(System.in);
        this.validator = new Validator();
    }

    public User getUserInputData() {
        String[] carNames = toSplitComma(inputCarNames());
        validator.isValidName(carNames);

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
