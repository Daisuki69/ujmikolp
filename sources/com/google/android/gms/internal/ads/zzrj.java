package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class zzrj extends zzcg {
    private static final int zzd = Float.floatToIntBits(Float.NaN);

    private static void zzq(int i, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (((double) i) * 4.656612875245797E-10d));
        if (iFloatToIntBits == zzd) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // com.google.android.gms.internal.ads.zzcf
    public final void zzd(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferZzk;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i4 = this.zzb.zzd;
        if (i4 == 21) {
            byteBufferZzk = zzk((i / 3) * 4);
            while (iPosition < iLimit) {
                zzq(((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24), byteBufferZzk);
                iPosition += 3;
            }
        } else if (i4 == 22) {
            byteBufferZzk = zzk(i);
            while (iPosition < iLimit) {
                int i6 = byteBuffer.get(iPosition) & 255;
                int i10 = (byteBuffer.get(iPosition + 1) & 255) << 8;
                zzq(i6 | i10 | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24), byteBufferZzk);
                iPosition += 4;
            }
        } else if (i4 == 1342177280) {
            byteBufferZzk = zzk((i / 3) * 4);
            while (iPosition < iLimit) {
                zzq(((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferZzk);
                iPosition += 3;
            }
        } else {
            if (i4 != 1610612736) {
                throw new IllegalStateException();
            }
            byteBufferZzk = zzk(i);
            while (iPosition < iLimit) {
                int i11 = byteBuffer.get(iPosition + 3) & 255;
                int i12 = (byteBuffer.get(iPosition + 2) & 255) << 8;
                zzq(i11 | i12 | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferZzk);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferZzk.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final zzcc zzm(zzcc zzccVar) throws zzce {
        int i = zzccVar.zzd;
        String str = zzeo.zza;
        if (i == 21 || i == 1342177280 || i == 22 || i == 1610612736) {
            return new zzcc(zzccVar.zzb, zzccVar.zzc, 4);
        }
        if (i == 4) {
            return zzcc.zza;
        }
        throw new zzce("Unhandled input format:", zzccVar);
    }
}
