package w1;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import u1.C2292a;

/* JADX INFO: renamed from: w1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2364b extends View implements B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f20523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f20524b;
    public float c;

    public C2364b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20523a = new ArrayList();
        this.f20524b = Collections.EMPTY_LIST;
        this.c = 0.0533f;
    }

    @Override // w1.B
    public final void a(List list, C2292a c2292a, float f, float f3) {
        this.f20524b = list;
        this.c = f;
        while (true) {
            ArrayList arrayList = this.f20523a;
            if (arrayList.size() >= list.size()) {
                invalidate();
                return;
            }
            Context context = getContext();
            p3.t tVar = new p3.t();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
            typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
            typedArrayObtainStyledAttributes.recycle();
            Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
            TextPaint textPaint = new TextPaint();
            textPaint.setAntiAlias(true);
            textPaint.setSubpixelText(true);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.FILL);
            Paint paint2 = new Paint();
            paint2.setAntiAlias(true);
            paint2.setFilterBitmap(true);
            arrayList.add(tVar);
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        List list = this.f20524b;
        if (list.isEmpty()) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int paddingBottom = height - getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i = paddingBottom - paddingTop;
        float f = this.c;
        if ((f != -3.4028235E38f ? f * i : -3.4028235E38f) > 0.0f && list.size() > 0) {
            list.get(0).getClass();
            throw new ClassCastException();
        }
    }
}
