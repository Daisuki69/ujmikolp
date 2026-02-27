package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class zzcor {
    private final zzcqq zza;
    private final View zzb;
    private final zzfck zzc;

    @Nullable
    private final zzcek zzd;

    public zzcor(View view, @Nullable zzcek zzcekVar, zzcqq zzcqqVar, zzfck zzfckVar) {
        this.zzb = view;
        this.zzd = zzcekVar;
        this.zza = zzcqqVar;
        this.zzc = zzfckVar;
    }

    @Nullable
    public final zzcek zza() {
        return this.zzd;
    }

    public final View zzb() {
        return this.zzb;
    }

    public final zzcqq zzc() {
        return this.zza;
    }

    public final zzfck zzd() {
        return this.zzc;
    }

    public zzcxe zze(Set set) {
        return new zzcxe(set);
    }
}
