package ee;

import Xj.h;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.TypedValue;
import com.paymaya.R;
import dOYHB6.tiZVw8.numX49;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends h {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f16651k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f16652l;
    public final String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Paint f16653n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f16654o;

    public b(Context context) {
        super(context);
        Paint paint = new Paint();
        this.f16653n = paint;
        this.f16654o = false;
        setBorderColor(-1);
        paint.setColor(-1);
        paint.setAntiAlias(true);
        paint.setTextSize(TypedValue.applyDimension(2, 16.0f, getResources().getDisplayMetrics()));
        paint.setTypeface(Typeface.create(numX49.tnTj78("bib2"), 0));
        this.f16651k = getResources().getString(R.string.pma_label_align_barcode_code);
        this.f16652l = getResources().getString(R.string.pma_label_barcode_invalid);
        this.m = getResources().getString(R.string.pma_label_please_try_again);
    }

    @Override // Xj.h, android.view.View
    public final void onDraw(Canvas canvas) {
        BigDecimal bigDecimalValueOf;
        BigDecimal bigDecimalValueOf2;
        super.onDraw(canvas);
        Rect framingRect = getFramingRect();
        Paint paint = this.f16653n;
        paint.setTextAlign(Paint.Align.CENTER);
        if (framingRect != null) {
            bigDecimalValueOf = BigDecimal.valueOf((((double) framingRect.top) - ((double) paint.getTextSize())) - 30.0d);
            bigDecimalValueOf2 = BigDecimal.valueOf(getWidth() / 2);
        } else {
            bigDecimalValueOf = BigDecimal.valueOf(10L);
            bigDecimalValueOf2 = BigDecimal.valueOf((((double) canvas.getHeight()) - ((double) paint.getTextSize())) - 10.0d);
        }
        if (!this.f16654o) {
            canvas.drawText(this.f16651k, bigDecimalValueOf2.intValue(), bigDecimalValueOf.intValue(), paint);
        } else {
            canvas.drawText(this.f16652l, bigDecimalValueOf2.intValue(), bigDecimalValueOf.subtract(BigDecimal.valueOf(40L)).intValue(), paint);
            canvas.drawText(this.m, bigDecimalValueOf2.intValue(), bigDecimalValueOf.intValue(), paint);
        }
    }

    public void setErrorState(boolean z4) {
        this.f16654o = z4;
    }
}
