package DataStructure;
public class ArrayRotate{
public void rotate(int[] num, int k) {
	if(k > num.length) 
			k=k%num.length;
	int[] result = new int[num.length];
	for(int i=0; i < k; i++){
			result[i] = num[num.length-k+i];
	}
	int j=0;
	for(int i=k; i<num.length; i++){
			result[i] = num[j];
            j++;
	}
	System.arraycopy( result, 0, num, 0, num.length );
}
public static void main(String[] args) {
ArrayRotate r = new ArrayRotate();
		int arr[] = {10,9,8,7,6,5,4}; 
		r.rotate(arr, 5); 
		for(int i=0;i<arr.length;i++){
    			System.out.print(arr[i]+" ");
		}
}
}

