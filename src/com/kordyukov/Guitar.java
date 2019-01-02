package com.kordyukov;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.midi.*;


/**
 *
 * @author �����
 */
public class Guitar {
 public static void PlayGuitar(){
        BassRytm interval = new BassRytm();
         GuitarRythm pGuitar = new GuitarRythm();
        try {
            Synthesizer synth6 = MidiSystem.getSynthesizer();
            synth6.open();
            MidiChannel[] channels = synth6.getChannels();
            channels[6].programChange(25);
               
            for(int vremya = 0;vremya < 10;vremya = vremya++)
            {
            
            for(int p = 0;p<=pGuitar.udari;p++)
            {
            pGuitar.notei = pGuitar.note[pGuitar.a +(int)(Math.random() *((pGuitar.bn-pGuitar.a)+1))];     
            channels[6].noteOn(pGuitar.notei, 60);
            
            Thread.sleep(pGuitar.rytmi); // in milliseconds
            channels[6].noteOff(pGuitar.notei);  
            
            
            }
            pGuitar.randomGuitar();
            }
                   
       }catch (Exception e) 
       {
            e.printStackTrace();
       }
    }   
}
