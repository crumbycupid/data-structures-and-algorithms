package datastructures.array;

public class BinarySearch {
  public static int arrayBinarySearch(int[] sortedArr, int key) {
    int left = 0;
    int right = sortedArr.length - 1;

    while (left <= right) {
      int mid = (left + right) / 2;

      if (sortedArr[mid] == key) {
        return mid;
      } else if (sortedArr[mid] < key) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }

    return -1;
  }
}

