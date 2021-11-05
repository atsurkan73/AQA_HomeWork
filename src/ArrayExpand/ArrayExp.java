package ArrayExpand;

public class ArrayExp {
    public static void toExp(int array[], int num) {
        int i = 0;
        int[] newArray = new int[array.length + 1];

        while (newArray.length - 1 > i) {
            newArray[i] = array[i];
            i++;
        }
        newArray[i] = num;

        for (int ii : newArray) {
            System.out.println(ii);

        }
    }
}
