package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class s {
    public static zzfhr a(Context context, int i) {
        boolean zBooleanValue;
        if (zzfie.zza()) {
            int i4 = i - 2;
            if (i4 == 20 || i4 == 21) {
                zBooleanValue = ((Boolean) zzbeb.zze.zze()).booleanValue();
            } else if (i4 != 110) {
                switch (i4) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        zBooleanValue = ((Boolean) zzbeb.zzc.zze()).booleanValue();
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        zBooleanValue = ((Boolean) zzbeb.zzd.zze()).booleanValue();
                        break;
                    case 5:
                        zBooleanValue = ((Boolean) zzbeb.zzb.zze()).booleanValue();
                        break;
                }
            } else {
                zBooleanValue = ((Boolean) zzbeb.zzf.zze()).booleanValue();
            }
            if (zBooleanValue) {
                return new zzfht(context, i);
            }
        }
        return new zzfis();
    }

    public static zzfhr b(Context context, int i, int i4, com.google.android.gms.ads.internal.client.zzm zzmVar) {
        zzfhr zzfhrVarA = a(context, i);
        if (zzfhrVarA instanceof zzfht) {
            zzfhrVarA.zza();
            zzfhrVarA.zzp(i4);
            zzfhrVarA.zzf(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzd(zzmVar.zzm));
            String str = zzmVar.zzp;
            if (zzfia.zza(str)) {
                zzfhrVarA.zze(str);
            }
        }
        return zzfhrVarA;
    }
}
