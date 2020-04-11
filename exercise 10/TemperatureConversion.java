import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
 
/*
<applet code="TemperatureConversio" width=400 height=100>
</applet>
*/
 
public class TemperatureConversion extends JApplet implements ActionListener {
 
JTextField txtInput;
JLabel lblResult;
JRadioButton rbCelcius, rbKelvin;
 
public void init(){
 
Container conpane = getContentPane();
conpane.setLayout (new FlowLayout());
 
txtInput = new JTextField("",10);
conpane.add(txtInput);
 
rbCelcius= new JRadioButton ("to Celcius", true);
conpane.add(rbCelcius);
 
rbKelvin = new JRadioButton("to Kelvin", false);
conpane.add(rbKelvin);
 
ButtonGroup selection = new ButtonGroup();
selection.add(rbCelcius);
selection.add(rbKelvin);
 
JButton button1 = new JButton ("Show Result");
button1.addActionListener(this);
conpane.add(button1);
 
lblResult= new JLabel ("Enter Ferenheit, Choose an option to convert and Click Show Result");
conpane.add(lblResult);
}
 
public void actionPerformed(ActionEvent e) {
 
DecimalFormat df = new DecimalFormat ("#.##");
double ferenheit = Double.parseDouble(txtInput.getText());
double answer = 0.0;
 
answer = ((5.0/9.0)*(ferenheit - 32.0));
 
if (rbKelvin.isSelected())
answer += 273.15;
 
lblResult.setText(String.valueOf(df.format(answer)));
 
}
}