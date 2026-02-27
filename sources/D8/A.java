package D8;

import K8.InterfaceC0293s;
import N5.C0451f0;
import android.widget.ImageView;
import android.widget.TextView;
import com.paymaya.R;
import com.paymaya.common.utility.e0;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycFaceAuthenticationTipsFragment;
import o1.AbstractC1955a;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public final class A extends AbstractC2509a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e0 f1004d;

    public A(e0 e0Var) {
        this.f1004d = e0Var;
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        super.j();
        MayaKycFaceAuthenticationTipsFragment mayaKycFaceAuthenticationTipsFragment = (MayaKycFaceAuthenticationTipsFragment) ((InterfaceC0293s) this.c.get());
        mayaKycFaceAuthenticationTipsFragment.getClass();
        ImageView imageViewSelfie = ((C0451f0) mayaKycFaceAuthenticationTipsFragment.G1()).f4090b;
        kotlin.jvm.internal.j.f(imageViewSelfie, "imageViewSelfie");
        AbstractC1955a.w(imageViewSelfie, "https://kyc-cms-bucket-test.s3.ap-southeast-1.amazonaws.com/Selfie_Icon.png", true);
        InterfaceC0293s interfaceC0293s = (InterfaceC0293s) this.c.get();
        String strA = this.f1004d.a(R.string.maya_kyc_take_a_selfie_secondary_button);
        MayaKycFaceAuthenticationTipsFragment mayaKycFaceAuthenticationTipsFragment2 = (MayaKycFaceAuthenticationTipsFragment) interfaceC0293s;
        mayaKycFaceAuthenticationTipsFragment2.getClass();
        ((TextView) ((C0451f0) mayaKycFaceAuthenticationTipsFragment2.G1()).c.f4088d).setText(strA);
    }
}
