package meet5.hw.task2algorithmsorter;

import java.util.HashMap;
import java.util.Map;

/*public class Sorter {
    public void sort(int[] array, String algorithm) {
        if (algorithm.equals("bubble")) {
            // Реализация пузырьковой сортировки
            System.out.println("Sorting using bubble sort");
        } else if (algorithm.equals("merge")) {
            // Реализация сортировки слиянием
            System.out.println("Sorting using merge sort");
        } else if (algorithm.equals("quick")) {
            // Реализация быстрой сортировки
            System.out.println("Sorting using quick sort");
        } else {
            throw new IllegalArgumentException("Unsupported sorting algorithm: " + algorithm);
        }
    }
}
*/
public class Sorter {
    private final Map<String, SortingAlgorithm> sortingAlgorithms;

    public Sorter() {
        sortingAlgorithms = new HashMap<>();
        sortingAlgorithms.put("bubble", new BubbleSort());
        sortingAlgorithms.put("merge", new MergeSort());
        sortingAlgorithms.put("quick", new QuickSort());
    }
    
    public void sort(int[] arr, String algorithm) {
        SortingAlgorithm sortingAlgorithm = sortingAlgorithms.get(algorithm);

        if (sortingAlgorithm == null) {
            throw new IllegalArgumentException("Unsupported sorting algorithm: " + algorithm);
        }
        sortingAlgorithm.sort(arr);
    }

}
