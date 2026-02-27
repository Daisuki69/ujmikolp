package com.vipulasri.ticketview;

import Of.a;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import x3.d;

/* JADX INFO: loaded from: classes4.dex */
public class TicketView extends View {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f16195B;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f16196K;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int f16197P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f16198Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public int f16199R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public Bitmap f16200S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final Paint f16201T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public int f16202U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public float f16203V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public Drawable f16204W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f16205a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public Drawable f16206a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f16207b;
    public final Paint c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16208d;
    public final Path e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f16209g;
    public float h;
    public float i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final RectF f16210k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RectF f16211l;
    public final RectF m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f16212n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f16213o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f16214p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f16215q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f16216r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f16217s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f16218t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f16219u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f16220v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f16221w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f16222x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f16223y;

    public TicketView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16205a = new Paint();
        this.f16207b = new Paint();
        this.c = new Paint();
        this.e = new Path();
        this.f = true;
        this.f16210k = new RectF();
        this.f16211l = new RectF();
        this.m = new RectF();
        this.f16201T = new Paint(1);
        this.f16203V = 0.0f;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, a.f4790a);
            this.f16204W = typedArrayObtainStyledAttributes.getDrawable(2);
            this.f16206a0 = typedArrayObtainStyledAttributes.getDrawable(1);
            this.f16208d = typedArrayObtainStyledAttributes.getInt(15, 0);
            this.f16215q = typedArrayObtainStyledAttributes.getColor(3, getResources().getColor(R.color.white));
            this.f16220v = typedArrayObtainStyledAttributes.getDimensionPixelSize(17, d.l(getContext(), 20.0f));
            this.f16214p = typedArrayObtainStyledAttributes.getFloat(16, 50.0f);
            this.f16216r = typedArrayObtainStyledAttributes.getBoolean(19, false);
            this.f16217s = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, d.l(getContext(), 2.0f));
            this.f16218t = typedArrayObtainStyledAttributes.getColor(4, getResources().getColor(R.color.black));
            this.f16219u = typedArrayObtainStyledAttributes.getBoolean(20, false);
            this.f16223y = typedArrayObtainStyledAttributes.getInt(12, 0);
            this.f16195B = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, d.l(getContext(), 2.0f));
            this.f16196K = typedArrayObtainStyledAttributes.getColor(8, getResources().getColor(R.color.darker_gray));
            this.f16221w = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, d.l(getContext(), 8.0f));
            this.f16222x = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, d.l(getContext(), 4.0f));
            this.f16197P = typedArrayObtainStyledAttributes.getInt(7, 0);
            this.f16198Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, d.l(getContext(), 4.0f));
            this.f16199R = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, d.l(getContext(), 10.0f));
            float dimension = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getDimension(14, 0.0f) : typedArrayObtainStyledAttributes.hasValue(0) ? typedArrayObtainStyledAttributes.getDimension(0, 0.0f) : 0.0f;
            if (dimension > 0.0f) {
                setShadowBlurRadius(dimension);
            }
            this.f16202U = typedArrayObtainStyledAttributes.getColor(18, getResources().getColor(R.color.black));
            typedArrayObtainStyledAttributes.recycle();
        }
        a();
        setLayerType(1, null);
    }

    private void setShadowBlurRadius(float f) {
        this.f16203V = Math.min((f / d.l(getContext(), 24.0f)) * 25.0f, 25.0f);
    }

    private void setTicketBackgroundAfterDivider(Canvas canvas) {
        float paddingLeft = getPaddingLeft() + this.f16203V;
        float width = (getWidth() - getPaddingRight()) - this.f16203V;
        float paddingTop = (this.f16203V / 2.0f) + getPaddingTop();
        float height = getHeight() - getPaddingBottom();
        float f = this.f16203V;
        float f3 = (height - f) - (f / 2.0f);
        if (this.f16208d == 0) {
            this.f16206a0.setBounds((int) paddingLeft, (int) this.j, (int) width, (int) f3);
        } else {
            this.f16206a0.setBounds((int) this.i, (int) paddingTop, (int) width, (int) f3);
        }
        this.f16206a0.draw(canvas);
    }

    private void setTicketBackgroundBeforeDivider(Canvas canvas) {
        float paddingLeft = getPaddingLeft() + this.f16203V;
        float width = (getWidth() - getPaddingRight()) - this.f16203V;
        float paddingTop = (this.f16203V / 2.0f) + getPaddingTop();
        float height = getHeight() - getPaddingBottom();
        float f = this.f16203V;
        float f3 = (height - f) - (f / 2.0f);
        if (this.f16208d == 0) {
            this.f16204W.setBounds((int) paddingLeft, (int) paddingTop, (int) width, (int) this.h);
        } else {
            this.f16204W.setBounds((int) paddingLeft, (int) paddingTop, (int) this.f16209g, (int) f3);
        }
        this.f16204W.draw(canvas);
    }

    public final void a() {
        int i = this.f16195B;
        int i4 = this.f16220v;
        if (i > i4) {
            this.f16195B = i4;
            Log.w("TicketView", "You cannot apply divider width greater than scallop radius. Applying divider width to scallop radius.");
        }
        this.f16213o = 100.0f / this.f16214p;
        this.f16212n = this.f16220v * 2;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(this.f16202U, PorterDuff.Mode.SRC_IN);
        Paint paint = this.f16201T;
        paint.setColorFilter(porterDuffColorFilter);
        paint.setAlpha(51);
        Paint paint2 = this.f16205a;
        paint2.setAlpha(0);
        paint2.setAntiAlias(true);
        paint2.setColor(this.f16215q);
        paint2.setStyle(Paint.Style.FILL);
        Paint paint3 = this.f16207b;
        paint3.setAlpha(0);
        paint3.setAntiAlias(true);
        paint3.setColor(this.f16218t);
        paint3.setStrokeWidth(this.f16217s);
        paint3.setStyle(Paint.Style.STROKE);
        Paint paint4 = this.c;
        paint4.setAlpha(0);
        paint4.setAntiAlias(true);
        paint4.setColor(this.f16196K);
        paint4.setStrokeWidth(this.f16195B);
        if (this.f16223y == 1) {
            paint4.setPathEffect(new DashPathEffect(new float[]{this.f16221w, this.f16222x}, 0.0f));
        } else {
            paint4.setPathEffect(new PathEffect());
        }
        this.f = true;
        invalidate();
    }

    public Drawable getBackgroundAfterDivider() {
        return this.f16206a0;
    }

    public Drawable getBackgroundBeforeDivider() {
        return this.f16204W;
    }

    public int getBackgroundColor() {
        return this.f16215q;
    }

    public int getBorderColor() {
        return this.f16218t;
    }

    public int getBorderWidth() {
        return this.f16217s;
    }

    public int getCornerRadius() {
        return this.f16198Q;
    }

    public int getCornerType() {
        return this.f16197P;
    }

    public int getDividerColor() {
        return this.f16196K;
    }

    public int getDividerDashGap() {
        return this.f16222x;
    }

    public int getDividerDashLength() {
        return this.f16221w;
    }

    public int getDividerPadding() {
        return this.f16199R;
    }

    public int getDividerType() {
        return this.f16223y;
    }

    public int getDividerWidth() {
        return this.f16195B;
    }

    public int getOrientation() {
        return this.f16208d;
    }

    public float getScallopPositionPercent() {
        return this.f16214p;
    }

    public int getScallopRadius() {
        return this.f16220v;
    }

    public int getShadowColor() {
        return this.f16202U;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        float f3;
        super.onDraw(canvas);
        boolean z4 = this.f;
        Path path = this.e;
        if (z4) {
            float paddingLeft = getPaddingLeft() + this.f16203V;
            float width = (getWidth() - getPaddingRight()) - this.f16203V;
            float paddingTop = (this.f16203V / 2.0f) + getPaddingTop();
            float height = getHeight() - getPaddingBottom();
            float f7 = this.f16203V;
            float f10 = (height - f7) - (f7 / 2.0f);
            path.reset();
            int i = this.f16208d;
            RectF rectF = this.f16210k;
            f = 2.0f;
            if (i == 0) {
                f3 = ((paddingTop + f10) / this.f16213o) - this.f16220v;
                int i4 = this.f16197P;
                if (i4 == 1) {
                    RectF rectF2 = this.f16211l;
                    float f11 = this.f16198Q * 2;
                    rectF2.set(paddingLeft, paddingTop, paddingLeft + f11, f11 + paddingTop);
                    path.arcTo(rectF2, 180.0f, 90.0f, false);
                    path.lineTo(this.f16198Q + paddingLeft, paddingTop);
                    path.lineTo(width - this.f16198Q, paddingTop);
                    RectF rectF3 = this.f16211l;
                    float f12 = this.f16198Q * 2;
                    rectF3.set(width - f12, paddingTop, width, f12 + paddingTop);
                    path.arcTo(rectF3, -90.0f, 90.0f, false);
                } else if (i4 == 2) {
                    RectF rectF4 = this.m;
                    float f13 = this.f16198Q;
                    rectF4.set(paddingLeft - f13, paddingTop - f13, paddingLeft + f13, f13 + paddingTop);
                    path.arcTo(rectF4, 90.0f, -90.0f, false);
                    path.lineTo(this.f16198Q + paddingLeft, paddingTop);
                    path.lineTo(width - this.f16198Q, paddingTop);
                    RectF rectF5 = this.m;
                    float f14 = this.f16198Q;
                    rectF5.set(width - f14, paddingTop - f14, width + f14, f14 + paddingTop);
                    path.arcTo(rectF5, 180.0f, -90.0f, false);
                } else {
                    path.moveTo(paddingLeft, paddingTop);
                    path.lineTo(width, paddingTop);
                }
                float f15 = this.f16220v;
                float f16 = paddingTop + f3;
                rectF.set(width - f15, f16, f15 + width, this.f16212n + f3 + paddingTop);
                path.arcTo(rectF, 270.0f, -180.0f, false);
                int i6 = this.f16197P;
                if (i6 == 1) {
                    RectF rectF6 = this.f16211l;
                    float f17 = this.f16198Q * 2;
                    rectF6.set(width - f17, f10 - f17, width, f10);
                    path.arcTo(rectF6, 0.0f, 90.0f, false);
                    path.lineTo(width - this.f16198Q, f10);
                    path.lineTo(this.f16198Q + paddingLeft, f10);
                    RectF rectF7 = this.f16211l;
                    float f18 = this.f16198Q * 2;
                    rectF7.set(paddingLeft, f10 - f18, f18 + paddingLeft, f10);
                    path.arcTo(rectF7, 90.0f, 90.0f, false);
                } else if (i6 == 2) {
                    RectF rectF8 = this.m;
                    float f19 = this.f16198Q;
                    rectF8.set(width - f19, f10 - f19, width + f19, f19 + f10);
                    path.arcTo(rectF8, 270.0f, -90.0f, false);
                    path.lineTo(width - this.f16198Q, f10);
                    path.lineTo(this.f16198Q + paddingLeft, f10);
                    RectF rectF9 = this.m;
                    float f20 = this.f16198Q;
                    rectF9.set(paddingLeft - f20, f10 - f20, paddingLeft + f20, f20 + f10);
                    path.arcTo(rectF9, 0.0f, -90.0f, false);
                } else {
                    path.lineTo(width, f10);
                    path.lineTo(paddingLeft, f10);
                }
                float f21 = this.f16220v;
                rectF.set(paddingLeft - f21, f16, f21 + paddingLeft, this.f16212n + f3 + paddingTop);
                path.arcTo(rectF, 90.0f, -180.0f, false);
                path.close();
            } else {
                f3 = ((width + paddingLeft) / this.f16213o) - this.f16220v;
                int i10 = this.f16197P;
                if (i10 == 1) {
                    RectF rectF10 = this.f16211l;
                    float f22 = this.f16198Q * 2;
                    rectF10.set(paddingLeft, paddingTop, paddingLeft + f22, f22 + paddingTop);
                    path.arcTo(rectF10, 180.0f, 90.0f, false);
                    path.lineTo(this.f16198Q + paddingLeft, paddingTop);
                } else if (i10 == 2) {
                    RectF rectF11 = this.m;
                    float f23 = this.f16198Q;
                    rectF11.set(paddingLeft - f23, paddingTop - f23, paddingLeft + f23, f23 + paddingTop);
                    path.arcTo(rectF11, 90.0f, -90.0f, false);
                    path.lineTo(this.f16198Q + paddingLeft, paddingTop);
                } else {
                    path.moveTo(paddingLeft, paddingTop);
                }
                float f24 = paddingLeft + f3;
                float f25 = this.f16220v;
                rectF.set(f24, paddingTop - f25, this.f16212n + f3 + paddingLeft, f25 + paddingTop);
                path.arcTo(rectF, 180.0f, -180.0f, false);
                int i11 = this.f16197P;
                if (i11 == 1) {
                    path.lineTo(width - this.f16198Q, paddingTop);
                    RectF rectF12 = this.f16211l;
                    float f26 = this.f16198Q * 2;
                    rectF12.set(width - f26, paddingTop, width, f26 + paddingTop);
                    path.arcTo(rectF12, -90.0f, 90.0f, false);
                    RectF rectF13 = this.f16211l;
                    float f27 = this.f16198Q * 2;
                    rectF13.set(width - f27, f10 - f27, width, f10);
                    path.arcTo(rectF13, 0.0f, 90.0f, false);
                    path.lineTo(width - this.f16198Q, f10);
                } else if (i11 == 2) {
                    path.lineTo(width - this.f16198Q, paddingTop);
                    RectF rectF14 = this.m;
                    float f28 = this.f16198Q;
                    rectF14.set(width - f28, paddingTop - f28, width + f28, f28 + paddingTop);
                    path.arcTo(rectF14, 180.0f, -90.0f, false);
                    RectF rectF15 = this.m;
                    float f29 = this.f16198Q;
                    rectF15.set(width - f29, f10 - f29, width + f29, f29 + f10);
                    path.arcTo(rectF15, 270.0f, -90.0f, false);
                    path.lineTo(width - this.f16198Q, f10);
                } else {
                    path.lineTo(width, paddingTop);
                    path.lineTo(width, f10);
                }
                float f30 = this.f16220v;
                rectF.set(f24, f10 - f30, this.f16212n + f3 + paddingLeft, f30 + f10);
                path.arcTo(rectF, 0.0f, -180.0f, false);
                int i12 = this.f16197P;
                if (i12 == 1) {
                    RectF rectF16 = this.f16211l;
                    float f31 = this.f16198Q * 2;
                    rectF16.set(paddingLeft, f10 - f31, f31 + paddingLeft, f10);
                    path.arcTo(rectF16, 90.0f, 90.0f, false);
                    path.lineTo(paddingLeft, f10 - this.f16198Q);
                } else if (i12 == 2) {
                    RectF rectF17 = this.m;
                    float f32 = this.f16198Q;
                    rectF17.set(paddingLeft - f32, f10 - f32, paddingLeft + f32, f32 + f10);
                    path.arcTo(rectF17, 0.0f, -90.0f, false);
                    path.lineTo(paddingLeft, f10 - this.f16198Q);
                } else {
                    path.lineTo(paddingLeft, f10);
                }
                path.close();
            }
            if (this.f16208d == 0) {
                float f33 = this.f16220v;
                float f34 = this.f16199R;
                this.f16209g = paddingLeft + f33 + f34;
                float f35 = paddingTop + f33 + f3;
                this.h = f35;
                this.i = (width - f33) - f34;
                this.j = f35;
            } else {
                float f36 = this.f16220v;
                float f37 = paddingLeft + f36 + f3;
                this.f16209g = f37;
                float f38 = this.f16199R;
                this.h = paddingTop + f36 + f38;
                this.i = f37;
                this.j = (f10 - f36) - f38;
            }
            if (!isInEditMode() && this.f16203V != 0.0f) {
                Bitmap bitmap = this.f16200S;
                if (bitmap == null) {
                    this.f16200S = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
                } else {
                    bitmap.eraseColor(0);
                }
                Canvas canvas2 = new Canvas(this.f16200S);
                Paint paint = this.f16201T;
                canvas2.drawPath(path, paint);
                if (this.f16216r) {
                    canvas2.drawPath(path, paint);
                }
                Context context = getContext();
                Bitmap bitmap2 = this.f16200S;
                float f39 = this.f16203V;
                if (bitmap2 != null && !bitmap2.isRecycled()) {
                    RenderScript renderScriptCreate = RenderScript.create(context);
                    ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
                    Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmap2);
                    Allocation allocationCreateTyped = Allocation.createTyped(renderScriptCreate, allocationCreateFromBitmap.getType());
                    scriptIntrinsicBlurCreate.setRadius(f39);
                    scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
                    scriptIntrinsicBlurCreate.forEach(allocationCreateTyped);
                    allocationCreateTyped.copyTo(bitmap2);
                    allocationCreateFromBitmap.destroy();
                    allocationCreateTyped.destroy();
                }
                this.f16200S = bitmap2;
            }
            this.f = false;
        } else {
            f = 2.0f;
        }
        if (this.f16203V > 0.0f && !isInEditMode()) {
            canvas.drawBitmap(this.f16200S, 0.0f, this.f16203V / f, (Paint) null);
        }
        canvas.drawPath(path, this.f16205a);
        canvas.clipPath(path);
        if (this.f16216r) {
            canvas.drawPath(path, this.f16207b);
        }
        if (this.f16219u) {
            canvas.drawLine(this.f16209g, this.h, this.i, this.j, this.c);
        }
        if (this.f16206a0 != null) {
            setTicketBackgroundAfterDivider(canvas);
        }
        if (this.f16204W != null) {
            setTicketBackgroundBeforeDivider(canvas);
        }
    }

    public void setBackgroundAfterDivider(Drawable drawable) {
        this.f16206a0 = drawable;
        a();
    }

    public void setBackgroundBeforeDivider(Drawable drawable) {
        this.f16204W = drawable;
        a();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.f16215q = i;
        a();
    }

    public void setBorderColor(int i) {
        this.f16218t = i;
        a();
    }

    public void setBorderWidth(int i) {
        this.f16217s = i;
        a();
    }

    public void setCornerRadius(int i) {
        this.f16198Q = i;
        a();
    }

    public void setCornerType(int i) {
        this.f16197P = i;
        a();
    }

    public void setDividerColor(int i) {
        this.f16196K = i;
        a();
    }

    public void setDividerDashGap(int i) {
        this.f16222x = i;
        a();
    }

    public void setDividerDashLength(int i) {
        this.f16221w = i;
        a();
    }

    public void setDividerPadding(int i) {
        this.f16199R = i;
        a();
    }

    public void setDividerType(int i) {
        this.f16223y = i;
        a();
    }

    public void setDividerWidth(int i) {
        this.f16195B = i;
        a();
    }

    public void setOrientation(int i) {
        this.f16208d = i;
        a();
    }

    public void setScallopPositionPercent(float f) {
        this.f16214p = f;
        a();
    }

    public void setScallopRadius(int i) {
        this.f16220v = i;
        a();
    }

    public void setShadowColor(int i) {
        this.f16202U = i;
        a();
    }

    public void setShowBorder(boolean z4) {
        this.f16216r = z4;
        a();
    }

    public void setShowDivider(boolean z4) {
        this.f16219u = z4;
        a();
    }

    public void setTicketElevation(float f) {
        setShadowBlurRadius(f);
        a();
    }
}
