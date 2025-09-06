package Math_module;

import java.util.ArrayList;

/**
 * Хранит в себе данные для уравнения
 */
public class Equation {
    private double a_arg;
    private double b_arg;
    private double c_arg;

    public Equation() {
        this.a_arg = 0;
        this.b_arg = 0;
        this.c_arg = 0;
    }
    public Equation(double user_a, double user_b, double user_c) {
        this.a_arg = user_a;
        this.b_arg = user_b;
        this.c_arg = user_c;
    }
    public Equation(ArrayList<Double> user_arr) {
        if(user_arr == null)
            throw new NullPointerException("Массив не должен быть null!");
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
}
