// Fortune Teller

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.util.Scanner; 

public class FortuneTeller extends JFrame
    implements ActionListener
{
  // Declare an array of "fortunes" (strings):
  String[] fortunes = {
  "Mr.Batterink taught me: loop.", 
  "Mr.Batterink taught me: array.", 
  "Mr.Batterink taught me: def.", 
  "Mr.Batterink taught me: int.",
  "Mr.Batterink taught me: char.",
  "Mr.Batterink taught me: string.",
  "Mr.Batterink taught me: modulo.",
  "Mr.Batterink DID not taught me: memory.",
  "Mr.Batterink DID not taught me: Absact list function.",
  "Mr.Batterink DID not taught me: racket."};

  private JTextField display;//declare a JTextField
  
  public FortuneTeller()//method
  {
    super("Fortune Teller");

    //create a new JTextField
    display = new JTextField("  Press \"Next\" to see your fortune...", 30);
    //set background to white and display
    display.setBackground(Color.PINK);
    //set false to be editable
    display.setEditable(false);
    //create a new button "next"
    JButton go = new JButton("Next");
    //let the ding sound play after clicking the button next
    go.addActionListener(this);

    Container c = getContentPane();
    c.setLayout(new FlowLayout());
    c.add(display);
    c.add(go);

  }
  
  public void actionPerformed(ActionEvent e)
  {
    // Pick and display a random fortune:

    String fortune = fortunes[(int) (fortunes.length * Math.random())];

    display.setText("  " + fortune);

  }

  public static void main(String[] args)
  {
    JFrame window = new FortuneTeller();
    window.setBounds(400, 400, 400, 200);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setResizable(false);
    window.setVisible(true);
    
    System.out.println("Type 'list' to see available fortunes");
    Scanner one = new Scanner(System.in);
    String List = one.nextLine();
    if (List.equals("list"));
    {
     System.out.println("Mr.Batterink taught me: loop.");
     System.out.println("Mr.Batterink taught me: array.");
     System.out.println("Mr.Batterink taught me: def.");
     System.out.println("Mr.Batterink taught me: int.");
     System.out.println("Mr.Batterink taught me: char.");
     System.out.println("Mr.Batterink taught me: string.");
     System.out.println("Mr.Batterink taught me: modulo.");
     System.out.println("Mr.Batterink DID not taught me: memory.");
     System.out.println("Mr.Batterink DID not taught me: Absact list function.");
     System.out.println("Mr.Batterink DID not taught me: racket.");
    }
  }
}