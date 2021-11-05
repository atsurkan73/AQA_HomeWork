package ArrayExpand;

public class ArrayExp {
    public static int[] toExp(int array[], int num) {
        int i = 0;
        int[] newArray = new int[array.length + 1];

        while (newArray.length - 1 > i) {
            newArray[i] = array[i];
            i++;
        }
        newArray[i] = num;

        return newArray;
    }
}

