package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzgjd extends zzgjg {
    final /* synthetic */ zzgjk zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgjd(zzgjk zzgjkVar) {
        super(zzgjkVar, null);
        Objects.requireNonNull(zzgjkVar);
        this.zza = zzgjkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgjg
    public final /* bridge */ /* synthetic */ Object zza(int i) {
        return new zzgji(this.zza, i);
    }
}
