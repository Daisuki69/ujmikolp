package eb;

import Kh.B;
import N5.E;
import android.widget.TextView;
import cj.L;
import cj.M;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.domain.model.DataPrivacyProvision;
import com.paymaya.domain.model.OngoingRegistration;
import com.paymaya.mayaui.regv2.view.activity.impl.MayaRegistrationV2Activity;
import com.paymaya.mayaui.regv2.view.fragment.impl.MayaAccountProvisionFragment;
import dOYHB6.tiZVw8.numX49;
import db.InterfaceC1349b;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o1.AbstractC1955a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaAccountProvisionFragment f16635b;

    public /* synthetic */ i(MayaAccountProvisionFragment mayaAccountProvisionFragment, int i) {
        this.f16634a = i;
        this.f16635b = mayaAccountProvisionFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object next;
        String strTnTj78;
        int i = 1;
        int i4 = 7;
        int i6 = 6;
        String strTnTj782 = numX49.tnTj78("bi9bb");
        int i10 = 8;
        String strTnTj783 = numX49.tnTj78("bi9b2");
        String strTnTj784 = numX49.tnTj78("bi9bL");
        switch (this.f16634a) {
            case 0:
                MayaAccountProvisionFragment mayaAccountProvisionFragment = this.f16635b;
                l lVar = mayaAccountProvisionFragment.f13684X;
                if (lVar != null) {
                    ArrayList arrayList = mayaAccountProvisionFragment.f13685Y;
                    kotlin.jvm.internal.j.g(arrayList, numX49.tnTj78("bi9b4"));
                    OngoingRegistration ongoingRegistration = ((MayaRegistrationV2Activity) lVar).f13667q;
                    if (ongoingRegistration != null) {
                        ongoingRegistration.setConsentsList(arrayList);
                    }
                }
                Lb.a aVarI1 = mayaAccountProvisionFragment.I1();
                if (!S5.c.b((S5.c) aVarI1.h, A5.b.f55C1)) {
                    MayaAccountProvisionFragment mayaAccountProvisionFragment2 = (MayaAccountProvisionFragment) ((InterfaceC1349b) aVarI1.c.get());
                    Iterator it = mayaAccountProvisionFragment2.J1().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            if (((DataPrivacyProvision) next).isSavings()) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    DataPrivacyProvision dataPrivacyProvision = (DataPrivacyProvision) next;
                    if (dataPrivacyProvision == null || (strTnTj78 = dataPrivacyProvision.getName()) == null) {
                        strTnTj78 = numX49.tnTj78("bi9bo");
                    }
                    mayaAccountProvisionFragment2.K1(strTnTj78, M.h(new Pair(EnumC1212a.TICK_COUNT, String.valueOf(mayaAccountProvisionFragment2.f13687a0)), new Pair(EnumC1212a.UNTICK_COUNT, String.valueOf(mayaAccountProvisionFragment2.f13688b0))), mayaAccountProvisionFragment2.f13686Z);
                }
                MayaAccountProvisionFragment mayaAccountProvisionFragment3 = (MayaAccountProvisionFragment) ((InterfaceC1349b) aVarI1.c.get());
                if (AbstractC1955a.u(mayaAccountProvisionFragment3.requireContext(), numX49.tnTj78("bi9bK")) || AbstractC1955a.u(mayaAccountProvisionFragment3.requireContext(), numX49.tnTj78("bi9bw"))) {
                    aVarI1.p();
                } else {
                    MayaAccountProvisionFragment mayaAccountProvisionFragment4 = (MayaAccountProvisionFragment) ((InterfaceC1349b) aVarI1.c.get());
                    mayaAccountProvisionFragment4.getClass();
                    String strV = AbstractC1213b.v(9);
                    kotlin.jvm.internal.j.f(strV, strTnTj783);
                    MayaAccountProvisionFragment.N1(mayaAccountProvisionFragment4, strV, mayaAccountProvisionFragment4.s(), L.c(new Pair(EnumC1212a.SCREEN_NAME, numX49.tnTj78("bi9bc"))));
                    MayaAccountProvisionFragment mayaAccountProvisionFragment5 = (MayaAccountProvisionFragment) ((InterfaceC1349b) aVarI1.c.get());
                    mayaAccountProvisionFragment5.getClass();
                    B bE = AbstractC1955a.q(mayaAccountProvisionFragment5).e(zh.b.a());
                    Gh.f fVar = new Gh.f(new Q6.n(aVarI1, i10), Eh.d.f1366d);
                    bE.g(fVar);
                    aVarI1.e(fVar);
                }
                break;
            case 1:
                String strP = AbstractC1213b.p(7);
                kotlin.jvm.internal.j.f(strP, strTnTj784);
                MayaAccountProvisionFragment mayaAccountProvisionFragment6 = this.f16635b;
                MayaAccountProvisionFragment.M1(mayaAccountProvisionFragment6, numX49.tnTj78("bi9b8"), strP, numX49.tnTj78("bi9bC"), mayaAccountProvisionFragment6.s(), null, null, 48);
                break;
            case 2:
                MayaAccountProvisionFragment mayaAccountProvisionFragment7 = this.f16635b;
                E e = mayaAccountProvisionFragment7.f13682V;
                kotlin.jvm.internal.j.d(e);
                String strB = Ke.d.b(((TextView) e.j).getText().toString());
                String strP2 = AbstractC1213b.p(3);
                kotlin.jvm.internal.j.f(strP2, strTnTj784);
                MayaAccountProvisionFragment.M1(mayaAccountProvisionFragment7, strB, strP2, mayaAccountProvisionFragment7.s(), numX49.tnTj78("bi9bt"), null, null, 48);
                String strV2 = AbstractC1213b.v(5);
                kotlin.jvm.internal.j.f(strV2, strTnTj783);
                MayaAccountProvisionFragment.N1(mayaAccountProvisionFragment7, strV2, mayaAccountProvisionFragment7.s(), L.c(new Pair(EnumC1212a.SCREEN_NAME, numX49.tnTj78("bi9bU"))));
                l lVar2 = mayaAccountProvisionFragment7.f13684X;
                if (lVar2 != null) {
                    String string = mayaAccountProvisionFragment7.getString(R.string.maya_label_data_privacy_terms_and_conditions);
                    kotlin.jvm.internal.j.f(string, strTnTj782);
                    ((MayaRegistrationV2Activity) lVar2).Z1(string, numX49.tnTj78("bi9be"), new i(mayaAccountProvisionFragment7, i6));
                }
                break;
            case 3:
                MayaAccountProvisionFragment mayaAccountProvisionFragment8 = this.f16635b;
                E e7 = mayaAccountProvisionFragment8.f13682V;
                kotlin.jvm.internal.j.d(e7);
                String strB2 = Ke.d.b(((TextView) e7.i).getText().toString());
                String strP3 = AbstractC1213b.p(3);
                kotlin.jvm.internal.j.f(strP3, strTnTj784);
                MayaAccountProvisionFragment.M1(mayaAccountProvisionFragment8, strB2, strP3, mayaAccountProvisionFragment8.s(), numX49.tnTj78("bi9bH"), null, null, 48);
                String strV3 = AbstractC1213b.v(7);
                kotlin.jvm.internal.j.f(strV3, strTnTj783);
                MayaAccountProvisionFragment.N1(mayaAccountProvisionFragment8, strV3, mayaAccountProvisionFragment8.s(), L.c(new Pair(EnumC1212a.SCREEN_NAME, numX49.tnTj78("bi9bO"))));
                l lVar3 = mayaAccountProvisionFragment8.f13684X;
                if (lVar3 != null) {
                    String string2 = mayaAccountProvisionFragment8.getString(R.string.maya_label_data_privacy_terms_and_conditions);
                    kotlin.jvm.internal.j.f(string2, strTnTj782);
                    ((MayaRegistrationV2Activity) lVar3).Z1(string2, numX49.tnTj78("bi9bQ"), new i(mayaAccountProvisionFragment8, i));
                }
                break;
            case 4:
                MayaAccountProvisionFragment mayaAccountProvisionFragment9 = this.f16635b;
                E e10 = mayaAccountProvisionFragment9.f13682V;
                kotlin.jvm.internal.j.d(e10);
                String strB3 = Ke.d.b(((TextView) e10.f3588g).getText().toString());
                String strP4 = AbstractC1213b.p(3);
                kotlin.jvm.internal.j.f(strP4, strTnTj784);
                MayaAccountProvisionFragment.M1(mayaAccountProvisionFragment9, strB3, strP4, mayaAccountProvisionFragment9.s(), numX49.tnTj78("bi9bi"), null, null, 48);
                String strV4 = AbstractC1213b.v(8);
                kotlin.jvm.internal.j.f(strV4, strTnTj783);
                MayaAccountProvisionFragment.N1(mayaAccountProvisionFragment9, strV4, mayaAccountProvisionFragment9.s(), L.c(new Pair(EnumC1212a.SCREEN_NAME, numX49.tnTj78("bi9bE"))));
                l lVar4 = mayaAccountProvisionFragment9.f13684X;
                if (lVar4 != null) {
                    String string3 = mayaAccountProvisionFragment9.getString(R.string.maya_label_data_privacy_terms_and_conditions);
                    kotlin.jvm.internal.j.f(string3, strTnTj782);
                    ((MayaRegistrationV2Activity) lVar4).Z1(string3, numX49.tnTj78("bi9bF"), new i(mayaAccountProvisionFragment9, i4));
                }
                break;
            case 5:
                MayaAccountProvisionFragment mayaAccountProvisionFragment10 = this.f16635b;
                E e11 = mayaAccountProvisionFragment10.f13682V;
                kotlin.jvm.internal.j.d(e11);
                String strB4 = Ke.d.b(((TextView) e11.h).getText().toString());
                String strP5 = AbstractC1213b.p(3);
                kotlin.jvm.internal.j.f(strP5, strTnTj784);
                MayaAccountProvisionFragment.M1(mayaAccountProvisionFragment10, strB4, strP5, mayaAccountProvisionFragment10.s(), numX49.tnTj78("bi9bS"), null, null, 48);
                String strV5 = AbstractC1213b.v(6);
                kotlin.jvm.internal.j.f(strV5, strTnTj783);
                MayaAccountProvisionFragment.N1(mayaAccountProvisionFragment10, strV5, mayaAccountProvisionFragment10.s(), L.c(new Pair(EnumC1212a.SCREEN_NAME, numX49.tnTj78("bi9bj"))));
                l lVar5 = mayaAccountProvisionFragment10.f13684X;
                if (lVar5 != null) {
                    String string4 = mayaAccountProvisionFragment10.getString(R.string.maya_label_data_privacy_privacy_policy);
                    kotlin.jvm.internal.j.f(string4, strTnTj782);
                    ((MayaRegistrationV2Activity) lVar5).Z1(string4, numX49.tnTj78("bi9bd"), new i(mayaAccountProvisionFragment10, i10));
                }
                break;
            case 6:
                String strP6 = AbstractC1213b.p(5);
                kotlin.jvm.internal.j.f(strP6, strTnTj784);
                MayaAccountProvisionFragment mayaAccountProvisionFragment11 = this.f16635b;
                MayaAccountProvisionFragment.M1(mayaAccountProvisionFragment11, numX49.tnTj78("bi9bu"), strP6, numX49.tnTj78("bi9bV"), mayaAccountProvisionFragment11.s(), null, null, 48);
                break;
            case 7:
                String strP7 = AbstractC1213b.p(8);
                kotlin.jvm.internal.j.f(strP7, strTnTj784);
                MayaAccountProvisionFragment mayaAccountProvisionFragment12 = this.f16635b;
                MayaAccountProvisionFragment.M1(mayaAccountProvisionFragment12, numX49.tnTj78("bi9bk"), strP7, numX49.tnTj78("bi9bB"), mayaAccountProvisionFragment12.s(), null, null, 48);
                break;
            default:
                String strP8 = AbstractC1213b.p(6);
                kotlin.jvm.internal.j.f(strP8, strTnTj784);
                MayaAccountProvisionFragment mayaAccountProvisionFragment13 = this.f16635b;
                MayaAccountProvisionFragment.M1(mayaAccountProvisionFragment13, numX49.tnTj78("bi9br"), strP8, numX49.tnTj78("bi9bZ"), mayaAccountProvisionFragment13.s(), null, null, 48);
                break;
        }
        return Unit.f18162a;
    }
}
