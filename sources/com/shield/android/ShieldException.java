package com.shield.android;

import com.paymaya.common.utility.AbstractC1213b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class ShieldException extends RuntimeException {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15010d = {819544977, 1247001906, 686483827};
    public final String body;
    public final int code;
    public final Kind kind;
    public final String message;
    public final String url;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Kind {
        private static final /* synthetic */ Kind[] $VALUES;
        public static final Kind HTTP;
        public static final Kind NETWORK;
        public static final Kind UNEXPECTED;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15011d = {655650023, 725736322, 1902669154, 85033106, 67060854, 591382259};

        static {
            Kind kind = new Kind(d("摮뉕奜곓혍歳㗛"), ((int) f15011d[0]) ^ 655650023);
            NETWORK = kind;
            Kind kind2 = new Kind(d("摨뉄奜곔"), ((int) f15011d[1]) ^ 725736323);
            HTTP = kind2;
            Kind kind3 = new Kind(d("摵뉞奍곜혒此㗓\u1a9c贡䛶"), ((int) f15011d[2]) ^ 1902669152);
            UNEXPECTED = kind3;
            long[] jArr = f15011d;
            Kind[] kindArr = new Kind[((int) jArr[3]) ^ 85033105];
            kindArr[((int) jArr[0]) ^ 655650023] = kind;
            kindArr[((int) jArr[1]) ^ 725736323] = kind2;
            kindArr[((int) jArr[2]) ^ 1902669152] = kind3;
            $VALUES = kindArr;
        }

        private Kind(String str, int i) {
        }

        public static String d(String str) {
            int i = ((int) f15011d[4]) ^ 67079222;
            StringBuilder sb2 = new StringBuilder();
            int i4 = ((int) f15011d[0]) ^ 655650023;
            while (i4 < str.length()) {
                long[] jArr = f15011d;
                int i6 = (((i >> (((int) jArr[0]) ^ 655650023)) ^ (i >> (((int) jArr[2]) ^ 1902669152))) ^ (i >> (((int) jArr[3]) ^ 85033105))) ^ (i >> 5);
                long j = jArr[1];
                i = (char) ((i >> (((int) j) ^ 725736323)) | (((char) (i6 & (((int) j) ^ 725736323))) << (((int) jArr[5]) ^ 591382268)));
                char cCharAt = str.charAt(i4);
                int i10 = cCharAt + i;
                long j6 = f15011d[1];
                int i11 = (~cCharAt) | (~i);
                sb2.append((char) AbstractC1213b.H(i10, ((int) j6) ^ 725736323, i11, i10, (((int) j6) ^ 725736323) + i10 + i11));
                long j7 = f15011d[1];
                int i12 = ~i4;
                i4 = i4 + (((int) j7) ^ 725736323) + (((int) j7) ^ 725736323) + ((~(((int) j7) ^ 725736323)) | i12) + (((((int) j7) ^ 725736323) + i4) - ((((((int) j7) ^ 725736323) + i4) + (((int) j7) ^ 725736323)) + ((~(((int) j7) ^ 725736323)) | i12)));
            }
            return sb2.toString();
        }

        public static Kind valueOf(String str) {
            return (Kind) Enum.valueOf(Kind.class, str);
        }

        public static Kind[] values() {
            return (Kind[]) $VALUES.clone();
        }
    }

    private ShieldException(String str, int i, String str2, String str3, Kind kind, Throwable th2) {
        super(str2, th2);
        this.url = str;
        this.kind = kind;
        this.message = str2;
        this.body = str3;
        this.code = i;
    }

    public static ShieldException httpError(String str, int i, String str2, String str3) {
        return new ShieldException(str, i, str2, str3, Kind.HTTP, null);
    }

    public static ShieldException networkError(IOException iOException) {
        return new ShieldException(null, 819544977 ^ ((int) f15010d[0]), iOException.getMessage(), null, Kind.NETWORK, iOException);
    }

    public static ShieldException unexpectedError(Throwable th2) {
        return new ShieldException(null, 819544977 ^ ((int) f15010d[0]), th2.getMessage(), null, Kind.UNEXPECTED, th2);
    }
}
