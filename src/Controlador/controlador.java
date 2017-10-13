/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.Ver_Chat;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
    public controlador() {
        aux=aux;
    }   
    @Override
    public void actionPerformed(ActionEvent e) {
        if(aux.getEnviar()==e.getSource()){
            String ip=null;
            try {
                ip = InetAddress.getLocalHost().getHostAddress();
            } catch (UnknownHostException ex) {
                Logger.getLogger(controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
            JPanel panel=new JPanel();
            panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
            String a="Yo: ";
            JLabel text=new JLabel(a+aux.getMensaje().getText());
            if(text.getText().equals(a)){
            }else{
            panel.setBorder(BorderFactory.createLineBorder(Color.yellow, 1, true));
            panel.add(text);
            aux.getDerecho().add(panel,BorderLayout.WEST);           
             try {
                Socket socketSalida=new Socket(ip,5555);
                DataOutputStream salida=new DataOutputStream(socketSalida.getOutputStream());
                
                salida.writeUTF(aux.getMensaje().getText());
                salida.close();
                socketSalida.close();
            } catch (IOException ex) {
                 System.out.println("Error en el puerto");           
            }               
            aux.getCentral().updateUI();
            aux.getMensaje().setText("");            
            }
        }
    }   
}