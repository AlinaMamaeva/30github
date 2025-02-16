public class SwitchCase {
    public static void main(String[] args) {
        vowel("Hello");
        System.out.println("==============");
        vowel("Alina");
    }

        public static void vowel(String str) {
            int counter = 0;
             while(counter <= str.length()-1){
                 switch (str.charAt(counter)) {

                     case 'a':
                     case 'e':
                     case 'i':
                     case 'o':
                     case 'u':
                     case 'y':
                         System.out.println(str.charAt(counter));
                         counter++;
                     default:
                         counter++;






                 }
             }
    }
}
