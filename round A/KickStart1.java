import java.util.Scanner;
import java.util.Arrays;
public class KickStart1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++){
            int count=0;
            int sum=0;
            int N=sc.nextInt();
            int B=sc.nextInt();
            int arr[]=new int[N];
            for(int j=0;j<N;j++){
                arr[j]=sc.nextInt();
            }
            Arrays.sort(arr);
            for(int k=0;k<N;k++){
                sum=sum+arr[k];
                if((sum)<=(B))
                {
                    count++;
                    
                }
            }
            System.out.println("Case #"+(i+1)+": "+count);
        }
    }
}
