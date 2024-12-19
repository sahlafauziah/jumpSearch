public class JumpSearch {
    public static int jumpSearch(int[] arr, int x){
        int n = arr.length;
        int step = (int)Math.floor(Math.sqrt(n));
 
        int prev = 0;
        for (int minStep = Math.min(step, n)-1; arr[minStep] < x; minStep = Math.min(step, n)-1) {
            prev = step;
            step += (int)Math.floor(Math.sqrt(n));
            if (prev >= n)
            return -1;
        }
        
        while (arr[prev] < x) {
            prev++;

            if (prev == Math.min(step, n))
            return -1;
        }

        if (arr[prev] == x)
        return prev;

        return -1;
    }

    public static void main(String[] argh){
        int arr[] = { 6, 8, 10, 14, 16, 20, 22, 28, 40, 88 };
        int x = 90;

        int index = jumpSearch(arr, x);

        if (index != -1) {
            System.out.println(" elemen  " + x + " di temukan di index ke " + index); 
        } else {
            System.out.println(" elemen " + x + " elemen tidak ditemukan") ;
        }
    }
}