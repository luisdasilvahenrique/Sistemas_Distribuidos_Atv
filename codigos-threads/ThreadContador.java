/*
* Java em Rede
* Daniel Gouveia Costa
*
* Exemplo 3.2
*
*/


public class ThreadContador
{
    public static void main (String entrada[])
    {
        Contadora c = new Contadora();
        new Thread(c).start();
    }
}

class Contadora implements Runnable
{

    static int contador = 0;

    public void run ()
    {
        //Contar de 1 at� 10
        while (contador++ < 10)
        {
            System.out.println ("Valor da variavel contador: " + contador);
            try
            {
                Thread.sleep (500 * (int)(Math.random()*5 + 1));
            }
            catch (InterruptedException exc)
            {
                exc.printStackTrace();
            }
        }
        System.out.println("Final da contagem.");
    }
}
