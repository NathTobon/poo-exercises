package Services;

import Entity.Operation;

public class OperationServices {

    // createOperation
    public Operation createOperation(int num1, int num2) {
        Operation operation = new Operation(num1, num2);
        return operation;
    }

    // add, subtract, multiply, divide.
    public int add(Operation operation) {
        int num1 = operation.getNum1();
        int num2 = operation.getNum2();
        int total = num1 + num2;
        return total;
    }

    public int substract(Operation operation) {
        int num1 = operation.getNum1();
        int num2 = operation.getNum2();
        int total = num1 - num2;
        return total;
    }

    public int multiply(Operation operation) {
        int num1 = operation.getNum1();
        int num2 = operation.getNum2();
        int total = 0;
        if (num1 == 0 || num2 == 0) {
            total = 0;
        } else {
            total = num1 * num2;
        }

        return total;
    }

    public double divide(Operation operation) {
        int num1 = operation.getNum1();
        int num2 = operation.getNum2();
        double total = 0;
        if (num1 == 0 || num2 == 0) {
            total = 0;
        } else {
            total = (double) num1 / (double) num2;
        }

        return total;
    }

}
