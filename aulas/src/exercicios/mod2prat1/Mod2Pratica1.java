package exercicios.mod2prat1;

public class Mod2Pratica1 {
    public static void main(String[] args) {
        final int indiceTemperaturaMin = 0;
        final int indiceTemperaturaMax = 1;
        String[] paises = new String[10];
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

        int[][] minMaxTemperaturasPorCidade = {
                {-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39}, {-7, 26}, {-1, 31}, {-10, 35}
        };
        /*int minMaxTemperaturasPorCidade[][] = new int[10][2];
        minMaxTemperaturasPorCidade[0][indiceTemperaturaMin] = -2;
        minMaxTemperaturasPorCidade[0][indiceTemperaturaMax] = 33;
        minMaxTemperaturasPorCidade[1][indiceTemperaturaMin] = -3;
        minMaxTemperaturasPorCidade[1][indiceTemperaturaMax] = 32;
        minMaxTemperaturasPorCidade[2][indiceTemperaturaMin] = -8;
        minMaxTemperaturasPorCidade[2][indiceTemperaturaMax] = 27;
        minMaxTemperaturasPorCidade[3][indiceTemperaturaMin] = 4;
        minMaxTemperaturasPorCidade[3][indiceTemperaturaMax] = 37;
        minMaxTemperaturasPorCidade[4][indiceTemperaturaMin] = 6;
        minMaxTemperaturasPorCidade[4][indiceTemperaturaMax] = 42;
        minMaxTemperaturasPorCidade[5][indiceTemperaturaMin] = 5;
        minMaxTemperaturasPorCidade[5][indiceTemperaturaMax] = 43;
        minMaxTemperaturasPorCidade[6][indiceTemperaturaMin] = 0;
        minMaxTemperaturasPorCidade[6][indiceTemperaturaMax] = 39;
        minMaxTemperaturasPorCidade[7][indiceTemperaturaMin] = -7;
        minMaxTemperaturasPorCidade[7][indiceTemperaturaMax] = 26;
        minMaxTemperaturasPorCidade[8][indiceTemperaturaMin] = -1;
        minMaxTemperaturasPorCidade[8][indiceTemperaturaMax] = 31;
        minMaxTemperaturasPorCidade[9][indiceTemperaturaMin] = -10;
        minMaxTemperaturasPorCidade[9][indiceTemperaturaMax] = 35;*/

        int minimum = minMaxTemperaturasPorCidade[0][indiceTemperaturaMin];
        int maximum = minMaxTemperaturasPorCidade[0][indiceTemperaturaMax];
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
            if (minimum > minMaxTemperaturasPorCidade[i][indiceTemperaturaMin]) {
                minimum = minMaxTemperaturasPorCidade[i][indiceTemperaturaMin];
                positionMinimum = i;
            }
            if (maximum < minMaxTemperaturasPorCidade[i][indiceTemperaturaMax]) {
                maximum = minMaxTemperaturasPorCidade[i][indiceTemperaturaMax];
                positionMaximum = i;
            }
            i++;
        } while (i < minMaxTemperaturasPorCidade.length);

        System.out.println("A temperatura mais baixa foi em " + paises[positionMinimum]
                + ", com " + minimum + " graus.");
        System.out.println("A temperatura mais alta foi em " + paises[positionMaximum]
                + ", com " + maximum + " graus.");
    }
}
