public class Test514{
	public static void main(String[] args){
		int[] arr ={34,56,6,9,87,98,54,3424,2};
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length-1;j++){//i是擂主 j是每次不同的挑战者
				if(arr[i]>arr[j]){
					int t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
				}
				
				
			}
			
		}
		for(int i=0;i<arr.length-1;i++){
					System.out.println(arr[i]);
		}
	}
}