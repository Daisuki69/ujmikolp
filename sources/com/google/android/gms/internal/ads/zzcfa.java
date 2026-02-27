package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.os.StrictMode;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcfa {
    public static final zzcek zza(final Context context, final zzcgt zzcgtVar, final String str, final boolean z4, final boolean z5, @Nullable final zzauu zzauuVar, @Nullable final zzbdp zzbdpVar, final VersionInfoParcel versionInfoParcel, @Nullable zzbcx zzbcxVar, @Nullable final com.google.android.gms.ads.internal.zzn zznVar, @Nullable final com.google.android.gms.ads.internal.zza zzaVar, final zzbbh zzbbhVar, @Nullable final zzfcj zzfcjVar, @Nullable final zzfcm zzfcmVar, @Nullable final zzecy zzecyVar, @Nullable final zzfdg zzfdgVar, @Nullable final zzdsm zzdsmVar) throws zzcez {
        zzbci.zza(context);
        try {
            final zzbcx zzbcxVar2 = null;
            zzght zzghtVar = new zzght(context, zzcgtVar, str, z4, z5, zzauuVar, zzbdpVar, versionInfoParcel, zzbcxVar2, zznVar, zzaVar, zzbbhVar, zzfcjVar, zzfcmVar, zzfdgVar, zzdsmVar, zzecyVar) { // from class: com.google.android.gms.internal.ads.zzcew
                private final /* synthetic */ Context zza;
                private final /* synthetic */ zzcgt zzb;
                private final /* synthetic */ String zzc;
                private final /* synthetic */ boolean zzd;
                private final /* synthetic */ boolean zze;
                private final /* synthetic */ zzauu zzf;
                private final /* synthetic */ zzbdp zzg;
                private final /* synthetic */ VersionInfoParcel zzh;
                private final /* synthetic */ com.google.android.gms.ads.internal.zzn zzi;
                private final /* synthetic */ com.google.android.gms.ads.internal.zza zzj;
                private final /* synthetic */ zzbbh zzk;
                private final /* synthetic */ zzfcj zzl;
                private final /* synthetic */ zzfcm zzm;
                private final /* synthetic */ zzfdg zzn;
                private final /* synthetic */ zzdsm zzo;
                private final /* synthetic */ zzecy zzp;

                {
                    this.zzi = zznVar;
                    this.zzj = zzaVar;
                    this.zzk = zzbbhVar;
                    this.zzl = zzfcjVar;
                    this.zzm = zzfcmVar;
                    this.zzn = zzfdgVar;
                    this.zzo = zzdsmVar;
                    this.zzp = zzecyVar;
                }

                @Override // com.google.android.gms.internal.ads.zzght
                public final /* synthetic */ Object zza() {
                    zzcgt zzcgtVar2 = this.zzb;
                    String str2 = this.zzc;
                    boolean z8 = this.zzd;
                    boolean z9 = this.zze;
                    zzecy zzecyVar2 = this.zzp;
                    zzdsm zzdsmVar2 = this.zzo;
                    com.google.android.gms.ads.internal.zzn zznVar2 = this.zzi;
                    com.google.android.gms.ads.internal.zza zzaVar2 = this.zzj;
                    zzbbh zzbbhVar2 = this.zzk;
                    zzfcj zzfcjVar2 = this.zzl;
                    zzfcm zzfcmVar2 = this.zzm;
                    zzfdg zzfdgVar2 = this.zzn;
                    zzauu zzauuVar2 = this.zzf;
                    zzbdp zzbdpVar2 = this.zzg;
                    VersionInfoParcel versionInfoParcel2 = this.zzh;
                    Context context2 = this.zza;
                    try {
                        TrafficStats.setThreadStatsTag(264);
                        int i = zzcfn.zza;
                        zzcfg zzcfgVar = new zzcfg(new zzcfn(new zzcgl(context2), zzcgtVar2, str2, z8, z9, zzauuVar2, zzbdpVar2, versionInfoParcel2, null, zznVar2, zzaVar2, zzbbhVar2, zzfcjVar2, zzfcmVar2, zzfdgVar2), zzdsmVar2);
                        zzcfgVar.setWebViewClient(com.google.android.gms.ads.internal.zzt.zzf().zzb(zzcfgVar, zzbbhVar2, z9, zzecyVar2));
                        zzcfgVar.setWebChromeClient(new zzcej(zzcfgVar));
                        return zzcfgVar;
                    } finally {
                        TrafficStats.clearThreadStatsTag();
                    }
                }
            };
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                Object objZza = zzghtVar.zza();
                StrictMode.setThreadPolicy(threadPolicy);
                return (zzcek) objZza;
            } catch (Throwable th2) {
                StrictMode.setThreadPolicy(threadPolicy);
                throw th2;
            }
        } catch (Throwable th3) {
            throw new zzcez("Webview initialization failed.", th3);
        }
    }

    public static final S1.y zzb(final Context context, final VersionInfoParcel versionInfoParcel, final String str, final zzauu zzauuVar, final com.google.android.gms.ads.internal.zza zzaVar, final zzecy zzecyVar, final zzfdg zzfdgVar, final zzdsm zzdsmVar) {
        return zzgot.zzf(new zzgoa() { // from class: com.google.android.gms.internal.ads.zzcey
            @Override // com.google.android.gms.internal.ads.zzgoa
            public final /* synthetic */ S1.y zza() throws zzcez {
                com.google.android.gms.ads.internal.zzt.zzd();
                Context context2 = context;
                zzcgt zzcgtVarZzb = zzcgt.zzb();
                com.google.android.gms.ads.internal.zza zzaVar2 = zzaVar;
                zzbbh zzbbhVarZza = zzbbh.zza();
                zzecy zzecyVar2 = zzecyVar;
                zzfdg zzfdgVar2 = zzfdgVar;
                zzdsm zzdsmVar2 = zzdsmVar;
                zzcek zzcekVarZza = zzcfa.zza(context2, zzcgtVarZzb, "", false, false, zzauuVar, null, versionInfoParcel, null, null, zzaVar2, zzbbhVarZza, null, null, zzecyVar2, zzfdgVar2, zzdsmVar2);
                final zzbzl zzbzlVarZza = zzbzl.zza(zzcekVarZza);
                zzcekVarZza.zzP().zzG(new zzcgg() { // from class: com.google.android.gms.internal.ads.zzcex
                    @Override // com.google.android.gms.internal.ads.zzcgg
                    public final /* synthetic */ void zza(boolean z4, int i, String str2, String str3) {
                        zzbzlVarZza.zzb();
                    }
                });
                zzcekVarZza.loadUrl(str);
                return zzbzlVarZza;
            }
        }, zzbzh.zzf);
    }
}
