package Ab_DigiFlex.array;

import java.util.Arrays;

public class duplicate_array_notShorted {

    public static void main(String[] args) {

        int arr[]={1,2,3,4,11,5,3,6,7};
        Arrays.sort(arr);
        int duplicate = 0;

        for(int i = 1  ; i< arr.length;i++){
            if(arr[i-1]==arr[i])
            {
                duplicate = arr[i];
                break;
            }
        }

        if(duplicate==0)
        {
            System.out.println("There is No Duplicate Element Found IN array");
        }
        else{
            System.out.println(duplicate);
        }
    }
}
