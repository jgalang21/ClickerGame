import javax.swing.*;
import java.awt.*;

public class Achievement {



    public void renderView(){

        JPanel panel=new JPanel();
        JScrollPane scrollBar=new JScrollPane(panel,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        JFrame frame=new JFrame("Achievements");
        frame.setBackground(Color.BLACK);
        frame.add(scrollBar);

        panel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        c.insets = new Insets(2,2,2,2);
        c.gridx = 0;
        c.gridy = 0;

        JButton claim = new JButton("Claim");
        c.ipadx = 10;
        JLabel aName = new JLabel("Play the game");

        panel.add(aName, c);

        c.gridx = 20;
        c.gridy = 0;
        panel.add(claim, c);

        frame.setSize(400,400);


        frame.setVisible(true);
    }


}
