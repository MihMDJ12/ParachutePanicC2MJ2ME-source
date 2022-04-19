import engine.Engine;

public final class a
{

    public a(g g1, int i1, int j1)
    {
        N = g1;
        b = i1;
        c = j1;
        f = 0;
        q = false;
        k = false;
        l = true;
        m = false;
        n = false;
        o = false;
        p = false;
        t = false;
        C = new l(g1, g1.S, 1, true);
        D = new l(g1, g1.T, 1, false);
        E = new l(g1, g1.U, 1, true);
        O = new l(g1, g1.V, 1, true);
        F = new l(g1, Engine.b.e, 1, true);
        G = new l(g1, g1.W, 1, false);
        H = new l(g1, Engine.b.f, 1, true);
        I = new l(g1, g1.X, 1, false);
        P = new l(g1, g1.Y, 1, true);
        J = new l(g1, g1.Z, 1, false);
        Q = new l(g1, g1.aa, 1, true);
        K = new l(g1, g1.R, 1, true);
        B = new l(g1, g1.ab, 1, true);
        (i1 = ((a) (g1 = this)).B).a = 0;
        (i1 = ((a) (g1)).C).a = 0;
        (i1 = ((a) (g1)).D).a = 0;
        (i1 = ((a) (g1)).E).a = 0;
        (i1 = ((a) (g1)).O).a = 0;
        (i1 = ((a) (g1)).F).a = 0;
        (i1 = ((a) (g1)).G).a = 0;
        (i1 = ((a) (g1)).H).a = 0;
        (i1 = ((a) (g1)).I).a = 0;
        (i1 = ((a) (g1)).P).a = 0;
        (i1 = ((a) (g1)).J).a = 0;
        (i1 = ((a) (g1)).Q).a = 0;
        g = 0;
        i = 4;
    }

    public final boolean a()
    {
        boolean flag = false;
        for(int i1 = 0; i1 < 2; i1++)
            if(N.K[i1] != null)
            {
                if(N.K[i1].d == 1 && b >= N.K[i1].a - 62 && b <= N.K[i1].a + 62)
                {
                    a = i1;
                    flag = true;
                }
                if(N.K[i1].d == 2 && (b >= N.K[i1].a - 62 && b <= N.K[i1].a + 62 || N.K[i1].j && b >= N.K[i1].g - 62 && b <= N.K[i1].g + 62))
                {
                    a = i1;
                    flag = true;
                }
                if(N.K[i1].d == 3 && b >= N.K[i1].a - 42 && b <= N.K[i1].a + 42)
                {
                    a = i1;
                    flag = true;
                }
                if(N.K[i1].d == 4 && b >= N.K[i1].a - 42 && b <= N.K[i1].a + 42 || N.K[i1].j && b >= N.K[i1].g - 42 && b <= N.K[i1].g + 42)
                {
                    a = i1;
                    flag = true;
                }
            }

        return flag;
    }

    public final boolean a(int i1, int j1)
    {
        return k && N.ag != 0 && w.a(i1, j1, b - (d + 100) / 2, c - (e + 100) / 2, d + 100, e + 100);
    }

    int a;
    int b;
    int c;
    int d;
    int e;
    int f;
    int g;
    int h;
    int i;
    boolean j;
    boolean k;
    boolean l;
    boolean m;
    boolean n;
    boolean o;
    boolean p;
    boolean q;
    boolean r;
    boolean s;
    boolean t;
    boolean u;
    boolean v;
    boolean w;
    boolean x;
    boolean y;
    boolean z;
    int A;
    l B;
    l C;
    l D;
    l E;
    private l O;
    l F;
    l G;
    l H;
    l I;
    private l P;
    l J;
    private l Q;
    l K;
    boolean L;
    boolean M;
    final g N;
}