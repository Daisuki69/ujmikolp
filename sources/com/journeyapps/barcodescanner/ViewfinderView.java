package com.journeyapps.barcodescanner;

import C3.l;
import H3.h;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.media3.extractor.ts.PsExtractor;
import com.paymaya.R;
import java.util.ArrayList;
import m4.d;
import m4.e;

/* JADX INFO: loaded from: classes3.dex */
public class ViewfinderView extends View {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f10150k = {0, 64, 128, PsExtractor.AUDIO_STREAM, 255, PsExtractor.AUDIO_STREAM, 128, 64};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f10151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10152b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10153d;
    public int e;
    public ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f10154g;
    public e h;
    public Rect i;
    public Rect j;

    public ViewfinderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10151a = new Paint(1);
        Resources resources = getResources();
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.f2096b);
        this.f10152b = typedArrayObtainStyledAttributes.getColor(3, resources.getColor(R.color.zxing_viewfinder_mask));
        typedArrayObtainStyledAttributes.getColor(1, resources.getColor(R.color.zxing_result_view));
        this.c = typedArrayObtainStyledAttributes.getColor(2, resources.getColor(R.color.zxing_viewfinder_laser));
        this.f10153d = typedArrayObtainStyledAttributes.getColor(0, resources.getColor(R.color.zxing_possible_result_points));
        typedArrayObtainStyledAttributes.recycle();
        this.e = 0;
        this.f = new ArrayList(20);
        this.f10154g = new ArrayList(20);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Rect rect;
        e eVar = this.h;
        if (eVar != null) {
            Rect framingRect = eVar.getFramingRect();
            Rect previewFramingRect = this.h.getPreviewFramingRect();
            if (framingRect != null && previewFramingRect != null) {
                this.i = framingRect;
                this.j = previewFramingRect;
            }
        }
        Rect rect2 = this.i;
        if (rect2 == null || (rect = this.j) == null) {
            return;
        }
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        Paint paint = this.f10151a;
        paint.setColor(this.f10152b);
        float f = width;
        canvas.drawRect(0.0f, 0.0f, f, rect2.top, paint);
        canvas.drawRect(0.0f, rect2.top, rect2.left, rect2.bottom + 1, paint);
        canvas.drawRect(rect2.right + 1, rect2.top, f, rect2.bottom + 1, paint);
        canvas.drawRect(0.0f, rect2.bottom + 1, f, height, paint);
        paint.setColor(this.c);
        paint.setAlpha(f10150k[this.e]);
        this.e = (this.e + 1) % 8;
        int iHeight = (rect2.height() / 2) + rect2.top;
        canvas.drawRect(rect2.left + 2, iHeight - 1, rect2.right - 1, iHeight + 2, paint);
        float fWidth = rect2.width() / rect.width();
        float fHeight = rect2.height() / rect.height();
        int i = rect2.left;
        int i4 = rect2.top;
        boolean zIsEmpty = this.f10154g.isEmpty();
        int i6 = this.f10153d;
        if (!zIsEmpty) {
            paint.setAlpha(80);
            paint.setColor(i6);
            for (l lVar : this.f10154g) {
                canvas.drawCircle(((int) (lVar.f727a * fWidth)) + i, ((int) (lVar.f728b * fHeight)) + i4, 3.0f, paint);
            }
            this.f10154g.clear();
        }
        if (!this.f.isEmpty()) {
            paint.setAlpha(160);
            paint.setColor(i6);
            for (l lVar2 : this.f) {
                canvas.drawCircle(((int) (lVar2.f727a * fWidth)) + i, ((int) (lVar2.f728b * fHeight)) + i4, 6.0f, paint);
            }
            ArrayList arrayList = this.f;
            ArrayList arrayList2 = this.f10154g;
            this.f = arrayList2;
            this.f10154g = arrayList;
            arrayList2.clear();
        }
        postInvalidateDelayed(80L, rect2.left - 6, rect2.top - 6, rect2.right + 6, rect2.bottom + 6);
    }

    public void setCameraPreview(e eVar) {
        this.h = eVar;
        eVar.j.add(new d(this, 2));
    }
}
