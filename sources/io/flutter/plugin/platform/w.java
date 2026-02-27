package io.flutter.plugin.platform;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;

/* JADX INFO: loaded from: classes4.dex */
public final class w extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1617a f17264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f17265b;

    public w(Context context, C1617a c1617a, View view) {
        super(context);
        this.f17264a = c1617a;
        this.f17265b = view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        io.flutter.view.l lVar = this.f17264a.f17218a;
        if (lVar == null) {
            return false;
        }
        return lVar.a(this.f17265b, view, accessibilityEvent);
    }
}
