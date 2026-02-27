package com.paymaya.mayaui.userprofileupdate.view.fragment.impl;

import B5.i;
import E8.p;
import G5.C0251a;
import Gh.d;
import Lh.g;
import Lh.h;
import N5.R0;
import S5.c;
import Y.e;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.KeyEventDispatcher;
import bg.AbstractC0983W;
import cj.C1128n;
import cj.C1132s;
import cj.Q;
import cj.t;
import com.dynatrace.android.agent.Global;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.domain.model.FieldType;
import com.paymaya.domain.model.JobTitle;
import com.paymaya.domain.model.MfaTencentErrorResult;
import com.paymaya.domain.model.ProfileTin;
import com.paymaya.domain.model.UnderwritingDetails;
import com.paymaya.domain.model.UnderwritingDetailsRequestBuilder;
import com.paymaya.domain.model.UpdateProfileIncomeSource;
import com.paymaya.domain.model.UpdateProfileSelectionItem;
import com.paymaya.domain.model.UpdateProfileSelectionModel;
import com.paymaya.domain.model.UpdateProfileWorkNature;
import com.paymaya.domain.model.WorkDetails;
import com.paymaya.mayaui.common.view.widget.MayaDropDown;
import com.paymaya.mayaui.common.view.widget.MayaProfileInputLayout;
import com.paymaya.mayaui.userprofileupdate.view.activity.impl.MayaUpdateProfileActivity;
import com.paymaya.mayaui.userprofileupdate.view.fragment.base.MayaUpdateProfileBaseFragment;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaUnderWritingRequirementsFragment;
import dOYHB6.tiZVw8.numX49;
import eb.f;
import ha.C1556i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import jk.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import l9.C1803a;
import oc.InterfaceC1975b;
import oi.C1983a;
import p8.a;
import pi.C2151a;
import rc.C2196c;
import sc.AbstractC2250a;
import wc.InterfaceC2392c;
import y5.AbstractC2509a;
import yc.C2525f;
import yc.C2527h;
import yc.k;
import yc.l;
import zj.o;

/* JADX INFO: loaded from: classes4.dex */
public class MayaUnderWritingRequirementsFragment extends MayaUpdateProfileBaseFragment<R0> implements InterfaceC2392c {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final List f14251d0 = C1132s.g(3, 3, 3, 3);

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final List f14252e0 = C1132s.g(2, 7, 1);

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final o f14253f0 = new o("[^0-9.]");

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public C2196c f14254Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public l f14255a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public FieldType f14256b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final C2151a f14257c0;

    public MayaUnderWritingRequirementsFragment() {
        super(k.f21121a);
        this.f14257c0 = new C2151a(Q.c(FieldType.NatureOfWork.INSTANCE, FieldType.JobTitle.INSTANCE, FieldType.SourceOfIncome.INSTANCE, FieldType.MonthlyTakeHomePay.INSTANCE));
    }

    public static final void e2(MayaUnderWritingRequirementsFragment mayaUnderWritingRequirementsFragment) {
        String string;
        String strK;
        ((R0) mayaUnderWritingRequirementsFragment.G1()).c.requestFocus();
        C1128n c1128nH1 = mayaUnderWritingRequirementsFragment.H1(new f(2, mayaUnderWritingRequirementsFragment.X1(), InterfaceC1975b.class, "validateDropDown", "validateDropDown(Lcom/paymaya/domain/model/FieldType;Ljava/lang/Object;)Lcom/paymaya/domain/model/ValidationResult;", 0, 24));
        C1128n c1128nI1 = mayaUnderWritingRequirementsFragment.I1(new f(2, mayaUnderWritingRequirementsFragment.X1(), InterfaceC1975b.class, "validateInput", "validateInput(Lcom/paymaya/domain/model/FieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/ValidationResult;", 0, 25));
        MayaUpdateProfileBaseFragment.U1(c1128nH1, c1128nI1);
        if (c1128nI1 == null && c1128nH1 == null) {
            Object selectedData = ((R0) mayaUnderWritingRequirementsFragment.G1()).c.getSelectedData();
            j.e(selectedData, "null cannot be cast to non-null type com.paymaya.domain.model.UpdateProfileWorkNature");
            String code = ((UpdateProfileWorkNature) selectedData).getCode();
            Object selectedData2 = ((R0) mayaUnderWritingRequirementsFragment.G1()).f3879b.getSelectedData();
            j.e(selectedData2, "null cannot be cast to non-null type com.paymaya.domain.model.JobTitle");
            String name = ((JobTitle) selectedData2).getName();
            String strP = b.p(((R0) mayaUnderWritingRequirementsFragment.G1()).f);
            String str = strP.length() > 0 ? strP : null;
            Object selectedData3 = ((R0) mayaUnderWritingRequirementsFragment.G1()).f3880d.getSelectedData();
            j.e(selectedData3, "null cannot be cast to non-null type com.paymaya.domain.model.UpdateProfileIncomeSource");
            String code2 = ((UpdateProfileIncomeSource) selectedData3).getCode();
            String strG = AbstractC2250a.g(b.p(((R0) mayaUnderWritingRequirementsFragment.G1()).f3881g), f14253f0);
            String strG2 = AbstractC2250a.g(b.p(((R0) mayaUnderWritingRequirementsFragment.G1()).i), new o(Global.HYPHEN));
            String strG3 = AbstractC2250a.g(b.p(((R0) mayaUnderWritingRequirementsFragment.G1()).h), new o(Global.HYPHEN));
            UnderwritingDetailsRequestBuilder underwritingDetailsRequestBuilder = new UnderwritingDetailsRequestBuilder();
            underwritingDetailsRequestBuilder.setWorkDetails(new WorkDetails(str, code2, name, strG, code));
            if (strG2.length() <= 0) {
                strG2 = null;
            }
            if (strG2 != null) {
                underwritingDetailsRequestBuilder.setTin(new ProfileTin(strG2));
            }
            if (strG3.length() <= 0) {
                strG3 = null;
            }
            if (strG3 != null) {
                underwritingDetailsRequestBuilder.setSss(new ProfileTin(strG3));
            }
            UnderwritingDetails underwritingDetailsBuild = underwritingDetailsRequestBuilder.build();
            C2196c c2196c = (C2196c) mayaUnderWritingRequirementsFragment.X1();
            ((MayaBaseFragment) ((InterfaceC2392c) c2196c.c.get())).E1();
            MayaUnderWritingRequirementsFragment mayaUnderWritingRequirementsFragment2 = (MayaUnderWritingRequirementsFragment) ((InterfaceC2392c) c2196c.c.get());
            C1220i c1220iO1 = mayaUnderWritingRequirementsFragment2.o1();
            C1219h c1219hE = C1219h.e("CREDIT_CARD_UNDERWRITING_TAPPED");
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            HashMap map = c1219hE.j;
            map.put("page_name", "Minimum Underwriting Requirements");
            Bundle arguments = mayaUnderWritingRequirementsFragment2.getArguments();
            if (arguments == null || (string = arguments.getString("DESTINATION_SCREEN")) == null) {
                string = "";
            }
            map.put("destination_page", string);
            map.put("button", ((R0) mayaUnderWritingRequirementsFragment2.G1()).f3882k.getText().toString());
            Object selectedData4 = ((R0) mayaUnderWritingRequirementsFragment2.G1()).c.getSelectedData();
            j.e(selectedData4, "null cannot be cast to non-null type com.paymaya.domain.model.UpdateProfileWorkNature");
            map.put("nature_work", ((UpdateProfileWorkNature) selectedData4).getName());
            Object selectedData5 = ((R0) mayaUnderWritingRequirementsFragment2.G1()).f3879b.getSelectedData();
            j.e(selectedData5, "null cannot be cast to non-null type com.paymaya.domain.model.JobTitle");
            map.put("job_title", ((JobTitle) selectedData5).getName());
            Object selectedData6 = ((R0) mayaUnderWritingRequirementsFragment2.G1()).f3880d.getSelectedData();
            j.e(selectedData6, "null cannot be cast to non-null type com.paymaya.domain.model.UpdateProfileIncomeSource");
            map.put("source_income", ((UpdateProfileIncomeSource) selectedData6).getName());
            map.put("company_name", String.valueOf(((R0) mayaUnderWritingRequirementsFragment2.G1()).f.getInputEditText().getText()));
            map.put("monthly_take_home_pay", String.valueOf(((R0) mayaUnderWritingRequirementsFragment2.G1()).f3881g.getInputEditText().getText()));
            c1219hE.i();
            c1220iO1.b(c1219hE);
            if (underwritingDetailsBuild != null) {
                strK = new com.google.gson.j().k(underwritingDetailsBuild);
                j.f(strK, "toJson(...)");
            } else {
                strK = null;
            }
            h hVarX = c2196c.f19886k.x(String.valueOf(strK));
            Ah.o oVarA = zh.b.a();
            C1803a c1803a = new C1803a(c2196c, 13);
            d dVar = new d(1, new a(c2196c, 5), new C1983a(c2196c, 5));
            try {
                try {
                    hVarX.f(new g(new Hh.d(dVar, c1803a, 1), oVarA));
                    c2196c.e(dVar);
                } catch (NullPointerException e) {
                    throw e;
                } catch (Throwable th2) {
                    AbstractC0983W.G(th2);
                    NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
                    nullPointerException.initCause(th2);
                    throw nullPointerException;
                }
            } catch (NullPointerException e7) {
                throw e7;
            } catch (Throwable th3) {
                throw AbstractC1213b.L(th3, "subscribeActual failed", th3);
            }
        }
        mayaUnderWritingRequirementsFragment.J1(c1128nH1, c1128nI1);
    }

    @Override // com.paymaya.mayaui.userprofileupdate.view.fragment.base.MayaUpdateProfileBaseFragment
    public final Button L1() {
        return ((R0) G1()).f3882k;
    }

    @Override // com.paymaya.mayaui.userprofileupdate.view.fragment.base.MayaUpdateProfileBaseFragment
    public final ConstraintLayout M1() {
        return ((R0) G1()).e;
    }

    @Override // com.paymaya.mayaui.userprofileupdate.view.fragment.base.MayaUpdateProfileBaseFragment
    public final ScrollView N1() {
        return ((R0) G1()).j;
    }

    @Override // com.paymaya.mayaui.userprofileupdate.view.fragment.base.MayaUpdateProfileBaseFragment
    public final String O1() {
        String string;
        Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("SOURCE_SCREEN")) == null) ? "" : string;
    }

    @Override // com.paymaya.mayaui.userprofileupdate.view.fragment.base.MayaUpdateProfileBaseFragment
    public final void P1() {
        String str = ((qc.d) X1()).j;
        if (str == null) {
            C2196c c2196c = (C2196c) X1();
            ((MayaUnderWritingRequirementsFragment) ((InterfaceC2392c) c2196c.c.get())).g2();
            MayaUpdateProfileBaseFragment mayaUpdateProfileBaseFragment = (MayaUpdateProfileBaseFragment) ((InterfaceC2392c) c2196c.c.get());
            mayaUpdateProfileBaseFragment.requireActivity().setResult(MfaTencentErrorResult.TENCENT_ERROR_USER_STOPS);
            mayaUpdateProfileBaseFragment.requireActivity().finish();
            return;
        }
        l lVar = this.f14255a0;
        if (lVar != null) {
            MayaUpdateProfileActivity mayaUpdateProfileActivity = (MayaUpdateProfileActivity) lVar;
            mayaUpdateProfileActivity.n1();
            i.k(mayaUpdateProfileActivity, str);
        }
        g2();
    }

    public final InterfaceC1975b X1() {
        C2196c c2196c = this.f14254Z;
        if (c2196c != null) {
            return c2196c;
        }
        j.n("mPresenter");
        throw null;
    }

    public final void Y1(String str, List incomeSources) {
        j.g(incomeSources, "incomeSources");
        Integer numValueOf = Integer.valueOf(R.string.maya_work_details_income_source_dropdown_header);
        List list = incomeSources;
        ArrayList arrayList = new ArrayList(t.l(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(UpdateProfileSelectionItem.Companion.toSelectionItem((UpdateProfileIncomeSource) it.next()));
        }
        UpdateProfileSelectionModel updateProfileSelectionModel = new UpdateProfileSelectionModel(numValueOf, str, arrayList);
        this.f14256b0 = FieldType.SourceOfIncome.INSTANCE;
        l lVar = this.f14255a0;
        if (lVar != null) {
            ((MayaUpdateProfileActivity) lVar).V1(updateProfileSelectionModel);
        }
        String string = getString(R.string.maya_work_profile_source_of_income_dropdown_hint);
        j.f(string, "getString(...)");
        if (!j.b(((R0) G1()).f3880d.getDisplayText().getText(), string)) {
            CharSequence text = ((R0) G1()).f3880d.getDisplayText().getText();
            j.f(text, "getText(...)");
            if (text.length() != 0) {
                return;
            }
        }
        CharSequence text2 = ((R0) G1()).f3880d.getFloatingLabel().getText();
        MayaDropDown mayaDropDown = ((R0) G1()).f3880d;
        String string2 = getString(R.string.maya_update_profile_required_field, text2);
        j.f(string2, "getString(...)");
        AbstractC2250a.h(mayaDropDown, string2);
    }

    public final void Z1(String str, List jobTitles) {
        j.g(jobTitles, "jobTitles");
        Integer numValueOf = Integer.valueOf(R.string.maya_work_details_job_title_dropdown_header);
        List list = jobTitles;
        ArrayList arrayList = new ArrayList(t.l(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(UpdateProfileSelectionItem.Companion.toSelectionItem((JobTitle) it.next()));
        }
        UpdateProfileSelectionModel updateProfileSelectionModel = new UpdateProfileSelectionModel(numValueOf, str, arrayList);
        this.f14256b0 = FieldType.JobTitle.INSTANCE;
        l lVar = this.f14255a0;
        if (lVar != null) {
            ((MayaUpdateProfileActivity) lVar).V1(updateProfileSelectionModel);
        }
        String string = getString(R.string.maya_work_profile_job_title_dropdown_hint);
        j.f(string, "getString(...)");
        if (!j.b(((R0) G1()).f3879b.getDisplayText().getText(), string)) {
            CharSequence text = ((R0) G1()).f3879b.getDisplayText().getText();
            j.f(text, "getText(...)");
            if (text.length() != 0) {
                return;
            }
        }
        CharSequence text2 = ((R0) G1()).f3879b.getFloatingLabel().getText();
        MayaDropDown mayaDropDown = ((R0) G1()).f3879b;
        String string2 = getString(R.string.maya_update_profile_required_field, text2);
        j.f(string2, "getString(...)");
        AbstractC2250a.h(mayaDropDown, string2);
    }

    public final void a2(String str, List workNatures) {
        j.g(workNatures, "workNatures");
        Integer numValueOf = Integer.valueOf(R.string.maya_work_details_work_nature_dropdown_header);
        List list = workNatures;
        ArrayList arrayList = new ArrayList(t.l(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(UpdateProfileSelectionItem.Companion.toSelectionItem((UpdateProfileWorkNature) it.next()));
        }
        UpdateProfileSelectionModel updateProfileSelectionModel = new UpdateProfileSelectionModel(numValueOf, str, arrayList);
        this.f14256b0 = FieldType.NatureOfWork.INSTANCE;
        l lVar = this.f14255a0;
        if (lVar != null) {
            ((MayaUpdateProfileActivity) lVar).V1(updateProfileSelectionModel);
        }
        String string = getString(R.string.maya_work_profile_nature_of_work_dropdown_hint);
        j.f(string, "getString(...)");
        if (!j.b(((R0) G1()).c.getDisplayText().getText(), string)) {
            CharSequence text = ((R0) G1()).c.getDisplayText().getText();
            j.f(text, "getText(...)");
            if (text.length() != 0) {
                return;
            }
        }
        CharSequence text2 = ((R0) G1()).c.getFloatingLabel().getText();
        MayaDropDown mayaDropDown = ((R0) G1()).c;
        String string2 = getString(R.string.maya_update_profile_required_field, text2);
        j.f(string2, "getString(...)");
        AbstractC2250a.h(mayaDropDown, string2);
    }

    public final void b2(UpdateProfileIncomeSource updateProfileIncomeSource) {
        String string;
        MayaDropDown mayaDropDown = ((R0) G1()).f3880d;
        mayaDropDown.getDisplayText().setText(updateProfileIncomeSource != null ? updateProfileIncomeSource.getName() : null);
        mayaDropDown.setSelectedData(updateProfileIncomeSource);
        AppCompatTextView displayText = mayaDropDown.getDisplayText();
        if (updateProfileIncomeSource != null) {
            string = "";
        } else {
            string = getString(R.string.maya_work_profile_source_of_income_dropdown_hint);
            j.f(string, "getString(...)");
        }
        displayText.setHint(string);
        mayaDropDown.b();
    }

    public final void c2(JobTitle jobTitle) {
        String string;
        MayaDropDown mayaDropDown = ((R0) G1()).f3879b;
        mayaDropDown.getDisplayText().setText(jobTitle != null ? jobTitle.getName() : null);
        mayaDropDown.setSelectedData(jobTitle);
        AppCompatTextView displayText = mayaDropDown.getDisplayText();
        if (jobTitle != null) {
            string = "";
        } else {
            string = getString(R.string.maya_work_profile_job_title_dropdown_hint);
            j.f(string, "getString(...)");
        }
        displayText.setHint(string);
        mayaDropDown.b();
    }

    public final void d2(TextView textView, MayaProfileInputLayout mayaProfileInputLayout, String str, FieldType fieldType) {
        Ke.b.b(textView, new p(this, mayaProfileInputLayout, textView, str, 9));
        mayaProfileInputLayout.setOnCloseIconClickListener(new C1556i(this, mayaProfileInputLayout, textView, fieldType, mayaProfileInputLayout, 1));
        Ke.b.b(((R0) G1()).f3886p, new C2527h(this, mayaProfileInputLayout, 1));
    }

    public final void f2(boolean z4) {
        ((R0) G1()).f3886p.setVisibility(z4 ? 0 : 8);
        ((R0) G1()).f3882k.setVisibility(z4 ? 8 : 0);
    }

    public final void g2() {
        C1220i c1220iO1 = o1();
        C1219h c1219hE = C1219h.e("CREDIT_CARD_UNDERWRITING_TAPPED");
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        HashMap map = c1219hE.j;
        map.put("page_name", "Minimum Underwriting Requirements");
        map.put("destination_page", O1());
        map.put("button", "Back");
        c1219hE.i();
        c1220iO1.b(c1219hE);
    }

    @Override // com.paymaya.mayaui.userprofileupdate.view.fragment.base.MayaUpdateProfileBaseFragment, com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        O5.a aVar = W4.a.e().B().f4755a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        e eVarW = aVar.W();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        j.g(preference, "preference");
        this.f14254Z = new C2196c(eVarW, preference);
        C1219h c1219hE = C1219h.e("CREDIT_CARD_UNDERWRITING_SCREEN");
        c1219hE.i();
        this.f10337Q = c1219hE;
        this.f10338R = true;
        KeyEventDispatcher.Component activity = getActivity();
        j.e(activity, "null cannot be cast to non-null type com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaUnderWritingRequirementsFragment.MayaUnderWritingRequirementsFragmentListener");
        this.f14255a0 = (l) activity;
        ((AbstractC2509a) X1()).h(this);
        ((C2196c) X1()).j();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        ((qc.d) X1()).f19771d.m0("");
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C2196c c2196c = (C2196c) X1();
        c2196c.o(new eb.g(1, c2196c, C2196c.class, "prefillProfileData", "prefillProfileData(Lcom/paymaya/domain/model/MayaUpdateProfileData;)V", 0, 14));
        l lVar = this.f14255a0;
        if (lVar != null) {
            ((MayaUpdateProfileActivity) lVar).Q(this);
        }
    }

    @Override // com.paymaya.mayaui.userprofileupdate.view.fragment.base.MayaUpdateProfileBaseFragment, com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        String string2;
        final int i = 5;
        final int i4 = 4;
        final int i6 = 3;
        final int i10 = 1;
        final int i11 = 2;
        final int i12 = 0;
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C1220i c1220iO1 = o1();
        C1219h c1219hE = C1219h.e("CREDIT_CARD_UNDERWRITING_VIEWED");
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        HashMap map = c1219hE.j;
        map.put("page_name", "Minimum Underwriting Requirements");
        map.put("source_page", O1());
        Bundle arguments = getArguments();
        String str = "";
        if (arguments == null || (string = arguments.getString("PRODUCT_CODE")) == null) {
            string = "";
        }
        map.put("product_code", string);
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (string2 = arguments2.getString("CARD_TYPE")) != null) {
            str = string2;
        }
        map.put("card_type", str);
        c1219hE.i();
        c1220iO1.b(c1219hE);
        ((R0) G1()).f3882k.setEnabled(this.f14257c0.c());
        ((R0) G1()).f3880d.setDropDownEnabled(false);
        ((R0) G1()).f3879b.setDropDownEnabled(false);
        Va.f.f(((R0) G1()).c, FieldType.NatureOfWork.INSTANCE, new eb.g(1, X1(), InterfaceC1975b.class, "onNatureOfWorkClicked", "onNatureOfWorkClicked(Ljava/lang/Object;)V", 0, 21), new Function2(this) { // from class: yc.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaUnderWritingRequirementsFragment f21114b;

            {
                this.f21114b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                String strTnTj78 = numX49.tnTj78("bt9PW");
                MayaUnderWritingRequirementsFragment mayaUnderWritingRequirementsFragment = this.f21114b;
                String strTnTj782 = numX49.tnTj78("bt9b9");
                FieldType fieldType = (FieldType) obj;
                switch (i12) {
                    case 0:
                        List list = MayaUnderWritingRequirementsFragment.f14251d0;
                        kotlin.jvm.internal.j.g(fieldType, strTnTj782);
                        return mayaUnderWritingRequirementsFragment.W1(fieldType, obj2, new eb.f(2, mayaUnderWritingRequirementsFragment.X1(), InterfaceC1975b.class, numX49.tnTj78("bt9bd"), numX49.tnTj78("bt9bi"), 0, 21), mayaUnderWritingRequirementsFragment.f14257c0);
                    case 1:
                        List list2 = MayaUnderWritingRequirementsFragment.f14251d0;
                        kotlin.jvm.internal.j.g(fieldType, strTnTj782);
                        return mayaUnderWritingRequirementsFragment.W1(fieldType, obj2, new eb.f(2, mayaUnderWritingRequirementsFragment.X1(), InterfaceC1975b.class, numX49.tnTj78("bt9bS"), numX49.tnTj78("bt9bj"), 0, 22), mayaUnderWritingRequirementsFragment.f14257c0);
                    case 2:
                        List list3 = MayaUnderWritingRequirementsFragment.f14251d0;
                        kotlin.jvm.internal.j.g(fieldType, strTnTj782);
                        return mayaUnderWritingRequirementsFragment.W1(fieldType, obj2, new eb.f(2, mayaUnderWritingRequirementsFragment.X1(), InterfaceC1975b.class, numX49.tnTj78("bt9bu"), numX49.tnTj78("bt9bV"), 0, 23), mayaUnderWritingRequirementsFragment.f14257c0);
                    case 3:
                        String str2 = (String) obj2;
                        List list4 = MayaUnderWritingRequirementsFragment.f14251d0;
                        kotlin.jvm.internal.j.g(fieldType, strTnTj782);
                        kotlin.jvm.internal.j.g(str2, strTnTj78);
                        return mayaUnderWritingRequirementsFragment.V1(fieldType, str2, new eb.f(2, mayaUnderWritingRequirementsFragment.X1(), InterfaceC1975b.class, numX49.tnTj78("bt9bk"), numX49.tnTj78("bt9bB"), 0, 17), mayaUnderWritingRequirementsFragment.f14257c0);
                    case 4:
                        String str3 = (String) obj2;
                        List list5 = MayaUnderWritingRequirementsFragment.f14251d0;
                        kotlin.jvm.internal.j.g(fieldType, strTnTj782);
                        kotlin.jvm.internal.j.g(str3, strTnTj78);
                        return mayaUnderWritingRequirementsFragment.V1(fieldType, str3, new eb.f(2, mayaUnderWritingRequirementsFragment.X1(), InterfaceC1975b.class, numX49.tnTj78("bt9br"), numX49.tnTj78("bt9bZ"), 0, 18), mayaUnderWritingRequirementsFragment.f14257c0);
                    case 5:
                        String str4 = (String) obj2;
                        List list6 = MayaUnderWritingRequirementsFragment.f14251d0;
                        kotlin.jvm.internal.j.g(fieldType, strTnTj782);
                        kotlin.jvm.internal.j.g(str4, strTnTj78);
                        return mayaUnderWritingRequirementsFragment.V1(fieldType, str4, new eb.f(2, mayaUnderWritingRequirementsFragment.X1(), InterfaceC1975b.class, numX49.tnTj78("bt9b2"), numX49.tnTj78("bt9bL"), 0, 19), mayaUnderWritingRequirementsFragment.f14257c0);
                    default:
                        String str5 = (String) obj2;
                        List list7 = MayaUnderWritingRequirementsFragment.f14251d0;
                        kotlin.jvm.internal.j.g(fieldType, strTnTj782);
                        kotlin.jvm.internal.j.g(str5, strTnTj78);
                        return mayaUnderWritingRequirementsFragment.V1(fieldType, str5, new eb.f(2, mayaUnderWritingRequirementsFragment.X1(), InterfaceC1975b.class, numX49.tnTj78("bt9bP"), numX49.tnTj78("bt9bb"), 0, 20), mayaUnderWritingRequirementsFragment.f14257c0);
                }
            }
        }, new Function1(this) { // from class: yc.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaUnderWritingRequirementsFragment f21118b;

            {
                this.f21118b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                MayaUnderWritingRequirementsFragment mayaUnderWritingRequirementsFragment = this.f21118b;
                int i13 = i12;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                switch (i13) {
                    case 0:
                        List list = MayaUnderWritingRequirementsFragment.f14251d0;
                        if (zBooleanValue) {
                            mayaUnderWritingRequirementsFragment.f2(false);
                        }
                        break;
                    case 1:
                        List list2 = MayaUnderWritingRequirementsFragment.f14251d0;
                        if (zBooleanValue) {
                            mayaUnderWritingRequirementsFragment.f2(false);
                        }
                        break;
                    default:
                        List list3 = MayaUnderWritingRequirementsFragment.f14251d0;
                        if (zBooleanValue) {
                            mayaUnderWritingRequirementsFragment.f2(false);
                        }
                        break;
                }
                return Unit.f18162a;
            }
        });
        Va.f.f(((R0) G1()).f3880d, FieldType.SourceOfIncome.INSTANCE, new eb.g(1, X1(), InterfaceC1975b.class, "onIncomeSourceClicked", "onIncomeSourceClicked(Ljava/lang/Object;)V", 0, 22), new Function2(this) { // from class: yc.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaUnderWritingRequirementsFragment f21114b;

            {
                this.f21114b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                String strTnTj78 = numX49.tnTj78("bt9PW");
                MayaUnderWritingRequirementsFragment mayaUnderWritingRequirementsFragment = this.f21114b;
                String strTnTj782 = numX49.tnTj78("bt9b9");
                FieldType fieldType = (FieldType) obj;
                switch (i10) {
                    case 0:
                        List list = MayaUnderWritingRequirementsFragment.f14251d0;
                        kotlin.jvm.internal.j.g(fieldType, strTnTj782);
                        return mayaUnderWritingRequirementsFragment.W1(fieldType, obj2, new eb.f(2, mayaUnderWritingRequirementsFragment.X1(), InterfaceC1975b.class, numX49.tnTj78("bt9bd"), numX49.tnTj78("bt9bi"), 0, 21), mayaUnderWritingRequirementsFragment.f14257c0);
                    case 1:
                        List list2 = MayaUnderWritingRequirementsFragment.f14251d0;
                        kotlin.jvm.internal.j.g(fieldType, strTnTj782);
                        return mayaUnderWritingRequirementsFragment.W1(fieldType, obj2, new eb.f(2, mayaUnderWritingRequirementsFragment.X1(), InterfaceC1975b.class, numX49.tnTj78("bt9bS"), numX49.tnTj78("bt9bj"), 0, 22), mayaUnderWritingRequirementsFragment.f14257c0);
                    case 2:
                        List list3 = MayaUnderWritingRequirementsFragment.f14251d0;
                        kotlin.jvm.internal.j.g(fieldType, strTnTj782);
                        return mayaUnderWritingRequirementsFragment.W1(fieldType, obj2, new eb.f(2, mayaUnderWritingRequirementsFragment.X1(), InterfaceC1975b.class, numX49.tnTj78("bt9bu"), numX49.tnTj78("bt9bV"), 0, 23), mayaUnderWritingRequirementsFragment.f14257c0);
                    case 3:
                        String str2 = (String) obj2;
                        List list4 = MayaUnderWritingRequirementsFragment.f14251d0;
                        kotlin.jvm.internal.j.g(fieldType, strTnTj782);
                        kotlin.jvm.internal.j.g(str2, strTnTj78);
                        return mayaUnderWritingRequirementsFragment.V1(fieldType, str2, new eb.f(2, mayaUnderWritingRequirementsFragment.X1(), InterfaceC1975b.class, numX49.tnTj78("bt9bk"), numX49.tnTj78("bt9bB"), 0, 17), mayaUnderWritingRequirementsFragment.f14257c0);
                    case 4:
                        String str3 = (String) obj2;
                        List list5 = MayaUnderWritingRequirementsFragment.f14251d0;
                        kotlin.jvm.internal.j.g(fieldType, strTnTj782);
                        kotlin.jvm.internal.j.g(str3, strTnTj78);
                        return mayaUnderWritingRequirementsFragment.V1(fieldType, str3, new eb.f(2, mayaUnderWritingRequirementsFragment.X1(), InterfaceC1975b.class, numX49.tnTj78("bt9br"), numX49.tnTj78("bt9bZ"), 0, 18), mayaUnderWritingRequirementsFragment.f14257c0);
                    case 5:
                        String str4 = (String) obj2;
                        List list6 = MayaUnderWritingRequirementsFragment.f14251d0;
                        kotlin.jvm.internal.j.g(fieldType, strTnTj782);
                        kotlin.jvm.internal.j.g(str4, strTnTj78);
                        return mayaUnderWritingRequirementsFragment.V1(fieldType, str4, new eb.f(2, mayaUnderWritingRequirementsFragment.X1(), InterfaceC1975b.class, numX49.tnTj78("bt9b2"), numX49.tnTj78("bt9bL"), 0, 19), mayaUnderWritingRequirementsFragment.f14257c0);
                    default:
                        String str5 = (String) obj2;
                        List list7 = MayaUnderWritingRequirementsFragment.f14251d0;
                        kotlin.jvm.internal.j.g(fieldType, strTnTj782);
                        kotlin.jvm.internal.j.g(str5, strTnTj78);
                        return mayaUnderWritingRequirementsFragment.V1(fieldType, str5, new eb.f(2, mayaUnderWritingRequirementsFragment.X1(), InterfaceC1975b.class, numX49.tnTj78("bt9bP"), numX49.tnTj78("bt9bb"), 0, 20), mayaUnderWritingRequirementsFragment.f14257c0);
                }
            }
        }, new Function1(this) { // from class: yc.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaUnderWritingRequirementsFragment f21118b;

            {
                this.f21118b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                MayaUnderWritingRequirementsFragment mayaUnderWritingRequirementsFragment = this.f21118b;
                int i13 = i10;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                switch (i13) {
                    case 0:
                        List list = MayaUnderWritingRequirementsFragment.f14251d0;
                        if (zBooleanValue) {
                            mayaUnderWritingRequirementsFragment.f2(false);
                        }
                        break;
                    case 1:
                        List list2 = MayaUnderWritingRequirementsFragment.f14251d0;
                        if (zBooleanValue) {
                            mayaUnderWritingRequirementsFragment.f2(false);
                        }
                        break;
                    default:
                        List list3 = MayaUnderWritingRequirementsFragment.f14251d0;
                        if (zBooleanValue) {
                            mayaUnderWritingRequirementsFragment.f2(false);
                        }
                        break;
                }
                return Unit.f18162a;
            }
        });
        Va.f.f(((R0) G1()).f3879b, FieldType.JobTitle.INSTANCE, new eb.g(1, X1(), InterfaceC1975b.class, "onJobTitleClicked", "onJobTitleClicked(Ljava/lang/Object;)V", 0, 23), new Function2(this) { // from class: yc.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaUnderWritingRequirementsFragment f21114b;

            {
                this.f21114b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                String strTnTj78 = numX49.tnTj78("bt9PW");
                MayaUnderWritingRequirementsFragment mayaUnderWritingRequirementsFragment = this.f21114b;
                String strTnTj782 = numX49.tnTj78("bt9b9");
                FieldType fieldType = (FieldType) obj;
                switch (i11) {
                    case 0:
                        List list = MayaUnderWritingRequirementsFragment.f14251d0;
                        kotlin.jvm.internal.j.g(fieldType, strTnTj782);
                        return mayaUnderWritingRequirementsFragment.W1(fieldType, obj2, new eb.f(2, mayaUnderWritingRequirementsFragment.X1(), InterfaceC1975b.class, numX49.tnTj78("bt9bd"), numX49.tnTj78("bt9bi"), 0, 21), mayaUnderWritingRequirementsFragment.f14257c0);
                    case 1:
                        List list2 = MayaUnderWritingRequirementsFragment.f14251d0;
                        kotlin.jvm.internal.j.g(fieldType, strTnTj782);
                        return mayaUnderWritingRequirementsFragment.W1(fieldType, obj2, new eb.f(2, mayaUnderWritingRequirementsFragment.X1(), InterfaceC1975b.class, numX49.tnTj78("bt9bS"), numX49.tnTj78("bt9bj"), 0, 22), mayaUnderWritingRequirementsFragment.f14257c0);
                    case 2:
                        List list3 = MayaUnderWritingRequirementsFragment.f14251d0;
                        kotlin.jvm.internal.j.g(fieldType, strTnTj782);
                        return mayaUnderWritingRequirementsFragment.W1(fieldType, obj2, new eb.f(2, mayaUnderWritingRequirementsFragment.X1(), InterfaceC1975b.class, numX49.tnTj78("bt9bu"), numX49.tnTj78("bt9bV"), 0, 23), mayaUnderWritingRequirementsFragment.f14257c0);
                    case 3:
                        String str2 = (String) obj2;
                        List list4 = MayaUnderWritingRequirementsFragment.f14251d0;
                        kotlin.jvm.internal.j.g(fieldType, strTnTj782);
                        kotlin.jvm.internal.j.g(str2, strTnTj78);
                        return mayaUnderWritingRequirementsFragment.V1(fieldType, str2, new eb.f(2, mayaUnderWritingRequirementsFragment.X1(), InterfaceC1975b.class, numX49.tnTj78("bt9bk"), numX49.tnTj78("bt9bB"), 0, 17), mayaUnderWritingRequirementsFragment.f14257c0);
                    case 4:
                        String str3 = (String) obj2;
                        List list5 = MayaUnderWritingRequirementsFragment.f14251d0;
                        kotlin.jvm.internal.j.g(fieldType, strTnTj782);
                        kotlin.jvm.internal.j.g(str3, strTnTj78);
                        return mayaUnderWritingRequirementsFragment.V1(fieldType, str3, new eb.f(2, mayaUnderWritingRequirementsFragment.X1(), InterfaceC1975b.class, numX49.tnTj78("bt9br"), numX49.tnTj78("bt9bZ"), 0, 18), mayaUnderWritingRequirementsFragment.f14257c0);
                    case 5:
                        String str4 = (String) obj2;
                        List list6 = MayaUnderWritingRequirementsFragment.f14251d0;
                        kotlin.jvm.internal.j.g(fieldType, strTnTj782);
                        kotlin.jvm.internal.j.g(str4, strTnTj78);
                        return mayaUnderWritingRequirementsFragment.V1(fieldType, str4, new eb.f(2, mayaUnderWritingRequirementsFragment.X1(), InterfaceC1975b.class, numX49.tnTj78("bt9b2"), numX49.tnTj78("bt9bL"), 0, 19), mayaUnderWritingRequirementsFragment.f14257c0);
                    default:
                        String str5 = (String) obj2;
                        List list7 = MayaUnderWritingRequirementsFragment.f14251d0;
                        kotlin.jvm.internal.j.g(fieldType, strTnTj782);
                        kotlin.jvm.internal.j.g(str5, strTnTj78);
                        return mayaUnderWritingRequirementsFragment.V1(fieldType, str5, new eb.f(2, mayaUnderWritingRequirementsFragment.X1(), InterfaceC1975b.class, numX49.tnTj78("bt9bP"), numX49.tnTj78("bt9bb"), 0, 20), mayaUnderWritingRequirementsFragment.f14257c0);
                }
            }
        }, new Function1(this) { // from class: yc.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaUnderWritingRequirementsFragment f21118b;

            {
                this.f21118b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                MayaUnderWritingRequirementsFragment mayaUnderWritingRequirementsFragment = this.f21118b;
                int i13 = i11;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                switch (i13) {
                    case 0:
                        List list = MayaUnderWritingRequirementsFragment.f14251d0;
                        if (zBooleanValue) {
                            mayaUnderWritingRequirementsFragment.f2(false);
                        }
                        break;
                    case 1:
                        List list2 = MayaUnderWritingRequirementsFragment.f14251d0;
                        if (zBooleanValue) {
                            mayaUnderWritingRequirementsFragment.f2(false);
                        }
                        break;
                    default:
                        List list3 = MayaUnderWritingRequirementsFragment.f14251d0;
                        if (zBooleanValue) {
                            mayaUnderWritingRequirementsFragment.f2(false);
                        }
                        break;
                }
                return Unit.f18162a;
            }
        });
        final MayaProfileInputLayout mayaProfileInputLayout = ((R0) G1()).f;
        Va.f.e(mayaProfileInputLayout, FieldType.CompanyName.INSTANCE, new Function2(this) { // from class: yc.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaUnderWritingRequirementsFragment f21114b;

            {
                this.f21114b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                String strTnTj78 = numX49.tnTj78("bt9PW");
                MayaUnderWritingRequirementsFragment mayaUnderWritingRequirementsFragment = this.f21114b;
                String strTnTj782 = numX49.tnTj78("bt9b9");
                FieldType fieldType = (FieldType) obj;
                switch (i6) {
                    case 0:
                        List list = MayaUnderWritingRequirementsFragment.f14251d0;
                        kotlin.jvm.internal.j.g(fieldType, strTnTj782);
                        return mayaUnderWritingRequirementsFragment.W1(fieldType, obj2, new eb.f(2, mayaUnderWritingRequirementsFragment.X1(), InterfaceC1975b.class, numX49.tnTj78("bt9bd"), numX49.tnTj78("bt9bi"), 0, 21), mayaUnderWritingRequirementsFragment.f14257c0);
                    case 1:
                        List list2 = MayaUnderWritingRequirementsFragment.f14251d0;
                        kotlin.jvm.internal.j.g(fieldType, strTnTj782);
                        return mayaUnderWritingRequirementsFragment.W1(fieldType, obj2, new eb.f(2, mayaUnderWritingRequirementsFragment.X1(), InterfaceC1975b.class, numX49.tnTj78("bt9bS"), numX49.tnTj78("bt9bj"), 0, 22), mayaUnderWritingRequirementsFragment.f14257c0);
                    case 2:
                        List list3 = MayaUnderWritingRequirementsFragment.f14251d0;
                        kotlin.jvm.internal.j.g(fieldType, strTnTj782);
                        return mayaUnderWritingRequirementsFragment.W1(fieldType, obj2, new eb.f(2, mayaUnderWritingRequirementsFragment.X1(), InterfaceC1975b.class, numX49.tnTj78("bt9bu"), numX49.tnTj78("bt9bV"), 0, 23), mayaUnderWritingRequirementsFragment.f14257c0);
                    case 3:
                        String str2 = (String) obj2;
                        List list4 = MayaUnderWritingRequirementsFragment.f14251d0;
                        kotlin.jvm.internal.j.g(fieldType, strTnTj782);
                        kotlin.jvm.internal.j.g(str2, strTnTj78);
                        return mayaUnderWritingRequirementsFragment.V1(fieldType, str2, new eb.f(2, mayaUnderWritingRequirementsFragment.X1(), InterfaceC1975b.class, numX49.tnTj78("bt9bk"), numX49.tnTj78("bt9bB"), 0, 17), mayaUnderWritingRequirementsFragment.f14257c0);
                    case 4:
                        String str3 = (String) obj2;
                        List list5 = MayaUnderWritingRequirementsFragment.f14251d0;
                        kotlin.jvm.internal.j.g(fieldType, strTnTj782);
                        kotlin.jvm.internal.j.g(str3, strTnTj78);
                        return mayaUnderWritingRequirementsFragment.V1(fieldType, str3, new eb.f(2, mayaUnderWritingRequirementsFragment.X1(), InterfaceC1975b.class, numX49.tnTj78("bt9br"), numX49.tnTj78("bt9bZ"), 0, 18), mayaUnderWritingRequirementsFragment.f14257c0);
                    case 5:
                        String str4 = (String) obj2;
                        List list6 = MayaUnderWritingRequirementsFragment.f14251d0;
                        kotlin.jvm.internal.j.g(fieldType, strTnTj782);
                        kotlin.jvm.internal.j.g(str4, strTnTj78);
                        return mayaUnderWritingRequirementsFragment.V1(fieldType, str4, new eb.f(2, mayaUnderWritingRequirementsFragment.X1(), InterfaceC1975b.class, numX49.tnTj78("bt9b2"), numX49.tnTj78("bt9bL"), 0, 19), mayaUnderWritingRequirementsFragment.f14257c0);
                    default:
                        String str5 = (String) obj2;
                        List list7 = MayaUnderWritingRequirementsFragment.f14251d0;
                        kotlin.jvm.internal.j.g(fieldType, strTnTj782);
                        kotlin.jvm.internal.j.g(str5, strTnTj78);
                        return mayaUnderWritingRequirementsFragment.V1(fieldType, str5, new eb.f(2, mayaUnderWritingRequirementsFragment.X1(), InterfaceC1975b.class, numX49.tnTj78("bt9bP"), numX49.tnTj78("bt9bb"), 0, 20), mayaUnderWritingRequirementsFragment.f14257c0);
                }
            }
        }, null, new Function1(this) { // from class: yc.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaUnderWritingRequirementsFragment f21120b;

            {
                this.f21120b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean z4 = false;
                String strTnTj78 = numX49.tnTj78("bt91");
                MayaProfileInputLayout mayaProfileInputLayout2 = mayaProfileInputLayout;
                MayaUnderWritingRequirementsFragment mayaUnderWritingRequirementsFragment = this.f21120b;
                int i13 = i12;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                switch (i13) {
                    case 0:
                        List list = MayaUnderWritingRequirementsFragment.f14251d0;
                        if (zBooleanValue) {
                            mayaUnderWritingRequirementsFragment.f2(false);
                        } else {
                            mayaUnderWritingRequirementsFragment.T1(strTnTj78, ((R0) mayaUnderWritingRequirementsFragment.G1()).f.getLabelTextView().getText().toString(), (String) mayaProfileInputLayout2.getLastValidationResult().f18161b, ((Boolean) mayaProfileInputLayout2.getLastValidationResult().f18160a).booleanValue());
                        }
                        break;
                    case 1:
                        List list2 = MayaUnderWritingRequirementsFragment.f14251d0;
                        if (zBooleanValue) {
                            mayaUnderWritingRequirementsFragment.f2(false);
                        } else {
                            mayaProfileInputLayout2.getInputEditText().setText(AbstractC2250a.a(jk.b.p(mayaProfileInputLayout2)));
                            mayaUnderWritingRequirementsFragment.T1(strTnTj78, ((R0) mayaUnderWritingRequirementsFragment.G1()).f3881g.getLabelTextView().getText().toString(), (String) mayaProfileInputLayout2.getLastValidationResult().f18161b, ((Boolean) mayaProfileInputLayout2.getLastValidationResult().f18160a).booleanValue());
                        }
                        break;
                    case 2:
                        List list3 = MayaUnderWritingRequirementsFragment.f14251d0;
                        R0 r02 = (R0) mayaUnderWritingRequirementsFragment.G1();
                        if (jk.b.p(mayaProfileInputLayout2).length() > 0 && zBooleanValue) {
                            z4 = true;
                        }
                        r02.f3886p.setEnabled(z4);
                        mayaUnderWritingRequirementsFragment.f14257c0.f(FieldType.TIN.INSTANCE, zBooleanValue);
                        break;
                    case 3:
                        List list4 = MayaUnderWritingRequirementsFragment.f14251d0;
                        if (zBooleanValue) {
                            mayaUnderWritingRequirementsFragment.f2(true);
                            ((R0) mayaUnderWritingRequirementsFragment.G1()).f3886p.setText(mayaUnderWritingRequirementsFragment.getString(R.string.maya_update_enter_tin_label));
                            com.paymaya.common.utility.C.u0(mayaUnderWritingRequirementsFragment.getActivity(), mayaProfileInputLayout2);
                        } else {
                            mayaUnderWritingRequirementsFragment.T1(strTnTj78, ((R0) mayaUnderWritingRequirementsFragment.G1()).i.getLabelTextView().getText().toString(), (String) mayaProfileInputLayout2.getLastValidationResult().f18161b, ((Boolean) mayaProfileInputLayout2.getLastValidationResult().f18160a).booleanValue());
                        }
                        break;
                    case 4:
                        List list5 = MayaUnderWritingRequirementsFragment.f14251d0;
                        R0 r03 = (R0) mayaUnderWritingRequirementsFragment.G1();
                        if (jk.b.p(mayaProfileInputLayout2).length() > 0 && zBooleanValue) {
                            z4 = true;
                        }
                        r03.f3886p.setEnabled(z4);
                        mayaUnderWritingRequirementsFragment.f14257c0.f(FieldType.SSS.INSTANCE, zBooleanValue);
                        break;
                    default:
                        List list6 = MayaUnderWritingRequirementsFragment.f14251d0;
                        if (zBooleanValue) {
                            mayaUnderWritingRequirementsFragment.f2(true);
                            ((R0) mayaUnderWritingRequirementsFragment.G1()).f3886p.setText(mayaUnderWritingRequirementsFragment.getString(R.string.maya_update_enter_sss_number_label));
                            com.paymaya.common.utility.C.u0(mayaUnderWritingRequirementsFragment.getActivity(), mayaProfileInputLayout2);
                        } else {
                            mayaUnderWritingRequirementsFragment.T1(strTnTj78, ((R0) mayaUnderWritingRequirementsFragment.G1()).h.getLabelTextView().getText().toString(), (String) mayaProfileInputLayout2.getLastValidationResult().f18161b, ((Boolean) mayaProfileInputLayout2.getLastValidationResult().f18160a).booleanValue());
                        }
                        break;
                }
                return Unit.f18162a;
            }
        }, new C2525f(this, 2), 4);
        final MayaProfileInputLayout mayaProfileInputLayout2 = ((R0) G1()).f3881g;
        Va.f.e(mayaProfileInputLayout2, FieldType.MonthlyTakeHomePay.INSTANCE, new Function2(this) { // from class: yc.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaUnderWritingRequirementsFragment f21114b;

            {
                this.f21114b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                String strTnTj78 = numX49.tnTj78("bt9PW");
                MayaUnderWritingRequirementsFragment mayaUnderWritingRequirementsFragment = this.f21114b;
                String strTnTj782 = numX49.tnTj78("bt9b9");
                FieldType fieldType = (FieldType) obj;
                switch (i4) {
                    case 0:
                        List list = MayaUnderWritingRequirementsFragment.f14251d0;
                        kotlin.jvm.internal.j.g(fieldType, strTnTj782);
                        return mayaUnderWritingRequirementsFragment.W1(fieldType, obj2, new eb.f(2, mayaUnderWritingRequirementsFragment.X1(), InterfaceC1975b.class, numX49.tnTj78("bt9bd"), numX49.tnTj78("bt9bi"), 0, 21), mayaUnderWritingRequirementsFragment.f14257c0);
                    case 1:
                        List list2 = MayaUnderWritingRequirementsFragment.f14251d0;
                        kotlin.jvm.internal.j.g(fieldType, strTnTj782);
                        return mayaUnderWritingRequirementsFragment.W1(fieldType, obj2, new eb.f(2, mayaUnderWritingRequirementsFragment.X1(), InterfaceC1975b.class, numX49.tnTj78("bt9bS"), numX49.tnTj78("bt9bj"), 0, 22), mayaUnderWritingRequirementsFragment.f14257c0);
                    case 2:
                        List list3 = MayaUnderWritingRequirementsFragment.f14251d0;
                        kotlin.jvm.internal.j.g(fieldType, strTnTj782);
                        return mayaUnderWritingRequirementsFragment.W1(fieldType, obj2, new eb.f(2, mayaUnderWritingRequirementsFragment.X1(), InterfaceC1975b.class, numX49.tnTj78("bt9bu"), numX49.tnTj78("bt9bV"), 0, 23), mayaUnderWritingRequirementsFragment.f14257c0);
                    case 3:
                        String str2 = (String) obj2;
                        List list4 = MayaUnderWritingRequirementsFragment.f14251d0;
                        kotlin.jvm.internal.j.g(fieldType, strTnTj782);
                        kotlin.jvm.internal.j.g(str2, strTnTj78);
                        return mayaUnderWritingRequirementsFragment.V1(fieldType, str2, new eb.f(2, mayaUnderWritingRequirementsFragment.X1(), InterfaceC1975b.class, numX49.tnTj78("bt9bk"), numX49.tnTj78("bt9bB"), 0, 17), mayaUnderWritingRequirementsFragment.f14257c0);
                    case 4:
                        String str3 = (String) obj2;
                        List list5 = MayaUnderWritingRequirementsFragment.f14251d0;
                        kotlin.jvm.internal.j.g(fieldType, strTnTj782);
                        kotlin.jvm.internal.j.g(str3, strTnTj78);
                        return mayaUnderWritingRequirementsFragment.V1(fieldType, str3, new eb.f(2, mayaUnderWritingRequirementsFragment.X1(), InterfaceC1975b.class, numX49.tnTj78("bt9br"), numX49.tnTj78("bt9bZ"), 0, 18), mayaUnderWritingRequirementsFragment.f14257c0);
                    case 5:
                        String str4 = (String) obj2;
                        List list6 = MayaUnderWritingRequirementsFragment.f14251d0;
                        kotlin.jvm.internal.j.g(fieldType, strTnTj782);
                        kotlin.jvm.internal.j.g(str4, strTnTj78);
                        return mayaUnderWritingRequirementsFragment.V1(fieldType, str4, new eb.f(2, mayaUnderWritingRequirementsFragment.X1(), InterfaceC1975b.class, numX49.tnTj78("bt9b2"), numX49.tnTj78("bt9bL"), 0, 19), mayaUnderWritingRequirementsFragment.f14257c0);
                    default:
                        String str5 = (String) obj2;
                        List list7 = MayaUnderWritingRequirementsFragment.f14251d0;
                        kotlin.jvm.internal.j.g(fieldType, strTnTj782);
                        kotlin.jvm.internal.j.g(str5, strTnTj78);
                        return mayaUnderWritingRequirementsFragment.V1(fieldType, str5, new eb.f(2, mayaUnderWritingRequirementsFragment.X1(), InterfaceC1975b.class, numX49.tnTj78("bt9bP"), numX49.tnTj78("bt9bb"), 0, 20), mayaUnderWritingRequirementsFragment.f14257c0);
                }
            }
        }, null, new Function1(this) { // from class: yc.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaUnderWritingRequirementsFragment f21120b;

            {
                this.f21120b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean z4 = false;
                String strTnTj78 = numX49.tnTj78("bt91");
                MayaProfileInputLayout mayaProfileInputLayout22 = mayaProfileInputLayout2;
                MayaUnderWritingRequirementsFragment mayaUnderWritingRequirementsFragment = this.f21120b;
                int i13 = i10;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                switch (i13) {
                    case 0:
                        List list = MayaUnderWritingRequirementsFragment.f14251d0;
                        if (zBooleanValue) {
                            mayaUnderWritingRequirementsFragment.f2(false);
                        } else {
                            mayaUnderWritingRequirementsFragment.T1(strTnTj78, ((R0) mayaUnderWritingRequirementsFragment.G1()).f.getLabelTextView().getText().toString(), (String) mayaProfileInputLayout22.getLastValidationResult().f18161b, ((Boolean) mayaProfileInputLayout22.getLastValidationResult().f18160a).booleanValue());
                        }
                        break;
                    case 1:
                        List list2 = MayaUnderWritingRequirementsFragment.f14251d0;
                        if (zBooleanValue) {
                            mayaUnderWritingRequirementsFragment.f2(false);
                        } else {
                            mayaProfileInputLayout22.getInputEditText().setText(AbstractC2250a.a(jk.b.p(mayaProfileInputLayout22)));
                            mayaUnderWritingRequirementsFragment.T1(strTnTj78, ((R0) mayaUnderWritingRequirementsFragment.G1()).f3881g.getLabelTextView().getText().toString(), (String) mayaProfileInputLayout22.getLastValidationResult().f18161b, ((Boolean) mayaProfileInputLayout22.getLastValidationResult().f18160a).booleanValue());
                        }
                        break;
                    case 2:
                        List list3 = MayaUnderWritingRequirementsFragment.f14251d0;
                        R0 r02 = (R0) mayaUnderWritingRequirementsFragment.G1();
                        if (jk.b.p(mayaProfileInputLayout22).length() > 0 && zBooleanValue) {
                            z4 = true;
                        }
                        r02.f3886p.setEnabled(z4);
                        mayaUnderWritingRequirementsFragment.f14257c0.f(FieldType.TIN.INSTANCE, zBooleanValue);
                        break;
                    case 3:
                        List list4 = MayaUnderWritingRequirementsFragment.f14251d0;
                        if (zBooleanValue) {
                            mayaUnderWritingRequirementsFragment.f2(true);
                            ((R0) mayaUnderWritingRequirementsFragment.G1()).f3886p.setText(mayaUnderWritingRequirementsFragment.getString(R.string.maya_update_enter_tin_label));
                            com.paymaya.common.utility.C.u0(mayaUnderWritingRequirementsFragment.getActivity(), mayaProfileInputLayout22);
                        } else {
                            mayaUnderWritingRequirementsFragment.T1(strTnTj78, ((R0) mayaUnderWritingRequirementsFragment.G1()).i.getLabelTextView().getText().toString(), (String) mayaProfileInputLayout22.getLastValidationResult().f18161b, ((Boolean) mayaProfileInputLayout22.getLastValidationResult().f18160a).booleanValue());
                        }
                        break;
                    case 4:
                        List list5 = MayaUnderWritingRequirementsFragment.f14251d0;
                        R0 r03 = (R0) mayaUnderWritingRequirementsFragment.G1();
                        if (jk.b.p(mayaProfileInputLayout22).length() > 0 && zBooleanValue) {
                            z4 = true;
                        }
                        r03.f3886p.setEnabled(z4);
                        mayaUnderWritingRequirementsFragment.f14257c0.f(FieldType.SSS.INSTANCE, zBooleanValue);
                        break;
                    default:
                        List list6 = MayaUnderWritingRequirementsFragment.f14251d0;
                        if (zBooleanValue) {
                            mayaUnderWritingRequirementsFragment.f2(true);
                            ((R0) mayaUnderWritingRequirementsFragment.G1()).f3886p.setText(mayaUnderWritingRequirementsFragment.getString(R.string.maya_update_enter_sss_number_label));
                            com.paymaya.common.utility.C.u0(mayaUnderWritingRequirementsFragment.getActivity(), mayaProfileInputLayout22);
                        } else {
                            mayaUnderWritingRequirementsFragment.T1(strTnTj78, ((R0) mayaUnderWritingRequirementsFragment.G1()).h.getLabelTextView().getText().toString(), (String) mayaProfileInputLayout22.getLastValidationResult().f18161b, ((Boolean) mayaProfileInputLayout22.getLastValidationResult().f18160a).booleanValue());
                        }
                        break;
                }
                return Unit.f18162a;
            }
        }, new C2527h(this, mayaProfileInputLayout2, 2), 4);
        final MayaProfileInputLayout mayaProfileInputLayout3 = ((R0) G1()).i;
        FieldType.TIN tin = FieldType.TIN.INSTANCE;
        Va.f.g(tin, mayaProfileInputLayout3, new C2527h(this, mayaProfileInputLayout3, 3), new Function1(this) { // from class: yc.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaUnderWritingRequirementsFragment f21120b;

            {
                this.f21120b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean z4 = false;
                String strTnTj78 = numX49.tnTj78("bt91");
                MayaProfileInputLayout mayaProfileInputLayout22 = mayaProfileInputLayout3;
                MayaUnderWritingRequirementsFragment mayaUnderWritingRequirementsFragment = this.f21120b;
                int i13 = i11;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                switch (i13) {
                    case 0:
                        List list = MayaUnderWritingRequirementsFragment.f14251d0;
                        if (zBooleanValue) {
                            mayaUnderWritingRequirementsFragment.f2(false);
                        } else {
                            mayaUnderWritingRequirementsFragment.T1(strTnTj78, ((R0) mayaUnderWritingRequirementsFragment.G1()).f.getLabelTextView().getText().toString(), (String) mayaProfileInputLayout22.getLastValidationResult().f18161b, ((Boolean) mayaProfileInputLayout22.getLastValidationResult().f18160a).booleanValue());
                        }
                        break;
                    case 1:
                        List list2 = MayaUnderWritingRequirementsFragment.f14251d0;
                        if (zBooleanValue) {
                            mayaUnderWritingRequirementsFragment.f2(false);
                        } else {
                            mayaProfileInputLayout22.getInputEditText().setText(AbstractC2250a.a(jk.b.p(mayaProfileInputLayout22)));
                            mayaUnderWritingRequirementsFragment.T1(strTnTj78, ((R0) mayaUnderWritingRequirementsFragment.G1()).f3881g.getLabelTextView().getText().toString(), (String) mayaProfileInputLayout22.getLastValidationResult().f18161b, ((Boolean) mayaProfileInputLayout22.getLastValidationResult().f18160a).booleanValue());
                        }
                        break;
                    case 2:
                        List list3 = MayaUnderWritingRequirementsFragment.f14251d0;
                        R0 r02 = (R0) mayaUnderWritingRequirementsFragment.G1();
                        if (jk.b.p(mayaProfileInputLayout22).length() > 0 && zBooleanValue) {
                            z4 = true;
                        }
                        r02.f3886p.setEnabled(z4);
                        mayaUnderWritingRequirementsFragment.f14257c0.f(FieldType.TIN.INSTANCE, zBooleanValue);
                        break;
                    case 3:
                        List list4 = MayaUnderWritingRequirementsFragment.f14251d0;
                        if (zBooleanValue) {
                            mayaUnderWritingRequirementsFragment.f2(true);
                            ((R0) mayaUnderWritingRequirementsFragment.G1()).f3886p.setText(mayaUnderWritingRequirementsFragment.getString(R.string.maya_update_enter_tin_label));
                            com.paymaya.common.utility.C.u0(mayaUnderWritingRequirementsFragment.getActivity(), mayaProfileInputLayout22);
                        } else {
                            mayaUnderWritingRequirementsFragment.T1(strTnTj78, ((R0) mayaUnderWritingRequirementsFragment.G1()).i.getLabelTextView().getText().toString(), (String) mayaProfileInputLayout22.getLastValidationResult().f18161b, ((Boolean) mayaProfileInputLayout22.getLastValidationResult().f18160a).booleanValue());
                        }
                        break;
                    case 4:
                        List list5 = MayaUnderWritingRequirementsFragment.f14251d0;
                        R0 r03 = (R0) mayaUnderWritingRequirementsFragment.G1();
                        if (jk.b.p(mayaProfileInputLayout22).length() > 0 && zBooleanValue) {
                            z4 = true;
                        }
                        r03.f3886p.setEnabled(z4);
                        mayaUnderWritingRequirementsFragment.f14257c0.f(FieldType.SSS.INSTANCE, zBooleanValue);
                        break;
                    default:
                        List list6 = MayaUnderWritingRequirementsFragment.f14251d0;
                        if (zBooleanValue) {
                            mayaUnderWritingRequirementsFragment.f2(true);
                            ((R0) mayaUnderWritingRequirementsFragment.G1()).f3886p.setText(mayaUnderWritingRequirementsFragment.getString(R.string.maya_update_enter_sss_number_label));
                            com.paymaya.common.utility.C.u0(mayaUnderWritingRequirementsFragment.getActivity(), mayaProfileInputLayout22);
                        } else {
                            mayaUnderWritingRequirementsFragment.T1(strTnTj78, ((R0) mayaUnderWritingRequirementsFragment.G1()).h.getLabelTextView().getText().toString(), (String) mayaProfileInputLayout22.getLastValidationResult().f18161b, ((Boolean) mayaProfileInputLayout22.getLastValidationResult().f18160a).booleanValue());
                        }
                        break;
                }
                return Unit.f18162a;
            }
        }, new Function1(this) { // from class: yc.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaUnderWritingRequirementsFragment f21120b;

            {
                this.f21120b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean z4 = false;
                String strTnTj78 = numX49.tnTj78("bt91");
                MayaProfileInputLayout mayaProfileInputLayout22 = mayaProfileInputLayout3;
                MayaUnderWritingRequirementsFragment mayaUnderWritingRequirementsFragment = this.f21120b;
                int i13 = i6;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                switch (i13) {
                    case 0:
                        List list = MayaUnderWritingRequirementsFragment.f14251d0;
                        if (zBooleanValue) {
                            mayaUnderWritingRequirementsFragment.f2(false);
                        } else {
                            mayaUnderWritingRequirementsFragment.T1(strTnTj78, ((R0) mayaUnderWritingRequirementsFragment.G1()).f.getLabelTextView().getText().toString(), (String) mayaProfileInputLayout22.getLastValidationResult().f18161b, ((Boolean) mayaProfileInputLayout22.getLastValidationResult().f18160a).booleanValue());
                        }
                        break;
                    case 1:
                        List list2 = MayaUnderWritingRequirementsFragment.f14251d0;
                        if (zBooleanValue) {
                            mayaUnderWritingRequirementsFragment.f2(false);
                        } else {
                            mayaProfileInputLayout22.getInputEditText().setText(AbstractC2250a.a(jk.b.p(mayaProfileInputLayout22)));
                            mayaUnderWritingRequirementsFragment.T1(strTnTj78, ((R0) mayaUnderWritingRequirementsFragment.G1()).f3881g.getLabelTextView().getText().toString(), (String) mayaProfileInputLayout22.getLastValidationResult().f18161b, ((Boolean) mayaProfileInputLayout22.getLastValidationResult().f18160a).booleanValue());
                        }
                        break;
                    case 2:
                        List list3 = MayaUnderWritingRequirementsFragment.f14251d0;
                        R0 r02 = (R0) mayaUnderWritingRequirementsFragment.G1();
                        if (jk.b.p(mayaProfileInputLayout22).length() > 0 && zBooleanValue) {
                            z4 = true;
                        }
                        r02.f3886p.setEnabled(z4);
                        mayaUnderWritingRequirementsFragment.f14257c0.f(FieldType.TIN.INSTANCE, zBooleanValue);
                        break;
                    case 3:
                        List list4 = MayaUnderWritingRequirementsFragment.f14251d0;
                        if (zBooleanValue) {
                            mayaUnderWritingRequirementsFragment.f2(true);
                            ((R0) mayaUnderWritingRequirementsFragment.G1()).f3886p.setText(mayaUnderWritingRequirementsFragment.getString(R.string.maya_update_enter_tin_label));
                            com.paymaya.common.utility.C.u0(mayaUnderWritingRequirementsFragment.getActivity(), mayaProfileInputLayout22);
                        } else {
                            mayaUnderWritingRequirementsFragment.T1(strTnTj78, ((R0) mayaUnderWritingRequirementsFragment.G1()).i.getLabelTextView().getText().toString(), (String) mayaProfileInputLayout22.getLastValidationResult().f18161b, ((Boolean) mayaProfileInputLayout22.getLastValidationResult().f18160a).booleanValue());
                        }
                        break;
                    case 4:
                        List list5 = MayaUnderWritingRequirementsFragment.f14251d0;
                        R0 r03 = (R0) mayaUnderWritingRequirementsFragment.G1();
                        if (jk.b.p(mayaProfileInputLayout22).length() > 0 && zBooleanValue) {
                            z4 = true;
                        }
                        r03.f3886p.setEnabled(z4);
                        mayaUnderWritingRequirementsFragment.f14257c0.f(FieldType.SSS.INSTANCE, zBooleanValue);
                        break;
                    default:
                        List list6 = MayaUnderWritingRequirementsFragment.f14251d0;
                        if (zBooleanValue) {
                            mayaUnderWritingRequirementsFragment.f2(true);
                            ((R0) mayaUnderWritingRequirementsFragment.G1()).f3886p.setText(mayaUnderWritingRequirementsFragment.getString(R.string.maya_update_enter_sss_number_label));
                            com.paymaya.common.utility.C.u0(mayaUnderWritingRequirementsFragment.getActivity(), mayaProfileInputLayout22);
                        } else {
                            mayaUnderWritingRequirementsFragment.T1(strTnTj78, ((R0) mayaUnderWritingRequirementsFragment.G1()).h.getLabelTextView().getText().toString(), (String) mayaProfileInputLayout22.getLastValidationResult().f18161b, ((Boolean) mayaProfileInputLayout22.getLastValidationResult().f18160a).booleanValue());
                        }
                        break;
                }
                return Unit.f18162a;
            }
        }, new Function2(this) { // from class: yc.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaUnderWritingRequirementsFragment f21114b;

            {
                this.f21114b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                String strTnTj78 = numX49.tnTj78("bt9PW");
                MayaUnderWritingRequirementsFragment mayaUnderWritingRequirementsFragment = this.f21114b;
                String strTnTj782 = numX49.tnTj78("bt9b9");
                FieldType fieldType = (FieldType) obj;
                switch (i) {
                    case 0:
                        List list = MayaUnderWritingRequirementsFragment.f14251d0;
                        kotlin.jvm.internal.j.g(fieldType, strTnTj782);
                        return mayaUnderWritingRequirementsFragment.W1(fieldType, obj2, new eb.f(2, mayaUnderWritingRequirementsFragment.X1(), InterfaceC1975b.class, numX49.tnTj78("bt9bd"), numX49.tnTj78("bt9bi"), 0, 21), mayaUnderWritingRequirementsFragment.f14257c0);
                    case 1:
                        List list2 = MayaUnderWritingRequirementsFragment.f14251d0;
                        kotlin.jvm.internal.j.g(fieldType, strTnTj782);
                        return mayaUnderWritingRequirementsFragment.W1(fieldType, obj2, new eb.f(2, mayaUnderWritingRequirementsFragment.X1(), InterfaceC1975b.class, numX49.tnTj78("bt9bS"), numX49.tnTj78("bt9bj"), 0, 22), mayaUnderWritingRequirementsFragment.f14257c0);
                    case 2:
                        List list3 = MayaUnderWritingRequirementsFragment.f14251d0;
                        kotlin.jvm.internal.j.g(fieldType, strTnTj782);
                        return mayaUnderWritingRequirementsFragment.W1(fieldType, obj2, new eb.f(2, mayaUnderWritingRequirementsFragment.X1(), InterfaceC1975b.class, numX49.tnTj78("bt9bu"), numX49.tnTj78("bt9bV"), 0, 23), mayaUnderWritingRequirementsFragment.f14257c0);
                    case 3:
                        String str2 = (String) obj2;
                        List list4 = MayaUnderWritingRequirementsFragment.f14251d0;
                        kotlin.jvm.internal.j.g(fieldType, strTnTj782);
                        kotlin.jvm.internal.j.g(str2, strTnTj78);
                        return mayaUnderWritingRequirementsFragment.V1(fieldType, str2, new eb.f(2, mayaUnderWritingRequirementsFragment.X1(), InterfaceC1975b.class, numX49.tnTj78("bt9bk"), numX49.tnTj78("bt9bB"), 0, 17), mayaUnderWritingRequirementsFragment.f14257c0);
                    case 4:
                        String str3 = (String) obj2;
                        List list5 = MayaUnderWritingRequirementsFragment.f14251d0;
                        kotlin.jvm.internal.j.g(fieldType, strTnTj782);
                        kotlin.jvm.internal.j.g(str3, strTnTj78);
                        return mayaUnderWritingRequirementsFragment.V1(fieldType, str3, new eb.f(2, mayaUnderWritingRequirementsFragment.X1(), InterfaceC1975b.class, numX49.tnTj78("bt9br"), numX49.tnTj78("bt9bZ"), 0, 18), mayaUnderWritingRequirementsFragment.f14257c0);
                    case 5:
                        String str4 = (String) obj2;
                        List list6 = MayaUnderWritingRequirementsFragment.f14251d0;
                        kotlin.jvm.internal.j.g(fieldType, strTnTj782);
                        kotlin.jvm.internal.j.g(str4, strTnTj78);
                        return mayaUnderWritingRequirementsFragment.V1(fieldType, str4, new eb.f(2, mayaUnderWritingRequirementsFragment.X1(), InterfaceC1975b.class, numX49.tnTj78("bt9b2"), numX49.tnTj78("bt9bL"), 0, 19), mayaUnderWritingRequirementsFragment.f14257c0);
                    default:
                        String str5 = (String) obj2;
                        List list7 = MayaUnderWritingRequirementsFragment.f14251d0;
                        kotlin.jvm.internal.j.g(fieldType, strTnTj782);
                        kotlin.jvm.internal.j.g(str5, strTnTj78);
                        return mayaUnderWritingRequirementsFragment.V1(fieldType, str5, new eb.f(2, mayaUnderWritingRequirementsFragment.X1(), InterfaceC1975b.class, numX49.tnTj78("bt9bP"), numX49.tnTj78("bt9bb"), 0, 20), mayaUnderWritingRequirementsFragment.f14257c0);
                }
            }
        });
        final MayaProfileInputLayout mayaProfileInputLayout4 = ((R0) G1()).h;
        FieldType.SSS sss = FieldType.SSS.INSTANCE;
        final int i13 = 6;
        Va.f.g(sss, mayaProfileInputLayout4, new C2527h(this, mayaProfileInputLayout4, 0), new Function1(this) { // from class: yc.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaUnderWritingRequirementsFragment f21120b;

            {
                this.f21120b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean z4 = false;
                String strTnTj78 = numX49.tnTj78("bt91");
                MayaProfileInputLayout mayaProfileInputLayout22 = mayaProfileInputLayout4;
                MayaUnderWritingRequirementsFragment mayaUnderWritingRequirementsFragment = this.f21120b;
                int i132 = i4;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                switch (i132) {
                    case 0:
                        List list = MayaUnderWritingRequirementsFragment.f14251d0;
                        if (zBooleanValue) {
                            mayaUnderWritingRequirementsFragment.f2(false);
                        } else {
                            mayaUnderWritingRequirementsFragment.T1(strTnTj78, ((R0) mayaUnderWritingRequirementsFragment.G1()).f.getLabelTextView().getText().toString(), (String) mayaProfileInputLayout22.getLastValidationResult().f18161b, ((Boolean) mayaProfileInputLayout22.getLastValidationResult().f18160a).booleanValue());
                        }
                        break;
                    case 1:
                        List list2 = MayaUnderWritingRequirementsFragment.f14251d0;
                        if (zBooleanValue) {
                            mayaUnderWritingRequirementsFragment.f2(false);
                        } else {
                            mayaProfileInputLayout22.getInputEditText().setText(AbstractC2250a.a(jk.b.p(mayaProfileInputLayout22)));
                            mayaUnderWritingRequirementsFragment.T1(strTnTj78, ((R0) mayaUnderWritingRequirementsFragment.G1()).f3881g.getLabelTextView().getText().toString(), (String) mayaProfileInputLayout22.getLastValidationResult().f18161b, ((Boolean) mayaProfileInputLayout22.getLastValidationResult().f18160a).booleanValue());
                        }
                        break;
                    case 2:
                        List list3 = MayaUnderWritingRequirementsFragment.f14251d0;
                        R0 r02 = (R0) mayaUnderWritingRequirementsFragment.G1();
                        if (jk.b.p(mayaProfileInputLayout22).length() > 0 && zBooleanValue) {
                            z4 = true;
                        }
                        r02.f3886p.setEnabled(z4);
                        mayaUnderWritingRequirementsFragment.f14257c0.f(FieldType.TIN.INSTANCE, zBooleanValue);
                        break;
                    case 3:
                        List list4 = MayaUnderWritingRequirementsFragment.f14251d0;
                        if (zBooleanValue) {
                            mayaUnderWritingRequirementsFragment.f2(true);
                            ((R0) mayaUnderWritingRequirementsFragment.G1()).f3886p.setText(mayaUnderWritingRequirementsFragment.getString(R.string.maya_update_enter_tin_label));
                            com.paymaya.common.utility.C.u0(mayaUnderWritingRequirementsFragment.getActivity(), mayaProfileInputLayout22);
                        } else {
                            mayaUnderWritingRequirementsFragment.T1(strTnTj78, ((R0) mayaUnderWritingRequirementsFragment.G1()).i.getLabelTextView().getText().toString(), (String) mayaProfileInputLayout22.getLastValidationResult().f18161b, ((Boolean) mayaProfileInputLayout22.getLastValidationResult().f18160a).booleanValue());
                        }
                        break;
                    case 4:
                        List list5 = MayaUnderWritingRequirementsFragment.f14251d0;
                        R0 r03 = (R0) mayaUnderWritingRequirementsFragment.G1();
                        if (jk.b.p(mayaProfileInputLayout22).length() > 0 && zBooleanValue) {
                            z4 = true;
                        }
                        r03.f3886p.setEnabled(z4);
                        mayaUnderWritingRequirementsFragment.f14257c0.f(FieldType.SSS.INSTANCE, zBooleanValue);
                        break;
                    default:
                        List list6 = MayaUnderWritingRequirementsFragment.f14251d0;
                        if (zBooleanValue) {
                            mayaUnderWritingRequirementsFragment.f2(true);
                            ((R0) mayaUnderWritingRequirementsFragment.G1()).f3886p.setText(mayaUnderWritingRequirementsFragment.getString(R.string.maya_update_enter_sss_number_label));
                            com.paymaya.common.utility.C.u0(mayaUnderWritingRequirementsFragment.getActivity(), mayaProfileInputLayout22);
                        } else {
                            mayaUnderWritingRequirementsFragment.T1(strTnTj78, ((R0) mayaUnderWritingRequirementsFragment.G1()).h.getLabelTextView().getText().toString(), (String) mayaProfileInputLayout22.getLastValidationResult().f18161b, ((Boolean) mayaProfileInputLayout22.getLastValidationResult().f18160a).booleanValue());
                        }
                        break;
                }
                return Unit.f18162a;
            }
        }, new Function1(this) { // from class: yc.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaUnderWritingRequirementsFragment f21120b;

            {
                this.f21120b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean z4 = false;
                String strTnTj78 = numX49.tnTj78("bt91");
                MayaProfileInputLayout mayaProfileInputLayout22 = mayaProfileInputLayout4;
                MayaUnderWritingRequirementsFragment mayaUnderWritingRequirementsFragment = this.f21120b;
                int i132 = i;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                switch (i132) {
                    case 0:
                        List list = MayaUnderWritingRequirementsFragment.f14251d0;
                        if (zBooleanValue) {
                            mayaUnderWritingRequirementsFragment.f2(false);
                        } else {
                            mayaUnderWritingRequirementsFragment.T1(strTnTj78, ((R0) mayaUnderWritingRequirementsFragment.G1()).f.getLabelTextView().getText().toString(), (String) mayaProfileInputLayout22.getLastValidationResult().f18161b, ((Boolean) mayaProfileInputLayout22.getLastValidationResult().f18160a).booleanValue());
                        }
                        break;
                    case 1:
                        List list2 = MayaUnderWritingRequirementsFragment.f14251d0;
                        if (zBooleanValue) {
                            mayaUnderWritingRequirementsFragment.f2(false);
                        } else {
                            mayaProfileInputLayout22.getInputEditText().setText(AbstractC2250a.a(jk.b.p(mayaProfileInputLayout22)));
                            mayaUnderWritingRequirementsFragment.T1(strTnTj78, ((R0) mayaUnderWritingRequirementsFragment.G1()).f3881g.getLabelTextView().getText().toString(), (String) mayaProfileInputLayout22.getLastValidationResult().f18161b, ((Boolean) mayaProfileInputLayout22.getLastValidationResult().f18160a).booleanValue());
                        }
                        break;
                    case 2:
                        List list3 = MayaUnderWritingRequirementsFragment.f14251d0;
                        R0 r02 = (R0) mayaUnderWritingRequirementsFragment.G1();
                        if (jk.b.p(mayaProfileInputLayout22).length() > 0 && zBooleanValue) {
                            z4 = true;
                        }
                        r02.f3886p.setEnabled(z4);
                        mayaUnderWritingRequirementsFragment.f14257c0.f(FieldType.TIN.INSTANCE, zBooleanValue);
                        break;
                    case 3:
                        List list4 = MayaUnderWritingRequirementsFragment.f14251d0;
                        if (zBooleanValue) {
                            mayaUnderWritingRequirementsFragment.f2(true);
                            ((R0) mayaUnderWritingRequirementsFragment.G1()).f3886p.setText(mayaUnderWritingRequirementsFragment.getString(R.string.maya_update_enter_tin_label));
                            com.paymaya.common.utility.C.u0(mayaUnderWritingRequirementsFragment.getActivity(), mayaProfileInputLayout22);
                        } else {
                            mayaUnderWritingRequirementsFragment.T1(strTnTj78, ((R0) mayaUnderWritingRequirementsFragment.G1()).i.getLabelTextView().getText().toString(), (String) mayaProfileInputLayout22.getLastValidationResult().f18161b, ((Boolean) mayaProfileInputLayout22.getLastValidationResult().f18160a).booleanValue());
                        }
                        break;
                    case 4:
                        List list5 = MayaUnderWritingRequirementsFragment.f14251d0;
                        R0 r03 = (R0) mayaUnderWritingRequirementsFragment.G1();
                        if (jk.b.p(mayaProfileInputLayout22).length() > 0 && zBooleanValue) {
                            z4 = true;
                        }
                        r03.f3886p.setEnabled(z4);
                        mayaUnderWritingRequirementsFragment.f14257c0.f(FieldType.SSS.INSTANCE, zBooleanValue);
                        break;
                    default:
                        List list6 = MayaUnderWritingRequirementsFragment.f14251d0;
                        if (zBooleanValue) {
                            mayaUnderWritingRequirementsFragment.f2(true);
                            ((R0) mayaUnderWritingRequirementsFragment.G1()).f3886p.setText(mayaUnderWritingRequirementsFragment.getString(R.string.maya_update_enter_sss_number_label));
                            com.paymaya.common.utility.C.u0(mayaUnderWritingRequirementsFragment.getActivity(), mayaProfileInputLayout22);
                        } else {
                            mayaUnderWritingRequirementsFragment.T1(strTnTj78, ((R0) mayaUnderWritingRequirementsFragment.G1()).h.getLabelTextView().getText().toString(), (String) mayaProfileInputLayout22.getLastValidationResult().f18161b, ((Boolean) mayaProfileInputLayout22.getLastValidationResult().f18160a).booleanValue());
                        }
                        break;
                }
                return Unit.f18162a;
            }
        }, new Function2(this) { // from class: yc.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaUnderWritingRequirementsFragment f21114b;

            {
                this.f21114b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                String strTnTj78 = numX49.tnTj78("bt9PW");
                MayaUnderWritingRequirementsFragment mayaUnderWritingRequirementsFragment = this.f21114b;
                String strTnTj782 = numX49.tnTj78("bt9b9");
                FieldType fieldType = (FieldType) obj;
                switch (i13) {
                    case 0:
                        List list = MayaUnderWritingRequirementsFragment.f14251d0;
                        kotlin.jvm.internal.j.g(fieldType, strTnTj782);
                        return mayaUnderWritingRequirementsFragment.W1(fieldType, obj2, new eb.f(2, mayaUnderWritingRequirementsFragment.X1(), InterfaceC1975b.class, numX49.tnTj78("bt9bd"), numX49.tnTj78("bt9bi"), 0, 21), mayaUnderWritingRequirementsFragment.f14257c0);
                    case 1:
                        List list2 = MayaUnderWritingRequirementsFragment.f14251d0;
                        kotlin.jvm.internal.j.g(fieldType, strTnTj782);
                        return mayaUnderWritingRequirementsFragment.W1(fieldType, obj2, new eb.f(2, mayaUnderWritingRequirementsFragment.X1(), InterfaceC1975b.class, numX49.tnTj78("bt9bS"), numX49.tnTj78("bt9bj"), 0, 22), mayaUnderWritingRequirementsFragment.f14257c0);
                    case 2:
                        List list3 = MayaUnderWritingRequirementsFragment.f14251d0;
                        kotlin.jvm.internal.j.g(fieldType, strTnTj782);
                        return mayaUnderWritingRequirementsFragment.W1(fieldType, obj2, new eb.f(2, mayaUnderWritingRequirementsFragment.X1(), InterfaceC1975b.class, numX49.tnTj78("bt9bu"), numX49.tnTj78("bt9bV"), 0, 23), mayaUnderWritingRequirementsFragment.f14257c0);
                    case 3:
                        String str2 = (String) obj2;
                        List list4 = MayaUnderWritingRequirementsFragment.f14251d0;
                        kotlin.jvm.internal.j.g(fieldType, strTnTj782);
                        kotlin.jvm.internal.j.g(str2, strTnTj78);
                        return mayaUnderWritingRequirementsFragment.V1(fieldType, str2, new eb.f(2, mayaUnderWritingRequirementsFragment.X1(), InterfaceC1975b.class, numX49.tnTj78("bt9bk"), numX49.tnTj78("bt9bB"), 0, 17), mayaUnderWritingRequirementsFragment.f14257c0);
                    case 4:
                        String str3 = (String) obj2;
                        List list5 = MayaUnderWritingRequirementsFragment.f14251d0;
                        kotlin.jvm.internal.j.g(fieldType, strTnTj782);
                        kotlin.jvm.internal.j.g(str3, strTnTj78);
                        return mayaUnderWritingRequirementsFragment.V1(fieldType, str3, new eb.f(2, mayaUnderWritingRequirementsFragment.X1(), InterfaceC1975b.class, numX49.tnTj78("bt9br"), numX49.tnTj78("bt9bZ"), 0, 18), mayaUnderWritingRequirementsFragment.f14257c0);
                    case 5:
                        String str4 = (String) obj2;
                        List list6 = MayaUnderWritingRequirementsFragment.f14251d0;
                        kotlin.jvm.internal.j.g(fieldType, strTnTj782);
                        kotlin.jvm.internal.j.g(str4, strTnTj78);
                        return mayaUnderWritingRequirementsFragment.V1(fieldType, str4, new eb.f(2, mayaUnderWritingRequirementsFragment.X1(), InterfaceC1975b.class, numX49.tnTj78("bt9b2"), numX49.tnTj78("bt9bL"), 0, 19), mayaUnderWritingRequirementsFragment.f14257c0);
                    default:
                        String str5 = (String) obj2;
                        List list7 = MayaUnderWritingRequirementsFragment.f14251d0;
                        kotlin.jvm.internal.j.g(fieldType, strTnTj782);
                        kotlin.jvm.internal.j.g(str5, strTnTj78);
                        return mayaUnderWritingRequirementsFragment.V1(fieldType, str5, new eb.f(2, mayaUnderWritingRequirementsFragment.X1(), InterfaceC1975b.class, numX49.tnTj78("bt9bP"), numX49.tnTj78("bt9bb"), 0, 20), mayaUnderWritingRequirementsFragment.f14257c0);
                }
            }
        });
        ((R0) G1()).f3882k.setOnClickListener(new qf.d(this, 27));
        MayaProfileInputLayout mayaProfileInputLayout5 = ((R0) G1()).f3881g;
        mayaProfileInputLayout5.getInputEditText().addTextChangedListener(new C0251a(mayaProfileInputLayout5.getInputEditText()));
        MayaProfileInputLayout mayaProfileInputLayout6 = ((R0) G1()).i;
        mayaProfileInputLayout6.getInputEditText().addTextChangedListener(new C0251a(mayaProfileInputLayout6.getInputEditText(), f14251d0));
        MayaProfileInputLayout mayaProfileInputLayout7 = ((R0) G1()).h;
        mayaProfileInputLayout7.getInputEditText().addTextChangedListener(new C0251a(mayaProfileInputLayout7.getInputEditText(), f14252e0));
        TextView textView = ((R0) G1()).m;
        MayaProfileInputLayout mayaProfileInputLayout8 = ((R0) G1()).i;
        String string3 = getString(R.string.maya_update_enter_tin_label);
        j.f(string3, "getString(...)");
        d2(textView, mayaProfileInputLayout8, string3, tin);
        TextView textView2 = ((R0) G1()).f3883l;
        MayaProfileInputLayout mayaProfileInputLayout9 = ((R0) G1()).h;
        String string4 = getString(R.string.maya_update_enter_sss_number_label);
        j.f(string4, "getString(...)");
        d2(textView2, mayaProfileInputLayout9, string4, sss);
        Xh.i.E(this, z.a(MayaProfileUpdateSingleSelectionBottomSheetDialogFragment.class), new eb.g(1, this, MayaUnderWritingRequirementsFragment.class, "handleSingleSelectionResult", "handleSingleSelectionResult(Lcom/paymaya/domain/model/UpdateProfileSelectionItem;)V", 0, 20));
    }
}
