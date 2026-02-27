package com.paymaya.mayaui.kyczoloz.view.fragment.impl;

import D8.T;
import E8.f;
import H8.b;
import K8.O;
import M8.C0376l;
import M8.M1;
import M8.M2;
import M8.N2;
import M8.P2;
import M8.T2;
import N5.C0490y0;
import S5.c;
import We.s;
import Xh.i;
import Y.e;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.PickVisualMediaRequestKt;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.view.KeyEventDispatcher;
import androidx.navigation.NavArgsLazy;
import cj.C1110A;
import cj.M;
import com.dynatrace.android.agent.Global;
import com.paymaya.R;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.domain.model.KycCmsContent;
import com.paymaya.domain.model.KycCmsContentData;
import com.paymaya.domain.model.KycUploadGuide;
import com.paymaya.domain.model.KycUploadOsGuide;
import com.paymaya.domain.model.MayaEKYCSelectedDocument;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.base.MayaKycBaseFragment;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import o1.AbstractC1955a;
import yk.a;
import zj.l;

/* JADX INFO: loaded from: classes4.dex */
public class MayaKycUploadPhilsysIdFragment extends MayaKycBaseFragment<C0490y0> implements O {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public T f12644W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final NavArgsLazy f12645X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f12646Y;

    public MayaKycUploadPhilsysIdFragment() {
        super(N2.f3203a);
        this.f12645X = new NavArgsLazy(z.a(P2.class), new C0376l(this, 12));
    }

    public static String L1(Button button, String str) {
        String lowerCase = (((Object) button.getText()) + Global.BLANK + str).toLowerCase(Locale.ROOT);
        j.f(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public final File K1(String str) {
        File cacheDir = requireContext().getCacheDir();
        j.f(cacheDir, "getCacheDir(...)");
        MayaEKYCSelectedDocument mayaEKYCSelectedDocumentN1 = N1();
        if (mayaEKYCSelectedDocumentN1 != null) {
            File file = new File(cacheDir, "kycpictures");
            if (!file.exists()) {
                a.a();
                return null;
            }
            if (str.equals("FRONT")) {
                File file2 = new File(file, s.i(mayaEKYCSelectedDocumentN1.getKey(), "_FRONT.jpg"));
                if (file2.exists()) {
                    return file2;
                }
            } else if (str.equals("BACK")) {
                File file3 = new File(file, s.i(mayaEKYCSelectedDocumentN1.getKey(), "_BACK.jpg"));
                if (file3.exists()) {
                    return file3;
                }
            }
        }
        return null;
    }

    public final T M1() {
        T t5 = this.f12644W;
        if (t5 != null) {
            return t5;
        }
        j.n("mUploadPhilsysIdFragmentPresenter");
        throw null;
    }

    public final MayaEKYCSelectedDocument N1() {
        return ((P2) this.f12645X.getValue()).b();
    }

    public final Set O1() {
        KycCmsContentData data;
        KycUploadGuide uploadGuides;
        List<KycUploadOsGuide> uploadOsTypes;
        Object next;
        List<String> mimeTypes;
        Set setZ;
        KycCmsContent cmsContent = getCmsContent();
        if (cmsContent != null && (data = cmsContent.getData()) != null && (uploadGuides = data.getUploadGuides()) != null && (uploadOsTypes = uploadGuides.getUploadOsTypes()) != null) {
            Iterator<T> it = uploadOsTypes.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (j.b(((KycUploadOsGuide) next).getType(), "MOBILE_ANDROID")) {
                    break;
                }
            }
            KycUploadOsGuide kycUploadOsGuide = (KycUploadOsGuide) next;
            if (kycUploadOsGuide != null && (mimeTypes = kycUploadOsGuide.getMimeTypes()) != null && (setZ = C1110A.Z(mimeTypes)) != null) {
                return setZ;
            }
        }
        Set set = E8.j.f1284a;
        return E8.j.f1284a;
    }

    public final void P1() {
        Set supportedMimeTypes = O1();
        j.g(supportedMimeTypes, "supportedMimeTypes");
        ActivityResultLauncher activityResultLauncher = f.f1282a;
        if (activityResultLauncher != null) {
            activityResultLauncher.launch(PickVisualMediaRequestKt.PickVisualMediaRequest$default(ActivityResultContracts.PickVisualMedia.ImageOnly.INSTANCE, 0, false, null, 14, null));
        } else {
            j.n("filePickerLauncher");
            throw null;
        }
    }

    public final void Q1(File file) {
        AbstractC1955a.x(((C0490y0) G1()).f4298b.f4309g, file, getResources().getDimension(R.dimen.maya_margin_16));
    }

    public final void R1(File file) {
        AbstractC1955a.x(((C0490y0) G1()).f4298b.h, file, getResources().getDimension(R.dimen.maya_margin_16));
    }

    public final void S1() {
        ((C0490y0) G1()).f4298b.f4306a.setVisibility(0);
        ((C0490y0) G1()).c.f4041b.setVisibility(8);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T1() {
        /*
            r6 = this;
            androidx.fragment.app.FragmentActivity r0 = r6.requireActivity()
            java.lang.String r1 = "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView"
            kotlin.jvm.internal.j.e(r0, r1)
            H8.b r0 = (H8.b) r0
            com.paymaya.domain.model.KycCmsContent r1 = r6.getCmsContent()
            if (r1 == 0) goto L7a
            com.paymaya.domain.model.KycCmsContentData r1 = r1.getData()
            if (r1 == 0) goto L7a
            com.paymaya.domain.model.KycUploadGuide r1 = r1.getUploadGuides()
            if (r1 == 0) goto L7a
            java.util.List r1 = r1.getUploadOsTypes()
            if (r1 == 0) goto L7a
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L29:
            boolean r2 = r1.hasNext()
            r3 = 0
            if (r2 == 0) goto L44
            java.lang.Object r2 = r1.next()
            r4 = r2
            com.paymaya.domain.model.KycUploadOsGuide r4 = (com.paymaya.domain.model.KycUploadOsGuide) r4
            java.lang.String r4 = r4.getType()
            java.lang.String r5 = "MOBILE_ANDROID"
            boolean r4 = kotlin.jvm.internal.j.b(r4, r5)
            if (r4 == 0) goto L29
            goto L45
        L44:
            r2 = r3
        L45:
            com.paymaya.domain.model.KycUploadOsGuide r2 = (com.paymaya.domain.model.KycUploadOsGuide) r2
            if (r2 == 0) goto L7a
            java.util.List r1 = r2.getErrorSpiels()
            if (r1 == 0) goto L7a
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L55:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L6f
            java.lang.Object r2 = r1.next()
            r4 = r2
            com.paymaya.domain.model.KycUploadGuideError r4 = (com.paymaya.domain.model.KycUploadGuideError) r4
            java.lang.String r4 = r4.getCode()
            java.lang.String r5 = "ERROR_UPLOAD_EXCEED_LIMIT"
            boolean r4 = kotlin.jvm.internal.j.b(r4, r5)
            if (r4 == 0) goto L55
            r3 = r2
        L6f:
            com.paymaya.domain.model.KycUploadGuideError r3 = (com.paymaya.domain.model.KycUploadGuideError) r3
            if (r3 == 0) goto L7a
            java.lang.String r1 = r3.getMessage()
            if (r1 == 0) goto L7a
            goto L86
        L7a:
            r1 = 2131952546(0x7f1303a2, float:1.9541538E38)
            java.lang.String r1 = r6.getString(r1)
            java.lang.String r2 = "getString(...)"
            kotlin.jvm.internal.j.f(r1, r2)
        L86:
            com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity r0 = (com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity) r0
            r0.u2(r1)
            java.lang.String r0 = M8.T2.j(r6)
            M8.T2.K(r6, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycUploadPhilsysIdFragment.T1():void");
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.UPLOAD_ID;
    }

    public final void U1(boolean z4) {
        if (z4) {
            ((C0490y0) G1()).f4298b.f4309g.setVisibility(0);
            ((C0490y0) G1()).f4298b.i.setVisibility(8);
            ((C0490y0) G1()).f4298b.e.setVisibility(0);
        } else {
            ((C0490y0) G1()).f4298b.f4309g.setVisibility(8);
            ((C0490y0) G1()).f4298b.f4309g.setImageDrawable(null);
            ((C0490y0) G1()).f4298b.i.setVisibility(0);
            ((C0490y0) G1()).f4298b.e.setVisibility(8);
        }
    }

    public final void V1(boolean z4) {
        if (z4) {
            ((C0490y0) G1()).f4298b.h.setVisibility(0);
            ((C0490y0) G1()).f4298b.j.setVisibility(8);
            ((C0490y0) G1()).f4298b.f.setVisibility(0);
        } else {
            ((C0490y0) G1()).f4298b.h.setVisibility(8);
            ((C0490y0) G1()).f4298b.h.setImageDrawable(null);
            ((C0490y0) G1()).f4298b.j.setVisibility(0);
            ((C0490y0) G1()).f4298b.f.setVisibility(8);
        }
    }

    public final KycCmsContent getCmsContent() {
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        return ((MayaKycActivity) ((b) componentRequireActivity)).Z1().f;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        O5.a aVar = (O5.a) W4.a.e().f().c;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        e eVarY = aVar.y();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        j.g(preference, "preference");
        this.f12644W = new T(eVarY, preference);
        M1().h(this);
        f.f1283b = new l(this, 1);
        registerForActivityResult(new ActivityResultContracts.RequestPermission(), new A7.c(this, 17));
        f.f1282a = registerForActivityResult(new ActivityResultContracts.PickVisualMedia(), new C2.f(2));
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        M1().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        T tM1 = M1();
        if (tM1.f.e().isPartnerOnboardingEnabled()) {
            String strP = tM1.f.p();
            j.f(strP, "getMayaOnboardingPartner(...)");
            if (strP.length() > 0) {
                MayaKycUploadPhilsysIdFragment mayaKycUploadPhilsysIdFragment = (MayaKycUploadPhilsysIdFragment) ((O) tM1.c.get());
                mayaKycUploadPhilsysIdFragment.getClass();
                Pair pair = new Pair(EnumC1212a.ONBOARDING_KYC_LEVEL, mayaKycUploadPhilsysIdFragment.t1().k().toString());
                EnumC1212a enumC1212a = EnumC1212a.ID_ORDER;
                KeyEventDispatcher.Component componentRequireActivity = mayaKycUploadPhilsysIdFragment.requireActivity();
                j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                T2.H(mayaKycUploadPhilsysIdFragment, M.h(pair, new Pair(enumC1212a, String.valueOf(((MayaKycActivity) ((b) componentRequireActivity)).a2().size())), new Pair(EnumC1212a.VENDOR, "in-house")), 2);
                return;
            }
        }
        MayaKycUploadPhilsysIdFragment mayaKycUploadPhilsysIdFragment2 = (MayaKycUploadPhilsysIdFragment) ((O) tM1.c.get());
        mayaKycUploadPhilsysIdFragment2.getClass();
        EnumC1212a enumC1212a2 = EnumC1212a.ID_ORDER;
        KeyEventDispatcher.Component componentRequireActivity2 = mayaKycUploadPhilsysIdFragment2.requireActivity();
        j.e(componentRequireActivity2, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        T2.H(mayaKycUploadPhilsysIdFragment2, M.h(new Pair(enumC1212a2, String.valueOf(((MayaKycActivity) ((b) componentRequireActivity2)).a2().size())), new Pair(EnumC1212a.VENDOR, "in-house")), 2);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        b bVar = (b) componentRequireActivity;
        MayaKycActivity mayaKycActivity = (MayaKycActivity) bVar;
        mayaKycActivity.t2();
        mayaKycActivity.p2(new Ad.a(19, this, bVar));
        mayaKycActivity.s1();
        mayaKycActivity.r1();
        mayaKycActivity.t1();
        M1().j();
        Ke.b.b(((C0490y0) G1()).f4298b.f4308d, new M2(this, 0));
        Ke.b.b(((C0490y0) G1()).f4298b.c, new M2(this, 1));
        Ke.b.b(((C0490y0) G1()).f4298b.f, new M2(this, 2));
        Ke.b.b(((C0490y0) G1()).f4298b.e, new M2(this, 3));
        Ke.b.b(((C0490y0) G1()).f4298b.f4307b, new M2(this, 4));
        i.D(this, z.a(MayaKycIdReviewFragment.class), new M1(1, this, MayaKycUploadPhilsysIdFragment.class, "handleIdReviewResult", "handleIdReviewResult(Z)V", 0, 11));
    }

    @Override // com.paymaya.mayaui.kyczoloz.view.fragment.base.MayaKycBaseFragment, L8.d
    public final void q() {
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        ((MayaKycActivity) ((b) componentRequireActivity)).q();
    }
}
