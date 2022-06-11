package Game;
import GUI_Package.GUI_Frame_MainMenu;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
public class ControlSound {
    public Clip loadClip(String S) {
        Clip clip = null;
        File file = new File(S);
        AudioInputStream audioStream;
        try {
            audioStream = AudioSystem.getAudioInputStream(file);
            clip = AudioSystem.getClip();
            clip.open(audioStream);
        } catch (Exception ex) {
            Logger.getLogger(GUI_Frame_MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        return clip;
    }
    public static void RunClip(String S) {
        Clip clip = null;
        File file = new File(S);
        AudioInputStream audioStream;
        try {
            audioStream = AudioSystem.getAudioInputStream(file);
            clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
        } catch (Exception ex) {
            Logger.getLogger(GUI_Frame_MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void setVol(Clip clip, double vol) {
        FloatControl gain = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
        float db = (float) (Math.log(vol) / Math.log(10) * 20);
        gain.setValue(db);
    }
}