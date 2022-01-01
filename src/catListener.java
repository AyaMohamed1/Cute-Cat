
import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;
public class catListener
        implements GLEventListener {

    final double ONE_DEGREE = (Math.PI / 180);
    final double THREE_SIXTY = 2 * Math.PI;
    public void init(GLAutoDrawable gld) {
        GL gl = gld.getGL();
        GLU glu = new GLU();
        gl.glClearColor(1.0f, 0.92f, 0.76f, 1.0f);
        gl.glViewport(-250, -150, 250, 150);
        gl.glMatrixMode(GL.GL_PROJECTION);
        gl.glLoadIdentity();
        glu.gluOrtho2D(-250.0, 250.0, -150.0, 150.0);
    }

    public void display(GLAutoDrawable drawable) {
        double x, y;
        GL gl = drawable.getGL();
        gl.glClear(GL.GL_COLOR_BUFFER_BIT);
        
        //head
        
        gl.glColor3f(0.96f, 0.71f, 0.82f); // left pink part
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex2d(-80, 143);
        gl.glVertex2d(-80, 38);
        gl.glVertex2d(-40, 38);
        gl.glVertex2d(-40, 143);
        gl.glEnd();
        
        gl.glColor3f(1.0f, 0.92f, 0.76f); //hide rest of pink
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex2d(-60, 113);
        gl.glVertex2d(-60, 145);
        gl.glVertex2d(-30, 145);
        gl.glVertex2d(-30, 113);
        gl.glEnd();
        
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex2d(-80, 143);
        gl.glVertex2d(-60, 143);
        gl.glVertex2d(-60, 132);
        gl.glEnd();
        
        gl.glColor3f(0.96f, 0.71f, 0.82f); // right pink part
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex2d(80, 143);
        gl.glVertex2d(80, 38);
        gl.glVertex2d(40, 38);
        gl.glVertex2d(40, 143);
        gl.glEnd();
        
        gl.glColor3f(1.0f, 0.92f, 0.76f); //hide rest of pink
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex2d(60, 113);
        gl.glVertex2d(60, 145);
        gl.glVertex2d(30, 145);
        gl.glVertex2d(30, 113);
        gl.glEnd();
        
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex2d(80, 143);
        gl.glVertex2d(60, 143);
        gl.glVertex2d(60, 132);
        gl.glEnd();
        
        gl.glColor3f(0.31f, 0.3f, 0.36f); // left ear
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex2d(-80, 143);
        gl.glVertex2d(-60, 113);
        gl.glVertex2d(-25, 113);
        gl.glEnd();
        
        gl.glColor3f(0.31f, 0.3f, 0.36f); // right ear
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex2d(80, 143);
        gl.glVertex2d(60, 113);
        gl.glVertex2d(25, 113);
        gl.glEnd();
        
        
        gl.glColor3f(0.31f, 0.3f, 0.36f); //half of head
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex2d(-80, 80);
        gl.glVertex2d(-80, 38);
        gl.glVertex2d(80, 38);
        gl.glVertex2d(80, 80);
        gl.glEnd();
        
        gl.glBegin(GL.GL_POLYGON); // top head
        gl.glVertex2d(-60, 113);
        gl.glVertex2d(-60, 80);
        gl.glVertex2d(60, 80);
        gl.glVertex2d(60, 113);
        gl.glEnd();
        
        //left circle
        gl.glBegin(GL.GL_POLYGON);
        for (double a = ONE_DEGREE * 122; a < ONE_DEGREE * 200; a += ONE_DEGREE) {
            x = 65 * (Math.cos(a)) - 20;
            y = 65 * (Math.sin(a)) + 60;
            gl.glVertex2d(x, y);
        }
        gl.glEnd();
        
        
        gl.glBegin(GL.GL_POLYGON); //hide pink part 2
        gl.glVertex2d(-60, 80);
        gl.glVertex2d(-60, 100);
        gl.glVertex2d(-70, 80);
        gl.glEnd();
        
        //right circle
        
        gl.glBegin(GL.GL_POLYGON);
        for (double a = ONE_DEGREE * (122+218); a < ONE_DEGREE * (200+218); a += ONE_DEGREE) {
            x = 65 * (Math.cos(a)) + 20;
            y = 65 * (Math.sin(a)) + 60;
            gl.glVertex2d(x, y);
        }
        gl.glEnd();
        
        gl.glBegin(GL.GL_POLYGON); //hide pink part 2
        gl.glVertex2d(60, 80);
        gl.glVertex2d(60, 100);
        gl.glVertex2d(70, 80);
        gl.glEnd();
        
        //gl.glColor3f(0.0f, 0.0f, 0.0f);
        gl.glBegin(GL.GL_POLYGON); // bottom head
        gl.glVertex2d(-60, 7);
        gl.glVertex2d(-60, 38);
        gl.glVertex2d(60, 38);
        gl.glVertex2d(60, 7);
        gl.glEnd();
        
        //left circle
        
        gl.glBegin(GL.GL_POLYGON);
        for (double a = ONE_DEGREE * (122 + 47); a < ONE_DEGREE * (200 + 47); a += ONE_DEGREE) {
            x = 65 * (Math.cos(a)) - 18;
            y = 65 * (Math.sin(a)) + 40;
            gl.glVertex2d(x, y);
        }
        gl.glEnd();
        
        
        
        //right circle
        
        gl.glBegin(GL.GL_POLYGON);
        for (double a = ONE_DEGREE * (122 + 170); a < ONE_DEGREE * (200 + 170); a += ONE_DEGREE) {
            x = 65 * (Math.cos(a)) + 18;
            y = 65 * (Math.sin(a)) + 40;
            gl.glVertex2d(x, y);
        }
        gl.glEnd();
        
        //hide rest of left circle
        gl.glColor3f(1.0f, 0.92f, 0.76f);
        gl.glBegin(GL.GL_POLYGON); 
        gl.glVertex2d(-90, 10);
        gl.glVertex2d(-90, -30);
        gl.glVertex2d(90, -30);
        gl.glVertex2d(90, 10);
        gl.glEnd();
        
        gl.glColor3f(0.31f, 0.3f, 0.36f); //hide part2 _ left
        //gl.glColor3f(0.0f, 0.0f, 0.0f);
        gl.glBegin(GL.GL_POLYGON); 
        gl.glVertex2d(-60, 38);
        gl.glVertex2d(-60, 10);
        gl.glVertex2d(-75, 38);
        gl.glEnd();
        
        gl.glBegin(GL.GL_POLYGON); // right
        gl.glVertex2d(60, 38);
        gl.glVertex2d(60, 10);
        gl.glVertex2d(75, 38);
        gl.glEnd();
        
        
        //right eye
        //gl.glColor3f(0.95f, 0.84f, 0.5f); //yellow part
        gl.glColor3f(1.0f, 1.0f, 1.0f);
        gl.glBegin(GL.GL_POLYGON);
        for (double a = 0; a < ONE_DEGREE * 360; a += ONE_DEGREE) {
            x = 22 * (Math.cos(a)) + 40;
            y = 22 * (Math.sin(a)) + 62;
            gl.glVertex2d(x, y);
        }
        gl.glEnd();
        
        gl.glColor3f(0.26f, 0.25f, 0.3f);//dark part
        gl.glBegin(GL.GL_POLYGON);
        for (double a = 0; a < ONE_DEGREE * 360; a += ONE_DEGREE) {
            x = 15 * (Math.cos(a)) + 40;
            y = 15 * (Math.sin(a)) + 62;
            gl.glVertex2d(x, y);
        }
        gl.glEnd();
        
        gl.glColor3f(1.0f, 1.0f, 1.0f);//white part
        gl.glBegin(GL.GL_POLYGON);
        for (double a = 0; a < ONE_DEGREE * 360; a += ONE_DEGREE) {
            x = 5 * (Math.cos(a)) + 48;
            y = 5 * (Math.sin(a)) + 68;
            gl.glVertex2d(x, y);
        }
        gl.glEnd();
        
        //left eye
        //gl.glColor3f(0.95f, 0.84f, 0.5f); 
        gl.glColor3f(1.0f, 1.0f, 1.0f);
        gl.glBegin(GL.GL_POLYGON);//yellow part
        for (double a = 0; a < ONE_DEGREE * 360; a += ONE_DEGREE) {
            x = 22 * (Math.cos(a)) - 40;
            y = 22 * (Math.sin(a)) + 62;
            gl.glVertex2d(x, y);
        }
        gl.glEnd();
        
        gl.glColor3f(0.26f, 0.25f, 0.3f);//dark part
        gl.glBegin(GL.GL_POLYGON);
        for (double a = 0; a < ONE_DEGREE * 360; a += ONE_DEGREE) {
            x = 15 * (Math.cos(a)) - 40;
            y = 15 * (Math.sin(a)) + 62;
            gl.glVertex2d(x, y);
        }
        gl.glEnd();
        
        gl.glColor3f(1.0f, 1.0f, 1.0f);//white part
        gl.glBegin(GL.GL_POLYGON);
        for (double a = 0; a < ONE_DEGREE * 360; a += ONE_DEGREE) {
            x = 5 * (Math.cos(a)) - 32;
            y = 5 * (Math.sin(a)) + 68;
            gl.glVertex2d(x, y);
        }
        gl.glEnd();
        
        //nose
        gl.glColor3f(0.96f, 0.71f, 0.82f);
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex2d(0, 20);
        gl.glVertex2d(-12, 27);
        gl.glVertex2d(12, 27);
        gl.glEnd();
        
        //mouse
        gl.glLineWidth((float) 2.0);
        gl.glBegin(GL.GL_LINES);
        gl.glVertex2d(0, 20);
        gl.glVertex2d(-8, 12);
        gl.glVertex2d(0, 20);
        gl.glVertex2d(8, 12);
        gl.glEnd();
        
         //shnap
        gl.glColor3f(0.36f, 0.35f, 0.42f);
        gl.glLineWidth((float) 1.8);
        gl.glBegin(GL.GL_LINES);
        gl.glVertex2d(16, 22); //right
        gl.glVertex2d(40, 30);
        
        gl.glVertex2d(14, 18);
        gl.glVertex2d(43, 22);
        
        gl.glVertex2d(16, 14);
        gl.glVertex2d(44, 12);
        
        gl.glVertex2d(-16, 22);//left
        gl.glVertex2d(-40, 30);
        
        gl.glVertex2d(-14, 18);
        gl.glVertex2d(-43, 22);
        
        gl.glVertex2d(-16, 14);
        gl.glVertex2d(-44, 12);
        
        
        gl.glEnd();
        
        //body
        gl.glColor3f(0.36f, 0.35f, 0.42f); // top part of body "triangle"
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex2d(-32, 10);
        gl.glVertex2d(18, 10);
        gl.glVertex2d(74, -45);
        gl.glVertex2d(-32, -45);
        gl.glEnd();
        
        gl.glColor3f(0.31f, 0.3f, 0.36f);//bottom 
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex2d(0, -38);
        gl.glVertex2d(40, 10);
        gl.glVertex2d(40, -120);
        gl.glVertex2d(-39, -120);
        gl.glVertex2d(-39, 10);
        gl.glEnd();
        
        gl.glColor3f(0.36f, 0.35f, 0.42f);//mid triangle
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex2d(0, -38);
        gl.glVertex2d(54, 10);
        gl.glVertex2d(-54, 10);
        gl.glEnd();
        
        //gl.glColor3f(0.0f, 0.0f, 0.0f);
        gl.glColor3f(0.31f, 0.3f, 0.36f);//chain
        gl.glBegin(GL.GL_POLYGON);
        for (double a = ONE_DEGREE * (120+110); a < ONE_DEGREE * (200+110); a += ONE_DEGREE) {
            x = 120 * (Math.cos(a)) ;
            y = 120 * (Math.sin(a)) + 103;
            gl.glVertex2d(x, y);
        }
        gl.glEnd();
        
        
        gl.glColor3f(0.31f, 0.3f, 0.36f);
        gl.glBegin(GL.GL_POLYGON); //tail
        for (double a = ONE_DEGREE * (120 + 165); a < ONE_DEGREE * (200 + 165); a += ONE_DEGREE) {
            x = 150 * (Math.cos(a)) + 23;
            y = 150 * (Math.sin(a)) + 25;
            gl.glVertex2d(x, y);
        }
        gl.glEnd();
        
        gl.glColor3f(1.0f, 0.92f, 0.76f);
        gl.glBegin(GL.GL_POLYGON); //tail
        for (double a = ONE_DEGREE * (120 + 165); a < ONE_DEGREE * (200 + 165); a += ONE_DEGREE) {
            x = 130 * (Math.cos(a)) + 28;
            y = 130 * (Math.sin(a)) + 25;
            gl.glVertex2d(x, y);
        }
        gl.glEnd();
        
        gl.glColor3f(0.31f, 0.3f, 0.36f);
        gl.glBegin(GL.GL_POLYGON); //circle bottom body
        for (double a = 0; a < ONE_DEGREE * 360; a += ONE_DEGREE) {
            x = 43 * (Math.cos(a)) + 53;
            y = 43 * (Math.sin(a)) - 78;
            gl.glVertex2d(x, y);
        }
        gl.glEnd();
        
        gl.glColor3f(0.36f, 0.35f, 0.42f);
        gl.glBegin(GL.GL_POLYGON); //small circle bottom body
        for (double a = 0; a < ONE_DEGREE * 180; a += ONE_DEGREE) {
            x = 20 * (Math.cos(a)) + 44;
            y = 20 * (Math.sin(a)) - 120;
            gl.glVertex2d(x, y);
        }
        gl.glEnd();
        
        //right leg
        gl.glColor3f(0.31f, 0.3f, 0.36f);
        gl.glBegin(GL.GL_POLYGON);
        for (double a = ONE_DEGREE * 180; a < ONE_DEGREE * 360; a += ONE_DEGREE) {
            x = 14 * (Math.cos(a)) + 26;
            y = 14 * (Math.sin(a)) - 118;
            gl.glVertex2d(x, y);
        }
        gl.glEnd();
        
        //left leg
        gl.glBegin(GL.GL_POLYGON);
        for (double a = ONE_DEGREE * 180; a < ONE_DEGREE * 360; a += ONE_DEGREE) {
            x = 14 * (Math.cos(a)) - 25;
            y = 14 * (Math.sin(a)) - 118;
            gl.glVertex2d(x, y);
        }
        gl.glEnd();
        
        
        //hide rest of light circle
        //gl.glColor3f(0.0f, 0.0f, 0.0f);
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex2d(40, -120);
        gl.glVertex2d(10, -120);
        gl.glVertex2d(10,-90);
        gl.glVertex2d(40, -90);
        gl.glEnd();
        
        //light in bottom body
        gl.glColor3f(0.36f, 0.35f, 0.42f);
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex2d(10, -120);
        gl.glVertex2d(-10, -120);
        gl.glVertex2d(-10,-60);
        gl.glVertex2d(10, -60);
        gl.glEnd();
        
        
        gl.glBegin(GL.GL_POLYGON);
        for (double a = 0; a < ONE_DEGREE * 180; a += ONE_DEGREE) {
            x = 10 * (Math.cos(a));
            y = 10 * (Math.sin(a)) - 60;
            gl.glVertex2d(x, y);
        }
        gl.glEnd();
        
       //nails
        gl.glColor3f(0.36f, 0.35f, 0.42f);
        gl.glLineWidth((float) 1.8);
        gl.glBegin(GL.GL_LINES);
        gl.glVertex2d(-17, -120);//left
        gl.glVertex2d(-17, -127);
        
        gl.glVertex2d(-23, -120);
        gl.glVertex2d(-23, -131);
        
        gl.glVertex2d(-28, -120);
        gl.glVertex2d(-28, -131);
        
        gl.glVertex2d(-33, -120);
        gl.glVertex2d(-33, -127);
        
        gl.glVertex2d(17, -120);//right
        gl.glVertex2d(17, -127);
        
        gl.glVertex2d(23, -120);
        gl.glVertex2d(23, -131);
        
        gl.glVertex2d(28, -120);
        gl.glVertex2d(28, -131);
        
        gl.glVertex2d(33, -120);
        gl.glVertex2d(33, -127);
        
        gl.glEnd();
    }

    public void reshape(
            GLAutoDrawable drawable,
            int x,
            int y,
            int width,
            int height
    ) {
    }

    public void displayChanged(
            GLAutoDrawable drawable,
            boolean modeChanged,
            boolean deviceChanged
    ) {
    }
}
