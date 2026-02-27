package y1;

import O1.S;
import O1.T;
import O1.U;
import O1.X;
import O1.t0;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.gms.ads.RequestConfiguration;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import dOYHB6.yFtIp6.ht2aO8;
import java.util.HashMap;
import kotlin.jvm.internal.B;
import p3.s;
import z1.AbstractC2550e;

/* JADX INFO: renamed from: y1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2497b {
    public static final U i;
    public static final t0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final t0 f21038k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final t0 f21039l;
    public static final t0 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final t0 f21040n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f21041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X f21042b;
    public final p8.a c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final B f21043d;
    public final s e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f21044g;
    public long h;

    static {
        T t5 = new T();
        t5.b("AD", 1, 2, 0, 0, 2);
        t5.b("AE", 1, 4, 4, 4, 1);
        t5.b("AF", 4, 4, 3, 4, 2);
        t5.b("AG", 2, 2, 1, 1, 2);
        t5.b("AI", 1, 2, 2, 2, 2);
        t5.b("AL", 1, 1, 0, 1, 2);
        t5.b("AM", 2, 2, 1, 2, 2);
        t5.b("AO", 3, 4, 4, 2, 2);
        t5.b("AR", 2, 4, 2, 2, 2);
        t5.b("AS", 2, 2, 4, 3, 2);
        t5.b("AT", 0, 3, 0, 0, 2);
        t5.b("AU", 0, 2, 0, 1, 1);
        t5.b("AW", 1, 2, 0, 4, 2);
        t5.b("AX", 0, 2, 2, 2, 2);
        t5.b("AZ", 3, 3, 3, 4, 2);
        t5.b("BA", 1, 1, 0, 1, 2);
        t5.b("BB", 0, 2, 0, 0, 2);
        t5.b("BD", 2, 0, 3, 3, 2);
        t5.b("BE", 0, 1, 2, 3, 2);
        t5.b("BF", 4, 4, 4, 2, 2);
        t5.b("BG", 0, 1, 0, 0, 2);
        t5.b("BH", 1, 0, 2, 4, 2);
        t5.b("BI", 4, 4, 4, 4, 2);
        t5.b("BJ", 4, 4, 3, 4, 2);
        t5.b("BL", 1, 2, 2, 2, 2);
        t5.b("BM", 1, 2, 0, 0, 2);
        t5.b("BN", 4, 0, 1, 1, 2);
        t5.b("BO", 2, 3, 3, 2, 2);
        t5.b("BQ", 1, 2, 1, 2, 2);
        t5.b("BR", 2, 4, 2, 1, 2);
        t5.b("BS", 3, 2, 2, 3, 2);
        t5.b("BT", 3, 0, 3, 2, 2);
        t5.b("BW", 3, 4, 2, 2, 2);
        t5.b("BY", 1, 0, 2, 1, 2);
        t5.b("BZ", 2, 2, 2, 1, 2);
        t5.b("CA", 0, 3, 1, 2, 3);
        t5.b("CD", 4, 3, 2, 2, 2);
        t5.b("CF", 4, 2, 2, 2, 2);
        t5.b("CG", 3, 4, 1, 1, 2);
        t5.b("CH", 0, 1, 0, 0, 0);
        t5.b("CI", 3, 3, 3, 3, 2);
        t5.b("CK", 3, 2, 1, 0, 2);
        t5.b("CL", 1, 1, 2, 3, 2);
        t5.b("CM", 3, 4, 3, 2, 2);
        t5.b("CN", 2, 2, 2, 1, 3);
        t5.b("CO", 2, 4, 3, 2, 2);
        t5.b("CR", 2, 3, 4, 4, 2);
        t5.b("CU", 4, 4, 2, 1, 2);
        t5.b("CV", 2, 3, 3, 3, 2);
        t5.b("CW", 1, 2, 0, 0, 2);
        t5.b("CY", 1, 2, 0, 0, 2);
        t5.b("CZ", 0, 1, 0, 0, 2);
        t5.b("DE", 0, 1, 1, 2, 0);
        t5.b("DJ", 4, 1, 4, 4, 2);
        t5.b("DK", 0, 0, 1, 0, 2);
        t5.b("DM", 1, 2, 2, 2, 2);
        t5.b("DO", 3, 4, 4, 4, 2);
        t5.b("DZ", 3, 2, 4, 4, 2);
        t5.b("EC", 2, 4, 3, 2, 2);
        t5.b("EE", 0, 0, 0, 0, 2);
        t5.b("EG", 3, 4, 2, 1, 2);
        t5.b("EH", 2, 2, 2, 2, 2);
        t5.b("ER", 4, 2, 2, 2, 2);
        t5.b("ES", 0, 1, 2, 1, 2);
        t5.b("ET", 4, 4, 4, 1, 2);
        t5.b("FI", 0, 0, 1, 0, 0);
        t5.b("FJ", 3, 0, 3, 3, 2);
        t5.b("FK", 2, 2, 2, 2, 2);
        t5.b("FM", 4, 2, 4, 3, 2);
        t5.b("FO", 0, 2, 0, 0, 2);
        t5.b("FR", 1, 0, 2, 1, 2);
        t5.b("GA", 3, 3, 1, 0, 2);
        t5.b("GB", 0, 0, 1, 2, 2);
        t5.b("GD", 1, 2, 2, 2, 2);
        t5.b("GE", 1, 0, 1, 3, 2);
        t5.b("GF", 2, 2, 2, 4, 2);
        t5.b("GG", 0, 2, 0, 0, 2);
        t5.b("GH", 3, 2, 3, 2, 2);
        t5.b("GI", 0, 2, 0, 0, 2);
        t5.b("GL", 1, 2, 2, 1, 2);
        t5.b("GM", 4, 3, 2, 4, 2);
        t5.b("GN", 4, 3, 4, 2, 2);
        t5.b("GP", 2, 2, 3, 4, 2);
        t5.b("GQ", 4, 2, 3, 4, 2);
        t5.b("GR", 1, 1, 0, 1, 2);
        t5.b("GT", 3, 2, 3, 2, 2);
        t5.b("GU", 1, 2, 4, 4, 2);
        t5.b("GW", 3, 4, 4, 3, 2);
        t5.b("GY", 3, 3, 1, 0, 2);
        t5.b("HK", 0, 2, 3, 4, 2);
        t5.b("HN", 3, 0, 3, 3, 2);
        t5.b("HR", 1, 1, 0, 1, 2);
        t5.b("HT", 4, 3, 4, 4, 2);
        t5.b("HU", 0, 1, 0, 0, 2);
        t5.b("ID", 3, 2, 2, 3, 2);
        t5.b("IE", 0, 0, 1, 1, 2);
        t5.b("IL", 1, 0, 2, 3, 2);
        t5.b("IM", 0, 2, 0, 1, 2);
        t5.b("IN", 2, 1, 3, 3, 2);
        t5.b("IO", 4, 2, 2, 4, 2);
        t5.b("IQ", 3, 2, 4, 3, 2);
        t5.b("IR", 4, 2, 3, 4, 2);
        t5.b("IS", 0, 2, 0, 0, 2);
        t5.b("IT", 0, 0, 1, 1, 2);
        t5.b("JE", 2, 2, 0, 2, 2);
        t5.b("JM", 3, 3, 4, 4, 2);
        t5.b("JO", 1, 2, 1, 1, 2);
        t5.b("JP", 0, 2, 0, 1, 3);
        t5.b("KE", 3, 4, 2, 2, 2);
        t5.b("KG", 1, 0, 2, 2, 2);
        t5.b("KH", 2, 0, 4, 3, 2);
        t5.b("KI", 4, 2, 3, 1, 2);
        t5.b("KM", 4, 2, 2, 3, 2);
        t5.b("KN", 1, 2, 2, 2, 2);
        t5.b("KP", 4, 2, 2, 2, 2);
        t5.b("KR", 0, 2, 1, 1, 1);
        t5.b("KW", 2, 3, 1, 1, 1);
        t5.b("KY", 1, 2, 0, 0, 2);
        t5.b("KZ", 1, 2, 2, 3, 2);
        t5.b("LA", 2, 2, 1, 1, 2);
        t5.b("LB", 3, 2, 0, 0, 2);
        t5.b("LC", 1, 1, 0, 0, 2);
        t5.b(i.f16190v, 0, 2, 2, 2, 2);
        t5.b("LK", 2, 0, 2, 3, 2);
        t5.b("LR", 3, 4, 3, 2, 2);
        t5.b("LS", 3, 3, 2, 3, 2);
        t5.b("LT", 0, 0, 0, 0, 2);
        t5.b("LU", 0, 0, 0, 0, 2);
        t5.b("LV", 0, 0, 0, 0, 2);
        t5.b("LY", 4, 2, 4, 3, 2);
        t5.b(RequestConfiguration.MAX_AD_CONTENT_RATING_MA, 2, 1, 2, 1, 2);
        t5.b("MC", 0, 2, 2, 2, 2);
        t5.b("MD", 1, 2, 0, 0, 2);
        t5.b("ME", 1, 2, 1, 2, 2);
        t5.b("MF", 1, 2, 1, 0, 2);
        t5.b("MG", 3, 4, 3, 3, 2);
        t5.b("MH", 4, 2, 2, 4, 2);
        t5.b("MK", 1, 0, 0, 0, 2);
        t5.b("ML", 4, 4, 1, 1, 2);
        t5.b("MM", 2, 3, 2, 2, 2);
        t5.b("MN", 2, 4, 1, 1, 2);
        t5.b("MO", 0, 2, 4, 4, 2);
        t5.b("MP", 0, 2, 2, 2, 2);
        t5.b("MQ", 2, 2, 2, 3, 2);
        t5.b("MR", 3, 0, 4, 2, 2);
        t5.b("MS", 1, 2, 2, 2, 2);
        t5.b("MT", 0, 2, 0, 1, 2);
        t5.b("MU", 3, 1, 2, 3, 2);
        t5.b("MV", 4, 3, 1, 4, 2);
        t5.b("MW", 4, 1, 1, 0, 2);
        t5.b("MX", 2, 4, 3, 3, 2);
        t5.b("MY", 2, 0, 3, 3, 2);
        t5.b("MZ", 3, 3, 2, 3, 2);
        t5.b("NA", 4, 3, 2, 2, 2);
        t5.b("NC", 2, 0, 4, 4, 2);
        t5.b("NE", 4, 4, 4, 4, 2);
        t5.b("NF", 2, 2, 2, 2, 2);
        t5.b("NG", 3, 3, 2, 2, 2);
        t5.b("NI", 3, 1, 4, 4, 2);
        t5.b("NL", 0, 2, 4, 2, 0);
        t5.b("NO", 0, 1, 1, 0, 2);
        t5.b("NP", 2, 0, 4, 3, 2);
        t5.b("NR", 4, 2, 3, 1, 2);
        t5.b("NU", 4, 2, 2, 2, 2);
        t5.b("NZ", 0, 2, 1, 2, 4);
        t5.b("OM", 2, 2, 0, 2, 2);
        t5.b("PA", 1, 3, 3, 4, 2);
        t5.b("PE", 2, 4, 4, 4, 2);
        t5.b("PF", 2, 2, 1, 1, 2);
        t5.b(RequestConfiguration.MAX_AD_CONTENT_RATING_PG, 4, 3, 3, 2, 2);
        t5.b("PH", 3, 0, 3, 4, 4);
        t5.b("PK", 3, 2, 3, 3, 2);
        t5.b("PL", 1, 0, 2, 2, 2);
        t5.b("PM", 0, 2, 2, 2, 2);
        t5.b("PR", 1, 2, 2, 3, 4);
        t5.b("PS", 3, 3, 2, 2, 2);
        t5.b("PT", 1, 1, 0, 0, 2);
        t5.b("PW", 1, 2, 3, 0, 2);
        t5.b("PY", 2, 0, 3, 3, 2);
        t5.b("QA", 2, 3, 1, 2, 2);
        t5.b("RE", 1, 0, 2, 1, 2);
        t5.b("RO", 1, 1, 1, 2, 2);
        t5.b("RS", 1, 2, 0, 0, 2);
        t5.b("RU", 0, 1, 0, 1, 2);
        t5.b("RW", 4, 3, 3, 4, 2);
        t5.b("SA", 2, 2, 2, 1, 2);
        t5.b("SB", 4, 2, 4, 2, 2);
        t5.b("SC", 4, 2, 0, 1, 2);
        t5.b("SD", 4, 4, 4, 3, 2);
        t5.b("SE", 0, 0, 0, 0, 2);
        t5.b("SG", 0, 0, 3, 3, 4);
        t5.b("SH", 4, 2, 2, 2, 2);
        t5.b("SI", 0, 1, 0, 0, 2);
        t5.b("SJ", 2, 2, 2, 2, 2);
        t5.b("SK", 0, 1, 0, 0, 2);
        t5.b("SL", 4, 3, 3, 1, 2);
        t5.b("SM", 0, 2, 2, 2, 2);
        t5.b("SN", 4, 4, 4, 3, 2);
        t5.b("SO", 3, 4, 4, 4, 2);
        t5.b("SR", 3, 2, 3, 1, 2);
        t5.b("SS", 4, 1, 4, 2, 2);
        t5.b("ST", 2, 2, 1, 2, 2);
        t5.b("SV", 2, 1, 4, 4, 2);
        t5.b("SX", 2, 2, 1, 0, 2);
        t5.b("SY", 4, 3, 2, 2, 2);
        t5.b("SZ", 3, 4, 3, 4, 2);
        t5.b("TC", 1, 2, 1, 0, 2);
        t5.b(i.f16154B, 4, 4, 4, 4, 2);
        t5.b("TG", 3, 2, 1, 0, 2);
        t5.b(i.f16153A, 1, 3, 4, 3, 0);
        t5.b("TJ", 4, 4, 4, 4, 2);
        t5.b("TL", 4, 1, 4, 4, 2);
        t5.b("TM", 4, 2, 1, 2, 2);
        t5.b("TN", 2, 1, 1, 1, 2);
        t5.b("TO", 3, 3, 4, 2, 2);
        t5.b(i.f16194z, 1, 2, 1, 1, 2);
        t5.b("TT", 1, 3, 1, 3, 2);
        t5.b("TV", 3, 2, 2, 4, 2);
        t5.b("TW", 0, 0, 0, 0, 1);
        t5.b("TZ", 3, 3, 3, 2, 2);
        t5.b("UA", 0, 3, 0, 0, 2);
        t5.b("UG", 3, 2, 2, 3, 2);
        t5.b("US", 0, 1, 3, 3, 3);
        t5.b("UY", 2, 1, 1, 1, 2);
        t5.b("UZ", 2, 0, 3, 2, 2);
        t5.b("VC", 2, 2, 2, 2, 2);
        t5.b("VE", 4, 4, 4, 4, 2);
        t5.b("VG", 2, 2, 1, 2, 2);
        t5.b("VI", 1, 2, 2, 4, 2);
        t5.b("VN", 0, 1, 4, 4, 2);
        t5.b("VU", 4, 1, 3, 1, 2);
        t5.b("WS", 3, 1, 4, 2, 2);
        t5.b("XK", 1, 1, 1, 0, 2);
        t5.b("YE", 4, 4, 4, 4, 2);
        t5.b("YT", 3, 2, 1, 3, 2);
        t5.b("ZA", 2, 3, 2, 2, 2);
        t5.b("ZM", 3, 2, 2, 3, 2);
        t5.b("ZW", 3, 3, 3, 3, 2);
        i = t5.a();
        j = S.o(6100000L, 3800000L, 2100000L, 1300000L, 590000L);
        f21038k = S.o(218000L, 159000L, 145000L, 130000L, 112000L);
        f21039l = S.o(2200000L, 1300000L, 930000L, 730000L, 530000L);
        m = S.o(4800000L, 2700000L, 1800000L, 1200000L, 630000L);
        f21040n = S.o(12000000L, 8800000L, 5900000L, 3500000L, 1800000L);
    }

    public C2497b(Context context, HashMap map, s sVar, boolean z4) {
        C2496a c2496a;
        this.f21041a = context == null ? null : context.getApplicationContext();
        this.f21042b = X.a(map);
        this.c = new p8.a();
        this.f21043d = new B(1);
        this.e = sVar;
        int iC = context == null ? 0 : AbstractC2550e.c(context);
        this.f = iC;
        this.f21044g = a(iC);
        if (context == null || !z4) {
            return;
        }
        C2496a c2496a2 = C2496a.f21035d;
        synchronized (C2496a.class) {
            try {
                if (C2496a.f21035d == null) {
                    C2496a.f21035d = new C2496a();
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                    ht2aO8.registerReceiver(context, C2496a.f21035d, intentFilter);
                }
                c2496a = C2496a.f21035d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        c2496a.c(this);
    }

    public final long a(int i4) {
        Integer numValueOf = Integer.valueOf(i4);
        X x6 = this.f21042b;
        Long l6 = (Long) x6.get(numValueOf);
        if (l6 == null) {
            l6 = (Long) x6.get(0);
        }
        if (l6 == null) {
            l6 = 1000000L;
        }
        return l6.longValue();
    }
}
