package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbrn implements com.google.android.gms.ads.internal.overlay.zzq {
    final /* synthetic */ zzbrp zza;

    public zzbrn(zzbrp zzbrpVar) {
        Objects.requireNonNull(zzbrpVar);
        this.zza = zzbrpVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdA() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdB() {
        com.google.android.gms.ads.internal.util.client.zzo.zzd("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdC() {
        com.google.android.gms.ads.internal.util.client.zzo.zzd("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdD() {
        com.google.android.gms.ads.internal.util.client.zzo.zzd("AdMobCustomTabsAdapter overlay is stopped.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdE() {
        com.google.android.gms.ads.internal.util.client.zzo.zzd("AdMobCustomTabsAdapter overlay is destroyed.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdX() {
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Delay close AdMobCustomTabsAdapter overlay.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdY(int i) {
        com.google.android.gms.ads.internal.util.client.zzo.zzd("AdMobCustomTabsAdapter overlay is closed.");
        zzbrp zzbrpVar = this.zza;
        zzbrpVar.zzb().onAdClosed(zzbrpVar);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdt() {
        com.google.android.gms.ads.internal.util.client.zzo.zzd("AdMobCustomTabsAdapter overlay is created.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdu() {
        com.google.android.gms.ads.internal.util.client.zzo.zzd("AdMobCustomTabsAdapter overlay is started.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdv() {
        com.google.android.gms.ads.internal.util.client.zzo.zzd("AdMobCustomTabsAdapter overlay is restarted.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzh() {
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Opening AdMobCustomTabsAdapter overlay.");
        zzbrp zzbrpVar = this.zza;
        zzbrpVar.zzb().onAdOpened(zzbrpVar);
    }
}
