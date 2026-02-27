package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.dynatrace.android.agent.Global;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class zzalm {
    public static final Pattern zza = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*)?$");
    private static final Pattern zzb = Pattern.compile("(\\S+?):(\\S+)");
    private static final Map zzc;
    private static final Map zzd;

    static {
        HashMap map = new HashMap();
        androidx.media3.datasource.cache.c.s(255, 255, 255, map, "white");
        androidx.media3.datasource.cache.c.s(0, 255, 0, map, "lime");
        androidx.media3.datasource.cache.c.s(0, 255, 255, map, "cyan");
        androidx.media3.datasource.cache.c.s(255, 0, 0, map, "red");
        androidx.media3.datasource.cache.c.s(255, 255, 0, map, "yellow");
        androidx.media3.datasource.cache.c.s(255, 0, 255, map, "magenta");
        androidx.media3.datasource.cache.c.s(0, 0, 255, map, "blue");
        androidx.media3.datasource.cache.c.s(0, 0, 0, map, "black");
        zzc = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        androidx.media3.datasource.cache.c.s(255, 255, 255, map2, "bg_white");
        androidx.media3.datasource.cache.c.s(0, 255, 0, map2, "bg_lime");
        androidx.media3.datasource.cache.c.s(0, 255, 255, map2, "bg_cyan");
        androidx.media3.datasource.cache.c.s(255, 0, 0, map2, "bg_red");
        androidx.media3.datasource.cache.c.s(255, 255, 0, map2, "bg_yellow");
        androidx.media3.datasource.cache.c.s(255, 0, 255, map2, "bg_magenta");
        androidx.media3.datasource.cache.c.s(0, 0, 255, map2, "bg_blue");
        androidx.media3.datasource.cache.c.s(0, 0, 0, map2, "bg_black");
        zzd = Collections.unmodifiableMap(map2);
    }

    @Nullable
    public static zzalg zza(zzef zzefVar, List list) {
        Charset charset = StandardCharsets.UTF_8;
        String strZzN = zzefVar.zzN(charset);
        if (strZzN != null) {
            Pattern pattern = zza;
            Matcher matcher = pattern.matcher(strZzN);
            if (matcher.matches()) {
                return zzd(null, matcher, zzefVar, list);
            }
            String strZzN2 = zzefVar.zzN(charset);
            if (strZzN2 != null) {
                Matcher matcher2 = pattern.matcher(strZzN2);
                if (matcher2.matches()) {
                    return zzd(strZzN.trim(), matcher2, zzefVar, list);
                }
            }
        }
        return null;
    }

    public static zzck zzb(String str) {
        zzall zzallVar = new zzall();
        zze(str, zzallVar);
        return zzallVar.zza();
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.text.SpannedString zzc(@androidx.annotation.Nullable java.lang.String r18, java.lang.String r19, java.util.List r20) {
        /*
            Method dump skipped, instruction units count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalm.zzc(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    @Nullable
    private static zzalg zzd(@Nullable String str, Matcher matcher, zzef zzefVar, List list) {
        zzall zzallVar = new zzall();
        try {
            String strGroup = matcher.group(1);
            if (strGroup == null) {
                throw null;
            }
            zzallVar.zza = zzalo.zza(strGroup);
            String strGroup2 = matcher.group(2);
            if (strGroup2 == null) {
                throw null;
            }
            zzallVar.zzb = zzalo.zza(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            zze(strGroup3, zzallVar);
            StringBuilder sb2 = new StringBuilder();
            String strZzN = zzefVar.zzN(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(strZzN)) {
                if (sb2.length() > 0) {
                    sb2.append(Global.NEWLINE);
                }
                sb2.append(strZzN.trim());
                strZzN = zzefVar.zzN(StandardCharsets.UTF_8);
            }
            zzallVar.zzc = zzc(str, sb2.toString(), list);
            return new zzalg(zzallVar.zza().zzr(), zzallVar.zza, zzallVar.zzb);
        } catch (IllegalArgumentException unused) {
            zzds.zzc("WebvttCueParser", "Skipping cue with bad header: ".concat(String.valueOf(matcher.group())));
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0167  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void zze(java.lang.String r17, com.google.android.gms.internal.ads.zzall r18) {
        /*
            Method dump skipped, instruction units count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalm.zze(java.lang.String, com.google.android.gms.internal.ads.zzall):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void zzf(@androidx.annotation.Nullable java.lang.String r17, com.google.android.gms.internal.ads.zzalj r18, java.util.List r19, android.text.SpannableStringBuilder r20, java.util.List r21) {
        /*
            Method dump skipped, instruction units count: 586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalm.zzf(java.lang.String, com.google.android.gms.internal.ads.zzalj, java.util.List, android.text.SpannableStringBuilder, java.util.List):void");
    }

    private static int zzg(List list, @Nullable String str, zzalj zzaljVar) {
        List listZzh = zzh(list, str, zzaljVar);
        for (int i = 0; i < listZzh.size(); i++) {
            zzalf zzalfVar = ((zzalk) listZzh.get(i)).zzb;
            if (zzalfVar.zzx() != -1) {
                return zzalfVar.zzx();
            }
        }
        return -1;
    }

    private static List zzh(List list, @Nullable String str, zzalj zzaljVar) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            zzalf zzalfVar = (zzalf) list.get(i);
            int iZze = zzalfVar.zze(str, zzaljVar.zza, zzaljVar.zzd, zzaljVar.zzc);
            if (iZze > 0) {
                arrayList.add(new zzalk(iZze, zzalfVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }
}
