package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzib extends zzmf implements zznn {
    private static final zzib zzh;
    private int zzb;
    private zzmo zzd = zzmf.zzcv();
    private String zze = "";
    private String zzf = "";
    private int zzg;

    static {
        zzib zzibVar = new zzib();
        zzh = zzibVar;
        zzmf.zzcp(zzib.class, zzibVar);
    }

    private zzib() {
    }

    public static zzhz zzh() {
        return (zzhz) zzh.zzck();
    }

    public static zzhz zzi(zzib zzibVar) {
        zzmb zzmbVarZzck = zzh.zzck();
        zzmbVarZzck.zzbd(zzibVar);
        return (zzhz) zzmbVarZzck;
    }

    private final void zzr() {
        zzmo zzmoVar = this.zzd;
        if (zzmoVar.zza()) {
            return;
        }
        this.zzd = zzmf.zzcw(zzmoVar);
    }

    public final List zza() {
        return this.zzd;
    }

    public final int zzb() {
        return this.zzd.size();
    }

    public final zzid zzc(int i) {
        return (zzid) this.zzd.get(i);
    }

    public final boolean zzd() {
        return (this.zzb & 1) != 0;
    }

    public final String zze() {
        return this.zze;
    }

    public final boolean zzf() {
        return (this.zzb & 2) != 0;
    }

    public final String zzg() {
        return this.zzf;
    }

    public final /* synthetic */ void zzj(int i, zzid zzidVar) {
        zzidVar.getClass();
        zzr();
        this.zzd.set(i, zzidVar);
    }

    public final /* synthetic */ void zzk(zzid zzidVar) {
        zzidVar.getClass();
        zzr();
        this.zzd.add(zzidVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzmf
    public final Object zzl(int i, Object obj, Object obj2) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return zzmf.zzcq(zzh, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zzb", "zzd", zzid.class, "zze", "zzf", "zzg", zzia.zza});
        }
        if (i4 == 3) {
            return new zzib();
        }
        byte[] bArr = null;
        if (i4 == 4) {
            return new zzhz(bArr);
        }
        if (i4 == 5) {
            return zzh;
        }
        throw null;
    }

    public final /* synthetic */ void zzm(Iterable iterable) {
        zzr();
        zzks.zzce(iterable, this.zzd);
    }

    public final /* synthetic */ void zzn() {
        this.zzd = zzmf.zzcv();
    }

    public final /* synthetic */ void zzo(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void zzp(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }
}
