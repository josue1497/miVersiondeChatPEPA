/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.controlador;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author Canaima1
 */
public class Ver_Chat extends JFrame{
    
    JPanel derecho, izquierdo, Cabecera, pie, central;
    JLabel mensaje_entrante, mensaje_saliente;
    JScrollPane scrol1,scrol2;
    JButton enviar;
    JTextField mensaje;
        
    public Ver_Chat(){
        this.setTitle("Cliente 1");
        this.setSize(300, 400);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        vista();
        control();
    }
    
    public void vista(){
        Container c=getContentPane();
        
        C_derecho();
        C_cabecera();
        C_pie();
        
        c.add(Cabecera, BorderLayout.NORTH);
        c.add(central, BorderLayout.CENTER);
        c.add(pie, BorderLayout.SOUTH);       
    }
    public void control(){
    controlador c1=new controlador(this);
    enviar.addActionListener(c1);
    }
    
    public void C_derecho(){
        central=new JPanel();
        central.setLayout(new BoxLayout(central,BoxLayout.Y_AXIS));
        /*derecho=new JPanel();
        derecho.setLayout(new BoxLayout(derecho,BoxLayout.Y_AXIS));
        izquierdo=new JPanel();
        izquierdo.setLayout(new BoxLayout(izquierdo,BoxLayout.Y_AXIS));
        mensaje_entrante=new JLabel("hola");
        mensaje_saliente=new JLabel("como estas");
        
        scrol1=new JScrollPane();
        scrol2=new JScrollPane();
        
        scrol1.setViewportView(mensaje_entrante);
        //scrol1.setHorizontalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrol2.setViewportView(mensaje_saliente);
        
        derecho.add(scrol1);
        izquierdo.add(scrol2);
        
        central.add(derecho);
        central.add(izquierdo); */      
        
    }
    
    public void C_cabecera(){
        
        Cabecera=new JPanel(new GridLayout());
        
        JLabel titulo=new JLabel("Titulo");
        
        Cabecera.add(titulo);
        
    
    }
    
    public void C_pie(){
        
        pie=new JPanel(new GridLayout(1,3));
        JLabel titulo=new JLabel("Titulo");
        
        mensaje=new JTextField();
        enviar=new JButton("Enviar");
        
        pie.add(titulo);
        pie.add(mensaje);
        pie.add(enviar);
        
        
    }

    public JPanel getDerecho() {
        return derecho;
    }

    public void setDerecho(JPanel derecho) {
        this.derecho = derecho;
    }

    public JPanel getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(JPanel izquierdo) {
        this.izquierdo = izquierdo;
    }

    public JPanel getCabecera() {
        return Cabecera;
    }

    public void setCabecera(JPanel Cabecera) {
        this.Cabecera = Cabecera;
    }

    public JPanel getPie() {
        return pie;
    }

    public void setPie(JPanel pie) {
        this.pie = pie;
    }

    public JPanel getCentral() {
        return central;
    }

    public void setCentral(JPanel central) {
        this.central = central;
    }

    public JLabel getMensaje_entrante() {
        return mensaje_entrante;
    }

    public void setMensaje_entrante(JLabel mensaje_entrante) {
        this.mensaje_entrante = mensaje_entrante;
    }

    public JLabel getMensaje_saliente() {
        return mensaje_saliente;
    }

    public void setMensaje_saliente(JLabel mensaje_saliente) {
        this.mensaje_saliente = mensaje_saliente;
    }

    public JScrollPane getScrol1() {
        return scrol1;
    }

    public void setScrol1(JScrollPane scrol1) {
        this.scrol1 = scrol1;
    }

    public JScrollPane getScrol2() {
        return scrol2;
    }

    public void setScrol2(JScrollPane scrol2) {
        this.scrol2 = scrol2;
    }

    public JButton getEnviar() {
        return enviar;
    }

    public void setEnviar(JButton enviar) {
        this.enviar = enviar;
    }

    public JTextField getMensaje() {
        return mensaje;
    }

    public void setMensaje(JTextField mensaje) {
        this.mensaje = mensaje;
    }
    
    
}