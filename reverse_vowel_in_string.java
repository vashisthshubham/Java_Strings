
class Main {
    public static void main(String[] args) 
    {
        System.out.println("Try programiz.pro");
        
        String str = "automationn";
        char arr[] = str.toCharArray();
        
        int a = 0,b = arr.length-1;
        
        while(a<b)
        {
            if(isavowel(arr[a]) && isavowel(arr[b]))
            {
                char temp = arr[a];
                arr[a] = arr[b];
                arr[b] = temp;
                a++;
                b--;
            }
            if(!isavowel(arr[a]))
            {
                a++;
            }
            if(!isavowel(arr[b]))
            {
                b--;
            }
            
        }
        
      System.out.println(new String(arr));
    }
    
     public static boolean isavowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
        }
}
