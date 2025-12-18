import java.io.*;
class Main {
        public static void main(String[] args) throws IOException {
            Macchina[] macchine = new Macchina[10]; // array per 10 macchine
            int conta = 0;

            BufferedReader br = new BufferedReader(new FileReader("macchine.csv"));
            String riga;

            while ((riga = br.readLine()) != null && conta < 10) {
                String[] dati = riga.split(",");
                macchine[conta] = new Macchina(
                        dati[0],          // marca
                        dati[1],          // modello
                        Integer.parseInt(dati[2]), // anno
                        Integer.parseInt(dati[3]), // prezzo
                        Integer.parseInt(dati[4]), // chilometri
                        dati[5],          // colore
                        dati[6]           // carburante
                );
                conta++;
            }
            br.close();

            // Stampa con toString() per verifica
            for (int i = 0; i < conta; i++) {
                System.out.println(macchine[i].toString());
            }
        }
    }
