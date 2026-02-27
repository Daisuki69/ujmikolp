package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.ads.AbstractC1173g;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbb implements Serializable, Iterable<Byte> {
    public static final zzbb zzfi = new zzbi(zzci.zzkt);
    private static final zzbf zzfj;
    private int zzfk = 0;

    static {
        zzbc zzbcVar = null;
        zzfj = zzaw.zzx() ? new zzbj(zzbcVar) : new zzbd(zzbcVar);
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

    public static zzbb zzf(String str) {
        return new zzbi(str.getBytes(zzci.UTF_8));
    }

    public static zzbg zzk(int i) {
        return new zzbg(i, null);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iZza = this.zzfk;
        if (iZza == 0) {
            int size = size();
            iZza = zza(size, 0, size);
            if (iZza == 0) {
                iZza = 1;
            }
            this.zzfk = iZza;
        }
        return iZza;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new zzbc(this);
    }

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public abstract int zza(int i, int i4, int i6);

    public abstract zzbb zza(int i, int i4);

    public abstract String zza(Charset charset);

    public abstract void zza(zzba zzbaVar) throws IOException;

    public abstract boolean zzaa();

    public final int zzab() {
        return this.zzfk;
    }

    public abstract byte zzj(int i);

    public final String zzz() {
        return size() == 0 ? "" : zza(zzci.UTF_8);
    }

    public static zzbb zzb(byte[] bArr, int i, int i4) {
        return new zzbi(zzfj.zzc(bArr, i, i4));
    }
}
