package q195;

public class Person {
	private String name;
	private String tel;
	private String adrs;

	public Person(String name, String tel, String adrs) {
		this.name = name;
		this.tel = tel;
		this.adrs = adrs;
	}

	public void setName(String name) {
		if (name.length() <= 100) {
			this.name = name;
		}
	}

	public void print() {
		System.out.println("name : " + name);
		System.out.println("tel : " + tel);
		System.out.println("addr : " + adrs);
	}
}
