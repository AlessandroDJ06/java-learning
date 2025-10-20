package ExtraUitdaging;

import java.awt.*;
import java.awt.event.*;

public class BasicCalculatorAWT extends Frame implements ActionListener {

    private TextField display;
    private String currentInput = "";
    private double result = 0;
    private String operator = "";


    private final String[] buttons = {
            "7","8","9","/",
            "4","5","6","*",
            "1","2","3","-",
            "0",".","=","+"
    };

    public BasicCalculatorAWT() {
        setLayout(new BorderLayout());


        display = new TextField();
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.BOLD, 24));
        add(display, BorderLayout.NORTH);


        Panel buttonPanel = new Panel();
        buttonPanel.setLayout(new GridLayout(4,4,5,5));

        for (String label : buttons) {
            Button b = new Button(label);
            b.setFont(new Font("Arial", Font.BOLD, 24));
            b.addActionListener(this);
            buttonPanel.add(b);
        }

        add(buttonPanel, BorderLayout.CENTER);


        setTitle("Rekenmachine");
        setSize(300, 400);
        setVisible(true);


        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }


    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        if ("0123456789.".contains(cmd)) {
            currentInput += cmd;
            display.setText(currentInput);
        } else if (cmd.equals("=")) {
            calculate();
            display.setText(String.valueOf(result));
            currentInput = "";
            operator = "";
        } else { // + - * /
            if (!currentInput.isEmpty()) {
                calculate();
            }
            operator = cmd;
            currentInput = "";
        }
    }

    private void calculate() {
        double inputNumber = currentInput.isEmpty() ? 0 : Double.parseDouble(currentInput);

        switch (operator) {
            case "":   result = inputNumber; break; // first input
            case "+":  result += inputNumber; break;
            case "-":  result -= inputNumber; break;
            case "*":  result *= inputNumber; break;
            case "/":  result /= inputNumber; break;
        }
    }

    public static void main(String[] args) {
        new BasicCalculatorAWT();
    }
}
