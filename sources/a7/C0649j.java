package a7;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.math.BigDecimal;

/* JADX INFO: renamed from: a7.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0649j extends C0651l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7022d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f7023g;
    public final int h;
    public final int i;
    public final Paint j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Paint f7024k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0649j(int i, EnumC0650k mCarouselDividerMode, int i4, int i6, int i10, int i11, int i12, int i13, int i14) {
        super(i, mCarouselDividerMode, false);
        kotlin.jvm.internal.j.g(mCarouselDividerMode, "mCarouselDividerMode");
        this.f7022d = i4;
        this.e = i6;
        this.f = i10;
        this.f7023g = i11;
        this.h = i12;
        this.i = (i4 * 2) + i10;
        Paint paint = new Paint();
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setAntiAlias(true);
        paint.setColor(i13);
        this.j = paint;
        Paint paint2 = new Paint();
        double d10 = ((double) Resources.getSystem().getDisplayMetrics().density) * ((double) 1);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(BigDecimal.valueOf(d10).floatValue());
        paint2.setStyle(style);
        paint2.setAntiAlias(true);
        paint2.setColor(i14);
        this.f7024k = paint2;
    }

    @Override // a7.C0651l, androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        kotlin.jvm.internal.j.g(outRect, "outRect");
        kotlin.jvm.internal.j.g(view, "view");
        kotlin.jvm.internal.j.g(parent, "parent");
        kotlin.jvm.internal.j.g(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        outRect.bottom = this.f7023g + this.h;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDrawOver(Canvas canvas, RecyclerView parent, RecyclerView.State state) {
        int i;
        int iFindFirstVisibleItemPosition;
        kotlin.jvm.internal.j.g(canvas, "canvas");
        kotlin.jvm.internal.j.g(parent, "parent");
        kotlin.jvm.internal.j.g(state, "state");
        super.onDrawOver(canvas, parent, state);
        RecyclerView.Adapter adapter = parent.getAdapter();
        Rc.c cVar = adapter instanceof Rc.c ? (Rc.c) adapter : null;
        if (cVar == null) {
            return;
        }
        int size = cVar.f5477d.size();
        int i4 = this.f7022d;
        double d10 = i4;
        double width = ((double) parent.getWidth()) - ((((double) Math.max(0, size - 1)) * ((double) this.f)) + ((2.0d * d10) * ((double) size)));
        double d11 = 2L;
        double height = ((double) parent.getHeight()) - ((((double) this.h) + ((double) this.f7023g)) / d11);
        double d12 = (width / d11) + d10;
        double d13 = d12;
        int i6 = 0;
        while (true) {
            i = this.i;
            if (i6 >= size) {
                break;
            }
            canvas.drawCircle(BigDecimal.valueOf(d13).floatValue(), BigDecimal.valueOf(height).floatValue(), i4, this.j);
            d13 += (double) i;
            i6++;
            size = size;
        }
        int i10 = size;
        RecyclerView.LayoutManager layoutManager = parent.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) parent.getLayoutManager();
            iFindFirstVisibleItemPosition = (gridLayoutManager != null ? gridLayoutManager.findFirstVisibleItemPosition() : 0) % i10;
        } else {
            if (!(layoutManager instanceof LinearLayoutManager)) {
                return;
            }
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) parent.getLayoutManager();
            iFindFirstVisibleItemPosition = (linearLayoutManager != null ? linearLayoutManager.findFirstVisibleItemPosition() : 0) % i10;
        }
        if (iFindFirstVisibleItemPosition == -1) {
            return;
        }
        canvas.drawCircle(BigDecimal.valueOf(d12 + ((double) (i * iFindFirstVisibleItemPosition))).floatValue(), BigDecimal.valueOf(height).floatValue(), BigDecimal.valueOf(this.e).floatValue(), this.f7024k);
    }
}
