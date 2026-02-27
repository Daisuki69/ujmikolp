package com.paymaya.mayaui.kyczoloz.view.fragment.impl;

import D8.D;
import E8.y;
import H8.b;
import K8.InterfaceC0295u;
import Lh.c;
import M8.C0354f1;
import M8.C0358g1;
import M8.C0362h1;
import M8.C0376l;
import M8.C0419w;
import M8.RunnableC0350e1;
import M8.T2;
import N5.C0454g0;
import N5.C0491z;
import W4.a;
import Xh.i;
import Y.e;
import a.AbstractC0617a;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;
import androidx.core.view.KeyEventDispatcher;
import androidx.navigation.NavArgsLazy;
import androidx.navigation.Navigation;
import cj.C1129o;
import com.paymaya.R;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.G;
import com.paymaya.domain.model.KycCmsContent;
import com.paymaya.domain.model.KycCmsContentData;
import com.paymaya.domain.model.KycImageQualityConfidence;
import com.paymaya.domain.model.MayaEKYCSelectedDocument;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.base.MayaKycBaseFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycIdReviewFragment;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import org.opencv.core.Mat;

/* JADX INFO: loaded from: classes4.dex */
public class MayaKycIdReviewFragment extends MayaKycBaseFragment<C0454g0> implements InterfaceC0295u {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public D f12543W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public y f12544X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final NavArgsLazy f12545Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public Mat f12546Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public Double f12547a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f12548b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public Boolean f12549c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public Boolean f12550d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f12551e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f12552f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f12553g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f12554h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final C0358g1 f12555i0;

    public MayaKycIdReviewFragment() {
        super(C0354f1.f3297a);
        this.f12545Y = new NavArgsLazy(z.a(C0362h1.class), new C0376l(this, 7));
        this.f12555i0 = new C0358g1(this, getActivity(), 0);
    }

    public final void K1() {
        String string = getString(R.string.maya_kyc_id_review_label_choose_different_id);
        j.f(string, "getString(...)");
        String string2 = getString(R.string.maya_fragment_kyc_submit_id_screen_label);
        j.f(string2, "getString(...)");
        T2.Q(this, string, string2, null, 12);
        ConstraintLayout constraintLayout = ((C0454g0) G1()).f4096a;
        j.f(constraintLayout, "getRoot(...)");
        Navigation.findNavController(constraintLayout).popBackStack(R.id.maya_kyc_submit_id_fragment, false);
    }

    public final C0362h1 L1() {
        return (C0362h1) this.f12545Y.getValue();
    }

    public final KycCmsContentData M1() {
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        KycCmsContent kycCmsContent = ((MayaKycActivity) ((b) componentRequireActivity)).Z1().f;
        if (kycCmsContent != null) {
            return kycCmsContent.getData();
        }
        return null;
    }

    public final String N1() {
        return T1().getDetectedDocumentKey();
    }

    public final File O1() {
        File cacheDir = requireActivity().getCacheDir();
        j.f(cacheDir, "getCacheDir(...)");
        MayaEKYCSelectedDocument mayaEKYCSelectedDocumentV1 = V1();
        String path = cacheDir.getPath();
        String str = File.separator;
        return new File(path + str + "kycpictures" + str + (mayaEKYCSelectedDocumentV1 != null ? mayaEKYCSelectedDocumentV1.getKey() : null) + ".jpg");
    }

    public final String P1() {
        String string;
        Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("idPage", "FRONT")) == null) ? "FRONT" : string;
    }

    public final String Q1() {
        String key;
        MayaEKYCSelectedDocument mayaEKYCSelectedDocumentV1 = V1();
        return (mayaEKYCSelectedDocumentV1 == null || (key = mayaEKYCSelectedDocumentV1.getKey()) == null) ? "" : key;
    }

    public final y R1() {
        y yVar = this.f12544X;
        if (yVar != null) {
            return yVar;
        }
        j.n("mKycIdReviewUtils");
        throw null;
    }

    public final D S1() {
        D d10 = this.f12543W;
        if (d10 != null) {
            return d10;
        }
        j.n("mMayaKycIdReviewFragmentPresenter");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00e7, code lost:
    
        if (r10 != null) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.paymaya.domain.model.KycMatchingConfidence T1() {
        /*
            Method dump skipped, instruction units count: 1492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycIdReviewFragment.T1():com.paymaya.domain.model.KycMatchingConfidence");
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.ID_CAPTURE_RESULT;
    }

    public final KycImageQualityConfidence U1() {
        return R1().c(O1(), V1());
    }

    public final MayaEKYCSelectedDocument V1() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return (MayaEKYCSelectedDocument) AbstractC0617a.D(arguments, "selectedDocument", MayaEKYCSelectedDocument.class);
        }
        return null;
    }

    public final boolean W1() {
        return L1().b();
    }

    public final boolean X1() {
        return Q1().length() > 0 && C1129o.C(new G[]{G.f10417g, G.f}).contains(T1().getMatchingConfidenceLevel());
    }

    public final boolean Y1() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getBoolean("isSelectedFromSecondaryIdScreen", false);
        }
        return false;
    }

    public final void Z1() {
        String string = L1().b() ? getString(R.string.maya_kyc_everything_clear_label_replace) : getString(R.string.maya_kyc_everything_clear_label_retake);
        j.d(string);
        T2.Q(this, string, T2.y(this), null, 12);
    }

    public final void a2() {
        ConstraintLayout constraintLayout = ((C0454g0) G1()).f4096a;
        j.f(constraintLayout, "getRoot(...)");
        Navigation.findNavController(constraintLayout).popBackStack();
    }

    public final void b2(boolean z4) {
        String string = getString(R.string.maya_kyc_everything_clear_label_use_photo);
        j.f(string, "getString(...)");
        T2.Q(this, string, T2.y(this), null, 12);
        i.G(this, Boolean.valueOf(z4));
        new Handler(Looper.getMainLooper()).post(new RunnableC0350e1(this, z4, 0));
    }

    public final String c2() {
        KeyEventDispatcher.Component activity = getActivity();
        b bVar = activity instanceof b ? (b) activity : null;
        String str = bVar != null ? ((MayaKycActivity) bVar).f12455w : null;
        return str == null ? "" : str;
    }

    public final void d2() {
        String string;
        this.f12548b0 = true;
        C0454g0 c0454g0 = (C0454g0) G1();
        if (t1().e().isShowIdScoreEnabled()) {
            string = getString(R.string.maya_kyc_id_review_header) + " (" + T1().getScore() + ")";
        } else {
            string = getString(R.string.maya_kyc_id_review_header);
            j.d(string);
        }
        C0491z c0491z = c0454g0.f4097b;
        ((ImageView) c0491z.f).setImageDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.maya_ic_information_medium));
        ((TextView) c0491z.f4304d).setText(string);
        ((TextView) c0491z.h).setText(getString(R.string.maya_kyc_id_review_sub_header));
        ((TextView) c0491z.f4305g).setText(L1().b() ? getString(R.string.maya_kyc_everything_clear_label_replace) : getString(R.string.maya_kyc_everything_clear_label_retake));
    }

    public final void e2() {
        String str = R1().f1319o;
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        ((MayaKycActivity) ((b) componentRequireActivity)).f12455w = str;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        c cVarF = a.e().f();
        O5.a aVar = (O5.a) cVarF.c;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        y yVarO = cVarF.o();
        e eVarY = aVar.y();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        S5.c flagConfigurationService = (S5.c) aVar.f4724k.get();
        j.g(preference, "preference");
        j.g(flagConfigurationService, "flagConfigurationService");
        this.f12543W = new D(eVarY, yVarO, preference, flagConfigurationService);
        this.f12544X = cVarF.o();
        super.onCreate(bundle);
        this.f10338R = true;
        S1().h(this);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        S1().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseBindingFragment, com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() throws IOException {
        super.onDestroyView();
        y yVarR1 = R1();
        ((org.tensorflow.lite.b) yVarR1.e.getValue()).close();
        ((org.tensorflow.lite.b) yVarR1.f.getValue()).close();
        ((org.tensorflow.lite.b) yVarR1.f1315g.getValue()).close();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        ((MayaKycActivity) ((b) componentRequireActivity)).b2();
        i.D(this, z.a(MayaKycChangeYourMindBottomSheetDialogFragment.class), new C0419w(1, S1(), D.class, "handleConfirmationResult", "handleConfirmationResult(Z)V", 0, 25));
        C0491z c0491z = ((C0454g0) G1()).f4097b;
        final int i = 0;
        C.r0((Button) c0491z.c, new Function0(this) { // from class: M8.d1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaKycIdReviewFragment f3283b;

            {
                this.f3283b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:105:0x02a3  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x00e5  */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke() {
                /*
                    Method dump skipped, instruction units count: 688
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: M8.C0346d1.invoke():java.lang.Object");
            }
        });
        final int i4 = 1;
        C.r0((TextView) c0491z.f4305g, new Function0(this) { // from class: M8.d1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaKycIdReviewFragment f3283b;

            {
                this.f3283b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:105:0x02a3  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x00e5  */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke() {
                /*
                    Method dump skipped, instruction units count: 688
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: M8.C0346d1.invoke():java.lang.Object");
            }
        });
        File fileO1 = O1();
        if (fileO1.exists()) {
            RoundedBitmapDrawable roundedBitmapDrawableCreate = RoundedBitmapDrawableFactory.create(getResources(), BitmapFactory.decodeFile(fileO1.getPath()));
            j.f(roundedBitmapDrawableCreate, "create(...)");
            roundedBitmapDrawableCreate.setCornerRadius(getResources().getDimension(R.dimen.maya_margin_16));
            ((ImageView) ((C0454g0) G1()).f4097b.e).setImageDrawable(roundedBitmapDrawableCreate);
        }
        S1().j();
    }

    @Override // com.paymaya.mayaui.kyczoloz.view.fragment.base.MayaKycBaseFragment, L8.d
    public final void q() {
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        ((MayaKycActivity) ((b) componentRequireActivity)).q();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1215d u1() {
        return EnumC1215d.EKYC_V6;
    }
}
