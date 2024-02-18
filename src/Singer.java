public class Singer extends Person{
    private String bandName;

    public String getBandName(){
        return bandName;
    }

    public Singer(String bandName) {
        this.bandName = bandName;
    }

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public void setBandName(String bandName){
        this.bandName = bandName;

    }
    public void singing(){
        System.out.println("Singing "+bandName);
    }
    public void playGitar(){
        System.out.println("play gitar "+bandName);

    }
}
