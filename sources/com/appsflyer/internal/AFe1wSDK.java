package com.appsflyer.internal;

import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class AFe1wSDK {
    private static long AFInAppEventParameterName = 0;
    private static int AFInAppEventType = 0;
    private static char AFKeystoreWrapper = 0;
    private static int valueOf = 1;
    private static int values;

    static {
        valueOf();
        AndroidCharacter.getMirror('0');
        TextUtils.lastIndexOf("", '0', 0);
        valueOf = (values + 67) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004c, code lost:
    
        if ((r7 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004e, code lost:
    
        r7 = 27 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0051, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0056, code lost:
    
        return r6.substring(0, 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002e, code lost:
    
        if (r6.length() < 80) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0041, code lost:
    
        if (r6.length() < 12) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0043, code lost:
    
        r7 = com.appsflyer.internal.AFe1wSDK.valueOf + 71;
        com.appsflyer.internal.AFe1wSDK.values = r7 % 128;
     */
    @androidx.annotation.VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String AFInAppEventParameterName(java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10) {
        /*
            int r0 = com.appsflyer.internal.AFe1wSDK.valueOf
            int r0 = r0 + 19
            int r1 = r0 % 128
            com.appsflyer.internal.AFe1wSDK.values = r1
            r1 = 2
            int r0 = r0 % r1
            r2 = 12
            java.lang.String r3 = ""
            r4 = 0
            if (r0 == 0) goto L31
            r0 = 3
            java.lang.String[] r0 = new java.lang.String[r0]
            r5 = 1
            r0[r5] = r7
            r0[r4] = r8
            r7 = 5
            r0[r7] = r9
            r0[r1] = r10
            r0[r1] = r3
            java.lang.String r7 = com.appsflyer.internal.AFb1ySDK.values(r0)
            java.lang.String r6 = com.appsflyer.internal.AFb1ySDK.AFInAppEventType(r7, r6)
            int r7 = r6.length()
            r8 = 80
            if (r7 >= r8) goto L52
            goto L43
        L31:
            java.lang.String[] r7 = new java.lang.String[]{r7, r8, r9, r10, r3}
            java.lang.String r7 = com.appsflyer.internal.AFb1ySDK.values(r7)
            java.lang.String r6 = com.appsflyer.internal.AFb1ySDK.AFInAppEventType(r7, r6)
            int r7 = r6.length()
            if (r7 >= r2) goto L52
        L43:
            int r7 = com.appsflyer.internal.AFe1wSDK.valueOf
            int r7 = r7 + 71
            int r8 = r7 % 128
            com.appsflyer.internal.AFe1wSDK.values = r8
            int r7 = r7 % r1
            if (r7 == 0) goto L51
            r7 = 27
            int r7 = r7 / r4
        L51:
            return r6
        L52:
            java.lang.String r6 = r6.substring(r4, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFe1wSDK.AFInAppEventParameterName(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    @NonNull
    private static AFe1xSDK AFKeystoreWrapper(@NonNull AFb1iSDK aFb1iSDK, @Nullable String str, @NonNull String str2, @NonNull String str3) {
        if (str == null) {
            return new AFe1xSDK(aFb1iSDK.AFKeystoreWrapper == AFf1vSDK.DEFAULT, AFf1ySDK.NA);
        }
        String string = "";
        Object[] objArr = new Object[1];
        AFKeystoreWrapper((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), "\ue008騒ᆭ愬", "螲\uf7a5搕茗", TextUtils.getTrimmedLength(""), "闟\ue26bͤ㠻펁個Ꟁ菃뛩\ueb19遧\u05fd葒ﷴ篏쥐ᑾ㸝硟枾䎟횰۱鐝뵿廌契\ude87芌Ĳ⚕\uf1b0❴嫬濌뙥\uecbf托캜끹랯ᔶᣣ폖밀솔\u038d쫖鬇ው꡶㥆俾쁪怮厁燲ံꋝ쳿ᚥ䘈㎂ֵ", objArr);
        String strIntern = ((String) objArr[0]).intern();
        if (aFb1iSDK.AFKeystoreWrapper == AFf1vSDK.CUSTOM) {
            string = new StringBuilder(str2).reverse().toString();
        } else {
            str3 = strIntern;
        }
        boolean zEquals = AFInAppEventParameterName(new StringBuilder(str3).reverse().toString(), aFb1iSDK.values, "android", "v1", string).equals(str);
        return new AFe1xSDK(zEquals, zEquals ? AFf1ySDK.SUCCESS : AFf1ySDK.FAILURE);
    }

    public static void valueOf() {
        AFInAppEventType = 0;
        AFKeystoreWrapper = (char) 0;
        AFInAppEventParameterName = -9000615284764735566L;
    }

    @NonNull
    public final AFe1xSDK AFInAppEventType(@NonNull AFb1iSDK aFb1iSDK, @Nullable String str, @NonNull String str2, @NonNull String str3) {
        if (aFb1iSDK != null && str2 != null) {
            int i = valueOf;
            int i4 = i + 49;
            values = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            if (str3 != null) {
                values = (i + 83) % 128;
                return AFKeystoreWrapper(aFb1iSDK, str, str2, str3);
            }
        }
        return new AFe1xSDK(false, AFf1ySDK.INTERNAL_ERROR);
    }

    private static void AFKeystoreWrapper(char c, String str, String str2, int i, String str3, Object[] objArr) {
        String str4;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str2;
        if (str2 != null) {
            charArray2 = str2.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str;
        if (str != null) {
            charArray3 = str.toCharArray();
        }
        char[] cArr3 = (char[]) charArray3;
        synchronized (AFf1bSDK.valueOf) {
            try {
                char[] cArr4 = (char[]) cArr3.clone();
                char[] cArr5 = (char[]) cArr2.clone();
                cArr4[0] = (char) (c ^ cArr4[0]);
                cArr5[2] = (char) (cArr5[2] + ((char) i));
                int length = cArr.length;
                char[] cArr6 = new char[length];
                AFf1bSDK.AFInAppEventType = 0;
                while (true) {
                    int i4 = AFf1bSDK.AFInAppEventType;
                    if (i4 < length) {
                        int i6 = (i4 + 2) % 4;
                        int i10 = (i4 + 3) % 4;
                        int i11 = cArr4[i4 % 4] * 32718;
                        char c10 = cArr5[i6];
                        char c11 = (char) ((i11 + c10) % 65535);
                        AFf1bSDK.AFInAppEventParameterName = c11;
                        cArr5[i10] = (char) (((cArr4[i10] * 32718) + c10) / 65535);
                        cArr4[i10] = c11;
                        int i12 = AFf1bSDK.AFInAppEventType;
                        cArr6[i12] = (char) (((((long) (c11 ^ cArr[i12])) ^ AFInAppEventParameterName) ^ ((long) AFInAppEventType)) ^ ((long) AFKeystoreWrapper));
                        AFf1bSDK.AFInAppEventType = i12 + 1;
                    } else {
                        str4 = new String(cArr6);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        objArr[0] = str4;
    }
}
