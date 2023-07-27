public class BinarySearch2DArray {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4,},{10,23,40,55},{67,69,71,77},{79,88,99,100}};
        System.out.println(arr.length);
        System.out.println(search2DArray(arr,88));
    }
     static int search2DArray(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int start = 0;
        int end = rows * cols - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midVal = matrix[mid/cols][mid % cols];

            if (midVal == target) {
                return midVal;
            } else if (midVal < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}