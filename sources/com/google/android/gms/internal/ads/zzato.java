package com.google.android.gms.internal.ads;

import androidx.exifinterface.media.ExifInterface;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class zzato extends zzatm {
    public String zza;
    public long zzb;
    public String zzc;
    public String zzd;
    public String zze;

    public zzato() {
        this.zza = ExifInterface.LONGITUDE_EAST;
        this.zzb = -1L;
        this.zzc = ExifInterface.LONGITUDE_EAST;
        this.zzd = ExifInterface.LONGITUDE_EAST;
        this.zze = ExifInterface.LONGITUDE_EAST;
    }

    @Override // com.google.android.gms.internal.ads.zzatm
    public final HashMap zza() {
        HashMap map = new HashMap();
        map.put(0, this.zza);
        map.put(4, this.zze);
        map.put(3, this.zzd);
        map.put(2, this.zzc);
        map.put(1, Long.valueOf(this.zzb));
        return map;
    }

    public zzato(String str) {
        String str2 = ExifInterface.LONGITUDE_EAST;
        this.zza = ExifInterface.LONGITUDE_EAST;
        this.zzb = -1L;
        this.zzc = ExifInterface.LONGITUDE_EAST;
        this.zzd = ExifInterface.LONGITUDE_EAST;
        this.zze = ExifInterface.LONGITUDE_EAST;
        HashMap mapZzb = zzatm.zzb(str);
        if (mapZzb != null) {
            this.zza = mapZzb.get(0) == null ? ExifInterface.LONGITUDE_EAST : (String) mapZzb.get(0);
            this.zzb = mapZzb.get(1) != null ? ((Long) mapZzb.get(1)).longValue() : -1L;
            this.zzc = mapZzb.get(2) == null ? ExifInterface.LONGITUDE_EAST : (String) mapZzb.get(2);
            this.zzd = mapZzb.get(3) == null ? ExifInterface.LONGITUDE_EAST : (String) mapZzb.get(3);
            this.zze = mapZzb.get(4) != null ? (String) mapZzb.get(4) : str2;
        }
    }
}
