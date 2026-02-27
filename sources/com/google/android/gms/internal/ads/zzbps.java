package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbps implements MediationAdLoadCallback {
    final /* synthetic */ zzbpd zza;
    final /* synthetic */ zzbpy zzb;

    public zzbps(zzbpy zzbpyVar, zzbpd zzbpdVar) {
        this.zza = zzbpdVar;
        Objects.requireNonNull(zzbpyVar);
        this.zzb = zzbpyVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        try {
            String canonicalName = this.zzb.zzb().getClass().getCanonicalName();
            int code = adError.getCode();
            String message = adError.getMessage();
            String domain = adError.getDomain();
            StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 43 + String.valueOf(code).length() + 17 + String.valueOf(message).length() + 16 + String.valueOf(domain).length());
            sb2.append(canonicalName);
            sb2.append("failed to loaded mediation ad: ErrorCode = ");
            sb2.append(code);
            sb2.append(". ErrorMessage = ");
            sb2.append(message);
            sb2.append(". ErrorDomain = ");
            sb2.append(domain);
            com.google.android.gms.ads.internal.util.client.zzo.zzd(sb2.toString());
            zzbpd zzbpdVar = this.zza;
            zzbpdVar.zzx(adError.zza());
            zzbpdVar.zzw(adError.getCode(), adError.getMessage());
            zzbpdVar.zzg(adError.getCode());
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        try {
            this.zzb.zzc(((MediationBannerAd) obj).getView());
            this.zza.zzj();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
        }
        return new zzbpo(this.zza);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
    }
}
