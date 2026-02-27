package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzsi implements zzso {

    @Nullable
    private final Context zza;

    @Deprecated
    public zzsi() {
        this.zza = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008d  */
    @Override // com.google.android.gms.internal.ads.zzso
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.zzsq zzb(com.google.android.gms.internal.ads.zzsn r7) throws java.lang.Throwable {
        /*
            r6 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L7
            goto L1c
        L7:
            android.content.Context r1 = r6.zza
            if (r1 == 0) goto L3d
            r2 = 28
            if (r0 < r2) goto L3d
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.lang.String r2 = "com.amazon.hardware.tv_screen"
            boolean r1 = r1.hasSystemFeature(r2)
            if (r1 != 0) goto L1c
            goto L3d
        L1c:
            com.google.android.gms.internal.ads.zzu r0 = r7.zzc
            java.lang.String r0 = r0.zzo
            int r0 = com.google.android.gms.internal.ads.zzar.zzg(r0)
            java.lang.String r1 = com.google.android.gms.internal.ads.zzeo.zzQ(r0)
            java.lang.String r2 = "DMCodecAdapterFactory"
            java.lang.String r3 = "Creating an asynchronous MediaCodec adapter for track type "
            java.lang.String r1 = r3.concat(r1)
            com.google.android.gms.internal.ads.zzds.zzb(r2, r1)
            com.google.android.gms.internal.ads.zzsa r1 = new com.google.android.gms.internal.ads.zzsa
            r1.<init>(r0)
            com.google.android.gms.internal.ads.zzsb r7 = r1.zza(r7)
            return r7
        L3d:
            r1 = 0
            java.lang.String r2 = "createCodec:"
            com.google.android.gms.internal.ads.zzst r3 = r7.zza     // Catch: java.lang.RuntimeException -> L88 java.io.IOException -> L8a
            java.lang.String r4 = r3.zza     // Catch: java.lang.RuntimeException -> L88 java.io.IOException -> L8a
            java.lang.String r2 = r2.concat(r4)     // Catch: java.lang.RuntimeException -> L88 java.io.IOException -> L8a
            android.os.Trace.beginSection(r2)     // Catch: java.lang.RuntimeException -> L88 java.io.IOException -> L8a
            android.media.MediaCodec r2 = android.media.MediaCodec.createByCodecName(r4)     // Catch: java.lang.RuntimeException -> L88 java.io.IOException -> L8a
            android.os.Trace.endSection()     // Catch: java.lang.RuntimeException -> L88 java.io.IOException -> L8a
            java.lang.String r4 = "configureCodec"
            android.os.Trace.beginSection(r4)     // Catch: java.lang.RuntimeException -> L67 java.io.IOException -> L69
            android.view.Surface r4 = r7.zzd     // Catch: java.lang.RuntimeException -> L67 java.io.IOException -> L69
            r5 = 0
            if (r4 != 0) goto L6b
            boolean r3 = r3.zzh     // Catch: java.lang.RuntimeException -> L67 java.io.IOException -> L69
            if (r3 == 0) goto L6b
            r3 = 35
            if (r0 < r3) goto L6b
            r5 = 8
            goto L6b
        L67:
            r7 = move-exception
            goto L86
        L69:
            r7 = move-exception
            goto L86
        L6b:
            android.media.MediaFormat r0 = r7.zzb     // Catch: java.lang.RuntimeException -> L67 java.io.IOException -> L69
            r2.configure(r0, r4, r1, r5)     // Catch: java.lang.RuntimeException -> L67 java.io.IOException -> L69
            android.os.Trace.endSection()     // Catch: java.lang.RuntimeException -> L67 java.io.IOException -> L69
            java.lang.String r0 = "startCodec"
            android.os.Trace.beginSection(r0)     // Catch: java.lang.RuntimeException -> L67 java.io.IOException -> L69
            r2.start()     // Catch: java.lang.RuntimeException -> L67 java.io.IOException -> L69
            android.os.Trace.endSection()     // Catch: java.lang.RuntimeException -> L67 java.io.IOException -> L69
            com.google.android.gms.internal.ads.zztm r0 = new com.google.android.gms.internal.ads.zztm     // Catch: java.lang.RuntimeException -> L67 java.io.IOException -> L69
            com.google.android.gms.internal.ads.zzsm r7 = r7.zzf     // Catch: java.lang.RuntimeException -> L67 java.io.IOException -> L69
            r0.<init>(r2, r7, r1)     // Catch: java.lang.RuntimeException -> L67 java.io.IOException -> L69
            return r0
        L86:
            r1 = r2
            goto L8b
        L88:
            r7 = move-exception
            goto L8b
        L8a:
            r7 = move-exception
        L8b:
            if (r1 == 0) goto L90
            r1.release()
        L90:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsi.zzb(com.google.android.gms.internal.ads.zzsn):com.google.android.gms.internal.ads.zzsq");
    }

    public zzsi(Context context, @Nullable zzght zzghtVar, @Nullable zzght zzghtVar2) {
        this.zza = context;
    }
}
