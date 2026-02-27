package eb;

import N5.R0;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import cj.C1112C;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1229s;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.domain.model.ContactReferenceRelationship;
import com.paymaya.domain.model.EducationalAttainment;
import com.paymaya.domain.model.FieldType;
import com.paymaya.domain.model.Gender;
import com.paymaya.domain.model.JobTitle;
import com.paymaya.domain.model.MaritalStatus;
import com.paymaya.domain.model.MayaUpdateProfileData;
import com.paymaya.domain.model.UpdateProfileCmsContentData;
import com.paymaya.domain.model.UpdateProfileCmsContentDataKt;
import com.paymaya.domain.model.UpdateProfileFieldType;
import com.paymaya.domain.model.UpdateProfileIncomeSource;
import com.paymaya.domain.model.UpdateProfileSelectionItem;
import com.paymaya.domain.model.UpdateProfileWorkNature;
import com.paymaya.domain.store.H0;
import com.paymaya.mayaui.common.view.widget.MayaDropDown;
import com.paymaya.mayaui.login.view.fragment.impl.BaseMayaWelcomeFragment;
import com.paymaya.mayaui.login.view.fragment.impl.MayaLoginFragment;
import com.paymaya.mayaui.regv2.view.fragment.impl.MayaWelcomeV2Fragment;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaPersonalDetailsFragment;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaProfileUpdateSingleSelectionBottomSheetDialogFragment;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaUnderWritingRequirementsFragment;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaUserContactReferenceFragment;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaUserProfileUpdateFragment;
import dOYHB6.tiZVw8.numX49;
import gj.InterfaceC1526a;
import io.ktor.utils.io.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import oc.InterfaceC1974a;
import oc.InterfaceC1975b;
import pi.C2151a;
import rc.C2194a;
import rc.C2195b;
import rc.C2196c;
import sc.AbstractC2250a;
import wc.InterfaceC2390a;
import wc.InterfaceC2391b;
import wc.InterfaceC2392c;
import wc.InterfaceC2393d;
import wc.InterfaceC2394e;
import yc.z;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g extends kotlin.jvm.internal.i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16632a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i, Object obj, Class cls, String str, String str2, int i4, int i6) {
        super(obj, str, i, str2, i4, cls);
        this.f16632a = i6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v132, types: [android.widget.TextView, androidx.appcompat.widget.AppCompatEditText] */
    /* JADX WARN: Type inference failed for: r1v61, types: [android.widget.TextView, androidx.appcompat.widget.AppCompatTextView] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List<EducationalAttainment> educationalAttainments;
        List<MaritalStatus> maritalStatuses;
        List<Gender> genders;
        List<UpdateProfileIncomeSource> incomeSources;
        List<JobTitle> jobTitles;
        List<UpdateProfileWorkNature> workNatures;
        Object next;
        List<UpdateProfileIncomeSource> listFilteredIncomeSourcesFor;
        List<JobTitle> listFilteredJobTitlesFor;
        String code;
        String code2;
        String code3;
        String code4;
        String strTnTj78 = numX49.tnTj78("bi9Pc");
        String strTnTj782 = numX49.tnTj78("bi9Pm");
        String strTnTj783 = numX49.tnTj78("bi9PD");
        String strTnTj784 = numX49.tnTj78("bi9Ph");
        ?? TnTj78 = numX49.tnTj78("bi9PM");
        String strTnTj785 = numX49.tnTj78("bi9PN");
        String strTnTj786 = numX49.tnTj78("bi9P6");
        boolean z4 = true;
        String strTnTj787 = numX49.tnTj78("bi9Pa");
        String strTnTj788 = numX49.tnTj78("bi9PX");
        String strTnTj789 = numX49.tnTj78("bi9PG");
        switch (this.f16632a) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ((C1229s) this.receiver).getClass();
                return zBooleanValue ? numX49.tnTj78("bi9P1") : numX49.tnTj78("bi9Pn");
            case 1:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                ((C1229s) this.receiver).getClass();
                return zBooleanValue2 ? numX49.tnTj78("bi9Pg") : numX49.tnTj78("bi9Pf");
            case 2:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                ((C1229s) this.receiver).getClass();
                return zBooleanValue3 ? strTnTj782 : strTnTj78;
            case 3:
                boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                ((C1229s) this.receiver).getClass();
                return zBooleanValue4 ? strTnTj784 : strTnTj783;
            case 4:
                boolean zBooleanValue5 = ((Boolean) obj).booleanValue();
                ((C1229s) this.receiver).getClass();
                return zBooleanValue5 ? strTnTj782 : strTnTj78;
            case 5:
                boolean zBooleanValue6 = ((Boolean) obj).booleanValue();
                ((C1229s) this.receiver).getClass();
                return zBooleanValue6 ? strTnTj784 : strTnTj783;
            case 6:
                ActivityResult activityResult = (ActivityResult) obj;
                kotlin.jvm.internal.j.g(activityResult, strTnTj789);
                MayaWelcomeV2Fragment.G1((MayaWelcomeV2Fragment) this.receiver, activityResult);
                return Unit.f18162a;
            case 7:
                ActivityResult activityResult2 = (ActivityResult) obj;
                kotlin.jvm.internal.j.g(activityResult2, strTnTj789);
                MayaWelcomeV2Fragment.G1((MayaWelcomeV2Fragment) this.receiver, activityResult2);
                return Unit.f18162a;
            case 8:
                ActivityResult activityResult3 = (ActivityResult) obj;
                kotlin.jvm.internal.j.g(activityResult3, strTnTj789);
                MayaWelcomeV2Fragment mayaWelcomeV2Fragment = (MayaWelcomeV2Fragment) this.receiver;
                mayaWelcomeV2Fragment.getClass();
                if (activityResult3.getResultCode() == -1) {
                    Intent data = activityResult3.getData();
                    stringExtra = data != null ? data.getStringExtra(numX49.tnTj78("bi9PT")) : null;
                    if (stringExtra != null) {
                        TnTj78 = stringExtra;
                    }
                    C1220i c1220iO1 = mayaWelcomeV2Fragment.o1();
                    C1219h c1219hE = C1219h.e(AbstractC1213b.v(1));
                    EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                    HashMap map = c1219hE.j;
                    map.put(numX49.tnTj78("bi9PR"), TnTj78);
                    map.put(numX49.tnTj78("bi9Pp"), numX49.tnTj78("bi9P0"));
                    c1219hE.i();
                    c1220iO1.b(c1219hE);
                }
                return Unit.f18162a;
            case 9:
                ActivityResult activityResult4 = (ActivityResult) obj;
                kotlin.jvm.internal.j.g(activityResult4, strTnTj789);
                BaseMayaWelcomeFragment.G1((BaseMayaWelcomeFragment) this.receiver, activityResult4);
                return Unit.f18162a;
            case 10:
                ActivityResult activityResult5 = (ActivityResult) obj;
                kotlin.jvm.internal.j.g(activityResult5, strTnTj789);
                BaseMayaWelcomeFragment.G1((BaseMayaWelcomeFragment) this.receiver, activityResult5);
                return Unit.f18162a;
            case 11:
                ActivityResult activityResult6 = (ActivityResult) obj;
                kotlin.jvm.internal.j.g(activityResult6, strTnTj789);
                MayaLoginFragment mayaLoginFragment = (MayaLoginFragment) this.receiver;
                mayaLoginFragment.getClass();
                if (activityResult6.getResultCode() == 1001) {
                    C1220i c1220iO12 = mayaLoginFragment.o1();
                    C1219h c1219hE2 = C1219h.e(numX49.tnTj78("bi9Py"));
                    EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
                    HashMap map2 = c1219hE2.j;
                    map2.put(numX49.tnTj78("bi9Pv"), numX49.tnTj78("bi9P7"));
                    map2.put(numX49.tnTj78("bi9PA"), numX49.tnTj78("bi9PY"));
                    c1219hE2.i();
                    c1220iO12.b(c1219hE2);
                }
                return Unit.f18162a;
            case 12:
                return ((w) this.receiver).g((InterfaceC1526a) obj);
            case 13:
                MayaUpdateProfileData mayaUpdateProfileData = (MayaUpdateProfileData) obj;
                kotlin.jvm.internal.j.g(mayaUpdateProfileData, strTnTj789);
                ((C2194a) this.receiver).s(mayaUpdateProfileData);
                return Unit.f18162a;
            case 14:
                MayaUpdateProfileData mayaUpdateProfileData2 = (MayaUpdateProfileData) obj;
                kotlin.jvm.internal.j.g(mayaUpdateProfileData2, strTnTj789);
                ((C2196c) this.receiver).q(mayaUpdateProfileData2);
                return Unit.f18162a;
            case 15:
                UpdateProfileSelectionItem updateProfileSelectionItem = (UpdateProfileSelectionItem) obj;
                kotlin.jvm.internal.j.g(updateProfileSelectionItem, strTnTj789);
                MayaPersonalDetailsFragment mayaPersonalDetailsFragment = (MayaPersonalDetailsFragment) this.receiver;
                FieldType fieldType = mayaPersonalDetailsFragment.f14244c0;
                if (kotlin.jvm.internal.j.b(fieldType, FieldType.Gender.INSTANCE)) {
                    InterfaceC1974a interfaceC1974aX1 = mayaPersonalDetailsFragment.X1();
                    String code5 = updateProfileSelectionItem.getCode();
                    C2194a c2194a = (C2194a) interfaceC1974aX1;
                    kotlin.jvm.internal.j.g(code5, strTnTj786);
                    UpdateProfileCmsContentData updateProfileCmsContentData = c2194a.h;
                    if (updateProfileCmsContentData != null && (genders = updateProfileCmsContentData.getGenders()) != null) {
                        Iterator it = genders.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                Object next2 = it.next();
                                if (kotlin.jvm.internal.j.b(((Gender) next2).getCode(), code5)) {
                                    stringExtra = next2;
                                }
                            }
                        }
                        Gender gender = (Gender) stringExtra;
                        if (gender != null) {
                            ((MayaPersonalDetailsFragment) ((InterfaceC2390a) c2194a.c.get())).d2(gender);
                        }
                    }
                } else if (kotlin.jvm.internal.j.b(fieldType, FieldType.CivilStatus.INSTANCE)) {
                    InterfaceC1974a interfaceC1974aX12 = mayaPersonalDetailsFragment.X1();
                    String code6 = updateProfileSelectionItem.getCode();
                    C2194a c2194a2 = (C2194a) interfaceC1974aX12;
                    kotlin.jvm.internal.j.g(code6, strTnTj786);
                    UpdateProfileCmsContentData updateProfileCmsContentData2 = c2194a2.h;
                    if (updateProfileCmsContentData2 != null && (maritalStatuses = updateProfileCmsContentData2.getMaritalStatuses()) != null) {
                        Iterator it2 = maritalStatuses.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                Object next3 = it2.next();
                                if (kotlin.jvm.internal.j.b(((MaritalStatus) next3).getCode(), code6)) {
                                    stringExtra = next3;
                                }
                            }
                        }
                        MaritalStatus maritalStatus = (MaritalStatus) stringExtra;
                        if (maritalStatus != null) {
                            ((MayaPersonalDetailsFragment) ((InterfaceC2390a) c2194a2.c.get())).b2(maritalStatus);
                        }
                    }
                } else if (kotlin.jvm.internal.j.b(fieldType, FieldType.EducationalAttainment.INSTANCE)) {
                    InterfaceC1974a interfaceC1974aX13 = mayaPersonalDetailsFragment.X1();
                    String code7 = updateProfileSelectionItem.getCode();
                    C2194a c2194a3 = (C2194a) interfaceC1974aX13;
                    kotlin.jvm.internal.j.g(code7, strTnTj786);
                    UpdateProfileCmsContentData updateProfileCmsContentData3 = c2194a3.h;
                    if (updateProfileCmsContentData3 != null && (educationalAttainments = updateProfileCmsContentData3.getEducationalAttainments()) != null) {
                        Iterator it3 = educationalAttainments.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                Object next4 = it3.next();
                                if (kotlin.jvm.internal.j.b(((EducationalAttainment) next4).getCode(), code7)) {
                                    stringExtra = next4;
                                }
                            }
                        }
                        EducationalAttainment educationalAttainment = (EducationalAttainment) stringExtra;
                        if (educationalAttainment != null) {
                            ((MayaPersonalDetailsFragment) ((InterfaceC2390a) c2194a3.c.get())).c2(educationalAttainment);
                        }
                    }
                }
                return Unit.f18162a;
            case 16:
                C2194a c2194a4 = (C2194a) ((InterfaceC1974a) this.receiver);
                UpdateProfileCmsContentData updateProfileCmsContentData4 = c2194a4.h;
                List<Gender> genders2 = updateProfileCmsContentData4 != null ? updateProfileCmsContentData4.getGenders() : null;
                if (genders2 == null) {
                    genders2 = C1112C.f9377a;
                }
                if (obj != null) {
                    Gender gender2 = (Gender) obj;
                    Iterator it4 = genders2.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            Object next5 = it4.next();
                            if (kotlin.jvm.internal.j.b(((Gender) next5).getCode(), gender2.getCode())) {
                                stringExtra = next5;
                            }
                        }
                    }
                    ((MayaPersonalDetailsFragment) ((InterfaceC2390a) c2194a4.c.get())).a2(AbstractC2250a.b(new H0(12), stringExtra), genders2);
                } else {
                    ((MayaPersonalDetailsFragment) ((InterfaceC2390a) c2194a4.c.get())).a2(strTnTj788, genders2);
                }
                return Unit.f18162a;
            case 17:
                C2194a c2194a5 = (C2194a) ((InterfaceC1974a) this.receiver);
                UpdateProfileCmsContentData updateProfileCmsContentData5 = c2194a5.h;
                List<MaritalStatus> maritalStatuses2 = updateProfileCmsContentData5 != null ? updateProfileCmsContentData5.getMaritalStatuses() : null;
                if (maritalStatuses2 == null) {
                    maritalStatuses2 = C1112C.f9377a;
                }
                if (obj != null) {
                    MaritalStatus maritalStatus2 = (MaritalStatus) obj;
                    Iterator it5 = maritalStatuses2.iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            Object next6 = it5.next();
                            if (kotlin.jvm.internal.j.b(((MaritalStatus) next6).getCode(), maritalStatus2.getCode())) {
                                stringExtra = next6;
                            }
                        }
                    }
                    ((MayaPersonalDetailsFragment) ((InterfaceC2390a) c2194a5.c.get())).Y1(AbstractC2250a.b(new H0(11), stringExtra), maritalStatuses2);
                } else {
                    ((MayaPersonalDetailsFragment) ((InterfaceC2390a) c2194a5.c.get())).Y1(strTnTj788, maritalStatuses2);
                }
                return Unit.f18162a;
            case 18:
                C2194a c2194a6 = (C2194a) ((InterfaceC1974a) this.receiver);
                UpdateProfileCmsContentData updateProfileCmsContentData6 = c2194a6.h;
                List<EducationalAttainment> educationalAttainments2 = updateProfileCmsContentData6 != null ? updateProfileCmsContentData6.getEducationalAttainments() : null;
                if (educationalAttainments2 == null) {
                    educationalAttainments2 = C1112C.f9377a;
                }
                if (obj != null) {
                    EducationalAttainment educationalAttainment2 = (EducationalAttainment) obj;
                    Iterator it6 = educationalAttainments2.iterator();
                    while (true) {
                        if (it6.hasNext()) {
                            Object next7 = it6.next();
                            if (kotlin.jvm.internal.j.b(((EducationalAttainment) next7).getCode(), educationalAttainment2.getCode())) {
                                stringExtra = next7;
                            }
                        }
                    }
                    ((MayaPersonalDetailsFragment) ((InterfaceC2390a) c2194a6.c.get())).Z1(AbstractC2250a.b(new H0(13), stringExtra), educationalAttainments2);
                } else {
                    ((MayaPersonalDetailsFragment) ((InterfaceC2390a) c2194a6.c.get())).Z1(strTnTj788, educationalAttainments2);
                }
                return Unit.f18162a;
            case 19:
                UpdateProfileSelectionItem updateProfileSelectionItem2 = (UpdateProfileSelectionItem) obj;
                kotlin.jvm.internal.j.g(updateProfileSelectionItem2, strTnTj789);
                C2195b c2195b = (C2195b) this.receiver;
                c2195b.getClass();
                MayaProfileUpdateSingleSelectionBottomSheetDialogFragment mayaProfileUpdateSingleSelectionBottomSheetDialogFragment = (MayaProfileUpdateSingleSelectionBottomSheetDialogFragment) ((InterfaceC2391b) c2195b.c.get());
                mayaProfileUpdateSingleSelectionBottomSheetDialogFragment.getClass();
                Xh.i.G(mayaProfileUpdateSingleSelectionBottomSheetDialogFragment, updateProfileSelectionItem2);
                ((MayaProfileUpdateSingleSelectionBottomSheetDialogFragment) ((InterfaceC2391b) c2195b.c.get())).dismiss();
                return Unit.f18162a;
            case 20:
                UpdateProfileSelectionItem updateProfileSelectionItem3 = (UpdateProfileSelectionItem) obj;
                kotlin.jvm.internal.j.g(updateProfileSelectionItem3, strTnTj789);
                MayaUnderWritingRequirementsFragment mayaUnderWritingRequirementsFragment = (MayaUnderWritingRequirementsFragment) this.receiver;
                FieldType fieldType2 = mayaUnderWritingRequirementsFragment.f14256b0;
                if (kotlin.jvm.internal.j.b(fieldType2, FieldType.NatureOfWork.INSTANCE)) {
                    InterfaceC1975b interfaceC1975bX1 = mayaUnderWritingRequirementsFragment.X1();
                    String code8 = updateProfileSelectionItem3.getCode();
                    C2196c c2196c = (C2196c) interfaceC1975bX1;
                    kotlin.jvm.internal.j.g(code8, strTnTj786);
                    UpdateProfileCmsContentData updateProfileCmsContentData7 = c2196c.h;
                    if (updateProfileCmsContentData7 != null && (workNatures = updateProfileCmsContentData7.getWorkNatures()) != null) {
                        Iterator it7 = workNatures.iterator();
                        while (true) {
                            if (it7.hasNext()) {
                                next = it7.next();
                                if (kotlin.jvm.internal.j.b(((UpdateProfileWorkNature) next).getCode(), code8)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        UpdateProfileWorkNature updateProfileWorkNature = (UpdateProfileWorkNature) next;
                        if (updateProfileWorkNature != null) {
                            c2196c.f19889o = updateProfileWorkNature;
                            c2196c.m = true;
                            c2196c.f19888n = true;
                            MayaUnderWritingRequirementsFragment mayaUnderWritingRequirementsFragment2 = (MayaUnderWritingRequirementsFragment) ((InterfaceC2392c) c2196c.c.get());
                            mayaUnderWritingRequirementsFragment2.getClass();
                            MayaDropDown mayaDropDown = ((R0) mayaUnderWritingRequirementsFragment2.G1()).c;
                            mayaDropDown.getDisplayText().setText(updateProfileWorkNature.getName());
                            mayaDropDown.setSelectedData(updateProfileWorkNature);
                            mayaDropDown.getDisplayText().setHint(TnTj78);
                            mayaDropDown.b();
                            ((MayaUnderWritingRequirementsFragment) ((InterfaceC2392c) c2196c.c.get())).c2(null);
                            ((MayaUnderWritingRequirementsFragment) ((InterfaceC2392c) c2196c.c.get())).b2(null);
                            MayaUnderWritingRequirementsFragment mayaUnderWritingRequirementsFragment3 = (MayaUnderWritingRequirementsFragment) ((InterfaceC2392c) c2196c.c.get());
                            mayaUnderWritingRequirementsFragment3.getClass();
                            ((R0) mayaUnderWritingRequirementsFragment3.G1()).f.getInputEditText().setText(TnTj78);
                            ((R0) ((MayaUnderWritingRequirementsFragment) ((InterfaceC2392c) c2196c.c.get())).G1()).f3879b.setDropDownEnabled(true);
                            ((R0) ((MayaUnderWritingRequirementsFragment) ((InterfaceC2392c) c2196c.c.get())).G1()).f3880d.setDropDownEnabled(false);
                            boolean requiresEmploymentDetails = updateProfileWorkNature.getRequiresEmploymentDetails();
                            String strTnTj7810 = numX49.tnTj78("bi9P3");
                            if (requiresEmploymentDetails) {
                                MayaUnderWritingRequirementsFragment mayaUnderWritingRequirementsFragment4 = (MayaUnderWritingRequirementsFragment) ((InterfaceC2392c) c2196c.c.get());
                                ((R0) mayaUnderWritingRequirementsFragment4.G1()).f.setVisibility(0);
                                FieldType.CompanyName companyName = FieldType.CompanyName.INSTANCE;
                                C2151a c2151a = mayaUnderWritingRequirementsFragment4.f14257c0;
                                c2151a.getClass();
                                kotlin.jvm.internal.j.g(companyName, strTnTj7810);
                                ((Set) c2151a.f19707a).add(companyName);
                                ((Map) c2151a.c).put(companyName, Boolean.FALSE);
                            } else {
                                MayaUnderWritingRequirementsFragment mayaUnderWritingRequirementsFragment5 = (MayaUnderWritingRequirementsFragment) ((InterfaceC2392c) c2196c.c.get());
                                ((R0) mayaUnderWritingRequirementsFragment5.G1()).f.setVisibility(8);
                                mayaUnderWritingRequirementsFragment5.f14257c0.e(FieldType.CompanyName.INSTANCE);
                                z4 = false;
                            }
                            c2196c.f19887l = z4;
                            R0 r02 = (R0) ((MayaUnderWritingRequirementsFragment) ((InterfaceC2392c) c2196c.c.get())).G1();
                            r02.f.f();
                            r02.f3879b.b();
                            r02.c.b();
                            r02.f3880d.b();
                            MayaUnderWritingRequirementsFragment mayaUnderWritingRequirementsFragment6 = (MayaUnderWritingRequirementsFragment) ((InterfaceC2392c) c2196c.c.get());
                            mayaUnderWritingRequirementsFragment6.getClass();
                            FieldType.MonthlyTakeHomePay monthlyTakeHomePay = FieldType.MonthlyTakeHomePay.INSTANCE;
                            C2151a c2151a2 = mayaUnderWritingRequirementsFragment6.f14257c0;
                            c2151a2.getClass();
                            kotlin.jvm.internal.j.g(monthlyTakeHomePay, strTnTj7810);
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : (Set) c2151a2.f19707a) {
                                if (!kotlin.jvm.internal.j.b((FieldType) obj2, monthlyTakeHomePay)) {
                                    arrayList.add(obj2);
                                }
                            }
                            Iterator it8 = arrayList.iterator();
                            while (it8.hasNext()) {
                                ((Map) c2151a2.c).put((FieldType) it8.next(), Boolean.FALSE);
                            }
                            ((R0) mayaUnderWritingRequirementsFragment6.G1()).f3882k.setEnabled(mayaUnderWritingRequirementsFragment6.f14257c0.c());
                        }
                    }
                } else if (kotlin.jvm.internal.j.b(fieldType2, FieldType.JobTitle.INSTANCE)) {
                    InterfaceC1975b interfaceC1975bX12 = mayaUnderWritingRequirementsFragment.X1();
                    String code9 = updateProfileSelectionItem3.getCode();
                    C2196c c2196c2 = (C2196c) interfaceC1975bX12;
                    kotlin.jvm.internal.j.g(code9, strTnTj786);
                    UpdateProfileCmsContentData updateProfileCmsContentData8 = c2196c2.h;
                    if (updateProfileCmsContentData8 != null && (jobTitles = updateProfileCmsContentData8.getJobTitles()) != null) {
                        Iterator it9 = jobTitles.iterator();
                        while (true) {
                            if (it9.hasNext()) {
                                Object next8 = it9.next();
                                if (kotlin.jvm.internal.j.b(((JobTitle) next8).getCode(), code9)) {
                                    stringExtra = next8;
                                }
                            }
                        }
                        JobTitle jobTitle = (JobTitle) stringExtra;
                        if (jobTitle != null) {
                            ((MayaUnderWritingRequirementsFragment) ((InterfaceC2392c) c2196c2.c.get())).c2(jobTitle);
                            ((R0) ((MayaUnderWritingRequirementsFragment) ((InterfaceC2392c) c2196c2.c.get())).G1()).f3880d.setDropDownEnabled(true);
                        }
                    }
                } else if (kotlin.jvm.internal.j.b(fieldType2, FieldType.SourceOfIncome.INSTANCE)) {
                    InterfaceC1975b interfaceC1975bX13 = mayaUnderWritingRequirementsFragment.X1();
                    String code10 = updateProfileSelectionItem3.getCode();
                    C2196c c2196c3 = (C2196c) interfaceC1975bX13;
                    kotlin.jvm.internal.j.g(code10, strTnTj786);
                    UpdateProfileCmsContentData updateProfileCmsContentData9 = c2196c3.h;
                    if (updateProfileCmsContentData9 != null && (incomeSources = updateProfileCmsContentData9.getIncomeSources()) != null) {
                        Iterator it10 = incomeSources.iterator();
                        while (true) {
                            if (it10.hasNext()) {
                                Object next9 = it10.next();
                                if (kotlin.jvm.internal.j.b(((UpdateProfileIncomeSource) next9).getCode(), code10)) {
                                    stringExtra = next9;
                                }
                            }
                        }
                        UpdateProfileIncomeSource updateProfileIncomeSource = (UpdateProfileIncomeSource) stringExtra;
                        if (updateProfileIncomeSource != null) {
                            ((MayaUnderWritingRequirementsFragment) ((InterfaceC2392c) c2196c3.c.get())).b2(updateProfileIncomeSource);
                        }
                    }
                }
                return Unit.f18162a;
            case 21:
                C2196c c2196c4 = (C2196c) ((InterfaceC1975b) this.receiver);
                UpdateProfileCmsContentData updateProfileCmsContentData10 = c2196c4.h;
                List<UpdateProfileWorkNature> workNatures2 = updateProfileCmsContentData10 != null ? updateProfileCmsContentData10.getWorkNatures() : null;
                if (workNatures2 == null) {
                    workNatures2 = C1112C.f9377a;
                }
                if (obj != null) {
                    UpdateProfileWorkNature updateProfileWorkNature2 = (UpdateProfileWorkNature) obj;
                    Iterator it11 = workNatures2.iterator();
                    while (true) {
                        if (it11.hasNext()) {
                            Object next10 = it11.next();
                            if (kotlin.jvm.internal.j.b(((UpdateProfileWorkNature) next10).getCode(), updateProfileWorkNature2.getCode())) {
                                stringExtra = next10;
                            }
                        }
                    }
                    ((MayaUnderWritingRequirementsFragment) ((InterfaceC2392c) c2196c4.c.get())).a2(AbstractC2250a.b(new H0(15), stringExtra), workNatures2);
                } else {
                    ((MayaUnderWritingRequirementsFragment) ((InterfaceC2392c) c2196c4.c.get())).a2(strTnTj788, workNatures2);
                }
                return Unit.f18162a;
            case 22:
                C2196c c2196c5 = (C2196c) ((InterfaceC1975b) this.receiver);
                UpdateProfileCmsContentData updateProfileCmsContentData11 = c2196c5.h;
                if (updateProfileCmsContentData11 != null) {
                    UpdateProfileWorkNature updateProfileWorkNature3 = c2196c5.f19889o;
                    if (updateProfileWorkNature3 == null) {
                        kotlin.jvm.internal.j.n(strTnTj785);
                        throw null;
                    }
                    listFilteredIncomeSourcesFor = UpdateProfileCmsContentDataKt.filteredIncomeSourcesFor(updateProfileCmsContentData11, updateProfileWorkNature3.getCode());
                } else {
                    listFilteredIncomeSourcesFor = null;
                }
                if (listFilteredIncomeSourcesFor == null) {
                    listFilteredIncomeSourcesFor = C1112C.f9377a;
                }
                if (obj != null) {
                    UpdateProfileIncomeSource updateProfileIncomeSource2 = (UpdateProfileIncomeSource) obj;
                    Iterator it12 = listFilteredIncomeSourcesFor.iterator();
                    while (true) {
                        if (it12.hasNext()) {
                            Object next11 = it12.next();
                            if (kotlin.jvm.internal.j.b(((UpdateProfileIncomeSource) next11).getCode(), updateProfileIncomeSource2.getCode())) {
                                stringExtra = next11;
                            }
                        }
                    }
                    ((MayaUnderWritingRequirementsFragment) ((InterfaceC2392c) c2196c5.c.get())).Y1(AbstractC2250a.b(new H0(14), stringExtra), listFilteredIncomeSourcesFor);
                } else {
                    ((MayaUnderWritingRequirementsFragment) ((InterfaceC2392c) c2196c5.c.get())).Y1(strTnTj788, listFilteredIncomeSourcesFor);
                }
                return Unit.f18162a;
            case 23:
                C2196c c2196c6 = (C2196c) ((InterfaceC1975b) this.receiver);
                UpdateProfileCmsContentData updateProfileCmsContentData12 = c2196c6.h;
                if (updateProfileCmsContentData12 != null) {
                    UpdateProfileWorkNature updateProfileWorkNature4 = c2196c6.f19889o;
                    if (updateProfileWorkNature4 == null) {
                        kotlin.jvm.internal.j.n(strTnTj785);
                        throw null;
                    }
                    listFilteredJobTitlesFor = UpdateProfileCmsContentDataKt.filteredJobTitlesFor(updateProfileCmsContentData12, updateProfileWorkNature4.getCode());
                } else {
                    listFilteredJobTitlesFor = null;
                }
                if (listFilteredJobTitlesFor == null) {
                    listFilteredJobTitlesFor = C1112C.f9377a;
                }
                if (obj != null) {
                    JobTitle jobTitle2 = (JobTitle) obj;
                    Iterator it13 = listFilteredJobTitlesFor.iterator();
                    while (true) {
                        if (it13.hasNext()) {
                            Object next12 = it13.next();
                            if (kotlin.jvm.internal.j.b(((JobTitle) next12).getCode(), jobTitle2.getCode())) {
                                stringExtra = next12;
                            }
                        }
                    }
                    ((MayaUnderWritingRequirementsFragment) ((InterfaceC2392c) c2196c6.c.get())).Z1(AbstractC2250a.b(new H0(16), stringExtra), listFilteredJobTitlesFor);
                } else {
                    ((MayaUnderWritingRequirementsFragment) ((InterfaceC2392c) c2196c6.c.get())).Z1(strTnTj788, listFilteredJobTitlesFor);
                }
                return Unit.f18162a;
            case 24:
                UpdateProfileSelectionItem updateProfileSelectionItem4 = (UpdateProfileSelectionItem) obj;
                kotlin.jvm.internal.j.g(updateProfileSelectionItem4, strTnTj789);
                ((rc.i) ((MayaUserContactReferenceFragment) this.receiver).Z1()).s(updateProfileSelectionItem4.getCode());
                return Unit.f18162a;
            case 25:
                rc.i iVar = (rc.i) ((oc.c) this.receiver);
                UpdateProfileCmsContentData updateProfileCmsContentData13 = iVar.f19902l;
                if (updateProfileCmsContentData13 == null) {
                    kotlin.jvm.internal.j.n(strTnTj787);
                    throw null;
                }
                List<ContactReferenceRelationship> contactReferenceRelationships = updateProfileCmsContentData13.getContactReferenceRelationships();
                if (contactReferenceRelationships != null) {
                    if (obj == null) {
                        ((MayaUserContactReferenceFragment) ((InterfaceC2393d) iVar.c.get())).e2(strTnTj788, contactReferenceRelationships);
                    } else {
                        ContactReferenceRelationship contactReferenceRelationship = (ContactReferenceRelationship) obj;
                        Iterator it14 = contactReferenceRelationships.iterator();
                        while (true) {
                            if (it14.hasNext()) {
                                Object next13 = it14.next();
                                if (kotlin.jvm.internal.j.b(((ContactReferenceRelationship) next13).getCode(), contactReferenceRelationship.getCode())) {
                                    stringExtra = next13;
                                }
                            }
                        }
                        if (stringExtra != null && (code = ((ContactReferenceRelationship) stringExtra).getCode()) != null) {
                            strTnTj788 = code;
                        }
                        ((MayaUserContactReferenceFragment) ((InterfaceC2393d) iVar.c.get())).e2(strTnTj788, contactReferenceRelationships);
                    }
                }
                return Unit.f18162a;
            case 26:
                UpdateProfileSelectionItem updateProfileSelectionItem5 = (UpdateProfileSelectionItem) obj;
                kotlin.jvm.internal.j.g(updateProfileSelectionItem5, strTnTj789);
                MayaUserProfileUpdateFragment mayaUserProfileUpdateFragment = (MayaUserProfileUpdateFragment) this.receiver;
                UpdateProfileFieldType updateProfileFieldType = mayaUserProfileUpdateFragment.f14266a0;
                int i = updateProfileFieldType != null ? z.f21140a[updateProfileFieldType.ordinal()] : -1;
                if (i == 1) {
                    oc.d dVarH2 = mayaUserProfileUpdateFragment.h2();
                    String code11 = updateProfileSelectionItem5.getCode();
                    rc.m mVar = (rc.m) dVarH2;
                    kotlin.jvm.internal.j.g(code11, strTnTj786);
                    UpdateProfileCmsContentData updateProfileCmsContentData14 = mVar.f19915l;
                    if (updateProfileCmsContentData14 == null) {
                        kotlin.jvm.internal.j.n(strTnTj787);
                        throw null;
                    }
                    List<Gender> genders3 = updateProfileCmsContentData14.getGenders();
                    if (genders3 != null) {
                        Iterator it15 = genders3.iterator();
                        while (true) {
                            if (it15.hasNext()) {
                                Object next14 = it15.next();
                                if (kotlin.jvm.internal.j.b(((Gender) next14).getCode(), code11)) {
                                    stringExtra = next14;
                                }
                            }
                        }
                        Gender gender3 = (Gender) stringExtra;
                        if (gender3 != null) {
                            ((MayaUserProfileUpdateFragment) ((InterfaceC2394e) mVar.c.get())).r2(gender3);
                        }
                    }
                } else if (i == 2) {
                    oc.d dVarH22 = mayaUserProfileUpdateFragment.h2();
                    String code12 = updateProfileSelectionItem5.getCode();
                    rc.m mVar2 = (rc.m) dVarH22;
                    kotlin.jvm.internal.j.g(code12, strTnTj786);
                    UpdateProfileCmsContentData updateProfileCmsContentData15 = mVar2.f19915l;
                    if (updateProfileCmsContentData15 == null) {
                        kotlin.jvm.internal.j.n(strTnTj787);
                        throw null;
                    }
                    List<MaritalStatus> maritalStatuses3 = updateProfileCmsContentData15.getMaritalStatuses();
                    if (maritalStatuses3 != null) {
                        Iterator it16 = maritalStatuses3.iterator();
                        while (true) {
                            if (it16.hasNext()) {
                                Object next15 = it16.next();
                                if (kotlin.jvm.internal.j.b(((MaritalStatus) next15).getCode(), code12)) {
                                    stringExtra = next15;
                                }
                            }
                        }
                        MaritalStatus maritalStatus3 = (MaritalStatus) stringExtra;
                        if (maritalStatus3 != null) {
                            ((MayaUserProfileUpdateFragment) ((InterfaceC2394e) mVar2.c.get())).p2(maritalStatus3);
                        }
                    }
                } else if (i == 3) {
                    oc.d dVarH23 = mayaUserProfileUpdateFragment.h2();
                    String code13 = updateProfileSelectionItem5.getCode();
                    rc.m mVar3 = (rc.m) dVarH23;
                    kotlin.jvm.internal.j.g(code13, strTnTj786);
                    UpdateProfileCmsContentData updateProfileCmsContentData16 = mVar3.f19915l;
                    if (updateProfileCmsContentData16 == null) {
                        kotlin.jvm.internal.j.n(strTnTj787);
                        throw null;
                    }
                    List<EducationalAttainment> educationalAttainments3 = updateProfileCmsContentData16.getEducationalAttainments();
                    if (educationalAttainments3 != null) {
                        Iterator it17 = educationalAttainments3.iterator();
                        while (true) {
                            if (it17.hasNext()) {
                                Object next16 = it17.next();
                                if (kotlin.jvm.internal.j.b(((EducationalAttainment) next16).getCode(), code13)) {
                                    stringExtra = next16;
                                }
                            }
                        }
                        EducationalAttainment educationalAttainment3 = (EducationalAttainment) stringExtra;
                        if (educationalAttainment3 != null) {
                            ((MayaUserProfileUpdateFragment) ((InterfaceC2394e) mVar3.c.get())).q2(educationalAttainment3);
                        }
                    }
                }
                return Unit.f18162a;
            case 27:
                rc.m mVar4 = (rc.m) ((oc.d) this.receiver);
                UpdateProfileCmsContentData updateProfileCmsContentData17 = mVar4.f19915l;
                if (updateProfileCmsContentData17 == null) {
                    kotlin.jvm.internal.j.n(strTnTj787);
                    throw null;
                }
                List<MaritalStatus> maritalStatuses4 = updateProfileCmsContentData17.getMaritalStatuses();
                if (maritalStatuses4 != null) {
                    if (obj == null) {
                        ((MayaUserProfileUpdateFragment) ((InterfaceC2394e) mVar4.c.get())).l2(strTnTj788, maritalStatuses4);
                    } else {
                        MaritalStatus maritalStatus4 = (MaritalStatus) obj;
                        Iterator it18 = maritalStatuses4.iterator();
                        while (true) {
                            if (it18.hasNext()) {
                                Object next17 = it18.next();
                                if (kotlin.jvm.internal.j.b(((MaritalStatus) next17).getCode(), maritalStatus4.getCode())) {
                                    stringExtra = next17;
                                }
                            }
                        }
                        if (stringExtra != null && (code2 = ((MaritalStatus) stringExtra).getCode()) != null) {
                            strTnTj788 = code2;
                        }
                        ((MayaUserProfileUpdateFragment) ((InterfaceC2394e) mVar4.c.get())).l2(strTnTj788, maritalStatuses4);
                    }
                }
                return Unit.f18162a;
            case 28:
                rc.m mVar5 = (rc.m) ((oc.d) this.receiver);
                UpdateProfileCmsContentData updateProfileCmsContentData18 = mVar5.f19915l;
                if (updateProfileCmsContentData18 == null) {
                    kotlin.jvm.internal.j.n(strTnTj787);
                    throw null;
                }
                List<EducationalAttainment> educationalAttainments4 = updateProfileCmsContentData18.getEducationalAttainments();
                if (educationalAttainments4 != null) {
                    if (obj == null) {
                        ((MayaUserProfileUpdateFragment) ((InterfaceC2394e) mVar5.c.get())).m2(strTnTj788, educationalAttainments4);
                    } else {
                        EducationalAttainment educationalAttainment4 = (EducationalAttainment) obj;
                        Iterator it19 = educationalAttainments4.iterator();
                        while (true) {
                            if (it19.hasNext()) {
                                Object next18 = it19.next();
                                if (kotlin.jvm.internal.j.b(((EducationalAttainment) next18).getCode(), educationalAttainment4.getCode())) {
                                    stringExtra = next18;
                                }
                            }
                        }
                        if (stringExtra != null && (code3 = ((EducationalAttainment) stringExtra).getCode()) != null) {
                            strTnTj788 = code3;
                        }
                        ((MayaUserProfileUpdateFragment) ((InterfaceC2394e) mVar5.c.get())).m2(strTnTj788, educationalAttainments4);
                    }
                }
                return Unit.f18162a;
            default:
                rc.m mVar6 = (rc.m) ((oc.d) this.receiver);
                UpdateProfileCmsContentData updateProfileCmsContentData19 = mVar6.f19915l;
                if (updateProfileCmsContentData19 == null) {
                    kotlin.jvm.internal.j.n(strTnTj787);
                    throw null;
                }
                List<Gender> genders4 = updateProfileCmsContentData19.getGenders();
                if (genders4 != null) {
                    if (obj == null) {
                        ((MayaUserProfileUpdateFragment) ((InterfaceC2394e) mVar6.c.get())).n2(strTnTj788, genders4);
                    } else {
                        Gender gender4 = (Gender) obj;
                        Iterator it20 = genders4.iterator();
                        while (true) {
                            if (it20.hasNext()) {
                                Object next19 = it20.next();
                                if (kotlin.jvm.internal.j.b(((Gender) next19).getCode(), gender4.getCode())) {
                                    stringExtra = next19;
                                }
                            }
                        }
                        if (stringExtra != null && (code4 = ((Gender) stringExtra).getCode()) != null) {
                            strTnTj788 = code4;
                        }
                        ((MayaUserProfileUpdateFragment) ((InterfaceC2394e) mVar6.c.get())).n2(strTnTj788, genders4);
                    }
                }
                return Unit.f18162a;
        }
    }
}
