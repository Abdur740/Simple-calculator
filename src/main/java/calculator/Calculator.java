/* Implement a simple calculator that performs basic arithmetic operations 
(addition, subtraction, multiplication, and division).
This project will help you understand OOP concepts such as encapsulation, inheritance, and polymorphism.*/

package calculator;
import java.util.Scanner;
import java.util.logging.Logger;

class Calculator{
    private static final Logger log = Logger.getLogger("InfoLogging");
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        SimpleCalculator scalc = new SimpleCalculator();
        log.info("Enter first value: ");
        int value = sc.nextInt();
        int option;
        scalc.setValue(value);
        do{
        log.info("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exit\nEnter option : ");
        option = sc.nextInt();
        if(option<=4 && option !=5){
            log.info("Enter second value: ");
            int value2 = sc.nextInt();
            switch (option) {
                case 1:
                scalc.addition(value2);
                scalc.result();
                break;
                case 2:
                scalc.subtraction(value2);
                scalc.result();
                break;
                case 3:
                scalc.multiplication(value2);
                scalc.result();
                break;
                case 4:
                scalc.division(value2);
                scalc.result();        
                break;
                default:
                log.info("invalid option!try again...\n");
            }
        }
    }while(option!=5);
    }
}