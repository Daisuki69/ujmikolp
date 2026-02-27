package androidx.media3.datasource;

import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class AesFlushingCipher {
    private final int blockSize;
    private final Cipher cipher;
    private final byte[] flushedBlock;
    private int pendingXorBytes;
    private final byte[] zerosBlock;

    public AesFlushingCipher(int i, byte[] bArr, @Nullable String str, long j) {
        this(i, bArr, getFNV64Hash(str), j);
    }

    private static long getFNV64Hash(@Nullable String str) {
        long j = 0;
        if (str == null) {
            return 0L;
        }
        for (int i = 0; i < str.length(); i++) {
            long jCharAt = j ^ ((long) str.charAt(i));
            j = jCharAt + (jCharAt << 1) + (jCharAt << 4) + (jCharAt << 5) + (jCharAt << 7) + (jCharAt << 8) + (jCharAt << 40);
        }
        return j;
    }

    private byte[] getInitializationVector(long j, long j6) {
        return ByteBuffer.allocate(16).putLong(j).putLong(j6).array();
    }

    private int nonFlushingUpdate(byte[] bArr, int i, int i4, byte[] bArr2, int i6) {
        try {
            return this.cipher.update(bArr, i, i4, bArr2, i6);
        } catch (ShortBufferException e) {
            throw new RuntimeException(e);
        }
    }

    public void update(byte[] bArr, int i, int i4, byte[] bArr2, int i6) {
        int i10 = i;
        int i11 = i4;
        int i12 = i6;
        do {
            int i13 = this.pendingXorBytes;
            if (i13 <= 0) {
                int iNonFlushingUpdate = nonFlushingUpdate(bArr, i10, i11, bArr2, i12);
                if (i11 == iNonFlushingUpdate) {
                    return;
                }
                int i14 = i11 - iNonFlushingUpdate;
                int i15 = 0;
                Assertions.checkState(i14 < this.blockSize);
                int i16 = i12 + iNonFlushingUpdate;
                int i17 = this.blockSize - i14;
                this.pendingXorBytes = i17;
                Assertions.checkState(nonFlushingUpdate(this.zerosBlock, 0, i17, this.flushedBlock, 0) == this.blockSize);
                while (i15 < i14) {
                    bArr2[i16] = this.flushedBlock[i15];
                    i15++;
                    i16++;
                }
                return;
            }
            bArr2[i12] = (byte) (bArr[i10] ^ this.flushedBlock[this.blockSize - i13]);
            i12++;
            i10++;
            this.pendingXorBytes = i13 - 1;
            i11--;
        } while (i11 != 0);
    }

    public void updateInPlace(byte[] bArr, int i, int i4) {
        update(bArr, i, i4, bArr, i);
    }

    public AesFlushingCipher(int i, byte[] bArr, long j, long j6) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
            this.cipher = cipher;
            int blockSize = cipher.getBlockSize();
            this.blockSize = blockSize;
            this.zerosBlock = new byte[blockSize];
            this.flushedBlock = new byte[blockSize];
            long j7 = j6 / ((long) blockSize);
            int i4 = (int) (j6 % ((long) blockSize));
            cipher.init(i, new SecretKeySpec(bArr, Util.splitAtFirst(cipher.getAlgorithm(), "/")[0]), new IvParameterSpec(getInitializationVector(j, j7)));
            if (i4 != 0) {
                updateInPlace(new byte[i4], 0, i4);
            }
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
            throw new RuntimeException(e);
        }
    }
}
