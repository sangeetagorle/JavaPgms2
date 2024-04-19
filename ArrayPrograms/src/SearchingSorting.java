
public class SearchingSorting {
	public void bubbleSort(int arr[]) {
		for(int i=0;i<=arr.length-2;i++) {
			for(int j=0;j<=arr.length-2-i;j++) {
				if(arr[j]>arr[j+1]) {
					int help;
					help=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=help;
				}
			}
		}
	}
	
	public void selectionSort(int arr[]) {
		int min;
		int pos;
		int help;
		for(int i=0;i<=arr.length-2;i++) {
			min=arr[i];
			pos=i;
			for(int j=i+1;j<=arr.length-1;j++) {
				if(min>arr[j]){
					min=arr[j];
					pos=j;
				}
			}
				help=arr[i];
				arr[i]=arr[pos];
				arr[pos]=help;
			
		}
	}
	public void insertionSort(int arr[])
	{
		int item;
		for(int i=1;i<=arr.length-1;i++) {
			item=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>item) {
				arr[j+1]=arr[j];
				j--;
				}
			arr[j+1]=item;
			
		}
	}
	

	public int linearSearch(int arr[],int key) {
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]==key) {
				return 1;
			}
		}
		return -1;
	}

	
	public int binarySearch(int arr[],int key) {
		int low=0;
		int high=arr.length-1;
	
			while(low<=high) {
				int mid=(low+high)/2;
				if(key==arr[mid]) {
					return 1;
				}
				else if(key>arr[mid]) {
					low=mid+1;
					high=high;
				}
				else {
					high=mid-1;
					low=low;
				}
			}
		
		return -1;
	}
}



