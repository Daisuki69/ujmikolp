package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfi {
    public final zzgjz zza;
    public final zzfb zzb;

    @Nullable
    public final zzfd zzc;

    @Nullable
    public final zzfh zzd;

    public zzfi(zzez zzezVar, @Nullable List list, zzfb zzfbVar, @Nullable zzfd zzfdVar, @Nullable zzfh zzfhVar) {
        this.zza = list != null ? zzgjz.zzq(list) : zzgjz.zzi();
        this.zzb = zzfbVar;
        this.zzc = zzfdVar;
        this.zzd = zzfhVar;
    }
}
