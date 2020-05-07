
public class ArrayExample3 {

	public static void main(String[] args) {
		String[] ary = { "Lee", "Kim", "Park", "Choi", "Han" };
		System.out.println(getString(ary));

		}
		
	
	public static String getString(String[] strAry) {
			String result = "";
			for (int i = 0; i < strAry.length; i++) {
				result += strAry[i] + " - ";
			}
			return result;
		}

	}




