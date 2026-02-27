package com.google.android.gms.internal.ads;

import android.os.Handler;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class zzrp {
    public final int zza;

    @Nullable
    public final zzup zzb;
    private final CopyOnWriteArrayList zzc;

    private zzrp(CopyOnWriteArrayList copyOnWriteArrayList, int i, @Nullable zzup zzupVar) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zzupVar;
    }

    @CheckResult
    public final zzrp zza(int i, @Nullable zzup zzupVar) {
        return new zzrp(this.zzc, 0, zzupVar);
    }

    public final void zzb(Handler handler, zzrq zzrqVar) {
        this.zzc.add(new zzro(handler, zzrqVar));
    }

    public final void zzc(zzrq zzrqVar) {
        CopyOnWriteArrayList<zzro> copyOnWriteArrayList = this.zzc;
        for (zzro zzroVar : copyOnWriteArrayList) {
            if (zzroVar.zza == zzrqVar) {
                copyOnWriteArrayList.remove(zzroVar);
            }
        }
    }

    public zzrp() {
        this(new CopyOnWriteArrayList(), 0, null);
    }
}
