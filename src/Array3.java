import java.util.Scanner;
public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String [] Names= new String[3];
Scanner scanner = new Scanner (System.in);

System.out.println("Enter three names");
 int i = 0;
for (i = 0; i < 3; i ++){
	Names[i] = scanner.nextLine();
		
}
			
System.out.println(Names[0]);
		
	}

}
