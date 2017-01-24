package ru.parsentev.task_001;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * @author parsentev
 * @since 18.07.2016
 */
public class Calculator {
    private static final Logger log = getLogger(Calculator.class);

    private double result = 0d;

    public void setResult(double result) {
        this.result = result;
    }

    public double getResult() {
        return this.result;
        //throw new UnsupportedOperationException();
    }

    public void add(double first, double second) {
        setResult(first + second);
        //throw new UnsupportedOperationException();
    }

    public void substract(double first, double second) {
        setResult(first - second);
        //throw new UnsupportedOperationException();
    }

    public void multiple(double first, double second) {
        setResult(first * second);
        //throw new UnsupportedOperationException();
    }

    public void div(double first, double second) {
        if(first == 0d || second == 0d){
            throw new IllegalStateException();
        }
        setResult(first / second);
        //throw new UnsupportedOperationException();
    }

    public void expand(double first, double second) {
        double res = 0d;
        for (int i = 1; i <= second; i++) {
            res = first * first;
        }
        setResult(res);
        //throw new UnsupportedOperationException();
    }
}
