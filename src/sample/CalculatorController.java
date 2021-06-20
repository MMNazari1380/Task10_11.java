package sample;

// ketabkhane ha
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * @author MMNazari1380
 * @version 1.0
 */
public class CalculatorController {

    //field ha
    @FXML
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button0;
    private Button buttonJam;
    private Button buttonMenha;
    private Button buttonTaghsim;
    private Button buttonZarb;
    private Button buttonTavan;
    private Button buttonMomaiez;
    private Button buttonMosavi;
    private Button buttonAC;
    private Button buttonSin;
    private Button buttonCos;
    private Button buttonTan;
    private Button buttonCot;
    // voroodi avval
    private double num1 = 0 ;
    // voroodi dovvom
    private double num2 = 0 ;
    // alamt ya amalgar
    private String op = "" ;
    // textfield
    @FXML
    private TextField textField;

    //tabe ha

    @FXML
    public void onClickButton1 (ActionEvent e) {
        textField.setText(textField.getText() + "1");
    }
    @FXML
    public void onClickButton2 (ActionEvent e) {
        textField.setText(textField.getText() + "2");
    }
    @FXML
    public void onClickButton3 (ActionEvent e) {
        textField.setText(textField.getText() + "3");
    }
    @FXML
    public void onClickButton4 (ActionEvent e) {
        textField.setText(textField.getText() + "4");
    }
    @FXML
    public void onClickButton5 (ActionEvent e) {
        textField.setText(textField.getText() + "5");
    }
    @FXML
    public void onClickButton6 (ActionEvent e) {
        textField.setText(textField.getText() + "6");
    }
    @FXML
    public void onClickButton7 (ActionEvent e) {
        textField.setText(textField.getText() + "7");
    }
    @FXML
    public void onClickButton8 (ActionEvent e) {
        textField.setText(textField.getText() + "8");
    }
    @FXML
    public void onClickButton9 (ActionEvent e) {
        textField.setText(textField.getText() + "9");
    }
    @FXML
    public void onClickButton0 (ActionEvent e) {
        textField.setText(textField.getText() + "0");
    }
    @FXML
    public void onClickButtonJam (ActionEvent e)  {
            // baraye estefade dar mosavi
            op = "+";
            // tabdile string be double baraye mohasebat
            num1 = Double.parseDouble(textField.getText());
            textField.setText("");

    }
    @FXML
    public void onClickButtonMenha (ActionEvent e) {
            // baraye estefade dar mosavi
            op = "-";
            // tabdile string be double baraye mohasebat
            num1 = Double.parseDouble(textField.getText());
            textField.setText("");
    }
    @FXML
    public void onClickButtonZarb (ActionEvent e) {
        op = "*";
        // baraye estefade dar mosavi
        // tabdile string be double baraye mohasebat
        num1 = Double.parseDouble(textField.getText());
        textField.setText("");
    }
    @FXML
    public void onClickButtonTaghsim (ActionEvent e) {
        op = "/";
        // baraye estefade dar mosavi
        // tabdile string be double baraye mohasebat
        num1 = Double.parseDouble(textField.getText());
        textField.setText("");
    }
    @FXML
    public void onClickButtonTavan (ActionEvent e) {
        op = "^";
        // baraye estefade dar mosavi
        // tabdile string be double baraye mohasebat
        num1 = Double.parseDouble(textField.getText());
        textField.setText("");
    }
    @FXML
    public void onClickButtonMomaiez (ActionEvent e) {
        textField.setText(textField.getText() + ".");
    }
    @FXML
    public void onClickButtonSin (ActionEvent e) {
        op = "sin" ;
        // baraye estefade dar mosavi
        // tabdile string be double baraye mohasebat
        num1 = Math.sin(Double.parseDouble(textField.getText()));
        textField.setText( "sin(" +textField.getText() + ")");

    }
    @FXML
    public void onClickButtonCos (ActionEvent e) {
        op = "cos" ;
        // baraye estefade dar mosavi
        // tabdile string be double baraye mohasebat
        num1 = Math.cos(Double.parseDouble(textField.getText()));
        textField.setText( "cos(" +textField.getText() + ")");
    }
    @FXML
    public void onClickButtonTan (ActionEvent e) {
        op = "tan" ;
        // baraye estefade dar mosavi
        // tabdile string be double baraye mohasebat
        num1 = Math.tan(Double.parseDouble(textField.getText()));
        textField.setText( "tan(" +textField.getText() + ")");
    }
    @FXML
    public void onClickButtonCot (ActionEvent e) {
        op = "cot" ;
        // baraye estefade dar mosavi
        // tabdile string be double baraye mohasebat
        // choon cot nadasht az akse tan raftam
        num1 = 1/(Math.tan(Double.parseDouble(textField.getText())));
        textField.setText( "cot(" +textField.getText() + ")");
    }
    @FXML
    public void onClickButtonMosavi (ActionEvent e) {
        // num2 dar sin va cos va tan va cot moshkel dorost mikonad choon text safhe
        // ghabele tabdil be double nist
        if(!op.equals("sin") && !op.equals("cos") && !op.equals("tan") && !op.equals("cot"))
            //meghdar dehi num2
        num2 = Double.parseDouble(textField.getText());
        //pak kardane safhe
        textField.setText("");
        if( op.equals("+"))
            textField.setText(String.valueOf(num1+num2));
        if( op.equals("-"))
            textField.setText(String.valueOf(num1-num2));
        if( op.equals("*"))
            textField.setText(String.valueOf(num1*num2));
        if( op.equals("/"))
            textField.setText(String.valueOf(num1/num2));
        if( op.equals("^"))
            textField.setText(String.valueOf(Math.pow(num1, num2)));
        if( op.equals("sin"))
            textField.setText(String.valueOf(num1));
        if( op.equals("cos"))
            textField.setText(String.valueOf(num1));
        if( op.equals("tan"))
            textField.setText(String.valueOf(num1));
        if( op.equals("cot"))
            textField.setText(String.valueOf(num1));
    }
    @FXML
    public void onClickButtonAC (ActionEvent e) {
        textField.setText("");
    }
}
