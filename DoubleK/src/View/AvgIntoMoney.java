package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class AvgIntoMoney extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField avgIntoMoney;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AvgIntoMoney frame = new AvgIntoMoney();
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
	public AvgIntoMoney() {
		this.init();
		this.setVisible(true);
	}
	public void init()
	{
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 578, 377);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 544, 295);
		contentPane.add(scrollPane);
		
		avgIntoMoney = new JTextField();
		avgIntoMoney.setEditable(false);
		avgIntoMoney.setText("Average of Into Money:");
		avgIntoMoney.setBounds(345, 315, 209, 19);
		contentPane.add(avgIntoMoney);
		avgIntoMoney.setColumns(10);
	}
}
