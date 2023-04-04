
package calculatrice;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;

import javax.swing.*;

public class Calculatrice implements ActionListener {

    double num1=0, num2=0;
    int calcule;

    JFrame frame =new JFrame("Calculatrice");
    JLabel label1=new JLabel();
    JTextField textField = new JTextField();
    JRadioButton onRadioButton = new JRadioButton("On");
    JRadioButton offRadioButton = new JRadioButton("Off");
    JButton button0 = new JButton("0");
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton buttonPoint = new JButton(".");
    JButton buttonPlus = new JButton("+");
    JButton buttonMoins = new JButton("-");
    JButton buttonMulti = new JButton("×");
    JButton buttonDiv = new JButton("/");
    JButton buttonEgal = new JButton("=");
    JButton buttonClear = new JButton("C");
    JButton buttonDelete = new JButton("D");
    JButton buttonPourcent = new JButton("%");
    JButton buttonRacine = new JButton("√");
    JButton buttonCarre = new JButton("x²");
    JButton buttonInverse = new JButton("1/x");
    JButton buttonPlusMoins = new JButton("±");
    Calculatrice(){
        prepareGui();
        addComponents();
        addActionEvent();
    }

    public void prepareGui(){
        frame.setSize(305, 480);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public  void addComponents() {
        label1.setBounds(250, 0, 50, 50);
        label1.setForeground(Color.WHITE);
        frame.add(label1);
        textField.setBounds(10, 40, 270, 50);
        textField.setFont(new Font("Arial",Font.BOLD,20));
        textField.setEditable(false);
        textField.setHorizontalAlignment(JTextField.RIGHT);
        frame.add(textField);

        onRadioButton.setBounds(10, 115, 60, 40);
        onRadioButton.setSelected(true);
        onRadioButton.setFont(new Font("Arial",Font.BOLD,15));

        //onRadioButton.setText("ON");
        onRadioButton.setBackground(Color.black);
        onRadioButton.setForeground(Color.white);
        onRadioButton.setFocusable(false);
        frame.add(onRadioButton);

        offRadioButton.setBounds(10, 140, 60, 40);
        //offRadioButton.setText("OFF");
        offRadioButton.setFocusable(false);
        offRadioButton.setFont(new Font("Arial",Font.BOLD,15));
        offRadioButton.setBackground(Color.black);
        offRadioButton.setForeground(Color.white);
        frame.add(offRadioButton);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(onRadioButton);
        buttonGroup.add(offRadioButton);

        button7.setBounds(10, 230, 60, 40);
        button7.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(button7);

        button8.setBounds(80, 230, 60, 40);
        button8.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(button8);

        button9.setBounds(150, 230, 60, 40);
        button9.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(button9);

        buttonDiv.setBounds(220, 230, 60, 40);
        buttonDiv.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(buttonDiv);

        button4.setBounds(10, 280, 60, 40);
        button4.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(button4);

        button5.setBounds(80, 280, 60, 40);
        button5.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(button5);

        button6.setBounds(150, 280, 60, 40);
        button6.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(button6);

        buttonMulti.setBounds(220, 280, 60, 40);
        buttonMulti.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(buttonMulti);

        button3.setBounds(10,330, 60, 40);
        button3.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(button3);

        button2.setBounds(80, 330, 60, 40);
        button2.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(button2);

        button1.setBounds(150, 330, 60, 40);
        button1.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(button1);

        buttonMoins.setBounds(220, 330, 60, 40);
        buttonMoins.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(buttonMoins);

        button0.setBounds(10, 380, 60, 40);
        button0.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(button0);

        buttonPoint.setBounds(80, 380, 60, 40);
        buttonPoint.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(buttonPoint);

        buttonPlus.setBounds(220, 380, 60, 40);
        buttonPlus.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(buttonPlus);

        buttonEgal.setBounds(150, 380, 60, 40);
        buttonEgal.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(buttonEgal);

        buttonClear.setBounds(80, 130, 60, 40);
        buttonClear.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(buttonClear);

        buttonDelete.setBounds(150, 130, 60, 40);
        buttonDelete.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(buttonDelete);

        buttonPlusMoins.setBounds(220, 130, 60, 40);
        buttonPlusMoins.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(buttonPlusMoins);

        buttonInverse.setBounds(150, 180, 60, 40);
        buttonInverse.setFont(new Font("Arial",Font.BOLD,15));
        frame.add(buttonInverse);

        buttonPourcent.setBounds(220, 180, 60, 40);
        buttonPourcent.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(buttonPourcent);

        buttonRacine.setBounds(10, 180, 60, 40);
        buttonRacine.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(buttonRacine);

        buttonCarre.setBounds(80, 180, 60, 40);
        buttonCarre.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(buttonCarre);

        







    }
    public void addActionEvent(){
        button0.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        buttonPoint.addActionListener(this);
        buttonPlus.addActionListener(this);
        buttonMoins.addActionListener(this);
        buttonMulti.addActionListener(this);
        buttonDiv.addActionListener(this);
        buttonEgal.addActionListener(this);
        buttonClear.addActionListener(this);
        buttonDelete.addActionListener(this);
        buttonInverse.addActionListener(this);
        buttonPourcent.addActionListener(this);
        buttonRacine.addActionListener(this);
        buttonCarre.addActionListener(this);
        onRadioButton.addActionListener(this);
        offRadioButton.addActionListener(this);
        buttonPlusMoins.addActionListener(this);
    }
    
    public static void main(String[] args) {
        Calculatrice calc = new Calculatrice();
        calc.prepareGui();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source == onRadioButton){
            enable();
        }
        else if(source == offRadioButton){
            disable();
        }else if (source == buttonClear){
            label1.setText("");
            textField.setText("");
        }else if(source == buttonDelete){
            int length= textField.getText().length();
            int number = textField.getText().length()-1;
            if(length>0){
                StringBuilder back = new StringBuilder(textField.getText());
                back.deleteCharAt(number);
                textField.setText(back.toString());
            }
            if(textField.getText().endsWith("")) 
                  label1.setText("");
        }else if(source == button0){
           if(textField.getText()=="0")
                return;
            else 
                textField.setText(textField.getText()+"0");
        }else if(source==button1){
                textField.setText(textField.getText()+"1");
        }else if(source==button2){
                textField.setText(textField.getText()+"2");
        }else if(source==button3){
                textField.setText(textField.getText()+"3");
        }else if(source==button4){
                textField.setText(textField.getText()+"4");
        }else if(source==button5){
                textField.setText(textField.getText()+"5");
        }else if(source==button6){
                textField.setText(textField.getText()+"6");
        }else if(source==button7){  
                textField.setText(textField.getText()+"7");
        }else if(source==button8){
                textField.setText(textField.getText()+"8");
        }else if(source==button9){
                textField.setText(textField.getText()+"9");
        }else if(source==buttonPoint){
            if(textField.getText().contains(".")){
                return;
            }else{
                textField.setText(textField.getText()+".");
            }
        }else if(source==buttonPlus){
                String str = textField.getText();
                num1 =Double.parseDouble(str);
                calcule=1;
                textField.setText("");
                label1.setText(str+"+");
        }else if(source==buttonMoins){
            String str = textField.getText();
            num1 =Double.parseDouble(str);
            calcule=2;
            textField.setText("");
            label1.setText(str+"-");
        }else if(source==buttonMulti){
            String str = textField.getText();
            num1 =Double.parseDouble(str);
            calcule=3;
            textField.setText("");
            label1.setText(str+"*");
            
        }else if(source==buttonDiv){
            String str = textField.getText();
            num1 =Double.parseDouble(str);
            calcule=4;
            textField.setText("");
            label1.setText(str+"/");
        }else if(source==buttonPourcent){
            String str = textField.getText();
            num1 =Double.parseDouble(str);
            double pourcent=num1/100;
            textField.setText(Double.toString(pourcent));

                
        }else if(source==buttonRacine){
            String str = textField.getText();
            num1 =Double.parseDouble(str);
            if(num1<0){
                return;
            }else{
            double racine=Math.sqrt(num1);
            textField.setText(Double.toString(racine));
            }
        }else if(source==buttonCarre){  
            String str = textField.getText();
            num1 =Double.parseDouble(str);
            double carre=Math.pow(num1, 2);
            String str2=Double.toHexString(carre);
            if(str2.endsWith(".0")){
                textField.setText(str2.replace(".0",""));
            }else{
                 textField.setText(String.valueOf(carre));
            }
        }else if(source==buttonInverse){
            String str = textField.getText();
            num1 =Double.parseDouble(str);
            double inverse=1/num1;
            textField.setText(Double.toString(inverse));
        }else if(source==buttonPlusMoins){
            String str = textField.getText();
            num1 =Double.parseDouble(str);
            double plusMoins=num1*(-1);
            String str3=Double.toString(plusMoins);
            if(str3.endsWith(".0")){
                textField.setText(str3.replace(".0",""));
            }
        }else if(source==buttonEgal){
            String str = textField.getText();
            num2 =Double.parseDouble(str);
            double result=0;
            switch(calcule){
                case 1:
                    result=num1+num2;
                    break;
                case 2:
                    result=num1-num2;
                    break;
                case 3:
                    result=num1*num2;
                    break;
                case 4:
                    result=num1/num2;
                    break;
            }
            if(Double.toString(result).endsWith(".0")){
                textField.setText(Double.toString(result).replace(".0",""));
            }else{
                textField.setText(Double.toString(result));
            }
            label1.setText("");
            num1=result;

        }
    }
     
     public void enable (){
            onRadioButton.setEnabled(false);
            offRadioButton.setEnabled(true);
            textField.setEnabled(true);
            label1.setEnabled(true);
            buttonClear.setEnabled(true);
            buttonDelete.setEnabled(true);
            buttonInverse.setEnabled(true);
            buttonPourcent.setEnabled(true);
            buttonRacine.setEnabled(true);
            buttonCarre.setEnabled(true);
            buttonPoint.setEnabled(true);
            buttonPlus.setEnabled(true);
            buttonEgal.setEnabled(true);
            buttonDiv.setEnabled(true);
            buttonMulti.setEnabled(true);
            buttonMoins.setEnabled(true);
            buttonPlusMoins.setEnabled(true);

            button7.setEnabled(true);
            button8.setEnabled(true);
            button9.setEnabled(true);
            button4.setEnabled(true);
            button5.setEnabled(true);
            button6.setEnabled(true);
            button3.setEnabled(true);
            button2.setEnabled(true);
            button1.setEnabled(true);
            button0.setEnabled(true);
            
            
            
     }
    
     public void disable(){

            onRadioButton.setEnabled(true);
            offRadioButton.setEnabled(false);
            textField.setEnabled(false);
            label1.setEnabled(false);
            buttonClear.setEnabled(false);
            buttonDelete.setEnabled(false);
            buttonInverse.setEnabled(false);
            buttonPourcent.setEnabled(false);
            buttonRacine.setEnabled(false);
            buttonCarre.setEnabled(false);
            buttonPoint.setEnabled(false);
            buttonPlus.setEnabled(false);
            buttonEgal.setEnabled(false);
            buttonDiv.setEnabled(false);
            buttonMulti.setEnabled(false);
            buttonMoins.setEnabled(false);
            buttonPlusMoins.setEnabled(false);

            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button3.setEnabled(false);
            button2.setEnabled(false);
            button1.setEnabled(false);
            button0.setEnabled(false);

    }
    
    
}
