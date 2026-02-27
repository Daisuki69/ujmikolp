package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdmu {
    private final zzfdc zza;
    private final Executor zzb;
    private final zzdpi zzc;
    private final zzdod zzd;
    private final Context zze;
    private final zzdsm zzf;
    private final zzfjv zzg;
    private final zzecn zzh;
    private final zzdsg zzi;
    private final zzdtp zzj;

    public zzdmu(zzfdc zzfdcVar, Executor executor, zzdpi zzdpiVar, Context context, zzdsm zzdsmVar, zzfjv zzfjvVar, zzecn zzecnVar, zzdod zzdodVar, zzdsg zzdsgVar, zzdtp zzdtpVar) {
        this.zza = zzfdcVar;
        this.zzb = executor;
        this.zzc = zzdpiVar;
        this.zze = context;
        this.zzf = zzdsmVar;
        this.zzg = zzfjvVar;
        this.zzh = zzecnVar;
        this.zzd = zzdodVar;
        this.zzi = zzdsgVar;
        this.zzj = zzdtpVar;
    }

    private final void zzh(zzcek zzcekVar, zzbzl zzbzlVar) {
        com.google.android.gms.ads.internal.client.zzga zzgaVar = this.zza.zza;
        if (zzgaVar != null && zzcekVar.zzh() != null) {
            zzcekVar.zzh().zzc(zzgaVar);
        }
        zzbzlVar.zzb();
    }

    private final void zzi(zzcek zzcekVar, @Nullable com.google.android.gms.ads.internal.zzb zzbVar, @Nullable zzbxf zzbxfVar) {
        zzdtp zzdtpVar;
        zzj(zzcekVar);
        zzcekVar.zzab("/video", zzbjk.zzl);
        zzcekVar.zzab("/videoMeta", zzbjk.zzm);
        zzcekVar.zzab("/precache", new zzccr());
        zzcekVar.zzab("/delayPageLoaded", zzbjk.zzp);
        zzcekVar.zzab("/instrument", zzbjk.zzn);
        zzcekVar.zzab("/log", zzbjk.zzg);
        zzcekVar.zzab("/click", zzbjk.zzb(null, null));
        if (this.zza.zzb != null) {
            zzcekVar.zzP().zzR(true);
            zzcekVar.zzab("/open", new zzbjy(true != ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoq)).booleanValue() ? null : zzbVar, null, null, null, null, null));
        } else {
            zzcekVar.zzP().zzR(false);
        }
        if (com.google.android.gms.ads.internal.zzt.zzD().zza(zzcekVar.getContext())) {
            Map map = new HashMap();
            if (zzcekVar.zzC() != null) {
                map = zzcekVar.zzC().zzaw;
            }
            zzcekVar.zzab("/logScionEvent", new zzbjr(zzcekVar.getContext(), map));
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoq)).booleanValue()) {
            zzcekVar.zzP().zzi(zzbVar);
            zzcekVar.zzP().zzj(zzbxfVar);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzio)).booleanValue() || (zzdtpVar = this.zzj) == null) {
            return;
        }
        zzcekVar.zzab("/onDeviceStorageEvent", new zzbjt(zzdtpVar));
    }

    private static final void zzj(zzcek zzcekVar) {
        zzcekVar.zzab("/videoClicked", zzbjk.zzh);
        zzcekVar.zzP().zzP(true);
        zzcekVar.zzab("/getNativeAdViewSignals", zzbjk.zzs);
        zzcekVar.zzab("/getNativeClickMeta", zzbjk.zzt);
    }

    public final S1.y zza(final JSONObject jSONObject, @Nullable final com.google.android.gms.ads.internal.zzb zzbVar, @Nullable final zzbxf zzbxfVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcy)).booleanValue()) {
            androidx.media3.datasource.cache.c.v(this.zzi.zze(), zzdru.NATIVE_ASSETS_LOADING_VIDEO_START.zza());
        }
        S1.y yVarZza = zzgot.zza(null);
        zzgob zzgobVar = new zzgob() { // from class: com.google.android.gms.internal.ads.zzdmp
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ S1.y zza(Object obj) {
                return this.zza.zze(zzbVar, zzbxfVar, obj);
            }
        };
        Executor executor = this.zzb;
        return zzgot.zzj(zzgot.zzj(yVarZza, zzgobVar, executor), new zzgob() { // from class: com.google.android.gms.internal.ads.zzdmt
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ S1.y zza(Object obj) {
                return this.zza.zzc(jSONObject, (zzcek) obj);
            }
        }, executor);
    }

    public final S1.y zzb(final String str, final String str2, final zzfcj zzfcjVar, final zzfcm zzfcmVar, final com.google.android.gms.ads.internal.client.zzr zzrVar, final com.google.android.gms.ads.internal.zzb zzbVar, final zzbxf zzbxfVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcy)).booleanValue()) {
            androidx.media3.datasource.cache.c.v(this.zzi.zze(), zzdru.NATIVE_ASSETS_LOADING_VIDEO_COMPOSITION_START.zza());
        }
        return zzgot.zzj(zzgot.zza(null), new zzgob() { // from class: com.google.android.gms.internal.ads.zzdmo
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ S1.y zza(Object obj) {
                return this.zza.zzd(zzrVar, zzfcjVar, zzfcmVar, zzbVar, zzbxfVar, str, str2, obj);
            }
        }, this.zzb);
    }

    public final /* synthetic */ S1.y zzc(JSONObject jSONObject, final zzcek zzcekVar) {
        zzblw zzblwVar = this.zza.zzb;
        final zzbzl zzbzlVarZza = zzbzl.zza(zzcekVar);
        if (zzblwVar != null) {
            zzcekVar.zzaf(zzcgt.zze());
        } else {
            zzcekVar.zzaf(zzcgt.zzd());
        }
        zzcekVar.zzP().zzG(new zzcgg() { // from class: com.google.android.gms.internal.ads.zzdms
            @Override // com.google.android.gms.internal.ads.zzcgg
            public final /* synthetic */ void zza(boolean z4, int i, String str, String str2) {
                this.zza.zzg(zzcekVar, zzbzlVarZza, z4, i, str, str2);
            }
        });
        zzcekVar.zzb("google.afma.nativeAds.renderVideo", jSONObject);
        return zzbzlVarZza;
    }

    public final /* synthetic */ S1.y zzd(com.google.android.gms.ads.internal.client.zzr zzrVar, zzfcj zzfcjVar, zzfcm zzfcmVar, com.google.android.gms.ads.internal.zzb zzbVar, zzbxf zzbxfVar, String str, String str2, Object obj) throws zzcez {
        final zzcek zzcekVarZza = this.zzc.zza(zzrVar, zzfcjVar, zzfcmVar);
        final zzbzl zzbzlVarZza = zzbzl.zza(zzcekVarZza);
        if (this.zza.zzb != null) {
            zzi(zzcekVarZza, zzbVar, zzbxfVar);
            zzcekVarZza.zzaf(zzcgt.zze());
        } else {
            zzdoa zzdoaVarZza = this.zzd.zza();
            zzcgi zzcgiVarZzP = zzcekVarZza.zzP();
            zzbbz zzbbzVar = zzbci.zzoq;
            zzcgiVarZzP.zzZ(zzdoaVarZza, zzdoaVarZza, zzdoaVarZza, zzdoaVarZza, zzdoaVarZza, false, null, !((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).booleanValue() ? new com.google.android.gms.ads.internal.zzb(this.zze, null, null) : zzbVar, null, true != ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).booleanValue() ? null : zzbxfVar, this.zzh, this.zzg, this.zzf, null, zzdoaVarZza, null, null, null, null, this.zzj, null);
            zzj(zzcekVarZza);
        }
        zzcekVarZza.zzP().zzG(new zzcgg() { // from class: com.google.android.gms.internal.ads.zzdmr
            @Override // com.google.android.gms.internal.ads.zzcgg
            public final /* synthetic */ void zza(boolean z4, int i, String str3, String str4) {
                this.zza.zzf(zzcekVarZza, zzbzlVarZza, z4, i, str3, str4);
            }
        });
        zzcekVarZza.zzau(str, str2, null);
        return zzbzlVarZza;
    }

    public final /* synthetic */ S1.y zze(com.google.android.gms.ads.internal.zzb zzbVar, zzbxf zzbxfVar, Object obj) throws zzcez {
        zzcek zzcekVarZza = this.zzc.zza(com.google.android.gms.ads.internal.client.zzr.zzb(), null, null);
        final zzbzl zzbzlVarZza = zzbzl.zza(zzcekVarZza);
        zzi(zzcekVarZza, zzbVar, zzbxfVar);
        zzcekVarZza.zzP().zzH(new zzcgh() { // from class: com.google.android.gms.internal.ads.zzdmq
            @Override // com.google.android.gms.internal.ads.zzcgh
            public final /* synthetic */ void zza() {
                zzbzlVarZza.zzb();
            }
        });
        zzcekVarZza.loadUrl((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzej));
        return zzbzlVarZza;
    }

    public final /* synthetic */ void zzf(zzcek zzcekVar, zzbzl zzbzlVar, boolean z4, int i, String str, String str2) {
        if (z4) {
            com.google.android.gms.ads.internal.client.zzga zzgaVar = this.zza.zza;
            if (zzgaVar != null && zzcekVar.zzh() != null) {
                zzcekVar.zzh().zzc(zzgaVar);
            }
            zzbzlVar.zzb();
            return;
        }
        int length = String.valueOf(i).length();
        StringBuilder sb2 = new StringBuilder(length + 63 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
        sb2.append("Html video Web View failed to load. Error code: ");
        sb2.append(i);
        sb2.append(", Description: ");
        sb2.append(str);
        zzbzlVar.zzd(new zzeho(1, We.s.p(sb2, ", Failing URL: ", str2)));
    }

    public final /* synthetic */ void zzg(zzcek zzcekVar, zzbzl zzbzlVar, boolean z4, int i, String str, String str2) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzer)).booleanValue()) {
            zzh(zzcekVar, zzbzlVar);
            return;
        }
        if (z4) {
            zzh(zzcekVar, zzbzlVar);
            return;
        }
        int length = String.valueOf(i).length();
        StringBuilder sb2 = new StringBuilder(length + 64 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
        sb2.append("Native Video WebView failed to load. Error code: ");
        sb2.append(i);
        sb2.append(", Description: ");
        sb2.append(str);
        zzbzlVar.zzd(new zzeho(1, We.s.p(sb2, ", Failing URL: ", str2)));
    }
}
