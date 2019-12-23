class person
{
	private String name;
	private int age;
	public person(int age)
	{
			System.out.println("this is parametrized constructor");
			this.age=age;
			System.out.println(this.age);
	}
	int getAge() {
		return age;
		
	}
	public static void main(String[] args) {
		person p1=new person(23);
		System.out.println(p1.getAge());
		System.out.println(p1.age);
	}
}
