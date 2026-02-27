package Ag;

import Bg.C0114k;
import Bg.C0124v;
import Bg.Q;
import Bj.B0;
import Bj.D0;
import Bj.H;
import Bj.W;
import D8.C0198f;
import D8.C0200h;
import D8.C0212u;
import D8.C0217z;
import D8.D;
import D8.E;
import D8.N;
import E8.u;
import E8.v;
import K8.G;
import K8.InterfaceC0278c;
import K8.InterfaceC0279d;
import K8.InterfaceC0282g;
import K8.InterfaceC0290o;
import K8.InterfaceC0294t;
import K8.InterfaceC0295u;
import K8.O;
import L6.B;
import M8.A0;
import M8.C0342c1;
import M8.C0368j;
import M8.C0372k;
import M8.C0374k1;
import M8.C0392p;
import M8.D1;
import M8.InterfaceC0338b1;
import M8.J0;
import M8.M2;
import M8.O2;
import M8.Y;
import N5.C0438b;
import N5.C0442c0;
import N5.C0454g0;
import N5.C0466m;
import N5.C0475q0;
import N5.C0490y0;
import N5.T;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;
import b5.C0910b;
import com.dynatrace.android.agent.Global;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.BankPullPaymentOption;
import com.paymaya.domain.model.ExecutePullFunds;
import com.paymaya.domain.model.KycFieldType;
import com.paymaya.domain.model.MayaEKYCSelectedDocument;
import com.paymaya.domain.model.Transfer;
import com.paymaya.mayaui.cashin.view.activity.impl.MayaCashInActivity;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaCashInFragment;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaCashInWebFragment;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaVaultedCardsFragment;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.base.MayaKycBaseFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycAdditionalDocumentsFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycAmlcCertificateFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycCompletePersonalInformationFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycDosriFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycFatcaFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycIdReviewFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycInitialLoadingFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycSsneSwornStatementFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycUploadPhilsysIdFragment;
import com.paymaya.mayaui.kyczoloz.view.widget.KycMayaDropDown;
import com.paymaya.mayaui.kyczoloz.view.widget.KycMayaInputLayout;
import com.paymaya.mayaui.qr.view.activity.impl.MayaQRActivity;
import com.paymaya.mayaui.qr.view.activity.impl.MayaRequestMoneyActivity;
import com.paymaya.mayaui.sendmoney.view.activity.impl.MayaSendMoneyActivity;
import com.paymaya.mayaui.sendmoney.view.fragment.impl.MayaSendMoneyConfirmationFragment;
import com.paymaya.mayaui.sendmoney.view.fragment.impl.MayaSendMoneyFragment;
import com.paymaya.mayaui.sendmoney.view.fragment.impl.MayaSendMoneyOTPFragment;
import com.tencent.youtu.sdkkitframework.common.ErrorCode;
import defpackage.AbstractC1414e;
import java.util.Locale;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okhttp3.ResponseBody;
import pg.t;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f282b;

    public /* synthetic */ d(Object obj, int i) {
        this.f281a = i;
        this.f282b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        B b8;
        String string;
        int i = 4;
        int i4 = 3;
        int i6 = 2;
        boolean zIsChecked = false;
        int i10 = 1;
        switch (this.f281a) {
            case 0:
                ResponseBody responseBody = (ResponseBody) this.f282b;
                if (responseBody != null) {
                    responseBody.close();
                }
                return Unit.f18162a;
            case 1:
                C0124v HttpResponseValidator = (C0124v) obj;
                kotlin.jvm.internal.j.g(HttpResponseValidator, "$this$HttpResponseValidator");
                HttpResponseValidator.c = ((wg.d) this.f282b).c;
                HttpResponseValidator.f560a.add(new C0114k(2, null));
                return Unit.f18162a;
            case 2:
                Throwable th2 = (Throwable) obj;
                ok.b bVar = Q.f493a;
                D0 d02 = (D0) this.f282b;
                if (th2 != null) {
                    bVar.g("Cancelling request because engine Job failed with error: " + th2);
                    H.j(d02, "Engine failed", th2);
                } else {
                    bVar.g("Cancelling request because engine Job completed");
                    d02.h0();
                }
                return Unit.f18162a;
            case 3:
                ((W) this.f282b).dispose();
                return Unit.f18162a;
            case 4:
                ((B0) this.f282b).b(null);
                return Unit.f18162a;
            case 5:
                ((t) this.f282b).success(Boolean.TRUE);
                return Unit.f18162a;
            case 6:
                C0198f c0198f = (C0198f) this.f282b;
                int iIntValue = ((Integer) obj).intValue();
                MayaKycAdditionalDocumentsFragment mayaKycAdditionalDocumentsFragment = (MayaKycAdditionalDocumentsFragment) ((InterfaceC0278c) c0198f.c.get());
                FragmentActivity fragmentActivityRequireActivity = mayaKycAdditionalDocumentsFragment.requireActivity();
                kotlin.jvm.internal.j.e(fragmentActivityRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                MayaKycActivity mayaKycActivity = (MayaKycActivity) ((H8.b) fragmentActivityRequireActivity);
                mayaKycActivity.f12446n = new C0368j(mayaKycAdditionalDocumentsFragment.L1(), null == true ? 1 : 0);
                mayaKycActivity.f12447o = new C0372k(mayaKycAdditionalDocumentsFragment.L1(), null == true ? 1 : 0);
                ConstraintLayout constraintLayout = ((T) mayaKycAdditionalDocumentsFragment.G1()).f3920a;
                kotlin.jvm.internal.j.f(constraintLayout, "getRoot(...)");
                Navigation.findNavController(constraintLayout).navigate(new C0392p(mayaKycActivity.s().toString(), iIntValue));
                return Unit.f18162a;
            case 7:
                C0200h c0200h = (C0200h) this.f282b;
                int iIntValue2 = ((Integer) obj).intValue();
                MayaKycAmlcCertificateFragment mayaKycAmlcCertificateFragment = (MayaKycAmlcCertificateFragment) ((InterfaceC0279d) c0200h.c.get());
                FragmentActivity fragmentActivityRequireActivity2 = mayaKycAmlcCertificateFragment.requireActivity();
                kotlin.jvm.internal.j.e(fragmentActivityRequireActivity2, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                H8.b bVar2 = (H8.b) fragmentActivityRequireActivity2;
                MayaKycActivity mayaKycActivity2 = (MayaKycActivity) bVar2;
                mayaKycActivity2.f12446n = new u(mayaKycAmlcCertificateFragment, i6);
                mayaKycActivity2.f12447o = new v(mayaKycAmlcCertificateFragment, i6);
                mayaKycAmlcCertificateFragment.O1(iIntValue2, bVar2);
                return Unit.f18162a;
            case 8:
                C0212u c0212u = (C0212u) this.f282b;
                int iIntValue3 = ((Integer) obj).intValue();
                c0212u.r();
                MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u.c.get());
                mayaKycCompletePersonalInformationFragment.getClass();
                ((MayaKycActivity) D1.b(mayaKycCompletePersonalInformationFragment)).f12446n = new u(mayaKycCompletePersonalInformationFragment, i4);
                ((MayaKycActivity) D1.b(mayaKycCompletePersonalInformationFragment)).f12447o = new v(mayaKycCompletePersonalInformationFragment, i4);
                FrameLayout frameLayout = ((N5.W) mayaKycCompletePersonalInformationFragment.G1()).f3970a;
                kotlin.jvm.internal.j.f(frameLayout, "getRoot(...)");
                Navigation.findNavController(frameLayout).navigate(new Y(R.string.maya_label_that_didnt_load_right, R.string.maya_label_connection_issue_split, ((MayaKycActivity) D1.b(mayaKycCompletePersonalInformationFragment)).s().toString(), iIntValue3));
                return Unit.f18162a;
            case 9:
                C0217z c0217z = (C0217z) this.f282b;
                int iIntValue4 = ((Integer) obj).intValue();
                ((MayaBaseFragment) ((InterfaceC0290o) c0217z.c.get())).w1();
                MayaKycDosriFragment mayaKycDosriFragment = (MayaKycDosriFragment) ((InterfaceC0290o) c0217z.c.get());
                J0 j02 = mayaKycDosriFragment.f12525c0;
                if (j02 != null) {
                    MayaKycActivity mayaKycActivity3 = (MayaKycActivity) j02;
                    mayaKycActivity3.f12446n = new u(mayaKycActivity3, i10);
                    mayaKycActivity3.f12447o = new v(mayaKycActivity3, i10);
                }
                FragmentActivity fragmentActivityRequireActivity3 = mayaKycDosriFragment.requireActivity();
                kotlin.jvm.internal.j.e(fragmentActivityRequireActivity3, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                FrameLayout frameLayout2 = ((C0442c0) mayaKycDosriFragment.G1()).f4067a;
                kotlin.jvm.internal.j.f(frameLayout2, "getRoot(...)");
                Navigation.findNavController(frameLayout2).navigate(new C0342c1(((MayaKycActivity) ((H8.b) fragmentActivityRequireActivity3)).s().toString(), iIntValue4));
                return Unit.f18162a;
            case 10:
                D8.B b10 = (D8.B) this.f282b;
                int iIntValue5 = ((Integer) obj).intValue();
                ((MayaBaseFragment) ((InterfaceC0294t) b10.c.get())).w1();
                MayaKycFatcaFragment mayaKycFatcaFragment = (MayaKycFatcaFragment) ((InterfaceC0294t) b10.c.get());
                InterfaceC0338b1 interfaceC0338b1 = mayaKycFatcaFragment.f12541X;
                if (interfaceC0338b1 != null) {
                    MayaKycActivity mayaKycActivity4 = (MayaKycActivity) interfaceC0338b1;
                    mayaKycActivity4.f12446n = new u(mayaKycActivity4, i10);
                    mayaKycActivity4.f12447o = new v(mayaKycActivity4, i10);
                }
                FragmentActivity fragmentActivityRequireActivity4 = mayaKycFatcaFragment.requireActivity();
                kotlin.jvm.internal.j.e(fragmentActivityRequireActivity4, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                ConstraintLayout constraintLayout2 = ((C0438b) mayaKycFatcaFragment.G1()).f4055a;
                kotlin.jvm.internal.j.f(constraintLayout2, "getRoot(...)");
                Navigation.findNavController(constraintLayout2).navigate(new C0342c1(((MayaKycActivity) ((H8.b) fragmentActivityRequireActivity4)).s().toString(), iIntValue5));
                return Unit.f18162a;
            case 11:
                D d10 = (D) this.f282b;
                int iIntValue6 = ((Integer) obj).intValue();
                MayaKycIdReviewFragment mayaKycIdReviewFragment = (MayaKycIdReviewFragment) ((InterfaceC0295u) d10.c.get());
                FragmentActivity fragmentActivityRequireActivity5 = mayaKycIdReviewFragment.requireActivity();
                kotlin.jvm.internal.j.e(fragmentActivityRequireActivity5, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                MayaKycActivity mayaKycActivity5 = (MayaKycActivity) ((H8.b) fragmentActivityRequireActivity5);
                mayaKycActivity5.f12446n = new C0368j(mayaKycIdReviewFragment.S1(), i10);
                mayaKycActivity5.f12447o = new C0372k(mayaKycIdReviewFragment.S1(), i10);
                ConstraintLayout constraintLayout3 = ((C0454g0) mayaKycIdReviewFragment.G1()).f4096a;
                kotlin.jvm.internal.j.f(constraintLayout3, "getRoot(...)");
                Navigation.findNavController(constraintLayout3).navigate(new C0374k1(2131231241, R.string.maya_label_something_went_wrong, mayaKycActivity5.s().toString(), iIntValue6));
                return Unit.f18162a;
            case 12:
                ((MayaKycInitialLoadingFragment) ((K8.v) ((E) this.f282b).c.get())).b0(((Integer) obj).intValue());
                return Unit.f18162a;
            case 13:
                N n7 = (N) this.f282b;
                int iIntValue7 = ((Integer) obj).intValue();
                MayaKycSsneSwornStatementFragment mayaKycSsneSwornStatementFragment = (MayaKycSsneSwornStatementFragment) ((G) n7.c.get());
                FragmentActivity fragmentActivityRequireActivity6 = mayaKycSsneSwornStatementFragment.requireActivity();
                kotlin.jvm.internal.j.e(fragmentActivityRequireActivity6, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                H8.b bVar3 = (H8.b) fragmentActivityRequireActivity6;
                MayaKycActivity mayaKycActivity6 = (MayaKycActivity) bVar3;
                mayaKycActivity6.f12446n = new u(mayaKycSsneSwornStatementFragment, i);
                mayaKycActivity6.f12447o = new v(mayaKycSsneSwornStatementFragment, i);
                mayaKycSsneSwornStatementFragment.O1(iIntValue7, bVar3);
                return Unit.f18162a;
            case 14:
                D8.T t5 = (D8.T) this.f282b;
                Integer num = (Integer) obj;
                num.intValue();
                MayaKycUploadPhilsysIdFragment mayaKycUploadPhilsysIdFragment = (MayaKycUploadPhilsysIdFragment) ((O) t5.c.get());
                FragmentActivity fragmentActivityRequireActivity7 = mayaKycUploadPhilsysIdFragment.requireActivity();
                kotlin.jvm.internal.j.e(fragmentActivityRequireActivity7, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                H8.b bVar4 = (H8.b) fragmentActivityRequireActivity7;
                ConstraintLayout constraintLayout4 = ((C0490y0) mayaKycUploadPhilsysIdFragment.G1()).f4297a;
                kotlin.jvm.internal.j.f(constraintLayout4, "getRoot(...)");
                O2 o22 = O2.f3205a;
                String screenName = ((MayaKycActivity) bVar4).s().toString();
                kotlin.jvm.internal.j.g(screenName, "screenName");
                M2 m2 = new M2(mayaKycUploadPhilsysIdFragment, 5);
                M2 m22 = new M2(mayaKycUploadPhilsysIdFragment, 6);
                MayaKycActivity mayaKycActivity7 = (MayaKycActivity) bVar4;
                mayaKycActivity7.f12446n = new u(m2, null == true ? 1 : 0);
                mayaKycActivity7.f12447o = new v(m22, null == true ? 1 : 0);
                Navigation.findNavController(constraintLayout4).navigate((NavDirections) o22.invoke(2131231241, Integer.valueOf(R.string.maya_label_that_didnt_load_right), Integer.valueOf(R.string.maya_label_something_went_wrong), Integer.valueOf(R.string.maya_label_got_it), screenName, num));
                return Unit.f18162a;
            case 15:
                MayaSendMoneyConfirmationFragment it = (MayaSendMoneyConfirmationFragment) obj;
                int i11 = MayaSendMoneyActivity.f13736B;
                kotlin.jvm.internal.j.g(it, "it");
                ((Bb.e) it.G1()).r((Transfer) this.f282b);
                return Unit.f18162a;
            case 16:
                String it2 = (String) obj;
                kotlin.jvm.internal.j.g(it2, "it");
                KycMayaDropDown kycMayaDropDown = (KycMayaDropDown) this.f282b;
                kycMayaDropDown.setErrorText(it2);
                kycMayaDropDown.f12679o = true;
                kycMayaDropDown.f();
                return Unit.f18162a;
            case 17:
                String it3 = (String) obj;
                kotlin.jvm.internal.j.g(it3, "it");
                KycMayaInputLayout kycMayaInputLayout = (KycMayaInputLayout) this.f282b;
                kotlin.jvm.internal.j.g(kycMayaInputLayout, "<this>");
                kycMayaInputLayout.setErrorText(it3);
                kycMayaInputLayout.f12696l = true;
                kycMayaInputLayout.d();
                return Unit.f18162a;
            case 18:
                C0910b bannerItemVariables = (C0910b) obj;
                kotlin.jvm.internal.j.g(bannerItemVariables, "bannerItemVariables");
                yk.a.a();
                ((MayaSendMoneyFragment) this.f282b).t0 = true;
                return Unit.f18162a;
            case 19:
                MayaSendMoneyOTPFragment mayaSendMoneyOTPFragment = (MayaSendMoneyOTPFragment) this.f282b;
                Gb.l lVar = mayaSendMoneyOTPFragment.f13814k0;
                if (lVar != null) {
                    ((y5.l) lVar).V1(mayaSendMoneyOTPFragment);
                }
                return Unit.f18162a;
            case 20:
                C0910b bannerItemVariables2 = (C0910b) obj;
                kotlin.jvm.internal.j.g(bannerItemVariables2, "bannerItemVariables");
                yk.a.a();
                ((MayaCashInFragment) this.f282b).f11687D0 = true;
                return Unit.f18162a;
            case 21:
                MayaCashInWebFragment mayaCashInWebFragment = (MayaCashInWebFragment) this.f282b;
                kotlin.jvm.internal.j.g((View) obj, "it");
                G6.t tVarQ1 = mayaCashInWebFragment.Q1();
                ExecutePullFunds executePullFundsP1 = ((MayaCashInWebFragment) ((K6.m) tVarQ1.c.get())).P1();
                Bundle arguments = ((MayaCashInWebFragment) ((K6.m) tVarQ1.c.get())).getArguments();
                BankPullPaymentOption bankPullPaymentOption = arguments != null ? (BankPullPaymentOption) arguments.getParcelable("paymentOption") : null;
                if (executePullFundsP1 != null && bankPullPaymentOption != null) {
                    B b11 = ((MayaCashInWebFragment) ((K6.m) tVarQ1.c.get())).t0;
                    if (b11 != null) {
                        ((MayaCashInActivity) b11).V1();
                    }
                } else if (executePullFundsP1 != null && bankPullPaymentOption == null && (b8 = ((MayaCashInWebFragment) ((K6.m) tVarQ1.c.get())).t0) != null) {
                    AbstractC1236z.e((MayaCashInActivity) b8, MayaVaultedCardsFragment.class, false);
                }
                return Unit.f18162a;
            case 22:
                C1219h event = (C1219h) obj;
                kotlin.jvm.internal.j.g(event, "event");
                MayaKycBaseFragment mayaKycBaseFragment = (MayaKycBaseFragment) this.f282b;
                mayaKycBaseFragment.o1().c((FragmentActivity) mayaKycBaseFragment.Q(), event);
                return Unit.f18162a;
            case 23:
                C1219h event2 = (C1219h) obj;
                kotlin.jvm.internal.j.g(event2, "event");
                L8.c cVar = (L8.c) this.f282b;
                cVar.J().c((FragmentActivity) cVar.Q(), event2);
                return Unit.f18162a;
            case 24:
                int i12 = MayaQRActivity.f13569r;
                kotlin.jvm.internal.j.g((View) obj, "it");
                MayaQRActivity mayaQRActivity = (MayaQRActivity) this.f282b;
                C1220i c1220iK1 = mayaQRActivity.k1();
                C1219h c1219hD = C1219h.d(EnumC1215d.SCAN_QR);
                c1219hD.r(EnumC1216e.DASHBOARD);
                c1219hD.n(17);
                c1219hD.t(EnumC1217f.UPGRADE_NOW);
                c1219hD.i();
                c1220iK1.c(mayaQRActivity, c1219hD);
                mayaQRActivity.n1().s(mayaQRActivity, false);
                return Unit.f18162a;
            case 25:
                int i13 = MayaRequestMoneyActivity.f13574o;
                kotlin.jvm.internal.j.g((View) obj, "it");
                MayaRequestMoneyActivity mayaRequestMoneyActivity = (MayaRequestMoneyActivity) this.f282b;
                C1220i c1220iK12 = mayaRequestMoneyActivity.k1();
                C1219h c1219hD2 = C1219h.d(EnumC1215d.REQUEST_MONEY);
                c1219hD2.n(17);
                c1219hD2.t(EnumC1217f.UPGRADE_NOW);
                c1219hD2.i();
                c1220iK12.c(mayaRequestMoneyActivity, c1219hD2);
                mayaRequestMoneyActivity.n1().s(mayaRequestMoneyActivity, false);
                return Unit.f18162a;
            case 26:
                Pair it4 = (Pair) obj;
                kotlin.jvm.internal.j.g(it4, "it");
                B8.c cVarI2 = ((MayaKycCompletePersonalInformationFragment) this.f282b).I2();
                KycFieldType kycFieldType = (KycFieldType) it4.f18161b;
                Object obj2 = it4.f18160a;
                return new Pair(obj2, ((C0212u) cVarI2).p0(kycFieldType, AbstractC1414e.g((MayaInputLayout) obj2)));
            case 27:
                Pair pair = (Pair) obj;
                kotlin.jvm.internal.j.g(pair, "<destruct>");
                MayaInputLayout inputLayout = (MayaInputLayout) pair.f18160a;
                KycFieldType fieldType = (KycFieldType) pair.f18161b;
                kotlin.jvm.internal.j.g(inputLayout, "inputLayout");
                kotlin.jvm.internal.j.g(fieldType, "fieldType");
                int i14 = E8.B.f1265a[fieldType.ordinal()];
                if (i14 == 1 || i14 == 2 || i14 == 3) {
                    String lowerCase = AbstractC1213b.M(Global.HYPHEN, AbstractC1414e.g(inputLayout), "").toLowerCase(Locale.ROOT);
                    kotlin.jvm.internal.j.f(lowerCase, "toLowerCase(...)");
                    string = C2576A.b0(lowerCase).toString();
                } else {
                    string = AbstractC1414e.g(inputLayout);
                }
                if (fieldType == KycFieldType.MIDDLE_NAME) {
                    ViewParent parent = inputLayout.getParent();
                    kotlin.jvm.internal.j.e(parent, "null cannot be cast to non-null type android.view.View");
                    zIsChecked = ((AppCompatCheckBox) C0466m.a((View) parent).c).isChecked();
                }
                return new Pair(inputLayout, ((C0217z) ((MayaKycDosriFragment) this.f282b).M1()).q(fieldType, string, zIsChecked));
            default:
                MayaKycSsneSwornStatementFragment mayaKycSsneSwornStatementFragment2 = (MayaKycSsneSwornStatementFragment) this.f282b;
                Uri uri = (Uri) obj;
                kotlin.jvm.internal.j.g(uri, "uri");
                Set set = E8.j.f1284a;
                Context contextRequireContext = mayaKycSsneSwornStatementFragment2.requireContext();
                kotlin.jvm.internal.j.f(contextRequireContext, "requireContext(...)");
                A0 a0A = E8.j.a(contextRequireContext, uri, 3145728L, E8.j.f1284a);
                if (a0A instanceof E8.i) {
                    N nK1 = mayaKycSsneSwornStatementFragment2.K1();
                    MayaEKYCSelectedDocument mayaEKYCSelectedDocument = mayaKycSsneSwornStatementFragment2.f12617a0;
                    MayaKycSsneSwornStatementFragment mayaKycSsneSwornStatementFragment3 = (MayaKycSsneSwornStatementFragment) ((G) nK1.c.get());
                    mayaKycSsneSwornStatementFragment3.getClass();
                    Context contextRequireContext2 = mayaKycSsneSwornStatementFragment3.requireContext();
                    kotlin.jvm.internal.j.f(contextRequireContext2, "requireContext(...)");
                    if (E8.k.h(contextRequireContext2, uri, mayaEKYCSelectedDocument, ErrorCode.YT_SDK_PARAM_ERROR) == null) {
                        ((MayaKycSsneSwornStatementFragment) ((G) nK1.c.get())).R1();
                    } else {
                        ((MayaKycSsneSwornStatementFragment) ((G) nK1.c.get())).M1(true);
                        MayaKycSsneSwornStatementFragment mayaKycSsneSwornStatementFragment4 = (MayaKycSsneSwornStatementFragment) ((G) nK1.c.get());
                        mayaKycSsneSwornStatementFragment4.getClass();
                        mayaKycSsneSwornStatementFragment4.f12615Y = uri;
                        nK1.o();
                        String lastPathSegment = uri.getLastPathSegment();
                        String str = lastPathSegment != null ? lastPathSegment : "";
                        String strW = C2576A.W('/', str, (2 & 2) != 0 ? str : null);
                        MayaKycSsneSwornStatementFragment mayaKycSsneSwornStatementFragment5 = (MayaKycSsneSwornStatementFragment) ((G) nK1.c.get());
                        mayaKycSsneSwornStatementFragment5.getClass();
                        ((C0475q0) mayaKycSsneSwornStatementFragment5.G1()).f4186g.setText(strW);
                    }
                } else if (a0A instanceof E8.g) {
                    mayaKycSsneSwornStatementFragment2.R1();
                } else {
                    if (!(a0A instanceof E8.h)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    FragmentActivity fragmentActivityRequireActivity8 = mayaKycSsneSwornStatementFragment2.requireActivity();
                    kotlin.jvm.internal.j.e(fragmentActivityRequireActivity8, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                    String string2 = mayaKycSsneSwornStatementFragment2.getString(R.string.maya_kyc_ssne_sworn_statement_error_file_type_invalid);
                    kotlin.jvm.internal.j.f(string2, "getString(...)");
                    ((MayaKycActivity) ((H8.b) fragmentActivityRequireActivity8)).u2(string2);
                    mayaKycSsneSwornStatementFragment2.P1(string2);
                }
                return Unit.f18162a;
        }
    }
}
