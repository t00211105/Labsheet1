package lab1sol;

import javax.swing.JOptionPane;

public class
CyclistSponsor {
    public static void main(String[] args) {
        String name;
        int distance;
        final double  LOW_RATE=1.75,HIGH_RATE=2.50;
        double cost;

        name =JOptionPane.showInputDialog("Please enter your name");
        distance = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of km cycled"));

        if(distance<=10)
            cost=LOW_RATE*distance;
        else
            cost = LOW_RATE*10 + HIGH_RATE*(distance-10);

        JOptionPane.showMessageDialog(null,"Name: " + name +
                        "\nDistance cycled: " + distance + "\nSponsorship amount due: €" + String.format("%.2f",cost),
                "Receipt",JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);}
}
