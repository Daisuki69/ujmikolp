package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.OnContextChangedListener;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbpy extends zzboz {
    private final Object zza;
    private zzbqa zzb;
    private zzbvs zzc;
    private IObjectWrapper zzd;
    private View zze;
    private MediationInterstitialAd zzf;
    private UnifiedNativeAdMapper zzg;
    private NativeAdMapper zzh;
    private MediationRewardedAd zzi;
    private MediationInterscrollerAd zzj;
    private MediationAppOpenAd zzk;
    private final String zzl = "";

    public zzbpy(@NonNull Adapter adapter) {
        this.zza = adapter;
    }

    private final Bundle zzV(String str, com.google.android.gms.ads.internal.client.zzm zzmVar, String str2) throws RemoteException {
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.zza instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (zzmVar != null) {
                    bundle.putInt("tagForChildDirectedTreatment", zzmVar.zzg);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", th2);
            throw new RemoteException();
        }
    }

    private final Bundle zzW(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        Bundle bundle;
        Bundle bundle2 = zzmVar.zzm;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.zza.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    private static final boolean zzX(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        if (zzmVar.zzf) {
            return true;
        }
        com.google.android.gms.ads.internal.client.zzbb.zza();
        return com.google.android.gms.ads.internal.util.client.zzf.zzw();
    }

    @Nullable
    private static final String zzY(String str, com.google.android.gms.ads.internal.client.zzm zzmVar) {
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return zzmVar.zzu;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzA(boolean z4) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof OnImmersiveModeUpdatedListener) {
            try {
                ((OnImmersiveModeUpdatedListener) obj).onImmersiveModeUpdated(z4);
                return;
            } catch (Throwable th2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", th2);
                return;
            }
        }
        String canonicalName = OnImmersiveModeUpdatedListener.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        com.google.android.gms.ads.internal.util.client.zzo.zzd(sb2.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzed zzB() {
        Object obj = this.zza;
        if (obj instanceof com.google.android.gms.ads.mediation.zza) {
            try {
                return ((com.google.android.gms.ads.mediation.zza) obj).getVideoController();
            } catch (Throwable th2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", th2);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    @Nullable
    public final zzbpm zzC() {
        UnifiedNativeAdMapper unifiedNativeAdMapperZzb;
        Object obj = this.zza;
        if (obj instanceof MediationNativeAdapter) {
            zzbqa zzbqaVar = this.zzb;
            if (zzbqaVar == null || (unifiedNativeAdMapperZzb = zzbqaVar.zzb()) == null) {
                return null;
            }
            return new zzbqe(unifiedNativeAdMapperZzb);
        }
        if (!(obj instanceof Adapter)) {
            return null;
        }
        NativeAdMapper nativeAdMapper = this.zzh;
        if (nativeAdMapper != null) {
            return new zzbqc(nativeAdMapper);
        }
        UnifiedNativeAdMapper unifiedNativeAdMapper = this.zzg;
        if (unifiedNativeAdMapper != null) {
            return new zzbqe(unifiedNativeAdMapper);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzD(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbpd zzbpdVar) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Requesting rewarded ad from adapter.");
            try {
                ((Adapter) obj).loadRewardedAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzV(str, zzmVar, null), zzW(zzmVar), zzX(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzY(str, zzmVar), ""), new zzbpw(this, zzbpdVar));
                return;
            } catch (Exception e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
                zzbou.zza(iObjectWrapper, e, "adapter.loadRewardedAd");
                throw new RemoteException();
            }
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzE(IObjectWrapper iObjectWrapper) throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof Adapter)) {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb2.append(canonicalName);
            sb2.append(" #009 Class mismatch: ");
            sb2.append(canonicalName2);
            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2.toString());
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Show rewarded ad from adapter.");
        MediationRewardedAd mediationRewardedAd = this.zzi;
        if (mediationRewardedAd == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Can not show null mediation rewarded ad.");
            throw new RemoteException();
        }
        try {
            mediationRewardedAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
        } catch (RuntimeException e) {
            zzbou.zza(iObjectWrapper, e, "adapter.rewarded.showAd");
            throw e;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    @Override // com.google.android.gms.internal.ads.zzbpa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzF(com.google.android.gms.dynamic.IObjectWrapper r7, com.google.android.gms.internal.ads.zzblo r8, java.util.List r9) throws android.os.RemoteException {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbpy.zzF(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.internal.ads.zzblo, java.util.List):void");
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzG(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbpd zzbpdVar) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Requesting rewarded interstitial ad from adapter.");
            try {
                ((Adapter) obj).loadRewardedInterstitialAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzV(str, zzmVar, null), zzW(zzmVar), zzX(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzY(str, zzmVar), ""), new zzbpw(this, zzbpdVar));
                return;
            } catch (Exception e) {
                zzbou.zza(iObjectWrapper, e, "adapter.loadRewardedInterstitialAd");
                throw new RemoteException();
            }
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    @Nullable
    public final zzbrl zzH() {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            return zzbrl.zza(((Adapter) obj).getVersionInfo());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    @Nullable
    public final zzbrl zzI() {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            return zzbrl.zza(((Adapter) obj).getSDKVersionInfo());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzJ(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbpd zzbpdVar) throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof Adapter)) {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb2.append(canonicalName);
            sb2.append(" #009 Class mismatch: ");
            sb2.append(canonicalName2);
            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2.toString());
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Requesting interscroller ad from adapter.");
        try {
            Adapter adapter = (Adapter) obj;
            zzbpq zzbpqVar = new zzbpq(this, zzbpdVar, adapter);
            zzV(str, zzmVar, str2);
            zzW(zzmVar);
            zzX(zzmVar);
            Location location = zzmVar.zzk;
            zzY(str, zzmVar);
            com.google.android.gms.ads.zzc.zzc(zzrVar.zze, zzrVar.zzb);
            zzbpqVar.onFailure(new AdError(7, adapter.getClass().getSimpleName().concat(" does not support interscroller ads."), MobileAds.ERROR_DOMAIN));
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            zzbou.zza(iObjectWrapper, e, "adapter.loadInterscrollerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    @Nullable
    public final zzbpg zzK() {
        MediationInterscrollerAd mediationInterscrollerAd = this.zzj;
        if (mediationInterscrollerAd != null) {
            return new zzbpz(mediationInterscrollerAd);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzL(IObjectWrapper iObjectWrapper) throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof Adapter) && !(obj instanceof MediationInterstitialAdapter)) {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            int length = String.valueOf(canonicalName).length();
            StringBuilder sb2 = new StringBuilder(length + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            androidx.media3.datasource.cache.c.A(sb2, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            sb2.append(canonicalName3);
            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2.toString());
            throw new RemoteException();
        }
        if (obj instanceof MediationInterstitialAdapter) {
            zzh();
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Show interstitial ad from adapter.");
        MediationInterstitialAd mediationInterstitialAd = this.zzf;
        if (mediationInterstitialAd == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Can not show null mediation interstitial ad.");
            throw new RemoteException();
        }
        try {
            mediationInterstitialAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
        } catch (RuntimeException e) {
            zzbou.zza(iObjectWrapper, e, "adapter.interstitial.showAd");
            throw e;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzM(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbpd zzbpdVar) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Requesting app open ad from adapter.");
            try {
                ((Adapter) obj).loadAppOpenAd(new MediationAppOpenAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzV(str, zzmVar, null), zzW(zzmVar), zzX(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzY(str, zzmVar), ""), new zzbpx(this, zzbpdVar));
                return;
            } catch (Exception e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
                zzbou.zza(iObjectWrapper, e, "adapter.loadAppOpenAd");
                throw new RemoteException();
            }
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzN(IObjectWrapper iObjectWrapper) throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof Adapter)) {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb2.append(canonicalName);
            sb2.append(" #009 Class mismatch: ");
            sb2.append(canonicalName2);
            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2.toString());
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Show app open ad from adapter.");
        MediationAppOpenAd mediationAppOpenAd = this.zzk;
        if (mediationAppOpenAd == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Can not show null mediation app open ad.");
            throw new RemoteException();
        }
        try {
            mediationAppOpenAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
        } catch (RuntimeException e) {
            zzbou.zza(iObjectWrapper, e, "adapter.appOpen.showAd");
            throw e;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    @Nullable
    public final zzbpi zzO() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    @Nullable
    public final zzbpj zzP() {
        return null;
    }

    public final /* synthetic */ void zzQ(UnifiedNativeAdMapper unifiedNativeAdMapper) {
        this.zzg = unifiedNativeAdMapper;
    }

    public final /* synthetic */ void zzR(NativeAdMapper nativeAdMapper) {
        this.zzh = nativeAdMapper;
    }

    public final /* synthetic */ void zzS(MediationRewardedAd mediationRewardedAd) {
        this.zzi = mediationRewardedAd;
    }

    public final /* synthetic */ void zzT(MediationInterscrollerAd mediationInterscrollerAd) {
        this.zzj = mediationInterscrollerAd;
    }

    public final /* synthetic */ void zzU(MediationAppOpenAd mediationAppOpenAd) {
        this.zzk = mediationAppOpenAd;
    }

    public final /* synthetic */ Object zzb() {
        return this.zza;
    }

    public final /* synthetic */ void zzc(View view) {
        this.zze = view;
    }

    public final /* synthetic */ void zzd(MediationInterstitialAd mediationInterstitialAd) {
        this.zzf = mediationInterstitialAd;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zze(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbpd zzbpdVar) throws RemoteException {
        zzj(iObjectWrapper, zzrVar, zzmVar, str, null, zzbpdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final IObjectWrapper zzf() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return ObjectWrapper.wrap(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", th2);
                throw new RemoteException();
            }
        }
        if (obj instanceof Adapter) {
            return ObjectWrapper.wrap(this.zze);
        }
        String canonicalName = MediationBannerAdapter.class.getCanonicalName();
        String canonicalName2 = Adapter.class.getCanonicalName();
        String canonicalName3 = obj.getClass().getCanonicalName();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb2 = new StringBuilder(length + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
        androidx.media3.datasource.cache.c.A(sb2, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
        sb2.append(canonicalName3);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzg(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbpd zzbpdVar) throws RemoteException {
        zzk(iObjectWrapper, zzmVar, str, null, zzbpdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzh() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationInterstitialAdapter) {
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) obj).showInterstitial();
                return;
            } catch (Throwable th2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", th2);
                throw new RemoteException();
            }
        }
        String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzi() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onDestroy();
            } catch (Throwable th2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", th2);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzj(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbpd zzbpdVar) throws RemoteException {
        String str3;
        MediationBannerAdapter mediationBannerAdapter;
        zzbpp zzbppVar;
        Bundle bundle;
        Object obj = this.zza;
        boolean z4 = obj instanceof MediationBannerAdapter;
        if (!z4 && !(obj instanceof Adapter)) {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            androidx.media3.datasource.cache.c.A(sb2, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            sb2.append(canonicalName3);
            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2.toString());
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Requesting banner ad from adapter.");
        AdSize adSizeZzb = zzrVar.zzn ? com.google.android.gms.ads.zzc.zzb(zzrVar.zze, zzrVar.zzb) : com.google.android.gms.ads.zzc.zza(zzrVar.zze, zzrVar.zzb, zzrVar.zza);
        if (!z4) {
            Object obj2 = this.zza;
            if (obj2 instanceof Adapter) {
                try {
                    ((Adapter) obj2).loadBannerAd(new MediationBannerAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzV(str, zzmVar, str2), zzW(zzmVar), zzX(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzY(str, zzmVar), adSizeZzb, this.zzl), new zzbps(this, zzbpdVar));
                    return;
                } catch (Throwable th2) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("", th2);
                    zzbou.zza(iObjectWrapper, th2, "adapter.loadBannerAd");
                    throw new RemoteException();
                }
            }
            return;
        }
        try {
            mediationBannerAdapter = (MediationBannerAdapter) obj;
            List list = zzmVar.zze;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j = zzmVar.zzb;
            zzbppVar = new zzbpp(j == -1 ? null : new Date(j), zzmVar.zzd, hashSet, zzmVar.zzk, zzX(zzmVar), zzmVar.zzg, zzmVar.zzr, zzmVar.zzt, zzY(str, zzmVar));
            Bundle bundle2 = zzmVar.zzm;
            bundle = bundle2 != null ? bundle2.getBundle(mediationBannerAdapter.getClass().getName()) : null;
            str3 = "";
        } catch (Throwable th3) {
            th = th3;
            str3 = "";
        }
        try {
            mediationBannerAdapter.requestBannerAd((Context) ObjectWrapper.unwrap(iObjectWrapper), new zzbqa(zzbpdVar), zzV(str, zzmVar, str2), adSizeZzb, zzbppVar, bundle);
        } catch (Throwable th4) {
            th = th4;
            com.google.android.gms.ads.internal.util.client.zzo.zzg(str3, th);
            zzbou.zza(iObjectWrapper, th, "adapter.requestBannerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzk(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbpd zzbpdVar) throws RemoteException {
        Object obj = this.zza;
        boolean z4 = obj instanceof MediationInterstitialAdapter;
        if (!z4 && !(obj instanceof Adapter)) {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            androidx.media3.datasource.cache.c.A(sb2, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            sb2.append(canonicalName3);
            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2.toString());
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Requesting interstitial ad from adapter.");
        if (!z4) {
            Object obj2 = this.zza;
            if (obj2 instanceof Adapter) {
                try {
                    ((Adapter) obj2).loadInterstitialAd(new MediationInterstitialAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzV(str, zzmVar, str2), zzW(zzmVar), zzX(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzY(str, zzmVar), this.zzl), new zzbpt(this, zzbpdVar));
                    return;
                } catch (Throwable th2) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("", th2);
                    zzbou.zza(iObjectWrapper, th2, "adapter.loadInterstitialAd");
                    throw new RemoteException();
                }
            }
            return;
        }
        try {
            MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) obj;
            List list = zzmVar.zze;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j = zzmVar.zzb;
            zzbpp zzbppVar = new zzbpp(j == -1 ? null : new Date(j), zzmVar.zzd, hashSet, zzmVar.zzk, zzX(zzmVar), zzmVar.zzg, zzmVar.zzr, zzmVar.zzt, zzY(str, zzmVar));
            Bundle bundle = zzmVar.zzm;
            mediationInterstitialAdapter.requestInterstitialAd((Context) ObjectWrapper.unwrap(iObjectWrapper), new zzbqa(zzbpdVar), zzV(str, zzmVar, str2), zzbppVar, bundle != null ? bundle.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
        } catch (Throwable th3) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", th3);
            zzbou.zza(iObjectWrapper, th3, "adapter.requestInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzl() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onPause();
            } catch (Throwable th2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", th2);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzm() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onResume();
            } catch (Throwable th2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", th2);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzn(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbvs zzbvsVar, String str2) throws RemoteException {
        Object obj = this.zza;
        if ((obj instanceof Adapter) || Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            this.zzd = iObjectWrapper;
            this.zzc = zzbvsVar;
            zzbvsVar.zze(ObjectWrapper.wrap(obj));
            return;
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzo(com.google.android.gms.ads.internal.client.zzm zzmVar, String str) throws RemoteException {
        zzv(zzmVar, str, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzp() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            MediationRewardedAd mediationRewardedAd = this.zzi;
            if (mediationRewardedAd == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Can not show null mediated rewarded ad.");
                throw new RemoteException();
            }
            try {
                mediationRewardedAd.showAd((Context) ObjectWrapper.unwrap(this.zzd));
                return;
            } catch (RuntimeException e) {
                zzbou.zza(this.zzd, e, "adapter.showVideo");
                throw e;
            }
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final boolean zzq() throws RemoteException {
        Object obj = this.zza;
        if ((obj instanceof Adapter) || Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            return this.zzc != null;
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzr(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbpd zzbpdVar, zzbfl zzbflVar, List list) throws RemoteException {
        Object obj = this.zza;
        boolean z4 = obj instanceof MediationNativeAdapter;
        if (!z4 && !(obj instanceof Adapter)) {
            String canonicalName = MediationNativeAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            androidx.media3.datasource.cache.c.A(sb2, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            sb2.append(canonicalName3);
            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2.toString());
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Requesting native ad from adapter.");
        if (z4) {
            try {
                MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj;
                List list2 = zzmVar.zze;
                HashSet hashSet = list2 != null ? new HashSet(list2) : null;
                long j = zzmVar.zzb;
                zzbqd zzbqdVar = new zzbqd(j == -1 ? null : new Date(j), zzmVar.zzd, hashSet, zzmVar.zzk, zzX(zzmVar), zzmVar.zzg, zzbflVar, list, zzmVar.zzr, zzmVar.zzt, zzY(str, zzmVar));
                Bundle bundle = zzmVar.zzm;
                Bundle bundle2 = bundle != null ? bundle.getBundle(mediationNativeAdapter.getClass().getName()) : null;
                this.zzb = new zzbqa(zzbpdVar);
                mediationNativeAdapter.requestNativeAd((Context) ObjectWrapper.unwrap(iObjectWrapper), this.zzb, zzV(str, zzmVar, str2), zzbqdVar, bundle2);
                return;
            } catch (Throwable th2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", th2);
                zzbou.zza(iObjectWrapper, th2, "adapter.requestNativeAd");
                throw new RemoteException();
            }
        }
        Object obj2 = this.zza;
        if (obj2 instanceof Adapter) {
            try {
                ((Adapter) obj2).loadNativeAdMapper(new MediationNativeAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzV(str, zzmVar, str2), zzW(zzmVar), zzX(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzY(str, zzmVar), this.zzl, zzbflVar), new zzbpv(this, zzbpdVar));
            } catch (Throwable th3) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", th3);
                zzbou.zza(iObjectWrapper, th3, "adapter.loadNativeAdMapper");
                String message = th3.getMessage();
                if (TextUtils.isEmpty(message) || !message.equals("Method is not found")) {
                    throw new RemoteException();
                }
                try {
                    ((Adapter) this.zza).loadNativeAd(new MediationNativeAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzV(str, zzmVar, str2), zzW(zzmVar), zzX(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzY(str, zzmVar), this.zzl, zzbflVar), new zzbpu(this, zzbpdVar));
                } catch (Throwable th4) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("", th4);
                    zzbou.zza(iObjectWrapper, th4, "adapter.loadNativeAd");
                    throw new RemoteException();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final Bundle zzs() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final Bundle zzt() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final Bundle zzu() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzv(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            zzD(this.zzd, zzmVar, str, new zzbqb((Adapter) obj, this.zzc));
            return;
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzw(IObjectWrapper iObjectWrapper) throws RemoteException {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        Object obj = this.zza;
        if (obj instanceof OnContextChangedListener) {
            ((OnContextChangedListener) obj).onContextChanged(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final boolean zzx() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzy(IObjectWrapper iObjectWrapper, zzbvs zzbvsVar, List list) throws RemoteException {
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    @Nullable
    public final zzbgq zzz() {
        zzbgr zzbgrVarZze;
        zzbqa zzbqaVar = this.zzb;
        if (zzbqaVar == null || (zzbgrVarZze = zzbqaVar.zze()) == null) {
            return null;
        }
        return zzbgrVarZze.zza();
    }

    public zzbpy(@NonNull MediationAdapter mediationAdapter) {
        this.zza = mediationAdapter;
    }
}
