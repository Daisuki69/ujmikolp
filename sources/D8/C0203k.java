package D8;

import K8.InterfaceC0282g;
import cj.C1110A;
import com.paymaya.domain.model.KycCmsAddressZipCode;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycCompletePersonalInformationFragment;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: D8.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0203k implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0212u f1052b;

    public /* synthetic */ C0203k(C0212u c0212u, int i) {
        this.f1051a = i;
        this.f1052b = c0212u;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f1051a) {
            case 0:
                C0212u c0212u = this.f1052b;
                List zipCodeList = c0212u.f1074D;
                kotlin.jvm.internal.j.g(zipCodeList, "zipCodeList");
                try {
                    String code = ((KycCmsAddressZipCode) C1110A.A(zipCodeList)).getCode();
                    if (code == null) {
                        code = "";
                    }
                    ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u.c.get())).n3(code);
                    break;
                } catch (Exception unused) {
                }
                break;
            case 1:
                C0212u c0212u2 = this.f1052b;
                List zipCodeList2 = c0212u2.f1077G;
                kotlin.jvm.internal.j.g(zipCodeList2, "zipCodeList");
                try {
                    String code2 = ((KycCmsAddressZipCode) C1110A.A(zipCodeList2)).getCode();
                    if (code2 == null) {
                        code2 = "";
                    }
                    ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u2.c.get())).t3(code2);
                    break;
                } catch (Exception unused2) {
                }
                break;
            case 2:
                C0212u c0212u3 = this.f1052b;
                if (kotlin.jvm.internal.j.b(c0212u3.f1102x, Boolean.TRUE) && !c0212u3.f1085P) {
                    c0212u3.d0(((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u3.c.get())).T2());
                }
                break;
            case 3:
                C0212u c0212u4 = this.f1052b;
                if (c0212u4.f1103y) {
                    c0212u4.U(((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u4.c.get())).R1());
                }
                break;
            case 4:
                C0212u c0212u5 = this.f1052b;
                if (kotlin.jvm.internal.j.b(c0212u5.f1101w, Boolean.TRUE)) {
                    c0212u5.Y(((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u5.c.get())).X1());
                }
                break;
            case 5:
                C0212u c0212u6 = this.f1052b;
                if (c0212u6.f1103y) {
                    c0212u6.T(((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u6.c.get())).P1());
                }
                break;
            case 6:
                C0212u c0212u7 = this.f1052b;
                if (kotlin.jvm.internal.j.b(c0212u7.f1101w, Boolean.TRUE)) {
                    c0212u7.W(((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u7.c.get())).U1());
                }
                break;
            case 7:
                C0212u c0212u8 = this.f1052b;
                if (kotlin.jvm.internal.j.b(c0212u8.f1101w, Boolean.TRUE)) {
                    c0212u8.V(((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u8.c.get())).W1());
                }
                break;
            case 8:
                C0212u c0212u9 = this.f1052b;
                if (kotlin.jvm.internal.j.b(c0212u9.f1102x, Boolean.TRUE)) {
                    c0212u9.b0(((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u9.c.get())).Q2());
                }
                break;
            default:
                C0212u c0212u10 = this.f1052b;
                if (kotlin.jvm.internal.j.b(c0212u10.f1102x, Boolean.TRUE)) {
                    c0212u10.a0(((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u10.c.get())).S2());
                }
                break;
        }
        return Unit.f18162a;
    }
}
