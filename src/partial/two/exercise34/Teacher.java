
package partial.two.exercise34;

class Teacher extends Person {
	private String code;

	public Teacher(String name, String document, int age, String code) {
		super(name, document, age);

		this.setCode(code);
	}

	@Override
	public String toString() {
		return String.format("<Teacher %s (%s)[%s] %d years>", this.getName(), this.getDocument(), this.getCode(), this.getAge());
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
