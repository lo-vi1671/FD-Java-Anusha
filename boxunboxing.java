public class boxunboxing {
    public static void main(String[] args) {
        int num = 10;
        Integer boxed = num;

        int unboxed = boxed;

        System.out.println("Boxed:" + boxed);
        System.out.println("unboxed:" + unboxed);

    }
    
}
