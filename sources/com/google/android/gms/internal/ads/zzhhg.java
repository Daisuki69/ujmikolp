package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzhhg {
    private static volatile int zza = 100;
    public static final /* synthetic */ int zzf = 0;
    int zzb;
    int zzc;
    final int zzd = zza;
    Object zze;

    private zzhhg() {
    }

    public static zzhhg zzF(InputStream inputStream, int i) {
        if (inputStream != null) {
            return new zzhhe(inputStream, 4096, null);
        }
        byte[] bArr = zzhiu.zzb;
        int length = bArr.length;
        return zzG(bArr, 0, 0, false);
    }

    public static zzhhg zzG(byte[] bArr, int i, int i4, boolean z4) {
        zzhhc zzhhcVar = new zzhhc(bArr, i, i4, z4, null);
        try {
            zzhhcVar.zzz(i4);
            return zzhhcVar;
        } catch (zzhiw e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int zzK(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static long zzL(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public static int zzM(int i, InputStream inputStream) throws IOException {
        if ((i & 128) == 0) {
            return i;
        }
        int i4 = i & 127;
        int i6 = 7;
        while (i6 < 32) {
            int i10 = inputStream.read();
            if (i10 == -1) {
                throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            i4 |= (i10 & 127) << i6;
            if ((i10 & 128) == 0) {
                return i4;
            }
            i6 += 7;
        }
        while (i6 < 64) {
            int i11 = inputStream.read();
            if (i11 == -1) {
                throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if ((i11 & 128) == 0) {
                return i4;
            }
            i6 += 7;
        }
        throw new zzhiw("CodedInputStream encountered a malformed varint.");
    }

    public abstract void zzA(int i);

    public abstract boolean zzB() throws IOException;

    public abstract int zzC();

    public final void zzH() throws zzhiw {
        if (this.zzb + this.zzc >= this.zzd) {
            throw new zzhiw("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }

    public final void zzI() throws zzhiw {
        if (this.zzc == 0) {
            zzb(0);
        }
    }

    public final void zzJ() throws IOException {
        int iZza;
        do {
            iZza = zza();
            if (iZza == 0) {
                return;
            }
            zzH();
            this.zzc++;
            this.zzc--;
        } while (zzc(iZza));
    }

    public abstract int zza() throws IOException;

    public abstract void zzb(int i) throws zzhiw;

    public abstract boolean zzc(int i) throws IOException;

    public abstract double zzd() throws IOException;

    public abstract float zze() throws IOException;

    public abstract long zzf() throws IOException;

    public abstract long zzg() throws IOException;

    public abstract int zzh() throws IOException;

    public abstract long zzi() throws IOException;

    public abstract int zzj() throws IOException;

    public abstract boolean zzk() throws IOException;

    public abstract String zzl() throws IOException;

    public abstract String zzm() throws IOException;

    public abstract zzhhb zzn() throws IOException;

    public abstract int zzo() throws IOException;

    public abstract int zzp() throws IOException;

    public abstract int zzq() throws IOException;

    public abstract long zzr() throws IOException;

    public abstract int zzs() throws IOException;

    public abstract long zzt() throws IOException;

    public abstract int zzz(int i) throws zzhiw;

    public /* synthetic */ zzhhg(byte[] bArr) {
    }
}
