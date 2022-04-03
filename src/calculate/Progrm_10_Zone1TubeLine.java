package calculate;
/*Create a HashMap object called people that will store String keys and Integer
values: And use for each loop to iterate the value from Map*/

import java.util.Scanner;

public class Progrm_10_Zone1TubeLine {
    public static void main(String[] args) {

        //single dimension array to declare Undergroung Stations
        String[] station = {"Aldgate", "Liverpool Street", "StreetMoorgate", "Barbican", "Borough", "London's Bridge", "Moorgate", "Old Street", "Bank",
                "Waterloo", "BakerStreet", "Regent's Park", "Oxford Circus", "Picaadilly Circus", " Bank", "Holborn", "St Paul's", "Bond Street",
                "Edgware Road", "Baker Street", "Farringdon", "Barbican", "Edgware Road", "Paddington", "Bayswater", "Aldgate East", "Liverpool Street",
                "Bond Street", "Westminster", " Green Oark", "Leicester Square", " Euston", "Green Park", "Covent Garden"};

        int length = station.length;//define String size
        //Multidimensional array for defining Tubeline and its stations
        String[][] tubelines = new String[12][station.length];

        tubelines[0][0] = "Metropolitan";
        tubelines[0][1] = "Aldgate";
        tubelines[0][2] = "Liveerpool Street";
        tubelines[0][3] = "Moorgate";
        tubelines[0][4] = "Barbian";

        tubelines[1][0] = "Northern";
        tubelines[1][1] = "London Bridge";
        tubelines[1][2] = "Moorgate";
        tubelines[1][3] = "Old street";

        tubelines[2][0] = "Waterloo & City";
        tubelines[2][1] = "Bank";
        tubelines[1][2] = "Waterloo";

        tubelines[3][0] = "Bakerloo";
        tubelines[3][1] = "Baker Street";
        tubelines[3][2] = "Oxford Circus";
        tubelines[3][3] = "Picaadilly Circus";

        tubelines[4][0] = "Central";
        tubelines[4][1] = "Bank ";
        tubelines[4][2] = "St Paul";
        tubelines[4][3] = "Bond Street";

        tubelines[5][0] = "Circle";
        tubelines[5][1] = "Edgware Road";
        ;
        tubelines[5][2] = "Baker Street ";
        tubelines[5][3] = "Farringdon";
        tubelines[5][4] = "Barbican";

        tubelines[6][0] = "DLR";
        tubelines[6][1] = "Bank";

        tubelines[7][0] = "District";
        tubelines[7][1] = "Edgware Road";
        tubelines[7][2] = "Paddington";
        tubelines[7][3] = "Bayswater";

        tubelines[8][0] = "Hammersmith & City";
        tubelines[8][1] = "Aldgate East";
        tubelines[8][2] = "Liverpool Street";
        tubelines[8][3] = "Moorgate";
        tubelines[8][4] = "Barbican";

        tubelines[9][0] = "Jubliee";
        tubelines[9][1] = "Baker Street";
        tubelines[9][2] = "Bond Street";
        tubelines[9][3] = "Westminster";
        tubelines[9][3] = "Waterloo";

        tubelines[10][0] = "Picadily";
        tubelines[10][1] = "Green Oark";
        tubelines[10][2] = "Picaadilly Circus";
        tubelines[10][3] = "Leicester Square";
        tubelines[10][4] = "Covent Garden";

        tubelines[11][0] = "Victoria";
        tubelines[11][1] = "Euston";
        tubelines[11][2] = "Warren Street";
        tubelines[11][3] = "Oxford Circus";
        tubelines[11][4] = "Green Park";
        //take input from user to print user station name
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the tube station name of zone 1: ");
        String userStation = sc.nextLine();
        String catchStationName = " ";

        for (int i = 0; i < station.length; i++) {
            if (userStation.equalsIgnoreCase(station[i])) {
                catchStationName = station[i];
            }
        }
        if (userStation.equalsIgnoreCase(catchStationName)) {
            System.out.println(userStation + " Station is in the zone 1. ");
            System.out.println("Following lines passing the given tube staion: " + userStation);

            for (int x = 0; x < tubelines.length; x++) {
                for (int y = 1; y < tubelines.length; y++) {
                    String match = tubelines[x][y];//matching the user input i.e station name with single dimension Array

                    if (userStation.equalsIgnoreCase(match)) {
                        System.out.println(tubelines[x][0]);//finat element of multi dimension array is the Line names
                    }
                }
            }
        } else {
            System.out.println("Station is not in the Zone 1.");
        }
    }


}
