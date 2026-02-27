package Ff;

import M8.A0;
import We.s;
import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends g {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final byte[] f1590k = {40, -65, 78, 94, 78, 117, -118, 65, 100, 0, 78, 86, -1, -6, 1, 8, 46, 46, 0, -74, -48, 104, 62, -128, 47, 12, -87, -2, 100, 83, 105, 122};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String[] f1591l = {"SHA-256", "SHA-384", "SHA-512"};

    public k() {
    }

    public static byte[] i(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, int i, byte[] bArr6, int i4, int i6, boolean z4, boolean z5) throws IOException {
        byte[] bArrK;
        byte[] bArr7;
        if (i4 == 6 || i4 == 5) {
            if (z5) {
                if (bArr4 == null) {
                    throw new IOException("/Encrypt/OE entry is missing");
                }
                byte[] bArr8 = new byte[8];
                System.arraycopy(bArr2, 40, bArr8, 0, 8);
                bArrK = i4 == 5 ? k(bArr, bArr8, bArr3) : j(bArr, bArr8, bArr3);
                bArr7 = bArr4;
            } else {
                if (bArr5 == null) {
                    throw new IOException("/Encrypt/UE entry is missing");
                }
                byte[] bArr9 = new byte[8];
                System.arraycopy(bArr3, 40, bArr9, 0, 8);
                bArrK = i4 == 5 ? k(bArr, bArr9, null) : j(bArr, bArr9, null);
                bArr7 = bArr5;
            }
            try {
                Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
                cipher.init(2, new SecretKeySpec(bArrK, "AES"), new IvParameterSpec(new byte[16]));
                return cipher.doFinal(bArr7);
            } catch (GeneralSecurityException e) {
                n();
                throw new IOException(e);
            }
        }
        byte[] bArr10 = new byte[32];
        int iMin = Math.min(bArr.length, 32);
        System.arraycopy(bArr, 0, bArr10, 0, iMin);
        System.arraycopy(f1590k, 0, bArr10, iMin, 32 - iMin);
        MessageDigest messageDigestM = A0.m();
        messageDigestM.update(bArr10);
        messageDigestM.update(bArr2);
        messageDigestM.update((byte) i);
        messageDigestM.update((byte) (i >>> 8));
        messageDigestM.update((byte) (i >>> 16));
        messageDigestM.update((byte) (i >>> 24));
        messageDigestM.update(bArr6);
        if (i4 == 4 && !z4) {
            messageDigestM.update(new byte[]{-1, -1, -1, -1});
        }
        byte[] bArrDigest = messageDigestM.digest();
        if (i4 == 3 || i4 == 4) {
            for (int i10 = 0; i10 < 50; i10++) {
                messageDigestM.update(bArrDigest, 0, i6);
                bArrDigest = messageDigestM.digest();
            }
        }
        byte[] bArr11 = new byte[i6];
        System.arraycopy(bArrDigest, 0, bArr11, 0, i6);
        return bArr11;
    }

    public static byte[] j(byte[] bArr, byte[] bArr2, byte[] bArr3) throws IOException {
        if (bArr3 == null) {
            bArr3 = new byte[0];
        } else {
            if (bArr3.length < 48) {
                throw new IOException("Bad U length");
            }
            if (bArr3.length > 48) {
                byte[] bArr4 = new byte[48];
                System.arraycopy(bArr3, 0, bArr4, 0, 48);
                bArr3 = bArr4;
            }
        }
        if (bArr.length > 127) {
            byte[] bArr5 = new byte[127];
            System.arraycopy(bArr, 0, bArr5, 0, 127);
            bArr = bArr5;
        }
        byte[] bArr6 = new byte[bArr.length + bArr2.length + bArr3.length];
        System.arraycopy(bArr, 0, bArr6, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr6, bArr.length, bArr2.length);
        System.arraycopy(bArr3, 0, bArr6, bArr.length + bArr2.length, bArr3.length);
        try {
            try {
                byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(bArr6);
                byte[] bArrDoFinal = null;
                int i = 0;
                while (true) {
                    if (i >= 64 && (bArrDoFinal[bArrDoFinal.length - 1] & 255) <= i - 32) {
                        break;
                    }
                    byte[] bArr7 = bArr3.length >= 48 ? new byte[(bArr.length + bArrDigest.length + 48) * 64] : new byte[(bArr.length + bArrDigest.length) * 64];
                    int length = 0;
                    for (int i4 = 0; i4 < 64; i4++) {
                        System.arraycopy(bArr, 0, bArr7, length, bArr.length);
                        int length2 = length + bArr.length;
                        System.arraycopy(bArrDigest, 0, bArr7, length2, bArrDigest.length);
                        length = length2 + bArrDigest.length;
                        if (bArr3.length >= 48) {
                            System.arraycopy(bArr3, 0, bArr7, length, 48);
                            length += 48;
                        }
                    }
                    byte[] bArr8 = new byte[16];
                    byte[] bArr9 = new byte[16];
                    System.arraycopy(bArrDigest, 0, bArr8, 0, 16);
                    System.arraycopy(bArrDigest, 16, bArr9, 0, 16);
                    Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
                    cipher.init(1, new SecretKeySpec(bArr8, "AES"), new IvParameterSpec(bArr9));
                    bArrDoFinal = cipher.doFinal(bArr7);
                    byte[] bArr10 = new byte[16];
                    System.arraycopy(bArrDoFinal, 0, bArr10, 0, 16);
                    bArrDigest = MessageDigest.getInstance(f1591l[new BigInteger(1, bArr10).mod(new BigInteger(ExifInterface.GPS_MEASUREMENT_3D)).intValue()]).digest(bArrDoFinal);
                    i++;
                }
                if (bArrDigest.length <= 32) {
                    return bArrDigest;
                }
                byte[] bArr11 = new byte[32];
                System.arraycopy(bArrDigest, 0, bArr11, 0, 32);
                return bArr11;
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        } catch (GeneralSecurityException e7) {
            n();
            throw new IOException(e7);
        }
    }

    public static byte[] k(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            messageDigest.update(bArr2);
            return bArr3 == null ? messageDigest.digest() : messageDigest.digest(bArr3);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static void n() {
        try {
            if (Cipher.getMaxAllowedKeyLength("AES") != Integer.MAX_VALUE) {
                Log.w("PdfBox-Android", "JCE unlimited strength jurisdiction policy files are not installed");
            }
        } catch (NoSuchAlgorithmException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:332:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x052c A[Catch: GeneralSecurityException -> 0x054a, TryCatch #0 {GeneralSecurityException -> 0x054a, blocks: (B:393:0x050f, B:395:0x052c, B:397:0x0530, B:399:0x053a, B:401:0x0540, B:408:0x0552, B:410:0x0570, B:412:0x05ac, B:417:0x05ba, B:415:0x05b4, B:407:0x054c), top: B:427:0x050f }] */
    /* JADX WARN: Removed duplicated region for block: B:396:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x054c A[Catch: GeneralSecurityException -> 0x054a, TryCatch #0 {GeneralSecurityException -> 0x054a, blocks: (B:393:0x050f, B:395:0x052c, B:397:0x0530, B:399:0x053a, B:401:0x0540, B:408:0x0552, B:410:0x0570, B:412:0x05ac, B:417:0x05ba, B:415:0x05b4, B:407:0x054c), top: B:427:0x050f }] */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0570 A[Catch: GeneralSecurityException -> 0x054a, TryCatch #0 {GeneralSecurityException -> 0x054a, blocks: (B:393:0x050f, B:395:0x052c, B:397:0x0530, B:399:0x053a, B:401:0x0540, B:408:0x0552, B:410:0x0570, B:412:0x05ac, B:417:0x05ba, B:415:0x05b4, B:407:0x054c), top: B:427:0x050f }] */
    /* JADX WARN: Removed duplicated region for block: B:423:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015f  */
    @Override // Ff.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(Ff.b r33, yf.C2531a r34, E1.c r35) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ff.k.h(Ff.b, yf.a, E1.c):void");
    }

    public final byte[] l(byte[] bArr, int i, int i4, byte[] bArr2) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        MessageDigest messageDigestM = A0.m();
        byte[] bArr3 = new byte[32];
        int iMin = Math.min(bArr.length, 32);
        System.arraycopy(bArr, 0, bArr3, 0, iMin);
        System.arraycopy(f1590k, 0, bArr3, iMin, 32 - iMin);
        byte[] bArrDigest = messageDigestM.digest(bArr3);
        if (i == 3 || i == 4) {
            for (int i6 = 0; i6 < 50; i6++) {
                messageDigestM.update(bArrDigest, 0, i4);
                bArrDigest = messageDigestM.digest();
            }
        }
        byte[] bArr4 = new byte[i4];
        System.arraycopy(bArrDigest, 0, bArr4, 0, i4);
        if (i == 2) {
            f(bArr4, bArr2, byteArrayOutputStream);
        } else if (i == 3 || i == 4) {
            byte[] bArr5 = new byte[i4];
            byte[] byteArray = new byte[bArr2.length];
            System.arraycopy(bArr2, 0, byteArray, 0, bArr2.length);
            for (int i10 = 19; i10 >= 0; i10--) {
                System.arraycopy(bArr4, 0, bArr5, 0, i4);
                for (int i11 = 0; i11 < i4; i11++) {
                    bArr5[i11] = (byte) (bArr5[i11] ^ ((byte) i10));
                }
                byteArrayOutputStream.reset();
                f(bArr5, byteArray, byteArrayOutputStream);
                byteArray = byteArrayOutputStream.toByteArray();
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    public final boolean m(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4, int i4, int i6, boolean z4) throws IOException {
        byte[] bArr5 = bArr;
        if (i4 != 2 && i4 != 3 && i4 != 4) {
            if (i4 != 5 && i4 != 6) {
                throw new IOException(s.f(i4, "Unknown Encryption Revision "));
            }
            if (bArr5.length > 127) {
                byte[] bArr6 = new byte[127];
                System.arraycopy(bArr5, 0, bArr6, 0, 127);
                bArr5 = bArr6;
            }
            byte[] bArr7 = new byte[32];
            byte[] bArr8 = new byte[8];
            System.arraycopy(bArr2, 0, bArr7, 0, 32);
            System.arraycopy(bArr2, 32, bArr8, 0, 8);
            return Arrays.equals(i4 == 5 ? k(bArr5, bArr8, null) : j(bArr5, bArr8, null), bArr7);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArrI = i(bArr5, bArr3, null, null, null, i, bArr4, i4, i6, z4, true);
        byte[] bArr9 = f1590k;
        if (i4 == 2) {
            f(bArrI, bArr9, byteArrayOutputStream);
        } else if (i4 == 3 || i4 == 4) {
            MessageDigest messageDigestM = A0.m();
            messageDigestM.update(bArr9);
            messageDigestM.update(bArr4);
            byteArrayOutputStream.write(messageDigestM.digest());
            int length = bArrI.length;
            byte[] bArr10 = new byte[length];
            for (int i10 = 0; i10 < 20; i10++) {
                System.arraycopy(bArrI, 0, bArr10, 0, length);
                for (int i11 = 0; i11 < length; i11++) {
                    bArr10[i11] = (byte) (bArr10[i11] ^ i10);
                }
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                byteArrayOutputStream.reset();
                e(bArr10, byteArrayInputStream, byteArrayOutputStream);
            }
            byte[] bArr11 = new byte[32];
            System.arraycopy(byteArrayOutputStream.toByteArray(), 0, bArr11, 0, 16);
            System.arraycopy(bArr9, 0, bArr11, 16, 16);
            byteArrayOutputStream.reset();
            byteArrayOutputStream.write(bArr11);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        return i4 == 2 ? Arrays.equals(bArr2, byteArray) : Arrays.equals(Arrays.copyOf(bArr2, 16), Arrays.copyOf(byteArray, 16));
    }

    public k(j jVar) {
        throw null;
    }
}
