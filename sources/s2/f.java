package S2;

import U1.g;
import U2.A;
import U2.i;
import U2.o;
import U2.r;
import U2.t;
import U2.u;
import We.s;
import android.content.Context;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements J2.b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final M2.a f5647r = M2.a.d();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final f f5648s = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f5649a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g f5651d;
    public I2.c e;
    public C2.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public B2.b f5652g;
    public a h;
    public Context j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public K2.a f5653k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public d f5654l;
    public J2.c m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public U2.e f5655n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f5656o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f5657p;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue f5650b = new ConcurrentLinkedQueue();
    public final AtomicBoolean c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f5658q = false;
    public final ThreadPoolExecutor i = new ThreadPoolExecutor(0, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());

    public f() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f5649a = concurrentHashMap;
        concurrentHashMap.put("KEY_AVAILABLE_TRACES_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", 50);
    }

    public static String a(u uVar) {
        if (uVar.d()) {
            A aE = uVar.e();
            long jG = aE.G();
            Locale locale = Locale.ENGLISH;
            return s.l("trace metric: ", aE.H(), " (duration: ", new DecimalFormat("#.####").format(jG / 1000.0d), "ms)");
        }
        if (uVar.b()) {
            r rVarC = uVar.c();
            long jN = rVarC.W() ? rVarC.N() : 0L;
            String strValueOf = rVarC.S() ? String.valueOf(rVarC.I()) : "UNKNOWN";
            Locale locale2 = Locale.ENGLISH;
            return s.p(s.x("network request trace: ", rVarC.P(), " (responseCode: ", strValueOf, ", responseTime: "), new DecimalFormat("#.####").format(jN / 1000.0d), "ms)");
        }
        if (!uVar.a()) {
            return "log";
        }
        o oVarF = uVar.f();
        Locale locale3 = Locale.ENGLISH;
        boolean zA = oVarF.A();
        int iX = oVarF.x();
        int iW = oVarF.w();
        StringBuilder sb2 = new StringBuilder("gauges (hasMetadata: ");
        sb2.append(zA);
        sb2.append(", cpuGaugeCount: ");
        sb2.append(iX);
        sb2.append(", memoryGaugeCount: ");
        return s.o(sb2, ")", iW);
    }

    public final void b(t tVar) {
        if (tVar.d()) {
            this.m.b("_fstec");
        } else if (tVar.b()) {
            this.m.b("_fsntc");
        }
    }

    public final void c(A a8, i iVar) {
        this.i.execute(new I6.a(9, this, a8, iVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:187:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(U2.s r18, U2.i r19) {
        /*
            Method dump skipped, instruction units count: 1139
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S2.f.d(U2.s, U2.i):void");
    }

    @Override // J2.b
    public final void onUpdateAppState(i iVar) {
        this.f5658q = iVar == i.FOREGROUND;
        if (this.c.get()) {
            this.i.execute(new e(this, 0));
        }
    }
}
