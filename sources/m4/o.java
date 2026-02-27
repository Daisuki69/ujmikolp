package m4;

import Ej.Z;
import android.content.Context;
import android.view.OrientationEventListener;
import android.view.WindowManager;
import com.journeyapps.barcodescanner.BarcodeView;
import com.paymaya.domain.store.C1258f0;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends OrientationEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Z f18367a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Z z4, Context context) {
        super(context, 3);
        this.f18367a = z4;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        int rotation;
        Z z4 = this.f18367a;
        WindowManager windowManager = (WindowManager) z4.c;
        C1258f0 c1258f0 = (C1258f0) z4.e;
        if (windowManager == null || c1258f0 == null || (rotation = windowManager.getDefaultDisplay().getRotation()) == z4.f1430b) {
            return;
        }
        z4.f1430b = rotation;
        ((BarcodeView) c1258f0.f11441b).c.postDelayed(new C.h(c1258f0, 25), 250L);
    }
}
