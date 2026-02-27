package G5;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends ImageSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1767a;

    public v(Drawable drawable, int i) {
        super(drawable);
        this.f1767a = i;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i4, float f, int i6, int i10, int i11, Paint paint) {
        float f3;
        kotlin.jvm.internal.j.g(canvas, "canvas");
        kotlin.jvm.internal.j.g(paint, "paint");
        Drawable drawable = getDrawable();
        canvas.save();
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        kotlin.jvm.internal.j.f(fontMetricsInt, "getFontMetricsInt(...)");
        float f7 = i11 - drawable.getBounds().bottom;
        if (this.f1767a == 1) {
            int i12 = fontMetricsInt.descent;
            f3 = ((i10 + i12) - ((i12 - fontMetricsInt.ascent) / 2)) - ((drawable.getBounds().bottom - drawable.getBounds().top) / 2.0f);
        } else {
            f3 = f7 - paint.getFontMetricsInt().descent;
        }
        canvas.translate(f, f3);
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i4, Paint.FontMetricsInt fontMetricsInt) {
        kotlin.jvm.internal.j.g(paint, "paint");
        Rect bounds = getDrawable().getBounds();
        kotlin.jvm.internal.j.f(bounds, "getBounds(...)");
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            kotlin.jvm.internal.j.f(fontMetricsInt2, "getFontMetricsInt(...)");
            if (this.f1767a == 1) {
                int i6 = fontMetricsInt2.descent;
                int i10 = fontMetricsInt2.ascent;
                int i11 = ((i6 - i10) / 2) + i10;
                int i12 = (bounds.bottom - bounds.top) / 2;
                int i13 = i11 - i12;
                fontMetricsInt.ascent = i13;
                fontMetricsInt.top = i13;
                int i14 = i11 + i12;
                fontMetricsInt.bottom = i14;
                fontMetricsInt.descent = i14;
            } else {
                int i15 = -bounds.bottom;
                fontMetricsInt.ascent = i15;
                fontMetricsInt.descent = 0;
                fontMetricsInt.top = i15;
                fontMetricsInt.bottom = 0;
            }
        }
        return bounds.right;
    }
}
