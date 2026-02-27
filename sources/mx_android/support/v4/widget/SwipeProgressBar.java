package mx_android.support.v4.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.media3.exoplayer.ExoPlayer;
import mx_android.support.v4.view.ViewCompat;

/* JADX INFO: loaded from: classes7.dex */
final class SwipeProgressBar {
    private static final int ANIMATION_DURATION_MS = 2000;
    private static final int COLOR1 = -1291845632;
    private static final int COLOR2 = Integer.MIN_VALUE;
    private static final int COLOR3 = 1291845632;
    private static final int COLOR4 = 436207616;
    private static final int FINISH_ANIMATION_DURATION_MS = 1000;
    private static final Interpolator INTERPOLATOR = BakedBezierInterpolator.getInstance();
    private long mFinishTime;
    private View mParent;
    private boolean mRunning;
    private long mStartTime;
    private float mTriggerPercentage;
    private final Paint mPaint = new Paint();
    private final RectF mClipRect = new RectF();
    private Rect mBounds = new Rect();
    private int mColor1 = COLOR1;
    private int mColor2 = Integer.MIN_VALUE;
    private int mColor3 = COLOR3;
    private int mColor4 = COLOR4;

    public SwipeProgressBar(View view) {
        this.mParent = view;
    }

    void setColorScheme(int i, int i4, int i6, int i10) {
        this.mColor1 = i;
        this.mColor2 = i4;
        this.mColor3 = i6;
        this.mColor4 = i10;
    }

    void setTriggerPercentage(float f) {
        this.mTriggerPercentage = f;
        this.mStartTime = 0L;
        ViewCompat.postInvalidateOnAnimation(this.mParent, this.mBounds.left, this.mBounds.top, this.mBounds.right, this.mBounds.bottom);
    }

    void start() {
        if (this.mRunning) {
            return;
        }
        this.mTriggerPercentage = 0.0f;
        this.mStartTime = AnimationUtils.currentAnimationTimeMillis();
        this.mRunning = true;
        this.mParent.postInvalidate();
    }

    void stop() {
        if (this.mRunning) {
            this.mTriggerPercentage = 0.0f;
            this.mFinishTime = AnimationUtils.currentAnimationTimeMillis();
            this.mRunning = false;
            this.mParent.postInvalidate();
        }
    }

    boolean isRunning() {
        return this.mRunning || this.mFinishTime > 0;
    }

    void draw(Canvas canvas) {
        int iWidth = this.mBounds.width();
        int iHeight = this.mBounds.height();
        int i = iWidth / 2;
        int i4 = iHeight / 2;
        int iSave = canvas.save();
        canvas.clipRect(this.mBounds);
        if (this.mRunning || this.mFinishTime > 0) {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            long j = this.mStartTime;
            long j6 = (jCurrentAnimationTimeMillis - j) % ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS;
            long j7 = (jCurrentAnimationTimeMillis - j) / ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS;
            float f = j6 / 20.0f;
            boolean z4 = false;
            if (!this.mRunning) {
                if (jCurrentAnimationTimeMillis - this.mFinishTime >= 1000) {
                    this.mFinishTime = 0L;
                    return;
                }
                float f3 = (((jCurrentAnimationTimeMillis - r11) % 1000) / 10.0f) / 100.0f;
                float f7 = i;
                float interpolation = INTERPOLATOR.getInterpolation(f3) * f7;
                this.mClipRect.set(f7 - interpolation, 0.0f, f7 + interpolation, iHeight);
                canvas.saveLayerAlpha(this.mClipRect, 0, 0);
                z4 = true;
            }
            if (j7 == 0) {
                canvas.drawColor(this.mColor1);
            } else if (f >= 0.0f && f < 25.0f) {
                canvas.drawColor(this.mColor4);
            } else if (f >= 25.0f && f < 50.0f) {
                canvas.drawColor(this.mColor1);
            } else if (f >= 50.0f && f < 75.0f) {
                canvas.drawColor(this.mColor2);
            } else {
                canvas.drawColor(this.mColor3);
            }
            if (f >= 0.0f && f <= 25.0f) {
                drawCircle(canvas, i, i4, this.mColor1, ((f + 25.0f) * 2.0f) / 100.0f);
            }
            if (f >= 0.0f && f <= 50.0f) {
                drawCircle(canvas, i, i4, this.mColor2, (f * 2.0f) / 100.0f);
            }
            if (f >= 25.0f && f <= 75.0f) {
                drawCircle(canvas, i, i4, this.mColor3, ((f - 25.0f) * 2.0f) / 100.0f);
            }
            if (f >= 50.0f && f <= 100.0f) {
                drawCircle(canvas, i, i4, this.mColor4, ((f - 50.0f) * 2.0f) / 100.0f);
            }
            if (f >= 75.0f && f <= 100.0f) {
                drawCircle(canvas, i, i4, this.mColor1, ((f - 75.0f) * 2.0f) / 100.0f);
            }
            if (this.mTriggerPercentage > 0.0f && z4) {
                canvas.restoreToCount(iSave);
                int iSave2 = canvas.save();
                canvas.clipRect(this.mBounds);
                drawTrigger(canvas, i, i4);
                iSave = iSave2;
            }
            ViewCompat.postInvalidateOnAnimation(this.mParent, this.mBounds.left, this.mBounds.top, this.mBounds.right, this.mBounds.bottom);
        } else {
            float f10 = this.mTriggerPercentage;
            if (f10 > 0.0f && f10 <= 1.0d) {
                drawTrigger(canvas, i, i4);
            }
        }
        canvas.restoreToCount(iSave);
    }

    private void drawTrigger(Canvas canvas, int i, int i4) {
        this.mPaint.setColor(this.mColor1);
        float f = i;
        canvas.drawCircle(f, i4, this.mTriggerPercentage * f, this.mPaint);
    }

    private void drawCircle(Canvas canvas, float f, float f3, int i, float f7) {
        this.mPaint.setColor(i);
        canvas.save();
        canvas.translate(f, f3);
        float interpolation = INTERPOLATOR.getInterpolation(f7);
        canvas.scale(interpolation, interpolation);
        canvas.drawCircle(0.0f, 0.0f, f, this.mPaint);
        canvas.restore();
    }

    void setBounds(int i, int i4, int i6, int i10) {
        this.mBounds.left = i;
        this.mBounds.top = i4;
        this.mBounds.right = i6;
        this.mBounds.bottom = i10;
    }
}
