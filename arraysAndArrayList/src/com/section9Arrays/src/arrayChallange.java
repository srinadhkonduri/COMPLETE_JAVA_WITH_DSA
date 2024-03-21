//122 vedio array challange
import java.util.Arrays;
import java.util.Random;

public class arrayChallange
{
    public static void main(String[] args) {
        int[] unsortedArrray= getRandomArray(10);
        System.out.println(Arrays.toString(unsortedArrray));

        int[] sortedArray =sortIntegers(new int[]{3,5,65});
        System.out.println(Arrays.toString(sortedArray));
    }
    // creating a method variable for the challange
    public static int[] getRandomArray(int len)
    {
        Random random=new Random();
        int[] randomArray =new int[len];
        for (int i=0;i<len;i++)
        {
            randomArray[i]=random.nextInt(1000);
        }
        return randomArray;
    }
    private static int[] sortIntegers(int[] array)
    {
        System.out.println(Arrays.toString(array));
        int[] sortedArray = Arrays.copyOf(array,array.length);
        boolean flag=true;
        int temp;
        while (flag)
        {
            flag=false;
            for (int i=0;i<sortedArray.length-i;i++)
            {
                if (sortedArray[i]<sortedArray[i+1])
                {
                    temp=sortedArray[i];
                    sortedArray[i]=sortedArray[i+1];
                    sortedArray[i+1]=temp;
                    flag=true;
                    System.out.println("------>"+Arrays.toString(sortedArray));
                }
            }
            System.out.println("------>"+Arrays.toString(sortedArray));
        }
        return sortedArray;
    }
}
