import javax.swing.*;

public class Calculator extends JFrame {

    public Calculator() {

        this.setTitle("Calculator");

        ImageIcon image = new ImageIcon("Calculator/src/calc.png");
        this.setIconImage(image.getImage());

        JLabel firstNumber = new JLabel("Enter the first number :");
        firstNumber.setBounds(75, 70, 250, 55);
        this.add(firstNumber);

        JTextField first_response = new JTextField();
        first_response.setBounds(235, 85, 35, 25);
        this.add(first_response);

        JLabel response = new JLabel("Enter +, -, *, / :");
        response.setBounds(75, 120, 250, 55);
        this.add(response);

        JTextField function = new JTextField();
        function.setBounds(235, 135, 35, 25);
        this.add(function);

        JLabel secondNumber = new JLabel("Enter the second number : ");
        secondNumber.setBounds(75, 170, 250, 55);
        this.add(secondNumber);

        JTextField second_response = new JTextField();
        second_response.setBounds(235, 185, 35, 25);
        this.add(second_response);

        JLabel finished = new JLabel("Final Product : ");
        finished.setBounds(75, 300, 250, 55);
        this.add(finished);

        JTextArea output = new JTextArea();
        output.setBounds(160, 320, 125, 55);
        this.add(output);
        output.setEditable(false);
        output.setSize(200,50);
        //output.setLineWrap(true);

        JButton button = new JButton("Calculate");

        button.addActionListener((e) -> {

            String getValue1 = first_response.getText();

            int parsed1 = Integer.parseInt(getValue1);

            String getValue2 = function.getText();

            String getValue3 = second_response.getText();

            int parsed2 = Integer.parseInt(getValue3);

            if (getValue2.equals("+")) {
                output.setText(parsed1 + " + " + parsed2 + " = " + (parsed1 + parsed2));
            }

            if (getValue2.equals("-")) {
                output.setText(parsed1 + " - " + parsed2 + " = " + (parsed1 - parsed2));
            }

            if (getValue2.equals("*")) {
                output.setText(parsed1 + " * " + parsed2 + " = " + parsed1 * parsed2);
            }

            if (getValue2.equals("/")) {
                output.setText(parsed1 + " / " + parsed2 + " = " + parsed1 / parsed2);
            }

        });

        button.setBounds(225, 250, 100, 40);
        this.add(button);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(600, 500);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
