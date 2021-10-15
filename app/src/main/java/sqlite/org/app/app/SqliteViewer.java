package sqlite.org.app.app;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class SqliteViewer extends JFrame {
     public SqliteViewer(){
         super("Sqlite Viewer");
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setSize(700, 700);
         setLocationRelativeTo(null);
         sqliteView();
         setLayout(null);
         setVisible(true);
     }

    public static void main(String[] args) {
        new SqliteViewer();
    }
    public void sqliteView(){
         JTextField jTextField = new JFormattedTextField();
         jTextField.setBounds(5,10,580,30);
         Border border = BorderFactory.createLineBorder(Color.BLUE,1);
         jTextField.setBorder(border);
         add(jTextField);
         JButton jButton = new JButton("Open");
         jButton.setBounds(590,10,100,30);
         jButton.setBackground(Color.WHITE);
         jButton.setBorder(new RoundBtn(8));
         add(jButton);
    }
}
class RoundBtn implements Border {
    private final int r;
    RoundBtn(int r) {
        this.r = r;
    }
    public Insets getBorderInsets(Component c) {
        return new Insets(this.r+1, this.r+1, this.r+2, this.r);
    }
    public boolean isBorderOpaque() {
        return false;
    }
    public void paintBorder(Component c, Graphics g, int x, int y,
                            int width, int height) {
        g.drawRoundRect(x, y, width-1, height-1, r, r);
    }
}
