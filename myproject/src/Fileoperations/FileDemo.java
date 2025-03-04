package Fileoperations;
import java.io.*;
public class FileDemo 
{
   public static void main(String[] args) 
   {
      try 
      {
         File file = new File("Myfile.txt");
         
         if(file.createNewFile())
         System.out.println("File created Successfully!");
         else 
         System.out.println ("Error, file already exists.");
      }
      catch(IOException e) 
      {
         e.printStackTrace();
      }
      try
      {
      FileWriter fw = new FileWriter("Myfile.Txt");
      fw.write("\nContent of the newly created file successfully 	written!!!");
      fw.close();
      } catch(FileNotFoundException fe) 
      { 
      System.out.println("File not found" +fe); 
      }
      catch(IOException e) 
      {
         e.printStackTrace();
      }

   }
}