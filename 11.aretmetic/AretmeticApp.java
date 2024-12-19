class AretmeticApp {

    public static void main(String a[]) {

        int x = 5;
        int y = 10;

        int result = x * y;

        System.out.println("multiply : " + result);
        System.out.println("\ndevide : " + y / x);
        System.out.println("\nmodulo : " + y % x);
        
        x += 1;
        System.out.println(x);

        x *= y;
        System.out.println(x);

        y /= x;
        System.out.println(y);

        x = 5;
        System.out.println("increment " + x++); //fetch the value and then increment it
        System.out.println("increment " + ++x); //increment the value and then fetch it

        System.out.println("\ndecrease " + x--);
        System.out.println("decrease " + --x);
    }
}