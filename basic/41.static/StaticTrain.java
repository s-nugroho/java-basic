public class StaticTrain {

    public static void main(String[] args) {

        Food obj = new Food();
        obj.name = "APPEL";
        obj.price = 10000;
        obj.stock = 10;

        Food obj2 = new Food();
        obj2.name = "KUNCI";
        obj2.price = 20000;
        obj2.stock = 20;
        /*============================================================ */

        /*setting static property
         *all the value from every obj will be changed  
        */
        obj.price = 500;
        obj.seeTheResult();
        obj2.seeTheResult();

        /*
         * this is the fastest way to change value
         * will affect var price in all obj
         */
        Food.price = 2000;

        System.out.println("=======================");
        obj.seeTheResult();
        obj2.seeTheResult();

        System.out.println("=========[static-method]=======");
        Food.seeStaticResult(obj);

    }
} 

class Food {

    String name;

    static int price;
    
    int stock;


    public void seeTheResult() {
        System.out.println("RESULT " + name + " || " + stock + " || " + price);
    }

    public static void seeStaticResult(Food food) {

        System.out.println("IN STATIC : "  + food.name + " || " + food.stock + " || " + price);

    }


    /*Constructor init only 1x, even create more than 1 obj*/
    static {
        price = 700;
        System.out.println("\n......................." + price);
        System.out.println("STATIC CALL.....................!");
    }

    /*Constructor init every create new obj*/
    public Food() {
        name = "INIT NAME";
        stock = 900;
        System.out.println("\nCONSTRUCTOR ....................!");
    }
}