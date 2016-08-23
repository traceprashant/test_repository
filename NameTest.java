public class NameTest
{
	public static void main(String[] args)
	{
		//instantiation
		Name myName = new Name("Prashant", "Satish", "Patil");
		Name yourName = new Name("Namrata", "Ratnakar", "Kulkarni");
		System.out.println("My name is " + myName.toString());
		System.out.println("Your Name is " + yourName.toString());
		Name thisName = new Name();
		Name someName = new Name();
		someName.setName("abc", "def", "ghi");
		System.out.println("someName values are " + someName.toString());
		yourName.setLast("Patil");
		System.out.println("Last name after marriage is " + yourName.getLast());
	}
}