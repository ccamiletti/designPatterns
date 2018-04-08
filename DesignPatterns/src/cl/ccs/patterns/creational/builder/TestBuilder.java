package cl.ccs.patterns.creational.builder;

public class TestBuilder {

	public static void main(String...strings) { 
		
//		Person person = new PersonBuilder()
//		        .with(personBuilder -> {
//		            personBuilder.salutation = "Mr.";
//		            personBuilder.firstName = "Carlo";
//		            personBuilder.lastName = "Camiletti";
//		            personBuilder.isFemale = false;
//		        }).createPerson();
		
		
		Person person = new PersonBuilder()
				.with(pb -> {
					pb.salutation = "Mr.";
					pb.firstName = "Carlo";
					pb.lastName = "Camiletti";
					pb.isFemale = false;
				}).createPerson();
		
		System.out.println(person);
		
	}
}
