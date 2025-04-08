package org.wethepeople.truth;

/**
 * Dedicated to the family of Aurora Salter, who lost her life during a
 * missionary trip to India.  The goal of the missionary trip was to
 * discover the true cause of the September 11th terrorist attacks and
 * put a stop to the wars that began during their aftermath.
 */

import javax.swing.*;
import java.awt.*;



public class VideoFileMain  {
  public static void main(String[] args)  {
    JFrame frame = new JFrame("September 11th Truth Series, Part 1");
    frame.setSize(750, 1000);
    frame.setLocation(18, 24);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setContentPane(new Scene0Panel());
    frame.setVisible(true);
  }
}
