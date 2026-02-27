package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdaj implements AppEventListener, OnAdMetadataChangedListener, zzcvs, com.google.android.gms.ads.internal.client.zza, zzcyj, zzcwm, zzcxr, com.google.android.gms.ads.internal.overlay.zzq, zzcwi, zzddz {
    private final zzczi zza = new zzczi(this, null);
    private zzeli zzb;
    private zzelm zzc;
    private zzeyj zzd;
    private zzfbn zze;

    private static void zzs(Object obj, zzdai zzdaiVar) {
        if (obj != null) {
            zzdaiVar.zza(obj);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzs(this.zzb, zzczn.zza);
        zzs(this.zzc, zzdaa.zza);
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        zzs(this.zze, zzdag.zza);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(final String str, final String str2) {
        zzs(this.zzb, new zzdai() { // from class: com.google.android.gms.internal.ads.zzcza
            @Override // com.google.android.gms.internal.ads.zzdai
            public final /* synthetic */ void zza(Object obj) {
                ((zzeli) obj).onAppEvent(str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzd(final zzbvh zzbvhVar, final String str, final String str2) {
        zzs(this.zzb, new zzdai(zzbvhVar, str, str2) { // from class: com.google.android.gms.internal.ads.zzczh
            @Override // com.google.android.gms.internal.ads.zzdai
            public final /* synthetic */ void zza(Object obj) {
            }
        });
        zzs(this.zze, new zzdai() { // from class: com.google.android.gms.internal.ads.zzcyz
            @Override // com.google.android.gms.internal.ads.zzdai
            public final /* synthetic */ void zza(Object obj) {
                ((zzfbn) obj).zzd(zzbvhVar, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdA() {
        zzs(this.zzd, zzczv.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdB() {
        zzs(this.zzd, zzczw.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdC() {
        zzs(this.zzd, zzczx.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdD() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdE() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzdO() {
        zzs(this.zzb, zzczk.zza);
        zzs(this.zze, zzdac.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzddz
    public final void zzdV() {
        zzs(this.zzb, zzczo.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdX() {
        zzs(this.zzd, zzczu.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdY(final int i) {
        zzs(this.zzd, new zzdai() { // from class: com.google.android.gms.internal.ads.zzczg
            @Override // com.google.android.gms.internal.ads.zzdai
            public final /* synthetic */ void zza(Object obj) {
                ((zzeyj) obj).zzdY(i);
            }
        });
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

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzdw() {
        zzs(this.zzb, zzczq.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzdx() {
        zzs(this.zzb, zzczj.zza);
        zzs(this.zze, zzdab.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzdy() {
        zzs(this.zzb, zzczr.zza);
        zzs(this.zze, zzdah.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzddz
    public final void zzdz() {
        zzs(this.zzb, zzczp.zza);
        zzs(this.zzc, zzczz.zza);
        zzs(this.zze, zzdaf.zza);
        zzs(this.zzd, zzczy.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zze() {
        zzs(this.zzb, zzczl.zza);
        zzs(this.zze, zzdad.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzf() {
        zzs(this.zzb, zzczm.zza);
        zzs(this.zze, zzdae.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzh() {
        zzs(this.zzd, zzczt.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcwi
    public final void zzj(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzs(this.zze, new zzdai() { // from class: com.google.android.gms.internal.ads.zzcze
            @Override // com.google.android.gms.internal.ads.zzdai
            public final /* synthetic */ void zza(Object obj) {
                ((zzfbn) obj).zzj(zzeVar);
            }
        });
        zzs(this.zzb, new zzdai() { // from class: com.google.android.gms.internal.ads.zzczf
            @Override // com.google.android.gms.internal.ads.zzdai
            public final /* synthetic */ void zza(Object obj) {
                ((zzeli) obj).zzj(zzeVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcxr
    public final void zzl() {
        zzs(this.zzd, zzczs.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcyj
    public final void zzm(final com.google.android.gms.ads.internal.client.zzt zztVar) {
        zzs(this.zzb, new zzdai() { // from class: com.google.android.gms.internal.ads.zzczb
            @Override // com.google.android.gms.internal.ads.zzdai
            public final /* synthetic */ void zza(Object obj) {
                ((zzeli) obj).zzm(zztVar);
            }
        });
        zzs(this.zze, new zzdai() { // from class: com.google.android.gms.internal.ads.zzczc
            @Override // com.google.android.gms.internal.ads.zzdai
            public final /* synthetic */ void zza(Object obj) {
                ((zzfbn) obj).zzm(zztVar);
            }
        });
        zzs(this.zzd, new zzdai() { // from class: com.google.android.gms.internal.ads.zzczd
            @Override // com.google.android.gms.internal.ads.zzdai
            public final /* synthetic */ void zza(Object obj) {
                ((zzeyj) obj).zzm(zztVar);
            }
        });
    }

    public final zzczi zzn() {
        return this.zza;
    }

    public final /* synthetic */ void zzo(zzeli zzeliVar) {
        this.zzb = zzeliVar;
    }

    public final /* synthetic */ void zzp(zzelm zzelmVar) {
        this.zzc = zzelmVar;
    }

    public final /* synthetic */ void zzq(zzeyj zzeyjVar) {
        this.zzd = zzeyjVar;
    }

    public final /* synthetic */ void zzr(zzfbn zzfbnVar) {
        this.zze = zzfbnVar;
    }
}
