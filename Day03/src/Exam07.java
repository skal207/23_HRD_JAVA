public class Exam07 {

	public static void main(String[] args) throws Exception {
		
		int[] array = {1, 5, 3, 8, 2};
		
		int max = 0;
		int min = 100;
		
		for(int i = 0 ; i < array.length ; i++) {
			max = Math.max(max, array[i]);
		}
		System.out.println(max);
		for(int i = 0 ; i < array.length ; i++) {
			min = Math.min(min, array[i]);
		}
		System.out.println(min);
	}

}
