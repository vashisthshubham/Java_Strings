
import java.util.HashSet;
class Main 
{
    public static void main(String[] args) 
    {
        
        System.out.println("Try programiz.pro");
        String str = "automation";
        
        StringBuilder sb = new StringBuilder(str);
        
        HashSet<Character> set = new HashSet<>();
        
        System.out.println(sb);
        
        for(int i=0;i<=str.length()-1;i++)
        {
            if(!set.contains(str.charAt(i)))
            {
                set.add(str.charAt(i));
            }
            else
            {
                System.out.println("non-repeating char: "+str.charAt(i));
                break;
            }
        
        }
        
        
    }
}



