package View;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import Controller.TotalMonAmountController;

public class TotalMonAmountView extends JFrame {
	private TotalMonAmountController totalMon;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField totalMonField;

	public TotalMonAmountController getTotalMon() {
		return totalMon;
	}
	
	//Create a function in TotalMonAmountController to display on the frame

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TotalMonAmountView frame = new TotalMonAmountView();
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
	public TotalMonAmountView()
	{
		this.init();
		this.setVisible(true);
	}
	public void init()
	{
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 589, 417);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 555, 329);
		contentPane.add(scrollPane);
		
		totalMonField = new JTextField();
		totalMonField.setEditable(false);
		totalMonField.setText("Total Money Amount:");
		totalMonField.setBounds(329, 351, 204, 19);
		contentPane.add(totalMonField);
		totalMonField.setColumns(10);
	}
}
