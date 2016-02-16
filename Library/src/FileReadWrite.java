import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReadWrite {

	public static void main(String[] args) throws Exception {
		
		
		
		
		
	/*
	 ****************************** FILE READING CODE ****************************
	 */
{
	String filename="xyz.txt";		// Change the file name
	BufferedReader br = new BufferedReader(new FileReader(new File(filename)));
	
	String line = null;
	while((line = br.readLine())!=null)
	{
		/*
		 * Do Something
		 */
	}
	
	br.close();
}	
	/*
	 * ************************************************************************
	 */






	
	/*
	 * ********************** FILE WRITING CODE*********************************
	 */
{
	String filename="xyz.txt";		// Change the file name
	BufferedWriter bw = new BufferedWriter(new FileWriter(new File(filename)));
	
	/*
	 * Write the required code in place of following
	 */
	for(int i = 0;i<10;i++)
	{
		bw.write(i);
		bw.newLine();
	}
	
	bw.close();
	
}	
	
	/*
	 * ************************************************************************
	 */
	
	
	
	
	}//Main Ends

		
}
