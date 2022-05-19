package ru.itsjava.threads.lesson1;

public class ThreadsPractice {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());

        //      for (int i = 0; i < 10; i++) {
        //          for (int j = 0; j <2_000_000_000L ; j++) {

        //          }
        //          System.out.println("A");

        //      }

        //   for (int i = 0; i < 5; i++) {
        //       Thread.sleep(2000L);
        //       System.out.println("A");
        //   }

        //   for (int i = 0; i < 5; i++) {
        //       Thread.sleep(3000L);
        //       System.out.println("B");
        //   }

        //1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
        //  A   A   A   A    A
        //    B     B     B        B        B

    //   PrinterTread printerTreadA = new PrinterTread("A", 2000L);
    //   //    PrinterTread printerTreadB = new PrinterTread("B",3000L);

    //   PrinterRunnable printerRunnableB = new PrinterRunnable("B", 3000L);
    //   Thread threadB = new Thread(printerRunnableB);
    //   System.out.println("Start");

    //   printerTreadA.start();
    //   threadB.start();

    //   threadB.join();
    //   System.out.println("end");

        ThreadHW threadHW = new ThreadHW();
        RunnableHW runnableHW = new RunnableHW( "Ну что уже приехали?", 5000L);
        Thread thread2 = new Thread(runnableHW);

        System.out.println("Начало");

        threadHW.start();
        thread2.start();

        thread2.join();

        System.out.println("Конец");




    }
}
