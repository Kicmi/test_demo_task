package application_1.jar;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Test {

	public static void main(String[] args) {
		JFrame f = new JFrame ("Bosch practical task");
		
		JTextField t1,t2;
		t1 = new JTextField("/input/dir/path/");
		t2 = new JTextField("/output/dir/path/");
		t1.setBounds(50, 50, 200, 30);
		t2.setBounds(50, 150, 200, 30);
		f.add(t1);
		f.add(t2);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
		t1.setEditable(false); 
		t2.setEditable(false); //1,3
		
		String elements[]= {"sample.xml", "sample.csv"};
		JComboBox cb = new JComboBox (elements);
		cb.setBounds(50, 100, 90, 20);
		f.add(cb);
		f.setSize(400,500); //2
		cb.setSelectedIndex(-1);
		
		
		
		
	}
	
	
}
