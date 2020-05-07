
public class ArrayExample2 {

	public static void main(String[] args) {
		System.out.println(getLargeValue(10, 20));
		
	
		getLargeValue(int[] {3,6,2,9,10});
	}
	
		public static int getLargeValue(int[] ary) {
			int maxValue = Integer.MIN_VALUE;
			for (int i = 0; i < ary.length; i++) {
				if (ary[i]>= maxValue)
					maxValue = ary[i];
				
			}
		return maxValue;
		
		
	
		}
		public static int getLargeValue(int a, int b, int c) {
			int maxValue = Integer.MIN_VALUE;
			if (a >= maxValue)
				maxValue = a;
			if (b >= maxValue)
				maxValue = b;
			if (c >= maxValue) { 
				maxValue = c; 
				return a;}
			else 
				return b;
			
		}
	
	}
		


