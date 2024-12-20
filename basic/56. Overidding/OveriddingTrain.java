public class OveriddingTrain {
  
    public static void main(String[] args) {
        new B().makanAyam();
    }
}


class A {

    public void makanAyam() {
        System.out.println("nyam nyam");
    }

}

class B extends A {

    // this method will automaticly overide the parent method 
    public void makanAyam() {
        System.out.println("Mmmmm . . . . ., ENAK CCOK");
    }
}