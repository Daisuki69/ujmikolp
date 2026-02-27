package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhgj;
import com.google.android.gms.internal.ads.zzhgk;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzhgk<MessageType extends zzhgk<MessageType, BuilderType>, BuilderType extends zzhgj<MessageType, BuilderType>> implements zzhjs {
    protected int zzq = 0;

    public static void zzaV(zzhhb zzhhbVar) throws IllegalArgumentException {
        if (!zzhhbVar.zzm()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    public static <T> void zzaW(Iterable<T> iterable, List<? super T> list) {
        zzhgj.zzaT(iterable, list);
    }

    private String zzdZ(String str) {
        String name = getClass().getName();
        StringBuilder sb2 = new StringBuilder(name.length() + 18 + String.valueOf(str).length() + 44);
        androidx.media3.datasource.cache.c.A(sb2, "Serializing ", name, " to a ", str);
        sb2.append(" threw an IOException (should never happen).");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhjs
    public zzhhb zzaM() {
        try {
            int iZzbr = zzbr();
            zzhhb zzhhbVar = zzhhb.zzb;
            byte[] bArr = new byte[iZzbr];
            int i = zzhhm.zzf;
            zzhhj zzhhjVar = new zzhhj(bArr, 0, iZzbr);
            zzdc(zzhhjVar);
            return zzhgx.zza(zzhhjVar, bArr);
        } catch (IOException e) {
            throw new RuntimeException(zzdZ("ByteString"), e);
        }
    }

    public byte[] zzaN() {
        try {
            int iZzbr = zzbr();
            byte[] bArr = new byte[iZzbr];
            int i = zzhhm.zzf;
            zzhhj zzhhjVar = new zzhhj(bArr, 0, iZzbr);
            zzdc(zzhhjVar);
            zzhhjVar.zzE();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(zzdZ("byte array"), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhjs
    public void zzaO(OutputStream outputStream) throws IOException {
        zzhhl zzhhlVar = new zzhhl(outputStream, zzhhm.zzz(zzbr()));
        zzdc(zzhhlVar);
        zzhhlVar.zzy();
    }

    public void zzaP(OutputStream outputStream) throws IOException {
        int iZzbr = zzbr();
        zzhhl zzhhlVar = new zzhhl(outputStream, zzhhm.zzz(zzhhm.zzA(iZzbr) + iZzbr));
        zzhhlVar.zzs(iZzbr);
        zzdc(zzhhlVar);
        zzhhlVar.zzy();
    }

    public int zzaQ() {
        throw new UnsupportedOperationException();
    }

    public void zzaR(int i) {
        throw new UnsupportedOperationException();
    }

    public zzhjx zzaS() {
        throw new UnsupportedOperationException("mutableCopy() is not implemented.");
    }

    public int zzaT(zzhkk zzhkkVar) {
        return zzaQ();
    }

    public zzhku zzaU() {
        return new zzhku(this);
    }
}
