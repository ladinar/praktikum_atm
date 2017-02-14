
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Smktelkom
 */
public class setor {
    private int saldo;
    public void kirim (int tab, int m){
        if (m%100!=0) 
            JOptionPane.showMessageDialog(null,"Mesin ATM BRI tidak menerima uang koin\\n Silahkan ulangi kembali"
                    , "Transaksi Gagal",0);
        else if (m<50000) 
   JOptionPane.showMessageDialog(null,"Minimal setor Rp.50000");
        else if (m>=50000) {
            saldo = tab+m;
            JOptionPane.showMessageDialog(null, "Saldo Anda saat ini sebesar : "+saldo);
            
        }
    }
    public int getsaldo(){
        return saldo;
    }
}