import javax.swing.*;

public class maxval {
    public static void main(String[] args) {
        String no;
        int max = 0;

        String num = JOptionPane.showInputDialog("enter the number of numbers you want to run");
        int n=Integer.parseInt(num);
        int[]a=new int[n];
        for(int i=0;i<a.length;i++)
        {
            no=JOptionPane.showInputDialog("enter number"+(i+1));
            a[i]=Integer.parseInt(no);


        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<a[0])
            {
                max = a[0];
            }
            else
            {
                max=a[i];
            }
        }
        JOptionPane.showMessageDialog(null, "the maximum value of the numbers entered"+max,"Maximum values",JOptionPane.INFORMATION_MESSAGE);
    }
}
