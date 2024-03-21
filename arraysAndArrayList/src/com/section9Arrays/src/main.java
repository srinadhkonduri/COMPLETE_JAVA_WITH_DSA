import java.util.Arrays;

public class main
{
    public static void main(String[] args) {
        int[] myIntArray =new int[10];
        myIntArray[4]=16;
        System.out.println(myIntArray[4]);
        double[] myDoubleArray =new double[10];
        myDoubleArray[6]=3333.55;
        System.out.println(myDoubleArray[6]);
        int[] firstFivePos ={1,2,3,4,5};
        System.out.println("first = "+firstFivePos[0]);
        int arraylength =firstFivePos.length;
        System.out.println("length of the array = " +arraylength);
        System.out.println("last number = " +firstFivePos[arraylength-1]);

        int[] newArray;
        //newArray=new int[] {5,4,3,2,1};
        newArray=new int[20];
        for (int i=0;i<newArray.length;i++)
        {
            newArray[i]=newArray.length-i;
        }
        for (int i=0;i<newArray.length;i++)
        {
            System.out.println(newArray[i]+ " ");
        }
        System.out.println();
        for (int element:newArray)
        {
            System.out.println(element +" ");
        }
        System.out.println();
        System.out.println(Arrays.toString(newArray));
    }
}
