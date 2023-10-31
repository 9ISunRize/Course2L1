import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    task5();
    }

    public static void task5() {
        int value = 33;
        changeValue(value);
        System.out.println(value);
    }

    public static void task6() {
        Integer value = 33;
        changeValueInteger(value);
        System.out.println(value);
    }

    public static void task7() {
        Integer[] value = {3, 4};
        changeValueIntegerArray(value);
        System.out.println(Arrays.toString(value));
    }

    public static void task8() {
        Integer[] value = {3, 4};
        changeValueIntegerArray2(value);
        System.out.println(Arrays.toString(value));
    }

    public static void task9() {
        Person person = new Person("Lyapis", "Trubetskoy");
        changePerson(person);
        System.out.println(person);
    }

    public static void task10() {
        Person person = new Person("Lyapis", "Trubetskoy");
        changePerson2(person);
        System.out.println(person);
    }

    public static void changeValue(int value) {
        value = 22;
    }

    public static void changeValueInteger(Integer value) {
        value = 22;
    }

    public static void changeValueIntegerArray(Integer[] value) {
        value = new Integer[]{1, 2};
    }

    public static void changeValueIntegerArray2(Integer[] value) {
        value[0] = 99;
    }

    public static void changePerson(Person person) {
        person = new Person("Ilya", "Lagutenko");
    }

    public static void changePerson2(Person person) {
        person.setName("Ilya");
        person.setSurname("Lagutenko");
    }
}