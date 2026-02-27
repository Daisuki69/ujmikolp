package We;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: We.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewTreeObserverOnPreDrawListenerC0607k implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G f6407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f6408b;
    public InterfaceC0604h c;

    public ViewTreeObserverOnPreDrawListenerC0607k(G g8, ImageView imageView, InterfaceC0604h interfaceC0604h) {
        this.f6407a = g8;
        this.f6408b = new WeakReference(imageView);
        this.c = interfaceC0604h;
        imageView.addOnAttachStateChangeListener(this);
        if (imageView.getWindowToken() != null) {
            imageView.getViewTreeObserver().addOnPreDrawListener(this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        WeakReference weakReference = this.f6408b;
        ImageView imageView = (ImageView) weakReference.get();
        if (imageView != null) {
            ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                int width = imageView.getWidth();
                int height = imageView.getHeight();
                if (width > 0 && height > 0) {
                    imageView.removeOnAttachStateChangeListener(this);
                    viewTreeObserver.removeOnPreDrawListener(this);
                    weakReference.clear();
                    G g8 = this.f6407a;
                    g8.c = false;
                    g8.f6359b.f(width, height);
                    g8.e(imageView, this.c);
                }
            }
        }
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnPreDrawListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getViewTreeObserver().removeOnPreDrawListener(this);
    }
}
