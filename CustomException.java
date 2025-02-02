package day_2;

import java.util.Scanner;

class MyCustomException extends Exception{
    public MyCustomException(String message){
        super(message);
    }
}

public class CustomException{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int num = sc.nextInt();
        try{
            if(num < 0){
              throw new MyCustomException("Number should be greater than 0"); 
            }
            else{
                 System.out.println("Entered number is: "+num);
            }
            
        }
        catch(Exception e){
            System.out.println(e.getMessage());//getMessage prints only message if you want to print exception name,print only e
        }
       
        
    }
}
