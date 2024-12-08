package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

import javax.swing.JButton;

import View.InputMoneyView;

public class InputMoneyController implements ActionListener{
	private InputMoneyView inpMoneyView;
	
	
	public InputMoneyView getInpMoneyView() {
		return inpMoneyView;
	}

	public InputMoneyController(InputMoneyView inpMView)
	{
		this.inpMoneyView = inpMView;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		JButton choose = (JButton) e.getSource();
		String chosen = choose.getText();
		if (chosen.equals("Enter"))
		{
			this.getInpMoneyView().getMonTrade().setIdTrade(this.getInpMoneyView().getIdMField().getText());
			this.getInpMoneyView().getMonTrade().setDate(Integer.parseInt(this.getInpMoneyView().getDateMField().getText()) );
			this.getInpMoneyView().getMonTrade().setMonth(Integer.parseInt(this.getInpMoneyView().getMonthMField().getText()));
			this.getInpMoneyView().getMonTrade().setYear(Integer.parseInt(this.getInpMoneyView().getYearMField().getText()));
			this.getInpMoneyView().getMonTrade().setUnitPrice(Float.parseFloat(this.getInpMoneyView().getUnitMField().getText()));
			this.getInpMoneyView().getMonTrade().setAmount(Integer.parseInt(this.getInpMoneyView().getAmountMField().getText()));
			this.getInpMoneyView().getMonTrade().setType((String) this.getInpMoneyView().getComboBox().getSelectedItem());
			
			System.out.println(this.getInpMoneyView().getIdMField().getText());
			System.out.println(this.getInpMoneyView().getDateMField().getText());
			System.out.println(Integer.parseInt(this.getInpMoneyView().getMonthMField().getText()));
			System.out.println(Integer.parseInt(this.getInpMoneyView().getYearMField().getText()));
			System.out.println(Float.parseFloat(this.getInpMoneyView().getUnitMField().getText()));
			System.out.println(Integer.parseInt(this.getInpMoneyView().getAmountMField().getText()));
			System.out.println((String) this.getInpMoneyView().getComboBox().getSelectedItem());
			
			this.getInpMoneyView().dispose();
		}
		else
		{
			LocalDate time = LocalDate.now();
			
			int day = time.getDayOfMonth();
			this.getInpMoneyView().getDateMField().setText(Integer.toString(day));
			
			int month = time.getMonthValue();
			this.getInpMoneyView().getMonthMField().setText(String.valueOf(month));
			
			int year = time.getYear();
			this.getInpMoneyView().getYearMField().setText(String.valueOf(year));
			
		}
	}

}
