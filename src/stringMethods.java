import java.util.Scanner;

public class stringMethods {
     {

        String name = "Null pointers";

        int length =name.length();
        char ch = name.charAt(1);
        int index = name.indexOf(" ");
        int lastIndex = name.lastIndexOf(" ");

       // name = name.toUpperCase();
       // name=name.toLowerCase();
      //  name=name.trim();
      //  name=name.replace("l","k");


        System.out.println(length);
        System.out.println(ch);
        System.out.println(index);
        System.out.println(lastIndex);

        if( name.contains (" ") ){
            System.out.println("Your name contains a space");
        }else{
            System.out.println("Your name doesn't contains a space");
        }
    if(name.equals("rashini")){
        System.out.println("Password cannot be your name");
    }else{
        System.out.println("Password set successfully");
    }
    }
}