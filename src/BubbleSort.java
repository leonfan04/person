public class BubbleSort {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Maksim", 19),
                new Person("Oleg", 35),
                new Person("Masha", 40),
                new Person("Leon", 5)
        };

        bubbleSort(people);

        for (Person person : people) {
            System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
        }
    }
    public static void bubbleSort(Person[] arr) {
        int n = arr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1].getAge() > arr[i].getAge()) {
                    Person temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
}