package ua.training;

/**
 * Created by Solomka on 11.04.2017
 */
public class View {

	public static String INPUT_HELLO_VALUE = "Input \"Hello\" value: ";
	public static String INPUT_WORLD_VALUE = "Input \"world!\" value: ";
	public static String WRONG_INPUT_VALUE = "Wrong input. Try again! ";
	public static String HELLO_WORLD_VALUE = "Greeting: ";

	public void printMessage(String gMessage) {
		System.out.println(gMessage);
	}

	public void printGreetingMessage(String message, String greeting) {
		System.out.println(message + greeting);
	}

}
