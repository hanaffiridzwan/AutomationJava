package com.company;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Jsoups {

    public static String getWebData(String url, String data) throws IOException {
        String description = getDescriptionData(url, data);
        String link = getlinkData(url, data);
        String price = getpriceData(url, data);


        return description;
    }

    public static String getDescriptionData(String url, String data) throws IOException {
        String classname;
        if (data == "ebay") {
            classname = "s-item__title";
        }
        else{

            classname = "a-size-medium a-color-base a-text-normal";
        }
        Document doc = Jsoup.connect(url).get();
        Elements elements = doc.getElementsByClass(classname);
        String description = elements.text();
            System.out.println(description);
//        }

        return description;
    }
    public static String getlinkData(String url, String data) throws IOException {
//        List<String> link=new ArrayList<String>();
        String classname;
        String Link = null;
        if (data == "Amazon"){
            classname = "a-link-normal a-text-normal";
        }
        else{
            classname = "s-item__link";
        }
        Document doc = Jsoup.connect(url).get();
//        Elements elements = doc.getElementsByClass(classname);
        Elements link = doc.getElementsByClass(classname);
//        System.out.println(link);
//        String Link = elements.attr("href");
//        String Link = elements.getAttribute("href");
        for (Element element : link){
            System.out.println(element.attr("href"));
            Link = element.attr("href");
        }

//        Elements elements = doc.select("a");
//        Attributes attributes  = elements.attributes();
        System.out.println(Link);
//        }

        return Link;
    }
    public static String getpriceData(String url, String data) throws IOException {
        String classname;
        if (data == "Amazon"){
            classname = "a-offscreen";
        }
        else{
            classname = "s-item__price";
        }
        Document doc = Jsoup.connect(url).get();
        Elements elements = doc.getElementsByClass(classname);
        String Price = elements.text();
        System.out.println(Price);
        return Price;
    }
}
