public class Arrays{
    public static void main(String[] args) {
       
        int[] numbers = {10, 20, 30, 40, 50};

       
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element " + i + ": " + numbers[i]);
        }

       
        numbers[2] = 99;
        System.out.println("After modification: " + numbers[2]); // Will print 99
    }
}