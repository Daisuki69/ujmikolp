package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgnm;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzgnz extends zzgnm.zzf {
    private static final zzgnw zzbg;
    private static final zzgpb zzbh = new zzgpb(zzgnz.class);
    volatile int remainingField;
    volatile Set<Throwable> seenExceptionsField = null;

    static {
        Throwable th2;
        zzgnw zzgnyVar;
        byte[] bArr = null;
        try {
            zzgnyVar = new zzgnx(bArr);
            th2 = null;
        } catch (Throwable th3) {
            th2 = th3;
            zzgnyVar = new zzgny(bArr);
        }
        zzbg = zzgnyVar;
        if (th2 != null) {
            zzbh.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
    }

    public zzgnz(int i) {
        this.remainingField = i;
    }

    public final Set zzB() {
        Set<Throwable> set = this.seenExceptionsField;
        if (set != null) {
            return set;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        zzf(setNewSetFromMap);
        zzbg.zza(this, null, setNewSetFromMap);
        Set<Throwable> set2 = this.seenExceptionsField;
        Objects.requireNonNull(set2);
        return set2;
    }

    public final int zzC() {
        return zzbg.zzb(this);
    }

    public abstract void zzf(Set set);
}
