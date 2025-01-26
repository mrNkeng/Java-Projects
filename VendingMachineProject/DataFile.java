import java.io.*;
import java.util.*;

public class DataFile {
    private String directory;
    private String input;

    public DataFile(String directory, String input){
        this.directory = directory;
        this.input = input;
    }

    public ArrayList<String> loadDirectory() {
        ArrayList<String> reader = new ArrayList<>();
        try (Scanner loader = new Scanner(new FileReader(directory))) {
            while (loader.hasNextLine()) {
                reader.add(loader.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + directory);
            e.printStackTrace();
        }
        return reader;
    }

    public ArrayList<Integer> loadSampleInput() {
        ArrayList<Integer> sample = new ArrayList<>();
        try (Scanner sampler = new Scanner(new FileReader(input))) {
            while (sampler.hasNextLine()) {
                if (sampler.hasNextInt()) {
                    sample.add(sampler.nextInt());
                } else {
                    sampler.nextLine(); // Skip lines that cannot be parsed as integers
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + input);
            e.printStackTrace();
        }
        return sample;
    }
}
