import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**

 https://stackoverflow.com/questions/5255726/display-list-on-a-jframe

**/

public class Achievement {

    private int i;
    private JPanel listContainer;
    private JLabel cLabel;

    public Achievement(int points, JLabel cLabel){
        this.i = points;
        this.cLabel = cLabel;

        initUI();
    }

    public int retPoints(){
        return i;
    }
    private void initUI() {
        final JFrame frame = new JFrame(Achievement.class.getSimpleName() + "s");
       // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        listContainer = new JPanel();
        listContainer.setLayout(new BoxLayout(listContainer, BoxLayout.Y_AXIS));

        frame.add(new JScrollPane(listContainer), BorderLayout.CENTER);

       // JButton data = {new JButton("Run the game"), new JButton("Collect 100 points"), new JButton( "Defeat 3 enemies"};
//
//        frame.add(new JList(data));
//        frame.pack();

        GridLayout grid = new GridLayout(7, 1, 0, 0);

        AchievementHandler ah = new AchievementHandler();
        JButton b1 = new JButton("Run the game");
        b1.addActionListener(ah);
        b1.setActionCommand("addpts");
        JButton b2 = new JButton("Get 100 points");
        JButton b3 = new JButton("Defeat 3 bosses");

        frame.add(b1);
        frame.add(b2);
        frame.add(b3);


        frame.setLayout(grid);


        //JButton button = new JButton("Add");

        //frame.add(button, BorderLayout.PAGE_END);

        frame.setSize(300, 300);
        frame.setVisible(true);
    }



//
//    public void renderView(){
//
//        JPanel panel=new JPanel();
//        JScrollPane scrollBar=new JScrollPane(panel,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
//
//        JFrame frame=new JFrame("Achievements");
//        frame.setBackground(Color.BLACK);
//        frame.add(scrollBar);
//
//        panel.setLayout(new GridBagLayout());
//        GridBagConstraints c = new GridBagConstraints();
//
//        c.insets = new Insets(2,2,2,2);
//
//
//
//        c.gridx = 0;
//        c.gridy = 0;
//
//        JButton claim = new JButton("Claim");
//        c.ipadx = 10;
//        JLabel aName = new JLabel("Play the game");
//
//        panel.add(aName, c);
//
//        c.gridx = 20;
//        c.gridy = 0;
//        panel.add(claim, c);
//
////////////////////
//
//        JButton aclaim = new JButton("2Claim");
//        c.ipadx = 20;
//        c.ipady = 20;
//        JLabel aaName = new JLabel("2Play the game");
//        aaName.setBorder(new EmptyBorder(50,0,100,0));
//
//        panel.add(aaName, c);
//
//        c.gridx = 20;
//        c.gridy = 10;
//        panel.add(aclaim, c);
//
//
//
//        frame.setSize(400,400);
//
//
//        frame.setVisible(true);
//    }

    class AchievementHandler implements ActionListener{


        // @Override
        public void actionPerformed(ActionEvent event) {
            String action = event.getActionCommand();

            switch (action){
                case "addpts":
                   // System.out.println(i);

                    i += 10;
                    cLabel.setText(i + " points");
                    break;

            }
        }
    }
}



