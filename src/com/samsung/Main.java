package com.samsung;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in=new Scanner(System.in);
        String action;
        while (true){
	        action=in.nextLine();
            switch (action){
                case "read":
                    System.out.println("Enter path");
                    String path=in.nextLine();
                    File file=new File(path);
                    if (file.exists()){
                        System.out.println("FileExist");
                        InputStreamReader in1 = new FileReader(path);
                        BufferedReader inputStream=new BufferedReader(in1);
                        StringBuilder str=new StringBuilder();
                        String line;
                        while((line=inputStream.readLine())!=null){
                            str.append(line);
                            str.append("\n");
                        }
                        System.out.println(str);

                    }
                    else{
                        System.out.println("FileNotExist");
                        break;
                    }
                    break;

                case "create":
                    System.out.println("Enter path");
                    path=in.nextLine();
                    file=new File(path);
                    file.createNewFile();
                    break;
                case "list":
                    System.out.println("Enter path");
                    path=in.nextLine();
                    file=new File(path);
                    if (file.exists()){
                        System.out.println(Arrays.toString(file.list()));
                    }
                    else {
                        System.out.println("Wrong path");
                    }
                case "add":
                    System.out.println("Enter path");
                    path=in.nextLine();
                    file = new File(path);
                    System.out.println("Enter position");
                    int n=in.nextInt();
                    if(file.exists()){
                        InputStreamReader inq = new FileReader(path);
                        BufferedReader inputStream=new BufferedReader(inq);
                        StringBuilder str=new StringBuilder();
                        String line="";
                        int counter=0;
                        while(line!=null){
                            line=inputStream.readLine();
                            counter++;
                            if (counter==n){

                            }else{
                                str.append(line);
                                str.append("\n");
                            }
                        }
                    }
                    else{
                        System.out.println("Wrong path");
                    }
                        break;
                case "delete":
                    System.out.println("Enter path");
                    path=in.nextLine();
                    file = new File(path);
                    if (file.exists()){}
                    else {
                        System.out.println("Wrong path");
                    }
                    break;
                case "deleteFile":
                    System.out.println("Enter path");
                    path=in.nextLine();
                    file = new File(path);
                    if (file.exists()) {
                        file.delete();
                    }
                    else {
                        System.out.println("Wrong path");
                    }
            }

        }
    }
}
