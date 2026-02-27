package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfia {
    public static boolean zza(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.matches((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjB), str);
    }

    public static void zzb(S1.y yVar, zzfhr zzfhrVar) {
        if (((Boolean) zzbeb.zzc.zze()).booleanValue()) {
            zzgot.zzq(zzgol.zzw(yVar), new zzfhw(zzfhrVar), zzbzh.zzg);
        }
    }

    public static zzfgm zzc(final zzfhr zzfhrVar) {
        return new zzfgm() { // from class: com.google.android.gms.internal.ads.zzfhz
            @Override // com.google.android.gms.internal.ads.zzfgm
            public final /* synthetic */ Object zza(Object obj) {
                if (((Boolean) zzbeb.zzc.zze()).booleanValue()) {
                    zzfhrVar.zza();
                }
                return obj;
            }
        };
    }

    public static void zzd(S1.y yVar, zzfib zzfibVar, zzfhr zzfhrVar) {
        zzh(yVar, zzfibVar, zzfhrVar, false);
    }

    public static void zze(S1.y yVar, zzfib zzfibVar, zzfhr zzfhrVar) {
        zzh(yVar, zzfibVar, zzfhrVar, true);
    }

    public static void zzf(S1.y yVar, zzfib zzfibVar, zzfhr zzfhrVar) {
        if (((Boolean) zzbeb.zzc.zze()).booleanValue()) {
            zzgot.zzq(zzgol.zzw(yVar), new zzfhy(zzfibVar, zzfhrVar), zzbzh.zzg);
        }
    }

    public static int zzg(zzfdc zzfdcVar) {
        int iZzg = com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzg(zzfdcVar) - 1;
        return (iZzg == 0 || iZzg == 1) ? 7 : 23;
    }

    private static void zzh(S1.y yVar, zzfib zzfibVar, zzfhr zzfhrVar, boolean z4) {
        if (((Boolean) zzbeb.zzc.zze()).booleanValue()) {
            zzgot.zzq(zzgol.zzw(yVar), new zzfhx(zzfibVar, zzfhrVar, z4), zzbzh.zzg);
        }
    }
}
