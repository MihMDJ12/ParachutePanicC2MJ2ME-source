import engine.Engine;
import java.io.PrintStream;
import java.util.Random;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.media.Player;

public final class b extends e
    implements Runnable
{

    public b()
    {
        C = 0;
        Q = false;
        b = -1;
        d = 10;
        Y = new Random();
        ay = 240;
        az = 15;
        aC = 20;
        eH = "Too scared?";
        eI = "Tough enough?";
        eX = 2;
        char ac1[][] = new char[7][];
        ac1[0] = (new char[] {
            'A', '_', 'B', '&', 'C', '!', 'D', '/'
        });
        ac1[1] = (new char[] {
            'E', '3', 'F', ':', 'G', '(', 'H', ')'
        });
        ac1[2] = (new char[] {
            'I', '8', 'J', '*', 'K', '+', 'L', '='
        });
        ac1[3] = (new char[] {
            'M', '"', 'N', '@', 'O', '9', 'P', '0'
        });
        ac1[4] = (new char[] {
            'Q', '1', 'R', '4', 'S', '-', 'T', '5'
        });
        ac1[5] = (new char[] {
            'U', '7', 'V', '#', 'W', '2', 'X', '?'
        });
        ac1[6] = (new char[] {
            'Y', '6', 'Z', '.'
        });
    }

    private void m()
    {
        System.out.println("======================load public========================");
        m.cP = u.a("/intro" + a + "/difficulty/easy.png");
        m.cQ = u.a("/intro" + a + "/difficulty/normal.png");
        m.cR = u.a("/intro" + a + "/difficulty/ask1.png");
        m.cS = u.a("/intro" + a + "/difficulty/ask2.png");
        m.cT = u.a("/intro" + a + "/difficulty/difficulty.png");
        m.ak = u.a("/intro" + a + "/menu_buttons/my_stats.png");
        m.al = u.a("/intro" + a + "/menu_buttons/resume_game.png");
        m.am = u.a("/intro" + a + "/menu_buttons/how_to_play.png");
        m.an = u.a("/intro" + a + "/menu_buttons/settings.png");
        m.ao = u.a("/intro" + a + "/menu_buttons/new_game.png");
        String s1 = null;
        if(b == 2)
            s1 = a;
        else
            s1 = "/EN";
        m.au = u.a(m.at = u.a("/intro" + s1 + "/logo_small.png"), 0, 0, 76, 32, 0);
        m.av = u.a(m.at, 0, 33, 80, 31, 0);
        m.ax = u.a(m.aw = u.a("/intro" + a + "/help.png"), 0, 63, 75, 31, 0);
        m.ay = u.a(m.aw, 0, 0, 75, 31, 0);
        m.bn = u.a(m.bm = u.a("/intro" + a + "/stats.png"), 0, 0, 152, 27, 0);
        m.bo = u.a(m.bm, 0, 57, 86, 27, 0);
        if(b == 5)
        {
            m.bp = u.a(m.bm, 0, 90, 88, 16, 0);
            m.bq = u.a(m.bm, 143, 84, 103, 28, 0);
            m.br = u.a(m.bm, 0, 116, 82, 18, 0);
            m.bs = u.a(m.bm, 0, 136, 112, 26, 0);
            m.bQ = u.a(m.bm, 0, 239, 103, 31, 0);
            m.bR = u.a(m.bm, 0, 271, 124, 31, 0);
            m.bS = u.a(m.bm, 103, 239, 103, 31, 0);
            m.bT = u.a(m.bm, 124, 270, 124, 31, 0);
        } else
        {
            m.bp = u.a(m.bm, 5, 93, 56, 11, 0);
            m.bq = u.a(m.bm, 147, 86, 72, 25, 0);
            m.br = u.a(m.bm, 9, 119, 89, 11, 0);
            m.bs = u.a(m.bm, 0, 136, 109, 26, 0);
            m.bQ = u.a(m.bm, 0, 239, 103, 31, 0);
            m.bR = u.a(m.bm, 0, 271, 124, 31, 0);
            m.bS = u.a(m.bm, 103, 239, 103, 31, 0);
            m.bT = u.a(m.bm, 124, 270, 124, 31, 0);
        }
        m.bt = u.a(m.bm, 221, 113, 57, 25, 0);
        m.bv = u.a(m.bm, 221, 143, 57, 25, 0);
        m.bw = u.a(m.bm, 0, 162, 104, 27, 0);
        m.bU = u.a(m.bm, 0, 302, 134, 31, 0);
        m.bm = null;
        m.bX = u.a(m.bW = u.a("/intro" + a + "/options.png"), 0, 0, 146, 31, 0);
        m.bY = u.a(m.bW, 0, 63, 166, 28, 0);
        m.cl = u.a(m.bW, 0, 127, 59, 25, 0);
        m.cm = u.a(m.bW, 121, 127, 59, 25, 0);
        m.cr = u.a(m.bW, 0, 153, 42, 25, 0);
        m.cs = u.a(m.bW, 84, 153, 42, 25, 0);
        m.cj = u.a(m.bW, 304, 92, 25, 11, 0);
        m.ck = u.a(m.bW, 304, 107, 25, 13, 0);
        m.ct = u.a(m.bW, 0, 179, 101, 24, 0);
        m.cu = u.a(m.bW, 0, 204, 101, 25, 0);
        m.bW = null;
        m.cw = u.a("/intro" + a + "/about.png");
        switch(b)
        {
        case 0: // '\0'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            m.cx = u.a(m.cw, 0, 0, 109, 29, 0);
            break;

        case 1: // '\001'
            m.cx = u.a(m.cw, 0, 0, 107, 26, 0);
            break;
        }
        m.cJ = u.a("/intro" + a + "/gameover/yummy.png");
        m.cK = u.a("/intro" + a + "/gameover/feedmore.png");
        m.cL = u.a("/intro" + a + "/gameover/boo-hoo.png");
        m.cM = u.a("/intro" + a + "/gameover/hungry.png");
        m.cG = u.a("/intro" + a + "/gameover/main_menu.png");
        m.cI = u.a("/intro" + a + "/gameover/title.png");
        m.cH = u.a("/intro" + a + "/gameover/try_again.png");
    }

    public final void a()
    {
        (m.e = a("/sounds/title.amr", "audio/amr", true, true)).start();
        return;
        JVM INSTR dup ;
        this;
        printStackTrace();
    }

    public final void b()
    {
        (m.e = a("/sounds/ingame.amr", "audio/amr", true, true)).start();
        return;
        JVM INSTR dup ;
        this;
        printStackTrace();
    }

    public static void c()
    {
        if(m.e != null)
        {
            System.out.println("====================>stop title sound");
            m.e.stop();
            m.e.close();
            m.e = null;
        }
        System.gc();
        return;
        JVM INSTR dup ;
        Exception exception;
        exception;
        printStackTrace();
    }

    public static void d()
    {
        if(m.f != null)
        {
            System.out.println("====================>stop ingame sound");
            m.f.stop();
            m.f.close();
            m.f = null;
        }
        System.gc();
        return;
        JVM INSTR dup ;
        Exception exception;
        exception;
        printStackTrace();
    }

    public static void e()
    {
        if(m.d != null)
        {
            System.out.println("====================>stop gameover sound");
            m.d.stop();
            m.d.close();
            m.d = null;
        }
        System.gc();
        return;
        JVM INSTR dup ;
        Exception exception;
        exception;
        printStackTrace();
    }

    public final void f()
    {
        this = this;
        Engine.b.e = new Image[6];
        m._flddo = u.a("/game/skydiver_open.png");
        for(int i1 = 0; i1 < Engine.b.e.length; i1++)
            Engine.b.e[i1] = u.a(m._flddo, 29 * (i1 % 6), 59 * (i1 / 6), 29, 59, 0);

        U = new i(this, e, 1, true);
        f = new Image[2];
        m.dp = u.a("/game/skydiver_open_frantic.png");
        for(int j1 = 0; j1 < f.length; j1++)
            f[j1] = u.a(m.dp, 29 * (j1 % 4), 0, 29, 59, 0);

        V = new i(this, f, 1, true);
        m.cF = u.a("/intro/paper.png");
        m.i = u.a(m.h = u.a("/intro/ship_smoke.png"), 0, 0, 11, 34, 0);
        m.j = u.a(m.h, 11, 0, 11, 34, 0);
        m.k = u.a(m.h, 22, 0, 11, 34, 0);
        m.h = null;
        m.af = u.a(m.ae = u.a("/intro/cloud_white.png"), 0, 0, m.ae.getWidth(), m.ae.getHeight() >> 1, 0);
        m.ag = u.a(m.ae, 0, m.ae.getHeight() >> 1, m.ae.getWidth(), m.ae.getHeight() >> 1, 0);
        m.ah = u.a("/intro/loading_skydiver_frantic.png");
        m.ai = u.a("/intro/loading_skydiver_open.png");
        m.aj = u.a("/intro/logo_big.png");
        aH = 122;
        aI = 31;
        aJ = 97;
        aK = 31;
        aL = 188;
        aM = 31;
        aN = 98;
        aO = 31;
        aP = 126;
        aQ = 31;
        m.ap = u.a("/intro/GER/menu_buttons/downman1.png");
        m.aq = u.a("/intro/GER/menu_buttons/upman1.png");
        m.ar = u.a("/intro/GER/menu_buttons/shark2.png");
        System.gc();
        m.as = u.a("/intro/water.png");
        m.az = u.a("/intro/skydiver_opening.png");
        m.aA = u.a("/intro/skydiver_open_blown_left.png");
        m.aC = u.a("/intro/ship_big.png");
        int k1 = (m.aH = u.a("/intro/cloud_rain.png")).getWidth();
        int l1 = m.aH.getHeight() >> 1;
        m.aI = u.a(m.aH, 0, 0, k1, l1, 0);
        m.aJ = u.a(m.aH, 0, l1, k1, l1, 0);
        m.aG = u.a("/intro/ufo.png");
        k1 = (m.aD = u.a("/intro/helicopter.png")).getWidth();
        l1 = m.aD.getHeight();
        m.aE = u.a(m.aD, 0, 0, k1, l1, 2);
        m.aF = u.a("/intro/ufo_beam.png");
        k1 = (m.aK = u.a("/intro/fish.png")).getWidth() >> 1;
        m.aL = u.a(m.aK, 0, 0, k1, 15, 0);
        m.aM = u.a(m.aK, k1, 0, k1, 15, 0);
        m.aN = u.a(m.aK, 0, 15, k1, 12, 0);
        m.aO = u.a(m.aK, k1, 15, k1, 12, 0);
        l1 = (m.aX = u.a("/intro/fish_puffed.png")).getHeight();
        m.aY = u.a(m.aX, 0, 0, 28, l1, 0);
        m.aZ = u.a(m.aX, 28, 0, 28, l1, 0);
        m.ba = u.a("/intro/stork.png");
        m.bc = u.a(m.bb = u.a("/intro/lifeicons.png"), 0, 0, 11, 11, 0);
        m.bd = u.a(m.bb, 11, 0, 11, 11, 0);
        m.be = u.a(m.bb, 0, 11, 33, 11, 0);
        u.a(m.bb, 35, 12, 9, 9, 0);
        m.bg = u.a(m.bf = u.a("/intro/divider.png"), 0, 0, 192, 3, 0);
        m.bh = u.a(m.bf, 0, 3, 192, 3, 0);
        m.bk = m.bi = m.bg;
        m.bl = m.bj = m.bh;
        m.bx = u.a(m.bm = u.a("/intro/EN/stats.png"), 0, 191, 27, 23, 0);
        m.by = u.a(m.bm, 27, 191, 27, 23, 0);
        m.bz = u.a(m.bm, 54, 193, 36, 18, 0);
        m.bA = u.a(m.bm, 90, 193, 36, 18, 0);
        m.bB = u.a(m.bm, 126, 193, 31, 17, 0);
        m.bC = u.a(m.bm, 158, 193, 31, 17, 0);
        m.bD = u.a(m.bm, 189, 193, 31, 17, 0);
        m.bE = u.a(m.bm, 220, 191, 23, 23, 0);
        m.bF = u.a(m.bm, 242, 191, 23, 23, 0);
        m.bG = u.a(m.bm, 265, 191, 23, 23, 0);
        m.bH = u.a(m.bm, 287, 191, 23, 23, 0);
        m.bI = u.a(m.bm, 0, 218, 24, 16, 0);
        m.bJ = u.a(m.bm, 26, 219, 24, 16, 0);
        m.bK = u.a(m.bm, 51, 218, 24, 16, 0);
        m.bL = u.a(m.bm, 77, 219, 24, 16, 0);
        m.bM = u.a(m.bm, 102, 218, 24, 16, 0);
        m.bN = u.a(m.bm, 128, 219, 24, 16, 0);
        m.bO = u.a(m.bm, 153, 218, 24, 16, 0);
        m.bP = u.a(m.bm, 179, 219, 24, 16, 0);
        m.bQ = u.a(m.bm, 0, 239, 103, 31, 0);
        m.bR = u.a(m.bm, 0, 271, 124, 31, 0);
        m.bS = u.a(m.bm, 103, 239, 103, 31, 0);
        m.bT = u.a(m.bm, 124, 270, 124, 31, 0);
        m.bm = null;
        System.gc();
        System.gc();
        m.bV = u.a("/intro/darken.png");
        m.bZ = u.a(m.bW = u.a("/intro/EN/options.png"), 152, 94, 30, 30, 0);
        m.ca = u.a(m.bW, 182, 94, 30, 30, 0);
        m.cb = u.a(m.bW, 212, 94, 30, 30, 0);
        m.cc = u.a(m.bW, 242, 94, 30, 30, 0);
        m.cd = u.a(m.bW, 272, 94, 30, 30, 0);
        m.ce = u.a(m.bW, 0, 92, 29, 33, 0);
        m.cf = u.a(m.bW, 31, 93, 29, 33, 0);
        m.cg = u.a(m.bW, 61, 92, 29, 33, 0);
        m.ch = u.a(m.bW, 90, 93, 29, 33, 0);
        m.ci = u.a(m.bW, 121, 93, 30, 31, 0);
        m.cj = u.a(m.bW, 304, 92, 25, 10, 0);
        m.ck = u.a(m.bW, 304, 107, 25, 10, 0);
        m.cn = u.a(m.bW, 240, 133, 44, 38, 0);
        m.co = u.a(m.bW, 285, 133, 44, 38, 0);
        m.cp = m.cn;
        m.cq = u.a(m.bW, 240, 176, 38, 18, 0);
        u.a(m.bW, 240, 176, 38, 18, 0);
        m.bW = null;
        System.gc();
        m.cv = u.a("/intro/nhl.png");
        m.cN = u.a("/intro/EN/gameover/shark_smile.png");
        m.cO = u.a("/intro/EN/gameover/shark_cry.png");
        if(Engine.c.b)
            m();
        m.ae = null;
        m.at = null;
        m.aw = null;
        m.aH = null;
        m.aK = null;
        m.aX = null;
        m.bb = null;
        m.bf = null;
        m.bm = null;
        m.bW = null;
        m._flddo = null;
        m.dp = null;
        System.gc();
        ad = 30;
        Z = 120;
        aa = -30;
        ab = 533;
    }

    public final void g()
    {
        m._flddo = null;
        m.dp = null;
        m.ae = null;
        m.af = null;
        m.ag = null;
        m.ah = null;
        m.ai = null;
        m.aj = null;
        m.ak = null;
        m.al = null;
        m.am = null;
        m.an = null;
        m.ao = null;
        m.ap = null;
        m.aq = null;
        m.ar = null;
        m.at = null;
        m.au = null;
        m.av = null;
        m.aw = null;
        m.ax = null;
        m.ay = null;
        m.az = null;
        m.aA = null;
        m.aH = null;
        m.aI = null;
        m.aJ = null;
        m.bf = null;
        m.bg = null;
        m.bh = null;
        m.bm = null;
        m.bn = null;
        m.bo = null;
        m.bp = null;
        m.bq = null;
        m.br = null;
        m.bs = null;
        m.bt = null;
        m.bu = null;
        m.bv = null;
        m.bw = null;
        m.bx = null;
        m.by = null;
        m.bz = null;
        m.bA = null;
        m.bB = null;
        m.bC = null;
        m.bD = null;
        m.bE = null;
        m.bF = null;
        m.bG = null;
        m.bH = null;
        m.bI = null;
        m.bJ = null;
        m.bK = null;
        m.bL = null;
        m.bM = null;
        m.bN = null;
        m.bO = null;
        m.bP = null;
        m.bQ = null;
        m.bR = null;
        m.bS = null;
        m.bT = null;
        m.bU = null;
        m.bW = null;
        m.bX = null;
        m.bY = null;
        m.bZ = null;
        m.ca = null;
        m.cb = null;
        m.cc = null;
        m.cd = null;
        m.ce = null;
        m.cf = null;
        m.cg = null;
        m.ch = null;
        m.ci = null;
        m.cj = null;
        m.ck = null;
        m.cl = null;
        m.cm = null;
        m.cn = null;
        m.co = null;
        m.cp = null;
        m.cq = null;
        m.cr = null;
        m.cs = null;
        m.ct = null;
        m.cu = null;
        m.cw = null;
        m.cx = null;
        m.cv = null;
        m.cG = null;
        m.cH = null;
        m.cI = null;
        m.cJ = null;
        m.cK = null;
        m.cL = null;
        m.cM = null;
        m.cN = null;
        m.cO = null;
        m.cP = null;
        m.cQ = null;
        m.cR = null;
        m.cS = null;
        m.cT = null;
        System.gc();
    }

    private void n()
    {
        e();
        d();
        c();
    }

    public final void a(int i1)
    {
        i1;
        JVM INSTR tableswitch 0 3: default 220
    //                   0 32
    //                   1 41
    //                   2 95
    //                   3 149;
           goto _L1 _L2 _L3 _L4 _L5
_L2:
        m.g = 0;
        n();
        return;
_L3:
        this = this;
        if(m.g == 1) goto _L7; else goto _L6
_L6:
        System.out.println("====================>play title sound");
        n();
        m.g = 1;
        (m.e = a("/sounds/title.amr", "audio/amr", true, true)).start();
          goto _L1
        JVM INSTR dup ;
        this;
        printStackTrace();
_L7:
        return;
_L4:
        this = this;
        if(m.g == 2) goto _L9; else goto _L8
_L8:
        System.out.println("====================>play ingame sound");
        n();
        m.g = 2;
        (m.f = a("/sounds/ingame.amr", "audio/amr", true, true)).start();
          goto _L1
        JVM INSTR dup ;
        this;
        printStackTrace();
_L9:
        return;
_L5:
        this = this;
        if(m.g == 3) goto _L1; else goto _L10
_L10:
        System.out.println("====================>play gameover sound");
        n();
        if(m.g == 1)
            m.g = 31;
        if(m.g == 2)
            m.g = 32;
        (m.d = a("/sounds/gameover.amr", "audio/amr", true, true)).start();
        return;
        JVM INSTR dup ;
        this;
        printStackTrace();
_L1:
    }

    public final void a(int i1, int j1)
    {
        if(d == 1)
        {
            aB = aB >= aw.length - 1 ? 0 : aB + 1;
            aA = e.a(aw[aB], E);
        }
        if(d == 99)
        {
            if(w.a(i1, j1, 70, 115, 100, 40))
            {
                b = 0;
                R = true;
            }
            if(w.a(i1, j1, 70, 155, 100, 40))
            {
                b = 1;
                R = true;
            }
            if(w.a(i1, j1, 70, 195, 100, 40))
            {
                b = 2;
                R = true;
            }
            if(w.a(i1, j1, 70, 235, 100, 40))
            {
                b = 3;
                R = true;
            }
            if(w.a(i1, j1, 70, 275, 100, 40))
            {
                b = 4;
                R = true;
            }
            if(w.a(i1, j1, 70, 315, 100, 40))
            {
                b = 5;
                R = true;
            }
            System.out.println("language=" + b);
        }
        if(d == 4 && bw)
        {
            if(w.a(i1, j1, bI, bJ, m.av.getWidth(), m.av.getHeight()))
            {
                h = true;
                bS = true;
                bw = false;
                bE = false;
                bF = false;
            }
            if(bD < 5 && w.a(i1, j1, bK, bL, m.ay.getWidth(), m.ay.getHeight()))
            {
                bT = true;
                bE = true;
                cd = true;
                bF = false;
                bw = false;
            }
            if(bD > 1 && w.a(i1, j1, cf, cg, m.ax.getWidth(), m.ax.getHeight()))
            {
                cd = false;
                ce = true;
                bF = true;
                bE = false;
                bw = false;
            }
        }
        if(d == 5 && bw)
        {
            if(w.a(i1, j1, bO, bP, m.av.getWidth(), m.av.getHeight()))
            {
                Engine.a.a();
                h = true;
                bS = true;
                bw = false;
            }
            if(S)
            {
                if(w.a(i1, j1, eb, ec, m.bT.getWidth(), m.bT.getHeight()))
                {
                    S = false;
                    ev = true;
                    t();
                    s();
                }
            } else
            if(w.a(i1, j1, dn, _flddo, m.bS.getWidth(), m.bS.getHeight()))
            {
                S = true;
                eu = true;
                t();
                s();
            }
            if(m.O)
            {
                if(w.a(i1, j1, dx - m.bs.getWidth() / 2, dy - m.bs.getHeight() / 2, m.bs.getWidth(), m.bs.getHeight()))
                {
                    m.O = false;
                    s();
                }
            } else
            if(w.a(i1, j1, ei - m.bq.getWidth() / 2, ej - m.bq.getHeight() / 2, m.bq.getWidth(), m.bq.getHeight()))
            {
                m.O = true;
                s();
            }
            if((et || es) && w.a(i1, j1, eo, ep, m.bv.getWidth(), m.bv.getHeight()))
            {
                er = false;
                es = false;
                et = false;
            }
            if(er)
            {
                if(et && w.a(i1, j1, em, en, m.bt.getWidth(), m.bt.getHeight()))
                {
                    er = false;
                    es = false;
                    et = false;
                    b b1;
                    if((b1 = this).S)
                        m.I = 0;
                    else
                        m.F = 0;
                    Engine.a.a();
                    t();
                }
                if(es && w.a(i1, j1, em, en, m.bt.getWidth(), m.bt.getHeight()))
                {
                    er = false;
                    es = false;
                    et = false;
                    b b2;
                    if((b2 = this).S)
                    {
                        m.J = 0;
                        m.K = 0;
                        m.I = 0;
                        m.l = 0;
                        m.m = 0;
                        m.n = 0;
                        m.o = 0;
                        m.p = 0;
                        m.q = 0;
                        m.r = 0;
                        m.s = 0;
                        m.t = 0;
                        m.u = 0;
                    } else
                    {
                        m.G = 0;
                        m.H = 0;
                        m.F = 0;
                        m.v = 0;
                        m.w = 0;
                        m.x = 0;
                        m.y = 0;
                        m.z = 0;
                        m.A = 0;
                        m.B = 0;
                        m.C = 0;
                        m.D = 0;
                        m.E = 0;
                    }
                    Engine.a.a();
                    t();
                    s();
                }
                if(er && !es && !et && w.a(i1, j1, dX, dY, m.bo.getWidth(), m.bo.getHeight()))
                {
                    ew = true;
                    es = true;
                }
                if(er && !et && !es && w.a(i1, j1, ek, el, m.bn.getWidth(), m.bn.getHeight()))
                {
                    ex = true;
                    et = true;
                }
            } else
            if(w.a(i1, j1, dV, dW, m.bU.getWidth(), m.bU.getHeight()))
            {
                ey = true;
                er = true;
            }
        }
        if(d == 7 && bw)
        {
            if(w.a(i1, j1, bO, bP, m.av.getWidth(), m.av.getHeight()))
            {
                Engine.a.a();
                h = true;
                bS = true;
                bw = false;
            }
            if(w.a(i1, j1, ff, fg, m.cn.getWidth(), m.cn.getHeight()))
                m.N = false;
            if(w.a(i1, j1, fh, fi, m.cn.getWidth(), m.cn.getHeight()))
                m.N = true;
            if(w.a(i1, j1, fx, fy, m.cn.getWidth(), m.cn.getHeight()))
            {
                a(0);
                Engine.c.a();
            }
            if(w.a(i1, j1, fB, fC, m.cn.getWidth(), m.cn.getHeight()))
            {
                a(1);
                Engine.c.a();
            }
            if(w.a(i1, j1, fD + 4, fE - 8, m.cq.getWidth(), m.cq.getHeight()))
            {
                a(1);
                Engine.c.a();
            }
            if(w.a(i1, j1, fF + 4, fG - 8, m.cq.getWidth(), m.cq.getHeight()))
            {
                a(2);
                Engine.c.a();
            }
            if(eX != 0 && w.a(i1, j1, fl, fm - 10, m.cr.getWidth(), m.cr.getHeight()))
            {
                eX = 0;
                m.L = true;
                m.M = false;
            }
            if(eX != 1 && w.a(i1, j1, fn - 10, fo - 10, m.cl.getWidth(), m.cl.getHeight()))
            {
                eX = 1;
                m.L = false;
                m.M = false;
            }
            if(eX != 2 && w.a(i1, j1, fp - 10, fq - 10, m.cu.getWidth(), m.cu.getHeight()))
            {
                eX = 2;
                m.M = true;
            }
            if(w.a(i1, j1, fs, ft, m.bX.getWidth(), m.bX.getHeight()))
            {
                fa = true;
                h = true;
                eY = true;
                bw = false;
            }
        }
        if(d == 71 && bw && w.a(i1, j1, bO, bP, m.av.getWidth(), m.av.getHeight()))
        {
            h = true;
            bS = true;
            bw = false;
        }
        if(d == 72 && bw && w.a(i1, j1, bO, bP, m.av.getWidth(), m.av.getHeight()))
        {
            h = true;
            bS = true;
            bw = false;
        }
        if(d == 999 && bw)
        {
            if(w.a(i1, j1, o, p, m.cG.getWidth(), m.cG.getHeight()))
            {
                if(m.g == 31)
                    a(1);
                if(m.g == 32)
                    a(2);
                bw = false;
                h = true;
                X = false;
            }
            if(w.a(i1, j1, w, x, m.cH.getWidth(), m.cH.getHeight()))
            {
                if(m.g == 31)
                    a(1);
                if(m.g == 32)
                {
                    a(2);
                    m.g = 2;
                }
                bw = false;
                h = true;
                X = true;
            }
        }
        if(d == 1000 && bw)
        {
            if(w.a(i1, j1, bO, bP, m.av.getWidth(), m.av.getHeight()))
            {
                fJ = true;
                Engine.a.a();
                h = true;
                bS = true;
                bw = false;
            }
            if(w.a(i1, j1, eJ, eK, m.cP.getWidth(), m.cP.getHeight()))
            {
                m.S = true;
                fJ = false;
                h = true;
                m.L = true;
                eX = 0;
                eV = true;
                bw = false;
            }
            if(w.a(i1, j1, eL, eM, m.cQ.getWidth(), m.cQ.getHeight()))
            {
                m.S = true;
                fJ = false;
                h = true;
                m.L = false;
                eX = 1;
                eW = true;
                bw = false;
            }
            if(w.a(i1, j1, eN, eO - 5, m.cS.getWidth() + 10, m.cS.getHeight() + 20))
            {
                eX = 2;
                if(!(m.M = !m.M))
                    eX = 1;
                bw = false;
            }
        }
        if(d == 2 && bw)
        {
            if(m.a && w.a(i1, j1, 120 - m.al.getWidth() / 2, aZ - bp, aP, aQ))
            {
                aV = true;
                bv = 9;
                bw = false;
                m.S = true;
                m.a = false;
            }
            if(w.a(i1, j1, 120 - m.am.getWidth() / 2, aZ, aH, aI))
            {
                aR = true;
                bv = 1;
                bw = false;
                if(!m.M)
                {
                    m.S = true;
                    m.a = false;
                }
            }
            if(w.a(i1, j1, 120 - m.ak.getWidth() / 2, aZ + bp, aJ, aK))
            {
                aS = true;
                bv = 2;
                bw = false;
            }
            if(w.a(i1, j1, 120 - m.ak.getWidth() / 2, aZ + (bp << 1), aL, aM))
            {
                aT = true;
                bv = 3;
                bw = false;
            }
            if(w.a(i1, j1, 120 - m.an.getWidth() / 2, aZ + bp * 3, aN, aO))
            {
                aU = true;
                bv = 5;
                bw = false;
            }
        }
    }

    public final void b(int i1, int j1)
    {
        aV = false;
        aR = false;
        aS = false;
        aT = false;
        aU = false;
        bS = false;
        bT = false;
        ce = false;
        eu = false;
        ev = false;
        ew = false;
        ex = false;
        ey = false;
        eY = false;
        eV = false;
        eW = false;
    }

    public final void a(Graphics g1)
    {
        b b1;
        (b1 = this).T = b1.T >= 2000 ? 0 : b1.T + 1;
label0:
        switch((b1 = this).d)
        {
        case 0: // '\0'
        case 6: // '\006'
        case 8: // '\b'
        case 99: // 'c'
        default:
            break;

        case 10: // '\n'
            b b2;
            if((b2 = b1).ae)
            {
                if(b2.aa <= -m.ad.getHeight() / 2 && b2.ab >= 533)
                {
                    b2.d = 99;
                    break;
                }
                b2.ad += 4;
                if(b2.aa > 143)
                    b2.aa--;
                else
                    b2.aa -= b2.ad;
                if(b2.ab < 288)
                    b2.ab++;
                else
                    b2.ab += b2.ad;
                break;
            }
            if(b2.aa + b2.ad < 143)
                b2.aa += b2.ad;
            else
            if(b2.aa >= 143)
            {
                if(b2.aa + 1 < 158)
                    b2.aa++;
                else
                if(b2.ac < 20)
                {
                    b2.ac++;
                } else
                {
                    b2.ae = true;
                    b2.ad = 5;
                }
            } else
            {
                b2.aa = 143;
            }
            if(b2.ab - b2.ad > 288)
            {
                b2.ab -= b2.ad;
                break;
            }
            if(b2.ab <= 288)
            {
                if(b2.ab - 1 > 273)
                    b2.ab--;
            } else
            {
                b2.ab = 288;
            }
            break;

        case 1: // '\001'
            b b3;
            if(!(b3 = b1).aE)
            {
                if(b3.aj < b3.ak + 5)
                    b3.aD = 1;
                else
                    b3.aD += 5;
            } else
            {
                b3.aD++;
            }
            if(!b3.aE)
                b3.aj = b3.aj <= b3.ak ? b3.ak : b3.aj - b3.aD;
            else
                b3.aj = b3.aj <= -113 ? -113 : b3.aj - b3.aD;
            b3.ai = b3.ai <= b3.aC ? b3.aC : b3.ai - b3.aD;
            if(!b3.aE)
                b3.aG = 400 + m.af.getHeight();
            else
                b3.aG = -m.af.getHeight();
            b3.af = b3.af <= -m.af.getHeight() ? b3.aG : b3.af - 15;
            if(!b3.aE)
                b3.aG = 400 + m.ag.getHeight();
            else
                b3.aG = -m.ag.getHeight();
            b3.ag = b3.ag <= -m.ag.getHeight() ? b3.aG : b3.ag - 15;
            break;

        case 2: // '\002'
            b b4 = b1;
            if(m.S)
            {
                m.Q = m.Q <= -30 ? -30 : m.Q - 2;
                m.R = m.R <= -20 ? -20 : m.R - 2;
            } else
            {
                m.Q = m.Q >= 0 ? 0 : m.Q + 2;
                m.R = m.R >= 0 ? 0 : m.R + 2;
            }
            if(b4.bv == 0)
            {
                if(b4.bo + b4.bq > b4.aZ + 10)
                    b4.bq += 10;
                else
                    b4.bq = 1;
                if(b4.ba + b4.br > b4.aW + 10)
                    b4.br += 2;
                else
                    b4.br = 1;
                if(b4.bc + b4.bs < -10)
                    b4.bs += 2;
                else
                    b4.bs = 1;
                if(b4.be + b4.bt < -10)
                    b4.bt += 2;
                else
                    b4.bt = 1;
                b4.ba = b4.ba <= b4.aW ? b4.aW : b4.ba - b4.br;
                b4.bc = b4.bc >= 0 ? 0 : b4.bc + b4.bs;
                b4.be = b4.be >= 0 ? 0 : b4.be + b4.bt;
                b4.bo = b4.bo - b4.bq <= b4.aZ ? b4.aZ : b4.bo - b4.bq;
                if(b4.bo == b4.aZ)
                    b4.bw = true;
                break;
            }
            if(b4.ba + b4.br > b4.aW + 10)
                b4.br -= 2;
            else
                b4.br = -1;
            if(b4.bc + b4.bs < -10)
                b4.bs -= 2;
            else
                b4.bs = -1;
            if(b4.be + b4.bt < -10)
                b4.bt -= 2;
            else
                b4.bt = -1;
            if(b4.ai + b4.aD < b4.aC - 10)
                b4.aD -= 2;
            else
                b4.aD = -1;
            b4.bu = 1;
            if(b4.bj + b4.bq < 110)
                b4.bq -= 3;
            else
                b4.bq = -1;
            b4.bi = b4.bi >= 400 + m.al.getWidth() ? 400 + m.al.getWidth() : b4.bi - b4.bq;
            b4.bj = b4.bj <= -m.ao.getWidth() ? -m.ao.getWidth() : b4.bj + b4.bq;
            b4.bk = b4.bk >= 400 + m.am.getWidth() ? 400 + m.am.getWidth() : b4.bk - b4.bq;
            b4.bl = b4.bl <= -m.ak.getWidth() ? -m.ak.getWidth() : b4.bl + b4.bq;
            b4.bm = b4.bm >= 400 + m.an.getWidth() ? 400 + m.an.getWidth() : b4.bm - b4.bq;
            b4.bn = b4.bn >= 520 ? 520 : b4.bn - b4.bq;
            b4.ai = b4.ai <= -m.aj.getHeight() ? -m.aj.getHeight() : b4.ai + b4.aD;
            b4.bh = b4.bh >= 400 + m.as.getHeight() ? 400 + m.as.getHeight() : b4.bh + b4.bu;
            b4.ba = b4.ba >= 400 ? 400 : b4.ba - b4.br;
            b4.bc = b4.bc <= -m.aq.getWidth() ? -m.aq.getWidth() : b4.bc + b4.bs;
            b4.be = b4.be <= -m.ar.getWidth() ? -m.ar.getWidth() : b4.be + b4.bt;
            if(b4.ai != -m.aj.getHeight() || b4.bn != 520)
                break;
            switch(b4.bv)
            {
            case 4: // '\004'
            case 6: // '\006'
            case 7: // '\007'
            case 8: // '\b'
            default:
                break;

            case 9: // '\t'
                if(m.Q == -30)
                {
                    b b9 = b4;
                    Engine.c.b = false;
                    Engine.c.D = 0;
                    Engine.c.E = 0;
                    Engine.c.H = true;
                    Engine.c.I = false;
                    k.a(Engine.c, false, false, true);
                    b9.c = true;
                }
                break label0;

            case 1: // '\001'
                if(m.M)
                {
                    b b10;
                    b b15;
                    (b15 = b10 = b4).j = 0;
                    b15.k = 0;
                    b15.bU = 0;
                    b15.bV = 0;
                    b15.bH = 159;
                    b15.bI = 9;
                    b15.bJ = 28;
                    b15.bM = 399;
                    b15.bN = 28;
                    b15.bO = -231;
                    b15.bP = 28;
                    b15.eP = -205;
                    b15.eQ = 64;
                    b15.eJ = -150;
                    b15.eK = 154;
                    b15.eL = -159;
                    b15.eM = 256;
                    b15.eN = 312;
                    b15.eO = 294;
                    b15.eR = 345;
                    b15.eS = 92;
                    b15.eT = 311;
                    b15.eU = 192;
                    b10.d = 1000;
                    b10.h = false;
                    break label0;
                }
                if(m.Q == -30)
                    b4.p();
                break label0;

            case 2: // '\002'
                boolean flag = true;
                b b11 = b4;
                b b19 = b4;
                b4.bD = 1;
                b19.bU = 0;
                b19.bV = 0;
                b19.bW = 0;
                b19.bE = false;
                b19.bF = false;
                b19.bC = 200;
                b19.bH = 159;
                b19.bI = 9;
                b19.bJ = 28;
                b19.bK = 152;
                b19.bL = 339;
                b19.bG = -450;
                b19.bM = 400 + m.au.getWidth();
                b19.bN = 28;
                b19.bO = -m.av.getWidth();
                b19.bP = 28;
                b19.bQ = 400 + m.ay.getWidth();
                b19.bR = 339;
                switch(b19.b)
                {
                case 0: // '\0'
                    b19.F = 150;
                    b19.G = 150;
                    b19.H = 150;
                    b19.I = 150;
                    b19.J = 150;
                    break;

                case 1: // '\001'
                    b19.F = 150;
                    b19.G = 200;
                    b19.H = 150;
                    b19.I = 150;
                    b19.J = 170;
                    break;

                case 2: // '\002'
                    b19.F = 150;
                    b19.G = 180;
                    b19.H = 180;
                    b19.I = 150;
                    b19.J = 160;
                    b19.K = -10;
                    b19.L = -20;
                    break;

                case 3: // '\003'
                    b19.F = 150;
                    b19.G = 180;
                    b19.H = 150;
                    b19.I = 150;
                    b19.J = 160;
                    break;

                case 4: // '\004'
                    b19.F = 150;
                    b19.G = 180;
                    b19.H = 180;
                    b19.I = 150;
                    b19.J = 160;
                    b19.K = -10;
                    b19.L = -20;
                    break;

                case 5: // '\005'
                    b19.F = 150;
                    b19.G = 180;
                    b19.H = 180;
                    b19.I = 150;
                    b19.J = 160;
                    b19.K = -10;
                    b19.L = -20;
                    break;
                }
                b19.bx = e.a(b19.ax[0], b19.F);
                b19.by = e.a(b19.ax[1], b19.G);
                b19.bz = e.a(b19.ax[2], b19.H);
                b19.bA = e.a(b19.ax[3], b19.I);
                b19.bB = e.a(b19.ax[4], b19.J);
                b11.q();
                b11.d = 4;
                b11.h = false;
                break;

            case 3: // '\003'
                Engine.a.b();
                b b12;
                b b16;
                (b16 = b12 = b4).t();
                b16.s();
                b16.er = false;
                b16.es = false;
                b16.et = false;
                b16.bO = -226;
                b16.bP = 21;
                b16.dl = -170;
                b16.dm = 58;
                b16.dn = -227;
                b16._flddo = 91;
                b16.dp = -208;
                b16.dq = 120;
                b16.dr = -208;
                b16.ds = 134;
                b16.dt = -208;
                b16.du = 148;
                b16.dv = -238;
                b16.dw = 174;
                b16.dx = -183 + m.bs.getWidth() / 2;
                b16.dy = 170 + m.bs.getHeight() / 2;
                b16.dz = -208;
                b16.dA = 201;
                b16.dB = -169;
                b16.dC = 204;
                b16.dD = -124;
                b16.dE = 203;
                b16.dH = -81;
                b16.dI = 203;
                b16.dF = -44;
                b16.dG = 207;
                b16.dJ = -208;
                b16.dK = 210;
                b16.dL = -169;
                b16.dM = 210;
                b16.dN = -124;
                b16.dO = 210;
                b16.dP = -81;
                b16.dQ = 210;
                b16.dR = -44;
                b16.dS = 210;
                b16.dT = -220;
                b16.dU = 246;
                b16.dV = -192;
                b16.dW = 288;
                b16.dX = -238;
                b16.dY = 292;
                b16.dZ = -240;
                b16.ea = 296;
                b16.bM = 391;
                b16.bN = 23;
                b16.eb = 352;
                b16.ec = 90;
                b16.ed = 450;
                b16.ee = 450;
                b16.ef = 450;
                b16.eg = 260;
                b16.eh = 163;
                b16.ei = 398 + m.bq.getWidth() / 2;
                b16.ej = 171 + m.bq.getHeight() / 2;
                b16.i = 252;
                b16.ek = 329;
                b16.el = 292;
                b16.em = 361;
                b16.en = 290;
                b16.eo = 423;
                b16.ep = 290;
                b16.eq = 252;
                b16.j = 0;
                b16.k = 0;
                b12.d = 5;
                b12.h = false;
                break;

            case 5: // '\005'
                b b13;
                b b17;
                (b17 = b13 = b4).eZ = false;
                b17.fa = false;
                b17.j = 0;
                b17.k = 0;
                b17.bO = -232;
                b17.bP = 14;
                b17.fb = -188;
                b17.fc = 51;
                b17.fd = -213;
                b17.fe = 93;
                b17.ff = -212;
                b17.fg = 113;
                b17.fh = -172;
                b17.fi = 113;
                b17.dT = -217;
                b17.dU = 151;
                b17.fw = -217;
                b17.fj = -166;
                b17.fk = 157;
                b17.fl = -217;
                b17.fm = 185;
                b17.fn = -162;
                b17.fo = 185;
                b17.fp = -96;
                b17.fq = 186;
                b17.fr = -214;
                b17.fs = -196;
                b17.ft = 257;
                b17.bM = 404;
                b17.bN = 17;
                b17.eg = 265;
                b17.eh = 83;
                b17.fx = 363;
                b17.fy = 115;
                b17.fz = 370;
                b17.fA = 94;
                b17.fB = 404;
                b17.fC = 115;
                b17.fD = 442;
                b17.fE = 120;
                b17.fF = 442;
                b17.fG = 134;
                b17.fu = 263;
                b17.fv = 208;
                b17.fH = 292;
                b17.fI = 415;
                b13.d = 7;
                b13.h = false;
                break;
            }
            break;

        case 4: // '\004'
            b1.r();
            break;

        case 5: // '\005'
            b b5;
            if(!(b5 = b1).h)
            {
                if(b5.bO < 4)
                    b5.j += 5;
                else
                    b5.j = 1;
                if(b5.bM > 161)
                    b5.k -= 5;
                else
                    b5.k = -1;
                b5.bO = b5.bO >= 14 ? 14 : b5.bO + b5.j;
                if(b5.bO + b5.j < 14)
                {
                    b5.dT += b5.j;
                    b5.dl += b5.j;
                    b5.dn += b5.j;
                    b5.dp += b5.j;
                    b5.dr += b5.j;
                    b5.dt += b5.j;
                    b5.dv += b5.j;
                    b5.dx += b5.j;
                    b5.dz += b5.j;
                    b5.dB += b5.j;
                    b5.dD += b5.j;
                    b5.dH += b5.j;
                    b5.dF += b5.j;
                    b5.dJ += b5.j;
                    b5.dL += b5.j;
                    b5.dN += b5.j;
                    b5.dP += b5.j;
                    b5.dR += b5.j;
                    b5.dV += b5.j;
                    b5.dX += b5.j;
                    b5.dZ += b5.j;
                } else
                {
                    b5.bO = 14;
                    b5.dT = 20;
                    b5.dl = 70;
                    b5.dn = 13;
                    b5.dp = 32;
                    b5.dr = 32;
                    b5.dt = 32;
                    b5.dv = 2;
                    b5.dx = 57 + m.bs.getWidth() / 2;
                    b5.dz = 32;
                    b5.dB = 71;
                    b5.dD = 116;
                    b5.dH = 159;
                    b5.dF = 196;
                    b5.dJ = 32;
                    b5.dL = 71;
                    b5.dN = 116;
                    b5.dP = 159;
                    b5.dR = 196;
                    b5.dV = 48;
                    b5.dX = 2;
                    b5.dZ = 0;
                    b5.bw = true;
                }
                if(b5.bM + b5.k > 151)
                {
                    b5.eg += b5.k;
                    b5.bM += b5.k;
                    b5.eb += b5.k;
                    b5.ed += b5.k;
                    b5.ee += b5.k;
                    b5.ef += b5.k;
                    b5.ei += b5.k;
                    b5.i += b5.k;
                    b5.ek += b5.k;
                    b5.em += b5.k;
                    b5.eo += b5.k;
                    b5.eq += b5.k;
                } else
                {
                    b5.eg = 20;
                    b5.bM = 151;
                    b5.eb = 112;
                    b5.ed = 210;
                    b5.ee = 210;
                    b5.ef = 210;
                    b5.ei = 158 + m.bq.getWidth() / 2;
                    b5.i = 12;
                    b5.ek = 89;
                    b5.em = 121;
                    b5.eo = 183;
                    b5.eq = 12;
                }
                break;
            }
            if(b5.bO < 4)
                b5.j -= 5;
            else
                b5.j = -1;
            if(b5.bM > 161)
                b5.k += 5;
            else
                b5.k = 1;
            b5.bO = b5.bO <= -226 ? -226 : b5.bO + b5.j;
            if(b5.bO + b5.j > -226)
            {
                b5.dT += b5.j;
                b5.dl += b5.j;
                b5.dn += b5.j;
                b5.dp += b5.j;
                b5.dr += b5.j;
                b5.dt += b5.j;
                b5.dv += b5.j;
                b5.dx += b5.j;
                b5.dz += b5.j;
                b5.dB += b5.j;
                b5.dD += b5.j;
                b5.dH += b5.j;
                b5.dF += b5.j;
                b5.dJ += b5.j;
                b5.dL += b5.j;
                b5.dN += b5.j;
                b5.dP += b5.j;
                b5.dR += b5.j;
                b5.dV += b5.j;
                b5.dX += b5.j;
                b5.dZ += b5.j;
            } else
            {
                b5.dT = -220;
                b5.dl = -170;
                b5.dn = -227;
                b5.dp = -208;
                b5.dr = -208;
                b5.dt = -208;
                b5.dv = -238;
                b5.dx = -183 + m.bs.getWidth() / 2;
                b5.dz = -208;
                b5.dB = -169;
                b5.dD = -124;
                b5.dH = -81;
                b5.dF = -44;
                b5.dJ = -208;
                b5.dL = -169;
                b5.dN = -124;
                b5.dP = -81;
                b5.dR = -44;
                b5.dV = -192;
                b5.dX = -238;
                b5.dZ = -240;
                b5.bw = true;
                b5.h();
            }
            if(b5.bM + b5.k < 391)
            {
                b5.eg += b5.k;
                b5.bM += b5.k;
                b5.eb += b5.k;
                b5.ed += b5.k;
                b5.ee += b5.k;
                b5.ef += b5.k;
                b5.ei += b5.k;
                b5.i += b5.k;
                b5.ek += b5.k;
                b5.em += b5.k;
                b5.eo += b5.k;
                b5.eq += b5.k;
            } else
            {
                b5.eg = 260;
                b5.bM = 391;
                b5.eb = 352;
                b5.ed = 450;
                b5.ee = 450;
                b5.ef = 450;
                b5.ei = 398 + m.bq.getWidth() / 2;
                b5.i = 252;
                b5.ek = 329;
                b5.em = 361;
                b5.eo = 423;
                b5.eq = 252;
            }
            break;

        case 7: // '\007'
            b b6;
            if(!(b6 = b1).h)
            {
                if(b6.bO < -2)
                    b6.j += 3;
                else
                    b6.j = 1;
                if(b6.bM > 174)
                    b6.k -= 3;
                else
                    b6.k = -1;
                b6.bO = b6.bO >= 8 ? 8 : b6.bO + b6.j;
                if(b6.bO + b6.j < 8)
                {
                    b6.bO += b6.j;
                    b6.fb += b6.j;
                    b6.fd += b6.j;
                    b6.ff += b6.j;
                    b6.fh += b6.j;
                    b6.fj += b6.j;
                    b6.fl += b6.j;
                    b6.fn += b6.j;
                    b6.fp += b6.j;
                    b6.fr += b6.j;
                    b6.fs += b6.j;
                    b6.dT += b6.j;
                    b6.fw += b6.j;
                } else
                {
                    b6.bO = 8;
                    b6.fb = 52;
                    b6.fd = 27;
                    b6.ff = 28;
                    b6.fh = 68;
                    b6.dT = 23;
                    b6.fw = 23;
                    b6.fj = 74;
                    b6.fl = 23;
                    b6.fn = 78;
                    b6.fp = 144;
                    b6.fr = 26;
                    b6.fs = 44;
                    b6.bw = true;
                }
                if(b6.bM + b6.k > 164)
                {
                    b6.bM += b6.k;
                    b6.fx += b6.k;
                    b6.fz += b6.k;
                    b6.fB += b6.k;
                    b6.fD += b6.k;
                    b6.fF += b6.k;
                    b6.eg += b6.k;
                    b6.fu += b6.k;
                    b6.fH += b6.k;
                    b6.fI += b6.k;
                } else
                {
                    b6.bM = 164;
                    b6.fx = 123;
                    b6.fz = 130;
                    b6.fB = 164;
                    b6.fD = 202;
                    b6.fF = 202;
                    b6.eg = 25;
                    b6.fu = 23;
                    b6.fH = 52;
                    b6.fI = 175;
                }
                break;
            }
            if(b6.bO < -2)
                b6.j -= 3;
            else
                b6.j = -1;
            if(b6.bM > 174)
                b6.k += 3;
            else
                b6.k = 1;
            b6.bO = b6.bO <= -232 ? -232 : b6.bO + b6.j;
            if(b6.bO + b6.j > -282)
            {
                b6.bO += b6.j;
                b6.fb += b6.j;
                b6.fd += b6.j;
                b6.ff += b6.j;
                b6.fh += b6.j;
                b6.fj += b6.j;
                b6.fl += b6.j;
                b6.fn += b6.j;
                b6.fp += b6.j;
                b6.fr += b6.j;
                b6.fs += b6.j;
                b6.dT += b6.j;
                b6.fw += b6.j;
            } else
            {
                b6.bO = -232;
                b6.fb = -188;
                b6.fd = -213;
                b6.ff = -212;
                b6.fh = -172;
                b6.dT = -217;
                b6.fw = -217;
                b6.fj = -166;
                b6.fl = -217;
                b6.fn = -162;
                b6.fp = -96;
                b6.fr = -214;
                b6.fs = -196;
                b6.bw = true;
                if(b6.fa)
                {
                    b b14;
                    b b18;
                    (b18 = b14 = b6).j = 0;
                    b18.k = 0;
                    b18.bO = -232;
                    b18.bP = 14;
                    b18.fO = -159;
                    b18.fP = 62;
                    b18.fM = -200;
                    b18.fN = 288;
                    b18.bM = 404;
                    b18.bN = 17;
                    b18.fK = 260;
                    b18.fL = 100;
                    b14.d = 71;
                    b14.h = false;
                } else
                {
                    b6.h();
                }
            }
            if(b6.bM + b6.k < 404)
            {
                b6.bM += b6.k;
                b6.fx += b6.k;
                b6.fz += b6.k;
                b6.fB += b6.k;
                b6.fD += b6.k;
                b6.fF += b6.k;
                b6.fu += b6.k;
                b6.fH += b6.k;
                b6.fI += b6.k;
                b6.eg += b6.k;
                b6.fu += b6.k;
            } else
            {
                b6.bM = 404;
                b6.fx = 363;
                b6.fz = 370;
                b6.fB = 404;
                b6.fD = 442;
                b6.fF = 442;
                b6.eg = 265;
                b6.fu = 263;
                b6.fH = 292;
                b6.fI = 415;
            }
            break;

        case 71: // 'G'
            b b7;
            if(!(b7 = b1).h)
            {
                if(b7.bO < -2)
                    b7.j += 3;
                else
                    b7.j = 1;
                if(b7.bM > 174)
                    b7.k -= 3;
                else
                    b7.k = -1;
                b7.bO = b7.bO >= 8 ? 8 : b7.bO + b7.j;
                if(b7.bO + b7.j < 8)
                {
                    b7.bO += b7.j;
                    b7.fO += b7.j;
                    b7.fM += b7.j;
                } else
                {
                    b7.bO = 8;
                    b7.fO = 81;
                    b7.fM = 40;
                    b7.bw = true;
                }
                if(b7.bM + b7.k > 164)
                {
                    b7.bM += b7.k;
                    b7.fK += b7.k;
                } else
                {
                    b7.bM = 164;
                    b7.fK = 20;
                }
                break;
            }
            if(b7.bO < -2)
                b7.j -= 3;
            else
                b7.j = -1;
            if(b7.bM > 174)
                b7.k += 3;
            else
                b7.k = 1;
            b7.bO = b7.bO <= -232 ? -232 : b7.bO + b7.j;
            if(b7.bO + b7.j > -282)
            {
                b7.bO += b7.j;
                b7.fO += b7.j;
                b7.fM += b7.j;
            } else
            {
                b7.bO = -232;
                b7.fO = -159;
                b7.fM = -200;
                b7.bw = true;
                b7.h();
            }
            if(b7.bM + b7.k < 404)
            {
                b7.bM += b7.k;
                b7.fK += b7.k;
            } else
            {
                b7.bM = 404;
                b7.fK = 260;
            }
            break;

        case 999: 
            b b8;
            if(!(b8 = b1).h)
            {
                if(b8.o < 2)
                    b8.j += 3;
                else
                    b8.j = 1;
                if(b8.y > 24)
                    b8.k -= 3;
                else
                    b8.k = -1;
                b8.o = b8.o >= 12 ? 12 : b8.o + b8.j;
                if(b8.o + b8.j < 12)
                {
                    b8.l += b8.j;
                    b8.o += b8.j;
                    b8.q += b8.j;
                    b8.s += b8.j;
                    b8.u += b8.j;
                } else
                {
                    b8.l = 120;
                    b8.o = 12;
                    b8.q = 23;
                    b8.s = 164;
                    b8.u = 82;
                    b8.bw = true;
                }
                if(b8.y + b8.k > 14)
                {
                    b8.w += b8.k;
                    b8.y += b8.k;
                    b8.i += b8.k;
                } else
                {
                    b8.w = 129;
                    b8.y = 14;
                    b8.i = 9;
                }
                break;
            }
            if(b8.o < 2)
                b8.j -= 3;
            else
                b8.j = -1;
            if(b8.y > 14)
                b8.k += 3;
            else
                b8.k = 1;
            b8.o = b8.o <= -228 ? -228 : b8.o + b8.j;
            if(b8.o + b8.j > -228)
            {
                b8.l += b8.j;
                b8.o += b8.j;
                b8.q += b8.j;
                b8.s += b8.j;
                b8.u += b8.j;
            } else
            {
                b8.l = -120;
                b8.o = -228;
                b8.q = -217;
                b8.s = -76;
                b8.u = -158;
                b8.bw = true;
                if(b8.X)
                    b8.p();
                else
                    b8.h();
            }
            if(b8.y + b8.k < 254)
            {
                b8.w += b8.k;
                b8.y += b8.k;
                b8.i += b8.k;
            } else
            {
                b8.w = 369;
                b8.y = 254;
                b8.i = 249;
            }
            break;

        case 1000: 
            b1.u();
            break;
        }
        Graphics g2 = g1;
        b1 = this;
        g2.setColor(0xffffff);
        g2.fillRect(0, 0, 240, 400);
        int i1 = 240 / m.cF.getWidth();
        int j1 = 400 / m.cF.getHeight();
        if(b1.d != 0)
        {
            for(int k1 = 0; k1 < i1; k1++)
                for(this = 0; this < j1; this++)
                    g2.drawImage(m.cF, k1 * m.cF.getWidth(), this * m.cF.getHeight(), 0);


        }
        if(b1.c)
            Engine.g.a(g2, b1.g + "...", 120, 200, 3);
        switch(b1.d)
        {
        default:
            break;

        case 0: // '\0'
            g1 = g2;
            this = b1;
            if(b1.O < 50)
            {
                O++;
                if(m.U == null)
                    m.U = u.a("/samsung.png");
                g1.drawImage(m.U, 120, 200, 3);
            } else
            {
                O = 0;
                d = 10;
                m.U = null;
                System.gc();
                return;
            }
            break;

        case 10: // '\n'
            g1 = g2;
            this = b1;
            if(m.ad == null)
                m.ad = u.a("/loadonce/fdg.png");
            if(T % 2 == 0)
            {
                g1.drawImage(m.ad, Z, aa, 3);
            } else
            {
                g1.drawImage(m.ad, Z + 1, aa, 3);
                return;
            }
            break;

        case 99: // 'c'
            b1.b(g2);
            return;

        case 1: // '\001'
            b1.c(g2);
            return;

        case 2: // '\002'
            if(!b1.c)
            {
                b1.d(g2);
                return;
            }
            break;

        case 4: // '\004'
            b1.e(g2);
            return;

        case 5: // '\005'
            b1.f(g2);
            return;

        case 6: // '\006'
            return;

        case 7: // '\007'
            b1.g(g2);
            return;

        case 71: // 'G'
            b1.h(g2);
            return;

        case 8: // '\b'
            return;

        case 999: 
            if(!b1.c)
            {
                b1.j(g2);
                return;
            }
            break;

        case 1000: 
            if(!b1.c)
                b1.i(g2);
            break;
        }
    }

    private String a(String s1)
    {
        P = new StringBuffer(s1);
        for(s1 = 0; s1 < P.length(); s1++)
        {
            if(P.charAt(s1) == '\340')
                P.setCharAt(s1, '\203');
            if(P.charAt(s1) == '\342')
                P.setCharAt(s1, '\204');
            if(P.charAt(s1) == '\341')
                P.setCharAt(s1, '\205');
            if(P.charAt(s1) == '\344')
                P.setCharAt(s1, '\206');
            if(P.charAt(s1) == '\345')
                P.setCharAt(s1, '\207');
            if(P.charAt(s1) == '\346')
                P.setCharAt(s1, '\210');
            if(P.charAt(s1) == '\347')
                P.setCharAt(s1, '\211');
            if(P.charAt(s1) == '\351')
                P.setCharAt(s1, '\212');
            if(P.charAt(s1) == '\350')
                P.setCharAt(s1, '\213');
            if(P.charAt(s1) == '\352')
                P.setCharAt(s1, '\215');
            if(P.charAt(s1) == '\353')
                P.setCharAt(s1, '\216');
            if(P.charAt(s1) == '\354')
                P.setCharAt(s1, '\217');
            if(P.charAt(s1) == '\356')
                P.setCharAt(s1, '\220');
            if(P.charAt(s1) == '\357')
                P.setCharAt(s1, '\221');
            if(P.charAt(s1) == '\355')
                P.setCharAt(s1, '\222');
            if(P.charAt(s1) == '\361')
                P.setCharAt(s1, '\223');
            if(P.charAt(s1) == '\365')
                P.setCharAt(s1, '\224');
            if(P.charAt(s1) == '\362')
                P.setCharAt(s1, '\225');
            if(P.charAt(s1) == '\366')
                P.setCharAt(s1, '\226');
            if(P.charAt(s1) == '\362')
                P.setCharAt(s1, '\227');
            if(P.charAt(s1) == '\363')
                P.setCharAt(s1, '\230');
            if(P.charAt(s1) == '\330')
                P.setCharAt(s1, '\231');
            if(P.charAt(s1) == '\336')
                P.setCharAt(s1, '\232');
            if(P.charAt(s1) == '\371')
                P.setCharAt(s1, '\233');
            if(P.charAt(s1) == '\373')
                P.setCharAt(s1, '\234');
            if(P.charAt(s1) == '\372')
                P.setCharAt(s1, '\235');
            if(P.charAt(s1) == '\374')
                P.setCharAt(s1, '\236');
            if(P.charAt(s1) == '\377')
                P.setCharAt(s1, '\237');
            if(P.charAt(s1) == '\u0153')
                P.setCharAt(s1, '\240');
            if(P.charAt(s1) == '\300')
                P.setCharAt(s1, '\241');
            if(P.charAt(s1) == '\301')
                P.setCharAt(s1, '\242');
            if(P.charAt(s1) == '\302')
                P.setCharAt(s1, '\243');
            if(P.charAt(s1) == '\304')
                P.setCharAt(s1, '\244');
            if(P.charAt(s1) == '\305')
                P.setCharAt(s1, '\245');
            if(P.charAt(s1) == '\306')
                P.setCharAt(s1, '\246');
            if(P.charAt(s1) == '\307')
                P.setCharAt(s1, '\247');
            if(P.charAt(s1) == '\320')
                P.setCharAt(s1, '\250');
            if(P.charAt(s1) == '\310')
                P.setCharAt(s1, '\251');
            if(P.charAt(s1) == '\311')
                P.setCharAt(s1, '\252');
            if(P.charAt(s1) == '\312')
                P.setCharAt(s1, '\253');
            if(P.charAt(s1) == '\313')
                P.setCharAt(s1, '\254');
            if(P.charAt(s1) == '\314')
                P.setCharAt(s1, '\255');
            if(P.charAt(s1) == '\315')
                P.setCharAt(s1, '\256');
            if(P.charAt(s1) == '\316')
                P.setCharAt(s1, '\257');
            if(P.charAt(s1) == '\317')
                P.setCharAt(s1, '\260');
            if(P.charAt(s1) == '\321')
                P.setCharAt(s1, '\261');
            if(P.charAt(s1) == '\322')
                P.setCharAt(s1, '\262');
            if(P.charAt(s1) == '\364')
                P.setCharAt(s1, '\263');
            if(P.charAt(s1) == '\364')
                P.setCharAt(s1, '\264');
            if(P.charAt(s1) == '\326')
                P.setCharAt(s1, '\265');
            if(P.charAt(s1) == '\330')
                P.setCharAt(s1, '\266');
            if(P.charAt(s1) == '\336')
                P.setCharAt(s1, '\267');
            if(P.charAt(s1) == '\u016A')
                P.setCharAt(s1, '\270');
            if(P.charAt(s1) == '\u0216')
                P.setCharAt(s1, '\271');
            if(P.charAt(s1) == '\u016A')
                P.setCharAt(s1, '\272');
            if(P.charAt(s1) == '\u0170')
                P.setCharAt(s1, '\273');
            if(P.charAt(s1) == '\337')
                P.setCharAt(s1, '\276');
        }

        return P.toString();
    }

    private String[] a(String as1[])
    {
        for(int i1 = 0; i1 < as1.length; i1++)
            as1[i1] = a(as1[i1]);

        return as1;
    }

    private void b(Graphics g1)
    {
        if(R)
        {
            switch(b)
            {
            case 0: // '\0'
                b b1;
                (b1 = this).am = "Highest Score:";
                b1.an = "MostRecentScore:";
                b1.ao = "Average Score:";
                b1.ap = "Deaths:";
                b1.aq = "ARE YOU SURE?";
                b1.g = "LOADING";
                b1.ar = "SOUND FX:";
                b1.as = "MUSIC:";
                b1.at = "DIFFICULTY LEVEL:";
                String as1[] = {
                    "Bad luck...", "You only saved  ", "parachutists with", "a score of  "
                };
                String as7[] = {
                    "Parachute Panic V1.4.3", "\251 2009 FDG Entertainment", "GmbH & Co KG", " ", " ", "Website:", "www.fdg-entertainment.com", "Contact:", "support@mobilebus.co.kr", " ", 
                    "Artwork & Design:", "Brett Archibald", "www.NotHowItLooks.com"
                };
                String as13[] = {
                    "Parachutists can leave the screen on one side and then re-appear on the opposite side!", "Slow down the parachutist's falling speed by creating updrafts. To do this, swipe upwards.", "Don't try catch up with a moving ship. Go the other way instead to catch the next ship coming.", "Cluster parachutists together in a group, so you can control them collectively rather than individually.", "It's easier to land on a ship coming towards you, rather than a ship going away from you.", "Thunder clouds are indestructible, so use wind to blow your parachutist away from them.", "Lightning will not strike parachutists who still have their parachutes closed.", "Clouds have only one charge, so you could sacrifice one parachutist to save a group of others.", "Destroy UFOs and helicopters by tapping on them multiple times.", "Open the parachute as close as you can to the ship to earn an additional 'Risk Bonus' point.", 
                    "Earn additional 'Action Bonus' points by destroying UFOs and helicopters.", "Earn additional 'Extra Bonus' points by catching the flying fish.", "Claim back a lost life by catching the flying stork & baby when it appears.", "Tired of choosing 'Easy' or 'Difficult' every time? Un-check the box that says 'Ask each time'.", "Pause the game at any time by hitting the pause-icon at the top-left of the screen.", "Find out which elements are most likely to kill you in the Stats screen.", "Enter a username for yourself to compete in the Online High Scores table.", "Add your friends to your Buddy List to see how your scores compare to theirs.", "Delete buddies you no longer want to follow by tapping on their names in your Buddy List.", "Adjust Music and Sound-Effects on the Settings screen.", 
                    "Reach scores of 50, 150, 300, 500 & 1,000 to win an extra life for each milestone!"
                };
                String as19[] = {
                    "Tap on the parachutist to open the parachute.\nSome parachutes will already be open.", "You can control the direction the parachutist falls by swiping anywhere on the screen and drawing the wind direction.\nAll of the parachutists have to land in a boat.", "Beware of these enemy creatures and obstacles. You can get rid of the helicopter and ufo by tapping them 5x in normal mode, and 3x in easy mode.", "Claim back a lost life by catching the stork & baby.\nEarn additional 'Extra Bonus' points by catching the flying fish.", "By reaching a score of 50, 150, 300, 500 and 1,000 for the first time, you will unlock an additional permanent life."
                };
                b1.au = as1;
                b1.av = as7;
                b1.aw = as13;
                b1.ax = as19;
                break;

            case 1: // '\001'
                b b2;
                (b2 = this).am = "Le plus haut score:";
                b2.an = "MostRecentScore:";
                b2.ao = "Score moyen:";
                b2.ap = "Morts:";
                b2.aq = "Etes-vous s\373r?";
                b2.g = "Chargement";
                b2.ar = "SON FX:";
                b2.as = "MUSIQUE";
                b2.at = "NIVEAU DIFFICILE:";
                String as2[] = {
                    "Malchance...Vous avez", "sauv\351 seulement  ", "parachutistes avec", "un score de  "
                };
                String as8[] = {
                    "Parachute Panic V1.4.3", "\251 2009 FDG Entertainment", "GmbH & Co KG", " ", " ", "Website:", "www.fdg-entertainment.com", "Contact:", "support@fdg-entertainment.com", " ", 
                    "Travaille d'art & Design:", "Brett Archibald", "www.NotHowItLooks.com"
                };
                String as14[] = {
                    "Parachutistes peuvent quitter l'\351cran d'un c\364t\351 et puis r\351appara\356tre sur le c\364t\351 oppos\351", "Ralentir vitesse de chute du parachutiste en cr\351ant des courants ascendants. Pour faire cela, essayez de frapper vers le haut.", "N'essayez pas d'attraper un bateau en marche. Allez dans une autre direction au lieu d'attraper le prochain bateau venant.", "Rassemblez des parachutistes ensembles en un group, ainsi vous pouvez en contr\364ler collectivement plut\364t qu'individuellement.", "Il est plus facile d'atterir sur un bateau venant vers vous, plut\364t qu'un bateau allant loin de vous.", "Nuages d'orage sont indestructibles, alors utilisez le vent pour souffler votre parachutiste loin d'eux.", "La foudre ne frappera pas les parachutistes qui ont encore leur parachute ferm\351.", "Nuages ont seulement un charge, donc vous pouvez sacrifier un parachutiste pour sauver un groupe d'autres.", "D\351truisez UFOs et h\351licopters, en les frappant plusieurs fois.", "Ouvrez le parachute comme vous pouvez approcher le plus pr\350s au bateau pour gagner un point suppl\351mentaire de 'Risk Bonus'", 
                    "Gagnez points suppl\351mentaires d'Action Bonus' en d\351truisant UFOs et h\351licopters.", "Gagnez points suppl\351mentaires d'Extra Bonus' en attrapant les poissons volants.", "R\351clamez une vie perdue en attrapant la cigogne volant & b\351b\351 quand il appara\356t.", "Fatigu\351 de choisir 'Facile' ou 'Difficile' \340 chaque fois? D\351cochez la case qui dit : 'Demandez \340 chaque fois'.", "Interrompez le jeu \340 tout moment en touchant sur la pause-ic\364ne en haut \340 gauche de l'\351cran.", "D\351couvrez quels \351l\351ments qui sont plus probables \340 vous tuer dans l'\351cran de Stats. ", "R\351glez la Musique et Effets sonores sur l'\351cran de R\351glages.", "Parvenir aux scores de 50, 150, 300, 500 & 1,000 \340 gagner une vie suppl\351mentaire pour chaque \351tape"
                };
                String as20[] = {
                    "Tapez sur le parachutiste \340 ouvrir le parachute. Certains parachutes seront d\351j\340 ouverts.", "Vous pouvez contr\364ler l'orientation que parachutiste tombe en essayant de frapper n'importe   o\371 sur l'\351cran et en tirant la direction du vent. Tous les parachutistes doivent atterrir dans un bateau.", "Prenez garde de ces ennemis cr\351atifs et obstacles. Vous pouvez vous d\351barrasser de l'h\351licopter et de l'ufo en les frappant 5x en mode normal, et 3x en mode facile.", "R\351clamez une vie perdue en attrapant la cigogne & b\351b\351. Gagnez points suppl\351mentaires d' 'Extra Bonus'  en attrapant les poissons volants.", "En atteignant \340 un score de 50, 150, 300, 500 et 1,000 pour la prem\350re fois, vous allez lib\351rer une vie permanente et suppl\351mentaire."
                };
                b2.au = as2;
                b2.av = as8;
                b2.aw = as14;
                b2.ax = as20;
                b2.aq = b2.a(b2.aq);
                b2.ax = b2.a(b2.ax);
                b2.aw = b2.a(b2.aw);
                break;

            case 2: // '\002'
                b b3;
                (b3 = this).am = "H\366chste Punktzahl:";
                b3.an = "J\374ngste Punktzahl:";
                b3.ao = "Durchschnittliche:";
                b3.ap = "Tode:";
                b3.aq = "SIND SIE SICHER?";
                b3.M = 100;
                b3.N = -20;
                b3.g = "Ladung";
                b3.ar = "TON FX:";
                b3.as = "MUSIK:";
                b3.at = "SCHWIERIGE LEVEL:";
                String as3[] = {
                    "Ungl\374ck...", "Sie retteten nur  ", "Fallschirmspringer mit", "einer Punktzahl von  "
                };
                String as9[] = {
                    "Parachute Panic V1.4.3", "\251 2009 FDG Entertainment", "GmbH & Co KG", " ", " ", "Website:", "www.fdg-entertainment.com", "Kontakt:", "support@fdg-entertainment.com", " ", 
                    "Kunstwerk & Design:", "Brett Archibald", "www.NotHowItLooks.com"
                };
                String as15[] = {
                    "Fallschirmspringer k\366nnen auf einer Seite den Bildschirm verlassen und dann auf der Gegenseite wieder erscheinen.", "Verlangsamen Sie durch das Erzeugen des Aufwindes die Fallgeschwindigheit des Fallschirmspringers. Um dies zu tun, klauen Sie aufw\344rts", "Versuchen Sie nicht, einen bewegenden Schiff einzuholen. Gehen Sie einen anderen Weg, statt den kommenden n\344chsten Schiff zu fangen.", "Sammeln Sie Fallschirmspringer zusammen in eine Gruppe an, so k\366nnen Sie sie eher gemeinsam als individuell kontrollieren.", "Es ist leichter, auf einen gegen Sie kommenden Schiff zu landen als auf einen von Ihnen weggehenden.", "Donnerwolken sind unzerst\366rbar, so benutzen Sie den Wind, von ihnen Ihren Fallschirmspringer wegzuwehen.", "Blitz wird Fallschirmspringer nicht schlagen, die ihre Fallschirme noch geschlossen halten.", "Wolken haben nur eine Ladung, so k\366nnten Sie einen Fallschirmspringer opfern, um eine Gruppe der anderen zu retten.", "Zerst\366ren Sie UFOs und Hubschrauber, indem Sie darauf mehrfach klopfen.", "\326ffnen Sie den Fallschirm dem Schiff so nahe wie Sie k\366nnen, um einen zus\344tzlichen 'Risikobonuspunkt' zu gewinnen.", 
                    "Gewinnen Sie durch die Zerst\366rung der UFOs und Hubschrauber\240\240 zus\344tzliche 'Aktionenbonuspunkte'.", "Gewinnen Sie zus\344tzliche 'Extrabonuspunkte', indem Sie die fliegenden Fische fangen.", "Fordern Sie ein verlorenes Leben zur\374ck, indem Sie den Storch & das Baby fangen, wenn sie auftreten.", "Sind Sie dabei m\374de, jedesmal zwischen 'leicht' oder 'schwierig' zu entscheiden? Unchecken Sie den Kasten, der sagt: 'Fragen Sie jedesmal'.", "Machen Sie jedesmal Pause, indem Sie das Pause icon auf der obigen linken Seite des Bildschirms schlagen.", "Finden Sie heraus, welche Elemente Sie am wahrscheinlichsten auf dem Statistik-Screen t\366ten.", "Passen Sie Musik und Toneffekte auf dem Einstellungsscreen an.", "Erreichen Sie Punkte von 50, 150, 300, 500 und 1000, um ein\240 Extraleben f\374r jeden Meilenstein zu gewinnen."
                };
                String as21[] = {
                    "Klopfen Sie auf den Fallschirmspringer, um den Fallschirm zu \366ffnen. Einige Fallschirme werden bereits ge\366ffnet sein.", "Sie k\366nnen die Richtung kontrollieren, wohin der Fallschirmspringer f\344llt, indem Sie irgendwo auf den Bildschirm klauen und die Richtung des Windes ziehen. Alle Fallschirmspringer haben in ein Boot zu landen.", "Achten Sie auf diese Feindfiguren und Hindernisse. Sie k\366nnen den Hubschrauber und das UFO beseitigen, indem Sie sie in der normalen Mode f\374nfmal und in der leichten Mode dreimal klopfen.", "Fordern Sie ein verlorenes Leben zur\374ck, indem Sie den Storch und das Baby fangen. Verdienen Sie zus\344tzliche 'Extrabonuspunkte', indem Sie den fliegenden Fisch fangen.", "Indem Sie zum erstenmal den Punkt von 50, 150, 300, 500 und 1000 erreichen, werden Sie ein zus\344tzliches dauerhaftes Leben aufschlie\337en."
                };
                b3.au = as3;
                b3.av = as9;
                b3.aw = as15;
                b3.ax = as21;
                b3.an = b3.a(b3.an);
                b3.am = b3.a(b3.am);
                b3.ax = b3.a(b3.ax);
                b3.aw = b3.a(b3.aw);
                break;

            case 3: // '\003'
                b b4;
                (b4 = this).am = "Punteggio il pi\371 alto:";
                b4.an = "Punteggio pi\371 Recente:";
                b4.ao = "Punteggio Medio:";
                b4.ap = "Morti:";
                b4.aq = "SIETE SICURI?";
                b4.g = "Caricamento";
                b4.ar = "SUONO FX:";
                b4.as = "MUSICA:";
                b4.at = "LIVELLO DI DIFFICOLT\300:";
                String as4[] = {
                    "Una sfortuna...Avete", "risparmiato solo dei  ", "paracadutisti con un", "punteggio di  "
                };
                String as10[] = {
                    "Parachute Panic V1.4.3", "\251 2009 FDG Entertainment", "GmbH & Co KG", " ", " ", "Sito web:", "www.fdg-entertainment.com", "Contatto:", "support@fdg-entertainment.com", " ", 
                    "Opera d'arte & Disegno:", "Brett Archibald", "www.NotHowItLooks.com"
                };
                String as16[] = {
                    "Paracadutisti possono lasciare lo schermo su un lato e poi riappariranno sul lato opposto", "Rallentate la velocit\340 di caduta del paracadutista creando le correnti ascensionali. Per fare questo, schiaffate  verso l'alto.", "Non cercare di cattura con una nave in movimento. Andate l'altra maniera invece di prendere la prossima nave venendo.", "Paracadutisti dei gruppi insieme in un gruppo, dunque potete controllarli collettivamente piuttosto che individualmente. ", "E 'pi\371 facile atterrare su una nave venendo verso di voi, piuttosto che una nave andando via da voi.", "Nubi temporalesche sono indistruttibili, cos\354 usate il vento a soffiare vostri paracadutisti lontano da loro.", "Il fulmine non colpir\340 i paracadutisti a chi hanno ancora i loro paracaduti chiusi. ", "Nubi hanno una carica sola, cos\354 si potreste sacrificare una paracadutista per salvare un gruppo di altri. ", "Distruggete UFO ed elicotteri toccando su di loro tempi multipli. ", "Aprite il paracadute il pi\371 vicino possibile alla nave per guadagnare un punto addizionale di 'Action Bonus.' ", 
                    "Guadagnate punti addizionali di 'Action Bonus' distruggendo UFO ed elicotteri. ", "Gagnez points suppl\351mentaires d'Extra Bonus' en attrapant les poissons volants.", "Reclamate di una vita perduta prendendo la cicogna volante & il bambino quando appare. ", "Stancato  della scelta 'Facile' o 'Difficile' ogni volta? Incontrollate la casella che dice 'Chiedete ogni volta'. ", "Fate una pausa il gioco in qualsiasi momento premendo il pausa-icona in alto a sinistra dello schermo. ", "Scoprite quali sono gli elementi pi\371 probabili per uccidervi nello schermo Statistiche.  ", "Regolate Musica e Effetti Sonori nello schermo Impostazioni. ", "Raggiungete i punteggi di 50, 150, 300, 500 & 1.000 per vincere una vita extra per ogni pietra miliare."
                };
                String as22[] = {
                    "Toccate leggermente il paracadutista per aprire il paracadute.Alcuni paracadute saranno gi\340 aperte. ", "Potete controllare la direzione del paracadutista cade strisciando un qualsiasi punto dello schermo e disegnando la direzione del vento. Tutti i paracadutisti devono atterrare in una barca.", "Attenzione di queste creature nemiche e ostacoli. Potete eliminare l'elicottero e ufo toccando leggemente loro 5x in modalit\340 normale, e 3x in modalit\340 facile. ", "Reclamate di una vita perduta prendendo la cicogna & il bambino. Guadagnate punti addizionali di 'Extra Bonus' prendendo pesce volante.", "Raggiungendo un punteggio di 50, 150, 300, 500 e 1.000 per la prima volta, potrete sbloccare una vita permanente addizionale."
                };
                b4.au = as4;
                b4.av = as10;
                b4.aw = as16;
                b4.ax = as22;
                b4.an = b4.a(b4.an);
                b4.am = b4.a(b4.am);
                b4.ax = b4.a(b4.ax);
                b4.aw = b4.a(b4.aw);
                b4.at = b4.a(b4.at);
                break;

            case 4: // '\004'
                b b5;
                (b5 = this).am = "La mayor Puntuaci\363n:";
                b5.an = "Puntuaciones m\341s recientes:";
                b5.ao = "Promedio:";
                b5.ap = "Muertes:";
                b5.aq = "\277Estas seguro?";
                b5.g = "Cargando";
                b5.ar = "SONIDO:";
                b5.as = "MUSICA:";
                b5.at = "NIVEL DE DIFICULTAD:";
                String as5[] = {
                    "Mala suerte...", "S\363lo has salvado los  ", "paracaidistas con", "un puntaje de  "
                };
                String as11[] = {
                    "Parachute Panic V1.4.3", "\251 2009 FDG Entertainment", "GmbH & Co KG", " ", " ", "Website:", "www.fdg-entertainment.com", "Kontakt:", "support@fdg-entertainment.com", " ", 
                    "Kunstwerk & Design:", "Brett Archibald", "www.NotHowItLooks.com"
                };
                String as17[] = {
                    "Los paracaidistas pueden salir de la pantalla hacia un lado y luego volver a aparecer en el lado contrario!", "Reduzca la velocidad de la ca\355da del paracaidista creando corrientes de aire. Para ello, golpe hacia arriba.", "No intente alcanzar un barco en movimiento. Vaya hacia otro lado en vez de coger el pr\363ximo barco que viene.", "Agrupe los paracaidistas en un grupo, de modo que pueda controlar colectivamente en vez de individualmente.", "Es m\341s f\341cil aterrizar en un barco que viene hacia usted, que en un barco que va lejos de usted.", "Las nubes de tormenta son indestructibles, osea que utilice el viento para soplar su paracaidista lejos de ellos.", "Los rayos no alcanzar\341n a paracaidistas que a\372n tienen los paraca\355das cerrados.", "Las nubes tienen sola una carga, por lo que podr\355a sacrificar un paracaidista para salvar a un grupo de otros.", "Destruya los OVNIs y helic\363pteros golpeando en ellos varias veces.", "Abrir el paraca\355das lo m\341s cerca posible a la nave para obtener un punto adicional Bonus de Riesgo.", 
                    "Gane puntos adicionales de 'Bonus de Acci\363n' destruyendo los ovnis y helic\363pteros.", "Ganar puntos adicionales 'Bono Extra' cogiendo el pez volador.", "Reclame la devoluci\363n de una vida perdida capturando la cig\374e\361a voladora y el beb\351 cuando aparecen.", "Cansado de la elegir cada vez dif\355cil o F\341cil? Desmarque la casilla que dice Preguntar cada momento.", "Pausa el juego en cualquier momento pulsando el icono de la pausa en la parte superior izquierda de la pantalla.", "Averig\374e qu\351 elementos son los m\341s probables de matar a usted en la pantalla de Estad\355sticas.", "Alcance resultados de 50, 150, 300, 500 y 1.000 para ganar una vida extra por cada hito!"
                };
                String as23[] = {
                    "Pulse sobre el paracaidista para abrir el paraca\355das. Algunos paraca\355das ya estar\341n abiertos.", "Puede controlar la direcci\363n de la ca\355da del paracaidista golpeando en cualquier lugar de la pantalla y dibujando la direcci\363n del viento. Todos los paracaidistas tienen que aterrizar en un barco.", "Tenga cuidado de las criaturas enemigas y de los obst\341culos. Usted puede deshacerse del helic\363ptero y de los OVNIs con 5x en el modo normal, y con 3x en el modo f\341cil.", "Reclame la devoluci\363n de una vida perdida capturando la cig\374e\361a y el beb\351. Gane m\341s 'Puntos Extra' adicionales capturando los peces voladores.", "Cuando llega a una puntuaci\363n de 50, 150, 300, 500 y 1.000 por primera vez, podr\341 desbloquear una vida permanente adicional."
                };
                b5.au = as5;
                b5.av = as11;
                b5.aw = as17;
                b5.ax = as23;
                b5.ax = b5.a(b5.ax);
                b5.aw = b5.a(b5.aw);
                b5.am = b5.a(b5.am);
                b5.a(as5);
                b5.at = b5.a(b5.at);
                b5.as = b5.a(b5.as);
                b5.aq = b5.a(b5.aq);
                b5.am = b5.a(b5.am);
                b5.an = b5.a(b5.an);
                b5.ao = b5.a(b5.ao);
                break;

            case 5: // '\005'
                b b6;
                (b6 = this).M = 70;
                b6.N = -25;
                b6.am = "La Mayor Puntuaci\363n:";
                b6.an = "Puntuaciones M\341s recientes:";
                b6.ao = "Promedio:";
                b6.ap = "Muertes:";
                b6.aq = "\277Est\341s seguro?";
                b6.g = "Cargando";
                b6.ar = "SONIDO FX:";
                b6.as = "MUSICA:";
                b6.at = "NIVEL DE DIFICULTAD:";
                String as6[] = {
                    "Mala suerte...", "Solo has salvado los  ", "paracaidistas con", "un puntaje de  "
                };
                String as12[] = {
                    "Parachute Panic V1.4.3", "\251 2009 FDG Entertainment", "GmbH & Co KG", " ", " ", "Portal:", "www.fdg-entertainment.com", "Contato:", "support@fdg-entertainment.com", " ", 
                    "Artwork & Design:", "Brett Archibald", "www.NotHowItLooks.com"
                };
                String as18[] = {
                    "os paraquedistas podem sair da tela somente em um lado e reaparecer no lado oposto.", "diminua a velocidade de queda dos paraquedistas ao criar vento vertical. Para fazer isto, delize para cima.", "N\341o tente alcan\347ar um navio em novimento. V\341 para o outro lado ao inv\351s de tentar alcan\347ar-lo.", "Junte os paraquedistas num grupo para voc\352 controlar todos os juntos do que separadamente.", "\351 mais f\341cil aterrisar num navio vindo na sua dire\347\341o do que num navio indo embora.", "Nuvens de tempestade s\341o indestrut\355veis, portanto, use o vento para tirar os seus paraquedistas destas nuvens. ", "ligar as luzes n\341o far\341 mal aos paraquedistas que ainda est\341o com paraquedas fechados", "As nuvens tem apenas um carregamento. Portanto voc\352 pode sacrificar um paraquedista para salvar os outros.", "Destrua OVNIs e Helic\363pteros ao tocar neles por v\341rias vezes.", "Abra o paraquedas o mais perto do navio para que voc\352 possa adquirir o ponto b\364nus.", 
                    "Ganhe B\364nus de A\347\341oao destruir OVNIS e helic\363pteros. ", "Ganhe Extra B\364nus ao pescar peixes voadores.", "Ganhe a vida perdida ao pegar a cegonha voando com o beb\352.", "Cansado de escolher F\341cil ou Dif\355cil todas as vezes? Desmarque o box que fala 'Perguntar todas as vezes'. ", "Suspenda o jogo a qualquer momento ao tocar no \355cone pausar na parte superior esquerda da tela.", "Tente achar quais s\341o os elementos que possivelmente te matam na tela do Stats.", "Ajuste m\372sica e efeitos sonoros na tela de ajuste.", "Ganhe pontos 50, 150, 300, 500 e 100 para ganhar uma vida extra por cada milestone"
                };
                String as24[] = {
                    "toque no paraquedista para abrir o paraquedas. Alguns paraquedas j\341 devem estar abertos", "Voc\352 pode controlar a dire\347\341o de queda do paraquedista ao tocar em qualquer lugar da tela e desenhando a dire\347\341o do vento. Todos os paraquedistas devem aterrisar no barco.", "Esteja atento das criaturas inimas e obst\341culos. Voc\352 pode andar de helic\363ptero ou Ovni ao tocar 5 vezes, o transporte desejado, em modo normal e 3 vezes em modo f\341cil.", "Conquiste de volta a vida perdida ao pegar a cegonha & beb\352. Ganhe pontos Extra B\364nus ao pescar os peixes voadroes.", "Ao conquistar pontos, 50, 150, 300, 500 e 1000 pela primeira vez, voc\352 consegue desbloquear a vida permanente"
                };
                b6.au = as6;
                b6.av = as12;
                b6.aw = as18;
                b6.ax = as24;
                b6.ax = b6.a(b6.ax);
                b6.aw = b6.a(b6.aw);
                b6.am = b6.a(b6.am);
                b6.a(as6);
                b6.at = b6.a(b6.at);
                b6.as = b6.a(b6.as);
                b6.aq = b6.a(b6.aq);
                b6.am = b6.a(b6.am);
                b6.an = b6.a(b6.an);
                b6.ao = b6.a(b6.ao);
                break;
            }
            b b7;
            switch((b7 = this).b)
            {
            case 0: // '\0'
                b7.D = 0;
                b7.E = 150;
                break;

            case 1: // '\001'
                b7.D = -15;
                b7.E = 150;
                break;

            case 2: // '\002'
                b7.D = -15;
                b7.E = 150;
                break;

            case 3: // '\003'
                b7.D = -15;
                b7.E = 150;
                break;

            case 4: // '\004'
                b7.D = -15;
                b7.E = 150;
                break;

            case 5: // '\005'
                b7.D = -15;
                b7.E = 150;
                break;
            }
            b7.aB = Math.abs(b7.Y.nextInt() % (b7.aw.length - 1));
            b7.aA = e.a(b7.aw[b7.aB], b7.E);
            b7.af = 295;
            b7.ag = 136;
            b7.ah = 36;
            b7.ai = 130;
            b7.aj = 300;
            b7.ak = 216;
            o();
            R = false;
            d = 1;
            b7 = this;
            System.out.println("IntroScreen.loadmusic()" + b7.C);
            System.out.println("IntroScreen.loadmusic()R.musicStatus=" + m.g);
            if(b7.C == 0)
                switch(m.b)
                {
                case 1: // '\001'
                    b7.a();
                    m.g = 1;
                    break;

                case 2: // '\002'
                    b7.b();
                    m.g = 2;
                    break;

                default:
                    switch(m.g)
                    {
                    case 1: // '\001'
                    case 31: // '\037'
                        b7.a();
                        m.g = 1;
                        break;

                    case 2: // '\002'
                    case 32: // ' '
                        b7.b();
                        m.g = 2;
                        break;
                    }
                    break;
                }
            b7.C++;
        }
        g1.drawImage(m.V, 120, 20, 17);
        g1.drawImage(m.W, 120, 50, 17);
        g1.drawImage(m.X, 120, 135, 3);
        g1.drawImage(m.Y, 120, 175, 3);
        g1.drawImage(m.Z, 120, 215, 3);
        g1.drawImage(m.aa, 120, 255, 3);
        g1.drawImage(m.ab, 120, 295, 3);
        g1.drawImage(m.ac, 120, 335, 3);
    }

    private void c(Graphics g1)
    {
        g1.drawImage(m.af, 0, af, 20);
        g1.drawImage(m.ag, 186, ag, 20);
        if(T % 2 == 0)
            g1.drawImage(m.aj, ah, ai + D, 20);
        else
            g1.drawImage(m.aj, ah + 1, ai + D, 20);
        if(!aE)
        {
            if(T % 30 < 10)
                al = g + ".";
            else
            if(T % 30 < 20)
                al = g + "..";
            else
            if(T % 30 < 30)
                al = g + "...";
            Engine.g.a(g1, al, 120, (ay - 20) + D, 17);
            for(int i1 = 0; i1 < aA.length; i1++)
                Engine.h.a(g1, aA[i1], 120, ay + az * i1 + D, 17);

            Graphics g2 = g1;
            g1 = this;
            if(T % 2 == 0)
                g2.drawImage(m.ah, 120, ((b) (g1)).aj + 138 >> 1, 3);
            else
                g2.drawImage(m.ah, 121, ((b) (g1)).aj + 138 >> 1, 3);
            if(((b) (g1 = this)).aF < 80)
            {
                g1.aF++;
            } else
            {
                g1.aF = 0;
                g1.aE = true;
                return;
            }
        } else
        {
            if(aj == -113)
            {
                if(aF < 15)
                {
                    aF++;
                    return;
                }
                aF = 0;
                d = 2;
                switch(b)
                {
                case 0: // '\0'
                    (g1 = this).a = "/EN";
                    break;

                case 1: // '\001'
                    (g1 = this).a = "/FRA";
                    break;

                case 2: // '\002'
                    (g1 = this).a = "/GER";
                    break;

                case 3: // '\003'
                    (g1 = this).a = "/ITALY";
                    break;

                case 4: // '\004'
                    (g1 = this).a = "/SPAN";
                    m.bu = u.a("/intro/SPAN/spanstr.png");
                    break;

                case 5: // '\005'
                    (g1 = this).a = "/POR";
                    break;
                }
                m();
                m.ad = null;
                m.V = null;
                m.W = null;
                m.X = null;
                m.Z = null;
                m.aa = null;
                m.ab = null;
                m.Y = null;
                m.ac = null;
                return;
            }
            Graphics g3 = g1;
            g1 = this;
            if(T % 2 == 0)
            {
                g3.drawImage(m.ai, 120, ((b) (g1)).aj, 3);
                return;
            }
            g3.drawImage(m.ai, 121, ((b) (g1)).aj, 3);
        }
    }

    private void o()
    {
        bp = 45;
        bq = 0;
        br = 0;
        bs = 0;
        bt = 0;
        bu = 0;
        aD = 0;
        ba = 240;
        bb = 300;
        bc = -51;
        bd = 123;
        be = -57;
        bf = 322;
        bg = 120;
        bh = 368;
        bo = 400;
        bi = bj = bk = bl = bm = bn = 120;
        ai = 13;
        aW = 180;
        aX = 0;
        aY = 0;
        aZ = 161;
    }

    public final void h()
    {
        o();
        bv = 0;
        d = 2;
    }

    private void p()
    {
        Engine.c.b = false;
        g g1 = Engine.c;
        m.P = 0;
        g1.c = 0;
        g1.d = 0;
        g1.e = 0;
        g1.f = 0;
        g1.g = 0;
        g1.h = 0;
        g1.i = 0;
        g1.j = 0;
        g1.k = 0;
        g1.l = 0;
        g1.ag = 0;
        g1.K = new y[2];
        g1.L = new r[30];
        g1.M = new a[10];
        g1.N = new q[3];
        g1.O = new n[1];
        g1.P = new p[3];
        g1.Q = new c[3];
        g1.u = 0;
        g1.B = 0;
        if(m.L)
            g1.w = 7;
        else
            g1.w = 6;
        g1.v = false;
        g1.p = 0;
        g1.o = 0;
        g1.J = true;
        g g2;
        (g2 = g1).G = 0;
        g2.C = 400;
        (g2 = g1).F = 0;
        g2.z = -15;
        m.S = false;
        k.a(Engine.c, false, false, true);
        c = true;
    }

    private void d(Graphics g1)
    {
        if(T % 2 == 0)
        {
            g1.drawImage(m.aj, ah, ai, 20);
            g1.drawImage(m.ap, ba, bb, 20);
            g1.drawImage(m.aq, bc, bd, 20);
            g1.drawImage(m.ar, be + 1, bf, 20);
            g1.drawImage(m.as, bg, bh, 17);
            if(!aV && m.T)
                g1.drawImage(m.al, bi, bo - bp, 17);
            for(int i1 = 0; i1 < 5; i1++)
                switch(i1)
                {
                default:
                    break;

                case 0: // '\0'
                    if(!aR)
                        g1.drawImage(m.ao, bj, bo + bp * i1, 17);
                    break;

                case 1: // '\001'
                    if(!aS)
                        g1.drawImage(m.am, bk, bo + bp * i1, 17);
                    break;

                case 2: // '\002'
                    if(!aT)
                        g1.drawImage(m.ak, bl, bo + bp * i1, 17);
                    break;

                case 3: // '\003'
                    if(!aU)
                        g1.drawImage(m.an, bm, bo + bp * i1, 17);
                    break;
                }

            return;
        }
        g1.drawImage(m.aj, ah + 1, ai, 20);
        g1.drawImage(m.ap, ba + 1, bb, 20);
        g1.drawImage(m.aq, bc + 1, bd, 20);
        g1.drawImage(m.ar, be, bf, 20);
        g1.drawImage(m.as, bg + 1, bh, 17);
        if(!aV && m.T)
            g1.drawImage(m.al, bi + 1, bo - bp, 17);
        for(int j1 = 0; j1 < 5; j1++)
            switch(j1)
            {
            default:
                break;

            case 0: // '\0'
                if(!aR)
                    g1.drawImage(m.ao, bj + 1, bo + bp * j1, 17);
                break;

            case 1: // '\001'
                if(!aS)
                    g1.drawImage(m.am, bk + 1, bo + bp * j1, 17);
                break;

            case 2: // '\002'
                if(!aT)
                    g1.drawImage(m.ak, bl + 1, bo + bp * j1, 17);
                break;

            case 3: // '\003'
                if(!aU)
                    g1.drawImage(m.an, bm + 1, bo + bp * j1, 17);
                break;
            }

    }

    private void q()
    {
        switch(bD)
        {
        default:
            break;

        case 1: // '\001'
            bF = false;
            bE = false;
            h = false;
            bX = 0;
            bY = 0;
            bG = -450;
            bZ = 108;
            ca = -117;
            cb = 130;
            return;

        case 2: // '\002'
            bF = false;
            bE = false;
            h = false;
            ct = 0;
            cu = 0;
            cv = 0;
            bC = 200;
            cj = 128;
            ck = 108;
            cl = 62;
            cm = 173;
            if(cd)
            {
                bG = 440;
                cn = 368;
                co = 62;
                cp = 348;
                cq = 302;
                cr = 118;
                cs = 413;
                cf = 17;
                cg = 339;
                if(cc)
                {
                    ch = -m.ax.getWidth();
                    ci = 339;
                    return;
                }
            } else
            {
                bG = -200;
                cn = -88;
                co = 62;
                cp = -108;
                cq = -154;
                cr = 118;
                cs = -43;
                return;
            }
            break;

        case 3: // '\003'
            bF = false;
            bE = false;
            h = false;
            cK = 0;
            cF = 78;
            cG = 51;
            cH = 51;
            cI = 158;
            bC = 200;
            cJ = 152;
            if(cd)
            {
                bG = 440;
                cw = 318;
                cx = 291;
                cy = 57;
                cz = 291;
                cA = 84;
                cB = 398;
                cC = 108;
                cD = 392;
                cE = 72;
                return;
            } else
            {
                bG = -240;
                cw = -162;
                cx = -189;
                cy = 57;
                cz = -189;
                cA = 84;
                cB = -82;
                cC = 108;
                cD = -88;
                cE = 72;
                return;
            }

        case 4: // '\004'
            bF = false;
            bE = false;
            h = false;
            cU = 0;
            dk = 0;
            bW = 0;
            cR = 72;
            cS = 72;
            cT = 172;
            if(cd)
            {
                bG = 440;
                cL = 312;
                cM = 120;
                cN = 312;
                cO = 120;
                cP = 412;
                cQ = 120;
                return;
            } else
            {
                bG = -200;
                cL = -168;
                cM = 120;
                cN = -168;
                cO = 120;
                cP = -68;
                cQ = 120;
                bQ = 400 + m.ay.getWidth();
                return;
            }

        case 5: // '\005'
            bF = false;
            bE = false;
            h = false;
            dk = 0;
            dc = 0;
            bW = 0;
            dd = 46;
            dg = 137;
            de = 117;
            dh = 87;
            df = 161;
            di = 170;
            cY = 91;
            db = 0;
            if(cd)
            {
                cW = 331;
                cX = 123;
                cZ = 240;
                da = 0;
                bG = 440;
                return;
            }
            cW = -149;
            cX = 144;
            cZ = -240;
            da = 0;
            bG = -200;
            break;
        }
    }

    private void r()
    {
        switch(bD)
        {
        case 1: // '\001'
            if(!h && !bE)
            {
                if(ca + bX < bZ - 10)
                    bX += 4;
                else
                    bX = 1;
                if(bG + bY < 110)
                    bY += 8;
                else
                    bY = 1;
                ca = ca >= bZ ? bZ : ca + bX;
                bG = bG >= 120 ? 120 : bG + bY;
                if(bG == 120)
                    bw = true;
            } else
            {
                if(ca + bX < bZ - 10)
                    bX -= 4;
                else
                    bX = -1;
                if(bG + bY < 110)
                    bY -= 8;
                else
                    bY = -1;
                ca = ca <= -117 ? -117 : ca + bX;
                bG = bG <= -450 ? -450 : bG + bY;
                if(bG == -450)
                    if(bE)
                    {
                        cc = true;
                        bD = bD >= 5 ? 5 : bD + 1;
                        q();
                        bE = false;
                    } else
                    {
                        h();
                    }
            }
            break;

        case 2: // '\002'
            if(!bE && !h && !bF && cd)
            {
                if(cc)
                {
                    if(ch + ct < cf - 10)
                        ct += 2;
                    else
                        ct = 1;
                    ch = ch >= cf ? cf : ch + ct;
                }
                if(cn + cu > cj + 10)
                    cu -= 5;
                else
                    cu = -1;
                if(bG + cv > 130)
                    cv -= 8;
                else
                    cv = -1;
                cn = cn <= cj ? cj : cn + cu;
                cp = cp <= ck ? ck : cp + cu;
                cq = cq <= cl ? cl : cq + cu;
                cs = cs <= cm ? cm : cs + cu;
                bG = bG <= 120 ? 120 : bG + cv;
                if(bG == 120)
                    bw = true;
            }
            if(!bE && !h && !bF && !cd)
            {
                if(cn + cu < cj - 10)
                    cu += 5;
                else
                    cu = 1;
                if(bG + cv < 110)
                    cv += 8;
                else
                    cv = 1;
                cn = cn >= cj ? cj : cn + cu;
                cp = cp >= ck ? ck : cp + cu;
                cq = cq >= cl ? cl : cq + cu;
                cs = cs >= cm ? cm : cs + cu;
                bG = bG >= 120 ? 120 : bG + cv;
                if(bG == 120)
                    bw = true;
            }
            if(bE)
            {
                if(cn + cu < cj - 10)
                    cu -= 8;
                else
                    cu = -1;
                if(bG + cv < 110)
                    cv -= 5;
                else
                    cv = -1;
                cn = cn <= -128 ? -128 : cn + cu;
                cp = cp <= -108 ? -108 : cp + cu;
                cq = cq <= -138 ? -138 : cq + cu;
                cs = cs <= -173 ? -173 : cs + cu;
                bG = bG <= -450 ? -450 : bG + cv;
                if(bG == -450 && cq == -138)
                {
                    bD = bD >= 5 ? 5 : bD + 1;
                    q();
                    bE = false;
                    cc = false;
                }
            }
            if(bF || h)
            {
                if(cn + cu > cj + 10)
                    cu += 5;
                else
                    cu = 1;
                if(bG + cv > 130)
                    cv += 8;
                else
                    cv = 1;
                cn = cn >= 528 ? 528 : cn + cu;
                cp = cp >= 508 ? 508 : cp + cu;
                cq = cq >= 462 ? 435 : cq + cu;
                cs = cs >= 573 ? 573 : cs + cu;
                bG = bG >= 440 ? 440 : bG + cv;
                if(!h && bF)
                {
                    if(ch + ct < cf - 10)
                        ct -= 2;
                    else
                        ct = -1;
                    ch = ch <= -m.ax.getWidth() ? -m.ax.getWidth() : ch + ct;
                }
                if(bG == 440)
                    if(bF)
                    {
                        bD = bD <= 1 ? 1 : bD - 1;
                        q();
                    } else
                    {
                        h();
                    }
            }
            break;

        case 3: // '\003'
            if(!bE && !h && !bF && cd)
            {
                if(bG + cK > 130)
                    cK -= 10;
                else
                    cK = -1;
                cw = cw + cK <= cF ? cF : cw + cK;
                cx = cx + cK <= cG ? cG : cx + cK;
                cz = cz + cK <= cH ? cH : cz + cK;
                cB = cB + cK <= cI ? cI : cB + cK;
                cD = cD + cK <= cJ ? cJ : cD + cK;
                bG = bG + cK <= 120 ? 120 : bG + cK;
                if(bG == 120)
                    bw = true;
            }
            if(!bE && !h && !bF && !cd)
            {
                if(bG + cK < 110)
                    cK += 10;
                else
                    cK = 1;
                cw = cw + cK >= cF ? cF : cw + cK;
                cx = cx + cK >= cG ? cG : cx + cK;
                cz = cz + cK >= cH ? cH : cz + cK;
                cB = cB + cK >= cI ? cI : cB + cK;
                cD = cD + cK >= cJ ? cJ : cD + cK;
                bG = bG + cK >= 120 ? 120 : bG + cK;
                if(bG == 120)
                    bw = true;
            }
            if(bE)
            {
                if(bG + cK < 110)
                    cK -= 10;
                else
                    cK = -1;
                cw = cw + cK <= -78 ? -78 : cw + cK;
                cx = cx + cK <= -51 ? -51 : cx + cK;
                cz = cz + cK <= -51 ? -51 : cz + cK;
                cB = cB + cK <= -158 ? -158 : cB + cK;
                cD = cD + cK <= -152 ? -152 : cD + cK;
                bG = bG + cK <= -200 ? -200 : bG + cK;
                if(bG == -200 && cD == -152)
                {
                    bD = bD >= 5 ? 5 : bD + 1;
                    q();
                    bE = false;
                    cc = false;
                }
            }
            if(bF || h)
            {
                if(bG + cK > 130)
                    cK += 10;
                else
                    cK = 1;
                cw = cw + cK >= 318 ? 318 : cw + cK;
                cx = cx + cK >= 291 ? 291 : cx + cK;
                cz = cz + cK >= 291 ? 291 : cz + cK;
                cB = cB + cK >= 398 ? 398 : cB + cK;
                cD = cD + cK >= 392 ? 392 : cD + cK;
                bG = bG + cK >= 440 ? 440 : bG + cK;
                if(bG == 440)
                    if(bF)
                    {
                        bD = bD <= 1 ? 1 : bD - 1;
                        q();
                    } else
                    {
                        h();
                    }
            }
            break;

        case 4: // '\004'
            if(!bE && !h && !bF && cd)
            {
                if(bG + cU > 130)
                    cU -= 10;
                else
                    cU = -1;
                cL = cL <= cR ? cR : cL + cU;
                cN = cN <= cS ? cS : cN + cU;
                cP = cP <= cT ? cT : cP + cU;
                bG = bG + cU <= 120 ? 120 : bG + cU;
                if(bG == 120)
                    bw = true;
            }
            if(!bE && !h && !bF && !cd)
            {
                if(bG + cU < 110)
                    cU += 10;
                else
                    cU = 1;
                cL = cL >= cR ? cR : cL + cU;
                cN = cN >= cS ? cS : cN + cU;
                cP = cP >= cT ? cT : cP + cU;
                bG = bG + cU >= 120 ? 120 : bG + cU;
                if(bG == 120)
                    bw = true;
            }
            if(bE)
            {
                if(bG + cU < 110)
                    cU -= 10;
                else
                    cU = -1;
                cL = cL <= -168 ? -168 : cL + cU;
                cN = cN <= -168 ? -168 : cN + cU;
                cP = cP <= -68 ? -68 : cP + cU;
                bG = bG + cU <= -240 ? -240 : bG + cU;
                if(bG == -240 && cP == -68)
                {
                    cV = true;
                    bD = bD >= 5 ? 5 : bD + 1;
                    q();
                    bE = false;
                    cc = false;
                }
            }
            if(bF || h)
            {
                if(bG + cU > 130)
                    cU += 10;
                else
                    cU = 1;
                cL = cL >= 312 ? 312 : cL + cU;
                cN = cN >= 312 ? 312 : cN + cU;
                cP = cP >= 412 ? 412 : cP + cU;
                bG = bG + cU >= 440 ? 440 : bG + cU;
                if(bG == 440)
                    if(bF)
                    {
                        bD = bD <= 1 ? 1 : bD - 1;
                        q();
                    } else
                    {
                        h();
                    }
            }
            break;

        case 5: // '\005'
            if(!bE && !h && !bF && cd)
            {
                if(cV)
                {
                    if(bQ + dk > bK + 10)
                        dk += 5;
                    else
                        dk = 1;
                    bQ = bQ >= 400 + m.ay.getWidth() ? 400 + m.ay.getWidth() : bQ + dk;
                }
                if(bG + dc > 130)
                    dc -= 10;
                else
                    dc = -1;
                cW = cW <= cY ? cY : cW + dc;
                cZ = cZ <= 0 ? 0 : cZ + dc;
                bG = bG + dc <= 120 ? 120 : bG + dc;
                if(bG == 120)
                    bw = true;
            }
            if(bF || h)
            {
                cV = false;
                if(bG + dc > 130)
                    dc += 10;
                else
                    dc = 1;
                cW = cW >= 331 ? 331 : cW + dc;
                cZ = cZ >= 240 ? 240 : cZ + dc;
                bG = bG + dc >= 440 ? 440 : bG + dc;
                if(bQ + dk > bK + 10)
                    dk -= 5;
                else
                    dk = -1;
                bQ = bQ <= bK ? bK : bQ + dk;
                if(bG == 440)
                    if(bF)
                    {
                        bD = bD <= 1 ? 1 : bD - 1;
                        q();
                    } else
                    {
                        h();
                    }
            }
            break;
        }
        if(!bE && !bF)
        {
            if(!h)
            {
                if(bO + bU < bI - 10)
                    bU += 6;
                else
                    bU = 1;
                if(bM + bV > bH + 10)
                    bV -= 4;
                else
                    bV = -1;
                if(bD != 5)
                {
                    if(bQ + bW > bK + 10)
                        bW -= 4;
                    else
                        bW = -1;
                    bQ = bQ <= bK ? bK : bQ + bW;
                }
                bO = bO >= bI ? bI : bO + bU;
                bM = bM <= bH ? bH : bM + bV;
                return;
            }
            if(bO + bU < bI - 10)
                bU -= 6;
            else
                bU = -1;
            if(bM + bV > bH + 10)
                bV += 4;
            else
                bV = 1;
            if(bD != 5)
            {
                if(bQ + bW > bK + 10)
                    bW += 4;
                else
                    bW = 1;
                bQ = bQ >= 400 + m.ay.getWidth() ? 400 + m.ay.getWidth() : bQ + bW;
            }
            bO = bO <= -m.av.getWidth() ? -m.av.getWidth() : bO + bU;
            bM = bM >= 400 + m.au.getWidth() ? 400 + m.au.getWidth() : bM + bV;
            if(bD != 1)
            {
                if(ch + ct < cf - 10)
                    ct -= 2;
                else
                    ct = -1;
                ch = ch <= -m.ax.getWidth() ? -m.ax.getWidth() : ch + ct;
            }
        }
    }

    private void e(Graphics g1)
    {
        if(T % 2 == 0)
        {
            g1.drawImage(m.au, bM, bN, 20);
            if(!bS)
                g1.drawImage(m.av, bO, bP, 20);
            if(!bT)
                g1.drawImage(m.ay, bQ, bR, 20);
            if(!ce && bD != 1)
                g1.drawImage(m.ax, ch, ci, 20);
        } else
        {
            g1.drawImage(m.au, bM + 1, bN, 20);
            if(!bS)
                g1.drawImage(m.av, bO + 1, bP, 20);
            if(!bT)
                g1.drawImage(m.ay, bQ + 1, bR, 20);
            if(!ce && bD != 1)
                g1.drawImage(m.ax, ch + 1, ci, 20);
        }
        switch(bD)
        {
        case 1: // '\001'
            if(T % 2 == 0)
                g1.drawImage(m.az, ca, cb, 20);
            if(T % 2 == 1)
                g1.drawImage(m.az, ca + 1, cb, 20);
            for(int i1 = 0; i1 < bx.length; i1++)
                Engine.g.a(g1, bx[i1], bG, bC + az * i1, 17);

            return;

        case 2: // '\002'
            if(T % 2 == 0)
            {
                g1.drawImage(m.aC, cq, cr, 20);
                g1.drawImage(m.aA, cn, co, 20);
            } else
            {
                g1.drawImage(m.aC, cq + 1, cr, 20);
                g1.drawImage(m.aA, cn + 1, co, 20);
            }
            if(T % 3 == 0)
                g1.drawImage(m.i, cq + 105, cr - 40, 20);
            else
            if(T % 3 == 1)
                g1.drawImage(m.j, cq + 105, cr - 40, 20);
            else
            if(T % 3 == 2)
                g1.drawImage(m.k, cq + 105, cr - 40, 20);
            for(int j1 = 0; j1 < by.length; j1++)
                Engine.g.a(g1, by[j1], bG, (bC - (az << 1)) + az * j1 + K, 17);

            return;

        case 3: // '\003'
            if(T % 2 == 0)
            {
                g1.drawImage(m.af, cx, cy, 20);
                g1.drawImage(m.aI, cz, cA, 20);
            } else
            {
                g1.drawImage(m.ag, cx, cy, 20);
                g1.drawImage(m.aJ, cz, cA, 20);
            }
            if(T % 2 == 0)
                g1.drawImage(m.aF, cB, cC, 20);
            if(T % 2 == 1)
                g1.drawImage(m.aF, cB + 1, cC, 20);
            if(T % 2 == 0)
                g1.drawImage(m.aG, cD, cE, 20);
            if(T % 2 == 1)
                g1.drawImage(m.aG, cD + 1, cE, 20);
            for(int k1 = 0; k1 < bz.length; k1++)
                Engine.g.a(g1, bz[k1], bG, (bC - (az << 1)) + az * k1, 17);

            return;

        case 4: // '\004'
            if(T % 20 < 2)
                g1.drawImage(m.aL, cL, cM, 3);
            else
            if(T % 20 < 4)
                g1.drawImage(m.aM, cL, cM, 3);
            else
            if(T % 20 < 6)
                g1.drawImage(m.aN, cL, cM, 3);
            else
            if(T % 20 < 10)
                g1.drawImage(m.aO, cL, cM, 3);
            else
            if(T % 20 < 20)
                if(T % 2 == 0)
                    g1.drawImage(m.aY, cN, cO, 3);
                else
                    g1.drawImage(m.aZ, cN, cO, 3);
            if(T % 2 == 0)
                g1.drawImage(m.ba, cP, cQ, 3);
            if(T % 2 == 1)
                g1.drawImage(m.ba, cP + 1, cQ, 3);
            for(int l1 = 0; l1 < bA.length; l1++)
                Engine.g.a(g1, bA[l1], bG, (bC - (az << 1)) + az * l1, 17);

            return;

        case 5: // '\005'
            g1.drawImage(m.be, cW, cX, 20);
            if(T % 10 == 0)
                dj = Math.abs(Y.nextInt()) % 3;
            if(T % 20 < 5)
                switch(dj)
                {
                case 0: // '\0'
                    g1.drawImage(m.bc, cZ + dd, 0 + dg, 20);
                    break;

                case 1: // '\001'
                    g1.drawImage(m.bc, cZ + de, 0 + dh, 20);
                    break;

                case 2: // '\002'
                    g1.drawImage(m.bc, cZ + df, 0 + di, 20);
                    break;
                }
            for(int i2 = 0; i2 < bB.length; i2++)
                Engine.g.a(g1, bB[i2], bG, bC + az * i2 + L, 17);

            break;
        }
    }

    private void f(Graphics g1)
    {
        if(S)
        {
            g1.drawImage(m.bQ, dn, _flddo, 20);
            if(!ev)
                g1.drawImage(m.bT, eb, ec, 20);
        } else
        {
            g1.drawImage(m.bR, eb, ec, 20);
            if(!eu)
                g1.drawImage(m.bS, dn, _flddo, 20);
        }
        Engine.g.a(g1, am, dp - 25, dq, 20);
        Engine.g.a(g1, an, dr - 25, ds, 20);
        Engine.g.a(g1, ao, dt - 25, du, 20);
        Engine.g.a(g1, ez, ed, dq, 20);
        Engine.g.a(g1, eA, ee, ds, 20);
        Engine.g.a(g1, eB, ef, du, 20);
        Engine.g.a(g1, ap, dv, dw, 20);
        Engine.g.a(g1, eC, dJ, dK + 20, 20);
        Engine.g.a(g1, eD, dL, dM + 20, 20);
        Engine.g.a(g1, eE, dN, dO + 20, 20);
        Engine.g.a(g1, eF, dP, dQ + 20, 20);
        Engine.g.a(g1, eG, dR, dS + 20, 20);
        if(T % 2 == 0)
        {
            g1.drawImage(m.au, bM, bN, 20);
            if(!bS)
                g1.drawImage(m.av, bO, bP, 20);
            g1.drawImage(m.bw, dl, dm, 20);
            g1.drawImage(m.bg, eg, eh, 20);
            if(m.O)
            {
                g1.drawImage(m.br, dx, dy, 3);
                g1.drawImage(m.bq, ei, ej, 3);
            } else
            {
                g1.drawImage(m.bs, dx, dy, 3);
                g1.drawImage(m.bp, ei, ej, 3);
            }
            g1.drawImage(m.bx, dz, dA, 20);
            g1.drawImage(m.bz, dB, dC, 20);
            g1.drawImage(m.bi, dT, dU, 20);
            if(er)
            {
                if(!es && !et)
                {
                    if(!ew && !ey)
                        g1.drawImage(m.bo, dX, dY, 20);
                    if(!ex && !ey)
                        g1.drawImage(m.bn, ek, el, 20);
                } else
                if(!ew && !ex && !ey)
                {
                    if(b == 4)
                        g1.drawImage(m.bu, dZ + M, ea + N, 20);
                    else
                        Engine.g.a(g1, aq, dZ + M, ea + N, 20);
                    g1.drawImage(m.bt, em, en, 20);
                    g1.drawImage(m.bv, eo, ep, 20);
                }
            } else
            {
                g1.drawImage(m.bU, dV, dW, 20);
            }
        } else
        {
            g1.drawImage(m.au, bM + 1, bN, 20);
            if(!bS)
                g1.drawImage(m.av, bO + 1, bP, 20);
            g1.drawImage(m.bw, dl, dm, 20);
            g1.drawImage(m.bh, eg, eh, 20);
            if(m.O)
            {
                g1.drawImage(m.br, dx + 1, dy, 3);
                g1.drawImage(m.bq, ei + 1, ej, 3);
            } else
            {
                g1.drawImage(m.bs, dx + 1, dy, 3);
                g1.drawImage(m.bp, ei + 1, ej, 3);
            }
            g1.drawImage(m.by, dz, dA, 20);
            g1.drawImage(m.bA, dB, dC, 20);
            g1.drawImage(m.bj, dT, dU, 20);
            if(er)
            {
                if(!es && !et)
                {
                    if(!ew && !ey)
                        g1.drawImage(m.bo, dX + 1, dY, 20);
                    if(!ex && !ey)
                        g1.drawImage(m.bn, ek + 1, el, 20);
                } else
                if(!ew && !ex && !ey)
                {
                    if(b == 4)
                        g1.drawImage(m.bu, dZ + M, ea + N, 20);
                    else
                        Engine.g.a(g1, aq, dZ + M, ea + N, 20);
                    g1.drawImage(m.bt, em + 1, en, 20);
                    g1.drawImage(m.bv, eo + 1, ep, 20);
                }
            } else
            {
                g1.drawImage(m.bU, dV + 1, dW, 20);
            }
        }
        if(T % 3 == 0)
            g1.drawImage(m.bB, dD, dE, 20);
        if(T % 3 == 1)
            g1.drawImage(m.bC, dD, dE, 20);
        if(T % 3 == 2)
            g1.drawImage(m.bD, dD, dE, 20);
        if(T % 8 == 0)
            g1.drawImage(m.bI, dH, dI, 20);
        if(T % 8 == 1)
            g1.drawImage(m.bJ, dH, dI, 20);
        if(T % 8 == 2)
            g1.drawImage(m.bK, dH, dI, 20);
        if(T % 8 == 3)
            g1.drawImage(m.bL, dH, dI, 20);
        if(T % 8 == 4)
            g1.drawImage(m.bM, dH, dI, 20);
        if(T % 8 == 5)
            g1.drawImage(m.bN, dH, dI, 20);
        if(T % 8 == 6)
            g1.drawImage(m.bO, dH, dI, 20);
        if(T % 8 == 7)
            g1.drawImage(m.bP, dH, dI, 20);
        if(T % 4 == 0)
            g1.drawImage(m.bE, dF, dG, 20);
        if(T % 4 == 1)
            g1.drawImage(m.bF, dF, dG, 20);
        if(T % 4 == 2)
            g1.drawImage(m.bG, dF, dG, 20);
        if(T % 4 == 3)
            g1.drawImage(m.bH, dF, dG, 20);
    }

    private void s()
    {
        if(S)
            if(m.O)
            {
                eC = String.valueOf(m.l);
                eD = String.valueOf(m.m);
                eE = String.valueOf(m.n);
                eF = String.valueOf(m.o);
                eG = String.valueOf(m.p);
                return;
            } else
            {
                eC = String.valueOf(m.q);
                eD = String.valueOf(m.r);
                eE = String.valueOf(m.s);
                eF = String.valueOf(m.t);
                eG = String.valueOf(m.u);
                return;
            }
        if(m.O)
        {
            eC = String.valueOf(m.v);
            eD = String.valueOf(m.w);
            eE = String.valueOf(m.x);
            eF = String.valueOf(m.y);
            eG = String.valueOf(m.z);
            return;
        } else
        {
            eC = String.valueOf(m.A);
            eD = String.valueOf(m.B);
            eE = String.valueOf(m.C);
            eF = String.valueOf(m.D);
            eG = String.valueOf(m.E);
            return;
        }
    }

    private void t()
    {
        if(!S)
        {
            ez = String.valueOf(m.F);
            eA = String.valueOf(m.G);
            eB = String.valueOf(m.H);
            return;
        } else
        {
            ez = String.valueOf(m.I);
            eA = String.valueOf(m.J);
            eB = String.valueOf(m.K);
            return;
        }
    }

    private void g(Graphics g1)
    {
        Engine.g.a(g1, ar, fd, fe, 20);
        Engine.g.a(g1, as, fz, fA, 20);
        Engine.g.a(g1, at, fj - 20, fk, 20);
        g1.drawImage(m.cj, fD + 4, fE - 8, 20);
        g1.drawImage(m.ck, fF + 4, fG - 8, 20);
        if(T % 2 == 0)
        {
            g1.drawImage(m.au, bM, bN, 20);
            if(!bS)
                g1.drawImage(m.av, bO, bP, 20);
            g1.drawImage(m.bY, fb, fc, 20);
            g1.drawImage(m.bg, eg, eh, 20);
            g1.drawImage(m.cd, ff, fg, 20);
            g1.drawImage(m.ci, fx, fy, 20);
            g1.drawImage(m.bi, dT, dU, 20);
            g1.drawImage(m.bk, fu, fv, 20);
            if(!m.N)
                g1.drawImage(m.cn, ff - 8, fg - 2, 20);
            else
                g1.drawImage(m.cn, fh - 8, fi - 2, 20);
            if(m.g == 0)
                g1.drawImage(m.cp, fx - 8, fy - 2, 20);
            else
                g1.drawImage(m.cp, fB - 8, fC - 2, 20);
            if(m.g == 1)
                g1.drawImage(m.cq, fD, fE - 12, 20);
            if(m.g == 2)
                g1.drawImage(m.cq, fF, fG - 12, 20);
            if(m.M)
            {
                g1.drawImage(m.cr, fl, fm, 6);
                g1.drawImage(m.cl, fn - 10, fo, 6);
                g1.drawImage(m.cu, fp - 10, fq, 6);
            } else
            {
                if(m.L)
                {
                    g1.drawImage(m.cs, fl, fm, 6);
                    g1.drawImage(m.cl, fn - 10, fo, 6);
                    g1.drawImage(m.ct, fp - 10, fq, 6);
                }
                if(!m.L)
                {
                    g1.drawImage(m.cr, fl, fm, 6);
                    g1.drawImage(m.cm, fn - 10, fo, 6);
                    g1.drawImage(m.ct, fp - 10, fq, 6);
                }
            }
            if(!eY)
                g1.drawImage(m.bX, fs, ft, 20);
        } else
        {
            g1.drawImage(m.au, bM + 1, bN, 20);
            if(!bS)
                g1.drawImage(m.av, bO + 1, bP, 20);
            g1.drawImage(m.bY, fb, fc, 20);
            g1.drawImage(m.bh, eg, eh, 20);
            g1.drawImage(m.cd, ff + 1, fg, 20);
            g1.drawImage(m.ci, fx + 1, fy, 20);
            g1.drawImage(m.bj, dT, dU, 20);
            g1.drawImage(m.bl, fu, fv, 20);
            if(!m.N)
                g1.drawImage(m.co, ff - 8, fg - 2, 20);
            else
                g1.drawImage(m.co, fh - 8, fi - 2, 20);
            if(m.g == 0)
                g1.drawImage(m.cn, fx - 8, fy - 2, 20);
            else
                g1.drawImage(m.cn, fB - 8, fC - 2, 20);
            if(m.g == 1)
                g1.drawImage(m.cq, fD, fE - 12, 20);
            if(m.g == 2)
                g1.drawImage(m.cq, fF, fG - 12, 20);
            if(m.M)
            {
                g1.drawImage(m.cr, fl + 1, fm, 6);
                g1.drawImage(m.cl, (fn - 10) + 1 + 1, fo, 6);
                g1.drawImage(m.cu, (fp - 10) + 1, fq, 6);
            } else
            {
                if(m.L)
                {
                    g1.drawImage(m.cs, fl + 1, fm, 6);
                    g1.drawImage(m.cl, (fn - 10) + 1 + 1, fo, 6);
                    g1.drawImage(m.ct, (fp - 10) + 1, fq, 6);
                }
                if(!m.L)
                {
                    g1.drawImage(m.cr, fl + 1, fm, 6);
                    g1.drawImage(m.cm, (fn - 10) + 1 + 1, fo, 6);
                    g1.drawImage(m.ct, (fp - 10) + 1, fq, 6);
                }
            }
            if(!eY)
                g1.drawImage(m.bX, fs + 1, ft, 20);
        }
        if(T % 8 < 2)
        {
            g1.drawImage(m.bZ, fh, fi, 20);
            g1.drawImage(m.ce, fB, fC, 20);
            return;
        }
        if(T % 8 < 4)
        {
            g1.drawImage(m.ca, fh, fi, 20);
            g1.drawImage(m.cf, fB, fC, 20);
            return;
        }
        if(T % 8 < 6)
        {
            g1.drawImage(m.cb, fh, fi, 20);
            g1.drawImage(m.cg, fB, fC, 20);
            return;
        }
        if(T % 8 < 8)
        {
            g1.drawImage(m.cc, fh, fi, 20);
            g1.drawImage(m.ch, fB, fC, 20);
        }
    }

    private void h(Graphics g1)
    {
        for(int i1 = 0; i1 < av.length; i1++)
            if(i1 == 6 || i1 == 8 || i1 == 12)
                Engine.h.a(g1, av[i1], fK - 5, fL + i1 * 14, 20);
            else
                Engine.g.a(g1, av[i1], fK - 5, fL + i1 * 14, 20);

        if(T % 2 == 0)
        {
            g1.drawImage(m.au, bM, bN, 20);
            if(!bS)
                g1.drawImage(m.av, bO, bP, 20);
            g1.drawImage(m.cx, fO - 10, fP, 20);
        } else
        {
            g1.drawImage(m.au, bM + 1, bN, 20);
            if(!bS)
                g1.drawImage(m.av, bO + 1, bP, 20);
            g1.drawImage(m.cx, (fO - 10) + 1, fP, 20);
        }
        g1.drawImage(m.cv, fM - 5, fN, 20);
    }

    private void u()
    {
        if(m.S)
        {
            m.Q = m.Q <= -30 ? -30 : m.Q - 2;
            m.R = m.R <= -20 ? -20 : m.R - 2;
        } else
        {
            m.Q = m.Q >= 0 ? 0 : m.Q + 2;
            m.R = m.R >= 0 ? 0 : m.R + 2;
        }
        if(!h)
        {
            if(bO + bU < bI - 10)
                bU += 3;
            else
                bU = 1;
            if(bM + bV > bH + 10)
                bV -= 3;
            else
                bV = -1;
            bO = bO >= bI ? bI : bO + bU;
            bM = bM <= bH ? bH : bM + bV;
            if(bO + bU < bI)
            {
                eP += bU;
                eJ += bU;
                eL += bU;
            } else
            {
                eP = 35;
                eJ = 90;
                eL = 81;
                bw = true;
            }
            if(bM + bV > bH)
            {
                eN += bV;
                eR += bV;
                eT += bV;
                return;
            } else
            {
                eN = 72;
                eR = 105;
                eT = 71;
                return;
            }
        }
        if(bO + bU < bI - 10)
            bU -= 3;
        else
            bU = -1;
        if(bM + bV > bH + 10)
            bV += 3;
        else
            bV = 1;
        bO = bO <= -231 ? -231 : bO + bU;
        bM = bM >= 399 ? 399 : bM + bV;
        if(bO + bU > -231)
        {
            eP += bU;
            eJ += bU;
            eL += bU;
        } else
        {
            eP = -205;
            eJ = -150;
            eL = -159;
            bO = -231;
            bw = true;
            if(fJ)
                h();
            else
            if(m.Q == -30)
                p();
        }
        if(bM + bV < 399)
        {
            eN += bV;
            eR += bV;
            eT += bV;
            return;
        } else
        {
            eN = 312;
            eR = 345;
            eT = 311;
            return;
        }
    }

    private void i(Graphics g1)
    {
        if(T % 2 == 0)
        {
            g1.drawImage(m.au, bM, bN, 20);
            if(!bS)
                g1.drawImage(m.av, bO, bP, 20);
        } else
        {
            g1.drawImage(m.au, bM + 1, bN, 20);
            if(!bS)
                g1.drawImage(m.av, bO + 1, bP, 20);
        }
        if(T % 2 == 0)
        {
            g1.drawImage(m.cT, eP, eQ, 20);
            if(!eV)
                g1.drawImage(m.cP, eJ, eK, 20);
            if(!eW)
                g1.drawImage(m.cQ, eL, eM, 20);
        } else
        {
            g1.drawImage(m.cT, eP + 1, eQ, 20);
            if(!eV)
                g1.drawImage(m.cP, eJ + 1, eK, 20);
            if(!eW)
                g1.drawImage(m.cQ, eL + 1, eM, 20);
        }
        if(m.M)
            g1.drawImage(m.cS, eN, eO, 20);
        else
            g1.drawImage(m.cR, eN, eO, 20);
        U.a(g1, eR, eS, 20);
        V.a(g1, eT, eU, 20);
        V.a(g1, eT + 30, eU, 20);
        V.a(g1, eT + 60, eU, 20);
    }

    private void j(Graphics g1)
    {
        for(int i1 = 0; i1 < au.length; i1++)
        {
            Engine.g.a(g1, au[i1], l, m + i1 * 15, 17);
            if(i1 == 1)
                Engine.h.a(g1, m.P, l + Engine.g.a(au[i1], 0) / 2, m + 2 + i1 * 15, 20);
            if(i1 == 3)
                if(m.L)
                    Engine.h.a(g1, m.J, l + Engine.g.a(au[i1], 0) / 2, m + 2 + i1 * 15, 20);
                else
                    Engine.h.a(g1, m.G, l + Engine.g.a(au[i1], 0) / 2, m + 2 + i1 * 15, 20);
        }

        if(b == 0)
        {
            Engine.g.a(g1, eH, l - 100, n, 20);
            Engine.g.a(g1, eI, l + 10, n, 20);
        }
        if(T % 2 == 0)
        {
            g1.drawImage(m.cI, y, z, 20);
            if(W)
            {
                g1.drawImage(m.cJ, q, r, 20);
                g1.drawImage(m.cK, s, t, 20);
            } else
            {
                g1.drawImage(m.cL, q, r, 20);
                g1.drawImage(m.cM, s, t, 20);
            }
        } else
        {
            g1.drawImage(m.cI, y + 1, z, 20);
            if(W)
            {
                g1.drawImage(m.cJ, q + 1, r, 20);
                g1.drawImage(m.cK, s + 1, t, 20);
            } else
            {
                g1.drawImage(m.cL, q + 1, r, 20);
                g1.drawImage(m.cM, s + 1, t, 20);
            }
        }
        if(W = true)
            g1.drawImage(m.cN, u, v, 20);
        else
            g1.drawImage(m.cO, u, v, 20);
        g1.drawImage(m.cG, o, p, 20);
        g1.drawImage(m.cH, w - 10, x, 20);
        g1.setClip(0, 0, 240, 400);
    }

    public final void run()
    {
    }

    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private int J;
    private int K;
    private int L;
    private int M;
    private int N;
    String a;
    private int O;
    private StringBuffer P;
    private boolean Q;
    private boolean R;
    public int b;
    boolean c;
    private boolean S;
    int d;
    private int T;
    private i U;
    private i V;
    private static boolean W;
    Image e[];
    Image f[];
    private boolean X;
    private Random Y;
    private int Z;
    private int aa;
    private int ab;
    private int ac;
    private int ad;
    private boolean ae;
    private int af;
    private int ag;
    private int ah;
    private int ai;
    private int aj;
    private int ak;
    private String al;
    private String am;
    private String an;
    private String ao;
    private String ap;
    private String aq;
    String g;
    private String ar;
    private String as;
    private String at;
    private String au[];
    private String av[];
    private String aw[];
    private String ax[];
    private int ay;
    private int az;
    private String aA[];
    private int aB;
    private int aC;
    private int aD;
    private boolean aE;
    private int aF;
    private int aG;
    private int aH;
    private int aI;
    private int aJ;
    private int aK;
    private int aL;
    private int aM;
    private int aN;
    private int aO;
    private int aP;
    private int aQ;
    private boolean aR;
    private boolean aS;
    private boolean aT;
    private boolean aU;
    private boolean aV;
    private int aW;
    private int aX;
    private int aY;
    private int aZ;
    private int ba;
    private int bb;
    private int bc;
    private int bd;
    private int be;
    private int bf;
    private int bg;
    private int bh;
    private int bi;
    private int bj;
    private int bk;
    private int bl;
    private int bm;
    private int bn;
    private int bo;
    private int bp;
    private int bq;
    private int br;
    private int bs;
    private int bt;
    private int bu;
    private int bv;
    private boolean bw;
    private String bx[];
    private String by[];
    private String bz[];
    private String bA[];
    private String bB[];
    private int bC;
    private int bD;
    boolean h;
    private boolean bE;
    private boolean bF;
    private int bG;
    private int bH;
    private int bI;
    private int bJ;
    private int bK;
    private int bL;
    private int bM;
    private int bN;
    private int bO;
    private int bP;
    private int bQ;
    private int bR;
    private boolean bS;
    private boolean bT;
    private int bU;
    private int bV;
    private int bW;
    private int bX;
    private int bY;
    private int bZ;
    private int ca;
    private int cb;
    private boolean cc;
    private boolean cd;
    private boolean ce;
    private int cf;
    private int cg;
    private int ch;
    private int ci;
    private int cj;
    private int ck;
    private int cl;
    private int cm;
    private int cn;
    private int co;
    private int cp;
    private int cq;
    private int cr;
    private int cs;
    private int ct;
    private int cu;
    private int cv;
    private int cw;
    private int cx;
    private int cy;
    private int cz;
    private int cA;
    private int cB;
    private int cC;
    private int cD;
    private int cE;
    private int cF;
    private int cG;
    private int cH;
    private int cI;
    private int cJ;
    private int cK;
    private int cL;
    private int cM;
    private int cN;
    private int cO;
    private int cP;
    private int cQ;
    private int cR;
    private int cS;
    private int cT;
    private int cU;
    private boolean cV;
    private int cW;
    private int cX;
    private int cY;
    private int cZ;
    private int da;
    private int db;
    private int dc;
    private int dd;
    private int de;
    private int df;
    private int dg;
    private int dh;
    private int di;
    private int dj;
    private int dk;
    private int dl;
    private int dm;
    private int dn;
    private int _flddo;
    private int dp;
    private int dq;
    private int dr;
    private int ds;
    private int dt;
    private int du;
    private int dv;
    private int dw;
    private int dx;
    private int dy;
    private int dz;
    private int dA;
    private int dB;
    private int dC;
    private int dD;
    private int dE;
    private int dF;
    private int dG;
    private int dH;
    private int dI;
    private int dJ;
    private int dK;
    private int dL;
    private int dM;
    private int dN;
    private int dO;
    private int dP;
    private int dQ;
    private int dR;
    private int dS;
    private int dT;
    private int dU;
    private int dV;
    private int dW;
    private int dX;
    private int dY;
    private int dZ;
    private int ea;
    private int eb;
    private int ec;
    private int ed;
    private int ee;
    private int ef;
    private int eg;
    private int eh;
    private int ei;
    private int ej;
    int i;
    private int ek;
    private int el;
    private int em;
    private int en;
    private int eo;
    private int ep;
    private int eq;
    private boolean er;
    private boolean es;
    private boolean et;
    private boolean eu;
    private boolean ev;
    private boolean ew;
    private boolean ex;
    private boolean ey;
    int j;
    int k;
    private String ez;
    private String eA;
    private String eB;
    private String eC;
    private String eD;
    private String eE;
    private String eF;
    private String eG;
    private String eH;
    private String eI;
    int l;
    int m;
    int n;
    int o;
    int p;
    int q;
    int r;
    int s;
    int t;
    int u;
    int v;
    int w;
    int x;
    int y;
    int z;
    private int eJ;
    private int eK;
    private int eL;
    private int eM;
    private int eN;
    private int eO;
    private int eP;
    private int eQ;
    private int eR;
    private int eS;
    private int eT;
    private int eU;
    private boolean eV;
    private boolean eW;
    private int eX;
    private boolean eY;
    private boolean eZ;
    private boolean fa;
    private int fb;
    private int fc;
    private int fd;
    private int fe;
    private int ff;
    private int fg;
    private int fh;
    private int fi;
    private int fj;
    private int fk;
    private int fl;
    private int fm;
    private int fn;
    private int fo;
    private int fp;
    private int fq;
    private int fr;
    private int fs;
    private int ft;
    private int fu;
    private int fv;
    private int fw;
    private int fx;
    private int fy;
    private int fz;
    private int fA;
    private int fB;
    private int fC;
    private int fD;
    private int fE;
    private int fF;
    private int fG;
    private int fH;
    private int fI;
    private boolean fJ;
    private int fK;
    private int fL;
    private int fM;
    private int fN;
    private int fO;
    private int fP;
}
