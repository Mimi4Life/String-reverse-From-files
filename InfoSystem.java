/*
 * Author: Miriam Ekiye
 * Purpose: This program will read the uers input, reverse it unto a file multiple times
 * Date: 01/16/2020
 */
package infosystem;

import java.io.*;
import static java.lang.System.*;
import java.util.Scanner;
/**
 *
 * @author Miriam
 */
public class InfoSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
      
        
        String names;
        System.out.println("Enter the names: ");
         names = sc.nextLine();
        
  
        
         String reverse = "";
    
        for(int i = names.length()-1; i>=0; i--)
        {
            reverse = reverse + names.charAt(i);
            
            if(names.charAt(i) == ' ')
                reverse = reverse + " \n";
        }    
        System.out.println();
        System.out.println("First reverse \n"+ reverse);
            
        try{
            FileWriter fw = new FileWriter("file1.txt");
            PrintWriter pw = new PrintWriter(fw);
           pw.println("File 1 reverse ");
            pw.println(reverse);
           
            
            pw.close();
        }
        catch(IOException e)
        {
            System.out.println("ERROR");
    
        
         }
        
           //Now reading the file
        try{
            FileReader fr = new FileReader("File1.txt");
            BufferedReader br = new BufferedReader(fr);
            
            String str;
   
            while((str = br.readLine()) != null){
                out.println(str + "\n");
                   
            }
            
            br.close();
        } catch (IOException e){
            out.println("File not found ");
        }
     
        
        
        //Now rereversing and writting to the file
        
        String reverse2 = "";
        
        for(int i = reverse.length()-1; i>=0; i--)
        {
            reverse2 = reverse2 + reverse.charAt(i);
        
        }
        
        
        
        try{
           
            FileWriter fw = new FileWriter("file2.txt");
            PrintWriter pw = new PrintWriter(fw);
            pw.println("Second reverse on file2 \n ");
            pw.println(reverse2);
           
            
            pw.close();
        }
        catch(IOException e)
        {
            System.out.println("ERROR");
    
        }
       // Reading from file 2 and then reversing the words
       
       try{
            FileReader fr = new FileReader("File2.txt");
            BufferedReader br = new BufferedReader(fr);
            
            String str;
  
            while((str = br.readLine()) != null){
                out.println(str + "\n");      
            }
            
            br.close();
        } catch (IOException e){
            out.println("File not found ");
        }
        
     
     //Now rereversing and writting to the file
        
        String reverse3 = "";
        
        for(int i = reverse2.length()-1; i>=0; i--)
        {
            reverse3 = reverse3 + reverse2.charAt(i);
        
        }   
        
        System.out.println(" Third reverse order \n " + reverse3);
       
        
            String reverse4 = "";
        for(int i = reverse2.length()-1; i>=0; i--)
        {
            reverse4 = reverse4 + reverse3.charAt(i);
        
        }   
        
        System.out.println("The final sorted names \n " + reverse4);
       
       
    }
    
}
