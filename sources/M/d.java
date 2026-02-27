package M;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.clevertap.android.sdk.gif.GifImageView;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GifImageView f3044b;

    public /* synthetic */ d(GifImageView gifImageView, int i) {
        this.f3043a = i;
        this.f3044b = gifImageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3043a) {
            case 0:
                GifImageView gifImageView = this.f3044b;
                gifImageView.h = null;
                gifImageView.f9469d = null;
                gifImageView.f9468b = null;
                gifImageView.f9470g = false;
                break;
            default:
                GifImageView gifImageView2 = this.f3044b;
                Bitmap bitmap = gifImageView2.h;
                if (bitmap != null && !bitmap.isRecycled()) {
                    gifImageView2.setImageBitmap(gifImageView2.h);
                    gifImageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    break;
                }
                break;
        }
    }
}
