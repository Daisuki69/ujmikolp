package com.shield.android.e;

import com.paymaya.common.utility.AbstractC1213b;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15260d = {633427997, 812645824, 1249516641, 356070349, 1330020769, 492226555, 389641282, 147991557, 356743162, 801377229, 1695711462, 541369077, 1965171751, 962328899, 842302359, 2067699550, 1253524754, 392284322, 1856716453, 876751909, 1138507074, 1107965880, 2000078216, 706308627, 1037524628, 1618012294, 852275475, 1222536046, 69699551, 406456515, 1862326963, 60315853, 864224582, 1993755645, 1108598601, 1690003583, 1940309336, 930456360};

    /* JADX INFO: renamed from: hk, reason: collision with root package name */
    private static final char[] f15261hk;
    private static final char[] hl;

    static {
        char[] cArr = new char[((int) 356070349) ^ 356070365];
        cArr[((int) 812645824) ^ 812645824] = ((int) 1330020769) ^ 33169;
        cArr[((int) 633427997) ^ 633427996] = ((int) 492226555) ^ 51146;
        cArr[((int) 389641282) ^ 389641280] = ((int) 147991557) ^ 11319;
        cArr[((int) 356743162) ^ 356743161] = ((int) 801377229) ^ 3070;
        cArr[4] = ((int) 1695711462) ^ 32978;
        cArr[5] = ((int) 541369077) ^ 41664;
        cArr[((int) 1965171751) ^ 1965171745] = ((int) 962328899) ^ 63861;
        cArr[((int) 842302359) ^ 842302352] = ((int) 2067699550) ^ 38761;
        cArr[((int) 1253524754) ^ 1253524762] = ((int) 392284322) ^ 51354;
        cArr[((int) 1856716453) ^ 1856716460] = ((int) 876751909) ^ 11292;
        cArr[((int) 1138507074) ^ 1138507080] = ((int) 1107965880) ^ 14297;
        cArr[((int) 2000078216) ^ 2000078211] = ((int) 706308627) ^ 27249;
        cArr[((int) 1037524628) ^ 1037524632] = ((int) 1618012294) ^ 59621;
        cArr[((int) 852275475) ^ 852275486] = ((int) 1222536046) ^ 27402;
        cArr[((int) 69699551) ^ 69699537] = ((int) 406456515) ^ 2214;
        cArr[((int) 1249516641) ^ 1249516654] = ((int) 1862326963) ^ 56021;
        f15261hk = cArr;
        char[] cArr2 = new char[((int) 356070349) ^ 356070365];
        cArr2[((int) 812645824) ^ 812645824] = ((int) 1330020769) ^ 33169;
        cArr2[((int) 633427997) ^ 633427996] = ((int) 492226555) ^ 51146;
        cArr2[((int) 389641282) ^ 389641280] = ((int) 147991557) ^ 11319;
        cArr2[((int) 356743162) ^ 356743161] = ((int) 801377229) ^ 3070;
        cArr2[4] = ((int) 1695711462) ^ 32978;
        cArr2[5] = ((int) 541369077) ^ 41664;
        cArr2[((int) 1965171751) ^ 1965171745] = ((int) 962328899) ^ 63861;
        cArr2[((int) 842302359) ^ 842302352] = ((int) 2067699550) ^ 38761;
        cArr2[((int) 1253524754) ^ 1253524762] = ((int) 392284322) ^ 51354;
        cArr2[((int) 1856716453) ^ 1856716460] = ((int) 876751909) ^ 11292;
        cArr2[((int) 1138507074) ^ 1138507080] = ((int) 60315853) ^ 22668;
        cArr2[((int) 2000078216) ^ 2000078211] = ((int) 864224582) ^ 1284;
        cArr2[((int) 1037524628) ^ 1037524632] = ((int) 1993755645) ^ 19390;
        cArr2[((int) 852275475) ^ 852275486] = ((int) 1108598601) ^ 57101;
        cArr2[((int) 69699551) ^ 69699537] = ((int) 1690003583) ^ 26682;
        cArr2[((int) 1249516641) ^ 1249516654] = ((int) 1940309336) ^ 50462;
        hl = cArr2;
    }

    private static String a(byte[] bArr, boolean z4, ByteOrder byteOrder) {
        int length = bArr.length;
        long[] jArr = f15260d;
        char[] cArr = new char[length << (((int) jArr[0]) ^ 633427996)];
        char[] cArr2 = f15261hk;
        int i = ((int) jArr[1]) ^ 812645824;
        while (i < bArr.length) {
            int length2 = byteOrder == ByteOrder.BIG_ENDIAN ? i : (bArr.length - i) - (((int) f15260d[0]) ^ 633427996);
            long[] jArr2 = f15260d;
            long j = jArr2[0];
            byte b8 = bArr[length2];
            long j6 = jArr2[2];
            cArr[i << (((int) j) ^ 633427996)] = cArr2[(((int) j6) ^ 1249516654) & (b8 >> 4)];
            cArr[(i << (((int) j) ^ 633427996)) + (((int) j) ^ 633427996)] = cArr2[b8 & (((int) j6) ^ 1249516654)];
            int i4 = ~i;
            i = i + (((int) j) ^ 633427996) + (((int) j) ^ 633427996) + ((~(((int) j) ^ 633427996)) | i4) + (((((int) j) ^ 633427996) + i) - ((((((int) j) ^ 633427996) + i) + (((int) j) ^ 633427996)) + ((~(((int) j) ^ 633427996)) | i4)));
        }
        return new String(cArr);
    }

    public static String b(String str, String str2) throws GeneralSecurityException {
        SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), g("䫗䫲䫾䫼䫌䫗䫞䪭䪪䪩"));
        Mac mac = Mac.getInstance(g("䫗䫲䫾䫼䫌䫗䫞䪭䪪䪩"));
        mac.init(secretKeySpec);
        return c(mac.doFinal(str.getBytes()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String c(byte[] bArr) {
        return a(bArr, ((int) f15260d[1]) ^ 812645824, ByteOrder.BIG_ENDIAN);
    }

    public static String g(String str) {
        StringBuilder sb2 = new StringBuilder();
        int i = ((int) f15260d[1]) ^ 812645824;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            long[] jArr = f15260d;
            long j = jArr[37];
            long j6 = jArr[0];
            int i4 = ~cCharAt;
            int i6 = (((int) j) ^ 930474423) + cCharAt;
            sb2.append((char) AbstractC1213b.G(cCharAt + (((int) j) ^ 930474423) + (((int) j6) ^ 633427996), i4 | (~(((int) j) ^ 930474423)), i6, (((int) j) ^ 930474423) + cCharAt + (((int) j6) ^ 633427996) + ((~(((int) j) ^ 930474423)) | i4)));
            long j7 = f15260d[0];
            int i10 = ~i;
            i = i + (((int) j7) ^ 633427996) + (((int) j7) ^ 633427996) + ((~(((int) j7) ^ 633427996)) | i10) + (((((int) j7) ^ 633427996) + i) - ((((((int) j7) ^ 633427996) + i) + (((int) j7) ^ 633427996)) + ((~(((int) j7) ^ 633427996)) | i10)));
        }
        return sb2.toString();
    }
}
