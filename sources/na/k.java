package Na;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.paymaya.R;
import com.paymaya.mayaui.qr.view.fragment.impl.MayaQRScannerFragment;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.tiZVw8.numX49;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends Yj.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ MayaQRScannerFragment f4366n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(MayaQRScannerFragment mayaQRScannerFragment, FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        this.f4366n = mayaQRScannerFragment;
    }

    @Override // Xj.a
    public final Xj.g a(Context context) {
        kotlin.jvm.internal.j.g(context, numX49.tnTj78("bdV2"));
        Oa.g gVar = new Oa.g(context);
        MayaQRScannerFragment mayaQRScannerFragment = this.f4366n;
        gVar.setMaskColor(ContextCompat.getColor(mayaQRScannerFragment.requireContext(), R.color.black_70_alpha));
        mayaQRScannerFragment.f13609j0 = gVar;
        return gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Yj.b, Xj.a, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onInterceptTouchEvent(motionEvent);
    }
}
