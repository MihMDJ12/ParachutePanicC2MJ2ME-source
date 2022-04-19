import java.util.Random;
import javax.microedition.lcdui.Graphics;

public final class c
{

    public c(g g1, int i1, int j1, int k1)
    {
        v = g1;
        a = i1;
        b = j1;
        e = k1;
        if(k1 == 0)
        {
            t = 150 - Math.abs(g1.a.nextInt()) % 50;
            h = true;
            l = 15;
            c = 28;
            d = 14;
            n = 2;
        } else
        {
            if(i1 > 240)
                p = false;
            else
            if(i1 < 0)
                p = true;
            c = 52;
            d = 34;
            n = 0;
            k = 3;
        }
        m = new l(g1, g1.ab, 1, true);
        super.a = 0;
    }

    public final void a(Graphics g1)
    {
        if(e == 0)
        {
            g1 = g1;
            this = this;
            if(i)
            {
                if(q < 10)
                {
                    if(q == 1)
                        switch(n)
                        {
                        default:
                            break;

                        case 0: // '\0'
                            v.w++;
                            break;

                        case 1: // '\001'
                            v.w += 2;
                            break;

                        case 2: // '\002'
                            v.B++;
                            if(((e) (v)).B == 50 || ((e) (v)).B == 150 || ((e) (v)).B == 300 || ((e) (v)).B == 1000)
                                v.w++;
                            break;
                        }
                    o = o <= -10 ? -10 : o - 1;
                    switch(n)
                    {
                    case 0: // '\0'
                        g1.drawImage(m.db, a, b + o, 33);
                        break;

                    case 1: // '\001'
                        g1.drawImage(m.dd, a, b + o, 33);
                        break;

                    case 2: // '\002'
                        g1.drawImage(m.dc, a, b + o, 33);
                        break;
                    }
                }
                if(o == -10)
                    f = true;
                q++;
            } else
            if(s)
            {
                if(r < 20)
                {
                    if(r % 2 == 0)
                        g1.drawImage(m.aY, a, b, 3);
                    else
                        g1.drawImage(m.aZ, a, b, 3);
                    r++;
                }
            } else
            if(h)
            {
                if(v.u % 4 == 0)
                    g1.drawImage(m.aP, a, b, 3);
                else
                if(v.u % 4 == 1)
                    g1.drawImage(m.aQ, a, b, 3);
                else
                if(v.u % 4 == 2)
                    g1.drawImage(m.aR, a, b, 3);
                else
                if(v.u % 4 == 3)
                    g1.drawImage(m.aS, a, b, 3);
            } else
            {
                if(v.u % 4 == 0)
                    g1.drawImage(m.aT, a, b, 3);
                else
                if(v.u % 4 == 1)
                    g1.drawImage(m.aU, a, b, 3);
                else
                if(v.u % 4 == 2)
                    g1.drawImage(m.aV, a, b, 3);
                else
                if(v.u % 4 == 3)
                    g1.drawImage(m.aW, a, b, 3);
                if(u && !m.a())
                    m.a(g1, a + 10, 362, 3);
                return;
            }
        } else
        {
            g1 = g1;
            this = this;
            if(g)
            {
                o = o <= -10 ? -10 : o - 1;
                switch(n)
                {
                case 0: // '\0'
                    g1.drawImage(m.db, a, b + o, 33);
                    break;

                case 1: // '\001'
                    g1.drawImage(m.dd, a, b + o, 33);
                    break;

                case 2: // '\002'
                    g1.drawImage(m.dc, a, b + o, 33);
                    break;
                }
                if(o == -1)
                    switch(n)
                    {
                    default:
                        break;

                    case 0: // '\0'
                        v.w++;
                        break;

                    case 1: // '\001'
                        v.w += 2;
                        break;

                    case 2: // '\002'
                        v.B++;
                        if(((e) (v)).B == 50 || ((e) (v)).B == 150 || ((e) (v)).B == 300 || ((e) (v)).B == 1000)
                            v.w++;
                        break;
                    }
                if(o == -10)
                {
                    f = true;
                    return;
                }
            } else
            {
                if(v.u % 2 == 0)
                    g1.drawImage(m.ba, a, b, 3);
                if(v.u % 2 == 1)
                    g1.drawImage(m.ba, a + 1, b, 3);
            }
        }
    }

    public final void a()
    {
        if(v.p <= 0 && v.m)
        {
            if(a > -100)
            {
                a += v.D;
            } else
            {
                j = true;
                return;
            }
        } else
        if(e == 0)
        {
            if(!i)
            {
                if(s && r >= 20)
                {
                    h = false;
                    s = false;
                }
                if(h)
                {
                    if(b - l > t + 10)
                    {
                        if(l < 0 && v.u % 2 == 0)
                            l--;
                    } else
                    {
                        l = 1;
                    }
                    if(b > t)
                    {
                        b -= l;
                    } else
                    {
                        b = t;
                        s = true;
                        l = 0;
                    }
                } else
                {
                    if(b < 320)
                    {
                        b += l;
                    } else
                    {
                        b = 320;
                        f = true;
                    }
                    if(b + l > t + 15)
                    {
                        if(v.u % 2 == 0)
                            l++;
                    } else
                    {
                        l = 1;
                    }
                    if(b > 290)
                        u = true;
                    return;
                }
            }
        } else
        if(e == 1 && !g)
        {
            if(p)
                if(a < 270)
                {
                    a += k;
                    return;
                } else
                {
                    f = true;
                    return;
                }
            if(a > -30)
            {
                a -= k;
                return;
            }
            f = true;
        }
    }

    int a;
    int b;
    int c;
    int d;
    int e;
    boolean f;
    private int k;
    private int l;
    private l m;
    private int n;
    private int o;
    private boolean p;
    boolean g;
    private int q;
    private int r;
    boolean h;
    private boolean s;
    private int t;
    private boolean u;
    boolean i;
    boolean j;
    private g v;
}
