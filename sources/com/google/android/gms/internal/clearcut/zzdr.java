package com.google.android.gms.internal.clearcut;

import We.s;
import com.dynatrace.android.agent.Global;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzdr {
    public static String zza(zzdo zzdoVar, String str) {
        StringBuilder sbV = s.v("# ", str);
        zza(zzdoVar, sbV, 0);
        return sbV.toString();
    }

    private static final String zzj(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt)) {
                sb2.append(Global.UNDERSCORE);
            }
            sb2.append(Character.toLowerCase(cCharAt));
        }
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void zza(com.google.android.gms.internal.clearcut.zzdo r18, java.lang.StringBuilder r19, int r20) {
        /*
            Method dump skipped, instruction units count: 688
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzdr.zza(com.google.android.gms.internal.clearcut.zzdo, java.lang.StringBuilder, int):void");
    }

    public static final void zza(StringBuilder sb2, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zza(sb2, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zza(sb2, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        int i4 = 0;
        for (int i6 = 0; i6 < i; i6++) {
            sb2.append(' ');
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            sb2.append(zzet.zzc(zzbb.zzf((String) obj)));
            sb2.append('\"');
            return;
        }
        if (obj instanceof zzbb) {
            sb2.append(": \"");
            sb2.append(zzet.zzc((zzbb) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof zzcg) {
            sb2.append(" {");
            zza((zzcg) obj, sb2, i + 2);
            sb2.append(Global.NEWLINE);
            while (i4 < i) {
                sb2.append(' ');
                i4++;
            }
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj.toString());
            return;
        }
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i10 = i + 2;
        zza(sb2, i10, "key", entry.getKey());
        zza(sb2, i10, "value", entry.getValue());
        sb2.append(Global.NEWLINE);
        while (i4 < i) {
            sb2.append(' ');
            i4++;
        }
        sb2.append("}");
    }
}
