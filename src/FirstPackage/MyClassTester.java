package FirstPackage;

public class MyClassTester {

    public static void main(String[] args){

        MyClass.print("Hello!");
        MyClass m = new MyClass("Hello!");
        MyClass.print(m.getName());

    }

}
