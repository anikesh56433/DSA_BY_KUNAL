package all_revision;

public class Find_largest_element {

    public static void main(String args[])
    {
        int[] arr ={1,3,2,4,2,6,4,9,64,6,16};

        int largest= Integer.MIN_VALUE;

        for(int i = 1 ;i<arr.length;i++)
        {
            if(arr[i]>largest){

                largest= arr[i];
            }
        }
        System.out.println(largest);
    }
}
