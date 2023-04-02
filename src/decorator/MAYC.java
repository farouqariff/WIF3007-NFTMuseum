/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

import javafx.scene.image.ImageView;

public class MAYC extends Decorator {
    
    NFTInterface nft_int;
    
    public MAYC(NFTInterface nftInterface) {
        super(nftInterface);
        this.nft_int = nftInterface;
    }
    
    @Override
    public String getDescription(){
    
        return nftinterface.getDescription() + ", MAYC";
        
    }
    
    @Override
    public double getCost(){
        return nftinterface.getCost() + 22.95;
    }

    @Override
    public void setImage(ImageView imageView) {
        if (!imageView.isVisible()) {
                    imageView.setVisible(true);  
                }else{
                    imageView.setVisible(false);
        }
    }

    
}
