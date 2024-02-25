public class Main
{
	public static void main(String[] args) {
	    int[] a = {5, 7, 1, 2, 8, 4, 3};
	    int target = 10;
	    
	   HashSet<Integer> set = new HashSet<>();
	   for(int i=0;i<a.length;i++)
	   {
	       int t = target - a[i];
	       
	       if(set.contains(t))
	   {
	       System.out.println(a[i]+ " " + t);

	   }
	   set.add(a[i]);
	   
	       
	   }
	    
	}
}
