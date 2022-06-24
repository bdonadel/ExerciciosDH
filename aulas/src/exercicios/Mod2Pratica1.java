package exercicios;

public class Mod2Pratica1 {
    public static void main(String[] args) {
        String paises[] = new String[10];
        paises[0] = "Londres";
        paises[1] = "Madrid";
        paises[2] = "Nueva York";
        paises[3] = "Buenos Aires";
        paises[4] = "Asunción";
        paises[5] = "São Paulo";
        paises[6] = "Lima";
        paises[7] = "Santigo de Chile";
        paises[8] = "Lisboa";
        paises[9] = "Tokio";

        int maxMinPorPais[][] = new int[10][2];
        maxMinPorPais[0][0] = -2;
        maxMinPorPais[0][1] = 33;
        maxMinPorPais[1][0] = -3;
        maxMinPorPais[1][1] = 32;
        maxMinPorPais[2][0] = -8;
        maxMinPorPais[2][1] = 27;
        maxMinPorPais[3][0] = 4;
        maxMinPorPais[3][1] = 37;
        maxMinPorPais[4][0] = 6;
        maxMinPorPais[4][1] = 42;
        maxMinPorPais[5][0] = 5;
        maxMinPorPais[5][1] = 43;
        maxMinPorPais[6][0] = 0;
        maxMinPorPais[6][1] = 39;
        maxMinPorPais[7][0] = -7;
        maxMinPorPais[7][1] = 26;
        maxMinPorPais[8][0] = -1;
        maxMinPorPais[8][1] = 31;
        maxMinPorPais[9][0] = -10;
        maxMinPorPais[9][1] = 35;

        int minimum = maxMinPorPais[0][0];
        int maximum = maxMinPorPais[0][1];
        int positionMinimum = 0;
        int positionMaximum = 0;

        /*for (int i = 0; i < maxMinPorPais.length; i++ ) {
            if(minimum > maxMinPorPais[i][0]) {
                minimum = maxMinPorPais[i][0];
                positionMinimum = i;
            }
            if(maximum < maxMinPorPais[i][1]) {
                maximum = maxMinPorPais[i][1];
                positionMaximum = i;
            }
        }*/

        /*int i = 0;
        while ( i < maxMinPorPais.length ) {
            if(minimum > maxMinPorPais[i][0]) {
                minimum = maxMinPorPais[i][0];
                positionMinimum = i;
            }
            if(maximum < maxMinPorPais[i][1]) {
                maximum = maxMinPorPais[i][1];
                positionMaximum = i;
            }
            i++;
        }*/

        int i = 0;
        do {
            if (minimum > maxMinPorPais[i][0]) {
                minimum = maxMinPorPais[i][0];
                positionMinimum = i;
            }
            if (maximum < maxMinPorPais[i][1]) {
                maximum = maxMinPorPais[i][1];
                positionMaximum = i;
            }
            i++;
        } while (i < maxMinPorPais.length);

        System.out.println("A temperatura mais baixa foi em " + paises[positionMinimum]
                + ", com " + minimum + " graus.");
        System.out.println("A temperatura mais alta foi em " + paises[positionMaximum]
                + ", com " + maximum + " graus.");
    }
}
