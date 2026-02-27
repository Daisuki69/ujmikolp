package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzapz implements zzaqc {
    final /* synthetic */ File zza;

    public zzapz(zzaqd zzaqdVar, File file) {
        this.zza = file;
        Objects.requireNonNull(zzaqdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaqc
    public final File zza() {
        return this.zza;
    }
}
