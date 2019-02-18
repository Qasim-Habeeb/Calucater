package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class Maincontrolar {
	@FXML
	private TextField no1;
	@FXML
	private TextField no2;
	@FXML
	private TextField res;
	@FXML
	private RadioButton EN;
	@FXML
	private RadioButton DE;
	@FXML
	private RadioButton MUL;
	@FXML
	private RadioButton DIV;
	public int n1, n2, count = 0;

	public void onClickCheckBox(ActionEvent event) {
		try {
			if (EN.isSelected()) {

				n1 = Integer.parseInt(no1.getText());
				n2 = Integer.parseInt(no2.getText());

				count = n1 + n2;
				res.setText(count + "");

			}

			if (DE.isSelected()) {

				n1 = Integer.parseInt(no1.getText());
				n2 = Integer.parseInt(no2.getText());
				count = n1 - n2;
				res.setText(count+"");

			}
			
			if (MUL.isSelected()) {

				n1 = Integer.parseInt(no1.getText());
				n2 = Integer.parseInt(no2.getText());
				count = n1 * n2;
				res.setText(count + "");

			}
			
			if (DIV.isSelected()) {

				n1 = Integer.parseInt(no1.getText());
				n2 = Integer.parseInt(no2.getText());
				count = n1 / n2;
				res.setText(count + "");

			}
		} catch (Exception e) {
			// TODO: handle exception
			//System.out.println("please isert no in text");
		}

	

	}
}
