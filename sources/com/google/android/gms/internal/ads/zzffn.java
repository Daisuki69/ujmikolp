package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes3.dex */
public final class zzffn {
    private final zzfer zza;
    private final zzffk zzb;
    private final zzfen zzc;
    private zzfft zze;
    private int zzf = 1;
    private final ArrayDeque zzd = new ArrayDeque();

    public zzffn(zzfer zzferVar, zzfen zzfenVar, zzffk zzffkVar) {
        this.zza = zzferVar;
        this.zzc = zzfenVar;
        this.zzb = zzffkVar;
        zzfenVar.zza(new zzfem() { // from class: com.google.android.gms.internal.ads.zzffm
            @Override // com.google.android.gms.internal.ads.zzfem
            public final /* synthetic */ void zza() {
                this.zza.zzc();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzd() {
        zzffl zzfflVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgI)).booleanValue() && !com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzi()) {
            this.zzd.clear();
            return;
        }
        if (zzi()) {
            while (true) {
                ArrayDeque arrayDeque = this.zzd;
                if (arrayDeque.isEmpty()) {
                    break;
                }
                zzfflVar = (zzffl) arrayDeque.pollFirst();
                if (zzfflVar == null || (zzfflVar.zzb() != null && this.zza.zzc(zzfflVar.zzb()))) {
                    break;
                }
            }
            zzfft zzfftVar = new zzfft(this.zza, this.zzb, zzfflVar);
            this.zze = zzfftVar;
            zzfftVar.zza(new zzffi(this, zzfflVar));
        }
    }

    private final synchronized boolean zzi() {
        return this.zze == null;
    }

    public final synchronized void zza(zzffl zzfflVar) {
        this.zzd.add(zzfflVar);
    }

    @Nullable
    public final synchronized S1.y zzb(zzffl zzfflVar) {
        this.zzf = 2;
        if (zzi()) {
            return null;
        }
        return this.zze.zzb(zzfflVar);
    }

    public final /* synthetic */ void zzc() {
        synchronized (this) {
            this.zzf = 1;
            zzd();
        }
    }

    public final /* synthetic */ ArrayDeque zze() {
        return this.zzd;
    }

    public final /* synthetic */ void zzf(zzfft zzfftVar) {
        this.zze = null;
    }

    public final /* synthetic */ int zzg() {
        return this.zzf;
    }
}
