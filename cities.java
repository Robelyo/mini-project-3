
import java.util.Random;

class cities {
    private String ctname;
    int temperature;
    int rainfall;
    int windspeed;
    int humidity;
    int waterlevel;
    int seismicactivity;
    String disaster;
    protected boolean danger;

    cities(String ctname) {
        Random rand=new Random();
        this.ctname=ctname;
        this.temperature=rand.nextInt(7);
        this.rainfall=rand.nextInt(5);
        this.windspeed=rand.nextInt(5);
        this.humidity=rand.nextInt(5);
        this.waterlevel=rand.nextInt(7);
        this.seismicactivity=rand.nextInt(5);
    }

    public String getCtname(){
            return ctname;
}
    void ctname(){
        System.out.println(getCtname().toUpperCase());
    }

    
}
