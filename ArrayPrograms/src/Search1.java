public class Search1{
	public boolean isPresent(int arr[],int target) {
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]==target) {
				return true;
			}
		}
		return false;
	}
}