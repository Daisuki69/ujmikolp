package com.paymaya.mayaui.userprofileupdate.view.fragment.impl;

import E8.p;
import G5.A;
import G5.C0251a;
import Lh.h;
import M8.W2;
import N5.T0;
import O5.a;
import S5.c;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.FragmentActivity;
import cj.C1128n;
import cj.C1132s;
import cj.t;
import com.dynatrace.android.agent.Global;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.utility.H;
import com.paymaya.domain.model.EducationalAttainment;
import com.paymaya.domain.model.Gender;
import com.paymaya.domain.model.MaritalStatus;
import com.paymaya.domain.model.MfaTencentErrorResult;
import com.paymaya.domain.model.ProfileData;
import com.paymaya.domain.model.UpdateProfileFieldType;
import com.paymaya.domain.model.UpdateProfileSelectionItem;
import com.paymaya.domain.model.UpdateProfileSelectionModel;
import com.paymaya.domain.model.UpdateProfileValidationResult;
import com.paymaya.domain.model.User;
import com.paymaya.domain.store.C1293x0;
import com.paymaya.domain.store.G;
import com.paymaya.domain.store.Z0;
import com.paymaya.mayaui.common.view.widget.MayaDropDown;
import com.paymaya.mayaui.common.view.widget.MayaProfileInputLayout;
import com.paymaya.mayaui.userprofileupdate.view.activity.impl.MayaUserProfileUpdateActivity;
import com.paymaya.mayaui.userprofileupdate.view.fragment.base.MayaUpdateProfileBaseFragment;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaUserProfileUpdateFragment;
import dOYHB6.tiZVw8.numX49;
import eb.g;
import h5.ViewOnClickListenerC1540b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;
import o1.AbstractC1955a;
import oc.d;
import oi.C1983a;
import rc.i;
import rc.m;
import sc.AbstractC2250a;
import wc.InterfaceC2394e;
import y5.AbstractC2509a;
import yc.C2519A;
import yc.r;
import yc.s;
import yc.v;
import yc.y;
import yj.e;
import yj.f;
import yj.l;
import yj.q;
import zh.b;
import zj.o;
import zj.z;

/* JADX INFO: loaded from: classes4.dex */
public class MayaUserProfileUpdateFragment extends MayaUpdateProfileBaseFragment<T0> implements InterfaceC2394e {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final List f14261f0 = C1132s.g(3, 3, 3, 3);

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final List f14262g0 = C1132s.g(2, 7, 1);

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static i f14263h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static m f14264i0;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public m f14265Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public UpdateProfileFieldType f14266a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public y f14267b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public ProfileData f14268c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public Button f14269d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public MayaProfileInputLayout f14270e0;

    public MayaUserProfileUpdateFragment() {
        super(v.f21135a);
    }

    public static final void t2(final MayaUserProfileUpdateFragment mayaUserProfileUpdateFragment) {
        Pair pair;
        Pair pair2;
        String strValueOf;
        String str;
        String strK;
        mayaUserProfileUpdateFragment.Y1().requestFocus();
        final int i = 1;
        f fVarH = q.h(q.n(q.n(q.h(q.h(new C1128n(new C2519A(((T0) mayaUserProfileUpdateFragment.G1()).f3923b, mayaUserProfileUpdateFragment, null)), r.f21128d), new yc.m(6)), new yc.m(7)), new Function1(mayaUserProfileUpdateFragment) { // from class: yc.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaUserProfileUpdateFragment f21132b;

            {
                this.f21132b = mayaUserProfileUpdateFragment;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String strM;
                MayaUserProfileUpdateFragment mayaUserProfileUpdateFragment2 = this.f21132b;
                String strTnTj78 = numX49.tnTj78("bt9Pp");
                Pair pair3 = (Pair) obj;
                switch (i) {
                    case 0:
                        List list = MayaUserProfileUpdateFragment.f14261f0;
                        kotlin.jvm.internal.j.g(pair3, strTnTj78);
                        oc.d dVarH2 = mayaUserProfileUpdateFragment2.h2();
                        UpdateProfileFieldType updateProfileFieldType = (UpdateProfileFieldType) pair3.f18161b;
                        Object obj2 = pair3.f18160a;
                        MayaDropDown mayaDropDown = (MayaDropDown) obj2;
                        kotlin.jvm.internal.j.g(mayaDropDown, numX49.tnTj78("bt9Pf"));
                        return new Pair(obj2, ((rc.m) dVarH2).s(updateProfileFieldType, mayaDropDown.getSelectedData()));
                    default:
                        List list2 = MayaUserProfileUpdateFragment.f14261f0;
                        kotlin.jvm.internal.j.g(pair3, strTnTj78);
                        oc.d dVarH22 = mayaUserProfileUpdateFragment2.h2();
                        Object obj3 = pair3.f18161b;
                        UpdateProfileFieldType updateProfileFieldType2 = (UpdateProfileFieldType) obj3;
                        UpdateProfileFieldType updateProfileFieldType3 = UpdateProfileFieldType.TIN;
                        Object obj4 = pair3.f18160a;
                        if (obj3 == updateProfileFieldType3 || obj3 == UpdateProfileFieldType.SSS) {
                            strM = AbstractC1213b.M(numX49.tnTj78("bt9P0"), S1.r.i((MayaProfileInputLayout) obj4), numX49.tnTj78("bt9Pg"));
                        } else {
                            strM = S1.r.i((MayaProfileInputLayout) obj4);
                        }
                        return new Pair(obj4, ((rc.m) dVarH22).t(updateProfileFieldType2, strM));
                }
            }
        }), new yc.m(8));
        if (q.p(fVarH)) {
            fVarH = null;
        }
        final int i4 = 0;
        f fVarH2 = q.h(q.n(q.n(q.h(q.h(new C1128n(new C2519A(((T0) mayaUserProfileUpdateFragment.G1()).f3923b, mayaUserProfileUpdateFragment, null)), r.c), new yc.m(3)), new yc.m(4)), new Function1(mayaUserProfileUpdateFragment) { // from class: yc.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaUserProfileUpdateFragment f21132b;

            {
                this.f21132b = mayaUserProfileUpdateFragment;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String strM;
                MayaUserProfileUpdateFragment mayaUserProfileUpdateFragment2 = this.f21132b;
                String strTnTj78 = numX49.tnTj78("bt9Pp");
                Pair pair3 = (Pair) obj;
                switch (i4) {
                    case 0:
                        List list = MayaUserProfileUpdateFragment.f14261f0;
                        kotlin.jvm.internal.j.g(pair3, strTnTj78);
                        oc.d dVarH2 = mayaUserProfileUpdateFragment2.h2();
                        UpdateProfileFieldType updateProfileFieldType = (UpdateProfileFieldType) pair3.f18161b;
                        Object obj2 = pair3.f18160a;
                        MayaDropDown mayaDropDown = (MayaDropDown) obj2;
                        kotlin.jvm.internal.j.g(mayaDropDown, numX49.tnTj78("bt9Pf"));
                        return new Pair(obj2, ((rc.m) dVarH2).s(updateProfileFieldType, mayaDropDown.getSelectedData()));
                    default:
                        List list2 = MayaUserProfileUpdateFragment.f14261f0;
                        kotlin.jvm.internal.j.g(pair3, strTnTj78);
                        oc.d dVarH22 = mayaUserProfileUpdateFragment2.h2();
                        Object obj3 = pair3.f18161b;
                        UpdateProfileFieldType updateProfileFieldType2 = (UpdateProfileFieldType) obj3;
                        UpdateProfileFieldType updateProfileFieldType3 = UpdateProfileFieldType.TIN;
                        Object obj4 = pair3.f18160a;
                        if (obj3 == updateProfileFieldType3 || obj3 == UpdateProfileFieldType.SSS) {
                            strM = AbstractC1213b.M(numX49.tnTj78("bt9P0"), S1.r.i((MayaProfileInputLayout) obj4), numX49.tnTj78("bt9Pg"));
                        } else {
                            strM = S1.r.i((MayaProfileInputLayout) obj4);
                        }
                        return new Pair(obj4, ((rc.m) dVarH22).t(updateProfileFieldType2, strM));
                }
            }
        }), new yc.m(5));
        if (q.p(fVarH2)) {
            fVarH2 = null;
        }
        if (fVarH2 != null) {
            e eVar = new e(fVarH2);
            while (eVar.hasNext()) {
                Pair pair3 = (Pair) eVar.next();
                AbstractC2250a.d((MayaDropDown) pair3.f18160a, (UpdateProfileValidationResult) pair3.f18161b);
            }
        }
        if (fVarH != null) {
            e eVar2 = new e(fVarH);
            while (eVar2.hasNext()) {
                Pair pair4 = (Pair) eVar2.next();
                AbstractC2250a.c((MayaProfileInputLayout) pair4.f18160a, (UpdateProfileValidationResult) pair4.f18161b, new n0.e(2));
            }
        }
        if (fVarH == null && fVarH2 == null) {
            d dVarH2 = mayaUserProfileUpdateFragment.h2();
            String strValueOf2 = String.valueOf(mayaUserProfileUpdateFragment.d2().getInputEditText().getText());
            String strValueOf3 = String.valueOf(mayaUserProfileUpdateFragment.f2().getInputEditText().getText());
            String strValueOf4 = String.valueOf(mayaUserProfileUpdateFragment.e2().getInputEditText().getText());
            m mVar = (m) dVarH2;
            User userA = mVar.h.a();
            if (z.o(userA.mFirstName(), strValueOf2, true) && z.o(userA.mLastName(), strValueOf4, true) && (!mVar.f19920r || z.o(userA.mMiddleName(), strValueOf3, true))) {
                mVar.f19924v = true;
                InterfaceC2394e interfaceC2394e = (InterfaceC2394e) mVar.c.get();
                boolean z4 = mVar.f19920r;
                MayaUserProfileUpdateFragment mayaUserProfileUpdateFragment2 = (MayaUserProfileUpdateFragment) interfaceC2394e;
                mayaUserProfileUpdateFragment2.K1(mayaUserProfileUpdateFragment2.d2());
                MayaProfileInputLayout mayaProfileInputLayoutD2 = mayaUserProfileUpdateFragment2.d2();
                String string = mayaUserProfileUpdateFragment2.getString(R.string.maya_update_profile_invalid_name);
                j.f(string, "getString(...)");
                AbstractC2250a.i(mayaProfileInputLayoutD2, string);
                if (z4) {
                    MayaProfileInputLayout mayaProfileInputLayoutF2 = mayaUserProfileUpdateFragment2.f2();
                    String string2 = mayaUserProfileUpdateFragment2.getString(R.string.maya_update_profile_invalid_name);
                    j.f(string2, "getString(...)");
                    AbstractC2250a.i(mayaProfileInputLayoutF2, string2);
                }
                MayaProfileInputLayout mayaProfileInputLayoutE2 = mayaUserProfileUpdateFragment2.e2();
                String string3 = mayaUserProfileUpdateFragment2.getString(R.string.maya_update_profile_invalid_name);
                j.f(string3, "getString(...)");
                AbstractC2250a.i(mayaProfileInputLayoutE2, string3);
            } else {
                mVar.f19924v = false;
                MayaUserProfileUpdateFragment mayaUserProfileUpdateFragment3 = (MayaUserProfileUpdateFragment) ((InterfaceC2394e) mVar.c.get());
                MayaProfileInputLayout mayaProfileInputLayout = mayaUserProfileUpdateFragment3.f14270e0;
                if (mayaProfileInputLayout == null) {
                    j.n("mInputTin");
                    throw null;
                }
                Editable text = mayaProfileInputLayout.getInputEditText().getText();
                String strF = text != null ? new o(Global.HYPHEN).f("", text) : null;
                Editable text2 = mayaUserProfileUpdateFragment3.c2().getInputEditText().getText();
                String strF2 = text2 != null ? new o(Global.HYPHEN).f("", text2) : null;
                String strValueOf5 = String.valueOf(mayaUserProfileUpdateFragment3.a2().getInputEditText().getText());
                Editable text3 = mayaUserProfileUpdateFragment3.X1().getInputEditText().getText();
                if (text3 == null || text3.length() != 8) {
                    Editable text4 = mayaUserProfileUpdateFragment3.X1().getInputEditText().getText();
                    if (text4 == null || text4.length() != 12) {
                        strValueOf = null;
                        str = null;
                    } else {
                        strValueOf = null;
                        str = "+" + ((Object) mayaUserProfileUpdateFragment3.X1().getInputEditText().getText());
                    }
                } else {
                    str = null;
                    strValueOf = String.valueOf(mayaUserProfileUpdateFragment3.X1().getInputEditText().getText());
                }
                Object selectedData = mayaUserProfileUpdateFragment3.b2().getSelectedData();
                j.e(selectedData, "null cannot be cast to non-null type com.paymaya.domain.model.Gender");
                String code = ((Gender) selectedData).getCode();
                Object selectedData2 = mayaUserProfileUpdateFragment3.Y1().getSelectedData();
                j.e(selectedData2, "null cannot be cast to non-null type com.paymaya.domain.model.MaritalStatus");
                String code2 = ((MaritalStatus) selectedData2).getCode();
                String strValueOf6 = String.valueOf(mayaUserProfileUpdateFragment3.d2().getInputEditText().getText());
                String strValueOf7 = String.valueOf(mayaUserProfileUpdateFragment3.e2().getInputEditText().getText());
                String strValueOf8 = String.valueOf(mayaUserProfileUpdateFragment3.f2().getInputEditText().getText());
                Boolean boolValueOf = Boolean.valueOf(mayaUserProfileUpdateFragment3.g2().isChecked());
                Object selectedData3 = mayaUserProfileUpdateFragment3.Z1().getSelectedData();
                j.e(selectedData3, "null cannot be cast to non-null type com.paymaya.domain.model.EducationalAttainment");
                mayaUserProfileUpdateFragment3.f14268c0 = AbstractC1955a.c(strValueOf, str, strValueOf5, code, code2, strF, strValueOf6, strValueOf7, strValueOf8, boolValueOf, ((EducationalAttainment) selectedData3).getCode(), strF2);
                d dVarH22 = mayaUserProfileUpdateFragment3.h2();
                ProfileData profileData = mayaUserProfileUpdateFragment3.f14268c0;
                m mVar2 = (m) dVarH22;
                ((MayaBaseFragment) ((InterfaceC2394e) mVar2.c.get())).E1();
                if (profileData != null) {
                    strK = new com.google.gson.j().k(profileData);
                    j.f(strK, "toJson(...)");
                } else {
                    strK = null;
                }
                new Lh.d(new Lh.d(new h(mVar2.f19913g.x(String.valueOf(strK)), b.a(), 0), new C1983a(mVar2, 8), 2), new o6.f(mVar2, 6), 0).e();
            }
        }
        MayaDropDown mayaDropDown = (fVarH2 == null || (pair2 = (Pair) q.j(fVarH2)) == null) ? null : (MayaDropDown) pair2.f18160a;
        MayaProfileInputLayout mayaProfileInputLayout2 = (fVarH == null || (pair = (Pair) q.j(fVarH)) == null) ? null : (MayaProfileInputLayout) pair.f18160a;
        if (mayaProfileInputLayout2 != null && mayaDropDown == null) {
            mayaUserProfileUpdateFragment.K1(mayaProfileInputLayout2);
        }
        if (mayaProfileInputLayout2 == null && mayaDropDown != null) {
            mayaUserProfileUpdateFragment.K1(mayaDropDown);
        }
        if (fVarH == null && fVarH2 == null) {
            return;
        }
        yj.j jVarA = l.a(new C2519A(((T0) mayaUserProfileUpdateFragment.G1()).f3923b, mayaUserProfileUpdateFragment, null));
        while (jVarA.hasNext()) {
            View view = (View) jVarA.next();
            if ((mayaDropDown != null && view.getId() == mayaDropDown.getId()) || (mayaProfileInputLayout2 != null && view.getId() == mayaProfileInputLayout2.getId())) {
                mayaUserProfileUpdateFragment.K1(view);
                return;
            }
        }
    }

    @Override // com.paymaya.mayaui.userprofileupdate.view.fragment.base.MayaUpdateProfileBaseFragment
    public final ScrollView N1() {
        ScrollView scrollableNestedScrollView = ((T0) G1()).f3933s;
        j.f(scrollableNestedScrollView, "scrollableNestedScrollView");
        return scrollableNestedScrollView;
    }

    @Override // com.paymaya.mayaui.userprofileupdate.view.fragment.base.MayaUpdateProfileBaseFragment
    public final String O1() {
        String string;
        Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("SOURCE_SCREEN")) == null) ? "" : string;
    }

    @Override // com.paymaya.mayaui.userprofileupdate.view.fragment.base.MayaUpdateProfileBaseFragment
    public final void P1() {
        C1219h c1219h = new C1219h();
        HashMap map = c1219h.j;
        c1219h.p(EnumC1215d.PROFILE);
        c1219h.r(EnumC1216e.CREDIT_DETAILS);
        c1219h.n(17);
        c1219h.t(EnumC1217f.BACK);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        map.put("referrer", O1());
        c1219h.i();
        if (((m) h2()).f19923u == null) {
            EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
            map.put("destination", "");
            o1().c(getActivity(), c1219h);
            requireActivity().setResult(MfaTencentErrorResult.TENCENT_ERROR_USER_STOPS);
            requireActivity().finish();
            return;
        }
        EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
        String str = ((m) h2()).f19923u;
        if (str == null) {
            str = "https://paymaya.com/app/";
        }
        map.put("destination", str);
        o1().c(getActivity(), c1219h);
        String str2 = ((m) h2()).f19923u;
        String str3 = str2 != null ? str2 : "https://paymaya.com/app/";
        y yVar = this.f14267b0;
        if (yVar != null) {
            MayaUserProfileUpdateActivity mayaUserProfileUpdateActivity = (MayaUserProfileUpdateActivity) yVar;
            mayaUserProfileUpdateActivity.n1();
            B5.i.k(mayaUserProfileUpdateActivity, str3);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.CREDIT_DETAILS;
    }

    public final MayaProfileInputLayout X1() {
        MayaProfileInputLayout inputAlternateContact = ((T0) G1()).f3924d;
        j.f(inputAlternateContact, "inputAlternateContact");
        return inputAlternateContact;
    }

    public final MayaDropDown Y1() {
        MayaDropDown mayaDropdownCivilStatus = ((T0) G1()).f3927l;
        j.f(mayaDropdownCivilStatus, "mayaDropdownCivilStatus");
        return mayaDropdownCivilStatus;
    }

    public final MayaDropDown Z1() {
        MayaDropDown mayaDropdownEducationalAttainment = ((T0) G1()).m;
        j.f(mayaDropdownEducationalAttainment, "mayaDropdownEducationalAttainment");
        return mayaDropdownEducationalAttainment;
    }

    public final MayaProfileInputLayout a2() {
        MayaProfileInputLayout inputEmailAddress = ((T0) G1()).e;
        j.f(inputEmailAddress, "inputEmailAddress");
        return inputEmailAddress;
    }

    public final MayaDropDown b2() {
        MayaDropDown mayaDropdownGender = ((T0) G1()).f3928n;
        j.f(mayaDropdownGender, "mayaDropdownGender");
        return mayaDropdownGender;
    }

    public final MayaProfileInputLayout c2() {
        MayaProfileInputLayout inputSss = ((T0) G1()).i;
        j.f(inputSss, "inputSss");
        return inputSss;
    }

    public final MayaProfileInputLayout d2() {
        MayaProfileInputLayout inputMothersMaidenFirstName = ((T0) G1()).f;
        j.f(inputMothersMaidenFirstName, "inputMothersMaidenFirstName");
        return inputMothersMaidenFirstName;
    }

    public final MayaProfileInputLayout e2() {
        MayaProfileInputLayout inputMothersMaidenLastName = ((T0) G1()).f3925g;
        j.f(inputMothersMaidenLastName, "inputMothersMaidenLastName");
        return inputMothersMaidenLastName;
    }

    public final MayaProfileInputLayout f2() {
        MayaProfileInputLayout inputMothersMaidenMiddleName = ((T0) G1()).h;
        j.f(inputMothersMaidenMiddleName, "inputMothersMaidenMiddleName");
        return inputMothersMaidenMiddleName;
    }

    public final AppCompatCheckBox g2() {
        AppCompatCheckBox mothersMaidenMiddleNameCheckbox = ((T0) G1()).f3931q;
        j.f(mothersMaidenMiddleNameCheckbox, "mothersMaidenMiddleNameCheckbox");
        return mothersMaidenMiddleNameCheckbox;
    }

    public final d h2() {
        m mVar = this.f14265Z;
        if (mVar != null) {
            return mVar;
        }
        j.n("mUserProfileUpdateFragmentPresenter");
        throw null;
    }

    public final Button i2() {
        Button validateIdentificationButton = ((T0) G1()).f3937w;
        j.f(validateIdentificationButton, "validateIdentificationButton");
        return validateIdentificationButton;
    }

    public final void j2(MayaProfileInputLayout mayaProfileInputLayout, UpdateProfileFieldType updateProfileFieldType, Function2 function2, String str) {
        String strM = AbstractC1213b.M(Global.HYPHEN, str, "");
        i2().setEnabled(strM.length() > 0 && (((UpdateProfileValidationResult) function2.invoke(updateProfileFieldType, strM)) instanceof UpdateProfileValidationResult.Success));
        k2(mayaProfileInputLayout, updateProfileFieldType, function2, strM);
    }

    public final void k2(final MayaProfileInputLayout mayaProfileInputLayout, UpdateProfileFieldType updateProfileFieldType, Function2 function2, String str) {
        int i = yc.z.f21140a[updateProfileFieldType.ordinal()];
        if (i == 4 || i == 5) {
            UpdateProfileValidationResult updateProfileValidationResult = (UpdateProfileValidationResult) function2.invoke(updateProfileFieldType, str);
            final int i4 = 0;
            AbstractC2250a.c(mayaProfileInputLayout, updateProfileValidationResult, new Function0(this) { // from class: yc.u

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ MayaUserProfileUpdateFragment f21134b;

                {
                    this.f21134b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    MayaProfileInputLayout mayaProfileInputLayout2 = mayaProfileInputLayout;
                    MayaUserProfileUpdateFragment mayaUserProfileUpdateFragment = this.f21134b;
                    switch (i4) {
                        case 0:
                            List list = MayaUserProfileUpdateFragment.f14261f0;
                            mayaUserProfileUpdateFragment.R1(mayaProfileInputLayout2);
                            break;
                        case 1:
                            List list2 = MayaUserProfileUpdateFragment.f14261f0;
                            mayaUserProfileUpdateFragment.R1(mayaProfileInputLayout2);
                            break;
                        default:
                            List list3 = MayaUserProfileUpdateFragment.f14261f0;
                            mayaUserProfileUpdateFragment.R1(mayaProfileInputLayout2);
                            break;
                    }
                    return Unit.f18162a;
                }
            });
        } else {
            if (i != 6) {
                UpdateProfileValidationResult updateProfileValidationResult2 = (UpdateProfileValidationResult) function2.invoke(updateProfileFieldType, str);
                final int i6 = 2;
                AbstractC2250a.c(mayaProfileInputLayout, updateProfileValidationResult2, new Function0(this) { // from class: yc.u

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ MayaUserProfileUpdateFragment f21134b;

                    {
                        this.f21134b = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        MayaProfileInputLayout mayaProfileInputLayout2 = mayaProfileInputLayout;
                        MayaUserProfileUpdateFragment mayaUserProfileUpdateFragment = this.f21134b;
                        switch (i6) {
                            case 0:
                                List list = MayaUserProfileUpdateFragment.f14261f0;
                                mayaUserProfileUpdateFragment.R1(mayaProfileInputLayout2);
                                break;
                            case 1:
                                List list2 = MayaUserProfileUpdateFragment.f14261f0;
                                mayaUserProfileUpdateFragment.R1(mayaProfileInputLayout2);
                                break;
                            default:
                                List list3 = MayaUserProfileUpdateFragment.f14261f0;
                                mayaUserProfileUpdateFragment.R1(mayaProfileInputLayout2);
                                break;
                        }
                        return Unit.f18162a;
                    }
                });
                return;
            }
            i iVar = f14263h0;
            if (iVar != null) {
                iVar.r(str.length());
            }
            m mVar = f14264i0;
            if (mVar != null) {
                mVar.r(str.length());
            }
            UpdateProfileValidationResult updateProfileValidationResult3 = (UpdateProfileValidationResult) function2.invoke(updateProfileFieldType, str);
            final int i10 = 1;
            AbstractC2250a.c(mayaProfileInputLayout, updateProfileValidationResult3, new Function0(this) { // from class: yc.u

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ MayaUserProfileUpdateFragment f21134b;

                {
                    this.f21134b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    MayaProfileInputLayout mayaProfileInputLayout2 = mayaProfileInputLayout;
                    MayaUserProfileUpdateFragment mayaUserProfileUpdateFragment = this.f21134b;
                    switch (i10) {
                        case 0:
                            List list = MayaUserProfileUpdateFragment.f14261f0;
                            mayaUserProfileUpdateFragment.R1(mayaProfileInputLayout2);
                            break;
                        case 1:
                            List list2 = MayaUserProfileUpdateFragment.f14261f0;
                            mayaUserProfileUpdateFragment.R1(mayaProfileInputLayout2);
                            break;
                        default:
                            List list3 = MayaUserProfileUpdateFragment.f14261f0;
                            mayaUserProfileUpdateFragment.R1(mayaProfileInputLayout2);
                            break;
                    }
                    return Unit.f18162a;
                }
            });
        }
    }

    public final void l2(String str, List list) {
        Integer numValueOf = Integer.valueOf(R.string.maya_update_profile_civil_status_dropdown_header);
        List list2 = list;
        ArrayList arrayList = new ArrayList(t.l(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(UpdateProfileSelectionItem.Companion.toSelectionItem((MaritalStatus) it.next()));
        }
        UpdateProfileSelectionModel updateProfileSelectionModel = new UpdateProfileSelectionModel(numValueOf, str, arrayList);
        this.f14266a0 = UpdateProfileFieldType.CIVIL_STATUS;
        y yVar = this.f14267b0;
        if (yVar != null) {
            ((MayaUserProfileUpdateActivity) yVar).X1(updateProfileSelectionModel);
        }
        if (!j.b(Y1().getDisplayText().getText(), getString(R.string.maya_update_profile_civil_status_dropdown_hint))) {
            CharSequence text = Y1().getDisplayText().getText();
            j.f(text, "getText(...)");
            if (text.length() != 0) {
                return;
            }
        }
        CharSequence text2 = Y1().getFloatingLabel().getText();
        MayaDropDown mayaDropDownY1 = Y1();
        String string = getString(R.string.maya_update_profile_required_field, text2);
        j.f(string, "getString(...)");
        AbstractC2250a.h(mayaDropDownY1, string);
    }

    public final void m2(String str, List list) {
        Integer numValueOf = Integer.valueOf(R.string.maya_update_profile_educational_attainment_hint);
        List list2 = list;
        ArrayList arrayList = new ArrayList(t.l(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(UpdateProfileSelectionItem.Companion.toSelectionItem((EducationalAttainment) it.next()));
        }
        UpdateProfileSelectionModel updateProfileSelectionModel = new UpdateProfileSelectionModel(numValueOf, str, arrayList);
        this.f14266a0 = UpdateProfileFieldType.EDUCATIONAL_ATTAINMENT;
        y yVar = this.f14267b0;
        if (yVar != null) {
            ((MayaUserProfileUpdateActivity) yVar).X1(updateProfileSelectionModel);
        }
        if (!j.b(Z1().getDisplayText().getText(), getString(R.string.maya_update_profile_educational_attainment_hint))) {
            CharSequence text = Z1().getDisplayText().getText();
            j.f(text, "getText(...)");
            if (text.length() != 0) {
                return;
            }
        }
        CharSequence text2 = Z1().getFloatingLabel().getText();
        MayaDropDown mayaDropDownZ1 = Z1();
        String string = getString(R.string.maya_update_profile_required_field, text2);
        j.f(string, "getString(...)");
        AbstractC2250a.h(mayaDropDownZ1, string);
    }

    public final void n2(String str, List list) {
        Integer numValueOf = Integer.valueOf(R.string.maya_update_profile_gender_dropdown_header);
        List list2 = list;
        ArrayList arrayList = new ArrayList(t.l(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(UpdateProfileSelectionItem.Companion.toSelectionItem((Gender) it.next()));
        }
        UpdateProfileSelectionModel updateProfileSelectionModel = new UpdateProfileSelectionModel(numValueOf, str, arrayList);
        this.f14266a0 = UpdateProfileFieldType.GENDER;
        y yVar = this.f14267b0;
        if (yVar != null) {
            ((MayaUserProfileUpdateActivity) yVar).X1(updateProfileSelectionModel);
        }
        if (!j.b(b2().getDisplayText().getText(), getString(R.string.maya_update_profile_gender_dropdown_hint))) {
            CharSequence text = b2().getDisplayText().getText();
            j.f(text, "getText(...)");
            if (text.length() != 0) {
                return;
            }
        }
        CharSequence text2 = b2().getFloatingLabel().getText();
        MayaDropDown mayaDropDownB2 = b2();
        String string = getString(R.string.maya_update_profile_required_field, text2);
        j.f(string, "getString(...)");
        AbstractC2250a.h(mayaDropDownB2, string);
    }

    public final void o2(String str) {
        C1220i c1220iO1 = o1();
        FragmentActivity activity = getActivity();
        C1219h c1219h = new C1219h();
        HashMap map = c1219h.j;
        c1219h.p(EnumC1215d.PROFILE);
        c1219h.r(EnumC1216e.CREDIT_DETAILS);
        c1219h.n(17);
        c1219h.t(EnumC1217f.NEXT);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        map.put("destination", str);
        map.put("referrer", O1());
        c1219h.i();
        c1220iO1.c(activity, c1219h);
    }

    @Override // com.paymaya.mayaui.userprofileupdate.view.fragment.base.MayaUpdateProfileBaseFragment, com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        KeyEventDispatcher.Component activity = getActivity();
        j.e(activity, "null cannot be cast to non-null type com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaUserProfileUpdateFragment.MayaUserProfileUpdateFragmentListener");
        this.f14267b0 = (y) activity;
        a aVar = W4.a.e().B().f4755a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        Y.e eVarW = aVar.W();
        Z0 z0X = aVar.X();
        C1293x0 c1293x0J = aVar.J();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        c flagConfigurationService = (c) aVar.f4724k.get();
        j.g(preference, "preference");
        j.g(flagConfigurationService, "flagConfigurationService");
        this.f14265Z = new m(eVarW, z0X, c1293x0J, preference, flagConfigurationService);
        this.f10338R = true;
        ((AbstractC2509a) h2()).h(this);
        if (bundle == null) {
            ((m) h2()).j();
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        f14264i0 = null;
        ((m) h2()).j.m0("");
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ((m) h2()).o();
        C1220i c1220iO1 = o1();
        FragmentActivity activity = getActivity();
        C1219h c1219hD = C1219h.d(EnumC1215d.PROFILE);
        c1219hD.r(EnumC1216e.CREDIT_DETAILS);
        c1219hD.n(2);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        String str = ((m) h2()).f19923u;
        HashMap map = c1219hD.j;
        map.put("origin", str);
        map.put("referrer", O1());
        c1219hD.i();
        c1220iO1.c(activity, c1219hD);
    }

    @Override // com.paymaya.mayaui.userprofileupdate.view.fragment.base.MayaUpdateProfileBaseFragment, com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i = 6;
        int i4 = 8;
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        m mVar = (m) h2();
        if (c.b(mVar.f19914k, A5.b.f112j1)) {
            MayaUserProfileUpdateFragment mayaUserProfileUpdateFragment = (MayaUserProfileUpdateFragment) ((InterfaceC2394e) mVar.c.get());
            mayaUserProfileUpdateFragment.f14270e0 = ((T0) mayaUserProfileUpdateFragment.G1()).j;
            ((T0) mayaUserProfileUpdateFragment.G1()).f3926k.setVisibility(8);
            ((T0) mayaUserProfileUpdateFragment.G1()).c.setVisibility(0);
            ((T0) mayaUserProfileUpdateFragment.G1()).f3936v.setVisibility(0);
            MayaUserProfileUpdateFragment mayaUserProfileUpdateFragment2 = (MayaUserProfileUpdateFragment) ((InterfaceC2394e) mVar.c.get());
            TextView textView = ((T0) mayaUserProfileUpdateFragment2.G1()).f3935u;
            MayaProfileInputLayout mayaProfileInputLayout = mayaUserProfileUpdateFragment2.f14270e0;
            if (mayaProfileInputLayout == null) {
                j.n("mInputTin");
                throw null;
            }
            String string = mayaUserProfileUpdateFragment2.getString(R.string.maya_update_enter_tin_label);
            j.f(string, "getString(...)");
            textView.setOnClickListener(new ViewOnClickListenerC1540b(mayaUserProfileUpdateFragment2, mayaProfileInputLayout, textView, string, 1));
            mayaUserProfileUpdateFragment2.i2().setOnClickListener(new H(i, mayaUserProfileUpdateFragment2, mayaProfileInputLayout));
            MayaProfileInputLayout mayaProfileInputLayout2 = mayaUserProfileUpdateFragment2.f14270e0;
            if (mayaProfileInputLayout2 == null) {
                j.n("mInputTin");
                throw null;
            }
            TextView textView2 = ((T0) mayaUserProfileUpdateFragment2.G1()).f3935u;
            String string2 = mayaUserProfileUpdateFragment2.getString(R.string.maya_update_enter_tin_label);
            j.f(string2, "getString(...)");
            mayaProfileInputLayout2.setOnCloseIconClickListener(new p(mayaUserProfileUpdateFragment2, mayaProfileInputLayout2, textView2, mayaProfileInputLayout2, 10));
            mayaProfileInputLayout2.setOnMayaProfileInputFocusChangeListener(new G(1, mayaUserProfileUpdateFragment2, string2, mayaProfileInputLayout2));
            TextView textView3 = ((T0) mayaUserProfileUpdateFragment2.G1()).f3934t;
            MayaProfileInputLayout mayaProfileInputLayoutC2 = mayaUserProfileUpdateFragment2.c2();
            String string3 = mayaUserProfileUpdateFragment2.getString(R.string.maya_update_enter_sss_number_label);
            j.f(string3, "getString(...)");
            textView3.setOnClickListener(new ViewOnClickListenerC1540b(mayaUserProfileUpdateFragment2, mayaProfileInputLayoutC2, textView3, string3, 1));
            mayaUserProfileUpdateFragment2.i2().setOnClickListener(new H(i, mayaUserProfileUpdateFragment2, mayaProfileInputLayoutC2));
            MayaProfileInputLayout mayaProfileInputLayoutC22 = mayaUserProfileUpdateFragment2.c2();
            TextView textView4 = ((T0) mayaUserProfileUpdateFragment2.G1()).f3934t;
            String string4 = mayaUserProfileUpdateFragment2.getString(R.string.maya_update_enter_sss_number_label);
            j.f(string4, "getString(...)");
            mayaProfileInputLayoutC22.setOnCloseIconClickListener(new p(mayaUserProfileUpdateFragment2, mayaProfileInputLayoutC22, textView4, mayaProfileInputLayoutC22, 10));
            mayaProfileInputLayoutC22.setOnMayaProfileInputFocusChangeListener(new G(1, mayaUserProfileUpdateFragment2, string4, mayaProfileInputLayoutC22));
            mayaUserProfileUpdateFragment2.v2(mayaUserProfileUpdateFragment2.c2(), UpdateProfileFieldType.SSS, new s(2, mayaUserProfileUpdateFragment2.h2(), d.class, "validateField", "validateField(Lcom/paymaya/domain/model/UpdateProfileFieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/UpdateProfileValidationResult;", 0, 7));
            mayaUserProfileUpdateFragment2.c2().getInputEditText().addTextChangedListener(new C0251a(mayaUserProfileUpdateFragment2.c2().getInputEditText(), f14262g0));
            Iterator it = C1132s.g(mayaUserProfileUpdateFragment2.a2(), mayaUserProfileUpdateFragment2.X1(), mayaUserProfileUpdateFragment2.d2(), mayaUserProfileUpdateFragment2.f2(), mayaUserProfileUpdateFragment2.e2()).iterator();
            while (it.hasNext()) {
                ((MayaProfileInputLayout) it.next()).setOnMayaProfileInputFocusChangeListener(new Ag.j(mayaUserProfileUpdateFragment2, 24));
            }
        } else {
            MayaUserProfileUpdateFragment mayaUserProfileUpdateFragment3 = (MayaUserProfileUpdateFragment) ((InterfaceC2394e) mVar.c.get());
            mayaUserProfileUpdateFragment3.f14270e0 = ((T0) mayaUserProfileUpdateFragment3.G1()).f3926k;
            ((T0) mayaUserProfileUpdateFragment3.G1()).f3926k.setVisibility(0);
            ((T0) mayaUserProfileUpdateFragment3.G1()).c.setVisibility(8);
            ((T0) mayaUserProfileUpdateFragment3.G1()).f3936v.setVisibility(8);
            ((T0) mayaUserProfileUpdateFragment3.G1()).j.setVisibility(8);
            ((T0) mayaUserProfileUpdateFragment3.G1()).i.setVisibility(8);
        }
        Button button = ((T0) G1()).f3932r;
        this.f14269d0 = button;
        button.setOnClickListener(new qf.d(this, 29));
        S1.r.g(b2(), UpdateProfileFieldType.GENDER, new g(1, h2(), d.class, "onGenderClicked", "onGenderClicked(Ljava/lang/Object;)V", 0, 29), new s(2, h2(), d.class, "validateDropDownField", "validateDropDownField(Lcom/paymaya/domain/model/UpdateProfileFieldType;Ljava/lang/Object;)Lcom/paymaya/domain/model/UpdateProfileValidationResult;", 0, 5));
        S1.r.g(Y1(), UpdateProfileFieldType.CIVIL_STATUS, new g(1, h2(), d.class, "onCivilStatusClicked", "onCivilStatusClicked(Ljava/lang/Object;)V", 0, 27), new s(2, h2(), d.class, "validateDropDownField", "validateDropDownField(Lcom/paymaya/domain/model/UpdateProfileFieldType;Ljava/lang/Object;)Lcom/paymaya/domain/model/UpdateProfileValidationResult;", 0, 2));
        S1.r.g(Z1(), UpdateProfileFieldType.EDUCATIONAL_ATTAINMENT, new g(1, h2(), d.class, "onEducationAttainmentClicked", "onEducationAttainmentClicked(Ljava/lang/Object;)V", 0, 28), new s(2, h2(), d.class, "validateDropDownField", "validateDropDownField(Lcom/paymaya/domain/model/UpdateProfileFieldType;Ljava/lang/Object;)Lcom/paymaya/domain/model/UpdateProfileValidationResult;", 0, 3));
        v2(a2(), UpdateProfileFieldType.EMAIL_ADDRESS, new s(2, h2(), d.class, "validateField", "validateField(Lcom/paymaya/domain/model/UpdateProfileFieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/UpdateProfileValidationResult;", 0, 4));
        MayaProfileInputLayout mayaProfileInputLayout3 = this.f14270e0;
        if (mayaProfileInputLayout3 == null) {
            j.n("mInputTin");
            throw null;
        }
        v2(mayaProfileInputLayout3, UpdateProfileFieldType.TIN, new s(2, h2(), d.class, "validateField", "validateField(Lcom/paymaya/domain/model/UpdateProfileFieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/UpdateProfileValidationResult;", 0, 8));
        v2(X1(), UpdateProfileFieldType.ALTERNATE_CONTACT, new s(2, h2(), d.class, "validateField", "validateField(Lcom/paymaya/domain/model/UpdateProfileFieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/UpdateProfileValidationResult;", 0, 1));
        MayaProfileInputLayout mayaProfileInputLayout4 = this.f14270e0;
        if (mayaProfileInputLayout4 == null) {
            j.n("mInputTin");
            throw null;
        }
        AppCompatEditText inputEditText = mayaProfileInputLayout4.getInputEditText();
        MayaProfileInputLayout mayaProfileInputLayout5 = this.f14270e0;
        if (mayaProfileInputLayout5 == null) {
            j.n("mInputTin");
            throw null;
        }
        inputEditText.addTextChangedListener(new C0251a(mayaProfileInputLayout5.getInputEditText(), f14261f0));
        v2(d2(), UpdateProfileFieldType.FIRST_NAME, new s(2, h2(), d.class, "validateField", "validateField(Lcom/paymaya/domain/model/UpdateProfileFieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/UpdateProfileValidationResult;", 0, 9));
        v2(f2(), UpdateProfileFieldType.MIDDLE_NAME, new s(2, h2(), d.class, "validateField", "validateField(Lcom/paymaya/domain/model/UpdateProfileFieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/UpdateProfileValidationResult;", 0, 11));
        v2(e2(), UpdateProfileFieldType.LAST_NAME, new s(2, h2(), d.class, "validateField", "validateField(Lcom/paymaya/domain/model/UpdateProfileFieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/UpdateProfileValidationResult;", 0, 10));
        g2().setOnCheckedChangeListener(new W2(this, i4));
        Xh.i.E(this, kotlin.jvm.internal.z.a(MayaProfileUpdateSingleSelectionBottomSheetDialogFragment.class), new g(1, this, MayaUserProfileUpdateFragment.class, "handleSingleSelectionResult", "handleSingleSelectionResult(Lcom/paymaya/domain/model/UpdateProfileSelectionItem;)V", 0, 26));
    }

    public final void p2(MaritalStatus maritalStatus) {
        Y1().getDisplayText().setText(maritalStatus.getName());
        Y1().setSelectedData(maritalStatus);
        Y1().getDisplayText().setHint("");
        Y1().b();
    }

    public final void q2(EducationalAttainment educationalAttainment) {
        Z1().getDisplayText().setText(educationalAttainment.getName());
        Z1().setSelectedData(educationalAttainment);
        Z1().getDisplayText().setHint("");
        Z1().b();
    }

    public final void r2(Gender gender) {
        b2().getDisplayText().setText(gender.getName());
        b2().setSelectedData(gender);
        b2().getDisplayText().setHint("");
        b2().b();
    }

    public final void s2(MayaProfileInputLayout mayaProfileInputLayout, String str) {
        mayaProfileInputLayout.getInputEditText().requestFocus();
        mayaProfileInputLayout.getInputEditText().setText(str);
        g2().requestFocus();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1215d u1() {
        return EnumC1215d.PROFILE;
    }

    public final void u2(boolean z4) {
        i2().setVisibility(z4 ? 0 : 8);
        Button button = this.f14269d0;
        if (button != null) {
            button.setVisibility(z4 ? 8 : 0);
        } else {
            j.n("mNextButton");
            throw null;
        }
    }

    public final void v2(MayaProfileInputLayout mayaProfileInputLayout, UpdateProfileFieldType updateProfileFieldType, Function2 function2) {
        mayaProfileInputLayout.setTag(updateProfileFieldType);
        mayaProfileInputLayout.getInputEditText().addTextChangedListener(new A(this, updateProfileFieldType, mayaProfileInputLayout, function2));
    }
}
