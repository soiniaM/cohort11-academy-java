package com.bptn.course.corse_02_hello_word;

public class VariableOperations {
    public static void main(String[] args){
        int number1 = 35;
        int number2 = 4;
        int add = number1 +number2;
        int mult = number1 * number2;
        int subtract = number1 -number2;
        double div = number1/number2;
        char myChar = 'C';
        String myString =" string value";
        System.out.println("The addition result is  :" + add);
        System.out.println("The subtraction result is  :" + subtract);
        System.out.println("The multiplication result is  :" + mult);
        System.out.println("The division result is  :" + div);
        number1 = 49;
        number2 = 7;
        System.out.printf("numer1 is now : %d while number2 is : %d \n", number1,number2);
        System.out.printf("Char value is  : %c while string value is : %s ", myChar,myString);
    }
}
