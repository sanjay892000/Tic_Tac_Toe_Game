

     import javax.swing.*;
     import java.awt.event.*;
     import java.util.*; 
     import java.awt.*;

    class GameTask2 extends JFrame
    {
         JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,reset,exit;
         PopupFactory pf;
         Popup p;
         JOptionPane pane;
          int i=0;

          public int getI(){

            return i++;

         }
         
         GameTask2(){}

         public GameTask2(int a)
         {
             super("MYFRAME");
             setSize(600,600);
             setLocation(433,134); 
             setDefaultCloseOperation(EXIT_ON_CLOSE);
             setLayout(new GridLayout(3,3));
             setResizable(false);
         ImageIcon imgX = new ImageIcon("imgx.jpg");   
         Image x=imgX.getImage();
         Image new_imgx=x.getScaledInstance(200,200,Image.SCALE_SMOOTH);
         final ImageIcon imgx=new ImageIcon(new_imgx); 

         ImageIcon imgO = new ImageIcon("imgo.jpg");   
         Image o=imgO.getImage();
         Image new_imgo=o.getScaledInstance(200,200,Image.SCALE_SMOOTH);
         final ImageIcon imgo=new ImageIcon(new_imgo);        

            b1=new JButton("");            
            b2=new JButton("");
            b3=new JButton("");
            b4=new JButton("");
            b5=new JButton("");
            b6=new JButton("");
            b7=new JButton("");
            b8=new JButton("");
            b9=new JButton("");
            reset = new JButton(" RESET ");
            exit = new JButton(" EXIT ");
            


           add(b1);
           add(b2);
           add(b3);
           add(b4);
           add(b5);
           add(b6);
           add(b7);
           add(b8);
           add(b9);


                     final GameTask2 obj=new GameTask2();
            b1.addActionListener(new ActionListener(){

                  public void actionPerformed(ActionEvent ae){

         
                 if(b1.getIcon()==null){
               i=obj.getI();
                 if(i%2==0){
                  b1.setIcon(imgx);
                  b1.setText("X");
                  }
                 else if(i%2!=0){
                  b1.setIcon(imgo);
                  b1.setText("O");
                  }

                 
                if(b1.getText().equals(b2.getText()) && b1.getText().equals(b3.getText())){
                System.out.println(b1.getText()+"  has won. ");
                pane.showMessageDialog(obj,b1.getText()+" has won. ");
                System.exit(0);
                }
                else if(b1.getText().equals(b4.getText()) && b1.getText().equals(b7.getText())){
                System.out.println(b1.getText()+"  has won. ");
                 pane.showMessageDialog(obj,b1.getText()+" has won. ");
                System.exit(0);
                }
                else if(b1.getText().equals(b5.getText()) && b1.getText().equals(b9.getText())){
                System.out.println(b1.getText()+"  has won. ");
                pane.showMessageDialog(obj,b1.getText()+" has won. ");
                System.exit(0);
                }

                if(!b1.getText().equals("") && !b2.getText().equals("") && !b3.getText().equals("") && !b4.getText().equals("") && !b5.getText().equals("") && 
                 !b6.getText().equals("") && !b7.getText().equals("") && !b8.getText().equals("") && !b9.getText().equals("")){
                     pane.showMessageDialog(obj, "  IT'S A TIE!!!!!  ");
                     System.exit(0);
                }

                  }
            
                 }

          });



            b2.addActionListener(new ActionListener(){

                  public void actionPerformed(ActionEvent ae){



                 if(b2.getIcon()==null){
               i=obj.getI();         
 
                 if(i%2==0){
                  b2.setIcon(imgx);
                  b2.setText("X");
                  }
                 else if(i%2!=0){
                  b2.setIcon(imgo);
                  b2.setText("O");
                  }

               if(b2.getText().equals(b1.getText()) && b2.getText().equals(b3.getText())){
                  System.out.println(b2.getText()+"  has won. ");
                pane.showMessageDialog(obj,b2.getText()+" has won. ");
                System.exit(0); 
                 }
              else if(b2.getText().equals(b5.getText()) && b2.getText().equals(b8.getText())){
                   System.out.println(b2.getText()+"  has won. ");
                pane.showMessageDialog(obj,b2.getText()+" has won. ");
                System.exit(0);
                }

                if(!b1.getText().equals("") && !b2.getText().equals("") && !b3.getText().equals("") && !b4.getText().equals("") && !b5.getText().equals("") && 
                 !b6.getText().equals("") && !b7.getText().equals("") && !b8.getText().equals("") && !b9.getText().equals("")){
                     pane.showMessageDialog(obj, "  IT'S A TIE!!!!!  ");
                     System.exit(0);
                }

                 }
              }

          });



            b3.addActionListener(new ActionListener(){

                  public void actionPerformed(ActionEvent ae){
         
 
                 if(b3.getIcon()==null){
               i=obj.getI();
                 if(i%2==0){
                  b3.setIcon(imgx);
                  b3.setText("X");
                  }
                 else if(i%2!=0){
                  b3.setIcon(imgo);
                  b3.setText("O");
                  }

                  if(b3.getText().equals(b1.getText()) && b3.getText().equals(b2.getText())){
                      System.out.println(b3.getText()+"  has won. ");
                pane.showMessageDialog(obj,b3.getText()+" has won. ");
                System.exit(0);
                  }
                  else if(b3.getText().equals(b6.getText()) && b3.getText().equals(b9.getText())){
                      System.out.println(b3.getText()+"  has won. ");
                pane.showMessageDialog(obj,b3.getText()+" has won. ");
                System.exit(0);  
                  }
                  else if(b3.getText().equals(b5.getText()) && b3.getText().equals(b7.getText())){
                      System.out.println(b3.getText()+"  has won. ");
                pane.showMessageDialog(obj,b3.getText()+" has won. "); 
                System.exit(0);
                  }

                if(!b1.getText().equals("") && !b2.getText().equals("") && !b3.getText().equals("") && !b4.getText().equals("") && !b5.getText().equals("") && 
                 !b6.getText().equals("") && !b7.getText().equals("") && !b8.getText().equals("") && !b9.getText().equals("")){
                     pane.showMessageDialog(obj, "  IT'S A TIE!!!!!  ");
                     System.exit(0);
                }

                  }
                 }

          });



            b4.addActionListener(new ActionListener(){

                  public void actionPerformed(ActionEvent ae){
 
                 if(b4.getIcon()==null){
               i=obj.getI();
                 if(i%2==0){
                  b4.setIcon(imgx);
                  b4.setText("X");
                  }
                 else if(i%2!=0){
                  b4.setIcon(imgo);
                  b4.setText("O");
                  }

                if(b4.getText().equals(b1.getText()) && b4.getText().equals(b7.getText())){
                    System.out.println(b4.getText()+"  has won. "); 
                pane.showMessageDialog(obj,b4.getText()+" has won. ");
                System.exit(0); 
                  }
                else if(b4.getText().equals(b5.getText()) && b4.getText().equals(b6.getText())){
                    System.out.println(b4.getText()+"  has won. "); 
                pane.showMessageDialog(obj,b4.getText()+" has won. "); 
                System.exit(0);
                 }

                if(!b1.getText().equals("") && !b2.getText().equals("") && !b3.getText().equals("") && !b4.getText().equals("") && !b5.getText().equals("") && 
                 !b6.getText().equals("") && !b7.getText().equals("") && !b8.getText().equals("") && !b9.getText().equals("")){
                     pane.showMessageDialog(obj, "  IT'S A TIE!!!!!  ");
                     System.exit(0);
                }

                  }
                 }

          });



            b5.addActionListener(new ActionListener(){

                  public void actionPerformed(ActionEvent ae){
         
 
                 if(b5.getIcon()==null){
               i=obj.getI();
                 if(i%2==0){
                  b5.setIcon(imgx);
                  b5.setText("X");
                  }
                 else if(i%2!=0){
                  b5.setIcon(imgo);
                  b5.setText("O");
                  }

                 if(b5.getText().equals(b4.getText()) && b5.getText().equals(b6.getText())){
                    System.out.println(b5.getText()+"  has won. "); 
                pane.showMessageDialog(obj,b5.getText()+" has won. ");
                System.exit(0); 
                  }
                 else if(b5.getText().equals(b8.getText()) && b5.getText().equals(b2.getText())){
                    System.out.println(b5.getText()+"  has won. "); 
                pane.showMessageDialog(obj,b5.getText()+" has won. ");
                System.exit(0);      
                 }
                else if(b5.getText().equals(b1.getText()) && b5.getText().equals(b9.getText())){
                     System.out.println(b5.getText()+"  has won. "); 
                pane.showMessageDialog(obj,b5.getText()+" has won. "); 
                System.exit(0);   
                 }
                else if(b5.getText().equals(b3.getText()) && b5.getText().equals(b7.getText())){
                      System.out.println(b5.getText()+"  has won. ");   
                pane.showMessageDialog(obj,b5.getText()+" has won. ");
                System.exit(0); 
                 }

                if(!b1.getText().equals("") && !b2.getText().equals("") && !b3.getText().equals("") && !b4.getText().equals("") && !b5.getText().equals("") && 
                 !b6.getText().equals("") && !b7.getText().equals("") && !b8.getText().equals("") && !b9.getText().equals("")){
                     pane.showMessageDialog(obj, "  IT'S A TIE!!!!!  ");
                     System.exit(0);
                }

                  }
                 }

          });



            b6.addActionListener(new ActionListener(){

                  public void actionPerformed(ActionEvent ae){
         
 
                 if(b6.getIcon()==null){
               i=obj.getI();
                 if(i%2==0){
                  b6.setIcon(imgx);
                  b6.setText("X");
                  }
                 else if(i%2!=0){
                  b6.setIcon(imgo);
                  b6.setText("O");
                  }

                 if(b6.getText().equals(b3.getText()) && b6.getText().equals(b9.getText())){
                     System.out.println(b6.getText()+"  has won. "); 
                pane.showMessageDialog(obj,b6.getText()+" has won. "); 
                System.exit(0);  
                  }
                 else if(b6.getText().equals(b4.getText()) && b6.getText().equals(b5.getText())){
                     System.out.println(b6.getText()+"  has won. ");
                pane.showMessageDialog(obj,b6.getText()+" has won. ");
                System.exit(0);    
                  } 

                if(!b1.getText().equals("") && !b2.getText().equals("") && !b3.getText().equals("") && !b4.getText().equals("") && !b5.getText().equals("") && 
                 !b6.getText().equals("") && !b7.getText().equals("") && !b8.getText().equals("") && !b9.getText().equals("")){
                     pane.showMessageDialog(obj, "  IT'S A TIE!!!!!  ");
                     System.exit(0);
                }

                  }
                 }

          });



            b7.addActionListener(new ActionListener(){

                  public void actionPerformed(ActionEvent ae){
       
                 if(b7.getIcon()==null){
               i=obj.getI();  
 
                 if(i%2==0){
                  b7.setIcon(imgx);
                  b7.setText("X");
                  }
                 else if(i%2!=0){
                  b7.setIcon(imgo);
                  b7.setText("O");
                   }

                if(b7.getText().equals(b4.getText()) && b7.getText().equals(b1.getText())){
                     System.out.println(b7.getText()+"  has won. ");
                pane.showMessageDialog(obj,b7.getText()+" has won. "); 
                System.exit(0);   
                  }
                else if(b7.getText().equals(b8.getText()) && b7.getText().equals(b9.getText())){
                     System.out.println(b7.getText()+"  has won. ");
                pane.showMessageDialog(obj,b7.getText()+" has won. ");
                System.exit(0);
                  }
                else if(b7.getText().equals(b5.getText()) && b7.getText().equals(b3.getText())){
                     System.out.println(b7.getText()+"  has won. ");
                pane.showMessageDialog(obj,b7.getText()+" has won. ");
                System.exit(0);
                  }

                if(!b1.getText().equals("") && !b2.getText().equals("") && !b3.getText().equals("") && !b4.getText().equals("") && !b5.getText().equals("") && 
                 !b6.getText().equals("") && !b7.getText().equals("") && !b8.getText().equals("") && !b9.getText().equals("")){
                     pane.showMessageDialog(obj, "  IT'S A TIE!!!!!  ");
                     System.exit(0);
                }

                  }
                 }

          });



            b8.addActionListener(new ActionListener(){

                  public void actionPerformed(ActionEvent ae){
 
                 if(b8.getIcon()==null){
               i=obj.getI();
                 if(i%2==0){
                  b8.setIcon(imgx);
                  b8.setText("X");
                  }
                 else if(i%2!=0){
                  b8.setIcon(imgo);
                  b8.setText("O");
                  }

                 if(b8.getText().equals(b5.getText()) && b8.getText().equals(b2.getText())){
                     System.out.println(b8.getText()+"  has won. "); 
                pane.showMessageDialog(obj,b8.getText()+" has won. "); 
                System.exit(0);  
                  }
                 else if(b8.getText().equals(b7.getText()) && b8.getText().equals(b9.getText())){
                     System.out.println(b8.getText()+"  has won. "); 
                pane.showMessageDialog(obj,b8.getText()+" has won. ");
                System.exit(0);   
                  }

                if(!b1.getText().equals("") && !b2.getText().equals("") && !b3.getText().equals("") && !b4.getText().equals("") && !b5.getText().equals("") && 
                 !b6.getText().equals("") && !b7.getText().equals("") && !b8.getText().equals("") && !b9.getText().equals("")){
                     pane.showMessageDialog(obj, "  IT'S A TIE!!!!!  ");
                     System.exit(0);
                }

                  }
                 }

          });



            b9.addActionListener(new ActionListener(){

                  public void actionPerformed(ActionEvent ae){
         
 
                 if(b9.getIcon()==null){
               i=obj.getI();
                 if(i%2==0){
                  b9.setIcon(imgx);
                  b9.setText("X");
                  }
                 else if(i%2!=0){
                  b9.setIcon(imgo);
                  b9.setText("O");
                  }

                 if(b9.getText().equals(b6.getText()) && b9.getText().equals(b3.getText())){
                     System.out.println(b9.getText()+"  has won. ");
                pane.showMessageDialog(obj,b9.getText()+" has won. ");
                System.exit(0);    
                  }
                 else if(b9.getText().equals(b8.getText()) && b9.getText().equals(b7.getText())){
                     System.out.println(b9.getText()+"  has won. "); 
                pane.showMessageDialog(obj,b9.getText()+" has won. ");
                System.exit(0);   
                  }
                 else if(b9.getText().equals(b5.getText()) && b9.getText().equals(b1.getText())){
                     System.out.println(b9.getText()+"  has won. "); 
                pane.showMessageDialog(obj,b9.getText()+" has won. "); 
                System.exit(0);  
                  }

                  }

                if(!b1.getText().equals("") && !b2.getText().equals("") && !b3.getText().equals("") && !b4.getText().equals("") && !b5.getText().equals("") && 
                 !b6.getText().equals("") && !b7.getText().equals("") && !b8.getText().equals("") && !b9.getText().equals("")){
                     pane.showMessageDialog(obj, "  IT'S A TIE!!!!!  ");
                     System.exit(0);
                }

                 }

          });



 
             setVisible(true);  
         }

    }



  public class TicTacToeTask2
  {
      public static void main(String [] args)
      {       
            new GameTask2(0);
      }
  }

