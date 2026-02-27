package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzafj implements zzacu {
    private final zzacu zza;

    public zzafj() {
        this(0);
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zzd(zzacv zzacvVar) throws IOException {
        return this.zza.zzd(zzacvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final /* synthetic */ List zze() {
        return AbstractC1170d.a(this);
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzf(zzacx zzacxVar) {
        this.zza.zzf(zzacxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final int zzg(zzacv zzacvVar, zzads zzadsVar) throws IOException {
        return this.zza.zzg(zzacvVar, zzadsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzh(long j, long j6) {
        this.zza.zzh(j, j6);
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final /* synthetic */ zzacu zzi() {
        return AbstractC1170d.b(this);
    }

    public zzafj(int i) {
        this.zza = new zzafk();
    }
}
