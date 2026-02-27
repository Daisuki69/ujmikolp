package com.paymaya.domain.store;

import Bg.C0118o;
import Bg.C0120q;
import androidx.activity.result.ActivityResult;
import b5.C0910b;
import b5.C0916h;
import com.dynatrace.agent.events.enrichment.EnrichmentPipelineKt;
import com.dynatrace.agent.exitreason.convertor.ExitReasonConverter;
import com.paymaya.domain.model.EducationalAttainment;
import com.paymaya.domain.model.FieldType;
import com.paymaya.domain.model.Gender;
import com.paymaya.domain.model.JobTitle;
import com.paymaya.domain.model.MaritalStatus;
import com.paymaya.domain.model.SecondaryFeature;
import com.paymaya.domain.model.UpdateProfileIncomeSource;
import com.paymaya.domain.model.UpdateProfileWorkNature;
import com.paymaya.domain.model.ValidationResult;
import com.paymaya.mayaui.common.view.dialog.impl.MayaErrorDialogFragment;
import com.paymaya.mayaui.common.view.widget.MayaDropDown;
import com.paymaya.mayaui.common.view.widget.MayaProfileInputLayout;
import com.paymaya.mayaui.forgotpassword.view.activity.impl.MayaForgotPasswordActivity;
import com.paymaya.mayaui.purchasefinancing.view.activity.impl.MayaPurchaseFinancingActivity;
import defpackage.Cause;
import gj.InterfaceC1526a;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.MatchResult;
import zg.AbstractC2573h;
import zj.C2581c;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class H0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11353a;

    public /* synthetic */ H0(int i) {
        this.f11353a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String string;
        UUID uuidNameUUIDFromBytes = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        boolean z4 = false;
        z = false;
        boolean z5 = false;
        z = false;
        boolean z8 = false;
        z4 = false;
        z4 = false;
        int i = 1;
        switch (this.f11353a) {
            case 0:
                SecondaryFeature it = (SecondaryFeature) obj;
                kotlin.jvm.internal.j.g(it, "it");
                return Boolean.valueOf(kotlin.jvm.internal.j.b(it.mId(), "funds"));
            case 1:
                C0910b bannerItemVariables = (C0910b) obj;
                kotlin.jvm.internal.j.g(bannerItemVariables, "bannerItemVariables");
                yk.a.a();
                return Unit.f18162a;
            case 2:
                C0910b bannerItemVariables2 = (C0910b) obj;
                kotlin.jvm.internal.j.g(bannerItemVariables2, "bannerItemVariables");
                yk.a.a();
                return Unit.f18162a;
            case 3:
                MayaProfileInputLayout it2 = (MayaProfileInputLayout) obj;
                kotlin.jvm.internal.j.g(it2, "it");
                if (it2.getVisibility() == 0 && it2.isEnabled() && (it2.getTag() instanceof FieldType)) {
                    z4 = true;
                }
                return Boolean.valueOf(z4);
            case 4:
                MayaProfileInputLayout it3 = (MayaProfileInputLayout) obj;
                kotlin.jvm.internal.j.g(it3, "it");
                Object tag = it3.getTag();
                kotlin.jvm.internal.j.e(tag, "null cannot be cast to non-null type com.paymaya.domain.model.FieldType");
                return new Pair(it3, (FieldType) tag);
            case 5:
                kotlin.jvm.internal.j.g((Pair) obj, "<destruct>");
                return Boolean.valueOf(!kotlin.jvm.internal.j.b((ValidationResult) r11.f18161b, ValidationResult.Success.INSTANCE));
            case 6:
                C0910b bannerItemVariables3 = (C0910b) obj;
                kotlin.jvm.internal.j.g(bannerItemVariables3, "bannerItemVariables");
                yk.a.a();
                return Unit.f18162a;
            case 7:
                C0910b bannerItemVariables4 = (C0910b) obj;
                kotlin.jvm.internal.j.g(bannerItemVariables4, "bannerItemVariables");
                yk.a.a();
                return Unit.f18162a;
            case 8:
                int i4 = MayaForgotPasswordActivity.f12356r;
                kotlin.jvm.internal.j.g((ActivityResult) obj, "it");
                return Unit.f18162a;
            case 9:
                String key = (String) obj;
                kotlin.jvm.internal.j.g(key, "key");
                try {
                    byte[] bytes = key.getBytes(C2581c.f21468b);
                    kotlin.jvm.internal.j.f(bytes, "getBytes(...)");
                    uuidNameUUIDFromBytes = UUID.nameUUIDFromBytes(bytes);
                    break;
                } catch (InternalError unused) {
                    String.valueOf(key.hashCode());
                }
                return (uuidNameUUIDFromBytes == null || (string = uuidNameUUIDFromBytes.toString()) == null) ? String.valueOf(key.hashCode()) : string;
            case 10:
                kotlin.jvm.internal.j.g((MayaErrorDialogFragment) obj, "it");
                return Unit.f18162a;
            case 11:
                MaritalStatus getOrUndefined = (MaritalStatus) obj;
                kotlin.jvm.internal.j.g(getOrUndefined, "$this$getOrUndefined");
                return getOrUndefined.getCode();
            case 12:
                Gender getOrUndefined2 = (Gender) obj;
                kotlin.jvm.internal.j.g(getOrUndefined2, "$this$getOrUndefined");
                return getOrUndefined2.getCode();
            case 13:
                EducationalAttainment getOrUndefined3 = (EducationalAttainment) obj;
                kotlin.jvm.internal.j.g(getOrUndefined3, "$this$getOrUndefined");
                return getOrUndefined3.getCode();
            case 14:
                UpdateProfileIncomeSource getOrUndefined4 = (UpdateProfileIncomeSource) obj;
                kotlin.jvm.internal.j.g(getOrUndefined4, "$this$getOrUndefined");
                return getOrUndefined4.getCode();
            case 15:
                UpdateProfileWorkNature getOrUndefined5 = (UpdateProfileWorkNature) obj;
                kotlin.jvm.internal.j.g(getOrUndefined5, "$this$getOrUndefined");
                return getOrUndefined5.getCode();
            case 16:
                JobTitle getOrUndefined6 = (JobTitle) obj;
                kotlin.jvm.internal.j.g(getOrUndefined6, "$this$getOrUndefined");
                return getOrUndefined6.getCode();
            case 17:
                kotlin.jvm.internal.j.g((FieldType) obj, "it");
                return Boolean.FALSE;
            case 18:
                C0916h interstitialAdVariables = (C0916h) obj;
                kotlin.jvm.internal.j.g(interstitialAdVariables, "interstitialAdVariables");
                yk.a.a();
                return Unit.f18162a;
            case 19:
                C0916h interstitialAdVariables2 = (C0916h) obj;
                kotlin.jvm.internal.j.g(interstitialAdVariables2, "interstitialAdVariables");
                yk.a.a();
                return Unit.f18162a;
            case 20:
                return EnrichmentPipelineKt.applyModifications$lambda$3(obj);
            case 21:
                int i6 = MayaPurchaseFinancingActivity.f13534v;
                kotlin.jvm.internal.j.g((ActivityResult) obj, "it");
                return Unit.f18162a;
            case 22:
                return ExitReasonConverter.extractThreadsInfo$lambda$10((MatchResult) obj);
            case 23:
                return ExitReasonConverter.putMessage$lambda$4((Cause) obj);
            case 24:
                wg.c install = (wg.c) obj;
                kotlin.jvm.internal.j.g(install, "$this$install");
                ok.b bVar = Bg.r.f554a;
                int i10 = 3;
                install.e.f(Jg.f.j, new C0118o(i10, (InterfaceC1526a) (objArr2 == true ? 1 : 0), z4 ? 1 : 0));
                M5.d dVar = Kg.b.f2660k;
                C0120q c0120q = new C0120q(install, null);
                Kg.b bVar2 = install.f;
                bVar2.f(dVar, c0120q);
                bVar2.f(dVar, new C0118o(i10, (InterfaceC1526a) (objArr == true ? 1 : 0), i));
                return Unit.f18162a;
            case 25:
                kotlin.jvm.internal.j.g((AbstractC2573h) obj, "<this>");
                return Unit.f18162a;
            case 26:
                kotlin.jvm.internal.j.g(obj, "<this>");
                return Unit.f18162a;
            case 27:
                MayaDropDown it4 = (MayaDropDown) obj;
                kotlin.jvm.internal.j.g(it4, "it");
                if (it4.getVisibility() == 0 && it4.isEnabled()) {
                    z8 = true;
                }
                return Boolean.valueOf(z8);
            case 28:
                MayaProfileInputLayout it5 = (MayaProfileInputLayout) obj;
                kotlin.jvm.internal.j.g(it5, "it");
                if (it5.getVisibility() == 0 && it5.isEnabled()) {
                    z5 = true;
                }
                return Boolean.valueOf(z5);
            default:
                kotlin.jvm.internal.j.g((Pair) obj, "<destruct>");
                return Boolean.valueOf(!(((ValidationResult) r11.f18161b) instanceof ValidationResult.Success));
        }
    }
}
