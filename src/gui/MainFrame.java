package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = -8026416994513756565L;

	JSplitPane pane;
	SelectPanel topics;
	JPanel info;
	
	public MainFrame(String s){
		super(s);
		
		//Initialize topics + info
		pane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, topics, info);
	}
	
	
	public static void setContent(){
		//static to change info pane
	}
	
}
