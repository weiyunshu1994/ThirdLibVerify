package opencsv;

import com.opencsv.*;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
//    public static void main(String[] args) {
//        writeCsv();
//    }

    /**
     * 写数据
     */
    public static void writeCsv() {
        String myPath = "opencsv/csvouttest.csv";
        String[] data1 = {"姓名", "性别", "年龄"};
        String[] data2 = {"云天明", "男", "17"};
        String[] data3 = {"韩菱纱", "女", "16"};

        //将数据放到列表里面
        List<String[]> datas = new ArrayList();
        datas.add(data1);
        datas.add(data2);
        datas.add(data3);

        //将内容输入到文件
        try (CSVWriter writer = new CSVWriter(Files.newBufferedWriter(Paths.get(myPath), StandardCharsets.UTF_8),
                CSVWriter.DEFAULT_SEPARATOR,
                CSVWriter.NO_QUOTE_CHARACTER,
                CSVWriter.NO_ESCAPE_CHARACTER,
                CSVWriter.DEFAULT_LINE_END)) {
            //写数据到文件
            writer.writeAll(datas);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 读取一个csv文件
     */
    public static void readCsv() {
        String mypath = ".\\csvouttest.csv";
        //以","作为解析的分隔符
        CSVParser csvParser = new CSVParserBuilder().withSeparator(',').build();
        //使用try(){}catch()这种语法资源会自动关闭不需要自己finally里关闭资源，推荐使用
        try (CSVReader readerCsv = new CSVReaderBuilder(Files.newBufferedReader(Paths.get(mypath), StandardCharsets.UTF_8)).withCSVParser(csvParser).withSkipLines(1).build()) {
            String lines[];
            while ((lines = readerCsv.readNext()) != null) {
                Arrays.asList(lines).forEach(System.out::println);
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (CsvValidationException e) {
            throw new RuntimeException(e);
        }
    }


}