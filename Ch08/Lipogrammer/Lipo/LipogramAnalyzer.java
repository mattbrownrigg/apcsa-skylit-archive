

/**
 * Write a description of class LipogramAnalyzer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;

public class LipogramAnalyzer
{
    String str;
    public LipogramAnalyzer(String text)
    {
        str = text;
    }
    
    public String mark(char letter)
    {
        String replaceChar = String.valueOf(letter);
        return str.replaceAll(replaceChar, "#");
        
    }
    
    public String allWordsWith(char letter)
    {
        String res = "";
        //String temp = "";
        ArrayList<String> lipo = new ArrayList<String>();
        //int si = 2;
        for(int i = 0; i < str.length(); i++)
        {
            //temp = extract(letter, i);
            lipo.add(extract(letter, i));
            //String replaceChar = String.valueOf(letter);
            //str.split(replaceChar);
        }
        //System.out.println(lipo);
        for(int m = 0; m <= lipo.size(); m++)
        {
            for(int j = 0; j < lipo.size(); j++)
            {
                for(int k = j + 1; k < lipo.size(); k++)
                {
                    if(lipo.get(j).equals(lipo.get(k)))
                        lipo.remove(k);
                
                    }
                }
            }   
        //System.out.println(lipo);
        for(int p = 0; p < lipo.size(); p++)
        {
            res += lipo.get(p) + "\n";
        }
        return res;
    }
    
    private String extract(char letter, int number)
    {
        int begin = 0;
        int end = 0;
        int search = str.indexOf(letter, number);
        char spos = ' ';
        char epos = ' ';
        //System.out.println("S val = " + search + str.charAt(search));
        for(int s = search; s >= 0; s--)
        {
            spos = str.charAt(s);
            if(Character.isWhitespace(spos))
            {
                begin = s+1;
                break;
            }
            else if(s == 0)
            {
                begin = 0;
            }
        }
        //System.out.println(str.charAt(begin));
            
        for(int e = search; e < str.length(); e++)
        {
            //System.out.print(str.charAt(e));
            epos = str.charAt(e);
            //System.out.println("Epos val = " + epos);
            //System.out.println("E val = " + e + str.charAt(e));
            //System.out.println(epos);
            if(Character.isWhitespace(epos))
            {
                 end = e;
                 break;
            }
            else if(e == str.length()-1)
            {
                 end = str.length();
            }
            
        }
        //System.out.println(begin);
        //System.out.println(end);
        return str.substring(begin, end);
    }
}
