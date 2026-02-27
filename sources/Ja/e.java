package Ja;

import A7.j;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.paymaya.common.widget.MayaButtonWithIcon;
import com.paymaya.domain.model.MerchantPaymentV2;
import com.paymaya.mayaui.qr.view.fragment.impl.MayaQRScannerFragment;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f2504b;

    public /* synthetic */ e(j jVar, int i) {
        this.f2503a = i;
        this.f2504b = jVar;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f2503a) {
            case 0:
                Ze.a permission = (Ze.a) obj;
                kotlin.jvm.internal.j.g(permission, "permission");
                j jVar = this.f2504b;
                if (!permission.f6934b) {
                    MayaQRScannerFragment mayaQRScannerFragment = (MayaQRScannerFragment) ((Ma.b) jVar.c.get());
                    Group group = mayaQRScannerFragment.f13595V;
                    if (group == null) {
                        kotlin.jvm.internal.j.n("mConstraintGroupDeniedPermission");
                        throw null;
                    }
                    group.setVisibility(0);
                    MayaButtonWithIcon mayaButtonWithIcon = mayaQRScannerFragment.f13604e0;
                    if (mayaButtonWithIcon == null) {
                        kotlin.jvm.internal.j.n("mButtonShowMyQR");
                        throw null;
                    }
                    mayaButtonWithIcon.setVisibility(8);
                    MayaButtonWithIcon mayaButtonWithIcon2 = mayaQRScannerFragment.f13603d0;
                    if (mayaButtonWithIcon2 == null) {
                        kotlin.jvm.internal.j.n("mUploadQrButton");
                        throw null;
                    }
                    mayaButtonWithIcon2.setVisibility(8);
                    TextView textView = mayaQRScannerFragment.f13598Y;
                    if (textView == null) {
                        kotlin.jvm.internal.j.n("mTextViewToolbar");
                        throw null;
                    }
                    textView.setVisibility(0);
                }
                if (((com.paymaya.data.preference.a) jVar.e).e().isQRScreensUpdateEnabled()) {
                    ((MayaQRScannerFragment) ((Ma.b) jVar.c.get())).N1();
                    return;
                } else {
                    ((MayaQRScannerFragment) ((Ma.b) jVar.c.get())).M1();
                    return;
                }
            default:
                this.f2504b.e0((MerchantPaymentV2) obj);
                return;
        }
    }
}
