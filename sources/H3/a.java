package H3;

import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import n4.C1920d;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2086b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(Object obj, boolean z4, int i) {
        this.f2085a = i;
        this.c = obj;
        this.f2086b = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.c;
        switch (this.f2085a) {
            case 0:
                ((b) obj).f2087a.e(this.f2086b);
                break;
            case 1:
                boolean z4 = this.f2086b;
                g gVar = (g) ((E5.b) obj).f1262b;
                gVar.f = z4;
                if (gVar.c) {
                    gVar.f2094d.removeCallbacksAndMessages(null);
                    if (gVar.f) {
                        gVar.f2094d.postDelayed(gVar.e, 300000L);
                    }
                }
                break;
            case 2:
                ((C1920d) obj).c.e(this.f2086b);
                break;
            default:
                this.f2086b = false;
                int i = AspectRatioFrameLayout.f9688d;
                ((AspectRatioFrameLayout) obj).getClass();
                break;
        }
    }

    public a(AspectRatioFrameLayout aspectRatioFrameLayout) {
        this.f2085a = 3;
        this.c = aspectRatioFrameLayout;
    }
}
