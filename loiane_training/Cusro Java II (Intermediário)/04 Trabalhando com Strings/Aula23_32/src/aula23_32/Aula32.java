
package aula23_32;

import java.util.StringTokenizer;

/**
 *
 * @author code36u4r60
 */
public class Aula32 {

    public static void main(String[] args) {

        String doArquivo = "1;Antônio;30;";

        StringTokenizer st = new StringTokenizer(doArquivo, ";");

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

    }

}
