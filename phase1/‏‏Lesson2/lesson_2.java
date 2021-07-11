import java.util.*;
public class lesson_2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		access a = new access();
		boolean entery = true ;
		while (entery) {
			System.out.println("enter your Email address :");
			if (a.check(in.next())) {
				System.out.println("WELLCOME");
				entery = false ;
			}else {
				System.out.println("WRONG Email address \n");
			}
		}
		in.close();
		
	}
}
 class access{
	 String[] email = { "empSam@gmail.com",
			 			"empSmith@gmail.com",
			 			"empHitch@gmail.com",
			 			"empKamal@gmail.com",
			 			"mngAhmed@gmail.com" };
	
	 public boolean check(String x) {
		 for( String e : email ) {
			 if (e.equals(x)) {
				return true;
			}
		 }
		 return false;		 
	 }
 }
