package kata3;
// 1 CLASE HistogramDisplay  se extiende ApplicationFrame
// 2 Constructor de HistogramDisplay  se invoca al constructor de la superclase y se establece un contenedor de tipo chartPanel.
// 3 método execute()  se hace visible el frame.
// 4 método JPanel()  se inserta un panel.
// 5 método createChart()  se crea un Diagrama de Barras.
// 6 método createDataSet()  se crea el conjunto de datos.
// 7, 8 CLASE KATA3  se instancia un objeto HistogramDisplay y sobre este objeto se invoca al método execute()
public class Kata3 {

    public static void main(String[] args) {
        HistogramDisplay histo = new HistogramDisplay();
        histo.execute();
    }
    
}
