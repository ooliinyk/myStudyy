package com.taskForSoftheme;

import java.io.*;


public class Task1 {

    public static String PATH_INPUT= "C:\\Users\\user\\Desktop\\myStudyy\\src\\main\\resources\\input";
    public static String PATH_OUTPUT= "C:\\Users\\user\\Desktop\\myStudyy\\src\\main\\resources\\output";

    public static String read(String fileName) throws FileNotFoundException {
        //Этот спец. объект для построения строки
        StringBuilder sb = new StringBuilder();

        File file = new File(fileName);
        if (!file.exists()){
            throw new FileNotFoundException(file.getName());
        }

        try {
            //Объект для чтения файла в буфер
            BufferedReader in = new BufferedReader(new FileReader( file.getAbsoluteFile()));
            try {
                //В цикле построчно считываем файл
                String s;
                while ((s = in.readLine()) != null) {
                    sb.append(s);
                    sb.append("\n");
                }
            } finally {
                //Также не забываем закрыть файл
                in.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }

        //Возвращаем полученный текст с файла
        return sb.toString();
    }

    public static void write(String fileName, String text) {
        //Определяем файл
        File file = new File(fileName);

        try {
            //проверяем, что если файл не существует то создаем его
            if(!file.exists()){
                file.createNewFile();
            }

            //PrintWriter обеспечит возможности записи в файл
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());

            try {
                //Записываем текст у файл
                out.print(text);
            } finally {
                //После чего мы должны закрыть файл
                //Иначе файл не запишется
                out.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void find() throws FileNotFoundException {

        String sss=read(PATH_INPUT);

        int count=0;
        for (int i = 0; i < sss.length(); i++) {
            if(sss.charAt(i)=='1'){
                count++;
            }
        }

        write(PATH_OUTPUT, Integer.toString(count));
        System.out.println(count);




    }

    public static void main(String[] args) throws FileNotFoundException {

        Task1.find();


    }
}
