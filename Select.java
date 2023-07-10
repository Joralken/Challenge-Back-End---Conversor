import javax.swing.*;

public class Select {

    Conversor monedas = new Conversor();
    Temperatura temperaturas = new Temperatura();

    public void ConvertirMonedas(double valorRecibido) {
        String opcion = (JOptionPane.showInputDialog(null, "Elige una moneda a la que deseas convertir tu dinero",
                "Monedas", JOptionPane.PLAIN_MESSAGE, null,
                new Object[] { "De Pesos Mexicanos a Dolar", "De Pesos Mexicanos a Euro", "De Pesos Mexicanos a Libras Esterlinas",
                        "De Pesos Mexicanos a Yenes", "De Pesos Mexicanos a Wones", "De Dolar a Pesos Mexicanos",
                        "De Euro a Pesos Mexicanos", "De Libra Esterlina a Pesos Mexicanos", "De Yen a Pesos Mexicanos",
                        "De Won a Pesos Mexicanos" },
                "Seleccion")).toString();

        switch (opcion) {
            case "De Pesos Mexicanos a Dolar":
                monedas.MxToDolar(valorRecibido);
                break;
            case "De Pesos Mexicanos a Euro":
                monedas.MxToEuro(valorRecibido);
                break;
            case "De Pesos Mexicanos a Libras Esterlinas":
                monedas.MxToLbEster(valorRecibido);
                break;
            case "De Pesos Mexicanos a Yenes":
                monedas.MxToYen(valorRecibido);
                break;
            case "De Pesos Mexicanos a Wones":
                monedas.MxToWones(valorRecibido);
                break;
            case "De Dolar a Pesos Mexicanos":
                monedas.DolarToMx(valorRecibido);
                break;
            case "De Euro a Pesos Mexicanos":
                monedas.EuroToMx(valorRecibido);
                break;
            case "De Libra Esterlina a Pesos Mexicanos":
                monedas.LbEsterToMx(valorRecibido);
                break;
            case "De Yen a Pesos Mexicanos":
                monedas.YenToMx(valorRecibido);
                break;
            case "De Won a Pesos Mexicanos":
                monedas.WonesToMx(valorRecibido);
                break;

        }

    }

    public void ConvertirTemperaturas(double valorRecibido) {
        String opcion = (JOptionPane.showInputDialog(null, "Elige una temperatura a convertir",
                "Temperaturas", JOptionPane.PLAIN_MESSAGE, null,
                new Object[] { "De Celsius a Fahrenheit", "De Fahrenheit a Celsius" },
                "Seleccion")).toString();

        switch (opcion) {
            case "De Celsius a Fahrenheit":
                temperaturas.ConvertirCelsiusAFahrenheith(valorRecibido);
                break;
            case "De Fahrenheit a Celsius":
                temperaturas.ConvertirFahrenheithACelsius(valorRecibido);
                break;

        }

    }
}