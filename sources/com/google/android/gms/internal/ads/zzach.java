package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzach {
    public static void zza(long j, zzef zzefVar, zzaeb[] zzaebVarArr) {
        int iZzB;
        while (true) {
            if (zzefVar.zzd() <= 1) {
                return;
            }
            int iZzc = zzc(zzefVar);
            int iZzc2 = zzc(zzefVar);
            int iZzg = zzefVar.zzg() + iZzc2;
            if (iZzc2 == -1 || iZzc2 > zzefVar.zzd()) {
                zzds.zzc("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                iZzg = zzefVar.zze();
            } else if (iZzc == 4 && iZzc2 >= 8) {
                int iZzs = zzefVar.zzs();
                int iZzt = zzefVar.zzt();
                if (iZzt == 49) {
                    iZzB = zzefVar.zzB();
                    iZzt = 49;
                } else {
                    iZzB = 0;
                }
                int iZzs2 = zzefVar.zzs();
                if (iZzt == 47) {
                    zzefVar.zzk(1);
                    iZzt = 47;
                }
                boolean z4 = iZzs == 181 && (iZzt == 49 || iZzt == 47) && iZzs2 == 3;
                if (iZzt == 49) {
                    z4 &= iZzB == 1195456820;
                }
                if (z4) {
                    zzb(j, zzefVar, zzaebVarArr);
                }
            }
            zzefVar.zzh(iZzg);
        }
    }

    public static void zzb(long j, zzef zzefVar, zzaeb[] zzaebVarArr) {
        int iZzs = zzefVar.zzs();
        if ((iZzs & 64) != 0) {
            int i = iZzs & 31;
            zzefVar.zzk(1);
            int iZzg = zzefVar.zzg();
            for (zzaeb zzaebVar : zzaebVarArr) {
                int i4 = i * 3;
                zzefVar.zzh(iZzg);
                zzaebVar.zzz(zzefVar, i4);
                zzghc.zzh(j != androidx.media3.common.C.TIME_UNSET);
                zzaebVar.zzx(j, 1, i4, 0, null);
            }
        }
    }

    private static int zzc(zzef zzefVar) {
        int i = 0;
        while (zzefVar.zzd() != 0) {
            int iZzs = zzefVar.zzs();
            i += iZzs;
            if (iZzs != 255) {
                return i;
            }
        }
        return -1;
    }
}
