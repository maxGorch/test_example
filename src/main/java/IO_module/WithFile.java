package IO_module;

import java.io.*;
import java.util.ArrayList;

/**
 * withFile - реализует вывод/ввод через файл
 */
public class WithFile {
    public ArrayList<Double> readWriteFile(Reader user_read,Writer user_write,ArrayList<Double> user_Arr)  {

        try (BufferedReader bReader = new BufferedReader(user_read);
            PrintWriter printWriter = new PrintWriter(user_write))
        {
            String[] str = bReader.readLine().split(" ");
            for (int i=0;i<user_Arr.size();i++)
            {
                user_Arr.set(i, Double.parseDouble(str[i]));
                printWriter.write(String.valueOf(user_Arr.get(i)));
                if(i<user_Arr.size()-1)
                {
                    printWriter.write(" ");
                }
            }
        }catch (IOException e)
        {
            throw new RuntimeException(e);
        }
        return user_Arr;
    }

}
