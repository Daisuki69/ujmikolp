package D8;

import D.C0190x;
import K8.InterfaceC0282g;
import M8.D1;
import M8.T2;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.content.ContextCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.widget.TextViewCompat;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import bj.AbstractC1039j;
import bj.C1037h;
import bj.C1038i;
import cj.C1110A;
import cj.C1112C;
import cj.C1129o;
import cj.C1132s;
import com.dynatrace.android.agent.Global;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.e0;
import com.paymaya.data.api.KycSubmissionApi;
import com.paymaya.domain.model.AdditionalDocType;
import com.paymaya.domain.model.DataPrivacyProvision;
import com.paymaya.domain.model.KycAdditionalDocUrl;
import com.paymaya.domain.model.KycAdditionalDocUrlV2;
import com.paymaya.domain.model.KycAdditionalDocsUploadResponse;
import com.paymaya.domain.model.KycAdditionalDocsUploadResponseKt;
import com.paymaya.domain.model.KycAddress;
import com.paymaya.domain.model.KycBirthPlace;
import com.paymaya.domain.model.KycCmsAddressCity;
import com.paymaya.domain.model.KycCmsAddressLocality;
import com.paymaya.domain.model.KycCmsAddressProvince;
import com.paymaya.domain.model.KycCmsContentData;
import com.paymaya.domain.model.KycCmsContentDataKt;
import com.paymaya.domain.model.KycCountry;
import com.paymaya.domain.model.KycDocument;
import com.paymaya.domain.model.KycFieldType;
import com.paymaya.domain.model.KycIncomeSource;
import com.paymaya.domain.model.KycJobTitle;
import com.paymaya.domain.model.KycMinorPhotos;
import com.paymaya.domain.model.KycMinorPhotosKt;
import com.paymaya.domain.model.KycNationality;
import com.paymaya.domain.model.KycPreSubmissionContent;
import com.paymaya.domain.model.KycRegulatoryProfileCMSResponse;
import com.paymaya.domain.model.KycSelectionItem;
import com.paymaya.domain.model.KycSelectionModel;
import com.paymaya.domain.model.KycSubmissionContentData;
import com.paymaya.domain.model.KycSubmissionContentDataV2;
import com.paymaya.domain.model.KycSubmissionContentDataV3;
import com.paymaya.domain.model.KycValidationField;
import com.paymaya.domain.model.KycValidationResult;
import com.paymaya.domain.model.KycValidationRule;
import com.paymaya.domain.model.KycWorkNature;
import com.paymaya.domain.model.MayaEKYCSelectedDocument;
import com.paymaya.domain.store.C1293x0;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.kyczoloz.utils.ComplianceRequest;
import com.paymaya.mayaui.kyczoloz.utils.FatcaDetails;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycCompletePersonalInformationFragment;
import dOYHB6.yFtIp6.svM7M6;
import defpackage.AbstractC1414e;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;
import zj.C2576A;

/* JADX INFO: renamed from: D8.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0212u extends C8.a implements B8.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public List f1071A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public List f1072B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public List f1073C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public List f1074D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public List f1075E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public List f1076F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public List f1077G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public KycAddress f1078H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public KycAddress f1079I;
    public KycBirthPlace J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public KycRegulatoryProfileCMSResponse f1080K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f1081L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f1082M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f1083N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f1084O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean f1085P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public Boolean f1086Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public List f1087R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public List f1088S;
    public final com.paymaya.domain.store.L e;
    public final R4.i f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Y.e f1089g;
    public final R4.i h;
    public final C1293x0 i;
    public final com.paymaya.data.preference.a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final S5.c f1090k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e0 f1091l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f1092n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1093o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f1094p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f1095q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f1096r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f1097s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public KycJobTitle f1098t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public KycPreSubmissionContent f1099u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public KycMinorPhotos f1100v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Boolean f1101w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Boolean f1102x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f1103y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f1104z;

    public C0212u(com.paymaya.domain.store.L l6, R4.i iVar, Y.e eVar, R4.i iVar2, C1293x0 c1293x0, com.paymaya.data.preference.a aVar, S5.c cVar, e0 e0Var) {
        super(aVar, 0);
        this.e = l6;
        this.f = iVar;
        this.f1089g = eVar;
        this.h = iVar2;
        this.i = c1293x0;
        this.j = aVar;
        this.f1090k = cVar;
        this.f1091l = e0Var;
        this.m = true;
        this.f1092n = true;
        this.f1093o = true;
        C1112C c1112c = C1112C.f9377a;
        this.f1071A = c1112c;
        this.f1072B = c1112c;
        this.f1073C = c1112c;
        this.f1074D = c1112c;
        this.f1075E = c1112c;
        this.f1076F = c1112c;
        this.f1077G = c1112c;
        this.f1087R = c1112c;
        this.f1088S = c1112c;
    }

    public static KycCmsAddressCity D(KycCmsAddressProvince kycCmsAddressProvince, String str) {
        List<KycCmsAddressCity> cities;
        Object obj = null;
        if (kycCmsAddressProvince == null || (cities = kycCmsAddressProvince.getCities()) == null) {
            return null;
        }
        Iterator<T> it = cities.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (zj.z.o(((KycCmsAddressCity) next).getName(), str, true)) {
                obj = next;
                break;
            }
        }
        return (KycCmsAddressCity) obj;
    }

    public static KycCmsAddressProvince K(String str, List provinces) {
        Object next;
        kotlin.jvm.internal.j.g(provinces, "provinces");
        Iterator it = provinces.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (zj.z.o(((KycCmsAddressProvince) next).getName(), str, true)) {
                break;
            }
        }
        return (KycCmsAddressProvince) next;
    }

    public static boolean Q(KycAddress kycAddress) {
        return !C1129o.q(new String[]{kycAddress.getCountry(), kycAddress.getCity(), kycAddress.getState(), kycAddress.getLocality(), kycAddress.getLine1(), kycAddress.getLine2(), kycAddress.getZipCode()}).isEmpty();
    }

    public static String h0(String str) {
        if (str == null || C2576A.H(str)) {
            return null;
        }
        return str;
    }

    public static String n0(String str) {
        Object objA;
        try {
            C1037h.a aVar = C1037h.f9166b;
            LocalDateTime localDateTime = DateTimeFormat.forPattern("yyyy-MM-dd").parseLocalDateTime(str);
            objA = localDateTime != null ? localDateTime.toString("MM/dd/yyyy") : null;
        } catch (Throwable th2) {
            C1037h.a aVar2 = C1037h.f9166b;
            objA = AbstractC1039j.a(th2);
        }
        return (String) (objA instanceof C1038i ? null : objA);
    }

    public final String A(String str) {
        Object next;
        Iterator it = ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).b2().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (kotlin.jvm.internal.j.b(((KycIncomeSource) next).getDescription(), str)) {
                break;
            }
        }
        KycIncomeSource kycIncomeSource = (KycIncomeSource) next;
        if (kycIncomeSource != null) {
            return kycIncomeSource.getName();
        }
        return null;
    }

    public final String B(String str) {
        Object next;
        Iterator it = ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).P2().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (kotlin.jvm.internal.j.b(((KycNationality) next).getName(), str)) {
                break;
            }
        }
        KycNationality kycNationality = (KycNationality) next;
        if (kycNationality != null) {
            return kycNationality.getCode();
        }
        return null;
    }

    public final String C(String str) {
        Object next;
        Iterator it = ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).X2().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (kotlin.jvm.internal.j.b(((KycWorkNature) next).getDescription(), str)) {
                break;
            }
        }
        KycWorkNature kycWorkNature = (KycWorkNature) next;
        if (kycWorkNature != null) {
            return kycWorkNature.getName();
        }
        return null;
    }

    public final Hh.f E(String str, String str2, List list) {
        int length = str.length();
        com.paymaya.data.preference.a aVar = this.j;
        com.paymaya.domain.store.L l6 = this.e;
        if (length > 0 && str2.length() > 0) {
            String strM = aVar.m();
            KycSubmissionContentData kycSubmissionContentDataL = L(list);
            l6.getClass();
            return ((KycSubmissionApi) l6.f11367b).createSubmissionWithCaptureMethodWithEntrypoint(strM, str, str2, kycSubmissionContentDataL).f(Th.e.c);
        }
        if (str.length() > 0 && str2.length() == 0) {
            String strM2 = aVar.m();
            KycSubmissionContentData kycSubmissionContentDataL2 = L(list);
            l6.getClass();
            return ((KycSubmissionApi) l6.f11367b).createSubmissionWithCaptureMethod(strM2, str, kycSubmissionContentDataL2).f(Th.e.c);
        }
        if (str.length() != 0 || str2.length() <= 0) {
            String strM3 = aVar.m();
            KycSubmissionContentData kycSubmissionContentDataL3 = L(list);
            l6.getClass();
            return ((KycSubmissionApi) l6.f11367b).createSubmission(strM3, kycSubmissionContentDataL3).f(Th.e.c);
        }
        String strM4 = aVar.m();
        KycSubmissionContentData kycSubmissionContentDataL4 = L(list);
        l6.getClass();
        return ((KycSubmissionApi) l6.f11367b).createSubmissionWithEntrypoint(strM4, str2, kycSubmissionContentDataL4).f(Th.e.c);
    }

    public final String F(KycAddress kycAddress) {
        return h0(C1110A.F(C1129o.q(new String[]{kycAddress.getLine1(), kycAddress.getLine2()}), S() ? "" : Global.BLANK, null, null, null, 62));
    }

    public final ArrayList G(String str) {
        Object next;
        Iterator it = ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).X2().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (kotlin.jvm.internal.j.b(((KycWorkNature) next).getDescription(), str)) {
                break;
            }
        }
        KycWorkNature kycWorkNature = (KycWorkNature) next;
        List<KycIncomeSource> prohibitedIncomeSources = kycWorkNature != null ? kycWorkNature.getProhibitedIncomeSources() : null;
        if (prohibitedIncomeSources == null) {
            prohibitedIncomeSources = C1112C.f9377a;
        }
        List listB2 = ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).b2();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listB2) {
            if (!prohibitedIncomeSources.contains((KycIncomeSource) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final KycAddress H() {
        Pair pair;
        String strH0 = h0(String.valueOf(((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).F2().getInputEditText().getText()));
        if (S()) {
            if (strH0 == null) {
                strH0 = "";
            }
            pair = E8.k.k(strH0);
        } else {
            pair = new Pair(strH0, h0(String.valueOf(((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).B2().getInputEditText().getText())));
        }
        return new KycAddress(h0(x(((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).R2())), h0(((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).Q2()), h0(((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).T2()), h0(((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).S2()), (String) pair.f18160a, (String) pair.f18161b, h0(String.valueOf(((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).H2().getInputEditText().getText())));
    }

    public final Integer I() {
        Object next;
        Iterator it = ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).T1().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (zj.z.o(((KycCountry) next).getName(), "Philippines", true)) {
                break;
            }
        }
        KycCountry kycCountry = (KycCountry) next;
        if (kycCountry != null) {
            return kycCountry.getId();
        }
        return null;
    }

    public final KycAddress J() {
        Pair pair;
        String strH0 = h0(String.valueOf(((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).n2().getInputEditText().getText()));
        if (S()) {
            if (strH0 == null) {
                strH0 = "";
            }
            pair = E8.k.k(strH0);
        } else {
            pair = new Pair(strH0, h0(String.valueOf(((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).j2().getInputEditText().getText())));
        }
        return new KycAddress(h0(x(((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).V1())), h0(((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).U1()), h0(((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).X1()), h0(((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).W1()), (String) pair.f18160a, (String) pair.f18161b, h0(String.valueOf(((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).p2().getInputEditText().getText())));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(27:0|2|(3:76|3|(1:5)(1:9))|11|(1:13)|14|(1:16)(1:(1:19)(2:72|73))|17|20|(1:22)(2:24|(1:26)(17:27|28|(1:35)(1:34)|36|(1:43)(1:42)|44|(1:53)(1:52)|54|74|55|(1:57)(1:61)|63|(1:65)|66|(1:68)(1:69)|70|71))|23|28|(2:30|35)(0)|36|(2:38|43)(0)|44|(2:46|53)(0)|54|74|55|(0)(0)|63|(0)|66|(0)(0)|70|71) */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01f1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01f5, code lost:
    
        r1 = bj.C1037h.f9166b;
        r0 = bj.AbstractC1039j.a(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ec A[Catch: all -> 0x01f1, TRY_LEAVE, TryCatch #0 {all -> 0x01f1, blocks: (B:55:0x01e2, B:57:0x01ec), top: B:74:0x01e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0215  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.paymaya.domain.model.KycSubmissionContentData L(java.util.List r22) {
        /*
            Method dump skipped, instruction units count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D8.C0212u.L(java.util.List):com.paymaya.domain.model.KycSubmissionContentData");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.paymaya.domain.model.KycSubmissionContentDataV2 M(java.util.List r29) {
        /*
            Method dump skipped, instruction units count: 822
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D8.C0212u.M(java.util.List):com.paymaya.domain.model.KycSubmissionContentDataV2");
    }

    public final KycSubmissionContentDataV3 N(List list) {
        KycSubmissionContentDataV3 kycSubmissionContentDataV3 = new KycSubmissionContentDataV3(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
        KycSubmissionContentDataV2 kycSubmissionContentDataV2M = M(list);
        KycJobTitle kycJobTitle = (KycJobTitle) E8.C.a(null, "job_title_object");
        String name = kycJobTitle != null ? kycJobTitle.getName() : null;
        if (name == null) {
            name = "";
        }
        return kycSubmissionContentDataV3.generateV3ContentData(kycSubmissionContentDataV2M, name, DataPrivacyProvision.ID_SAVINGS, (List) E8.C.a(null, "formatted_questionnaire_for_submission"));
    }

    public final void O(boolean z4) {
        int i = 2;
        int i4 = 1;
        int i6 = 0;
        if (z4) {
            m0();
            if (P()) {
                this.f1078H = J();
                this.f1079I = H();
                this.J = new KycBirthPlace(((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).P1(), null, ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).Q1(), 2, null);
                MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get());
                mayaKycCompletePersonalInformationFragment.getClass();
                D1.c(mayaKycCompletePersonalInformationFragment, new M8.G(mayaKycCompletePersonalInformationFragment, 5));
                return;
            }
            M8.O o8 = ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).f12494f0;
            if ((o8 != null ? ((MayaKycActivity) o8).d2() : false) && kotlin.jvm.internal.j.b(((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).c2(), Boolean.FALSE)) {
                MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment2 = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get());
                mayaKycCompletePersonalInformationFragment2.getClass();
                D1.c(mayaKycCompletePersonalInformationFragment2, new M8.G(mayaKycCompletePersonalInformationFragment2, 4));
                return;
            }
            M8.O o10 = ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).f12494f0;
            if (o10 != null ? ((MayaKycActivity) o10).c2() : false) {
                MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment3 = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get());
                mayaKycCompletePersonalInformationFragment3.getClass();
                D1.c(mayaKycCompletePersonalInformationFragment3, new M8.G(mayaKycCompletePersonalInformationFragment3, i4));
                return;
            }
            ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).C3();
            KeyEventDispatcher.Component componentRequireActivity = ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).requireActivity();
            kotlin.jvm.internal.j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
            ((MayaKycActivity) ((H8.b) componentRequireActivity)).Z1().f1046o = true;
            com.paymaya.data.preference.a aVar = this.j;
            boolean zIsShortenedFlowBackIdCaptureEnabled = aVar.e().isShortenedFlowBackIdCaptureEnabled();
            com.paymaya.domain.store.L l6 = this.e;
            e(new Lh.d(new Lh.d(new Lh.h((zIsShortenedFlowBackIdCaptureEnabled || aVar.e().isSupportSecondaryIdFlowEnabled()) ? ((KycSubmissionApi) l6.f11367b).getPreSubmissionContentV2(aVar.m()).h(Th.e.c) : ((KycSubmissionApi) l6.f11367b).getPreSubmissionContent(aVar.m()).h(Th.e.c), zh.b.a(), i6), new C0205m(this, i), i), new C0206n(this, i), i6).e());
        }
    }

    public final boolean P() {
        LocalDate localDateE = T2.E(String.valueOf(((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).f2().getInputEditText().getText()));
        if (localDateE != null) {
            return localDateE.isAfter(LocalDate.now().minusYears(18));
        }
        return false;
    }

    public final boolean R(KycFieldType kycFieldType) {
        switch (AbstractC0204l.f1053a[kycFieldType.ordinal()]) {
            case 1:
                return this.f1092n;
            case 2:
                return this.m;
            case 3:
                return this.f1093o;
            case 4:
                return this.f1097s;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return this.f1094p;
            case 11:
                return this.f1095q || this.f1096r;
            case 12:
            case 13:
                return false;
            default:
                return true;
        }
    }

    public final boolean S() {
        return this.j.e().isKycUxTofuRedesignEnabled();
    }

    public final void T(String inputName) {
        Object next;
        Integer id;
        kotlin.jvm.internal.j.g(inputName, "inputName");
        if (!this.f1103y || ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).R1().length() <= 0) {
            return;
        }
        Iterator it = this.f1071A.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (kotlin.jvm.internal.j.b(((KycCmsAddressCity) next).getName(), inputName)) {
                    break;
                }
            }
        }
        int iIntValue = (next == null || (id = ((KycCmsAddressCity) next).getId()) == null) ? -1 : id.intValue();
        MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get());
        String string = mayaKycCompletePersonalInformationFragment.getString(R.string.maya_kyc_complete_personal_information_birth_place_header);
        String strF3 = MayaKycCompletePersonalInformationFragment.f3(string, AbstractC1414e.i(string, "getString(...)", mayaKycCompletePersonalInformationFragment, R.string.maya_kyc_complete_personal_information_birth_city_label, "getString(...)"));
        String string2 = mayaKycCompletePersonalInformationFragment.getString(R.string.maya_kyc_complete_personal_information_select_birth_city_hint);
        kotlin.jvm.internal.j.f(string2, "getString(...)");
        T2.Q(mayaKycCompletePersonalInformationFragment, strF3, string2.concat(" bottomsheet"), null, 12);
        List list = ((C0212u) mayaKycCompletePersonalInformationFragment.I2()).f1071A;
        ArrayList arrayList = new ArrayList(cj.t.l(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(KycSelectionItem.Companion.toSelectionItem((KycCmsAddressCity) it2.next()));
        }
        KycFieldType kycFieldType = KycFieldType.BIRTH_CITY;
        mayaKycCompletePersonalInformationFragment.e3(new KycSelectionModel(R.string.maya_kyc_single_selection_birth_city, iIntValue, arrayList, kycFieldType, false, 16, null), kycFieldType);
    }

    public final void U(String inputName) {
        Object next;
        Integer id;
        kotlin.jvm.internal.j.g(inputName, "inputName");
        if (this.f1103y) {
            Iterator it = ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).S1().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (kotlin.jvm.internal.j.b(((KycCmsAddressProvince) next).getName(), inputName)) {
                        break;
                    }
                }
            }
            int iIntValue = (next == null || (id = ((KycCmsAddressProvince) next).getId()) == null) ? -1 : id.intValue();
            MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get());
            String string = mayaKycCompletePersonalInformationFragment.getString(R.string.maya_kyc_complete_personal_information_birth_place_header);
            String strF3 = MayaKycCompletePersonalInformationFragment.f3(string, AbstractC1414e.i(string, "getString(...)", mayaKycCompletePersonalInformationFragment, R.string.maya_kyc_complete_personal_information_birth_state_label, "getString(...)"));
            String string2 = mayaKycCompletePersonalInformationFragment.getString(R.string.maya_kyc_complete_personal_information_select_birth_state_hint);
            kotlin.jvm.internal.j.f(string2, "getString(...)");
            T2.Q(mayaKycCompletePersonalInformationFragment, strF3, string2.concat(" bottomsheet"), null, 12);
            List listS1 = mayaKycCompletePersonalInformationFragment.S1();
            ArrayList arrayList = new ArrayList(cj.t.l(listS1, 10));
            Iterator it2 = listS1.iterator();
            while (it2.hasNext()) {
                arrayList.add(KycSelectionItem.Companion.toSelectionItem((KycCmsAddressProvince) it2.next()));
            }
            KycFieldType kycFieldType = KycFieldType.BIRTH_STATE;
            mayaKycCompletePersonalInformationFragment.e3(new KycSelectionModel(R.string.maya_kyc_single_selection_birth_state, iIntValue, arrayList, kycFieldType, false, 16, null), kycFieldType);
        }
    }

    public final void V(String inputName) {
        Object next;
        Integer id;
        kotlin.jvm.internal.j.g(inputName, "inputName");
        if (!kotlin.jvm.internal.j.b(this.f1101w, Boolean.TRUE) || C2576A.H(((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).U1())) {
            return;
        }
        Iterator it = this.f1073C.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (kotlin.jvm.internal.j.b(((KycCmsAddressLocality) next).getName(), inputName)) {
                    break;
                }
            }
        }
        int iIntValue = (next == null || (id = ((KycCmsAddressLocality) next).getId()) == null) ? -1 : id.intValue();
        MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get());
        String string = mayaKycCompletePersonalInformationFragment.getString(R.string.maya_kyc_complete_personal_information_current_address_header);
        String strF3 = MayaKycCompletePersonalInformationFragment.f3(string, AbstractC1414e.i(string, "getString(...)", mayaKycCompletePersonalInformationFragment, R.string.maya_kyc_complete_personal_information_address_district_label, "getString(...)"));
        String string2 = mayaKycCompletePersonalInformationFragment.getString(R.string.maya_kyc_single_selection_barangay_name);
        kotlin.jvm.internal.j.f(string2, "getString(...)");
        T2.Q(mayaKycCompletePersonalInformationFragment, strF3, string2.concat(" bottomsheet"), null, 12);
        List list = ((C0212u) mayaKycCompletePersonalInformationFragment.I2()).f1073C;
        ArrayList arrayList = new ArrayList(cj.t.l(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(KycSelectionItem.Companion.toSelectionItem((KycCmsAddressLocality) it2.next()));
        }
        KycFieldType kycFieldType = KycFieldType.CURRENT_BARANGAY;
        mayaKycCompletePersonalInformationFragment.e3(new KycSelectionModel(R.string.maya_kyc_single_selection_barangay_name, iIntValue, arrayList, kycFieldType, false, 16, null), kycFieldType);
    }

    public final void W(String inputName) {
        Object next;
        Integer id;
        kotlin.jvm.internal.j.g(inputName, "inputName");
        if (!kotlin.jvm.internal.j.b(this.f1101w, Boolean.TRUE) || C2576A.H(((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).X1())) {
            return;
        }
        Iterator it = this.f1072B.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (kotlin.jvm.internal.j.b(((KycCmsAddressCity) next).getName(), inputName)) {
                    break;
                }
            }
        }
        int iIntValue = (next == null || (id = ((KycCmsAddressCity) next).getId()) == null) ? -1 : id.intValue();
        MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get());
        String string = mayaKycCompletePersonalInformationFragment.getString(R.string.maya_kyc_complete_personal_information_current_address_header);
        String strF3 = MayaKycCompletePersonalInformationFragment.f3(string, AbstractC1414e.i(string, "getString(...)", mayaKycCompletePersonalInformationFragment, R.string.maya_kyc_complete_personal_information_address_city_label, "getString(...)"));
        String string2 = mayaKycCompletePersonalInformationFragment.getString(R.string.maya_kyc_single_selection_city_name);
        kotlin.jvm.internal.j.f(string2, "getString(...)");
        T2.Q(mayaKycCompletePersonalInformationFragment, strF3, string2.concat(" bottomsheet"), null, 12);
        List list = ((C0212u) mayaKycCompletePersonalInformationFragment.I2()).f1072B;
        ArrayList arrayList = new ArrayList(cj.t.l(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(KycSelectionItem.Companion.toSelectionItem((KycCmsAddressCity) it2.next()));
        }
        KycFieldType kycFieldType = KycFieldType.CURRENT_CITY;
        mayaKycCompletePersonalInformationFragment.e3(new KycSelectionModel(R.string.maya_kyc_single_selection_city_name, iIntValue, arrayList, kycFieldType, false, 16, null), kycFieldType);
    }

    public final void X(int i) {
        Object next;
        Iterator it = ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).T1().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Integer id = ((KycCountry) next).getId();
            if (id != null && id.intValue() == i) {
                break;
            }
        }
        String name = next != null ? ((KycCountry) next).getName() : null;
        if (name == null) {
            name = "";
        }
        k0(name);
        if (S() && kotlin.jvm.internal.j.b(this.f1101w, Boolean.TRUE) && !this.f1084O) {
            this.f1081L = true;
            X5.f.u((InterfaceC0282g) this.c.get(), new C0203k(this, 4));
        }
        this.f1084O = false;
    }

    public final void Y(String inputName) {
        Object next;
        Integer id;
        kotlin.jvm.internal.j.g(inputName, "inputName");
        if (!kotlin.jvm.internal.j.b(this.f1101w, Boolean.TRUE) || C2576A.H(((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).V1())) {
            return;
        }
        Iterator it = ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).S1().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (kotlin.jvm.internal.j.b(((KycCmsAddressProvince) next).getName(), inputName)) {
                    break;
                }
            }
        }
        int iIntValue = (next == null || (id = ((KycCmsAddressProvince) next).getId()) == null) ? -1 : id.intValue();
        MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get());
        String string = mayaKycCompletePersonalInformationFragment.getString(R.string.maya_kyc_complete_personal_information_current_address_header);
        String strF3 = MayaKycCompletePersonalInformationFragment.f3(string, AbstractC1414e.i(string, "getString(...)", mayaKycCompletePersonalInformationFragment, R.string.maya_kyc_complete_personal_information_address_state_label, "getString(...)"));
        String string2 = mayaKycCompletePersonalInformationFragment.getString(R.string.maya_kyc_single_selection_state_name);
        kotlin.jvm.internal.j.f(string2, "getString(...)");
        T2.Q(mayaKycCompletePersonalInformationFragment, strF3, string2.concat(" bottomsheet"), null, 12);
        List listS1 = mayaKycCompletePersonalInformationFragment.S1();
        ArrayList arrayList = new ArrayList(cj.t.l(listS1, 10));
        Iterator it2 = listS1.iterator();
        while (it2.hasNext()) {
            arrayList.add(KycSelectionItem.Companion.toSelectionItem((KycCmsAddressProvince) it2.next()));
        }
        KycFieldType kycFieldType = KycFieldType.CURRENT_STATE;
        mayaKycCompletePersonalInformationFragment.e3(new KycSelectionModel(R.string.maya_kyc_single_selection_state_name, iIntValue, arrayList, kycFieldType, false, 16, null), kycFieldType);
    }

    public final void Z(int i) {
        Object next;
        Iterator it = ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).b2().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Integer id = ((KycIncomeSource) next).getId();
            if (id != null && id.intValue() == i) {
                break;
            }
        }
        String description = next != null ? ((KycIncomeSource) next).getDescription() : null;
        if (description == null) {
            description = "";
        }
        ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).p3(description);
    }

    public final void a0(String inputName) {
        Object next;
        Integer id;
        kotlin.jvm.internal.j.g(inputName, "inputName");
        if (!kotlin.jvm.internal.j.b(this.f1102x, Boolean.TRUE) || C2576A.H(((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).Q2())) {
            return;
        }
        Iterator it = this.f1076F.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (kotlin.jvm.internal.j.b(((KycCmsAddressLocality) next).getName(), inputName)) {
                    break;
                }
            }
        }
        int iIntValue = (next == null || (id = ((KycCmsAddressLocality) next).getId()) == null) ? -1 : id.intValue();
        MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get());
        String string = mayaKycCompletePersonalInformationFragment.getString(R.string.maya_kyc_complete_personal_information_permanent_address_header);
        String strF3 = MayaKycCompletePersonalInformationFragment.f3(string, AbstractC1414e.i(string, "getString(...)", mayaKycCompletePersonalInformationFragment, R.string.maya_kyc_complete_personal_information_address_district_label, "getString(...)"));
        String string2 = mayaKycCompletePersonalInformationFragment.getString(R.string.maya_kyc_single_selection_barangay_name);
        kotlin.jvm.internal.j.f(string2, "getString(...)");
        T2.Q(mayaKycCompletePersonalInformationFragment, strF3, string2.concat(" bottomsheet"), null, 12);
        List list = ((C0212u) mayaKycCompletePersonalInformationFragment.I2()).f1076F;
        ArrayList arrayList = new ArrayList(cj.t.l(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(KycSelectionItem.Companion.toSelectionItem((KycCmsAddressLocality) it2.next()));
        }
        KycFieldType kycFieldType = KycFieldType.PERMANENT_BARANGAY;
        mayaKycCompletePersonalInformationFragment.e3(new KycSelectionModel(R.string.maya_kyc_single_selection_barangay_name, iIntValue, arrayList, kycFieldType, false, 16, null), kycFieldType);
    }

    public final void b0(String inputName) {
        Object next;
        Integer id;
        kotlin.jvm.internal.j.g(inputName, "inputName");
        if (!kotlin.jvm.internal.j.b(this.f1102x, Boolean.TRUE) || C2576A.H(((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).T2())) {
            return;
        }
        Iterator it = this.f1075E.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (kotlin.jvm.internal.j.b(((KycCmsAddressCity) next).getName(), inputName)) {
                    break;
                }
            }
        }
        int iIntValue = (next == null || (id = ((KycCmsAddressCity) next).getId()) == null) ? -1 : id.intValue();
        MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get());
        String string = mayaKycCompletePersonalInformationFragment.getString(R.string.maya_kyc_complete_personal_information_permanent_address_header);
        String strF3 = MayaKycCompletePersonalInformationFragment.f3(string, AbstractC1414e.i(string, "getString(...)", mayaKycCompletePersonalInformationFragment, R.string.maya_kyc_complete_personal_information_address_city_label, "getString(...)"));
        String string2 = mayaKycCompletePersonalInformationFragment.getString(R.string.maya_kyc_single_selection_city_name);
        kotlin.jvm.internal.j.f(string2, "getString(...)");
        T2.Q(mayaKycCompletePersonalInformationFragment, strF3, string2.concat(" bottomsheet"), null, 12);
        List list = ((C0212u) mayaKycCompletePersonalInformationFragment.I2()).f1075E;
        ArrayList arrayList = new ArrayList(cj.t.l(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(KycSelectionItem.Companion.toSelectionItem((KycCmsAddressCity) it2.next()));
        }
        KycFieldType kycFieldType = KycFieldType.PERMANENT_CITY;
        mayaKycCompletePersonalInformationFragment.e3(new KycSelectionModel(R.string.maya_kyc_single_selection_city_name, iIntValue, arrayList, kycFieldType, false, 16, null), kycFieldType);
    }

    public final void c0(int i) {
        Object next;
        Iterator it = ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).T1().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Integer id = ((KycCountry) next).getId();
            if (id != null && id.intValue() == i) {
                break;
            }
        }
        String name = next != null ? ((KycCountry) next).getName() : null;
        if (name == null) {
            name = "";
        }
        l0(name);
        if (S() && kotlin.jvm.internal.j.b(this.f1102x, Boolean.TRUE) && !this.f1085P && C2576A.H(((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).T2())) {
            this.f1082M = true;
            X5.f.u((InterfaceC0282g) this.c.get(), new C0203k(this, 2));
        }
        this.f1085P = false;
    }

    public final void d0(String inputName) {
        Object next;
        Integer id;
        kotlin.jvm.internal.j.g(inputName, "inputName");
        if (!kotlin.jvm.internal.j.b(this.f1102x, Boolean.TRUE) || C2576A.H(((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).R2())) {
            return;
        }
        Iterator it = ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).S1().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (kotlin.jvm.internal.j.b(((KycCmsAddressProvince) next).getName(), inputName)) {
                    break;
                }
            }
        }
        int iIntValue = (next == null || (id = ((KycCmsAddressProvince) next).getId()) == null) ? -1 : id.intValue();
        MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get());
        String string = mayaKycCompletePersonalInformationFragment.getString(R.string.maya_kyc_complete_personal_information_permanent_address_header);
        String strF3 = MayaKycCompletePersonalInformationFragment.f3(string, AbstractC1414e.i(string, "getString(...)", mayaKycCompletePersonalInformationFragment, R.string.maya_kyc_complete_personal_information_address_state_label, "getString(...)"));
        String string2 = mayaKycCompletePersonalInformationFragment.getString(R.string.maya_kyc_single_selection_state_name);
        kotlin.jvm.internal.j.f(string2, "getString(...)");
        T2.Q(mayaKycCompletePersonalInformationFragment, strF3, string2.concat(" bottomsheet"), null, 12);
        List listS1 = mayaKycCompletePersonalInformationFragment.S1();
        ArrayList arrayList = new ArrayList(cj.t.l(listS1, 10));
        Iterator it2 = listS1.iterator();
        while (it2.hasNext()) {
            arrayList.add(KycSelectionItem.Companion.toSelectionItem((KycCmsAddressProvince) it2.next()));
        }
        KycFieldType kycFieldType = KycFieldType.PERMANENT_STATE;
        mayaKycCompletePersonalInformationFragment.e3(new KycSelectionModel(R.string.maya_kyc_single_selection_state_name, iIntValue, arrayList, kycFieldType, false, 16, null), kycFieldType);
    }

    public final void e0(Throwable error) {
        kotlin.jvm.internal.j.g(error, "error");
        ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).x3();
        l(error, new C0190x(0, this.c.get(), InterfaceC0282g.class, "showPreSubmissionIdInvalidError", "showPreSubmissionIdInvalidError()V", 0, 6), new C0190x(0, this.c.get(), InterfaceC0282g.class, "handleMultiSubmissionError", "handleMultiSubmissionError()V", 0, 7), new Ag.d(this, 8));
    }

    public final void f0() {
        String strK = this.j.k();
        if (kotlin.jvm.internal.j.b(strK, "0")) {
            androidx.media3.datasource.cache.c.u(this.j.f11330b, "key_kyc_status", "submitted");
        } else if (!kotlin.jvm.internal.j.b(strK, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
            return;
        } else {
            this.j.n0("submitted");
        }
        r();
        MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get());
        mayaKycCompletePersonalInformationFragment.getClass();
        D1.c(mayaKycCompletePersonalInformationFragment, new M8.G(mayaKycCompletePersonalInformationFragment, 7));
        KeyEventDispatcher.Component componentRequireActivity = ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).requireActivity();
        kotlin.jvm.internal.j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        ((MayaKycActivity) ((H8.b) componentRequireActivity)).Z1().j = Boolean.FALSE;
        InterfaceC0282g interfaceC0282g = (InterfaceC0282g) this.c.get();
        C1112C fatcaReasons = C1112C.f9377a;
        MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment2 = (MayaKycCompletePersonalInformationFragment) interfaceC0282g;
        mayaKycCompletePersonalInformationFragment2.getClass();
        kotlin.jvm.internal.j.g(fatcaReasons, "fatcaReasons");
        KeyEventDispatcher.Component componentRequireActivity2 = mayaKycCompletePersonalInformationFragment2.requireActivity();
        kotlin.jvm.internal.j.e(componentRequireActivity2, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        ((MayaKycActivity) ((H8.b) componentRequireActivity2)).Z1().f1043k = fatcaReasons;
    }

    public final void g0(int i) {
        Object next;
        Iterator it = ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).X2().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Integer id = ((KycWorkNature) next).getId();
            if (id != null && id.intValue() == i) {
                break;
            }
        }
        KycWorkNature kycWorkNature = (KycWorkNature) next;
        if (kycWorkNature != null) {
            String description = kycWorkNature.getDescription();
            if (description == null) {
                description = "";
            }
            MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get());
            mayaKycCompletePersonalInformationFragment.getClass();
            mayaKycCompletePersonalInformationFragment.O2().getInputEditText().setText(description);
            mayaKycCompletePersonalInformationFragment.O2().f();
            ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).p3("");
            ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).o3("");
            MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment2 = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get());
            mayaKycCompletePersonalInformationFragment2.getClass();
            mayaKycCompletePersonalInformationFragment2.A2().getInputEditText().setText("");
            mayaKycCompletePersonalInformationFragment2.A2().f();
            boolean zIsEmpty = G(description).isEmpty();
            Boolean requiresEmploymentDetails = kycWorkNature.getRequiresEmploymentDetails();
            Boolean bool = Boolean.TRUE;
            boolean zB = kotlin.jvm.internal.j.b(requiresEmploymentDetails, bool);
            boolean zB2 = kotlin.jvm.internal.j.b(kycWorkNature.getAdditionalInfoRequired(), bool);
            this.m = zB;
            this.f1092n = zB2;
            if (!S()) {
                if (((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).c3() || zIsEmpty) {
                    ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).i1();
                    Unit unit = Unit.f18162a;
                } else {
                    ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).u2().setVisibility(0);
                    Unit unit2 = Unit.f18162a;
                }
                if (!((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).c3() && zB) {
                    ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).q2().setVisibility(0);
                } else {
                    ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).w0();
                }
                if (((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).c3()) {
                    ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).Z2();
                    return;
                } else if (zB2) {
                    ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).A2().setVisibility(0);
                    return;
                } else {
                    ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).Z2();
                    return;
                }
            }
            if (((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).c3() || zIsEmpty) {
                ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).i1();
                Unit unit3 = Unit.f18162a;
            } else {
                ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).u2().setStyleDisabledState(false);
                ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).u2().setVisibility(0);
                Unit unit4 = Unit.f18162a;
            }
            if (!((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).c3() && zB) {
                ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).q2().setStyleDisabledState(false);
                ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).q2().setVisibility(0);
            } else {
                ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).w0();
            }
            if (!((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).c3() && zB2) {
                ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).A2().setVisibility(0);
            } else {
                ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).Z2();
            }
            if (S5.c.b(this.f1090k, A5.b.f133s0)) {
                if (!C2576A.x(description, "Government Employee", true)) {
                    MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment3 = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get());
                    mayaKycCompletePersonalInformationFragment3.O2().setHelperInfoText("");
                    mayaKycCompletePersonalInformationFragment3.O2().g();
                } else {
                    InterfaceC0282g interfaceC0282g = (InterfaceC0282g) this.c.get();
                    String strA = this.f1091l.a(R.string.maya_kyc_complete_personal_information_work_nature_helper_info_govt_employee);
                    MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment4 = (MayaKycCompletePersonalInformationFragment) interfaceC0282g;
                    mayaKycCompletePersonalInformationFragment4.getClass();
                    mayaKycCompletePersonalInformationFragment4.O2().setHelperInfoText(strA);
                    mayaKycCompletePersonalInformationFragment4.O2().q();
                }
            }
        }
    }

    public final void i0() {
        C1112C c1112c = C1112C.f9377a;
        this.f1073C = c1112c;
        this.f1074D = c1112c;
        ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).k3("");
        ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).l3("");
        ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).n3("");
        ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).m2().b();
        ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).p2().b();
        ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).k2().e();
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        super.j();
        if (this.j.v().length() == 0) {
            this.j.m0(UUID.randomUUID().toString());
        }
        this.f1081L = false;
        this.f1082M = false;
        this.f1083N = false;
        this.f1084O = true;
        this.f1085P = true;
        if (S()) {
            MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get());
            mayaKycCompletePersonalInformationFragment.O2().setBackgroundNormal(R.drawable.maya_bg_selector_input_layout_white);
            mayaKycCompletePersonalInformationFragment.A2().setBackgroundNormal(R.drawable.maya_bg_selector_input_layout_white);
            MayaInputLayout mayaInputLayoutU2 = mayaKycCompletePersonalInformationFragment.u2();
            mayaInputLayoutU2.setVisibility(0);
            mayaInputLayoutU2.setBackgroundNormal(R.drawable.maya_bg_selector_input_layout_white);
            if (String.valueOf(mayaInputLayoutU2.getInputEditText().getText()).length() == 0) {
                mayaInputLayoutU2.setStyleDisabledState(true);
            }
            MayaInputLayout mayaInputLayoutQ2 = mayaKycCompletePersonalInformationFragment.q2();
            mayaInputLayoutQ2.setVisibility(0);
            mayaInputLayoutQ2.setBackgroundNormal(R.drawable.maya_bg_selector_input_layout_white);
            if (String.valueOf(mayaInputLayoutQ2.getInputEditText().getText()).length() == 0) {
                mayaInputLayoutQ2.setStyleDisabledState(true);
            }
            MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment2 = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get());
            mayaKycCompletePersonalInformationFragment2.r2().setBackgroundNormal(R.drawable.maya_bg_selector_input_layout_white);
            mayaKycCompletePersonalInformationFragment2.x2().setBackgroundNormal(R.drawable.maya_bg_selector_input_layout_white);
            mayaKycCompletePersonalInformationFragment2.v2().setBackgroundNormal(R.drawable.maya_bg_selector_input_layout_white);
            mayaKycCompletePersonalInformationFragment2.z2().setBackgroundNormal(R.drawable.maya_bg_selector_input_layout_white);
            mayaKycCompletePersonalInformationFragment2.f2().setBackgroundNormal(R.drawable.maya_bg_selector_input_layout_white);
            mayaKycCompletePersonalInformationFragment2.e2().setBackgroundNormal(R.drawable.maya_bg_selector_input_layout_white);
            mayaKycCompletePersonalInformationFragment2.g2().setBackgroundNormal(R.drawable.maya_bg_selector_input_layout_white);
            mayaKycCompletePersonalInformationFragment2.d2().setBackgroundNormal(R.drawable.maya_bg_selector_input_layout_white);
            mayaKycCompletePersonalInformationFragment2.l2().setBackgroundNormal(R.drawable.maya_bg_selector_input_layout_white);
            mayaKycCompletePersonalInformationFragment2.o2().setBackgroundNormal(R.drawable.maya_bg_selector_input_layout_white);
            mayaKycCompletePersonalInformationFragment2.k2().setBackgroundNormal(R.drawable.maya_bg_selector_input_layout_white);
            mayaKycCompletePersonalInformationFragment2.m2().setBackgroundNormal(R.drawable.maya_bg_selector_input_layout_white);
            mayaKycCompletePersonalInformationFragment2.p2().setBackgroundNormal(R.drawable.maya_bg_selector_input_layout_white);
            mayaKycCompletePersonalInformationFragment2.n2().setBackgroundNormal(R.drawable.maya_bg_selector_input_layout_white);
            mayaKycCompletePersonalInformationFragment2.j2().setBackgroundNormal(R.drawable.maya_bg_selector_input_layout_white);
            mayaKycCompletePersonalInformationFragment2.D2().setBackgroundNormal(R.drawable.maya_bg_selector_input_layout_white);
            mayaKycCompletePersonalInformationFragment2.G2().setBackgroundNormal(R.drawable.maya_bg_selector_input_layout_white);
            mayaKycCompletePersonalInformationFragment2.C2().setBackgroundNormal(R.drawable.maya_bg_selector_input_layout_white);
            mayaKycCompletePersonalInformationFragment2.E2().setBackgroundNormal(R.drawable.maya_bg_selector_input_layout_white);
            mayaKycCompletePersonalInformationFragment2.H2().setBackgroundNormal(R.drawable.maya_bg_selector_input_layout_white);
            mayaKycCompletePersonalInformationFragment2.F2().setBackgroundNormal(R.drawable.maya_bg_selector_input_layout_white);
            mayaKycCompletePersonalInformationFragment2.B2().setBackgroundNormal(R.drawable.maya_bg_selector_input_layout_white);
            mayaKycCompletePersonalInformationFragment2.t2().setBackgroundNormal(R.drawable.maya_bg_selector_input_layout_white);
            mayaKycCompletePersonalInformationFragment2.s2().setBackgroundNormal(R.drawable.maya_bg_selector_input_layout_white);
            mayaKycCompletePersonalInformationFragment2.K2().setBackgroundNormal(R.drawable.maya_bg_selector_input_layout_white);
            mayaKycCompletePersonalInformationFragment2.J2().setBackgroundNormal(R.drawable.maya_bg_selector_input_layout_white);
            InterfaceC0282g interfaceC0282g = (InterfaceC0282g) this.c.get();
            int color = ContextCompat.getColor(this.f1091l.f10905a, R.color.ghost_white);
            MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment3 = (MayaKycCompletePersonalInformationFragment) interfaceC0282g;
            Object objRequireActivity = mayaKycCompletePersonalInformationFragment3.requireActivity();
            kotlin.jvm.internal.j.e(objRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
            Object obj = (H8.b) objRequireActivity;
            ((MayaKycActivity) obj).r2(color);
            ((y5.q) obj).N1(color);
            ((N5.W) mayaKycCompletePersonalInformationFragment3.G1()).f3971b.f3989P.setBackgroundColor(color);
            TextViewCompat.setTextAppearance(((N5.W) ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).G1()).f3971b.f3994U, R.style.JekoBoldH4_Primary);
            TextViewCompat.setTextAppearance(((N5.W) ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).G1()).f3971b.f3995V, R.style.CerebriBookLongRead_Secondary);
            ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).j2().setVisibility(8);
            ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).B2().setVisibility(8);
        }
    }

    public final void j0() {
        C1112C c1112c = C1112C.f9377a;
        this.f1076F = c1112c;
        this.f1077G = c1112c;
        ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).q3("");
        ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).r3("");
        ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).t3("");
        ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).E2().b();
        ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).H2().b();
        ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).C2().e();
    }

    public final void k0(String str) {
        this.f1081L = false;
        if (!((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).V1().equalsIgnoreCase(str) && !this.j.e().isShortenedFlowAddressDropdownEnabled()) {
            ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).L1();
        }
        if (this.j.e().isShortenedFlowAddressDropdownEnabled()) {
            boolean zEqualsIgnoreCase = str.equalsIgnoreCase("Philippines");
            if (!kotlin.jvm.internal.j.b(this.f1101w, Boolean.valueOf(zEqualsIgnoreCase))) {
                this.f1101w = Boolean.valueOf(zEqualsIgnoreCase);
                MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get());
                MayaInputLayout mayaInputLayoutO2 = mayaKycCompletePersonalInformationFragment.o2();
                mayaInputLayoutO2.n(zEqualsIgnoreCase, false);
                mayaInputLayoutO2.e();
                MayaInputLayout mayaInputLayoutK2 = mayaKycCompletePersonalInformationFragment.k2();
                mayaInputLayoutK2.n(zEqualsIgnoreCase, false);
                mayaInputLayoutK2.b();
                MayaInputLayout mayaInputLayoutM2 = mayaKycCompletePersonalInformationFragment.m2();
                mayaInputLayoutM2.n(zEqualsIgnoreCase, false);
                mayaInputLayoutM2.b();
                MayaInputLayout mayaInputLayoutP2 = mayaKycCompletePersonalInformationFragment.p2();
                mayaInputLayoutP2.n(zEqualsIgnoreCase, false);
                mayaInputLayoutP2.b();
                mayaKycCompletePersonalInformationFragment.a3(zEqualsIgnoreCase);
                C1112C c1112c = C1112C.f9377a;
                this.f1072B = c1112c;
                this.f1073C = c1112c;
                this.f1074D = c1112c;
            }
            if (!zEqualsIgnoreCase && !((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).V1().equalsIgnoreCase(str)) {
                ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).L1();
                MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment2 = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get());
                mayaKycCompletePersonalInformationFragment2.o2().e();
                mayaKycCompletePersonalInformationFragment2.k2().e();
                mayaKycCompletePersonalInformationFragment2.m2().e();
                mayaKycCompletePersonalInformationFragment2.p2().e();
            }
        }
        MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment3 = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get());
        mayaKycCompletePersonalInformationFragment3.l2().getInputEditText().setText(str);
        mayaKycCompletePersonalInformationFragment3.l2().f();
        boolean zEqualsIgnoreCase2 = str.equalsIgnoreCase("Philippines");
        if (!this.j.e().isShortenedFlowAddressDropdownEnabled() || zEqualsIgnoreCase2) {
            return;
        }
        C1112C c1112c2 = C1112C.f9377a;
        this.f1072B = c1112c2;
        this.f1073C = c1112c2;
        this.f1074D = c1112c2;
        ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).m3("");
        ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).k3("");
        ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).l3("");
        ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).n3("");
        MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment4 = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get());
        mayaKycCompletePersonalInformationFragment4.o2().e();
        mayaKycCompletePersonalInformationFragment4.k2().e();
        mayaKycCompletePersonalInformationFragment4.m2().e();
        mayaKycCompletePersonalInformationFragment4.p2().e();
    }

    public final void l0(String str) {
        this.f1082M = false;
        boolean zEqualsIgnoreCase = str.equalsIgnoreCase("Philippines");
        if (this.j.e().isShortenedFlowAddressDropdownEnabled() && !kotlin.jvm.internal.j.b(this.f1102x, Boolean.valueOf(zEqualsIgnoreCase))) {
            this.f1102x = Boolean.valueOf(zEqualsIgnoreCase);
            MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get());
            MayaInputLayout mayaInputLayoutG2 = mayaKycCompletePersonalInformationFragment.G2();
            int i = MayaInputLayout.f12049a0;
            mayaInputLayoutG2.n(zEqualsIgnoreCase, false);
            mayaInputLayoutG2.e();
            MayaInputLayout mayaInputLayoutC2 = mayaKycCompletePersonalInformationFragment.C2();
            mayaInputLayoutC2.n(zEqualsIgnoreCase, false);
            mayaInputLayoutC2.b();
            MayaInputLayout mayaInputLayoutE2 = mayaKycCompletePersonalInformationFragment.E2();
            mayaInputLayoutE2.n(zEqualsIgnoreCase, false);
            mayaInputLayoutE2.b();
            MayaInputLayout mayaInputLayoutH2 = mayaKycCompletePersonalInformationFragment.H2();
            mayaInputLayoutH2.n(zEqualsIgnoreCase, false);
            mayaInputLayoutH2.b();
            mayaKycCompletePersonalInformationFragment.b3(zEqualsIgnoreCase);
        }
        if (!zEqualsIgnoreCase && !((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).R2().equalsIgnoreCase(str)) {
            C1112C c1112c = C1112C.f9377a;
            this.f1075E = c1112c;
            this.f1076F = c1112c;
            this.f1077G = c1112c;
            ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).M1();
            MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment2 = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get());
            mayaKycCompletePersonalInformationFragment2.G2().e();
            mayaKycCompletePersonalInformationFragment2.C2().e();
            mayaKycCompletePersonalInformationFragment2.E2().e();
            mayaKycCompletePersonalInformationFragment2.H2().e();
        }
        if (!((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).R2().equalsIgnoreCase(str) && !this.j.e().isShortenedFlowAddressDropdownEnabled()) {
            ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).M1();
        }
        MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment3 = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get());
        mayaKycCompletePersonalInformationFragment3.D2().getInputEditText().setText(str);
        mayaKycCompletePersonalInformationFragment3.D2().f();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m0() {
        /*
            Method dump skipped, instruction units count: 692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D8.C0212u.m0():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(28:0|2|(1:4)(1:5)|(1:7)(1:8)|(1:10)(1:11)|(1:13)(1:14)|(1:16)(1:17)|(1:19)(1:20)|21|(1:23)(1:24)|25|(1:27)(2:29|(1:31)(16:32|33|58|34|(1:36)(1:40)|42|(1:44)|45|62|46|47|60|48|(2:50|51)(1:52)|55|56))|28|33|58|34|(0)(0)|42|(0)|45|62|46|47|60|48|(0)(0)|55|56) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0216, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x021a, code lost:
    
        r12 = bj.C1037h.f9166b;
        r0 = bj.AbstractC1039j.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x02d7, code lost:
    
        r34 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x02d9, code lost:
    
        yk.a.d();
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x020f A[Catch: all -> 0x0216, TRY_LEAVE, TryCatch #0 {all -> 0x0216, blocks: (B:34:0x0201, B:36:0x020f), top: B:58:0x0201 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02cf A[Catch: Exception -> 0x02d9, TRY_LEAVE, TryCatch #1 {Exception -> 0x02d9, blocks: (B:48:0x02c2, B:50:0x02cf), top: B:60:0x02c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02d4 A[PHI: r34
  0x02d4: PHI (r34v2 java.lang.String) = (r34v1 java.lang.String), (r34v5 java.lang.String) binds: [B:54:0x02d9, B:49:0x02cd] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.paymaya.domain.model.KycPersonalInfoSnapshot o() {
        /*
            Method dump skipped, instruction units count: 849
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D8.C0212u.o():com.paymaya.domain.model.KycPersonalInfoSnapshot");
    }

    /* JADX WARN: Removed duplicated region for block: B:304:0x0833  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x08cd  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0964  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o0(com.paymaya.domain.model.KycPreSubmissionContent r21, boolean r22) {
        /*
            Method dump skipped, instruction units count: 2601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D8.C0212u.o0(com.paymaya.domain.model.KycPreSubmissionContent, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p() {
        /*
            Method dump skipped, instruction units count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D8.C0212u.p():void");
    }

    public final KycValidationResult p0(KycFieldType field, String value) {
        KycValidationField kycValidationField;
        Object next;
        KycValidationResult invalidUserAge;
        KycValidationResult kycValidationResult;
        kotlin.jvm.internal.j.g(field, "field");
        kotlin.jvm.internal.j.g(value, "value");
        Object obj = null;
        if (this.j.e().isShortenedFlowAddressDropdownEnabled()) {
            if (value.length() == 0 && R(field)) {
                kycValidationResult = KycValidationResult.RequiredFieldError.INSTANCE;
            } else {
                Boolean bool = this.f1101w;
                Boolean bool2 = Boolean.TRUE;
                kycValidationResult = (kotlin.jvm.internal.j.b(bool, bool2) && C1132s.g(KycFieldType.CURRENT_STATE, KycFieldType.CURRENT_CITY, KycFieldType.CURRENT_BARANGAY, KycFieldType.CURRENT_ZIP_CODE).contains(field)) ? KycValidationResult.Success.INSTANCE : (kotlin.jvm.internal.j.b(this.f1102x, bool2) && C1132s.g(KycFieldType.PERMANENT_STATE, KycFieldType.PERMANENT_CITY, KycFieldType.PERMANENT_BARANGAY, KycFieldType.PERMANENT_ZIP_CODE).contains(field)) ? KycValidationResult.Success.INSTANCE : (this.f1103y && C1132s.g(KycFieldType.BIRTH_STATE, KycFieldType.BIRTH_CITY).contains(field)) ? KycValidationResult.Success.INSTANCE : null;
            }
            if (kycValidationResult != null) {
                return kycValidationResult;
            }
            Boolean bool3 = this.f1101w;
            Boolean bool4 = Boolean.FALSE;
            KycValidationResult.NonPhProvinceError nonPhProvinceError = (kotlin.jvm.internal.j.b(bool3, bool4) && field == KycFieldType.CURRENT_STATE && w(value)) ? KycValidationResult.NonPhProvinceError.INSTANCE : (kotlin.jvm.internal.j.b(this.f1102x, bool4) && field == KycFieldType.PERMANENT_STATE && w(value)) ? KycValidationResult.NonPhProvinceError.INSTANCE : null;
            if (nonPhProvinceError != null) {
                return nonPhProvinceError;
            }
        }
        if (value.length() == 0 && R(field)) {
            return KycValidationResult.RequiredFieldError.INSTANCE;
        }
        if (field.isDate() && value.length() > 0) {
            LocalDate localDateE = T2.E(value);
            if (localDateE == null) {
                invalidUserAge = KycValidationResult.InvalidDateFormat.INSTANCE;
            } else {
                LocalDate localDateNow = LocalDate.now();
                kotlin.jvm.internal.j.f(localDateNow, "now(...)");
                invalidUserAge = (field == KycFieldType.BIRTH_DATE && localDateE.isAfter(localDateNow.minusYears(7))) ? new KycValidationResult.InvalidUserAge(7) : (field == KycFieldType.ID_EXPIRATION_DATE && localDateE.isBefore(localDateNow)) ? KycValidationResult.InvalidIdDate.INSTANCE : KycValidationResult.Success.INSTANCE;
            }
            if (kotlin.jvm.internal.j.b(invalidUserAge, KycValidationResult.Success.INSTANCE)) {
                invalidUserAge = null;
            }
            if (invalidUserAge != null) {
                return invalidUserAge;
            }
        }
        KycCmsContentData kycCmsContentDataI2 = ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).i2();
        List<KycValidationRule> validationRules = kycCmsContentDataI2 != null ? kycCmsContentDataI2.getValidationRules() : null;
        if (validationRules == null) {
            validationRules = C1112C.f9377a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : validationRules) {
            List<KycValidationField> fields = ((KycValidationRule) obj2).getFields();
            if (fields != null) {
                Iterator<T> it = fields.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (kotlin.jvm.internal.j.b(((KycValidationField) next).getName(), field.getCmsName())) {
                        break;
                    }
                }
                kycValidationField = (KycValidationField) next;
            } else {
                kycValidationField = null;
            }
            if (kycValidationField != null) {
                arrayList.add(obj2);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            String regex = ((KycValidationRule) next2).getRegex();
            if (regex == null) {
                regex = ".*";
            }
            if (!AbstractC1213b.U(regex, value)) {
                obj = next2;
                break;
            }
        }
        KycValidationRule kycValidationRule = (KycValidationRule) obj;
        if (value.length() <= 0 || kycValidationRule == null) {
            return value.length() > field.getMaxLength() ? new KycValidationResult.OutOfRangeError(field.getMaxLength()) : KycValidationResult.Success.INSTANCE;
        }
        String message = kycValidationRule.getMessage();
        if (message == null) {
            message = "";
        }
        return new KycValidationResult.RegexpError(message);
    }

    public final void q() {
        MayaEKYCSelectedDocument mayaEKYCSelectedDocument = (MayaEKYCSelectedDocument) C1110A.B(((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).V2());
        String key = mayaEKYCSelectedDocument != null ? mayaEKYCSelectedDocument.getKey() : null;
        if (this.j.e().isShortenedFlowForeignAddressComplianceEnabled()) {
            if (kotlin.jvm.internal.j.b(key, "FOREIGN_PASSPORT") || kotlin.jvm.internal.j.b(key, "ALIEN_CERTIFICATION")) {
                boolean zB = kotlin.jvm.internal.j.b(key, "FOREIGN_PASSPORT");
                k0("Philippines");
                MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get());
                mayaKycCompletePersonalInformationFragment.L2().setVisibility(0);
                TextView textViewL2 = mayaKycCompletePersonalInformationFragment.L2();
                String string = mayaKycCompletePersonalInformationFragment.getString(R.string.maya_kyc_complete_personal_information_current_address_foreign_info);
                String strI = AbstractC1414e.i(string, "getString(...)", mayaKycCompletePersonalInformationFragment, R.string.maya_kyc_complete_personal_information_current_address, "getString(...)");
                String string2 = mayaKycCompletePersonalInformationFragment.getString(R.string.maya_kyc_complete_personal_information_philippines);
                kotlin.jvm.internal.j.f(string2, "getString(...)");
                mayaKycCompletePersonalInformationFragment.v3(textViewL2, string, strI, string2);
                MayaInputLayout mayaInputLayoutL2 = mayaKycCompletePersonalInformationFragment.l2();
                mayaInputLayoutL2.setEnabled(false);
                mayaInputLayoutL2.f12074x = false;
                mayaInputLayoutL2.l();
                mayaKycCompletePersonalInformationFragment.l2().setOnDisabledClickListener(new Gb.h(1));
                if (zB) {
                    mayaKycCompletePersonalInformationFragment.M2().setVisibility(0);
                    AppCompatCheckBox appCompatCheckBoxN2 = mayaKycCompletePersonalInformationFragment.N2();
                    appCompatCheckBoxN2.setChecked(false);
                    appCompatCheckBoxN2.setVisibility(8);
                    mayaKycCompletePersonalInformationFragment.z3();
                    TextView textViewM2 = mayaKycCompletePersonalInformationFragment.M2();
                    String string3 = mayaKycCompletePersonalInformationFragment.getString(R.string.maya_kyc_complete_personal_information_permanent_address_foreign_info);
                    String strI2 = AbstractC1414e.i(string3, "getString(...)", mayaKycCompletePersonalInformationFragment, R.string.maya_kyc_complete_personal_information_permanent_address, "getString(...)");
                    String string4 = mayaKycCompletePersonalInformationFragment.getString(R.string.maya_kyc_complete_personal_information_another_country);
                    kotlin.jvm.internal.j.f(string4, "getString(...)");
                    mayaKycCompletePersonalInformationFragment.v3(textViewM2, string3, strI2, string4);
                }
            }
        }
    }

    public final String q0() {
        String string;
        String string2;
        String string3;
        String string4;
        String str = "";
        if (this.j.e().isSupportSecondaryIdFlowEnabled()) {
            List listV2 = ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).V2();
            KeyEventDispatcher.Component activity = ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).getActivity();
            String key = null;
            H8.b bVar = activity instanceof H8.b ? (H8.b) activity : null;
            String str2 = bVar != null ? ((MayaKycActivity) bVar).f12455w : null;
            if (str2 != null) {
                if (str2.length() == 0) {
                    MayaEKYCSelectedDocument mayaEKYCSelectedDocument = (MayaEKYCSelectedDocument) C1110A.B(listV2);
                    if (mayaEKYCSelectedDocument != null) {
                        key = mayaEKYCSelectedDocument.getKey();
                    }
                } else {
                    key = str2;
                }
            }
            if (!listV2.isEmpty()) {
                return C1110A.F(C1110A.a0(listV2), ",", null, null, new C7.f(2, this, key), 30);
            }
        } else {
            Bundle arguments = ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).getArguments();
            if (arguments == null || (string = arguments.getString("documentType")) == null) {
                string = "";
            }
            if (string.length() > 0) {
                Bundle arguments2 = ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).getArguments();
                if (arguments2 == null || (string2 = arguments2.getString("captureMethod")) == null) {
                    string2 = "";
                }
                if (string2.length() > 0) {
                    Bundle arguments3 = ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).getArguments();
                    if (arguments3 == null || (string3 = arguments3.getString("documentType")) == null) {
                        string3 = "";
                    }
                    Bundle arguments4 = ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).getArguments();
                    if (arguments4 != null && (string4 = arguments4.getString("captureMethod")) != null) {
                        str = string4;
                    }
                    return androidx.camera.core.impl.a.j(string3, Global.SEMICOLON, str);
                }
            }
        }
        return "";
    }

    public final void r() {
        try {
            String idSessionId = o().getIdSessionId();
            if (idSessionId != null) {
                MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get());
                mayaKycCompletePersonalInformationFragment.getClass();
                try {
                    File filesDir = mayaKycCompletePersonalInformationFragment.requireContext().getFilesDir();
                    kotlin.jvm.internal.j.d(filesDir);
                    S1.r.e(filesDir, idSessionId);
                } catch (Exception unused) {
                    "Failed to cleanup stored ID images for session: ".concat(idSessionId);
                    yk.a.d();
                }
            }
        } catch (Exception unused2) {
            yk.a.d();
        }
    }

    public final void s(KycPreSubmissionContent kycPreSubmissionContent) {
        List additionalDocumentsV2;
        String str = (String) E8.C.a(null, "dnfbp_document_type");
        KycAdditionalDocsUploadResponse kycAdditionalDocsUploadResponse = (KycAdditionalDocsUploadResponse) E8.C.a(null, "dnfbp_upload_response");
        boolean z4 = ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).c3() && kycAdditionalDocsUploadResponse != null;
        if (z4) {
            additionalDocumentsV2 = KycAdditionalDocsUploadResponseKt.getAdditionalDocumentsV2(kycAdditionalDocsUploadResponse, String.valueOf(str));
        } else {
            if (z4) {
                throw new NoWhenBranchMatchedException();
            }
            additionalDocumentsV2 = C1112C.f9377a;
        }
        this.f1099u = kycPreSubmissionContent;
        if (this.j.e().isShortenedFlowBackIdCaptureEnabled() || this.j.e().isSupportSecondaryIdFlowEnabled()) {
            String strQ0 = q0();
            String string = svM7M6.getString(this.j.f11330b, "key_maya_kyc_onboarding_entry_point", "");
            u(strQ0, string != null ? string : "", additionalDocumentsV2);
        } else {
            String strQ02 = q0();
            String string2 = svM7M6.getString(this.j.f11330b, "key_maya_kyc_onboarding_entry_point", "");
            v(strQ02, string2 != null ? string2 : "", C1112C.f9377a);
        }
    }

    public final void t(KycPreSubmissionContent kycPreSubmissionContent) {
        List<KycAdditionalDocUrlV2> additionalDocumentsV2;
        String str = (String) E8.C.a(null, "dnfbp_document_type");
        boolean z4 = ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).c3() && ((KycAdditionalDocsUploadResponse) E8.C.a(null, "dnfbp_upload_response")) != null;
        if (!z4) {
            additionalDocumentsV2 = KycMinorPhotosKt.getAdditionalDocumentsV2(this.f1100v);
        } else {
            if (!z4) {
                throw new NoWhenBranchMatchedException();
            }
            KycAdditionalDocsUploadResponse kycAdditionalDocsUploadResponse = (KycAdditionalDocsUploadResponse) E8.C.a(null, "dnfbp_upload_response");
            additionalDocumentsV2 = kycAdditionalDocsUploadResponse != null ? KycAdditionalDocsUploadResponseKt.getAdditionalDocumentsV2(kycAdditionalDocsUploadResponse, this.f1100v, String.valueOf(str)) : null;
            if (additionalDocumentsV2 == null) {
                additionalDocumentsV2 = C1112C.f9377a;
            }
        }
        this.f1099u = kycPreSubmissionContent;
        KycAddress kycAddress = this.f1078H;
        if (kycAddress != null) {
            InterfaceC0282g interfaceC0282g = (InterfaceC0282g) this.c.get();
            String state = kycAddress.getState();
            if (state == null) {
                state = "";
            }
            ((MayaKycCompletePersonalInformationFragment) interfaceC0282g).m3(state);
            InterfaceC0282g interfaceC0282g2 = (InterfaceC0282g) this.c.get();
            String city = kycAddress.getCity();
            if (city == null) {
                city = "";
            }
            ((MayaKycCompletePersonalInformationFragment) interfaceC0282g2).k3(city);
            InterfaceC0282g interfaceC0282g3 = (InterfaceC0282g) this.c.get();
            String locality = kycAddress.getLocality();
            if (locality == null) {
                locality = "";
            }
            ((MayaKycCompletePersonalInformationFragment) interfaceC0282g3).l3(locality);
            InterfaceC0282g interfaceC0282g4 = (InterfaceC0282g) this.c.get();
            String zipCode = kycAddress.getZipCode();
            if (zipCode == null) {
                zipCode = "";
            }
            ((MayaKycCompletePersonalInformationFragment) interfaceC0282g4).n3(zipCode);
        }
        KycAddress kycAddress2 = this.f1079I;
        if (kycAddress2 != null) {
            InterfaceC0282g interfaceC0282g5 = (InterfaceC0282g) this.c.get();
            String state2 = kycAddress2.getState();
            if (state2 == null) {
                state2 = "";
            }
            ((MayaKycCompletePersonalInformationFragment) interfaceC0282g5).s3(state2);
            InterfaceC0282g interfaceC0282g6 = (InterfaceC0282g) this.c.get();
            String city2 = kycAddress2.getCity();
            if (city2 == null) {
                city2 = "";
            }
            ((MayaKycCompletePersonalInformationFragment) interfaceC0282g6).q3(city2);
            InterfaceC0282g interfaceC0282g7 = (InterfaceC0282g) this.c.get();
            String locality2 = kycAddress2.getLocality();
            if (locality2 == null) {
                locality2 = "";
            }
            ((MayaKycCompletePersonalInformationFragment) interfaceC0282g7).r3(locality2);
            InterfaceC0282g interfaceC0282g8 = (InterfaceC0282g) this.c.get();
            String zipCode2 = kycAddress2.getZipCode();
            if (zipCode2 == null) {
                zipCode2 = "";
            }
            ((MayaKycCompletePersonalInformationFragment) interfaceC0282g8).t3(zipCode2);
        }
        KycBirthPlace kycBirthPlace = this.J;
        if (kycBirthPlace != null) {
            InterfaceC0282g interfaceC0282g9 = (InterfaceC0282g) this.c.get();
            String city3 = kycBirthPlace.getCity();
            if (city3 == null) {
                city3 = "";
            }
            ((MayaKycCompletePersonalInformationFragment) interfaceC0282g9).h3(city3);
        }
        if (this.j.e().isShortenedFlowBackIdCaptureEnabled() || this.j.e().isSupportSecondaryIdFlowEnabled()) {
            String strQ0 = q0();
            String string = svM7M6.getString(this.j.f11330b, "key_maya_kyc_onboarding_entry_point", "");
            u(strQ0, string != null ? string : "", additionalDocumentsV2);
            return;
        }
        String strQ02 = q0();
        String string2 = svM7M6.getString(this.j.f11330b, "key_maya_kyc_onboarding_entry_point", "");
        String str2 = string2 != null ? string2 : "";
        String type = AdditionalDocType.PARENTAL_CONSENT.getType();
        KycMinorPhotos kycMinorPhotos = this.f1100v;
        KycAdditionalDocUrl kycAdditionalDocUrl = new KycAdditionalDocUrl(type, kycMinorPhotos != null ? kycMinorPhotos.getConsentFormUrl() : null);
        String type2 = AdditionalDocType.PARENT_GUARDIAN_ID.getType();
        KycMinorPhotos kycMinorPhotos2 = this.f1100v;
        KycAdditionalDocUrl kycAdditionalDocUrl2 = new KycAdditionalDocUrl(type2, kycMinorPhotos2 != null ? kycMinorPhotos2.getParentIdUrl() : null);
        String type3 = AdditionalDocType.BIRTH_CERTIFICATE.getType();
        KycMinorPhotos kycMinorPhotos3 = this.f1100v;
        v(strQ02, str2, C1132s.g(kycAdditionalDocUrl, kycAdditionalDocUrl2, new KycAdditionalDocUrl(type3, kycMinorPhotos3 != null ? kycMinorPhotos3.getBirthCertificateUrl() : null)));
    }

    public final void u(String str, String str2, List list) {
        Hh.f fVarF;
        FatcaDetails fatcaDetails;
        int i = 1;
        int i4 = 0;
        ComplianceRequest complianceRequest = null;
        String str3 = (String) E8.C.a(null, "summary_tooltip");
        if (((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).c3() && str3 == null) {
            List listG = C1132s.g("AMLC_COR", "AMLC_PCOR", "SSNE");
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!C1110A.v(listG, ((KycAdditionalDocUrlV2) obj).getType())) {
                    arrayList.add(obj);
                }
            }
            list = arrayList;
        }
        if (((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).c3()) {
            int length = str.length();
            com.paymaya.data.preference.a aVar = this.j;
            com.paymaya.domain.store.L l6 = this.e;
            if (length > 0 && str2.length() > 0) {
                String strM = aVar.m();
                KycSubmissionContentDataV3 submission = N(list);
                l6.getClass();
                kotlin.jvm.internal.j.g(submission, "submission");
                fVarF = ((KycSubmissionApi) l6.f11367b).createSubmissionV3WithCaptureMethodWithEntrypoint(strM, str, str2, submission).f(Th.e.c);
            } else if (str.length() > 0 && str2.length() == 0) {
                String strM2 = aVar.m();
                KycSubmissionContentDataV3 submission2 = N(list);
                l6.getClass();
                kotlin.jvm.internal.j.g(submission2, "submission");
                fVarF = ((KycSubmissionApi) l6.f11367b).createSubmissionV3WithCaptureMethod(strM2, str, submission2).f(Th.e.c);
            } else if (str.length() != 0 || str2.length() <= 0) {
                String strM3 = aVar.m();
                KycSubmissionContentDataV3 submission3 = N(list);
                l6.getClass();
                kotlin.jvm.internal.j.g(submission3, "submission");
                fVarF = ((KycSubmissionApi) l6.f11367b).createSubmissionV3(strM3, submission3).f(Th.e.c);
            } else {
                String strM4 = aVar.m();
                KycSubmissionContentDataV3 submission4 = N(list);
                l6.getClass();
                kotlin.jvm.internal.j.g(submission4, "submission");
                fVarF = ((KycSubmissionApi) l6.f11367b).createSubmissionV3WithEntrypoint(strM4, str2, submission4).f(Th.e.c);
            }
        } else {
            int length2 = str.length();
            com.paymaya.data.preference.a aVar2 = this.j;
            com.paymaya.domain.store.L l8 = this.e;
            if (length2 > 0 && str2.length() > 0) {
                String strM5 = aVar2.m();
                KycSubmissionContentDataV2 kycSubmissionContentDataV2M = M(list);
                l8.getClass();
                fVarF = ((KycSubmissionApi) l8.f11367b).createSubmissionV2WithCaptureMethodWithEntrypoint(strM5, str, str2, kycSubmissionContentDataV2M).f(Th.e.c);
            } else if (str.length() > 0 && str2.length() == 0) {
                String strM6 = aVar2.m();
                KycSubmissionContentDataV2 kycSubmissionContentDataV2M2 = M(list);
                l8.getClass();
                fVarF = ((KycSubmissionApi) l8.f11367b).createSubmissionV2WithCaptureMethod(strM6, str, kycSubmissionContentDataV2M2).f(Th.e.c);
            } else if (str.length() != 0 || str2.length() <= 0) {
                String strM7 = aVar2.m();
                KycSubmissionContentDataV2 kycSubmissionContentDataV2M3 = M(list);
                l8.getClass();
                fVarF = ((KycSubmissionApi) l8.f11367b).createSubmissionV2(strM7, kycSubmissionContentDataV2M3).f(Th.e.c);
            } else {
                String strM8 = aVar2.m();
                KycSubmissionContentDataV2 kycSubmissionContentDataV2M4 = M(list);
                l8.getClass();
                fVarF = ((KycSubmissionApi) l8.f11367b).createSubmissionV2WithEntrypoint(strM8, str2, kycSubmissionContentDataV2M4).f(Th.e.c);
            }
        }
        Boolean boolC2 = ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).c2();
        Boolean bool = Boolean.TRUE;
        if (!kotlin.jvm.internal.j.b(boolC2, bool)) {
            e(new Hh.f(fVarF, zh.b.a(), i4).a(new C0202j(this, 3)).b(new C0206n(this, i)).c());
            return;
        }
        List listZ1 = ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).Z1();
        if (listZ1 != null) {
            com.paymaya.domain.model.FatcaDetails fatcaDetails2 = new com.paymaya.domain.model.FatcaDetails(bool, new ArrayList(listZ1), null, 4, null);
            Boolean fatca = fatcaDetails2.getFatca();
            if (fatca != null) {
                boolean zBooleanValue = fatca.booleanValue();
                ArrayList<String> fatcaReason = fatcaDetails2.getFatcaReason();
                fatcaDetails = new FatcaDetails(zBooleanValue, fatcaReason != null ? C1110A.W(fatcaReason) : null, "mobile-app-kyc");
            } else {
                fatcaDetails = null;
            }
            if (fatcaDetails == null) {
                throw new IllegalArgumentException("At least one of DosriDetails or FatcaDetails must be provided.");
            }
            complianceRequest = new ComplianceRequest(null, fatcaDetails);
        }
        if (complianceRequest != null) {
            e(new Hh.f(new Hh.a(this.h.c(complianceRequest), fVarF, i4), zh.b.a(), i4).a(new C0202j(this, 2)).b(new C0205m(this, i)).c());
        }
    }

    public final void v(String str, String str2, List list) {
        FatcaDetails fatcaDetails;
        int i = 1;
        int i4 = 0;
        Boolean boolC2 = ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).c2();
        Boolean bool = Boolean.TRUE;
        if (!kotlin.jvm.internal.j.b(boolC2, bool)) {
            e(new Hh.f(E(str, str2, list), zh.b.a(), i4).a(new C0202j(this, 1)).b(new C0208p(this, 1)).c());
            return;
        }
        List listZ1 = ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).Z1();
        ComplianceRequest complianceRequest = null;
        if (listZ1 != null) {
            com.paymaya.domain.model.FatcaDetails fatcaDetails2 = new com.paymaya.domain.model.FatcaDetails(bool, new ArrayList(listZ1), null, 4, null);
            Boolean fatca = fatcaDetails2.getFatca();
            if (fatca != null) {
                boolean zBooleanValue = fatca.booleanValue();
                ArrayList<String> fatcaReason = fatcaDetails2.getFatcaReason();
                fatcaDetails = new FatcaDetails(zBooleanValue, fatcaReason != null ? C1110A.W(fatcaReason) : null, "mobile-app-kyc");
            } else {
                fatcaDetails = null;
            }
            if (fatcaDetails == null) {
                throw new IllegalArgumentException("At least one of DosriDetails or FatcaDetails must be provided.");
            }
            complianceRequest = new ComplianceRequest(null, fatcaDetails);
        }
        if (complianceRequest != null) {
            e(new Hh.f(new Hh.a(this.h.c(complianceRequest), E(str, str2, list), i4), zh.b.a(), i4).a(new C0202j(this, 0)).b(new C0207o(this, i)).c());
        }
    }

    public final boolean w(String str) {
        List listS1 = ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).S1();
        if ((listS1 instanceof Collection) && listS1.isEmpty()) {
            return false;
        }
        Iterator it = listS1.iterator();
        while (it.hasNext()) {
            String name = ((KycCmsAddressProvince) it.next()).getName();
            if (name == null) {
                name = "";
            }
            if (C2576A.x(str, name, true)) {
                return true;
            }
        }
        return false;
    }

    public final String x(String str) {
        Object next;
        Iterator it = ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).T1().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (kotlin.jvm.internal.j.b(((KycCountry) next).getName(), str)) {
                break;
            }
        }
        KycCountry kycCountry = (KycCountry) next;
        if (kycCountry != null) {
            return kycCountry.getCode();
        }
        return null;
    }

    public final String y(String str) {
        Object next;
        Iterator it = ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).T1().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (kotlin.jvm.internal.j.b(((KycCountry) next).getCode(), str)) {
                break;
            }
        }
        KycCountry kycCountry = (KycCountry) next;
        if (kycCountry != null) {
            return kycCountry.getName();
        }
        return null;
    }

    public final KycDocument z(String str) {
        KycCmsContentData kycCmsContentDataI2 = ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.c.get())).i2();
        Object obj = null;
        if (kycCmsContentDataI2 == null) {
            return null;
        }
        Iterator<T> it = KycCmsContentDataKt.getDocuments(kycCmsContentDataI2, this.j.I()).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (kotlin.jvm.internal.j.b(((KycDocument) next).getKey(), str)) {
                obj = next;
                break;
            }
        }
        return (KycDocument) obj;
    }
}
