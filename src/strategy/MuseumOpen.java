package strategy;

import javafx.scene.image.ImageView;

public class MuseumOpen implements OpenBehavior {
    public void doorOpen(ImageView imageView){
        System.out.println("Museum is OPEN. There will be crowd people.");
        imageView.setVisible(true);
    }
}
