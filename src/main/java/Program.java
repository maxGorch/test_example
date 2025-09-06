import IO_module.*;
import Math_module.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class Program {
    public static void main(String[] args) throws FileNotFoundException {
        WithConsole console = new WithConsole();
        ArrayList<Double> coeffs_1 = console.inputWithConsole();
        Equation eqWithCoeffs = new Equation(coeffs_1);
        QuadraticSolver solver = new QuadraticSolver();
        ArrayList<Double> result = solver.solve(eqWithCoeffs);
        console.outputWithConsole(result);

        WithFile file = new WithFile();
        try
        {
            ArrayList<ArrayList<Double>> all_coeffs = file.readFile(
                    new FileReader("src/input.txt")
            );
            System.out.println("Прочитано: " + all_coeffs);

            try (var writer = new FileWriter("src/output.txt"))
            {
                for (ArrayList<Double> coeffs:all_coeffs)
                {

                    Equation eqWithCoeffs_1 = new Equation(coeffs);
                    ArrayList<Double> roots =solver.solve(eqWithCoeffs_1);

                    file.writeFile(writer,roots);
                    writer.write(System.lineSeparator());

                    System.out.println("Корни уравнения " + coeffs + ": " + roots);
                }

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}