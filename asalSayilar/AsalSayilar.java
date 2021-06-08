public class AsalSayilar {

    public static void main(String[] args) 
    {

        for (int i = 2 ; i<=100; i++)
        {
            //System.out.println("i : " + i);
            for (int k = 2; k<=i ; k++)
            {
                //System.out.println("k : " + k);
                if (i%k==0)
                {
                    if (i!=k)
                    {
                        break;
                    }
                    
                    else 
                    {
                        System.out.print(i + " ");
                    }
                }
                
            }

        }
        
    }

    
    
}
