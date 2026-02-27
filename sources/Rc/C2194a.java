package rc;

import N5.K0;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.paymaya.domain.model.AlternativeLandline;
import com.paymaya.domain.model.AlternativeMobile;
import com.paymaya.domain.model.ContactName;
import com.paymaya.domain.model.EducationDetails;
import com.paymaya.domain.model.EducationalAttainment;
import com.paymaya.domain.model.EmailContact;
import com.paymaya.domain.model.FieldType;
import com.paymaya.domain.model.Gender;
import com.paymaya.domain.model.MaritalStatus;
import com.paymaya.domain.model.MayaUpdateProfileData;
import com.paymaya.domain.model.ProfileGender;
import com.paymaya.domain.model.ProfileMaritalStatus;
import com.paymaya.domain.model.UpdateProfileCmsContentData;
import com.paymaya.domain.model.ValidationResult;
import com.paymaya.domain.model.ValidationRule;
import com.paymaya.domain.store.C1293x0;
import com.paymaya.domain.store.Z0;
import com.paymaya.mayaui.common.view.widget.MayaDropDown;
import com.paymaya.mayaui.common.view.widget.MayaProfileInputLayout;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaPersonalDetailsFragment;
import dOYHB6.tiZVw8.numX49;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import oc.InterfaceC1974a;
import sc.C2251b;
import wc.InterfaceC2390a;
import zj.z;

/* JADX INFO: renamed from: rc.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2194a extends qc.d implements InterfaceC1974a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Y.e f19883k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Z0 f19884l;
    public final C1293x0 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f19885n;

    public C2194a(Y.e eVar, Z0 z02, C1293x0 c1293x0, com.paymaya.data.preference.a aVar) {
        super(eVar, aVar);
        this.f19883k = eVar;
        this.f19884l = z02;
        this.m = c1293x0;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean p(rc.C2194a r5, com.paymaya.domain.model.FieldType r6, java.lang.Object r7) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof com.paymaya.domain.model.FieldType.MiddleName
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L15
            r4 = r6
            com.paymaya.domain.model.FieldType$MiddleName r4 = (com.paymaya.domain.model.FieldType.MiddleName) r4
            boolean r5 = r5.f19885n
            r5 = r5 ^ r1
            boolean r5 = r4.isFieldRequired(r5)
            goto L25
        L15:
            boolean r5 = r6 instanceof com.paymaya.domain.model.FieldType.EmailAddress
            if (r5 == 0) goto L21
            r5 = r6
            com.paymaya.domain.model.FieldType$EmailAddress r5 = (com.paymaya.domain.model.FieldType.EmailAddress) r5
            boolean r5 = r5.isFieldRequired(r1)
            goto L25
        L21:
            boolean r5 = com.paymaya.domain.model.FieldType.isFieldRequired$default(r6, r2, r1, r3)
        L25:
            if (r0 != 0) goto L42
            com.paymaya.domain.model.FieldType$LastName r0 = com.paymaya.domain.model.FieldType.LastName.INSTANCE
            boolean r0 = kotlin.jvm.internal.j.b(r6, r0)
            if (r0 == 0) goto L30
            goto L42
        L30:
            sc.b r6 = sc.C2251b.f20034a
            boolean r6 = r7 instanceof java.lang.String
            if (r6 == 0) goto L3f
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            int r6 = r7.length()
            if (r6 != 0) goto L6c
            goto L41
        L3f:
            if (r7 != 0) goto L6c
        L41:
            goto L6a
        L42:
            boolean r0 = r7 instanceof java.lang.String
            if (r0 == 0) goto L49
            r3 = r7
            java.lang.String r3 = (java.lang.String) r3
        L49:
            if (r3 != 0) goto L51
            java.lang.String r3 = "bFoG"
            java.lang.String r3 = dOYHB6.tiZVw8.numX49.tnTj78(r3)
        L51:
            java.lang.CharSequence r7 = zj.C2576A.b0(r3)
            java.lang.String r7 = r7.toString()
            int r0 = r7.length()
            if (r0 != 0) goto L60
            goto L6a
        L60:
            int r7 = r7.length()
            int r6 = r6.getMinLength()
            if (r7 >= r6) goto L6c
        L6a:
            r6 = r1
            goto L6d
        L6c:
            r6 = r2
        L6d:
            if (r5 == 0) goto L72
            if (r6 == 0) goto L72
            return r1
        L72:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: rc.C2194a.p(rc.a, com.paymaya.domain.model.FieldType, java.lang.Object):boolean");
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        Intent intent;
        super.j();
        FragmentActivity activity = ((MayaPersonalDetailsFragment) ((InterfaceC2390a) this.c.get())).getActivity();
        m((activity == null || (intent = activity.getIntent()) == null) ? null : intent.getDataString());
        k(new Ag.j(this, 21));
    }

    public final void q() {
        if (r()) {
            K0 k02 = (K0) ((MayaPersonalDetailsFragment) ((InterfaceC2390a) this.c.get())).G1();
            k02.f.f();
            k02.h.f();
            k02.f3716g.f();
        }
    }

    public final boolean r() {
        boolean zO;
        String strMFirstName = this.f19884l.a().mFirstName();
        MayaProfileInputLayout mayaProfileInputLayout = ((K0) ((MayaPersonalDetailsFragment) ((InterfaceC2390a) this.c.get())).G1()).f;
        kotlin.jvm.internal.j.f(mayaProfileInputLayout, numX49.tnTj78("bFo3"));
        boolean zO2 = z.o(strMFirstName, jk.b.p(mayaProfileInputLayout), true);
        String strMLastName = this.f19884l.a().mLastName();
        MayaProfileInputLayout mayaProfileInputLayout2 = ((K0) ((MayaPersonalDetailsFragment) ((InterfaceC2390a) this.c.get())).G1()).f3716g;
        kotlin.jvm.internal.j.f(mayaProfileInputLayout2, numX49.tnTj78("bFoy"));
        boolean zO3 = z.o(strMLastName, jk.b.p(mayaProfileInputLayout2), true);
        if (this.f19885n) {
            zO = true;
        } else {
            String strMMiddleName = this.f19884l.a().mMiddleName();
            MayaProfileInputLayout mayaProfileInputLayout3 = ((K0) ((MayaPersonalDetailsFragment) ((InterfaceC2390a) this.c.get())).G1()).h;
            kotlin.jvm.internal.j.f(mayaProfileInputLayout3, numX49.tnTj78("bFov"));
            zO = z.o(strMMiddleName, jk.b.p(mayaProfileInputLayout3), true);
        }
        return zO2 && zO3 && zO;
    }

    public final void s(MayaUpdateProfileData mayaUpdateProfileData) {
        EducationalAttainment educationalAttainment;
        List<EducationalAttainment> educationalAttainments;
        Object next;
        MaritalStatus maritalStatus;
        List<MaritalStatus> maritalStatuses;
        Object next2;
        Gender gender;
        List<Gender> genders;
        Object next3;
        kotlin.jvm.internal.j.g(mayaUpdateProfileData, numX49.tnTj78("bFo7"));
        EmailContact emailContact = mayaUpdateProfileData.getEmailContact();
        String emailAddress = emailContact != null ? emailContact.getEmailAddress() : null;
        ValidationRule validationRuleA = C2251b.a(C2251b.f20034a, l(), FieldType.EmailAddress.INSTANCE, emailAddress == null ? numX49.tnTj78("bFoA") : emailAddress);
        if (emailAddress != null && emailAddress.length() != 0 && validationRuleA == null) {
            ((K0) ((MayaPersonalDetailsFragment) ((InterfaceC2390a) this.c.get())).G1()).e.getInputEditText().setText(emailAddress);
        }
        ProfileGender gender2 = mayaUpdateProfileData.getGender();
        String genderCode = gender2 != null ? gender2.getGenderCode() : null;
        if (genderCode != null && genderCode.length() != 0) {
            UpdateProfileCmsContentData updateProfileCmsContentData = this.h;
            if (updateProfileCmsContentData == null || (genders = updateProfileCmsContentData.getGenders()) == null) {
                gender = null;
            } else {
                Iterator<T> it = genders.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next3 = null;
                        break;
                    } else {
                        next3 = it.next();
                        if (kotlin.jvm.internal.j.b(((Gender) next3).getCode(), genderCode)) {
                            break;
                        }
                    }
                }
                gender = (Gender) next3;
            }
            if (gender != null) {
                ((MayaPersonalDetailsFragment) ((InterfaceC2390a) this.c.get())).d2(gender);
                MayaDropDown mayaDropDown = ((K0) ((MayaPersonalDetailsFragment) ((InterfaceC2390a) this.c.get())).G1()).f3717k;
                mayaDropDown.h.setVisibility(4);
                mayaDropDown.f12041g.setEnabled(false);
                mayaDropDown.i.setEnabled(false);
            }
        }
        ProfileMaritalStatus profileMaritalStatus = mayaUpdateProfileData.getProfileMaritalStatus();
        String classification = profileMaritalStatus != null ? profileMaritalStatus.getClassification() : null;
        if (classification != null && classification.length() != 0) {
            UpdateProfileCmsContentData updateProfileCmsContentData2 = this.h;
            if (updateProfileCmsContentData2 == null || (maritalStatuses = updateProfileCmsContentData2.getMaritalStatuses()) == null) {
                maritalStatus = null;
            } else {
                Iterator<T> it2 = maritalStatuses.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    } else {
                        next2 = it2.next();
                        if (kotlin.jvm.internal.j.b(((MaritalStatus) next2).getCode(), classification)) {
                            break;
                        }
                    }
                }
                maritalStatus = (MaritalStatus) next2;
            }
            if (maritalStatus != null) {
                ((MayaPersonalDetailsFragment) ((InterfaceC2390a) this.c.get())).b2(maritalStatus);
            }
        }
        EducationDetails educationDetails = mayaUpdateProfileData.getEducationDetails();
        String educationalAttainment2 = educationDetails != null ? educationDetails.getEducationalAttainment() : null;
        if (educationalAttainment2 != null && educationalAttainment2.length() != 0) {
            UpdateProfileCmsContentData updateProfileCmsContentData3 = this.h;
            if (updateProfileCmsContentData3 == null || (educationalAttainments = updateProfileCmsContentData3.getEducationalAttainments()) == null) {
                educationalAttainment = null;
            } else {
                Iterator<T> it3 = educationalAttainments.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it3.next();
                        if (kotlin.jvm.internal.j.b(((EducationalAttainment) next).getCode(), educationalAttainment2)) {
                            break;
                        }
                    }
                }
                educationalAttainment = (EducationalAttainment) next;
            }
            if (educationalAttainment != null) {
                ((MayaPersonalDetailsFragment) ((InterfaceC2390a) this.c.get())).c2(educationalAttainment);
            }
        }
        ContactName mothersMaidenName = mayaUpdateProfileData.getMothersMaidenName();
        if (mothersMaidenName != null) {
            MayaPersonalDetailsFragment mayaPersonalDetailsFragment = (MayaPersonalDetailsFragment) ((InterfaceC2390a) this.c.get());
            mayaPersonalDetailsFragment.getClass();
            ((K0) mayaPersonalDetailsFragment.G1()).f.getInputEditText().setText(mothersMaidenName.getFirstName());
            ((K0) mayaPersonalDetailsFragment.G1()).h.getInputEditText().setText(mothersMaidenName.getMiddleName());
            ((K0) mayaPersonalDetailsFragment.G1()).f3716g.getInputEditText().setText(mothersMaidenName.getLastName());
            ((K0) mayaPersonalDetailsFragment.G1()).m.setChecked(kotlin.jvm.internal.j.b(mothersMaidenName.getHasNoMiddleName(), Boolean.TRUE));
        }
        AlternativeMobile alternativeMobile = mayaUpdateProfileData.getAlternativeMobile();
        String mobileNumber = alternativeMobile != null ? alternativeMobile.getMobileNumber() : null;
        AlternativeLandline alternativeLandline = mayaUpdateProfileData.getAlternativeLandline();
        String landlineNumber = alternativeLandline != null ? alternativeLandline.getLandlineNumber() : null;
        if (mobileNumber != null) {
            C2251b c2251b = C2251b.f20034a;
            landlineNumber = C2251b.b(FieldType.AlternativeContactNumber.INSTANCE, mobileNumber);
        } else if (landlineNumber == null) {
            return;
        }
        ValidationRule validationRuleA2 = C2251b.a(C2251b.f20034a, l(), FieldType.AlternativeContactNumber.INSTANCE, landlineNumber);
        if (landlineNumber.length() <= 0 || validationRuleA2 != null) {
            return;
        }
        MayaPersonalDetailsFragment mayaPersonalDetailsFragment2 = (MayaPersonalDetailsFragment) ((InterfaceC2390a) this.c.get());
        mayaPersonalDetailsFragment2.getClass();
        ((K0) mayaPersonalDetailsFragment2.G1()).f3715d.getInputEditText().setText(landlineNumber);
    }

    public final ValidationResult t(FieldType fieldType, Object obj) {
        kotlin.jvm.internal.j.g(fieldType, numX49.tnTj78("bFoY"));
        C2251b c2251b = C2251b.f20034a;
        ValidationResult.RequiredFieldError requiredFieldErrorD = C2251b.d(fieldType, obj, new eb.f(2, this, C2194a.class, numX49.tnTj78("bFoT"), numX49.tnTj78("bFoR"), 0, 2));
        return requiredFieldErrorD == null ? ValidationResult.Success.INSTANCE : requiredFieldErrorD;
    }

    public final ValidationResult u(FieldType fieldType, String str) {
        kotlin.jvm.internal.j.g(fieldType, numX49.tnTj78("bFop"));
        kotlin.jvm.internal.j.g(str, numX49.tnTj78("bFo0"));
        C2251b c2251b = C2251b.f20034a;
        ValidationResult validationResultD = C2251b.d(fieldType, str, new eb.f(2, this, C2194a.class, numX49.tnTj78("bFog"), numX49.tnTj78("bFof"), 0, 3));
        if (validationResultD == null) {
            ValidationResult.DuplicationError duplicationError = null;
            validationResultD = ((fieldType instanceof FieldType.AlternativeContactNumber) && ((Boolean) new eb.f(2, this, C2194a.class, numX49.tnTj78("bFo1"), numX49.tnTj78("bFon"), 0, 4).invoke(fieldType, str)).booleanValue()) ? new ValidationResult.DuplicateContactNumberError(fieldType, null, 2, null) : null;
            if (validationResultD == null) {
                ValidationResult.RegExError regExErrorC = c2251b.c(l(), fieldType, str);
                if (regExErrorC != null) {
                    return regExErrorC;
                }
                if (fieldType.isNameFieldType() && str.length() > 0) {
                    String lowerCase = str.toLowerCase(Locale.ROOT);
                    kotlin.jvm.internal.j.f(lowerCase, numX49.tnTj78("bFox"));
                    if (C2251b.f20035b.b(lowerCase) != null) {
                        duplicationError = new ValidationResult.DuplicationError(null, 1, null);
                    }
                }
                return duplicationError == null ? ValidationResult.Success.INSTANCE : duplicationError;
            }
        }
        return validationResultD;
    }
}
