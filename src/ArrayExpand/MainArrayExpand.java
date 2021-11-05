package ArrayExpand;

public class MainArrayExpand {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int number = 77;

        int[] newArray = new ArrayExp().toExp(array, number);

        for (int i : newArray)
            System.out.println(i);

    }
}
