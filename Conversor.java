import javax.swing.JOptionPane;

public class Conversor {
    public void MxToDolar(double valorRecibido) {
        double dolar = valorRecibido * 0.05830;
        dolar = (double) Math.round(dolar * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + dolar + " Dolares");
    }

    public void MxToEuro(double valorRecibido) {
        double euro = valorRecibido * 0.05319;
        euro = (double) Math.round(euro * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + euro + " Euros");
    }

    public void MxToLbEster(double valorRecibido) {
        double lb = valorRecibido * 0.04547;
        lb = (double) Math.round(lb * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + lb + " Libras Esterlinas");
    }

    public void MxToYen(double valorRecibido) {
        double yen = valorRecibido * 8.30613;
        yen = (double) Math.round(yen * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes \u00A5 " + yen + " Yenes");
    }

    public void MxToWones(double valorRecibido) {
        double won = valorRecibido * 75.94180;
        won = (double) Math.round(won * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes \u20A9 " + won + " Wones");
    }

    public void DolarToMx(double valorRecibido) {
        double mx1 = valorRecibido / 0.05830;
        mx1 = (double) Math.round(mx1 * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + mx1 + " Pesos Mexicanos");
    }

    public void EuroToMx(double valorRecibido) {
        double mx2 = valorRecibido / 0.05319;
        mx2 = (double) Math.round(mx2 * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + mx2 + " Pesos Mexicanos");
    }

    public void LbEsterToMx(double valorRecibido) {
        double mx3 = valorRecibido / 0.04547;
        mx3 = (double) Math.round(mx3 * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + mx3 + " Pesos Mexicanos");
    }

    public void YenToMx(double valorRecibido) {
        double mx4 = valorRecibido / 8.30613;
        mx4 = (double) Math.round(mx4 * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + mx4 + " Pesos Mexicanos");
    }

    public void WonesToMx(double valorRecibido) {
        double mx5 = valorRecibido / 75.94180;
        mx5 = (double) Math.round(mx5 * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + mx5 + " Pesos Mexicanos");
    }
}