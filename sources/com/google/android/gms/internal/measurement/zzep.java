package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzep extends zzeq {
    final /* synthetic */ Long zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ Bundle zzd;
    final /* synthetic */ boolean zze;
    final /* synthetic */ boolean zzf;
    final /* synthetic */ zzfb zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzep(zzfb zzfbVar, Long l6, String str, String str2, Bundle bundle, boolean z4, boolean z5) {
        super(zzfbVar, true);
        this.zza = l6;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = bundle;
        this.zze = z4;
        this.zzf = z5;
        Objects.requireNonNull(zzfbVar);
        this.zzg = zzfbVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeq
    public final void zza() throws RemoteException {
        Long l6 = this.zza;
        ((zzcr) Preconditions.checkNotNull(this.zzg.zzQ())).logEvent(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, l6 == null ? this.zzh : l6.longValue());
    }
}
