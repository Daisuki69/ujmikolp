package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbod {

    @VisibleForTesting
    static final com.google.android.gms.ads.internal.util.zzbc zza = new zzbob();

    @VisibleForTesting
    static final com.google.android.gms.ads.internal.util.zzbc zzb = new zzboc();
    private final zzbnp zzc;

    public zzbod(Context context, VersionInfoParcel versionInfoParcel, String str, zzfie zzfieVar) {
        this.zzc = new zzbnp(context, versionInfoParcel, str, zza, zzb, zzfieVar);
    }

    public final zzbnt zza(String str, zzbnw zzbnwVar, zzbnv zzbnvVar) {
        return new zzboh(this.zzc, str, zzbnwVar, zzbnvVar);
    }

    public final zzbom zzb() {
        return new zzbom(this.zzc);
    }
}
