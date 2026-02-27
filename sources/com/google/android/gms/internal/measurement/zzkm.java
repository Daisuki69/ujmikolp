package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import qk.i;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzkm {
    public static final /* synthetic */ int zzc = 0;
    private static final Object zzd = new Object();
    private static volatile zzkh zze;
    private static volatile boolean zzf;
    private static final AtomicInteger zzh;
    final zzkg zza;
    final String zzb;
    private Object zzg;
    private volatile int zzi = -1;
    private volatile Object zzj;
    private volatile boolean zzk;

    static {
        new AtomicReference();
        i.l(zzkk.zza, "BuildInfo must be non-null");
        zzh = new AtomicInteger();
    }

    public /* synthetic */ zzkm(zzkg zzkgVar, String str, Object obj, boolean z4, byte[] bArr) {
        if (zzkgVar.zza == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.zza = zzkgVar;
        this.zzb = str;
        this.zzg = obj;
        this.zzk = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004c, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void zzb(final android.content.Context r3) {
        /*
            com.google.android.gms.internal.measurement.zzkh r0 = com.google.android.gms.internal.measurement.zzkm.zze
            if (r0 != 0) goto L4d
            if (r3 != 0) goto L7
            goto L4d
        L7:
            java.lang.Object r0 = com.google.android.gms.internal.measurement.zzkm.zzd
            monitor-enter(r0)
            com.google.android.gms.internal.measurement.zzkh r1 = com.google.android.gms.internal.measurement.zzkm.zze     // Catch: java.lang.Throwable -> L47
            if (r1 != 0) goto L49
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.measurement.zzkh r1 = com.google.android.gms.internal.measurement.zzkm.zze     // Catch: java.lang.Throwable -> L21
            android.content.Context r2 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L18
            r3 = r2
        L18:
            if (r1 == 0) goto L23
            android.content.Context r2 = r1.zza()     // Catch: java.lang.Throwable -> L21
            if (r2 == r3) goto L43
            goto L23
        L21:
            r3 = move-exception
            goto L45
        L23:
            if (r1 == 0) goto L2e
            com.google.android.gms.internal.measurement.zzjr.zzd()     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.measurement.zzko.zzb()     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.measurement.zzjy.zzc()     // Catch: java.lang.Throwable -> L21
        L2e:
            com.google.android.gms.internal.measurement.zzkl r1 = new com.google.android.gms.internal.measurement.zzkl     // Catch: java.lang.Throwable -> L21
            r1.<init>()     // Catch: java.lang.Throwable -> L21
            N1.o r1 = E1.c.j(r1)     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.measurement.zzjn r2 = new com.google.android.gms.internal.measurement.zzjn     // Catch: java.lang.Throwable -> L21
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.measurement.zzkm.zze = r2     // Catch: java.lang.Throwable -> L21
            java.util.concurrent.atomic.AtomicInteger r3 = com.google.android.gms.internal.measurement.zzkm.zzh     // Catch: java.lang.Throwable -> L21
            r3.incrementAndGet()     // Catch: java.lang.Throwable -> L21
        L43:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            goto L49
        L45:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r3     // Catch: java.lang.Throwable -> L47
        L47:
            r3 = move-exception
            goto L4b
        L49:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L47
            return
        L4b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L47
            throw r3
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzkm.zzb(android.content.Context):void");
    }

    public static void zzc() {
        zzh.incrementAndGet();
    }

    public abstract Object zza(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045 A[PHI: r2
  0x0045: PHI (r2v1 N1.i) = (r2v0 N1.i), (r2v0 N1.i), (r2v5 N1.i) binds: [B:8:0x0014, B:10:0x001a, B:12:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0016, B:11:0x001c, B:13:0x002f, B:20:0x004b, B:22:0x0056, B:24:0x0060, B:27:0x0072, B:29:0x007a, B:41:0x00a1, B:44:0x00a9, B:45:0x00ac, B:46:0x00b0, B:33:0x0083, B:35:0x0087, B:37:0x0097, B:39:0x009d, B:47:0x00b5, B:48:0x00b8, B:49:0x00b9), top: B:55:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b5 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0016, B:11:0x001c, B:13:0x002f, B:20:0x004b, B:22:0x0056, B:24:0x0060, B:27:0x0072, B:29:0x007a, B:41:0x00a1, B:44:0x00a9, B:45:0x00ac, B:46:0x00b0, B:33:0x0083, B:35:0x0087, B:37:0x0097, B:39:0x009d, B:47:0x00b5, B:48:0x00b8, B:49:0x00b9), top: B:55:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzd() {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = com.google.android.gms.internal.measurement.zzkm.zzh
            int r0 = r0.get()
            int r1 = r9.zzi
            if (r1 >= r0) goto Lbd
            monitor-enter(r9)
            int r1 = r9.zzi     // Catch: java.lang.Throwable -> L42
            if (r1 >= r0) goto Lb9
            com.google.android.gms.internal.measurement.zzkh r1 = com.google.android.gms.internal.measurement.zzkm.zze     // Catch: java.lang.Throwable -> L42
            N1.a r2 = N1.a.f3489a     // Catch: java.lang.Throwable -> L42
            r3 = 0
            if (r1 == 0) goto L45
            N1.o r4 = r1.zzb()     // Catch: java.lang.Throwable -> L42
            if (r4 == 0) goto L45
            N1.o r2 = r1.zzb()     // Catch: java.lang.Throwable -> L42
            r2.getClass()     // Catch: java.lang.Throwable -> L42
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L42
            N1.i r2 = (N1.i) r2     // Catch: java.lang.Throwable -> L42
            boolean r4 = r2.b()     // Catch: java.lang.Throwable -> L42
            if (r4 == 0) goto L45
            java.lang.Object r4 = r2.a()     // Catch: java.lang.Throwable -> L42
            com.google.android.gms.internal.measurement.zzjt r4 = (com.google.android.gms.internal.measurement.zzjt) r4     // Catch: java.lang.Throwable -> L42
            com.google.android.gms.internal.measurement.zzkg r5 = r9.zza     // Catch: java.lang.Throwable -> L42
            android.net.Uri r6 = r5.zza     // Catch: java.lang.Throwable -> L42
            java.lang.String r5 = r5.zzc     // Catch: java.lang.Throwable -> L42
            java.lang.String r7 = r9.zzb     // Catch: java.lang.Throwable -> L42
            java.lang.String r4 = r4.zza(r6, r3, r5, r7)     // Catch: java.lang.Throwable -> L42
            goto L46
        L42:
            r0 = move-exception
            goto Lbb
        L45:
            r4 = r3
        L46:
            if (r1 == 0) goto L4a
            r5 = 1
            goto L4b
        L4a:
            r5 = 0
        L4b:
            java.lang.String r6 = "Must call PhenotypeFlagInitializer.maybeInit() first"
            qk.i.p(r5, r6)     // Catch: java.lang.Throwable -> L42
            com.google.android.gms.internal.measurement.zzkg r5 = r9.zza     // Catch: java.lang.Throwable -> L42
            android.net.Uri r6 = r5.zza     // Catch: java.lang.Throwable -> L42
            if (r6 == 0) goto Lb5
            android.content.Context r7 = r1.zza()     // Catch: java.lang.Throwable -> L42
            boolean r7 = com.google.android.gms.internal.measurement.zzka.zza(r7, r6)     // Catch: java.lang.Throwable -> L42
            if (r7 == 0) goto L6f
            android.content.Context r7 = r1.zza()     // Catch: java.lang.Throwable -> L42
            android.content.ContentResolver r7 = r7.getContentResolver()     // Catch: java.lang.Throwable -> L42
            com.google.android.gms.internal.measurement.zzkj r8 = com.google.android.gms.internal.measurement.zzkj.zza     // Catch: java.lang.Throwable -> L42
            com.google.android.gms.internal.measurement.zzjr r6 = com.google.android.gms.internal.measurement.zzjr.zza(r7, r6, r8)     // Catch: java.lang.Throwable -> L42
            goto L70
        L6f:
            r6 = r3
        L70:
            if (r6 == 0) goto L7f
            java.lang.String r7 = r9.zzb     // Catch: java.lang.Throwable -> L42
            java.lang.Object r6 = r6.zze(r7)     // Catch: java.lang.Throwable -> L42
            if (r6 == 0) goto L7f
            java.lang.Object r6 = r9.zza(r6)     // Catch: java.lang.Throwable -> L42
            goto L80
        L7f:
            r6 = r3
        L80:
            if (r6 == 0) goto L83
            goto La1
        L83:
            boolean r5 = r5.zzd     // Catch: java.lang.Throwable -> L42
            if (r5 != 0) goto L9b
            android.content.Context r1 = r1.zza()     // Catch: java.lang.Throwable -> L42
            com.google.android.gms.internal.measurement.zzjy r1 = com.google.android.gms.internal.measurement.zzjy.zza(r1)     // Catch: java.lang.Throwable -> L42
            java.lang.String r5 = r9.zzb     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = r1.zze(r5)     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L9b
            java.lang.Object r3 = r9.zza(r1)     // Catch: java.lang.Throwable -> L42
        L9b:
            if (r3 != 0) goto La0
            java.lang.Object r6 = r9.zzg     // Catch: java.lang.Throwable -> L42
            goto La1
        La0:
            r6 = r3
        La1:
            boolean r1 = r2.b()     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto Lb0
            if (r4 != 0) goto Lac
            java.lang.Object r6 = r9.zzg     // Catch: java.lang.Throwable -> L42
            goto Lb0
        Lac:
            java.lang.Object r6 = r9.zza(r4)     // Catch: java.lang.Throwable -> L42
        Lb0:
            r9.zzj = r6     // Catch: java.lang.Throwable -> L42
            r9.zzi = r0     // Catch: java.lang.Throwable -> L42
            goto Lb9
        Lb5:
            r1.zza()     // Catch: java.lang.Throwable -> L42
            throw r3     // Catch: java.lang.Throwable -> L42
        Lb9:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L42
            goto Lbd
        Lbb:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L42
            throw r0
        Lbd:
            java.lang.Object r0 = r9.zzj
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzkm.zzd():java.lang.Object");
    }
}
