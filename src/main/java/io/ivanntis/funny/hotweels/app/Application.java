package io.ivanntis.funny.hotweels.app;

import io.ivanntis.funny.hotweels.th.Scraping;
import java.io.IOException;

public class Application {
  public static void main(String[] args ) {
    try {
      Scraping.connectPage();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
