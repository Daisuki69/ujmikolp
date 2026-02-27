package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import okio.Utf8;

/* JADX INFO: loaded from: classes3.dex */
public final class zzef {
    private static final char[] zza = {'\r', '\n'};
    private static final char[] zzb = {'\n'};
    private static final zzgke zzc = zzgke.zzl(StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);
    private static final AtomicBoolean zzd = new AtomicBoolean();
    private byte[] zze;
    private int zzf;
    private int zzg;

    public zzef(byte[] bArr, int i) {
        this.zze = bArr;
        this.zzg = i;
    }

    private final char zzS(ByteOrder byteOrder, int i) {
        zzW(2);
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            byte[] bArr = this.zze;
            int i4 = this.zzf + i;
            return zzgnb.zza(bArr[i4], bArr[i4 + 1]);
        }
        byte[] bArr2 = this.zze;
        int i6 = this.zzf + i;
        return zzgnb.zza(bArr2[i6 + 1], bArr2[i6]);
    }

    private final char zzT(Charset charset, char[] cArr) {
        int iZzU;
        if (zzd() >= zzV(charset) && (iZzU = zzU(charset)) != 0) {
            if (!Character.isSupplementaryCodePoint(i)) {
                long j = i;
                char c = (char) j;
                zzghc.zze(((long) c) == j, "Out of range: %s", j);
                for (char c10 : cArr) {
                    if (c10 == c) {
                        this.zzf = zzgne.zza(iZzU & 255) + this.zzf;
                        return c;
                    }
                }
            }
        }
        return (char) 0;
    }

    private final int zzU(Charset charset) {
        int codePoint;
        int i;
        int iZzY;
        zzghc.zzf(zzc.contains(charset), "Unsupported charset: %s", charset);
        if (zzd() < zzV(charset)) {
            int i4 = this.zzf;
            int i6 = this.zzg;
            throw new IndexOutOfBoundsException(androidx.media3.datasource.cache.c.n(new StringBuilder(String.valueOf(i4).length() + 17 + String.valueOf(i6).length()), "position=", i4, ", limit=", i6));
        }
        int i10 = 1;
        if (charset.equals(StandardCharsets.US_ASCII)) {
            byte b8 = this.zze[this.zzf];
            if ((b8 & 128) == 0) {
                codePoint = b8 & 255;
                return (codePoint << 8) | i10;
            }
            return 0;
        }
        if (charset.equals(StandardCharsets.UTF_8)) {
            byte b10 = this.zze[this.zzf];
            if ((b10 & 128) == 0) {
                i = 1;
            } else if ((b10 & 224) == 192 && zzd() >= 2 && zzX(this.zze[this.zzf + 1])) {
                i = 2;
            } else {
                if ((this.zze[this.zzf] & 240) == 224 && zzd() >= 3) {
                    byte[] bArr = this.zze;
                    int i11 = this.zzf;
                    if (zzX(bArr[i11 + 1]) && zzX(bArr[i11 + 2])) {
                        i = 3;
                    }
                }
                if ((this.zze[this.zzf] & 248) == 240 && zzd() >= 4) {
                    byte[] bArr2 = this.zze;
                    int i12 = this.zzf;
                    if (zzX(bArr2[i12 + 1]) && zzX(bArr2[i12 + 2]) && zzX(bArr2[i12 + 3])) {
                        i = 4;
                    }
                }
                i = 0;
            }
            if (i == 1) {
                iZzY = this.zze[this.zzf] & 255;
            } else if (i == 2) {
                byte[] bArr3 = this.zze;
                int i13 = this.zzf;
                iZzY = zzY(0, 0, bArr3[i13], bArr3[i13 + 1]);
            } else {
                if (i != 3) {
                    if (i == 4) {
                        byte[] bArr4 = this.zze;
                        int i14 = this.zzf;
                        iZzY = zzY(bArr4[i14], bArr4[i14 + 1], bArr4[i14 + 2], bArr4[i14 + 3]);
                    }
                    return 0;
                }
                byte[] bArr5 = this.zze;
                int i15 = this.zzf;
                iZzY = zzY(0, bArr5[i15] & 15, bArr5[i15 + 1], bArr5[i15 + 2]);
            }
            i10 = i;
            codePoint = iZzY;
        } else {
            ByteOrder byteOrder = charset.equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
            char cZzS = zzS(byteOrder, 0);
            if (!Character.isHighSurrogate(cZzS) || zzd() < 4) {
                codePoint = cZzS;
                i10 = 2;
            } else {
                codePoint = Character.toCodePoint(cZzS, zzS(byteOrder, 2));
                i10 = 4;
            }
        }
        return (codePoint << 8) | i10;
    }

    private static int zzV(Charset charset) {
        zzghc.zzf(zzc.contains(charset), "Unsupported charset: %s", charset);
        return (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) ? 1 : 2;
    }

    private final void zzW(int i) {
        if (!zzd.get() || zzd() >= i) {
            return;
        }
        int iZzd = zzd();
        throw new IndexOutOfBoundsException(androidx.media3.datasource.cache.c.n(new StringBuilder(String.valueOf(i).length() + 25 + String.valueOf(iZzd).length()), "bytesNeeded= ", i, ", bytesLeft=", iZzd));
    }

    private static boolean zzX(byte b8) {
        return (b8 & 192) == 128;
    }

    private static int zzY(int i, int i4, int i6, int i10) {
        return zzgne.zze((byte) 0, zzgni.zza(((i & 7) << 2) | ((i4 & 48) >> 4)), zzgni.zza(((i6 & 60) >> 2) | ((i4 & 15) << 4)), zzgni.zza((i10 & 63) | ((i6 & 3) << 6)));
    }

    public final long zzA() {
        zzW(4);
        byte[] bArr = this.zze;
        int i = this.zzf;
        int i4 = i + 1;
        this.zzf = i4;
        long j = bArr[i];
        int i6 = i + 2;
        this.zzf = i6;
        long j6 = bArr[i4];
        int i10 = i + 3;
        this.zzf = i10;
        long j7 = bArr[i6];
        this.zzf = i + 4;
        return ((((long) bArr[i10]) & 255) << 24) | (255 & j) | ((j6 & 255) << 8) | ((j7 & 255) << 16);
    }

    public final int zzB() {
        zzW(4);
        byte[] bArr = this.zze;
        int i = this.zzf;
        int i4 = i + 1;
        this.zzf = i4;
        int i6 = bArr[i] & 255;
        int i10 = i + 2;
        this.zzf = i10;
        int i11 = bArr[i4] & 255;
        int i12 = i + 3;
        this.zzf = i12;
        int i13 = bArr[i10] & 255;
        this.zzf = i + 4;
        return (bArr[i12] & 255) | (i6 << 24) | (i11 << 16) | (i13 << 8);
    }

    public final int zzC() {
        zzW(4);
        byte[] bArr = this.zze;
        int i = this.zzf;
        int i4 = i + 1;
        this.zzf = i4;
        int i6 = bArr[i] & 255;
        int i10 = i + 2;
        this.zzf = i10;
        int i11 = bArr[i4] & 255;
        int i12 = i + 3;
        this.zzf = i12;
        int i13 = bArr[i10] & 255;
        this.zzf = i + 4;
        return ((bArr[i12] & 255) << 24) | (i11 << 8) | i6 | (i13 << 16);
    }

    public final long zzD() {
        zzW(8);
        byte[] bArr = this.zze;
        int i = this.zzf;
        int i4 = i + 1;
        this.zzf = i4;
        long j = bArr[i];
        int i6 = i + 2;
        this.zzf = i6;
        long j6 = bArr[i4];
        int i10 = i + 3;
        this.zzf = i10;
        long j7 = bArr[i6];
        int i11 = i + 4;
        this.zzf = i11;
        long j9 = bArr[i10];
        int i12 = i + 5;
        this.zzf = i12;
        long j10 = bArr[i11];
        int i13 = i + 6;
        this.zzf = i13;
        long j11 = bArr[i12];
        int i14 = i + 7;
        this.zzf = i14;
        long j12 = bArr[i13];
        this.zzf = i + 8;
        return ((j12 & 255) << 8) | ((j & 255) << 56) | ((j6 & 255) << 48) | ((j7 & 255) << 40) | ((j9 & 255) << 32) | ((j10 & 255) << 24) | ((j11 & 255) << 16) | (((long) bArr[i14]) & 255);
    }

    public final long zzE() {
        zzW(8);
        byte[] bArr = this.zze;
        int i = this.zzf;
        int i4 = i + 1;
        this.zzf = i4;
        long j = bArr[i];
        int i6 = i + 2;
        this.zzf = i6;
        long j6 = bArr[i4];
        int i10 = i + 3;
        this.zzf = i10;
        long j7 = bArr[i6];
        int i11 = i + 4;
        this.zzf = i11;
        long j9 = bArr[i10];
        int i12 = i + 5;
        this.zzf = i12;
        long j10 = bArr[i11];
        int i13 = i + 6;
        this.zzf = i13;
        long j11 = bArr[i12];
        int i14 = i + 7;
        this.zzf = i14;
        long j12 = bArr[i13];
        this.zzf = i + 8;
        return ((j12 & 255) << 48) | (j & 255) | ((j6 & 255) << 8) | ((j7 & 255) << 16) | ((j9 & 255) << 24) | ((j10 & 255) << 32) | ((j11 & 255) << 40) | ((((long) bArr[i14]) & 255) << 56);
    }

    public final int zzF() {
        zzW(4);
        byte[] bArr = this.zze;
        int i = this.zzf;
        int i4 = i + 1;
        this.zzf = i4;
        int i6 = bArr[i] & 255;
        this.zzf = i + 2;
        int i10 = bArr[i4] & 255;
        this.zzf = i + 4;
        return (i6 << 8) | i10;
    }

    public final int zzG() {
        return (zzs() << 21) | (zzs() << 14) | (zzs() << 7) | zzs();
    }

    public final int zzH() {
        int iZzB = zzB();
        if (iZzB >= 0) {
            return iZzB;
        }
        throw new IllegalStateException(androidx.camera.core.impl.a.o(new StringBuilder(String.valueOf(iZzB).length() + 18), "Top bit not zero: ", iZzB));
    }

    public final int zzI() {
        int iZzC = zzC();
        if (iZzC >= 0) {
            return iZzC;
        }
        throw new IllegalStateException(androidx.camera.core.impl.a.o(new StringBuilder(String.valueOf(iZzC).length() + 18), "Top bit not zero: ", iZzC));
    }

    public final long zzJ() {
        long jZzD = zzD();
        if (jZzD >= 0) {
            return jZzD;
        }
        throw new IllegalStateException(androidx.media3.datasource.cache.c.j(jZzD, "Top bit not zero: ", new StringBuilder(String.valueOf(jZzD).length() + 18)));
    }

    public final String zzK(int i, Charset charset) {
        zzW(i);
        byte[] bArr = this.zze;
        int i4 = this.zzf;
        String str = new String(bArr, i4, i, charset);
        this.zzf = i4 + i;
        return str;
    }

    public final String zzL(int i) {
        zzW(i);
        if (i == 0) {
            return "";
        }
        int i4 = this.zzf;
        int i6 = (i4 + i) - 1;
        String strZzj = zzeo.zzj(this.zze, i4, (i6 >= this.zzg || this.zze[i6] != 0) ? i : i - 1);
        this.zzf += i;
        return strZzj;
    }

    @Nullable
    public final String zzM(char c) {
        if (zzd() == 0) {
            return null;
        }
        int i = this.zzf;
        while (i < this.zzg && this.zze[i] != 0) {
            i++;
        }
        byte[] bArr = this.zze;
        int i4 = this.zzf;
        String strZzj = zzeo.zzj(bArr, i4, i - i4);
        this.zzf = i;
        if (i < this.zzg) {
            this.zzf = i + 1;
        }
        return strZzj;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009c  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String zzN(java.nio.charset.Charset r5) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzef.zzN(java.nio.charset.Charset):java.lang.String");
    }

    public final long zzO() {
        int i;
        zzW(1);
        long j = this.zze[this.zzf];
        int i4 = 7;
        while (true) {
            i = 0;
            if (i4 < 0) {
                break;
            }
            int i6 = 1 << i4;
            if ((((long) i6) & j) != 0) {
                i4--;
            } else if (i4 < 6) {
                j &= (long) (i6 - 1);
                i = 7 - i4;
            } else if (i4 == 7) {
                i = 1;
            }
        }
        if (i == 0) {
            throw new NumberFormatException(androidx.media3.datasource.cache.c.j(j, "Invalid UTF-8 sequence first byte: ", new StringBuilder(String.valueOf(j).length() + 35)));
        }
        zzW(i);
        for (int i10 = 1; i10 < i; i10++) {
            byte b8 = this.zze[this.zzf + i10];
            if ((b8 & 192) != 128) {
                throw new NumberFormatException(androidx.media3.datasource.cache.c.j(j, "Invalid UTF-8 sequence continuation byte: ", new StringBuilder(String.valueOf(j).length() + 42)));
            }
            j = (j << 6) | ((long) (b8 & Utf8.REPLACEMENT_BYTE));
        }
        this.zzf += i;
        return j;
    }

    public final long zzP() {
        long j = 0;
        for (int i = 0; i < 9; i++) {
            if (this.zzf == this.zzg) {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
            long jZzs = zzs();
            j |= (127 & jZzs) << (i * 7);
            if ((jZzs & 128) == 0) {
                return j;
            }
        }
        return j;
    }

    public final void zzQ() {
        while ((zzs() & 128) != 0) {
        }
    }

    @Nullable
    public final Charset zzR() {
        if (zzd() >= 3) {
            byte[] bArr = this.zze;
            int i = this.zzf;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.zzf = i + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (zzd() < 2) {
            return null;
        }
        byte[] bArr2 = this.zze;
        int i4 = this.zzf;
        byte b8 = bArr2[i4];
        if (b8 == -2) {
            if (bArr2[i4 + 1] != -1) {
                return null;
            }
            this.zzf = i4 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b8 != -1 || bArr2[i4 + 1] != -2) {
            return null;
        }
        this.zzf = i4 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public final void zza(int i) {
        byte[] bArr = this.zze;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        zzb(bArr, i);
    }

    public final void zzb(byte[] bArr, int i) {
        this.zze = bArr;
        this.zzg = i;
        this.zzf = 0;
    }

    public final void zzc(int i) {
        byte[] bArr = this.zze;
        if (i > bArr.length) {
            this.zze = Arrays.copyOf(bArr, i);
        }
    }

    public final int zzd() {
        return Math.max(this.zzg - this.zzf, 0);
    }

    public final int zze() {
        return this.zzg;
    }

    public final void zzf(int i) {
        boolean z4 = false;
        if (i >= 0 && i <= this.zze.length) {
            z4 = true;
        }
        zzghc.zza(z4);
        this.zzg = i;
    }

    public final int zzg() {
        return this.zzf;
    }

    public final void zzh(int i) {
        boolean z4 = false;
        if (i >= 0 && i <= this.zzg) {
            z4 = true;
        }
        zzghc.zza(z4);
        this.zzf = i;
    }

    public final byte[] zzi() {
        return this.zze;
    }

    public final int zzj() {
        return this.zze.length;
    }

    public final void zzk(int i) {
        zzh(this.zzf + i);
    }

    public final void zzl(zzee zzeeVar, int i) {
        zzm(zzeeVar.zza, 0, i);
        zzeeVar.zzf(0);
    }

    public final void zzm(byte[] bArr, int i, int i4) {
        zzW(i4);
        System.arraycopy(this.zze, this.zzf, bArr, i, i4);
        this.zzf += i4;
    }

    public final int zzn() {
        zzW(1);
        return this.zze[this.zzf] & 255;
    }

    public final char zzo() {
        return zzS(ByteOrder.BIG_ENDIAN, 0);
    }

    public final int zzp(Charset charset) {
        if (zzU(charset) != 0) {
            return zzgne.zza(r3 >>> 8);
        }
        return 1114112;
    }

    public final int zzq() {
        if (zzd() >= 3) {
            this.zzf -= 3;
            return zzx();
        }
        int i = this.zzf;
        int i4 = this.zzg;
        throw new IndexOutOfBoundsException(androidx.media3.datasource.cache.c.n(new StringBuilder(String.valueOf(i).length() + 17 + String.valueOf(i4).length()), "position=", i, ", limit=", i4));
    }

    public final int zzr() {
        if (zzd() >= 4) {
            this.zzf -= 4;
            return zzB();
        }
        int i = this.zzf;
        int i4 = this.zzg;
        throw new IndexOutOfBoundsException(androidx.media3.datasource.cache.c.n(new StringBuilder(String.valueOf(i).length() + 17 + String.valueOf(i4).length()), "position=", i, ", limit=", i4));
    }

    public final int zzs() {
        zzW(1);
        byte[] bArr = this.zze;
        int i = this.zzf;
        this.zzf = i + 1;
        return bArr[i] & 255;
    }

    public final int zzt() {
        zzW(2);
        byte[] bArr = this.zze;
        int i = this.zzf;
        int i4 = i + 1;
        this.zzf = i4;
        int i6 = bArr[i] & 255;
        this.zzf = i + 2;
        return (bArr[i4] & 255) | (i6 << 8);
    }

    public final int zzu() {
        zzW(2);
        byte[] bArr = this.zze;
        int i = this.zzf;
        int i4 = i + 1;
        this.zzf = i4;
        int i6 = bArr[i] & 255;
        this.zzf = i + 2;
        return ((bArr[i4] & 255) << 8) | i6;
    }

    public final short zzv() {
        zzW(2);
        byte[] bArr = this.zze;
        int i = this.zzf;
        int i4 = i + 1;
        this.zzf = i4;
        int i6 = bArr[i] & 255;
        this.zzf = i + 2;
        return (short) ((bArr[i4] & 255) | (i6 << 8));
    }

    public final short zzw() {
        zzW(2);
        byte[] bArr = this.zze;
        int i = this.zzf;
        int i4 = i + 1;
        this.zzf = i4;
        int i6 = bArr[i] & 255;
        this.zzf = i + 2;
        return (short) (((bArr[i4] & 255) << 8) | i6);
    }

    public final int zzx() {
        zzW(3);
        byte[] bArr = this.zze;
        int i = this.zzf;
        int i4 = i + 1;
        this.zzf = i4;
        int i6 = bArr[i] & 255;
        int i10 = i + 2;
        this.zzf = i10;
        int i11 = bArr[i4] & 255;
        this.zzf = i + 3;
        return (bArr[i10] & 255) | (i6 << 16) | (i11 << 8);
    }

    public final int zzy() {
        zzW(3);
        byte[] bArr = this.zze;
        int i = this.zzf;
        int i4 = i + 1;
        this.zzf = i4;
        int i6 = bArr[i] & 255;
        int i10 = i + 2;
        this.zzf = i10;
        int i11 = bArr[i4] & 255;
        this.zzf = i + 3;
        return (bArr[i10] & 255) | ((i6 << 24) >> 8) | (i11 << 8);
    }

    public final long zzz() {
        zzW(4);
        byte[] bArr = this.zze;
        int i = this.zzf;
        int i4 = i + 1;
        this.zzf = i4;
        long j = bArr[i];
        int i6 = i + 2;
        this.zzf = i6;
        long j6 = bArr[i4];
        int i10 = i + 3;
        this.zzf = i10;
        long j7 = bArr[i6];
        this.zzf = i + 4;
        return (((long) bArr[i10]) & 255) | ((j & 255) << 24) | ((j6 & 255) << 16) | ((j7 & 255) << 8);
    }

    public zzef() {
        this.zze = zzeo.zzb;
    }

    public zzef(int i) {
        this.zze = new byte[i];
        this.zzg = i;
    }

    public zzef(byte[] bArr) {
        this.zze = bArr;
        this.zzg = bArr.length;
    }
}
