import java.io.*;

public class Main {
    public static String name;
    public Main(String name){
        this.name=name;
    }
    @Override
    public String toString(){
        return "Каталог был создан"+name;
    }
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        File dir1 = new File("/Users/svetlanapustovit/Games");
        if (dir1.mkdir()) {
            String games = "Каталог Games создан";
        }
        File dir5 = new File("/Users/svetlanapustovit/Games/temp");
        if (dir5.mkdir()) {
            String text = "Каталог temp создан ";
        }
        File dirDir5 = new File(dir5, "temp.txt");
        try {
            if (dirDir5.createNewFile()) {
                String tempTxt= "Файл temp.txt был создан ";
                try (FileWriter writer = new FileWriter("/Users/svetlanapustovit/Games/temp/temp.txt", true)) {
                   name="temp";
                    writer.write(sb.toString());
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
            try (FileWriter writer = new FileWriter("/Users/svetlanapustovit/Games/temp/temp.txt", true)) {
                name="src";
                writer.write(sb.toString());
                writer.flush();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        File dirScr = new File("/Users/svetlanapustovit/Games/src/main");
        if (dirScr.mkdir()) {
            try (FileWriter writer = new FileWriter("/Users/svetlanapustovit/Games/temp/temp.txt", true)) {
                name="main";
                writer.write(sb.toString());
                writer.flush();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        File dirScrMain = new File(dirScr, "Main.java");
        try {
            if (dirScrMain.createNewFile()) {
                String mainJava = "Файл Main.java был создан ";
                try (FileWriter writer2 = new FileWriter("/Users/svetlanapustovit/Games/temp/temp.txt", true)) {
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
                String utils = "Файл Utils.java был создан ";
                try (FileWriter writer3 = new FileWriter("/Users/svetlanapustovit/Games/temp/temp.txt", true)) {
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
            try (FileWriter writer = new FileWriter("/Users/svetlanapustovit/Games/temp/temp.txt", true)) {
                writer.write(sb.toString());
                writer.flush();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        File dir3 = new File("/Users/svetlanapustovit/Games/res");
        if (dir3.mkdir()) {
            try (FileWriter writer = new FileWriter("/Users/svetlanapustovit/Games/temp/temp.txt", true)) {
                writer.write(sb.toString());
                writer.flush();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        File dirRes = new File("/Users/svetlanapustovit/Games/res/drawables");
        if (dirRes.mkdir()) {
            try (FileWriter writer = new FileWriter("/Users/svetlanapustovit/Games/temp/temp.txt", true)) {
                writer.write(sb.toString());
                writer.flush();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        File dirRes2 = new File("/Users/svetlanapustovit/Games/res/vectors");
        if (dirRes2.mkdir()) {
            try (FileWriter writer = new FileWriter("/Users/svetlanapustovit/Games/temp/temp.txt", true)) {
                writer.write(sb.toString());
                writer.flush();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        File dirRes3 = new File("/Users/svetlanapustovit/Games/res/icons");
        if (dirRes3.mkdir()) {
            try (FileWriter writer = new FileWriter("/Users/svetlanapustovit/Games/temp/temp.txt", true)) {
                writer.write(sb.toString());
                writer.flush();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        File dir4 = new File("/Users/svetlanapustovit/Games/savegames");
        if (dir4.mkdir()) {
            try (FileWriter writer = new FileWriter("/Users/svetlanapustovit/Games/temp/temp.txt", true)) {
                writer.write(sb.toString());
                writer.flush();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
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
