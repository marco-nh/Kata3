package kata3;
// 1 CLASE HistogramDisplay  se extiende ApplicationFrame
// 2 Constructor de HistogramDisplay  se invoca al constructor de la superclase y se establece un contenedor de tipo chartPanel.
// 3 método execute()  se hace visible el frame.
// 4 método JPanel()  se inserta un panel.
// 5 método createChart()  se crea un Diagrama de Barras.
// 6 método createDataSet()  se crea el conjunto de datos.
// 7, 8 CLASE KATA3  se instancia un objeto HistogramDisplay y sobre este objeto se invoca al método execute()

// 1 CLASE Histogram
// 2 Se define un mapa de clave genérica y valores enteros.
// 3 método get()  para el mapa, se devuelve el valor correspondiente a una clave.
// 4 método keySet()  devuelve el conjunto de claves del mapa.
// 5 método increment()  se rellena el mapa.
// 6 CLASE HistogramDisplay
// se crea una variable global de tipo Histogram
// 7, 8 se modifica constructor  se pasa como parámetro un objeto Histogram y dentro del constructor se hace referencia a este objeto.
// 9 método dataSet()  se reemplazan todos los métodos addValue por uno solo dentro un bucle
// 10, 11, 12 CLASE Kata3  se instancia un objeto Histogram y sobre este objeto se llama al método increment(). Se invoca al método execute()
public class Kata3 {

    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<String>();
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("a.es");
        histogram.increment("a.es");
        new HistogramDisplay(histogram).execute();
    }
    
}
