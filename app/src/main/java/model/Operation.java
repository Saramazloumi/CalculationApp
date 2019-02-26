package model;

import java.io.Serializable;
import java.util.Random;
import java.util.Scanner;

public class Operation implements Serializable {
    int num1, num2;
    int operand;
    int result;
    String s1;

    public Operation(int num1, int num2, int operand, int result, String s1) {
        this.num1 = num1;
        this.num2 = num2;
        this.operand = operand;
        this.result = result;
        this.s1 = s1;
    }
    public String getS1() {
        return s1;
    }

    public String toString() {

       String op = null;
        switch (operand) {

            case 1:
                op = "+";
                break;
            case 2:
                op = "-";
                break;
            case 3:
                op = "*";
                break;
            case 4:
                op = "/";
                break;
        }
        return num1 +" " + op + " " + num2 + " = " + result + "\n" + s1;
    }
}





