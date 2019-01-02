package com.kordyukov;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.midi.*;



/**
 *
 * @author �����
 */
public class DrumHat {
public static void PlayHat()
 {
 DrumRythmHat pHat = new DrumRythmHat();
 try {
            Synthesizer synth2 = MidiSystem.getSynthesizer();
            synth2.open();
            MidiChannel[] channels = synth2.getChannels();
            channels[9].programChange(42);
            
            for(int vremya = 0;vremya < 10;vremya = vremya++)
            {
            channels[9].noteOn(42, 70);
            Thread.sleep(pHat.rythm_b); // in milliseconds
            channels[9].noteOff(42);
            pHat.randomH();
            //synth.close();
            
            }
                    
       }catch (Exception e) 
       {
            e.printStackTrace();
       }
 }    
}
