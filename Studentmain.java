package student;

public class Studentmain {

	public static void main(String[] args) {
		
		System.out.println("STUDENT DETAILS");
		System.out.println("\n");
		Studentinfo s1=new Studentinfo();
		s1.setRollnum(1);
		System.out.println(s1.getRollnum());
		s1.setName("Vamshi");
		System.out.println(s1.getName());
		s1.setMobile(519920378);
		System.out.println(s1.getMobile());
		s1.setFees(30.99);
		System.out.println(s1.getFees());
		
		System.out.println("\n");
		
		Studentinfo s2=new Studentinfo();
		s2.setRollnum(2);
		System.out.println(s2.getRollnum());
		s2.setName("Sachin");
		System.out.println(s2.getName());
		s2.setMobile(598164242);
		System.out.println(s2.getMobile());
		s2.setFees(34.49);
		System.out.println(s2.getFees());
		System.out.println("\n");
		Studentinfo s3=new Studentinfo();
		s3.setRollnum(3);
		System.out.println(s3.getRollnum());
		s3.setName("Tarun");
		System.out.println(s3.getName());
		s3.setMobile(511928368);
		System.out.println(s3.getMobile());
		s3.setFees(36.99);
		System.out.println(s3.getFees());
		System.out.println("\n");
		Studentinfo s4=new Studentinfo();
		s4.setRollnum(4);
		System.out.println(s4.getRollnum());
		s4.setName("Sanjay");
		System.out.println(s4.getName());
		s4.setMobile(518347074);
		System.out.println(s4.getMobile());
		s4.setFees(39.99);
		System.out.println(s4.getFees());
		
		
	}
}
