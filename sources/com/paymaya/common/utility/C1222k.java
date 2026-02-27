package com.paymaya.common.utility;

import android.animation.Animator;
import android.widget.ProgressBar;
import android.widget.TextView;

/* JADX INFO: renamed from: com.paymaya.common.utility.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1222k implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ double f11218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProgressBar f11219b;
    public final /* synthetic */ TextView c;

    public C1222k(double d10, ProgressBar progressBar, TextView textView) {
        this.f11218a = d10;
        this.f11219b = progressBar;
        this.c = textView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AbstractC1228q.d(this.f11218a, this.f11219b, this.c);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
