/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

public abstract class Decorator implements NFTInterface {
    
    protected NFTInterface nftinterface;
    
    public Decorator(NFTInterface nf_tint){

        nftinterface = nf_tint;
        
    }
    
    public String getDescription(){
    
        return nftinterface.getDescription();
        
    }
    
    public double getCost(){
        
        return nftinterface.getCost();
    
    }
}
