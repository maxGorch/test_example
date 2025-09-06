package IO_module;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * withConsole - реализует вывод/ввод через консоль
 */
public class WithConsole
{
    public ArrayList<Double> inputWithConsole()
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> arr_list = new ArrayList<>();

        double coeff_A = readDouble(scanner,"Значение первого коэффициента: ");
        arr_list.add(coeff_A);

        double coeff_B = readDouble(scanner,"Значение второго коэффициента: ");
        arr_list.add(coeff_B);

        double coeff_C = readDouble(scanner,"Значение третьего коэффициента: ");
        arr_list.add(coeff_C);

        return arr_list;
    }
    public void outputWithConsole(ArrayList<Double> user_arr)
    {
        for (double i: user_arr)
            System.out.println(i);
    }
    private static double readDouble(Scanner scanner,String message)
    {
        while(true)
        {
            System.out.println(message);
            if(scanner.hasNextDouble())
            {
                return scanner.nextDouble();
            }else{
                System.out.println("Введено не число");
                scanner.next();
            }
        }
    }
}
