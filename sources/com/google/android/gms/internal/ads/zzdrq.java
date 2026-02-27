package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.media3.exoplayer.offline.DownloadService;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.google.android.gms.ads.MobileAds;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdrq implements zzdau, com.google.android.gms.ads.internal.client.zza, zzcwm, zzcvw, zzcyn {
    private final Context zzc;
    private final zzfdv zzd;
    private final zzdsm zze;
    private final zzfcu zzf;
    private final zzfcj zzg;
    private final zzecn zzh;
    private final String zzi;

    @Nullable
    private Boolean zzk;
    private long zzj = -1;

    @VisibleForTesting
    final AtomicBoolean zza = new AtomicBoolean(false);

    @VisibleForTesting
    final AtomicBoolean zzb = new AtomicBoolean(false);
    private final boolean zzl = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhj)).booleanValue();

    public zzdrq(Context context, zzfdv zzfdvVar, zzdsm zzdsmVar, zzfcu zzfcuVar, zzfcj zzfcjVar, zzecn zzecnVar, String str) {
        this.zzc = context;
        this.zzd = zzfdvVar;
        this.zze = zzdsmVar;
        this.zzf = zzfcuVar;
        this.zzg = zzfcjVar;
        this.zzh = zzecnVar;
        this.zzi = str;
    }

    private final boolean zzf() {
        String strZzt;
        if (this.zzk == null) {
            synchronized (this) {
                if (this.zzk == null) {
                    String str = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzbG);
                    com.google.android.gms.ads.internal.zzt.zzc();
                    try {
                        strZzt = com.google.android.gms.ads.internal.util.zzs.zzt(this.zzc);
                    } catch (RemoteException unused) {
                        strZzt = null;
                    }
                    boolean zMatches = false;
                    if (str != null && strZzt != null) {
                        try {
                            zMatches = Pattern.matches(str, strZzt);
                        } catch (RuntimeException e) {
                            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.zzk = Boolean.valueOf(zMatches);
                }
            }
        }
        return this.zzk.booleanValue();
    }

    private final zzdsl zzg(String str) {
        zzfcu zzfcuVar = this.zzf;
        zzfct zzfctVar = zzfcuVar.zzb;
        zzdsl zzdslVarZza = this.zze.zza();
        zzdslVarZza.zza(zzfctVar.zzb);
        zzfcj zzfcjVar = this.zzg;
        zzdslVarZza.zzb(zzfcjVar);
        zzdslVarZza.zzc("action", str);
        zzdslVarZza.zzc("ad_format", this.zzi.toUpperCase(Locale.ROOT));
        List list = zzfcjVar.zzt;
        if (!list.isEmpty()) {
            zzdslVarZza.zzc("ancn", (String) list.get(0));
        }
        if (zzfcjVar.zzb()) {
            zzdslVarZza.zzc("device_connectivity", true != com.google.android.gms.ads.internal.zzt.zzh().zzs(this.zzc) ? "offline" : CustomTabsCallback.ONLINE_EXTRAS_KEY);
            zzdslVarZza.zzc("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()));
            zzdslVarZza.zzc("offline_ad", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhq)).booleanValue()) {
            boolean zZza = com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zza(zzfcuVar);
            zzdslVarZza.zzc("scar", String.valueOf(zZza));
            if (zZza) {
                com.google.android.gms.ads.internal.client.zzm zzmVar = zzfcuVar.zza.zza.zzd;
                zzdslVarZza.zzc("ragent", zzmVar.zzp);
                zzdslVarZza.zzc("rtype", com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzc(zzmVar)));
            }
        }
        return zzdslVarZza;
    }

    private final void zzi(zzdsl zzdslVar) {
        if (!this.zzg.zzb()) {
            zzdslVar.zzd();
            return;
        }
        this.zzh.zze(new zzecp(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis(), this.zzf.zzb.zzb.zzb, zzdslVar.zzg(), 2));
    }

    private final boolean zzj() {
        int i = this.zzg.zzb;
        return i == 2 || i == 5 || i == 6 || i == 7;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (this.zzg.zzb()) {
            zzi(zzg("click"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvw
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.client.zze zzeVar2;
        if (this.zzl) {
            zzdsl zzdslVarZzg = zzg("ifts");
            zzdslVarZzg.zzc(Constants.REASON, "adapter");
            int i = zzeVar.zza;
            String str = zzeVar.zzb;
            if (zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN) && (zzeVar2 = zzeVar.zzd) != null && !zzeVar2.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                com.google.android.gms.ads.internal.client.zze zzeVar3 = zzeVar.zzd;
                i = zzeVar3.zza;
                str = zzeVar3.zzb;
            }
            if (i >= 0) {
                zzdslVarZzg.zzc("arec", String.valueOf(i));
            }
            String strZza = this.zzd.zza(str);
            if (strZza != null) {
                zzdslVarZzg.zzc("areec", strZza);
            }
            zzdslVarZzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvw
    public final void zzd(zzdgo zzdgoVar) {
        if (this.zzl) {
            zzdsl zzdslVarZzg = zzg("ifts");
            zzdslVarZzg.zzc(Constants.REASON, Constants.EXCEPTION);
            if (!TextUtils.isEmpty(zzdgoVar.getMessage())) {
                zzdslVarZzg.zzc("msg", zzdgoVar.getMessage());
            }
            zzdslVarZzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdau
    public final void zzdL() {
        if (zzf()) {
            zzdsl zzdslVarZzg = zzg("adapter_impression");
            zzdslVarZzg.zzc("imp_type", String.valueOf(this.zzg.zze));
            if (this.zzb.get()) {
                zzdslVarZzg.zzc("po", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                zzdslVarZzg.zzc("pil", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.zzj));
            } else {
                zzdslVarZzg.zzc("po", "0");
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzok)).booleanValue() && zzj()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                zzdslVarZzg.zzc(DownloadService.KEY_FOREGROUND, true != com.google.android.gms.ads.internal.util.zzs.zzK(this.zzc) ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "0");
                zzdslVarZzg.zzc("fg_show", true != this.zza.get() ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzol)).booleanValue() && zzj()) {
                zzdslVarZzg.zzc("fg_al", true == com.google.android.gms.ads.internal.zzt.zzg().zzf() ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "0");
            }
            zzdslVarZzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdau
    public final void zzdM() {
        if (zzf()) {
            zzg("adapter_shown").zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzdw() {
        if (zzf() || this.zzg.zzb()) {
            zzdsl zzdslVarZzg = zzg("impression");
            zzdslVarZzg.zzc("imp_type", String.valueOf(this.zzg.zze));
            if (this.zzj > 0) {
                zzdslVarZzg.zzc("p_imp_l", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.zzj));
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzok)).booleanValue() && zzj()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                zzdslVarZzg.zzc(DownloadService.KEY_FOREGROUND, true != com.google.android.gms.ads.internal.util.zzs.zzK(this.zzc) ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "0");
                zzdslVarZzg.zzc("fg_show", true == this.zza.get() ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "0");
            }
            zzi(zzdslVarZzg);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvw
    public final void zze() {
        if (this.zzl) {
            zzdsl zzdslVarZzg = zzg("ifts");
            zzdslVarZzg.zzc(Constants.REASON, "blocked");
            zzdslVarZzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyn
    public final void zzk() {
        if (zzf()) {
            this.zzb.set(true);
            this.zzj = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            zzdsl zzdslVarZzg = zzg("presentation");
            boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzok)).booleanValue();
            String str = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
            if (zBooleanValue && zzj()) {
                AtomicBoolean atomicBoolean = this.zza;
                com.google.android.gms.ads.internal.zzt.zzc();
                atomicBoolean.set(!com.google.android.gms.ads.internal.util.zzs.zzK(this.zzc));
                zzdslVarZzg.zzc(DownloadService.KEY_FOREGROUND, true != atomicBoolean.get() ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzol)).booleanValue() && zzj()) {
                if (true != com.google.android.gms.ads.internal.zzt.zzg().zzf()) {
                    str = "0";
                }
                zzdslVarZzg.zzc("fg_al", str);
            }
            zzdslVarZzg.zzd();
        }
    }
}
