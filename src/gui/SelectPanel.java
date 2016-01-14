package gui;

import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class SelectPanel extends JTabbedPane {
	private static final long serialVersionUID = 1220413053272504483L;

	ListPane formulae; 	// Initialize as ListPanePlus
	ListPane variables;
	
	// Constructor + Initialization of 
	
	// Add Tabs
	
	
}

class ListPane extends JPanel {
	private static final long serialVersionUID = 5001153303679421303L;
	
	JTextField search;
	JScrollPane pane;
	JList<String> list;	// list goes in pane
	
	ListPane(){
		
	}
	
}
class ListPanePlus extends ListPane {
	private static final long serialVersionUID = 56037401011750367L;
	
	JComboBox<String> selection;
	
}