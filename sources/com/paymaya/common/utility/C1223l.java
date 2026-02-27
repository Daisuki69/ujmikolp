package com.paymaya.common.utility;

import android.animation.Animator;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: renamed from: com.paymaya.common.utility.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1223l implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f11222b;

    public /* synthetic */ C1223l(View view, int i) {
        this.f11221a = i;
        this.f11222b = view;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f11221a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f11221a) {
            case 0:
                this.f11222b.setVisibility(4);
                break;
            default:
                ((TextView) this.f11222b).setVisibility(4);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.f11221a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f11221a) {
            case 0:
                this.f11222b.setVisibility(0);
                break;
            default:
                ((TextView) this.f11222b).setVisibility(0);
                break;
        }
    }
}
