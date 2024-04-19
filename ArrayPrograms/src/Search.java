
public class Search {

	int linearSearch(int arr[],int key) {
		for(int i=0;i<=arr.length-1;i++) {
			if(key==arr[i]) {
				return 1;
			}
		}
		return -1;
	}

	}

