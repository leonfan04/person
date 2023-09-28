public class MergeSort {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Maksim", 19),
                new Person("Oleg", 35),
                new Person("Masha", 40),
                new Person("Leon", 5)
        };

        mergeSort(people, 0, people.length - 1);

        for (Person person : people) {
            System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
        }
    }

    public static void mergeSort(Person[] arr, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);
            merge(arr, left, middle, right);
        }
    }

    public static void merge(Person[] arr, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        Person[] leftArr = new Person[n1];
        Person[] rightArr = new Person[n2];

        for (int i = 0; i < n1; ++i) {
            leftArr[i] = arr[left + i];
        }
        for (int j = 0; j < n2; ++j) {
            rightArr[j] = arr[middle + 1 + j];
        }

        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (leftArr[i].getAge() <= rightArr[j].getAge()) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
}