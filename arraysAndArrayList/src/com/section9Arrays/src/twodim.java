import java.util.Arrays;

public class twodim
{
    public static void main(String[] args) {
        int[][] array2 =new int[4][4];
        for (int[] outer:array2)//enhanced for loop
        {
            System.out.println(Arrays.toString(outer));
        }
        array2[0][1]=23;
        System.out.println(array2[0][1]);
    }
}
