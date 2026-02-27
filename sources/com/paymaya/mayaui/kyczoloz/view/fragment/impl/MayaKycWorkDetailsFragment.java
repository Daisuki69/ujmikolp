package com.paymaya.mayaui.kyczoloz.view.fragment.impl;

import B5.g;
import B8.h;
import D8.Z;
import E1.c;
import E8.C;
import F8.f;
import G7.F;
import G8.a;
import H8.b;
import K8.T;
import M8.C0332a;
import M8.C0376l;
import M8.C0415v;
import M8.D2;
import M8.M1;
import M8.T2;
import M8.g3;
import M8.h3;
import M8.i3;
import N5.C0;
import N5.C0453g;
import N5.C0491z;
import Xh.i;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.navigation.NavArgsLazy;
import androidx.navigation.ViewKt;
import cj.C1112C;
import cj.L;
import cj.M;
import cj.t;
import com.paymaya.R;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.D;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.e0;
import com.paymaya.domain.model.FormattedQuestionnaireItem;
import com.paymaya.domain.model.KycDnfbpQuestionData;
import com.paymaya.domain.model.KycFieldType;
import com.paymaya.domain.model.KycIncomeSource;
import com.paymaya.domain.model.KycJobTitle;
import com.paymaya.domain.model.KycQuestion;
import com.paymaya.domain.model.KycSelectionItem;
import com.paymaya.domain.model.KycSelectionModel;
import com.paymaya.domain.model.KycWorkNature;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.base.MayaKycBaseFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycWorkDetailsFragment;
import com.paymaya.mayaui.kyczoloz.view.widget.KycMayaDropDown;
import com.paymaya.mayaui.kyczoloz.view.widget.KycMayaInputLayout;
import fh.C1485a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.y;
import kotlin.jvm.internal.z;
import of.p;
import y5.AbstractC2509a;
import y5.q;

/* JADX INFO: loaded from: classes4.dex */
public class MayaKycWorkDetailsFragment extends MayaKycBaseFragment<C0> implements T {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public Z f12655W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public e0 f12656X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public a f12657Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final NavArgsLazy f12658Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public KycFieldType f12659a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final C1485a f12660b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final D2 f12661c0;

    public MayaKycWorkDetailsFragment() {
        super(g3.f3307a);
        this.f12658Z = new NavArgsLazy(z.a(i3.class), new C0376l(this, 13));
        this.f12660b0 = new C1485a(0);
        this.f12661c0 = new D2(this, 3);
    }

    public static List M1(MayaKycWorkDetailsFragment mayaKycWorkDetailsFragment, ArrayList arrayList, List list, List list2, int i) {
        String strZ;
        Integer id;
        String strA;
        Integer id2;
        String strB;
        if ((i & 1) != 0) {
            arrayList = null;
        }
        if ((i & 2) != 0) {
            list = null;
        }
        if ((i & 4) != 0) {
            list2 = null;
        }
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList(t.l(arrayList, 10));
            for (KycWorkNature kycWorkNature : arrayList) {
                if (mayaKycWorkDetailsFragment.Q1()) {
                    h hVarN1 = mayaKycWorkDetailsFragment.N1();
                    Integer id3 = kycWorkNature.getId();
                    strB = ((Z) hVarN1).B(id3 != null ? id3.intValue() : -1);
                } else {
                    strB = null;
                }
                arrayList2.add(KycSelectionItem.Companion.toSelectionItem(kycWorkNature, strB));
            }
            return arrayList2;
        }
        if (list != null) {
            Object selectedData = ((C0) mayaKycWorkDetailsFragment.G1()).i.getSelectedData();
            KycWorkNature kycWorkNature2 = selectedData instanceof KycWorkNature ? (KycWorkNature) selectedData : null;
            int iIntValue = (kycWorkNature2 == null || (id2 = kycWorkNature2.getId()) == null) ? -1 : id2.intValue();
            List<KycJobTitle> list3 = list;
            ArrayList arrayList3 = new ArrayList(t.l(list3, 10));
            for (KycJobTitle kycJobTitle : list3) {
                if (mayaKycWorkDetailsFragment.Q1()) {
                    h hVarN12 = mayaKycWorkDetailsFragment.N1();
                    Integer id4 = kycJobTitle.getId();
                    strA = ((Z) hVarN12).A(iIntValue, id4 != null ? id4.intValue() : -1);
                } else {
                    strA = null;
                }
                arrayList3.add(KycSelectionItem.Companion.toSelectionItem(kycJobTitle, strA));
            }
            return arrayList3;
        }
        if (list2 == null) {
            return C1112C.f9377a;
        }
        Object selectedData2 = ((C0) mayaKycWorkDetailsFragment.G1()).i.getSelectedData();
        KycWorkNature kycWorkNature3 = selectedData2 instanceof KycWorkNature ? (KycWorkNature) selectedData2 : null;
        int iIntValue2 = (kycWorkNature3 == null || (id = kycWorkNature3.getId()) == null) ? -1 : id.intValue();
        List<KycIncomeSource> list4 = list2;
        ArrayList arrayList4 = new ArrayList(t.l(list4, 10));
        for (KycIncomeSource kycIncomeSource : list4) {
            if (mayaKycWorkDetailsFragment.Q1()) {
                h hVarN13 = mayaKycWorkDetailsFragment.N1();
                Integer id5 = kycIncomeSource.getId();
                strZ = ((Z) hVarN13).z(iIntValue2, id5 != null ? id5.intValue() : -1);
            } else {
                strZ = null;
            }
            arrayList4.add(KycSelectionItem.Companion.toSelectionItem(kycIncomeSource, strZ));
        }
        return arrayList4;
    }

    @Override // com.paymaya.mayaui.kyczoloz.view.fragment.base.MayaKycBaseFragment, L8.c
    public final boolean D() {
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        return ((MayaKycActivity) ((b) componentRequireActivity)).e2();
    }

    public final boolean K1() {
        return ((C0) G1()).i.d() && ((C0) G1()).j.d() && ((C0) G1()).h.b() && ((C0) G1()).f3569g.d();
    }

    public final void L1() {
        ((C0) G1()).j.setSelectedData(null);
        ((C0) G1()).j.setDisplayText("");
        ((C0) G1()).j.b();
    }

    public final h N1() {
        Z z4 = this.f12655W;
        if (z4 != null) {
            return z4;
        }
        j.n("mWorkDetailsFragmentPresenter");
        throw null;
    }

    public final void O1(String questionId, String str, View view) {
        ViewParent parent = view.getParent();
        LinearLayout linearLayout = parent instanceof LinearLayout ? (LinearLayout) parent : null;
        if (linearLayout != null) {
            LinearLayout linearLayout2 = (LinearLayout) linearLayout.findViewById(R.id.button_no);
            LinearLayout linearLayout3 = (LinearLayout) linearLayout.findViewById(R.id.button_yes);
            linearLayout2.setSelected(view.equals(linearLayout2));
            linearLayout3.setSelected(view.equals(linearLayout3));
        }
        Z z4 = (Z) N1();
        j.g(questionId, "questionId");
        LinkedHashMap linkedHashMap = z4.i;
        linkedHashMap.put(questionId, str);
        LinkedHashMap linkedHashMap2 = C.f1266a;
        C.b(M.m(linkedHashMap), "dnfbp_questions");
        ArrayList arrayList = new ArrayList();
        Iterator it = z4.q().iterator();
        while (true) {
            String str2 = "No";
            if (!it.hasNext()) {
                break;
            }
            KycDnfbpQuestionData kycDnfbpQuestionData = (KycDnfbpQuestionData) it.next();
            String str3 = (String) linkedHashMap.get(kycDnfbpQuestionData.getQuestionId());
            if (str3 != null) {
                KycQuestion question = kycDnfbpQuestionData.getQuestion();
                if (str3.equals("YES")) {
                    str2 = "Yes";
                } else if (!str3.equals("NO")) {
                    str2 = str3;
                }
                arrayList.add(new FormattedQuestionnaireItem(question.getMainQuestion(), question.getSubQuestions(), str2));
            }
        }
        if (arrayList.isEmpty()) {
            C.f1266a.remove("formatted_questionnaire_for_submission");
        } else {
            C.b(arrayList, "formatted_questionnaire_for_submission");
        }
        z4.m();
        z4.l();
        if (str.equals("NO")) {
            str = "No";
        } else if (str.equals("YES")) {
            str = "Yes";
        }
        T2.O(this, null, null, null, M.h(new Pair(EnumC1212a.BUTTON, str), new Pair(EnumC1212a.DOC_REQUIRED, ((Z) N1()).y())), 79);
    }

    public final void P1(KycFieldType fieldType) {
        j.g(fieldType, "fieldType");
        int i = h3.f3312a[fieldType.ordinal()];
        if (i == 1) {
            ((C0) G1()).i.c();
        } else if (i == 2) {
            ((C0) G1()).f3569g.c();
        } else {
            if (i != 3) {
                return;
            }
            ((C0) G1()).j.c();
        }
    }

    public final boolean Q1() {
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        return ((MayaKycActivity) ((b) componentRequireActivity)).f2();
    }

    public final void R1(KycSelectionModel kycSelectionModel) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("uiModel", kycSelectionModel);
        ConstraintLayout constraintLayout = ((C0) G1()).f3566a;
        j.f(constraintLayout, "getRoot(...)");
        c.l(ViewKt.findNavController(constraintLayout), R.id.maya_kyc_work_details_fragment, R.id.action_maya_kyc_work_details_fragment_to_maya_kyc_single_selection_bottom_sheet_dialog_fragment, bundle);
    }

    public final void S1(KycJobTitle kycJobTitle) {
        ((C0) G1()).f3569g.setSelectedData(kycJobTitle);
        ((C0) G1()).f3569g.setDisplayText(kycJobTitle.getName());
        ((C0) G1()).f3569g.b();
    }

    public final void T1(KycWorkNature kycWorkNature) {
        ((C0) G1()).i.setSelectedData(kycWorkNature);
        ((C0) G1()).i.setDisplayText(kycWorkNature.getName());
        ((C0) G1()).i.b();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.WORK_INFORMATION;
    }

    public final void U1(KycIncomeSource kycIncomeSource) {
        ((C0) G1()).j.setSelectedData(kycIncomeSource);
        ((C0) G1()).j.setDisplayText(kycIncomeSource.getName());
        ((C0) G1()).j.b();
    }

    public final void V1(KycFieldType fieldType, String message) {
        j.g(fieldType, "fieldType");
        j.g(message, "message");
        y yVar = new y();
        yVar.f18195a = "";
        int i = h3.f3312a[fieldType.ordinal()];
        if (i == 1) {
            ((C0) G1()).i.i();
            ((C0) G1()).i.setWarningText(message);
            String labelText = ((C0) G1()).i.getLabelText();
            yVar.f18195a = labelText != null ? labelText : "";
        } else if (i == 2) {
            ((C0) G1()).f3569g.i();
            ((C0) G1()).f3569g.setWarningText(message);
            String labelText2 = ((C0) G1()).f3569g.getLabelText();
            yVar.f18195a = labelText2 != null ? labelText2 : "";
        } else if (i == 3) {
            ((C0) G1()).j.i();
            ((C0) G1()).j.setWarningText(message);
            String labelText3 = ((C0) G1()).j.getLabelText();
            yVar.f18195a = labelText3 != null ? labelText3 : "";
        }
        if (((CharSequence) yVar.f18195a).length() > 0) {
            new Handler(Looper.getMainLooper()).postDelayed(new g(9, this, yVar), 100L);
        }
    }

    public final void W1() {
        boolean z4 = ((C0) G1()).i.f12671U != null;
        boolean z5 = ((C0) G1()).f3569g.f12671U != null;
        ((C0) G1()).f3569g.setEnabled(z4);
        ((C0) G1()).j.setEnabled(z5);
        ((C0) G1()).h.setEnabled(z4);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        O5.a aVar = (O5.a) W4.a.e().f().c;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        e0 resourceManager = (e0) aVar.f4685S.get();
        j.g(resourceManager, "resourceManager");
        this.f12655W = new Z(resourceManager);
        this.f12656X = (e0) aVar.f4685S.get();
        ((AbstractC2509a) N1()).h(this);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C1485a c1485a = this.f12660b0;
        if (!c1485a.f16758b) {
            synchronized (c1485a) {
                try {
                    if (!c1485a.f16758b) {
                        Qh.h hVar = (Qh.h) c1485a.c;
                        c1485a.c = null;
                        C1485a.e(hVar);
                    }
                } finally {
                }
            }
        }
        ((AbstractC2509a) N1()).i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseBindingFragment, com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f12661c0.remove();
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        ((MayaKycActivity) ((b) componentRequireActivity)).o2(R.drawable.maya_ic_navigation_back);
        super.onDestroyView();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Map mapC = L.c(new Pair(EnumC1212a.IS_PREFILL_WORK, "F"));
        String sourcePage = T2.y(this);
        String pageName = T2.j(this);
        j.g(sourcePage, "sourcePage");
        j.g(pageName, "pageName");
        D.c(O(), EnumC1216e.WORK_INFORMATION, 4, M.h(new Pair(EnumC1212a.SOURCE_PAGE, sourcePage), new Pair(EnumC1212a.PAGE_NAME, pageName)), null, new L8.a(this, mapC, 4), new L8.b(this, 5), 16);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        requireActivity().getOnBackPressedDispatcher().addCallback(this.f12661c0);
        Object objRequireActivity = requireActivity();
        j.e(objRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        Object obj = (b) objRequireActivity;
        MayaKycActivity mayaKycActivity = (MayaKycActivity) obj;
        mayaKycActivity.t2();
        e0 e0Var = this.f12656X;
        if (e0Var == null) {
            j.n("resourceManager");
            throw null;
        }
        mayaKycActivity.r2(ContextCompat.getColor(e0Var.f10905a, R.color.ghost_white));
        e0 e0Var2 = this.f12656X;
        if (e0Var2 == null) {
            j.n("resourceManager");
            throw null;
        }
        ((q) obj).N1(ContextCompat.getColor(e0Var2.f10905a, R.color.ghost_white));
        if (j.b(((i3) this.f12658Z.getValue()).a(), "confirm_submission")) {
            C0453g c0453g = mayaKycActivity.f12451s;
            j.d(c0453g);
            ((Toolbar) ((C0491z) c0453g.f4095d).e).setNavigationIcon((Drawable) null);
        } else {
            mayaKycActivity.o2(R.drawable.maya_ic_navigation_back);
            mayaKycActivity.p2(new M8.L(this, 19));
        }
        mayaKycActivity.t1();
        mayaKycActivity.s1();
        mayaKycActivity.r1();
        Context contextRequireContext = requireContext();
        j.f(contextRequireContext, "requireContext(...)");
        this.f12657Y = new a(contextRequireContext, new C0415v(2, this, MayaKycWorkDetailsFragment.class, "triggerErrorAppearedEvent", "triggerErrorAppearedEvent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Z)V", 0, 7), new F(16));
        KycMayaDropDown kycMayaDropDown = ((C0) G1()).i;
        KycFieldType kycFieldType = KycFieldType.WORK_NATION;
        a aVar = this.f12657Y;
        if (aVar == null) {
            j.n("errorMessageProvider");
            throw null;
        }
        final int i = 0;
        p.D(kycMayaDropDown, kycFieldType, aVar, new M8.T(2, N1(), h.class, "validateField", "validateField(Lcom/paymaya/domain/model/KycFieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/KycValidationResult;", 0, 21), new Function1(this) { // from class: M8.e3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaKycWorkDetailsFragment f3294b;

            {
                this.f3294b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r11) {
                /*
                    Method dump skipped, instruction units count: 398
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: M8.e3.invoke(java.lang.Object):java.lang.Object");
            }
        });
        KycMayaDropDown kycMayaDropDown2 = ((C0) G1()).f3569g;
        KycFieldType kycFieldType2 = KycFieldType.JOB_TITLE;
        a aVar2 = this.f12657Y;
        if (aVar2 == null) {
            j.n("errorMessageProvider");
            throw null;
        }
        final int i4 = 1;
        p.D(kycMayaDropDown2, kycFieldType2, aVar2, new M8.T(2, N1(), h.class, "validateField", "validateField(Lcom/paymaya/domain/model/KycFieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/KycValidationResult;", 0, 22), new Function1(this) { // from class: M8.e3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaKycWorkDetailsFragment f3294b;

            {
                this.f3294b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r11) {
                /*
                    Method dump skipped, instruction units count: 398
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: M8.e3.invoke(java.lang.Object):java.lang.Object");
            }
        });
        KycMayaDropDown kycMayaDropDown3 = ((C0) G1()).j;
        KycFieldType kycFieldType3 = KycFieldType.INCOME_SOURCE;
        a aVar3 = this.f12657Y;
        if (aVar3 == null) {
            j.n("errorMessageProvider");
            throw null;
        }
        final int i6 = 2;
        p.D(kycMayaDropDown3, kycFieldType3, aVar3, new M8.T(2, N1(), h.class, "validateField", "validateField(Lcom/paymaya/domain/model/KycFieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/KycValidationResult;", 0, 23), new Function1(this) { // from class: M8.e3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaKycWorkDetailsFragment f3294b;

            {
                this.f3294b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r11) {
                /*
                    Method dump skipped, instruction units count: 398
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: M8.e3.invoke(java.lang.Object):java.lang.Object");
            }
        });
        KycMayaInputLayout kycMayaInputLayout = ((C0) G1()).h;
        KycFieldType kycFieldType4 = KycFieldType.COMPANY_NAME;
        a aVar4 = this.f12657Y;
        if (aVar4 == null) {
            j.n("errorMessageProvider");
            throw null;
        }
        final int i10 = 3;
        f.b(aVar4, kycFieldType4, kycMayaInputLayout, new Function1(this) { // from class: M8.e3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaKycWorkDetailsFragment f3294b;

            {
                this.f3294b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r11) {
                /*
                    Method dump skipped, instruction units count: 398
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: M8.e3.invoke(java.lang.Object):java.lang.Object");
            }
        }, new M8.T(2, N1(), h.class, "validateField", "validateField(Lcom/paymaya/domain/model/KycFieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/KycValidationResult;", 0, 24));
        ((C0) G1()).h.getInputEditText().setFilters(com.paymaya.common.utility.C.G());
        ((C0) G1()).i.setEnabled(true);
        ((C0) G1()).f3569g.setEnabled(false);
        ((C0) G1()).j.setEnabled(false);
        ((C0) G1()).h.setEnabled(false);
        Ke.b.b(((C0) G1()).f.c, new C0332a(this, 15));
        i.E(this, z.a(MayaKycSingleSelectionBottomSheetDialogFragment.class), new M1(1, this, MayaKycWorkDetailsFragment.class, "handleSelectionResult", "handleSelectionResult(Lcom/paymaya/domain/model/KycSelectionItem;)V", 0, 15));
        ((Z) N1()).j();
    }
}
