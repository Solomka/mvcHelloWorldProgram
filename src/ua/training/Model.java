package ua.training;

/**
 * Created by Solomka on 11.04.2017
 */
public class Model {

	private String helloValue;
	private String worldValue;

	public void setHelloWorldValue(String helloValue, String worldValue) {
		this.helloValue = helloValue;
		this.worldValue = worldValue;
	}

	public String getHelloValue() {
		return helloValue;
	}

	public String getWorldValue() {
		return worldValue;
	}

	/**
	 * generate Hello world! greeting
	 * 
	 * @return Hello world! greeting concatenated String
	 */
	public String generateHelloWorldStatement() {
		return helloValue + " " + worldValue;
	}

}
