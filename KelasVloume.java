import javax.swing.JOptionPane;

public class KelasVloume {
    public static void main(String[] args) {
        double panjangBalok = 2;
        double lebarBalok = 3;
        double tinggiBalok = 4;

        double sisiKubus = 5;

        double jariJariTabung = 6;
        double tinggiTabung = 7;

        String input = JOptionPane.showInputDialog("Masukkan pilihan Anda (1-3):");
        int pilihan = Integer.parseInt(input);

        double volume = 0;

        switch (pilihan) {
            case 1:
                volume = panjangBalok * lebarBalok * tinggiBalok;
                JOptionPane.showMessageDialog(null, "Volume Balok: " + volume);
                break;
            case 2:
                volume = Math.pow(sisiKubus, 3);
                JOptionPane.showMessageDialog(null, "Volume Kubus: " + volume);
                break;
            case 3:
                volume = Math.PI * Math.pow(jariJariTabung, 2) * tinggiTabung;
                JOptionPane.showMessageDialog(null, "Volume Tabung: " + volume);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Pilihan tidak valid!");
        }
    }
}
