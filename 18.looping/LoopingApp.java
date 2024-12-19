class LoopingApp {

    public static void main(String[] args) {
        int x;

        /*-----------------<for>------------------ */
        System.out.println("[for] looping");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        /*-----------------<while>------------------ */
        System.out.println("\n[while] looping");
        x = 0;
        while (x < 5) {
            System.out.println(x);

            ++x;
        }
        System.out.println("here---------\n" + x);

        /*-----------------<do-while>------------------ */
        System.out.println("\n[do-while] looping");
        x = 5;
        do {
            System.out.println(x);

            ++x;
        } while (x < 5);
    }
}