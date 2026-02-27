package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import androidx.exifinterface.media.ExifInterface;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgbe implements zzfqb {
    private final Context zza;
    private final zzgcx zzb;
    private final String zzc;
    private final long zzd;
    private final long zze;

    public zzgbe(Context context, zzfui zzfuiVar, zzgcx zzgcxVar) {
        this.zza = context;
        this.zzc = zzfuiVar.zzb();
        this.zzd = zzfuiVar.zzj();
        this.zze = zzfuiVar.zzk();
        this.zzb = zzgcxVar;
    }

    public final void zza(Map map) {
        S1.y yVar;
        zzast zzastVar;
        map.put("v", this.zzc);
        map.put("t", new Throwable());
        try {
            yVar = (S1.y) map.get("gs");
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused) {
        }
        String strZzb = (yVar == null || (Build.VERSION.SDK_INT >= 31 && !yVar.isDone()) || (zzastVar = (zzast) yVar.get(this.zzd, TimeUnit.MILLISECONDS)) == null || zzastVar.zzb().length() <= 1) ? ExifInterface.LONGITUDE_EAST : zzastVar.zzb();
        if (strZzb.equals(ExifInterface.LONGITUDE_EAST)) {
            try {
                S1.y yVar2 = (S1.y) map.get("ai");
                if (yVar2 != null) {
                    String str = (String) yVar2.get(this.zze, TimeUnit.MILLISECONDS);
                    if (!zzghs.zzc(str)) {
                        strZzb = str;
                    }
                }
            } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused2) {
            }
        }
        map.put("int", strZzb);
    }

    @Override // com.google.android.gms.internal.ads.zzfqb
    public final Map zzb() {
        Map mapZzb = this.zzb.zzb();
        zza(mapZzb);
        return mapZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfqb
    public final Map zzc() {
        Map mapZzc = this.zzb.zzc(this.zza, null);
        zza(mapZzc);
        return mapZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfqb
    public final Map zzd() {
        Map mapZzd = this.zzb.zzd();
        zza(mapZzd);
        return mapZzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfqb
    public final Map zze() {
        HashMap map = new HashMap();
        map.put("t", new Throwable());
        return map;
    }
}
