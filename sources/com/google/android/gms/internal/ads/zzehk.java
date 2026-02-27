package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.dynatrace.android.agent.Global;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzehk {
    private final Clock zza;
    private final zzehm zzb;
    private final zzfjv zzc;

    @GuardedBy("this")
    private final LinkedHashMap zzd = new LinkedHashMap();
    private final boolean zze = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhk)).booleanValue();
    private final zzeee zzf;
    private boolean zzg;
    private long zzh;
    private long zzi;

    public zzehk(Clock clock, zzehm zzehmVar, zzeee zzeeeVar, zzfjv zzfjvVar) {
        this.zza = clock;
        this.zzb = zzehmVar;
        this.zzf = zzeeeVar;
        this.zzc = zzfjvVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzq, reason: merged with bridge method [inline-methods] */
    public final synchronized boolean zzi(zzfcj zzfcjVar) {
        zzehj zzehjVar = (zzehj) this.zzd.get(zzfcjVar);
        if (zzehjVar == null) {
            return false;
        }
        return zzehjVar.zzc == 8;
    }

    public final synchronized void zza() {
        this.zzi = this.zza.elapsedRealtime();
    }

    public final synchronized void zzb() {
        this.zzh = this.zza.elapsedRealtime() - this.zzi;
    }

    public final synchronized void zzc(List list) {
        this.zzi = this.zza.elapsedRealtime();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfcj zzfcjVar = (zzfcj) it.next();
            String str = zzfcjVar.zzw;
            if (!TextUtils.isEmpty(str)) {
                this.zzd.put(zzfcjVar, new zzehj(str, zzfcjVar.zzaf, Integer.MAX_VALUE, 0L, null));
            }
        }
    }

    public final synchronized void zzd(@Nullable zzfcj zzfcjVar) {
        try {
            this.zzh = this.zza.elapsedRealtime() - this.zzi;
            if (zzfcjVar != null) {
                this.zzf.zzi(zzfcjVar);
            }
            this.zzg = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized S1.y zze(zzfcu zzfcuVar, zzfcj zzfcjVar, S1.y yVar, zzfjr zzfjrVar) {
        zzfcm zzfcmVar = zzfcuVar.zzb.zzb;
        long jElapsedRealtime = this.zza.elapsedRealtime();
        String str = zzfcjVar.zzw;
        if (str != null) {
            this.zzd.put(zzfcjVar, new zzehj(str, zzfcjVar.zzaf, 9, 0L, null));
            zzgot.zzq(yVar, new zzehi(this, jElapsedRealtime, zzfcmVar, zzfcjVar, str, zzfjrVar, zzfcuVar), zzbzh.zzg);
        }
        return yVar;
    }

    public final synchronized void zzf(zzfcj zzfcjVar) {
        zzehj zzehjVar = (zzehj) this.zzd.get(zzfcjVar);
        if (zzehjVar == null || this.zzg) {
            return;
        }
        zzehjVar.zzc = 8;
    }

    public final synchronized String zzg() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.zzd.entrySet().iterator();
            while (it.hasNext()) {
                zzehj zzehjVar = (zzehj) ((Map.Entry) it.next()).getValue();
                if (zzehjVar.zzc != Integer.MAX_VALUE) {
                    arrayList.add(zzehjVar.toString());
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return TextUtils.join(Global.UNDERSCORE, arrayList);
    }

    public final synchronized long zzh() {
        return this.zzh;
    }

    public final /* synthetic */ Clock zzj() {
        return this.zza;
    }

    public final /* synthetic */ zzehm zzk() {
        return this.zzb;
    }

    public final /* synthetic */ zzfjv zzl() {
        return this.zzc;
    }

    public final /* synthetic */ LinkedHashMap zzm() {
        return this.zzd;
    }

    public final /* synthetic */ boolean zzn() {
        return this.zze;
    }

    public final /* synthetic */ zzeee zzo() {
        return this.zzf;
    }

    public final /* synthetic */ boolean zzp() {
        return this.zzg;
    }
}
