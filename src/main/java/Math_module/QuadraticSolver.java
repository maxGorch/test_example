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

    public QuadraticSolver() {
        this.a_arg = 0;
        this.b_arg = 0;
        this.c_arg = 0;
    }
    public QuadraticSolver(double user_a, double user_b, double user_c) {
        this.a_arg = user_a;
        this.b_arg = user_b;
        this.c_arg = user_c;
    }
    public QuadraticSolver(ArrayList<Double> user_arr) {
        this.a_arg = user_arr.get(0);
        this.b_arg = user_arr.get(1);
        this.c_arg = user_arr.get(2);
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

    public ArrayList<Double> solve() {
        ArrayList<Double> roots = new ArrayList<>();

        if (getA_arg() == 0)
        {
            roots.add(((-1) * getC_arg()) / getB_arg());
        } else {
            double formula_D = getB_arg() * getB_arg() - 4 * getA_arg() * getC_arg();
            if (formula_D > 0) {
                roots.add(
                        ((-1) * getB_arg() + sqrt(formula_D)) / (2 * getA_arg())
                );
                roots.add(
                        ((-1) * getB_arg() - sqrt(formula_D)) / (2 * getA_arg())
                );
            } else if(formula_D ==0){
                roots.add(
                        ((-1)*getB_arg())/(2*getA_arg())
                );
            }else
            {
                roots.add(Double.NaN);
            }
        }

        return roots;
    }

}
