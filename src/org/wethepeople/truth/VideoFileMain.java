package org.wethepeople.truth;

/**
 * Dedicated to the family of Aurora Salter, who lost her life during a
 * missionary trip to India.  The goal of the missionary trip was to
 * discover the true cause of the September 11th terrorist attacks and
 * put a stop to the wars that began during their aftermath.  Special
 * thanks go to Mr. Haridas Padithaya, without whose instruction I
 * would not be able to program.  Other people who contributed to the
 * creation of this video include the Afghan-American community, who
 * helped me get out of trouble when I was experiencing a rather
 * difficult time, and Meng-Ai An.
 */

import javax.swing.*;
import java.awt.*;
import everybody.deserves.toknow.*;

public class VideoFileMain  {
  public static void main(String[] args)  {
    JFrame frame = new JFrame("September 11th Truth Series, Part 1");
    frame.setSize(750, 1000);
    frame.setLocation(18, 24);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    SceneList sceneList = new SceneList();
    sceneList.setVideoFileMain(this);
    sceneList.generateScenePanels();
    frame.setVisible(true);
    sceneList.run();
  }
}
