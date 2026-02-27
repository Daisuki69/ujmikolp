package io.flutter.plugin.platform;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import io.flutter.embedding.android.AndroidTouchProcessor;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17235b;
    public int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17236d;
    public AndroidTouchProcessor e;
    public n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public o f17237g;

    public p(Activity activity) {
        super(activity);
        setWillNotDraw(false);
    }

    public boolean __replaced_14540_13_onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        n nVar = this.f;
        if (nVar == null) {
            super.draw(canvas);
            Log.e("PlatformViewWrapper", "Platform view cannot be composed without a RenderTarget.");
            return;
        }
        Surface surface = nVar.getSurface();
        if (!surface.isValid()) {
            Log.e("PlatformViewWrapper", "Platform view cannot be composed without a valid RenderTarget surface.");
            return;
        }
        Canvas canvasLockHardwareCanvas = surface.lockHardwareCanvas();
        if (canvasLockHardwareCanvas == null) {
            invalidate();
            return;
        }
        try {
            canvasLockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
            super.draw(canvasLockHardwareCanvas);
        } finally {
            this.f.scheduleFrame();
            surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
        }
    }

    @VisibleForTesting
    public ViewTreeObserver.OnGlobalFocusChangeListener getActiveFocusListener() {
        return this.f17237g;
    }

    public int getRenderTargetHeight() {
        n nVar = this.f;
        if (nVar != null) {
            return nVar.getHeight();
        }
        return 0;
    }

    public int getRenderTargetWidth() {
        n nVar = this.f;
        if (nVar != null) {
            return nVar.getWidth();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        invalidate();
        return super.invalidateChildInParent(iArr, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return __replaced_14540_13_onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.e == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i = this.c;
            this.f17234a = i;
            int i4 = this.f17236d;
            this.f17235b = i4;
            matrix.postTranslate(i, i4);
        } else if (action != 2) {
            matrix.postTranslate(this.c, this.f17236d);
        } else {
            matrix.postTranslate(this.f17234a, this.f17235b);
            this.f17234a = this.c;
            this.f17235b = this.f17236d;
        }
        return this.e.onTouchEvent(motionEvent, matrix);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getImportantForAccessibility() != 4) {
            return super.requestSendAccessibilityEvent(view, accessibilityEvent);
        }
        return false;
    }

    public void setLayoutParams(@NonNull FrameLayout.LayoutParams layoutParams) {
        setLayoutParams((ViewGroup.LayoutParams) layoutParams);
        this.c = layoutParams.leftMargin;
        this.f17236d = layoutParams.topMargin;
    }

    public void setOnDescendantFocusChangeListener(@NonNull View.OnFocusChangeListener onFocusChangeListener) {
        o oVar;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && (oVar = this.f17237g) != null) {
            this.f17237g = null;
            viewTreeObserver.removeOnGlobalFocusChangeListener(oVar);
        }
        ViewTreeObserver viewTreeObserver2 = getViewTreeObserver();
        if (viewTreeObserver2.isAlive() && this.f17237g == null) {
            o oVar2 = new o(this, onFocusChangeListener);
            this.f17237g = oVar2;
            viewTreeObserver2.addOnGlobalFocusChangeListener(oVar2);
        }
    }

    public void setTouchProcessor(@Nullable AndroidTouchProcessor androidTouchProcessor) {
        this.e = androidTouchProcessor;
    }
}
