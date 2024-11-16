public class java{
    static int equiliriumpoint(int[] arr){
        int n = arr.length;
        int left = 0, pivot = 0, right = 0;

        for(int i=1;i<n;i++){
            right = right + arr[i];
        }

        while(pivot < n-1 && left!=right){
            pivot+=1;
            right-=arr[pivot];
            left+=arr[pivot-1];
        }
        return (left == right) ? pivot + 1 : -1;
    }
    
    public static void main(String[] args){
        int[] arr = {-7, 1, 5, 2, -4, 3, 0};
        System.out.print(equiliriumpoint(arr));
    }
}