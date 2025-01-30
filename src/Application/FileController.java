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
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author labso20
 */
public class FileController {
    private File file;

    public FileController(File file) {
        this.file = file;
    }
    
    public void updateFile() throws IOException {
        String sql="SELECT m.rolname AS member_name FROM pg_roles r JOIN pg_auth_members am ON r.oid = am.roleid JOIN pg_roles m ON m.oid = am.member WHERE r.rolname = \'ceti\';";
        ArrayList<Map<String, Object>> nombres;
        DBController x = new DBController();
        x.setUser("adminceti");
        x.setPassword("1234");
        nombres=x.getQueryResult(sql);
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file, false))) {
            for (Map<String, Object> nombre : nombres) {
                Object y = nombre.get("member_name");
                bw.write((String) y);
                bw.newLine();
            }
        }
        catch(IOException e) {
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
