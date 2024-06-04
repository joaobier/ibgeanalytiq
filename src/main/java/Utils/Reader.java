package Utils;
import java.io.*;

public class Reader {



    static
    {
        String filePath = "C:\\Users\\Aluno\\Desktop\\csv\\copia.csv";
        BufferedReader reader = null;
        String line = "";

        try
        {
            reader = new BufferedReader(new FileReader(filePath));
            while((line = reader.readLine()) != null){
                String[] row = line.split(";");

                for(int j = 0; j < row.length; j++){
                    row[j] = row[j].replace(".","").replace(",",".").trim();
                    System.out.println(row[j]);
                }

            }
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {

        }
    }



}
