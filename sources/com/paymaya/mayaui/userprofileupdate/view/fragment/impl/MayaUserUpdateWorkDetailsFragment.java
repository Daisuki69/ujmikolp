package com.paymaya.mayaui.userprofileupdate.view.fragment.impl;

import Ag.l;
import B5.i;
import G5.A;
import G5.C0251a;
import Lh.d;
import Lh.h;
import N5.U0;
import O5.a;
import S5.c;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.view.ViewGroupKt;
import androidx.fragment.app.FragmentActivity;
import cj.t;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.JobTitle;
import com.paymaya.domain.model.MfaTencentErrorResult;
import com.paymaya.domain.model.UpdateProfileFieldType;
import com.paymaya.domain.model.UpdateProfileIncomeSource;
import com.paymaya.domain.model.UpdateProfileSelectionItem;
import com.paymaya.domain.model.UpdateProfileSelectionModel;
import com.paymaya.domain.model.UpdateProfileValidationResult;
import com.paymaya.domain.model.UpdateProfileWorkNature;
import com.paymaya.domain.model.WorkDetails;
import com.paymaya.mayaui.common.view.widget.MayaDropDown;
import com.paymaya.mayaui.common.view.widget.MayaProfileInputLayout;
import com.paymaya.mayaui.userprofileupdate.view.activity.impl.MayaUserProfileUpdateActivity;
import com.paymaya.mayaui.userprofileupdate.view.fragment.base.MayaUpdateProfileBaseFragment;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaUserProfileUpdateFragment;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaUserUpdateWorkDetailsFragment;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import oi.C1983a;
import org.json.JSONException;
import org.json.JSONObject;
import rc.o;
import sc.AbstractC2250a;
import wc.f;
import y5.AbstractC2509a;
import yc.B;
import yc.E;
import yc.F;
import yc.G;
import yc.H;
import yc.m;
import yc.r;
import yc.s;
import yj.e;
import yj.q;
import zh.b;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public class MayaUserUpdateWorkDetailsFragment extends MayaUpdateProfileBaseFragment<U0> implements f {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public o f14271Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public F f14272a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public UpdateProfileFieldType f14273b0;

    public MayaUserUpdateWorkDetailsFragment() {
        super(E.f21101a);
    }

    public static final void k2(final MayaUserUpdateWorkDetailsFragment mayaUserUpdateWorkDetailsFragment) throws JSONException {
        Pair pair;
        Pair pair2;
        String string;
        String string2;
        mayaUserUpdateWorkDetailsFragment.a2().requestFocus();
        final int i = 0;
        yj.f fVarH = q.h(q.n(q.n(q.h(q.h(ViewGroupKt.getChildren(((U0) mayaUserUpdateWorkDetailsFragment.G1()).f3943b), r.f), new m(10)), new m(11)), new Function1(mayaUserUpdateWorkDetailsFragment) { // from class: yc.D

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaUserUpdateWorkDetailsFragment f21100b;

            {
                this.f21100b = mayaUserUpdateWorkDetailsFragment;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String strI;
                MayaUserUpdateWorkDetailsFragment mayaUserUpdateWorkDetailsFragment2 = this.f21100b;
                String strTnTj78 = numX49.tnTj78("bt9Pq");
                Pair pair3 = (Pair) obj;
                switch (i) {
                    case 0:
                        kotlin.jvm.internal.j.g(pair3, strTnTj78);
                        oc.e eVarC2 = mayaUserUpdateWorkDetailsFragment2.c2();
                        Object obj2 = pair3.f18161b;
                        UpdateProfileFieldType updateProfileFieldType = (UpdateProfileFieldType) obj2;
                        UpdateProfileFieldType updateProfileFieldType2 = UpdateProfileFieldType.MONTHLY_TAKE_HOME_PAY;
                        Object obj3 = pair3.f18160a;
                        if (obj2 == updateProfileFieldType2) {
                            List list = MayaUserProfileUpdateFragment.f14261f0;
                            strI = AbstractC2250a.f(S1.r.i((MayaProfileInputLayout) obj3));
                            if (strI == null) {
                                strI = numX49.tnTj78("bt9Pl");
                            }
                        } else {
                            List list2 = MayaUserProfileUpdateFragment.f14261f0;
                            strI = S1.r.i((MayaProfileInputLayout) obj3);
                        }
                        return new Pair(obj3, ((rc.o) eVarC2).t(updateProfileFieldType, strI));
                    default:
                        kotlin.jvm.internal.j.g(pair3, strTnTj78);
                        oc.e eVarC22 = mayaUserUpdateWorkDetailsFragment2.c2();
                        UpdateProfileFieldType updateProfileFieldType3 = (UpdateProfileFieldType) pair3.f18161b;
                        List list3 = MayaUserProfileUpdateFragment.f14261f0;
                        Object obj4 = pair3.f18160a;
                        MayaDropDown mayaDropDown = (MayaDropDown) obj4;
                        kotlin.jvm.internal.j.g(mayaDropDown, numX49.tnTj78("bt9Pz"));
                        return new Pair(obj4, ((rc.o) eVarC22).s(updateProfileFieldType3, mayaDropDown.getSelectedData()));
                }
            }
        }), new m(12));
        MayaProfileInputLayout mayaProfileInputLayout = null;
        if (q.p(fVarH)) {
            fVarH = null;
        }
        final int i4 = 1;
        yj.f fVarH2 = q.h(q.n(q.n(q.h(q.h(ViewGroupKt.getChildren(((U0) mayaUserUpdateWorkDetailsFragment.G1()).f3943b), r.e), new m(13)), new m(14)), new Function1(mayaUserUpdateWorkDetailsFragment) { // from class: yc.D

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaUserUpdateWorkDetailsFragment f21100b;

            {
                this.f21100b = mayaUserUpdateWorkDetailsFragment;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String strI;
                MayaUserUpdateWorkDetailsFragment mayaUserUpdateWorkDetailsFragment2 = this.f21100b;
                String strTnTj78 = numX49.tnTj78("bt9Pq");
                Pair pair3 = (Pair) obj;
                switch (i4) {
                    case 0:
                        kotlin.jvm.internal.j.g(pair3, strTnTj78);
                        oc.e eVarC2 = mayaUserUpdateWorkDetailsFragment2.c2();
                        Object obj2 = pair3.f18161b;
                        UpdateProfileFieldType updateProfileFieldType = (UpdateProfileFieldType) obj2;
                        UpdateProfileFieldType updateProfileFieldType2 = UpdateProfileFieldType.MONTHLY_TAKE_HOME_PAY;
                        Object obj3 = pair3.f18160a;
                        if (obj2 == updateProfileFieldType2) {
                            List list = MayaUserProfileUpdateFragment.f14261f0;
                            strI = AbstractC2250a.f(S1.r.i((MayaProfileInputLayout) obj3));
                            if (strI == null) {
                                strI = numX49.tnTj78("bt9Pl");
                            }
                        } else {
                            List list2 = MayaUserProfileUpdateFragment.f14261f0;
                            strI = S1.r.i((MayaProfileInputLayout) obj3);
                        }
                        return new Pair(obj3, ((rc.o) eVarC2).t(updateProfileFieldType, strI));
                    default:
                        kotlin.jvm.internal.j.g(pair3, strTnTj78);
                        oc.e eVarC22 = mayaUserUpdateWorkDetailsFragment2.c2();
                        UpdateProfileFieldType updateProfileFieldType3 = (UpdateProfileFieldType) pair3.f18161b;
                        List list3 = MayaUserProfileUpdateFragment.f14261f0;
                        Object obj4 = pair3.f18160a;
                        MayaDropDown mayaDropDown = (MayaDropDown) obj4;
                        kotlin.jvm.internal.j.g(mayaDropDown, numX49.tnTj78("bt9Pz"));
                        return new Pair(obj4, ((rc.o) eVarC22).s(updateProfileFieldType3, mayaDropDown.getSelectedData()));
                }
            }
        }), new m(9));
        if (q.p(fVarH2)) {
            fVarH2 = null;
        }
        if (fVarH2 != null) {
            e eVar = new e(fVarH2);
            while (eVar.hasNext()) {
                Pair firstDropDownErrorView = (Pair) eVar.next();
                j.g(firstDropDownErrorView, "firstDropDownErrorView");
                AbstractC2250a.d((MayaDropDown) firstDropDownErrorView.f18160a, (UpdateProfileValidationResult) firstDropDownErrorView.f18161b);
            }
        }
        if (fVarH != null) {
            e eVar2 = new e(fVarH);
            while (eVar2.hasNext()) {
                Pair firstErrorView = (Pair) eVar2.next();
                j.g(firstErrorView, "firstErrorView");
                AbstractC2250a.c((MayaProfileInputLayout) firstErrorView.f18160a, (UpdateProfileValidationResult) firstErrorView.f18161b, new n0.e(2));
            }
        }
        if (fVarH == null && fVarH2 == null) {
            Object selectedData = mayaUserUpdateWorkDetailsFragment.a2().getSelectedData();
            j.e(selectedData, "null cannot be cast to non-null type com.paymaya.domain.model.UpdateProfileWorkNature");
            String code = ((UpdateProfileWorkNature) selectedData).getCode();
            Object selectedData2 = mayaUserUpdateWorkDetailsFragment.Y1().getSelectedData();
            j.e(selectedData2, "null cannot be cast to non-null type com.paymaya.domain.model.JobTitle");
            String name = ((JobTitle) selectedData2).getName();
            Editable text = mayaUserUpdateWorkDetailsFragment.X1().getInputEditText().getText();
            String str = (text == null || (string2 = text.toString()) == null || string2.length() <= 0) ? null : string2;
            Object selectedData3 = mayaUserUpdateWorkDetailsFragment.b2().getSelectedData();
            j.e(selectedData3, "null cannot be cast to non-null type com.paymaya.domain.model.UpdateProfileIncomeSource");
            String code2 = ((UpdateProfileIncomeSource) selectedData3).getCode();
            Editable text2 = mayaUserUpdateWorkDetailsFragment.Z1().getInputEditText().getText();
            WorkDetails workDetails = new WorkDetails(str, code2, name, (text2 == null || (string = text2.toString()) == null) ? null : AbstractC1213b.M("[^0-9.]", string, ""), code);
            o oVar = (o) mayaUserUpdateWorkDetailsFragment.c2();
            JSONObject jSONObject = new JSONObject();
            String workNature = workDetails.getWorkNature();
            if (workNature != null) {
                jSONObject.put("workNature", workNature);
            }
            String incomeSource = workDetails.getIncomeSource();
            if (incomeSource != null) {
                jSONObject.put("incomeSource", incomeSource);
            }
            String jobTitle = workDetails.getJobTitle();
            if (jobTitle != null) {
                jSONObject.put("jobTitle", jobTitle);
            }
            String monthlyIncome = workDetails.getMonthlyIncome();
            if (monthlyIncome != null) {
                jSONObject.put("monthlyIncome", monthlyIncome);
            }
            String employmentDetails = workDetails.getEmploymentDetails();
            if (employmentDetails != null) {
                jSONObject.put("employmentDetails", employmentDetails);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("workDetails", jSONObject);
            String string3 = jSONObject2.toString();
            j.f(string3, "toString(...)");
            ((MayaBaseFragment) ((f) oVar.c.get())).E1();
            new d(new d(new h(oVar.f19927g.x(string3), b.a(), 0), new C1983a(oVar, 9), 2), new o6.f(oVar, 7), 0).e();
        }
        MayaDropDown mayaDropDown = (fVarH2 == null || (pair2 = (Pair) q.j(fVarH2)) == null) ? null : (MayaDropDown) pair2.f18160a;
        if (fVarH != null && (pair = (Pair) q.j(fVarH)) != null) {
            mayaProfileInputLayout = (MayaProfileInputLayout) pair.f18160a;
        }
        if (mayaProfileInputLayout != null && mayaDropDown == null) {
            mayaUserUpdateWorkDetailsFragment.K1(mayaProfileInputLayout);
        }
        if (mayaProfileInputLayout == null && mayaDropDown != null) {
            mayaUserUpdateWorkDetailsFragment.K1(mayaDropDown);
        }
        if (fVarH == null || fVarH2 == null) {
            return;
        }
        for (View view : ViewGroupKt.getChildren(((U0) mayaUserUpdateWorkDetailsFragment.G1()).f3943b)) {
            if ((mayaDropDown != null && view.getId() == mayaDropDown.getId()) || (mayaProfileInputLayout != null && view.getId() == mayaProfileInputLayout.getId())) {
                mayaUserUpdateWorkDetailsFragment.K1(view);
                return;
            }
        }
    }

    @Override // com.paymaya.mayaui.userprofileupdate.view.fragment.base.MayaUpdateProfileBaseFragment
    public final ScrollView N1() {
        ScrollView scrollableNestedScrollView = ((U0) G1()).i;
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
        c1219h.r(EnumC1216e.WORK_DETAILS);
        c1219h.n(17);
        c1219h.t(EnumC1217f.BACK);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        map.put("referrer", O1());
        c1219h.i();
        if (((o) c2()).f19933q == null) {
            o1().c(getActivity(), c1219h);
            requireActivity().setResult(MfaTencentErrorResult.TENCENT_ERROR_USER_STOPS);
            requireActivity().finish();
            return;
        }
        EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
        String str = ((o) c2()).f19932p;
        if (str == null) {
            str = "https://paymaya.com/app/";
        }
        map.put("destination", str);
        o1().c(getActivity(), c1219h);
        String str2 = ((o) c2()).f19933q;
        String str3 = str2 != null ? str2 : "https://paymaya.com/app/";
        F f = this.f14272a0;
        if (f != null) {
            MayaUserProfileUpdateActivity mayaUserProfileUpdateActivity = (MayaUserProfileUpdateActivity) f;
            mayaUserProfileUpdateActivity.n1();
            i.k(mayaUserProfileUpdateActivity, str3);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.WORK_DETAILS;
    }

    public final MayaProfileInputLayout X1() {
        MayaProfileInputLayout inputCompanyName = ((U0) G1()).c;
        j.f(inputCompanyName, "inputCompanyName");
        return inputCompanyName;
    }

    public final MayaDropDown Y1() {
        MayaDropDown mayaDropdownJobTitle = ((U0) G1()).e;
        j.f(mayaDropdownJobTitle, "mayaDropdownJobTitle");
        return mayaDropdownJobTitle;
    }

    public final MayaProfileInputLayout Z1() {
        MayaProfileInputLayout inputMonthlyPay = ((U0) G1()).f3944d;
        j.f(inputMonthlyPay, "inputMonthlyPay");
        return inputMonthlyPay;
    }

    public final MayaDropDown a2() {
        MayaDropDown mayaDropdownNatureOfWork = ((U0) G1()).f;
        j.f(mayaDropdownNatureOfWork, "mayaDropdownNatureOfWork");
        return mayaDropdownNatureOfWork;
    }

    public final MayaDropDown b2() {
        MayaDropDown mayaDropdownSourceOfIncome = ((U0) G1()).f3945g;
        j.f(mayaDropdownSourceOfIncome, "mayaDropdownSourceOfIncome");
        return mayaDropdownSourceOfIncome;
    }

    public final oc.e c2() {
        o oVar = this.f14271Z;
        if (oVar != null) {
            return oVar;
        }
        j.n("mUserUpdateWorkDetailsFragmentPresenter");
        throw null;
    }

    public final void d2(MayaProfileInputLayout mayaProfileInputLayout, UpdateProfileFieldType updateProfileFieldType, Function2 function2, String str) {
        if (G.f21102a[updateProfileFieldType.ordinal()] != 4) {
            AbstractC2250a.c(mayaProfileInputLayout, (UpdateProfileValidationResult) function2.invoke(updateProfileFieldType, str), new l(29, this, mayaProfileInputLayout));
            return;
        }
        String strF = AbstractC2250a.f(str);
        if (strF == null) {
            strF = "";
        }
        AbstractC2250a.c(mayaProfileInputLayout, (UpdateProfileValidationResult) function2.invoke(updateProfileFieldType, strF), new n0.e(2));
    }

    public final void e2(String str, List incomeSources) {
        j.g(incomeSources, "incomeSources");
        Integer numValueOf = Integer.valueOf(R.string.maya_work_details_income_source_dropdown_header);
        List list = incomeSources;
        ArrayList arrayList = new ArrayList(t.l(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(UpdateProfileSelectionItem.Companion.toSelectionItem((UpdateProfileIncomeSource) it.next()));
        }
        UpdateProfileSelectionModel updateProfileSelectionModel = new UpdateProfileSelectionModel(numValueOf, str, arrayList);
        this.f14273b0 = UpdateProfileFieldType.SOURCE_OF_INCOME;
        F f = this.f14272a0;
        if (f != null) {
            ((MayaUserProfileUpdateActivity) f).X1(updateProfileSelectionModel);
        }
        if (!j.b(b2().getDisplayText().getText(), getString(R.string.maya_work_profile_source_of_income_dropdown_hint))) {
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

    public final void f2(String str, List jobTitles) {
        j.g(jobTitles, "jobTitles");
        Integer numValueOf = Integer.valueOf(R.string.maya_work_details_job_title_dropdown_header);
        List list = jobTitles;
        ArrayList arrayList = new ArrayList(t.l(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(UpdateProfileSelectionItem.Companion.toSelectionItem((JobTitle) it.next()));
        }
        UpdateProfileSelectionModel updateProfileSelectionModel = new UpdateProfileSelectionModel(numValueOf, str, arrayList);
        this.f14273b0 = UpdateProfileFieldType.JOB_TITLE;
        F f = this.f14272a0;
        if (f != null) {
            ((MayaUserProfileUpdateActivity) f).X1(updateProfileSelectionModel);
        }
        if (!j.b(Y1().getDisplayText().getText(), getString(R.string.maya_work_profile_job_title_dropdown_hint))) {
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

    public final void g2(String str, List list) {
        Integer numValueOf = Integer.valueOf(R.string.maya_work_details_work_nature_dropdown_header);
        List list2 = list;
        ArrayList arrayList = new ArrayList(t.l(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(UpdateProfileSelectionItem.Companion.toSelectionItem((UpdateProfileWorkNature) it.next()));
        }
        UpdateProfileSelectionModel updateProfileSelectionModel = new UpdateProfileSelectionModel(numValueOf, str, arrayList);
        this.f14273b0 = UpdateProfileFieldType.NATURE_OF_WORK;
        F f = this.f14272a0;
        if (f != null) {
            ((MayaUserProfileUpdateActivity) f).X1(updateProfileSelectionModel);
        }
        if (!j.b(a2().getDisplayText().getText(), getString(R.string.maya_work_profile_nature_of_work_dropdown_hint))) {
            CharSequence text = a2().getDisplayText().getText();
            j.f(text, "getText(...)");
            if (text.length() != 0) {
                return;
            }
        }
        CharSequence text2 = a2().getFloatingLabel().getText();
        MayaDropDown mayaDropDownA2 = a2();
        String string = getString(R.string.maya_update_profile_required_field, text2);
        j.f(string, "getString(...)");
        AbstractC2250a.h(mayaDropDownA2, string);
    }

    public final void h2(String str) {
        C1220i c1220iO1 = o1();
        FragmentActivity activity = getActivity();
        C1219h c1219h = new C1219h();
        HashMap map = c1219h.j;
        c1219h.p(EnumC1215d.PROFILE);
        c1219h.r(EnumC1216e.WORK_DETAILS);
        c1219h.n(17);
        c1219h.t(EnumC1217f.NEXT);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        map.put("destination", str);
        map.put("referrer", O1());
        c1219h.i();
        c1220iO1.c(activity, c1219h);
    }

    public final void i2(UpdateProfileIncomeSource updateProfileIncomeSource) {
        b2().getDisplayText().setText(updateProfileIncomeSource != null ? updateProfileIncomeSource.getName() : null);
        b2().setSelectedData(updateProfileIncomeSource);
        if (updateProfileIncomeSource != null) {
            b2().getDisplayText().setHint("");
        } else {
            b2().getDisplayText().setHint(getString(R.string.maya_work_profile_source_of_income_dropdown_hint));
        }
        b2().b();
    }

    public final void j2(JobTitle jobTitle) {
        Y1().getDisplayText().setText(jobTitle != null ? jobTitle.getName() : null);
        Y1().setSelectedData(jobTitle);
        if (jobTitle != null) {
            Y1().getDisplayText().setHint("");
        } else {
            Y1().getDisplayText().setHint(getString(R.string.maya_work_profile_job_title_dropdown_hint));
        }
        Y1().b();
    }

    @Override // com.paymaya.mayaui.userprofileupdate.view.fragment.base.MayaUpdateProfileBaseFragment, com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        KeyEventDispatcher.Component activity = getActivity();
        j.e(activity, "null cannot be cast to non-null type com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaUserUpdateWorkDetailsFragment.MayaUserUpdateWorkDetailFragmentListener");
        this.f14272a0 = (F) activity;
        a aVar = W4.a.e().B().f4755a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        Y.e eVarW = aVar.W();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        j.g(preference, "preference");
        this.f14271Z = new o(eVarW, preference);
        this.f10338R = true;
        ((AbstractC2509a) c2()).h(this);
        if (bundle == null) {
            ((o) c2()).j();
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        ((o) c2()).h.m0("");
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ((o) c2()).o();
        F f = this.f14272a0;
        if (f != null) {
            ((MayaUserProfileUpdateActivity) f).Q(this);
        }
        C1220i c1220iO1 = o1();
        FragmentActivity activity = getActivity();
        C1219h c1219hD = C1219h.d(EnumC1215d.PROFILE);
        c1219hD.r(EnumC1216e.WORK_DETAILS);
        c1219hD.n(2);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        String str = ((o) c2()).f19933q;
        HashMap map = c1219hD.j;
        map.put("origin", str);
        map.put("referrer", O1());
        c1219hD.i();
        c1220iO1.c(activity, c1219hD);
    }

    @Override // com.paymaya.mayaui.userprofileupdate.view.fragment.base.MayaUpdateProfileBaseFragment, com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        Z1().getInputEditText().addTextChangedListener(new C0251a(Z1().getInputEditText()));
        ((U0) G1()).h.setOnClickListener(new B(this, 0));
        List list = MayaUserProfileUpdateFragment.f14261f0;
        S1.r.g(a2(), UpdateProfileFieldType.NATURE_OF_WORK, new H(1, c2(), oc.e.class, "onNatureOfWorkClicked", "onNatureOfWorkClicked(Ljava/lang/Object;)V", 0, 2), new s(2, c2(), oc.e.class, "validateDropDownField", "validateDropDownField(Lcom/paymaya/domain/model/UpdateProfileFieldType;Ljava/lang/Object;)Lcom/paymaya/domain/model/UpdateProfileValidationResult;", 0, 15));
        S1.r.g(Y1(), UpdateProfileFieldType.JOB_TITLE, new H(1, c2(), oc.e.class, "onJobTitleClicked", "onJobTitleClicked(Ljava/lang/Object;)V", 0, 1), new s(2, c2(), oc.e.class, "validateDropDownField", "validateDropDownField(Lcom/paymaya/domain/model/UpdateProfileFieldType;Ljava/lang/Object;)Lcom/paymaya/domain/model/UpdateProfileValidationResult;", 0, 13));
        S1.r.g(b2(), UpdateProfileFieldType.SOURCE_OF_INCOME, new H(1, c2(), oc.e.class, "onIncomeSourceClicked", "onIncomeSourceClicked(Ljava/lang/Object;)V", 0, 3), new s(2, c2(), oc.e.class, "validateDropDownField", "validateDropDownField(Lcom/paymaya/domain/model/UpdateProfileFieldType;Ljava/lang/Object;)Lcom/paymaya/domain/model/UpdateProfileValidationResult;", 0, 16));
        final MayaProfileInputLayout mayaProfileInputLayoutZ1 = Z1();
        final UpdateProfileFieldType updateProfileFieldType = UpdateProfileFieldType.MONTHLY_TAKE_HOME_PAY;
        final s sVar = new s(2, c2(), oc.e.class, "validateField", "validateField(Lcom/paymaya/domain/model/UpdateProfileFieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/UpdateProfileValidationResult;", 0, 14);
        mayaProfileInputLayoutZ1.setTag(updateProfileFieldType);
        mayaProfileInputLayoutZ1.setOnMayaProfileInputFocusChangeListener(new Function2(mayaProfileInputLayoutZ1, this, sVar) { // from class: yc.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaUserUpdateWorkDetailsFragment f21097b;
            public final /* synthetic */ MayaProfileInputLayout c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ kotlin.jvm.internal.i f21098d;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.f21098d = (kotlin.jvm.internal.i) sVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.i] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                kotlin.jvm.internal.j.g((View) obj, numX49.tnTj78("bt9X"));
                if (!zBooleanValue) {
                    UpdateProfileFieldType updateProfileFieldType2 = UpdateProfileFieldType.MONTHLY_TAKE_HOME_PAY;
                    MayaProfileInputLayout mayaProfileInputLayout = this.c;
                    UpdateProfileFieldType updateProfileFieldType3 = this.f21096a;
                    MayaUserUpdateWorkDetailsFragment mayaUserUpdateWorkDetailsFragment = this.f21097b;
                    if (updateProfileFieldType3 == updateProfileFieldType2) {
                        List list2 = MayaUserProfileUpdateFragment.f14261f0;
                        String strI = S1.r.i(mayaProfileInputLayout);
                        AppCompatEditText inputEditText = mayaProfileInputLayout.getInputEditText();
                        mayaUserUpdateWorkDetailsFragment.getClass();
                        zj.o oVar = new zj.o(numX49.tnTj78("bt9G"));
                        String strTnTj78 = numX49.tnTj78("bt93");
                        String strF = oVar.f(strTnTj78, strI);
                        if (C2576A.H(strF)) {
                            inputEditText.setText(strTnTj78);
                        } else {
                            inputEditText.setText(AbstractC2250a.a(strF));
                        }
                    }
                    List list3 = MayaUserProfileUpdateFragment.f14261f0;
                    mayaUserUpdateWorkDetailsFragment.d2(mayaProfileInputLayout, updateProfileFieldType3, this.f21098d, S1.r.i(mayaProfileInputLayout));
                }
                return Unit.f18162a;
            }
        });
        mayaProfileInputLayoutZ1.getInputEditText().addTextChangedListener(new A(updateProfileFieldType, mayaProfileInputLayoutZ1, this, sVar));
        final MayaProfileInputLayout mayaProfileInputLayoutX1 = X1();
        final UpdateProfileFieldType updateProfileFieldType2 = UpdateProfileFieldType.NAME_OF_COMPANY;
        final s sVar2 = new s(2, c2(), oc.e.class, "validateField", "validateField(Lcom/paymaya/domain/model/UpdateProfileFieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/UpdateProfileValidationResult;", 0, 12);
        mayaProfileInputLayoutX1.setTag(updateProfileFieldType2);
        mayaProfileInputLayoutX1.setOnMayaProfileInputFocusChangeListener(new Function2(mayaProfileInputLayoutX1, this, sVar2) { // from class: yc.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaUserUpdateWorkDetailsFragment f21097b;
            public final /* synthetic */ MayaProfileInputLayout c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ kotlin.jvm.internal.i f21098d;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.f21098d = (kotlin.jvm.internal.i) sVar2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.i] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                kotlin.jvm.internal.j.g((View) obj, numX49.tnTj78("bt9X"));
                if (!zBooleanValue) {
                    UpdateProfileFieldType updateProfileFieldType22 = UpdateProfileFieldType.MONTHLY_TAKE_HOME_PAY;
                    MayaProfileInputLayout mayaProfileInputLayout = this.c;
                    UpdateProfileFieldType updateProfileFieldType3 = this.f21096a;
                    MayaUserUpdateWorkDetailsFragment mayaUserUpdateWorkDetailsFragment = this.f21097b;
                    if (updateProfileFieldType3 == updateProfileFieldType22) {
                        List list2 = MayaUserProfileUpdateFragment.f14261f0;
                        String strI = S1.r.i(mayaProfileInputLayout);
                        AppCompatEditText inputEditText = mayaProfileInputLayout.getInputEditText();
                        mayaUserUpdateWorkDetailsFragment.getClass();
                        zj.o oVar = new zj.o(numX49.tnTj78("bt9G"));
                        String strTnTj78 = numX49.tnTj78("bt93");
                        String strF = oVar.f(strTnTj78, strI);
                        if (C2576A.H(strF)) {
                            inputEditText.setText(strTnTj78);
                        } else {
                            inputEditText.setText(AbstractC2250a.a(strF));
                        }
                    }
                    List list3 = MayaUserProfileUpdateFragment.f14261f0;
                    mayaUserUpdateWorkDetailsFragment.d2(mayaProfileInputLayout, updateProfileFieldType3, this.f21098d, S1.r.i(mayaProfileInputLayout));
                }
                return Unit.f18162a;
            }
        });
        mayaProfileInputLayoutX1.getInputEditText().addTextChangedListener(new A(updateProfileFieldType2, mayaProfileInputLayoutX1, this, sVar2));
        Xh.i.E(this, z.a(MayaProfileUpdateSingleSelectionBottomSheetDialogFragment.class), new H(1, this, MayaUserUpdateWorkDetailsFragment.class, "handleSingleSelectionResult", "handleSingleSelectionResult(Lcom/paymaya/domain/model/UpdateProfileSelectionItem;)V", 0, 0));
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1215d u1() {
        return EnumC1215d.PROFILE;
    }
}
