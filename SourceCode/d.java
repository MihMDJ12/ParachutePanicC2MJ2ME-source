public abstract class d
{

    private d()
    {
    }

    public static int a(int i)
    {
        return i << 12;
    }

    public static int a(int i, int j)
    {
        boolean flag = false;
        if(j == 4096)
            return i;
        if((j & 0xfff) == 0)
            return i / (j >> 12);
        if(i < 0)
        {
            i = -i;
            flag = true;
        }
        if(j < 0)
        {
            j = -j;
            if(flag)
                flag = false;
            else
                flag = true;
        }
        byte byte0 = 0;
        if(i > 0x64fff)
            byte0 = 3;
        if(i > 0x3e8fff)
            byte0 = 4;
        if(i > 0x7dffff)
            byte0 = 6;
        if(i > 0x1f4ffff)
            byte0 = 8;
        if(i > 0x7dfffff)
            byte0 = 10;
        if(byte0 > 0)
        {
            int k = 2 << byte0 - 1;
            i += k;
            j += k;
        }
        int l = (i << 12 - byte0) / (j >> byte0);
        if(flag)
            return -l;
        else
            return l;
    }

    static 
    {
        int ai[] = new int[91];
        ai[0] = 0;
        ai[1] = 71;
        ai[2] = 142;
        ai[3] = 214;
        ai[4] = 285;
        ai[5] = 357;
        ai[6] = 428;
        ai[7] = 499;
        ai[8] = 570;
        ai[9] = 641;
        ai[10] = 711;
        ai[11] = 781;
        ai[12] = 851;
        ai[13] = 921;
        ai[14] = 990;
        ai[15] = 1060;
        ai[16] = 1128;
        ai[17] = 1197;
        ai[18] = 1265;
        ai[19] = 1333;
        ai[20] = 1400;
        ai[21] = 1468;
        ai[22] = 1534;
        ai[23] = 1600;
        ai[24] = 1665;
        ai[25] = 1730;
        ai[26] = 1795;
        ai[27] = 1859;
        ai[28] = 1922;
        ai[29] = 1985;
        ai[30] = 2048;
        ai[31] = 2109;
        ai[32] = 2170;
        ai[33] = 2230;
        ai[34] = 2290;
        ai[35] = 2349;
        ai[36] = 2407;
        ai[37] = 2464;
        ai[38] = 2521;
        ai[39] = 2577;
        ai[40] = 2632;
        ai[41] = 2686;
        ai[42] = 2740;
        ai[43] = 2793;
        ai[44] = 2845;
        ai[45] = 2896;
        ai[46] = 2946;
        ai[47] = 2995;
        ai[48] = 3043;
        ai[49] = 3091;
        ai[50] = 3137;
        ai[51] = 3183;
        ai[52] = 3227;
        ai[53] = 3271;
        ai[54] = 3313;
        ai[55] = 3355;
        ai[56] = 3395;
        ai[57] = 3434;
        ai[58] = 3473;
        ai[59] = 3510;
        ai[60] = 3547;
        ai[61] = 3582;
        ai[62] = 3616;
        ai[63] = 3649;
        ai[64] = 3681;
        ai[65] = 3712;
        ai[66] = 3741;
        ai[67] = 3770;
        ai[68] = 3797;
        ai[69] = 3823;
        ai[70] = 3849;
        ai[71] = 3872;
        ai[72] = 3895;
        ai[73] = 3917;
        ai[74] = 3937;
        ai[75] = 3956;
        ai[76] = 3974;
        ai[77] = 3991;
        ai[78] = 4006;
        ai[79] = 4020;
        ai[80] = 4033;
        ai[81] = 4045;
        ai[82] = 4056;
        ai[83] = 4065;
        ai[84] = 4073;
        ai[85] = 4080;
        ai[86] = 4086;
        ai[87] = 4090;
        ai[88] = 4093;
        ai[89] = 4095;
        ai[90] = 4096;
    }
}
