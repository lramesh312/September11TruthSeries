package everybody.deserves.toknow;

import javax.swing.*;
import java.util.*;

public class SceneList extends Thread
  {
    private List<JPanel> listOfScenes;
    private VideoFileMain videoFileMain;

    public SceneList()
    {
        listOfScenes = new ArrayList<JPanel>();
        videoFileMain = null;
    }

    public void setVideoFileMain(VideoFileMain newVideoFile)
    {
        videoFileMain = newVideoFile;
    }

    public void run()
    {
        JPanel firstFrame = listOfScenes.get(0);
        for(int k = 0; k < listOfScenes.size(); k++)
          {
             try
               {
                 Thread.sleep(100);
               }
             videoFileMain.setContentPane(listOfScenes.get(k));
          }
    }
  }
