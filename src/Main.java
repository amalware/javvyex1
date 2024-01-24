//Amal Suleiman
//Jav EX1
//January 24th 2024

public class Main {
    public static void main(String[] args) {
        int dailyHighs[] = {32, 25, 27, 40, 45};

        double total = 0; //Initialize total variable

        for( int i=0; i<dailyHighs.length; i++){ //Start at index 0, for the length of the array...
            total = total + dailyHighs[i]; //Add index int value to each total
        }
        //Note: I did not do System.out.println() because I wanted this all on one line!
        System.out.print("City: Columbus "); //City
        System.out.print("Zip Code: 43125 "); //Zip code
        System.out.print("Average High Temperature: ");
        System.out.print(total/dailyHighs.length); //Find average (add up total, divide by length) and print (yes, in one line)

        //When computing the average high temp, the value was stored as a double. The average had a decimal (33.8). Intergers do NOT include decimals. Therefore, the computed average with either data types ends up as a quote.
    }
}

