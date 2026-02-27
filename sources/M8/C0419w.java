package M8;

import D8.C0200h;
import D8.C0201i;
import D8.C0203k;
import D8.C0205m;
import D8.C0206n;
import D8.C0207o;
import D8.C0208p;
import D8.C0209q;
import D8.C0210s;
import D8.C0211t;
import D8.C0212u;
import K8.InterfaceC0279d;
import K8.InterfaceC0280e;
import K8.InterfaceC0282g;
import K8.InterfaceC0293s;
import K8.InterfaceC0295u;
import N5.C0461j0;
import N5.C0469n0;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.Navigation;
import cj.C1110A;
import cj.C1112C;
import com.paymaya.R;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.data.api.KycCmsAddressApi;
import com.paymaya.data.api.KycSubmissionApi;
import com.paymaya.domain.model.AdditionalDocType;
import com.paymaya.domain.model.KycCmsAddressCity;
import com.paymaya.domain.model.KycCmsAddressLocality;
import com.paymaya.domain.model.KycCmsAddressProvince;
import com.paymaya.domain.model.KycCmsAddressZipCode;
import com.paymaya.domain.model.KycCountry;
import com.paymaya.domain.model.KycFieldType;
import com.paymaya.domain.model.KycIncomeSource;
import com.paymaya.domain.model.KycMinorPhotos;
import com.paymaya.domain.model.KycNationality;
import com.paymaya.domain.model.KycSelectionItem;
import com.paymaya.domain.model.KycSelectionModel;
import com.paymaya.domain.model.KycWorkNature;
import com.paymaya.domain.model.MayaEKYCSelectedDocument;
import com.paymaya.domain.model.PersonalInfoConfirmAction;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.kyczoloz.utils.KycMinorDocument;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycAmlcCertificateFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycAmlcUploadDocumentsFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycCompletePersonalInformationFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycFaceAuthenticationTipsFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycIdReviewFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycMinorTakeAPhotoFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycSimpleCaptureFragment;
import dOYHB6.tiZVw8.numX49;
import defpackage.AbstractC1414e;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import zj.C2576A;

/* JADX INFO: renamed from: M8.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0419w extends kotlin.jvm.internal.i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3380a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0419w(int i, Object obj, Class cls, String str, String str2, int i4, int i6) {
        super(obj, str, i, str2, i4, cls);
        this.f3380a = i6;
    }

    private final Object a(Object obj) {
        int i = 2;
        int i4 = 1;
        KycMinorPhotos p02 = (KycMinorPhotos) obj;
        kotlin.jvm.internal.j.g(p02, "p0");
        C0212u c0212u = (C0212u) ((MayaKycCompletePersonalInformationFragment) this.receiver).I2();
        c0212u.f1100v = p02;
        O o8 = ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u.c.get())).f12494f0;
        if ((o8 != null ? ((MayaKycActivity) o8).d2() : false) && kotlin.jvm.internal.j.b(((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u.c.get())).c2(), Boolean.FALSE)) {
            MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u.c.get());
            mayaKycCompletePersonalInformationFragment.getClass();
            D1.c(mayaKycCompletePersonalInformationFragment, new G(mayaKycCompletePersonalInformationFragment, 4));
        } else {
            O o10 = ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u.c.get())).f12494f0;
            if (o10 != null ? ((MayaKycActivity) o10).c2() : false) {
                MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment2 = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u.c.get());
                mayaKycCompletePersonalInformationFragment2.getClass();
                D1.c(mayaKycCompletePersonalInformationFragment2, new G(mayaKycCompletePersonalInformationFragment2, i4));
            } else {
                ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u.c.get())).C3();
                KeyEventDispatcher.Component componentRequireActivity = ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u.c.get())).requireActivity();
                kotlin.jvm.internal.j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                ((MayaKycActivity) ((H8.b) componentRequireActivity)).Z1().f1046o = true;
                com.paymaya.data.preference.a aVar = c0212u.j;
                boolean zIsShortenedFlowBackIdCaptureEnabled = aVar.e().isShortenedFlowBackIdCaptureEnabled();
                com.paymaya.domain.store.L l6 = c0212u.e;
                c0212u.e(new Lh.d(new Lh.d(new Lh.h((zIsShortenedFlowBackIdCaptureEnabled || aVar.e().isSupportSecondaryIdFlowEnabled()) ? ((KycSubmissionApi) l6.f11367b).getPreSubmissionContentV2(aVar.m()).h(Th.e.c) : ((KycSubmissionApi) l6.f11367b).getPreSubmissionContent(aVar.m()).h(Th.e.c), zh.b.a(), 0), new C0207o(c0212u, i), 2), new C0208p(c0212u, 2), 0).e());
            }
        }
        return Unit.f18162a;
    }

    private final Object b(Object obj) {
        Object next;
        Integer id;
        String p02 = (String) obj;
        kotlin.jvm.internal.j.g(p02, "p0");
        C0212u c0212u = (C0212u) ((B8.c) this.receiver);
        c0212u.getClass();
        Iterator it = ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u.c.get())).X2().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (kotlin.jvm.internal.j.b(((KycWorkNature) next).getDescription(), p02)) {
                break;
            }
        }
        int iIntValue = (next == null || (id = ((KycWorkNature) next).getId()) == null) ? -1 : id.intValue();
        MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u.c.get());
        String string = mayaKycCompletePersonalInformationFragment.getString(R.string.maya_kyc_complete_personal_information_work_nature_label);
        T2.Q(mayaKycCompletePersonalInformationFragment, string, AbstractC1414e.i(string, "getString(...)", mayaKycCompletePersonalInformationFragment, R.string.maya_kyc_complete_personal_information_work_nature_hint, "getString(...)").concat(" bottomsheet"), null, 12);
        List listX2 = mayaKycCompletePersonalInformationFragment.X2();
        ArrayList arrayList = new ArrayList(cj.t.l(listX2, 10));
        Iterator it2 = listX2.iterator();
        while (it2.hasNext()) {
            arrayList.add(KycSelectionItem.Companion.toSelectionItem$default(KycSelectionItem.Companion, (KycWorkNature) it2.next(), (String) null, 1, (Object) null));
        }
        KycFieldType kycFieldType = KycFieldType.WORK_NATION;
        mayaKycCompletePersonalInformationFragment.e3(new KycSelectionModel(R.string.maya_kyc_single_selection_work_nature, iIntValue, arrayList, kycFieldType, false, 16, null), kycFieldType);
        return Unit.f18162a;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object d(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M8.C0419w.d(java.lang.Object):java.lang.Object");
    }

    private final Object e(Object obj) {
        Object next;
        Integer id;
        String p02 = (String) obj;
        kotlin.jvm.internal.j.g(p02, "p0");
        C0212u c0212u = (C0212u) ((B8.c) this.receiver);
        c0212u.getClass();
        Iterator it = ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u.c.get())).T1().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (kotlin.jvm.internal.j.b(((KycCountry) next).getName(), p02)) {
                break;
            }
        }
        int iIntValue = (next == null || (id = ((KycCountry) next).getId()) == null) ? -1 : id.intValue();
        MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u.c.get());
        String string = mayaKycCompletePersonalInformationFragment.getString(R.string.maya_kyc_complete_personal_information_birth_place_header);
        String strF3 = MayaKycCompletePersonalInformationFragment.f3(string, AbstractC1414e.i(string, "getString(...)", mayaKycCompletePersonalInformationFragment, R.string.maya_kyc_complete_personal_information_birth_country_label, "getString(...)"));
        String string2 = mayaKycCompletePersonalInformationFragment.getString(R.string.maya_kyc_complete_personal_information_birth_country_hint);
        kotlin.jvm.internal.j.f(string2, "getString(...)");
        T2.Q(mayaKycCompletePersonalInformationFragment, strF3, string2.concat(" bottomsheet"), null, 12);
        List listT1 = mayaKycCompletePersonalInformationFragment.T1();
        ArrayList arrayList = new ArrayList(cj.t.l(listT1, 10));
        Iterator it2 = listT1.iterator();
        while (it2.hasNext()) {
            arrayList.add(KycSelectionItem.Companion.toSelectionItem((KycCountry) it2.next()));
        }
        KycFieldType kycFieldType = KycFieldType.BIRTH_COUNTRY;
        mayaKycCompletePersonalInformationFragment.e3(new KycSelectionModel(R.string.maya_kyc_single_selection_birth_country, iIntValue, arrayList, kycFieldType, false, 16, null), kycFieldType);
        return Unit.f18162a;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object f(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M8.C0419w.f(java.lang.Object):java.lang.Object");
    }

    private final Object g(Object obj) {
        Object next;
        Integer id;
        String p02 = (String) obj;
        kotlin.jvm.internal.j.g(p02, "p0");
        C0212u c0212u = (C0212u) ((B8.c) this.receiver);
        c0212u.getClass();
        if (kotlin.jvm.internal.j.b(c0212u.f1101w, Boolean.TRUE) && !C2576A.H(((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u.c.get())).W1())) {
            Iterator it = c0212u.f1074D.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (kotlin.jvm.internal.j.b(((KycCmsAddressZipCode) next).getCode(), p02)) {
                    break;
                }
            }
            int iIntValue = (next == null || (id = ((KycCmsAddressZipCode) next).getId()) == null) ? -1 : id.intValue();
            MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u.c.get());
            String string = mayaKycCompletePersonalInformationFragment.getString(R.string.maya_kyc_complete_personal_information_current_address_header);
            String strF3 = MayaKycCompletePersonalInformationFragment.f3(string, AbstractC1414e.i(string, "getString(...)", mayaKycCompletePersonalInformationFragment, R.string.maya_kyc_complete_personal_information_address_zip_code_label, "getString(...)"));
            String string2 = mayaKycCompletePersonalInformationFragment.getString(R.string.maya_kyc_single_selection_zipcode_name);
            kotlin.jvm.internal.j.f(string2, "getString(...)");
            T2.Q(mayaKycCompletePersonalInformationFragment, strF3, string2.concat(" bottomsheet"), null, 12);
            List list = ((C0212u) mayaKycCompletePersonalInformationFragment.I2()).f1074D;
            ArrayList arrayList = new ArrayList(cj.t.l(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(KycSelectionItem.Companion.toSelectionItem((KycCmsAddressZipCode) it2.next()));
            }
            KycFieldType kycFieldType = KycFieldType.CURRENT_ZIP_CODE;
            mayaKycCompletePersonalInformationFragment.e3(new KycSelectionModel(R.string.maya_kyc_single_selection_zipcode_name, iIntValue, arrayList, kycFieldType, false, 16, null), kycFieldType);
        }
        return Unit.f18162a;
    }

    private final Object h(Object obj) {
        Object next;
        Integer id;
        String p02 = (String) obj;
        kotlin.jvm.internal.j.g(p02, "p0");
        C0212u c0212u = (C0212u) ((B8.c) this.receiver);
        c0212u.getClass();
        if (!c0212u.f1104z) {
            Iterator it = ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u.c.get())).T1().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (kotlin.jvm.internal.j.b(((KycCountry) next).getName(), p02)) {
                    break;
                }
            }
            int iIntValue = (next == null || (id = ((KycCountry) next).getId()) == null) ? -1 : id.intValue();
            MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u.c.get());
            String string = mayaKycCompletePersonalInformationFragment.getString(R.string.maya_kyc_complete_personal_information_permanent_address_header);
            String strF3 = MayaKycCompletePersonalInformationFragment.f3(string, AbstractC1414e.i(string, "getString(...)", mayaKycCompletePersonalInformationFragment, R.string.maya_kyc_complete_personal_information_address_country_label, "getString(...)"));
            String string2 = mayaKycCompletePersonalInformationFragment.getString(R.string.maya_kyc_complete_personal_information_address_country_hint);
            kotlin.jvm.internal.j.f(string2, "getString(...)");
            T2.Q(mayaKycCompletePersonalInformationFragment, strF3, string2.concat(" bottomsheet"), null, 12);
            C0212u c0212u2 = (C0212u) mayaKycCompletePersonalInformationFragment.I2();
            MayaEKYCSelectedDocument mayaEKYCSelectedDocument = (MayaEKYCSelectedDocument) C1110A.B(((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u2.c.get())).V2());
            List listT1 = ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u2.c.get())).T1();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listT1) {
                KycCountry kycCountry = (KycCountry) obj2;
                if (c0212u2.j.e().isShortenedFlowForeignAddressComplianceEnabled()) {
                    if (!kotlin.jvm.internal.j.b(mayaEKYCSelectedDocument != null ? mayaEKYCSelectedDocument.getKey() : null, "FOREIGN_PASSPORT") || !zj.z.o(kycCountry.getName(), "Philippines", true)) {
                    }
                }
                arrayList.add(obj2);
            }
            ArrayList arrayList2 = new ArrayList(cj.t.l(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(KycSelectionItem.Companion.toSelectionItem((KycCountry) it2.next()));
            }
            KycFieldType kycFieldType = KycFieldType.PERMANENT_COUNTRY;
            mayaKycCompletePersonalInformationFragment.e3(new KycSelectionModel(R.string.maya_kyc_single_selection_country_name, iIntValue, arrayList2, kycFieldType, false, 16, null), kycFieldType);
        }
        return Unit.f18162a;
    }

    private final Object i(Object obj) {
        Object next;
        Integer id;
        String p02 = (String) obj;
        kotlin.jvm.internal.j.g(p02, "p0");
        C0212u c0212u = (C0212u) ((B8.c) this.receiver);
        c0212u.getClass();
        Iterator it = ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u.c.get())).b2().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (kotlin.jvm.internal.j.b(((KycIncomeSource) next).getDescription(), p02)) {
                break;
            }
        }
        int iIntValue = (next == null || (id = ((KycIncomeSource) next).getId()) == null) ? -1 : id.intValue();
        MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u.c.get());
        String string = mayaKycCompletePersonalInformationFragment.getString(R.string.maya_kyc_complete_personal_information_income_source_label);
        T2.Q(mayaKycCompletePersonalInformationFragment, string, AbstractC1414e.i(string, "getString(...)", mayaKycCompletePersonalInformationFragment, R.string.maya_kyc_complete_personal_information_income_source_hint, "getString(...)").concat(" bottomsheet"), null, 12);
        ArrayList arrayListG = ((C0212u) mayaKycCompletePersonalInformationFragment.I2()).G(String.valueOf(mayaKycCompletePersonalInformationFragment.O2().getInputEditText().getText()));
        ArrayList arrayList = new ArrayList(cj.t.l(arrayListG, 10));
        Iterator it2 = arrayListG.iterator();
        while (it2.hasNext()) {
            arrayList.add(KycSelectionItem.Companion.toSelectionItem$default(KycSelectionItem.Companion, (KycIncomeSource) it2.next(), (String) null, 1, (Object) null));
        }
        KycFieldType kycFieldType = KycFieldType.INCOME_SOURCE;
        mayaKycCompletePersonalInformationFragment.e3(new KycSelectionModel(R.string.maya_kyc_single_selection_income_source, iIntValue, arrayList, kycFieldType, false, 16, null), kycFieldType);
        return Unit.f18162a;
    }

    private final Object j(Object obj) {
        String p02 = (String) obj;
        kotlin.jvm.internal.j.g(p02, "p0");
        ((C0212u) ((B8.c) this.receiver)).b0(p02);
        return Unit.f18162a;
    }

    private final Object k(Object obj) {
        String p02 = (String) obj;
        kotlin.jvm.internal.j.g(p02, "p0");
        ((C0212u) ((B8.c) this.receiver)).a0(p02);
        return Unit.f18162a;
    }

    private final Object l(Object obj) {
        Object next;
        Integer id;
        String p02 = (String) obj;
        kotlin.jvm.internal.j.g(p02, "p0");
        C0212u c0212u = (C0212u) ((B8.c) this.receiver);
        c0212u.getClass();
        if (kotlin.jvm.internal.j.b(c0212u.f1102x, Boolean.TRUE) && !C2576A.H(((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u.c.get())).S2())) {
            Iterator it = c0212u.f1077G.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (kotlin.jvm.internal.j.b(((KycCmsAddressZipCode) next).getCode(), p02)) {
                    break;
                }
            }
            int iIntValue = (next == null || (id = ((KycCmsAddressZipCode) next).getId()) == null) ? -1 : id.intValue();
            MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u.c.get());
            String string = mayaKycCompletePersonalInformationFragment.getString(R.string.maya_kyc_complete_personal_information_permanent_address_header);
            String strF3 = MayaKycCompletePersonalInformationFragment.f3(string, AbstractC1414e.i(string, "getString(...)", mayaKycCompletePersonalInformationFragment, R.string.maya_kyc_complete_personal_information_address_zip_code_label, "getString(...)"));
            String string2 = mayaKycCompletePersonalInformationFragment.getString(R.string.maya_kyc_single_selection_zipcode_name);
            kotlin.jvm.internal.j.f(string2, "getString(...)");
            T2.Q(mayaKycCompletePersonalInformationFragment, strF3, string2.concat(" bottomsheet"), null, 12);
            List list = ((C0212u) mayaKycCompletePersonalInformationFragment.I2()).f1077G;
            ArrayList arrayList = new ArrayList(cj.t.l(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(KycSelectionItem.Companion.toSelectionItem((KycCmsAddressZipCode) it2.next()));
            }
            KycFieldType kycFieldType = KycFieldType.PERMANENT_ZIP_CODE;
            mayaKycCompletePersonalInformationFragment.e3(new KycSelectionModel(R.string.maya_kyc_single_selection_zipcode_name, iIntValue, arrayList, kycFieldType, false, 16, null), kycFieldType);
        }
        return Unit.f18162a;
    }

    private final Object n(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        D8.A a8 = (D8.A) this.receiver;
        if (zBooleanValue) {
            KeyEventDispatcher.Component componentRequireActivity = ((MayaKycFaceAuthenticationTipsFragment) ((InterfaceC0293s) a8.c.get())).requireActivity();
            kotlin.jvm.internal.j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
            MayaKycActivity mayaKycActivity = (MayaKycActivity) ((H8.b) componentRequireActivity);
            mayaKycActivity.g2();
            mayaKycActivity.finish();
        } else {
            a8.getClass();
        }
        return Unit.f18162a;
    }

    private final Object o(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        D8.D d10 = (D8.D) this.receiver;
        if (zBooleanValue) {
            if (d10.f1008g.e().isSupportSecondaryIdFlowEnabled()) {
                KeyEventDispatcher.Component componentRequireActivity = ((MayaKycIdReviewFragment) ((InterfaceC0295u) d10.c.get())).requireActivity();
                kotlin.jvm.internal.j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                ((MayaKycActivity) ((H8.b) componentRequireActivity)).Z1().f1044l.clear();
            }
            ((MayaKycIdReviewFragment) ((InterfaceC0295u) d10.c.get())).K1();
        } else {
            d10.getClass();
        }
        return Unit.f18162a;
    }

    private final Object p(Object obj) {
        Function0 p02 = (Function0) obj;
        kotlin.jvm.internal.j.g(p02, "p0");
        ((D8.I) this.receiver).k(p02);
        return Unit.f18162a;
    }

    private final Object q(Object obj) {
        AdditionalDocType additionalDocType;
        byte[] p02 = (byte[]) obj;
        kotlin.jvm.internal.j.g(p02, "p0");
        D8.I i = (D8.I) this.receiver;
        i.getClass();
        MayaKycMinorTakeAPhotoFragment mayaKycMinorTakeAPhotoFragment = (MayaKycMinorTakeAPhotoFragment) ((K8.y) i.c.get());
        mayaKycMinorTakeAPhotoFragment.getClass();
        byte[] bArrB = E8.k.b(p02, 1048576, true);
        if (bArrB != null) {
            File cacheDir = mayaKycMinorTakeAPhotoFragment.requireContext().getCacheDir();
            kotlin.jvm.internal.j.f(cacheDir, "getCacheDir(...)");
            KycMinorDocument kycMinorDocumentK1 = mayaKycMinorTakeAPhotoFragment.K1();
            File file = new File(cacheDir, "zolozkyc");
            File file2 = null;
            if (file.exists() || file.mkdirs()) {
                File file3 = new File(We.s.p(We.s.v(file.getPath(), File.separator), kycMinorDocumentK1.f12431a, ".jpg"));
                if (!file3.exists() || file3.delete()) {
                    file2 = file3;
                }
            } else {
                yk.a.a();
            }
            if (file2 != null) {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    try {
                        fileOutputStream.write(bArrB);
                        Unit unit = Unit.f18162a;
                        fileOutputStream.close();
                    } finally {
                    }
                } catch (Exception unused) {
                    yk.a.b();
                }
            }
        }
        MayaKycMinorTakeAPhotoFragment mayaKycMinorTakeAPhotoFragment2 = (MayaKycMinorTakeAPhotoFragment) ((K8.y) i.c.get());
        C0429y1 c0429y1 = new C0429y1(mayaKycMinorTakeAPhotoFragment2.K1());
        String string = mayaKycMinorTakeAPhotoFragment2.getString(R.string.maya_kyc_minor_take_a_photo_toolbar_text);
        kotlin.jvm.internal.j.f(string, "getString(...)");
        String string2 = T2.l(mayaKycMinorTakeAPhotoFragment2, c0429y1).toString();
        EnumC1212a enumC1212a = EnumC1212a.DOCUMENT;
        KycMinorDocument kycMinorDocumentK12 = mayaKycMinorTakeAPhotoFragment2.K1();
        if (kycMinorDocumentK12.equals(KycMinorDocument.BirthCertificateKycDocument.f12432b)) {
            additionalDocType = AdditionalDocType.BIRTH_CERTIFICATE;
        } else if (kycMinorDocumentK12.equals(KycMinorDocument.ParentIdKycDocument.f12434b)) {
            additionalDocType = AdditionalDocType.PARENT_GUARDIAN_ID;
        } else {
            if (!kycMinorDocumentK12.equals(KycMinorDocument.ConsentFormKycDocument.f12433b)) {
                throw new NoWhenBranchMatchedException();
            }
            additionalDocType = AdditionalDocType.PARENTAL_CONSENT;
        }
        T2.Q(mayaKycMinorTakeAPhotoFragment2, string, string2, cj.L.c(new Pair(enumC1212a, additionalDocType.getType())), 8);
        FrameLayout frameLayout = ((C0461j0) mayaKycMinorTakeAPhotoFragment2.G1()).f4125a;
        kotlin.jvm.internal.j.f(frameLayout, "getRoot(...)");
        E1.c.m(Navigation.findNavController(frameLayout), c0429y1);
        return Unit.f18162a;
    }

    private final Object s(Object obj) {
        Function0 p02 = (Function0) obj;
        kotlin.jvm.internal.j.g(p02, "p0");
        ((D8.J) this.receiver).l(p02);
        return Unit.f18162a;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        Object next;
        Object next2;
        Object next3;
        Object next4;
        List<KycCmsAddressZipCode> zipCodes;
        Object next5;
        Object next6;
        Object next7;
        Object next8;
        List<KycCmsAddressZipCode> zipCodes2;
        Object next9;
        String name;
        Object next10;
        Object next11;
        Object obj2 = null;
        Object obj3 = null;
        int i = 3;
        int i4 = 1;
        int i6 = 2;
        int i10 = 0;
        switch (this.f3380a) {
            case 0:
                KycSelectionItem p02 = (KycSelectionItem) obj;
                kotlin.jvm.internal.j.g(p02, "p0");
                B8.b bVarK1 = ((MayaKycAmlcCertificateFragment) this.receiver).K1();
                int id = p02.getId();
                C0200h c0200h = (C0200h) bVarK1;
                Iterator it = c0200h.f.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next12 = it.next();
                        if (((KycSelectionItem) next12).getId() == id) {
                            obj2 = next12;
                        }
                    }
                }
                KycSelectionItem kycSelectionItem = (KycSelectionItem) obj2;
                if (kycSelectionItem != null) {
                    c0200h.f1048g = kycSelectionItem;
                    MayaKycAmlcCertificateFragment mayaKycAmlcCertificateFragment = (MayaKycAmlcCertificateFragment) ((InterfaceC0279d) c0200h.c.get());
                    mayaKycAmlcCertificateFragment.getClass();
                    mayaKycAmlcCertificateFragment.f12475a0 = kycSelectionItem.getKey();
                    ((N5.U) mayaKycAmlcCertificateFragment.G1()).f3941g.setSelectedData(kycSelectionItem);
                    ((N5.U) mayaKycAmlcCertificateFragment.G1()).f3941g.setDisplayText(kycSelectionItem.getText());
                    ((N5.U) mayaKycAmlcCertificateFragment.G1()).f3941g.b();
                    InterfaceC0279d interfaceC0279d = (InterfaceC0279d) c0200h.c.get();
                    String selectedLabel = kycSelectionItem.getText();
                    MayaKycAmlcCertificateFragment mayaKycAmlcCertificateFragment2 = (MayaKycAmlcCertificateFragment) interfaceC0279d;
                    mayaKycAmlcCertificateFragment2.getClass();
                    kotlin.jvm.internal.j.g(selectedLabel, "selectedLabel");
                    C1220i c1220iO1 = mayaKycAmlcCertificateFragment2.o1();
                    FragmentActivity activity = mayaKycAmlcCertificateFragment2.getActivity();
                    C1219h c1219hD = C1219h.d(mayaKycAmlcCertificateFragment2.u1());
                    c1219hD.s("AMLC_ADD_DOCUMENT");
                    c1219hD.n(19);
                    EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                    String string = mayaKycAmlcCertificateFragment2.getString(R.string.maya_kyc_amlc_certificate_screen_label);
                    HashMap map = c1219hD.j;
                    map.put("page_name", string);
                    map.put("selection", selectedLabel);
                    map.put("path", "TOFU 1.0");
                    map.put("kyc_status", mayaKycAmlcCertificateFragment2.t1().l());
                    c1219hD.i();
                    c1220iO1.c(activity, c1219hD);
                }
                return Unit.f18162a;
            case 1:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                C0201i c0201i = (C0201i) this.receiver;
                if (zBooleanValue) {
                    MayaKycAmlcUploadDocumentsFragment mayaKycAmlcUploadDocumentsFragment = (MayaKycAmlcUploadDocumentsFragment) ((InterfaceC0280e) c0201i.c.get());
                    FragmentActivity fragmentActivityRequireActivity = mayaKycAmlcUploadDocumentsFragment.requireActivity();
                    kotlin.jvm.internal.j.e(fragmentActivityRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                    MayaKycActivity mayaKycActivity = (MayaKycActivity) ((H8.b) fragmentActivityRequireActivity);
                    mayaKycActivity.n1().s(mayaKycActivity, false);
                    mayaKycActivity.finish();
                    String string2 = mayaKycAmlcUploadDocumentsFragment.getString(R.string.maya_kyc_restart_label_confirm);
                    kotlin.jvm.internal.j.f(string2, "getString(...)");
                    String string3 = mayaKycAmlcUploadDocumentsFragment.getString(R.string.maya_kyc_complete_your_maya_experience_fragment_screen_label);
                    kotlin.jvm.internal.j.f(string3, "getString(...)");
                    mayaKycAmlcUploadDocumentsFragment.L1(string2, string3);
                } else {
                    c0201i.getClass();
                }
                return Unit.f18162a;
            case 2:
                KycSelectionItem p03 = (KycSelectionItem) obj;
                kotlin.jvm.internal.j.g(p03, "p0");
                MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment = (MayaKycCompletePersonalInformationFragment) this.receiver;
                KycFieldType kycFieldType = mayaKycCompletePersonalInformationFragment.f12487Y;
                str = "";
                switch (kycFieldType == null ? -1 : P.f3206a[kycFieldType.ordinal()]) {
                    case 7:
                        B8.c cVarI2 = mayaKycCompletePersonalInformationFragment.I2();
                        int id2 = p03.getId();
                        C0212u c0212u = (C0212u) cVarI2;
                        Iterator it2 = c0212u.f1071A.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                Integer id3 = ((KycCmsAddressCity) next).getId();
                                if (id3 != null && id3.intValue() == id2) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        String name2 = next != null ? ((KycCmsAddressCity) next).getName() : null;
                        ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u.c.get())).h3(name2 != null ? name2 : "");
                        break;
                    case 8:
                        B8.c cVarI22 = mayaKycCompletePersonalInformationFragment.I2();
                        int id4 = p03.getId();
                        C0212u c0212u2 = (C0212u) cVarI22;
                        Iterator it3 = ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u2.c.get())).S1().iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                next2 = it3.next();
                                Integer id5 = ((KycCmsAddressProvince) next2).getId();
                                if (id5 != null && id5.intValue() == id4) {
                                }
                            } else {
                                next2 = null;
                            }
                        }
                        String name3 = next2 != null ? ((KycCmsAddressProvince) next2).getName() : null;
                        str = name3 != null ? name3 : "";
                        c0212u2.f1072B = C1112C.f9377a;
                        c0212u2.f1081L = kotlin.jvm.internal.j.b(c0212u2.f1101w, Boolean.TRUE);
                        if (str.length() != 0) {
                            MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment2 = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u2.c.get());
                            mayaKycCompletePersonalInformationFragment2.y3(((N5.W) mayaKycCompletePersonalInformationFragment2.G1()).f3971b.h, true);
                            new Lh.d(new Lh.d(new Lh.h(c0212u2.f.a(str), zh.b.a(), 0), new C0210s(c0212u2, str, i4), 2), new D8.r(c0212u2, 2), 0).e();
                        }
                        ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u2.c.get())).m3(str);
                        c0212u2.i0();
                        break;
                    case 9:
                        B8.c cVarI23 = mayaKycCompletePersonalInformationFragment.I2();
                        int id6 = p03.getId();
                        C0212u c0212u3 = (C0212u) cVarI23;
                        Iterator it4 = c0212u3.f1072B.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                next3 = it4.next();
                                Integer id7 = ((KycCmsAddressCity) next3).getId();
                                if (id7 != null && id7.intValue() == id6) {
                                }
                            } else {
                                next3 = null;
                            }
                        }
                        String name4 = next3 != null ? ((KycCmsAddressCity) next3).getName() : null;
                        if (name4 == null) {
                            name4 = "";
                        }
                        C1112C c1112c = C1112C.f9377a;
                        c0212u3.f1073C = c1112c;
                        c0212u3.f1074D = c1112c;
                        c0212u3.f1081L = kotlin.jvm.internal.j.b(c0212u3.f1101w, Boolean.TRUE);
                        String strX1 = ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u3.c.get())).X1();
                        if (name4.length() != 0 && strX1.length() != 0) {
                            MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment3 = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u3.c.get());
                            mayaKycCompletePersonalInformationFragment3.y3(((N5.W) mayaKycCompletePersonalInformationFragment3.G1()).f3971b.i, true);
                            MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment4 = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u3.c.get());
                            mayaKycCompletePersonalInformationFragment4.y3(((N5.W) mayaKycCompletePersonalInformationFragment4.G1()).f3971b.f4014k, true);
                            new Lh.d(new Lh.d(new Lh.h(((KycCmsAddressApi) c0212u3.f.f5470b).getLocalitiesAndZipCodes(-1, strX1, name4, "name,zip_codes.code").h(Th.e.c), zh.b.a(), 0), new C0211t(c0212u3, strX1, name4, i10), 2), new C0205m(c0212u3, i), 0).e();
                        }
                        ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u3.c.get())).k3(name4);
                        ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u3.c.get())).l3("");
                        ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u3.c.get())).n3("");
                        ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u3.c.get())).p2().b();
                        ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u3.c.get())).m2().e();
                        break;
                    case 10:
                        B8.c cVarI24 = mayaKycCompletePersonalInformationFragment.I2();
                        int id8 = p03.getId();
                        C0212u c0212u4 = (C0212u) cVarI24;
                        Iterator it5 = c0212u4.f1073C.iterator();
                        while (true) {
                            if (it5.hasNext()) {
                                next4 = it5.next();
                                Integer id9 = ((KycCmsAddressLocality) next4).getId();
                                if (id9 != null && id9.intValue() == id8) {
                                }
                            } else {
                                next4 = null;
                            }
                        }
                        KycCmsAddressLocality kycCmsAddressLocality = (KycCmsAddressLocality) next4;
                        if (kycCmsAddressLocality == null || (zipCodes = kycCmsAddressLocality.getZipCodes()) == null) {
                            zipCodes = C1112C.f9377a;
                        }
                        c0212u4.f1074D = zipCodes;
                        String name5 = kycCmsAddressLocality != null ? kycCmsAddressLocality.getName() : null;
                        if (name5 == null) {
                            name5 = "";
                        }
                        ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u4.c.get())).l3(name5);
                        ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u4.c.get())).p2().e();
                        ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u4.c.get())).n3("");
                        if (c0212u4.S() && kotlin.jvm.internal.j.b(c0212u4.f1101w, Boolean.TRUE)) {
                            X5.f.u((InterfaceC0282g) c0212u4.c.get(), new C0203k(c0212u4, i10));
                        }
                        break;
                    case 13:
                        B8.c cVarI25 = mayaKycCompletePersonalInformationFragment.I2();
                        int id10 = p03.getId();
                        C0212u c0212u5 = (C0212u) cVarI25;
                        Iterator it6 = c0212u5.f1074D.iterator();
                        while (true) {
                            if (it6.hasNext()) {
                                next5 = it6.next();
                                Integer id11 = ((KycCmsAddressZipCode) next5).getId();
                                if (id11 != null && id11.intValue() == id10) {
                                }
                            } else {
                                next5 = null;
                            }
                        }
                        String code = next5 != null ? ((KycCmsAddressZipCode) next5).getCode() : null;
                        ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u5.c.get())).n3(code != null ? code : "");
                        break;
                    case 14:
                        B8.c cVarI26 = mayaKycCompletePersonalInformationFragment.I2();
                        int id12 = p03.getId();
                        C0212u c0212u6 = (C0212u) cVarI26;
                        Iterator it7 = ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u6.c.get())).S1().iterator();
                        while (true) {
                            if (it7.hasNext()) {
                                next6 = it7.next();
                                Integer id13 = ((KycCmsAddressProvince) next6).getId();
                                if (id13 != null && id13.intValue() == id12) {
                                }
                            } else {
                                next6 = null;
                            }
                        }
                        String name6 = next6 != null ? ((KycCmsAddressProvince) next6).getName() : null;
                        str = name6 != null ? name6 : "";
                        c0212u6.f1075E = C1112C.f9377a;
                        c0212u6.f1082M = kotlin.jvm.internal.j.b(c0212u6.f1102x, Boolean.TRUE);
                        if (str.length() != 0) {
                            MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment5 = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u6.c.get());
                            mayaKycCompletePersonalInformationFragment5.y3(((N5.W) mayaKycCompletePersonalInformationFragment5.G1()).f3971b.f4015l, true);
                            new Lh.d(new Lh.d(new Lh.h(c0212u6.f.a(str), zh.b.a(), 0), new C0210s(c0212u6, str, i6), 2), new C0206n(c0212u6, i), 0).e();
                        }
                        ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u6.c.get())).s3(str);
                        c0212u6.j0();
                        break;
                    case 15:
                        B8.c cVarI27 = mayaKycCompletePersonalInformationFragment.I2();
                        int id14 = p03.getId();
                        C0212u c0212u7 = (C0212u) cVarI27;
                        Iterator it8 = c0212u7.f1075E.iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                next7 = it8.next();
                                Integer id15 = ((KycCmsAddressCity) next7).getId();
                                if (id15 != null && id15.intValue() == id14) {
                                }
                            } else {
                                next7 = null;
                            }
                        }
                        String name7 = next7 != null ? ((KycCmsAddressCity) next7).getName() : null;
                        if (name7 == null) {
                            name7 = "";
                        }
                        C1112C c1112c2 = C1112C.f9377a;
                        c0212u7.f1076F = c1112c2;
                        c0212u7.f1077G = c1112c2;
                        c0212u7.f1082M = kotlin.jvm.internal.j.b(c0212u7.f1102x, Boolean.TRUE);
                        String strT2 = ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u7.c.get())).T2();
                        if (name7.length() != 0 && strT2.length() != 0) {
                            MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment6 = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u7.c.get());
                            mayaKycCompletePersonalInformationFragment6.y3(((N5.W) mayaKycCompletePersonalInformationFragment6.G1()).f3971b.m, true);
                            MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment7 = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u7.c.get());
                            mayaKycCompletePersonalInformationFragment7.y3(((N5.W) mayaKycCompletePersonalInformationFragment7.G1()).f3971b.f4017o, true);
                            new Lh.d(new Lh.d(new Lh.h(((KycCmsAddressApi) c0212u7.f.f5470b).getLocalitiesAndZipCodes(-1, strT2, name7, "name,zip_codes.code").h(Th.e.c), zh.b.a(), 0), new C0211t(c0212u7, strT2, name7, i4), 2), new C0207o(c0212u7, i), 0).e();
                        }
                        ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u7.c.get())).q3(name7);
                        ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u7.c.get())).r3("");
                        ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u7.c.get())).t3("");
                        ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u7.c.get())).H2().b();
                        ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u7.c.get())).E2().e();
                        break;
                    case 16:
                        B8.c cVarI28 = mayaKycCompletePersonalInformationFragment.I2();
                        int id16 = p03.getId();
                        C0212u c0212u8 = (C0212u) cVarI28;
                        Iterator it9 = c0212u8.f1076F.iterator();
                        while (true) {
                            if (it9.hasNext()) {
                                next8 = it9.next();
                                Integer id17 = ((KycCmsAddressLocality) next8).getId();
                                if (id17 != null && id17.intValue() == id16) {
                                }
                            } else {
                                next8 = null;
                            }
                        }
                        KycCmsAddressLocality kycCmsAddressLocality2 = (KycCmsAddressLocality) next8;
                        if (kycCmsAddressLocality2 == null || (zipCodes2 = kycCmsAddressLocality2.getZipCodes()) == null) {
                            zipCodes2 = C1112C.f9377a;
                        }
                        c0212u8.f1077G = zipCodes2;
                        String name8 = kycCmsAddressLocality2 != null ? kycCmsAddressLocality2.getName() : null;
                        if (name8 == null) {
                            name8 = "";
                        }
                        ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u8.c.get())).r3(name8);
                        ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u8.c.get())).t3("");
                        ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u8.c.get())).H2().e();
                        if (c0212u8.S() && kotlin.jvm.internal.j.b(c0212u8.f1102x, Boolean.TRUE)) {
                            X5.f.u((InterfaceC0282g) c0212u8.c.get(), new C0203k(c0212u8, i4));
                        }
                        break;
                    case 19:
                        B8.c cVarI29 = mayaKycCompletePersonalInformationFragment.I2();
                        int id18 = p03.getId();
                        C0212u c0212u9 = (C0212u) cVarI29;
                        Iterator it10 = c0212u9.f1077G.iterator();
                        while (true) {
                            if (it10.hasNext()) {
                                next9 = it10.next();
                                Integer id19 = ((KycCmsAddressZipCode) next9).getId();
                                if (id19 != null && id19.intValue() == id18) {
                                }
                            } else {
                                next9 = null;
                            }
                        }
                        String code2 = next9 != null ? ((KycCmsAddressZipCode) next9).getCode() : null;
                        ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u9.c.get())).t3(code2 != null ? code2 : "");
                        break;
                    case 22:
                        ((C0212u) mayaKycCompletePersonalInformationFragment.I2()).g0(p03.getId());
                        break;
                    case 23:
                        ((C0212u) mayaKycCompletePersonalInformationFragment.I2()).Z(p03.getId());
                        break;
                    case 24:
                        B8.c cVarI210 = mayaKycCompletePersonalInformationFragment.I2();
                        int id20 = p03.getId();
                        C0212u c0212u10 = (C0212u) cVarI210;
                        Iterator it11 = ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u10.c.get())).P2().iterator();
                        while (true) {
                            if (it11.hasNext()) {
                                Object next13 = it11.next();
                                Integer id21 = ((KycNationality) next13).getId();
                                if (id21 != null && id21.intValue() == id20) {
                                    obj3 = next13;
                                }
                            }
                        }
                        KycNationality kycNationality = (KycNationality) obj3;
                        if (kycNationality != null && (name = kycNationality.getName()) != null) {
                            str = name;
                        }
                        MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment8 = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u10.c.get());
                        mayaKycCompletePersonalInformationFragment8.z2().getInputEditText().setText(str);
                        mayaKycCompletePersonalInformationFragment8.z2().f();
                        if (c0212u10.j.e().isShortenedFlowForeignAddressComplianceEnabled()) {
                            boolean zEqualsIgnoreCase = str.equalsIgnoreCase("Philippines");
                            List listV2 = ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u10.c.get())).V2();
                            ArrayList arrayList = new ArrayList();
                            Iterator it12 = listV2.iterator();
                            while (it12.hasNext()) {
                                String key = ((MayaEKYCSelectedDocument) it12.next()).getDocument().getKey();
                                if (key != null) {
                                    arrayList.add(key);
                                }
                            }
                            Set setZ = C1110A.Z(arrayList);
                            boolean z4 = (zEqualsIgnoreCase || (setZ.contains("FOREIGN_PASSPORT") || setZ.contains("ALIEN_CERTIFICATION")) == true) ? false : true;
                            if (!kotlin.jvm.internal.j.b(c0212u10.f1086Q, Boolean.valueOf(z4))) {
                                c0212u10.f1086Q = Boolean.valueOf(z4);
                                if (!z4) {
                                    MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment9 = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u10.c.get());
                                    MayaInputLayout mayaInputLayoutL2 = mayaKycCompletePersonalInformationFragment9.l2();
                                    mayaInputLayoutL2.setEnabled(true);
                                    mayaInputLayoutL2.f12074x = true;
                                    mayaInputLayoutL2.l();
                                    MayaInputLayout mayaInputLayoutD2 = mayaKycCompletePersonalInformationFragment9.D2();
                                    mayaInputLayoutD2.setEnabled(true);
                                    mayaInputLayoutD2.f12074x = true;
                                    mayaInputLayoutD2.l();
                                    ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u10.c.get())).L2().setVisibility(8);
                                    ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u10.c.get())).M2().setVisibility(8);
                                    c0212u10.f1104z = false;
                                } else {
                                    c0212u10.f1081L = false;
                                    c0212u10.f1082M = false;
                                    if (!((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u10.c.get())).V1().equalsIgnoreCase("Philippines")) {
                                        if (C2576A.H(((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u10.c.get())).X1()) && C2576A.H(((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u10.c.get())).U1()) && C2576A.H(((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u10.c.get())).W1()) && C2576A.H(String.valueOf(((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u10.c.get())).p2().getInputEditText().getText())) && C2576A.H(String.valueOf(((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u10.c.get())).n2().getInputEditText().getText()))) {
                                            c0212u10.f1084O = false;
                                            Integer numI = c0212u10.I();
                                            if (numI != null) {
                                                c0212u10.X(numI.intValue());
                                            }
                                        } else {
                                            c0212u10.f1084O = true;
                                            c0212u10.f1081L = false;
                                            c0212u10.k0("Philippines");
                                        }
                                    }
                                    MayaInputLayout mayaInputLayoutL22 = ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u10.c.get())).l2();
                                    mayaInputLayoutL22.setEnabled(false);
                                    mayaInputLayoutL22.f12074x = false;
                                    mayaInputLayoutL22.l();
                                    MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment10 = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u10.c.get());
                                    TextView textViewL2 = mayaKycCompletePersonalInformationFragment10.L2();
                                    String string4 = mayaKycCompletePersonalInformationFragment10.getString(R.string.maya_kyc_complete_personal_information_current_address_foreign_info);
                                    String strI = AbstractC1414e.i(string4, "getString(...)", mayaKycCompletePersonalInformationFragment10, R.string.maya_kyc_complete_personal_information_current_address, "getString(...)");
                                    String string5 = mayaKycCompletePersonalInformationFragment10.getString(R.string.maya_kyc_complete_personal_information_philippines);
                                    kotlin.jvm.internal.j.f(string5, "getString(...)");
                                    mayaKycCompletePersonalInformationFragment10.v3(textViewL2, string4, strI, string5);
                                    mayaKycCompletePersonalInformationFragment10.L2().setVisibility(0);
                                    if (c0212u10.f1094p) {
                                        if (!((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u10.c.get())).R2().equalsIgnoreCase("Philippines")) {
                                            if (C2576A.H(((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u10.c.get())).T2()) && C2576A.H(((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u10.c.get())).Q2()) && C2576A.H(((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u10.c.get())).S2()) && C2576A.H(String.valueOf(((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u10.c.get())).H2().getInputEditText().getText())) && C2576A.H(String.valueOf(((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u10.c.get())).F2().getInputEditText().getText()))) {
                                                c0212u10.f1085P = false;
                                                Integer numI2 = c0212u10.I();
                                                if (numI2 != null) {
                                                    c0212u10.c0(numI2.intValue());
                                                }
                                            } else {
                                                c0212u10.f1085P = true;
                                                c0212u10.f1082M = false;
                                                c0212u10.l0("Philippines");
                                            }
                                        }
                                        MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment11 = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u10.c.get());
                                        MayaInputLayout mayaInputLayoutD22 = mayaKycCompletePersonalInformationFragment11.D2();
                                        mayaInputLayoutD22.setEnabled(false);
                                        mayaInputLayoutD22.f12074x = false;
                                        mayaInputLayoutD22.l();
                                        mayaKycCompletePersonalInformationFragment11.G2().e();
                                        ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u10.c.get())).A3();
                                    }
                                    c0212u10.f1104z = true;
                                }
                            }
                        }
                        break;
                    case 25:
                        B8.c cVarI211 = mayaKycCompletePersonalInformationFragment.I2();
                        int id22 = p03.getId();
                        C0212u c0212u11 = (C0212u) cVarI211;
                        Iterator it13 = ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u11.c.get())).T1().iterator();
                        while (true) {
                            if (it13.hasNext()) {
                                next10 = it13.next();
                                Integer id23 = ((KycCountry) next10).getId();
                                if (id23 != null && id23.intValue() == id22) {
                                }
                            } else {
                                next10 = null;
                            }
                        }
                        String name9 = next10 != null ? ((KycCountry) next10).getName() : null;
                        if (name9 == null) {
                            name9 = "";
                        }
                        c0212u11.f1083N = false;
                        if (c0212u11.j.e().isShortenedFlowAddressDropdownEnabled()) {
                            boolean zEqualsIgnoreCase2 = name9.equalsIgnoreCase("Philippines");
                            if (c0212u11.f1103y != zEqualsIgnoreCase2) {
                                c0212u11.f1103y = zEqualsIgnoreCase2;
                                c0212u11.f1097s = zEqualsIgnoreCase2;
                                MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment12 = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u11.c.get());
                                mayaKycCompletePersonalInformationFragment12.g2().n(zEqualsIgnoreCase2, false);
                                mayaKycCompletePersonalInformationFragment12.d2().n(zEqualsIgnoreCase2, false);
                                if (zEqualsIgnoreCase2) {
                                    mayaKycCompletePersonalInformationFragment12.d2().b();
                                    mayaKycCompletePersonalInformationFragment12.d2().setEnabled(false);
                                    mayaKycCompletePersonalInformationFragment12.g2().e();
                                    ((FrameLayout) mayaKycCompletePersonalInformationFragment12.h2().c).setVisibility(0);
                                } else {
                                    mayaKycCompletePersonalInformationFragment12.w3();
                                }
                                mayaKycCompletePersonalInformationFragment12.g2().setLabel(mayaKycCompletePersonalInformationFragment12.getString(R.string.maya_kyc_complete_personal_information_birth_state_label));
                                mayaKycCompletePersonalInformationFragment12.d2().setLabel(mayaKycCompletePersonalInformationFragment12.getString(R.string.maya_kyc_complete_personal_information_birth_city_label));
                                mayaKycCompletePersonalInformationFragment12.i3(zEqualsIgnoreCase2);
                                c0212u11.f1071A = C1112C.f9377a;
                            }
                            if (!zEqualsIgnoreCase2) {
                                ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u11.c.get())).d2().e();
                            }
                        }
                        MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment13 = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u11.c.get());
                        mayaKycCompletePersonalInformationFragment13.e2().getInputEditText().setText(name9);
                        mayaKycCompletePersonalInformationFragment13.e2().f();
                        if (!name9.equalsIgnoreCase("Philippines")) {
                            c0212u11.f1097s = false;
                            c0212u11.f1071A = C1112C.f9377a;
                            ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u11.c.get())).j3("");
                            ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u11.c.get())).h3("");
                            ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u11.c.get())).d2().b();
                            ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u11.c.get())).d2().e();
                        }
                        if (c0212u11.S() && c0212u11.f1103y && C2576A.H(((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u11.c.get())).R1())) {
                            c0212u11.f1083N = true;
                            X5.f.u((InterfaceC0282g) c0212u11.c.get(), new C0203k(c0212u11, i));
                        }
                        break;
                    case 26:
                        B8.c cVarI212 = mayaKycCompletePersonalInformationFragment.I2();
                        int id24 = p03.getId();
                        C0212u c0212u12 = (C0212u) cVarI212;
                        Iterator it14 = ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u12.c.get())).S1().iterator();
                        while (true) {
                            if (it14.hasNext()) {
                                next11 = it14.next();
                                Integer id25 = ((KycCmsAddressProvince) next11).getId();
                                if (id25 != null && id25.intValue() == id24) {
                                }
                            } else {
                                next11 = null;
                            }
                        }
                        String name10 = next11 != null ? ((KycCmsAddressProvince) next11).getName() : null;
                        if (name10 == null) {
                            name10 = "";
                        }
                        c0212u12.f1071A = C1112C.f9377a;
                        c0212u12.f1083N = c0212u12.f1103y;
                        if (name10.length() != 0) {
                            MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment14 = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u12.c.get());
                            mayaKycCompletePersonalInformationFragment14.y3(((N5.W) mayaKycCompletePersonalInformationFragment14.G1()).f3971b.f, true);
                            new Lh.d(new Lh.d(new Lh.h(c0212u12.f.a(name10), zh.b.a(), 0), new C0210s(c0212u12, name10, i10), 2), new C0209q(c0212u12, i6), 0).e();
                        }
                        ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u12.c.get())).j3(name10);
                        ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u12.c.get())).h3("");
                        break;
                    case 27:
                        ((C0212u) mayaKycCompletePersonalInformationFragment.I2()).X(p03.getId());
                        break;
                    case 28:
                        ((C0212u) mayaKycCompletePersonalInformationFragment.I2()).c0(p03.getId());
                        break;
                }
                return Unit.f18162a;
            case 3:
                ((C0212u) ((MayaKycCompletePersonalInformationFragment) this.receiver).I2()).O(((Boolean) obj).booleanValue());
                return Unit.f18162a;
            case 4:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                C0212u c0212u13 = (C0212u) ((MayaKycCompletePersonalInformationFragment) this.receiver).I2();
                if (zBooleanValue2) {
                    if (c0212u13.j.e().isSupportSecondaryIdFlowEnabled()) {
                        MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment15 = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u13.c.get());
                        mayaKycCompletePersonalInformationFragment15.getClass();
                        ((MayaKycActivity) D1.b(mayaKycCompletePersonalInformationFragment15)).Z1().f1044l.clear();
                    }
                    c0212u13.r();
                    MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment16 = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u13.c.get());
                    FragmentActivity fragmentActivityRequireActivity2 = mayaKycCompletePersonalInformationFragment16.requireActivity();
                    kotlin.jvm.internal.j.e(fragmentActivityRequireActivity2, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                    String string6 = mayaKycCompletePersonalInformationFragment16.getString(R.string.maya_fragment_kyc_submit_id_screen_label);
                    kotlin.jvm.internal.j.f(string6, "getString(...)");
                    ((MayaKycActivity) ((H8.b) fragmentActivityRequireActivity2)).h2(numX49.tnTj78("bQus"), string6);
                    FrameLayout frameLayout = ((N5.W) mayaKycCompletePersonalInformationFragment16.G1()).f3970a;
                    kotlin.jvm.internal.j.f(frameLayout, "getRoot(...)");
                    Navigation.findNavController(frameLayout).popBackStack(R.id.maya_kyc_submit_id_fragment, false);
                }
                return Unit.f18162a;
            case 5:
                return a(obj);
            case 6:
                PersonalInfoConfirmAction p04 = (PersonalInfoConfirmAction) obj;
                kotlin.jvm.internal.j.g(p04, "p0");
                MayaKycCompletePersonalInformationFragment.K1((MayaKycCompletePersonalInformationFragment) this.receiver, p04);
                return Unit.f18162a;
            case 7:
                PersonalInfoConfirmAction p05 = (PersonalInfoConfirmAction) obj;
                kotlin.jvm.internal.j.g(p05, "p0");
                MayaKycCompletePersonalInformationFragment.K1((MayaKycCompletePersonalInformationFragment) this.receiver, p05);
                return Unit.f18162a;
            case 8:
                return d(obj);
            case 9:
                return e(obj);
            case 10:
                String p06 = (String) obj;
                kotlin.jvm.internal.j.g(p06, "p0");
                ((C0212u) ((B8.c) this.receiver)).U(p06);
                return Unit.f18162a;
            case 11:
                String p07 = (String) obj;
                kotlin.jvm.internal.j.g(p07, "p0");
                ((C0212u) ((B8.c) this.receiver)).T(p07);
                return Unit.f18162a;
            case 12:
                return b(obj);
            case 13:
                return f(obj);
            case 14:
                String p08 = (String) obj;
                kotlin.jvm.internal.j.g(p08, "p0");
                ((C0212u) ((B8.c) this.receiver)).Y(p08);
                return Unit.f18162a;
            case 15:
                String p09 = (String) obj;
                kotlin.jvm.internal.j.g(p09, "p0");
                ((C0212u) ((B8.c) this.receiver)).W(p09);
                return Unit.f18162a;
            case 16:
                String p010 = (String) obj;
                kotlin.jvm.internal.j.g(p010, "p0");
                ((C0212u) ((B8.c) this.receiver)).V(p010);
                return Unit.f18162a;
            case 17:
                return g(obj);
            case 18:
                return h(obj);
            case 19:
                String p011 = (String) obj;
                kotlin.jvm.internal.j.g(p011, "p0");
                ((C0212u) ((B8.c) this.receiver)).d0(p011);
                return Unit.f18162a;
            case 20:
                return j(obj);
            case 21:
                return k(obj);
            case 22:
                return l(obj);
            case 23:
                return i(obj);
            case 24:
                return n(obj);
            case 25:
                return o(obj);
            case 26:
                return p(obj);
            case 27:
                return q(obj);
            case 28:
                return s(obj);
            default:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                D8.J j = (D8.J) this.receiver;
                if (zBooleanValue3) {
                    Bundle arguments = ((MayaKycSimpleCaptureFragment) ((K8.C) j.c.get())).getArguments();
                    if (arguments != null ? arguments.getBoolean("isSelectedFromSecondaryIdScreen", false) : false) {
                        FrameLayout frameLayout2 = ((C0469n0) ((MayaKycSimpleCaptureFragment) ((K8.C) j.c.get())).G1()).f4162a;
                        kotlin.jvm.internal.j.f(frameLayout2, "getRoot(...)");
                        Navigation.findNavController(frameLayout2).popBackStack(R.id.maya_kyc_submit_secondary_id_fragment, false);
                    } else {
                        FrameLayout frameLayout3 = ((C0469n0) ((MayaKycSimpleCaptureFragment) ((K8.C) j.c.get())).G1()).f4162a;
                        kotlin.jvm.internal.j.f(frameLayout3, "getRoot(...)");
                        Navigation.findNavController(frameLayout3).popBackStack(R.id.maya_kyc_submit_id_fragment, false);
                    }
                } else {
                    j.getClass();
                }
                return Unit.f18162a;
        }
    }
}
