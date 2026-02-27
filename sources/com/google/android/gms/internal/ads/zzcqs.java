package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class zzcqs implements zzehl {
    protected final zzfcu zza;
    protected final zzfcj zzb;
    private final zzcwr zzc;
    private final zzcxe zzd;

    @Nullable
    private final zzezy zze;
    private final zzcvl zzf;
    private final zzdaj zzg;
    private final zzcxi zzh;
    private final zzddo zzi;
    private final zzcum zzj;
    private final zzdtp zzk;

    public zzcqs(zzcqr zzcqrVar) {
        this.zza = zzcqrVar.zza();
        this.zzb = zzcqrVar.zzb();
        this.zzc = zzcqrVar.zzc();
        this.zzd = zzcqrVar.zzd();
        this.zze = zzcqrVar.zze();
        this.zzf = zzcqrVar.zzf();
        this.zzg = zzcqrVar.zzg();
        this.zzh = zzcqrVar.zzh();
        this.zzi = zzcqrVar.zzi();
        this.zzj = zzcqrVar.zzj();
        this.zzk = zzcqrVar.zzk();
    }

    public void zzd() {
        this.zzc.zzc(null);
    }

    public void zzj() {
        this.zzd.zzg();
        this.zzh.zza(this);
    }

    public final zzcwr zzl() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzehl
    public final void zzm() {
        this.zzi.zzi();
    }

    public final zzcvl zzn() {
        return this.zzf;
    }

    public final zzcum zzo() {
        return this.zzj;
    }

    @Nullable
    public final zzezy zzp() {
        return this.zze;
    }

    public final zzczi zzq() {
        return this.zzg.zzn();
    }

    public final zzfcu zzr() {
        return this.zza;
    }

    public final boolean zzs() {
        return this.zzb.zzaq;
    }

    public final void zzt() {
        zzdtp zzdtpVar;
        List list = this.zzb.zzaC;
        if (list == null || list.isEmpty() || (zzdtpVar = this.zzk) == null) {
            return;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzip)).booleanValue() || list.isEmpty()) {
            return;
        }
        zzgme zzgmeVarListIterator = ((zzgjz) list).listIterator(0);
        while (zzgmeVarListIterator.hasNext()) {
            zzdtq zzdtqVar = (zzdtq) zzgmeVarListIterator.next();
            int[] iArr = zzdtqVar.zzb;
            int length = iArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (iArr[i] == 1) {
                    zzdtpVar.zza(zzdtqVar.zza, 1, com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
                    break;
                }
                i++;
            }
        }
    }
}
