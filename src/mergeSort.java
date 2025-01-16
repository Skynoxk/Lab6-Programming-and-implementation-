/*
 * Sorting algorithm: Merge sort
 * Author : Meas Ratanakviphou
 * Reference : geetksforgeeks.org
 */
// Java program for Merge Sort

class mergeSort {

    // Merges two subarrays of scores[].
    // First subarray is scores[l..m]
    // Second subarray is scores[m+1..r]
    static void merge(double  scores[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        // Create temp arrays
        double L[] = new double[n1];
        double R[] = new double[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; ++i)
            L[i] = scores[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = scores[m + 1 + j];

        // Merge the temp arrays

        // Initial indices of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                scores[k] = L[i];
                i++;
            }
            else {
                scores[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            scores[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            scores[k] = R[j];
            j++;
            k++;
        }
    }

    // Main function that sorts scores[l..r] using
    // merge()
    static void sort(double scores[], int l, int r)
    {
        if (l < r) {

            // Find the middle point
            int m = l + (r - l) / 2;

            // Sort first and second halves
            sort(scores, l, m);
            sort(scores, m + 1, r);

            // Merge the sorted halves
            merge(scores, l, m, r);
        }
    }

    // A utility function to print array of size n
    static void printArray(double scores[])
    {
        int n = scores.length;
        for (int i = 0; i < n; ++i)
            System.out.print(scores[i] + " ");
        System.out.println();
    }

    // Driver code
    public static void main(String args[])
    {
        double scores[] = { 90.5, 20, 50, 75, 80, 85,69,0,80,40,70 };

        System.out.println("Given scores is");
        printArray(scores);

        sort(scores, 0, scores.length - 1);

        System.out.println("\nSorted scores is");
        printArray(scores);
    }
}