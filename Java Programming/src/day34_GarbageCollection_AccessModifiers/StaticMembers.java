package day34_GarbageCollection_AccessModifiers;

public class StaticMembers {

    public static int var=100;//static variable

    public static void method(){//static method

    }
    static{//static block

    }

    class class1{//static class(precondition is that you must have an outer class first)

    }


}

class A{

    static class B{
        public static void method1(){

        }
    }


}

class C{

    public static void main(String[] args) {
        A.B.method1();//to call the method in class B we must first call the outer class A and then the inner class B and then the method
    }
}
