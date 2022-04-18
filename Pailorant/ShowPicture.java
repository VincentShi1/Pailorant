import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
class ShowPicture {
 public void picture() {
  JFrame frame = new JFrame();
  ImageIcon icon = new ImageIcon("valorant-database-maps-split.png");
  JLabel label = new JLabel(icon);
  frame.add(label);
  frame.setDefaultCloseOperation
  (JFrame.EXIT_ON_CLOSE);
  frame.pack();
  frame.setVisible(true);
 }
 public void duck() {
  JFrame frame = new JFrame();
  ImageIcon icon = new ImageIcon("IMG_1758.jpeg");
  JLabel label = new JLabel(icon);
  frame.add(label);
  frame.setDefaultCloseOperation
  (JFrame.EXIT_ON_CLOSE);
  frame.pack();
  frame.setVisible(true);
 }
}