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

        for(int i = 0, j = array.length - 1; i < array.length/2; i++, j--) 
        {            
            String temp = array[j];
            array[j] = array[i];
            array[i] = temp;
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

// Grab temp from end
// end gets beggining
//begging gets temp
