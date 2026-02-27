package com.appsflyer.internal;

import io.flutter.embedding.android.KeyboardMap;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class AFf1cSDK extends FilterInputStream {
    private static final short AFKeystoreWrapper = (short) (Math.pow(2.0d, 15.0d) * (Math.sqrt(5.0d) - 1.0d));
    private byte[] AFInAppEventParameterName;
    private int AFInAppEventType;
    private int AFLogger;
    private int AFVersionDeclaration;
    private int afDebugLog;
    private int afErrorLog;
    private int afErrorLogForExcManagerOnly;
    private int afInfoLog;
    private int afRDLog;
    private int getLevel;
    private byte[] valueOf;
    private byte[] values;

    public AFf1cSDK(InputStream inputStream, int[] iArr, int i, byte[] bArr, int i4, int i6) throws IOException {
        super(inputStream);
        this.afInfoLog = Integer.MAX_VALUE;
        this.values = new byte[8];
        this.valueOf = new byte[8];
        this.AFInAppEventParameterName = new byte[8];
        this.AFInAppEventType = 8;
        this.AFLogger = 8;
        this.afRDLog = Math.min(Math.max(i4, 5), 16);
        this.afDebugLog = i6;
        if (i6 == 3) {
            System.arraycopy(bArr, 0, this.valueOf, 0, 8);
        }
        long j = ((((long) iArr[0]) & KeyboardMap.kValueMask) << 32) | (KeyboardMap.kValueMask & ((long) iArr[1]));
        if (i != 0) {
            int i10 = (int) j;
            this.afErrorLog = i10;
            this.afErrorLogForExcManagerOnly = i10 * i;
            this.getLevel = i10 ^ i;
            this.AFVersionDeclaration = (int) (j >> 32);
            return;
        }
        this.afErrorLog = (int) j;
        long j6 = j >> 3;
        short s9 = AFKeystoreWrapper;
        this.afErrorLogForExcManagerOnly = (int) ((((long) s9) * j6) >> 32);
        this.getLevel = (int) (j >> 32);
        this.AFVersionDeclaration = (int) (j6 + ((long) s9));
    }

    private void AFInAppEventParameterName() {
        if (this.afDebugLog == 3) {
            byte[] bArr = this.values;
            System.arraycopy(bArr, 0, this.AFInAppEventParameterName, 0, bArr.length);
        }
        byte[] bArr2 = this.values;
        boolean z4 = true;
        char c = 2;
        int i = ((bArr2[0] << 24) & (-16777216)) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & 255);
        int i4 = ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i6 = 0;
        while (true) {
            int i10 = this.afRDLog;
            if (i6 >= i10) {
                break;
            }
            short s9 = AFKeystoreWrapper;
            i4 -= ((((i10 - i6) * s9) + i) ^ ((i << 4) + this.getLevel)) ^ ((i >>> 5) + this.AFVersionDeclaration);
            i -= (((i4 << 4) + this.afErrorLog) ^ (((i10 - i6) * s9) + i4)) ^ ((i4 >>> 5) + this.afErrorLogForExcManagerOnly);
            i6++;
            c = c;
            z4 = z4;
        }
        byte[] bArr3 = this.values;
        bArr3[0] = (byte) (i >> 24);
        bArr3[z4 ? 1 : 0] = (byte) (i >> 16);
        bArr3[c] = (byte) (i >> 8);
        bArr3[3] = (byte) i;
        bArr3[4] = (byte) (i4 >> 24);
        bArr3[5] = (byte) (i4 >> 16);
        bArr3[6] = (byte) (i4 >> 8);
        bArr3[7] = (byte) i4;
        if (this.afDebugLog == 3) {
            for (int i11 = 0; i11 < 8; i11++) {
                byte[] bArr4 = this.values;
                bArr4[i11] = (byte) (bArr4[i11] ^ this.valueOf[i11]);
            }
            byte[] bArr5 = this.AFInAppEventParameterName;
            System.arraycopy(bArr5, 0, this.valueOf, 0, bArr5.length);
        }
    }

    private int valueOf() throws IOException {
        if (this.afInfoLog == Integer.MAX_VALUE) {
            this.afInfoLog = ((FilterInputStream) this).in.read();
        }
        if (this.AFInAppEventType == 8) {
            byte[] bArr = this.values;
            int i = this.afInfoLog;
            bArr[0] = (byte) i;
            if (i < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i4 = 1;
            do {
                int i6 = ((FilterInputStream) this).in.read(this.values, i4, 8 - i4);
                if (i6 <= 0) {
                    break;
                }
                i4 += i6;
            } while (i4 < 8);
            if (i4 < 8) {
                throw new IllegalStateException("unexpected block size");
            }
            AFInAppEventParameterName();
            int i10 = ((FilterInputStream) this).in.read();
            this.afInfoLog = i10;
            this.AFInAppEventType = 0;
            this.AFLogger = i10 < 0 ? 8 - (this.values[7] & 255) : 8;
        }
        return this.AFLogger;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        valueOf();
        return this.AFLogger - this.AFInAppEventType;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        valueOf();
        int i = this.AFInAppEventType;
        if (i >= this.AFLogger) {
            return -1;
        }
        byte[] bArr = this.values;
        this.AFInAppEventType = i + 1;
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
            int i11 = this.AFInAppEventType;
            if (i11 >= this.AFLogger) {
                if (i10 == i) {
                    return -1;
                }
                return i4 - (i6 - i10);
            }
            byte[] bArr2 = this.values;
            this.AFInAppEventType = i11 + 1;
            bArr[i10] = bArr2[i11];
        }
        return i4;
    }
}
