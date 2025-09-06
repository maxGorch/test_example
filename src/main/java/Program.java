import IO_module.*;
import Math_module.*;

import java.util.ArrayList;


public class Program {
    public static void main(String[] args) {
        WithConsole console = new WithConsole();
        ArrayList<Double> coeffs = console.inputWithConsole();
        QuadraticSolver roots = new QuadraticSolver(coeffs);
        ArrayList<Double> result = roots.solve();
        console.outputWithConsole(result);
    }
}