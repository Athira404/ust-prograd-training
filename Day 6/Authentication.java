/*2.  Write a java program that let the user choose his/her username and password.
    The program verifies whether the chosen username and password are valid.
    If either one of them is invalid, it notifies the user by raising exception and explain the cause of invalidity.
    The rules for choosing valid usernames and passwords are:
	a. A username must be of length 6-15 characters.
	b. A username must start with an uppercase English alphabet A to Z.
	c. A password must not be shorter than 8 characters but must not exceed 256.
	d. There cannot be any types of parentheses or whitespaces in a valid username or password.
	e. A password cannot contain or be the same as its associated username */

import java.util.*;

class InputInvalidException extends Exception{
    public InputInvalidException(String message){
        super(message);
    }
}
public class Authentication {
    public static void main(String[] args) throws Exception {
        String username, password;
        int j=0;
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.print("Enter username : ");
            username = scanner.nextLine();
            if (username.length()<6 || username.length()>15 )
                throw new InputInvalidException("Username must be of length 6-15 characters");
            if (!Character.isUpperCase(username.charAt(0)))
                throw new InputInvalidException("Username must start with an uppercase English alphabet A to Z");
            for (int i=0;i<username.length();i++)
                if (username.charAt(i) == ' ' || username.charAt(i) == ')' || username.charAt(i) == '(')
                    throw new InputInvalidException("Username cannot contain parentheses or whitespaces");
            System.out.print("Enter password : ");
            password = scanner.nextLine();
            if (password.length()<8 || password.length()>256)
                throw new InputInvalidException("Password must not be shorter than 8 characters but must not exceed 256");
            for (int i=0;i<password.length();i++)
                if (password.charAt(i)==' ' || password.charAt(i)==')' || password.charAt(i)=='(')
                    throw new InputInvalidException("Password cannot contain parentheses or whitespaces");
            for (int i=0;i<password.length();i++){
                if(password.charAt(i)==username.charAt(j))
                    j++;
                else
                    j=0;
                if(j==username.length()){
                    throw new InputInvalidException("Password cannot contain the user name");
                }
            }
            if (password.equals(username))
                throw new InputInvalidException("Password cannot same as the username");
            System.out.println("Username and Password is valid");
        }
        catch (InputInvalidException ie){
                System.out.println(ie);
        }
    }
}
