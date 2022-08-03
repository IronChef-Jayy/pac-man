import javax.swing.JFrame;

public class Pacman extends JFrame // extend from JFrame
{

    public Pacman()
    {
        add(new Model());           // add a new model
    }



    public static void main(String[] arg)
    {
        Pacman pac = new Pacman();
        pac.setVisible(true);
        pac.setTitle("Pac-man"); 
        pac.setSize(380,420);           // size of the window
        pac.setDefaultCloseOperation(EXIT_ON_CLOSE);        // exit on close
        pac.setLocationRelativeTo(null);        // window position in middle of screen
    }
}
