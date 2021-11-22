import java.util.Scanner;

class Nutella
{
    public static void main(String arg[])
    {
        int n;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Unesite broj tegli :");
        n=scanner.nextInt();

        System.out.println("Platiš "+n+" dobiješ "+brojTegli(n) + " tegli Nutelle ");
    }


    static int brojTegli(int n)
    {
        return (n/3+n);
    }
}
