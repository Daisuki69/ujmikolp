package com.google.android.gms.internal.common;

/* JADX INFO: loaded from: classes3.dex */
final class zzai extends zzad {
    private final zzak zza;

    public zzai(zzak zzakVar, int i) {
        super(zzakVar.size(), i);
        this.zza = zzakVar;
    }

    @Override // com.google.android.gms.internal.common.zzad
    public final Object zza(int i) {
        return this.zza.get(i);
    }
}
