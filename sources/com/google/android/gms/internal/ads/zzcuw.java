package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcuw {
    private final zzfhh zza;
    private final VersionInfoParcel zzb;
    private final ApplicationInfo zzc;
    private final String zzd;
    private final List zze;
    private final PackageInfo zzf;
    private final zzhpr zzg;
    private final String zzh;
    private final zzeus zzi;
    private final com.google.android.gms.ads.internal.util.zzg zzj;
    private final zzfdc zzk;
    private final int zzl;
    private final zzdbl zzm;

    public zzcuw(zzfhh zzfhhVar, VersionInfoParcel versionInfoParcel, ApplicationInfo applicationInfo, String str, List list, @Nullable PackageInfo packageInfo, zzhpr zzhprVar, com.google.android.gms.ads.internal.util.zzg zzgVar, String str2, zzeus zzeusVar, zzfdc zzfdcVar, zzdbl zzdblVar, int i) {
        this.zza = zzfhhVar;
        this.zzb = versionInfoParcel;
        this.zzc = applicationInfo;
        this.zzd = str;
        this.zze = list;
        this.zzf = packageInfo;
        this.zzg = zzhprVar;
        this.zzh = str2;
        this.zzi = zzeusVar;
        this.zzj = zzgVar;
        this.zzk = zzfdcVar;
        this.zzm = zzdblVar;
        this.zzl = i;
    }

    public final S1.y zza(Bundle bundle) {
        this.zzm.zza();
        zzfhb zzfhbVar = zzfhb.SIGNALS;
        zzfhh zzfhhVar = this.zza;
        Objects.requireNonNull(zzfhhVar);
        return zzfgs.zza(this.zzi.zza(new zzcuu(new Bundle(), new Bundle()), bundle, this.zzl == 2), zzfhbVar, zzfhhVar).zzi();
    }

    public final S1.y zzb() {
        final Bundle bundle = new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcr)).booleanValue()) {
            Bundle bundle2 = this.zzk.zzt;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            bundle.putBoolean("ls", false);
        }
        final S1.y yVarZza = zza(bundle);
        return this.zza.zzb(zzfhb.REQUEST_PARCEL, yVarZza, (S1.y) this.zzg.zzb()).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzcuv
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc(yVarZza, bundle);
            }
        }).zzi();
    }

    public final /* synthetic */ zzbuv zzc(S1.y yVar, Bundle bundle) {
        zzcuu zzcuuVar = (zzcuu) yVar.get();
        Bundle bundle2 = zzcuuVar.zza;
        String str = (String) ((S1.y) this.zzg.zzb()).get();
        boolean z4 = false;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhu)).booleanValue() && this.zzj.zzx()) {
            z4 = true;
        }
        boolean z5 = z4;
        String str2 = this.zzh;
        PackageInfo packageInfo = this.zzf;
        List list = this.zze;
        String str3 = this.zzd;
        return new zzbuv(bundle2, this.zzb, this.zzc, str3, list, packageInfo, str, str2, null, null, z5, this.zzk.zza(), bundle, zzcuuVar.zzb, this.zzl);
    }
}
