/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.Ver_Chat;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/**
 *
 * @author Canaima1
 */
public class controlador implements ActionListener{
    Ver_Chat aux;

    public controlador(Ver_Chat aux) {
        this.aux = aux;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(aux.getEnviar()==e.getSource()){
            JPanel panel=new JPanel();
            panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
            JLabel text=new JLabel("Yo: "+aux.getMensaje().getText());
            panel.setBorder(BorderFactory.createLineBorder(Color.yellow, 5, true));
            panel.add(text);
            aux.getCentral().add(panel);
            aux.getCentral().updateUI();
            aux.getMensaje().setText("");
        }
    }
    
    
}
