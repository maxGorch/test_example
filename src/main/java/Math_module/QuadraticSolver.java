package Math_module;

import java.util.ArrayList;
import java.util.Objects;

import static java.lang.Math.sqrt;

/**
 * QuadraticSolver - реализует решение квадратного уравнения
 */
public class QuadraticSolver {
    private double a_arg;
    private double b_arg;
    private double c_arg;

    QuadraticSolver(double user_a, double user_b, double user_c) {
        this.a_arg = user_a;
        this.b_arg = user_b;
        this.c_arg = user_c;
    }

    //Основные методы(геттеры, сеттеры, hashCode,equals)
    public double getA_arg() {
        return a_arg;
    }

    public void setA_arg(double a_arg) {
        this.a_arg = a_arg;
    }

    public double getB_arg() {
        return b_arg;
    }

    public void setB_arg(double b_arg) {
        this.b_arg = b_arg;
    }

    public double getC_arg() {
        return c_arg;
    }

    public void setC_arg(double c_arg) {
        this.c_arg = c_arg;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof QuadraticSolver that)) return false;
        return Double.compare(getA_arg(), that.getA_arg()) == 0 && Double.compare(getB_arg(), that.getB_arg()) == 0 && Double.compare(getC_arg(), that.getC_arg()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getA_arg(), getB_arg(), getC_arg());
    }

    public ArrayList<Double> solve(QuadraticSolver example) {
        ArrayList<Double> roots = new ArrayList<>();

        if (example.getA_arg() == 0)
        {
            roots.add(((-1) * example.getC_arg()) / example.getB_arg());
        } else {
            double formula_D = example.getB_arg() * example.getB_arg() - 4 * example.getA_arg() * example.getC_arg();
            if (formula_D > 0) {
                roots.add(
                        ((-1) * example.getB_arg() + sqrt(formula_D)) / (2 * example.getA_arg())
                );
                roots.add(
                        ((-1) * example.getB_arg() - sqrt(formula_D)) / (2 * example.getA_arg())
                );
            } else if(formula_D ==0){
                roots.add(
                        ((-1)*example.getB_arg())/(2*example.getA_arg())
                );
            }
        }

        return roots;
    }

}
