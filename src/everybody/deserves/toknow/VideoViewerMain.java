package everybody.deserves.toknow;

/**
 * This software is free for use and modification by anyone.
 */

public class VideoViewerMain extends JFrame  {
    private ArrayList<Float> sceneLengths;
    private ArrayList<JPanel> sceneList;
  
    public VideoViewerMain()
    {
        super();
        sceneLengths = new ArrayList<Float>();
        sceneList = new ArrayList<JPanel>();
    }

    public void addSceneToList(Float duration, JPanel scene)
    {
        sceneLengths.add(duration);
        sceneList.add(scene);
    }

    public void run()
    {
        for(int k = 0; k < sceneLengths.length(); k++)
        {
            this.setContentPane(sceneList.get(k));
            
        }
    }
}
