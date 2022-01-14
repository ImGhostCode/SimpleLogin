import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class WellcomePage   {
    JFrame frame = new JFrame("Wellcome");
    JLabel label = new JLabel();
    WellcomePage (String name){

        label.setText("Hello " + name);
        label.setBounds(0, 0, 200, 35);
        label.setFont(new Font(null, Font.BOLD, 25));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
       
        frame.setSize(420,420);

        frame.add(label);
        frame.setVisible(true);
    }
}
