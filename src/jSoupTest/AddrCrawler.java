package jSoupTest;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import org.jsoup.Connection;

public class AddrCrawler {
	public static void findTag(Element element) {
		int innerTextLen = 0;
		if (element.ownText().toLowerCase().indexOf("address") != -1 || element.ownText().toLowerCase().indexOf("주소") != -1) {
			innerTextLen = element.ownText().length();
			if (innerTextLen > 10) {
				System.out.println(element.ownText());
				return;				
			} else {
				System.out.println(element.parent().ownText());
				return;
			}
		}
		
		Elements elementChildren = element.children();
		for (int i = 0; i < elementChildren.size(); i ++) {
			Element childElement = elementChildren.get(i);
			findTag(childElement);
			if (innerTextLen > 0) {
				return;
			}
		}
	}
	
	public static void main(String[] args) {
		try {
            // 수집 대상 URL            
            ArrayList<String> URLs = new ArrayList<>();
            URLs.add("https://oltremare.shop/index.html");
            URLs.add("http://mildcountry.kr/index.html");
            URLs.add("http://kicks-boutique.kr/main.html");
            URLs.add("http://festinalente.kr/");
            URLs.add("https://pddl.kr/");
            URLs.add("http://regoh.co.kr/");
            URLs.add("http://overfingers.com/");
            URLs.add("http://alive6312.cafe24.com/category/all/44/");
            URLs.add("http://thekoom.kr/");
            
            for (int i = 0; i < URLs.size(); i++) {
                // Connection 생성
                Connection conn = Jsoup.connect(URLs.get(i));
     
                // HTML 파싱
                Document doc = conn.get(); // conn.post();
                
                // 파일로 읽기
                //File input = new File("c://test.txt");
                //Document doc = Jsoup.parse(html, "UTF-8");
                
                Element footer;
                int addressIndex;
                footer = doc.getElementById("footer");
                
                if (footer == null) {
                	footer = doc.getElementsByTag("footer").first();
                }
                
                
                
                // HTML 출력
                System.out.println("* 가게 URL: " + URLs.get(i));
                
                System.out.print("파싱 완료 문자: ");
                findTag(doc);
                System.out.println();
                System.out.println("============================================================================================");
                
                // txt 파일로 저장. .html도 됨
//                BufferedWriter  writer = null;
//                try {
//                    writer = new BufferedWriter(new FileWriter("c://test.txt"));
//                    writer.write(html.toString());
//                }
//                catch (IOException e) {
//                	e.printStackTrace();
//                }
            }

            
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}
