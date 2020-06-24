PImage face; 
void setup() { 
  size(800,600);
face = loadImage("Dings.jpg");
face.resize(width,height);

}


void draw() {
  background(face);
  fill(#FFFAFA);
  ellipse(450,400,90,70);
  ellipse(250,400,90,70);
  fill(#0F0F0F);
  
 if(mousePressed)
 println(mouseX + " "+mouseY);
 if(mouseX<=275&&mouseX>=255&&mouseY>=381&&mouseY<=421){
   ellipse(mouseX+200,mouseY,40,30);
  ellipse(mouseX,mouseY,40,30);
 }
 

}
