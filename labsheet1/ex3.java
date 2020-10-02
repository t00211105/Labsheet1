package labsheet1;

import javax.swing.JOptionPane;

public class ex3
{
    public static void main(String[] args)
    {
      String name="",course="",snackAsString="";
      int snack=0,cost = 2;

      name = JOptionPane.showInputDialog(null,"Please enter your name","Input",JOptionPane.QUESTION_MESSAGE);
      course =JOptionPane.showInputDialog(null,"Please enter your course","Input",JOptionPane.QUESTION_MESSAGE);
        snack = Integer.parseInt(JOptionPane.showInputDialog(null,"How many snacks would you like","Input",JOptionPane.QUESTION_MESSAGE));

        cost = snack*cost;

        JOptionPane.showMessageDialog(null,"name: " + name + "\n" + "Course:" + course+"\n" + "Snacks: " + snack+"\n"+ "Cost: €" + cost,"Receipt",JOptionPane.INFORMATION_MESSAGE);

    }

}
