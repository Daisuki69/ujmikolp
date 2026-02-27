package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfeb {
    private final Deque zza = new LinkedBlockingDeque();
    private final Callable zzb;
    private final zzgpd zzc;

    public zzfeb(Callable callable, zzgpd zzgpdVar) {
        this.zzb = callable;
        this.zzc = zzgpdVar;
    }

    public final synchronized void zza(int i) {
        Deque deque = this.zza;
        int size = i - deque.size();
        for (int i4 = 0; i4 < size; i4++) {
            deque.add(this.zzc.zzc(this.zzb));
        }
    }

    @Nullable
    public final synchronized S1.y zzb() {
        zza(1);
        return (S1.y) this.zza.poll();
    }

    public final synchronized void zzc(S1.y yVar) {
        this.zza.addFirst(yVar);
    }
}
