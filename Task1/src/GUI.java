import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame{
    JLabel labelOut = new JLabel("Число 1");
    JLabel labelOut2 = new JLabel("Число 2");
    JLabel labelOut3 = new JLabel("Число 3");
    JTextField fieldOneNumber = new JTextField(10);
    JTextField fieldTwoNumber = new JTextField(10);
    JTextField fieldThreeNumber = new JTextField(10);
    JButton buttonMax = new JButton("Посчитать");
    JLabel labelMax = new JLabel("");
    int resMax =0;
    GUI() {
        super("Program");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setBounds((screenSize.width / 2) - 250, (screenSize.height / 2) - 200, 450, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(5, 2, 2, 2));
        container.add(labelOut);
        container.add(fieldOneNumber);
        container.add(labelOut2);
        container.add(fieldTwoNumber);
        container.add(labelOut3);
        container.add(fieldThreeNumber);
        container.add(buttonMax);
        container.add(labelMax);
        buttonMax.addActionListener(new ButtonEvent());
    }
    class ButtonEvent implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if  (Integer.parseInt(fieldOneNumber.getText()) >  Integer.parseInt(fieldTwoNumber.getText()))
            {
                resMax = Integer.parseInt(fieldOneNumber.getText());
            }
            else
            {
                resMax = Integer.parseInt(fieldTwoNumber.getText());
            }
            if (resMax < Integer.parseInt(fieldThreeNumber.getText()))
            {
                resMax = Integer.parseInt(fieldThreeNumber.getText());
            }
            labelMax.setText("Максимальное значение "+Integer.toString(resMax));
            resMax = 0;
        }
    }
}
