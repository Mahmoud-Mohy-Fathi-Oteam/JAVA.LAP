package quickSort;

public class sort {
    public  static int part(int array[], int l, int h) {
        int p = array[h];
        int i = (l - 1);
        for (int j = l; j < h; j++) {
            if (array[j] <= p) {
                i++;
                // swapping element at i with element at j
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        // swap the pivot element with the greater element specified by i
        int temp = array[i + 1];
        array[i + 1] = array[h];
        array[h] = temp;
        return (i + 1);
    }
    public static void Soort(int array[], int l, int h) {
        if (l < h) {
            int m = part(array, l, h);
            Soort(array, l, m - 1);
            Soort(array, m + 1, h);
        }
    }
}
