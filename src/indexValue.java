,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,
import java.util.Scanner;
public class indexValue {

    public static void main(String args[]) {
        Scanner scanner= new Scanner(System.in);
        
        
        System.out.println("How many element do you need to store: ");
        
        int size = scanner.nextInt();
        
        int[] elements = new int[size];
        
        System.out.println("Enter" +size+"elements");
        
        for (int i=0;i<size;i++){
        
        elements[i] = scanner.nextInt();
        }
        System.out.println("enter the index number of an array to know the value stored in it:");
        int index=scanner.nextInt();
        
        if (index>=0 && index<size){
        
            System.out.println("the value stored in index "+index+ "is" +elements[index]);
        }else{
        
            System.out.println("Invalid index. index should be between 0 and number of element");
        
        
        }
      
    }
}

