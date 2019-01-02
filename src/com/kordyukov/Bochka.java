package com.kordyukov;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.midi.*;



/**
 *
 * @author �����
 */
class Bochka 
{
int note = 35;

public static void PlayBochka()
{
    DrumRythm pBochka = new DrumRythm();
    //DrumShare pShare = new pShare;
    //int a = 60; // ��������� �������� ��������� - "��"
    //int b = 71; // �������� �������� ��������� - "��"  
   try {
            Synthesizer synth = MidiSystem.getSynthesizer();
            synth.open();
            MidiChannel[] channels = synth.getChannels();
            channels[9].programChange(35);
            
            for(int vremya = 0;vremya < 10;vremya = vremya++)
            {
            channels[9].noteOn(35, 80);
            Thread.sleep(pBochka.rythm_b); // in milliseconds
            channels[9].noteOff(35);
            pBochka.randomR();
            
            //synth.close();
            
            }
                    
       }catch (Exception e) 
       {
            e.printStackTrace();
       }
}

    
}
