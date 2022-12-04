package day34_GarbageCollection_AccessModifiers;

public class MyCalculatorV2 {

    public int n1, n2;

    public int add(int n1, int n2){
        int result=n1+n2;
        return result;
    }

    public int minus(int n1, int n2){
        int result=n1-n2;
        return result;
    }

    public int multiply(int n1, int n2){
        int result=n1*n2;
        return result;
    }

    public int divide(int n1, int n2){
        int result=n1/n2;
        return result;
    }

    public String toString() {
        return "MyCalculatorV2{" +
                "n1=" + n1 +
                ", n2=" + n2 +
                '}';
    }
}


