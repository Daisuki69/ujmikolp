package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaac {
    private final Context zza;
    private boolean zzb;
    private zztb zzc = zztb.zzb;
    private final zzso zzd;

    @Nullable
    private Handler zze;

    @Nullable
    private zzabm zzf;

    public zzaac(Context context) {
        this.zza = context;
        this.zzd = new zzsi(context, null, null);
    }

    public final zzaac zza(zztb zztbVar) {
        this.zzc = zztbVar;
        return this;
    }

    public final zzaac zzb(@Nullable Handler handler) {
        this.zze = handler;
        return this;
    }

    public final zzaac zzc(@Nullable zzabm zzabmVar) {
        this.zzf = zzabmVar;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.zzaae zzd() {
        /*
            r3 = this;
            boolean r0 = r3.zzb
            r1 = 1
            r0 = r0 ^ r1
            com.google.android.gms.internal.ads.zzghc.zzh(r0)
            android.os.Handler r0 = r3.zze
            if (r0 != 0) goto L12
            com.google.android.gms.internal.ads.zzabm r2 = r3.zzf
            if (r2 == 0) goto L10
            goto L12
        L10:
            r2 = r1
            goto L1a
        L12:
            r2 = 0
            if (r0 == 0) goto L1a
            com.google.android.gms.internal.ads.zzabm r0 = r3.zzf
            if (r0 == 0) goto L1a
            goto L10
        L1a:
            com.google.android.gms.internal.ads.zzghc.zzh(r2)
            r3.zzb = r1
            com.google.android.gms.internal.ads.zzaae r0 = new com.google.android.gms.internal.ads.zzaae
            r0.<init>(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaac.zzd():com.google.android.gms.internal.ads.zzaae");
    }

    public final /* synthetic */ Context zze() {
        return this.zza;
    }

    public final /* synthetic */ zztb zzf() {
        return this.zzc;
    }

    public final /* synthetic */ zzso zzg() {
        return this.zzd;
    }

    public final /* synthetic */ Handler zzh() {
        return this.zze;
    }

    public final /* synthetic */ zzabm zzi() {
        return this.zzf;
    }
}
