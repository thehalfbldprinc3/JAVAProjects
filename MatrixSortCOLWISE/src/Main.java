//Java code to sort 2D matrix
//according to any column
import java.util.*;
 class sort2DMatrixByCols
 {
     public static void sortByCols(int[][] arr,int col)
     {
        Arrays.sort(arr, new Comparator<int[]>() {
         @Override
         public int compare(int[] o1, int[] o2) {
          return 0;
         }
        })
     }
 }