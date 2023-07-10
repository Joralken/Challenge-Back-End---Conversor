import javax.swing.JOptionPane;

public class Prime {
    public static void main(String[] args) {

        Select monedas = new Select();

        Select temperaturas = new Select();

        String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opcion", "Menu",
                JOptionPane.QUESTION_MESSAGE, null, new Object[] { "Conversor de Moneda", "Conversor de Temperatura" },
                "Seleccion")).toString();

        switch (opciones) {
            case "Conversor de Moneda": {
                String input = JOptionPane.showInputDialog("Ingrese un monto a convertir");

                double valorRecibido = Double.parseDouble(input);
                monedas.ConvertirMonedas(valorRecibido);

                int seleccion = JOptionPane.showConfirmDialog(null, "Deseas realizar otra conversion?");
                if (JOptionPane.OK_OPTION == seleccion) {

                    String nuevoValor = JOptionPane.showInputDialog("Ingrese un nuevo monto a convertir");

                    double nuevoValorRecibido = Double.parseDouble(nuevoValor);
                    monedas.ConvertirMonedas(nuevoValorRecibido);
                    break;

                } else {
                    JOptionPane.showMessageDialog(null, "Programa terminado");
                    break;
                }

            }

            case "Conversor de Temperatura": {
                String input = JOptionPane.showInputDialog("Ingrese el valor de la temperatura");

                double valorRecibido = Double.parseDouble(input);
                temperaturas.ConvertirTemperaturas(valorRecibido);

                int seleccion = JOptionPane.showConfirmDialog(null, "Deseas realizar otra conversion?");
                if (JOptionPane.OK_OPTION == seleccion) {

                    String nuevoValor = JOptionPane.showInputDialog("Ingrese un nuevo valor de temperatura");

                    double nuevoValorRecibido = Double.parseDouble(nuevoValor);
                    temperaturas.ConvertirTemperaturas(nuevoValorRecibido);

                } else {
                    JOptionPane.showMessageDialog(null, "Programa terminado");
                }

            }

        }

    }
}