public class Macchina {
    private String marca;
    private String modello;
    private int anno;
    private int prezzo;
    private int chilometri;
    private String colore;
    private String carburante;

    public Macchina(String marca, String modello, int anno, int prezzo, int chilometri, String colore, String carburante) {
        this.marca = marca;
        this.modello = modello;
        this.anno = anno;
        this.prezzo = prezzo;
        this.chilometri = chilometri;
        this.colore = colore;
        this.carburante = carburante;
    }

    @Override
    public String toString() {
        return String.format(marca, modello, anno, prezzo, chilometri, colore, carburante);
    }
}
