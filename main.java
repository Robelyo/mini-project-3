import java.util.Scanner;

class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("RUN WEATHER SYSTEM? (yes/no): ");
        String run = sc.nextLine();

        if(run.equalsIgnoreCase("yes")) {

            try {

                weather D1 = new disasters("ADDIS ABABA");
                weather D2 = new disasters("DIRE DAWA");
                weather D3 = new disasters("MEKELLE");
                weather D4 = new disasters("BAHIR DAR");
                weather D5 = new disasters("HAWASSA");
                weather D6 = new disasters("JIMMA");
                weather D7 = new disasters("DEBRE MARKOS");

                weather[] list = {D1, D2, D3, D4, D5, D6, D7};

                for(weather d : list){

                    d.ctname();
                    d.evaluate();
                    d.forecast();
                    d.ctcondition();
                    d.ssactivity();
                }

            }
            catch(Exception e){
                System.out.println("ERROR OCCURRED IN SYSTEM");
            }

        }
        else {
            System.out.println("SYSTEM NOT RUNNING");
        }

        sc.close();
    }
}