package nftmuseum;


import decorator.*;
import decorator.NFTInterface;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import strategy.NFTAttendant;
import facade.NFTLabelNameFacade;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import state.*;

public class Controller implements Initializable{
    
    NFTInterface box = new NFT();
    Sparkle blink;

    @FXML
    private Button santa, sparkle, names, people;

    @FXML
    private ImageView santaImage;
    
    @FXML
    private ImageView crowd;

    @FXML
    private ImageView maycImage, cpImage, doodleImage, rtfktImage;
    
    @FXML
    private RadioButton mayc, cryptopunk, doodles, clonex;
    
    @FXML
    private Text price;
    
    @FXML
    private Button adder;
    
    @FXML
//    private ImageView orn1, orn2, orn3, orn4, orn5;
    private ImageView cp_name, doodle_name, cloneX_name, mayc_name;
    @FXML
    private Button clear;
    @FXML
    private ImageView sparkle_gif;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        hideNames();
        hideSparkle();
    }
    
    @FXML
    public void onClick(MouseEvent mouseEvent) {
        Button temp = (Button) mouseEvent.getSource();
        String id = temp.getId();

        switch ( id ){

            // TODO: State Pattern
            case "sparkle":
                blink.triggerSparkle();
                break;

            // TODO: Façade Pattern
            case "names":
//                Ornaments ornaments = new Ornaments(orn1, orn2, orn3, orn4, orn5);
                NFTLabelNameFacade names = new NFTLabelNameFacade(cp_name, doodle_name, cloneX_name, mayc_name);
                names.setNames();
                break;

            // TODO: Strategy Pattern
            case "people":
                NFTAttendant.init(crowd);
                break;

            // TODO: Decorator Pattern
            case "gifts":
                AddNFT.init(box,price,maycImage,cpImage,rtfktImage,doodleImage);
                break;
        }
    }
    
    @FXML
    public void clearNFTs(ActionEvent e){
        cryptopunk.setSelected(false);
        clonex.setSelected(false);
        doodles.setSelected(false);
        mayc.setSelected(false);
        cpImage.setVisible(false);
        maycImage.setVisible(false);
        doodleImage.setVisible(false);
        rtfktImage.setVisible(false);
        cpImage.yProperty().set(0);
        maycImage.yProperty().set(0);
        maycImage.xProperty().set(0);
        rtfktImage.yProperty().set(0);
        doodleImage.yProperty().set(0);
        box = null;
        box = new NFT();
    }
    
    @FXML
    public void listNFTs(ActionEvent e){
        RadioButton btn = (RadioButton) e.getSource();
        String id = btn.getId();
        if(btn.isSelected() == false){
                clearNFTs(e);
                return;
             }
        switch(id){
            case "mayc":
                    box = new MAYC(box);
                    box.setImage(maycImage);
                    System.out.println(box.getDescription());
                break;
            case "cryptopunk":
                    box = new CryptoPunk(box);
                    box.setImage(cpImage);
                    System.out.println(box.getDescription());
                break;
            case "doodles":
                    box = new Doodle(box);
                    box.setImage(doodleImage);
                    System.out.println(box.getDescription());
                break;
            case "clonex":
                    box = new CloneX(box);
                    box.setImage(rtfktImage);
                    System.out.println(box.getDescription());
                break;
        }
    }

    private void hideNames()
    {
        cp_name.setVisible(false);
        doodle_name.setVisible(false);
        cloneX_name.setVisible(false);
        mayc_name.setVisible(false);
//        orn5.setVisible(false);
    }
    
    private void hideSparkle(){
        sparkle_gif.setVisible(false);
        blink = new Sparkle(sparkle_gif);
    }

    
}