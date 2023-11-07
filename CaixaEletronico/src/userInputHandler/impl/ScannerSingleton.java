package userInputHandler.impl;

import java.util.Scanner;

public final class ScannerSingleton {

  private static Scanner sc = null;

  private ScannerSingleton(){}

  public static synchronized Scanner getInstance(){
    if(sc == null){
      sc = new Scanner(System.in);
    }
    return sc;
  }

  public static void closeInstance(){
    if (sc != null) {
      sc.close();
      sc = null;
    }
  }
}
