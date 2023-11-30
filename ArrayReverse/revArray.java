import java.util.Scanner;

class revArray {
    public static void main(String[] args) {
        Scanner amput = new Scanner(System.in);
        System.out.println("How big should the array be?");
        long size = amput.nextLong();//Size of array (Long to let anyone make long arrays if they feel like it)
        String[] array = new String[size];
        //add values to array
        for(int i = 0; i < size; i++) {
           System.out.print("Enter value\n>>");
           array[i] = amput.nextLine();
        }
        for (int i = 0; i < array.length; i++) {
            var temp = array[i];//Temporary file
            for (int j = 0; j < array.length; j++) {
                if (j + 1 != array.length) {
                    array[j + 1] = array[j];//Shift all values up one now that we
                }
            }
            array[size - 1] = temp;
        }
        System.out.print("Array\n");
    }    
}
