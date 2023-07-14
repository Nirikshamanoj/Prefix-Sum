import java.util.Scanner;
public class PrefixSum {
    static int[] findPrefixSum(int[] array,int size)
    {
        int p[]=new int[size];
        p[0]=array[0];
        for(int i=1;i<size;i++)
        {
            p[i]=p[i-1]+array[i];
        }
        return p;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int A[]=new int[N];
        for(int i=0;i<N;i++)
        {
            A[i]=scanner.nextInt();
        }
        int prefix[]=findPrefixSum(A,N);
        for(int i=0;i<prefix.length;i++)
        {
            System.out.print(prefix[i]+" ");
        }
    }
}
