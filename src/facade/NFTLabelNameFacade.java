/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import javafx.scene.image.ImageView;

public class NFTLabelNameFacade
{
    ImageView cp, doodle, cloneX, mayc;
    static boolean shownames=false;
    public NFTLabelNameFacade(ImageView cp, ImageView doodle, ImageView cloneX, ImageView mayc)
    {
        this.cp=cp;
        this.doodle=doodle;
        this.cloneX=cloneX;
        this.mayc=mayc;
    }
    public void setNames()
    {
        if(shownames)
        {
            cp.setVisible(false);
            doodle.setVisible(false);
            cloneX.setVisible(false);
            mayc.setVisible(false);
            shownames=false;
        }
        else
        {
            cp.setVisible(true);
            doodle.setVisible(true);
            cloneX.setVisible(true);
            mayc.setVisible(true);
            shownames=true;
        }
    }
}
