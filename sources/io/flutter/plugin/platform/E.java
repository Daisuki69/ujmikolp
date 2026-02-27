package io.flutter.plugin.platform;

import android.app.Activity;
import android.hardware.display.VirtualDisplay;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class E {
    public static final C i = new C();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SingleViewPresentation f17212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Activity f17213b;
    public final C1617a c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17214d;
    public final int e;
    public final n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r f17215g;
    public VirtualDisplay h;

    public E(Activity activity, C1617a c1617a, VirtualDisplay virtualDisplay, k kVar, n nVar, r rVar, int i4) {
        this.f17213b = activity;
        this.c = c1617a;
        this.f = nVar;
        this.f17215g = rVar;
        this.e = i4;
        this.h = virtualDisplay;
        this.f17214d = activity.getResources().getDisplayMetrics().densityDpi;
        SingleViewPresentation singleViewPresentation = new SingleViewPresentation(activity, this.h.getDisplay(), kVar, c1617a, i4, rVar);
        this.f17212a = singleViewPresentation;
        singleViewPresentation.show();
    }

    public final View a() {
        SingleViewPresentation singleViewPresentation = this.f17212a;
        if (singleViewPresentation == null) {
            return null;
        }
        return singleViewPresentation.getView().getView();
    }
}
