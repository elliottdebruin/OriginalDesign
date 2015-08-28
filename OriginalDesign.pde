

void setup()
{
size(400, 400, P3D);

}

void draw()
{
	background(0, 0, 0);     


noStroke();
fill(0,mouseX,255);
lights();
translate(200, 200, 0);
rotateX (mouseX * 0.03);
rotateY (mouseY * 0.03);
box(100, 100, 100);
fill(255,mouseX,0);
translate(100, 100, 0);
rotateX (mouseX * 0.03);
rotateY (mouseY * 0.03);
box(50, 50, 50);





}

