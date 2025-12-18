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
                        dati[0],
                        dati[1],
                        dati[2],
                        dati[3],
                        dati[4],
                        dati[5],
                        dati[6]
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
