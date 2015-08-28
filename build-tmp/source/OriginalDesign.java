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
size(400, 400, P3D);

}

public void draw()
{
	background(0, 0, 0);     


noStroke();
fill(0,mouseX,255);
lights();
translate(200, 200, 0);
rotateX (mouseX * 0.03f);
rotateY (mouseY * 0.03f);
box(100, 100, 100);
fill(255,mouseX,0);
translate(100, 100, 0);
rotateX (mouseX * 0.03f);
rotateY (mouseY * 0.03f);
box(50, 50, 50);





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
