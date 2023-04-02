/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class AddNFT {
        
    public static void init(NFTInterface nft_int, Text txt, ImageView img1, ImageView img2, ImageView img3, ImageView img4) {

        txt.setText(String.valueOf(nft_int.getCost()));


    }
    
}
