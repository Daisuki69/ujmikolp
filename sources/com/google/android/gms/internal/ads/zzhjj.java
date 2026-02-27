package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzhjj implements zzhkl {
    private static final zzhjq zzb = new zzhjh();
    private final zzhjq zza;

    public zzhjj() {
        zzhia zzhiaVarZza = zzhia.zza();
        int i = zzhgo.zza;
        zzhji zzhjiVar = new zzhji(zzhiaVarZza, zzb);
        byte[] bArr = zzhiu.zzb;
        this.zza = zzhjiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhkl
    public final zzhkk zza(Class cls) {
        int i = zzhkm.zza;
        if (!zzhih.class.isAssignableFrom(cls)) {
            int i4 = zzhgo.zza;
        }
        zzhjp zzhjpVarZzc = this.zza.zzc(cls);
        if (zzhjpVarZzc.zza()) {
            int i6 = zzhgo.zza;
            return zzhjw.zzh(zzhkm.zzF(), zzhhu.zza(), zzhjpVarZzc.zzb());
        }
        int i10 = zzhgo.zza;
        return zzhjv.zzm(cls, zzhjpVarZzc, zzhjz.zza(), zzhjf.zza(), zzhkm.zzF(), zzhjpVarZzc.zzc() + (-1) != 1 ? zzhhu.zza() : null, zzhjo.zza());
    }
}
