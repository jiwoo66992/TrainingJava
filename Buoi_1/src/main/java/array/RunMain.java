package array;

public class RunMain {

  public static void main(String[] args) {
    int n = 5;
    int[] arr = new int[10];
    arr[0] = 1;
    arr[1] = 2;
    arr[2] = 3;
    arr[3] = 3;
    arr[4] = 4;

    for (int i = 0; i < n; i++) {
      for (int j = i+1; j < n+1; j++) {
        if (arr[i] == arr[j]) {
          System.out.println("Value equal: " + arr[i]);
          n = deleteElement(arr, n, arr[i]);
        }
      }
    }

    for (int i=0; i<n; i++) {
      System.out.println(arr[i]);
    }

    System.out.println("123\r1\r23");
  }

  private static int deleteElement(int[] arr, int n, int value) {
    for (int i = 0; i < n; i++) {

      // Xóa 1 phần tử
      if (arr[i] == value) {
        for (int j = i; j < n-1; j++) {
          arr[j] = arr[j+1];
        }
        i--;
        n--;
      }
    }
    return n;
  }

}
