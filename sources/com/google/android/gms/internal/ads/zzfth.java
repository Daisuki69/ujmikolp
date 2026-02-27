package com.google.android.gms.internal.ads;

import Bj.C0142g0;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfth {
    public static final zzftf zza(final ExecutorService executorService) {
        kotlin.jvm.internal.j.g(executorService, "executorService");
        return new zzftf() { // from class: com.google.android.gms.internal.ads.zzftg
            @Override // com.google.android.gms.internal.ads.zzftf
            public final Bj.E zza() {
                return Bj.H.c(new C0142g0(executorService));
            }
        };
    }
}
