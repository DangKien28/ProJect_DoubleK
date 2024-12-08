package View;

import java.awt.EventQueue;
import Controller.TotalGoldAmountController;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class TotalGoldAmountView extends JFrame {
	private TotalGoldAmountController totalGold;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTotalGoldAmount;
	
	public TotalGoldAmountController getTotalGold() {
		return totalGold;
	}
	
	//Create a function in TotalMonAmountController to display on the frame
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TotalGoldAmountView frame = new TotalGoldAmountView();
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
	public TotalGoldAmountView()
	{
		this.init();
		this.setVisible(true);
	}
	public void init()
	{
		setTitle("Total Gold Amount");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 552, 359);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 518, 271);
		contentPane.add(scrollPane);
		
		txtTotalGoldAmount = new JTextField();
		txtTotalGoldAmount.setText("Total Gold Amount");
		txtTotalGoldAmount.setEditable(false);
		txtTotalGoldAmount.setBounds(262, 291, 189, 21);
		contentPane.add(txtTotalGoldAmount);
		txtTotalGoldAmount.setColumns(10);
	}
}
