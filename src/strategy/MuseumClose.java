package strategy;

import javafx.scene.image.ImageView;

public class MuseumClose implements CloseBehavior {
    public void doorClose(ImageView imageView){
        System.out.println("Museum is CLOSE. There will be no people.");
        imageView.setVisible(false);
    }
}
