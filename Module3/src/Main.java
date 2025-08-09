import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) throws UserException {
        String path1 = System.getProperty("java.class.path") + "\\Songs.txt";  // берется из out/production

        write(path1, "Wang Chung - Fire in the Twilight\nKarla DeVito - " +
                "We Are not alone\nOzzy Osbourne - Slow Down\n");
        String t = read(path1);
    }

    public static String read(String path, Boolean outputConclusion) throws UserException {
        System.out.println("\nЧтение из файла: " + path);
        try{
            String s = Files.readString(Paths.get(path));
            System.out.println("Чтение прошло успешно ");
            if (outputConclusion)
                System.out.println(s);
            return s;
        }
        catch (FileNotFoundException | NoSuchFileException e){
            throw new UserException("Файл не найден", e);
        }
        catch (AccessDeniedException e){
            throw new UserException("Отказ операции файловой системой (проверьте атрибуты файла)", e);
        }
        catch (IOException e){
            throw new UserException("Проблема ввода-вывода", e);
        }
    }

    public static String read(String path) throws UserException {
        return read(path, true);
    }

    public static void write(String path, String text) throws UserException {
        System.out.println("\nЗапись в файл: " + path);
        try{
            Files.write(Paths.get(path), text.getBytes(), StandardOpenOption.WRITE);
            System.out.println("Запись прошла успешно");
        }
        catch (FileNotFoundException | NoSuchFileException e){
            throw new UserException("Файл не найден", e);
        }
        catch (AccessDeniedException e){
            throw new UserException("Отказ операции файловой системой (проверьте атрибуты файла)", e);
        }
        catch (IOException e){
            throw new UserException("Проблема ввода-вывода", e);
        }
    }
}
