package FirstCode;

public class main {
    public static void main(String[] args) {

        int n = 5;
        int [] boo = {0, 1, 2, 3, 4};

        int m = 100;
        int[] bar= new int [100];

        for(int i = 0; i < m; i++) {
            bar[i] = i;
        }

        System.out.println("The The number of even numbers in boo is:"+ countEvenNum(boo, n));
        System.out.println("The number of even numbers in bar is:"+countEvenNum(bar, m));
    }

    public static int countEvenNum(int arr[], int size)
    {
        int count = 0;

        for(int i=0; i<size; i++) {
            if(arr[i] % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}
