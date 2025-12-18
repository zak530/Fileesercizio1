import java.io.*;
class Main {
        public static void main(String[] args)
                throws IOException {
            Macchina[] macchine = new Macchina[10];
            int conta = 0;

            BufferedReader br = new BufferedReader(new FileReader("macchine.csv"));
            String riga;

            while ((riga = br.readLine()) != null && conta < 10) {
                String[] dati = riga.split(",");
                macchine[conta] = new Macchina(
                        dati[0],
                        dati[1],
                        dati[2],
                        Integer.parseInt(dati[3]),
                        Integer.parseInt(dati[4]),
                        dati[5],
                        dati[6]
                );
                conta++;
            }
            br.close();

            for (int i = 0; i < conta; i++) {
                System.out.println(macchine[i].toString());
            }
        }
    }
