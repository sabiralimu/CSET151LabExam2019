import java.io.*;
import java.text.*;
import java.util.*;
public class StudentList {
	public static void main(String[] args) 
	{

//		Check arguments
            if (args == null || args.Length != 1)
            {
                Console.WriteLine("Usage: dotnet dev275x.rollcall.dll (a | r | c | +WORD | ?WORD)");
                return; // Exit early.
            }

		if(args[0].equals("a")) 
		{
			System.out.println("Loading data ...");			
			try {
			BufferedReader fileStream = new BufferedReader(
					new InputStreamReader(
							new FileInputStream("students.txt"))); 
			String reader = fileStream.readLine();
			String words[] = reader.split(",");			
			for(String word: reader) { System.out.println(j);
                               }
			            } 
                 catch (Exception e){} 
			System.out.println("Data Loaded.");
		}
		else if(args[0].equals("r")) 
		{
			System.out.println("Loading data ...");			
			try 
			{
			BufferedReader fileStream = new BufferedReader(
					new InputStreamReader(
							new FileInputStream("students.txt")));  
			String reader = fileStream.readLine();
			String words[] = reader.split(",");	
			Random rand = new Random();
				int randomIndex = rand.nextInt(words.length);
					System.out.println(words[y]);
			} 
			catch (Exception e){} 
			System.out.println("Data Loaded.");			
		}
		else if(args[0].contains("+"))
		{
			System.out.println("Loading data ...");			
			try
			 {
			BufferedWriter fileStream = new BufferedWriter(
					new FileWriter("students.txt", true));
			String argValue = args[0].substring(1);
	        Date fileContents = new Date();
	        String df = "dd/mm/yyyy-hh:mm:ss a";
	        DateFormat dateFormat = new SimpleDateFormat(df);
	        String fd= dateFormat.format(fileContents);
			fileStream.write(", "+t+"\nList last updated on "+fd);
			fileStream.close();
			} catch (Exception e){}
							
			System.out.println("Data Loaded.");	
		}
		else if(args[0].contains("?")) 
		{
			System.out.println("Loading data ...");			
			try {
			BufferedReader fileStream = new BufferedReader(
					new InputStreamReader(
							new FileInputStream("students.txt"))); 
			String reader = fileStream.readLine();
			String words[] = reader.split(",");	
			boolean done = false;
			String argValue = args[0].substring(1);
			for(int idx = 0; idx<i.length && !done; idx++)
			 {
				if(words[idx].equals(argValue)) {
					System.out.println("We found it!");
						done=true;
				}
			}
			} catch (Exception e){} 
			System.out.println("Data Loaded.");				
		}

		else if(args[0].contains("c")) 
		{
			System.out.println("Loading data ...");			
			try {
			BufferedReader fileStream = new BufferedReader(
					new InputStreamReader(
							new FileInputStream("students.txt"))); 
			String fileContents = fileStream.readLine();
			char characters[] = fileContents.toCharArray();			
			boolean in_word = false;
			int count=0;
			for(char c:characters) {
				if(c ==' ') 
				{
					if (!in_word) {	count++; in_word =true;
	}
					else { in_word=false;}			
				}
			}
			System.out.println(count +" word(s) found " + characters.length);
			} catch (Exception e){} 
			System.out.println("Data Loaded.");				
		}
	}
}