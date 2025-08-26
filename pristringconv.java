public class pristringconv {
    public static void main(String[] args) {
        int num = 50;

        String str1 = String.valueOf(num);
        String str2 = Integer.toString(num);

        String s = "100";
        int parsedInt = Integer.parseInt(s);

        System.out.println("String from int:" + str1);
        System.out.println("parsedInt from string:" + parsedInt);
    }
    
}
