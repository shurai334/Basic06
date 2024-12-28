package free;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class index2 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("使用方法: プログラム実行時に入力文字列を指定して下さい。");
            return;
        }
        
        String originalString = args[0];
        String inputFileName = "src/free/index.java";
        String outputFileName = "src/free/output.java";


        try {
            
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName));
            writer.write(originalString);
            writer.newLine();
            writer.close();

            BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
            writer = new BufferedWriter(new FileWriter(outputFileName));

            String line;
            while ((line = reader.readLine()) != null) {
                String processedLine = processLine(line);
                writer.write(processedLine);
                writer.newLine();
            }

            reader.close();
            writer.close();

            System.out.println("入力文字列: " + originalString);
            System.out.println("反転された文字列; " + processLine(originalString));;
            System.out.println("index.javaとoutput.javaが正常に処理されました。");
            
        } catch (IOException e) {
            System.out.println("ファイル操作中にエラーが発生しました: " + e.getMessage());
        }
    }

    public static String processLine(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}

