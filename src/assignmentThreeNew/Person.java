package assignmentThreeNew;

public abstract class Person {
	protected int id;
	protected String name;
	protected int age;

	public Person(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public abstract String getRole();

	public String getBasicInfo() {
		return "ID: " + id + ", Name: " + name + ", Age: " + age;
	}

	public static boolean isValidAge(int age) {
		return age > 0;
	}

	public static boolean isValidName(String name) {
		return name != null && !name.trim().isEmpty();
	}
}