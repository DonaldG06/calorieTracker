import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print(" ======================== \n | CALORIE TRACKER MENU | \n ======================== \n");
        System.out.print(" :::  [1]  Enter Meal :::\n :::  [2]  Food List  :::\n :::  [3]  New Food   :::\n :::  Select Here: ");
        String name;
        int[] nutrients = new int[4];
        String cString = sc.nextLine();
        int choice = Integer.parseInt(cString);
        switch(choice){
           /* case 1:
                meal();
                break;
            case 2:
                listFood();
                break;*/
            case 3:
                newFood();
                break;
            default: break;
        }
    }
    //public static String[] listFood(){

    //}

    public static void newFood() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print(" :::                  :::  \n :::  Enter food name: ");
        String food = sc.nextLine();

        System.out.print(" :::  Enter calories per serving: ");
        String caloriesS = sc.nextLine();
        int calories = Integer.parseInt(caloriesS);

        System.out.print(" :::  Enter fat per serving(g): ");
        String fatS = sc.nextLine();
        int fat = Integer.parseInt(fatS);

        System.out.print(" :::  Enter protein per serving(g): ");
        String proteinS = sc.nextLine();
        int protein = Integer.parseInt(proteinS);

        System.out.print(" :::  Enter size of 1 serving (cup,tsp,tbsp,oz): ");
        String serving = sc.nextLine();
        new food(food,calories,protein,fat,serving);
    }

}
