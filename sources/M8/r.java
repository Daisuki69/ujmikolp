package M8;

import D8.C0200h;
import K8.InterfaceC0279d;
import android.content.Context;
import android.net.Uri;
import androidx.core.view.KeyEventDispatcher;
import com.paymaya.R;
import com.paymaya.domain.model.MayaEKYCSelectedDocument;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycAmlcCertificateFragment;
import com.tencent.youtu.sdkkitframework.common.ErrorCode;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaKycAmlcCertificateFragment f3359b;

    public /* synthetic */ r(MayaKycAmlcCertificateFragment mayaKycAmlcCertificateFragment, int i) {
        this.f3358a = i;
        this.f3359b = mayaKycAmlcCertificateFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f3358a) {
            case 0:
                MayaKycAmlcCertificateFragment mayaKycAmlcCertificateFragment = this.f3359b;
                mayaKycAmlcCertificateFragment.K1();
                String labelText = ((N5.U) mayaKycAmlcCertificateFragment.G1()).f3941g.getLabelText();
                S1.s.m(mayaKycAmlcCertificateFragment, "", null, null, labelText == null ? "" : labelText, null, 22);
                return Unit.f18162a;
            case 1:
                MayaKycAmlcCertificateFragment mayaKycAmlcCertificateFragment2 = this.f3359b;
                Uri uri = (Uri) obj;
                kotlin.jvm.internal.j.g(uri, "uri");
                Set set = E8.j.f1284a;
                Context contextRequireContext = mayaKycAmlcCertificateFragment2.requireContext();
                kotlin.jvm.internal.j.f(contextRequireContext, "requireContext(...)");
                A0 a0A = E8.j.a(contextRequireContext, uri, 3145728L, E8.j.f1284a);
                if (a0A instanceof E8.i) {
                    B8.b bVarK1 = mayaKycAmlcCertificateFragment2.K1();
                    MayaEKYCSelectedDocument mayaEKYCSelectedDocument = mayaKycAmlcCertificateFragment2.f12474Z;
                    C0200h c0200h = (C0200h) bVarK1;
                    MayaKycAmlcCertificateFragment mayaKycAmlcCertificateFragment3 = (MayaKycAmlcCertificateFragment) ((InterfaceC0279d) c0200h.c.get());
                    mayaKycAmlcCertificateFragment3.getClass();
                    Context contextRequireContext2 = mayaKycAmlcCertificateFragment3.requireContext();
                    kotlin.jvm.internal.j.f(contextRequireContext2, "requireContext(...)");
                    if (E8.k.h(contextRequireContext2, uri, mayaEKYCSelectedDocument, ErrorCode.YT_SDK_PARAM_ERROR) == null) {
                        ((MayaKycAmlcCertificateFragment) ((InterfaceC0279d) c0200h.c.get())).Q1();
                    } else {
                        ((MayaKycAmlcCertificateFragment) ((InterfaceC0279d) c0200h.c.get())).L1(true);
                        MayaKycAmlcCertificateFragment mayaKycAmlcCertificateFragment4 = (MayaKycAmlcCertificateFragment) ((InterfaceC0279d) c0200h.c.get());
                        mayaKycAmlcCertificateFragment4.getClass();
                        mayaKycAmlcCertificateFragment4.f12476b0 = uri;
                        c0200h.o();
                        String lastPathSegment = uri.getLastPathSegment();
                        String str = lastPathSegment != null ? lastPathSegment : "";
                        String strW = C2576A.W('/', str, (2 & 2) != 0 ? str : null);
                        MayaKycAmlcCertificateFragment mayaKycAmlcCertificateFragment5 = (MayaKycAmlcCertificateFragment) ((InterfaceC0279d) c0200h.c.get());
                        mayaKycAmlcCertificateFragment5.getClass();
                        ((N5.U) mayaKycAmlcCertificateFragment5.G1()).i.setText(strW);
                    }
                } else if (a0A instanceof E8.g) {
                    mayaKycAmlcCertificateFragment2.Q1();
                } else {
                    if (!(a0A instanceof E8.h)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    KeyEventDispatcher.Component componentRequireActivity = mayaKycAmlcCertificateFragment2.requireActivity();
                    kotlin.jvm.internal.j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                    String string = mayaKycAmlcCertificateFragment2.getString(R.string.maya_kyc_amlc_checkpoint_certificate_error_file_type_invalid);
                    kotlin.jvm.internal.j.f(string, "getString(...)");
                    ((MayaKycActivity) ((H8.b) componentRequireActivity)).u2(string);
                    mayaKycAmlcCertificateFragment2.M1(((N5.U) mayaKycAmlcCertificateFragment2.G1()).f3939b.getText().toString(), string, "AMLC Certificate Upload Error");
                }
                return Unit.f18162a;
            case 2:
                ((C0200h) this.f3359b.K1()).p();
                return Unit.f18162a;
            default:
                String it = (String) obj;
                kotlin.jvm.internal.j.g(it, "it");
                ((C0200h) this.f3359b.K1()).o();
                return Unit.f18162a;
        }
    }
}
