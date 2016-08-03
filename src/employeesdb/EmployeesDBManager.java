package employeesdb;

import java.awt.Dimension;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class EmployeesDBManager {

    public static void main(String[] args) throws IOException, URISyntaxException {
        
        // Set main image icon
        Image img = ImageIO.read(new File(EmployeesDBManager.class.getResource("/recources/main_icon.png").toURI()));
        // Set main frame
        JFrame f = new JFrame("EmployeesDB Manager");
        f.setIconImage(img);
        f.setSize(800, 500);
        f.setMinimumSize(new Dimension(800, 500));
        // Set master detail form
        NewMasterDetailForm nmdf = new NewMasterDetailForm();
        f.add(nmdf);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

}
