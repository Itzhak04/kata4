package Ulpgc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TsvFileLoaderChampion implements LoaderChampion{
    private final File file;

    public TsvFileLoaderChampion(File file) {
        this.file = file;
    }

    @Override
    public List<Champion> load() {
        try {
            return load(new FileReader(file));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private List<Champion> load(FileReader reader) throws IOException {
        return load(new BufferedReader(reader));
    }

    private List<Champion> load(BufferedReader reader) throws IOException {
        reader.skip(1);
        List<Champion> result= new ArrayList<>();
        while (true){
            String line= reader.readLine();
            if (line==null)return result;
            result.add(toChampion(line));
        }
    }

    private Champion toChampion(String line) {
        return toChampion(line.split(","));
    }

    private Champion toChampion(String[] line) {
        return new Champion(
          line[0],
        line[1],
        line[2],
        line[3],
        line[4],
        line[5],
        line[6],
        line[7],
        line[8],
        line[9],
        line[10]
        );
    }
}
