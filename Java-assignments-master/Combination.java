import java.util.Scanner;

public class Combination {

	 int n;                                    
    int b=1,c=1,d=1,e=1,f=1,g=1,h=1;              
    int[] a=new int[10];                       
    public void combinations(int n) {
        for(int i=0;i<n;i++)
        {
            a[i]=i+1;                     
        }
        
        double s=Math.pow(2,n-1);           
        int k=1;
        System.out.println("Combinations are:");
        while(k<=s)
        {  int sum=a[0];
      
            for(int i=1;i<n;i++)
            {   
                sum=sum+a[i];                 
            }
            if(sum==0)
            {
                for(int i=0;i<n;i++)
                    System.out.print(a[i]+" ");
                System.out.println(" =0");
            }
            change(a);
            k++;
        }
    }
    public void change(int[] a)
    {
        a[n-1]=-a[n-1];
        if(n==2) return;
        if(b==2)
        {
            a[n-2]=-a[n-2];
            b=1;
        }
        else
        {
            b++;
        }
        if(n==3) return;
        if(c==4)
        {
            a[n-3]=-a[n-3];
            c=1;
        }
        else
        {
            c++;
        }
        if(n==4) return;
        if(d==8)
        {
            a[n-4]=-a[n-4];
            d=1;
        }
        else
        {
            d++;
        }
        if(n==5) return;
        if(e==16)
        {
            a[n-5]=-a[n-5];
            e=1;
        }
        else
        {
            e++;
        }
        if(n==6) return;
        if(f==32)
        {
            a[n-6]=-a[n-6];
            f=1;
        }
        else
        {
            f++;
        }
        if(n==7) return;
        if(g==64)
        {
            a[n-7]=-a[n-7];
            g=1;
        }
        else
        {
            g++;
        }
        if(n==8) return;
        if(h==128)
        {
            a[n-8]=-a[n-8];
            h=1;
        }
        else
        {
            h++;
        }
        if(n==9) return;
    }

    public static int sum_of_digit(int n) {
    	int k=0;
    	for(int i=1;i<=n;i++)
        {
            k=k+i;                     
            }
		if (k%2!=0) {
			return 0;
		}
		else {
			return 1;
		}		
	}

     public static void main(String [] nt)
     {
         Combination ob=new Combination();
         System.out.print("Enter Number of Terms (N<=9):");
         Scanner in=new Scanner(System.in);
         ob.n=in.nextInt();
         int check = sum_of_digit(ob.n);
         if(check==0) {
        	 System.out.println("There is no combination :(");
         }
         else {
         ob.combinations(ob.n);
     }}

}