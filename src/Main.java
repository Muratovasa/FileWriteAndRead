import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File dir1 = new File("/Users/svetlanapustovit/Games");
        if (dir1.mkdir()) {
            String games = "Каталог Games создан";
        }
        File dir5 = new File("/Users/svetlanapustovit/Games/temp");
        if (dir5.mkdir()) {
            String temp = "Каталог temp создан ";
        }
        File dirDir5 = new File(dir5, "temp.txt");
        try {
            if (dirDir5.createNewFile()) {
                String tempTxt = "Файл temp.txt был создан ";
                try (FileWriter writer = new FileWriter("temp.txt", true)) {
                    writer.write(tempTxt);
                    writer.flush();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        File dir2 = new File("/Users/svetlanapustovit/Games/src");
        if (dir2.mkdir()) {
            String scr = "Каталог src создан ";
        }
        File dirScr = new File("/Users/svetlanapustovit/Games/src/main");
        if (dirScr.mkdir()) {
            String main = "Каталог main создан ";
        }
        File dirScrMain = new File(dirScr, "Main.java");
        try {
            if (dirScrMain.createNewFile()) {
                String mainJava = "Файл Main.java был создан";
                try (FileWriter writer2 = new FileWriter("temp.txt", true)) {
                    writer2.write(mainJava);
                    writer2.flush();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        File dirScrMain2 = new File(dirScr, "Utils.java");
        try {
            if (dirScrMain2.createNewFile()) {
                String utils = "Файл Utils.java был создан";
                try (FileWriter writer3 = new FileWriter("temp.txt", true)) {
                    writer3.write(utils);
                    writer3.flush();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        File dirScr2 = new File("/Users/svetlanapustovit/Games/src/test");
        if (dirScr2.mkdir()) {
            String test = "Каталог test создан ";
        }
        File dir3 = new File("/Users/svetlanapustovit/Games/res");
        if (dir3.mkdir()) {
            String res = "Каталог res создан ";
        }
        File dirRes = new File("/Users/svetlanapustovit/Games/res/drawables");
        if (dirRes.mkdir()) {
            String drawables = "Каталог drawables создан ";
        }
        File dirRes2 = new File("/Users/svetlanapustovit/Games/res/vectors");
        if (dirRes2.mkdir()) {
            String vectors = "Каталог vectors создан ";
        }
        File dirRes3 = new File("/Users/svetlanapustovit/Games/res/icons");
        if (dirRes3.mkdir()) {
            String icons = "Каталог icons создан ";
        }
        File dir4 = new File("/Users/svetlanapustovit/Games/savegames");
        if (dir4.mkdir()) {
            String savegames = "Каталог savegames создан ";
        }

        try (BufferedReader br = new BufferedReader(new FileReader("temp.txt"))) {
            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
