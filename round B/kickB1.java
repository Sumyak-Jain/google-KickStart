import java.util.Scanner;
public class kickB1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++){
            int b=sc.nextInt();
            int arr[]=new int[b];
            for(int j=0;j<b;j++){
                arr[j]=sc.nextInt();
            }
            int count=0;int q;
            for( q=0;q<b;q++){
                
                if(q == 0 ){
                    continue;
                }
                else if(q == (b-1)){
                    continue;
                        }
                else if(arr[q]>arr[q-1] && arr[q]>arr[q+1]){
                        count ++;
                           
                }
                
            }System.out.println("Case #"+(i+1)+": "+ count);   
           
        }
        }
    }
