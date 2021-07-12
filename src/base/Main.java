package base;

import java.util.Locale;
import java.util.Scanner;

public class Main {
   public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
      Code encode =new Code();
     Start(encode);
    }


public static void Start (Code coder){
     String response="";
     while(!response.toLowerCase().equals("encrypt") && !response.toLowerCase().equals("decrypt")) {
         System.out.println("Do you wish to encrypt or decrypt a message?");
         response = input.nextLine();
     }
    System.out.println("Enter your message");
    String message = input.nextLine();
    System.out.println("Enter the number Key 1- 52 ");
    int key = input.nextInt();

    if ( response.toLowerCase().equals("encrypt")){
        coder.Encode(message,key);
    }else {
        coder.Decode(message,key);
    }


}
}
