package We;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import dOYHB6.tiZVw8.numX49;

/* JADX INFO: renamed from: We.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0611o extends AbstractC0598b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public InterfaceC0604h f6413k;

    @Override // We.AbstractC0598b
    public final void a() {
        this.j = true;
        if (this.f6413k != null) {
            this.f6413k = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // We.AbstractC0598b
    public final void b(Bitmap bitmap, int i) {
        if (bitmap == null) {
            throw new AssertionError(numX49.tnTj78("bkRy") + this);
        }
        ImageView imageView = (ImageView) this.c.get();
        if (imageView == null) {
            return;
        }
        Context context = this.f6378a.f6342b;
        int i4 = B.e;
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        imageView.setImageDrawable(new B(context, bitmap, drawable, i));
        InterfaceC0604h interfaceC0604h = this.f6413k;
        if (interfaceC0604h != null) {
            interfaceC0604h.onSuccess();
        }
    }

    @Override // We.AbstractC0598b
    public final void c(Exception exc) {
        ImageView imageView = (ImageView) this.c.get();
        if (imageView == null) {
            return;
        }
        Object drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        int i = this.f;
        if (i != 0) {
            imageView.setImageResource(i);
        }
        InterfaceC0604h interfaceC0604h = this.f6413k;
        if (interfaceC0604h != null) {
            interfaceC0604h.onError(exc);
        }
    }
}
