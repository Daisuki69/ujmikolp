package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaux {
    private final S1.y zza;

    public zzaux(final Context context, Executor executor) {
        this.zza = zzgot.zzd(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzauw
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                Context context2 = context;
                try {
                    return zzfoo.zza(context2, context2.getPackageName(), Integer.toString(context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode));
                } catch (Throwable unused) {
                    return null;
                }
            }
        }, executor);
    }

    public final S1.y zza() {
        return this.zza;
    }
}
