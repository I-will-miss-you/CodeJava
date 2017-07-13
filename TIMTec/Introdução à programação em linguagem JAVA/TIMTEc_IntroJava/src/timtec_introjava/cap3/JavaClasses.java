/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timtec_introjava.cap3;

/**
 *
 * @author code36u4r60
 */
public class JavaClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Reader reader = new Reader();

        //Classe anónima
        /*reader.readIt(new IReadable() {
            @Override
            public String read() {
                return "Classe anónima com base na interface IReadable";
            }
        });
         */
        //Lambda Expression
        //reader.readIt(() -> "Classe anónima com base na interface IReadable");
        //
        //Usado a class Rune
        //reader.readIt(new Rune());
        //
        //Usado a class aninhada DefaultReadingMaterial
        //reader.readIt();
        reader.printIt();
    }
}

interface IReadable {

    String read();
}

class Reader {

    class DefaultReadingMaterial implements IReadable {

        @Override
        public String read() {
            return "Bula de remédio.";
        }
    }

    String text;

    public void readIt(IReadable readMaterial) {
        text = readMaterial.read();
    }

    public void readIt() {
        text = new DefaultReadingMaterial().read();
    }

    public void printIt() {
        if (text == null) {
            readIt(new DefaultReadingMaterial());
        }
        System.out.println(text);
    }
}

class Rune implements IReadable {

    @Override
    public String read() {
        return "Runes are readable too!";
    }

}
