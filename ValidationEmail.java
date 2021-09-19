package emailIDvalidation;
import java.util.Scanner;
public class ValidationEmail {
	public static void main(String[] args) {
		String mail1[] = {"kumar", "raja", "naresh", "joe", "ray", "rose", "emily", "nita", "surya", "divya" };
		String domain1 = "@xyz.com";
		int j=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the full Email-ID to login (including @xyz.com):");
		String inp1 = sc.next();	
		System.out.println();
		for(int i=0;i<mail1.length;i++) {
			while((mail1[i]+domain1).equals(inp1)) {
			j = i;
			break;	
			}
		}
		if((mail1[j]+domain1).equals(inp1)) {
				System.out.println("Login successful");
			}else {
				System.out.println("Login unsuccessful. Please enter valid Email-ID.");
			}
		sc.close();
	}
}
