package mx_android.support.v7.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import mx_android.support.v7.appcompat.R;

/* JADX INFO: loaded from: classes7.dex */
abstract class DrawerArrowDrawable extends Drawable {
    private static final float ARROW_HEAD_ANGLE = (float) Math.toRadians(45.0d);
    private final float mBarGap;
    private final float mBarSize;
    private final float mBarThickness;
    private float mCenterOffset;
    private float mMaxCutForBarSize;
    private final float mMiddleArrowSize;
    private final Paint mPaint;
    private final Path mPath;
    private float mProgress;
    private final int mSize;
    private final boolean mSpin;
    private final float mTopBottomArrowSize;
    private boolean mVerticalMirror;

    private static float lerp(float f, float f3, float f7) {
        return f + ((f3 - f) * f7);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return true;
    }

    abstract boolean isLayoutRtl();

    DrawerArrowDrawable(Context context) {
        Paint paint = new Paint();
        this.mPaint = paint;
        this.mPath = new Path();
        this.mVerticalMirror = false;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, R.styleable.DrawerArrowToggle, R.attr.drawerArrowStyle, R.style.Base_Widget_AppCompat_DrawerArrowToggle);
        paint.setAntiAlias(true);
        paint.setColor(typedArrayObtainStyledAttributes.getColor(R.styleable.DrawerArrowToggle_color, 0));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.DrawerArrowToggle_drawableSize, 0);
        this.mSize = dimensionPixelSize;
        this.mBarSize = Math.round(typedArrayObtainStyledAttributes.getDimension(R.styleable.DrawerArrowToggle_barSize, 0.0f));
        this.mTopBottomArrowSize = Math.round(typedArrayObtainStyledAttributes.getDimension(R.styleable.DrawerArrowToggle_topBottomBarArrowSize, 0.0f));
        float dimension = typedArrayObtainStyledAttributes.getDimension(R.styleable.DrawerArrowToggle_thickness, 0.0f);
        this.mBarThickness = dimension;
        float fRound = Math.round(typedArrayObtainStyledAttributes.getDimension(R.styleable.DrawerArrowToggle_gapBetweenBars, 0.0f));
        this.mBarGap = fRound;
        this.mSpin = typedArrayObtainStyledAttributes.getBoolean(R.styleable.DrawerArrowToggle_spinBars, true);
        this.mMiddleArrowSize = typedArrayObtainStyledAttributes.getDimension(R.styleable.DrawerArrowToggle_middleBarArrowSize, 0.0f);
        float f = (((int) ((dimensionPixelSize - (3.0f * dimension)) - (fRound * 2.0f))) / 4) * 2;
        this.mCenterOffset = f;
        double d10 = f;
        double d11 = dimension;
        Double.isNaN(d11);
        double d12 = fRound;
        Double.isNaN(d12);
        Double.isNaN(d10);
        this.mCenterOffset = (float) (d10 + (d11 * 1.5d) + d12);
        typedArrayObtainStyledAttributes.recycle();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setStrokeWidth(dimension);
        double d13 = dimension / 2.0f;
        double dCos = Math.cos(ARROW_HEAD_ANGLE);
        Double.isNaN(d13);
        this.mMaxCutForBarSize = (float) (d13 * dCos);
    }

    protected void setVerticalMirror(boolean z4) {
        this.mVerticalMirror = z4;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        boolean zIsLayoutRtl = isLayoutRtl();
        float fLerp = lerp(this.mBarSize, this.mTopBottomArrowSize, this.mProgress);
        float fLerp2 = lerp(this.mBarSize, this.mMiddleArrowSize, this.mProgress);
        float fRound = Math.round(lerp(0.0f, this.mMaxCutForBarSize, this.mProgress));
        float fLerp3 = lerp(0.0f, ARROW_HEAD_ANGLE, this.mProgress);
        float fLerp4 = lerp(zIsLayoutRtl ? 0.0f : -180.0f, zIsLayoutRtl ? 180.0f : 0.0f, this.mProgress);
        double d10 = fLerp;
        double d11 = fLerp3;
        double dCos = Math.cos(d11);
        Double.isNaN(d10);
        float fRound2 = Math.round(dCos * d10);
        double dSin = Math.sin(d11);
        Double.isNaN(d10);
        float fRound3 = Math.round(d10 * dSin);
        this.mPath.rewind();
        float fLerp5 = lerp(this.mBarGap + this.mBarThickness, -this.mMaxCutForBarSize, this.mProgress);
        float f = (-fLerp2) / 2.0f;
        this.mPath.moveTo(f + fRound, 0.0f);
        this.mPath.rLineTo(fLerp2 - (fRound * 2.0f), 0.0f);
        this.mPath.moveTo(f, fLerp5);
        this.mPath.rLineTo(fRound2, fRound3);
        this.mPath.moveTo(f, -fLerp5);
        this.mPath.rLineTo(fRound2, -fRound3);
        this.mPath.close();
        canvas.save();
        canvas.translate(bounds.centerX(), this.mCenterOffset);
        if (this.mSpin) {
            canvas.rotate(fLerp4 * (this.mVerticalMirror ^ zIsLayoutRtl ? -1 : 1));
        } else if (zIsLayoutRtl) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.mPath, this.mPaint);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.mPaint.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.mPaint.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.mSize;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.mSize;
    }

    public float getProgress() {
        return this.mProgress;
    }

    public void setProgress(float f) {
        this.mProgress = f;
        invalidateSelf();
    }
}
