package G;

import D.C0190x;
import Z.k;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.tiZVw8.numX49;
import kotlin.jvm.internal.j;
import q0.InterfaceC2159b;
import s0.C2224a;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends RecyclerView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2159b f1686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f1687b;
    public final c c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f1688d;
    public k e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        j.g(fragmentActivity, numX49.tnTj78("PhP"));
        this.f1686a = a.f1683a[q0.c.c.ordinal()] == 1 ? new s0.c() : new C2224a();
        this.f1687b = new Rect();
        this.c = new c(this);
        this.f1688d = new b(this);
        a();
    }

    public final void a() {
        Context context = getContext();
        String strTnTj78 = numX49.tnTj78("Phb");
        j.f(context, strTnTj78);
        C0190x c0190x = new C0190x(0, this, d.class, numX49.tnTj78("Ph2"), numX49.tnTj78("PhL"), 0, 15);
        C0190x c0190x2 = new C0190x(0, this, d.class, numX49.tnTj78("Phr"), numX49.tnTj78("PhZ"), 0, 16);
        InterfaceC2159b interfaceC2159b = this.f1686a;
        interfaceC2159b.d(context, c0190x, c0190x2);
        Context context2 = getContext();
        j.f(context2, strTnTj78);
        interfaceC2159b.c(context2, new C0190x(0, this, d.class, numX49.tnTj78("Phk"), numX49.tnTj78("PhB"), 0, 17));
        c cVar = this.c;
        removeOnScrollListener(cVar);
        b bVar = this.f1688d;
        removeOnChildAttachStateChangeListener(bVar);
        addOnScrollListener(cVar);
        addOnChildAttachStateChangeListener(bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instruction units count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: G.d.b():void");
    }

    public final void c() {
        this.f1686a.pause();
        final k kVar = this.e;
        if (kVar != null) {
            FrameLayout frameLayout = kVar.h;
            if (frameLayout != null) {
                final int i = 0;
                frameLayout.post(new Runnable() { // from class: Z.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i) {
                            case 0:
                                kVar.h.setVisibility(8);
                                break;
                            default:
                                kVar.f6835l.setVisibility(8);
                                break;
                        }
                    }
                });
            }
            ImageView imageView = kVar.f6835l;
            if (imageView != null) {
                final int i4 = 1;
                imageView.post(new Runnable() { // from class: Z.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i4) {
                            case 0:
                                kVar.h.setVisibility(8);
                                break;
                            default:
                                kVar.f6835l.setVisibility(8);
                                break;
                        }
                    }
                });
            }
            FrameLayout frameLayout2 = kVar.f6832d;
            if (frameLayout2 != null) {
                frameLayout2.removeAllViews();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onInterceptTouchEvent(motionEvent);
    }
}
