import javax.swing.*;

public class Monster {

    private JButton button;
    private ImageIcon ic;
    private JPanel panel;

    private int totClicks;

    public Monster(JButton button, ImageIcon ic, JPanel panel, int totClicks){
        this.button = button;
        this.ic = ic;
        this.panel = panel;
        this.totClicks = totClicks;

    }


    public void change_monster(){
        button.setIcon(null);

        if(totClicks > 10){
            ic = new ImageIcon(getClass().getClassLoader().getResource("monster_red.png"));

        }
         if(totClicks > 20){
             ic = new ImageIcon(getClass().getClassLoader().getResource("monster_purple_200x200.png"));
        }

//         else if (totClicks == 100){
//             panel.add(new JLabel("DOUBLE POINTS!"));
//
//         }

        button.setIcon(ic);
        panel.add(button);

    }




}
