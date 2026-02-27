package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbrr implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbrs zza;

    public zzbrr(zzbrs zzbrsVar) {
        Objects.requireNonNull(zzbrsVar);
        this.zza = zzbrsVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zza.zzg("Operation denied by user.");
    }
}
