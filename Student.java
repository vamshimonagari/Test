

public class Student {

   static int rollnum=1;
	String name;
	long mobile;
	double fees;
	
	
	
	public Student(int rollnum, String name, long mobile, double fees) {
		super();
		Student.rollnum = rollnum;
		this.name = name;
		this.mobile = mobile;
		this.fees = fees;
		
		
	}
	
	

public void display()
{
	
	
	

	 System.out.println(rollnum+" "+name+" "+mobile+" "+fees);
	 
	 

}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1=new Student(rollnum,"vamshi", 51076656, 30500.49);
		Student s2=new Student(rollnum, "sachin", 51872637, 36000.00);
		Student s3=new Student(rollnum, "Tarun", 59832658, 39049.99);
		Student s4=new Student(rollnum, "Sanjay", 57192017, 39999.99);
		
		s1.display();
		rollnum++;
		s2.display();
		rollnum++;
		s3.display();
		rollnum++;
		s4.display();
		rollnum++;
		
		
		
		
	}

}
