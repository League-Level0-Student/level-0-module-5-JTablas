import javax.swing.JOptionPane;

public class Shazam {
public static void main(String[] args) {
JOptionPane.showMessageDialog(null, "Shazam");	
String sha =JOptionPane.showInputDialog("Shazam how many times?");
int zam = Integer.parseInt(sha);
for (int i = zam; i >0; i--) {
System.out.println("Shazam");
}
}
}