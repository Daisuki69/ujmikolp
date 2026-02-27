package com.paymaya.common.utility;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;

/* JADX INFO: renamed from: com.paymaya.common.utility.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1225n extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f11225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ImageView f11226b;
    public final /* synthetic */ AnimatorSet c;

    public C1225n(View view, ImageView imageView, AnimatorSet animatorSet) {
        this.f11225a = view;
        this.f11226b = imageView;
        this.c = animatorSet;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ImageView imageView = this.f11226b;
        if (imageView != null) {
            ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
            scaleAnimation.setInterpolator(new OvershootInterpolator(0.8f));
            scaleAnimation.setDuration(270L);
            imageView.setVisibility(0);
            imageView.startAnimation(scaleAnimation);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        ImageView imageView = this.f11226b;
        View view = this.f11225a;
        view.postDelayed(new androidx.media3.common.util.g(20, imageView, view), this.c.getStartDelay());
    }
}
