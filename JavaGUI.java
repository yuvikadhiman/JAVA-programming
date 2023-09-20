import java.awt.*;
import java.awt.event.*;

public class JavaGUI extends Frame implements ActionListener{
    
    TextField textField,textField2;
    Label label;

    JavaGUI(){
        Label label =new Label("Name");
        label.setBounds(20,50,50,25);

        textField = new TextField();
        textField.setBounds(100, 50, 200, 25);

        Label label1 =new Label("Address");
        label1.setBounds(20,100,50,25);

        textField2 = new TextField();
        textField2.setBounds(100, 100, 200, 25);

        Label label2 =new Label("Gender");
        label2.setBounds(20,150,50,25);

        CheckboxGroup checkboxGroup=new CheckboxGroup();
        Checkbox checkbox1=new Checkbox("Male",checkboxGroup,false);
        Checkbox checkbox2=new Checkbox("Female",checkboxGroup,false);
        checkbox1.setBounds(100,150,50,30);
        checkbox2.setBounds(170,150,50,30);

        
        Button button = new Button("Submit");
        button.setBounds(100, 220, 80, 30);
        button.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        add(label);
        add(label1);
        add(label2);
        add(textField);
        add(textField2);
        add(checkbox1);
        add(checkbox2);


        add(button);
        setSize(300, 300);
        setMinimumSize(new Dimension(400, 400));
        setMaximumSize(new Dimension(500, 500));
        setLayout(null);
        setVisible(true);

    }
    
    public void actionPerformed(ActionEvent e){ 
        textField.setText("");
        textField2.setText("");

    }
    public static void main(String[] args)
    {
      new JavaGUI();
    }
 
}
