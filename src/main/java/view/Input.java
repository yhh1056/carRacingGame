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
    private final String inputNameMessage = "경주할 자동차의 이름을 입력해주세요" +
            " (이름은(,)쉼표 기준으로 구분 + 5글자 이내)";
    private final String inputCountMessage = "시도할 횟수는 몇회인가요?";

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
        System.out.println(inputNameMessage);
        return scanner.nextLine();
    }

    private String[] toSplitComma(String inputCarNames) {
        return inputCarNames.split(super.comma);
    }

    private int inputGameCount() {
        System.out.println(inputCountMessage);
        return Integer.parseInt(scanner.nextLine());
    }

}
