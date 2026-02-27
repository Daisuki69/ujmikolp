package com.google.protobuf;

import com.dynatrace.android.agent.Global;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f10055a;

    static {
        char[] cArr = new char[80];
        f10055a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(int i, StringBuilder sb2) {
        while (i > 0) {
            int i4 = 80;
            if (i <= 80) {
                i4 = i;
            }
            sb2.append(f10055a, 0, i4);
            i -= i4;
        }
    }

    public static void b(StringBuilder sb2, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb2, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb2, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        a(i, sb2);
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
            C1192f c1192f = C1192f.c;
            sb2.append(b0.b(new C1192f(((String) obj).getBytes(AbstractC1207v.f10124a))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof C1192f) {
            sb2.append(": \"");
            sb2.append(b0.b((C1192f) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof AbstractC1203q) {
            sb2.append(" {");
            c((AbstractC1203q) obj, sb2, i + 2);
            sb2.append(Global.NEWLINE);
            a(i, sb2);
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj);
            return;
        }
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i6 = i + 2;
        b(sb2, i6, "key", entry.getKey());
        b(sb2, i6, "value", entry.getValue());
        sb2.append(Global.NEWLINE);
        a(i, sb2);
        sb2.append("}");
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x019e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(com.google.protobuf.AbstractC1203q r21, java.lang.StringBuilder r22, int r23) {
        /*
            Method dump skipped, instruction units count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.L.c(com.google.protobuf.q, java.lang.StringBuilder, int):void");
    }
}
