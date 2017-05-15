package ua.training;

import java.util.Scanner;

/**
 * Created by Solomka on 11.04.2017
 */
class Controller {

	static String HELLO_VALUE_PATTERN = "Hello";
	static String WORLD_VALUE_PATTERN = "world!";

	private Model model;
	private View view;

	Controller(Model model, View view) {
		this.model = model;
		this.view = view;
	}

	void processUser() {
		Scanner scanner = new Scanner(System.in);

		String hello = processUserInput(scanner, View.INPUT_HELLO_VALUE, HELLO_VALUE_PATTERN);
		String world = processUserInput(scanner, View.INPUT_WORLD_VALUE, WORLD_VALUE_PATTERN);

		model.setHelloWorldValue(hello, world);
		view.printGreetingMessage(View.HELLO_WORLD_VALUE, model.generateHelloWorldStatement());
	}

	private String processUserInput(Scanner scanner, String message, String pattern) {
		view.printMessage(message);
		while (!scanner.hasNext(pattern)) {
			view.printMessage(View.WRONG_INPUT_VALUE + message);
			scanner.next();
		}
		return scanner.next(pattern);

	}

}
