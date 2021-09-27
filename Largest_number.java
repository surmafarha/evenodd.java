public class Largest_number {

    public static void main(String[] args) {

        int n[] = {10,20,45,5,8,50,9,3,4};

        int largest = 0;

        for (int i=0; i<n.length ; i++) {

            if (n[i] > largest) {

                largest = n[i];

            }

        }

        System.out.println("Largest number is " + largest);

    }

} 
