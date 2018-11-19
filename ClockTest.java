import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ClockTest 
{
	
	public static void main(String[] args) 
	{
		
		JFrame controlFrame = new JFrame("Control Panel");
		controlFrame.setSize(150, 300);
		
		JLabel hourLabel = new JLabel();
		JTextField hourField =new JTextField();
		
		JLabel minuteLabel = new JLabel();
		JTextField minuteField = new JTextField();
		
		JButton drawButton = new JButton("Draw");
		
		JFrame clockFrame = new JFrame("Clock Display");
		//clockFrame.add(ClockPanel);
		
	}
	
}
