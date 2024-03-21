import java.util.Arrays;

// reference type vs value types
public class main1
{
    public static void main(String... args){
        int[] myIntArray=new int[5];
        int[] myanotherArray=myIntArray;
        System.out.println("my int array = " + Arrays.toString(myIntArray));
        System.out.println("mt another array =" +Arrays.toString(myanotherArray));
        myanotherArray[0]=1;
        System.out.println("my another array="+Arrays.toString(myanotherArray));
    }
    public static void modifyArray(int myIntArray)
    {

    }
}
