package io.ivanntis.funny.hotweels.th;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Scraping {

  public static void connectPage() throws IOException {
    Document doc = Jsoup.connect("http://www.hwtreasure.com/treasure-hunt-checklist/").get();
    getYears(doc);
  }

  public static void getYears(Document doc ){
    Elements newsHeadlines = doc.select(".checklist").select("h3").select("a");
    for (Element headline : newsHeadlines) {
      System.out.println("salida a" +
        headline.attr("href")+"------"+headline.childNode(0));
    }
  }

}
