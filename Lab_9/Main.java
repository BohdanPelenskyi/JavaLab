import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

    private JTextField textFieldWork;
    private JTextField textFieldTime;
    private JTextField textFieldResult;

    public Main() {
        setTitle("Power Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 380, 240);
        setLayout(null);

        JLabel labelWork = new JLabel("Work A:");
        labelWork.setBounds(30, 30, 120, 20);
        add(labelWork);

        textFieldWork = new JTextField();
        textFieldWork.setBounds(180, 30, 140, 20);
        add(textFieldWork);

        JLabel labelTime = new JLabel("Time t:");
        labelTime.setBounds(30, 70, 120, 20);
        add(labelTime);

        textFieldTime = new JTextField();
        textFieldTime.setBounds(180, 70, 140, 20);
        add(textFieldTime);

        JLabel labelResult = new JLabel("Power P:");
        labelResult.setBounds(30, 110, 120, 20);
        add(labelResult);

        textFieldResult = new JTextField();
        textFieldResult.setBounds(180, 110, 140, 20);
        textFieldResult.setEditable(false);
        add(textFieldResult);

        JButton buttonCalculate = new JButton("Calculate");
        buttonCalculate.setBounds(115, 150, 130, 30);
        add(buttonCalculate);

        buttonCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double work = Double.parseDouble(textFieldWork.getText());
                    double time = Double.parseDouble(textFieldTime.getText());

                    if (time == 0) {
                        JOptionPane.showMessageDialog(
                                Main.this,
                                "Time cannot be zero.",
                                "Input error",
                                JOptionPane.ERROR_MESSAGE
                        );
                        return;
                    }

                    double power = work / time;

                    textFieldResult.setText(String.format("%.4f", power));

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(
                            Main.this,
                            "Please enter valid numbers.",
                            "Input error",
                            JOptionPane.ERROR_MESSAGE
                    );
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}