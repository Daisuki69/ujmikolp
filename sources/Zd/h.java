package Zd;

import androidx.camera.video.AudioStats;
import com.dynatrace.android.agent.Global;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.Z;
import com.paymaya.domain.model.Address;
import com.paymaya.domain.model.ProfileBadgesConfig;
import com.paymaya.domain.model.TransferAppLink;
import com.paymaya.domain.model.User;
import com.paymaya.domain.store.C1257f;
import com.paymaya.domain.store.Y;
import com.paymaya.domain.store.Z0;
import dOYHB6.yFtIp6.svM7M6;
import java.util.List;
import kotlin.jvm.internal.j;
import y5.AbstractC2509a;
import zj.C2576A;
import zj.o;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends AbstractC2509a implements Yd.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.paymaya.data.preference.a f6931d;
    public final Z0 e;
    public final Y f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1257f f6932g;
    public TransferAppLink h;

    public h(com.paymaya.data.preference.a mPreference, Z0 z02, Y y7, C1257f c1257f) {
        j.g(mPreference, "mPreference");
        this.f6931d = mPreference;
        this.e = z02;
        this.f = y7;
        this.f6932g = c1257f;
    }

    public final TransferAppLink k() {
        TransferAppLink transferAppLinkBuild = TransferAppLink.sBuilder().mAmount("0.00").mCurrency("PHP").mAccountType("PAYMAYA").mRecipient(this.f6931d.r()).build();
        j.f(transferAppLinkBuild, "build(...)");
        return transferAppLinkBuild;
    }

    public final void l() {
        User userA = this.e.a();
        TransferAppLink transferAppLink = this.h;
        if (transferAppLink == null) {
            j.n("mTransferAppLink");
            throw null;
        }
        ((ce.h) this.c.get()).K0(userA.getFullName(), C.m(transferAppLink));
    }

    public final void m(TransferAppLink transferAppLink) {
        ProfileBadgesConfig profileBadgesConfigMProfileBadgesConfig;
        List<String> listVerifiedSellerLevelList;
        String strMCity;
        j();
        this.h = transferAppLink;
        Double dF = C.F(transferAppLink.mAmount());
        String strMMessage = transferAppLink.mMessage();
        ((ce.h) this.c.get()).N(this.e.a().getFullName());
        double dDoubleValue = dF.doubleValue();
        if (dDoubleValue != AudioStats.AUDIO_AMPLITUDE_NONE) {
            ((ce.h) this.c.get()).W(dDoubleValue);
        }
        if (strMMessage != null && !C2576A.H(strMMessage)) {
            ((ce.h) this.c.get()).D0(strMMessage);
        }
        double dDoubleValue2 = dF.doubleValue();
        String strA = this.f.a();
        User userA = this.e.a();
        String fullName = userA.getFullName();
        String strMLastName = userA.mLastName();
        String strMFirstName = userA.mFirstName();
        j.f(strMFirstName, "mFirstName(...)");
        String[] strArr = (String[]) new o("\\s+").i(0, strMFirstName).toArray(new String[0]);
        StringBuilder sb2 = new StringBuilder();
        for (String str : strArr) {
            sb2.append(str.charAt(0) + Global.BLANK);
        }
        String string = sb2.toString();
        j.f(string, "toString(...)");
        String firstNameInitialsAndLastName = string + strMLastName;
        if (fullName.length() > 24) {
            j.d(strMLastName);
            j.g(firstNameInitialsAndLastName, "firstNameInitialsAndLastName");
            if (firstNameInitialsAndLastName.length() <= 24) {
                strMLastName = firstNameInitialsAndLastName;
            } else if (strMLastName.length() > 24) {
                fullName = strMLastName.substring(0, 24);
                j.f(fullName, "substring(...)");
                strMLastName = fullName;
            }
        } else {
            strMLastName = fullName;
        }
        Address addressA = this.f6932g.a();
        String strMCity2 = (addressA == null || (strMCity = addressA.mCity()) == null || C2576A.H(strMCity)) ? "Mandaluyong" : addressA.mCity();
        j.d(strMCity2);
        if (strMCity2.length() > 15) {
            strMCity2 = strMCity2.substring(0, 15);
            j.f(strMCity2, "substring(...)");
        }
        ((ce.h) this.c.get()).getClass();
        ((ce.h) this.c.get()).getClass();
        ((ce.h) this.c.get()).getClass();
        ((ce.h) this.c.get()).getClass();
        ((ce.h) this.c.get()).getClass();
        ((ce.h) this.c.get()).getClass();
        ((ce.h) this.c.get()).getClass();
        String strF = Z.f(strA, strMLastName, strMCity2, "01", "608", "6016", "27", "com.p2pqrpay", "PAPHPHM1XXX", "99964403", dDoubleValue2, strMMessage);
        ce.h hVar = (ce.h) this.c.get();
        j.d(strA);
        String strS = C.s(strA);
        j.d(strS);
        String[] strArr2 = (String[]) C2576A.T(strS, new String[]{Global.BLANK}, 6).toArray(new String[0]);
        hVar.S0(strArr2[0] + " *** *** " + strArr2[3], strF);
        if ("kyc1".equalsIgnoreCase(this.f6931d.l())) {
            ((ce.h) this.c.get()).y();
        } else {
            ((ce.h) this.c.get()).g1();
        }
        if (!"kyc1".equals(this.f6931d.l()) || (profileBadgesConfigMProfileBadgesConfig = this.f6931d.e().mProfileBadgesConfig()) == null || (listVerifiedSellerLevelList = profileBadgesConfigMProfileBadgesConfig.verifiedSellerLevelList()) == null || !listVerifiedSellerLevelList.contains(svM7M6.getString(this.f6931d.f11330b, "key_customer_account_product_offering_level", ""))) {
            ((ce.h) this.c.get()).d0();
            ((ce.h) this.c.get()).e1();
        } else {
            ((ce.h) this.c.get()).n0();
            ((ce.h) this.c.get()).l0();
        }
    }
}
