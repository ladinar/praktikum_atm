
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
class tarik {
    private int saldo;
    public void ambil (int tab, int t)
    {
        if(t<1000)
            JOptionPane.showMessageDialog(null, "Mesin ATM BRI tidak menerima "
                    + "uang koin \nSilahkan ulagi Lagi", "Transaksi Gagal",tab);
        else{
            if(t>tab)
            JOptionPane.showMessageDialog(null, "Saldo anda tidak mencukupi "
                    + "\nSilahkan melakukan penyetoran", "Transaksi Gagal",tab); 
            else if(t<50000)
            JOptionPane.showMessageDialog(null, "Besaran minimal pengambilan "
                    + "tunai adalah Rp.50.000,00", "Transaksi Gagal",tab);
            else{
                saldo = tab-t;
                JOptionPane.showMessageDialog(null, "Saldo anda saat ini sebesar " 
                        + saldo);
                if (tab<50000)
                {
                    JOptionPane.showMessageDialog(null,"Saldo minimal harus RP "
                            + "50000,00 , Segera melakukan penyetoran untuk "
                            + "menghindari penutupan akun", "CAUTION", 2);
                }
            }
        }
    } 
        public int getsaldo(){
        return saldo;
    }
}
