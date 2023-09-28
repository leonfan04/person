public class HeapSort {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Maksim", 19),
                new Person("Oleg", 35),
                new Person("Masha", 40),
                new Person("Leon", 5)
        };

        heapSort(people);

        for (Person person : people) {
            System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
        }
    }

    public static void heapSort(Person[] arr) {
        int n = arr.length;

        // Построение max-heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Извлечение элементов из max-heap и сортировка
        for (int i = n - 1; i > 0; i--) {
            Person temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    public static void heapify(Person[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left].getAge() > arr[largest].getAge()) {
            largest = left;
        }

        if (right < n && arr[right].getAge() > arr[largest].getAge()) {
            largest = right;
        }

        if (largest != i) {
            Person swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }
}