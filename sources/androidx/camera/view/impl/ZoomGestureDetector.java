package androidx.camera.view.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Px;
import androidx.annotation.UiThread;
import androidx.camera.video.AudioStats;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import sj.b;

/* JADX INFO: loaded from: classes.dex */
public final class ZoomGestureDetector {
    private static final int ANCHORED_ZOOM_MODE_DOUBLE_TAP = 1;
    private static final int ANCHORED_ZOOM_MODE_NONE = 0;
    private static final int ANCHORED_ZOOM_MODE_STYLUS = 2;
    public static final Companion Companion = new Companion(null);
    private static final int DEFAULT_MIN_SPAN = 0;
    private static final float SCALE_FACTOR = 0.5f;
    private int anchoredZoomMode;
    private float anchoredZoomStartX;
    private float anchoredZoomStartY;
    private final Context context;
    private float currentSpan;
    private float currentSpanX;
    private float currentSpanY;
    private boolean eventBeforeOrAboveStartingGestureEvent;
    private long eventTime;

    @Px
    private int focusX;

    @Px
    private int focusY;
    private GestureDetector gestureDetector;
    private float initialSpan;
    private boolean isInProgress;
    private boolean isQuickZoomEnabled;
    private boolean isStylusZoomEnabled;
    private final OnZoomGestureListener listener;
    private final int minSpan;
    private long prevTime;
    private float previousSpan;
    private float previousSpanX;
    private float previousSpanY;
    private final int spanSlop;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public interface OnZoomGestureListener {
        @UiThread
        boolean onZoomEvent(ZoomEvent zoomEvent);
    }

    public static abstract class ZoomEvent {
        private final long eventTime;
        private final int focusX;
        private final int focusY;

        public static final class Begin extends ZoomEvent {
            public Begin(@IntRange(from = 0) long j, @IntRange(from = 0) @Px int i, @IntRange(from = 0) @Px int i4) {
                super(j, i, i4, null);
            }
        }

        public static final class End extends ZoomEvent {
            private final float incrementalScaleFactor;

            public End(@IntRange(from = 0) long j, @IntRange(from = 0) @Px int i, @IntRange(from = 0) @Px int i4, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, fromInclusive = false) float f) {
                super(j, i, i4, null);
                this.incrementalScaleFactor = f;
            }

            public final float getIncrementalScaleFactor() {
                return this.incrementalScaleFactor;
            }
        }

        public static final class Move extends ZoomEvent {
            private final float incrementalScaleFactor;

            public Move(@IntRange(from = 0) long j, @IntRange(from = 0) @Px int i, @IntRange(from = 0) @Px int i4, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, fromInclusive = false) float f) {
                super(j, i, i4, null);
                this.incrementalScaleFactor = f;
            }

            public final float getIncrementalScaleFactor() {
                return this.incrementalScaleFactor;
            }
        }

        public /* synthetic */ ZoomEvent(long j, int i, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, i, i4);
        }

        public final long getEventTime() {
            return this.eventTime;
        }

        public final int getFocusX() {
            return this.focusX;
        }

        public final int getFocusY() {
            return this.focusY;
        }

        private ZoomEvent(@IntRange(from = 0) long j, @IntRange(from = 0) @Px int i, @IntRange(from = 0) @Px int i4) {
            this.eventTime = j;
            this.focusX = i;
            this.focusY = i4;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"ExecutorRegistration"})
    public ZoomGestureDetector(Context context, @Px int i, OnZoomGestureListener listener) {
        this(context, i, 0, listener, 4, null);
        j.g(context, "context");
        j.g(listener, "listener");
    }

    private final float getIncrementalScaleFactor() {
        if (!inAnchoredZoomMode()) {
            float f = this.previousSpan;
            if (f > 0.0f) {
                return this.currentSpan / f;
            }
            return 1.0f;
        }
        boolean z4 = this.eventBeforeOrAboveStartingGestureEvent;
        boolean z5 = (z4 && this.currentSpan < this.previousSpan) || (!z4 && this.currentSpan > this.previousSpan);
        float fAbs = Math.abs(1 - (this.currentSpan / this.previousSpan)) * 0.5f;
        if (this.previousSpan <= this.spanSlop) {
            return 1.0f;
        }
        return z5 ? fAbs + 1.0f : 1.0f - fAbs;
    }

    private final boolean inAnchoredZoomMode() {
        return this.anchoredZoomMode != 0;
    }

    public final long getTimeDelta() {
        return this.eventTime - this.prevTime;
    }

    public final boolean isQuickZoomEnabled() {
        return this.isQuickZoomEnabled;
    }

    public final boolean isStylusZoomEnabled() {
        return this.isStylusZoomEnabled;
    }

    @UiThread
    public final boolean onTouchEvent(MotionEvent event) {
        boolean z4;
        float f;
        float f3;
        j.g(event, "event");
        this.eventTime = event.getEventTime();
        int actionMasked = event.getActionMasked();
        if (this.isQuickZoomEnabled) {
            this.gestureDetector.onTouchEvent(event);
        }
        int pointerCount = event.getPointerCount();
        boolean z5 = (event.getButtonState() & 32) != 0;
        boolean z8 = this.anchoredZoomMode == 2 && !z5;
        boolean z9 = actionMasked == 1 || actionMasked == 3 || z8;
        float f7 = 0.0f;
        if (actionMasked == 0 || z9) {
            if (this.isInProgress) {
                z4 = true;
                this.listener.onZoomEvent(new ZoomEvent.End(this.eventTime, this.focusX, this.focusY, getIncrementalScaleFactor()));
                this.isInProgress = false;
                this.initialSpan = 0.0f;
                this.anchoredZoomMode = 0;
            } else {
                z4 = true;
                if (inAnchoredZoomMode() && z9) {
                    this.isInProgress = false;
                    this.initialSpan = 0.0f;
                    this.anchoredZoomMode = 0;
                }
            }
            if (!z9) {
            }
            return z4;
        }
        z4 = true;
        if (!this.isInProgress && this.isStylusZoomEnabled && !inAnchoredZoomMode() && !z9 && z5) {
            this.anchoredZoomStartX = event.getX();
            this.anchoredZoomStartY = event.getY();
            this.anchoredZoomMode = 2;
            this.initialSpan = 0.0f;
        }
        boolean z10 = (actionMasked == 0 || actionMasked == 6 || actionMasked == 5 || z8) ? z4 : false;
        boolean z11 = actionMasked == 6 ? z4 : false;
        int actionIndex = z11 ? event.getActionIndex() : -1;
        int i = z11 ? pointerCount - 1 : pointerCount;
        if (inAnchoredZoomMode()) {
            f3 = this.anchoredZoomStartX;
            f = this.anchoredZoomStartY;
            this.eventBeforeOrAboveStartingGestureEvent = event.getY() < f ? z4 : false;
        } else {
            float x6 = 0.0f;
            float y7 = 0.0f;
            for (int i4 = 0; i4 < pointerCount; i4++) {
                if (actionIndex != i4) {
                    x6 += event.getX(i4);
                    y7 += event.getY(i4);
                }
            }
            float f10 = i;
            float f11 = x6 / f10;
            f = y7 / f10;
            f3 = f11;
        }
        float fAbs = 0.0f;
        for (int i6 = 0; i6 < pointerCount; i6++) {
            if (actionIndex != i6) {
                float fAbs2 = Math.abs(event.getX(i6) - f3) + f7;
                fAbs = Math.abs(event.getY(i6) - f) + fAbs;
                f7 = fAbs2;
            }
        }
        float f12 = i;
        float f13 = f7 / f12;
        float f14 = fAbs / f12;
        float f15 = 2;
        float f16 = f13 * f15;
        float f17 = f14 * f15;
        float fHypot = inAnchoredZoomMode() ? f17 : (float) Math.hypot(f16, f17);
        boolean z12 = this.isInProgress;
        this.focusX = b.b(f3);
        this.focusY = b.b(f);
        if (!inAnchoredZoomMode() && this.isInProgress && (fHypot < this.minSpan || z10)) {
            this.listener.onZoomEvent(new ZoomEvent.End(this.eventTime, this.focusX, this.focusY, getIncrementalScaleFactor()));
            this.isInProgress = false;
            this.initialSpan = fHypot;
        }
        if (z10) {
            this.currentSpanX = f16;
            this.previousSpanX = f16;
            this.currentSpanY = f17;
            this.previousSpanY = f17;
            this.currentSpan = fHypot;
            this.previousSpan = fHypot;
            this.initialSpan = fHypot;
        }
        int i10 = inAnchoredZoomMode() ? this.spanSlop : this.minSpan;
        if (!this.isInProgress && fHypot >= i10 && (z12 || Math.abs(fHypot - this.initialSpan) > this.spanSlop)) {
            this.currentSpanX = f16;
            this.previousSpanX = f16;
            this.currentSpanY = f17;
            this.previousSpanY = f17;
            this.currentSpan = fHypot;
            this.previousSpan = fHypot;
            long j = this.eventTime;
            this.prevTime = j;
            this.isInProgress = this.listener.onZoomEvent(new ZoomEvent.Begin(j, this.focusX, this.focusY));
        }
        if (actionMasked == 2) {
            this.currentSpanX = f16;
            this.currentSpanY = f17;
            this.currentSpan = fHypot;
            if (this.isInProgress ? this.listener.onZoomEvent(new ZoomEvent.Move(this.eventTime, this.focusX, this.focusY, getIncrementalScaleFactor())) : z4) {
                this.previousSpanX = this.currentSpanX;
                this.previousSpanY = this.currentSpanY;
                this.previousSpan = this.currentSpan;
                this.prevTime = this.eventTime;
            }
        }
        return z4;
    }

    public final void setQuickZoomEnabled(boolean z4) {
        this.isQuickZoomEnabled = z4;
    }

    public final void setStylusZoomEnabled(boolean z4) {
        this.isStylusZoomEnabled = z4;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"ExecutorRegistration"})
    public ZoomGestureDetector(Context context, OnZoomGestureListener listener) {
        this(context, 0, 0, listener, 6, null);
        j.g(context, "context");
        j.g(listener, "listener");
    }

    @SuppressLint({"ExecutorRegistration"})
    public ZoomGestureDetector(Context context, @Px int i, @Px int i4, OnZoomGestureListener listener) {
        j.g(context, "context");
        j.g(listener, "listener");
        this.context = context;
        this.spanSlop = i;
        this.minSpan = i4;
        this.listener = listener;
        this.isQuickZoomEnabled = true;
        this.isStylusZoomEnabled = true;
        this.gestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() { // from class: androidx.camera.view.impl.ZoomGestureDetector$gestureDetector$1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(MotionEvent e) {
                j.g(e, "e");
                this.this$0.anchoredZoomStartX = e.getX();
                this.this$0.anchoredZoomStartY = e.getY();
                this.this$0.anchoredZoomMode = 1;
                return true;
            }
        });
    }

    public /* synthetic */ ZoomGestureDetector(Context context, int i, int i4, OnZoomGestureListener onZoomGestureListener, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i6 & 2) != 0 ? ViewConfiguration.get(context).getScaledTouchSlop() * 2 : i, (i6 & 4) != 0 ? 0 : i4, onZoomGestureListener);
    }
}
