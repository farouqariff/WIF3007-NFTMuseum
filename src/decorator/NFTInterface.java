/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

import javafx.scene.image.ImageView;

public interface NFTInterface {
        
    public String getDescription();
    
    public void setImage(ImageView imageView);
    
    public double getCost();
    
}
