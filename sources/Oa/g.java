package Oa;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends Xj.h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context) {
        super(context);
        j.g(context, "context");
        setBorderColor(0);
    }

    @Override // Xj.h
    public final void a(Canvas canvas) {
        postInvalidateDelayed(80L);
    }

    @Override // Xj.h
    public final void b(Canvas canvas) {
        Path path = new Path();
        int i = getFramingRect().bottom - getFramingRect().top;
        int i4 = getFramingRect().right - getFramingRect().left;
        path.moveTo(getFramingRect().left, getFramingRect().top + i);
        path.lineTo(getFramingRect().left, getFramingRect().top);
        path.lineTo(getFramingRect().left + i4, getFramingRect().top);
        canvas.drawPath(path, this.e);
        path.moveTo(getFramingRect().right, getFramingRect().top + i);
        path.lineTo(getFramingRect().right, getFramingRect().top);
        canvas.drawPath(path, this.e);
        path.moveTo(getFramingRect().right - i4, getFramingRect().bottom);
        path.lineTo(getFramingRect().right, getFramingRect().bottom);
        canvas.drawPath(path, this.e);
    }

    @Override // Xj.h, android.view.View
    public final void onDraw(Canvas canvas) {
        j.g(canvas, "canvas");
        super.onDraw(canvas);
        a(canvas);
    }

    public final void setErrorState(boolean z4) {
    }
}
