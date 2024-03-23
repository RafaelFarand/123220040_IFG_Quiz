/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz_123220040;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author ASUS
 */
class HalamanInput  extends JFrame implements ActionListener{
   JLabel judul = new JLabel ("HALAMAN INPUT NILAI");
   JLabel nama = new JLabel ("nama");
   JLabel kelas = new JLabel ("kelas ");
   JLabel tk = new JLabel ("Tipe Kelas");
   JLabel nt = new JLabel ("Nilai Tugas");
   JLabel nq = new JLabel ("Nilai Quiz");
   JTextField namat = new JTextField ("");
   JTextField kelast = new JTextField ("");
   JLabel matkul = new JLabel ("Matkul");
   JTextField ntt = new JTextField ("");
   JTextField nqt = new JTextField ("");
   JButton submit = new JButton ("Masuk");
   JButton logout = new JButton ("Masuk");
   JRadioButton teo = new JRadioButton ("Kelas Teori");
   JRadioButton prak = new JRadioButton ("Kelas Praktikum");
   JRadioButton pbo= new JRadioButton ("PBO");
   JRadioButton scpk = new JRadioButton ("SCPK");
   JRadioButton algo = new JRadioButton ("Algo Lanjut");
    HalamanInput(){
       setVisible(true);
       setTitle("Input Page");
       setSize(500, 500);
       setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       setLayout(null);
       setLocationRelativeTo(null);
        
       ButtonGroup pilihan1 = new ButtonGroup();
       pilihan1.add(prak);
       pilihan1.add(teo);
      
       
       ButtonGroup pilihan2 = new ButtonGroup();
       pilihan2.add(pbo);
       pilihan2.add(scpk);
       pilihan2.add(algo);
        
       add(judul);
       add(nama);
       add(kelas);
       add(nt);
       add(nq);
       add(namat);
       add(judul);
       add(kelast);
       add(matkul);
       add(ntt);
       add(nqt);
       add(submit);
       add(logout);
       add(pbo);
       add(scpk);
       add(algo);
       add(tk);
       add(prak);
       add(teo);
       
      judul.setBounds(200,30,300,30);
      nama.setBounds(30,60,100,30);
      namat.setBounds(30,80,300,30);
      kelas.setBounds(30,100,100,30);
      kelast.setBounds(30,120,300,30);
      tk.setBounds(30,140,140,30);
      prak.setBounds(30,160,150,30);
      teo.setBounds(200,160,150,30);
      matkul.setBounds(30,180,140,30);
      pbo.setBounds(30,200,150,30);
      scpk.setBounds(100,200,100,30);
      algo.setBounds(240,200,150,30);
      nt.setBounds(30,220,100,30);
      ntt.setBounds(30,240,100,30);
      nq.setBounds(30,260,100,30);
      nqt.setBounds(30,280,100,30);
      submit.setBounds(100,320,100,30);
      logout.setBounds(180,320,100,30);
      
    namat.addActionListener(this);
    kelast.addActionListener(this);
    prak.addActionListener(this);
    teo.addActionListener(this);
    pbo.addActionListener(this);
    scpk.addActionListener(this);
    algo.addActionListener(this);
    ntt.addActionListener(this);
    nqt.addActionListener(this);
       
       
       
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(namat.getText().isEmpty() || kelast.getText().isEmpty()|| prak.getText().isEmpty()|| teo.getText().isEmpty()|| pbo.getText().isEmpty()|| scpk.getText().isEmpty() || algo.getText().isEmpty()|| ntt.getText().isEmpty()|| nqt.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Lengkapi Form!", "Perhatian!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
       
        if(e.getSource()== logout){
            new HalamanLogin() ;
        }
        
    }
    
}
