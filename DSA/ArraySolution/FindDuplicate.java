package ArraySolution;

// Find Duplicate Number (Single Duplicate)

public class FindDuplicate {

    public  static int findDuplicate(int arr[])
    {
        for(int i = 0 ;i<arr.length;i++)
        {
            for(int j = i+1  ;j< arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    return j;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int arr[]= {1,2,3,4,5,5};

        int duplicate = findDuplicate(arr);

        System.out.println(duplicate);

    }
}
