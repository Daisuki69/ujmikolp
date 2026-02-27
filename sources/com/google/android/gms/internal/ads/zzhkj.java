package com.google.android.gms.internal.ads;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class zzhkj extends zzhhb {
    static final int[] zza = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private final int zzc;
    private final zzhhb zzd;
    private final zzhhb zze;
    private final int zzf;
    private final int zzg;

    public /* synthetic */ zzhkj(zzhhb zzhhbVar, zzhhb zzhhbVar2, byte[] bArr) {
        this(zzhhbVar, zzhhbVar2);
    }

    private static zzhhb zzD(zzhhb zzhhbVar, zzhhb zzhhbVar2) {
        int iZzc = zzhhbVar.zzc();
        int iZzc2 = zzhhbVar2.zzc();
        byte[] bArr = new byte[iZzc + iZzc2];
        zzhhbVar.zzu(bArr, 0, 0, iZzc);
        zzhhbVar2.zzu(bArr, 0, iZzc, iZzc2);
        return new zzhgz(bArr);
    }

    public static zzhhb zzd(zzhhb zzhhbVar, zzhhb zzhhbVar2) {
        if (zzhhbVar2.zzc() == 0) {
            return zzhhbVar;
        }
        if (zzhhbVar.zzc() == 0) {
            return zzhhbVar2;
        }
        int iZzc = zzhhbVar2.zzc() + zzhhbVar.zzc();
        if (iZzc < 128) {
            return zzD(zzhhbVar, zzhhbVar2);
        }
        if (zzhhbVar instanceof zzhkj) {
            zzhkj zzhkjVar = (zzhkj) zzhhbVar;
            zzhhb zzhhbVar3 = zzhkjVar.zze;
            if (zzhhbVar2.zzc() + zzhhbVar3.zzc() < 128) {
                return new zzhkj(zzhkjVar.zzd, zzD(zzhhbVar3, zzhhbVar2));
            }
            zzhhb zzhhbVar4 = zzhkjVar.zzd;
            if (zzhhbVar4.zzf() > zzhhbVar3.zzf() && zzhkjVar.zzg > zzhhbVar2.zzf()) {
                return new zzhkj(zzhhbVar4, new zzhkj(zzhhbVar3, zzhhbVar2));
            }
        }
        return iZzc >= zzh(Math.max(zzhhbVar.zzf(), zzhhbVar2.zzf()) + 1) ? new zzhkj(zzhhbVar, zzhhbVar2) : zzhkh.zza(zzhhbVar, zzhhbVar2, new ArrayDeque());
    }

    public static int zzh(int i) {
        int[] iArr = zza;
        int length = iArr.length;
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzhhb)) {
            return false;
        }
        zzhhb zzhhbVar = (zzhhb) obj;
        int i = this.zzc;
        if (i != zzhhbVar.zzc()) {
            return false;
        }
        if (i == 0) {
            return true;
        }
        int iZzy = zzy();
        int iZzy2 = zzhhbVar.zzy();
        if (iZzy != 0 && iZzy2 != 0 && iZzy != iZzy2) {
            return false;
        }
        byte[] bArr = null;
        zzhki zzhkiVar = new zzhki(this, bArr);
        zzhgy zzhgyVarZza = zzhkiVar.next();
        zzhki zzhkiVar2 = new zzhki(zzhhbVar, bArr);
        zzhgy zzhgyVarZza2 = zzhkiVar2.next();
        int i4 = 0;
        int i6 = 0;
        int i10 = 0;
        while (true) {
            int iZzc = zzhgyVarZza.zzc() - i4;
            int iZzc2 = zzhgyVarZza2.zzc() - i6;
            int iMin = Math.min(iZzc, iZzc2);
            if (!(i4 == 0 ? zzhgyVarZza.zzh(zzhgyVarZza2, i6, iMin) : zzhgyVarZza2.zzh(zzhgyVarZza, i4, iMin))) {
                return false;
            }
            i10 += iMin;
            if (i10 >= i) {
                if (i10 == i) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == iZzc) {
                zzhgyVarZza = zzhkiVar.next();
                i4 = 0;
            } else {
                i4 += iMin;
                zzhgyVarZza = zzhgyVarZza;
            }
            if (iMin == iZzc2) {
                zzhgyVarZza2 = zzhkiVar2.next();
                i6 = 0;
            } else {
                i6 += iMin;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhhb, java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return new zzhkg(this);
    }

    public final /* synthetic */ zzhhb zzB() {
        return this.zzd;
    }

    public final /* synthetic */ zzhhb zzC() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    public final byte zza(int i) {
        zzhhb.zzz(i, this.zzc);
        return zzb(i);
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    public final byte zzb(int i) {
        int i4 = this.zzf;
        return i < i4 ? this.zzd.zzb(i) : this.zze.zzb(i - i4);
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
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

    @Override // com.google.android.gms.internal.ads.zzhhb
    public final int zzf() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    public final boolean zzg() {
        return this.zzc >= zzh(this.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    public final zzhhb zzi(int i, int i4) {
        int i6 = this.zzc;
        int iZzA = zzhhb.zzA(i, i4, i6);
        if (iZzA == 0) {
            return zzhhb.zzb;
        }
        if (iZzA == i6) {
            return this;
        }
        int i10 = this.zzf;
        if (i4 <= i10) {
            return this.zzd.zzi(i, i4);
        }
        int i11 = i4 - i10;
        if (i >= i10) {
            return this.zze.zzi(i - i10, i11);
        }
        zzhhb zzhhbVar = this.zzd;
        return new zzhkj(zzhhbVar.zzi(i, zzhhbVar.zzc()), this.zze.zzi(0, i11));
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    public final ByteBuffer zzj() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    public final void zzk(zzhgs zzhgsVar) throws IOException {
        this.zzd.zzk(zzhgsVar);
        this.zze.zzk(zzhgsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    public final String zzl(Charset charset) {
        return new String(zzv(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    public final boolean zzm() {
        zzhhb zzhhbVar = this.zzd;
        zzhhb zzhhbVar2 = this.zze;
        return zzhhbVar2.zzn(zzhhbVar.zzn(0, 0, this.zzf), 0, zzhhbVar2.zzc()) == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    public final int zzn(int i, int i4, int i6) {
        int i10 = i4 + i6;
        int i11 = this.zzf;
        if (i10 <= i11) {
            return this.zzd.zzn(i, i4, i6);
        }
        if (i4 >= i11) {
            return this.zze.zzn(i, i4 - i11, i6);
        }
        int i12 = i11 - i4;
        return this.zze.zzn(this.zzd.zzn(i, i4, i12), 0, i6 - i12);
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    public final int zzo(int i, int i4, int i6) {
        int i10 = i4 + i6;
        int i11 = this.zzf;
        if (i10 <= i11) {
            return this.zzd.zzo(i, i4, i6);
        }
        if (i4 >= i11) {
            return this.zze.zzo(i, i4 - i11, i6);
        }
        int i12 = i11 - i4;
        return this.zze.zzo(this.zzd.zzo(i, i4, i12), 0, i6 - i12);
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    public final zzhhg zzp() {
        ArrayList<ByteBuffer> arrayList = new ArrayList();
        byte[] bArr = null;
        zzhki zzhkiVar = new zzhki(this, bArr);
        while (zzhkiVar.hasNext()) {
            arrayList.add(zzhkiVar.next().zzj());
        }
        int i = 0;
        int iRemaining = 0;
        for (ByteBuffer byteBuffer : arrayList) {
            iRemaining += byteBuffer.remaining();
            i = byteBuffer.hasArray() ? i | 1 : byteBuffer.isDirect() ? i | 2 : i | 4;
        }
        return i == 2 ? new zzhhd(arrayList, iRemaining, true, bArr) : zzhhg.zzF(new zzhix(arrayList), 4096);
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    /* JADX INFO: renamed from: zzq */
    public final zzhgw iterator() {
        return new zzhkg(this);
    }

    private zzhkj(zzhhb zzhhbVar, zzhhb zzhhbVar2) {
        this.zzd = zzhhbVar;
        this.zze = zzhhbVar2;
        int iZzc = zzhhbVar.zzc();
        this.zzf = iZzc;
        this.zzc = zzhhbVar2.zzc() + iZzc;
        this.zzg = Math.max(zzhhbVar.zzf(), zzhhbVar2.zzf()) + 1;
    }
}
