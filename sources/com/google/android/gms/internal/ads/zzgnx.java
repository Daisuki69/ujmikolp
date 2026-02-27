package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
final class zzgnx extends zzgnw {
    private static final AtomicReferenceFieldUpdater zza = AtomicReferenceFieldUpdater.newUpdater(zzgnz.class, Set.class, "seenExceptionsField");
    private static final AtomicIntegerFieldUpdater zzb = AtomicIntegerFieldUpdater.newUpdater(zzgnz.class, "remainingField");

    private zzgnx() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgnw
    public final void zza(zzgnz zzgnzVar, Set set, Set set2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = zza;
        while (!atomicReferenceFieldUpdater.compareAndSet(zzgnzVar, null, set2) && atomicReferenceFieldUpdater.get(zzgnzVar) == null) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgnw
    public final int zzb(zzgnz zzgnzVar) {
        return zzb.decrementAndGet(zzgnzVar);
    }

    public /* synthetic */ zzgnx(byte[] bArr) {
        super(null);
    }
}
