package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbbn;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdrb implements zzcyy, zzcxg, zzcvv, zzcwm, com.google.android.gms.ads.internal.client.zza, zzdbj {
    private final zzbbh zza;
    private boolean zzb = false;

    public zzdrb(zzbbh zzbbhVar, zzfaf zzfafVar) {
        this.zza = zzbbhVar;
        zzbbhVar.zzc(2);
        if (zzfafVar != null) {
            zzbbhVar.zzc(1101);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        if (this.zzb) {
            this.zza.zzc(8);
        } else {
            this.zza.zzc(7);
            this.zzb = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvv
    public final void zzdN(com.google.android.gms.ads.internal.client.zze zzeVar) {
        switch (zzeVar.zza) {
            case 1:
                this.zza.zzc(101);
                break;
            case 2:
                this.zza.zzc(102);
                break;
            case 3:
                this.zza.zzc(5);
                break;
            case 4:
                this.zza.zzc(103);
                break;
            case 5:
                this.zza.zzc(104);
                break;
            case 6:
                this.zza.zzc(105);
                break;
            case 7:
                this.zza.zzc(106);
                break;
            default:
                this.zza.zzc(4);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyy
    public final void zzdT(zzbuv zzbuvVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcyy
    public final void zzdU(final zzfcu zzfcuVar) {
        this.zza.zzb(new zzbbg() { // from class: com.google.android.gms.internal.ads.zzdra
            @Override // com.google.android.gms.internal.ads.zzbbg
            public final /* synthetic */ void zza(zzbbn.zzt.zza zzaVar) {
                zzbbn.zza.zzb zzbVarZzcc = zzaVar.zzY().zzcc();
                zzbbn.zzi.zza zzaVarZzcc = zzaVar.zzY().zzp().zzcc();
                zzaVarZzcc.zzd(zzfcuVar.zzb.zzb.zzb);
                zzbVarZzcc.zzr(zzaVarZzcc);
                zzaVar.zzaa(zzbVarZzcc);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final synchronized void zzdw() {
        this.zza.zzc(6);
    }

    @Override // com.google.android.gms.internal.ads.zzcxg
    public final void zzg() {
        this.zza.zzc(3);
    }

    @Override // com.google.android.gms.internal.ads.zzdbj
    public final void zzj(final zzbbn.zzb zzbVar) {
        zzbbg zzbbgVar = new zzbbg() { // from class: com.google.android.gms.internal.ads.zzdqx
            @Override // com.google.android.gms.internal.ads.zzbbg
            public final /* synthetic */ void zza(zzbbn.zzt.zza zzaVar) {
                zzaVar.zzar(zzbVar);
            }
        };
        zzbbh zzbbhVar = this.zza;
        zzbbhVar.zzb(zzbbgVar);
        zzbbhVar.zzc(1103);
    }

    @Override // com.google.android.gms.internal.ads.zzdbj
    public final void zzk(final zzbbn.zzb zzbVar) {
        zzbbg zzbbgVar = new zzbbg() { // from class: com.google.android.gms.internal.ads.zzdqy
            @Override // com.google.android.gms.internal.ads.zzbbg
            public final /* synthetic */ void zza(zzbbn.zzt.zza zzaVar) {
                zzaVar.zzar(zzbVar);
            }
        };
        zzbbh zzbbhVar = this.zza;
        zzbbhVar.zzb(zzbbgVar);
        zzbbhVar.zzc(1102);
    }

    @Override // com.google.android.gms.internal.ads.zzdbj
    public final void zzl(final zzbbn.zzb zzbVar) {
        zzbbg zzbbgVar = new zzbbg() { // from class: com.google.android.gms.internal.ads.zzdqz
            @Override // com.google.android.gms.internal.ads.zzbbg
            public final /* synthetic */ void zza(zzbbn.zzt.zza zzaVar) {
                zzaVar.zzar(zzbVar);
            }
        };
        zzbbh zzbbhVar = this.zza;
        zzbbhVar.zzb(zzbbgVar);
        zzbbhVar.zzc(1104);
    }

    @Override // com.google.android.gms.internal.ads.zzdbj
    public final void zzm(boolean z4) {
        this.zza.zzc(true != z4 ? 1106 : 1105);
    }

    @Override // com.google.android.gms.internal.ads.zzdbj
    public final void zzn(boolean z4) {
        this.zza.zzc(true != z4 ? 1108 : 1107);
    }

    @Override // com.google.android.gms.internal.ads.zzdbj
    public final void zzo() {
        this.zza.zzc(1109);
    }
}
