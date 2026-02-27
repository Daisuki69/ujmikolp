package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class zzdnl implements com.google.android.gms.ads.internal.client.zza, zzbib, com.google.android.gms.ads.internal.overlay.zzq, zzbid, com.google.android.gms.ads.internal.overlay.zzac {
    private com.google.android.gms.ads.internal.client.zza zza;
    private zzbib zzb;
    private com.google.android.gms.ads.internal.overlay.zzq zzc;
    private zzbid zzd;
    private com.google.android.gms.ads.internal.overlay.zzac zze;

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        com.google.android.gms.ads.internal.client.zza zzaVar = this.zza;
        if (zzaVar != null) {
            zzaVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbib
    public final synchronized void zza(String str, Bundle bundle) {
        zzbib zzbibVar = this.zzb;
        if (zzbibVar != null) {
            zzbibVar.zza(str, bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbid
    public final synchronized void zzb(String str, @Nullable String str2) {
        zzbid zzbidVar = this.zzd;
        if (zzbidVar != null) {
            zzbidVar.zzb(str, str2);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final synchronized void zzdA() {
        com.google.android.gms.ads.internal.overlay.zzq zzqVar = this.zzc;
        if (zzqVar != null) {
            zzqVar.zzdA();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final synchronized void zzdB() {
        com.google.android.gms.ads.internal.overlay.zzq zzqVar = this.zzc;
        if (zzqVar != null) {
            zzqVar.zzdB();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final synchronized void zzdC() {
        com.google.android.gms.ads.internal.overlay.zzq zzqVar = this.zzc;
        if (zzqVar != null) {
            zzqVar.zzdC();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdD() {
        com.google.android.gms.ads.internal.overlay.zzq zzqVar = this.zzc;
        if (zzqVar != null) {
            zzqVar.zzdD();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdE() {
        com.google.android.gms.ads.internal.overlay.zzq zzqVar = this.zzc;
        if (zzqVar != null) {
            zzqVar.zzdE();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final synchronized void zzdX() {
        com.google.android.gms.ads.internal.overlay.zzq zzqVar = this.zzc;
        if (zzqVar != null) {
            zzqVar.zzdX();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final synchronized void zzdY(int i) {
        com.google.android.gms.ads.internal.overlay.zzq zzqVar = this.zzc;
        if (zzqVar != null) {
            zzqVar.zzdY(i);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdt() {
        com.google.android.gms.ads.internal.overlay.zzq zzqVar = this.zzc;
        if (zzqVar != null) {
            zzqVar.zzdt();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdu() {
        com.google.android.gms.ads.internal.overlay.zzq zzqVar = this.zzc;
        if (zzqVar != null) {
            zzqVar.zzdu();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdv() {
        com.google.android.gms.ads.internal.overlay.zzq zzqVar = this.zzc;
        if (zzqVar != null) {
            zzqVar.zzdv();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final synchronized void zzh() {
        com.google.android.gms.ads.internal.overlay.zzq zzqVar = this.zzc;
        if (zzqVar != null) {
            zzqVar.zzh();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzac
    public final synchronized void zzl() {
        com.google.android.gms.ads.internal.overlay.zzac zzacVar = this.zze;
        if (zzacVar != null) {
            zzacVar.zzl();
        }
    }

    public final synchronized void zzm(com.google.android.gms.ads.internal.client.zza zzaVar, zzbib zzbibVar, com.google.android.gms.ads.internal.overlay.zzq zzqVar, zzbid zzbidVar, com.google.android.gms.ads.internal.overlay.zzac zzacVar) {
        this.zza = zzaVar;
        this.zzb = zzbibVar;
        this.zzc = zzqVar;
        this.zzd = zzbidVar;
        this.zze = zzacVar;
    }
}
