2 READ FROM A TEXT FILE AND DISPLAY THE CONTENT
---------------------------------------------------------------------------

package Methods;
import java.io.*;
public class demo2 {

	
	public static void main(String[] args) {

		String filename="C:/Users/sasmi/OneDrive/Documents//demo.txt";

		try(BufferedReader br=new BufferedReader(new FileReader(filename))){

			String Line;

			if((Line = br.readLine()) !=null) {

				System.out.println(Line);

			}

		}

		catch(Exception e) {

			System.out.println("Filenotfound");

		}

	}

}