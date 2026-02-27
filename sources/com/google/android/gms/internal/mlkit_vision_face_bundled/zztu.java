package com.google.android.gms.internal.mlkit_vision_face_bundled;

import We.s;
import androidx.camera.core.impl.a;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zztu implements Iterable, Serializable {
    public static final zztu zzb = new zztt(zzvc.zzb);
    private int zza = 0;

    static {
        int i = zzti.zza;
    }

    public static int zzh(int i, int i4, int i6) {
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

    public static zztu zzj(byte[] bArr, int i, int i4) {
        zzh(i, i + i4, bArr.length);
        byte[] bArr2 = new byte[i4];
        System.arraycopy(bArr, i, bArr2, 0, i4);
        return new zztt(bArr2);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iZze = this.zza;
        if (iZze == 0) {
            int iZzd = zzd();
            iZze = zze(iZzd, 0, iZzd);
            if (iZze == 0) {
                iZze = 1;
            }
            this.zza = iZze;
        }
        return iZze;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zztn(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return s.p(a.r(zzd(), "<ByteString@", hexString, " size=", " contents=\""), zzd() <= 50 ? zzwt.zza(this) : zzwt.zza(zzf(0, 47)).concat("..."), "\">");
    }

    public abstract byte zza(int i);

    public abstract byte zzb(int i);

    public abstract int zzd();

    public abstract int zze(int i, int i4, int i6);

    public abstract zztu zzf(int i, int i4);

    public abstract void zzg(zztm zztmVar) throws IOException;

    public final int zzi() {
        return this.zza;
    }
}
