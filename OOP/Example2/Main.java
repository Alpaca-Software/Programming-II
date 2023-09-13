package Example2;

public class Main {

    public static void main(String[] args) {
        String document = "1092567846";
        String name = "Johnson";
        int age = 18;
        String genre = "F";

        Person personOne = new Person(document, name, age, genre);

        System.out.printf("%s (%s) is of legal age (%d years old).\n",
                personOne.name,
                personOne.genre,
                personOne.age);
        
        if (personOne.isAccepted()) {
            System.out.println("Accepted in the night club!");
        } else {
            System.out.println("Is not accepted in the night club.");
        }
    }
}

