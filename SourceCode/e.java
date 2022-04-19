import java.io.*;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.media.*;
import javax.microedition.media.control.VolumeControl;

public abstract class e
{

    public e()
    {
        String as[] = new String[5];
        as[0] = "A";
        as[1] = "B";
        as[2] = "C";
        as[3] = "D";
        as[4] = "E";
        c = false;
    }

    public final boolean i()
    {
        return b;
    }

    public final void j()
    {
        f();
        b = true;
    }

    public final void k()
    {
        g();
        b = false;
    }

    public final Image l()
    {
        Image image = null;
        image = Image.createImage(240, 320);
        System.out.println("assert6");
        Graphics g1 = image.getGraphics();
        e e1 = this;
        a(g1);
        return image;
    }

    public abstract void a(Graphics g1);

    public abstract void g();

    public abstract void f();

    public abstract void a(int i1, int j1);

    public abstract void b(int i1, int j1);

    public final Player a(String s, String s1, boolean flag, boolean flag1)
    {
        flag = getClass().getResourceAsStream(s);
        (e = Manager.createPlayer(flag, s1)).prefetch();
        e.realize();
        e.setLoopCount(-1);
        d++;
        a = (VolumeControl)e.getControl("VolumeControl");
        if(m.c)
        {
            a.setLevel(99);
            m.c = false;
        } else
        {
            a.setLevel(a.getLevel());
        }
        "soundCount=" + d;
        "path=" + s;
        return e;
        JVM INSTR dup ;
        s1;
        printStackTrace();
        "error: soundCount=" + d;
        "error: path=" + s;
        return null;
        JVM INSTR dup ;
        s1;
        printStackTrace();
        "error: soundCount=" + d;
        "error: path=" + s;
        return null;
        JVM INSTR dup ;
        s1;
        printStackTrace();
        "error: soundCount=" + d;
        "error: path=" + s;
        return null;
    }

    public static String[] a(String s, int i1)
    {
        int j1 = s.length();
        int k1 = -1;
        int l1 = -1;
        int i2 = 0;
        int j2 = 0;
        int k2 = -1;
        Vector vector = new Vector();
        while(++k1 < j1) 
        {
            char c1;
            if((c1 = s.charAt(k1)) == '|')
            {
                k2 = k1 + 1;
            } else
            {
                if(c1 == ' ')
                    l1 = k1;
                i2 += 6;
            }
            if(k2 == -1 && i2 >= i1)
                if(k1 < j1 - 1 && s.charAt(k1 + 1) != ' ' && s.charAt(k1 + 1) != '|' && l1 > -1)
                    k1 = k2 = l1 + 1;
                else
                    k2 = k1 + 1;
            if(k2 > 0)
            {
                l1 = k2;
                if(c1 == '|')
                    l1--;
                if(j2 < l1)
                    vector.addElement(s.substring(j2, l1));
                j2 = k2;
                k2 = -1;
                l1 = -1;
                i2 = 0;
            }
        }
        if(j2 < j1)
            vector.addElement(s.substring(j2, j1));
        String as[] = new String[vector.size()];
        vector.copyInto(as);
        return as;
    }

    private VolumeControl a;
    private boolean b;
    private boolean c;
    private int d;
    public boolean A;
    private static Player e;
    public int B;
}
