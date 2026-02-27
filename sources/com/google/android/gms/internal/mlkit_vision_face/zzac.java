package com.google.android.gms.internal.mlkit_vision_face;

import We.s;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class zzac {
    public static String zza(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String string;
        int i = 0;
        int i4 = 0;
        while (true) {
            length = objArr.length;
            if (i4 >= length) {
                break;
            }
            Object obj = objArr[i4];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str2), (Throwable) e);
                    StringBuilder sbW = s.w("<", str2, " threw ");
                    sbW.append(e.getClass().getName());
                    sbW.append(">");
                    string = sbW.toString();
                }
            }
            objArr[i4] = string;
            i4++;
        }
        StringBuilder sb2 = new StringBuilder((length * 16) + str.length());
        int i6 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (iIndexOf = str.indexOf("%s", i6)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i6, iIndexOf);
            sb2.append(objArr[i]);
            i++;
            i6 = iIndexOf + 2;
        }
        sb2.append((CharSequence) str, i6, str.length());
        if (i < length2) {
            sb2.append(" [");
            sb2.append(objArr[i]);
            for (int i10 = i + 1; i10 < objArr.length; i10++) {
                sb2.append(", ");
                sb2.append(objArr[i10]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static boolean zzb(String str) {
        return zzaa.zza(str);
    }
}
