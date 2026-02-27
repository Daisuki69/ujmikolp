package com.google.android.gms.internal.consent_sdk;

import L1.c;
import L1.i;
import L1.j;
import L1.k;

/* JADX INFO: loaded from: classes3.dex */
final class zzba implements k, j {
    private final k zza;
    private final j zzb;

    public /* synthetic */ zzba(k kVar, j jVar, zzbb zzbbVar) {
        this.zza = kVar;
        this.zzb = jVar;
    }

    @Override // L1.j
    public final void onConsentFormLoadFailure(i iVar) {
        this.zzb.onConsentFormLoadFailure(iVar);
    }

    @Override // L1.k
    public final void onConsentFormLoadSuccess(c cVar) {
        this.zza.onConsentFormLoadSuccess(cVar);
    }
}
