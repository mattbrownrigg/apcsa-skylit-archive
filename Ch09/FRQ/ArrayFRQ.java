package Ch09.FRQ;

import java.util.Arrays;

public class ArrayFRQ
{
    public static void main(String[] args)
    {
        int[][] arr = {{1, 2, 3, 4},
                        {1, 2, 3, 4},
                        {3,4,4,4}};
        System.out.println(isDiverse(arr));
    }

    public static int sumArray(int[] arr)
    {
        int sum = 0;
        for (int i : arr) 
        {
            sum += i;
        }
        return sum;
    }

    public static int[] rowSum(int[][] arr2D)
    {
        int[] res = new int[arr2D[0].length];
        int count = 0;
        for (int[] is : arr2D) 
        {
            res[count] = sumArray(is);
            count++;
        }
        return res;
    }

    public static boolean isDiverse(int[][] arr2D)
    {
        for(int i = 0; i < arr2D.length; i++)
        {
            for(int j = i + 1; j < arr2D.length; j++ )
            {
                if(Arrays.toString(arr2D[i]).equals(Arrays.toString(arr2D[j])))
                    return false;
            }
                
        }
        return true;
    }
}