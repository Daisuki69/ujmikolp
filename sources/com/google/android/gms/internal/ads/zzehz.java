package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzehz extends zzbqs {
    private final zzeec zza;

    public /* synthetic */ zzehz(zzeia zzeiaVar, zzeec zzeecVar, byte[] bArr) {
        Objects.requireNonNull(zzeiaVar);
        this.zza = zzeecVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqt
    public final void zze() throws RemoteException {
        ((zzefo) this.zza.zzc).zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbqt
    public final void zzf(String str) throws RemoteException {
        ((zzefo) this.zza.zzc).zzw(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbqt
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzefo) this.zza.zzc).zzx(zzeVar);
    }
}
