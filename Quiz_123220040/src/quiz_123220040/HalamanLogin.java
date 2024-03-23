/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz_123220040;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author ASUS
 */
class HalamanLogin extends JFrame implements ActionListener {
   JLabel judul = new JLabel ("Halaman Login");
   JLabel user = new JLabel ("Username ");
   JLabel pass = new JLabel ("Password");
   JTextField usert = new JTextField ("");
   JTextField passt = new JTextField ("");
   JButton masuk = new JButton ("Masuk");
   HalamanLogin(){
       setVisible(true);
       setTitle("Login");
       setSize(500, 500);
       setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       setLayout(null);
       setLocationRelativeTo(null);
       
       add(judul);
       add(user);
       add(pass);
       add(usert);
       add(passt);
       add(masuk);
       
       judul.setBounds(175, 30, 300, 30);
       judul.setFont(judul.getFont().deriveFont(20f));
       
       user.setBounds(80, 80, 125, 30);
       user.setFont(user.getFont().deriveFont(12f));
       
       usert.setBounds(150, 80, 120, 30);
       usert.setFont(usert.getFont().deriveFont(12f));
       
       pass.setBounds(80, 100, 125, 30);
       pass.setFont(pass.getFont().deriveFont(12f));
       
       passt.setBounds(150, 100, 120, 30);
       passt.setFont(passt.getFont().deriveFont(12f));
       
       masuk.setBounds(170, 170, 100, 30);
       masuk.setFont(masuk.getFont().deriveFont(20f));
       
       masuk.addActionListener(this);
   }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(usert.getText().isEmpty()|| passt.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Lengkapi Form!", "Perhatian!", JOptionPane.WARNING_MESSAGE);
            return;
        }  
       
        if(e.getSource()== masuk){
            new HalamanInput() ;
        }
    }
    
}
