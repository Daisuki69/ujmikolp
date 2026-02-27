package com.google.android.gms.internal.location;

import androidx.media3.datasource.cache.c;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbs {
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
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb2 = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
                    sb2.append(name);
                    sb2.append('@');
                    sb2.append(hexString);
                    String string2 = sb2.toString();
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", string2.length() != 0 ? "Exception during lenientFormat for ".concat(string2) : new String("Exception during lenientFormat for "), (Throwable) e);
                    String name2 = e.getClass().getName();
                    StringBuilder sb3 = new StringBuilder(c.b(9, name2.length(), string2));
                    c.A(sb3, "<", string2, " threw ", name2);
                    sb3.append(">");
                    string = sb3.toString();
                }
            }
            objArr[i4] = string;
            i4++;
        }
        StringBuilder sb4 = new StringBuilder((length * 16) + str.length());
        int i6 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (iIndexOf = str.indexOf("%s", i6)) == -1) {
                break;
            }
            sb4.append((CharSequence) str, i6, iIndexOf);
            sb4.append(objArr[i]);
            i++;
            i6 = iIndexOf + 2;
        }
        sb4.append((CharSequence) str, i6, str.length());
        if (i < length2) {
            sb4.append(" [");
            sb4.append(objArr[i]);
            for (int i10 = i + 1; i10 < objArr.length; i10++) {
                sb4.append(", ");
                sb4.append(objArr[i10]);
            }
            sb4.append(']');
        }
        return sb4.toString();
    }
}
