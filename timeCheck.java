
public class timeCheck {

	public static void main(String[] args) {
		int n = 10000;
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = (int) Math.ceil(n*Math.random());
		}
//		TimerTask.run();
		for(int i=0; i<n; i++) {
			int minIndex = i;
			for(int j=i+1; j<n; j++) {
				if(arr[minIndex]>arr[j]) minIndex=j;
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
			
		}
		
		for(int a : arr) {
			System.out.println(a);
		}
		

	}

}
