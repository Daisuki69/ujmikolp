package com.paymaya.common.utility;

import android.animation.Animator;
import androidx.cardview.widget.CardView;

/* JADX INFO: renamed from: com.paymaya.common.utility.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1224m implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CardView f11223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1227p f11224b;

    public C1224m(CardView cardView, InterfaceC1227p interfaceC1227p) {
        this.f11223a = cardView;
        this.f11224b = interfaceC1227p;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f11223a.setVisibility(8);
        this.f11224b.a();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f11223a.setVisibility(0);
    }
}
