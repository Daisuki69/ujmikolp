package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
final class zzale {
    private static final Pattern zza = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    private static final Pattern zzb = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    private final zzef zzc = new zzef();
    private final StringBuilder zzd = new StringBuilder();

    public static void zzb(zzef zzefVar) {
        while (true) {
            for (boolean z4 = true; zzefVar.zzd() > 0 && z4; z4 = false) {
                char c = (char) zzefVar.zzi()[zzefVar.zzg()];
                if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
                    zzefVar.zzk(1);
                } else {
                    int iZzg = zzefVar.zzg();
                    int iZze = zzefVar.zze();
                    byte[] bArrZzi = zzefVar.zzi();
                    if (iZzg + 2 <= iZze) {
                        int i = iZzg + 1;
                        if (bArrZzi[iZzg] == 47) {
                            int i4 = iZzg + 2;
                            if (bArrZzi[i] == 42) {
                                while (true) {
                                    int i6 = i4 + 1;
                                    if (i6 >= iZze) {
                                        break;
                                    }
                                    if (((char) bArrZzi[i4]) == '*' && ((char) bArrZzi[i6]) == '/') {
                                        iZze = i4 + 2;
                                        i4 = iZze;
                                    } else {
                                        i4 = i6;
                                    }
                                }
                                zzefVar.zzk(iZze - zzefVar.zzg());
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return;
        }
    }

    @Nullable
    public static String zzc(zzef zzefVar, StringBuilder sb2) {
        zzb(zzefVar);
        if (zzefVar.zzd() == 0) {
            return null;
        }
        String strZzd = zzd(zzefVar, sb2);
        if (!strZzd.isEmpty()) {
            return strZzd;
        }
        char cZzs = (char) zzefVar.zzs();
        StringBuilder sb3 = new StringBuilder(String.valueOf(cZzs).length());
        sb3.append(cZzs);
        return sb3.toString();
    }

    private static String zzd(zzef zzefVar, StringBuilder sb2) {
        boolean z4;
        char c;
        sb2.setLength(0);
        int iZzg = zzefVar.zzg();
        int iZze = zzefVar.zze();
        loop0: while (true) {
            for (false; iZzg < iZze && !z4; true) {
                c = (char) zzefVar.zzi()[iZzg];
                z4 = (c < 'A' || c > 'Z') && (c < 'a' || c > 'z') && !((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_');
            }
            sb2.append(c);
            iZzg++;
        }
        zzefVar.zzk(iZzg - zzefVar.zzg());
        return sb2.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:170:0x030b, code lost:
    
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List zza(com.google.android.gms.internal.ads.zzef r18) {
        /*
            Method dump skipped, instruction units count: 780
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzale.zza(com.google.android.gms.internal.ads.zzef):java.util.List");
    }
}
