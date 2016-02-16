import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		/*
		 * ******************************USING SCANNER**********************
		 */
		
{
	Scanner scanner = new Scanner(System.in);
	
	
	String line = scanner.nextLine();// Scans remaining line;sets pointer to nextline
	
	/*
	 * Many other functions can be used for the scanner class
	 */
	
}

		/*
		 * *****************************************************************
		 */

/*
 * *************************WITHOUT SCANNER**************************************
 */


{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String line = br.readLine();

}

/*
 * *****************************************************************************
 */


	}//Main Ends

}
