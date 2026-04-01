package ex_12_Logical_Programs;

public class Student {
    String name;
    int age;

    void display(){
        System.out.println(name + " " + age);
    }
}

    class Main{
        public static void main(String []args){
            Student s1 = new Student();
            s1.name = "Vipendra";
            s1.age = 21;

            s1.display();

    }
}
