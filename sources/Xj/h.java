package Xj;

import S1.s;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import androidx.media3.extractor.ts.PsExtractor;
import com.paymaya.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class h extends View implements g {
    public static final int[] j = {0, 64, 128, PsExtractor.AUDIO_STREAM, 255, PsExtractor.AUDIO_STREAM, 128, 64};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Rect f6697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6698b;
    public final Paint c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f6699d;
    public final Paint e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f6700g;
    public boolean h;
    public int i;

    public h(Context context) {
        super(context);
        int color = getResources().getColor(R.color.viewfinder_laser);
        int color2 = getResources().getColor(R.color.viewfinder_mask);
        int color3 = getResources().getColor(R.color.viewfinder_border);
        int integer = getResources().getInteger(2131427398);
        int integer2 = getResources().getInteger(2131427397);
        this.i = 0;
        Paint paint = new Paint();
        this.c = paint;
        paint.setColor(color);
        this.c.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f6699d = paint2;
        paint2.setColor(color2);
        Paint paint3 = new Paint();
        this.e = paint3;
        paint3.setColor(color3);
        this.e.setStyle(Paint.Style.STROKE);
        this.e.setStrokeWidth(integer);
        this.e.setAntiAlias(true);
        this.f = integer2;
    }

    public void a(Canvas canvas) {
        Rect framingRect = getFramingRect();
        this.c.setAlpha(j[this.f6698b]);
        this.f6698b = (this.f6698b + 1) % 8;
        int iHeight = (framingRect.height() / 2) + framingRect.top;
        canvas.drawRect(framingRect.left + 2, iHeight - 1, framingRect.right - 1, iHeight + 2, this.c);
        postInvalidateDelayed(80L, framingRect.left - 10, framingRect.top - 10, framingRect.right + 10, framingRect.bottom + 10);
    }

    public void b(Canvas canvas) {
        Rect framingRect = getFramingRect();
        Path path = new Path();
        path.moveTo(framingRect.left, framingRect.top + this.f);
        path.lineTo(framingRect.left, framingRect.top);
        path.lineTo(framingRect.left + this.f, framingRect.top);
        canvas.drawPath(path, this.e);
        path.moveTo(framingRect.right, framingRect.top + this.f);
        path.lineTo(framingRect.right, framingRect.top);
        path.lineTo(framingRect.right - this.f, framingRect.top);
        canvas.drawPath(path, this.e);
        path.moveTo(framingRect.right, framingRect.bottom - this.f);
        path.lineTo(framingRect.right, framingRect.bottom);
        path.lineTo(framingRect.right - this.f, framingRect.bottom);
        canvas.drawPath(path, this.e);
        path.moveTo(framingRect.left, framingRect.bottom - this.f);
        path.lineTo(framingRect.left, framingRect.bottom);
        path.lineTo(framingRect.left + this.f, framingRect.bottom);
        canvas.drawPath(path, this.e);
    }

    public final void c() {
        d();
        invalidate();
    }

    public final synchronized void d() {
        int width;
        int height;
        try {
            Point point = new Point(getWidth(), getHeight());
            int iJ = s.j(getContext());
            if (this.f6700g) {
                width = (int) ((iJ != 1 ? getHeight() : getWidth()) * 0.625f);
                height = width;
            } else if (iJ != 1) {
                int height2 = (int) (getHeight() * 0.625f);
                height = height2;
                width = (int) (height2 * 1.4f);
            } else {
                width = (int) (getWidth() * 0.75f);
                height = (int) (width * 0.75f);
            }
            if (width > getWidth()) {
                width = getWidth() - 50;
            }
            if (height > getHeight()) {
                height = getHeight() - 50;
            }
            int i = (point.x - width) / 2;
            int i4 = (point.y - height) / 2;
            int i6 = this.i;
            this.f6697a = new Rect(i + i6, i4 + i6, (i + width) - i6, (i4 + height) - i6);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public Rect getFramingRect() {
        return this.f6697a;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (getFramingRect() == null) {
            return;
        }
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        Rect framingRect = getFramingRect();
        float f = width;
        canvas.drawRect(0.0f, 0.0f, f, framingRect.top, this.f6699d);
        canvas.drawRect(0.0f, framingRect.top, framingRect.left, framingRect.bottom + 1, this.f6699d);
        canvas.drawRect(framingRect.right + 1, framingRect.top, f, framingRect.bottom + 1, this.f6699d);
        canvas.drawRect(0.0f, framingRect.bottom + 1, f, height, this.f6699d);
        b(canvas);
        if (this.h) {
            a(canvas);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i4, int i6, int i10) {
        d();
    }

    public void setBorderAlpha(float f) {
        this.e.setAlpha((int) (f * 255.0f));
    }

    public void setBorderColor(int i) {
        this.e.setColor(i);
    }

    public void setBorderCornerRadius(int i) {
        this.e.setPathEffect(new CornerPathEffect(i));
    }

    public void setBorderCornerRounded(boolean z4) {
        if (z4) {
            this.e.setStrokeJoin(Paint.Join.ROUND);
        } else {
            this.e.setStrokeJoin(Paint.Join.BEVEL);
        }
    }

    public void setBorderLineLength(int i) {
        this.f = i;
    }

    public void setBorderStrokeWidth(int i) {
        this.e.setStrokeWidth(i);
    }

    public void setLaserColor(int i) {
        this.c.setColor(i);
    }

    public void setLaserEnabled(boolean z4) {
        this.h = z4;
    }

    public void setMaskColor(int i) {
        this.f6699d.setColor(i);
    }

    public void setSquareViewFinder(boolean z4) {
        this.f6700g = z4;
    }

    public void setViewFinderOffset(int i) {
        this.i = i;
    }
}
