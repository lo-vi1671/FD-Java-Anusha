import java.util.Arrays;
public class arrayclass {
    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 4, 2};

        System.out.println("Org:" + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted:" + Arrays.toString(arr));

        int [] copy= Arrays.copyOf(arr , 7);
        System.out.println("Copy:" + Arrays.toString(copy));

        Arrays.fill(copy, 6);
        System.err.println("Filled:" + Arrays.toString(copy));
    }
    
}
