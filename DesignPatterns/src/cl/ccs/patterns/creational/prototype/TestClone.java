package cl.ccs.patterns.creational.prototype;

public class TestClone {

	public static void main(String[] args) {
		
		
		CloneFactory cf = new CloneFactory();
		
		Sheep sally = new Sheep();
		sally.setName("I am sally");
		
		Sheep clonedSally = (Sheep)cf.getClone(sally);
		
		System.out.println(sally + " " + sally.getName());
		System.out.println(clonedSally + " " + sally.getName());

		System.out.println("sally hashcode " + System.identityHashCode(sally));
		System.out.println("clone hashcode " + System.identityHashCode(clonedSally));

		/*************************************************************************/
		
		Crow crow = new Crow();
		crow.setName("litleCrow");
		
		Crow clonedCrow = (Crow) cf.getClone(crow);
		
		System.out.println(crow + " " + crow.getName());
		System.out.println(clonedCrow + " " + clonedCrow.getName());

		System.out.println("litle crow hashcode " + System.identityHashCode(crow));
		System.out.println("clone litle crow hashcode " + System.identityHashCode(clonedCrow));

		
	}

}
