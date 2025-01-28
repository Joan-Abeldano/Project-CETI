/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author labso20
 */
public class FileController {
    private File file;
    
    public void addLine(String newLine) throws IOException {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
            bw.write(newLine);
            bw.newLine();
        }
        catch(IOException e) {
            throw e;
        }
    }
    
    public void deleteLine(String lineToDelete) throws IOException {
        ArrayList<String> fileContent = new ArrayList<>();
        try (Scanner myReader = new Scanner(file)) {
            while (myReader.hasNextLine()) {
                String line = myReader.nextLine();
                if (!line.equals(lineToDelete)) {
                    fileContent.add(line);
                }
            }
        } catch (FileNotFoundException e) {
            throw e;
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            for (String line : fileContent) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            throw e;
        }
    }
    
    public void editLine(String oldLine, String newLine) throws IOException {
        try {
            File tempFile = new File("temp.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
            String currentLine;
            while ((currentLine = reader.readLine()) != null) {
                if (currentLine.equals(oldLine)) {
                    writer.write(newLine);
                } else {
                    writer.write(currentLine);
                }
                writer.newLine();
            }
            writer.close();
            reader.close();
        } catch (IOException e) {
            throw e;
        }
    }
    
    public ArrayList<String> read() throws FileNotFoundException {
        ArrayList<String> fileInfo = new ArrayList<>();
        try (Scanner myReader = new Scanner(file)) {
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                fileInfo.add(data);
            }
        } catch (FileNotFoundException e) {
            throw e;
        }
        return fileInfo;
    }
}
