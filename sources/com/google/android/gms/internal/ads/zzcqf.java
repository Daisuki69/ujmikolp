package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcqf implements zzcxg, zzcwm {
    private final Context zza;

    @Nullable
    private final zzcek zzb;
    private final zzfcj zzc;
    private final VersionInfoParcel zzd;

    @Nullable
    private zzedu zze;
    private boolean zzf;
    private final zzeds zzg;

    public zzcqf(Context context, @Nullable zzcek zzcekVar, zzfcj zzfcjVar, VersionInfoParcel versionInfoParcel, zzeds zzedsVar) {
        this.zza = context;
        this.zzb = zzcekVar;
        this.zzc = zzfcjVar;
        this.zzd = versionInfoParcel;
        this.zzg = zzedsVar;
    }

    private final synchronized void zza() {
        zzcek zzcekVar;
        zzedr zzedrVar;
        zzedq zzedqVar;
        try {
            zzfcj zzfcjVar = this.zzc;
            if (zzfcjVar.zzT && (zzcekVar = this.zzb) != null) {
                if (com.google.android.gms.ads.internal.zzt.zzu().zza(this.zza)) {
                    VersionInfoParcel versionInfoParcel = this.zzd;
                    int i = versionInfoParcel.buddyApkVersion;
                    int i4 = versionInfoParcel.clientJarVersion;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 1 + String.valueOf(i4).length());
                    sb2.append(i);
                    sb2.append(".");
                    sb2.append(i4);
                    String string = sb2.toString();
                    zzfdf zzfdfVar = zzfcjVar.zzV;
                    String strZza = zzfdfVar.zza();
                    if (zzfdfVar.zzc() == 1) {
                        zzedqVar = zzedq.VIDEO;
                        zzedrVar = zzedr.DEFINED_BY_JAVASCRIPT;
                    } else {
                        int i6 = zzfcjVar.zze;
                        zzedq zzedqVar2 = zzedq.HTML_DISPLAY;
                        zzedrVar = i6 == 1 ? zzedr.ONE_PIXEL : zzedr.BEGIN_TO_RENDER;
                        zzedqVar = zzedqVar2;
                    }
                    zzedu zzeduVarZzc = com.google.android.gms.ads.internal.zzt.zzu().zzc(string, zzcekVar.zzD(), "", "javascript", strZza, zzedrVar, zzedqVar, zzfcjVar.zzal);
                    this.zze = zzeduVarZzc;
                    if (zzeduVarZzc != null) {
                        zzflj zzfljVarZza = zzeduVarZzc.zza();
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfL)).booleanValue()) {
                            com.google.android.gms.ads.internal.zzt.zzu().zzh(zzfljVarZza, zzcekVar.zzD());
                            Iterator it = zzcekVar.zzF().iterator();
                            while (it.hasNext()) {
                                com.google.android.gms.ads.internal.zzt.zzu().zzg(zzfljVarZza, (View) it.next());
                            }
                        } else {
                            com.google.android.gms.ads.internal.zzt.zzu().zzh(zzfljVarZza, zzcekVar.zzE());
                        }
                        zzcekVar.zzak(this.zze);
                        com.google.android.gms.ads.internal.zzt.zzu().zze(zzfljVarZza);
                        this.zzf = true;
                        zzcekVar.zze("onSdkLoaded", new ArrayMap());
                    }
                }
            }
        } finally {
        }
    }

    private final boolean zzb() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfM)).booleanValue() && this.zzg.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final synchronized void zzdw() {
        zzcek zzcekVar;
        if (zzb()) {
            this.zzg.zzd();
            return;
        }
        if (!this.zzf) {
            zza();
        }
        if (!this.zzc.zzT || this.zze == null || (zzcekVar = this.zzb) == null) {
            return;
        }
        zzcekVar.zze("onSdkImpression", new ArrayMap());
    }

    @Override // com.google.android.gms.internal.ads.zzcxg
    public final synchronized void zzg() {
        if (zzb()) {
            this.zzg.zzc();
        } else {
            if (this.zzf) {
                return;
            }
            zza();
        }
    }
}
