package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzgwe {
    int[] zza;
    private final int zzb;

    public zzgwe(byte[] bArr, int i) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.zza = zzgwc.zzd(bArr);
        this.zzb = i;
    }

    public abstract int[] zza(int[] iArr, int i);

    public abstract int zzb();

    public final byte[] zzc(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        if (bArr.length != zzb()) {
            int iZzb = zzb();
            throw new GeneralSecurityException(androidx.camera.core.impl.a.o(new StringBuilder(String.valueOf(iZzb).length() + 36), "The nonce length (in bytes) must be ", iZzb));
        }
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining / 64;
        for (int i4 = 0; i4 < i + 1; i4++) {
            ByteBuffer byteBufferZzd = zzd(bArr, this.zzb + i4);
            if (i4 == i) {
                zzhfh.zzc(byteBufferAllocate, byteBuffer, byteBufferZzd, iRemaining % 64);
            } else {
                zzhfh.zzc(byteBufferAllocate, byteBuffer, byteBufferZzd, 64);
            }
        }
        return byteBufferAllocate.array();
    }

    public final ByteBuffer zzd(byte[] bArr, int i) {
        int[] iArrZza = zza(zzgwc.zzd(bArr), i);
        int[] iArr = (int[]) iArrZza.clone();
        zzgwc.zzb(iArr);
        for (int i4 = 0; i4 < 16; i4++) {
            iArrZza[i4] = iArrZza[i4] + iArr[i4];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrZza, 0, 16);
        return byteBufferOrder;
    }
}
