package constructor;

public class PersonTest {

	public static void main(String[] args) {
		Person personLee = new Person();
		personLee.name = "서의현";
		personLee.weight = 55;
		personLee.height = 164;
		System.out.println(personLee.name+" / "+personLee.weight+" / "+personLee.height);
		Person person = new Person("서지웅",168,65);
		System.out.println(person.name+" / "+person.height+" / "+person.weight);

	}

}
