public static int binarySearchIterative(int[] a, int target) {
    int low = 0;
    int high = a.length - 1;

    while (low <= high) {
        int mid = low + (high - low) / 2;

        if (a[mid] == target) {
            return mid;
        } else if (target < a[mid]) {
            high = mid - 1; // ищем в левой половине
        } else {
            low = mid + 1;  // ищем в правой половине
        }
    }
    return -1; // если не нашли
}

void main() {
}
