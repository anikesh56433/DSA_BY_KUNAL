package ArraySolution;

public class SecondLargestElement {

    public static void main(String[] args) {

        int arr[]={2,4,1,6,9,7,8};

        int fh = arr[0];
        int sh = arr[0];

        for(int i= 1 ; i<arr.length;i++)
        {
            if(arr[i]>fh )
            {
                sh= fh;
                fh= arr[i];
            }
            else if(arr[i]>sh && arr[i]<fh)
            {
                sh= arr[i];
            }
        }

        System.out.println(sh);

    }
}
