package View;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class ShowGoldView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShowGoldView frame = new ShowGoldView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ShowGoldView() {
		this.init();
		this.setVisible(true);
	}
	public void init()
	{
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		String columns[] = {"ID Trade", "Date", "Unit Price", "Amount", "Type"}; 
		String data[][] = {{"111", "12-12-2022", "1", "1", "vang khoi"}, {"222", "22-12-2024","2", "2", "tien mat"}};
		table = new JTable(data, columns);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 10, 416, 243);
		contentPane.add(scrollPane);
	}
}
