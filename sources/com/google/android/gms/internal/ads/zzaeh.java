package com.google.android.gms.internal.ads;

import android.util.Base64;
import androidx.annotation.Nullable;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaeh {
    public static int zza(int i) {
        int i4 = 0;
        while (i > 0) {
            i >>>= 1;
            i4++;
        }
        return i4;
    }

    public static zzaee zzb(zzef zzefVar, boolean z4, boolean z5) throws zzas {
        if (z4) {
            zzd(3, zzefVar, false);
        }
        String strZzK = zzefVar.zzK((int) zzefVar.zzA(), StandardCharsets.UTF_8);
        int length = strZzK.length();
        long jZzA = zzefVar.zzA();
        String[] strArr = new String[(int) jZzA];
        int length2 = length + 15;
        for (int i = 0; i < jZzA; i++) {
            String strZzK2 = zzefVar.zzK((int) zzefVar.zzA(), StandardCharsets.UTF_8);
            strArr[i] = strZzK2;
            length2 = length2 + 4 + strZzK2.length();
        }
        if (z5 && (zzefVar.zzs() & 1) == 0) {
            throw zzas.zzb("framing bit expected to be set", null);
        }
        return new zzaee(strZzK, strArr, length2 + 1);
    }

    @Nullable
    public static zzao zzc(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            String str2 = zzeo.zza;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                zzds.zzc("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(zzafu.zzb(new zzef(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e) {
                    zzds.zzd("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new zzags(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzao(arrayList);
    }

    public static boolean zzd(int i, zzef zzefVar, boolean z4) throws zzas {
        if (zzefVar.zzd() < 7) {
            if (z4) {
                return false;
            }
            int iZzd = zzefVar.zzd();
            StringBuilder sb2 = new StringBuilder(String.valueOf(iZzd).length() + 18);
            sb2.append("too short header: ");
            sb2.append(iZzd);
            throw zzas.zzb(sb2.toString(), null);
        }
        if (zzefVar.zzs() != i) {
            if (z4) {
                return false;
            }
            throw zzas.zzb("expected header type ".concat(String.valueOf(Integer.toHexString(i))), null);
        }
        if (zzefVar.zzs() == 118 && zzefVar.zzs() == 111 && zzefVar.zzs() == 114 && zzefVar.zzs() == 98 && zzefVar.zzs() == 105 && zzefVar.zzs() == 115) {
            return true;
        }
        if (z4) {
            return false;
        }
        throw zzas.zzb("expected characters 'vorbis'", null);
    }
}
