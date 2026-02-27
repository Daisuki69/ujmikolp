package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzui extends zzud {
    public static final Object zzc = new Object();

    @Nullable
    private final Object zzd;

    @Nullable
    private final Object zze;

    private zzui(zzbe zzbeVar, @Nullable Object obj, @Nullable Object obj2) {
        super(zzbeVar);
        this.zzd = obj;
        this.zze = obj2;
    }

    public static zzui zzp(zzaj zzajVar) {
        return new zzui(new zzuj(zzajVar), zzbd.zza, zzc);
    }

    public static zzui zzq(zzbe zzbeVar, @Nullable Object obj, @Nullable Object obj2) {
        return new zzui(zzbeVar, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzud, com.google.android.gms.internal.ads.zzbe
    public final zzbd zzb(int i, zzbd zzbdVar, long j) {
        this.zzb.zzb(i, zzbdVar, j);
        if (Objects.equals(zzbdVar.zzb, this.zzd)) {
            zzbdVar.zzb = zzbd.zza;
        }
        return zzbdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzud, com.google.android.gms.internal.ads.zzbe
    public final zzbc zzd(int i, zzbc zzbcVar, boolean z4) {
        this.zzb.zzd(i, zzbcVar, z4);
        if (Objects.equals(zzbcVar.zzb, this.zze) && z4) {
            zzbcVar.zzb = zzc;
        }
        return zzbcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzud, com.google.android.gms.internal.ads.zzbe
    public final int zze(Object obj) {
        Object obj2;
        if (zzc.equals(obj) && (obj2 = this.zze) != null) {
            obj = obj2;
        }
        return this.zzb.zze(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzud, com.google.android.gms.internal.ads.zzbe
    public final Object zzf(int i) {
        Object objZzf = this.zzb.zzf(i);
        return Objects.equals(objZzf, this.zze) ? zzc : objZzf;
    }

    public final zzui zzr(zzbe zzbeVar) {
        return new zzui(zzbeVar, this.zzd, this.zze);
    }

    public final /* synthetic */ Object zzs() {
        return this.zze;
    }
}
