package com.shield.android;

import android.util.SparseArray;
import com.paymaya.common.utility.AbstractC1213b;
import java.util.EnumSet;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class ScreenResult {
    public static final ScreenResult ALLOW;
    public static final ScreenResult BLOCK;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f14970d = {705269690, 885162885, 2095795031, 712110623, 2005084188, 1537917904};

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final SparseArray<ScreenResult> f14971w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final /* synthetic */ ScreenResult[] f14972y;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final int f14973x;

    static {
        String strD = d("\udc7c湒㝃鯈䶔");
        long[] jArr = f14970d;
        ScreenResult screenResult = new ScreenResult(strD, ((int) jArr[0]) ^ 705269690, ((int) jArr[1]) ^ 885162884);
        ALLOW = screenResult;
        ScreenResult screenResult2 = new ScreenResult(d("\udc7f湒㝀鯄䶈"), ((int) f14970d[1]) ^ 885162884, -1);
        BLOCK = screenResult2;
        long[] jArr2 = f14970d;
        ScreenResult[] screenResultArr = new ScreenResult[((int) jArr2[2]) ^ 2095795029];
        screenResultArr[((int) jArr2[0]) ^ 705269690] = screenResult;
        screenResultArr[((int) jArr2[1]) ^ 885162884] = screenResult2;
        f14972y = screenResultArr;
        f14971w = new SparseArray<>();
        for (ScreenResult screenResult3 : EnumSet.allOf(ScreenResult.class)) {
            f14971w.put(screenResult3.getCode(), screenResult3);
        }
    }

    private ScreenResult(String str, int i, int i4) {
        this.f14973x = i4;
    }

    public static String d(String str) {
        int i = ((int) f14970d[3]) ^ 712067684;
        StringBuilder sb2 = new StringBuilder();
        int i4 = ((int) f14970d[0]) ^ 705269690;
        while (i4 < str.length()) {
            long[] jArr = f14970d;
            int i6 = (((i >> (((int) jArr[0]) ^ 705269690)) ^ (i >> (((int) jArr[2]) ^ 2095795029))) ^ (i >> (((int) jArr[4]) ^ 2005084191))) ^ (i >> 5);
            long j = jArr[1];
            i = (char) ((i >> (((int) j) ^ 885162884)) | (((char) (i6 & (((int) j) ^ 885162884))) << (((int) jArr[5]) ^ 1537917919)));
            char cCharAt = str.charAt(i4);
            int i10 = cCharAt + i;
            long j6 = f14970d[1];
            int i11 = (~cCharAt) | (~i);
            sb2.append((char) AbstractC1213b.H(i10, ((int) j6) ^ 885162884, i11, i10, (((int) j6) ^ 885162884) + i10 + i11));
            long j7 = f14970d[1];
            int i12 = ~i4;
            i4 = i4 + (((int) j7) ^ 885162884) + (((int) j7) ^ 885162884) + ((~(((int) j7) ^ 885162884)) | i12) + (((((int) j7) ^ 885162884) + i4) - ((((((int) j7) ^ 885162884) + i4) + (((int) j7) ^ 885162884)) + ((~(((int) j7) ^ 885162884)) | i12)));
        }
        return sb2.toString();
    }

    public static ScreenResult get(int i) {
        return f14971w.get(i);
    }

    public static ScreenResult valueOf(String str) {
        return (ScreenResult) Enum.valueOf(ScreenResult.class, str);
    }

    public static ScreenResult[] values() {
        return (ScreenResult[]) f14972y.clone();
    }

    public final int getCode() {
        return this.f14973x;
    }
}
