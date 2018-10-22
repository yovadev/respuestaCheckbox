
package respuestacheckbox;
import javafx.scene.control.CheckBox;
import javax.swing.*;
import javax.swing.event.*;

public class RespuestaCheckbox extends JFrame implements ChangeListener{
    private JCheckBox check1, check2, check3;
    
    public RespuestaCheckbox(){
    setLayout(null);
    check1 = new JCheckBox("Valor 1");
    check1.setBounds(10, 10, 150, 30);
    check1.addChangeListener(this);
        add(check1);
    check2 = new JCheckBox("Valor 2");
    check2.setBounds(10, 50, 150, 30);
    check2.addChangeListener(this);
     add(check2);
    check3 = new JCheckBox("Valor 3");
    check3.setBounds(10, 90, 150, 30);
    check3.addChangeListener(this);
     add(check3);
    }

    public void stateChanged(ChangeEvent ex){
    String titulo = "";
        if (check1.isSelected() == true) {
          titulo = titulo + " " + "Valor 1";  
        }
        if (check2.isSelected() == true) {
          titulo = titulo + " " + "Valor 2";  
        }
        if (check3.isSelected() == true) {
          titulo = titulo + " " + "Valor3";  
        }
        setTitle(titulo);
    }
    
    public static void main(String[] args) {
        RespuestaCheckbox ventana = new RespuestaCheckbox();
        ventana.setBounds(0, 0, 300, 200);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
