
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
class tranf {
    private int saldo;
    public void menabung (int tab, int s)
    {
        if(s<1000)
            JOptionPane.showMessageDialog(null, "Mesin ATM BRI tidak menerima "
                    + "uang koin \n Silahkan Ulangi Kembali !", 
                    "Transaksi Gagal",tab);
        else if(s<50000)
            JOptionPane.showMessageDialog(null, "Besaran minimal transfer tunai "
                    + "adalah Rp.50.000,00", "ERROR",saldo);
        else if(s>=50000)
            saldo = tab-s;
            JOptionPane.showMessageDialog(null, "Saldo anda saat ini sebesar : "
                    + saldo);
    }

    public int getsaldo(){
        return saldo;
    }
}
