package com.paymaya.common.utility;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;

/* JADX INFO: loaded from: classes3.dex */
public final class K implements LeadingMarginSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10422a;

    public K(int i) {
        this.f10422a = i;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i4, int i6, int i10, int i11, CharSequence charSequence, int i12, int i13, boolean z4, Layout layout) {
        if (z4) {
            Paint.Style style = paint.getStyle();
            paint.setStyle(Paint.Style.FILL);
            canvas.drawText(We.s.o(new StringBuilder(), ". ", this.f10422a), 0.0f, i10, paint);
            paint.setStyle(style);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z4) {
        return 55;
    }
}
