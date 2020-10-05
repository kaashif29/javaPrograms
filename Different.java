//This Program Returns Multple Values

/*class Example
{
    public String name;
    public String location;

    public String[] getExample()
    {
        String arr[] = new String[2];

        arr[0] = name;
        arr[1] = location;

        return arr;
    }
}
class Different
{
    public static void main(String args[])
    
}*/

import java.util.Scanner;

class Different
{
    public static void main(String[] args)
    {

        Scanner scan =  new Scanner(System.in);

        int a = scan.nextInt();
        scan.close();
        int count = 0,temp;
        temp = a;

        while(temp != 0)
        {
            // num = num/10
            temp /= 10;
            ++count;
        }
        String s =String.format("%03d",count);
        System.out.println("NUm: "+a+"  count: "+s);


    }
}