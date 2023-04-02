/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

import javafx.scene.image.ImageView;

public class NoSparkleState implements State {
    
    ImageView sparkle_gif;
    Sparkle lights;
    
    public NoSparkleState(ImageView sparkle_gif, Sparkle sparkle){
        this.sparkle_gif = sparkle_gif;
        this.lights = sparkle;
    }

    @Override
    public void triggerSparkle() {
        System.out.println("Sparkle light turn off in the museum.");
        sparkle_gif.setVisible(false);
        lights.changeState(lights.getHasSparkleState());
    }
    
}


