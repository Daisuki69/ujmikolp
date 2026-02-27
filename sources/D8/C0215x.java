package D8;

import K8.InterfaceC0289n;
import M8.C0422w2;
import M8.C0426x2;
import M8.T2;
import N5.C0439b0;
import N5.C0482u0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.Navigation;
import cj.C1110A;
import cj.C1112C;
import com.paymaya.R;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.e0;
import com.paymaya.domain.model.KycCaptureGuide;
import com.paymaya.domain.model.KycCmsContent;
import com.paymaya.domain.model.KycCmsContentData;
import com.paymaya.domain.model.KycDocument;
import com.paymaya.domain.model.KycDocumentSample;
import com.paymaya.domain.model.KycDocumentTypeGuide;
import com.paymaya.domain.model.MayaEKYCSelectedDocument;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycDocumentIdGuideFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycSubmitIdFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.IndexedValue;
import y5.AbstractC2509a;

/* JADX INFO: renamed from: D8.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0215x extends AbstractC2509a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1107d;
    public final com.paymaya.data.preference.a e;
    public final e0 f;

    public /* synthetic */ C0215x(com.paymaya.data.preference.a aVar, S5.c cVar, e0 e0Var, int i) {
        this.f1107d = i;
        this.e = aVar;
        this.f = e0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33, types: [com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycSubmitIdFragment] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v15, types: [cj.C] */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // y5.AbstractC2509a
    public final void j() {
        KycCaptureGuide kycCaptureGuide;
        KycCaptureGuide captureGuide;
        KycCmsContentData data;
        List<KycCaptureGuide> captureGuides;
        Object next;
        KycCmsContentData data2;
        List<KycDocument> documents;
        boolean z4;
        KycCmsContentData data3;
        KycCmsContentData data4;
        KycCmsContentData data5;
        switch (this.f1107d) {
            case 0:
                super.j();
                KeyEventDispatcher.Component componentRequireActivity = ((MayaKycDocumentIdGuideFragment) ((InterfaceC0289n) this.c.get())).requireActivity();
                kotlin.jvm.internal.j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                KycCmsContent kycCmsContent = ((MayaKycActivity) ((H8.b) componentRequireActivity)).Z1().f;
                Boolean boolIsAllowedToUpload = null;
                if (kycCmsContent == null || (data = kycCmsContent.getData()) == null || (captureGuides = data.getCaptureGuides()) == null) {
                    kycCaptureGuide = null;
                } else {
                    Iterator it = captureGuides.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            KycDocumentTypeGuide document = ((KycCaptureGuide) next).getDocument();
                            String key = document != null ? document.getKey() : null;
                            MayaEKYCSelectedDocument mayaEKYCSelectedDocumentL1 = ((MayaKycDocumentIdGuideFragment) ((InterfaceC0289n) this.c.get())).L1();
                            if (kotlin.jvm.internal.j.b(key, mayaEKYCSelectedDocumentL1 != null ? mayaEKYCSelectedDocumentL1.getKey() : null)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    kycCaptureGuide = (KycCaptureGuide) next;
                }
                if (kycCaptureGuide != null) {
                    ArrayList arrayList = new ArrayList();
                    String header = kycCaptureGuide.getHeader();
                    if (header == null) {
                        header = "";
                    }
                    String subHeader = kycCaptureGuide.getSubHeader();
                    arrayList.add(new J8.a(header, subHeader != null ? subHeader : ""));
                    arrayList.addAll(kycCaptureGuide.getSamples());
                    MayaKycDocumentIdGuideFragment mayaKycDocumentIdGuideFragment = (MayaKycDocumentIdGuideFragment) ((InterfaceC0289n) this.c.get());
                    mayaKycDocumentIdGuideFragment.getClass();
                    J8.i iVar = (J8.i) mayaKycDocumentIdGuideFragment.f12517Y.getValue();
                    iVar.getClass();
                    iVar.f2469a = arrayList;
                    iVar.notifyDataSetChanged();
                    ((C0439b0) mayaKycDocumentIdGuideFragment.G1()).f.setVisibility(0);
                } else {
                    ((C0439b0) ((MayaKycDocumentIdGuideFragment) ((InterfaceC0289n) this.c.get())).G1()).f.setVisibility(8);
                }
                MayaEKYCSelectedDocument mayaEKYCSelectedDocumentL12 = ((MayaKycDocumentIdGuideFragment) ((InterfaceC0289n) this.c.get())).L1();
                if (mayaEKYCSelectedDocumentL12 != null && (captureGuide = mayaEKYCSelectedDocumentL12.getCaptureGuide()) != null) {
                    boolIsAllowedToUpload = captureGuide.isAllowedToUpload();
                }
                if (kotlin.jvm.internal.j.b(boolIsAllowedToUpload, Boolean.TRUE)) {
                    ((MayaKycDocumentIdGuideFragment) ((InterfaceC0289n) this.c.get())).M1(0, this.f.a(R.string.pma_label_paymaya_take_photo), 2.0f);
                } else {
                    ((MayaKycDocumentIdGuideFragment) ((InterfaceC0289n) this.c.get())).M1(8, this.f.a(R.string.maya_label_button_continue), 1.0f);
                }
                break;
            default:
                super.j();
                ?? arrayList2 = 0;
                secondaryDocuments = null;
                List<KycDocument> secondaryDocuments = null;
                arrayList2 = 0;
                arrayList2 = 0;
                if (this.e.I()) {
                    KycCmsContent cmsContent = ((MayaKycSubmitIdFragment) ((K8.K) this.c.get())).getCmsContent();
                    List<KycDocument> recommendedDocuments = (cmsContent == null || (data5 = cmsContent.getData()) == null) ? null : data5.getRecommendedDocuments();
                    if (recommendedDocuments == null) {
                        recommendedDocuments = C1112C.f9377a;
                    }
                    ArrayList arrayListW = C1110A.W(recommendedDocuments);
                    KycCmsContent cmsContent2 = ((MayaKycSubmitIdFragment) ((K8.K) this.c.get())).getCmsContent();
                    List<KycDocument> otherPrimaryDocuments = (cmsContent2 == null || (data4 = cmsContent2.getData()) == null) ? null : data4.getOtherPrimaryDocuments();
                    if (otherPrimaryDocuments == null) {
                        otherPrimaryDocuments = C1112C.f9377a;
                    }
                    ArrayList arrayListW2 = C1110A.W(otherPrimaryDocuments);
                    KycCmsContent cmsContent3 = ((MayaKycSubmitIdFragment) ((K8.K) this.c.get())).getCmsContent();
                    if (cmsContent3 != null && (data3 = cmsContent3.getData()) != null) {
                        secondaryDocuments = data3.getSecondaryDocuments();
                    }
                    if (secondaryDocuments == null) {
                        secondaryDocuments = C1112C.f9377a;
                    }
                    ArrayList arrayListW3 = C1110A.W(secondaryDocuments);
                    m("primary", arrayListW2);
                    m("secondary", arrayListW3);
                    m("recommended", arrayListW);
                    if (this.e.e().isShortenedFlowShowOtherIdEnabled()) {
                        ((C0482u0) ((MayaKycSubmitIdFragment) ((K8.K) this.c.get())).G1()).e.setVisibility(0);
                        boolean z5 = true;
                        if (arrayListW3.isEmpty()) {
                            z4 = false;
                        } else {
                            arrayListW3.add(l());
                            z4 = true;
                        }
                        if (arrayListW2.isEmpty() || z4) {
                            z5 = z4;
                        } else {
                            arrayListW2.add(l());
                        }
                        if (!arrayListW.isEmpty() && !z5) {
                            arrayListW.add(l());
                        }
                    }
                    ((MayaKycSubmitIdFragment) ((K8.K) this.c.get())).Q1(arrayListW, arrayListW2, arrayListW3);
                    if (arrayListW2.isEmpty() && arrayListW3.isEmpty()) {
                        MayaKycSubmitIdFragment mayaKycSubmitIdFragment = (MayaKycSubmitIdFragment) ((K8.K) this.c.get());
                        ((C0482u0) mayaKycSubmitIdFragment.G1()).f4225l.setVisibility(8);
                        ((C0482u0) mayaKycSubmitIdFragment.G1()).i.setText(mayaKycSubmitIdFragment.getString(R.string.maya_kyc_submit_an_id_label_recommended_primary_ids));
                    } else {
                        MayaKycSubmitIdFragment mayaKycSubmitIdFragment2 = (MayaKycSubmitIdFragment) ((K8.K) this.c.get());
                        ((C0482u0) mayaKycSubmitIdFragment2.G1()).f4225l.setVisibility(0);
                        ((C0482u0) mayaKycSubmitIdFragment2.G1()).i.setText(mayaKycSubmitIdFragment2.getString(R.string.maya_kyc_submit_an_id_label_recommended_primary_ids));
                        if (mayaKycSubmitIdFragment2.t1().e().isShortenedFlowShowOtherIdEnabled()) {
                            ((C0482u0) mayaKycSubmitIdFragment2.G1()).e.setVisibility(8);
                        }
                    }
                } else {
                    KycCmsContent cmsContent4 = ((MayaKycSubmitIdFragment) ((K8.K) this.c.get())).getCmsContent();
                    if (cmsContent4 != null && (data2 = cmsContent4.getData()) != null && (documents = data2.getDocuments()) != null) {
                        arrayList2 = new ArrayList();
                        for (Object obj : documents) {
                            if (((KycDocument) obj).getShowOnList()) {
                                arrayList2.add(obj);
                            }
                        }
                    }
                    if (arrayList2 == 0) {
                        arrayList2 = C1112C.f9377a;
                    }
                    ?? r42 = arrayList2;
                    if (this.e.e().isShowOtherIDsZolozFlowConfig()) {
                        ArrayList arrayListW4 = C1110A.W(C1110A.M(l(), (Collection) arrayList2));
                        ((C0482u0) ((MayaKycSubmitIdFragment) ((K8.K) this.c.get())).G1()).e.setVisibility(0);
                        r42 = arrayListW4;
                    }
                    if (r42.isEmpty()) {
                        ((MayaKycSubmitIdFragment) ((K8.K) this.c.get())).O1("recommended");
                    } else {
                        K8.K k8 = (K8.K) this.c.get();
                        C1112C c1112c = C1112C.f9377a;
                        ((MayaKycSubmitIdFragment) k8).Q1(r42, c1112c, c1112c);
                    }
                }
                if (o()) {
                    K8.K k10 = (K8.K) this.c.get();
                    int color = ContextCompat.getColor(this.f.f10905a, R.color.ghost_white);
                    MayaKycSubmitIdFragment mayaKycSubmitIdFragment3 = (MayaKycSubmitIdFragment) k10;
                    Object objRequireActivity = mayaKycSubmitIdFragment3.requireActivity();
                    kotlin.jvm.internal.j.e(objRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                    Object obj2 = (H8.b) objRequireActivity;
                    ((MayaKycActivity) obj2).r2(color);
                    ((y5.q) obj2).N1(color);
                    ((C0482u0) mayaKycSubmitIdFragment3.G1()).c.setBackgroundColor(color);
                    ((C0482u0) ((MayaKycSubmitIdFragment) ((K8.K) this.c.get())).G1()).f4221b.setVisibility(8);
                }
                break;
        }
    }

    public KycCaptureGuide k(String str) {
        List<KycCaptureGuide> captureGuides;
        KycCmsContent cmsContent = ((MayaKycSubmitIdFragment) ((K8.K) this.c.get())).getCmsContent();
        Object obj = null;
        if (cmsContent == null || (captureGuides = cmsContent.getData().getCaptureGuides()) == null) {
            return null;
        }
        Iterator<T> it = captureGuides.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            KycDocumentTypeGuide document = ((KycCaptureGuide) next).getDocument();
            if (kotlin.jvm.internal.j.b(document != null ? document.getKey() : null, str)) {
                obj = next;
                break;
            }
        }
        return (KycCaptureGuide) obj;
    }

    public KycDocument l() {
        String string = ((MayaKycSubmitIdFragment) ((K8.K) this.c.get())).getString(R.string.maya_kyc_other_ids);
        kotlin.jvm.internal.j.f(string, "getString(...)");
        return new KycDocument(100, "OTHER_IDS", string, null, null, null, false, false, 100, null, 760, null);
    }

    public void m(String str, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            ((MayaKycSubmitIdFragment) ((K8.K) this.c.get())).O1(str);
        }
    }

    public boolean n() {
        KeyEventDispatcher.Component componentRequireActivity = ((MayaKycSubmitIdFragment) ((K8.K) this.c.get())).requireActivity();
        kotlin.jvm.internal.j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        C0197e c0197eZ1 = ((MayaKycActivity) ((H8.b) componentRequireActivity)).Z1();
        return S5.c.b(c0197eZ1.e, A5.b.u0);
    }

    public boolean o() {
        return this.e.e().isKycUxTofuRedesignEnabled();
    }

    public void p(MayaEKYCSelectedDocument mayaEKYCSelectedDocument) {
        IndexedValue indexedValue;
        KycCmsContentData data;
        List<KycDocument> secondaryDocuments;
        KycCmsContentData data2;
        List<KycDocument> otherPrimaryDocuments;
        KycCmsContentData data3;
        List<KycDocument> recommendedDocuments;
        if (mayaEKYCSelectedDocument == null) {
            return;
        }
        MayaEKYCSelectedDocument mayaEKYCSelectedDocument2 = ((MayaKycSubmitIdFragment) ((K8.K) this.c.get())).f12633c0;
        if (mayaEKYCSelectedDocument2 == null) {
            kotlin.jvm.internal.j.n("mSelectedDocument");
            throw null;
        }
        String key = mayaEKYCSelectedDocument2.getKey();
        boolean z4 = true;
        if (key != null) {
            kotlin.jvm.internal.w wVar = new kotlin.jvm.internal.w();
            if (this.e.I()) {
                ArrayList arrayList = new ArrayList();
                KycCmsContent cmsContent = ((MayaKycSubmitIdFragment) ((K8.K) this.c.get())).getCmsContent();
                if (cmsContent != null && (data3 = cmsContent.getData()) != null && (recommendedDocuments = data3.getRecommendedDocuments()) != null) {
                    arrayList.addAll(recommendedDocuments);
                }
                KycCmsContent cmsContent2 = ((MayaKycSubmitIdFragment) ((K8.K) this.c.get())).getCmsContent();
                if (cmsContent2 != null && (data2 = cmsContent2.getData()) != null && (otherPrimaryDocuments = data2.getOtherPrimaryDocuments()) != null) {
                    arrayList.addAll(otherPrimaryDocuments);
                }
                KycCmsContent cmsContent3 = ((MayaKycSubmitIdFragment) ((K8.K) this.c.get())).getCmsContent();
                if (cmsContent3 != null && (data = cmsContent3.getData()) != null && (secondaryDocuments = data.getSecondaryDocuments()) != null) {
                    arrayList.addAll(secondaryDocuments);
                }
                if (this.e.e().isShortenedFlowShowOtherIdEnabled()) {
                    arrayList.add(l());
                }
                Iterator it = C1110A.a0(arrayList).iterator();
                do {
                    cj.H h = (cj.H) it;
                    if (!h.f9381b.hasNext()) {
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    indexedValue = (IndexedValue) h.next();
                } while (!kotlin.jvm.internal.j.b(((KycDocument) indexedValue.f18164b).getKey(), mayaEKYCSelectedDocument.getKey()));
                wVar.f18193a = indexedValue.f18163a + 1;
            } else {
                Integer order = mayaEKYCSelectedDocument.getDocument().getOrder();
                wVar.f18193a = order != null ? order.intValue() : 0;
            }
            int i = wVar.f18193a;
            K8.K k8 = (K8.K) this.c.get();
            String idPosition = String.valueOf(i);
            MayaKycSubmitIdFragment mayaKycSubmitIdFragment = (MayaKycSubmitIdFragment) k8;
            mayaKycSubmitIdFragment.getClass();
            kotlin.jvm.internal.j.g(idPosition, "idPosition");
            C1220i c1220iO1 = mayaKycSubmitIdFragment.o1();
            FragmentActivity activity = mayaKycSubmitIdFragment.getActivity();
            C1219h c1219hD = C1219h.d(mayaKycSubmitIdFragment.u1());
            c1219hD.r(EnumC1216e.SELECT_ID);
            c1219hD.n(28);
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            HashMap map = c1219hD.j;
            map.put("ID_type", key);
            map.put("ID_position", idPosition);
            c1219hD.i();
            c1220iO1.c(activity, c1219hD);
        }
        if (this.e.e().isSupportSecondaryIdFlowEnabled()) {
            MayaKycSubmitIdFragment mayaKycSubmitIdFragment2 = (MayaKycSubmitIdFragment) ((K8.K) this.c.get());
            mayaKycSubmitIdFragment2.getClass();
            KeyEventDispatcher.Component componentRequireActivity = mayaKycSubmitIdFragment2.requireActivity();
            kotlin.jvm.internal.j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
            ((MayaKycActivity) ((H8.b) componentRequireActivity)).V1(0, mayaEKYCSelectedDocument);
        }
        KycCaptureGuide captureGuide = mayaEKYCSelectedDocument.getCaptureGuide();
        List<KycDocumentSample> samples = captureGuide != null ? captureGuide.getSamples() : null;
        if (samples != null && !samples.isEmpty()) {
            z4 = false;
        }
        if (this.e.e().isShortenedFlowPhilsysEnabled() && kotlin.jvm.internal.j.b(mayaEKYCSelectedDocument.getKey(), "PH_NATIONAL_ID") && !z4) {
            ((MayaKycSubmitIdFragment) ((K8.K) this.c.get())).P1();
            return;
        }
        if (o() && !z4) {
            ((MayaKycSubmitIdFragment) ((K8.K) this.c.get())).P1();
            return;
        }
        if (!o()) {
            MayaKycSubmitIdFragment mayaKycSubmitIdFragment3 = (MayaKycSubmitIdFragment) ((K8.K) this.c.get());
            MayaEKYCSelectedDocument mayaEKYCSelectedDocument3 = mayaKycSubmitIdFragment3.f12633c0;
            if (mayaEKYCSelectedDocument3 == null) {
                kotlin.jvm.internal.j.n("mSelectedDocument");
                throw null;
            }
            C0426x2 c0426x2 = new C0426x2(mayaEKYCSelectedDocument3);
            T2.Q(mayaKycSubmitIdFragment3, ((C0482u0) mayaKycSubmitIdFragment3.G1()).f4221b.getText().toString(), T2.l(mayaKycSubmitIdFragment3, c0426x2).toString(), null, 12);
            ConstraintLayout constraintLayout = ((C0482u0) mayaKycSubmitIdFragment3.G1()).f4220a;
            kotlin.jvm.internal.j.f(constraintLayout, "getRoot(...)");
            Navigation.findNavController(constraintLayout).navigate(c0426x2);
            return;
        }
        MayaKycSubmitIdFragment mayaKycSubmitIdFragment4 = (MayaKycSubmitIdFragment) ((K8.K) this.c.get());
        ConstraintLayout constraintLayout2 = ((C0482u0) mayaKycSubmitIdFragment4.G1()).f4220a;
        kotlin.jvm.internal.j.f(constraintLayout2, "getRoot(...)");
        MayaEKYCSelectedDocument mayaEKYCSelectedDocument4 = mayaKycSubmitIdFragment4.f12633c0;
        if (mayaEKYCSelectedDocument4 == null) {
            kotlin.jvm.internal.j.n("mSelectedDocument");
            throw null;
        }
        String buttonText = mayaEKYCSelectedDocument4.getDescription();
        kotlin.jvm.internal.j.g(buttonText, "buttonText");
        C0422w2 c0422w2 = new C0422w2("FRONT", mayaEKYCSelectedDocument4, false);
        T2.Q(mayaKycSubmitIdFragment4, buttonText, T2.l(mayaKycSubmitIdFragment4, c0422w2).toString(), null, 12);
        Navigation.findNavController(constraintLayout2).navigate(c0422w2);
    }
}
