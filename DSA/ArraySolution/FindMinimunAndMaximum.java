package ArraySolution;
//Find Minimum and Maximum Element

public class FindMinimunAndMaximum {

    public  static  int  minimumEle(int arr[])
    {
        int min= Integer.MAX_VALUE;

        for(int i = 0 ; i <arr.length;i++)
        {
            if(arr[i]<min)
            {
                min= arr[i];
            }
        }
        return  min;

    }

    public  static  int  maximumEle(int arr[])
    {
        int max= Integer.MIN_VALUE;

        for(int i = 0 ; i <arr.length;i++)
        {
            if(arr[i]>max)
            {
                max= arr[i];
            }
        }
        return  max;

    }



    public static void main(String[] args) {

        int arr[] = {3,2,6,8,4,5,8,1,11,78};

        int min = minimumEle(arr);
        int max = maximumEle(arr);

        System.out.println("Minimum Element is ="+ min +" And Miximum Value Of array Is ="+max);


    }
}
