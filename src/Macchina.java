public class Macchina {
    private String marca;
    private String modello;
    private int anno;
    private int prezzo;
    private int chilometri;
    private String colore;
    private String carburante;

    public Macchina(String marca, String modello, String anno, String prezzo, String chilometri, String colore, String carburante) {
        this.marca = marca;
        this.modello = modello;
        this.anno = anno;
        this.prezzo = prezzo;
        this.chilometri = chilometri;
        this.colore = colore;
        this.carburante = carburante;
    }

    public String toString() {
        return marca + " " + modello + " (" + anno + ") - " + prezzo + "€, " + chilometri + " km, " + colore + ", " + carburante;
    }
}
