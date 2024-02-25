public class Main
{
	public static void main(String[] args) {
	    int[] a = {2,3,4,5};
	    int n = a.length;
	    int sum =0;
	    for(int i=0;i<a.length;i++)
	    {
	        sum+=a[i];
	        
	    }
	    int res = (n+2)*(n+1)/2;
	    System.out.println(res-sum);
	    
	}
}
