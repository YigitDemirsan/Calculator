import javax.swing.*;
        import java.awt.*;

public class Calculator {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Calculator");
        jFrame.setSize(300,300);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Font font = new Font("Courier", Font.PLAIN,20);

        JPanel topPanel = new JPanel();
        jFrame.add(topPanel,BorderLayout.NORTH);
        topPanel.setBackground(Color.white);
        topPanel.setLayout(new BorderLayout());
        JLabel label = new JLabel("0");
        label.setFont(font);
        topPanel.add(label,BorderLayout.EAST);


        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(4,4));

        mainPanel.add(new JOperandButton("7"));
        mainPanel.add(new JOperandButton("8"));
        mainPanel.add(new JOperandButton("9"));
        mainPanel.add(new JOperatorButton("/"));
        mainPanel.add(new JOperandButton("4"));
        mainPanel.add(new JOperandButton("5"));
        mainPanel.add(new JOperandButton("6"));
        mainPanel.add(new JOperatorButton("x"));
        mainPanel.add(new JOperandButton("1"));
        mainPanel.add(new JOperandButton("2"));
        mainPanel.add(new JOperandButton("3"));
        mainPanel.add(new JOperatorButton("-"));
        mainPanel.add(new JOperandButton("0"));
        mainPanel.add(new JOperandButton("."));
        mainPanel.add(new JOperatorButton("="));
        mainPanel.add(new JOperatorButton("+"));
        jFrame.add(mainPanel,BorderLayout.CENTER);
        jFrame.setVisible(true);

    }
}
