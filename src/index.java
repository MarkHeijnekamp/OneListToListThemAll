import java.util.Scanner;
public class index {
    public static void main(String[] args) {

        int[] arraylist;
        Scanner reader = new Scanner(System.in);

         String[] arrayliststring = new String[3];

            arrayliststring[0] = "Hello world";
            arrayliststring[1] = "This is an array";
            arrayliststring[2] = "you need help ?";
            System.out.println("say a number between 0 and 2");
            int Answer = reader.nextInt();
        reader.close();
        if (Answer == 0){
            System.out.println(arrayliststring[0]);
        }
        if (Answer == 1){
            System.out.println(arrayliststring[1]);
        } if (Answer == 2){
            System.out.println(arrayliststring[2]);
        }
        if (Answer >=3){
            System.out.println("2 is the max");
        }
        if (Answer <= -1){
            System.out.println("0 or more not less");
        }
        System.out.println("END");

    }
}


