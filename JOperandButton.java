import javax.swing.*;
import java.awt.*;


public class JOperandButton extends JButton {
    public JOperandButton(String text){
        super.setText(text);
        this.setBackground(Color.white);
        this.setFont(new Font("Courier", Font.PLAIN,20));
    }
}
