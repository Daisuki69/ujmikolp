package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzfla implements Runnable {
    final /* synthetic */ zzflb zza;

    public zzfla(zzflb zzflbVar) {
        Objects.requireNonNull(zzflbVar);
        this.zza = zzflbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzflb zzflbVar = this.zza;
        if (zzflbVar.zzA() != null) {
            zzfkk zzfkkVarZzA = zzflbVar.zzA();
            Clock clockZzB = zzflbVar.zzB();
            zzfkkVarZzA.zzj(clockZzB.currentTimeMillis(), zzflbVar.zzC(), zzflbVar.zze.zzd, zzflbVar.zzz());
        }
    }
}
