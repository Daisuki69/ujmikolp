package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.core.graphics.Insets;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
public final class zzenb implements zzeun {
    public final com.google.android.gms.ads.internal.client.zzr zza;

    @Nullable
    public final String zzb;
    public final boolean zzc;
    public final String zzd;
    public final float zze;
    public final int zzf;
    public final int zzg;

    @Nullable
    public final String zzh;
    public final boolean zzi;

    @Nullable
    public final Insets zzj;

    public zzenb(com.google.android.gms.ads.internal.client.zzr zzrVar, @Nullable String str, boolean z4, String str2, float f, int i, int i4, @Nullable String str3, boolean z5, @Nullable Insets insets) {
        Preconditions.checkNotNull(zzrVar, "the adSize must not be null");
        this.zza = zzrVar;
        this.zzb = str;
        this.zzc = z4;
        this.zzd = str2;
        this.zze = f;
        this.zzf = i;
        this.zzg = i4;
        this.zzh = str3;
        this.zzi = z5;
        this.zzj = insets;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzc(android.os.Bundle r10) {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzenb.zzc(android.os.Bundle):void");
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* synthetic */ void zza(Object obj) {
        zzc(((zzcuu) obj).zza);
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* synthetic */ void zzb(Object obj) {
        zzc(((zzcuu) obj).zzb);
    }
}
