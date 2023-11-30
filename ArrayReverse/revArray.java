import java.util.Scanner;

class revArray {
    public static void main(String[] args) 
    {
        Scanner amput = new Scanner(System.in);
        System.out.println("How big should the array be?");
        int size = amput.nextInt();//Size of array
        amput.nextLine();

        String[] array = new String[size];

        //add values to array
        for(int i = 0; i < size; i++) {
           System.out.print("Enter value\n>> ");
           array[i] = amput.nextLine();
        }

        for (int i = array.length-1; i > 0; i--) 
        {
            var temp = array[i];//Temporary value storage
            System.out.println("array:");
            for (int j2 = 0; j2 < array.length; j2++) {
                System.out.println(array[j2]);
            }
            
            array[i] = array[0];
            array[0] = temp;
        }

        String arrayString = "[";

        for (int i = 0; i < array.length; i++) {
            arrayString += "\"";
            arrayString += array[i];
            arrayString += "\"";
            if (i != size - 1) {
                arrayString += ", ";   
            }
        }
        arrayString += "]";
        System.out.println("The array: " + arrayString);

    }    
}
