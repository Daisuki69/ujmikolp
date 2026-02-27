package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeyj implements zzcvv, zzcxr, zzezy, com.google.android.gms.ads.internal.overlay.zzq, zzcyj, zzcwi, zzddz {
    private final zzfen zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();

    @Nullable
    private zzeyj zzh = null;

    public zzeyj(zzfen zzfenVar) {
        this.zza = zzfenVar;
    }

    public static zzeyj zzn(zzeyj zzeyjVar) {
        zzeyj zzeyjVar2 = new zzeyj(zzeyjVar.zza);
        zzeyjVar2.zzh = zzeyjVar;
        return zzeyjVar2;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdA() {
        zzeyj zzeyjVar = this.zzh;
        if (zzeyjVar != null) {
            zzeyjVar.zzdA();
        } else {
            zzezq.zza(this.zzf, zzexw.zza);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdB() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdC() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdD() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdE() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvv
    public final void zzdN(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzeyj zzeyjVar = this.zzh;
        if (zzeyjVar != null) {
            zzeyjVar.zzdN(zzeVar);
            return;
        }
        AtomicReference atomicReference = this.zzb;
        zzezq.zza(atomicReference, new zzezp() { // from class: com.google.android.gms.internal.ads.zzexz
            @Override // com.google.android.gms.internal.ads.zzezp
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((zzbae) obj).zzd(zzeVar);
            }
        });
        zzezq.zza(atomicReference, new zzezp() { // from class: com.google.android.gms.internal.ads.zzeya
            @Override // com.google.android.gms.internal.ads.zzezp
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((zzbae) obj).zzc(zzeVar.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzddz
    public final void zzdV() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdX() {
        zzeyj zzeyjVar = this.zzh;
        if (zzeyjVar != null) {
            zzeyjVar.zzdX();
        } else {
            zzezq.zza(this.zzf, zzexv.zza);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdY(final int i) {
        zzeyj zzeyjVar = this.zzh;
        if (zzeyjVar != null) {
            zzeyjVar.zzdY(i);
        } else {
            zzezq.zza(this.zzf, new zzezp() { // from class: com.google.android.gms.internal.ads.zzeyb
                @Override // com.google.android.gms.internal.ads.zzezp
                public final /* synthetic */ void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.overlay.zzq) obj).zzdY(i);
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdt() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdu() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdv() {
    }

    @Override // com.google.android.gms.internal.ads.zzddz
    public final void zzdz() {
        zzeyj zzeyjVar = this.zzh;
        if (zzeyjVar != null) {
            zzeyjVar.zzdz();
        } else {
            zzezq.zza(this.zzd, zzeyh.zza);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzh() {
        zzeyj zzeyjVar = this.zzh;
        if (zzeyjVar != null) {
            zzeyjVar.zzh();
            return;
        }
        zzezq.zza(this.zzf, zzexx.zza);
        AtomicReference atomicReference = this.zzd;
        zzezq.zza(atomicReference, zzeyf.zza);
        zzezq.zza(atomicReference, zzeyg.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcwi
    public final void zzj(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzeyj zzeyjVar = this.zzh;
        if (zzeyjVar != null) {
            zzeyjVar.zzj(zzeVar);
        } else {
            zzezq.zza(this.zzd, new zzezp() { // from class: com.google.android.gms.internal.ads.zzeyc
                @Override // com.google.android.gms.internal.ads.zzezp
                public final /* synthetic */ void zza(Object obj) throws RemoteException {
                    ((zzbai) obj).zze(zzeVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxr
    public final void zzl() {
        zzeyj zzeyjVar = this.zzh;
        if (zzeyjVar != null) {
            zzeyjVar.zzl();
        } else {
            zzezq.zza(this.zze, zzexu.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyj
    public final void zzm(final com.google.android.gms.ads.internal.client.zzt zztVar) {
        zzeyj zzeyjVar = this.zzh;
        if (zzeyjVar != null) {
            zzeyjVar.zzm(zztVar);
        } else {
            zzezq.zza(this.zzg, new zzezp() { // from class: com.google.android.gms.internal.ads.zzeyd
                @Override // com.google.android.gms.internal.ads.zzezp
                public final /* synthetic */ void zza(Object obj) throws RemoteException {
                    ((com.google.android.gms.ads.internal.client.zzdt) obj).zze(zztVar);
                }
            });
        }
    }

    public final void zzo(zzbae zzbaeVar) {
        this.zzb.set(zzbaeVar);
    }

    public final void zzp(zzbai zzbaiVar) {
        this.zzd.set(zzbaiVar);
    }

    public final void zzq(com.google.android.gms.ads.internal.overlay.zzq zzqVar) {
        this.zzf.set(zzqVar);
    }

    public final void zzr(com.google.android.gms.ads.internal.client.zzdt zzdtVar) {
        this.zzg.set(zzdtVar);
    }

    public final void zzs(final zzbab zzbabVar) {
        zzeyj zzeyjVar = this.zzh;
        if (zzeyjVar != null) {
            zzeyjVar.zzs(zzbabVar);
        } else {
            zzezq.zza(this.zzb, new zzezp() { // from class: com.google.android.gms.internal.ads.zzexy
                @Override // com.google.android.gms.internal.ads.zzezp
                public final /* synthetic */ void zza(Object obj) throws RemoteException {
                    ((zzbae) obj).zzb(zzbabVar);
                }
            });
        }
    }

    public final void zzt() {
        zzeyj zzeyjVar = this.zzh;
        if (zzeyjVar != null) {
            zzeyjVar.zzt();
            return;
        }
        this.zza.zzb();
        zzezq.zza(this.zzc, zzeye.zza);
        zzezq.zza(this.zzd, zzeyi.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzezy
    public final void zzu(zzezy zzezyVar) {
        this.zzh = (zzeyj) zzezyVar;
    }
}
