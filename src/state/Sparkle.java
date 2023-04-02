/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

import javafx.scene.image.ImageView;

public class Sparkle {
    
    private final State has_sparkle_state;
    private final State no_sparkle_state;
    private State state;
    ImageView gif;
    
    public Sparkle(ImageView gif){
        this.gif = gif;
        has_sparkle_state = new HasSparkleState(gif, this);
        no_sparkle_state = new NoSparkleState(gif, this);
        state = has_sparkle_state;
    }
    
    public State getState(){
        return this.state;
    }
    
    public void changeState(State state){
        this.state = state;
    }
    
    public void triggerSparkle(){
        state.triggerSparkle();
    }
    
    public State getHasSparkleState(){
        return has_sparkle_state;
    }
    
    public State getNoSparkleState(){
        return no_sparkle_state;
    }
}


