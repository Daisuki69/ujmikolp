package io.split.android.client.service.sseclient.notifications;

import Xh.i;
import a.AbstractC0617a;
import io.split.android.client.exceptions.MySegmentsParsingException;
import io.split.android.client.service.sseclient.notifications.KeyList;
import io.split.android.client.utils.a;
import java.math.BigInteger;
import java.util.HashSet;
import p3.C2011b;

/* JADX INFO: loaded from: classes4.dex */
public class MySegmentsV2PayloadDecoder {
    public final int FIELD_SIZE = 8;

    public int computeKeyIndex(BigInteger bigInteger, int i) {
        return bigInteger.remainder(BigInteger.valueOf(i * 8)).intValue();
    }

    public byte[] decodeAsBytes(String str, a aVar) throws MySegmentsParsingException {
        byte[] bArrD = i.d(str);
        if (bArrD == null) {
            throw new MySegmentsParsingException("Could not decode payload");
        }
        byte[] bArrA = aVar.a(bArrD);
        if (bArrA != null) {
            return bArrA;
        }
        throw new MySegmentsParsingException("Could not decompress payload");
    }

    public String decodeAsString(String str, a aVar) throws MySegmentsParsingException {
        byte[] bArrDecodeAsBytes = decodeAsBytes(str, aVar);
        return new String(bArrDecodeAsBytes, 0, bArrDecodeAsBytes.length, C2011b.b());
    }

    public KeyList.Action getKeyListAction(KeyList keyList, BigInteger bigInteger) {
        return new HashSet(keyList.getAdded()).contains(bigInteger) ? KeyList.Action.ADD : new HashSet(keyList.getRemoved()).contains(bigInteger) ? KeyList.Action.REMOVE : KeyList.Action.NONE;
    }

    public BigInteger hashKey(String str) {
        char c;
        char c10;
        byte[] bytes = str.getBytes(C2011b.b());
        int length = bytes.length;
        int i = length >> 4;
        long j = 0;
        long jRotateLeft = 0;
        long jRotateLeft2 = 0;
        int i4 = 0;
        while (i4 < i) {
            int i6 = i4 << 4;
            long jZ = AbstractC0617a.z(i6, bytes);
            long jZ2 = AbstractC0617a.z(i6 + 8, bytes);
            long jRotateLeft3 = ((Long.rotateLeft((Long.rotateLeft(jZ * (-8663945395140668459L), 31) * 5545529020109919103L) ^ jRotateLeft, 27) + jRotateLeft2) * 5) + 1390208809;
            jRotateLeft2 = ((Long.rotateLeft((Long.rotateLeft(jZ2 * 5545529020109919103L, 33) * (-8663945395140668459L)) ^ jRotateLeft2, 31) + jRotateLeft3) * 5) + 944331445;
            i4++;
            jRotateLeft = jRotateLeft3;
            bytes = bytes;
        }
        byte[] bArr = bytes;
        int i10 = i << 4;
        switch (length - i10) {
            case 2:
                j ^= (((long) bArr[i10 + 1]) & 255) << 8;
            case 1:
                jRotateLeft ^= Long.rotateLeft((((long) (bArr[i10] & 255)) ^ j) * (-8663945395140668459L), 31) * 5545529020109919103L;
                break;
            case 3:
                c = 16;
                j ^= (((long) bArr[i10 + 2]) & 255) << c;
                j ^= (((long) bArr[i10 + 1]) & 255) << 8;
                jRotateLeft ^= Long.rotateLeft((((long) (bArr[i10] & 255)) ^ j) * (-8663945395140668459L), 31) * 5545529020109919103L;
                break;
            case 4:
                c = 16;
                c10 = 24;
                j ^= (((long) bArr[i10 + 3]) & 255) << c10;
                j ^= (((long) bArr[i10 + 2]) & 255) << c;
                j ^= (((long) bArr[i10 + 1]) & 255) << 8;
                jRotateLeft ^= Long.rotateLeft((((long) (bArr[i10] & 255)) ^ j) * (-8663945395140668459L), 31) * 5545529020109919103L;
                break;
            case 5:
                c = 16;
                c10 = 24;
                j ^= (((long) bArr[i10 + 4]) & 255) << 32;
                j ^= (((long) bArr[i10 + 3]) & 255) << c10;
                j ^= (((long) bArr[i10 + 2]) & 255) << c;
                j ^= (((long) bArr[i10 + 1]) & 255) << 8;
                jRotateLeft ^= Long.rotateLeft((((long) (bArr[i10] & 255)) ^ j) * (-8663945395140668459L), 31) * 5545529020109919103L;
                break;
            case 6:
                c = 16;
                c10 = 24;
                j ^= (((long) bArr[i10 + 5]) & 255) << 40;
                j ^= (((long) bArr[i10 + 4]) & 255) << 32;
                j ^= (((long) bArr[i10 + 3]) & 255) << c10;
                j ^= (((long) bArr[i10 + 2]) & 255) << c;
                j ^= (((long) bArr[i10 + 1]) & 255) << 8;
                jRotateLeft ^= Long.rotateLeft((((long) (bArr[i10] & 255)) ^ j) * (-8663945395140668459L), 31) * 5545529020109919103L;
                break;
            case 7:
                c = 16;
                c10 = 24;
                j ^= (((long) bArr[i10 + 6]) & 255) << 48;
                j ^= (((long) bArr[i10 + 5]) & 255) << 40;
                j ^= (((long) bArr[i10 + 4]) & 255) << 32;
                j ^= (((long) bArr[i10 + 3]) & 255) << c10;
                j ^= (((long) bArr[i10 + 2]) & 255) << c;
                j ^= (((long) bArr[i10 + 1]) & 255) << 8;
                jRotateLeft ^= Long.rotateLeft((((long) (bArr[i10] & 255)) ^ j) * (-8663945395140668459L), 31) * 5545529020109919103L;
                break;
            case 8:
                c = 16;
                c10 = 24;
                j = (((long) bArr[i10 + 7]) & 255) << 56;
                j ^= (((long) bArr[i10 + 6]) & 255) << 48;
                j ^= (((long) bArr[i10 + 5]) & 255) << 40;
                j ^= (((long) bArr[i10 + 4]) & 255) << 32;
                j ^= (((long) bArr[i10 + 3]) & 255) << c10;
                j ^= (((long) bArr[i10 + 2]) & 255) << c;
                j ^= (((long) bArr[i10 + 1]) & 255) << 8;
                jRotateLeft ^= Long.rotateLeft((((long) (bArr[i10] & 255)) ^ j) * (-8663945395140668459L), 31) * 5545529020109919103L;
                break;
            case 9:
                c = 16;
                c10 = 24;
                jRotateLeft2 ^= Long.rotateLeft((((long) (bArr[i10 + 8] & 255)) ^ j) * 5545529020109919103L, 33) * (-8663945395140668459L);
                j = (((long) bArr[i10 + 7]) & 255) << 56;
                j ^= (((long) bArr[i10 + 6]) & 255) << 48;
                j ^= (((long) bArr[i10 + 5]) & 255) << 40;
                j ^= (((long) bArr[i10 + 4]) & 255) << 32;
                j ^= (((long) bArr[i10 + 3]) & 255) << c10;
                j ^= (((long) bArr[i10 + 2]) & 255) << c;
                j ^= (((long) bArr[i10 + 1]) & 255) << 8;
                jRotateLeft ^= Long.rotateLeft((((long) (bArr[i10] & 255)) ^ j) * (-8663945395140668459L), 31) * 5545529020109919103L;
                break;
            case 10:
                c = 16;
                c10 = 24;
                j ^= (((long) bArr[i10 + 9]) & 255) << 8;
                jRotateLeft2 ^= Long.rotateLeft((((long) (bArr[i10 + 8] & 255)) ^ j) * 5545529020109919103L, 33) * (-8663945395140668459L);
                j = (((long) bArr[i10 + 7]) & 255) << 56;
                j ^= (((long) bArr[i10 + 6]) & 255) << 48;
                j ^= (((long) bArr[i10 + 5]) & 255) << 40;
                j ^= (((long) bArr[i10 + 4]) & 255) << 32;
                j ^= (((long) bArr[i10 + 3]) & 255) << c10;
                j ^= (((long) bArr[i10 + 2]) & 255) << c;
                j ^= (((long) bArr[i10 + 1]) & 255) << 8;
                jRotateLeft ^= Long.rotateLeft((((long) (bArr[i10] & 255)) ^ j) * (-8663945395140668459L), 31) * 5545529020109919103L;
                break;
            case 11:
                c = 16;
                c10 = 24;
                j ^= (((long) bArr[i10 + 10]) & 255) << c;
                j ^= (((long) bArr[i10 + 9]) & 255) << 8;
                jRotateLeft2 ^= Long.rotateLeft((((long) (bArr[i10 + 8] & 255)) ^ j) * 5545529020109919103L, 33) * (-8663945395140668459L);
                j = (((long) bArr[i10 + 7]) & 255) << 56;
                j ^= (((long) bArr[i10 + 6]) & 255) << 48;
                j ^= (((long) bArr[i10 + 5]) & 255) << 40;
                j ^= (((long) bArr[i10 + 4]) & 255) << 32;
                j ^= (((long) bArr[i10 + 3]) & 255) << c10;
                j ^= (((long) bArr[i10 + 2]) & 255) << c;
                j ^= (((long) bArr[i10 + 1]) & 255) << 8;
                jRotateLeft ^= Long.rotateLeft((((long) (bArr[i10] & 255)) ^ j) * (-8663945395140668459L), 31) * 5545529020109919103L;
                break;
            case 12:
                c = 16;
                c10 = 24;
                j ^= (((long) bArr[i10 + 11]) & 255) << c10;
                j ^= (((long) bArr[i10 + 10]) & 255) << c;
                j ^= (((long) bArr[i10 + 9]) & 255) << 8;
                jRotateLeft2 ^= Long.rotateLeft((((long) (bArr[i10 + 8] & 255)) ^ j) * 5545529020109919103L, 33) * (-8663945395140668459L);
                j = (((long) bArr[i10 + 7]) & 255) << 56;
                j ^= (((long) bArr[i10 + 6]) & 255) << 48;
                j ^= (((long) bArr[i10 + 5]) & 255) << 40;
                j ^= (((long) bArr[i10 + 4]) & 255) << 32;
                j ^= (((long) bArr[i10 + 3]) & 255) << c10;
                j ^= (((long) bArr[i10 + 2]) & 255) << c;
                j ^= (((long) bArr[i10 + 1]) & 255) << 8;
                jRotateLeft ^= Long.rotateLeft((((long) (bArr[i10] & 255)) ^ j) * (-8663945395140668459L), 31) * 5545529020109919103L;
                break;
            case 13:
                c = 16;
                c10 = 24;
                j ^= (((long) bArr[i10 + 12]) & 255) << 32;
                j ^= (((long) bArr[i10 + 11]) & 255) << c10;
                j ^= (((long) bArr[i10 + 10]) & 255) << c;
                j ^= (((long) bArr[i10 + 9]) & 255) << 8;
                jRotateLeft2 ^= Long.rotateLeft((((long) (bArr[i10 + 8] & 255)) ^ j) * 5545529020109919103L, 33) * (-8663945395140668459L);
                j = (((long) bArr[i10 + 7]) & 255) << 56;
                j ^= (((long) bArr[i10 + 6]) & 255) << 48;
                j ^= (((long) bArr[i10 + 5]) & 255) << 40;
                j ^= (((long) bArr[i10 + 4]) & 255) << 32;
                j ^= (((long) bArr[i10 + 3]) & 255) << c10;
                j ^= (((long) bArr[i10 + 2]) & 255) << c;
                j ^= (((long) bArr[i10 + 1]) & 255) << 8;
                jRotateLeft ^= Long.rotateLeft((((long) (bArr[i10] & 255)) ^ j) * (-8663945395140668459L), 31) * 5545529020109919103L;
                break;
            case 15:
                j = (((long) bArr[i10 + 14]) & 255) << 48;
            case 14:
                c = 16;
                c10 = 24;
                j ^= (((long) bArr[i10 + 13]) & 255) << 40;
                j ^= (((long) bArr[i10 + 12]) & 255) << 32;
                j ^= (((long) bArr[i10 + 11]) & 255) << c10;
                j ^= (((long) bArr[i10 + 10]) & 255) << c;
                j ^= (((long) bArr[i10 + 9]) & 255) << 8;
                jRotateLeft2 ^= Long.rotateLeft((((long) (bArr[i10 + 8] & 255)) ^ j) * 5545529020109919103L, 33) * (-8663945395140668459L);
                j = (((long) bArr[i10 + 7]) & 255) << 56;
                j ^= (((long) bArr[i10 + 6]) & 255) << 48;
                j ^= (((long) bArr[i10 + 5]) & 255) << 40;
                j ^= (((long) bArr[i10 + 4]) & 255) << 32;
                j ^= (((long) bArr[i10 + 3]) & 255) << c10;
                j ^= (((long) bArr[i10 + 2]) & 255) << c;
                j ^= (((long) bArr[i10 + 1]) & 255) << 8;
                jRotateLeft ^= Long.rotateLeft((((long) (bArr[i10] & 255)) ^ j) * (-8663945395140668459L), 31) * 5545529020109919103L;
                break;
        }
        long j6 = length;
        long j7 = jRotateLeft ^ j6;
        long j9 = j6 ^ jRotateLeft2;
        long j10 = j7 + j9;
        long j11 = j9 + j10;
        long j12 = (j10 ^ (j10 >>> 33)) * (-49064778989728563L);
        long j13 = (j12 ^ (j12 >>> 33)) * (-4265267296055464877L);
        long j14 = (j11 ^ (j11 >>> 33)) * (-49064778989728563L);
        long j15 = (j14 ^ (j14 >>> 33)) * (-4265267296055464877L);
        long j16 = j15 ^ (j15 >>> 33);
        long j17 = (j13 ^ (j13 >>> 33)) + j16;
        long[] jArr = {j17, j16 + j17};
        return new BigInteger[]{new BigInteger(Long.toBinaryString(jArr[0]), 2), new BigInteger(Long.toBinaryString(jArr[1]), 2)}[0];
    }

    public boolean isKeyInBitmap(byte[] bArr, int i) {
        int i4 = i / 8;
        return i4 <= bArr.length - 1 && (bArr[i4] & (1 << ((byte) (i % 8)))) != 0;
    }
}
