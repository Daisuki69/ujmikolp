package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
final class zzbva implements Callable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbvc zzb;

    public zzbva(zzbvc zzbvcVar, Context context) {
        this.zza = context;
        Objects.requireNonNull(zzbvcVar);
        this.zzb = zzbvcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0038  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object call() throws java.lang.Exception {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzbvc r0 = r7.zzb
            java.util.WeakHashMap r1 = r0.zzb()
            android.content.Context r2 = r7.zza
            java.lang.Object r1 = r1.get(r2)
            com.google.android.gms.internal.ads.zzbvb r1 = (com.google.android.gms.internal.ads.zzbvb) r1
            if (r1 == 0) goto L38
            com.google.android.gms.internal.ads.zzbds r3 = com.google.android.gms.internal.ads.zzbdx.zzd
            java.lang.Object r3 = r3.zze()
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            long r5 = r1.zza
            long r5 = r5 + r3
            com.google.android.gms.common.util.Clock r3 = com.google.android.gms.ads.internal.zzt.zzk()
            long r3 = r3.currentTimeMillis()
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 >= 0) goto L2c
            goto L38
        L2c:
            com.google.android.gms.internal.ads.zzbuz r1 = r1.zzb
            com.google.android.gms.internal.ads.zzbuy r3 = new com.google.android.gms.internal.ads.zzbuy
            r3.<init>(r2, r1)
            com.google.android.gms.internal.ads.zzbuz r1 = r3.zza()
            goto L41
        L38:
            com.google.android.gms.internal.ads.zzbuy r1 = new com.google.android.gms.internal.ads.zzbuy
            r1.<init>(r2)
            com.google.android.gms.internal.ads.zzbuz r1 = r1.zza()
        L41:
            com.google.android.gms.internal.ads.zzbvb r3 = new com.google.android.gms.internal.ads.zzbvb
            r3.<init>(r0, r1)
            java.util.WeakHashMap r0 = r0.zzb()
            r0.put(r2, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbva.call():java.lang.Object");
    }
}
