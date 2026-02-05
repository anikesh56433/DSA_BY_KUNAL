package shortingAlgo;

public class MissingNumberCyclicShort {

    public static int missingNumber(int[] arr)
    {
        int i= 0 ;
        while(i<arr.length)
        {
            int correct = arr[i];
            if( arr[i] < arr.length && arr[i]!= arr[correct])
            {
                int temp = arr[i];
                arr[i]= arr[correct];
                arr[correct] = temp;
            }
            else {
                i++;
            }
        }

        for(int index = 0 ; index<arr.length;index++)
        {
            if(arr[index]!=index)
            {
                return  index;
            }
        }
        return arr.length;
    }

    public static void main(String[] args) {

        int[] arr= {4,3,0,1};

        int i = missingNumber(arr);

        System.out.println(i);

    }

}
