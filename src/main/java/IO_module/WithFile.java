package IO_module;

import java.io.*;
import java.util.ArrayList;

/**
 * withFile - реализует вывод/ввод через файл
 */
public class WithFile {
    public ArrayList<ArrayList<Double>> readFile(Reader user_read)  {

        ArrayList<ArrayList<Double>> eq_ptr = new ArrayList<>();
        try (BufferedReader bReader = new BufferedReader(user_read))
        {
            String str;
            String[] parts;
            double value;
            while((str=bReader.readLine())!=null)
            {
                parts = str.split(" ");
                ArrayList<Double> ptr = new ArrayList<>();
                for (int i=0;i<parts.length;i++)
                {
                    value = Double.parseDouble(parts[i]);
                    ptr.add(value);
                }
                eq_ptr.add(ptr);
            }

        }catch (IOException e)
        {
            throw new RuntimeException(e);
        }catch (NullPointerException e)
        {
            throw new NullPointerException(e.getMessage());
        }
        return eq_ptr;
    }
    public void writeFile(Writer user_write,ArrayList<Double> user_arr)  {
        try
        {
            PrintWriter printWriter = new PrintWriter(user_write);
            for (int i=0;i<user_arr.size();i++)
            {
                printWriter.print(user_arr.get(i));
                if(i<user_arr.size()-1)
                {
                    printWriter.write(" ");
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
