package org.wethepeople.truth;

import javax.swing.*;
import java.awt.*;

public class VideoFileMain  {
  public static void main(String[] args)  {
    JFrame frame = new JFrame("Lab00");
10    frame.setSize(400, 225);
11    frame.setLocation(100, 50);
12    frame.setDefaultCloseOperation(
                       JFrame.EXIT_ON_CLOSE);
13    frame.setContentPane(new Panel00());
14    frame.setVisible(true);

  }
}
