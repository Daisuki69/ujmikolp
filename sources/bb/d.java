package Bb;

import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.domain.model.MFAChallengeInformation;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.Transfer;
import com.paymaya.mayaui.sendmoney.view.activity.impl.MayaSendMoneyActivity;
import com.paymaya.mayaui.sendmoney.view.fragment.impl.MayaSendMoneyConfirmationFragment;
import io.flutter.plugins.firebase.crashlytics.Constants;
import y5.s;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f396b;
    public final /* synthetic */ Transfer c;

    public /* synthetic */ d(e eVar, Transfer transfer, int i) {
        this.f395a = i;
        this.f396b = eVar;
        this.c = transfer;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f395a) {
            case 0:
                MFAChallengeInformation it = (MFAChallengeInformation) obj;
                kotlin.jvm.internal.j.g(it, "it");
                ((MayaBaseFragment) ((Fb.a) this.f396b.c.get())).w1();
                e eVar = this.f396b;
                Transfer transfer = this.c;
                Fb.a aVar = (Fb.a) eVar.c.get();
                String challengeId = it.getChallengeId();
                Gb.b bVar = ((MayaSendMoneyConfirmationFragment) aVar).f13761g0;
                if (bVar != null) {
                    ((MayaSendMoneyActivity) bVar).c2(transfer, challengeId);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mMayaSendMoneyConfirmationFragmentListener");
                    throw null;
                }
            default:
                ((MayaBaseFragment) ((Fb.a) this.f396b.c.get())).w1();
                e eVar2 = this.f396b;
                PayMayaError payMayaErrorF = eVar2.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF, "mayaErrorHandling(...)");
                Transfer transfer2 = this.c;
                ((MayaBaseFragment) ((Fb.a) eVar2.c.get())).w1();
                if (payMayaErrorF.isSessionTimeout()) {
                    return;
                }
                if (eVar2.j.e().isAppEventV2SendMoneyEnabled()) {
                    ((MayaSendMoneyConfirmationFragment) ((Fb.a) eVar2.c.get())).J1(payMayaErrorF);
                } else {
                    s sVar = (Fb.a) eVar2.c.get();
                    C1219h c1219h = new C1219h();
                    c1219h.n(12);
                    c1219h.i();
                    EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                    c1219h.j.put(Constants.REASON, payMayaErrorF.mSpiel());
                    ((MayaBaseFragment) sVar).A1(c1219h);
                }
                if (payMayaErrorF.mErrorCode() == -317) {
                    MayaSendMoneyConfirmationFragment mayaSendMoneyConfirmationFragment = (MayaSendMoneyConfirmationFragment) ((Fb.a) eVar2.c.get());
                    mayaSendMoneyConfirmationFragment.getClass();
                    Gb.b bVar2 = mayaSendMoneyConfirmationFragment.f13761g0;
                    if (bVar2 != null) {
                        ((MayaSendMoneyActivity) bVar2).c2(transfer2, null);
                        return;
                    } else {
                        kotlin.jvm.internal.j.n("mMayaSendMoneyConfirmationFragmentListener");
                        throw null;
                    }
                }
                MayaSendMoneyConfirmationFragment mayaSendMoneyConfirmationFragment2 = (MayaSendMoneyConfirmationFragment) ((Fb.a) eVar2.c.get());
                Gb.b bVar3 = mayaSendMoneyConfirmationFragment2.f13761g0;
                if (bVar3 == null) {
                    kotlin.jvm.internal.j.n("mMayaSendMoneyConfirmationFragmentListener");
                    throw null;
                }
                ((MayaSendMoneyActivity) bVar3).a(payMayaErrorF, mayaSendMoneyConfirmationFragment2.getString(R.string.maya_toast_error_title_send_money_error));
                return;
        }
    }
}
