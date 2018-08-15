package student;

public class Studentinfo {

	   static int rollnum=1;
		String name;
		long mobile;
		double fees;
		
		public Studentinfo() {
			// TODO Auto-generated constructor stub
		}

		public static int getRollnum() {
			return rollnum;
		}
		public String getName() {
			return name;
		}
		public long getMobile() {
			return mobile;
		}
		public double getFees() {
			return fees;
		}
		public static void setRollnum(int rollnum) {
			Studentinfo.rollnum = rollnum;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setMobile(long mobile) {
			this.mobile = mobile;
		}
		public void setFees(double fees) {
			this.fees = fees;
		}

		

		
		
}
