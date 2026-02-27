package W2;

import D.CallableC0168a;
import We.s;
import X2.o;
import X2.p;
import android.app.Application;
import android.content.Context;
import com.dynatrace.android.agent.Global;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements Z2.a {
    public static final Clock j = DefaultClock.getInstance();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Random f6224k = new Random();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final HashMap f6225l = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f6227b;
    public final ScheduledExecutorService c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final U1.g f6228d;
    public final C2.e e;
    public final V1.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final B2.b f6229g;
    public final String h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f6226a = new HashMap();
    public final HashMap i = new HashMap();

    public j(Context context, ScheduledExecutorService scheduledExecutorService, U1.g gVar, C2.e eVar, V1.b bVar, B2.b bVar2) {
        this.f6227b = context;
        this.c = scheduledExecutorService;
        this.f6228d = gVar;
        this.e = eVar;
        this.f = bVar;
        this.f6229g = bVar2;
        gVar.a();
        this.h = gVar.c.f5912b;
        AtomicReference atomicReference = i.f6223a;
        Application application = (Application) context.getApplicationContext();
        AtomicReference atomicReference2 = i.f6223a;
        if (atomicReference2.get() == null) {
            i iVar = new i();
            while (true) {
                if (atomicReference2.compareAndSet(null, iVar)) {
                    BackgroundDetector.initialize(application);
                    BackgroundDetector.getInstance().addListener(iVar);
                    break;
                } else if (atomicReference2.get() != null) {
                    break;
                }
            }
        }
        Tasks.call(scheduledExecutorService, new CallableC0168a(this, 7));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized W2.e a(U1.g r13, java.lang.String r14, C2.e r15, V1.b r16, java.util.concurrent.Executor r17, X2.d r18, X2.d r19, X2.d r20, X2.j r21, X2.k r22, X2.o r23, com.google.firebase.messaging.r r24) {
        /*
            r12 = this;
            monitor-enter(r12)
            java.util.HashMap r0 = r12.f6226a     // Catch: java.lang.Throwable -> L5d
            boolean r0 = r0.containsKey(r14)     // Catch: java.lang.Throwable -> L5d
            if (r0 != 0) goto L60
            W2.e r1 = new W2.e     // Catch: java.lang.Throwable -> L5d
            java.lang.String r0 = "firebase"
            boolean r0 = r14.equals(r0)     // Catch: java.lang.Throwable -> L5d
            if (r0 == 0) goto L23
            r13.a()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r0 = "[DEFAULT]"
            java.lang.String r2 = r13.f5905b     // Catch: java.lang.Throwable -> L5d
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> L5d
            if (r0 == 0) goto L23
            r2 = r16
            goto L25
        L23:
            r0 = 0
            r2 = r0
        L25:
            android.content.Context r8 = r12.f6227b     // Catch: java.lang.Throwable -> L5d
            r3 = r12
            r4 = r13
            r9 = r14
            r5 = r15
            r7 = r19
            r6 = r21
            r10 = r23
            U8.c r13 = r3.e(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L5d
            r10 = r13
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r11 = r24
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L5d
            r19.b()     // Catch: java.lang.Throwable -> L5d
            r20.b()     // Catch: java.lang.Throwable -> L5d
            r18.b()     // Catch: java.lang.Throwable -> L5d
            java.util.HashMap r13 = r12.f6226a     // Catch: java.lang.Throwable -> L5d
            r13.put(r14, r1)     // Catch: java.lang.Throwable -> L5d
            java.util.HashMap r13 = W2.j.f6225l     // Catch: java.lang.Throwable -> L5d
            r13.put(r14, r1)     // Catch: java.lang.Throwable -> L5d
            goto L60
        L5d:
            r0 = move-exception
            r13 = r0
            goto L6a
        L60:
            java.util.HashMap r13 = r12.f6226a     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r13 = r13.get(r14)     // Catch: java.lang.Throwable -> L5d
            W2.e r13 = (W2.e) r13     // Catch: java.lang.Throwable -> L5d
            monitor-exit(r12)
            return r13
        L6a:
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L5d
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: W2.j.a(U1.g, java.lang.String, C2.e, V1.b, java.util.concurrent.Executor, X2.d, X2.d, X2.d, X2.j, X2.k, X2.o, com.google.firebase.messaging.r):W2.e");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0062  */
    /* JADX WARN: Type inference failed for: r1v12, types: [W2.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized W2.e b(java.lang.String r15) throws java.lang.Throwable {
        /*
            r14 = this;
            monitor-enter(r14)
            java.lang.String r0 = "fetch"
            X2.d r7 = r14.c(r15, r0)     // Catch: java.lang.Throwable -> Lad
            java.lang.String r0 = "activate"
            X2.d r8 = r14.c(r15, r0)     // Catch: java.lang.Throwable -> Lad
            java.lang.String r0 = "defaults"
            X2.d r9 = r14.c(r15, r0)     // Catch: java.lang.Throwable -> Lad
            android.content.Context r0 = r14.f6227b     // Catch: java.lang.Throwable -> Lad
            java.lang.String r1 = r14.h     // Catch: java.lang.Throwable -> Lad
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lad
            java.lang.String r3 = "frc_"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Lad
            r2.append(r1)     // Catch: java.lang.Throwable -> Lad
            java.lang.String r1 = "_"
            r2.append(r1)     // Catch: java.lang.Throwable -> Lad
            r2.append(r15)     // Catch: java.lang.Throwable -> Lad
            java.lang.String r1 = "_settings"
            r2.append(r1)     // Catch: java.lang.Throwable -> Lad
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> Lad
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)     // Catch: java.lang.Throwable -> Lad
            X2.o r12 = new X2.o     // Catch: java.lang.Throwable -> Lad
            r12.<init>(r0)     // Catch: java.lang.Throwable -> Lad
            X2.k r11 = new X2.k     // Catch: java.lang.Throwable -> Lad
            java.util.concurrent.ScheduledExecutorService r0 = r14.c     // Catch: java.lang.Throwable -> Lad
            r11.<init>(r0, r8, r9)     // Catch: java.lang.Throwable -> Lad
            U1.g r0 = r14.f6228d     // Catch: java.lang.Throwable -> Lad
            B2.b r1 = r14.f6229g     // Catch: java.lang.Throwable -> Lad
            r0.a()     // Catch: java.lang.Throwable -> Lad
            java.lang.String r2 = "[DEFAULT]"
            java.lang.String r0 = r0.f5905b     // Catch: java.lang.Throwable -> Lad
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> Lad
            if (r0 == 0) goto L62
            java.lang.String r0 = "firebase"
            boolean r0 = r15.equals(r0)     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L62
            Lh.c r0 = new Lh.c     // Catch: java.lang.Throwable -> L70
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L70
            goto L63
        L62:
            r0 = 0
        L63:
            if (r0 == 0) goto L73
            W2.h r1 = new W2.h     // Catch: java.lang.Throwable -> L70
            r1.<init>()     // Catch: java.lang.Throwable -> L70
            r11.a(r1)     // Catch: java.lang.Throwable -> L70
            goto L73
        L6e:
            r1 = r14
            goto Lb0
        L70:
            r0 = move-exception
            r15 = r0
            goto L6e
        L73:
            Y.e r0 = new Y.e     // Catch: java.lang.Throwable -> Lad
            r1 = 1
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lad
            r0.f6708b = r8     // Catch: java.lang.Throwable -> Lad
            r0.c = r9     // Catch: java.lang.Throwable -> Lad
            com.google.firebase.messaging.r r13 = new com.google.firebase.messaging.r     // Catch: java.lang.Throwable -> Lad
            r1 = 8
            r2 = 0
            r13.<init>(r1, r2)     // Catch: java.lang.Throwable -> Lad
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap     // Catch: java.lang.Throwable -> Lad
            r1.<init>()     // Catch: java.lang.Throwable -> Lad
            java.util.Set r1 = java.util.Collections.newSetFromMap(r1)     // Catch: java.lang.Throwable -> Lad
            r13.e = r1     // Catch: java.lang.Throwable -> Lad
            r13.f9803b = r8     // Catch: java.lang.Throwable -> Lad
            r13.c = r0     // Catch: java.lang.Throwable -> Lad
            java.util.concurrent.ScheduledExecutorService r6 = r14.c     // Catch: java.lang.Throwable -> Lad
            r13.f9804d = r6     // Catch: java.lang.Throwable -> Lad
            U1.g r2 = r14.f6228d     // Catch: java.lang.Throwable -> Lad
            C2.e r4 = r14.e     // Catch: java.lang.Throwable -> Lad
            V1.b r5 = r14.f     // Catch: java.lang.Throwable -> Lad
            X2.j r10 = r14.d(r15, r7, r12)     // Catch: java.lang.Throwable -> Lad
            r1 = r14
            r3 = r15
            W2.e r15 = r1.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> Laa
            monitor-exit(r14)
            return r15
        Laa:
            r0 = move-exception
        Lab:
            r15 = r0
            goto Lb0
        Lad:
            r0 = move-exception
            r1 = r14
            goto Lab
        Lb0:
            monitor-exit(r14)     // Catch: java.lang.Throwable -> Laa
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: W2.j.b(java.lang.String):W2.e");
    }

    public final X2.d c(String str, String str2) {
        p pVar;
        String strP = s.p(s.x("frc_", this.h, Global.UNDERSCORE, str, Global.UNDERSCORE), str2, ".json");
        ScheduledExecutorService scheduledExecutorService = this.c;
        Context context = this.f6227b;
        HashMap map = p.c;
        synchronized (p.class) {
            try {
                HashMap map2 = p.c;
                if (!map2.containsKey(strP)) {
                    map2.put(strP, new p(context, strP));
                }
                pVar = (p) map2.get(strP);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return X2.d.d(scheduledExecutorService, pVar);
    }

    public final synchronized X2.j d(String str, X2.d dVar, o oVar) {
        C2.e eVar;
        B2.b dVar2;
        ScheduledExecutorService scheduledExecutorService;
        Clock clock;
        Random random;
        String str2;
        U1.g gVar;
        try {
            eVar = this.e;
            U1.g gVar2 = this.f6228d;
            gVar2.a();
            dVar2 = gVar2.f5905b.equals("[DEFAULT]") ? this.f6229g : new R2.d(3);
            scheduledExecutorService = this.c;
            clock = j;
            random = f6224k;
            U1.g gVar3 = this.f6228d;
            gVar3.a();
            str2 = gVar3.c.f5911a;
            gVar = this.f6228d;
            gVar.a();
        } catch (Throwable th2) {
            throw th2;
        }
        return new X2.j(eVar, dVar2, scheduledExecutorService, clock, random, dVar, new ConfigFetchHttpClient(this.f6227b, gVar.c.f5912b, str2, str, oVar.f6518a.getLong("fetch_timeout_in_seconds", 60L), oVar.f6518a.getLong("fetch_timeout_in_seconds", 60L)), oVar, this.i);
    }

    public final synchronized U8.c e(U1.g gVar, C2.e eVar, X2.j jVar, X2.d dVar, Context context, String str, o oVar) {
        return new U8.c(gVar, eVar, jVar, dVar, context, str, oVar, this.c);
    }
}
