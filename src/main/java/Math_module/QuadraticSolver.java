package Math_module;

import java.util.ArrayList;
import java.util.Objects;

import static java.lang.Math.sqrt;

/**
 * QuadraticSolver - реализует решение квадратного уравнения
 */
public class QuadraticSolver{


    public ArrayList<Double> solve(Equation obj) {
        ArrayList<Double> roots = new ArrayList<>();
        if (obj.getA_arg() == 0)
        {
            roots.add(((-1) * obj.getC_arg()) / obj.getB_arg());
        } else {
            double formula_D = obj.getB_arg() * obj.getB_arg() - 4 * obj.getA_arg() * obj.getC_arg();
            if (formula_D > 0) {
                roots.add(
                        ((-1) * obj.getB_arg() + sqrt(formula_D)) / (2 * obj.getA_arg())
                );
                roots.add(
                        ((-1) * obj.getB_arg() - sqrt(formula_D)) / (2 * obj.getA_arg())
                );
            } else if(formula_D ==0){
                roots.add(
                        ((-1)*obj.getB_arg())/(2*obj.getA_arg())
                );
            }else
            {
                roots.add(Double.NaN);
            }
        }

        return roots;
    }

}
