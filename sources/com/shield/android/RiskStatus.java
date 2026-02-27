package com.shield.android;

import android.util.SparseArray;
import com.paymaya.common.utility.AbstractC1213b;
import java.util.EnumSet;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class RiskStatus {
    public static final RiskStatus ALLOW;
    public static final RiskStatus BLOCK;
    public static final RiskStatus REVIEW;
    public static final RiskStatus SUSPEND;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f14966d = {1201282564, 763294349, 250009898, -1523402064, 747071212, -497032232, 1887971986, 1861284397};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final SparseArray<RiskStatus> f14967t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final /* synthetic */ RiskStatus[] f14968v;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final int f14969u;

    static {
        String strF = f("迧迫迨迪迵");
        long[] jArr = f14966d;
        RiskStatus riskStatus = new RiskStatus(strF, ((int) jArr[0]) ^ 1201282564, ((int) jArr[1]) ^ 763294348);
        ALLOW = riskStatus;
        String strF2 = f("迴迢迲迬迧迴");
        long[] jArr2 = f14966d;
        RiskStatus riskStatus2 = new RiskStatus(strF2, ((int) jArr2[1]) ^ 763294348, ((int) jArr2[2]) ^ 250009896);
        REVIEW = riskStatus2;
        String strF3 = f("迤迫迫迦迩");
        long[] jArr3 = f14966d;
        RiskStatus riskStatus3 = new RiskStatus(strF3, ((int) jArr3[2]) ^ 250009896, ((int) jArr3[3]) ^ 1523402061);
        BLOCK = riskStatus3;
        String strF4 = f("迵迲迷迵迧迭迤");
        long[] jArr4 = f14966d;
        RiskStatus riskStatus4 = new RiskStatus(strF4, ((int) jArr4[4]) ^ 747071215, ((int) jArr4[5]) ^ 497032228);
        SUSPEND = riskStatus4;
        RiskStatus[] riskStatusArr = new RiskStatus[4];
        long[] jArr5 = f14966d;
        riskStatusArr[((int) jArr5[0]) ^ 1201282564] = riskStatus;
        riskStatusArr[((int) jArr5[1]) ^ 763294348] = riskStatus2;
        riskStatusArr[((int) jArr5[2]) ^ 250009896] = riskStatus3;
        riskStatusArr[((int) jArr5[4]) ^ 747071215] = riskStatus4;
        f14968v = riskStatusArr;
        f14967t = new SparseArray<>();
        for (RiskStatus riskStatus5 : EnumSet.allOf(RiskStatus.class)) {
            f14967t.put(riskStatus5.getCode(), riskStatus5);
        }
    }

    private RiskStatus(String str, int i, int i4) {
        this.f14969u = i4;
    }

    public static String f(String str) {
        StringBuilder sb2 = new StringBuilder();
        int i = ((int) f14966d[0]) ^ 1201282564;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            long[] jArr = f14966d;
            long j = jArr[6];
            long j6 = jArr[1];
            int i4 = ~cCharAt;
            int i6 = (((int) j) ^ 1888003380) + cCharAt;
            sb2.append((char) (AbstractC1213b.G((cCharAt + (((int) j) ^ 1888003380)) + (((int) j6) ^ 763294348), (~(((int) j) ^ 1888003380)) | i4, i6, (((((int) j) ^ 1888003380) + cCharAt) + (((int) j6) ^ 763294348)) + ((~(((int) j) ^ 1888003380)) | i4)) ^ (i % (((int) jArr[7]) ^ 1861225938))));
            long j7 = f14966d[1];
            int i10 = ~i;
            i = i + (((int) j7) ^ 763294348) + (((int) j7) ^ 763294348) + ((~(((int) j7) ^ 763294348)) | i10) + (((((int) j7) ^ 763294348) + i) - ((((((int) j7) ^ 763294348) + i) + (((int) j7) ^ 763294348)) + ((~(((int) j7) ^ 763294348)) | i10)));
        }
        return sb2.toString();
    }

    public static RiskStatus get(int i) {
        return f14967t.get(i);
    }

    public static RiskStatus valueOf(String str) {
        return (RiskStatus) Enum.valueOf(RiskStatus.class, str);
    }

    public static RiskStatus[] values() {
        return (RiskStatus[]) f14968v.clone();
    }

    public final int getCode() {
        return this.f14969u;
    }
}
