package D8;

import M8.T2;
import N5.C0;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.KeyEventDispatcher;
import androidx.navigation.ViewKt;
import cj.C1112C;
import cj.C1132s;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.e0;
import com.paymaya.domain.model.KycCmsContent;
import com.paymaya.domain.model.KycCmsContentData;
import com.paymaya.domain.model.KycDnfbpGuide;
import com.paymaya.domain.model.KycDnfbpQuestionData;
import com.paymaya.domain.model.KycFieldType;
import com.paymaya.domain.model.KycIncomeSource;
import com.paymaya.domain.model.KycIncomeSources;
import com.paymaya.domain.model.KycJobTitle;
import com.paymaya.domain.model.KycJobTitles;
import com.paymaya.domain.model.KycOption;
import com.paymaya.domain.model.KycQuestion;
import com.paymaya.domain.model.KycToolTip;
import com.paymaya.domain.model.KycValidationResult;
import com.paymaya.domain.model.KycValidationRule;
import com.paymaya.domain.model.KycWorkNature;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycWorkDetailsFragment;
import dOYHB6.lN8Dz0.d8NVX3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import y5.AbstractC2509a;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class Z extends AbstractC2509a implements B8.h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public KycWorkNature f1030d;
    public KycJobTitle e;
    public KycIncomeSource f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public KycDnfbpGuide f1031g;
    public boolean h;
    public final LinkedHashMap i = new LinkedHashMap();

    public Z(e0 e0Var) {
    }

    public static boolean G(KycQuestion kycQuestion) {
        String mainQuestion = kycQuestion.getMainQuestion();
        if (mainQuestion != null && mainQuestion.length() != 0) {
            return true;
        }
        List<String> subQuestions = kycQuestion.getSubQuestions();
        return (subQuestions == null || subQuestions.isEmpty()) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String v(com.paymaya.domain.model.KycQuestion r4) {
        /*
            r0 = 0
            if (r4 == 0) goto L8
            java.lang.String r1 = r4.getMainQuestion()
            goto L9
        L8:
            r1 = r0
        L9:
            if (r1 == 0) goto L11
            int r1 = r1.length()
            if (r1 != 0) goto L6c
        L11:
            if (r4 == 0) goto L18
            java.util.List r1 = r4.getSubQuestions()
            goto L19
        L18:
            r1 = r0
        L19:
            java.util.Collection r1 = (java.util.Collection) r1
            if (r1 == 0) goto L23
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L6c
        L23:
            if (r4 == 0) goto L61
            java.util.List r4 = r4.getOptions()
            if (r4 == 0) goto L61
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L31:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L57
            java.lang.Object r1 = r4.next()
            r2 = r1
            com.paymaya.domain.model.KycOption r2 = (com.paymaya.domain.model.KycOption) r2
            java.lang.String r3 = r2.getName()
            if (r3 == 0) goto L4a
            int r3 = r3.length()
            if (r3 != 0) goto L31
        L4a:
            java.lang.String r2 = r2.getToolTip()
            if (r2 == 0) goto L31
            int r2 = r2.length()
            if (r2 != 0) goto L58
            goto L31
        L57:
            r1 = r0
        L58:
            com.paymaya.domain.model.KycOption r1 = (com.paymaya.domain.model.KycOption) r1
            if (r1 == 0) goto L61
            java.lang.String r4 = r1.getToolTip()
            goto L62
        L61:
            r4 = r0
        L62:
            if (r4 == 0) goto L6c
            int r1 = r4.length()
            if (r1 != 0) goto L6b
            goto L6c
        L6b:
            return r4
        L6c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: D8.Z.v(com.paymaya.domain.model.KycQuestion):java.lang.String");
    }

    public final String A(int i, int i4) {
        Object next;
        List<KycJobTitles> jobTitles;
        Object next2;
        KycToolTip toolTip;
        Integer id;
        Integer id2;
        Iterator it = r().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            KycWorkNature workNature = ((KycDnfbpGuide) next).getWorkNature();
            if (workNature != null && (id2 = workNature.getId()) != null && id2.intValue() == i) {
                break;
            }
        }
        KycDnfbpGuide kycDnfbpGuide = (KycDnfbpGuide) next;
        if (kycDnfbpGuide != null && (jobTitles = kycDnfbpGuide.getJobTitles()) != null) {
            Iterator<T> it2 = jobTitles.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                KycJobTitle jobTitle = ((KycJobTitles) next2).getJobTitle();
                if (jobTitle != null && (id = jobTitle.getId()) != null && id.intValue() == i4) {
                    break;
                }
            }
            KycJobTitles kycJobTitles = (KycJobTitles) next2;
            if (kycJobTitles != null && (toolTip = kycJobTitles.getToolTip()) != null) {
                return toolTip.getDescription();
            }
        }
        return null;
    }

    public final String B(int i) {
        Object next;
        KycToolTip toolTip;
        Integer id;
        Iterator it = r().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            KycWorkNature workNature = ((KycDnfbpGuide) next).getWorkNature();
            if (workNature != null && (id = workNature.getId()) != null && id.intValue() == i) {
                break;
            }
        }
        KycDnfbpGuide kycDnfbpGuide = (KycDnfbpGuide) next;
        if (kycDnfbpGuide == null || (toolTip = kycDnfbpGuide.getToolTip()) == null) {
            return null;
        }
        return toolTip.getDescription();
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map C(java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D8.Z.C(java.lang.String):java.util.Map");
    }

    public final ArrayList D() {
        List listR = r();
        ArrayList arrayList = new ArrayList();
        Iterator it = listR.iterator();
        while (it.hasNext()) {
            KycWorkNature workNature = ((KycDnfbpGuide) it.next()).getWorkNature();
            if (workNature != null) {
                arrayList.add(workNature);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (hashSet.add(((KycWorkNature) obj).getId())) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public final void E(String str) {
        if (str.equals("source_secondary_id_screen")) {
            ConstraintLayout constraintLayout = ((C0) ((MayaKycWorkDetailsFragment) ((K8.T) this.c.get())).G1()).f3566a;
            kotlin.jvm.internal.j.f(constraintLayout, "getRoot(...)");
            ViewKt.findNavController(constraintLayout).popBackStack(R.id.maya_kyc_submit_secondary_id_fragment, false);
            return;
        }
        MayaKycWorkDetailsFragment mayaKycWorkDetailsFragment = (MayaKycWorkDetailsFragment) ((K8.T) this.c.get());
        String string = mayaKycWorkDetailsFragment.getString(R.string.maya_kyc_generic_back_label);
        kotlin.jvm.internal.j.f(string, "getString(...)");
        T2.O(mayaKycWorkDetailsFragment, string, T2.j(mayaKycWorkDetailsFragment), T2.y(mayaKycWorkDetailsFragment), cj.L.c(new Pair(EnumC1212a.BUTTON, string)), 82);
        KeyEventDispatcher.Component componentRequireActivity = mayaKycWorkDetailsFragment.requireActivity();
        kotlin.jvm.internal.j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        ((MayaKycActivity) ((H8.b) componentRequireActivity)).i2(true);
    }

    public final boolean F() {
        Integer id;
        KycWorkNature kycWorkNature = this.f1030d;
        if (kycWorkNature != null && (id = kycWorkNature.getId()) != null && u(id.intValue()) != null) {
            return true;
        }
        KycJobTitle kycJobTitle = this.e;
        if ((kycJobTitle != null ? kycJobTitle.getId() : null) != null) {
            KycWorkNature kycWorkNature2 = this.f1030d;
            if ((kycWorkNature2 != null ? kycWorkNature2.getId() : null) != null) {
                KycWorkNature kycWorkNature3 = this.f1030d;
                kotlin.jvm.internal.j.d(kycWorkNature3);
                Integer id2 = kycWorkNature3.getId();
                kotlin.jvm.internal.j.d(id2);
                int iIntValue = id2.intValue();
                KycJobTitle kycJobTitle2 = this.e;
                kotlin.jvm.internal.j.d(kycJobTitle2);
                Integer id3 = kycJobTitle2.getId();
                kotlin.jvm.internal.j.d(id3);
                if (t(iIntValue, id3.intValue()) != null) {
                    return true;
                }
            }
        }
        KycIncomeSource kycIncomeSource = this.f;
        if ((kycIncomeSource != null ? kycIncomeSource.getId() : null) == null) {
            return false;
        }
        KycWorkNature kycWorkNature4 = this.f1030d;
        if ((kycWorkNature4 != null ? kycWorkNature4.getId() : null) == null) {
            return false;
        }
        KycWorkNature kycWorkNature5 = this.f1030d;
        kotlin.jvm.internal.j.d(kycWorkNature5);
        Integer id4 = kycWorkNature5.getId();
        kotlin.jvm.internal.j.d(id4);
        int iIntValue2 = id4.intValue();
        KycIncomeSource kycIncomeSource2 = this.f;
        kotlin.jvm.internal.j.d(kycIncomeSource2);
        Integer id5 = kycIncomeSource2.getId();
        kotlin.jvm.internal.j.d(id5);
        return s(iIntValue2, id5.intValue()) != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H() {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D8.Z.H():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r14v3, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r4v18, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r4v25, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    public final void I() {
        ArrayList arrayList;
        Z z4;
        View childAt;
        boolean z5;
        List<String> subQuestions;
        List<String> list;
        ArrayList arrayListQ = q();
        final MayaKycWorkDetailsFragment mayaKycWorkDetailsFragment = (MayaKycWorkDetailsFragment) ((K8.T) this.c.get());
        mayaKycWorkDetailsFragment.getClass();
        ((C0) mayaKycWorkDetailsFragment.G1()).c.removeAllViews();
        Iterator it = arrayListQ.iterator();
        int i = 0;
        int i4 = 0;
        while (true) {
            if (!it.hasNext()) {
                if (!arrayListQ.isEmpty()) {
                    Z z8 = (Z) mayaKycWorkDetailsFragment.N1();
                    for (Map.Entry entry : z8.i.entrySet()) {
                        String questionId = (String) entry.getKey();
                        String answer = (String) entry.getValue();
                        MayaKycWorkDetailsFragment mayaKycWorkDetailsFragment2 = (MayaKycWorkDetailsFragment) ((K8.T) z8.c.get());
                        mayaKycWorkDetailsFragment2.getClass();
                        kotlin.jvm.internal.j.g(questionId, "questionId");
                        kotlin.jvm.internal.j.g(answer, "answer");
                        LinearLayout linearLayout = ((C0) mayaKycWorkDetailsFragment2.G1()).c;
                        int childCount = linearLayout.getChildCount();
                        int i6 = 0;
                        while (true) {
                            if (i6 >= childCount) {
                                arrayList = arrayListQ;
                                z4 = z8;
                                childAt = null;
                                break;
                            }
                            View childAt2 = linearLayout.getChildAt(i6);
                            ?? r13 = childAt2 instanceof LinearLayout ? (LinearLayout) childAt2 : kycDnfbpQuestionData;
                            if (r13 != 0) {
                                int childCount2 = r13.getChildCount();
                                int i10 = 0;
                                while (true) {
                                    if (i10 >= childCount2) {
                                        arrayList = arrayListQ;
                                        z4 = z8;
                                        childAt = null;
                                        break;
                                    }
                                    childAt = r13.getChildAt(i10);
                                    if (childAt.findViewById(R.id.button_yes) != null) {
                                        LinearLayout linearLayout2 = (LinearLayout) childAt.findViewById(R.id.button_no);
                                        LinearLayout linearLayout3 = (LinearLayout) childAt.findViewById(R.id.button_yes);
                                        Object tag = linearLayout2 != null ? linearLayout2.getTag() : null;
                                        arrayList = arrayListQ;
                                        String str = tag instanceof String ? (String) tag : null;
                                        Object tag2 = linearLayout3 != null ? linearLayout3.getTag() : null;
                                        z4 = z8;
                                        String str2 = tag2 instanceof String ? (String) tag2 : null;
                                        if (kotlin.jvm.internal.j.b(str, questionId.concat("_no")) || kotlin.jvm.internal.j.b(str2, questionId.concat("_yes"))) {
                                            break;
                                        }
                                    } else {
                                        arrayList = arrayListQ;
                                        z4 = z8;
                                    }
                                    i10++;
                                    arrayListQ = arrayList;
                                    z8 = z4;
                                }
                                if (childAt != null) {
                                    break;
                                }
                            } else {
                                arrayList = arrayListQ;
                                z4 = z8;
                            }
                            i6++;
                            arrayListQ = arrayList;
                            z8 = z4;
                            kycDnfbpQuestionData = null;
                        }
                        if (childAt != null) {
                            LinearLayout linearLayout4 = (LinearLayout) childAt.findViewById(R.id.button_no);
                            LinearLayout linearLayout5 = (LinearLayout) childAt.findViewById(R.id.button_yes);
                            if (answer.equals("YES")) {
                                if (linearLayout5 != null) {
                                    linearLayout5.setSelected(true);
                                }
                                if (linearLayout4 != null) {
                                    linearLayout4.setSelected(false);
                                }
                            } else if (answer.equals("NO")) {
                                z5 = true;
                                if (linearLayout4 != null) {
                                    linearLayout4.setSelected(true);
                                }
                                if (linearLayout5 != null) {
                                    linearLayout5.setSelected(false);
                                }
                            }
                            z5 = true;
                        } else {
                            z5 = true;
                        }
                        arrayListQ = arrayList;
                        z8 = z4;
                        kycDnfbpQuestionData = null;
                    }
                }
                boolean zIsEmpty = arrayListQ.isEmpty();
                boolean zF = F();
                if (!zIsEmpty || zF) {
                    ((C0) ((MayaKycWorkDetailsFragment) ((K8.T) this.c.get())).G1()).f3568d.setVisibility(0);
                    return;
                } else {
                    ((C0) ((MayaKycWorkDetailsFragment) ((K8.T) this.c.get())).G1()).f3568d.setVisibility(8);
                    return;
                }
            }
            Object next = it.next();
            int i11 = i4 + 1;
            if (i4 < 0) {
                C1132s.k();
                throw null;
            }
            kycDnfbpQuestionData = next instanceof KycDnfbpQuestionData ? (KycDnfbpQuestionData) next : null;
            if (kycDnfbpQuestionData != null) {
                final String questionId2 = kycDnfbpQuestionData.getQuestionId();
                KycQuestion question = kycDnfbpQuestionData.getQuestion();
                ?? d8nvx3 = new d8NVX3(mayaKycWorkDetailsFragment.requireContext());
                d8nvx3.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                if (i4 > 0) {
                    layoutParams.topMargin = d8nvx3.getResources().getDimensionPixelSize(R.dimen.maya_margin_normal);
                }
                d8nvx3.setLayoutParams(layoutParams);
                String mainQuestion = question.getMainQuestion();
                if ((mainQuestion != null && mainQuestion.length() != 0) || ((subQuestions = question.getSubQuestions()) != null && !subQuestions.isEmpty())) {
                    List<String> subQuestions2 = question.getSubQuestions();
                    if ((mainQuestion == null || mainQuestion.length() == 0) && subQuestions2 != null && subQuestions2.size() == 1) {
                        TextView textView = new TextView(mayaKycWorkDetailsFragment.requireContext());
                        textView.setText(subQuestions2.get(i));
                        textView.setTextAppearance(R.style.CerebriBookTextBody_BlackOpacity);
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                        layoutParams2.bottomMargin = textView.getResources().getDimensionPixelSize(R.dimen.maya_margin_small);
                        textView.setLayoutParams(layoutParams2);
                        d8nvx3.addView(textView);
                    } else if (mainQuestion != null && mainQuestion.length() != 0 && (list = subQuestions2) != null && !list.isEmpty()) {
                        TextView textView2 = new TextView(mayaKycWorkDetailsFragment.requireContext());
                        textView2.setText(mainQuestion);
                        textView2.setTextAppearance(R.style.CerebriBoldH6_Primary);
                        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                        layoutParams3.bottomMargin = textView2.getResources().getDimensionPixelSize(R.dimen.maya_margin_small);
                        textView2.setLayoutParams(layoutParams3);
                        ?? d8nvx32 = new d8NVX3(mayaKycWorkDetailsFragment.requireContext());
                        d8nvx32.setOrientation(1);
                        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
                        layoutParams4.bottomMargin = d8nvx32.getResources().getDimensionPixelSize(R.dimen.maya_margin_small);
                        layoutParams4.setMarginStart(d8nvx32.getResources().getDimensionPixelSize(R.dimen.maya_margin_small));
                        d8nvx32.setLayoutParams(layoutParams4);
                        for (String str3 : subQuestions2) {
                            TextView textView3 = new TextView(mayaKycWorkDetailsFragment.requireContext());
                            textView3.setText("•  " + str3);
                            textView3.setTextAppearance(R.style.CerebriBookTextBody_BlackOpacity);
                            LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
                            layoutParams5.topMargin = textView3.getResources().getDimensionPixelSize(R.dimen.maya_margin_2x_small);
                            textView3.setLayoutParams(layoutParams5);
                            d8nvx32.addView(textView3);
                        }
                        d8nvx3.addView(textView2);
                        d8nvx3.addView(d8nvx32);
                    } else if (mainQuestion != null && mainQuestion.length() != 0) {
                        TextView textView4 = new TextView(mayaKycWorkDetailsFragment.requireContext());
                        textView4.setText(mainQuestion);
                        textView4.setTextAppearance(R.style.CerebriBookTextBody_BlackOpacity);
                        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
                        layoutParams6.bottomMargin = textView4.getResources().getDimensionPixelSize(R.dimen.maya_margin_small);
                        textView4.setLayoutParams(layoutParams6);
                        d8nvx3.addView(textView4);
                    }
                    View viewInflate = mayaKycWorkDetailsFragment.getLayoutInflater().inflate(R.layout.maya_dnfbp_choice_buttons, (ViewGroup) ((C0) mayaKycWorkDetailsFragment.G1()).c, false);
                    LinearLayout linearLayout6 = (LinearLayout) viewInflate.findViewById(R.id.button_no);
                    LinearLayout linearLayout7 = (LinearLayout) viewInflate.findViewById(R.id.button_yes);
                    linearLayout6.setTag(questionId2 + "_no");
                    linearLayout7.setTag(questionId2 + "_yes");
                    final int i12 = 1;
                    linearLayout6.setOnClickListener(new View.OnClickListener() { // from class: M8.f3
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i12) {
                                case 0:
                                    MayaKycWorkDetailsFragment mayaKycWorkDetailsFragment3 = mayaKycWorkDetailsFragment;
                                    String str4 = questionId2;
                                    Callback.onClick_enter(view);
                                    try {
                                        kotlin.jvm.internal.j.d(view);
                                        mayaKycWorkDetailsFragment3.O1(str4, "YES", view);
                                        return;
                                    } finally {
                                    }
                                default:
                                    MayaKycWorkDetailsFragment mayaKycWorkDetailsFragment4 = mayaKycWorkDetailsFragment;
                                    String str5 = questionId2;
                                    Callback.onClick_enter(view);
                                    try {
                                        kotlin.jvm.internal.j.d(view);
                                        mayaKycWorkDetailsFragment4.O1(str5, "NO", view);
                                        return;
                                    } finally {
                                    }
                            }
                        }
                    });
                    final int i13 = 0;
                    linearLayout7.setOnClickListener(new View.OnClickListener() { // from class: M8.f3
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i13) {
                                case 0:
                                    MayaKycWorkDetailsFragment mayaKycWorkDetailsFragment3 = mayaKycWorkDetailsFragment;
                                    String str4 = questionId2;
                                    Callback.onClick_enter(view);
                                    try {
                                        kotlin.jvm.internal.j.d(view);
                                        mayaKycWorkDetailsFragment3.O1(str4, "YES", view);
                                        return;
                                    } finally {
                                    }
                                default:
                                    MayaKycWorkDetailsFragment mayaKycWorkDetailsFragment4 = mayaKycWorkDetailsFragment;
                                    String str5 = questionId2;
                                    Callback.onClick_enter(view);
                                    try {
                                        kotlin.jvm.internal.j.d(view);
                                        mayaKycWorkDetailsFragment4.O1(str5, "NO", view);
                                        return;
                                    } finally {
                                    }
                            }
                        }
                    });
                    d8nvx3.addView(viewInflate);
                    ((C0) mayaKycWorkDetailsFragment.G1()).c.addView(d8nvx3);
                    new Handler(Looper.getMainLooper()).postDelayed(new E8.l(mayaKycWorkDetailsFragment, 7), 100L);
                }
            }
            i4 = i11;
            i = 0;
        }
    }

    public final KycValidationResult J(KycFieldType fieldType, String value) {
        KycCmsContentData data;
        kotlin.jvm.internal.j.g(fieldType, "fieldType");
        kotlin.jvm.internal.j.g(value, "value");
        zj.o oVar = G8.d.f1924a;
        KeyEventDispatcher.Component componentRequireActivity = ((MayaKycWorkDetailsFragment) ((K8.T) this.c.get())).requireActivity();
        kotlin.jvm.internal.j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        KycCmsContent kycCmsContent = ((MayaKycActivity) ((H8.b) componentRequireActivity)).Z1().f;
        List<KycValidationRule> validationRules = (kycCmsContent == null || (data = kycCmsContent.getData()) == null) ? null : data.getValidationRules();
        if (validationRules == null) {
            validationRules = C1112C.f9377a;
        }
        return G8.d.a(fieldType, value, validationRules, new Ag.f(1, this, Z.class, "isFieldRequired", "isFieldRequired(Lcom/paymaya/domain/model/KycFieldType;)Z", 0, 6));
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        Object next;
        Object next2;
        Object next3;
        List<KycJobTitles> jobTitles;
        Object next4;
        super.j();
        ((C0) ((MayaKycWorkDetailsFragment) ((K8.T) this.c.get())).G1()).f.c.setEnabled(false);
        r().isEmpty();
        Integer num = (Integer) E8.C.a(null, "work_nature_id");
        if (num != null && num.intValue() > 0) {
            Iterator it = D().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next4 = null;
                    break;
                } else {
                    next4 = it.next();
                    if (kotlin.jvm.internal.j.b(((KycWorkNature) next4).getId(), num)) {
                        break;
                    }
                }
            }
            KycWorkNature kycWorkNature = (KycWorkNature) next4;
            if (kycWorkNature != null) {
                this.f1030d = kycWorkNature;
                ((MayaKycWorkDetailsFragment) ((K8.T) this.c.get())).T1(kycWorkNature);
                this.h = kotlin.jvm.internal.j.b(kycWorkNature.getRequiresEmploymentDetails(), Boolean.TRUE);
                ((C0) ((MayaKycWorkDetailsFragment) ((K8.T) this.c.get())).G1()).h.setVisibility(this.h ? 0 : 8);
                String strB = B(num.intValue());
                if (strB != null && strB.length() != 0) {
                    ((MayaKycWorkDetailsFragment) ((K8.T) this.c.get())).V1(KycFieldType.WORK_NATION, strB);
                }
            }
        }
        Integer num2 = (Integer) E8.C.a(null, "job_title_id");
        if (num2 != null && num2.intValue() > 0) {
            KycWorkNature kycWorkNature2 = this.f1030d;
            if ((kycWorkNature2 != null ? kycWorkNature2.getId() : null) != null) {
                KycWorkNature kycWorkNature3 = this.f1030d;
                kotlin.jvm.internal.j.d(kycWorkNature3);
                Integer id = kycWorkNature3.getId();
                kotlin.jvm.internal.j.d(id);
                Iterator it2 = x(id.intValue()).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    } else {
                        next2 = it2.next();
                        if (kotlin.jvm.internal.j.b(((KycJobTitle) next2).getId(), num2)) {
                            break;
                        }
                    }
                }
                KycJobTitle kycJobTitle = (KycJobTitle) next2;
                if (kycJobTitle != null) {
                    this.e = kycJobTitle;
                    ((MayaKycWorkDetailsFragment) ((K8.T) this.c.get())).S1(kycJobTitle);
                    Iterator it3 = r().iterator();
                    loop2: while (true) {
                        if (!it3.hasNext()) {
                            next3 = null;
                            break;
                        }
                        next3 = it3.next();
                        KycDnfbpGuide kycDnfbpGuide = (KycDnfbpGuide) next3;
                        KycWorkNature workNature = kycDnfbpGuide.getWorkNature();
                        Integer id2 = workNature != null ? workNature.getId() : null;
                        KycWorkNature kycWorkNature4 = this.f1030d;
                        kotlin.jvm.internal.j.d(kycWorkNature4);
                        if (kotlin.jvm.internal.j.b(id2, kycWorkNature4.getId()) && (jobTitles = kycDnfbpGuide.getJobTitles()) != null) {
                            List<KycJobTitles> list = jobTitles;
                            if (!(list instanceof Collection) || !list.isEmpty()) {
                                Iterator<T> it4 = list.iterator();
                                while (it4.hasNext()) {
                                    KycJobTitle jobTitle = ((KycJobTitles) it4.next()).getJobTitle();
                                    if (kotlin.jvm.internal.j.b(jobTitle != null ? jobTitle.getId() : null, num2)) {
                                        break loop2;
                                    }
                                }
                            }
                        }
                    }
                    this.f1031g = (KycDnfbpGuide) next3;
                    KycWorkNature kycWorkNature5 = this.f1030d;
                    kotlin.jvm.internal.j.d(kycWorkNature5);
                    Integer id3 = kycWorkNature5.getId();
                    kotlin.jvm.internal.j.d(id3);
                    String strA = A(id3.intValue(), num2.intValue());
                    if (strA != null && strA.length() != 0) {
                        ((MayaKycWorkDetailsFragment) ((K8.T) this.c.get())).V1(KycFieldType.JOB_TITLE, strA);
                    }
                }
            }
        }
        Integer num3 = (Integer) E8.C.a(null, "income_source_id");
        if (num3 != null && num3.intValue() > 0) {
            KycWorkNature kycWorkNature6 = this.f1030d;
            if ((kycWorkNature6 != null ? kycWorkNature6.getId() : null) != null) {
                KycWorkNature kycWorkNature7 = this.f1030d;
                kotlin.jvm.internal.j.d(kycWorkNature7);
                Integer id4 = kycWorkNature7.getId();
                kotlin.jvm.internal.j.d(id4);
                Iterator it5 = w(id4.intValue()).iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it5.next();
                        if (kotlin.jvm.internal.j.b(((KycIncomeSource) next).getId(), num3)) {
                            break;
                        }
                    }
                }
                KycIncomeSource kycIncomeSource = (KycIncomeSource) next;
                if (kycIncomeSource != null) {
                    this.f = kycIncomeSource;
                    ((MayaKycWorkDetailsFragment) ((K8.T) this.c.get())).U1(kycIncomeSource);
                    KycWorkNature kycWorkNature8 = this.f1030d;
                    kotlin.jvm.internal.j.d(kycWorkNature8);
                    Integer id5 = kycWorkNature8.getId();
                    kotlin.jvm.internal.j.d(id5);
                    String strZ = z(id5.intValue(), num3.intValue());
                    if (strZ != null && strZ.length() != 0) {
                        ((MayaKycWorkDetailsFragment) ((K8.T) this.c.get())).V1(KycFieldType.INCOME_SOURCE, strZ);
                    }
                }
            }
        }
        String str = (String) E8.C.a(null, "company_name");
        if (str != null && str.length() != 0) {
            MayaKycWorkDetailsFragment mayaKycWorkDetailsFragment = (MayaKycWorkDetailsFragment) ((K8.T) this.c.get());
            mayaKycWorkDetailsFragment.getClass();
            ((C0) mayaKycWorkDetailsFragment.G1()).h.setText(str);
        }
        Map map = (Map) E8.C.a(null, "dnfbp_questions");
        if (map != null && !map.isEmpty()) {
            this.i.clear();
            this.i.putAll(map);
        }
        ((MayaKycWorkDetailsFragment) ((K8.T) this.c.get())).W1();
        I();
        Boolean bool = (Boolean) E8.C.a(null, "warning_visible");
        String str2 = (String) E8.C.a(null, "warning_text");
        if (kotlin.jvm.internal.j.b(bool, Boolean.TRUE) && str2 != null && str2.length() != 0) {
            MayaKycWorkDetailsFragment mayaKycWorkDetailsFragment2 = (MayaKycWorkDetailsFragment) ((K8.T) this.c.get());
            mayaKycWorkDetailsFragment2.getClass();
            ((C0) mayaKycWorkDetailsFragment2.G1()).e.setTextHTML(str2);
            ((C0) mayaKycWorkDetailsFragment2.G1()).f3567b.setVisibility(0);
        }
        l();
    }

    public final boolean k() {
        ArrayList arrayListQ = q();
        if (arrayListQ.isEmpty()) {
            return true;
        }
        Iterator it = arrayListQ.iterator();
        while (it.hasNext()) {
            if (!this.i.containsKey(((KycDnfbpQuestionData) it.next()).getQuestionId())) {
                return false;
            }
        }
        return true;
    }

    public final void l() {
        ((C0) ((MayaKycWorkDetailsFragment) ((K8.T) this.c.get())).G1()).f.c.setEnabled(!((MayaKycWorkDetailsFragment) ((K8.T) this.c.get())).K1() ? false : k());
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0104 A[EDGE_INSN: B:75:0x0104->B:60:0x0104 BREAK  A[LOOP:0: B:55:0x00f1->B:77:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m() {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D8.Z.m():void");
    }

    public final void n() {
        LinkedHashMap linkedHashMap = this.i;
        try {
            Set setKeySet = linkedHashMap.keySet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : setKeySet) {
                if (zj.z.w((String) obj, 2, "income_source_", false)) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                linkedHashMap.remove((String) it.next());
            }
            if (linkedHashMap.isEmpty()) {
                E8.C.f1266a.remove("dnfbp_questions");
            } else {
                LinkedHashMap linkedHashMap2 = E8.C.f1266a;
                E8.C.b(cj.M.m(linkedHashMap), "dnfbp_questions");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final X o() {
        boolean z4;
        if (F()) {
            return X.f1026a;
        }
        LinkedHashMap linkedHashMap = this.i;
        if (linkedHashMap.isEmpty()) {
            return X.c;
        }
        Collection collectionValues = linkedHashMap.values();
        boolean z5 = true;
        if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
            z4 = false;
        } else {
            Iterator it = collectionValues.iterator();
            while (it.hasNext()) {
                if (kotlin.jvm.internal.j.b((String) it.next(), "YES")) {
                    z4 = true;
                    break;
                }
            }
            z4 = false;
        }
        Collection collectionValues2 = linkedHashMap.values();
        if (!(collectionValues2 instanceof Collection) || !collectionValues2.isEmpty()) {
            Iterator it2 = collectionValues2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (!kotlin.jvm.internal.j.b((String) it2.next(), "NO")) {
                    z5 = false;
                    break;
                }
            }
        }
        return z4 ? X.f1026a : z5 ? X.f1027b : X.c;
    }

    public final String p(String str) {
        String toolTip;
        String toolTip2;
        Iterator it = q().iterator();
        while (true) {
            KycOption kycOption = null;
            Object obj = null;
            if (!it.hasNext()) {
                return null;
            }
            List<KycOption> options = ((KycDnfbpQuestionData) it.next()).getQuestion().getOptions();
            if (options != null) {
                Iterator<T> it2 = options.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    KycOption kycOption2 = (KycOption) next;
                    String name = kycOption2.getName();
                    String string = name != null ? C2576A.b0(name).toString() : null;
                    if (str.equals("YES")) {
                        if ((string != null && C2576A.x(string, "Yes", true)) || (string != null && C2576A.z(string, "/ Yes", false, 2))) {
                            toolTip2 = kycOption2.getToolTip();
                            if (toolTip2 != null && toolTip2.length() != 0) {
                                obj = next;
                                break;
                            }
                        }
                    } else if (str.equals("NO") && ((string != null && C2576A.x(string, "No", true)) || (string != null && C2576A.z(string, "x No", false, 2)))) {
                        toolTip2 = kycOption2.getToolTip();
                        if (toolTip2 != null) {
                            continue;
                        }
                    }
                }
                kycOption = (KycOption) obj;
            }
            if (kycOption != null && (toolTip = kycOption.getToolTip()) != null) {
                return toolTip;
            }
        }
    }

    public final ArrayList q() {
        KycDnfbpGuide kycDnfbpGuide;
        KycQuestion question;
        KycDnfbpGuide kycDnfbpGuide2;
        KycJobTitles kycJobTitles;
        KycQuestion question2;
        Object next;
        KycDnfbpGuide kycDnfbpGuide3;
        KycQuestion question3;
        ArrayList arrayList = new ArrayList();
        if (this.f1030d != null && (kycDnfbpGuide3 = this.f1031g) != null && (question3 = kycDnfbpGuide3.getQuestion()) != null && G(question3)) {
            KycWorkNature kycWorkNature = this.f1030d;
            kotlin.jvm.internal.j.d(kycWorkNature);
            arrayList.add(new KycDnfbpQuestionData("work_nature_" + kycWorkNature.getId() + Global.UNDERSCORE + question3.getId(), question3, "work_nature"));
        }
        KycIncomeSources kycIncomeSources = null;
        Object obj = null;
        if (this.e != null && (kycDnfbpGuide2 = this.f1031g) != null) {
            List<KycJobTitles> jobTitles = kycDnfbpGuide2.getJobTitles();
            if (jobTitles != null) {
                Iterator<T> it = jobTitles.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    KycJobTitle jobTitle = ((KycJobTitles) next).getJobTitle();
                    Integer id = jobTitle != null ? jobTitle.getId() : null;
                    KycJobTitle kycJobTitle = this.e;
                    kotlin.jvm.internal.j.d(kycJobTitle);
                    if (kotlin.jvm.internal.j.b(id, kycJobTitle.getId())) {
                        break;
                    }
                }
                kycJobTitles = (KycJobTitles) next;
            } else {
                kycJobTitles = null;
            }
            if (kycJobTitles != null && (question2 = kycJobTitles.getQuestion()) != null && G(question2)) {
                KycJobTitle kycJobTitle2 = this.e;
                kotlin.jvm.internal.j.d(kycJobTitle2);
                arrayList.add(new KycDnfbpQuestionData("job_title_" + kycJobTitle2.getId() + Global.UNDERSCORE + question2.getId(), question2, "job_title"));
            }
        }
        if (this.f != null && (kycDnfbpGuide = this.f1031g) != null) {
            List<KycIncomeSources> incomeSources = kycDnfbpGuide.getIncomeSources();
            if (incomeSources != null) {
                Iterator<T> it2 = incomeSources.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next2 = it2.next();
                    KycIncomeSource incomeSource = ((KycIncomeSources) next2).getIncomeSource();
                    Integer id2 = incomeSource != null ? incomeSource.getId() : null;
                    KycIncomeSource kycIncomeSource = this.f;
                    kotlin.jvm.internal.j.d(kycIncomeSource);
                    if (kotlin.jvm.internal.j.b(id2, kycIncomeSource.getId())) {
                        obj = next2;
                        break;
                    }
                }
                kycIncomeSources = (KycIncomeSources) obj;
            }
            if (kycIncomeSources != null && (question = kycIncomeSources.getQuestion()) != null && G(question)) {
                KycIncomeSource kycIncomeSource2 = this.f;
                kotlin.jvm.internal.j.d(kycIncomeSource2);
                arrayList.add(new KycDnfbpQuestionData("income_source_" + kycIncomeSource2.getId() + Global.UNDERSCORE + question.getId(), question, "income_source"));
            }
        }
        return arrayList;
    }

    public final List r() {
        KycCmsContentData data;
        KeyEventDispatcher.Component componentRequireActivity = ((MayaKycWorkDetailsFragment) ((K8.T) this.c.get())).requireActivity();
        kotlin.jvm.internal.j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        KycCmsContent kycCmsContent = ((MayaKycActivity) ((H8.b) componentRequireActivity)).Z1().f;
        List<KycDnfbpGuide> dnfbpGuide = (kycCmsContent == null || (data = kycCmsContent.getData()) == null) ? null : data.getDnfbpGuide();
        return dnfbpGuide == null ? C1112C.f9377a : dnfbpGuide;
    }

    public final String s(int i, int i4) {
        Object next;
        KycIncomeSources kycIncomeSources;
        List<KycIncomeSources> incomeSources;
        Object next2;
        Integer id;
        Integer id2;
        Iterator it = r().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            KycWorkNature workNature = ((KycDnfbpGuide) next).getWorkNature();
            if (workNature != null && (id2 = workNature.getId()) != null && id2.intValue() == i) {
                break;
            }
        }
        KycDnfbpGuide kycDnfbpGuide = (KycDnfbpGuide) next;
        if (kycDnfbpGuide == null || (incomeSources = kycDnfbpGuide.getIncomeSources()) == null) {
            kycIncomeSources = null;
        } else {
            Iterator<T> it2 = incomeSources.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                KycIncomeSource incomeSource = ((KycIncomeSources) next2).getIncomeSource();
                if (incomeSource != null && (id = incomeSource.getId()) != null && id.intValue() == i4) {
                    break;
                }
            }
            kycIncomeSources = (KycIncomeSources) next2;
        }
        return v(kycIncomeSources != null ? kycIncomeSources.getQuestion() : null);
    }

    public final String t(int i, int i4) {
        Object next;
        KycJobTitles kycJobTitles;
        List<KycJobTitles> jobTitles;
        Object next2;
        Integer id;
        Integer id2;
        Iterator it = r().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            KycWorkNature workNature = ((KycDnfbpGuide) next).getWorkNature();
            if (workNature != null && (id2 = workNature.getId()) != null && id2.intValue() == i) {
                break;
            }
        }
        KycDnfbpGuide kycDnfbpGuide = (KycDnfbpGuide) next;
        if (kycDnfbpGuide == null || (jobTitles = kycDnfbpGuide.getJobTitles()) == null) {
            kycJobTitles = null;
        } else {
            Iterator<T> it2 = jobTitles.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                KycJobTitle jobTitle = ((KycJobTitles) next2).getJobTitle();
                if (jobTitle != null && (id = jobTitle.getId()) != null && id.intValue() == i4) {
                    break;
                }
            }
            kycJobTitles = (KycJobTitles) next2;
        }
        return v(kycJobTitles != null ? kycJobTitles.getQuestion() : null);
    }

    public final String u(int i) {
        Object next;
        Integer id;
        Iterator it = r().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            KycWorkNature workNature = ((KycDnfbpGuide) next).getWorkNature();
            if (workNature != null && (id = workNature.getId()) != null && id.intValue() == i) {
                break;
            }
        }
        KycDnfbpGuide kycDnfbpGuide = (KycDnfbpGuide) next;
        return v(kycDnfbpGuide != null ? kycDnfbpGuide.getQuestion() : null);
    }

    public final ArrayList w(int i) {
        Integer id;
        List listR = r();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listR) {
            KycWorkNature workNature = ((KycDnfbpGuide) obj).getWorkNature();
            if (workNature != null && (id = workNature.getId()) != null && id.intValue() == i) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            List<KycIncomeSources> incomeSources = ((KycDnfbpGuide) it.next()).getIncomeSources();
            if (incomeSources == null) {
                incomeSources = C1112C.f9377a;
            }
            cj.x.p(incomeSources, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            KycIncomeSource incomeSource = ((KycIncomeSources) it2.next()).getIncomeSource();
            if (incomeSource != null) {
                arrayList3.add(incomeSource);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (hashSet.add(((KycIncomeSource) obj2).getId())) {
                arrayList4.add(obj2);
            }
        }
        return arrayList4;
    }

    public final ArrayList x(int i) {
        Integer id;
        List listR = r();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listR) {
            KycWorkNature workNature = ((KycDnfbpGuide) obj).getWorkNature();
            if (workNature != null && (id = workNature.getId()) != null && id.intValue() == i) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            List<KycJobTitles> jobTitles = ((KycDnfbpGuide) it.next()).getJobTitles();
            if (jobTitles == null) {
                jobTitles = C1112C.f9377a;
            }
            cj.x.p(jobTitles, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            KycJobTitle jobTitle = ((KycJobTitles) it2.next()).getJobTitle();
            if (jobTitle != null) {
                arrayList3.add(jobTitle);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (hashSet.add(((KycJobTitle) obj2).getId())) {
                arrayList4.add(obj2);
            }
        }
        return arrayList4;
    }

    public final String y() {
        int iOrdinal = o().ordinal();
        if (iOrdinal == 0) {
            return "AMLC";
        }
        if (iOrdinal == 1) {
            return "SSNE";
        }
        if (iOrdinal == 2) {
            return "None";
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String z(int i, int i4) {
        Object next;
        List<KycIncomeSources> incomeSources;
        Object next2;
        KycToolTip toolTip;
        Integer id;
        Integer id2;
        Iterator it = r().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            KycWorkNature workNature = ((KycDnfbpGuide) next).getWorkNature();
            if (workNature != null && (id2 = workNature.getId()) != null && id2.intValue() == i) {
                break;
            }
        }
        KycDnfbpGuide kycDnfbpGuide = (KycDnfbpGuide) next;
        if (kycDnfbpGuide != null && (incomeSources = kycDnfbpGuide.getIncomeSources()) != null) {
            Iterator<T> it2 = incomeSources.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                KycIncomeSource incomeSource = ((KycIncomeSources) next2).getIncomeSource();
                if (incomeSource != null && (id = incomeSource.getId()) != null && id.intValue() == i4) {
                    break;
                }
            }
            KycIncomeSources kycIncomeSources = (KycIncomeSources) next2;
            if (kycIncomeSources != null && (toolTip = kycIncomeSources.getToolTip()) != null) {
                return toolTip.getDescription();
            }
        }
        return null;
    }
}
