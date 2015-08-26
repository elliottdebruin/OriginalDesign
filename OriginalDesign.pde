

void setup()
{
size(400, 400);
background(0, 0, 0);
}

void draw()
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

