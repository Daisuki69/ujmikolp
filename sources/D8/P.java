package D8;

import D.C0190x;
import M8.A2;
import M8.B2;
import M8.C0434z2;
import M8.M1;
import M8.T2;
import N5.C0484v0;
import a.AbstractC0617a;
import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cj.C1110A;
import cj.C1112C;
import com.paymaya.R;
import com.paymaya.common.utility.e0;
import com.paymaya.domain.model.KycCmsContent;
import com.paymaya.domain.model.KycCmsContentData;
import com.paymaya.domain.model.KycDisabledDocumentSelection;
import com.paymaya.domain.model.KycDocument;
import com.paymaya.domain.model.MayaEKYCSelectedDocument;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycSubmitSecondaryIdFragment;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class P extends C8.a {
    public final com.paymaya.data.preference.a e;
    public final e0 f;

    public P(com.paymaya.data.preference.a aVar, S5.c cVar, e0 e0Var) {
        super(aVar, 0);
        this.e = aVar;
        this.f = e0Var;
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        KycCmsContentData data;
        super.j();
        KeyEventDispatcher.Component componentRequireActivity = ((MayaKycSubmitSecondaryIdFragment) ((K8.L) this.c.get())).requireActivity();
        kotlin.jvm.internal.j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        KycCmsContent kycCmsContent = ((MayaKycActivity) ((H8.b) componentRequireActivity)).Z1().f;
        List<KycDocument> secondaryDocuments = (kycCmsContent == null || (data = kycCmsContent.getData()) == null) ? null : data.getSecondaryDocuments();
        if (secondaryDocuments == null) {
            secondaryDocuments = C1112C.f9377a;
        }
        ArrayList arrayListW = C1110A.W(secondaryDocuments);
        if (arrayListW.isEmpty()) {
            MayaKycSubmitSecondaryIdFragment mayaKycSubmitSecondaryIdFragment = (MayaKycSubmitSecondaryIdFragment) ((K8.L) this.c.get());
            ((C0484v0) mayaKycSubmitSecondaryIdFragment.G1()).e.setVisibility(8);
            ((C0484v0) mayaKycSubmitSecondaryIdFragment.G1()).f4235d.setVisibility(8);
        } else {
            Bundle arguments = ((MayaKycSubmitSecondaryIdFragment) ((K8.L) this.c.get())).getArguments();
            MayaEKYCSelectedDocument mayaEKYCSelectedDocument = arguments != null ? (MayaEKYCSelectedDocument) AbstractC0617a.D(arguments, "firstSelectedSecondaryIdDocument", MayaEKYCSelectedDocument.class) : null;
            kotlin.jvm.internal.D.a(arrayListW).remove(mayaEKYCSelectedDocument != null ? mayaEKYCSelectedDocument.getDocument() : null);
            MayaKycSubmitSecondaryIdFragment mayaKycSubmitSecondaryIdFragment2 = (MayaKycSubmitSecondaryIdFragment) ((K8.L) this.c.get());
            mayaKycSubmitSecondaryIdFragment2.getClass();
            mayaKycSubmitSecondaryIdFragment2.f12636X = new J8.c(arrayListW, new C0190x(0, mayaKycSubmitSecondaryIdFragment2, MayaKycSubmitSecondaryIdFragment.class, "enableButton", "enableButton()V", 0, 25), mayaKycSubmitSecondaryIdFragment2.f12637Y, "secondary", new M1(1, mayaKycSubmitSecondaryIdFragment2, MayaKycSubmitSecondaryIdFragment.class, "onClickSecondaryDocuments", "onClickSecondaryDocuments(Ljava/lang/String;)V", 0, 9), mayaKycSubmitSecondaryIdFragment2.K1().p(), false, new KycDisabledDocumentSelection(null, 0, 3, null));
            RecyclerView recyclerView = ((C0484v0) mayaKycSubmitSecondaryIdFragment2.G1()).f4235d;
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.setAdapter(mayaKycSubmitSecondaryIdFragment2.f12636X);
        }
        if (p()) {
            K8.L l6 = (K8.L) this.c.get();
            int color = ContextCompat.getColor(this.f.f10905a, R.color.ghost_white);
            MayaKycSubmitSecondaryIdFragment mayaKycSubmitSecondaryIdFragment3 = (MayaKycSubmitSecondaryIdFragment) l6;
            Object objRequireActivity = mayaKycSubmitSecondaryIdFragment3.requireActivity();
            kotlin.jvm.internal.j.e(objRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
            Object obj = (H8.b) objRequireActivity;
            ((MayaKycActivity) obj).r2(color);
            ((y5.q) obj).N1(color);
            ((C0484v0) mayaKycSubmitSecondaryIdFragment3.G1()).c.setBackgroundColor(color);
            ((C0484v0) ((MayaKycSubmitSecondaryIdFragment) ((K8.L) this.c.get())).G1()).f4234b.setVisibility(8);
        }
    }

    public final void o() {
        MayaKycSubmitSecondaryIdFragment mayaKycSubmitSecondaryIdFragment = (MayaKycSubmitSecondaryIdFragment) ((K8.L) this.c.get());
        ConstraintLayout constraintLayout = ((C0484v0) mayaKycSubmitSecondaryIdFragment.G1()).f4233a;
        kotlin.jvm.internal.j.f(constraintLayout, "getRoot(...)");
        E1.c.m(Navigation.findNavController(constraintLayout), new C0434z2(T2.j(mayaKycSubmitSecondaryIdFragment)));
    }

    public final boolean p() {
        return this.e.e().isKycUxTofuRedesignEnabled();
    }

    public final void q(MayaEKYCSelectedDocument mayaEKYCSelectedDocument) {
        if (mayaEKYCSelectedDocument == null) {
            return;
        }
        if (this.e.e().isSupportSecondaryIdFlowEnabled()) {
            MayaKycSubmitSecondaryIdFragment mayaKycSubmitSecondaryIdFragment = (MayaKycSubmitSecondaryIdFragment) ((K8.L) this.c.get());
            mayaKycSubmitSecondaryIdFragment.getClass();
            KeyEventDispatcher.Component componentRequireActivity = mayaKycSubmitSecondaryIdFragment.requireActivity();
            kotlin.jvm.internal.j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
            ((MayaKycActivity) ((H8.b) componentRequireActivity)).V1(1, mayaEKYCSelectedDocument);
        }
        if (!p()) {
            MayaKycSubmitSecondaryIdFragment mayaKycSubmitSecondaryIdFragment2 = (MayaKycSubmitSecondaryIdFragment) ((K8.L) this.c.get());
            MayaEKYCSelectedDocument mayaEKYCSelectedDocument2 = mayaKycSubmitSecondaryIdFragment2.f12639a0;
            if (mayaEKYCSelectedDocument2 == null) {
                kotlin.jvm.internal.j.n("mSelectedDocument");
                throw null;
            }
            B2 b22 = new B2(mayaEKYCSelectedDocument2);
            T2.Q(mayaKycSubmitSecondaryIdFragment2, ((C0484v0) mayaKycSubmitSecondaryIdFragment2.G1()).f4234b.getText().toString(), T2.l(mayaKycSubmitSecondaryIdFragment2, b22).toString(), null, 12);
            ConstraintLayout constraintLayout = ((C0484v0) mayaKycSubmitSecondaryIdFragment2.G1()).f4233a;
            kotlin.jvm.internal.j.f(constraintLayout, "getRoot(...)");
            Navigation.findNavController(constraintLayout).navigate(b22);
            return;
        }
        MayaKycSubmitSecondaryIdFragment mayaKycSubmitSecondaryIdFragment3 = (MayaKycSubmitSecondaryIdFragment) ((K8.L) this.c.get());
        ConstraintLayout constraintLayout2 = ((C0484v0) mayaKycSubmitSecondaryIdFragment3.G1()).f4233a;
        kotlin.jvm.internal.j.f(constraintLayout2, "getRoot(...)");
        MayaEKYCSelectedDocument mayaEKYCSelectedDocument3 = mayaKycSubmitSecondaryIdFragment3.f12639a0;
        if (mayaEKYCSelectedDocument3 == null) {
            kotlin.jvm.internal.j.n("mSelectedDocument");
            throw null;
        }
        String buttonText = mayaEKYCSelectedDocument3.getDescription();
        kotlin.jvm.internal.j.g(buttonText, "buttonText");
        A2 a22 = new A2("FRONT", mayaEKYCSelectedDocument3, true);
        T2.Q(mayaKycSubmitSecondaryIdFragment3, buttonText, T2.l(mayaKycSubmitSecondaryIdFragment3, a22).toString(), null, 12);
        Navigation.findNavController(constraintLayout2).navigate(a22);
    }
}
