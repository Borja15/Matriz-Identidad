
package identidad;

/**
 *
 * @author Usuario
 */
public class Identidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int TAM = 4;
        int[][] identidad = new int[TAM][TAM];
        //CARGAR
        for(int x=0;x<4;x++){
            identidad[x][x]=1;
        }
        //MOSTRAR
        for(int fila=0; fila<identidad.length; fila++) {
            for(int columna=0; columna<TAM; columna++) {
        System.out.print(identidad[fila][columna]+" ");
        }
        //Salto de línea 
        System.out.println();
        }
    }
}
