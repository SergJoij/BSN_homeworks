import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) throws UserException {
        String path1 = System.getProperty("java.class.path") + "\\Songs.txt";  // ������� �� out/production

        write(path1, "Wang Chung - Fire in the Twilight\nKarla DeVito - " +
                "We Are not alone\nOzzy Osbourne - Slow Down\n");
        String t = read(path1);
    }

    public static String read(String path, Boolean outputConclusion) throws UserException {
        System.out.println("\n������ �� �����: " + path);
        try{
            String s = Files.readString(Paths.get(path));
            System.out.println("������ ������ ������� ");
            if (outputConclusion)
                System.out.println(s);
            return s;
        }
        catch (FileNotFoundException | NoSuchFileException e){
            throw new UserException("���� �� ������", e);
        }
        catch (AccessDeniedException e){
            throw new UserException("����� �������� �������� �������� (��������� �������� �����)", e);
        }
        catch (IOException e){
            throw new UserException("�������� �����-������", e);
        }
    }

    public static String read(String path) throws UserException {
        return read(path, true);
    }

    public static void write(String path, String text) throws UserException {
        System.out.println("\n������ � ����: " + path);
        try{
            Files.write(Paths.get(path), text.getBytes(), StandardOpenOption.WRITE);
            System.out.println("������ ������ �������");
        }
        catch (FileNotFoundException | NoSuchFileException e){
            throw new UserException("���� �� ������", e);
        }
        catch (AccessDeniedException e){
            throw new UserException("����� �������� �������� �������� (��������� �������� �����)", e);
        }
        catch (IOException e){
            throw new UserException("�������� �����-������", e);
        }
    }
}
