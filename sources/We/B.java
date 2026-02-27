package We;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes4.dex */
public final class B extends BitmapDrawable {
    public static final /* synthetic */ int e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable f6345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6346b;
    public boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6347d;

    static {
        new Paint();
    }

    public B(Context context, Bitmap bitmap, Drawable drawable, int i) {
        super(context.getResources(), bitmap);
        this.f6347d = 255;
        float f = context.getResources().getDisplayMetrics().density;
        if (i != 1) {
            this.f6345a = drawable;
            this.c = true;
            this.f6346b = SystemClock.uptimeMillis();
        }
    }

    public static void a(ImageView imageView, Drawable drawable) {
        imageView.setImageDrawable(drawable);
        if (imageView.getDrawable() instanceof Animatable) {
            ((Animatable) imageView.getDrawable()).start();
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (!this.c) {
            super.draw(canvas);
            return;
        }
        float fUptimeMillis = (SystemClock.uptimeMillis() - this.f6346b) / 200.0f;
        if (fUptimeMillis >= 1.0f) {
            this.c = false;
            this.f6345a = null;
            super.draw(canvas);
        } else {
            Drawable drawable = this.f6345a;
            if (drawable != null) {
                drawable.draw(canvas);
            }
            super.setAlpha((int) (this.f6347d * fUptimeMillis));
            super.draw(canvas);
            super.setAlpha(this.f6347d);
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f6345a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f6347d = i;
        Drawable drawable = this.f6345a;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
        super.setAlpha(i);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f6345a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        super.setColorFilter(colorFilter);
    }
}
