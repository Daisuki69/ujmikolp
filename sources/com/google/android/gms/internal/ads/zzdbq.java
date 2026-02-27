package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public class zzdbq {
    protected final Map zza = new HashMap();

    public zzdbq(Set set) {
        zzr(set);
    }

    public final synchronized void zzp(zzddr zzddrVar) {
        zzq(zzddrVar.zza, zzddrVar.zzb);
    }

    public final synchronized void zzq(Object obj, Executor executor) {
        this.zza.put(obj, executor);
    }

    public final synchronized void zzr(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzp((zzddr) it.next());
        }
    }

    public final synchronized void zzs(final zzdbp zzdbpVar) {
        for (Map.Entry entry : this.zza.entrySet()) {
            final Object key = entry.getKey();
            ((Executor) entry.getValue()).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdbo
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    try {
                        zzdbpVar.zza(key);
                    } catch (Throwable th2) {
                        com.google.android.gms.ads.internal.zzt.zzh().zzh(th2, "EventEmitter.notify");
                        com.google.android.gms.ads.internal.util.zze.zzb("Event emitter exception.", th2);
                    }
                }
            });
        }
    }
}
