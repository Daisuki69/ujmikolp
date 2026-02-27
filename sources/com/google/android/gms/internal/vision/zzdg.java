package com.google.android.gms.internal.vision;

import androidx.media3.datasource.cache.c;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdg {
    public static String zza(@NullableDecl String str) {
        return zzda.zza(str);
    }

    public static String zza(@NullableDecl String str, @NullableDecl Object... objArr) {
        int iIndexOf;
        String strValueOf = String.valueOf(str);
        int i = 0;
        for (int i4 = 0; i4 < objArr.length; i4++) {
            objArr[i4] = zza(objArr[i4]);
        }
        StringBuilder sb2 = new StringBuilder((objArr.length * 16) + strValueOf.length());
        int i6 = 0;
        while (i < objArr.length && (iIndexOf = strValueOf.indexOf("%s", i6)) != -1) {
            sb2.append((CharSequence) strValueOf, i6, iIndexOf);
            sb2.append(objArr[i]);
            i6 = iIndexOf + 2;
            i++;
        }
        sb2.append((CharSequence) strValueOf, i6, strValueOf.length());
        if (i < objArr.length) {
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

    private static String zza(@NullableDecl Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            StringBuilder sb2 = new StringBuilder(c.c(name.length() + 1, hexString));
            sb2.append(name);
            sb2.append('@');
            sb2.append(hexString);
            String string = sb2.toString();
            Logger logger = Logger.getLogger("com.google.common.base.Strings");
            Level level = Level.WARNING;
            String strValueOf = String.valueOf(string);
            logger.logp(level, "com.google.common.base.Strings", "lenientToString", strValueOf.length() != 0 ? "Exception during lenientFormat for ".concat(strValueOf) : new String("Exception during lenientFormat for "), (Throwable) e);
            String name2 = e.getClass().getName();
            StringBuilder sb3 = new StringBuilder(name2.length() + c.c(9, string));
            sb3.append("<");
            sb3.append(string);
            sb3.append(" threw ");
            sb3.append(name2);
            sb3.append(">");
            return sb3.toString();
        }
    }
}
