package w1;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import com.paymaya.R;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import n1.AbstractC1894G;
import n1.AbstractC1895a;
import z1.AbstractC2550e;

/* JADX INFO: renamed from: w1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2365c extends View implements D {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final float f20525B;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f20526K;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public long f20527P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f20528Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public Rect f20529R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final ValueAnimator f20530S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public float f20531T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public boolean f20532U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f20533V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public long f20534W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f20535a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public long f20536a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f20537b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public long f20538b0;
    public final Rect c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public long f20539c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f20540d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f20541d0;
    public final Paint e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public long[] f20542e0;
    public final Paint f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean[] f20543f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f20544g;
    public final Paint h;
    public final Paint i;
    public final Paint j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Drawable f20545k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f20546l;
    public final int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f20547n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f20548o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f20549p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f20550q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f20551r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f20552s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f20553t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final StringBuilder f20554u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Formatter f20555v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final androidx.window.layout.adapter.extensions.a f20556w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final CopyOnWriteArraySet f20557x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Point f20558y;

    public C2365c(Context context, AttributeSet attributeSet) {
        super(context, null, 0);
        this.f20535a = new Rect();
        this.f20537b = new Rect();
        this.c = new Rect();
        this.f20540d = new Rect();
        Paint paint = new Paint();
        this.e = paint;
        Paint paint2 = new Paint();
        this.f = paint2;
        Paint paint3 = new Paint();
        this.f20544g = paint3;
        Paint paint4 = new Paint();
        this.h = paint4;
        Paint paint5 = new Paint();
        this.i = paint5;
        Paint paint6 = new Paint();
        this.j = paint6;
        paint6.setAntiAlias(true);
        this.f20557x = new CopyOnWriteArraySet();
        this.f20558y = new Point();
        float f = context.getResources().getDisplayMetrics().density;
        this.f20525B = f;
        this.f20553t = a(f, -50);
        int iA = a(f, 4);
        int iA2 = a(f, 26);
        int iA3 = a(f, 4);
        int iA4 = a(f, 12);
        int iA5 = a(f, 0);
        int iA6 = a(f, 16);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC2366d.f20560b, 0, R.style.ExoStyledControls_TimeBar);
            try {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(10);
                this.f20545k = drawable;
                if (drawable != null) {
                    int i = AbstractC2550e.f21351a;
                    if (i >= 23) {
                        int layoutDirection = getLayoutDirection();
                        if (i < 23 || drawable.setLayoutDirection(layoutDirection)) {
                        }
                    }
                    iA2 = Math.max(drawable.getMinimumHeight(), iA2);
                }
                this.f20546l = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, iA);
                this.m = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, iA2);
                this.f20547n = typedArrayObtainStyledAttributes.getInt(2, 0);
                this.f20548o = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, iA3);
                this.f20549p = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, iA4);
                this.f20550q = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, iA5);
                this.f20551r = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, iA6);
                int i4 = typedArrayObtainStyledAttributes.getInt(6, -1);
                int i6 = typedArrayObtainStyledAttributes.getInt(7, -1);
                int i10 = typedArrayObtainStyledAttributes.getInt(4, -855638017);
                int i11 = typedArrayObtainStyledAttributes.getInt(13, 872415231);
                int i12 = typedArrayObtainStyledAttributes.getInt(0, -1291845888);
                int i13 = typedArrayObtainStyledAttributes.getInt(5, 872414976);
                paint.setColor(i4);
                paint6.setColor(i6);
                paint2.setColor(i10);
                paint3.setColor(i11);
                paint4.setColor(i12);
                paint5.setColor(i13);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            this.f20546l = iA;
            this.m = iA2;
            this.f20547n = 0;
            this.f20548o = iA3;
            this.f20549p = iA4;
            this.f20550q = iA5;
            this.f20551r = iA6;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.f20545k = null;
        }
        StringBuilder sb2 = new StringBuilder();
        this.f20554u = sb2;
        this.f20555v = new Formatter(sb2, Locale.getDefault());
        this.f20556w = new androidx.window.layout.adapter.extensions.a(this, 29);
        Drawable drawable2 = this.f20545k;
        if (drawable2 != null) {
            this.f20552s = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.f20552s = (Math.max(this.f20550q, Math.max(this.f20549p, this.f20551r)) + 1) / 2;
        }
        this.f20531T = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f20530S = valueAnimator;
        valueAnimator.addUpdateListener(new E8.n(this, 4));
        this.f20536a0 = androidx.media3.common.C.TIME_UNSET;
        this.f20527P = androidx.media3.common.C.TIME_UNSET;
        this.f20526K = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static int a(float f, int i) {
        return (int) ((i * f) + 0.5f);
    }

    private long getPositionIncrement() {
        long j = this.f20527P;
        if (j != androidx.media3.common.C.TIME_UNSET) {
            return j;
        }
        long j6 = this.f20536a0;
        if (j6 == androidx.media3.common.C.TIME_UNSET) {
            return 0L;
        }
        return j6 / ((long) this.f20526K);
    }

    private String getProgressText() {
        return AbstractC2550e.d(this.f20554u, this.f20555v, this.f20538b0);
    }

    private long getScrubberPosition() {
        Rect rect = this.f20537b;
        if (rect.width() <= 0 || this.f20536a0 == androidx.media3.common.C.TIME_UNSET) {
            return 0L;
        }
        return (((long) this.f20540d.width()) * this.f20536a0) / ((long) rect.width());
    }

    public final boolean b(long j) {
        long j6 = this.f20536a0;
        if (j6 <= 0) {
            return false;
        }
        long j7 = this.f20533V ? this.f20534W : this.f20538b0;
        int i = AbstractC2550e.f21351a;
        long jMax = Math.max(0L, Math.min(j + j7, j6));
        if (jMax == j7) {
            return false;
        }
        if (this.f20533V) {
            f(jMax);
        } else {
            c(jMax);
        }
        e();
        return true;
    }

    public final void c(long j) {
        this.f20534W = j;
        this.f20533V = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.f20557x.iterator();
        while (it.hasNext()) {
            t tVar = ((i) ((C) it.next())).f20569a;
            tVar.f20611e0 = true;
            TextView textView = tVar.f20620l;
            if (textView != null) {
                textView.setText(AbstractC2550e.d(tVar.f20622n, tVar.f20624o, j));
            }
            tVar.f20627p0.g();
        }
    }

    public final void d(boolean z4) {
        n1.y yVar;
        int currentWindowIndex;
        removeCallbacks(this.f20556w);
        this.f20533V = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        for (C c : this.f20557x) {
            long j = this.f20534W;
            t tVar = ((i) c).f20569a;
            tVar.f20611e0 = false;
            if (!z4 && (yVar = tVar.f20603W) != null) {
                AbstractC1894G currentTimeline = yVar.getCurrentTimeline();
                if (tVar.f20610d0 && !currentTimeline.n()) {
                    int iM = currentTimeline.m();
                    currentWindowIndex = 0;
                    while (true) {
                        long jB = AbstractC1895a.b(currentTimeline.k(currentWindowIndex, tVar.f20628q, 0L).f18560k);
                        if (j < jB) {
                            break;
                        }
                        if (currentWindowIndex == iM - 1) {
                            j = jB;
                            break;
                        } else {
                            j -= jB;
                            currentWindowIndex++;
                        }
                    }
                } else {
                    currentWindowIndex = yVar.getCurrentWindowIndex();
                }
                ((T2.g) tVar.f20605a0).getClass();
                yVar.seekTo(currentWindowIndex, j);
            }
            tVar.f20627p0.h();
        }
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f20545k;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    public final void e() {
        Rect rect = this.c;
        Rect rect2 = this.f20537b;
        rect.set(rect2);
        Rect rect3 = this.f20540d;
        rect3.set(rect2);
        long j = this.f20533V ? this.f20534W : this.f20538b0;
        if (this.f20536a0 > 0) {
            rect.right = Math.min(rect2.left + ((int) ((((long) rect2.width()) * this.f20539c0) / this.f20536a0)), rect2.right);
            rect3.right = Math.min(rect2.left + ((int) ((((long) rect2.width()) * j) / this.f20536a0)), rect2.right);
        } else {
            int i = rect2.left;
            rect.right = i;
            rect3.right = i;
        }
        invalidate(this.f20535a);
    }

    public final void f(long j) {
        if (this.f20534W == j) {
            return;
        }
        this.f20534W = j;
        Iterator it = this.f20557x.iterator();
        while (it.hasNext()) {
            t tVar = ((i) ((C) it.next())).f20569a;
            TextView textView = tVar.f20620l;
            if (textView != null) {
                textView.setText(AbstractC2550e.d(tVar.f20622n, tVar.f20624o, j));
            }
        }
    }

    public long getPreferredUpdateDelay() {
        int iWidth = (int) (this.f20537b.width() / this.f20525B);
        if (iWidth == 0) {
            return Long.MAX_VALUE;
        }
        long j = this.f20536a0;
        if (j == 0 || j == androidx.media3.common.C.TIME_UNSET) {
            return Long.MAX_VALUE;
        }
        return j / ((long) iWidth);
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f20545k;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        canvas.save();
        Rect rect = this.f20537b;
        int iHeight = rect.height();
        int iCenterY = rect.centerY() - (iHeight / 2);
        int i = iCenterY + iHeight;
        long j = this.f20536a0;
        Paint paint = this.f20544g;
        Rect rect2 = this.f20540d;
        if (j <= 0) {
            canvas2 = canvas;
            canvas2.drawRect(rect.left, iCenterY, rect.right, i, paint);
        } else {
            Rect rect3 = this.c;
            int i4 = rect3.left;
            int i6 = rect3.right;
            int iMax = Math.max(Math.max(rect.left, i6), rect2.right);
            int i10 = rect.right;
            if (iMax < i10) {
                canvas.drawRect(iMax, iCenterY, i10, i, paint);
            }
            int iMax2 = Math.max(i4, rect2.right);
            if (i6 > iMax2) {
                canvas.drawRect(iMax2, iCenterY, i6, i, this.f);
            }
            if (rect2.width() > 0) {
                canvas.drawRect(rect2.left, iCenterY, rect2.right, i, this.e);
            }
            if (this.f20541d0 != 0) {
                long[] jArr = this.f20542e0;
                jArr.getClass();
                boolean[] zArr = this.f20543f0;
                zArr.getClass();
                int i11 = this.f20548o;
                int i12 = i11 / 2;
                int i13 = 0;
                int i14 = 0;
                while (i14 < this.f20541d0) {
                    long j6 = jArr[i14];
                    long j7 = this.f20536a0;
                    int i15 = AbstractC2550e.f21351a;
                    int i16 = i14;
                    canvas.drawRect(Math.min(rect.width() - i11, Math.max(i13, ((int) ((((long) rect.width()) * Math.max(0L, Math.min(j6, j7))) / this.f20536a0)) - i12)) + rect.left, iCenterY, r3 + i11, i, zArr[i14] ? this.i : this.h);
                    i14 = i16 + 1;
                    i13 = i13;
                }
            }
            canvas2 = canvas;
        }
        if (this.f20536a0 > 0) {
            int i17 = rect2.right;
            int i18 = rect2.left;
            int i19 = rect.right;
            int i20 = AbstractC2550e.f21351a;
            int iMax3 = Math.max(i18, Math.min(i17, i19));
            int iCenterY2 = rect2.centerY();
            Drawable drawable = this.f20545k;
            if (drawable == null) {
                canvas2.drawCircle(iMax3, iCenterY2, (int) ((((this.f20533V || isFocused()) ? this.f20551r : isEnabled() ? this.f20549p : this.f20550q) * this.f20531T) / 2.0f), this.j);
            } else {
                int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.f20531T)) / 2;
                int intrinsicHeight = ((int) (drawable.getIntrinsicHeight() * this.f20531T)) / 2;
                drawable.setBounds(iMax3 - intrinsicWidth, iCenterY2 - intrinsicHeight, iMax3 + intrinsicWidth, iCenterY2 + intrinsicHeight);
                drawable.draw(canvas2);
            }
        }
        canvas2.restore();
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z4, int i, Rect rect) {
        super.onFocusChanged(z4, i, rect);
        if (!this.f20533V || z4) {
            return;
        }
        d(false);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.f20536a0 <= 0) {
            return;
        }
        if (AbstractC2550e.f21351a >= 21) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        } else {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(8192);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L2e
            long r0 = r4.getPositionIncrement()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L25
            switch(r5) {
                case 21: goto L13;
                case 22: goto L14;
                case 23: goto L25;
                default: goto L12;
            }
        L12:
            goto L2e
        L13:
            long r0 = -r0
        L14:
            boolean r0 = r4.b(r0)
            if (r0 == 0) goto L2e
            androidx.window.layout.adapter.extensions.a r5 = r4.f20556w
            r4.removeCallbacks(r5)
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L25:
            boolean r0 = r4.f20533V
            if (r0 == 0) goto L2e
            r5 = 0
            r4.d(r5)
            return r3
        L2e:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.C2365c.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final void onLayout(boolean z4, int i, int i4, int i6, int i10) {
        int paddingBottom;
        int paddingBottom2;
        Rect rect;
        int i11 = i6 - i;
        int i12 = i10 - i4;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i11 - getPaddingRight();
        int i13 = this.f20532U ? 0 : this.f20552s;
        int i14 = this.f20547n;
        int i15 = this.f20546l;
        int i16 = this.m;
        if (i14 == 1) {
            paddingBottom = (i12 - getPaddingBottom()) - i16;
            paddingBottom2 = ((i12 - getPaddingBottom()) - i15) - Math.max(i13 - (i15 / 2), 0);
        } else {
            paddingBottom = (i12 - i16) / 2;
            paddingBottom2 = (i12 - i15) / 2;
        }
        Rect rect2 = this.f20535a;
        rect2.set(paddingLeft, paddingBottom, paddingRight, i16 + paddingBottom);
        this.f20537b.set(rect2.left + i13, paddingBottom2, rect2.right - i13, i15 + paddingBottom2);
        if (AbstractC2550e.f21351a >= 29 && ((rect = this.f20529R) == null || rect.width() != i11 || this.f20529R.height() != i12)) {
            Rect rect3 = new Rect(0, 0, i11, i12);
            this.f20529R = rect3;
            setSystemGestureExclusionRects(Collections.singletonList(rect3));
        }
        e();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i4) {
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        int i6 = this.m;
        if (mode == 0) {
            size = i6;
        } else if (mode != 1073741824) {
            size = Math.min(i6, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        Drawable drawable = this.f20545k;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        Drawable drawable = this.f20545k;
        if (drawable == null || AbstractC2550e.f21351a < 23 || !drawable.setLayoutDirection(i)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.isEnabled()
            r1 = 0
            if (r0 == 0) goto Lb4
            long r2 = r9.f20536a0
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L11
            goto Lb4
        L11:
            android.graphics.Point r0 = r9.f20558y
            float r2 = r10.getX()
            int r2 = (int) r2
            float r3 = r10.getY()
            int r3 = (int) r3
            r0.set(r2, r3)
            int r2 = r0.x
            int r0 = r0.y
            int r3 = r10.getAction()
            android.graphics.Rect r4 = r9.f20540d
            android.graphics.Rect r5 = r9.f20537b
            r6 = 1
            if (r3 == 0) goto L8a
            r7 = 3
            if (r3 == r6) goto L7b
            r8 = 2
            if (r3 == r8) goto L39
            if (r3 == r7) goto L7b
            goto Lb4
        L39:
            boolean r10 = r9.f20533V
            if (r10 == 0) goto Lb4
            int r10 = r9.f20553t
            if (r0 >= r10) goto L59
            int r10 = r9.f20528Q
            int r2 = r2 - r10
            int r2 = r2 / r7
            int r2 = r2 + r10
            float r10 = (float) r2
            int r10 = (int) r10
            int r0 = r5.left
            int r1 = r5.right
            int r2 = z1.AbstractC2550e.f21351a
            int r10 = java.lang.Math.min(r10, r1)
            int r10 = java.lang.Math.max(r0, r10)
            r4.right = r10
            goto L6d
        L59:
            r9.f20528Q = r2
            float r10 = (float) r2
            int r10 = (int) r10
            int r0 = r5.left
            int r1 = r5.right
            int r2 = z1.AbstractC2550e.f21351a
            int r10 = java.lang.Math.min(r10, r1)
            int r10 = java.lang.Math.max(r0, r10)
            r4.right = r10
        L6d:
            long r0 = r9.getScrubberPosition()
            r9.f(r0)
            r9.e()
            r9.invalidate()
            return r6
        L7b:
            boolean r0 = r9.f20533V
            if (r0 == 0) goto Lb4
            int r10 = r10.getAction()
            if (r10 != r7) goto L86
            r1 = r6
        L86:
            r9.d(r1)
            return r6
        L8a:
            float r10 = (float) r2
            float r0 = (float) r0
            int r10 = (int) r10
            int r0 = (int) r0
            android.graphics.Rect r2 = r9.f20535a
            boolean r0 = r2.contains(r10, r0)
            if (r0 == 0) goto Lb4
            int r0 = r5.left
            int r1 = r5.right
            int r2 = z1.AbstractC2550e.f21351a
            int r10 = java.lang.Math.min(r10, r1)
            int r10 = java.lang.Math.max(r0, r10)
            r4.right = r10
            long r0 = r9.getScrubberPosition()
            r9.c(r0)
            r9.e()
            r9.invalidate()
            return r6
        Lb4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.C2365c.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (this.f20536a0 <= 0) {
            return false;
        }
        if (i == 8192) {
            if (b(-getPositionIncrement())) {
                d(false);
            }
        } else {
            if (i != 4096) {
                return false;
            }
            if (b(getPositionIncrement())) {
                d(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(@ColorInt int i) {
        this.h.setColor(i);
        invalidate(this.f20535a);
    }

    public void setBufferedColor(@ColorInt int i) {
        this.f.setColor(i);
        invalidate(this.f20535a);
    }

    public void setBufferedPosition(long j) {
        this.f20539c0 = j;
        e();
    }

    public void setDuration(long j) {
        this.f20536a0 = j;
        if (this.f20533V && j == androidx.media3.common.C.TIME_UNSET) {
            d(true);
        }
        e();
    }

    @Override // android.view.View
    public void setEnabled(boolean z4) {
        super.setEnabled(z4);
        if (!this.f20533V || z4) {
            return;
        }
        d(true);
    }

    public void setKeyCountIncrement(int i) {
        Xh.i.e(i > 0);
        this.f20526K = i;
        this.f20527P = androidx.media3.common.C.TIME_UNSET;
    }

    public void setKeyTimeIncrement(long j) {
        Xh.i.e(j > 0);
        this.f20526K = -1;
        this.f20527P = j;
    }

    public void setPlayedAdMarkerColor(@ColorInt int i) {
        this.i.setColor(i);
        invalidate(this.f20535a);
    }

    public void setPlayedColor(@ColorInt int i) {
        this.e.setColor(i);
        invalidate(this.f20535a);
    }

    public void setPosition(long j) {
        this.f20538b0 = j;
        setContentDescription(getProgressText());
        e();
    }

    public void setScrubberColor(@ColorInt int i) {
        this.j.setColor(i);
        invalidate(this.f20535a);
    }

    public void setUnplayedColor(@ColorInt int i) {
        this.f20544g.setColor(i);
        invalidate(this.f20535a);
    }
}
