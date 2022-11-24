public class BoyerMoore{

    static int totalChar = 256;

    static int max (int a, int b) {
        if(a>b)
           return a;
        else 
           return b;
    }

    static void badCharRule(char str[],int size,int badchar[])
    {
        for (int i = 0; i < totalChar; i++)
            badchar[i] = -1;

        for (int i = 0; i < size; i++)
            badchar[(int) str[i]] = i;
    }

    static boolean search(char txt[],char pat[])
    {
       int m = pat.length;
       int n = txt.length;
 
       int badchar[] = new int[totalChar];

       badCharRule(pat, m, badchar);
 
      int index = 0;  
      while(index <= (n - m))
      {
          int j = m-1;
          while(j >= 0 && pat[j] == txt[index+j])
                j--;
 
          if (j < 0)
            {
                for(int i=0;i<m;i++){
                    System.out.printf("%c",pat[i]);
                }
                System.out.println(" Pattern occur at Index Value = " + index);
                index += (index+m < n)? m-badchar[txt[index+m]] : 1;
                return true;
            }
 
          else
                index += max(1, j - badchar[txt[index+j]]);
      
       }
       return false;
    }
 
}