package a7;

import android.view.View;
import com.paymaya.mayaui.common.view.widget.MayaStaticToolTipView;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: a7.D, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnAttachStateChangeListenerC0636D implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f7006b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ViewOnAttachStateChangeListenerC0636D(View view, Object obj, int i) {
        this.f7005a = i;
        this.f7006b = view;
        this.c = obj;
    }

    private final void a(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v7) {
        switch (this.f7005a) {
            case 0:
                kotlin.jvm.internal.j.g(v7, "v");
                break;
            default:
                C.h hVar = new C.h(this, 20);
                View view = this.f7006b;
                view.getViewTreeObserver().addOnDrawListener(new io.flutter.plugin.platform.D(view, hVar));
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v7) {
        switch (this.f7005a) {
            case 0:
                kotlin.jvm.internal.j.g(v7, "v");
                LinkedHashMap linkedHashMap = AbstractC0639G.f7012a;
                AbstractC0639G.a(this.f7006b, (MayaStaticToolTipView) this.c);
                break;
        }
    }
}
