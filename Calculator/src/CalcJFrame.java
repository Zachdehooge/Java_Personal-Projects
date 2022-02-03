import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcJFrame extends JFrame {

    public CalcJFrame(){

        setTitle("Calculator");

        ImageIcon image = new ImageIcon("Calculator/src/calc.png");
        setIconImage(image.getImage());

        JLabel firstNumber = new JLabel("Enter the first number :");
        firstNumber.setBounds(75, 70, 250, 55);
        add(firstNumber);

        JTextField first_response = new JTextField();
        first_response.setBounds(235, 85, 35, 25);
        add(first_response);

        JLabel response = new JLabel("Enter +, -, *, / :");
        response.setBounds(75, 120, 250, 55);
        add(response);

        JTextField function = new JTextField();
        function.setBounds(235, 135, 35, 25);
        add(function);

        JLabel secondNumber = new JLabel("Enter the second number : ");
        secondNumber.setBounds(75, 170, 250, 55);
        add(secondNumber);

        JTextField second_response = new JTextField();
        second_response.setBounds(235, 185, 35, 25);
        add(second_response);

        JLabel finished = new JLabel("Final Product : ");
        finished.setBounds(75, 300, 250, 55);
        add(finished);

        JTextArea output = new JTextArea();
        output.setBounds(160, 320, 125, 55);
        add(output);
        output.setEditable(false);

        JButton button = new JButton("Calculate");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String getValue1 = first_response.getText();
                int parsed1 = Integer.parseInt(getValue1);

                String getValue2 = function.getText();

                String getValue3 = second_response.getText();
                int parsed2 = Integer.parseInt(getValue3);

                if(getValue2.equals("+")){
                    System.out.println(parsed1 + " + " + parsed2 + " = " + (parsed1 + parsed2));
                }

                if(getValue2.equals("-")){
                    System.out.println(parsed1 + " - " + parsed2 + " = " + (parsed1 - parsed2));
                }

                if(getValue2.equals("*")){
                    System.out.println(parsed1 + " * " + parsed2 + " = " + (parsed1 * parsed2));
                }

                if(getValue2.equals("/")){
                    System.out.println(parsed1 + " / " + parsed2 + " = " + (parsed1 / parsed2));
                }
            }
        });

        button.setBounds(225, 250, 100, 40);
        add(button);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 500);


        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);

    }

    public static void main(String[] args){
        new CalcJFrame();
    }
}
