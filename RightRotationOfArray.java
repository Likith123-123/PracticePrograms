import java.util.*;
public class  RightRotationOfArray{
	public static void Rotate(int[] arr,int n){
		for(int i=0;i<n;i++){
			int temp=arr[arr.length-1];
			for(int j=arr.length-1;j>0;j--){
				arr[j]=arr[j-1];
			}
			arr[0]=temp;
		}
	}
	public static void display(int[]arr){
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr={1,2,3,4,5,6,7};
Rotate(arr,3);
display(arr);
	}

}
