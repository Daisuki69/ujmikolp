package G5;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;

/* JADX INFO: loaded from: classes3.dex */
public final class w implements LeadingMarginSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1769b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Path f1770d;

    public w(int i, int i4, int i6) {
        this.f1768a = i;
        this.f1769b = i4;
        this.c = i6;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i4, int i6, int i10, int i11, CharSequence text, int i12, int i13, boolean z4, Layout layout) {
        kotlin.jvm.internal.j.g(canvas, "canvas");
        kotlin.jvm.internal.j.g(paint, "paint");
        kotlin.jvm.internal.j.g(text, "text");
        if (((Spanned) text).getSpanStart(this) == i12) {
            Paint.Style style = paint.getStyle();
            int color = paint.getColor();
            paint.setStyle(Paint.Style.FILL);
            int i14 = this.c;
            if (i14 != 0) {
                paint.setColor(i14);
            }
            int i15 = this.f1768a;
            float lineBaseline = layout != null ? layout.getLineBaseline(layout.getLineForOffset(i12)) - (i15 * 2.0f) : (i6 + i11) / 2.0f;
            float f = (i4 * i15) + i;
            if (canvas.isHardwareAccelerated()) {
                if (this.f1770d == null) {
                    Path path = new Path();
                    this.f1770d = path;
                    path.addCircle(0.0f, 0.0f, i15, Path.Direction.CW);
                }
                canvas.save();
                canvas.translate(f, lineBaseline);
                Path path2 = this.f1770d;
                kotlin.jvm.internal.j.d(path2);
                canvas.drawPath(path2, paint);
                canvas.restore();
            } else {
                canvas.drawCircle(f, lineBaseline, i15, paint);
            }
            paint.setStyle(style);
            paint.setColor(color);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z4) {
        return (this.f1768a * 2) + this.f1769b;
    }
}
