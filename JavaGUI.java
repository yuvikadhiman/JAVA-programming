import java.awt.*;
import java.awt.event.*;

public class JavaGUI extends Frame implements ActionListener{
    
    TextField textField;

    JavaGUI(){
        textField = new TextField();
        textField.setBounds(60, 50, 200, 25);
        
        Button button = new Button("click Here");
        button.setBounds(100, 120, 80, 30);
        button.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        add(textField);
        add(button);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);

    }
    
    public void actionPerformed(ActionEvent e){ 
        textField.setText("welcome");
    }
    public static void main(String[] args)
    {
      new JavaGUI();
    }
 
}
