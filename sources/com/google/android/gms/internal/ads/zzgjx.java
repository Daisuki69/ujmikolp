package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzgjx extends zzgib {
    private final zzgjz zza;

    public zzgjx(zzgjz zzgjzVar, int i) {
        super(zzgjzVar.size(), i);
        this.zza = zzgjzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgib
    public final Object zza(int i) {
        return this.zza.get(i);
    }
}
