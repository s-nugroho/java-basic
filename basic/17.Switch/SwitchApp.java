class SwitchApp {

    public static void main(String[] args) {

        int a = 7;

        switch (a) {
            case 1:
                System.out.println("ONE");
                break;

            case 7:
                System.out.println("SEVEN");
                break;
                
            default:
                System.out.println("oops something wrong");
                break;
        }
    }
}