package com.paymaya.mayaui.kyczoloz.view.fragment.impl;

import B8.g;
import D8.W;
import F8.f;
import G5.A;
import G8.a;
import H8.b;
import K8.Q;
import M8.C0415v;
import M8.D2;
import M8.L;
import M8.M1;
import M8.T;
import M8.T2;
import M8.W2;
import M8.Y2;
import N5.A0;
import S5.c;
import Xh.i;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavController;
import androidx.navigation.ViewKt;
import com.paymaya.R;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.e0;
import com.paymaya.domain.model.KycFieldType;
import com.paymaya.domain.model.KycSelectionItem;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.base.MayaKycBaseFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycVerifyWithPhilsysFragment;
import com.paymaya.mayaui.kyczoloz.view.widget.KycMayaInputLayout;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import of.p;
import y5.AbstractC2509a;
import y5.q;

/* JADX INFO: loaded from: classes4.dex */
public class MayaKycVerifyWithPhilsysFragment extends MayaKycBaseFragment<A0> implements Q {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public W f12648W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public e0 f12649X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public a f12650Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final D2 f12651Z;

    public MayaKycVerifyWithPhilsysFragment() {
        super(Y2.f3255a);
        this.f12651Z = new D2(this, 2);
    }

    @Override // com.paymaya.mayaui.kyczoloz.view.fragment.base.MayaKycBaseFragment, L8.c
    public final boolean D() {
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        return ((MayaKycActivity) ((b) componentRequireActivity)).e2();
    }

    public final g K1() {
        W w6 = this.f12648W;
        if (w6 != null) {
            return w6;
        }
        j.n("mVerifyWithPhilsysFragmentPresenter");
        throw null;
    }

    public final void L1(KycSelectionItem suffix) {
        j.g(suffix, "suffix");
        ((A0) G1()).m.setSelectedData(suffix);
        ((A0) G1()).m.setDisplayText(suffix.getText());
        ((A0) G1()).m.b();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        O5.a aVar = (O5.a) W4.a.e().f().c;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        this.f12648W = new W();
        this.f12649X = (e0) aVar.f4685S.get();
        ((AbstractC2509a) K1()).h(this);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        ((AbstractC2509a) K1()).i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseBindingFragment, com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f12651Z.remove();
        super.onDestroyView();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        T2.H(this, null, 3);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        requireActivity().getOnBackPressedDispatcher().addCallback(this.f12651Z);
        Object objRequireActivity = requireActivity();
        j.e(objRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        Object obj = (b) objRequireActivity;
        MayaKycActivity mayaKycActivity = (MayaKycActivity) obj;
        mayaKycActivity.t2();
        e0 e0Var = this.f12649X;
        if (e0Var == null) {
            j.n("resourceManager");
            throw null;
        }
        mayaKycActivity.r2(ContextCompat.getColor(e0Var.f10905a, R.color.ghost_white));
        e0 e0Var2 = this.f12649X;
        if (e0Var2 == null) {
            j.n("resourceManager");
            throw null;
        }
        ((q) obj).N1(ContextCompat.getColor(e0Var2.f10905a, R.color.ghost_white));
        mayaKycActivity.p2(new L(this, 18));
        mayaKycActivity.t1();
        mayaKycActivity.s1();
        mayaKycActivity.r1();
        Context contextRequireContext = requireContext();
        j.f(contextRequireContext, "requireContext(...)");
        this.f12650Y = new a(contextRequireContext, new C0415v(2, this, MayaKycVerifyWithPhilsysFragment.class, "triggerErrorEvent", "triggerErrorEvent(Ljava/lang/String;Ljava/lang/String;Z)V", 0, 6), new M1(1, this, MayaKycVerifyWithPhilsysFragment.class, "logEditTextTappedAnalyticsEvent", "logEditTextTappedAnalyticsEvent(Lcom/paymaya/domain/model/KycFieldType;)V", 0, 12));
        p.w(((A0) G1()).m, KycFieldType.SUFFIX, new M1(1, K1(), g.class, "onSuffixClicked", "onSuffixClicked(Ljava/lang/Object;)V", 0, 14));
        KycMayaInputLayout kycMayaInputLayout = ((A0) G1()).i;
        KycFieldType kycFieldType = KycFieldType.FIRST_NAME;
        a aVar = this.f12650Y;
        if (aVar == null) {
            j.n("errorMessageProvider");
            throw null;
        }
        final int i = 0;
        f.b(aVar, kycFieldType, kycMayaInputLayout, new Function1(this) { // from class: M8.V2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaKycVerifyWithPhilsysFragment f3239b;

            {
                this.f3239b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String it = (String) obj2;
                switch (i) {
                    case 0:
                        kotlin.jvm.internal.j.g(it, "it");
                        ((D8.W) this.f3239b.K1()).k();
                        break;
                    case 1:
                        kotlin.jvm.internal.j.g(it, "it");
                        ((D8.W) this.f3239b.K1()).k();
                        break;
                    case 2:
                        kotlin.jvm.internal.j.g(it, "it");
                        ((D8.W) this.f3239b.K1()).k();
                        break;
                    case 3:
                        kotlin.jvm.internal.j.g(it, "it");
                        ((D8.W) this.f3239b.K1()).k();
                        break;
                    default:
                        kotlin.jvm.internal.j.g(it, "it");
                        ((D8.W) this.f3239b.K1()).k();
                        break;
                }
                return Unit.f18162a;
            }
        }, new T(2, K1(), g.class, "validateField", "validateField(Lcom/paymaya/domain/model/KycFieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/KycValidationResult;", 0, 16));
        KycMayaInputLayout kycMayaInputLayout2 = ((A0) G1()).j;
        KycFieldType kycFieldType2 = KycFieldType.LAST_NAME;
        a aVar2 = this.f12650Y;
        if (aVar2 == null) {
            j.n("errorMessageProvider");
            throw null;
        }
        final int i4 = 1;
        f.b(aVar2, kycFieldType2, kycMayaInputLayout2, new Function1(this) { // from class: M8.V2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaKycVerifyWithPhilsysFragment f3239b;

            {
                this.f3239b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String it = (String) obj2;
                switch (i4) {
                    case 0:
                        kotlin.jvm.internal.j.g(it, "it");
                        ((D8.W) this.f3239b.K1()).k();
                        break;
                    case 1:
                        kotlin.jvm.internal.j.g(it, "it");
                        ((D8.W) this.f3239b.K1()).k();
                        break;
                    case 2:
                        kotlin.jvm.internal.j.g(it, "it");
                        ((D8.W) this.f3239b.K1()).k();
                        break;
                    case 3:
                        kotlin.jvm.internal.j.g(it, "it");
                        ((D8.W) this.f3239b.K1()).k();
                        break;
                    default:
                        kotlin.jvm.internal.j.g(it, "it");
                        ((D8.W) this.f3239b.K1()).k();
                        break;
                }
                return Unit.f18162a;
            }
        }, new T(2, K1(), g.class, "validateField", "validateField(Lcom/paymaya/domain/model/KycFieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/KycValidationResult;", 0, 17));
        KycMayaInputLayout kycMayaInputLayout3 = ((A0) G1()).h;
        KycFieldType kycFieldType3 = KycFieldType.BIRTH_DATE;
        a aVar3 = this.f12650Y;
        if (aVar3 == null) {
            j.n("errorMessageProvider");
            throw null;
        }
        final int i6 = 2;
        f.b(aVar3, kycFieldType3, kycMayaInputLayout3, new Function1(this) { // from class: M8.V2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaKycVerifyWithPhilsysFragment f3239b;

            {
                this.f3239b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String it = (String) obj2;
                switch (i6) {
                    case 0:
                        kotlin.jvm.internal.j.g(it, "it");
                        ((D8.W) this.f3239b.K1()).k();
                        break;
                    case 1:
                        kotlin.jvm.internal.j.g(it, "it");
                        ((D8.W) this.f3239b.K1()).k();
                        break;
                    case 2:
                        kotlin.jvm.internal.j.g(it, "it");
                        ((D8.W) this.f3239b.K1()).k();
                        break;
                    case 3:
                        kotlin.jvm.internal.j.g(it, "it");
                        ((D8.W) this.f3239b.K1()).k();
                        break;
                    default:
                        kotlin.jvm.internal.j.g(it, "it");
                        ((D8.W) this.f3239b.K1()).k();
                        break;
                }
                return Unit.f18162a;
            }
        }, new T(2, K1(), g.class, "validateField", "validateField(Lcom/paymaya/domain/model/KycFieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/KycValidationResult;", 0, 18));
        KycMayaInputLayout kycMayaInputLayout4 = ((A0) G1()).f3544l;
        KycFieldType kycFieldType4 = KycFieldType.NATIONAL_ID;
        a aVar4 = this.f12650Y;
        if (aVar4 == null) {
            j.n("errorMessageProvider");
            throw null;
        }
        final int i10 = 3;
        f.b(aVar4, kycFieldType4, kycMayaInputLayout4, new Function1(this) { // from class: M8.V2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaKycVerifyWithPhilsysFragment f3239b;

            {
                this.f3239b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String it = (String) obj2;
                switch (i10) {
                    case 0:
                        kotlin.jvm.internal.j.g(it, "it");
                        ((D8.W) this.f3239b.K1()).k();
                        break;
                    case 1:
                        kotlin.jvm.internal.j.g(it, "it");
                        ((D8.W) this.f3239b.K1()).k();
                        break;
                    case 2:
                        kotlin.jvm.internal.j.g(it, "it");
                        ((D8.W) this.f3239b.K1()).k();
                        break;
                    case 3:
                        kotlin.jvm.internal.j.g(it, "it");
                        ((D8.W) this.f3239b.K1()).k();
                        break;
                    default:
                        kotlin.jvm.internal.j.g(it, "it");
                        ((D8.W) this.f3239b.K1()).k();
                        break;
                }
                return Unit.f18162a;
            }
        }, new T(2, K1(), g.class, "validateField", "validateField(Lcom/paymaya/domain/model/KycFieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/KycValidationResult;", 0, 19));
        ((A0) G1()).f3543k.setEnabled(true);
        ((A0) G1()).f3540b.setChecked(false);
        ((A0) G1()).f3540b.setVisibility(0);
        KycMayaInputLayout kycMayaInputLayout5 = ((A0) G1()).f3543k;
        KycFieldType kycFieldType5 = KycFieldType.MIDDLE_NAME;
        a aVar5 = this.f12650Y;
        if (aVar5 == null) {
            j.n("errorMessageProvider");
            throw null;
        }
        final int i11 = 4;
        f.b(aVar5, kycFieldType5, kycMayaInputLayout5, new Function1(this) { // from class: M8.V2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaKycVerifyWithPhilsysFragment f3239b;

            {
                this.f3239b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String it = (String) obj2;
                switch (i11) {
                    case 0:
                        kotlin.jvm.internal.j.g(it, "it");
                        ((D8.W) this.f3239b.K1()).k();
                        break;
                    case 1:
                        kotlin.jvm.internal.j.g(it, "it");
                        ((D8.W) this.f3239b.K1()).k();
                        break;
                    case 2:
                        kotlin.jvm.internal.j.g(it, "it");
                        ((D8.W) this.f3239b.K1()).k();
                        break;
                    case 3:
                        kotlin.jvm.internal.j.g(it, "it");
                        ((D8.W) this.f3239b.K1()).k();
                        break;
                    default:
                        kotlin.jvm.internal.j.g(it, "it");
                        ((D8.W) this.f3239b.K1()).k();
                        break;
                }
                return Unit.f18162a;
            }
        }, new T(2, this, MayaKycVerifyWithPhilsysFragment.class, "validateMiddleNameField", "validateMiddleNameField(Lcom/paymaya/domain/model/KycFieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/KycValidationResult;", 0, 20));
        A0 a02 = (A0) G1();
        a02.f3540b.setOnCheckedChangeListener(new W2(this, 0));
        EditText inputEditText = ((A0) G1()).f3543k.getInputEditText();
        A a8 = new A();
        final int i12 = 0;
        a8.c = new Function0(this) { // from class: M8.X2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaKycVerifyWithPhilsysFragment f3251b;

            {
                this.f3251b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        MayaKycVerifyWithPhilsysFragment mayaKycVerifyWithPhilsysFragment = this.f3251b;
                        if (((N5.A0) mayaKycVerifyWithPhilsysFragment.G1()).f3543k.isEnabled()) {
                            AppCompatCheckBox checkboxMiddleName = ((N5.A0) mayaKycVerifyWithPhilsysFragment.G1()).f3540b;
                            kotlin.jvm.internal.j.f(checkboxMiddleName, "checkboxMiddleName");
                            checkboxMiddleName.setVisibility(0);
                        }
                        break;
                    case 1:
                        MayaKycVerifyWithPhilsysFragment mayaKycVerifyWithPhilsysFragment2 = this.f3251b;
                        if (!((N5.A0) mayaKycVerifyWithPhilsysFragment2.G1()).f3540b.isChecked()) {
                            AppCompatCheckBox checkboxMiddleName2 = ((N5.A0) mayaKycVerifyWithPhilsysFragment2.G1()).f3540b;
                            kotlin.jvm.internal.j.f(checkboxMiddleName2, "checkboxMiddleName");
                            checkboxMiddleName2.setVisibility(8);
                        }
                        if (((N5.A0) mayaKycVerifyWithPhilsysFragment2.G1()).f3540b.isChecked()) {
                            ((N5.A0) mayaKycVerifyWithPhilsysFragment2.G1()).f3540b.setChecked(false);
                        }
                        break;
                    case 2:
                        ((D8.W) this.f3251b.K1()).k();
                        break;
                    case 3:
                        MayaKycVerifyWithPhilsysFragment mayaKycVerifyWithPhilsysFragment3 = (MayaKycVerifyWithPhilsysFragment) ((K8.Q) ((D8.W) this.f3251b.K1()).c.get());
                        mayaKycVerifyWithPhilsysFragment3.getClass();
                        ActionOnlyNavDirections actionOnlyNavDirections = new ActionOnlyNavDirections(R.id.action_maya_kyc_verify_with_philsys_fragment_to_maya_kyc_face_authentication_flow);
                        T2.Q(mayaKycVerifyWithPhilsysFragment3, ((Button) ((N5.A0) mayaKycVerifyWithPhilsysFragment3.G1()).c.f4087b).getText().toString(), T2.l(mayaKycVerifyWithPhilsysFragment3, actionOnlyNavDirections).toString(), null, 12);
                        ConstraintLayout constraintLayout = ((N5.A0) mayaKycVerifyWithPhilsysFragment3.G1()).f3539a;
                        kotlin.jvm.internal.j.f(constraintLayout, "getRoot(...)");
                        E1.c.m(ViewKt.findNavController(constraintLayout), actionOnlyNavDirections);
                        break;
                    case 4:
                        MayaKycVerifyWithPhilsysFragment mayaKycVerifyWithPhilsysFragment4 = (MayaKycVerifyWithPhilsysFragment) ((K8.Q) ((D8.W) this.f3251b.K1()).c.get());
                        ConstraintLayout constraintLayout2 = ((N5.A0) mayaKycVerifyWithPhilsysFragment4.G1()).f3539a;
                        kotlin.jvm.internal.j.f(constraintLayout2, "getRoot(...)");
                        NavController navControllerFindNavController = ViewKt.findNavController(constraintLayout2);
                        ActionOnlyNavDirections actionOnlyNavDirections2 = new ActionOnlyNavDirections(R.id.action_maya_kyc_verify_with_philsys_fragment_to_maya_kyc_submit_id_fragment);
                        T2.Q(mayaKycVerifyWithPhilsysFragment4, ((TextView) ((N5.A0) mayaKycVerifyWithPhilsysFragment4.G1()).c.f4088d).getText().toString(), T2.l(mayaKycVerifyWithPhilsysFragment4, actionOnlyNavDirections2).toString(), null, 12);
                        E1.c.m(navControllerFindNavController, actionOnlyNavDirections2);
                        break;
                    case 5:
                        MayaKycVerifyWithPhilsysFragment mayaKycVerifyWithPhilsysFragment5 = this.f3251b;
                        if (!((RadioButton) ((N5.A0) mayaKycVerifyWithPhilsysFragment5.G1()).f3545n.f11284d.c).isChecked()) {
                            D8.W w6 = (D8.W) mayaKycVerifyWithPhilsysFragment5.K1();
                            LinkedHashMap linkedHashMap = E8.C.f1266a;
                            E8.C.b(D8.U.f1022a, "verify_philsys_option");
                            w6.k();
                            mayaKycVerifyWithPhilsysFragment5.H1();
                            ((N5.A0) mayaKycVerifyWithPhilsysFragment5.G1()).f3545n.setChecked(true);
                            ((N5.A0) mayaKycVerifyWithPhilsysFragment5.G1()).f3546o.setChecked(false);
                            E8.k.c(((N5.A0) mayaKycVerifyWithPhilsysFragment5.G1()).f3541d, ((N5.A0) mayaKycVerifyWithPhilsysFragment5.G1()).e);
                        }
                        break;
                    default:
                        MayaKycVerifyWithPhilsysFragment mayaKycVerifyWithPhilsysFragment6 = this.f3251b;
                        if (!((RadioButton) ((N5.A0) mayaKycVerifyWithPhilsysFragment6.G1()).f3546o.f11284d.c).isChecked()) {
                            D8.W w8 = (D8.W) mayaKycVerifyWithPhilsysFragment6.K1();
                            LinkedHashMap linkedHashMap2 = E8.C.f1266a;
                            E8.C.b(D8.U.f1023b, "verify_philsys_option");
                            w8.k();
                            mayaKycVerifyWithPhilsysFragment6.H1();
                            ((N5.A0) mayaKycVerifyWithPhilsysFragment6.G1()).f3545n.setChecked(false);
                            ((N5.A0) mayaKycVerifyWithPhilsysFragment6.G1()).f3546o.setChecked(true);
                            E8.k.c(((N5.A0) mayaKycVerifyWithPhilsysFragment6.G1()).e, ((N5.A0) mayaKycVerifyWithPhilsysFragment6.G1()).f3541d);
                        }
                        break;
                }
                return Unit.f18162a;
            }
        };
        final int i13 = 1;
        a8.f1715d = new Function0(this) { // from class: M8.X2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaKycVerifyWithPhilsysFragment f3251b;

            {
                this.f3251b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        MayaKycVerifyWithPhilsysFragment mayaKycVerifyWithPhilsysFragment = this.f3251b;
                        if (((N5.A0) mayaKycVerifyWithPhilsysFragment.G1()).f3543k.isEnabled()) {
                            AppCompatCheckBox checkboxMiddleName = ((N5.A0) mayaKycVerifyWithPhilsysFragment.G1()).f3540b;
                            kotlin.jvm.internal.j.f(checkboxMiddleName, "checkboxMiddleName");
                            checkboxMiddleName.setVisibility(0);
                        }
                        break;
                    case 1:
                        MayaKycVerifyWithPhilsysFragment mayaKycVerifyWithPhilsysFragment2 = this.f3251b;
                        if (!((N5.A0) mayaKycVerifyWithPhilsysFragment2.G1()).f3540b.isChecked()) {
                            AppCompatCheckBox checkboxMiddleName2 = ((N5.A0) mayaKycVerifyWithPhilsysFragment2.G1()).f3540b;
                            kotlin.jvm.internal.j.f(checkboxMiddleName2, "checkboxMiddleName");
                            checkboxMiddleName2.setVisibility(8);
                        }
                        if (((N5.A0) mayaKycVerifyWithPhilsysFragment2.G1()).f3540b.isChecked()) {
                            ((N5.A0) mayaKycVerifyWithPhilsysFragment2.G1()).f3540b.setChecked(false);
                        }
                        break;
                    case 2:
                        ((D8.W) this.f3251b.K1()).k();
                        break;
                    case 3:
                        MayaKycVerifyWithPhilsysFragment mayaKycVerifyWithPhilsysFragment3 = (MayaKycVerifyWithPhilsysFragment) ((K8.Q) ((D8.W) this.f3251b.K1()).c.get());
                        mayaKycVerifyWithPhilsysFragment3.getClass();
                        ActionOnlyNavDirections actionOnlyNavDirections = new ActionOnlyNavDirections(R.id.action_maya_kyc_verify_with_philsys_fragment_to_maya_kyc_face_authentication_flow);
                        T2.Q(mayaKycVerifyWithPhilsysFragment3, ((Button) ((N5.A0) mayaKycVerifyWithPhilsysFragment3.G1()).c.f4087b).getText().toString(), T2.l(mayaKycVerifyWithPhilsysFragment3, actionOnlyNavDirections).toString(), null, 12);
                        ConstraintLayout constraintLayout = ((N5.A0) mayaKycVerifyWithPhilsysFragment3.G1()).f3539a;
                        kotlin.jvm.internal.j.f(constraintLayout, "getRoot(...)");
                        E1.c.m(ViewKt.findNavController(constraintLayout), actionOnlyNavDirections);
                        break;
                    case 4:
                        MayaKycVerifyWithPhilsysFragment mayaKycVerifyWithPhilsysFragment4 = (MayaKycVerifyWithPhilsysFragment) ((K8.Q) ((D8.W) this.f3251b.K1()).c.get());
                        ConstraintLayout constraintLayout2 = ((N5.A0) mayaKycVerifyWithPhilsysFragment4.G1()).f3539a;
                        kotlin.jvm.internal.j.f(constraintLayout2, "getRoot(...)");
                        NavController navControllerFindNavController = ViewKt.findNavController(constraintLayout2);
                        ActionOnlyNavDirections actionOnlyNavDirections2 = new ActionOnlyNavDirections(R.id.action_maya_kyc_verify_with_philsys_fragment_to_maya_kyc_submit_id_fragment);
                        T2.Q(mayaKycVerifyWithPhilsysFragment4, ((TextView) ((N5.A0) mayaKycVerifyWithPhilsysFragment4.G1()).c.f4088d).getText().toString(), T2.l(mayaKycVerifyWithPhilsysFragment4, actionOnlyNavDirections2).toString(), null, 12);
                        E1.c.m(navControllerFindNavController, actionOnlyNavDirections2);
                        break;
                    case 5:
                        MayaKycVerifyWithPhilsysFragment mayaKycVerifyWithPhilsysFragment5 = this.f3251b;
                        if (!((RadioButton) ((N5.A0) mayaKycVerifyWithPhilsysFragment5.G1()).f3545n.f11284d.c).isChecked()) {
                            D8.W w6 = (D8.W) mayaKycVerifyWithPhilsysFragment5.K1();
                            LinkedHashMap linkedHashMap = E8.C.f1266a;
                            E8.C.b(D8.U.f1022a, "verify_philsys_option");
                            w6.k();
                            mayaKycVerifyWithPhilsysFragment5.H1();
                            ((N5.A0) mayaKycVerifyWithPhilsysFragment5.G1()).f3545n.setChecked(true);
                            ((N5.A0) mayaKycVerifyWithPhilsysFragment5.G1()).f3546o.setChecked(false);
                            E8.k.c(((N5.A0) mayaKycVerifyWithPhilsysFragment5.G1()).f3541d, ((N5.A0) mayaKycVerifyWithPhilsysFragment5.G1()).e);
                        }
                        break;
                    default:
                        MayaKycVerifyWithPhilsysFragment mayaKycVerifyWithPhilsysFragment6 = this.f3251b;
                        if (!((RadioButton) ((N5.A0) mayaKycVerifyWithPhilsysFragment6.G1()).f3546o.f11284d.c).isChecked()) {
                            D8.W w8 = (D8.W) mayaKycVerifyWithPhilsysFragment6.K1();
                            LinkedHashMap linkedHashMap2 = E8.C.f1266a;
                            E8.C.b(D8.U.f1023b, "verify_philsys_option");
                            w8.k();
                            mayaKycVerifyWithPhilsysFragment6.H1();
                            ((N5.A0) mayaKycVerifyWithPhilsysFragment6.G1()).f3545n.setChecked(false);
                            ((N5.A0) mayaKycVerifyWithPhilsysFragment6.G1()).f3546o.setChecked(true);
                            E8.k.c(((N5.A0) mayaKycVerifyWithPhilsysFragment6.G1()).e, ((N5.A0) mayaKycVerifyWithPhilsysFragment6.G1()).f3541d);
                        }
                        break;
                }
                return Unit.f18162a;
            }
        };
        final int i14 = 2;
        a8.e = new Function0(this) { // from class: M8.X2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaKycVerifyWithPhilsysFragment f3251b;

            {
                this.f3251b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        MayaKycVerifyWithPhilsysFragment mayaKycVerifyWithPhilsysFragment = this.f3251b;
                        if (((N5.A0) mayaKycVerifyWithPhilsysFragment.G1()).f3543k.isEnabled()) {
                            AppCompatCheckBox checkboxMiddleName = ((N5.A0) mayaKycVerifyWithPhilsysFragment.G1()).f3540b;
                            kotlin.jvm.internal.j.f(checkboxMiddleName, "checkboxMiddleName");
                            checkboxMiddleName.setVisibility(0);
                        }
                        break;
                    case 1:
                        MayaKycVerifyWithPhilsysFragment mayaKycVerifyWithPhilsysFragment2 = this.f3251b;
                        if (!((N5.A0) mayaKycVerifyWithPhilsysFragment2.G1()).f3540b.isChecked()) {
                            AppCompatCheckBox checkboxMiddleName2 = ((N5.A0) mayaKycVerifyWithPhilsysFragment2.G1()).f3540b;
                            kotlin.jvm.internal.j.f(checkboxMiddleName2, "checkboxMiddleName");
                            checkboxMiddleName2.setVisibility(8);
                        }
                        if (((N5.A0) mayaKycVerifyWithPhilsysFragment2.G1()).f3540b.isChecked()) {
                            ((N5.A0) mayaKycVerifyWithPhilsysFragment2.G1()).f3540b.setChecked(false);
                        }
                        break;
                    case 2:
                        ((D8.W) this.f3251b.K1()).k();
                        break;
                    case 3:
                        MayaKycVerifyWithPhilsysFragment mayaKycVerifyWithPhilsysFragment3 = (MayaKycVerifyWithPhilsysFragment) ((K8.Q) ((D8.W) this.f3251b.K1()).c.get());
                        mayaKycVerifyWithPhilsysFragment3.getClass();
                        ActionOnlyNavDirections actionOnlyNavDirections = new ActionOnlyNavDirections(R.id.action_maya_kyc_verify_with_philsys_fragment_to_maya_kyc_face_authentication_flow);
                        T2.Q(mayaKycVerifyWithPhilsysFragment3, ((Button) ((N5.A0) mayaKycVerifyWithPhilsysFragment3.G1()).c.f4087b).getText().toString(), T2.l(mayaKycVerifyWithPhilsysFragment3, actionOnlyNavDirections).toString(), null, 12);
                        ConstraintLayout constraintLayout = ((N5.A0) mayaKycVerifyWithPhilsysFragment3.G1()).f3539a;
                        kotlin.jvm.internal.j.f(constraintLayout, "getRoot(...)");
                        E1.c.m(ViewKt.findNavController(constraintLayout), actionOnlyNavDirections);
                        break;
                    case 4:
                        MayaKycVerifyWithPhilsysFragment mayaKycVerifyWithPhilsysFragment4 = (MayaKycVerifyWithPhilsysFragment) ((K8.Q) ((D8.W) this.f3251b.K1()).c.get());
                        ConstraintLayout constraintLayout2 = ((N5.A0) mayaKycVerifyWithPhilsysFragment4.G1()).f3539a;
                        kotlin.jvm.internal.j.f(constraintLayout2, "getRoot(...)");
                        NavController navControllerFindNavController = ViewKt.findNavController(constraintLayout2);
                        ActionOnlyNavDirections actionOnlyNavDirections2 = new ActionOnlyNavDirections(R.id.action_maya_kyc_verify_with_philsys_fragment_to_maya_kyc_submit_id_fragment);
                        T2.Q(mayaKycVerifyWithPhilsysFragment4, ((TextView) ((N5.A0) mayaKycVerifyWithPhilsysFragment4.G1()).c.f4088d).getText().toString(), T2.l(mayaKycVerifyWithPhilsysFragment4, actionOnlyNavDirections2).toString(), null, 12);
                        E1.c.m(navControllerFindNavController, actionOnlyNavDirections2);
                        break;
                    case 5:
                        MayaKycVerifyWithPhilsysFragment mayaKycVerifyWithPhilsysFragment5 = this.f3251b;
                        if (!((RadioButton) ((N5.A0) mayaKycVerifyWithPhilsysFragment5.G1()).f3545n.f11284d.c).isChecked()) {
                            D8.W w6 = (D8.W) mayaKycVerifyWithPhilsysFragment5.K1();
                            LinkedHashMap linkedHashMap = E8.C.f1266a;
                            E8.C.b(D8.U.f1022a, "verify_philsys_option");
                            w6.k();
                            mayaKycVerifyWithPhilsysFragment5.H1();
                            ((N5.A0) mayaKycVerifyWithPhilsysFragment5.G1()).f3545n.setChecked(true);
                            ((N5.A0) mayaKycVerifyWithPhilsysFragment5.G1()).f3546o.setChecked(false);
                            E8.k.c(((N5.A0) mayaKycVerifyWithPhilsysFragment5.G1()).f3541d, ((N5.A0) mayaKycVerifyWithPhilsysFragment5.G1()).e);
                        }
                        break;
                    default:
                        MayaKycVerifyWithPhilsysFragment mayaKycVerifyWithPhilsysFragment6 = this.f3251b;
                        if (!((RadioButton) ((N5.A0) mayaKycVerifyWithPhilsysFragment6.G1()).f3546o.f11284d.c).isChecked()) {
                            D8.W w8 = (D8.W) mayaKycVerifyWithPhilsysFragment6.K1();
                            LinkedHashMap linkedHashMap2 = E8.C.f1266a;
                            E8.C.b(D8.U.f1023b, "verify_philsys_option");
                            w8.k();
                            mayaKycVerifyWithPhilsysFragment6.H1();
                            ((N5.A0) mayaKycVerifyWithPhilsysFragment6.G1()).f3545n.setChecked(false);
                            ((N5.A0) mayaKycVerifyWithPhilsysFragment6.G1()).f3546o.setChecked(true);
                            E8.k.c(((N5.A0) mayaKycVerifyWithPhilsysFragment6.G1()).e, ((N5.A0) mayaKycVerifyWithPhilsysFragment6.G1()).f3541d);
                        }
                        break;
                }
                return Unit.f18162a;
            }
        };
        inputEditText.addTextChangedListener(a8);
        ((A0) G1()).f3545n.setClickable(false);
        ((A0) G1()).f3546o.setClickable(false);
        f.a(((A0) G1()).h, kycFieldType3);
        f.a(((A0) G1()).f3544l, kycFieldType4);
        final int i15 = 3;
        Ke.b.b((Button) ((A0) G1()).c.f4087b, new Function0(this) { // from class: M8.X2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaKycVerifyWithPhilsysFragment f3251b;

            {
                this.f3251b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        MayaKycVerifyWithPhilsysFragment mayaKycVerifyWithPhilsysFragment = this.f3251b;
                        if (((N5.A0) mayaKycVerifyWithPhilsysFragment.G1()).f3543k.isEnabled()) {
                            AppCompatCheckBox checkboxMiddleName = ((N5.A0) mayaKycVerifyWithPhilsysFragment.G1()).f3540b;
                            kotlin.jvm.internal.j.f(checkboxMiddleName, "checkboxMiddleName");
                            checkboxMiddleName.setVisibility(0);
                        }
                        break;
                    case 1:
                        MayaKycVerifyWithPhilsysFragment mayaKycVerifyWithPhilsysFragment2 = this.f3251b;
                        if (!((N5.A0) mayaKycVerifyWithPhilsysFragment2.G1()).f3540b.isChecked()) {
                            AppCompatCheckBox checkboxMiddleName2 = ((N5.A0) mayaKycVerifyWithPhilsysFragment2.G1()).f3540b;
                            kotlin.jvm.internal.j.f(checkboxMiddleName2, "checkboxMiddleName");
                            checkboxMiddleName2.setVisibility(8);
                        }
                        if (((N5.A0) mayaKycVerifyWithPhilsysFragment2.G1()).f3540b.isChecked()) {
                            ((N5.A0) mayaKycVerifyWithPhilsysFragment2.G1()).f3540b.setChecked(false);
                        }
                        break;
                    case 2:
                        ((D8.W) this.f3251b.K1()).k();
                        break;
                    case 3:
                        MayaKycVerifyWithPhilsysFragment mayaKycVerifyWithPhilsysFragment3 = (MayaKycVerifyWithPhilsysFragment) ((K8.Q) ((D8.W) this.f3251b.K1()).c.get());
                        mayaKycVerifyWithPhilsysFragment3.getClass();
                        ActionOnlyNavDirections actionOnlyNavDirections = new ActionOnlyNavDirections(R.id.action_maya_kyc_verify_with_philsys_fragment_to_maya_kyc_face_authentication_flow);
                        T2.Q(mayaKycVerifyWithPhilsysFragment3, ((Button) ((N5.A0) mayaKycVerifyWithPhilsysFragment3.G1()).c.f4087b).getText().toString(), T2.l(mayaKycVerifyWithPhilsysFragment3, actionOnlyNavDirections).toString(), null, 12);
                        ConstraintLayout constraintLayout = ((N5.A0) mayaKycVerifyWithPhilsysFragment3.G1()).f3539a;
                        kotlin.jvm.internal.j.f(constraintLayout, "getRoot(...)");
                        E1.c.m(ViewKt.findNavController(constraintLayout), actionOnlyNavDirections);
                        break;
                    case 4:
                        MayaKycVerifyWithPhilsysFragment mayaKycVerifyWithPhilsysFragment4 = (MayaKycVerifyWithPhilsysFragment) ((K8.Q) ((D8.W) this.f3251b.K1()).c.get());
                        ConstraintLayout constraintLayout2 = ((N5.A0) mayaKycVerifyWithPhilsysFragment4.G1()).f3539a;
                        kotlin.jvm.internal.j.f(constraintLayout2, "getRoot(...)");
                        NavController navControllerFindNavController = ViewKt.findNavController(constraintLayout2);
                        ActionOnlyNavDirections actionOnlyNavDirections2 = new ActionOnlyNavDirections(R.id.action_maya_kyc_verify_with_philsys_fragment_to_maya_kyc_submit_id_fragment);
                        T2.Q(mayaKycVerifyWithPhilsysFragment4, ((TextView) ((N5.A0) mayaKycVerifyWithPhilsysFragment4.G1()).c.f4088d).getText().toString(), T2.l(mayaKycVerifyWithPhilsysFragment4, actionOnlyNavDirections2).toString(), null, 12);
                        E1.c.m(navControllerFindNavController, actionOnlyNavDirections2);
                        break;
                    case 5:
                        MayaKycVerifyWithPhilsysFragment mayaKycVerifyWithPhilsysFragment5 = this.f3251b;
                        if (!((RadioButton) ((N5.A0) mayaKycVerifyWithPhilsysFragment5.G1()).f3545n.f11284d.c).isChecked()) {
                            D8.W w6 = (D8.W) mayaKycVerifyWithPhilsysFragment5.K1();
                            LinkedHashMap linkedHashMap = E8.C.f1266a;
                            E8.C.b(D8.U.f1022a, "verify_philsys_option");
                            w6.k();
                            mayaKycVerifyWithPhilsysFragment5.H1();
                            ((N5.A0) mayaKycVerifyWithPhilsysFragment5.G1()).f3545n.setChecked(true);
                            ((N5.A0) mayaKycVerifyWithPhilsysFragment5.G1()).f3546o.setChecked(false);
                            E8.k.c(((N5.A0) mayaKycVerifyWithPhilsysFragment5.G1()).f3541d, ((N5.A0) mayaKycVerifyWithPhilsysFragment5.G1()).e);
                        }
                        break;
                    default:
                        MayaKycVerifyWithPhilsysFragment mayaKycVerifyWithPhilsysFragment6 = this.f3251b;
                        if (!((RadioButton) ((N5.A0) mayaKycVerifyWithPhilsysFragment6.G1()).f3546o.f11284d.c).isChecked()) {
                            D8.W w8 = (D8.W) mayaKycVerifyWithPhilsysFragment6.K1();
                            LinkedHashMap linkedHashMap2 = E8.C.f1266a;
                            E8.C.b(D8.U.f1023b, "verify_philsys_option");
                            w8.k();
                            mayaKycVerifyWithPhilsysFragment6.H1();
                            ((N5.A0) mayaKycVerifyWithPhilsysFragment6.G1()).f3545n.setChecked(false);
                            ((N5.A0) mayaKycVerifyWithPhilsysFragment6.G1()).f3546o.setChecked(true);
                            E8.k.c(((N5.A0) mayaKycVerifyWithPhilsysFragment6.G1()).e, ((N5.A0) mayaKycVerifyWithPhilsysFragment6.G1()).f3541d);
                        }
                        break;
                }
                return Unit.f18162a;
            }
        });
        final int i16 = 4;
        Ke.b.b((TextView) ((A0) G1()).c.f4088d, new Function0(this) { // from class: M8.X2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaKycVerifyWithPhilsysFragment f3251b;

            {
                this.f3251b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i16) {
                    case 0:
                        MayaKycVerifyWithPhilsysFragment mayaKycVerifyWithPhilsysFragment = this.f3251b;
                        if (((N5.A0) mayaKycVerifyWithPhilsysFragment.G1()).f3543k.isEnabled()) {
                            AppCompatCheckBox checkboxMiddleName = ((N5.A0) mayaKycVerifyWithPhilsysFragment.G1()).f3540b;
                            kotlin.jvm.internal.j.f(checkboxMiddleName, "checkboxMiddleName");
                            checkboxMiddleName.setVisibility(0);
                        }
                        break;
                    case 1:
                        MayaKycVerifyWithPhilsysFragment mayaKycVerifyWithPhilsysFragment2 = this.f3251b;
                        if (!((N5.A0) mayaKycVerifyWithPhilsysFragment2.G1()).f3540b.isChecked()) {
                            AppCompatCheckBox checkboxMiddleName2 = ((N5.A0) mayaKycVerifyWithPhilsysFragment2.G1()).f3540b;
                            kotlin.jvm.internal.j.f(checkboxMiddleName2, "checkboxMiddleName");
                            checkboxMiddleName2.setVisibility(8);
                        }
                        if (((N5.A0) mayaKycVerifyWithPhilsysFragment2.G1()).f3540b.isChecked()) {
                            ((N5.A0) mayaKycVerifyWithPhilsysFragment2.G1()).f3540b.setChecked(false);
                        }
                        break;
                    case 2:
                        ((D8.W) this.f3251b.K1()).k();
                        break;
                    case 3:
                        MayaKycVerifyWithPhilsysFragment mayaKycVerifyWithPhilsysFragment3 = (MayaKycVerifyWithPhilsysFragment) ((K8.Q) ((D8.W) this.f3251b.K1()).c.get());
                        mayaKycVerifyWithPhilsysFragment3.getClass();
                        ActionOnlyNavDirections actionOnlyNavDirections = new ActionOnlyNavDirections(R.id.action_maya_kyc_verify_with_philsys_fragment_to_maya_kyc_face_authentication_flow);
                        T2.Q(mayaKycVerifyWithPhilsysFragment3, ((Button) ((N5.A0) mayaKycVerifyWithPhilsysFragment3.G1()).c.f4087b).getText().toString(), T2.l(mayaKycVerifyWithPhilsysFragment3, actionOnlyNavDirections).toString(), null, 12);
                        ConstraintLayout constraintLayout = ((N5.A0) mayaKycVerifyWithPhilsysFragment3.G1()).f3539a;
                        kotlin.jvm.internal.j.f(constraintLayout, "getRoot(...)");
                        E1.c.m(ViewKt.findNavController(constraintLayout), actionOnlyNavDirections);
                        break;
                    case 4:
                        MayaKycVerifyWithPhilsysFragment mayaKycVerifyWithPhilsysFragment4 = (MayaKycVerifyWithPhilsysFragment) ((K8.Q) ((D8.W) this.f3251b.K1()).c.get());
                        ConstraintLayout constraintLayout2 = ((N5.A0) mayaKycVerifyWithPhilsysFragment4.G1()).f3539a;
                        kotlin.jvm.internal.j.f(constraintLayout2, "getRoot(...)");
                        NavController navControllerFindNavController = ViewKt.findNavController(constraintLayout2);
                        ActionOnlyNavDirections actionOnlyNavDirections2 = new ActionOnlyNavDirections(R.id.action_maya_kyc_verify_with_philsys_fragment_to_maya_kyc_submit_id_fragment);
                        T2.Q(mayaKycVerifyWithPhilsysFragment4, ((TextView) ((N5.A0) mayaKycVerifyWithPhilsysFragment4.G1()).c.f4088d).getText().toString(), T2.l(mayaKycVerifyWithPhilsysFragment4, actionOnlyNavDirections2).toString(), null, 12);
                        E1.c.m(navControllerFindNavController, actionOnlyNavDirections2);
                        break;
                    case 5:
                        MayaKycVerifyWithPhilsysFragment mayaKycVerifyWithPhilsysFragment5 = this.f3251b;
                        if (!((RadioButton) ((N5.A0) mayaKycVerifyWithPhilsysFragment5.G1()).f3545n.f11284d.c).isChecked()) {
                            D8.W w6 = (D8.W) mayaKycVerifyWithPhilsysFragment5.K1();
                            LinkedHashMap linkedHashMap = E8.C.f1266a;
                            E8.C.b(D8.U.f1022a, "verify_philsys_option");
                            w6.k();
                            mayaKycVerifyWithPhilsysFragment5.H1();
                            ((N5.A0) mayaKycVerifyWithPhilsysFragment5.G1()).f3545n.setChecked(true);
                            ((N5.A0) mayaKycVerifyWithPhilsysFragment5.G1()).f3546o.setChecked(false);
                            E8.k.c(((N5.A0) mayaKycVerifyWithPhilsysFragment5.G1()).f3541d, ((N5.A0) mayaKycVerifyWithPhilsysFragment5.G1()).e);
                        }
                        break;
                    default:
                        MayaKycVerifyWithPhilsysFragment mayaKycVerifyWithPhilsysFragment6 = this.f3251b;
                        if (!((RadioButton) ((N5.A0) mayaKycVerifyWithPhilsysFragment6.G1()).f3546o.f11284d.c).isChecked()) {
                            D8.W w8 = (D8.W) mayaKycVerifyWithPhilsysFragment6.K1();
                            LinkedHashMap linkedHashMap2 = E8.C.f1266a;
                            E8.C.b(D8.U.f1023b, "verify_philsys_option");
                            w8.k();
                            mayaKycVerifyWithPhilsysFragment6.H1();
                            ((N5.A0) mayaKycVerifyWithPhilsysFragment6.G1()).f3545n.setChecked(false);
                            ((N5.A0) mayaKycVerifyWithPhilsysFragment6.G1()).f3546o.setChecked(true);
                            E8.k.c(((N5.A0) mayaKycVerifyWithPhilsysFragment6.G1()).e, ((N5.A0) mayaKycVerifyWithPhilsysFragment6.G1()).f3541d);
                        }
                        break;
                }
                return Unit.f18162a;
            }
        });
        final int i17 = 5;
        Ke.b.b(((A0) G1()).f, new Function0(this) { // from class: M8.X2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaKycVerifyWithPhilsysFragment f3251b;

            {
                this.f3251b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i17) {
                    case 0:
                        MayaKycVerifyWithPhilsysFragment mayaKycVerifyWithPhilsysFragment = this.f3251b;
                        if (((N5.A0) mayaKycVerifyWithPhilsysFragment.G1()).f3543k.isEnabled()) {
                            AppCompatCheckBox checkboxMiddleName = ((N5.A0) mayaKycVerifyWithPhilsysFragment.G1()).f3540b;
                            kotlin.jvm.internal.j.f(checkboxMiddleName, "checkboxMiddleName");
                            checkboxMiddleName.setVisibility(0);
                        }
                        break;
                    case 1:
                        MayaKycVerifyWithPhilsysFragment mayaKycVerifyWithPhilsysFragment2 = this.f3251b;
                        if (!((N5.A0) mayaKycVerifyWithPhilsysFragment2.G1()).f3540b.isChecked()) {
                            AppCompatCheckBox checkboxMiddleName2 = ((N5.A0) mayaKycVerifyWithPhilsysFragment2.G1()).f3540b;
                            kotlin.jvm.internal.j.f(checkboxMiddleName2, "checkboxMiddleName");
                            checkboxMiddleName2.setVisibility(8);
                        }
                        if (((N5.A0) mayaKycVerifyWithPhilsysFragment2.G1()).f3540b.isChecked()) {
                            ((N5.A0) mayaKycVerifyWithPhilsysFragment2.G1()).f3540b.setChecked(false);
                        }
                        break;
                    case 2:
                        ((D8.W) this.f3251b.K1()).k();
                        break;
                    case 3:
                        MayaKycVerifyWithPhilsysFragment mayaKycVerifyWithPhilsysFragment3 = (MayaKycVerifyWithPhilsysFragment) ((K8.Q) ((D8.W) this.f3251b.K1()).c.get());
                        mayaKycVerifyWithPhilsysFragment3.getClass();
                        ActionOnlyNavDirections actionOnlyNavDirections = new ActionOnlyNavDirections(R.id.action_maya_kyc_verify_with_philsys_fragment_to_maya_kyc_face_authentication_flow);
                        T2.Q(mayaKycVerifyWithPhilsysFragment3, ((Button) ((N5.A0) mayaKycVerifyWithPhilsysFragment3.G1()).c.f4087b).getText().toString(), T2.l(mayaKycVerifyWithPhilsysFragment3, actionOnlyNavDirections).toString(), null, 12);
                        ConstraintLayout constraintLayout = ((N5.A0) mayaKycVerifyWithPhilsysFragment3.G1()).f3539a;
                        kotlin.jvm.internal.j.f(constraintLayout, "getRoot(...)");
                        E1.c.m(ViewKt.findNavController(constraintLayout), actionOnlyNavDirections);
                        break;
                    case 4:
                        MayaKycVerifyWithPhilsysFragment mayaKycVerifyWithPhilsysFragment4 = (MayaKycVerifyWithPhilsysFragment) ((K8.Q) ((D8.W) this.f3251b.K1()).c.get());
                        ConstraintLayout constraintLayout2 = ((N5.A0) mayaKycVerifyWithPhilsysFragment4.G1()).f3539a;
                        kotlin.jvm.internal.j.f(constraintLayout2, "getRoot(...)");
                        NavController navControllerFindNavController = ViewKt.findNavController(constraintLayout2);
                        ActionOnlyNavDirections actionOnlyNavDirections2 = new ActionOnlyNavDirections(R.id.action_maya_kyc_verify_with_philsys_fragment_to_maya_kyc_submit_id_fragment);
                        T2.Q(mayaKycVerifyWithPhilsysFragment4, ((TextView) ((N5.A0) mayaKycVerifyWithPhilsysFragment4.G1()).c.f4088d).getText().toString(), T2.l(mayaKycVerifyWithPhilsysFragment4, actionOnlyNavDirections2).toString(), null, 12);
                        E1.c.m(navControllerFindNavController, actionOnlyNavDirections2);
                        break;
                    case 5:
                        MayaKycVerifyWithPhilsysFragment mayaKycVerifyWithPhilsysFragment5 = this.f3251b;
                        if (!((RadioButton) ((N5.A0) mayaKycVerifyWithPhilsysFragment5.G1()).f3545n.f11284d.c).isChecked()) {
                            D8.W w6 = (D8.W) mayaKycVerifyWithPhilsysFragment5.K1();
                            LinkedHashMap linkedHashMap = E8.C.f1266a;
                            E8.C.b(D8.U.f1022a, "verify_philsys_option");
                            w6.k();
                            mayaKycVerifyWithPhilsysFragment5.H1();
                            ((N5.A0) mayaKycVerifyWithPhilsysFragment5.G1()).f3545n.setChecked(true);
                            ((N5.A0) mayaKycVerifyWithPhilsysFragment5.G1()).f3546o.setChecked(false);
                            E8.k.c(((N5.A0) mayaKycVerifyWithPhilsysFragment5.G1()).f3541d, ((N5.A0) mayaKycVerifyWithPhilsysFragment5.G1()).e);
                        }
                        break;
                    default:
                        MayaKycVerifyWithPhilsysFragment mayaKycVerifyWithPhilsysFragment6 = this.f3251b;
                        if (!((RadioButton) ((N5.A0) mayaKycVerifyWithPhilsysFragment6.G1()).f3546o.f11284d.c).isChecked()) {
                            D8.W w8 = (D8.W) mayaKycVerifyWithPhilsysFragment6.K1();
                            LinkedHashMap linkedHashMap2 = E8.C.f1266a;
                            E8.C.b(D8.U.f1023b, "verify_philsys_option");
                            w8.k();
                            mayaKycVerifyWithPhilsysFragment6.H1();
                            ((N5.A0) mayaKycVerifyWithPhilsysFragment6.G1()).f3545n.setChecked(false);
                            ((N5.A0) mayaKycVerifyWithPhilsysFragment6.G1()).f3546o.setChecked(true);
                            E8.k.c(((N5.A0) mayaKycVerifyWithPhilsysFragment6.G1()).e, ((N5.A0) mayaKycVerifyWithPhilsysFragment6.G1()).f3541d);
                        }
                        break;
                }
                return Unit.f18162a;
            }
        });
        final int i18 = 6;
        Ke.b.b(((A0) G1()).f3542g, new Function0(this) { // from class: M8.X2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaKycVerifyWithPhilsysFragment f3251b;

            {
                this.f3251b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i18) {
                    case 0:
                        MayaKycVerifyWithPhilsysFragment mayaKycVerifyWithPhilsysFragment = this.f3251b;
                        if (((N5.A0) mayaKycVerifyWithPhilsysFragment.G1()).f3543k.isEnabled()) {
                            AppCompatCheckBox checkboxMiddleName = ((N5.A0) mayaKycVerifyWithPhilsysFragment.G1()).f3540b;
                            kotlin.jvm.internal.j.f(checkboxMiddleName, "checkboxMiddleName");
                            checkboxMiddleName.setVisibility(0);
                        }
                        break;
                    case 1:
                        MayaKycVerifyWithPhilsysFragment mayaKycVerifyWithPhilsysFragment2 = this.f3251b;
                        if (!((N5.A0) mayaKycVerifyWithPhilsysFragment2.G1()).f3540b.isChecked()) {
                            AppCompatCheckBox checkboxMiddleName2 = ((N5.A0) mayaKycVerifyWithPhilsysFragment2.G1()).f3540b;
                            kotlin.jvm.internal.j.f(checkboxMiddleName2, "checkboxMiddleName");
                            checkboxMiddleName2.setVisibility(8);
                        }
                        if (((N5.A0) mayaKycVerifyWithPhilsysFragment2.G1()).f3540b.isChecked()) {
                            ((N5.A0) mayaKycVerifyWithPhilsysFragment2.G1()).f3540b.setChecked(false);
                        }
                        break;
                    case 2:
                        ((D8.W) this.f3251b.K1()).k();
                        break;
                    case 3:
                        MayaKycVerifyWithPhilsysFragment mayaKycVerifyWithPhilsysFragment3 = (MayaKycVerifyWithPhilsysFragment) ((K8.Q) ((D8.W) this.f3251b.K1()).c.get());
                        mayaKycVerifyWithPhilsysFragment3.getClass();
                        ActionOnlyNavDirections actionOnlyNavDirections = new ActionOnlyNavDirections(R.id.action_maya_kyc_verify_with_philsys_fragment_to_maya_kyc_face_authentication_flow);
                        T2.Q(mayaKycVerifyWithPhilsysFragment3, ((Button) ((N5.A0) mayaKycVerifyWithPhilsysFragment3.G1()).c.f4087b).getText().toString(), T2.l(mayaKycVerifyWithPhilsysFragment3, actionOnlyNavDirections).toString(), null, 12);
                        ConstraintLayout constraintLayout = ((N5.A0) mayaKycVerifyWithPhilsysFragment3.G1()).f3539a;
                        kotlin.jvm.internal.j.f(constraintLayout, "getRoot(...)");
                        E1.c.m(ViewKt.findNavController(constraintLayout), actionOnlyNavDirections);
                        break;
                    case 4:
                        MayaKycVerifyWithPhilsysFragment mayaKycVerifyWithPhilsysFragment4 = (MayaKycVerifyWithPhilsysFragment) ((K8.Q) ((D8.W) this.f3251b.K1()).c.get());
                        ConstraintLayout constraintLayout2 = ((N5.A0) mayaKycVerifyWithPhilsysFragment4.G1()).f3539a;
                        kotlin.jvm.internal.j.f(constraintLayout2, "getRoot(...)");
                        NavController navControllerFindNavController = ViewKt.findNavController(constraintLayout2);
                        ActionOnlyNavDirections actionOnlyNavDirections2 = new ActionOnlyNavDirections(R.id.action_maya_kyc_verify_with_philsys_fragment_to_maya_kyc_submit_id_fragment);
                        T2.Q(mayaKycVerifyWithPhilsysFragment4, ((TextView) ((N5.A0) mayaKycVerifyWithPhilsysFragment4.G1()).c.f4088d).getText().toString(), T2.l(mayaKycVerifyWithPhilsysFragment4, actionOnlyNavDirections2).toString(), null, 12);
                        E1.c.m(navControllerFindNavController, actionOnlyNavDirections2);
                        break;
                    case 5:
                        MayaKycVerifyWithPhilsysFragment mayaKycVerifyWithPhilsysFragment5 = this.f3251b;
                        if (!((RadioButton) ((N5.A0) mayaKycVerifyWithPhilsysFragment5.G1()).f3545n.f11284d.c).isChecked()) {
                            D8.W w6 = (D8.W) mayaKycVerifyWithPhilsysFragment5.K1();
                            LinkedHashMap linkedHashMap = E8.C.f1266a;
                            E8.C.b(D8.U.f1022a, "verify_philsys_option");
                            w6.k();
                            mayaKycVerifyWithPhilsysFragment5.H1();
                            ((N5.A0) mayaKycVerifyWithPhilsysFragment5.G1()).f3545n.setChecked(true);
                            ((N5.A0) mayaKycVerifyWithPhilsysFragment5.G1()).f3546o.setChecked(false);
                            E8.k.c(((N5.A0) mayaKycVerifyWithPhilsysFragment5.G1()).f3541d, ((N5.A0) mayaKycVerifyWithPhilsysFragment5.G1()).e);
                        }
                        break;
                    default:
                        MayaKycVerifyWithPhilsysFragment mayaKycVerifyWithPhilsysFragment6 = this.f3251b;
                        if (!((RadioButton) ((N5.A0) mayaKycVerifyWithPhilsysFragment6.G1()).f3546o.f11284d.c).isChecked()) {
                            D8.W w8 = (D8.W) mayaKycVerifyWithPhilsysFragment6.K1();
                            LinkedHashMap linkedHashMap2 = E8.C.f1266a;
                            E8.C.b(D8.U.f1023b, "verify_philsys_option");
                            w8.k();
                            mayaKycVerifyWithPhilsysFragment6.H1();
                            ((N5.A0) mayaKycVerifyWithPhilsysFragment6.G1()).f3545n.setChecked(false);
                            ((N5.A0) mayaKycVerifyWithPhilsysFragment6.G1()).f3546o.setChecked(true);
                            E8.k.c(((N5.A0) mayaKycVerifyWithPhilsysFragment6.G1()).e, ((N5.A0) mayaKycVerifyWithPhilsysFragment6.G1()).f3541d);
                        }
                        break;
                }
                return Unit.f18162a;
            }
        });
        i.E(this, z.a(MayaKycSingleSelectionBottomSheetDialogFragment.class), new M1(1, this, MayaKycVerifyWithPhilsysFragment.class, "handleSuffixSelectionResult", "handleSuffixSelectionResult(Lcom/paymaya/domain/model/KycSelectionItem;)V", 0, 13));
        ((W) K1()).j();
    }
}
