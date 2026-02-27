package F8;

import We.K;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ImageView f1553b;

    public /* synthetic */ b(ImageView imageView, int i) {
        this.f1552a = i;
        this.f1553b = imageView;
    }

    @Override // We.K
    public final void a(Bitmap bitmap) {
        switch (this.f1552a) {
            case 0:
                if (bitmap != null) {
                    this.f1553b.setImageBitmap(bitmap);
                }
                break;
            default:
                if (bitmap != null) {
                    ImageView imageView = this.f1553b;
                    ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                    j.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    int i = imageView.getResources().getDisplayMetrics().widthPixels;
                    if (bitmap.getHeight() > bitmap.getWidth()) {
                        if (bitmap.getWidth() < i / 2) {
                            marginLayoutParams.width = (int) (((double) i) * 0.6d);
                        } else {
                            marginLayoutParams.width = -2;
                        }
                        LinearLayout.LayoutParams layoutParams2 = marginLayoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) marginLayoutParams : null;
                        if (layoutParams2 != null) {
                            layoutParams2.gravity = 1;
                        }
                    } else {
                        marginLayoutParams.width = -1;
                    }
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    imageView.setAdjustViewBounds(true);
                    imageView.setImageBitmap(bitmap);
                }
                break;
        }
    }

    @Override // We.K
    public final void b(Exception exc, Drawable drawable) {
        switch (this.f1552a) {
            case 0:
                this.f1553b.setImageResource(2131231490);
                yk.a.d();
                break;
            default:
                this.f1553b.setImageDrawable(drawable);
                break;
        }
    }

    @Override // We.K
    public final void c(Drawable drawable) {
        switch (this.f1552a) {
            case 0:
                this.f1553b.setImageResource(2131231490);
                break;
            default:
                this.f1553b.setImageDrawable(drawable);
                break;
        }
    }
}
