package com.google.android.gms.internal.fido;

/* JADX INFO: loaded from: classes3.dex */
final class zzax extends zzau {
    private final zzaz zza;

    public zzax(zzaz zzazVar, int i) {
        super(zzazVar.size(), i);
        this.zza = zzazVar;
    }

    @Override // com.google.android.gms.internal.fido.zzau
    public final Object zza(int i) {
        return this.zza.get(i);
    }
}
