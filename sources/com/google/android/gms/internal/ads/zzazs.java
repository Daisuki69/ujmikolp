package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public final class zzazs extends zzazk {
    private MessageDigest zzb;
    private final int zzc;
    private final int zzd;

    public zzazs(int i) {
        int i4 = i >> 3;
        this.zzc = (i & 7) > 0 ? i4 + 1 : i4;
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzazk
    public final byte[] zza(String str) {
        synchronized (this.zza) {
            try {
                MessageDigest messageDigestZzb = zzb();
                this.zzb = messageDigestZzb;
                if (messageDigestZzb == null) {
                    return new byte[0];
                }
                messageDigestZzb.reset();
                this.zzb.update(str.getBytes(Charset.forName("UTF-8")));
                byte[] bArrDigest = this.zzb.digest();
                int length = bArrDigest.length;
                int i = this.zzc;
                if (length > i) {
                    length = i;
                }
                byte[] bArr = new byte[length];
                System.arraycopy(bArrDigest, 0, bArr, 0, length);
                int i4 = this.zzd & 7;
                if (i4 > 0) {
                    long j = 0;
                    for (int i6 = 0; i6 < length; i6++) {
                        if (i6 > 0) {
                            j <<= 8;
                        }
                        j += (long) (bArr[i6] & 255);
                    }
                    long j6 = j >>> (8 - i4);
                    while (true) {
                        i--;
                        if (i < 0) {
                            break;
                        }
                        bArr[i] = (byte) (255 & j6);
                        j6 >>>= 8;
                    }
                }
                return bArr;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
