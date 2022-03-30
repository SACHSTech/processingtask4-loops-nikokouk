import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(255, 255, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// Draw top left quad
    
    fill(200, 200, 200);
  
    for (int lineX = 20; lineX <= 200; lineX += 20) {
    line(lineX, 0, lineX, 200);
      }

    fill(200, 200, 200);
    
    for (int lineY = 20; lineY <= 200; lineY += 20) {
    line(0, lineY, 200, lineY);
    }


    

    //Draw Bottom Left quad

    strokeWeight((float) 0.002 * height);

    for (int i = 0; i <= height/2; i++) {
    stroke(i,i,i);
    line(i, height/(float) 2.2, i, height);

    }
    //Draw Bottom Right quad


    for(int intAngle = 0; intAngle < 360; intAngle +=45) {
    fill(119, 0, 125);
    stroke(0, 50, 0);
    strokeWeight((float) 0.004 * height);

    pushMatrix();
    translate((width/2)+width/4, (height/2)+ height/4 );
    rotate(radians(intAngle));
    ellipse(0, 0, height/20, height/3);
    popMatrix();
      }

    fill(3, 7, 252);
    noStroke();
    ellipse((width/2)+width/4, (height/2)+ height/4 , 50, 50);

    //Draw top right quad

    
    fill(200, 200, 200);
    
    for (int circleX = 220; circleX <= 400; circleX += 40) {
    

    for (int circleY = 10; circleY <= 200; circleY += 40) {
    ellipse(circleX, circleY, 20, 20);
      }




      }
    }
  
  // define other methods down here.
}