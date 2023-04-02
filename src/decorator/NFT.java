/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

import javafx.scene.image.ImageView;

public class NFT implements NFTInterface {

    @Override
    public String getDescription() {
        return "NFT Tokens: ";
    }

    @Override
    public double getCost() {
        return 0.00;
    }

    @Override
    public void setImage(ImageView imageView) {
    }


}
