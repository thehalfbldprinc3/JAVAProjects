/*A simple banner applet.

    this applet creates a thread that scrolls
    the message contained in msg right to left
    scrolls the applet window.
 */
import java.awt.*;
import java.applet.*;
/*
<applet code ="SimpleBanner" width=300 height=50>
</applet>
*/

public class SimpleBanner extends Applet implements Runnable
{
    String msg=" A simple scrolling banner.";
    Thread t=null;
    int state;
    volatile boolean stopFlag;

    //set colour and initialize thread
    public void init()
    {
     setBackground((Color.cyan));
     setForeground((Color.red));
    }

    //start thread
    public void start()
    {
        t=new Thread(this);
        stopFlag=false;
        t.start();
    }

    //Entry point for the thread that runs the banner.
    public void run()
    {

        //redisplay banner
        for(; ;)
        {
            try
            {
                repaint();
                Thread.sleep(250);
                if(stopFlag) break;
            }catch (InterruptedException e){}
        }
    }
    //Pause the banner
    public void stop()
    {
        stopFlag=true;
        t=null;
    }

    //Display the banner
    public void paint(Graphics g)
    {
        char ch;
        ch=msg.charAt(0);
        msg=msg.substring(1,msg.length());
        msg+=ch;

        g.drawString(msg,50,30);
    }
}