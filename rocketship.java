import java.util.Scanner;
import java.util.Random;

public class RocketShip {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      System.out.println("Enter the size for your rocket ship: ");
      
      int i;
      int lines;
      int size;
      int spaces;
      int fslash;
      int stars;
      int bslash;
      int test;
      
      size = scnr.nextInt();
      lines = size*2-1; //5
      
      for(lines = size*2-1;lines>0;lines--){
      
         System.out.println();
      
//SPACES
         for(spaces=lines; spaces>0; spaces--){
            System.out.print(" ");
         }
         
//FORWARD SLASHES

         for(fslash=2*size-lines;fslash>0;fslash--){
            System.out.print("/");
         }
         
//ASTERIKS

         System.out.print("**");
         
//BACKSLASHES

         for(bslash=2*size-lines;bslash>0;bslash--){
            System.out.print("\\");      
           }
           System.out.println();
          }
          
          System.out.print("+");
          for(int repeat = size*2;repeat>0;repeat--){
          System.out.print("=*");
          }
          System.out.print("+");
          
          
         }
        }
      
      
      /**\
      
      for lines , first line is one "/" , 
      
        for(spaces=i; spaces<=lines; spaces++){
      System.out.print("_ ");
      
      
      */      
         
    
