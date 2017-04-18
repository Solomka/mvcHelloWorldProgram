package ua.training;

/**
 * Created by Solomka on 11.04.2017
 */
public class Model {
	
	private String helloValue;
	private String worldValue;
	
	
	public String getHelloValue() {
		return helloValue;
	}


	public void setHelloValue(String helloValue) {
		this.helloValue = helloValue;
	}


	public String getWorldValue() {
		return worldValue;
	}


	public void setWorldValue(String worldValue) {
		this.worldValue = worldValue;
	}

	/**
	 * generate Hello world! greeting
	 * 
	 * @return
	 */
	public String generateHelloWorldStatement(){
		return helloValue + " " + worldValue;
	}

}
