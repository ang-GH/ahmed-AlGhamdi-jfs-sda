import java.util.Scanner;

public class lesson_1 {
	public static void main(String[] args)  {
		
		cal c1 = new cal();
		boolean stop = true;
		Scanner in = new Scanner(System.in);
		
		
		while(stop) {
			
			System.out.print("enter first number: ");
			float num1 = in.nextFloat();
			
			System.out.print("enter second number: ");
			float num2 = in.nextFloat();
			System.out.print(" addition : 1 \n subtraction : 2 \n multiplication : 3 \n division : 4   ");
			int var = in.nextInt();
			
			c1.run(num1, num2, var);
			System.out.print("do you want to continue y/n: ");
			if(in.next().equalsIgnoreCase("n")) {
				stop = false ;
			}
		
		}
		in.close();
		

	}
	
}
class cal{
	public void run(float num1,float num2,int var) {
		switch (var) {
		case 1:
				System.out.println(num1+" + "+num2+" = "+(num1+num2));
				break;
		case 2:
				System.out.println(num1+" - "+num2+" = "+(num1-num2));
				break;
		case 3:
				System.out.println(num1+" * "+num2+" = "+(num1*num2));
				break;
		case 4:
				System.out.println(num1+" / "+num2+" = "+(num1/num2));
				break;
		}
			
	}
}


