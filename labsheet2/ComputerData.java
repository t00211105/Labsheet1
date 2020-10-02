package labsheet2;
import javax.swing.JOptionPane;

public class ComputerData {
    public static void main(String[] args) {

        char serialnum;
        int harddisk = 0;
        String serislnumAsString, harddiskAsString, type ="", priceAsString;
        float price = 0,avgdiskspace,lowest=2000f,highest=0f;

        serislnumAsString = JOptionPane.showInputDialog(null, "Please enter the serial number(<CR>to exit)", "Input", JOptionPane.QUESTION_MESSAGE);
        for (int i = 1; i < 5; i++) {
            harddiskAsString = JOptionPane.showInputDialog(null, "Please enter the hard disk space", "Input", JOptionPane.QUESTION_MESSAGE);
            harddisk = Integer.parseInt(harddiskAsString);

            if ((harddisk <= 0) || (harddisk > 2999)) {

                harddiskAsString = JOptionPane.showInputDialog(null, "Invalid! Please re-enter hard disk space", "Input", JOptionPane.QUESTION_MESSAGE);
            } else {
                type = JOptionPane.showInputDialog(null, "Please enter the processor type", "Input", JOptionPane.QUESTION_MESSAGE);
                priceAsString = JOptionPane.showInputDialog(null, "Please enter the price", "Input", JOptionPane.QUESTION_MESSAGE);

                price = Float.parseFloat(priceAsString);
            }
            if(price<lowest)
            lowest=price;
            if(price>highest)
                highest=price;
         

           

        }
        int harddisktotal = 0;
        harddisk+=harddisktotal;
        avgdiskspace(harddisktotal);
        JOptionPane.showMessageDialog(null,"The average disk space on the computers processed is: "+ avgdiskspace(harddisktotal) +
                "The price range of the computers is from €" +lowest +"to €"+  highest +
                "The processer type on the cheapest computer is Athlon","Computer Stats",JOptionPane.INFORMATION_MESSAGE);

    }

    private static int avgdiskspace(int harddisktotal) {
        float avgspace;
       avgspace= harddisktotal/5f;
       String.format("%.2f",avgspace);

        return (int) avgspace;
    }
}