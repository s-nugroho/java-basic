
public class InheritTrain {

    public static void main(String[] args) {
        new B(1);
    }
}

class A {

    public String paramA = "STRING FROM A";

    public A() {
        System.out.println("\nCONSTRUCTOR A || NO PARAM");
    }        
    
    public A(int a) {
    //   System.out.println("in A but with super const with specific const");   
    
        System.out.println("CONSTRUCTOR A || WITH PARAM");
    }
}

class B extends A {

    public B() {
        System.out.println("CONSTRUCTOR B || NO PARAM");
    }

    public B(int a) {
        super(a); //calling constructor parent class with param int
        System.out.println("CONSTRUCTOR B || WITH PARAM");
    }
}

class C extends B {
    
    public C() {
        System.out.println("const C");
    }
}