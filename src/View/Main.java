
package View;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;



/**
 *
 * @author guexa
 */
public class Main {
    
    public static void main(String[] args) {
        
        final String url = "https://developer.mozilla.org/en-US/docs/Learn/HTML/Tables/Basics";
        
        try {
            
            final Document document = Jsoup.connect(url).get();
            for(Element row : document.select
               ("table tr")){
                
                if(row.select("tr:nth-of-type(1)").text().equals("")){
                    continue;
                } else {
                    final String data = row.select("tr:nth-of-type(1)").text();
                    System.out.println("Data contained in row 1 of the table below\n" + data);
                }
            }
        
        } 
        catch (Exception e) {
            
            e.printStackTrace();   
        
        }   
    }
}
