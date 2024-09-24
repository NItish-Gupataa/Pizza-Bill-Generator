//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Enter 1 "+"BASE PIZZA");
        System.out.println("Enter 2 "+"DELUX PIZZA");
        System.out.println("Enter 3 "+"BACK TO HOME");

     while (true){
         int ch;
         System.out.println("ENTER YOUR CHOICE");
         Scanner obj = new Scanner(System.in);
         ch = obj.nextInt();
         switch (ch){
             case 1 : Pizza basePizza = new Pizza(true);
                      basePizza.getBill();

                 System.out.println("Enter 1 "+"ADD EXTRA CHEESE");
                 System.out.println("Enter 2 "+"ADD EXTRA TOPPINGS");
                 System.out.println("Enter 3 "+"TAKE AWAY CHARGE");
                 System.out.println("Enter 4 "+"BACK TO HOME");
                 while (true){
                     int add;
                     Scanner r = new Scanner(System.in);
                     add = r.nextInt();
                     switch (add){
                         case 1 : basePizza.addExtracheese();
                                  basePizza.getBill();
                                  break;
                         case 2 : basePizza.addExtraToppings();
                                  basePizza.getBill();
                                  break;
                         case 3 : basePizza.takeAway();
                                  basePizza.getBill();
                                  break;
                         case 4 : System.out.println("THANK YOU FOR VISIT MY APP");
                                  return;

                         default:System.out.println("INVALID CHOICE");
                     }
                 }

             case 2 : System.out.println("DELUX PIZZA");
                      DeluxPzza dp = new DeluxPzza(true);
                      dp.takeAway();
                      dp.getBill();
                      break;

             case 3 : System.out.println("THANK YOU FOR VISIT MY APP");
                      return;

             default : System.out.println("INVALID CHOICE");
         }
     }
    }
}