package com.shield.android;

import com.paymaya.common.utility.AbstractC1213b;

/* JADX INFO: loaded from: classes4.dex */
public final class ShieldCrossPlatformHelper {

    /* JADX INFO: renamed from: bd, reason: collision with root package name */
    private static ShieldCrossPlatformParams f15006bd;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15007d = {212676086, 1620773612, 1023486431};
    public static final ShieldCrossPlatformHelper INSTANCE = new ShieldCrossPlatformHelper();

    private ShieldCrossPlatformHelper() {
    }

    public static String g(String str) {
        StringBuilder sb2 = new StringBuilder();
        int i = ((int) f15007d[0]) ^ 212676086;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            long[] jArr = f15007d;
            long j = jArr[1];
            long j6 = jArr[2];
            int i4 = ~cCharAt;
            int i6 = (((int) j) ^ 1620810138) + cCharAt;
            sb2.append((char) AbstractC1213b.G(cCharAt + (((int) j) ^ 1620810138) + (((int) j6) ^ 1023486430), i4 | (~(((int) j) ^ 1620810138)), i6, (((int) j) ^ 1620810138) + cCharAt + (((int) j6) ^ 1023486430) + ((~(((int) j) ^ 1620810138)) | i4)));
            long j7 = f15007d[2];
            int i10 = ~i;
            i = i + (((int) j7) ^ 1023486430) + (((int) j7) ^ 1023486430) + ((~(((int) j7) ^ 1023486430)) | i10) + (((((int) j7) ^ 1023486430) + i) - ((((((int) j7) ^ 1023486430) + i) + (((int) j7) ^ 1023486430)) + ((~(((int) j7) ^ 1023486430)) | i10)));
        }
        return sb2.toString();
    }

    public static final ShieldCrossPlatformParams getCrossPlatformParameters() {
        ShieldCrossPlatformParams shieldCrossPlatformParams = f15006bd;
        if (shieldCrossPlatformParams == null) {
            return null;
        }
        if (shieldCrossPlatformParams != null) {
            return shieldCrossPlatformParams;
        }
        kotlin.jvm.internal.j.n(g("錕錄錙錅錅錦錚錗錂錐錙錄錛錦錗錄錗錛錅"));
        throw null;
    }

    public static final void setCrossPlatformParameters(ShieldCrossPlatformParams shieldCrossPlatformParams) {
        kotlin.jvm.internal.j.g(shieldCrossPlatformParams, g("錕錄錙錅錅錦錚錗錂錐錙錄錛錦錗錄錗錛錅"));
        f15006bd = shieldCrossPlatformParams;
    }
}
