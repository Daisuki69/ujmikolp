package com.google.android.gms.internal.vision;

import We.s;
import androidx.camera.core.impl.a;
import com.google.android.gms.internal.ads.AbstractC1173g;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzht implements Serializable, Iterable<Byte> {
    public static final zzht zza = new zzid(zzjf.zzb);
    private static final zzhz zzb;
    private static final Comparator<zzht> zzd;
    private int zzc = 0;

    static {
        zzhs zzhsVar = null;
        zzb = zzhi.zza() ? new zzic(zzhsVar) : new zzhx(zzhsVar);
        zzd = new zzhv();
    }

    public static zzht zza(byte[] bArr, int i, int i4) {
        zzb(i, i + i4, bArr.length);
        return new zzid(zzb.zza(bArr, i, i4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzb(byte b8) {
        return b8 & 255;
    }

    public static zzib zzc(int i) {
        return new zzib(i, null);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iZza = this.zzc;
        if (iZza == 0) {
            int iZza2 = zza();
            iZza = zza(iZza2, 0, iZza2);
            if (iZza == 0) {
                iZza = 1;
            }
            this.zzc = iZza;
        }
        return iZza;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new zzhs(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return s.p(a.r(zza(), "<ByteString@", hexString, " size=", " contents=\""), zza() <= 50 ? zzlq.zza(this) : String.valueOf(zzlq.zza(zza(0, 47))).concat("..."), "\">");
    }

    public abstract byte zza(int i);

    public abstract int zza();

    public abstract int zza(int i, int i4, int i6);

    public abstract zzht zza(int i, int i4);

    public abstract String zza(Charset charset);

    public abstract void zza(zzhq zzhqVar) throws IOException;

    public abstract void zza(byte[] bArr, int i, int i4, int i6);

    public abstract byte zzb(int i);

    public abstract boolean zzc();

    public final int zzd() {
        return this.zzc;
    }

    public static zzht zzb(byte[] bArr, int i, int i4) {
        return new zzhw(bArr, i, i4);
    }

    public static zzht zza(byte[] bArr) {
        return new zzid(bArr);
    }

    public final String zzb() {
        return zza() == 0 ? "" : zza(zzjf.zza);
    }

    public static zzht zza(String str) {
        return new zzid(str.getBytes(zzjf.zza));
    }

    public static int zzb(int i, int i4, int i6) {
        int i10 = i4 - i;
        if ((i | i4 | i10 | (i6 - i4)) >= 0) {
            return i10;
        }
        if (i >= 0) {
            if (i4 < i) {
                throw new IndexOutOfBoundsException(AbstractC1173g.p(66, i, i4, "Beginning index larger than ending index: ", ", "));
            }
            throw new IndexOutOfBoundsException(AbstractC1173g.p(37, i4, i6, "End index: ", " >= "));
        }
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Beginning index: ");
        sb2.append(i);
        sb2.append(" < 0");
        throw new IndexOutOfBoundsException(sb2.toString());
    }
}
