package jSoupTest;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

import org.jsoup.Connection;

public class AddrCrawler {
	public static void main(String[] args) {
		try {
            // 수집 대상 URL
            String URL = "https://oltremare.shop/index.html";
            
            // Connection 생성
            Connection conn = Jsoup.connect(URL);
 
            // HTML 파싱
            //Document html = conn.get(); // conn.post();
            
            // 파일로 읽기
            File input = new File("c://test.txt");
            Document html = Jsoup.parse(input, "UTF-8");
            
            // HTML 출력
            System.out.println(html.toString());
            
            // txt 파일로 저장. .html도 됨
//            BufferedWriter  writer = null;
//            try {
//                writer = new BufferedWriter(new FileWriter("c://test.txt"));
//                writer.write(html.toString());
//            }
//            catch (IOException e) {
//            	e.printStackTrace();
//            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}
