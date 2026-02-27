package com.google.android.gms.internal.measurement;

import We.s;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzlh implements Iterable, Serializable {
    public static final zzlh zzb = new zzlg(zzmp.zzb);
    private int zza = 0;

    static {
        int i = zzkv.zza;
    }

    public static zzlh zzh(byte[] bArr, int i, int i4) {
        zzj(i, i + i4, bArr.length);
        byte[] bArr2 = new byte[i4];
        System.arraycopy(bArr, i, bArr2, 0, i4);
        return new zzlg(bArr2);
    }

    public static int zzj(int i, int i4, int i6) {
        int i10 = i4 - i;
        if ((i | i4 | i10 | (i6 - i4)) >= 0) {
            return i10;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(androidx.media3.datasource.cache.c.m(new StringBuilder(String.valueOf(i).length() + 21), "Beginning index: ", i, " < 0"));
        }
        if (i4 < i) {
            throw new IndexOutOfBoundsException(androidx.media3.datasource.cache.c.n(new StringBuilder(String.valueOf(i).length() + 44 + String.valueOf(i4).length()), "Beginning index larger than ending index: ", i, ", ", i4));
        }
        throw new IndexOutOfBoundsException(androidx.media3.datasource.cache.c.n(new StringBuilder(String.valueOf(i4).length() + 15 + String.valueOf(i6).length()), "End index: ", i4, " >= ", i6));
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iZzg = this.zza;
        if (iZzg == 0) {
            int iZzc = zzc();
            iZzg = zzg(iZzc, 0, iZzc);
            if (iZzg == 0) {
                iZzg = 1;
            }
            this.zza = iZzg;
        }
        return iZzg;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzla(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return s.p(androidx.camera.core.impl.a.r(zzc(), "<ByteString@", hexString, " size=", " contents=\""), zzc() <= 50 ? zzog.zza(this) : zzog.zza(zze(0, 47)).concat("..."), "\">");
    }

    public abstract byte zza(int i);

    public abstract byte zzb(int i);

    public abstract int zzc();

    public abstract zzlh zze(int i, int i4);

    public abstract void zzf(zzkz zzkzVar) throws IOException;

    public abstract int zzg(int i, int i4, int i6);

    public final int zzi() {
        return this.zza;
    }
}
