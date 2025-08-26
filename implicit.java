public class implicit{
    public static void main(String[] args) {
        int num = 100;
        long bigNum = num;
        float floatNum = bigNum;

        System.out.println("Int:" + num);
        System.out.println("long:" + bigNum);
        System.out.println("Float:" + floatNum);
    }
    
}
