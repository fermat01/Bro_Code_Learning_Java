import javax.swing.JOptionPane;


public class Main {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name: ");
        JOptionPane.showMessageDialog(null, "hey hi " + " " + name + " !");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
        JOptionPane.showMessageDialog(null, "You are  " + " " + age + " " + " year old.");
        JOptionPane.showMessageDialog(null, "hey hi " + " " + name + " !");
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height: "));
        JOptionPane.showMessageDialog(null, "You are  " + " " + height + " cm tall.");
        
    }
}