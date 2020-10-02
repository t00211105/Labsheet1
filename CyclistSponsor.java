package labsheet1;

import javax.swing.JOptionPane;

public class CyclistSponsor
{
    public static void main(String[] args)
    {
        String name="";
        int kmcycled=0;
        float tenkm=1.75f,kmtwenty=2.5f;

        name = JOptionPane.showInputDialog(null,"Please enter your name","Input",JOptionPane.QUESTION_MESSAGE);
        kmcycled= Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter the number of km cycled","Input",JOptionPane.QUESTION_MESSAGE));
        JOptionPane.showMessageDialog(null,"name: " + name + "\n" + "Distance cycled: " + kmcycled +"\n" + "Sponsorship amount due:€57.50 " +"\n","Receipt",JOptionPane.INFORMATION_MESSAGE);

    }

}
