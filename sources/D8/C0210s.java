package D8;

import K8.InterfaceC0282g;
import cj.C1112C;
import com.paymaya.domain.model.KycCmsAddressCity;
import com.paymaya.domain.model.KycCmsAddressContentData;
import com.paymaya.domain.model.KycCmsAddressProvince;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycCompletePersonalInformationFragment;
import java.util.List;

/* JADX INFO: renamed from: D8.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0210s implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0212u f1067b;
    public final /* synthetic */ String c;

    public /* synthetic */ C0210s(C0212u c0212u, String str, int i) {
        this.f1066a = i;
        this.f1067b = c0212u;
        this.c = str;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        List<KycCmsAddressCity> cities;
        List<KycCmsAddressCity> cities2;
        List<KycCmsAddressCity> cities3;
        switch (this.f1066a) {
            case 0:
                KycCmsAddressContentData it = (KycCmsAddressContentData) obj;
                kotlin.jvm.internal.j.g(it, "it");
                MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.f1067b.c.get());
                mayaKycCompletePersonalInformationFragment.y3(((N5.W) mayaKycCompletePersonalInformationFragment.G1()).f3971b.f, false);
                C0212u c0212u = this.f1067b;
                List<KycCmsAddressProvince> data = it.getData();
                if (data == null) {
                    data = C1112C.f9377a;
                }
                KycCmsAddressProvince kycCmsAddressProvinceK = C0212u.K(this.c, data);
                if (kycCmsAddressProvinceK == null || (cities = kycCmsAddressProvinceK.getCities()) == null) {
                    cities = C1112C.f9377a;
                }
                c0212u.f1071A = cities;
                if (this.f1067b.S()) {
                    C0212u c0212u2 = this.f1067b;
                    if (c0212u2.f1083N && c0212u2.f1103y) {
                        c0212u2.f1083N = false;
                        X5.f.u((InterfaceC0282g) c0212u2.c.get(), new C0203k(this.f1067b, 5));
                        break;
                    }
                }
                break;
            case 1:
                KycCmsAddressContentData it2 = (KycCmsAddressContentData) obj;
                kotlin.jvm.internal.j.g(it2, "it");
                MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment2 = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.f1067b.c.get());
                mayaKycCompletePersonalInformationFragment2.y3(((N5.W) mayaKycCompletePersonalInformationFragment2.G1()).f3971b.h, false);
                C0212u c0212u3 = this.f1067b;
                List<KycCmsAddressProvince> data2 = it2.getData();
                if (data2 == null) {
                    data2 = C1112C.f9377a;
                }
                KycCmsAddressProvince kycCmsAddressProvinceK2 = C0212u.K(this.c, data2);
                if (kycCmsAddressProvinceK2 == null || (cities2 = kycCmsAddressProvinceK2.getCities()) == null) {
                    cities2 = C1112C.f9377a;
                }
                c0212u3.f1072B = cities2;
                if (this.f1067b.S()) {
                    C0212u c0212u4 = this.f1067b;
                    if (c0212u4.f1081L && kotlin.jvm.internal.j.b(c0212u4.f1101w, Boolean.TRUE)) {
                        C0212u c0212u5 = this.f1067b;
                        c0212u5.f1081L = false;
                        X5.f.u((InterfaceC0282g) c0212u5.c.get(), new C0203k(this.f1067b, 6));
                        break;
                    }
                }
                break;
            default:
                KycCmsAddressContentData it3 = (KycCmsAddressContentData) obj;
                kotlin.jvm.internal.j.g(it3, "it");
                MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment3 = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.f1067b.c.get());
                mayaKycCompletePersonalInformationFragment3.y3(((N5.W) mayaKycCompletePersonalInformationFragment3.G1()).f3971b.f4015l, false);
                C0212u c0212u6 = this.f1067b;
                List<KycCmsAddressProvince> data3 = it3.getData();
                if (data3 == null) {
                    data3 = C1112C.f9377a;
                }
                KycCmsAddressProvince kycCmsAddressProvinceK3 = C0212u.K(this.c, data3);
                if (kycCmsAddressProvinceK3 == null || (cities3 = kycCmsAddressProvinceK3.getCities()) == null) {
                    cities3 = C1112C.f9377a;
                }
                c0212u6.f1075E = cities3;
                if (this.f1067b.S()) {
                    C0212u c0212u7 = this.f1067b;
                    if (c0212u7.f1082M && kotlin.jvm.internal.j.b(c0212u7.f1102x, Boolean.TRUE)) {
                        C0212u c0212u8 = this.f1067b;
                        c0212u8.f1082M = false;
                        X5.f.u((InterfaceC0282g) c0212u8.c.get(), new C0203k(this.f1067b, 8));
                        break;
                    }
                }
                break;
        }
    }
}
