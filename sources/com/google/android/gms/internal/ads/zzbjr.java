package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbjr implements zzbjl {
    private final Context zza;
    private final Map zzb;

    public zzbjr(Context context, Map map) {
        this.zza = context;
        this.zzb = map;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    @Override // com.google.android.gms.internal.ads.zzbjl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(java.lang.Object r8, java.util.Map r9) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzbxr r8 = com.google.android.gms.ads.internal.zzt.zzD()
            android.content.Context r0 = r7.zza
            boolean r8 = r8.zza(r0)
            if (r8 != 0) goto Ld
            return
        Ld:
            java.lang.String r8 = "eventName"
            java.lang.Object r8 = r9.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r1 = "eventId"
            java.lang.Object r9 = r9.get(r1)
            java.lang.String r9 = (java.lang.String) r9
            int r1 = r8.hashCode()
            r2 = 94399(0x170bf, float:1.32281E-40)
            r3 = 2
            java.lang.String r4 = "_ac"
            r5 = 1
            java.lang.String r6 = "_ai"
            if (r1 == r2) goto L47
            r2 = 94401(0x170c1, float:1.32284E-40)
            if (r1 == r2) goto L3f
            r2 = 94407(0x170c7, float:1.32292E-40)
            if (r1 == r2) goto L37
            goto L51
        L37:
            boolean r8 = r8.equals(r6)
            if (r8 == 0) goto L51
            r8 = r5
            goto L52
        L3f:
            boolean r8 = r8.equals(r4)
            if (r8 == 0) goto L51
            r8 = 0
            goto L52
        L47:
            java.lang.String r1 = "_aa"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L51
            r8 = r3
            goto L52
        L51:
            r8 = -1
        L52:
            if (r8 == 0) goto L78
            if (r8 == r5) goto L68
            if (r8 == r3) goto L60
            int r8 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r8 = "logScionEvent gmsg contained unsupported eventName"
            com.google.android.gms.ads.internal.util.client.zzo.zzf(r8)
            return
        L60:
            com.google.android.gms.internal.ads.zzbxr r8 = com.google.android.gms.ads.internal.zzt.zzD()
            r8.zzn(r0, r9)
            return
        L68:
            java.util.Map r8 = r7.zzb
            com.google.android.gms.internal.ads.zzbxr r1 = com.google.android.gms.ads.internal.zzt.zzD()
            java.lang.Object r8 = r8.get(r6)
            java.util.Map r8 = (java.util.Map) r8
            r1.zzl(r0, r9, r8)
            return
        L78:
            java.util.Map r8 = r7.zzb
            com.google.android.gms.internal.ads.zzbxr r1 = com.google.android.gms.ads.internal.zzt.zzD()
            java.lang.Object r8 = r8.get(r4)
            java.util.Map r8 = (java.util.Map) r8
            r1.zzk(r0, r9, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbjr.zza(java.lang.Object, java.util.Map):void");
    }
}
