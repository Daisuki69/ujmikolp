package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzacr implements zzaeb {
    private final byte[] zza = new byte[4096];

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final void zzu(zzu zzuVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final int zzv(zzi zziVar, int i, boolean z4, int i4) throws IOException {
        int iZza = zziVar.zza(this.zza, 0, Math.min(4096, i));
        if (iZza != -1) {
            return iZza;
        }
        if (z4) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final void zzw(zzef zzefVar, int i, int i4) {
        zzefVar.zzk(i);
    }

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final void zzx(long j, int i, int i4, int i6, @Nullable zzaea zzaeaVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final /* synthetic */ int zzy(zzi zziVar, int i, boolean z4) {
        return AbstractC1172f.a(this, zziVar, i, z4);
    }

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final /* synthetic */ void zzz(zzef zzefVar, int i) {
        AbstractC1172f.b(this, zzefVar, i);
    }
}
