package com.kordyukov;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.midi.*;


/**
 *
 * @author �����
 */
public class GuitarRythm {
int a =0;
    int b =5;
    int bn = 20;
    int udar[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
     int[] rythm = {2000,1000,500,250,125,62};
     int rytmi= rythm[a +(int)(Math.random() *((b-a)+1))];
     int udari; 
     int note[] = {60,62,64,65,67,69,71,72,74,76,77,79,81,83,84,86,88,89,91,93,95};
     int notei;
     //int i = a +(int)(Math.random() *((bn-a)+1)); ����� ��� ����
     //int[]buffer = new int [i];����� ��� ����
    
     
     
     
    public void randomGuitar(){
      
      notei = note[a +(int)(Math.random() *((bn-a)+1))];
      int noten = notei;
      int notens = a +(int)(Math.random() *((bn-a)+1));
      rytmi = rythm[a +(int)(Math.random() *((b-a)+1))];
     
               
               rytmi = rythm[a +(int)(Math.random() *((b-a)+1))];
               udari = udar[0 +(int)(Math.random() *((15-0)+1))];
     

    }    
}
