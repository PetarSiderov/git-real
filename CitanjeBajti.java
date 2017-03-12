package materijali;

import java.io.*;

public class CitanjeBajti {

	public static void main(String[] args) throws IOException {
		
		FileInputStream vlez = null ;
		FileOutputStream izlez = null;
		
		StringBuilder sb = new StringBuilder();
	
		
		try
		{
			vlez = new FileInputStream("vlez.txt");
			izlez = new FileOutputStream("izlez.txt");
			
			int c;
			
			while ((c=vlez.read() ) != -1 )
				
			{
				sb.append((char)c);
				izlez.write(c);
			}
			System.out.println(sb.toString());
			
		}
		
		finally
		{
			if ( vlez != null )
				vlez.close();
			
			if ( izlez != null )
				izlez.close();
		}
	}

}
