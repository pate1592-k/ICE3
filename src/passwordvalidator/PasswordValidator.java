/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordvalidator;

import java.util.Scanner;

public class PasswordValidator
{
   public static void main(String[] args) 
   {
       Scanner in= new Scanner(System.in); 
       
       boolean valid=false;
       do
       {
       String password= in.next();
       if(checkLength(password))
       {
           valid = true;
       }
       else{
           System.out.println("Invalid Password.Please try again!");
       }
       }while(!valid);
       
       System.out.println("valid password" + valid);
      }
   public static boolean checkUpper(String password)
    {
    String checkUpper = "(.*[A-Z].*)";
                if (!password.matches(checkUpper ))
                {
                        System.out.println("Password must have atleast one uppercase character");      
                }
       return false;
        
    }
    public static boolean checkLength(String password)
    {
        if(password.length()>=8)
        {
            return true;
        }
        return false;
    }
    public static boolean checkSpecial(String password)
    {
        String checkSpecial = "(.*[,~,!,@,#,$,%,^,&,*,(,),-,_,=,+,[,{,],},|,;,:,<,>,/,?].*$)";
                if (!password.matches(checkSpecial ))
                {
                        System.out.println("Password must have atleast one special character");
                }
       return false;
        
    }

}
