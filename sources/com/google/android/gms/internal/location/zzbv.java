package com.google.android.gms.internal.location;

/* JADX INFO: loaded from: classes3.dex */
final class zzbv extends zzbt {
    private final zzbx zza;

    public zzbv(zzbx zzbxVar, int i) {
        super(zzbxVar.size(), i);
        this.zza = zzbxVar;
    }

    @Override // com.google.android.gms.internal.location.zzbt
    public final Object zza(int i) {
        return this.zza.get(i);
    }
}
