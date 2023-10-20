import java.io.*;
import java.util.ArrayList;
public class food {
    FileReader frf = new FileReader("foods/foods.txt");
    FileWriter fwf = new FileWriter("foods/foods.txt");
    FileReader frfa = new FileReader("foods/fat.txt");
    FileWriter fwfa = new FileWriter("foods/fat.txt");
    FileReader frfc = new FileReader("foods/calories.txt");
    FileWriter fwfc = new FileWriter("foods/calories.txt");
    FileReader frfp = new FileReader("foods/protein.txt");
    FileWriter fwfp = new FileWriter("foods/protein.txt");
    FileReader frfs = new FileReader("foods/serving.txt");
    FileWriter fwfs = new FileWriter("foods/serving.txt");
    public food(String foodName, int calories, int protein, int fat, String serving) throws IOException {
        fwf.write(foodName);
        fwfc.write(calories);
        fwfp.write(protein);
        fwfa.write(fat);
        fwfs.write(serving);
        System.out.print(foodName);
    }
}
