import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {



public void setup()
{
size(400, 400);
background(0, 0, 0);
}

public void draw()
{

    stroke(255, 0, 0);
    strokeWeight(1);
    line(0,0,mouseX,mouseY);
    stroke(0, 247, 0);
    line(400,0,mouseX,mouseY);
    stroke(0, 255, 255);
    line(0,400,mouseX,mouseY);
    stroke(9, 0, 255);
    line(400,400,mouseX,mouseY);   
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
