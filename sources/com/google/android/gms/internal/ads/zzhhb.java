package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzhhb implements Iterable<Byte>, Serializable {
    public static final zzhhb zzb = new zzhgz(zzhiu.zzb);
    private int zza = 0;

    static {
        int i = zzhgo.zza;
    }

    public static int zzA(int i, int i4, int i6) {
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

    private static zzhhb zzd(Iterator it, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(We.s.g(i, "length (", ") must be >= 1"));
        }
        if (i == 1) {
            return (zzhhb) it.next();
        }
        int i4 = i >>> 1;
        zzhhb zzhhbVarZzd = zzd(it, i4);
        zzhhb zzhhbVarZzd2 = zzd(it, i - i4);
        if (Integer.MAX_VALUE - zzhhbVarZzd.zzc() >= zzhhbVarZzd2.zzc()) {
            return zzhkj.zzd(zzhhbVarZzd, zzhhbVarZzd2);
        }
        int iZzc = zzhhbVarZzd.zzc();
        int iZzc2 = zzhhbVarZzd2.zzc();
        throw new IllegalArgumentException(androidx.media3.datasource.cache.c.n(new StringBuilder(String.valueOf(iZzc).length() + 31 + String.valueOf(iZzc2).length()), "ByteString would be too long: ", iZzc, "+", iZzc2));
    }

    public static zzhhb zzr(byte[] bArr, int i, int i4) {
        zzA(i, i + i4, bArr.length);
        byte[] bArr2 = new byte[i4];
        System.arraycopy(bArr, i, bArr2, 0, i4);
        return new zzhgz(bArr2);
    }

    public static zzhhb zzs(String str) {
        return new zzhgz(str.getBytes(zzhiu.zza));
    }

    public static zzhhb zzt(Iterable iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = ((Collection) iterable).size();
        } else {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? zzb : zzd(iterable.iterator(), size);
    }

    public static zzhha zzx() {
        return new zzhha(128);
    }

    public static void zzz(int i, int i4) {
        if (((i4 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(androidx.camera.core.impl.a.o(new StringBuilder(String.valueOf(i).length() + 11), "Index < 0: ", i));
            }
            throw new ArrayIndexOutOfBoundsException(androidx.media3.datasource.cache.c.n(new StringBuilder(String.valueOf(i).length() + 18 + String.valueOf(i4).length()), "Index > length: ", i, ", ", i4));
        }
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iZzo = this.zza;
        if (iZzo == 0) {
            int iZzc = zzc();
            iZzo = zzo(iZzc, 0, iZzc);
            if (iZzo == 0) {
                iZzo = 1;
            }
            this.zza = iZzo;
        }
        return iZzo;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return We.s.p(androidx.camera.core.impl.a.r(zzc(), "<ByteString@", hexString, " size=", " contents=\""), zzc() <= 50 ? zzhkt.zza(this) : zzhkt.zza(zzi(0, 47)).concat("..."), "\">");
    }

    public abstract byte zza(int i);

    public abstract byte zzb(int i);

    public abstract int zzc();

    public abstract void zze(byte[] bArr, int i, int i4, int i6);

    public abstract int zzf();

    public abstract boolean zzg();

    public abstract zzhhb zzi(int i, int i4);

    public abstract ByteBuffer zzj();

    public abstract void zzk(zzhgs zzhgsVar) throws IOException;

    public abstract String zzl(Charset charset);

    public abstract boolean zzm();

    public abstract int zzn(int i, int i4, int i6);

    public abstract int zzo(int i, int i4, int i6);

    public abstract zzhhg zzp();

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: zzq, reason: merged with bridge method [inline-methods] */
    public zzhgw iterator() {
        return new zzhgt(this);
    }

    @Deprecated
    public final void zzu(byte[] bArr, int i, int i4, int i6) {
        zzA(0, i6, zzc());
        zzA(i4, i4 + i6, bArr.length);
        if (i6 > 0) {
            zze(bArr, 0, i4, i6);
        }
    }

    public final byte[] zzv() {
        int iZzc = zzc();
        if (iZzc == 0) {
            return zzhiu.zzb;
        }
        byte[] bArr = new byte[iZzc];
        zze(bArr, 0, 0, iZzc);
        return bArr;
    }

    public final String zzw() {
        return zzc() == 0 ? "" : zzl(zzhiu.zza);
    }

    public final int zzy() {
        return this.zza;
    }
}
