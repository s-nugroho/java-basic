class Test {
    public String seeWhat(String obj) {
        return "i saw "+ obj;
    }

    public String seeWhat(String obj, int number) {
        return obj + " " + number;
    }

    public String seeWhat(int obj, int number) {
        return obj + " " + number;
    }
}

class Overloading {
    
    public static void main (String[] args) {

        Test objTesting = new Test();

        System.out.println(objTesting.seeWhat("Something"));
        System.out.println(objTesting.seeWhat("Something", 3));
        System.out.println(objTesting.seeWhat(3, 3));
    }
}