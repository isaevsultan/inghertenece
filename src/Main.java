//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("=========PROGRAMMER==================");
       Programmer programmer = new Programmer("Sultan","JavaDevoloper","Google");
        System.out.println("Name: "+programmer.getName());
        System.out.println("designation: "+programmer.getDesignation());
        System.out.println("CompanyName: "+programmer.getCompanyName());
        programmer.coding();  programmer.learn(); programmer.walk();programmer.eat();
        System.out.println();
        System.out.println("==========DANCER=========");
        Dancer dancer = new Dancer("Maikl Djekson","Dancer","theDjekson");
        System.out.println("name: "+dancer.getName()+"\ndesignation: "+ dancer.getDesignation()+"\ngroupName: "+ dancer.getGroupName());
                      dancer.dancing();  dancer.learn();dancer.walk();dancer.eat();

        System.out.println();
        System.out.println("========SINGER===========");
                      Singer singer = new Singer("Hilary Duff","Singer","Star");
        System.out.printf("""
                name: %s
                designation: %s
                bandName: %s
                """,singer.getName(),singer.getDesignation(),singer.getBandName());
        singer.singing();singer.playGitar();singer.learn();singer.walk();







    }
}