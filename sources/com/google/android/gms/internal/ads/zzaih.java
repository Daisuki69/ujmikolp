package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.media3.container.MdtaMetadataEntry;

/* JADX INFO: loaded from: classes3.dex */
final class zzaih {
    public static void zza(int i, @Nullable zzao zzaoVar, zzs zzsVar, @Nullable zzao zzaoVar2, zzao... zzaoVarArr) {
        if (zzaoVar2 == null) {
            zzaoVar2 = new zzao(androidx.media3.common.C.TIME_UNSET, new zzan[0]);
        }
        if (zzaoVar != null) {
            for (int i4 = 0; i4 < zzaoVar.zza(); i4++) {
                zzan zzanVarZzb = zzaoVar.zzb(i4);
                if (zzanVarZzb instanceof zzer) {
                    zzer zzerVar = (zzer) zzanVarZzb;
                    if (!zzerVar.zza.equals(MdtaMetadataEntry.KEY_ANDROID_CAPTURE_FPS)) {
                        zzaoVar2 = zzaoVar2.zzd(zzerVar);
                    } else if (i == 2) {
                        zzaoVar2 = zzaoVar2.zzd(zzerVar);
                    }
                }
            }
        }
        for (zzao zzaoVar3 : zzaoVarArr) {
            zzaoVar2 = zzaoVar2.zzc(zzaoVar3);
        }
        if (zzaoVar2.zza() > 0) {
            zzsVar.zzk(zzaoVar2);
        }
    }

    public static void zzb(int i, zzadk zzadkVar, zzs zzsVar) {
        if (i == 1 && zzadkVar.zzb()) {
            zzsVar.zzH(zzadkVar.zza);
            zzsVar.zzI(zzadkVar.zzb);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x026b A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:9:0x0039, B:11:0x0044, B:15:0x0053, B:18:0x005f, B:21:0x006c, B:24:0x007b, B:27:0x0088, B:30:0x0096, B:32:0x00a2, B:40:0x00bf, B:41:0x00dd, B:42:0x00ef, B:45:0x00fb, B:48:0x0108, B:51:0x0115, B:54:0x0122, B:57:0x012f, B:60:0x013c, B:63:0x0149, B:65:0x0153, B:67:0x015d, B:69:0x0167, B:73:0x0178, B:75:0x017e, B:77:0x0192, B:78:0x0199, B:80:0x01a0, B:85:0x01ab, B:90:0x01b7, B:128:0x026b, B:91:0x01cc, B:93:0x01d3, B:95:0x01df, B:96:0x01f3, B:109:0x021d, B:112:0x022a, B:115:0x0236, B:118:0x0242, B:121:0x024e, B:124:0x025a, B:127:0x0264, B:129:0x0288, B:130:0x028f), top: B:135:0x002b }] */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzan zzc(com.google.android.gms.internal.ads.zzef r17) {
        /*
            Method dump skipped, instruction units count: 669
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaih.zzc(com.google.android.gms.internal.ads.zzef):com.google.android.gms.internal.ads.zzan");
    }

    @Nullable
    private static zzagm zzd(int i, String str, zzef zzefVar) {
        int iZzB = zzefVar.zzB();
        if (zzefVar.zzB() == 1684108385) {
            zzefVar.zzk(8);
            return new zzagm(str, null, zzgjz.zzj(zzefVar.zzL(iZzB - 16)));
        }
        zzds.zzc("MetadataUtil", "Failed to parse text attribute: ".concat(zzev.zze(i)));
        return null;
    }

    @Nullable
    private static zzagh zze(int i, String str, zzef zzefVar, boolean z4, boolean z5) {
        int iZzf = zzf(zzefVar);
        if (z5) {
            iZzf = Math.min(1, iZzf);
        }
        if (iZzf >= 0) {
            return z4 ? new zzagm(str, null, zzgjz.zzj(Integer.toString(iZzf))) : new zzagb(androidx.media3.common.C.LANGUAGE_UNDETERMINED, str, Integer.toString(iZzf));
        }
        zzds.zzc("MetadataUtil", "Failed to parse uint8 attribute: ".concat(zzev.zze(i)));
        return null;
    }

    private static int zzf(zzef zzefVar) {
        int iZzB = zzefVar.zzB();
        if (zzefVar.zzB() == 1684108385) {
            zzefVar.zzk(8);
            int i = iZzB - 16;
            if (i == 1) {
                return zzefVar.zzs();
            }
            if (i == 2) {
                return zzefVar.zzt();
            }
            if (i == 3) {
                return zzefVar.zzx();
            }
            if (i == 4 && (zzefVar.zzn() & 128) == 0) {
                return zzefVar.zzH();
            }
        }
        zzds.zzc("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    @Nullable
    private static zzagm zzg(int i, String str, zzef zzefVar) {
        int iZzB = zzefVar.zzB();
        if (zzefVar.zzB() == 1684108385 && iZzB >= 22) {
            zzefVar.zzk(10);
            int iZzt = zzefVar.zzt();
            if (iZzt > 0) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(iZzt).length());
                sb2.append(iZzt);
                String string = sb2.toString();
                int iZzt2 = zzefVar.zzt();
                if (iZzt2 > 0) {
                    StringBuilder sb3 = new StringBuilder(string.length() + 1 + String.valueOf(iZzt2).length());
                    sb3.append(string);
                    sb3.append("/");
                    sb3.append(iZzt2);
                    string = sb3.toString();
                }
                return new zzagm(str, null, zzgjz.zzj(string));
            }
        }
        zzds.zzc("MetadataUtil", "Failed to parse index/count attribute: ".concat(zzev.zze(i)));
        return null;
    }
}
