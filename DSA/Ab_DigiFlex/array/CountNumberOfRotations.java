package Ab_DigiFlex.array;

public class CountNumberOfRotations {

    public  static  int count_rotations(int arr[])
    {
        int count = 0 ;
        int last_ele= arr[arr.length-1];
        for(int i =  0 ;i< arr.length;i++)
        {
            if(arr[i]>last_ele)
            {
                count++;
            }
        }
        return  count;
    }

    public static void main(String[] args) {

        int arr[] = {7,8,9,1,2,3,4,5,6};
        int i = count_rotations(arr);
        System.out.println("Total rotation in array is  : "+ i);


    }
}
