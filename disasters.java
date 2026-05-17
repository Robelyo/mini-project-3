class disasters extends weather{
    
    disasters(String ctname) {
        super(ctname);
    }

@Override
void ctcondition(){
    if (danger==true){
        System.err.println("THERE IS A "+disaster);
    }
    else{
        System.err.println("IT IS SAFE");
    }
}
}
