public class pool {
    public static void main(String[] args) {

        String str = "devx";
        String str2 = "devx";
        String str3 = new String("devx");
        String str4 = new String( "devx");

        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

        System.out.println(str.equals(str4));


        boolean isEquals = str == str4;
        System.out.println(isEquals);



    }



}
