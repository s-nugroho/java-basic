class ConversionApp {

    public static void main(String a[]) {

        byte by = 127;
        float f = 14.9f;
        int x = 10;

        by = (byte) x;

        x = (int) f;

        System.out.println(by);
        System.out.println(x);
    }
}