package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdsp implements zzfhi {
    private final zzdsg zzb;
    private final Clock zzc;
    private final Map zza = new HashMap();
    private final Map zzd = new HashMap();

    public zzdsp(zzdsg zzdsgVar, Set set, Clock clock) {
        this.zzb = zzdsgVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzdso zzdsoVar = (zzdso) it.next();
            this.zzd.put(zzdsoVar.zzc(), zzdsoVar);
        }
        this.zzc = clock;
    }

    private final void zze(zzfhb zzfhbVar, boolean z4) {
        zzdso zzdsoVar = (zzdso) this.zzd.get(zzfhbVar);
        if (zzdsoVar == null) {
            return;
        }
        String str = true != z4 ? "f." : "s.";
        Map map = this.zza;
        zzfhb zzfhbVarZzb = zzdsoVar.zzb();
        if (map.containsKey(zzfhbVarZzb)) {
            long jElapsedRealtime = this.zzc.elapsedRealtime() - ((Long) map.get(zzfhbVarZzb)).longValue();
            this.zzb.zzc().put("label.".concat(zzdsoVar.zza()), androidx.media3.datasource.cache.c.j(jElapsedRealtime, str, new StringBuilder(str.length() + String.valueOf(jElapsedRealtime).length())));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfhi
    public final void zzdP(zzfhb zzfhbVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfhi
    public final void zzdQ(zzfhb zzfhbVar, String str) {
        this.zza.put(zzfhbVar, Long.valueOf(this.zzc.elapsedRealtime()));
    }

    @Override // com.google.android.gms.internal.ads.zzfhi
    public final void zzdR(zzfhb zzfhbVar, String str, Throwable th2) {
        Map map = this.zza;
        if (map.containsKey(zzfhbVar)) {
            long jElapsedRealtime = this.zzc.elapsedRealtime() - ((Long) map.get(zzfhbVar)).longValue();
            this.zzb.zzc().put("task.".concat(String.valueOf(str)), "f.".concat(String.valueOf(Long.toString(jElapsedRealtime))));
        }
        if (this.zzd.containsKey(zzfhbVar)) {
            zze(zzfhbVar, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfhi
    public final void zzdS(zzfhb zzfhbVar, String str) {
        Map map = this.zza;
        if (map.containsKey(zzfhbVar)) {
            long jElapsedRealtime = this.zzc.elapsedRealtime() - ((Long) map.get(zzfhbVar)).longValue();
            this.zzb.zzc().put("task.".concat(String.valueOf(str)), "s.".concat(String.valueOf(Long.toString(jElapsedRealtime))));
        }
        if (this.zzd.containsKey(zzfhbVar)) {
            zze(zzfhbVar, true);
        }
    }
}
