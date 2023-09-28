public class QuickSort {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Maksim", 19),
                new Person("Oleg", 35),
                new Person("Masha", 40),
                new Person("Leon", 5)
        };

        quickSort(people, 0, people.length - 1);

        for (Person person : people) {
            System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
        }
    }

    public static void quickSort(Person[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(Person[] arr, int low, int high) {
        int pivot = arr[high].getAge();
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {
            if (arr[j].getAge() < pivot) {
                i++;
                Person temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        Person temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}