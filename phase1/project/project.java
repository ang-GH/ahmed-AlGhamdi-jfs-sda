import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class project {

	public static void main(String[] args) {
		
		menu m = new menu();
		m.runn();

	}
	
	

}
class menu{
		Scanner in = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		
		
		public void runn() {
			String name ;
			int num ;
			while(true) {
				// first window that appears
				System.out.println("1:menu\n2:exit");
				
				// if the user enters 2 he exits the program
				if (in.nextInt()==2) {
					break;
					
				}else {
					
					System.out.println(" ");
					
					while(true) {
						// Second window that appears file 
						System.out.println("1:add file\n2:delete file\n3:search file\n4:list display\n5:exit");
						num = in.nextInt();
						System.out.println(" ");
						
						
						// if the user enters 1 he gets to add a new file 
						if(num==1) {
							
							System.out.println("enter tha file name :");
							name = in.next();
							System.out.println(" ");
							
							if(add(list,name)) {
								System.out.println("file has been added successfully");
								
							}else {
								System.out.println("this file name already exists");
								
							}
						}
						
						// if the user enters 2 he gets to delete a file 
						else if(num==2) {
							
							System.out.println("enter tha file name :");
							name = in.next();
							System.out.println(" ");
							
							if(delete(list, name)) {
								System.out.println("file has been deleted successfully");
							}else {
								System.out.println("this file dose not exist");
							}
						}
						
						// if the user enters 3 
						else if(num==3) {
							
							System.out.println("enter tha file name :");
							name = in.next();
							System.out.println(" ");
							
							if(search(list, name)) {
								System.out.println("file : "+name+" : has been found in the list");
							}else {
								System.out.println("the file was not found");
							}
								
						}
						
						else if (num==4) {
							if(display(list)) {
								
							}else {
								System.out.println("no files wear found");
							}
							
						}
						
						// if the user enters 4 he goes back to the first window 
						else if (num==5) {
							break;
						}
						
						
						System.out.println("<=====================================>\n");
					}
				}
				
			}
				
		}
		
		public boolean add(ArrayList<String> list , String item) {
			// if the item already exists it dose not get to be added
			if(search(list,item)) {
				return false;
				
			}else {
				list.add(item);
				return true;
			}
			
		}
		
		public boolean delete(ArrayList<String> list , String item) {
			if(search(list,item)) {
				list.remove(item);
				return true;
				
			}else {				
				return false;
			}
		}
		
		public boolean display(ArrayList<String> list) {
			if(list.isEmpty()) {
				return false;
				
			}else {				
				Collections.sort(list);
				
				System.out.println("}---------------------{");
				for(String s : list) {
					System.out.println(s);
				}
				System.out.println("}---------------------{\n");
				return true;
			}
		}
		
		public boolean search(ArrayList<String> list , String item) {
			for(String s : list) {
				if(s.equals(item)) {
					return true;
				}
			}
			return false;
		}
	}
		