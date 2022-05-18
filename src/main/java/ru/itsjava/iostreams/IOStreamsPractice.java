package ru.itsjava.iostreams;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOStreamsPractice {
    public static void main(String[] args) {
        //   BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        //   try {
        //       String input = console.readLine();
        //       System.out.println("Ваш инпут равен " + input);
        //   } catch (IOException e) {
        //       e.printStackTrace();
        //   } finally {
        //       try {
        //           console.close();
        //       } catch (IOException e) {
        //           e.printStackTrace();
        //       }
        //   }


        ;
        //   //try with resources
        //   try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in))) {
        //       String input = console.readLine();
        //       System.out.println("Ваш инпут равен " + input);
        //   } catch (IOException e) {
        //       e.printStackTrace();
        //   }

        //      File file = new File("src/main/resources/file.txt");

        //      try (PrintWriter printWriter = new PrintWriter(file)) {
        //          printWriter.println("Строка1");
        //          printWriter.println("Строка2");
        //          printWriter.println("Строка3");
        //      } catch (FileNotFoundException fileNotFoundException) {
        //          fileNotFoundException.printStackTrace();
        //      }


        //      try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
        //          String input;
        //          while ((input = reader.readLine()) != null) {
        //              System.out.println("reader.readLine() = " + input);
        //          }
        //      } catch (IOException exception) {
        //          exception.printStackTrace();
        //      }

        //  }

        File file1 = new File("src/main/resources/file1.txt");
        try (PrintWriter printWriter = new PrintWriter(file1)) {
            printWriter.println("Гарри ты волшебник!");
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        List<String> file1Containment = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file1))) {
            while (reader.readLine() != null) {
                file1Containment.add("Гарри ты волшебник!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(file1Containment);

        File file2 = new File("src/main/resources/file2.txt");
        try (PrintWriter printWriter = new PrintWriter(file2)) {
            printWriter.println("Проснись Гарри, пора на работу!");

        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        List<String> file2Containment = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file2))) {
            while (reader.readLine() != null) {
                file2Containment.add("Проснись Гарри, пора на работу!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(file2Containment);


        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("src/main/resources/file2.txt");
            fileWriter.write(String.valueOf(file1Containment));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        FileWriter fileWriter1 = null;
        try {
            fileWriter1 = new FileWriter("src/main/resources/file1.txt");
            fileWriter1.write(String.valueOf(file2Containment));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter1.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}

