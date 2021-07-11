import java.io.*;
import java.util.Scanner;
public class lesson_3 {

	public static void main(String[] args) throws IOException {
		try{ 
			
			Scanner in = new Scanner(System.in);
		
			String s ;
			
			FileReader re = new FileReader("demo.txt");
		
			System.out.println("new write : 1 \nappend write : 2 \nread : 3");
			
			int x = in.nextInt();
			
			if (x==1) {
				
				System.out.println("enter the string :");
				
				FileWriter wr = new FileWriter("demo.txt",false);
				s = in.next();
				s = s + in.nextLine(); 
				
				wr.write(s);
				wr.flush();
				wr.close();
				
			}else if(x==2) {
				
				System.out.println("enter the string :");
				
				FileWriter wr = new FileWriter("demo.txt",true);
				s = in.next();
				s = s + in.nextLine(); 
				
				wr.write(s);
				wr.flush();
				wr.close();
				
			}else {
				
				Scanner read = new Scanner(re);
				System.out.println(read.nextLine());
				read.close();
			}
			
			
			re.close();
			in.close();

		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
