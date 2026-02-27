package com.google.android.gms.ads.internal.overlay;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzr extends AnimatorListenerAdapter {
    final /* synthetic */ zzt zza;

    public zzr(zzt zztVar) {
        Objects.requireNonNull(zztVar);
        this.zza = zztVar;
    }

    private final void zza(boolean z4) {
        zzt zztVar = this.zza;
        zztVar.setEnabled(z4);
        zztVar.zzb().setEnabled(z4);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        zza(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        zza(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        zza(false);
    }
}
