class Duplicate {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 4, 4 };

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = -1;
                }
            }
        }

        System.out.print("Array without duplicates: ");
        for (int i : arr) {
            if (i != -1)
                System.out.print(i + " ");
        }
    }
}