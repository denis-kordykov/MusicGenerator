package com.kordyukov;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.midi.*;


/**
 *
 * @author �����
 */
public class DrumRythmHat {
   int[] rythm = {1000,500,250,125};
 
int a = 0; // ��������� �������� ��������� - "��"
int b = 3; // �������� �������� ��������� - "��"
int i,y,z;
int rythm_b = rythm[a +(int)(Math.random() *((b-a)+1))];
public void randomH()
{
for(int y = 1;y<5; y = y++)
{    
i = rythm[a +(int)(Math.random() *((b-a)+1))];
y = rythm[a +(int)(Math.random() *((b-a)+1))];
z = rythm[a +(int)(Math.random() *((b-a)+1))];

   if(i==y&&i==z)
       this.rythm_b = i;
       
           
       }
   }    
}
