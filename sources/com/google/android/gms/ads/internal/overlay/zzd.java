package com.google.android.gms.ads.internal.overlay;

import android.view.View;
import com.dynatrace.android.callback.Callback;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzd implements View.OnClickListener {
    final /* synthetic */ zzl zza;

    public zzd(zzl zzlVar) {
        Objects.requireNonNull(zzlVar);
        this.zza = zzlVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Callback.onClick_enter(view);
        try {
            zzl zzlVar = this.zza;
            zzlVar.zzn = 2;
            zzlVar.zzb.finish();
        } finally {
            Callback.onClick_exit();
        }
    }
}
