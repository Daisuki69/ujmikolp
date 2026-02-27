package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzhhm extends zzhgs {
    private static final Logger zza = Logger.getLogger(zzhhm.class.getName());
    private static final boolean zzb = zzhlc.zza();
    public static final /* synthetic */ int zzf = 0;
    Object zze;

    private zzhhm() {
        throw null;
    }

    public static int zzA(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int zzB(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int zzC(String str) {
        int length;
        try {
            length = zzhlh.zzc(str);
        } catch (zzhlg unused) {
            length = str.getBytes(zzhiu.zza).length;
        }
        return zzA(length) + length;
    }

    public static int zzD(zzhjs zzhjsVar) {
        int iZzbr = zzhjsVar.zzbr();
        return zzA(iZzbr) + iZzbr;
    }

    public static int zzz(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    public final void zzE() {
        if (zzb() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzF(String str, zzhlg zzhlgVar) throws IOException {
        zza.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzhlgVar);
        byte[] bytes = str.getBytes(zzhiu.zza);
        try {
            int length = bytes.length;
            zzs(length);
            zza(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzhhk(e);
        }
    }

    public abstract void zzJ(int i, int i4) throws IOException;

    public abstract void zzK(int i, int i4) throws IOException;

    public abstract void zzL(int i, int i4) throws IOException;

    public abstract void zzM(int i, int i4) throws IOException;

    public abstract void zzN(int i, long j) throws IOException;

    @Override // com.google.android.gms.internal.ads.zzhgs
    public abstract void zza(byte[] bArr, int i, int i4) throws IOException;

    public abstract int zzb();

    public abstract void zzh(int i, long j) throws IOException;

    public abstract void zzi(int i, boolean z4) throws IOException;

    public abstract void zzj(int i, String str) throws IOException;

    public abstract void zzk(int i, zzhhb zzhhbVar) throws IOException;

    public abstract void zzl(zzhhb zzhhbVar) throws IOException;

    public abstract void zzm(byte[] bArr, int i, int i4) throws IOException;

    public abstract void zzn(int i, zzhjs zzhjsVar) throws IOException;

    public abstract void zzo(int i, zzhhb zzhhbVar) throws IOException;

    public abstract void zzp(zzhjs zzhjsVar) throws IOException;

    public abstract void zzq(byte b8) throws IOException;

    public abstract void zzr(int i) throws IOException;

    public abstract void zzs(int i) throws IOException;

    public abstract void zzt(int i) throws IOException;

    public abstract void zzu(long j) throws IOException;

    public abstract void zzv(long j) throws IOException;

    public abstract void zzx(String str) throws IOException;

    public abstract void zzy() throws IOException;

    public /* synthetic */ zzhhm(byte[] bArr) {
    }
}
