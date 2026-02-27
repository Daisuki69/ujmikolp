package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import We.s;
import com.dynatrace.android.agent.Global;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzfo {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String zza(zzfm zzfmVar, String str) {
        StringBuilder sbV = s.v("# ", str);
        zzd(zzfmVar, sbV, 0);
        return sbV.toString();
    }

    public static void zzb(StringBuilder sb2, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zzb(sb2, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zzb(sb2, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        zzc(i, sb2);
        if (!str.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Character.toLowerCase(str.charAt(0)));
            for (int i4 = 1; i4 < str.length(); i4++) {
                char cCharAt = str.charAt(i4);
                if (Character.isUpperCase(cCharAt)) {
                    sb3.append(Global.UNDERSCORE);
                }
                sb3.append(Character.toLowerCase(cCharAt));
            }
            str = sb3.toString();
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            sb2.append(zzgq.zza(new zzde(((String) obj).getBytes(zzep.zza))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof zzdf) {
            sb2.append(": \"");
            sb2.append(zzgq.zza((zzdf) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof zzeh) {
            sb2.append(" {");
            zzd((zzeh) obj, sb2, i + 2);
            sb2.append(Global.NEWLINE);
            zzc(i, sb2);
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj);
            return;
        }
        int i6 = i + 2;
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        zzb(sb2, i6, "key", entry.getKey());
        zzb(sb2, i6, "value", entry.getValue());
        sb2.append(Global.NEWLINE);
        zzc(i, sb2);
        sb2.append("}");
    }

    private static void zzc(int i, StringBuilder sb2) {
        while (i > 0) {
            int i4 = 80;
            if (i <= 80) {
                i4 = i;
            }
            sb2.append(zza, 0, i4);
            i -= i4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void zzd(com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm r18, java.lang.StringBuilder r19, int r20) {
        /*
            Method dump skipped, instruction units count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfo.zzd(com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm, java.lang.StringBuilder, int):void");
    }
}
