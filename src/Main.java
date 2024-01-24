// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int dailyHighs[] = {32, 25, 27, 40, 45};
        double total = 0;

    for( int i=0; i<dailyHighs.length; i++){
        total = total + dailyHighs[i];
    }

        System.out.print("City: Columbus ");
        System.out.print("Zip Code: 43125 ");
        System.out.print("Average High Temperature: ");
        System.out.print(total/dailyHighs.length);


    }
}

