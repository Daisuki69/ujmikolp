package com.google.protobuf;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0 f10123a;

    static {
        f10123a = (o0.e && o0.f10119d && !AbstractC1189c.a()) ? new p0(1) : new p0(0);
    }

    public static int a(byte[] bArr, int i, int i4) {
        byte b8 = bArr[i - 1];
        int i6 = i4 - i;
        if (i6 == 0) {
            if (b8 > -12) {
                return -1;
            }
            return b8;
        }
        if (i6 == 1) {
            return c(b8, bArr[i]);
        }
        if (i6 == 2) {
            return d(b8, bArr[i], bArr[i + 1]);
        }
        throw new AssertionError();
    }

    public static int b(String str) {
        int length = str.length();
        int i = 0;
        int i4 = 0;
        while (i4 < length && str.charAt(i4) < 128) {
            i4++;
        }
        int i6 = length;
        while (true) {
            if (i4 >= length) {
                break;
            }
            char cCharAt = str.charAt(i4);
            if (cCharAt < 2048) {
                i6 += (127 - cCharAt) >>> 31;
                i4++;
            } else {
                int length2 = str.length();
                while (i4 < length2) {
                    char cCharAt2 = str.charAt(i4);
                    if (cCharAt2 < 2048) {
                        i += (127 - cCharAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i4) < 65536) {
                                throw new q0(i4, length2);
                            }
                            i4++;
                        }
                    }
                    i4++;
                }
                i6 += i;
            }
        }
        if (i6 >= length) {
            return i6;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i6) + 4294967296L));
    }

    public static int c(int i, int i4) {
        if (i > -12 || i4 > -65) {
            return -1;
        }
        return i ^ (i4 << 8);
    }

    public static int d(int i, int i4, int i6) {
        if (i > -12 || i4 > -65 || i6 > -65) {
            return -1;
        }
        return (i ^ (i4 << 8)) ^ (i6 << 16);
    }
}
