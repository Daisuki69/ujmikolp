package de;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import androidx.fragment.app.FragmentActivity;
import com.paymaya.ui.qr.view.fragment.impl.BarcodeScannerFragment;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends Yj.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ BarcodeScannerFragment f16362n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(BarcodeScannerFragment barcodeScannerFragment, FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        this.f16362n = barcodeScannerFragment;
    }

    @Override // Xj.a
    public final Xj.g a(Context context) {
        ee.b bVar = new ee.b(context);
        this.f16362n.f14665U = bVar;
        return bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Yj.b, Xj.a, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onInterceptTouchEvent(motionEvent);
    }
}
