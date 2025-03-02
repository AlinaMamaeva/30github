public class loop4 {
    public static void main(String[] args) {
        String str = "Superstar";
        System.out.println(str.charAt(8));//-1
        System.out.println(str.charAt(7));
        System.out.println(str.charAt(6));
        System.out.println(str.charAt(5));
        System.out.println(str.charAt(4));
        System.out.println(str.charAt(3));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(0));

        System.out.println("===================");

        int counter = 8;
        while(counter >= 0){
            System.out.println(str.charAt(counter));
            counter--;
        }

        //any string
        System.out.println("============");

        String str2 = "I love java so much";
        int counter2 = str2.length()-1;
        while (counter2 >= 0){
            System.out.println(str2.charAt(counter2));
            counter2--;
        }

    }
}
