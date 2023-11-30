import java.util.Scanner;

class revArray {
    public static void main(String[] args) {
        Scanner amput = new Scanner(System.in);
        System.out.println("How big should the array be?");
        int size = amput.nextInt();//Size of array
        String[] array = new String[size];
        //add values to array
        for(int i = 0; i < size; i++) {
           System.out.print("Enter value\n>> ");
           array[i] = amput.nextLine();
        }
        for (int i = array.length-1; i > 0; i++) {
            var temp = array[i];//Temporary value storage
            for (int j = array.length-1; j > 0; j++) {
                if (j + 1 != array.length) {
                    array[j + 1] = array[j];//Shift all values up one now that we have the last one stored
                }
            }
            array[0] = temp;
        }
        String arrayString = "[";
        for (int i = 0; i < size; i++) {
            arrayString += "\"";
            arrayString += array[i];
            arrayString += "\"";
            if (i != size - 1) {
                arrayString += ", ";   
            }
        }
        arrayString += "]";
        System.out.println("The array: " + array);

    }    
}
