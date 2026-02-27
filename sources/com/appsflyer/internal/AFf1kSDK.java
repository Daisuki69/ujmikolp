package com.appsflyer.internal;

/* JADX INFO: loaded from: classes2.dex */
public class AFf1kSDK {
    public static void valueOf(byte[] bArr, byte b8, long j) {
        for (int i = 0; i < bArr.length; i++) {
            if (((1 << i) & j) != 0) {
                bArr[i] = (byte) (bArr[i] ^ b8);
            }
        }
    }
}
