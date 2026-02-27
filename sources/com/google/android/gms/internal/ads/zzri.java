package com.google.android.gms.internal.ads;

import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class zzri extends zzcg {
    private int zzd;
    private boolean zze;
    private int zzf;
    private long zzg;
    private byte[] zzi;
    private byte[] zzl;
    private int zzh = 0;
    private int zzj = 0;
    private int zzk = 0;

    public zzri() {
        byte[] bArr = zzeo.zzb;
        this.zzi = bArr;
        this.zzl = bArr;
    }

    private final void zzs(boolean z4) {
        int i;
        int length;
        int i4 = this.zzk;
        int length2 = this.zzi.length;
        if (i4 != length2) {
            if (!z4) {
                return;
            } else {
                z4 = true;
            }
        }
        if (this.zzh == 0) {
            if (z4) {
                zzu(i4, 3);
                length = i4;
            } else {
                zzghc.zzh(i4 >= (length2 >> 1));
                length = this.zzi.length >> 1;
                zzu(length, 0);
            }
            i = length;
        } else {
            int i6 = length2 >> 1;
            int i10 = i4 - i6;
            if (z4) {
                int iZzt = zzt(i10) + (this.zzi.length >> 1);
                zzu(iZzt, 2);
                int i11 = i6 + i10;
                i = iZzt;
                length = i11;
            } else {
                int iZzt2 = zzt(i10);
                zzu(iZzt2, 1);
                i = iZzt2;
                length = i10;
            }
        }
        if (length % this.zzd != 0) {
            throw new IllegalStateException(zzghs.zzd("bytesConsumed is not aligned to frame size: %s", Integer.valueOf(length)));
        }
        zzghc.zzh(i4 >= i);
        this.zzk -= length;
        int i12 = this.zzj + length;
        this.zzj = i12;
        this.zzj = i12 % this.zzi.length;
        int i13 = this.zzh;
        int i14 = this.zzd;
        this.zzh = (i / i14) + i13;
        this.zzg += (long) ((length - i) / i14);
    }

    private final int zzt(int i) {
        int iZzw = ((zzw(SilenceSkippingAudioProcessor.DEFAULT_MAX_SILENCE_TO_KEEP_DURATION_US) - this.zzh) * this.zzd) - (this.zzi.length >> 1);
        zzghc.zzh(iZzw >= 0);
        int iMin = (int) Math.min((i * 0.2f) + 0.5f, iZzw);
        int i4 = this.zzd;
        return (iMin / i4) * i4;
    }

    private final void zzu(int i, int i4) {
        int i6;
        if (i == 0) {
            return;
        }
        zzghc.zza(this.zzk >= i);
        if (i4 == 2) {
            int i10 = this.zzj;
            int i11 = this.zzk;
            int i12 = i10 + i11;
            byte[] bArr = this.zzi;
            int length = bArr.length;
            if (i12 <= length) {
                System.arraycopy(bArr, i12 - i, this.zzl, 0, i);
            } else {
                int i13 = i11 - (length - i10);
                if (i13 >= i) {
                    System.arraycopy(bArr, i13 - i, this.zzl, 0, i);
                } else {
                    int i14 = i - i13;
                    System.arraycopy(bArr, length - i14, this.zzl, 0, i14);
                    System.arraycopy(this.zzi, 0, this.zzl, i14, i13);
                }
            }
        } else {
            int i15 = this.zzj;
            int i16 = i15 + i;
            byte[] bArr2 = this.zzi;
            int length2 = bArr2.length;
            if (i16 <= length2) {
                System.arraycopy(bArr2, i15, this.zzl, 0, i);
            } else {
                int i17 = length2 - i15;
                System.arraycopy(bArr2, i15, this.zzl, 0, i17);
                System.arraycopy(this.zzi, 0, this.zzl, i17, i - i17);
            }
        }
        zzghc.zzd(i % this.zzd == 0, "sizeToOutput is not aligned to frame size: %s", i);
        zzghc.zzh(this.zzj < this.zzi.length);
        byte[] bArr3 = this.zzl;
        zzghc.zzd(i % this.zzd == 0, "byteOutput size is not aligned to frame size %s", i);
        if (i4 != 3) {
            for (int i18 = 0; i18 < i; i18 += 2) {
                int i19 = i18 + 1;
                int iZzv = zzv(bArr3[i19], bArr3[i18]);
                if (i4 == 0) {
                    i6 = ((((i18 * 1000) / (i - 1)) * (-90)) / 1000) + 100;
                } else {
                    i6 = 10;
                    if (i4 == 2) {
                        i6 = 10 + (((90000 * i18) / (i - 1)) / 1000);
                    }
                }
                int i20 = (iZzv * i6) / 100;
                if (i20 >= 32767) {
                    bArr3[i18] = -1;
                    bArr3[i19] = 127;
                } else if (i20 <= -32768) {
                    bArr3[i18] = 0;
                    bArr3[i19] = -128;
                } else {
                    bArr3[i18] = (byte) (i20 & 255);
                    bArr3[i19] = (byte) (i20 >> 8);
                }
            }
        }
        zzk(i).put(bArr3, 0, i).flip();
    }

    private static int zzv(byte b8, byte b10) {
        return (b8 << 8) | (b10 & 255);
    }

    private final int zzw(long j) {
        return (int) ((j * ((long) this.zzb.zzb)) / 1000000);
    }

    private static final boolean zzx(byte b8, byte b10) {
        return Math.abs(zzv(b8, b10)) > 1024;
    }

    @Override // com.google.android.gms.internal.ads.zzcg, com.google.android.gms.internal.ads.zzcf
    public final boolean zzc() {
        return super.zzc() && this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzcf
    public final void zzd(ByteBuffer byteBuffer) {
        int iLimit;
        int i;
        int iPosition;
        while (byteBuffer.hasRemaining() && !zzl()) {
            if (this.zzf != 0) {
                zzghc.zzh(this.zzj < this.zzi.length);
                int iLimit2 = byteBuffer.limit();
                int iPosition2 = byteBuffer.position() + 1;
                while (true) {
                    if (iPosition2 >= byteBuffer.limit()) {
                        iLimit = byteBuffer.limit();
                        break;
                    } else {
                        if (zzx(byteBuffer.get(iPosition2), byteBuffer.get(iPosition2 - 1))) {
                            int i4 = this.zzd;
                            iLimit = (iPosition2 / i4) * i4;
                            break;
                        }
                        iPosition2 += 2;
                    }
                }
                int iPosition3 = iLimit - byteBuffer.position();
                int i6 = this.zzj;
                int i10 = this.zzk;
                int i11 = i6 + i10;
                int length = this.zzi.length;
                if (i11 < length) {
                    i = length - i11;
                } else {
                    i11 = i10 - (length - i6);
                    i = i6 - i11;
                }
                int iMin = Math.min(iPosition3, i);
                byteBuffer.limit(byteBuffer.position() + iMin);
                byteBuffer.get(this.zzi, i11, iMin);
                int i12 = this.zzk + iMin;
                this.zzk = i12;
                zzghc.zzh(i12 <= this.zzi.length);
                boolean z4 = iLimit < iLimit2 && iPosition3 < i;
                zzs(z4);
                if (z4) {
                    this.zzf = 0;
                    this.zzh = 0;
                }
                byteBuffer.limit(iLimit2);
            } else {
                int iLimit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit3, byteBuffer.position() + this.zzi.length));
                int iLimit4 = byteBuffer.limit() - 1;
                while (true) {
                    if (iLimit4 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    } else {
                        if (zzx(byteBuffer.get(iLimit4), byteBuffer.get(iLimit4 - 1))) {
                            int i13 = this.zzd;
                            iPosition = ((iLimit4 / i13) * i13) + i13;
                            break;
                        }
                        iLimit4 -= 2;
                    }
                }
                if (iPosition == byteBuffer.position()) {
                    this.zzf = 1;
                } else {
                    byteBuffer.limit(Math.min(iPosition, byteBuffer.capacity()));
                    zzk(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(iLimit3);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final zzcc zzm(zzcc zzccVar) throws zzce {
        if (zzccVar.zzd == 2) {
            return zzccVar.zzb == -1 ? zzcc.zza : zzccVar;
        }
        throw new zzce("Unhandled input format:", zzccVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final void zzn() {
        if (this.zzk > 0) {
            zzs(true);
            this.zzh = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final void zzo() {
        if (zzc()) {
            int i = this.zzb.zzc;
            this.zzd = i + i;
            int iZzw = zzw(SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US) / 2;
            int i4 = this.zzd;
            int i6 = (iZzw / i4) * i4;
            int i10 = i6 + i6;
            if (this.zzi.length != i10) {
                this.zzi = new byte[i10];
                this.zzl = new byte[i10];
            }
        }
        this.zzf = 0;
        this.zzg = 0L;
        this.zzh = 0;
        this.zzj = 0;
        this.zzk = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final void zzp() {
        this.zze = false;
        byte[] bArr = zzeo.zzb;
        this.zzi = bArr;
        this.zzl = bArr;
    }

    public final void zzq(boolean z4) {
        this.zze = z4;
    }

    public final long zzr() {
        return this.zzg;
    }
}
