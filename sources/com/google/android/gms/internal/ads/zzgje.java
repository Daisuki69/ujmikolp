package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzgje extends zzgjg {
    final /* synthetic */ zzgjk zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgje(zzgjk zzgjkVar) {
        super(zzgjkVar, null);
        Objects.requireNonNull(zzgjkVar);
        this.zza = zzgjkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgjg
    public final Object zza(int i) {
        return this.zza.zzp(i);
    }
}
