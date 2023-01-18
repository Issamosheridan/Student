
 
package studentweek2;
import java.util.Scanner;

public class Exer1 {
    public static void main (String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a word");
        String word= input.nextLine();
        char[] myLetters= new char[word.length()];
        
        for (int i = 0; i<myLetters.length;i++){
        myLetters[i]=word.charAt(i); //stores user input
        System.out.print(myLetters[i]);
    }
        System.out.println();
        for(int i= myLetters.length-1; i>=0; i--){ //print array backwards
            System.out.print(myLetters[i]);
            
        }
            
    }
}

   
