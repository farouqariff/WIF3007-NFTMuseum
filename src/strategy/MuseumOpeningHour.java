package strategy;

import javafx.scene.image.ImageView;

public abstract class MuseumOpeningHour {
    private static Boolean status = false;
//    MuseumOpenState openBehavior;
//    MuseumCloseState closeBehavior;
    MuseumOpen openBehavior;
    MuseumClose closeBehavior;
    
    public MuseumOpeningHour(){
        
    }
    
    public abstract void display();
    
    public void Open(ImageView imageView){
        this.status = true;
        openBehavior.doorOpen(imageView);
    }

    public static Boolean getStatus() {
        return status;
    }

    public void Close(ImageView imageView){
        this.status = false;
        closeBehavior.doorClose(imageView);
    }
    
//    public void setLightOnBehavior(MuseumOpenBehavior lob){
//        openBehavior = lob;
//    }
//
//    public void setLightOffBehavior(MuseumCloseBehavior lob){
//        closeBehavior = lob;
//    }

}
