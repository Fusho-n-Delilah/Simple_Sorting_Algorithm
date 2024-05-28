public class SimpleSort {
    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};

        sort(array);

        for(int i : array){
            System.out.println(i);
        }
    }

    public static int smallest(int[] array){
        int smallest = array[0];

        for(int el : array){
            if (el < smallest){
                smallest = el;
            }
        }

        return smallest;
    }

    public static int indexOfSmallest(int[] array){
        int indexOfSmallest = 0,
                smallest = array[0];


        for(int i = 0; i < array.length; i++){
            if(array[i] < smallest){
                smallest = array[i];
                indexOfSmallest = i;
            }
        }

        return indexOfSmallest;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int indexOfSmallest = startIndex,
                smallest = table[startIndex];

        for(int i = startIndex; i < table.length; i++){
            if(table[i] < smallest){
                smallest = table[i];
                indexOfSmallest = i;
            }
        }

        return indexOfSmallest;
    }

    public static void swap(int[] array, int index1, int index2){
        int helper = array[index1];
        array[index1] = array[index2];
        array[index2] = helper;
    }

    public static void sort(int[] array) {
        System.out.println(array);
        for(int i = 0; i < array.length; i++){
            swap(array, i, indexOfSmallestFrom(array, i));
        }
    }
}
