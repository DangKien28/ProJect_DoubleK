package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import javax.swing.JButton;

import View.InputGoldTradeView;

public class InputGoldController implements ActionListener{
	private InputGoldTradeView inpGold;
	
	
	public InputGoldTradeView getInpGold()
	{
		return inpGold;
	}
	
	public InputGoldController(InputGoldTradeView inpGold)
	{
		this.inpGold = inpGold;
	}


	@Override
	public void actionPerformed(ActionEvent e)
	{
		JButton choose = (JButton) e.getSource();
		String chosen = choose.getText();
		if (chosen.equals("Enter"))
		{
			inputGold();
		}
		if (chosen.equals("Default"))
		{
			LocalDate time = LocalDate.now();
			
			int day = time.getDayOfMonth();
			this.getInpGold().getDayField().setText(String.valueOf(day));
			
			int month = time.getMonthValue();
			this.getInpGold().getMonthField().setText(String.valueOf(month));
			
			int year = time.getYear();
			this.getInpGold().getYearField().setText(String.valueOf(year));
		}
			
	}
	
	public void inputGold()
	{
		this.getInpGold().getGoldTrade().setIdTrade(this.getInpGold().getIdField().getText());
		this.getInpGold().getGoldTrade().setDate(Integer.parseInt(this.getInpGold().getDayField().getText()));
		this.getInpGold().getGoldTrade().setMonth(Integer.parseInt(this.getInpGold().getMonthField().getText()));
		this.getInpGold().getGoldTrade().setYear(Integer.parseInt(this.getInpGold().getYearField().getText()));
		this.getInpGold().getGoldTrade().setUnitPrice(Float.parseFloat(this.getInpGold().getUnitField().getText()));
		this.getInpGold().getGoldTrade().setAmount(Integer.parseInt(this.getInpGold().getAmountField().getText()));
		this.getInpGold().getGoldTrade().setType(this.getInpGold().getTypeField().getText());
		
		System.out.println(this.getInpGold().getIdField().getText());
		System.out.println(Integer.parseInt(this.getInpGold().getDayField().getText()));
		System.out.println(Integer.parseInt(this.getInpGold().getMonthField().getText()));
		System.out.println(Integer.parseInt(this.getInpGold().getYearField().getText()));
		System.out.println(Float.parseFloat(this.getInpGold().getUnitField().getText()));
		System.out.println(Integer.parseInt(this.getInpGold().getAmountField().getText()));
		System.out.println(this.getInpGold().getTypeField().getText());
		
		this.getInpGold().dispose();
	}
	
}
