package S2;

import K2.g;
import U2.C0594a;
import U2.C0595b;
import android.content.Context;
import android.content.pm.PackageManager;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f5646b;

    public /* synthetic */ e(f fVar, int i) {
        this.f5645a = i;
        this.f5646b = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g gVar;
        String str;
        switch (this.f5645a) {
            case 0:
                f fVar = this.f5646b;
                d dVar = fVar.f5654l;
                boolean z4 = fVar.f5658q;
                dVar.f5644d.a(z4);
                dVar.e.a(z4);
                return;
            default:
                f fVar2 = this.f5646b;
                U1.g gVar2 = fVar2.f5651d;
                gVar2.a();
                Context context = gVar2.f5904a;
                fVar2.j = context;
                fVar2.f5656o = context.getPackageName();
                fVar2.f5653k = K2.a.e();
                fVar2.f5654l = new d(fVar2.j, new T2.g(100L, 1L, TimeUnit.MINUTES));
                fVar2.m = J2.c.a();
                B2.b bVar = fVar2.f5652g;
                K2.a aVar = fVar2.f5653k;
                aVar.getClass();
                g gVar3 = g.f2567b;
                synchronized (g.class) {
                    try {
                        if (g.f2567b == null) {
                            g.f2567b = new g();
                        }
                        gVar = g.f2567b;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                gVar.getClass();
                Long l6 = (Long) aVar.f2561a.getRemoteConfigValueOrDefault("fpr_log_source", -1L);
                l6.getClass();
                Map map = g.c;
                if (!map.containsKey(l6) || (str = (String) map.get(l6)) == null) {
                    T2.d dVarD = aVar.d(gVar);
                    str = dVarD.b() ? (String) dVarD.a() : "FIREPERF";
                } else {
                    aVar.c.f("com.google.firebase.perf.LogSourceName", str);
                }
                fVar2.h = new a(bVar, str);
                fVar2.m.d(new WeakReference(f.f5648s));
                U2.e eVarD = U2.g.D();
                fVar2.f5655n = eVarD;
                U1.g gVar4 = fVar2.f5651d;
                gVar4.a();
                String str2 = gVar4.c.f5912b;
                eVarD.i();
                U2.g.s((U2.g) eVarD.f10116b, str2);
                C0594a c0594aY = C0595b.y();
                String str3 = fVar2.f5656o;
                c0594aY.i();
                C0595b.s((C0595b) c0594aY.f10116b, str3);
                c0594aY.i();
                C0595b.t((C0595b) c0594aY.f10116b);
                Context context2 = fVar2.j;
                String str4 = "";
                try {
                    String str5 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionName;
                    if (str5 != null) {
                        str4 = str5;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                c0594aY.i();
                C0595b.u((C0595b) c0594aY.f10116b, str4);
                eVarD.i();
                U2.g.w((U2.g) eVarD.f10116b, (C0595b) c0594aY.g());
                fVar2.c.set(true);
                while (true) {
                    ConcurrentLinkedQueue concurrentLinkedQueue = fVar2.f5650b;
                    if (concurrentLinkedQueue.isEmpty()) {
                        return;
                    }
                    b bVar2 = (b) concurrentLinkedQueue.poll();
                    if (bVar2 != null) {
                        fVar2.i.execute(new B5.g(11, fVar2, bVar2));
                    }
                }
                break;
        }
    }
}
