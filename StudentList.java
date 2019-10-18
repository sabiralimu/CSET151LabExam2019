import java.io.*;
import java.text.*;
import java.util.*;
public class StudentList {
  //read write method optimization start
  public  static  String LoadData() {
      System.out.println("Loading data ...");
      String alllines = null;
      try {
          BufferedReader newvar = new BufferedReader(
                  new InputStreamReader(
                          new FileInputStream("students.txt")));
          alllines = newvar.readLine();
      } catch (Exception e) {
          System.out.println(e);
      }
      return alllines;
  }
  public  static  void WriteDate( String[] args) {
      System.out.println("Loading data ...");
      try {
          BufferedWriter FileStream = new BufferedWriter(
          new FileWriter("students.txt", true));
          String Input = args[0].substring(1);
          Date d = new Date();
          String df = "dd/mm/yyyy-hh:mm:ss a";
          DateFormat dateFormat = new SimpleDateFormat(df);
          String fd = dateFormat.format(d);
          FileStream.write(", " + Input + "\n List last updated on ");
          FileStream.close();
      } catch (Exception e) {
          System.out.println(e);
      }
      System.out.println("Data Loaded.");
  }
  //read write method optimization end
  public static void main(String[] args) {
      //early guard during argument pass
      if(args.length != 1)
      {
          System.out.println("Usage: java StudentList a|r|c|?student1|+word");
      }
      //Check arguments
      if(args[0].equals("a"))
      {
              String alllines = LoadData();
              String words[] = alllines.split(",");
              for(String word : words)
              System.out.println(word);
              System.out.println("Data Loaded.");
      }
      else if(args[0].equals("r"))
      {
          String alllines = LoadData();
          String words[] = alllines.split(",");
          Random x = new Random();
          int y = x.nextInt(1);
          System.out.println(words[y]);
          System.out.println("Data Loaded.");
      }
      else if(args[0].contains("+")){
          WriteDate(args);
      }
      else if(args[0].contains("?"))
      {
          String  contents = LoadData();
          String wrods[] = contents.split(",");
          boolean done = false;
          String Query = args[0].substring(1);
          System.out.println("We found it!");
          done=true;
          System.out.println("Data Loaded.");
      }
      //processing
      else if(args[0].contains("c")) {
          String alllines = LoadData();
          char charactararry[] = alllines.toCharArray();
          boolean in_word = false;
          int count=0;
          for(char eachcharactar:charactararry) {
              if(eachcharactar ==' ') {
                  if (!in_word) {
                      count++;
                      in_word =true;
                  } else {
                      in_word=false;
                  }
              }
          }
          System.out.println(count +" word(s) found " + charactararry.length);
          System.out.println("Data Loaded.");
      }
  }
}