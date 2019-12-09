package en.wcs.introSpring.controller;

// "prototypisches JavaBean"
public class WildObject {

	private String name;
	
	private int age;

	public WildObject(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
}
