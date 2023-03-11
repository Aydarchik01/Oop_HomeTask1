
public class Main {
    public static void main(String[] args) {
        Student stud = new Student();

        stud.name = "Aydar";
        stud.age = 18;
        stud.gender = "Male";
        stud.height = "180sm";
        stud.weight = "60kg";
        stud.status = "Teacher";
        stud.character = "Positive";
        stud.learn = "Java";

        Student stud1 = new Student();

        stud1.name = "Bakyt";
        stud1.age = 16;
        stud1.gender = "Male";
        stud1.height = "170sm";
        stud1.weight = "55kg";
        stud1.status = "People";
        stud1.character = "Positive";
        stud1.learn = "Java";

        Student stud2 = new Student();

        stud2.name = "Daniel";
        stud2.age = 16;
        stud2.gender = "Male";
        stud2.height = "160sm";
        stud2.weight = "55kg";
        stud2.status = "People";
        stud2.character = "Positive";
        stud2.learn = "Java";

        System.out.println("Name: " + stud.name + "\n" + "Age: " + stud.age + "\n" + "Gender: " + stud.gender + "\n" + "Height: " + stud.weight + "\n" + "Weight: " + stud.height + "\n" + "Character: " + stud.character + "\n" + "Learn: " + stud.learn);
        System.out.println("====================");
        System.out.println("Name: " + stud1.name + "\n" + "Age: " + stud1.age + "\n" + "Gender: " + stud1.gender + "\n" + "Height: " + stud1.weight + "\n" + "Weight: " + stud1.height + "\n" + "Character: " + stud1.character + "\n" + "Learn: " + stud1.learn);
        System.out.println("====================");
        System.out.println("Name: " + stud2.name + "\n" + "Age: " + stud2.age + "\n" + "Gender: " + stud2.gender + "\n" + "Height: " + stud2.weight + "\n" + "Weight: " + stud2.height + "\n" + "Character: " + stud2.character + "\n" + "Learn: " + stud2.learn);
    }
}