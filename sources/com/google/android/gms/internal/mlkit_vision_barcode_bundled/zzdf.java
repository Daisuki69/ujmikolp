package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import We.s;
import androidx.camera.core.impl.a;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzdf implements Iterable, Serializable {
    public static final zzdf zzb = new zzde(zzep.zzb);
    private int zza = 0;

    static {
        int i = zzct.zza;
    }

    private static zzdf zzc(Iterator it, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(s.g(i, "length (", ") must be >= 1"));
        }
        if (i == 1) {
            return (zzdf) it.next();
        }
        int i4 = i >>> 1;
        zzdf zzdfVarZzc = zzc(it, i4);
        zzdf zzdfVarZzc2 = zzc(it, i - i4);
        if (Integer.MAX_VALUE - zzdfVarZzc.zzd() >= zzdfVarZzc2.zzd()) {
            return zzgd.zzy(zzdfVarZzc, zzdfVarZzc2);
        }
        throw new IllegalArgumentException(a.c(zzdfVarZzc.zzd(), zzdfVarZzc2.zzd(), "ByteString would be too long: ", "+"));
    }

    public static int zzo(int i, int i4, int i6) {
        int i10 = i4 - i;
        if ((i | i4 | i10 | (i6 - i4)) >= 0) {
            return i10;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(s.g(i, "Beginning index: ", " < 0"));
        }
        if (i4 < i) {
            throw new IndexOutOfBoundsException(a.c(i, i4, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(a.c(i4, i6, "End index: ", " >= "));
    }

    public static zzdf zzr(byte[] bArr, int i, int i4) {
        zzo(i, i + i4, bArr.length);
        byte[] bArr2 = new byte[i4];
        System.arraycopy(bArr, i, bArr2, 0, i4);
        return new zzde(bArr2);
    }

    public static zzdf zzs(InputStream inputStream) throws IOException {
        ArrayList arrayList = new ArrayList();
        int iMin = 256;
        while (true) {
            byte[] bArr = new byte[iMin];
            int i = 0;
            while (i < iMin) {
                int i4 = inputStream.read(bArr, i, iMin - i);
                if (i4 == -1) {
                    break;
                }
                i += i4;
            }
            zzdf zzdfVarZzr = i == 0 ? null : zzr(bArr, 0, i);
            if (zzdfVarZzr == null) {
                break;
            }
            arrayList.add(zzdfVarZzr);
            iMin = Math.min(iMin + iMin, 8192);
        }
        int size = arrayList.size();
        return size == 0 ? zzb : zzc(arrayList.iterator(), size);
    }

    public static void zzu(int i, int i4) {
        if (((i4 - (i + 1)) | i) < 0) {
            if (i >= 0) {
                throw new ArrayIndexOutOfBoundsException(a.c(i, i4, "Index > length: ", ", "));
            }
            throw new ArrayIndexOutOfBoundsException(s.f(i, "Index < 0: "));
        }
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iZzi = this.zza;
        if (iZzi == 0) {
            int iZzd = zzd();
            iZzi = zzi(iZzd, 0, iZzd);
            if (iZzi == 0) {
                iZzi = 1;
            }
            this.zza = iZzi;
        }
        return iZzi;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return s.p(a.r(zzd(), "<ByteString@", hexString, " size=", " contents=\""), zzd() <= 50 ? zzgq.zza(this) : zzgq.zza(zzk(0, 47)).concat("..."), "\">");
    }

    public abstract byte zza(int i);

    public abstract byte zzb(int i);

    public abstract int zzd();

    public abstract void zze(byte[] bArr, int i, int i4, int i6);

    public abstract int zzf();

    public abstract boolean zzh();

    public abstract int zzi(int i, int i4, int i6);

    public abstract int zzj(int i, int i4, int i6);

    public abstract zzdf zzk(int i, int i4);

    public abstract String zzl(Charset charset);

    public abstract void zzm(zzcx zzcxVar) throws IOException;

    public abstract boolean zzn();

    public final int zzp() {
        return this.zza;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: zzq, reason: merged with bridge method [inline-methods] */
    public zzdb iterator() {
        return new zzcy(this);
    }

    public final String zzt() {
        return zzd() == 0 ? "" : zzl(zzep.zza);
    }

    @Deprecated
    public final void zzv(byte[] bArr, int i, int i4, int i6) {
        zzo(0, i6, zzd());
        zzo(i4, i4 + i6, bArr.length);
        if (i6 > 0) {
            zze(bArr, 0, i4, i6);
        }
    }

    public final byte[] zzw() {
        int iZzd = zzd();
        if (iZzd == 0) {
            return zzep.zzb;
        }
        byte[] bArr = new byte[iZzd];
        zze(bArr, 0, 0, iZzd);
        return bArr;
    }
}
