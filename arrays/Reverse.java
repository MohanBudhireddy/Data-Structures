public class Reverse {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        reverseArray(array);
        
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void reverseArray(int[] array) {
        int startIndex = 0;
        int endIndex = array.length - 1;

        while (startIndex < endIndex) {
            int temp = array[startIndex];
            array[startIndex] = array[endIndex];
            array[endIndex] = temp;

            startIndex++;
            endIndex--;
        }
    }
}