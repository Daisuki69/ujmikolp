package com.google.android.gms.internal.ads;

import java.util.ListIterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzgkn extends zzgmc {
    final /* synthetic */ zzgko zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgkn(zzgko zzgkoVar, ListIterator listIterator) {
        super(listIterator);
        Objects.requireNonNull(zzgkoVar);
        this.zza = zzgkoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgmb
    public final Object zza(Object obj) {
        return this.zza.zzb.apply(obj);
    }
}
