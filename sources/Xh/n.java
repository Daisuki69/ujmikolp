package Xh;

import D.C0176i;
import D.P;
import D8.C0193a;
import Ej.Z;
import We.s;
import android.content.Context;
import androidx.media3.exoplayer.rtsp.RtspHeaders;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import ki.C1781b;
import oi.C1990h;
import ui.C2321h;

/* JADX INFO: loaded from: classes4.dex */
public final class n {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Object f6659o = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0193a f6660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f6661b;
    public final AtomicBoolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f6662d;
    public final zi.c e;
    public final C0176i f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Ei.c f6663g;
    public volatile Z h;
    public final m i;
    public final C1990h j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C1781b f6664k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d f6665l;
    public final C2321h m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ExecutorService f6666n;

    /* JADX WARN: Removed duplicated region for block: B:107:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x06b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public n(Yh.a r63, Xh.d r64, android.content.Context r65) {
        /*
            Method dump skipped, instruction units count: 1868
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Xh.n.<init>(Yh.a, Xh.d, android.content.Context):void");
    }

    public static io.split.android.client.network.d b(d dVar, Context context, zi.f fVar, z2.d dVar2, Ji.a aVar) {
        io.split.android.client.network.c cVar = new io.split.android.client.network.c();
        long j = 10000;
        if (j > 0) {
            cVar.f17575d = j;
        }
        if (j > 0) {
            cVar.c = j;
        }
        io.split.android.client.network.e eVar = dVar.f6632a;
        if (eVar != null) {
            cVar.f17574b = eVar;
            cVar.f17573a = eVar.h;
        }
        io.split.android.client.network.d dVarA = cVar.a();
        if (eVar != null && aVar != null) {
            P p10 = new P(2, aVar, dVar, fVar, false);
            if (!eVar.i) {
                new Thread(p10).start();
            }
        }
        io.split.android.client.network.l lVar = new io.split.android.client.network.l();
        HashMap map = lVar.f17604a;
        map.put(RtspHeaders.CONTENT_TYPE, "application/json");
        map.put(RtspHeaders.ACCEPT, "application/json");
        lVar.f17604a.put("SplitSDKMachineIP", "unknown");
        lVar.f17604a.put("SplitSDKMachineName", "unknown");
        lVar.b(d.f6631k);
        lVar.f17604a.put(RtspHeaders.AUTHORIZATION, "Bearer r7khp5rhirj501lqn5t6q1chpnc1cis703jd");
        dVarA.a(lVar.a());
        io.split.android.client.network.l lVar2 = new io.split.android.client.network.l();
        lVar2.f17604a.put(RtspHeaders.CONTENT_TYPE, "text/event-stream");
        lVar2.f17604a.put("SplitSDKClientKey", "r7khp5rhirj501lqn5t6q1chpnc1cis703jd".substring(32));
        lVar2.b(d.f6631k);
        for (Map.Entry entry : lVar2.a().entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (str == null || str2 == null) {
                throw new IllegalArgumentException(s.k("Invalid value for streaming header ", str, ": ", str2));
            }
            dVarA.f17578b.put(str, str2);
        }
        return dVarA;
    }

    public final void a() {
        synchronized (n.class) {
            try {
                if (!this.c.get()) {
                    ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
                    a aVar = this.f6661b;
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    scheduledExecutorServiceNewSingleThreadScheduledExecutor.schedule(aVar, 100L, timeUnit);
                    scheduledExecutorServiceNewSingleThreadScheduledExecutor.schedule(new C.h(scheduledExecutorServiceNewSingleThreadScheduledExecutor, 12), 500L, timeUnit);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
