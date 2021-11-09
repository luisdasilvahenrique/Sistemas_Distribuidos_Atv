/*
* Java em Rede
* Daniel Gouveia Costa
*
* Exemplo 3.3
*
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ThreadDesenho extends JFrame
{
    public ThreadDesenho()
    {
        super ("Ponto gr�fico.");
        setBounds(350, 250, 270, 290);
        Quadro quadro = new Quadro(Color.blue);
        getContentPane().add (quadro);
        quadro.repaint();
        setVisible(true);              
    }
    public static void main (String args[])
    {
        ThreadDesenho desenho = new ThreadDesenho();
        desenho.addWindowListener( new WindowAdapter ()
        {
            public void windowClosing (WindowEvent evento)
            {
                System.exit (0);
            }
        });              
    }    
}

class Ponto extends Thread
{

    Quadro quadro;
    int x, y;
    int contador = 0;

    public Ponto (Quadro qq)
    {
        quadro = qq;
        x = 0;
        y = 0;
    }
    public void run ()
    {
        public void calculaTotalRecebido(){
    //Recebe aproximadamente 70mil registros.
    List<HistoricoRecebimento> recebidos = getListRecebimentos();
    Integer soma = 0;

    for(HistoricoRecebimento h1: recebidos){
      soma = soma + recebidos.getValorRecebido();
    }

    Integer porcentagemImposto = getReajusteAtualFromWebService();

    soma = soma + ((porcentagemImposto/100)*soma);

    retornaParaWebServiceValorTotal(soma);
  }
        }
    }


class Quadro extends JPanel
{

    int x, y;
    Color cor;

    public Quadro(Color cc)
    {
        repaint();
        cor = cc;
        x = 0;
        y = 0;
        Ponto ponto = new Ponto(this);
        ponto.start();
    }
    public void paintComponent(Graphics g)
    {     
        super.paintComponent(g);      
        g.setColor (cor);
        g.fillOval (x, y, 10, 10);
  
    }
    public void alterarValores (int posicaox, int posicaoy)
    {
        x = posicaox;
        y = posicaoy;
    }
}
        

