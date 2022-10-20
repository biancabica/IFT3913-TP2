import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DcMetrique {

    public static Integer nbrCommentaireFile(Path pathFile) throws IOException {

        int count = 0;
        Scanner sc = new Scanner(pathFile);
        String input;
        while (sc.hasNextLine()) {
            input = sc.nextLine();
            if (input.contains("/*")) {
                count++;
            }
            if (input.contains("//")) {
                count++;
            }
        }
        return count;

    }

    public static Integer nboflines(Path pathFile) throws IOException {
        BufferedReader buffread = new BufferedReader(new FileReader(String.valueOf(pathFile)));
        int nbloc = 0;
        String line;
        while ((line = buffread.readLine()) != null) {
            if (!line.isBlank())
                nbloc++;
        }
        return nbloc;
    }

    public static List<Path> getPathFiles(Path pathFolder) throws IOException {
        List<Path> listFilePaths;
        try (Stream<Path> stream = Files.walk(pathFolder)) {
            listFilePaths = stream.map(Path::normalize)
                    .filter(Files::isRegularFile)
                    .collect(Collectors.toList());
        }
        return listFilePaths;
    }

    public static ArrayList<String> densite (List <Path> paths) throws IOException {
        var listDensite = new ArrayList<String>();
        for (Path path : paths) {
            var cloc = nbrCommentaireFile(path);
            var loc = nboflines(path);
            var densite = cloc.doubleValue() / loc.doubleValue() ;
            listDensite.add(path +" : " + densite );
        }
        return listDensite;
    }


    public static void main(String[] args) throws IOException {
        var pathFolder = new File ("C:\\Users\\Chaima\\Desktop\\jfreechart\\src\\main\\java\\org\\jfree\\chart");
        densite(getPathFiles(pathFolder.toPath()));

    }
}
