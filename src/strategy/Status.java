
package strategy;

public class Status extends MuseumOpeningHour {
    public Status(){

        openBehavior = new MuseumOpen();
        closeBehavior = new MuseumClose();
    }

    public void display(){
        System.out.println("Museum status is changed");
    }
}


