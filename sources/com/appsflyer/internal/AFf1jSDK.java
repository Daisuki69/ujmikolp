package com.appsflyer.internal;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class AFf1jSDK extends FilterInputStream {
    private byte[] AFInAppEventParameterName;
    private final int AFInAppEventType;
    private AFf1gSDK AFKeystoreWrapper;
    private int[] AFLogger;
    private int afDebugLog;
    private int afErrorLog;
    private int afInfoLog;
    private int afRDLog;
    private byte[] valueOf;
    private byte[] values;

    public AFf1jSDK(InputStream inputStream, int[] iArr, byte[] bArr, int i, boolean z4, int i4) throws IOException {
        super(inputStream);
        this.afInfoLog = Integer.MAX_VALUE;
        int iMin = Math.min(Math.max(i, 3), 16);
        this.AFInAppEventType = iMin;
        this.valueOf = new byte[8];
        byte[] bArr2 = new byte[8];
        this.AFInAppEventParameterName = bArr2;
        this.values = new byte[8];
        this.AFLogger = new int[2];
        this.afDebugLog = 8;
        this.afErrorLog = 8;
        this.afRDLog = i4;
        if (i4 == 2) {
            System.arraycopy(bArr, 0, bArr2, 0, 8);
        }
        this.AFKeystoreWrapper = new AFf1gSDK(iArr, iMin, true, false);
    }

    private void AFKeystoreWrapper() {
        if (this.afRDLog == 2) {
            byte[] bArr = this.valueOf;
            System.arraycopy(bArr, 0, this.values, 0, bArr.length);
        }
        byte[] bArr2 = this.valueOf;
        int i = ((bArr2[0] << 24) & (-16777216)) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & 255);
        int i4 = ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i6 = this.AFInAppEventType;
        AFf1gSDK aFf1gSDK = this.AFKeystoreWrapper;
        AFf1hSDK.values(i, i4, false, i6, aFf1gSDK.AFInAppEventParameterName, aFf1gSDK.valueOf, this.AFLogger);
        int[] iArr = this.AFLogger;
        int i10 = iArr[0];
        int i11 = iArr[1];
        byte[] bArr3 = this.valueOf;
        bArr3[0] = (byte) (i10 >> 24);
        bArr3[1] = (byte) (i10 >> 16);
        bArr3[2] = (byte) (i10 >> 8);
        bArr3[3] = (byte) i10;
        bArr3[4] = (byte) (i11 >> 24);
        bArr3[5] = (byte) (i11 >> 16);
        bArr3[6] = (byte) (i11 >> 8);
        bArr3[7] = (byte) i11;
        if (this.afRDLog == 2) {
            for (int i12 = 0; i12 < 8; i12++) {
                byte[] bArr4 = this.valueOf;
                bArr4[i12] = (byte) (bArr4[i12] ^ this.AFInAppEventParameterName[i12]);
            }
            byte[] bArr5 = this.values;
            System.arraycopy(bArr5, 0, this.AFInAppEventParameterName, 0, bArr5.length);
        }
    }

    private int valueOf() throws IOException {
        if (this.afInfoLog == Integer.MAX_VALUE) {
            this.afInfoLog = ((FilterInputStream) this).in.read();
        }
        if (this.afDebugLog == 8) {
            byte[] bArr = this.valueOf;
            int i = this.afInfoLog;
            bArr[0] = (byte) i;
            if (i < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i4 = 1;
            do {
                int i6 = ((FilterInputStream) this).in.read(this.valueOf, i4, 8 - i4);
                if (i6 <= 0) {
                    break;
                }
                i4 += i6;
            } while (i4 < 8);
            if (i4 < 8) {
                throw new IllegalStateException("unexpected block size");
            }
            AFKeystoreWrapper();
            int i10 = ((FilterInputStream) this).in.read();
            this.afInfoLog = i10;
            this.afDebugLog = 0;
            this.afErrorLog = i10 < 0 ? 8 - (this.valueOf[7] & 255) : 8;
        }
        return this.afErrorLog;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        valueOf();
        return this.afErrorLog - this.afDebugLog;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        valueOf();
        int i = this.afDebugLog;
        if (i >= this.afErrorLog) {
            return -1;
        }
        byte[] bArr = this.valueOf;
        this.afDebugLog = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long j6 = 0;
        while (j6 < j && read() != -1) {
            j6++;
        }
        return j6;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i4) throws IOException {
        int i6 = i + i4;
        for (int i10 = i; i10 < i6; i10++) {
            valueOf();
            int i11 = this.afDebugLog;
            if (i11 >= this.afErrorLog) {
                if (i10 == i) {
                    return -1;
                }
                return i4 - (i6 - i10);
            }
            byte[] bArr2 = this.valueOf;
            this.afDebugLog = i11 + 1;
            bArr[i10] = bArr2[i11];
        }
        return i4;
    }
}
