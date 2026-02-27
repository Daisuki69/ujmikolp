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
public final class d extends h {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f16656k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f16657l;
    public final String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Paint f16658n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f16659o;

    public d(Context context) {
        super(context);
        Paint paint = new Paint();
        this.f16658n = paint;
        this.f16659o = false;
        setBorderColor(-1);
        paint.setColor(-1);
        paint.setAntiAlias(true);
        paint.setTextSize(TypedValue.applyDimension(2, 16.0f, getResources().getDisplayMetrics()));
        paint.setTypeface(Typeface.create(numX49.tnTj78("bibb"), 0));
        setSquareViewFinder(true);
        this.f16656k = getResources().getString(R.string.pma_label_align_qr_code);
        this.f16657l = getResources().getString(R.string.pma_label_qr_code_invalid);
        this.m = getResources().getString(R.string.pma_label_please_scan_another_code);
    }

    @Override // Xj.h, android.view.View
    public final void onDraw(Canvas canvas) {
        BigDecimal bigDecimalValueOf;
        BigDecimal bigDecimalValueOf2;
        super.onDraw(canvas);
        Rect framingRect = getFramingRect();
        Paint paint = this.f16658n;
        paint.setTextAlign(Paint.Align.CENTER);
        if (framingRect != null) {
            bigDecimalValueOf = BigDecimal.valueOf((((double) framingRect.top) - ((double) paint.getTextSize())) - 30.0d);
            bigDecimalValueOf2 = BigDecimal.valueOf(getWidth() / 2);
        } else {
            bigDecimalValueOf = BigDecimal.valueOf(10L);
            bigDecimalValueOf2 = BigDecimal.valueOf((((double) canvas.getHeight()) - ((double) paint.getTextSize())) - 10.0d);
        }
        if (!this.f16659o) {
            canvas.drawText(this.f16656k, bigDecimalValueOf2.intValue(), bigDecimalValueOf.intValue(), paint);
        } else {
            canvas.drawText(this.f16657l, bigDecimalValueOf2.intValue(), bigDecimalValueOf.subtract(BigDecimal.valueOf(40L)).intValue(), paint);
            canvas.drawText(this.m, bigDecimalValueOf2.intValue(), bigDecimalValueOf.intValue(), paint);
        }
    }

    public void setErrorState(boolean z4) {
        this.f16659o = z4;
    }
}
