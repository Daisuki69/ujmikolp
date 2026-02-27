package C;

import android.os.Handler;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements Handler.Callback {
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
    
        if (((com.google.android.material.behavior.SwipeDismissBehavior) r3).getDragState() != 0) goto L17;
     */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r7) {
        /*
            r6 = this;
            int r0 = r7.what
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L5d
            if (r0 == r2) goto L9
            return r1
        L9:
            java.lang.Object r0 = r7.obj
            C.m r0 = (C.m) r0
            int r7 = r7.arg1
            com.androidadvance.topsnackbar.TSnackbar$SnackbarLayout r1 = r0.f663b
            int r3 = r1.getVisibility()
            if (r3 != 0) goto L59
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            boolean r4 = r3 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams
            if (r4 == 0) goto L32
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r3 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r3
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r3 = r3.getBehavior()
            boolean r4 = r3 instanceof com.google.android.material.behavior.SwipeDismissBehavior
            if (r4 == 0) goto L32
            com.google.android.material.behavior.SwipeDismissBehavior r3 = (com.google.android.material.behavior.SwipeDismissBehavior) r3
            int r3 = r3.getDragState()
            if (r3 == 0) goto L32
            goto L59
        L32:
            androidx.core.view.ViewPropertyAnimatorCompat r3 = androidx.core.view.ViewCompat.animate(r1)
            int r1 = r1.getHeight()
            int r1 = -r1
            float r1 = (float) r1
            androidx.core.view.ViewPropertyAnimatorCompat r1 = r3.translationY(r1)
            androidx.interpolator.view.animation.FastOutSlowInInterpolator r3 = C.a.f649a
            androidx.core.view.ViewPropertyAnimatorCompat r1 = r1.setInterpolator(r3)
            r3 = 250(0xfa, double:1.235E-321)
            androidx.core.view.ViewPropertyAnimatorCompat r1 = r1.setDuration(r3)
            C.i r3 = new C.i
            r3.<init>(r0, r7)
            androidx.core.view.ViewPropertyAnimatorCompat r7 = r1.setListener(r3)
            r7.start()
            return r2
        L59:
            r0.d()
            return r2
        L5d:
            java.lang.Object r7 = r7.obj
            C.m r7 = (C.m) r7
            com.androidadvance.topsnackbar.TSnackbar$SnackbarLayout r0 = r7.f663b
            android.view.ViewParent r3 = r0.getParent()
            if (r3 != 0) goto L97
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            boolean r4 = r3 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams
            if (r4 == 0) goto L92
            C.j r4 = new C.j
            r4.<init>(r7)
            r5 = 1036831949(0x3dcccccd, float:0.1)
            r4.setStartAlphaSwipeDistance(r5)
            r5 = 1058642330(0x3f19999a, float:0.6)
            r4.setEndAlphaSwipeDistance(r5)
            r4.setSwipeDirection(r1)
            C.g r1 = new C.g
            r1.<init>(r7)
            r4.setListener(r1)
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r3 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r3
            r3.setBehavior(r4)
        L92:
            android.view.ViewGroup r1 = r7.f662a
            r1.addView(r0)
        L97:
            V2.c r1 = new V2.c
            r3 = 9
            r1.<init>(r7, r3)
            r0.setOnAttachStateChangeListener(r1)
            boolean r1 = androidx.core.view.ViewCompat.isLaidOut(r0)
            if (r1 == 0) goto Lab
            r7.a()
            return r2
        Lab:
            A5.l r1 = new A5.l
            r3 = 9
            r1.<init>(r7, r3)
            r0.setOnLayoutChangeListener(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: C.e.handleMessage(android.os.Message):boolean");
    }
}
