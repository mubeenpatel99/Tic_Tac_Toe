import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/** 
    *@author Mubeen Patel
*/

/**
    created on December 05 2018 Wed .
*/

class tictac extends JFrame implements ActionListener
{
    Container c;
    JButton b0=new JButton("Play Again.");
    JButton b1=new JButton("");
    JButton b2=new JButton("");
    JButton b3=new JButton("");
    JButton b4=new JButton("");
    JButton b5=new JButton("");
    JButton b6=new JButton("");
    JButton b7=new JButton("");
    JButton b8=new JButton("");
    JButton b9=new JButton("");
    JButton start=new JButton("Start");
    JLabel l1=new JLabel("Player 1 (X): ");
    JLabel l2=new JLabel("Player 2 (O): ");
    JTextField t1=new JTextField();
    JTextField t2=new JTextField();
    JLabel l3=new JLabel("");

    public static boolean player1Turn = true;
    public static boolean player2Turn = false;
    public static boolean player1Won = false;
    public static boolean player2Won = false;
    int flag=0;

    public tictac()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);

        /* give the position to the buttons */
        l3.setBounds(50,110,100,25);
        t1.setBounds(175,50,100,25);
        t2.setBounds(175,75,100,25);
        l1.setBounds(50,50,100,25);
        l2.setBounds(50,75,100,25);
        b1.setBounds(50,150,50,50);
        b2.setBounds(125,150,50,50);
        b3.setBounds(200,150,50,50);
        b4.setBounds(50,200,50,50);
        b5.setBounds(125,200,50,50);
        b6.setBounds(200,200,50,50);
        b7.setBounds(50,250,50,50);
        b8.setBounds(125,250,50,50);
        b9.setBounds(200,250,50,50);
        b0.setBounds(100,315,100,50);
        start.setBounds(175,110,100,25);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        start.addActionListener(this);

        /* adding buttons to container */

        c.add(b1);
		c.add(b2);
		c.add(b3);
		c.add(b4);
		c.add(b5);
		c.add(b6);
		c.add(b7);
		c.add(b8);
		c.add(b9);
        c.add(l1);
        c.add(l2);
        c.add(t1);
        c.add(t2);
        c.add(b0);
        c.add(l3);
        c.add(start);

        Cursor cur=new Cursor(Cursor.HAND_CURSOR);

        b1.setCursor(cur);
		b2.setCursor(cur);
        b3.setCursor(cur);
        b4.setCursor(cur);
        b5.setCursor(cur);
        b6.setCursor(cur);
        b7.setCursor(cur);
        b8.setCursor(cur);
        b9.setCursor(cur);
        b0.setCursor(cur);
        start.setCursor(cur);

    }// constructor

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1){
            if(player1Turn == true){
                l3.setText(""+t2.getText()+"'s Turn !");
                b1.setText("X");
                checkforwin();
                player1Turn = false;
                ++flag; 
                b1.setEnabled(false);
            }
            else{
                l3.setText(""+t1.getText()+"'s Turn !");
                b1.setText("O");
                checkforwin();
                player1Turn = true;
                ++flag; 
                b1.setEnabled(false);
            }
        } // button 1

        if(e.getSource()==b2){
            if(player1Turn == true){
                l3.setText(""+t2.getText()+"'s Turn !");
                b2.setText("X");
                checkforwin();
                player1Turn = false;
                ++flag; 
                b2.setEnabled(false);
            }
            else{
                l3.setText(""+t1.getText()+"'s Turn !");
                b2.setText("O");
                checkforwin();
                player1Turn = true;
                ++flag; 
                b2.setEnabled(false);
            }
        } // button 2

        if(e.getSource()==b3){
            if(player1Turn == true){
                l3.setText(""+t2.getText()+"'s Turn !");
                b3.setText("X");
                checkforwin();
                player1Turn = false;
                ++flag; 
                b3.setEnabled(false);
            }
            else{
                l3.setText(""+t1.getText()+"'s Turn !");
                b3.setText("O");
                checkforwin();
                player1Turn = true;
                ++flag; 
                b3.setEnabled(false);
            }
        } // button 3

        if(e.getSource()==b4){
            if(player1Turn == true){
                l3.setText(""+t2.getText()+"'s Turn !");
                b4.setText("X");
                checkforwin();
                player1Turn = false;
                ++flag; 
                b4.setEnabled(false);
            }
            else{
                l3.setText(""+t1.getText()+"'s Turn !");
                b4.setText("O");
                checkforwin();
                player1Turn = true;
                ++flag; 
                b4.setEnabled(false);
            }
        } // button 4

        if(e.getSource()==b5){
            if(player1Turn == true){
                l3.setText(""+t2.getText()+"'s Turn !");
                b5.setText("X");
                checkforwin();
                player1Turn = false;
                ++flag; 
                b5.setEnabled(false);
            }
            else{
                l3.setText(""+t1.getText()+"'s Turn !");
                b5.setText("O");
                checkforwin();
                player1Turn = true;
                ++flag; 
                b5.setEnabled(false);
            }
        } // button 5

        if(e.getSource()==b6){
            if(player1Turn == true){
                l3.setText(""+t2.getText()+"'s Turn !");
                b6.setText("X");
                checkforwin();
                player1Turn = false;
                ++flag; 
                b6.setEnabled(false);
            }
            else{
                l3.setText(""+t1.getText()+"'s Turn !");
                b6.setText("O");
                checkforwin();
                player1Turn = true;
                ++flag; 
                b6.setEnabled(false);
            }
        } // button 6

        if(e.getSource()==b7){
            if(player1Turn == true){
                l3.setText(""+t2.getText()+"'s Turn !");
                b7.setText("X");
                checkforwin();
                player1Turn = false;
                ++flag; 
                b7.setEnabled(false);
            }
            else{
                l3.setText(""+t1.getText()+"'s Turn !");
                b7.setText("O");
                checkforwin();
                player1Turn = true;
                ++flag; 
                b7.setEnabled(false);
            }
        } // button 7

        if(e.getSource()==b8){
            if(player1Turn == true){
                l3.setText(""+t2.getText()+"'s Turn !");
                b8.setText("X");
                checkforwin();
                player1Turn = false;
                ++flag; 
                b8.setEnabled(false);
            }
            else{
                l3.setText(""+t1.getText()+"'s Turn !");
                b8.setText("O");
                checkforwin();
                player1Turn = true;
                ++flag; 
                b8.setEnabled(false);
            }
        } // button 8

        if(e.getSource()==b9){
            if(player1Turn == true){
                l3.setText(""+t2.getText()+"'s Turn !");
                b9.setText("X");
                checkforwin();
                player1Turn = false;
                ++flag; 
                b9.setEnabled(false);
            }
            else{
                l3.setText(""+t1.getText()+"'s Turn !");
                b9.setText("O");
                checkforwin();
                player1Turn = true;
                ++flag; 
                b9.setEnabled(false);
            }
        } // button 9

        if(e.getSource()==b0)
        {
            clear();
            enable_button();
            flag=0;
            player1Turn = true;
            player2Turn = false;
            player1Won = false;
            player2Won = false;
            l3.setText("");
        }

        if(e.getSource()==start)
        {
            l3.setText(""+t1.getText()+"'s Turn !");
            start.setEnabled(false);
        }

        if(flag == 9)
        {
            draw();
        }
    }// end of action performed.

    public void checkforwin()
    {
        if(b1.getText().equals("X")){
            if(b4.getText().equals("X")){
                if(b7.getText().equals("X")){
                    player1Won =true;
                    player2Won =false;
                    l3.setText(""+t1.getText()+" Won !");
                    disable_button();
                }
            }
        }// end of case 1 of win

        if(b1.getText().equals("X")){
            if(b5.getText().equals("X")){
                if(b9.getText().equals("X")){
                    player1Won = true;
                    player2Won = false;
                    l3.setText(""+t1.getText()+" Won !");
                    disable_button();
                }
            }
        }// end of case 2 of win

        if(b1.getText().equals("X")){
            if(b2.getText().equals("X")){
                if(b3.getText().equals("X")){
                    player1Won = true;
                    player2Won = false;
                    l3.setText(""+t1.getText()+" Won !"); 
                    disable_button();
                }
            }
        }// end of case 3 of win

        if(b3.getText().equals("X")){
            if(b5.getText().equals("X")){
                if(b7.getText().equals("X")){
                    player1Won = true;
                    player2Won = false;
                    l3.setText(""+t1.getText()+" Won !");
                    disable_button();
                }
            }
        }// end of case 4 of win

        if(b3.getText().equals("X")){
            if(b6.getText().equals("X")){
                if(b9.getText().equals("X")){
                    player1Won = true;
                    player2Won = false;
                    l3.setText(""+t1.getText()+" Won !");
                    disable_button();
                }
            }
        }// end of case 5 of win

        if(b7.getText().equals("X")){
            if(b8.getText().equals("X")){
                if(b9.getText().equals("X")){
                    player1Won = true;
                    player2Won = false;
                    l3.setText(""+t1.getText()+" Won !");
                    disable_button();
                }
            }
        }// end of case 6 of win

        if(b4.getText().equals("X")){
            if(b5.getText().equals("X")){
                if(b6.getText().equals("X")){
                    player1Won = true;
                    player2Won = false;
                    l3.setText(""+t1.getText()+" Won !");
                    disable_button();
                }
            }
        }// end of case 6 of win

        if(b2.getText().equals("X")){
            if(b5.getText().equals("X")){
                if(b8.getText().equals("X")){
                    player1Won = true;
                    player2Won = false;
                    l3.setText(""+t1.getText()+" Won !");
                    disable_button();
                }
            }
        }// end of case 8 of win
        if(b1.getText().equals("O")){
            if(b4.getText().equals("O")){
                if(b7.getText().equals("O")){
                    player1Won =true;
                    player2Won =false;
                    l3.setText(""+t2.getText()+" Won !");
                    disable_button();
                }
            }
        }// end of case 1 of win

        if(b1.getText().equals("O")){
            if(b5.getText().equals("O")){
                if(b9.getText().equals("O")){
                    player1Won = false;
                    player2Won = true;
                    l3.setText(""+t2.getText()+" Won !");
                    disable_button();
                }
            }
        }// end of case 2 of win

        if(b1.getText().equals("O")){
            if(b2.getText().equals("O")){
                if(b3.getText().equals("O")){
                    player1Won = false;
                    player2Won = true;
                    l3.setText(""+t2.getText()+" Won !");
                    disable_button();
                }
            }
        }// end of case 3 of win

        if(b3.getText().equals("O")){
            if(b5.getText().equals("O")){
                if(b7.getText().equals("O")){
                    player1Won = false;
                    player2Won = true;
                    l3.setText(""+t2.getText()+" Won !");
                    disable_button();
                }
            }
        }// end of case 4 of win

        if(b3.getText().equals("O")){
            if(b6.getText().equals("O")){
                if(b9.getText().equals("O")){
                    player1Won = false;
                    player2Won = true;
                    l3.setText(""+t2.getText()+" Won !");
                    disable_button();
                }
            }
        }// end of case 5 of win

        if(b7.getText().equals("O")){
            if(b8.getText().equals("O")){
                if(b9.getText().equals("O")){
                    player1Won = false;
                    player2Won = true;
                    l3.setText(""+t2.getText()+" Won !");
                    disable_button();
                }
            }
        }// end of case 6 of win

        if(b4.getText().equals("O")){
            if(b5.getText().equals("O")){
                if(b6.getText().equals("O")){
                    player1Won = false;
                    player2Won = true;
                    l3.setText(""+t2.getText()+" Won !");
                    disable_button();
                }
            }
        }// end of case 6 of win

        if(b2.getText().equals("O")){
            if(b5.getText().equals("O")){
                if(b8.getText().equals("O")){
                    player1Won = false;
                    player2Won = true;
                    l3.setText(""+t2.getText()+" Won !");
                    disable_button();
                }
            }
        }// end of case 8 of win
    }

    public void clear()
    {
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        t1.setText("");
        t2.setText("");
        l3.setText("");
    }

    public void disable_button()
    {
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        b7.setEnabled(false);
        b8.setEnabled(false);
        b9.setEnabled(false);
    }

    public void enable_button()
    {
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);
        start.setEnabled(true);
    }

    public void draw()
    {
        disable_button();
        l3.setText("****DRAW****");
    }

}// class tictac

class tictactoe{
    public static void main(String args[])
    {
        tictac ob= new tictac();
        ob.setVisible(true);
		ob.setBounds(100,100,325,450);
		ob.setTitle("Tic Tac Toe.exe");
        ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }// end of main
}// end of class