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
  "You will be happy for today only.", 
  "You will die today.", 
  "You will find happiness.", 
  "You will find peace.",
  "You will fall in love today",
  "You will have bad luck today",
  "You will be lucky today",
  "You will be forever alone",
  "You will be sad today",
  "You will make yourself a fool"};

  private JTextField display;//declare a JTextField
  
  public FortuneTeller()//method
  {
    super("Fortune Teller");

    //create a new JTextField
    display = new JTextField("  Press \"Next\" to see your fortune...", 25);
    //set background to white and display
    display.setBackground(Color.WHITE);
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
     System.ou
