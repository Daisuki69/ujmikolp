package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzejn implements zzedz {

    @Nullable
    private final zzbdd zza;
    private final zzgpd zzb;
    private final zzfhh zzc;
    private final zzejw zzd;

    public zzejn(zzfhh zzfhhVar, zzgpd zzgpdVar, @Nullable zzbdd zzbddVar, zzejw zzejwVar) {
        this.zzc = zzfhhVar;
        this.zzb = zzgpdVar;
        this.zza = zzbddVar;
        this.zzd = zzejwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedz
    public final boolean zza(zzfcu zzfcuVar, zzfcj zzfcjVar) {
        zzfco zzfcoVar;
        return (this.zza == null || (zzfcoVar = zzfcjVar.zzs) == null || zzfcoVar.zza == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzedz
    public final S1.y zzb(zzfcu zzfcuVar, zzfcj zzfcjVar) {
        zzbzm zzbzmVar = new zzbzm();
        zzejs zzejsVar = new zzejs();
        zzejsVar.zzd(new zzejl(this, zzbzmVar, zzfcuVar, zzfcjVar, zzejsVar));
        zzfco zzfcoVar = zzfcjVar.zzs;
        final zzbcy zzbcyVar = new zzbcy(zzejsVar, zzfcoVar.zzb, zzfcoVar.zza);
        zzfhb zzfhbVar = zzfhb.CUSTOM_RENDER_SYN;
        zzfhh zzfhhVar = this.zzc;
        Objects.requireNonNull(zzfhhVar);
        return zzfgs.zzd(new zzfgn() { // from class: com.google.android.gms.internal.ads.zzejm
            @Override // com.google.android.gms.internal.ads.zzfgn
            public final /* synthetic */ void zza() throws RemoteException {
                this.zza.zzc(zzbcyVar);
            }
        }, this.zzb, zzfhbVar, zzfhhVar).zzj(zzfhb.CUSTOM_RENDER_ACK).zze(zzbzmVar).zzi();
    }

    public final /* synthetic */ void zzc(zzbcy zzbcyVar) throws RemoteException {
        this.zza.zze(zzbcyVar);
    }

    public final /* synthetic */ zzejw zzd() {
        return this.zzd;
    }
}
