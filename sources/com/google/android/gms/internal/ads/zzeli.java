package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeli implements AppEventListener, zzcyy, zzcxg, zzcvv, zzcwm, com.google.android.gms.ads.internal.client.zza, zzcvs, zzcyj, zzcwi, zzddz {

    @Nullable
    final zzdsm zza;
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private final AtomicBoolean zzh = new AtomicBoolean(true);
    private final AtomicBoolean zzi = new AtomicBoolean(false);
    private final AtomicBoolean zzj = new AtomicBoolean(false);

    @VisibleForTesting
    final BlockingQueue zzb = new ArrayBlockingQueue(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjF)).intValue());

    public zzeli(@Nullable zzdsm zzdsmVar) {
        this.zza = zzdsmVar;
    }

    private final void zzr() {
        if (this.zzi.get() && this.zzj.get()) {
            BlockingQueue<Pair> blockingQueue = this.zzb;
            for (final Pair pair : blockingQueue) {
                zzezq.zza(this.zzd, new zzezp() { // from class: com.google.android.gms.internal.ads.zzekt
                    @Override // com.google.android.gms.internal.ads.zzezp
                    public final /* synthetic */ void zza(Object obj) throws RemoteException {
                        Pair pair2 = pair;
                        ((com.google.android.gms.ads.internal.client.zzco) obj).zzb((String) pair2.first, (String) pair2.second);
                    }
                });
            }
            blockingQueue.clear();
            this.zzh.set(false);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzlB)).booleanValue()) {
            return;
        }
        zzezq.zza(this.zzc, zzeky.zza);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final synchronized void onAppEvent(final String str, final String str2) {
        if (!this.zzh.get()) {
            zzezq.zza(this.zzd, new zzezp() { // from class: com.google.android.gms.internal.ads.zzekr
                @Override // com.google.android.gms.internal.ads.zzezp
                public final /* synthetic */ void zza(Object obj) throws RemoteException {
                    ((com.google.android.gms.ads.internal.client.zzco) obj).zzb(str, str2);
                }
            });
            return;
        }
        if (!this.zzb.offer(new Pair(str, str2))) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("The queue for app events is full, dropping the new event.");
            zzdsm zzdsmVar = this.zza;
            if (zzdsmVar != null) {
                zzdsl zzdslVarZza = zzdsmVar.zza();
                zzdslVarZza.zzc("action", "dae_action");
                zzdslVarZza.zzc("dae_name", str);
                zzdslVarZza.zzc("dae_data", str2);
                zzdslVarZza.zzd();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzd(zzbvh zzbvhVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcvv
    public final void zzdN(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzezp zzezpVar = new zzezp() { // from class: com.google.android.gms.internal.ads.zzeku
            @Override // com.google.android.gms.internal.ads.zzezp
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzbk) obj).zzd(zzeVar);
            }
        };
        AtomicReference atomicReference = this.zzc;
        zzezq.zza(atomicReference, zzezpVar);
        zzezq.zza(atomicReference, new zzezp() { // from class: com.google.android.gms.internal.ads.zzeko
            @Override // com.google.android.gms.internal.ads.zzezp
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzbk) obj).zzc(zzeVar.zza);
            }
        });
        zzezq.zza(this.zzf, new zzezp() { // from class: com.google.android.gms.internal.ads.zzekp
            @Override // com.google.android.gms.internal.ads.zzezp
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzbn) obj).zzc(zzeVar);
            }
        });
        this.zzh.set(false);
        this.zzb.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzdO() {
        zzezq.zza(this.zzc, zzekv.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcyy
    public final void zzdT(zzbuv zzbuvVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcyy
    public final void zzdU(zzfcu zzfcuVar) {
        this.zzh.set(true);
        this.zzj.set(false);
    }

    @Override // com.google.android.gms.internal.ads.zzddz
    public final void zzdV() {
        zzezq.zza(this.zzc, zzekz.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzdw() {
        zzezq.zza(this.zzc, zzelb.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzdx() {
        zzezq.zza(this.zzc, zzelc.zza);
        zzezq.zza(this.zzg, zzelh.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzdy() {
        zzezq.zza(this.zzc, zzekx.zza);
        AtomicReference atomicReference = this.zzg;
        zzezq.zza(atomicReference, zzele.zza);
        zzezq.zza(atomicReference, zzelf.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzddz
    public final void zzdz() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzlB)).booleanValue()) {
            zzezq.zza(this.zzc, zzela.zza);
        }
        zzezq.zza(this.zzg, zzelg.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzcxg
    public final synchronized void zzg() {
        zzezq.zza(this.zzc, zzekw.zza);
        zzezq.zza(this.zzf, zzeld.zza);
        this.zzj.set(true);
        zzr();
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzbk zzi() {
        return (com.google.android.gms.ads.internal.client.zzbk) this.zzc.get();
    }

    @Override // com.google.android.gms.internal.ads.zzcwi
    public final void zzj(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzezq.zza(this.zzg, new zzezp() { // from class: com.google.android.gms.internal.ads.zzeks
            @Override // com.google.android.gms.internal.ads.zzezp
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzcv) obj).zzb(zzeVar);
            }
        });
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzco zzk() {
        return (com.google.android.gms.ads.internal.client.zzco) this.zzd.get();
    }

    public final void zzl(com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
        this.zzc.set(zzbkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcyj
    public final void zzm(@NonNull final com.google.android.gms.ads.internal.client.zzt zztVar) {
        zzezq.zza(this.zze, new zzezp() { // from class: com.google.android.gms.internal.ads.zzekq
            @Override // com.google.android.gms.internal.ads.zzezp
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzdt) obj).zze(zztVar);
            }
        });
    }

    public final void zzn(com.google.android.gms.ads.internal.client.zzco zzcoVar) {
        this.zzd.set(zzcoVar);
        this.zzi.set(true);
        zzr();
    }

    public final void zzo(com.google.android.gms.ads.internal.client.zzdt zzdtVar) {
        this.zze.set(zzdtVar);
    }

    public final void zzp(com.google.android.gms.ads.internal.client.zzbn zzbnVar) {
        this.zzf.set(zzbnVar);
    }

    public final void zzq(com.google.android.gms.ads.internal.client.zzcv zzcvVar) {
        this.zzg.set(zzcvVar);
    }
}
