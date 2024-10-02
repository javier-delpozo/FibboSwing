
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;





class FrameAction extends JFrame implements ActionListener {

          private int[]fibonacci;
          private int index;

      private JTextField text;
      private JTextField textIndex;
      private JButton buttonNext;
      private JButton buttonReset;

     FrameAction() {

         index = 0;
         fibonacci = new int [2000];
         fibonacci[0] = 0;
         fibonacci[1] = 1;

          buttonNext = new JButton("siguiente"); //creating instance of JButton
         buttonNext.setBounds(130, 200, 100, 40); //x axis, y axis, width, height
         buttonNext.addActionListener(this);

          buttonReset = new JButton("reiniciar"); //creating instance of JButton
         buttonReset.setBounds(130, 250, 100, 40); //x axis, y axis, width, height
         buttonReset.addActionListener(e -> reset());


          text = new JTextField("Número de Fibonacci: " + fibonacci[index]);
         text.setBounds(130, 150, 140, 30); //x axis, y axis, width, height


         textIndex = new JTextField("Llevamos " + (index + 1) + " numeros de Fibonacci");
        textIndex.setBounds(110, 120, 195, 30); //x axis, y axis, width, height
         


         this.add(text);    //adding text field in JFrame
         this.add(textIndex);    //adding text field in JFrame
         this.add(buttonNext);  //adding buttonNext in JFrame
         this.add(buttonReset);  //adding buttonReset in JFrame

         this.setSize(400, 500); //400 width and 500 height
         this.setLayout(null); //using no layout managers
         this.setVisible(true); //making the frame visible

     }


      // Método para actualizar los campos de texto
      private void actualizar() {
          text.setText("Fibonacci: " + fibonacci[index]);
          textIndex.setText("Llevamos " + (index + 1) + " números de Fibonacci");
      }

      private void reset() {
          index = 0;
          fibonacci[0] = 0;
          fibonacci[1] = 1;
          actualizar();
      }

     @Override
     public void actionPerformed(ActionEvent e) {
         if (index < fibonacci.length - 1) {
             index++;
             if (index >= 2) {
                 fibonacci[index] = fibonacci[index - 1] + fibonacci[index - 2];
             }
             actualizar();
         }

     }

 }

public class InterfazGrafica {
    public static void main(String[] args) {

        JFrame frame = new FrameAction(); //creating instance of JFrame
    }
}



