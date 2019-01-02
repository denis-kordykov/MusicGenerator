package com.kordyukov;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.midi.*;

/**
 *
 * @author �����
 */
public class DrumShare {
    //38  
 public static void PlayShare()
 {
 DrumRythmShare pShare = new DrumRythmShare();
 try {
            Synthesizer synth1 = MidiSystem.getSynthesizer();
            synth1.open();
            MidiChannel[] channels = synth1.getChannels();
            channels[9].programChange(38);
            
            for(int vremya = 0;vremya < 10;vremya = vremya++)
            {
            channels[9].noteOn(38, 70);
            Thread.sleep(pShare.rythm_b); // in milliseconds
            channels[9].noteOff(38);
            pShare.randomR();
            //synth.close();
            
            }
                    
       }catch (Exception e) 
       {
            e.printStackTrace();
       }
 }
}
