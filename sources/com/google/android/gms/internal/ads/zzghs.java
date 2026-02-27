package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class zzghs {
    public static String zza(String str) {
        return str == null ? "" : str;
    }

    public static String zzb(String str) {
        if (zzghb.zza(str)) {
            return null;
        }
        return str;
    }

    public static boolean zzc(String str) {
        return zzghb.zza(str);
    }

    public static String zzd(String str, Object... objArr) {
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
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    String strQ = We.s.q(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strQ), (Throwable) e);
                    String name2 = e.getClass().getName();
                    StringBuilder sb2 = new StringBuilder(androidx.media3.datasource.cache.c.b(strQ.length() + 8, 1, name2));
                    sb2.append("<");
                    sb2.append(strQ);
                    sb2.append(" threw ");
                    sb2.append(name2);
                    sb2.append(">");
                    string = sb2.toString();
                }
            }
            objArr[i4] = string;
            i4++;
        }
        StringBuilder sb3 = new StringBuilder(str.length() + (length * 16));
        int i6 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (iIndexOf = str.indexOf("%s", i6)) == -1) {
                break;
            }
            sb3.append((CharSequence) str, i6, iIndexOf);
            sb3.append(objArr[i]);
            i++;
            i6 = iIndexOf + 2;
        }
        sb3.append((CharSequence) str, i6, str.length());
        if (i < length2) {
            sb3.append(" [");
            sb3.append(objArr[i]);
            for (int i10 = i + 1; i10 < objArr.length; i10++) {
                sb3.append(", ");
                sb3.append(objArr[i10]);
            }
            sb3.append(']');
        }
        return sb3.toString();
    }
}
