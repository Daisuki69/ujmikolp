package D8;

import D.C0190x;
import K8.InterfaceC0295u;
import M8.C0347d2;
import M8.C0370j1;
import M8.C0378l1;
import M8.C0382m1;
import M8.C0386n1;
import M8.C0390o1;
import M8.C0428y0;
import M8.N1;
import M8.T1;
import M8.T2;
import N5.C0454g0;
import N5.C0491z;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.navigation.Navigation;
import androidx.navigation.ViewKt;
import cj.C1112C;
import com.paymaya.R;
import com.paymaya.data.api.KycInHouseApi;
import com.paymaya.domain.model.ImageQualityRequest;
import com.paymaya.domain.model.KycCaptureGuide;
import com.paymaya.domain.model.KycCmsContentData;
import com.paymaya.domain.model.KycDocument;
import com.paymaya.domain.model.KycDocumentTypeGuide;
import com.paymaya.domain.model.KycImageQualityConfidence;
import com.paymaya.domain.model.KycUploadRequest;
import com.paymaya.domain.model.MayaEKYCSelectedDocument;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycIdReviewFragment;
import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class D extends C8.a {
    public final Y.e e;
    public final E8.y f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.paymaya.data.preference.a f1008g;
    public boolean h;
    public boolean i;
    public KycImageQualityConfidence j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Integer f1009k;

    public D(Y.e eVar, E8.y yVar, com.paymaya.data.preference.a aVar, S5.c cVar) {
        super(aVar, 0);
        this.e = eVar;
        this.f = yVar;
        this.f1008g = aVar;
    }

    public final void A() {
        if (((MayaKycIdReviewFragment) ((InterfaceC0295u) this.c.get())).Y1()) {
            MayaKycIdReviewFragment mayaKycIdReviewFragment = (MayaKycIdReviewFragment) ((InterfaceC0295u) this.c.get());
            String string = mayaKycIdReviewFragment.getString(R.string.maya_kyc_id_review_label_choose_different_id);
            kotlin.jvm.internal.j.f(string, "getString(...)");
            String string2 = mayaKycIdReviewFragment.getString(R.string.maya_fragment_kyc_submit_secondary_id_screen_label);
            kotlin.jvm.internal.j.f(string2, "getString(...)");
            T2.Q(mayaKycIdReviewFragment, string, string2, null, 12);
            ConstraintLayout constraintLayout = ((C0454g0) mayaKycIdReviewFragment.G1()).f4096a;
            kotlin.jvm.internal.j.f(constraintLayout, "getRoot(...)");
            Navigation.findNavController(constraintLayout).popBackStack(R.id.maya_kyc_submit_secondary_id_fragment, false);
            return;
        }
        if (!((MayaKycIdReviewFragment) ((InterfaceC0295u) this.c.get())).W1() || !((MayaKycIdReviewFragment) ((InterfaceC0295u) this.c.get())).X1()) {
            ((MayaKycIdReviewFragment) ((InterfaceC0295u) this.c.get())).K1();
            return;
        }
        MayaKycIdReviewFragment mayaKycIdReviewFragment2 = (MayaKycIdReviewFragment) ((InterfaceC0295u) this.c.get());
        String string3 = mayaKycIdReviewFragment2.getString(R.string.maya_kyc_id_review_label_choose_different_id);
        kotlin.jvm.internal.j.f(string3, "getString(...)");
        T2.Q(mayaKycIdReviewFragment2, string3, T2.y(mayaKycIdReviewFragment2), null, 12);
        ((MayaKycIdReviewFragment) ((InterfaceC0295u) this.c.get())).a2();
    }

    public final void B(Throwable throwable) {
        kotlin.jvm.internal.j.g(throwable, "throwable");
        MayaKycIdReviewFragment mayaKycIdReviewFragment = (MayaKycIdReviewFragment) ((InterfaceC0295u) this.c.get());
        ((ConstraintLayout) ((C0454g0) mayaKycIdReviewFragment.G1()).f4097b.f4303b).setVisibility(0);
        ((C0454g0) mayaKycIdReviewFragment.G1()).c.f4041b.setVisibility(8);
        l(throwable, new C0190x(0, this.c.get(), InterfaceC0295u.class, "showPreSubmissionIdInvalidError", "showPreSubmissionIdInvalidError()V", 0, 8), null, new Ag.d(this, 11));
    }

    public final void C(MayaEKYCSelectedDocument mayaEKYCSelectedDocument) {
        MayaKycIdReviewFragment mayaKycIdReviewFragment = (MayaKycIdReviewFragment) ((InterfaceC0295u) this.c.get());
        File cacheDir = mayaKycIdReviewFragment.requireContext().getCacheDir();
        kotlin.jvm.internal.j.f(cacheDir, "getCacheDir(...)");
        MayaEKYCSelectedDocument mayaEKYCSelectedDocumentV1 = mayaKycIdReviewFragment.V1();
        if (mayaEKYCSelectedDocumentV1 != null) {
            String path = cacheDir.getPath();
            String str = File.separator;
            File file = new File(path + str + "kycpictures" + str + mayaEKYCSelectedDocumentV1.getKey() + ".jpg");
            if (!file.exists()) {
                file = null;
            }
            if (file != null) {
                file.delete();
            }
        }
        if (!s().equals("FRONT")) {
            z();
            return;
        }
        if (v() == 1) {
            if (x()) {
                E8.y yVar = this.f;
                KycCmsContentData kycCmsContentDataM1 = ((MayaKycIdReviewFragment) ((InterfaceC0295u) this.c.get())).M1();
                String documentKey = ((MayaKycIdReviewFragment) ((InterfaceC0295u) this.c.get())).N1();
                yVar.getClass();
                kotlin.jvm.internal.j.g(documentKey, "documentKey");
                if (yVar.f(kycCmsContentDataM1, documentKey) && E8.y.e(kycCmsContentDataM1, documentKey)) {
                    ((MayaKycIdReviewFragment) ((InterfaceC0295u) this.c.get())).e2();
                }
            } else {
                ((MayaKycIdReviewFragment) ((InterfaceC0295u) this.c.get())).e2();
            }
        }
        if (!mayaEKYCSelectedDocument.getRequiresBackId()) {
            z();
            return;
        }
        if (!this.f1008g.e().isCameraXEnabled()) {
            MayaKycIdReviewFragment mayaKycIdReviewFragment2 = (MayaKycIdReviewFragment) ((InterfaceC0295u) this.c.get());
            MayaEKYCSelectedDocument mayaEKYCSelectedDocumentV12 = mayaKycIdReviewFragment2.V1();
            if (mayaEKYCSelectedDocumentV12 != null) {
                C0378l1 c0378l1 = new C0378l1(mayaEKYCSelectedDocumentV12, mayaKycIdReviewFragment2.Y1());
                String string = mayaKycIdReviewFragment2.getString(R.string.maya_kyc_everything_clear_label_use_photo);
                kotlin.jvm.internal.j.f(string, "getString(...)");
                T2.Q(mayaKycIdReviewFragment2, string, T2.l(mayaKycIdReviewFragment2, c0378l1).toString(), null, 12);
                ConstraintLayout constraintLayout = ((C0454g0) mayaKycIdReviewFragment2.G1()).f4096a;
                kotlin.jvm.internal.j.f(constraintLayout, "getRoot(...)");
                Navigation.findNavController(constraintLayout).navigate(c0378l1);
                return;
            }
            return;
        }
        if (this.f1008g.e().isShortenedFlowIdCaptureV3Enabled()) {
            MayaKycIdReviewFragment mayaKycIdReviewFragment3 = (MayaKycIdReviewFragment) ((InterfaceC0295u) this.c.get());
            MayaEKYCSelectedDocument mayaEKYCSelectedDocumentV13 = mayaKycIdReviewFragment3.V1();
            if (mayaEKYCSelectedDocumentV13 != null) {
                C0386n1 c0386n1 = new C0386n1(mayaEKYCSelectedDocumentV13, mayaKycIdReviewFragment3.Y1());
                String string2 = mayaKycIdReviewFragment3.getString(R.string.maya_kyc_everything_clear_label_use_photo);
                kotlin.jvm.internal.j.f(string2, "getString(...)");
                T2.Q(mayaKycIdReviewFragment3, string2, T2.l(mayaKycIdReviewFragment3, c0386n1).toString(), null, 12);
                ConstraintLayout constraintLayout2 = ((C0454g0) mayaKycIdReviewFragment3.G1()).f4096a;
                kotlin.jvm.internal.j.f(constraintLayout2, "getRoot(...)");
                Navigation.findNavController(constraintLayout2).navigate(c0386n1);
                return;
            }
            return;
        }
        MayaKycIdReviewFragment mayaKycIdReviewFragment4 = (MayaKycIdReviewFragment) ((InterfaceC0295u) this.c.get());
        MayaEKYCSelectedDocument mayaEKYCSelectedDocumentV14 = mayaKycIdReviewFragment4.V1();
        if (mayaEKYCSelectedDocumentV14 != null) {
            C0382m1 c0382m1 = new C0382m1(mayaEKYCSelectedDocumentV14, mayaKycIdReviewFragment4.Y1());
            String string3 = mayaKycIdReviewFragment4.getString(R.string.maya_kyc_everything_clear_label_use_photo);
            kotlin.jvm.internal.j.f(string3, "getString(...)");
            T2.Q(mayaKycIdReviewFragment4, string3, T2.l(mayaKycIdReviewFragment4, c0382m1).toString(), null, 12);
            ConstraintLayout constraintLayout3 = ((C0454g0) mayaKycIdReviewFragment4.G1()).f4096a;
            kotlin.jvm.internal.j.f(constraintLayout3, "getRoot(...)");
            Navigation.findNavController(constraintLayout3).navigate(c0382m1);
        }
    }

    public final boolean D() {
        if (((MayaKycIdReviewFragment) ((InterfaceC0295u) this.c.get())).W1()) {
            if (s().equals("FRONT")) {
                Boolean bool = ((MayaKycIdReviewFragment) ((InterfaceC0295u) this.c.get())).f12550d0;
                if (!(bool != null ? bool.booleanValue() : false)) {
                    y();
                    return true;
                }
            }
            if (!((MayaKycIdReviewFragment) ((InterfaceC0295u) this.c.get())).X1()) {
                MayaKycIdReviewFragment mayaKycIdReviewFragment = (MayaKycIdReviewFragment) ((InterfaceC0295u) this.c.get());
                if (!(mayaKycIdReviewFragment.Q1().length() > 0 && mayaKycIdReviewFragment.T1().getMatchingConfidenceLevel() == com.paymaya.common.utility.G.f10416d)) {
                    y();
                    return true;
                }
                MayaKycIdReviewFragment mayaKycIdReviewFragment2 = (MayaKycIdReviewFragment) ((InterfaceC0295u) this.c.get());
                ConstraintLayout constraintLayout = ((C0454g0) mayaKycIdReviewFragment2.G1()).f4096a;
                kotlin.jvm.internal.j.f(constraintLayout, "getRoot(...)");
                Navigation.findNavController(constraintLayout).popBackStack(R.id.maya_kyc_document_id_guide_fragment, false);
                MayaEKYCSelectedDocument mayaEKYCSelectedDocumentV1 = mayaKycIdReviewFragment2.V1();
                kotlin.jvm.internal.j.d(mayaEKYCSelectedDocumentV1);
                C0428y0 c0428y0 = new C0428y0(mayaEKYCSelectedDocumentV1);
                String string = mayaKycIdReviewFragment2.getString(R.string.pma_label_paymaya_take_photo);
                kotlin.jvm.internal.j.f(string, "getString(...)");
                T2.Q(mayaKycIdReviewFragment2, string, T2.l(mayaKycIdReviewFragment2, c0428y0).toString(), null, 12);
                ConstraintLayout constraintLayout2 = ((C0454g0) mayaKycIdReviewFragment2.G1()).f4096a;
                kotlin.jvm.internal.j.f(constraintLayout2, "getRoot(...)");
                E1.c.m(Navigation.findNavController(constraintLayout2), c0428y0);
                return true;
            }
            String strS = s();
            if (strS.equals("FRONT")) {
                ((MayaKycIdReviewFragment) ((InterfaceC0295u) this.c.get())).e2();
                MayaKycIdReviewFragment mayaKycIdReviewFragment3 = (MayaKycIdReviewFragment) ((InterfaceC0295u) this.c.get());
                String upperCase = mayaKycIdReviewFragment3.U1().getQualityResult().toUpperCase(Locale.ROOT);
                kotlin.jvm.internal.j.f(upperCase, "toUpperCase(...)");
                KeyEventDispatcher.Component componentRequireActivity = mayaKycIdReviewFragment3.requireActivity();
                kotlin.jvm.internal.j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                ((MayaKycActivity) ((H8.b) componentRequireActivity)).f12457y = upperCase;
                ((MayaKycIdReviewFragment) ((InterfaceC0295u) this.c.get())).b2(true);
                return true;
            }
            if (strS.equals("BACK")) {
                MayaKycIdReviewFragment mayaKycIdReviewFragment4 = (MayaKycIdReviewFragment) ((InterfaceC0295u) this.c.get());
                String str = mayaKycIdReviewFragment4.R1().f1319o;
                KeyEventDispatcher.Component componentRequireActivity2 = mayaKycIdReviewFragment4.requireActivity();
                kotlin.jvm.internal.j.e(componentRequireActivity2, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                ((MayaKycActivity) ((H8.b) componentRequireActivity2)).f12456x = str;
                ((MayaKycIdReviewFragment) ((InterfaceC0295u) this.c.get())).b2(false);
                return true;
            }
        }
        return false;
    }

    public final void E() {
        String str;
        String string;
        KycDocument document;
        String description;
        String string2;
        KycDocument document2;
        String description2;
        String string3;
        MayaKycIdReviewFragment mayaKycIdReviewFragment = (MayaKycIdReviewFragment) ((InterfaceC0295u) this.c.get());
        if (mayaKycIdReviewFragment.Q1().length() > 0 && mayaKycIdReviewFragment.T1().getMatchingConfidenceLevel() == com.paymaya.common.utility.G.e) {
            InterfaceC0295u interfaceC0295u = (InterfaceC0295u) this.c.get();
            MayaEKYCSelectedDocument mayaEKYCSelectedDocumentV1 = ((MayaKycIdReviewFragment) ((InterfaceC0295u) this.c.get())).V1();
            if (mayaEKYCSelectedDocumentV1 == null || (description2 = mayaEKYCSelectedDocumentV1.getDescription()) == null) {
                description2 = "selected ID";
            }
            MayaKycIdReviewFragment mayaKycIdReviewFragment2 = (MayaKycIdReviewFragment) interfaceC0295u;
            mayaKycIdReviewFragment2.getClass();
            mayaKycIdReviewFragment2.f12548b0 = false;
            mayaKycIdReviewFragment2.f12554h0 = true;
            C0454g0 c0454g0 = (C0454g0) mayaKycIdReviewFragment2.G1();
            if (mayaKycIdReviewFragment2.t1().e().isShowIdScoreEnabled()) {
                string3 = mayaKycIdReviewFragment2.getString(R.string.maya_kyc_id_review_header_unpublished_id) + " (" + mayaKycIdReviewFragment2.T1().getScore() + ")";
            } else {
                string3 = mayaKycIdReviewFragment2.getString(R.string.maya_kyc_id_review_header_unpublished_id);
                kotlin.jvm.internal.j.d(string3);
            }
            C0491z c0491z = c0454g0.f4097b;
            ((ImageView) c0491z.f).setImageDrawable(ContextCompat.getDrawable(mayaKycIdReviewFragment2.requireContext(), R.drawable.maya_ic_transaction_receipt_status_failed));
            ((TextView) c0491z.f4304d).setText(string3);
            ((TextView) c0491z.h).setText(mayaKycIdReviewFragment2.getString(R.string.maya_kyc_id_review_sub_header_unpublished_id, description2));
            ((Button) c0491z.c).setText(mayaKycIdReviewFragment2.L1().b() ? mayaKycIdReviewFragment2.getString(R.string.maya_kyc_id_review_label_upload_new_photo) : mayaKycIdReviewFragment2.getString(R.string.maya_kyc_id_review_label_take_new_photo));
            ((TextView) c0491z.f4305g).setText(mayaKycIdReviewFragment2.getString(R.string.maya_kyc_id_review_label_choose_different_id));
            return;
        }
        if (((MayaKycIdReviewFragment) ((InterfaceC0295u) this.c.get())).X1()) {
            ((MayaKycIdReviewFragment) ((InterfaceC0295u) this.c.get())).d2();
            return;
        }
        MayaKycIdReviewFragment mayaKycIdReviewFragment3 = (MayaKycIdReviewFragment) ((InterfaceC0295u) this.c.get());
        str = "";
        if (mayaKycIdReviewFragment3.Q1().length() > 0 && mayaKycIdReviewFragment3.T1().getMatchingConfidenceLevel() == com.paymaya.common.utility.G.f10415b) {
            InterfaceC0295u interfaceC0295u2 = (InterfaceC0295u) this.c.get();
            String strS = s();
            MayaEKYCSelectedDocument mayaEKYCSelectedDocumentV12 = ((MayaKycIdReviewFragment) ((InterfaceC0295u) this.c.get())).V1();
            String description3 = (mayaEKYCSelectedDocumentV12 == null || (document2 = mayaEKYCSelectedDocumentV12.getDocument()) == null) ? null : document2.getDescription();
            str = description3 != null ? description3 : "";
            MayaKycIdReviewFragment mayaKycIdReviewFragment4 = (MayaKycIdReviewFragment) interfaceC0295u2;
            mayaKycIdReviewFragment4.getClass();
            mayaKycIdReviewFragment4.f12548b0 = false;
            mayaKycIdReviewFragment4.f12551e0 = true;
            C0454g0 c0454g02 = (C0454g0) mayaKycIdReviewFragment4.G1();
            if (mayaKycIdReviewFragment4.t1().e().isShowIdScoreEnabled()) {
                string2 = mayaKycIdReviewFragment4.getString(R.string.maya_kyc_id_review_header_mismatch_front_back_id) + " (" + mayaKycIdReviewFragment4.T1().getScore() + ")";
            } else {
                string2 = mayaKycIdReviewFragment4.getString(R.string.maya_kyc_id_review_header_mismatch_front_back_id);
                kotlin.jvm.internal.j.d(string2);
            }
            C0491z c0491z2 = c0454g02.f4097b;
            ((ImageView) c0491z2.f).setImageDrawable(ContextCompat.getDrawable(mayaKycIdReviewFragment4.requireContext(), R.drawable.maya_ic_transaction_receipt_status_failed));
            ((TextView) c0491z2.f4304d).setText(string2);
            String lowerCase = strS.toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.j.f(lowerCase, "toLowerCase(...)");
            String str2 = lowerCase.equals("front") ? "BACK" : lowerCase.equals("back") ? "FRONT" : strS;
            Locale locale = Locale.getDefault();
            kotlin.jvm.internal.j.f(locale, "getDefault(...)");
            String lowerCase2 = str2.toLowerCase(locale);
            kotlin.jvm.internal.j.f(lowerCase2, "toLowerCase(...)");
            String strC2 = mayaKycIdReviewFragment4.c2();
            if (strC2.equals("EPHIL_ID") || strC2.equals("EPHIL_BACK")) {
                str = "ePhil ID (Paper ID)";
            }
            Locale locale2 = Locale.getDefault();
            kotlin.jvm.internal.j.f(locale2, "getDefault(...)");
            String upperCase = strS.toUpperCase(locale2);
            kotlin.jvm.internal.j.f(upperCase, "toUpperCase(...)");
            Locale locale3 = Locale.getDefault();
            kotlin.jvm.internal.j.f(locale3, "getDefault(...)");
            String lowerCase3 = strS.toLowerCase(locale3);
            kotlin.jvm.internal.j.f(lowerCase3, "toLowerCase(...)");
            ((TextView) c0491z2.h).setText(mayaKycIdReviewFragment4.getString(R.string.maya_kyc_id_review_sub_header_mismatch_front_back_id, lowerCase2, str, upperCase, lowerCase3));
            ((Button) c0491z2.c).setText(mayaKycIdReviewFragment4.L1().b() ? mayaKycIdReviewFragment4.getString(R.string.maya_kyc_id_review_label_upload_new_photo) : mayaKycIdReviewFragment4.getString(R.string.maya_kyc_id_review_label_take_new_photo));
            ((TextView) c0491z2.f4305g).setText(mayaKycIdReviewFragment4.getString(R.string.maya_kyc_id_review_label_choose_different_id));
            return;
        }
        MayaKycIdReviewFragment mayaKycIdReviewFragment5 = (MayaKycIdReviewFragment) ((InterfaceC0295u) this.c.get());
        if (mayaKycIdReviewFragment5.Q1().length() > 0 && mayaKycIdReviewFragment5.T1().getMatchingConfidenceLevel() == com.paymaya.common.utility.G.c) {
            MayaKycIdReviewFragment mayaKycIdReviewFragment6 = (MayaKycIdReviewFragment) ((InterfaceC0295u) this.c.get());
            mayaKycIdReviewFragment6.f12548b0 = false;
            mayaKycIdReviewFragment6.f12552f0 = true;
            C0491z c0491z3 = ((C0454g0) mayaKycIdReviewFragment6.G1()).f4097b;
            ((ImageView) c0491z3.f).setImageDrawable(ContextCompat.getDrawable(mayaKycIdReviewFragment6.requireContext(), R.drawable.maya_ic_transaction_receipt_status_failed));
            ((TextView) c0491z3.f4304d).setText(mayaKycIdReviewFragment6.getString(R.string.maya_kyc_id_review_header_philsys_capture_mismatch));
            ((TextView) c0491z3.h).setText(mayaKycIdReviewFragment6.getString(R.string.maya_kyc_id_review_sub_header_philsys_capture_mismatch));
            ((Button) c0491z3.c).setText(mayaKycIdReviewFragment6.getString(R.string.maya_kyc_philsys_id_guide_upload_id));
            ((TextView) c0491z3.f4305g).setText(mayaKycIdReviewFragment6.getString(R.string.maya_kyc_id_review_label_choose_different_id));
            return;
        }
        MayaKycIdReviewFragment mayaKycIdReviewFragment7 = (MayaKycIdReviewFragment) ((InterfaceC0295u) this.c.get());
        if (mayaKycIdReviewFragment7.Q1().length() > 0 && mayaKycIdReviewFragment7.T1().getMatchingConfidenceLevel() == com.paymaya.common.utility.G.f10416d) {
            MayaKycIdReviewFragment mayaKycIdReviewFragment8 = (MayaKycIdReviewFragment) ((InterfaceC0295u) this.c.get());
            mayaKycIdReviewFragment8.f12548b0 = false;
            mayaKycIdReviewFragment8.f12553g0 = true;
            C0491z c0491z4 = ((C0454g0) mayaKycIdReviewFragment8.G1()).f4097b;
            ((ImageView) c0491z4.f).setImageDrawable(ContextCompat.getDrawable(mayaKycIdReviewFragment8.requireContext(), R.drawable.maya_ic_transaction_receipt_status_failed));
            ((TextView) c0491z4.f4304d).setText(mayaKycIdReviewFragment8.getString(R.string.maya_kyc_id_review_header_philsys_upload_mismatch));
            ((TextView) c0491z4.h).setText(mayaKycIdReviewFragment8.getString(R.string.maya_kyc_id_review_sub_header_philsys_upload_mismatch));
            ((Button) c0491z4.c).setText(mayaKycIdReviewFragment8.getString(R.string.pma_label_paymaya_take_photo));
            ((TextView) c0491z4.f4305g).setText(mayaKycIdReviewFragment8.getString(R.string.maya_kyc_id_review_label_choose_different_id));
            return;
        }
        InterfaceC0295u interfaceC0295u3 = (InterfaceC0295u) this.c.get();
        MayaEKYCSelectedDocument mayaEKYCSelectedDocumentU = u();
        if (mayaEKYCSelectedDocumentU != null && (document = mayaEKYCSelectedDocumentU.getDocument()) != null && (description = document.getDescription()) != null) {
            str = description;
        }
        MayaKycIdReviewFragment mayaKycIdReviewFragment9 = (MayaKycIdReviewFragment) interfaceC0295u3;
        mayaKycIdReviewFragment9.getClass();
        mayaKycIdReviewFragment9.f12548b0 = false;
        C0454g0 c0454g03 = (C0454g0) mayaKycIdReviewFragment9.G1();
        if (mayaKycIdReviewFragment9.t1().e().isShowIdScoreEnabled()) {
            string = mayaKycIdReviewFragment9.getString(R.string.maya_kyc_id_review_header_different_id) + " (" + mayaKycIdReviewFragment9.T1().getScore() + ")";
        } else {
            string = mayaKycIdReviewFragment9.getString(R.string.maya_kyc_id_review_header_different_id);
            kotlin.jvm.internal.j.d(string);
        }
        C0491z c0491z5 = c0454g03.f4097b;
        ((ImageView) c0491z5.f).setImageDrawable(ContextCompat.getDrawable(mayaKycIdReviewFragment9.requireContext(), R.drawable.maya_ic_transaction_receipt_status_failed));
        ((TextView) c0491z5.f4304d).setText(string);
        ((TextView) c0491z5.h).setText(mayaKycIdReviewFragment9.getString(R.string.maya_kyc_id_review_sub_header_different_id, str));
        ((Button) c0491z5.c).setText(mayaKycIdReviewFragment9.L1().b() ? mayaKycIdReviewFragment9.getString(R.string.maya_kyc_id_review_label_upload_new_photo) : mayaKycIdReviewFragment9.getString(R.string.maya_kyc_id_review_label_take_new_photo));
        ((TextView) c0491z5.f4305g).setText(mayaKycIdReviewFragment9.getString(R.string.maya_kyc_id_review_label_choose_different_id));
    }

    public final void F() {
        if (!this.f1008g.e().isKycIdImageQualityEnabled()) {
            o();
            return;
        }
        MayaKycIdReviewFragment mayaKycIdReviewFragment = (MayaKycIdReviewFragment) ((InterfaceC0295u) this.c.get());
        ((ConstraintLayout) ((C0454g0) mayaKycIdReviewFragment.G1()).f4097b.f4303b).setVisibility(8);
        ((C0454g0) mayaKycIdReviewFragment.G1()).c.f4041b.setVisibility(0);
        String upperCase = ((MayaKycIdReviewFragment) ((InterfaceC0295u) this.c.get())).U1().getQualityResult().toUpperCase(Locale.ROOT);
        kotlin.jvm.internal.j.f(upperCase, "toUpperCase(...)");
        KycUploadRequest kycUploadRequestT = t();
        MayaEKYCSelectedDocument mayaEKYCSelectedDocumentU = u();
        kotlin.jvm.internal.j.d(mayaEKYCSelectedDocumentU);
        e(new Hh.f(((MayaKycIdReviewFragment) ((InterfaceC0295u) this.c.get())).W1() ? this.e.w(v(), kycUploadRequestT) : new Hh.a(((KycInHouseApi) this.e.f6708b).postImageQuality(new ImageQualityRequest(mayaEKYCSelectedDocumentU.getKey(), s(), upperCase)).f(Th.e.c), this.e.w(v(), kycUploadRequestT), 0), zh.b.a(), 0).a(new C(this, 1)).b(new V2.c(this, 12)).c());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0498, code lost:
    
        if (r2.equals("DARK") == false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x049f, code lost:
    
        if (r2.equals("TAMPERED_ID") == false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x04b8, code lost:
    
        if (r2.equals("DAMAGED_ID") == false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x04bc, code lost:
    
        r3 = r1.getString(com.paymaya.R.string.maya_kyc_id_review_header_id_cannot_be_read_damaged);
        kotlin.jvm.internal.j.f(r3, "getString(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x04df, code lost:
    
        if (r2.equals("SHADOWS") == false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x04e3, code lost:
    
        r3 = r1.getString(com.paymaya.R.string.maya_kyc_id_review_header_photo_too_dark);
        kotlin.jvm.internal.j.f(r3, "getString(...)");
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0421 A[PHI: r31 r32
  0x0421: PHI (r31v5 java.lang.Object) = 
  (r31v0 java.lang.Object)
  (r31v2 java.lang.Object)
  (r31v0 java.lang.Object)
  (r31v0 java.lang.Object)
  (r31v0 java.lang.Object)
  (r31v0 java.lang.Object)
  (r31v0 java.lang.Object)
  (r31v0 java.lang.Object)
  (r31v0 java.lang.Object)
  (r31v0 java.lang.Object)
  (r31v0 java.lang.Object)
  (r31v0 java.lang.Object)
  (r31v0 java.lang.Object)
  (r31v0 java.lang.Object)
  (r31v0 java.lang.Object)
 binds: [B:131:0x041e, B:185:0x050f, B:181:0x04f6, B:176:0x04df, B:172:0x04cc, B:168:0x04b8, B:164:0x04a7, B:161:0x049f, B:158:0x0498, B:154:0x0485, B:150:0x0472, B:146:0x045f, B:142:0x044f, B:138:0x043c, B:134:0x0429] A[DONT_GENERATE, DONT_INLINE]
  0x0421: PHI (r32v5 java.lang.Object) = 
  (r32v0 java.lang.Object)
  (r32v0 java.lang.Object)
  (r32v2 java.lang.Object)
  (r32v0 java.lang.Object)
  (r32v0 java.lang.Object)
  (r32v0 java.lang.Object)
  (r32v0 java.lang.Object)
  (r32v0 java.lang.Object)
  (r32v0 java.lang.Object)
  (r32v0 java.lang.Object)
  (r32v0 java.lang.Object)
  (r32v0 java.lang.Object)
  (r32v0 java.lang.Object)
  (r32v0 java.lang.Object)
  (r32v0 java.lang.Object)
 binds: [B:131:0x041e, B:185:0x050f, B:181:0x04f6, B:176:0x04df, B:172:0x04cc, B:168:0x04b8, B:164:0x04a7, B:161:0x049f, B:158:0x0498, B:154:0x0485, B:150:0x0472, B:146:0x045f, B:142:0x044f, B:138:0x043c, B:134:0x0429] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0606  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0695  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:370:? A[SYNTHETIC] */
    @Override // y5.AbstractC2509a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() {
        /*
            Method dump skipped, instruction units count: 2632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D8.D.j():void");
    }

    public final void o() {
        MayaKycIdReviewFragment mayaKycIdReviewFragment = (MayaKycIdReviewFragment) ((InterfaceC0295u) this.c.get());
        ((ConstraintLayout) ((C0454g0) mayaKycIdReviewFragment.G1()).f4097b.f4303b).setVisibility(8);
        ((C0454g0) mayaKycIdReviewFragment.G1()).c.f4041b.setVisibility(0);
        e(new Hh.f(this.e.w(v(), t()), zh.b.a(), 0).a(new C(this, 0)).b(new J5.c(this, 13)).c());
    }

    public final KycCaptureGuide p(String str) {
        List<KycCaptureGuide> captureGuides;
        KycCmsContentData kycCmsContentDataM1 = ((MayaKycIdReviewFragment) ((InterfaceC0295u) this.c.get())).M1();
        Object obj = null;
        if (kycCmsContentDataM1 == null || (captureGuides = kycCmsContentDataM1.getCaptureGuides()) == null) {
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

    public final KycDocument q(String str) {
        KycDocument kycDocument;
        Object next;
        Object next2;
        KycCmsContentData kycCmsContentDataM1 = ((MayaKycIdReviewFragment) ((InterfaceC0295u) this.c.get())).M1();
        Object obj = null;
        if (kycCmsContentDataM1 == null) {
            return null;
        }
        List<KycDocument> recommendedDocuments = kycCmsContentDataM1.getRecommendedDocuments();
        if (recommendedDocuments != null) {
            Iterator<T> it = recommendedDocuments.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
                if (kotlin.jvm.internal.j.b(((KycDocument) next2).getKey(), str)) {
                    break;
                }
            }
            KycDocument kycDocument2 = (KycDocument) next2;
            if (kycDocument2 != null) {
                return kycDocument2;
            }
        }
        List<KycDocument> otherPrimaryDocuments = kycCmsContentDataM1.getOtherPrimaryDocuments();
        if (otherPrimaryDocuments != null) {
            Iterator<T> it2 = otherPrimaryDocuments.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (kotlin.jvm.internal.j.b(((KycDocument) next).getKey(), str)) {
                    break;
                }
            }
            kycDocument = (KycDocument) next;
        } else {
            kycDocument = null;
        }
        if (kycDocument != null) {
            return kycDocument;
        }
        List<KycDocument> secondaryDocuments = kycCmsContentDataM1.getSecondaryDocuments();
        if (secondaryDocuments == null) {
            return null;
        }
        Iterator<T> it3 = secondaryDocuments.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next3 = it3.next();
            if (kotlin.jvm.internal.j.b(((KycDocument) next3).getKey(), str)) {
                obj = next3;
                break;
            }
        }
        return (KycDocument) obj;
    }

    public final String r(String str) {
        KycCmsContentData kycCmsContentDataM1 = ((MayaKycIdReviewFragment) ((InterfaceC0295u) this.c.get())).M1();
        if (kycCmsContentDataM1 == null) {
            return "recommended";
        }
        List<KycDocument> recommendedDocuments = kycCmsContentDataM1.getRecommendedDocuments();
        if (recommendedDocuments == null) {
            recommendedDocuments = C1112C.f9377a;
        }
        List<KycDocument> list = recommendedDocuments;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (kotlin.jvm.internal.j.b(((KycDocument) it.next()).getKey(), str)) {
                    return "recommended";
                }
            }
        }
        List<KycDocument> otherPrimaryDocuments = kycCmsContentDataM1.getOtherPrimaryDocuments();
        if (otherPrimaryDocuments == null) {
            otherPrimaryDocuments = C1112C.f9377a;
        }
        List<KycDocument> list2 = otherPrimaryDocuments;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                if (kotlin.jvm.internal.j.b(((KycDocument) it2.next()).getKey(), str)) {
                    return "primary";
                }
            }
        }
        List<KycDocument> secondaryDocuments = kycCmsContentDataM1.getSecondaryDocuments();
        if (secondaryDocuments == null) {
            secondaryDocuments = C1112C.f9377a;
        }
        List<KycDocument> list3 = secondaryDocuments;
        if ((list3 instanceof Collection) && list3.isEmpty()) {
            return "recommended";
        }
        Iterator<T> it3 = list3.iterator();
        while (it3.hasNext()) {
            if (kotlin.jvm.internal.j.b(((KycDocument) it3.next()).getKey(), str)) {
                return "secondary";
            }
        }
        return "recommended";
    }

    public final String s() {
        return ((MayaKycIdReviewFragment) ((InterfaceC0295u) this.c.get())).P1();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x020e A[PHI: r3
  0x020e: PHI (r3v5 com.paymaya.domain.model.KycDocument) = (r3v4 com.paymaya.domain.model.KycDocument), (r3v17 com.paymaya.domain.model.KycDocument) binds: [B:70:0x01fd, B:75:0x020b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.paymaya.domain.model.KycUploadRequest t() {
        /*
            Method dump skipped, instruction units count: 647
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D8.D.t():com.paymaya.domain.model.KycUploadRequest");
    }

    public final MayaEKYCSelectedDocument u() {
        return ((MayaKycIdReviewFragment) ((InterfaceC0295u) this.c.get())).V1();
    }

    public final int v() {
        KeyEventDispatcher.Component componentRequireActivity = ((MayaKycIdReviewFragment) ((InterfaceC0295u) this.c.get())).requireActivity();
        kotlin.jvm.internal.j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        return ((MayaKycActivity) ((H8.b) componentRequireActivity)).a2().size();
    }

    public final boolean w(String documentKey) {
        kotlin.jvm.internal.j.g(documentKey, "documentKey");
        E8.y yVar = this.f;
        KycCmsContentData kycCmsContentDataM1 = ((MayaKycIdReviewFragment) ((InterfaceC0295u) this.c.get())).M1();
        yVar.getClass();
        return E8.y.e(kycCmsContentDataM1, documentKey);
    }

    public final boolean x() {
        return this.f1008g.e().isKycUxTofuRedesignEnabled();
    }

    public final void y() {
        MayaKycIdReviewFragment mayaKycIdReviewFragment = (MayaKycIdReviewFragment) ((InterfaceC0295u) this.c.get());
        String string = mayaKycIdReviewFragment.L1().b() ? mayaKycIdReviewFragment.getString(R.string.maya_kyc_id_review_label_upload_new_photo) : mayaKycIdReviewFragment.getString(R.string.maya_kyc_id_review_label_take_new_photo);
        kotlin.jvm.internal.j.d(string);
        T2.Q(mayaKycIdReviewFragment, string, T2.y(mayaKycIdReviewFragment), null, 12);
        ((MayaKycIdReviewFragment) ((InterfaceC0295u) this.c.get())).a2();
    }

    public final void z() {
        if (((MayaKycIdReviewFragment) ((InterfaceC0295u) this.c.get())).Y1()) {
            KeyEventDispatcher.Component componentRequireActivity = ((MayaKycIdReviewFragment) ((InterfaceC0295u) this.c.get())).requireActivity();
            kotlin.jvm.internal.j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
            if (((MayaKycActivity) ((H8.b) componentRequireActivity)).f2()) {
                MayaKycIdReviewFragment mayaKycIdReviewFragment = (MayaKycIdReviewFragment) ((InterfaceC0295u) this.c.get());
                mayaKycIdReviewFragment.getClass();
                C0390o1 c0390o1 = new C0390o1();
                ConstraintLayout constraintLayout = ((C0454g0) mayaKycIdReviewFragment.G1()).f4096a;
                kotlin.jvm.internal.j.f(constraintLayout, "getRoot(...)");
                E1.c.m(ViewKt.findNavController(constraintLayout), c0390o1);
                return;
            }
            MayaKycIdReviewFragment mayaKycIdReviewFragment2 = (MayaKycIdReviewFragment) ((InterfaceC0295u) this.c.get());
            MayaEKYCSelectedDocument mayaEKYCSelectedDocumentV1 = mayaKycIdReviewFragment2.V1();
            if (mayaEKYCSelectedDocumentV1 != null) {
                C0370j1 c0370j1 = new C0370j1();
                String getCaptureMethod = mayaEKYCSelectedDocumentV1.getGetCaptureMethod();
                if (getCaptureMethod == null) {
                    throw new IllegalArgumentException("Argument \"captureMethod\" is marked as non-null but was passed a null value.");
                }
                HashMap map = c0370j1.f3321a;
                map.put("captureMethod", getCaptureMethod);
                map.put("documentType", String.valueOf(mayaEKYCSelectedDocumentV1.getDocument().getKey()));
                String string = mayaKycIdReviewFragment2.getString(R.string.maya_kyc_everything_clear_label_use_photo);
                kotlin.jvm.internal.j.f(string, "getString(...)");
                T2.Q(mayaKycIdReviewFragment2, string, T2.l(mayaKycIdReviewFragment2, c0370j1).toString(), null, 12);
                ConstraintLayout constraintLayout2 = ((C0454g0) mayaKycIdReviewFragment2.G1()).f4096a;
                kotlin.jvm.internal.j.f(constraintLayout2, "getRoot(...)");
                Navigation.findNavController(constraintLayout2).navigate(c0370j1);
                return;
            }
            return;
        }
        MayaKycIdReviewFragment mayaKycIdReviewFragment3 = (MayaKycIdReviewFragment) ((InterfaceC0295u) this.c.get());
        boolean zIsCameraXEnabled = mayaKycIdReviewFragment3.t1().e().isCameraXEnabled();
        if (!zIsCameraXEnabled) {
            if (zIsCameraXEnabled) {
                throw new NoWhenBranchMatchedException();
            }
            ConstraintLayout constraintLayout3 = ((C0454g0) mayaKycIdReviewFragment3.G1()).f4096a;
            kotlin.jvm.internal.j.f(constraintLayout3, "getRoot(...)");
            Navigation.findNavController(constraintLayout3).popBackStack(R.id.maya_kyc_simple_capture_fragment, false);
            MayaEKYCSelectedDocument mayaEKYCSelectedDocumentV12 = mayaKycIdReviewFragment3.V1();
            kotlin.jvm.internal.j.d(mayaEKYCSelectedDocumentV12);
            N1 n12 = new N1(mayaEKYCSelectedDocumentV12);
            String string2 = mayaKycIdReviewFragment3.getString(R.string.maya_kyc_everything_clear_label_use_photo);
            kotlin.jvm.internal.j.f(string2, "getString(...)");
            T2.Q(mayaKycIdReviewFragment3, string2, T2.l(mayaKycIdReviewFragment3, n12).toString(), null, 12);
            ConstraintLayout constraintLayout4 = ((C0454g0) mayaKycIdReviewFragment3.G1()).f4096a;
            kotlin.jvm.internal.j.f(constraintLayout4, "getRoot(...)");
            Navigation.findNavController(constraintLayout4).navigate(n12);
            return;
        }
        if (mayaKycIdReviewFragment3.t1().e().isShortenedFlowIdCaptureV3Enabled()) {
            ConstraintLayout constraintLayout5 = ((C0454g0) mayaKycIdReviewFragment3.G1()).f4096a;
            kotlin.jvm.internal.j.f(constraintLayout5, "getRoot(...)");
            Navigation.findNavController(constraintLayout5).popBackStack(R.id.maya_kyc_simple_capture_v3_fragment, false);
            MayaEKYCSelectedDocument mayaEKYCSelectedDocumentV13 = mayaKycIdReviewFragment3.V1();
            kotlin.jvm.internal.j.d(mayaEKYCSelectedDocumentV13);
            C0347d2 c0347d2 = new C0347d2(mayaEKYCSelectedDocumentV13);
            String string3 = mayaKycIdReviewFragment3.getString(R.string.maya_kyc_everything_clear_label_use_photo);
            kotlin.jvm.internal.j.f(string3, "getString(...)");
            T2.Q(mayaKycIdReviewFragment3, string3, T2.l(mayaKycIdReviewFragment3, c0347d2).toString(), null, 12);
            ConstraintLayout constraintLayout6 = ((C0454g0) mayaKycIdReviewFragment3.G1()).f4096a;
            kotlin.jvm.internal.j.f(constraintLayout6, "getRoot(...)");
            Navigation.findNavController(constraintLayout6).navigate(c0347d2);
            return;
        }
        ConstraintLayout constraintLayout7 = ((C0454g0) mayaKycIdReviewFragment3.G1()).f4096a;
        kotlin.jvm.internal.j.f(constraintLayout7, "getRoot(...)");
        Navigation.findNavController(constraintLayout7).popBackStack(R.id.maya_kyc_simple_capture_v2_fragment, false);
        MayaEKYCSelectedDocument mayaEKYCSelectedDocumentV14 = mayaKycIdReviewFragment3.V1();
        kotlin.jvm.internal.j.d(mayaEKYCSelectedDocumentV14);
        T1 t12 = new T1(mayaEKYCSelectedDocumentV14);
        String string4 = mayaKycIdReviewFragment3.getString(R.string.maya_kyc_everything_clear_label_use_photo);
        kotlin.jvm.internal.j.f(string4, "getString(...)");
        T2.Q(mayaKycIdReviewFragment3, string4, T2.l(mayaKycIdReviewFragment3, t12).toString(), null, 12);
        ConstraintLayout constraintLayout8 = ((C0454g0) mayaKycIdReviewFragment3.G1()).f4096a;
        kotlin.jvm.internal.j.f(constraintLayout8, "getRoot(...)");
        Navigation.findNavController(constraintLayout8).navigate(t12);
    }
}
