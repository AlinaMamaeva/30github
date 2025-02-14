public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Aleks", 25);
        Person person2 = new Person("Mark", 30);


        person1.introduce();
        person2.introduce();
    }
}


class Person {
    String name;
    int age;


    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    void introduce() {
        System.out.println("Hello , my name is " + name + ", i'm " + age + " years old.");
    }
}