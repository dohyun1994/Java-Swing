package test;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingProgram extends JFrame {
	
	private JLabel imgLabel = new JLabel();
	
	public SwingProgram() {
		setTitle("스윙 프로그램");
		createMenu();
		getContentPane().add(imgLabel, BorderLayout.CENTER);
		setSize(800, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	 void createMenu() {
		
		JMenuBar mb = new JMenuBar();
		
		JMenuItem[] menuItem = new JMenuItem[4];
		String[] itemTitle =  {"Apple", "Banana", "Melon", "Exit"};
		JMenu fruit = new JMenu("과일");
		
		JMenuItem[] menuItem2 = new JMenuItem[4];
		String[] itemTitle2 =  {"Load", "Hide", "ReShow", "Exit"};
		JMenu screen = new JMenu("Screen");
		
		JMenuItem[] menuItem3 = new JMenuItem[3];
		String[] itemTitle3 =  {"MoneyCheck", "Calculator", "Exit"};
		JMenu show = new JMenu("Show");
		
		MenuActionListener listener = new MenuActionListener();
		
		for(int i=0; i<menuItem.length; i++) {
			menuItem[i] = new JMenuItem(itemTitle[i]);
			menuItem[i].addActionListener(listener);
			fruit.add(menuItem[i]);
		}
		
		MenuActionListener2 listener2 = new MenuActionListener2();
		
		for(int i=0; i<menuItem2.length; i++) {
			menuItem2[i] = new JMenuItem(itemTitle2[i]);
			menuItem2[i].addActionListener(listener2);
			screen.add(menuItem2[i]);
		}
		
		MenuActionListener3 listener3 = new MenuActionListener3();
		
		for(int i=0; i<menuItem3.length; i++) {
			menuItem3[i] = new JMenuItem(itemTitle3[i]);
			menuItem3[i].addActionListener(listener3);
			show.add(menuItem3[i]);
		}
		
		mb.add(fruit);
		mb.add(screen);
		mb.add(show);
		
		setJMenuBar(mb);
		
	}
	
	class MenuActionListener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			
			switch(cmd) {
			
			case "Apple" :
				imgLabel.setIcon(new ImageIcon("C:\\Users\\YJ\\eclipse-workspace\\apple.jpg"));
				break;
				
			case "Banana" :
				imgLabel.setIcon(new ImageIcon("C:\\Users\\YJ\\eclipse-workspace\\banana.jfif"));
				break;
				
			case "Melon" :
				imgLabel.setIcon(new ImageIcon("C:\\Users\\YJ\\eclipse-workspace\\melon.jfif"));
				break;
				
			case "Exit" :
				System.exit(0);
				break;
				
			}
							
		}
	}
	
	class MenuActionListener2 implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			
			switch(cmd) {
				case "Load" :
//					if(imgLabel.getIcon() !=null)
//						return;
					imgLabel.setIcon(new ImageIcon("C:\\Users\\YJ\\eclipse-workspace\\image.PNG"));
					break;
					
				case "Hide" :
					imgLabel.setVisible(false);
					break;
					
				case "ReShow" :
					imgLabel.setVisible(true);
					break;
					
				case "Exit" :
					System.exit(0);
					break;
			}
		}
	}
	
class MenuActionListener3 implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			
			switch(cmd) {
			
			case "MoneyCheck" :
				new MoneyCheck();
				break;
				
			case "Calculator" :
				new Calculator();
				break;
				
			case "Exit" :
				System.exit(0);
				break;
				
			}			
		}
	}

	public static void main(String[] args) {
		new SwingProgram();
		
	}
}
