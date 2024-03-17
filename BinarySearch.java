public class BinarySearch{
static void binarySearch(int arr[],int first, int last ,int key){
	int mid=(first+last)/2;
	while(first<=last){
		if(arr[mid]<key){ first=mid+1;}
		else if(arr[mid]==key){System.out.println("Found at index is :"+mid);
		break;}
			else {last=mid-1;}
	if(first>last){System.out.println("Not found !");}
	mid=(first+last)/2;
	}
	
}
public static void main(String args[]){
	int arr[]={10,20,30,58,60,80};
	int key = 70;
	int last=arr.length-1;
	binarySearch(arr,0,last,key);
	
}
}