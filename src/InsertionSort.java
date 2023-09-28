public class InsertionSort {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Maksim", 19),
                new Person("Oleg", 35),
                new Person("Masha", 40),
                new Person("Leon", 5)
        };

        insertionSort(people);

        for (Person person : people) {
            System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
        }
    }

    public static void insertionSort(Person[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            Person key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].getAge() > key.getAge()) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}