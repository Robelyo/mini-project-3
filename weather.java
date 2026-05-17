abstract class weather extends cities {

    weather(String ctname) {
        super(ctname);
    }
    
    String temp=(temperature<2)?"COLD":(temperature>=2&&temperature<=4)?"MODERATE":"HOT";
    String rain=(rainfall<1)?"LOW":(rainfall>=1&&rainfall<=3)?"MODERATE":"RAINY";
    String wind=(windspeed<1)?"LOW":(windspeed>=1&&windspeed<=3)?"NORMAL":"WINDY";
    String hum=(humidity<1)?"ARID":(humidity>=1&&humidity<=3)?"MODERATE":"HUMID";
    String water=(waterlevel<2)?"LOW":(waterlevel>=2&&waterlevel<=4)?"NORMAL":"HIGH";
    String seism=(seismicactivity<1)?"LOW":(seismicactivity>=1&&seismicactivity<=3)?"MODERATE":"HIGH";

    public void evaluate(){
    if (temp=="MODERATE"&&rain=="RAINY"&&wind=="LOW"&&hum=="MODERATE"&&water=="NORMAL"&&seism=="LOW"){
        danger=true;
        disaster="Land Slide";
    }
    else if(temp=="MODERATE"&&rain=="RAINY"&&wind=="LOW"&&hum=="MODERATE"&&water=="HIGH"&&seism=="LOW"){
        danger=true;
        disaster="Mud Flow";
    }
    else if(temp=="MODERATE"&&rain=="RAINY"&&wind=="LOW"&&hum=="MODERATE"&&water=="HIGH"){
        danger=true;
        disaster="Flash Flood";
    }
    else if(temp=="HOT"&&rain=="LOW"&&wind=="WINDY"&&hum=="ARID"){
        danger=true;
        disaster="Wild Fire";
    }
    else if(temp=="HOT"&&rain=="RAINY"&&wind=="WINDY"&&hum=="HUMID"&&water=="HIGH"){
        danger=true;
        disaster="Cyclone";
    }
    else if(temp=="MODERATE"&&rain=="MODERATE"&&wind=="WINDY"&&hum=="HUMID"){
        danger=true;
        disaster="Tornado";
    }
    else if(water=="HIGH"&&seism=="HIGH"){
        danger=true;
        disaster="Tsunami";
    }
    else if(seism=="HIGH"){
        danger=true;
        disaster="Volcanic Eruption";
    }
    else{
        danger=false;
        disaster="NONE";
    }
}


@Override
void ctname() {
    System.out.println("CITY: " + getCtname().toUpperCase());
}
    void forecast(){
        System.out.println("TEMPERATURE: "+temp+" RAINFALL: "+rain+" WINDSPEED: "+wind+" HUMIDITY: "+hum);
    }

    void moisture(){
        System.out.println("RAINFALL: "+rain+" HUMIDITY: "+hum);
    }

    void ssactivity(){
        System.out.println("SEISMIC ACTIVITY: "+seism);
    }
    void ctcondition(){
    if (danger==true){
        System.err.println("UNSAFE");
    }
    else{
        System.err.println("SAFE");
    }
}
}

