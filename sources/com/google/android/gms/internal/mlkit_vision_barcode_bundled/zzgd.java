package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class zzgd extends zzdf {
    static final int[] zza = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private final int zzc;
    private final zzdf zzd;
    private final zzdf zze;
    private final int zzf;
    private final int zzg;

    public static int zzc(int i) {
        int[] iArr = zza;
        int length = iArr.length;
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    public static zzdf zzy(zzdf zzdfVar, zzdf zzdfVar2) {
        if (zzdfVar2.zzd() == 0) {
            return zzdfVar;
        }
        if (zzdfVar.zzd() == 0) {
            return zzdfVar2;
        }
        int iZzd = zzdfVar2.zzd() + zzdfVar.zzd();
        if (iZzd < 128) {
            return zzz(zzdfVar, zzdfVar2);
        }
        if (zzdfVar instanceof zzgd) {
            zzgd zzgdVar = (zzgd) zzdfVar;
            if (zzdfVar2.zzd() + zzgdVar.zze.zzd() < 128) {
                return new zzgd(zzgdVar.zzd, zzz(zzgdVar.zze, zzdfVar2));
            }
            if (zzgdVar.zzd.zzf() > zzgdVar.zze.zzf() && zzgdVar.zzg > zzdfVar2.zzf()) {
                return new zzgd(zzgdVar.zzd, new zzgd(zzgdVar.zze, zzdfVar2));
            }
        }
        return iZzd >= zzc(Math.max(zzdfVar.zzf(), zzdfVar2.zzf()) + 1) ? new zzgd(zzdfVar, zzdfVar2) : zzfz.zza(new zzfz(null), zzdfVar, zzdfVar2);
    }

    private static zzdf zzz(zzdf zzdfVar, zzdf zzdfVar2) {
        int iZzd = zzdfVar.zzd();
        int iZzd2 = zzdfVar2.zzd();
        byte[] bArr = new byte[iZzd + iZzd2];
        zzdfVar.zzv(bArr, 0, 0, iZzd);
        zzdfVar2.zzv(bArr, 0, iZzd, iZzd2);
        return new zzde(bArr);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzdf)) {
            return false;
        }
        zzdf zzdfVar = (zzdf) obj;
        if (this.zzc != zzdfVar.zzd()) {
            return false;
        }
        if (this.zzc == 0) {
            return true;
        }
        int iZzp = zzp();
        int iZzp2 = zzdfVar.zzp();
        if (iZzp != 0 && iZzp2 != 0 && iZzp != iZzp2) {
            return false;
        }
        zzga zzgaVar = null;
        zzgb zzgbVar = new zzgb(this, zzgaVar);
        zzdd zzddVarZza = zzgbVar.next();
        zzgb zzgbVar2 = new zzgb(zzdfVar, zzgaVar);
        zzdd zzddVarZza2 = zzgbVar2.next();
        int i = 0;
        int i4 = 0;
        int i6 = 0;
        while (true) {
            int iZzd = zzddVarZza.zzd() - i;
            int iZzd2 = zzddVarZza2.zzd() - i4;
            int iMin = Math.min(iZzd, iZzd2);
            if (!(i == 0 ? zzddVarZza.zzg(zzddVarZza2, i4, iMin) : zzddVarZza2.zzg(zzddVarZza, i, iMin))) {
                return false;
            }
            i6 += iMin;
            int i10 = this.zzc;
            if (i6 >= i10) {
                if (i6 == i10) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == iZzd) {
                zzddVarZza = zzgbVar.next();
                i = 0;
            } else {
                i += iMin;
                zzddVarZza = zzddVarZza;
            }
            if (iMin == iZzd2) {
                zzddVarZza2 = zzgbVar2.next();
                i4 = 0;
            } else {
                i4 += iMin;
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzfx(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final byte zza(int i) {
        zzdf.zzu(i, this.zzc);
        return zzb(i);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final byte zzb(int i) {
        int i4 = this.zzf;
        return i < i4 ? this.zzd.zzb(i) : this.zze.zzb(i - i4);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final void zze(byte[] bArr, int i, int i4, int i6) {
        int i10 = i + i6;
        int i11 = this.zzf;
        if (i10 <= i11) {
            this.zzd.zze(bArr, i, i4, i6);
        } else {
            if (i >= i11) {
                this.zze.zze(bArr, i - i11, i4, i6);
                return;
            }
            int i12 = i11 - i;
            this.zzd.zze(bArr, i, i4, i12);
            this.zze.zze(bArr, 0, i4 + i12, i6 - i12);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final int zzf() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final boolean zzh() {
        return this.zzc >= zzc(this.zzg);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final int zzi(int i, int i4, int i6) {
        int i10 = i4 + i6;
        int i11 = this.zzf;
        if (i10 <= i11) {
            return this.zzd.zzi(i, i4, i6);
        }
        if (i4 >= i11) {
            return this.zze.zzi(i, i4 - i11, i6);
        }
        int i12 = i11 - i4;
        return this.zze.zzi(this.zzd.zzi(i, i4, i12), 0, i6 - i12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final int zzj(int i, int i4, int i6) {
        int i10 = i4 + i6;
        int i11 = this.zzf;
        if (i10 <= i11) {
            return this.zzd.zzj(i, i4, i6);
        }
        if (i4 >= i11) {
            return this.zze.zzj(i, i4 - i11, i6);
        }
        int i12 = i11 - i4;
        return this.zze.zzj(this.zzd.zzj(i, i4, i12), 0, i6 - i12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final zzdf zzk(int i, int i4) {
        int iZzo = zzdf.zzo(i, i4, this.zzc);
        if (iZzo == 0) {
            return zzdf.zzb;
        }
        if (iZzo == this.zzc) {
            return this;
        }
        int i6 = this.zzf;
        if (i4 <= i6) {
            return this.zzd.zzk(i, i4);
        }
        if (i >= i6) {
            return this.zze.zzk(i - i6, i4 - i6);
        }
        zzdf zzdfVar = this.zzd;
        return new zzgd(zzdfVar.zzk(i, zzdfVar.zzd()), this.zze.zzk(0, i4 - this.zzf));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final String zzl(Charset charset) {
        return new String(zzw(), charset);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final void zzm(zzcx zzcxVar) throws IOException {
        this.zzd.zzm(zzcxVar);
        this.zze.zzm(zzcxVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final boolean zzn() {
        zzdf zzdfVar = this.zzd;
        zzdf zzdfVar2 = this.zze;
        return zzdfVar2.zzj(zzdfVar.zzj(0, 0, this.zzf), 0, zzdfVar2.zzd()) == 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    /* JADX INFO: renamed from: zzq */
    public final zzdb iterator() {
        return new zzfx(this);
    }

    private zzgd(zzdf zzdfVar, zzdf zzdfVar2) {
        this.zzd = zzdfVar;
        this.zze = zzdfVar2;
        int iZzd = zzdfVar.zzd();
        this.zzf = iZzd;
        this.zzc = zzdfVar2.zzd() + iZzd;
        this.zzg = Math.max(zzdfVar.zzf(), zzdfVar2.zzf()) + 1;
    }
}
