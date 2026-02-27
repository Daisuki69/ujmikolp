package D8;

import K8.InterfaceC0282g;
import cj.C1112C;
import com.paymaya.domain.model.KycCmsAddressCity;
import com.paymaya.domain.model.KycCmsAddressContentData;
import com.paymaya.domain.model.KycCmsAddressLocality;
import com.paymaya.domain.model.KycCmsAddressProvince;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycCompletePersonalInformationFragment;
import java.util.List;

/* JADX INFO: renamed from: D8.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0211t implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0212u f1069b;
    public final /* synthetic */ String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f1070d;

    public /* synthetic */ C0211t(C0212u c0212u, String str, String str2, int i) {
        this.f1068a = i;
        this.f1069b = c0212u;
        this.c = str;
        this.f1070d = str2;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        List<KycCmsAddressLocality> localities;
        List<KycCmsAddressLocality> localities2;
        switch (this.f1068a) {
            case 0:
                KycCmsAddressContentData it = (KycCmsAddressContentData) obj;
                kotlin.jvm.internal.j.g(it, "it");
                List<KycCmsAddressProvince> data = it.getData();
                if (data == null) {
                    data = C1112C.f9377a;
                }
                KycCmsAddressProvince kycCmsAddressProvinceK = C0212u.K(this.c, data);
                C0212u c0212u = this.f1069b;
                KycCmsAddressCity kycCmsAddressCityD = C0212u.D(kycCmsAddressProvinceK, this.f1070d);
                if (kycCmsAddressCityD == null || (localities = kycCmsAddressCityD.getLocalities()) == null) {
                    localities = C1112C.f9377a;
                }
                c0212u.f1073C = localities;
                MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.f1069b.c.get());
                mayaKycCompletePersonalInformationFragment.y3(((N5.W) mayaKycCompletePersonalInformationFragment.G1()).f3971b.i, false);
                MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment2 = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.f1069b.c.get());
                mayaKycCompletePersonalInformationFragment2.y3(((N5.W) mayaKycCompletePersonalInformationFragment2.G1()).f3971b.f4014k, false);
                if (this.f1069b.S()) {
                    C0212u c0212u2 = this.f1069b;
                    if (c0212u2.f1081L && kotlin.jvm.internal.j.b(c0212u2.f1101w, Boolean.TRUE)) {
                        C0212u c0212u3 = this.f1069b;
                        c0212u3.f1081L = false;
                        X5.f.u((InterfaceC0282g) c0212u3.c.get(), new C0203k(this.f1069b, 7));
                        break;
                    }
                }
                break;
            default:
                KycCmsAddressContentData it2 = (KycCmsAddressContentData) obj;
                kotlin.jvm.internal.j.g(it2, "it");
                List<KycCmsAddressProvince> data2 = it2.getData();
                if (data2 == null) {
                    data2 = C1112C.f9377a;
                }
                KycCmsAddressProvince kycCmsAddressProvinceK2 = C0212u.K(this.c, data2);
                C0212u c0212u4 = this.f1069b;
                KycCmsAddressCity kycCmsAddressCityD2 = C0212u.D(kycCmsAddressProvinceK2, this.f1070d);
                if (kycCmsAddressCityD2 == null || (localities2 = kycCmsAddressCityD2.getLocalities()) == null) {
                    localities2 = C1112C.f9377a;
                }
                c0212u4.f1076F = localities2;
                MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment3 = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.f1069b.c.get());
                mayaKycCompletePersonalInformationFragment3.y3(((N5.W) mayaKycCompletePersonalInformationFragment3.G1()).f3971b.m, false);
                MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment4 = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.f1069b.c.get());
                mayaKycCompletePersonalInformationFragment4.y3(((N5.W) mayaKycCompletePersonalInformationFragment4.G1()).f3971b.f4017o, false);
                if (this.f1069b.S()) {
                    C0212u c0212u5 = this.f1069b;
                    if (c0212u5.f1082M && kotlin.jvm.internal.j.b(c0212u5.f1102x, Boolean.TRUE)) {
                        C0212u c0212u6 = this.f1069b;
                        c0212u6.f1082M = false;
                        X5.f.u((InterfaceC0282g) c0212u6.c.get(), new C0203k(this.f1069b, 9));
                        break;
                    }
                }
                break;
        }
    }
}
