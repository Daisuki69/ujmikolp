package com.shield.android.internal;

import android.os.Build;
import com.paymaya.common.utility.AbstractC1213b;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15418d = {1888339047, 160603541, 373876109, 1767308434, 1205705244, 318776721, 1992129071, 1869110525};

    /* JADX INFO: renamed from: gd, reason: collision with root package name */
    public static final g f15419gd = new g();
    private static long ge;

    /* JADX INFO: renamed from: gf, reason: collision with root package name */
    private static long f15420gf;

    /* JADX INFO: renamed from: gg, reason: collision with root package name */
    private static long f15421gg;

    /* JADX INFO: renamed from: gh, reason: collision with root package name */
    private static long f15422gh;

    /* JADX INFO: renamed from: gi, reason: collision with root package name */
    private static long f15423gi;

    /* JADX INFO: renamed from: gj, reason: collision with root package name */
    private static long f15424gj;

    /* JADX INFO: renamed from: gk, reason: collision with root package name */
    private static boolean f15425gk;

    private g() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void bK() {
        String strD = d("错䫿┬鋒䤲ꒆ툹\ue943瓦㨩鴊컹本㏝ᦱಁ蘕䍓⇳郡䠗ꑆ剻⥧ᓣ診앾拲ㄤ飅䰱♂鍸짣\ue4b6爖뤟峬긴坒");
        String strD2 = d("错䫿┬鋒䤲ꒆ툹\ue943瓦㨩鴊컹本㏝ᦱಁ蘕䍓⇳郡䠔ꑖ剫⥥ᓧ訯앾拲ㄤ飅䰱♂鍸짣\ue4b6爖뤟峬긴坒");
        long[] jArr = f15418d;
        String[] strArr = new String[((int) jArr[0]) ^ 1888339045];
        int i = ((int) jArr[1]) ^ 160603541;
        strArr[i] = strD;
        strArr[((int) jArr[2]) ^ 373876108] = strD2;
        while (true) {
            long[] jArr2 = f15418d;
            if (i >= (((int) jArr2[0]) ^ 1888339045)) {
                f15425gk = ((int) jArr2[2]) ^ 373876108;
                return;
            }
            String str = strArr[i];
            try {
                File file = new File(str);
                if (file.exists()) {
                    int i4 = Build.VERSION.SDK_INT;
                    long[] jArr3 = f15418d;
                    if (i4 >= (((int) jArr3[3]) ^ 1767308424)) {
                        BasicFileAttributes attributes = Files.readAttributes(Paths.get(str, new String[((int) jArr3[1]) ^ 160603541]), (Class<BasicFileAttributes>) j.h(), new LinkOption[((int) f15418d[1]) ^ 160603541]);
                        if (i == 0) {
                            ge = attributes.lastModifiedTime().toMillis() / (f15418d[4] ^ 1205705204);
                            f15420gf = attributes.lastAccessTime().toMillis() / (f15418d[4] ^ 1205705204);
                            f15421gg = attributes.creationTime().toMillis() / (f15418d[4] ^ 1205705204);
                        } else {
                            f15422gh = attributes.lastModifiedTime().toMillis() / (f15418d[4] ^ 1205705204);
                            f15423gi = attributes.lastAccessTime().toMillis() / (f15418d[4] ^ 1205705204);
                            f15424gj = attributes.creationTime().toMillis() / (f15418d[4] ^ 1205705204);
                        }
                    } else {
                        long jLastModified = file.lastModified() / (f15418d[4] ^ 1205705204);
                        if (i == 0) {
                            ge = jLastModified;
                            f15420gf = jLastModified;
                            f15421gg = jLastModified;
                        } else {
                            f15422gh = jLastModified;
                            f15423gi = jLastModified;
                            f15424gj = jLastModified;
                        }
                    }
                }
            } catch (Exception unused) {
            }
            int i6 = ((int) f15418d[2]) ^ 373876108;
            int i10 = i + i6;
            int i11 = i10 + i6 + ((~i6) | (~i));
            i = (i10 - i11) + i11;
        }
    }

    public static String d(String str) {
        int i = ((int) f15418d[5]) ^ 318771197;
        StringBuilder sb2 = new StringBuilder();
        int i4 = ((int) f15418d[1]) ^ 160603541;
        while (i4 < str.length()) {
            long[] jArr = f15418d;
            int i6 = (((i >> (((int) jArr[1]) ^ 160603541)) ^ (i >> (((int) jArr[0]) ^ 1888339045))) ^ (i >> (((int) jArr[6]) ^ 1992129068))) ^ (i >> 5);
            long j = jArr[2];
            i = (char) ((i >> (((int) j) ^ 373876108)) | (((char) (i6 & (((int) j) ^ 373876108))) << (((int) jArr[7]) ^ 1869110514)));
            char cCharAt = str.charAt(i4);
            int i10 = cCharAt + i;
            long j6 = f15418d[2];
            int i11 = (~cCharAt) | (~i);
            sb2.append((char) AbstractC1213b.H(i10, ((int) j6) ^ 373876108, i11, i10, (((int) j6) ^ 373876108) + i10 + i11));
            long j7 = f15418d[2];
            int i12 = ~i4;
            i4 = i4 + (((int) j7) ^ 373876108) + (((int) j7) ^ 373876108) + ((~(((int) j7) ^ 373876108)) | i12) + (((((int) j7) ^ 373876108) + i4) - ((((((int) j7) ^ 373876108) + i4) + (((int) j7) ^ 373876108)) + ((~(((int) j7) ^ 373876108)) | i12)));
        }
        return sb2.toString();
    }

    public final long bL() {
        if (!f15425gk) {
            bK();
        }
        return ge;
    }

    public final long bM() {
        if (!f15425gk) {
            bK();
        }
        return f15420gf;
    }

    public final long bN() {
        if (!f15425gk) {
            bK();
        }
        return f15421gg;
    }

    public final long bO() {
        if (!f15425gk) {
            bK();
        }
        return f15422gh;
    }

    public final long bP() {
        if (!f15425gk) {
            bK();
        }
        return f15423gi;
    }

    public final long bQ() {
        if (!f15425gk) {
            bK();
        }
        return f15424gj;
    }
}
