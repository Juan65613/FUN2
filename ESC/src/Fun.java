import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fun {

	public static void main(String[] args) throws IOException {
		BufferedReader buffer = new BufferedReader(
				new InputStreamReader(
						new FileInputStream("SELLS,seller,products"),"utf-8"));
		
		String linea="";
		int numlinea=0;
		while ((linea=buffer.readLine())!=null)
		{
			String[] partes = linea.split(",");
			
			numlinea++;
			System.out.println(numlinea + ".-0" + linea);
			for (int i = 0; i < partes.length; i++) {
				System.out.println(partes[i]);
			}
			System.out.println("---------------");
			}
			
			
			
		}
						

	}


