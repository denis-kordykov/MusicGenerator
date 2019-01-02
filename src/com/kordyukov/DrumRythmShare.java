package com.kordyukov;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.midi.*;

/**
 *
 * @author �����
 */
public class DrumRythmShare {
 int[] rythm = {2000,1000,500,250};
 
int a = 0; // ��������� �������� ��������� - "��"
int b = 3; // �������� �������� ��������� - "��"
int i,y,z,q;
int rythm_b = rythm[a +(int)(Math.random() *((b-a)+1))];
public void randomR()
{
for(int y = 1;y<5; y = y++)
{    
i = rythm[a +(int)(Math.random() *((b-a)+1))];
y = rythm[a +(int)(Math.random() *((b-a)+1))];
z = rythm[a +(int)(Math.random() *((b-a)+1))];
q = rythm[a +(int)(Math.random() *((b-a)+1))];

   if(i==y&&i==z)
       this.rythm_b = i;
       
           
       }
   }   
}
