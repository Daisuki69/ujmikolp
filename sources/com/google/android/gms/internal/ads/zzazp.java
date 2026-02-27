package com.google.android.gms.internal.ads;

import com.dynatrace.android.agent.Global;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public final class zzazp extends zzazk {
    private MessageDigest zzb;

    @Override // com.google.android.gms.internal.ads.zzazk
    public final byte[] zza(String str) {
        byte[] bArr;
        byte[] bArrArray;
        String[] strArrSplit = str.split(Global.BLANK);
        int length = strArrSplit.length;
        int i = 4;
        if (length == 1) {
            int iZza = zzazo.zza(strArrSplit[0]);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocate.putInt(iZza);
            bArrArray = byteBufferAllocate.array();
        } else {
            if (length < 5) {
                bArr = new byte[length + length];
                for (int i4 = 0; i4 < strArrSplit.length; i4++) {
                    int iZza2 = zzazo.zza(strArrSplit[i4]);
                    int i6 = (iZza2 >> 16) ^ ((char) iZza2);
                    byte b8 = (byte) i6;
                    byte b10 = (byte) (i6 >> 8);
                    int i10 = i4 + i4;
                    bArr[i10] = new byte[]{b8, b10}[0];
                    bArr[i10 + 1] = b10;
                }
            } else {
                bArr = new byte[length];
                for (int i11 = 0; i11 < strArrSplit.length; i11++) {
                    int iZza3 = zzazo.zza(strArrSplit[i11]);
                    bArr[i11] = (byte) ((iZza3 >> 24) ^ (((iZza3 & 255) ^ ((iZza3 >> 8) & 255)) ^ ((iZza3 >> 16) & 255)));
                }
            }
            bArrArray = bArr;
        }
        this.zzb = zzb();
        synchronized (this.zza) {
            try {
                MessageDigest messageDigest = this.zzb;
                if (messageDigest == null) {
                    return new byte[0];
                }
                messageDigest.reset();
                this.zzb.update(bArrArray);
                byte[] bArrDigest = this.zzb.digest();
                int length2 = bArrDigest.length;
                if (length2 <= 4) {
                    i = length2;
                }
                byte[] bArr2 = new byte[i];
                System.arraycopy(bArrDigest, 0, bArr2, 0, i);
                return bArr2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
