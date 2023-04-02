package strategy;

import javafx.scene.image.ImageView;

public class NFTAttendant {
    public static void init(ImageView crowd){
        MuseumOpeningHour status = new Status();

        if (status.getStatus()) {
            status.Close(crowd);
        } else {
            status.Open(crowd);
        }
    }
}


