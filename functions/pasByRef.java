class pasByRef {
    public static void main(String[] args) {
        int[] array = {9, 6, 3, 5, 4, 0};//hardcoded value defining from https://www.w3schools.com/java/java_arrays.asp

        avg(array);

        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                System.out.print(array[i] + ", ");
            }
            else {
                System.out.println(array[i]);
            }
        }
    }
    
    public static void avg(int[] arr) {
        int sum = 0;
        int size = arr.length;

        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }

        int avg = sum /= size;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = avg;
        }
    }
}