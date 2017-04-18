package ua.training;

import java.util.Scanner;

/**
 * Created by Solomka on 11.04.2017
 */
public class Controller {

	public static String HELLO_VALUE_PATTERN = "Hello";
	public static String WORLD_VALUE_PATTERN = "world!";

	Model model;
	View view;

	public Controller(Model model, View view) {
		this.model = model;
		this.view = view;
	}

	public void processUserInput() {
		Scanner scanner = new Scanner(System.in);
		model.setHelloValue(processHelloInput(scanner));
		model.setWorldValue(processWorldInput(scanner));

		view.printGreetingMessage(View.HELLO_WORLD_VALUE, model.generateHelloWorldStatement());
	}

	private String processHelloInput(Scanner scanner) {
		view.printMessage(View.INPUT_HELLO_VALUE);
		while (!scanner.hasNext(HELLO_VALUE_PATTERN)) {
			view.printMessage(View.WRONG_INPUT_VALUE + View.INPUT_HELLO_VALUE);
			scanner.next();
		}
		return scanner.next(HELLO_VALUE_PATTERN);
	}

	private String processWorldInput(Scanner scanner) {
		view.printMessage(View.INPUT_WORLD_VALUE);
		while (!scanner.hasNext(WORLD_VALUE_PATTERN)) {
			view.printMessage(View.WRONG_INPUT_VALUE + View.INPUT_WORLD_VALUE);
			scanner.next();
		}
		return scanner.next(WORLD_VALUE_PATTERN);
	}

}
