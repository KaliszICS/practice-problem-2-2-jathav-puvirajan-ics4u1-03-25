public class PracticeProblem {

	public static void main(String args[]) {
		System.out.println(compareSearch(new int[] {1, 2, 3, 4, 5, 6, 67, 8, 9, 230, 555, 786, 923, 1000, 1500}, 230));
	}

	public static int[] compareSearch(int[] arr, int n){
		// sequential
		int o = 0;
		for(int i = 0; (i < arr.length); i++){
			o ++;
			if(arr[i] == n){
				break;
			}
		}
		//binary
		int r = 0;
		boolean found = false;
		int low = 0;
		int high = arr.length;
		int mid = (low+high)/2;
		while(!found){
			r += 1;
			if(arr[mid] < n){
				low = mid + 1;
				mid = (low+high)/2;

			}
			else if(arr[mid] > n){
				high = mid - 1;
				mid = (low+high)/2;

			}else if(arr[mid] == n){
				found = true;
			}
			if(low > high){
				//value not found
				found = true;
			}
		}

		return new int[] {o,r};
	}

	public static int[] compareStringSearch(String[] arr, String n){
		// sequential
		int o = 0;
		for(int i = 0; (i < arr.length); i++){
			o ++;
			if(arr[i] == n){
				break;
			}
		}
		//binary
		int r = 0;
		boolean found = false;
		int low = 0;
		int high = arr.length;
		int mid = (low+high)/2;
		while(!found){
			r += 1;
			if(arr[mid].compareTo(n) < 0){
				low = mid + 1;
				mid = (low+high)/2;

			}
			else if(arr[mid].compareTo(n) > 0){
				high = mid - 1;
				mid = (low+high)/2;

			}else if(arr[mid].equals(n)){
				found = true;
			}
			if(low > high){
				//value not found
				found = true;
			}
		}

		return new int[] {o,r};
	}
	
}
