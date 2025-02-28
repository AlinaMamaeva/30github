public class loop2 {
    public static void main(String[] args) {
        //program sums up all num from 1-5
        //1+2+3+4+5=15


        int counter = 1;
        int sum = 0;

        while(counter <= 5){
            sum+=counter;
            System.out.println(sum);
            counter++;

        }
    }
}
