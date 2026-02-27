package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
final class zzgoh extends zzgnv {
    private zzgog zza;

    public zzgoh(zzgjv zzgjvVar, boolean z4, Executor executor, Callable callable) {
        super(zzgjvVar, z4, false);
        this.zza = new zzgof(this, callable, executor);
        zze();
    }

    @Override // com.google.android.gms.internal.ads.zzgnv
    public final void zzA(int i) {
        super.zzA(i);
        if (i == 1) {
            this.zza = null;
        }
    }

    public final /* synthetic */ void zzD(zzgog zzgogVar) {
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgnm
    public final void zzi() {
        zzgog zzgogVar = this.zza;
        if (zzgogVar != null) {
            zzgogVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgnv
    public final void zzw(int i, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzgnv
    public final void zzx() {
        zzgog zzgogVar = this.zza;
        if (zzgogVar != null) {
            zzgogVar.zze();
        }
    }
}
