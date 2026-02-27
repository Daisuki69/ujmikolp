package com.squareup.wire.internal;

import D8.E;
import E8.u;
import E8.v;
import N5.C0435a;
import N5.C0450f;
import N5.C0453g;
import N5.C0464l;
import We.s;
import Zd.f;
import a.AbstractC0617a;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.KeyEventDispatcher;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.Navigation;
import androidx.webkit.ProxyConfig;
import androidx.work.WorkInfo;
import com.google.android.gms.internal.ads.AbstractC1173g;
import com.paymaya.R;
import com.paymaya.adkit.presentation.banneradcarousel.view.BannerAdCarousel;
import com.paymaya.common.base.BaseFragment;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.BankTransferV3;
import com.paymaya.domain.model.FavoriteDetails;
import com.paymaya.domain.model.UpdateProfileFieldType;
import com.paymaya.mayaui.banktransfer.view.activity.impl.MayaBankTransferActivity;
import com.paymaya.mayaui.banktransfer.view.fragment.impl.MayaBankTransferConfirmationFragment;
import com.paymaya.mayaui.banktransfer.view.fragment.impl.MayaBankTransferOTPFragment;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.common.view.widget.MayaProfileInputLayout;
import com.paymaya.mayaui.creatorstore.view.activity.impl.MayaCreatorStoreActivity;
import com.paymaya.mayaui.creatorstore.view.fragment.impl.MayaCreatorStoreFragment;
import com.paymaya.mayaui.creatorstore.view.fragment.impl.MayaCreatorStoreIntroductionFragment;
import com.paymaya.mayaui.forgotpassword.view.activity.impl.MayaForgotPasswordActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycErrorDialogFragment;
import com.paymaya.mayaui.login.view.fragment.impl.MayaLoginOTPFragment;
import com.paymaya.mayaui.login.view.fragment.impl.MayaRegistrationIdentityFragment;
import com.paymaya.mayaui.login.view.fragment.impl.MayaVerifyRegistrationFragment;
import com.paymaya.mayaui.merchant.view.activity.impl.MayaDynamicMerchantActivity;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaQRPHMerchantOTPFragment;
import com.paymaya.mayaui.mfa.view.fragment.impl.MayaMultiTypeOtpFragment;
import com.paymaya.mayaui.pushapproval.view.activity.impl.MayaPushApprovalActivity;
import com.paymaya.mayaui.pushapproval.view.fragment.impl.MayaPushApprovalListFragment;
import com.paymaya.mayaui.pushapproval.view.fragment.impl.MayaPushApprovalViewRequestFragment;
import com.paymaya.mayaui.regv2.view.fragment.impl.MayaVerifyRegistrationV2Fragment;
import com.paymaya.mayaui.rekyc.view.activity.impl.ReKycSubmittedActivity;
import com.paymaya.mayaui.rekyc.view.fragment.impl.ReKycSubmittedFragment;
import com.paymaya.mayaui.score.view.activity.impl.MayaScoreActivity;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaUserContactReferenceFragment;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaUserProfileUpdateFragment;
import com.paymaya.ui.ekyc.view.fragment.impl.EKycPhotoCaptureFragment;
import com.paymaya.ui.qr.view.fragment.impl.RequestMoneyFormFragment;
import com.squareup.wire.Message;
import com.squareup.wire.WireField;
import defpackage.AbstractC1414e;
import e2.C1421c;
import io.ktor.utils.io.k;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Set;
import kb.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.j;
import kotlin.reflect.KTypeProjection;
import l9.C1803a;
import lb.InterfaceC1823d;
import n0.e;
import n8.C1934b;
import p7.InterfaceC2015a;
import q6.C2164a;
import q6.C2165b;
import q7.b;
import rc.i;
import s6.InterfaceC2240a;
import sd.g;
import t6.InterfaceC2270a;
import x5.C2467a;
import xj.r;
import y5.l;
import ya.C2516a;
import z2.d;
import z2.h;
import zg.InterfaceC2568c;
import zj.C2576A;
import zj.z;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15519b;

    public /* synthetic */ a(Object obj, int i) {
        this.f15518a = i;
        this.f15519b = obj;
    }

    /* JADX WARN: Type inference failed for: r7v55, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String strA;
        b bVar;
        String strI;
        int i;
        String str;
        Throwable th2;
        int i4;
        String lowerCase;
        float f;
        int i6 = 7;
        int i10 = 6;
        int i11 = 3;
        int i12 = 5;
        int i13 = 0;
        int i14 = 1;
        switch (this.f15518a) {
            case 0:
                return FieldBinding.getBuilderGetter$lambda$3((WireField) this.f15519b, (Message.Builder) obj);
            case 1:
                return FieldBinding.getBuilderGetter$lambda$4((Field) this.f15519b, (Message.Builder) obj);
            case 2:
                return FieldBinding.getInstanceGetter$lambda$6((Method) this.f15519b, (Message) obj);
            case 3:
                return FieldBinding.getInstanceGetter$lambda$7((FieldBinding) this.f15519b, (Message) obj);
            case 4:
                ((Boolean) obj).getClass();
                ((f) ((RequestMoneyFormFragment) this.f15519b).s1()).k();
                return Unit.f18162a;
            case 5:
                MayaVerifyRegistrationV2Fragment mayaVerifyRegistrationV2Fragment = (MayaVerifyRegistrationV2Fragment) this.f15519b;
                Object obj2 = mayaVerifyRegistrationV2Fragment.f13692k0;
                if (obj2 != null) {
                    ((l) obj2).V1(mayaVerifyRegistrationV2Fragment);
                }
                return Unit.f18162a;
            case 6:
                String redirectionUrl = (String) obj;
                int i15 = BannerAdCarousel.f10214o;
                j.g(redirectionUrl, "redirectionUrl");
                C2467a c2467a = AbstractC0617a.f6973b;
                if (c2467a != null) {
                    c2467a.f20932b.k0((Activity) this.f15519b, redirectionUrl);
                }
                return Unit.f18162a;
            case 7:
                E e = (E) this.f15519b;
                int iIntValue = ((Integer) obj).intValue();
                InterfaceC1823d interfaceC1823d = ((ReKycSubmittedFragment) ((c) e.c.get())).f13715W;
                if (interfaceC1823d != null) {
                    ReKycSubmittedActivity reKycSubmittedActivity = (ReKycSubmittedActivity) interfaceC1823d;
                    String strD = AbstractC1236z.d(reKycSubmittedActivity, ReKycSubmittedActivity.class);
                    reKycSubmittedActivity.f13701o = new u(reKycSubmittedActivity, i12);
                    reKycSubmittedActivity.f13702p = new v(reKycSubmittedActivity, i12);
                    String string = reKycSubmittedActivity.getString(R.string.maya_activity_rekyc_submitted_screen_label);
                    j.f(string, "getString(...)");
                    MayaKycErrorDialogFragment mayaKycErrorDialogFragment = new MayaKycErrorDialogFragment();
                    Bundle bundle = new Bundle();
                    bundle.putInt("drawableRes", 2131231472);
                    bundle.putInt("titleRes", R.string.maya_label_that_didnt_load_right);
                    bundle.putInt("actionRes", R.string.maya_label_got_it);
                    bundle.putInt("messageRes", R.string.maya_label_connection_issue_split);
                    bundle.putString("pageSource", string);
                    bundle.putInt("errorCode", iIntValue);
                    mayaKycErrorDialogFragment.setArguments(bundle);
                    mayaKycErrorDialogFragment.show(reKycSubmittedActivity.getSupportFragmentManager(), strD);
                }
                return Unit.f18162a;
            case 8:
                MayaLoginOTPFragment mayaLoginOTPFragment = (MayaLoginOTPFragment) this.f15519b;
                Object obj3 = mayaLoginOTPFragment.f12790k0;
                if (obj3 != null) {
                    ((l) obj3).V1(mayaLoginOTPFragment);
                }
                return Unit.f18162a;
            case 9:
                ((Boolean) obj).getClass();
                MayaRegistrationIdentityFragment mayaRegistrationIdentityFragment = (MayaRegistrationIdentityFragment) this.f15519b;
                MayaInputLayout mayaInputLayout = mayaRegistrationIdentityFragment.f12796a0;
                if (mayaInputLayout != null) {
                    mayaRegistrationIdentityFragment.o1().c(mayaRegistrationIdentityFragment.getActivity(), C1219h.b(AbstractC1213b.g(7), "Set your login details", mayaInputLayout.getInputEditText().getHint().toString(), mayaRegistrationIdentityFragment.f12803h0, mayaRegistrationIdentityFragment.f12804i0, false));
                    return Unit.f18162a;
                }
                j.n("mMayaInputLayoutMobileNumber");
                throw null;
            case 10:
                MayaVerifyRegistrationFragment mayaVerifyRegistrationFragment = (MayaVerifyRegistrationFragment) this.f15519b;
                Object obj4 = mayaVerifyRegistrationFragment.f12828l0;
                if (obj4 != null) {
                    ((l) obj4).V1(mayaVerifyRegistrationFragment);
                }
                return Unit.f18162a;
            case 11:
                Throwable th3 = (Throwable) obj;
                if (th3 != null) {
                    k kVar = (k) this.f15519b;
                    if (!kVar.d()) {
                        kVar.a(th3);
                    }
                }
                return Unit.f18162a;
            case 12:
                ActivityResult result = (ActivityResult) obj;
                int i16 = MayaForgotPasswordActivity.f12356r;
                j.g(result, "result");
                ((C1934b) this.f15519b).invoke(result);
                return Unit.f18162a;
            case 13:
                KTypeProjection it = (KTypeProjection) obj;
                F.a aVar = F.f18178d;
                j.g(it, "it");
                ((F) this.f15519b).getClass();
                r rVar = it.f18204a;
                if (rVar == null) {
                    return ProxyConfig.MATCH_ALL_SCHEMES;
                }
                F f3 = it.f18205b;
                F f7 = AbstractC1414e.u(f3) ? f3 : null;
                String strValueOf = (f7 == null || (strA = f7.a(true)) == null) ? String.valueOf(f3) : strA;
                int i17 = G.f18181a[rVar.ordinal()];
                if (i17 == 1) {
                    return strValueOf;
                }
                if (i17 == 2) {
                    return "in ".concat(strValueOf);
                }
                if (i17 == 3) {
                    return "out ".concat(strValueOf);
                }
                throw new NoWhenBranchMatchedException();
            case 14:
                int i18 = MayaCreatorStoreActivity.f12105q;
                j.g((View) obj, "it");
                MayaCreatorStoreActivity mayaCreatorStoreActivity = (MayaCreatorStoreActivity) this.f15519b;
                C1220i c1220iK1 = mayaCreatorStoreActivity.k1();
                C1219h c1219h = mayaCreatorStoreActivity.f12108p;
                if (c1219h == null) {
                    j.n("analyticsEventWithModule");
                    throw null;
                }
                c1219h.n(17);
                c1219h.t(EnumC1217f.UPGRADE_NOW);
                c1219h.i();
                c1220iK1.c(mayaCreatorStoreActivity, c1219h);
                mayaCreatorStoreActivity.n1().s(mayaCreatorStoreActivity, false);
                return Unit.f18162a;
            case 15:
                EnumC1215d enumC1215d = EnumC1215d.P2M;
                EnumC1216e enumC1216e = EnumC1216e.SUCCESS;
                int i19 = MayaDynamicMerchantActivity.f12840r;
                j.g((View) obj, "it");
                MayaDynamicMerchantActivity mayaDynamicMerchantActivity = (MayaDynamicMerchantActivity) this.f15519b;
                C1220i c1220iK12 = mayaDynamicMerchantActivity.k1();
                C1219h c1219hD = C1219h.d(enumC1215d);
                c1219hD.r(enumC1216e);
                c1219hD.n(17);
                c1219hD.t(EnumC1217f.FINISH);
                c1219hD.i();
                c1220iK12.c(mayaDynamicMerchantActivity, c1219hD);
                mayaDynamicMerchantActivity.n1().q(mayaDynamicMerchantActivity);
                return Unit.f18162a;
            case 16:
                MayaQRPHMerchantOTPFragment mayaQRPHMerchantOTPFragment = (MayaQRPHMerchantOTPFragment) this.f15519b;
                Object obj5 = mayaQRPHMerchantOTPFragment.f12907k0;
                if (obj5 != null) {
                    ((l) obj5).V1(mayaQRPHMerchantOTPFragment);
                }
                return Unit.f18162a;
            case 17:
                BankTransferV3 bankTransferV3 = (BankTransferV3) this.f15519b;
                MayaBankTransferConfirmationFragment it2 = (MayaBankTransferConfirmationFragment) obj;
                int i20 = MayaBankTransferActivity.f11530s;
                j.g(it2, "it");
                j.g(bankTransferV3, "bankTransferV3");
                o6.c cVar = (o6.c) it2.G1();
                InterfaceC2270a interfaceC2270a = ((MayaBankTransferConfirmationFragment) ((InterfaceC2240a) cVar.c.get())).f11547f0;
                FavoriteDetails favoriteDetails = interfaceC2270a != null ? (FavoriteDetails) ((MayaBankTransferActivity) interfaceC2270a).Y1().h : null;
                if (favoriteDetails == null) {
                    MayaBankTransferConfirmationFragment mayaBankTransferConfirmationFragment = (MayaBankTransferConfirmationFragment) ((InterfaceC2240a) cVar.c.get());
                    mayaBankTransferConfirmationFragment.getClass();
                    InterfaceC2270a interfaceC2270a2 = mayaBankTransferConfirmationFragment.f11547f0;
                    if (interfaceC2270a2 != null) {
                        MayaBankTransferActivity mayaBankTransferActivity = (MayaBankTransferActivity) interfaceC2270a2;
                        if (mayaBankTransferActivity.p1().e().isAppEventV2BankTransferEnabled()) {
                            String str2 = mayaBankTransferActivity.f11535r;
                            if (str2 == null) {
                                str2 = "Bank Transfer Confirmation Screen";
                            }
                            C1220i c1220iK13 = mayaBankTransferActivity.k1();
                            C1219h c1219hE = C1219h.e("BANK_TRANSFER_PROCESSING_".concat(AbstractC1173g.G(2)));
                            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                            c1219hE.j.put("source_page", str2);
                            c1220iK13.b(c1219hE);
                        }
                        String string2 = mayaBankTransferActivity.getString(R.string.maya_label_youre_almost_there);
                        j.f(string2, "getString(...)");
                        d.n(R.drawable.maya_ic_processing_white, string2, mayaBankTransferActivity.getString(R.string.maya_format_bank_transfer_processing_description, bankTransferV3.getLastFourDigitAccount()), new Pair(mayaBankTransferActivity.getString(R.string.maya_label_done), new C2164a(mayaBankTransferActivity, i14)), new Pair(mayaBankTransferActivity.getString(R.string.maya_label_view_receipt), new C2165b(mayaBankTransferActivity, bankTransferV3, i14)), null, 96).show(mayaBankTransferActivity.getSupportFragmentManager(), "success_dialog");
                    }
                } else {
                    String strMId = favoriteDetails.mId();
                    if (strMId == null || strMId.length() == 0) {
                        ((MayaBankTransferConfirmationFragment) ((InterfaceC2240a) cVar.c.get())).J1(bankTransferV3, false, true);
                    } else {
                        ((MayaBaseFragment) ((InterfaceC2240a) cVar.c.get())).E1();
                        cVar.e(new Hh.a(new Hh.f(cVar.f.d(favoriteDetails), zh.b.a(), i13).a(new ha.u(i10, cVar, bankTransferV3)).b(new C1421c(22, cVar, bankTransferV3)), new C1803a(cVar, i6), i14).c());
                    }
                }
                return Unit.f18162a;
            case 18:
                MayaCreatorStoreFragment mayaCreatorStoreFragment = (MayaCreatorStoreFragment) this.f15519b;
                String it3 = (String) obj;
                j.g(it3, "it");
                l7.b bVar2 = (l7.b) mayaCreatorStoreFragment.Q1();
                if (it3.equals("Help") && (bVar = ((MayaCreatorStoreFragment) ((InterfaceC2015a) bVar2.c.get())).f12117x0) != null) {
                    MayaCreatorStoreActivity mayaCreatorStoreActivity2 = (MayaCreatorStoreActivity) bVar;
                    mayaCreatorStoreActivity2.n1().v(mayaCreatorStoreActivity2, "https://support.maya.ph/s/article/Why-are-Lucky-Games-not-available-to-me-on-the-Maya-app", mayaCreatorStoreActivity2.getString(R.string.maya_label_help));
                }
                return Unit.f18162a;
            case 19:
                String link = (String) obj;
                j.g(link, "link");
                MayaCreatorStoreIntroductionFragment mayaCreatorStoreIntroductionFragment = (MayaCreatorStoreIntroductionFragment) this.f15519b;
                C0435a c0435a = mayaCreatorStoreIntroductionFragment.f12119U;
                j.d(c0435a);
                ConstraintLayout constraintLayout = (ConstraintLayout) c0435a.f4047b;
                j.f(constraintLayout, "getRoot(...)");
                mayaCreatorStoreIntroductionFragment.m(link, constraintLayout);
                return Unit.f18162a;
            case 20:
                MayaBankTransferOTPFragment mayaBankTransferOTPFragment = (MayaBankTransferOTPFragment) this.f15519b;
                Object obj6 = mayaBankTransferOTPFragment.f11579k0;
                if (obj6 != null) {
                    ((l) obj6).V1(mayaBankTransferOTPFragment);
                }
                return Unit.f18162a;
            case 21:
                wg.c scope = (wg.c) obj;
                j.g(scope, "scope");
                Rg.j jVar = (Rg.j) scope.i.a(Bg.F.f474a, new e(6));
                LinkedHashMap linkedHashMap = (LinkedHashMap) scope.f20791k.e;
                Bg.E e7 = (Bg.E) this.f15519b;
                Object obj7 = linkedHashMap.get(e7.getKey());
                j.d(obj7);
                Object objC = e7.c((Function1) obj7);
                e7.b(objC, scope);
                jVar.f(e7.getKey(), objC);
                return Unit.f18162a;
            case 22:
                ((InterfaceC2568c) this.f15519b).close();
                return Unit.f18162a;
            case 23:
                int i21 = MayaScoreActivity.f13733p;
                j.g((View) obj, "it");
                MayaScoreActivity mayaScoreActivity = (MayaScoreActivity) this.f15519b;
                C1220i c1220iK14 = mayaScoreActivity.k1();
                C1219h c1219hD2 = C1219h.d(EnumC1215d.MAYA_XP);
                c1219hD2.r(EnumC1216e.MAYA_XP);
                c1219hD2.n(17);
                c1219hD2.t(EnumC1217f.UPGRADE_NOW);
                c1219hD2.i();
                c1220iK14.c(mayaScoreActivity, c1219hD2);
                mayaScoreActivity.n1().s(mayaScoreActivity, false);
                return Unit.f18162a;
            case 24:
                MayaMultiTypeOtpFragment mayaMultiTypeOtpFragment = (MayaMultiTypeOtpFragment) this.f15519b;
                Object obj8 = mayaMultiTypeOtpFragment.f12943W;
                if (obj8 != null) {
                    ((l) obj8).V1(mayaMultiTypeOtpFragment);
                }
                return Unit.f18162a;
            case 25:
                C2516a c2516a = (C2516a) this.f15519b;
                ((Integer) obj).getClass();
                MayaPushApprovalListFragment mayaPushApprovalListFragment = (MayaPushApprovalListFragment) ((Da.b) c2516a.c.get());
                C0450f c0450f = mayaPushApprovalListFragment.f13552X;
                j.d(c0450f);
                ((ConstraintLayout) ((C0453g) c0450f.f4088d).f4094b).setVisibility(8);
                mayaPushApprovalListFragment.J1().setVisibility(8);
                C0450f c0450f2 = mayaPushApprovalListFragment.f13552X;
                j.d(c0450f2);
                ((C0464l) c0450f2.f4087b).f4141b.setVisibility(0);
                mayaPushApprovalListFragment.H1().setVisibility(8);
                mayaPushApprovalListFragment.I1().setVisibility(8);
                KeyEventDispatcher.Component componentRequireActivity = mayaPushApprovalListFragment.requireActivity();
                j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.pushapproval.view.activity.IMayaPushApprovalActivityView");
                ((MayaPushApprovalActivity) ((Aa.a) componentRequireActivity)).Z1();
                return Unit.f18162a;
            case 26:
                C2516a c2516a2 = (C2516a) this.f15519b;
                ((Integer) obj).intValue();
                N5.E e10 = ((MayaPushApprovalViewRequestFragment) ((Da.f) c2516a2.c.get())).f13566V;
                j.d(e10);
                ConstraintLayout constraintLayout2 = (ConstraintLayout) e10.f3587d;
                j.f(constraintLayout2, "getRoot(...)");
                Navigation.findNavController(constraintLayout2).navigate(new ActionOnlyNavDirections(R.id.action_mayaPushApprovalViewRequestFragment_to_mayaPushApprovalErrorDialogFragment));
                return Unit.f18162a;
            case 27:
                Pair it4 = (Pair) obj;
                j.g(it4, "it");
                oc.c cVarZ1 = ((MayaUserContactReferenceFragment) this.f15519b).Z1();
                Object obj9 = it4.f18161b;
                UpdateProfileFieldType updateProfileFieldType = (UpdateProfileFieldType) obj9;
                UpdateProfileFieldType updateProfileFieldType2 = UpdateProfileFieldType.MOBILE_NUMBER;
                Object obj10 = it4.f18160a;
                if (obj9 == updateProfileFieldType2) {
                    List list = MayaUserProfileUpdateFragment.f14261f0;
                    strI = "63".concat(S1.r.i((MayaProfileInputLayout) obj10));
                } else {
                    List list2 = MayaUserProfileUpdateFragment.f14261f0;
                    strI = S1.r.i((MayaProfileInputLayout) obj10);
                }
                return new Pair(obj10, ((i) cVarZ1).t(updateProfileFieldType, strI));
            case 28:
                MutablePreferences mutablePreferences = (MutablePreferences) obj;
                h hVar = (h) this.f15519b;
                hVar.getClass();
                long j = 0;
                for (Map.Entry<Preferences.Key<?>, Object> entry : mutablePreferences.asMap().entrySet()) {
                    if (entry.getValue() instanceof Set) {
                        Preferences.Key<?> key = entry.getKey();
                        Set set = (Set) entry.getValue();
                        String strD2 = hVar.d(System.currentTimeMillis());
                        if (set.contains(strD2)) {
                            Object[] objArr = {strD2};
                            HashSet hashSet = new HashSet(1);
                            Object obj11 = objArr[0];
                            Objects.requireNonNull(obj11);
                            if (!hashSet.add(obj11)) {
                                throw new IllegalArgumentException("duplicate element: " + obj11);
                            }
                            mutablePreferences.set(key, Collections.unmodifiableSet(hashSet));
                            j++;
                        } else {
                            mutablePreferences.remove(key);
                        }
                    }
                }
                Preferences.Key key2 = h.c;
                if (j == 0) {
                    mutablePreferences.remove(key2);
                } else {
                    mutablePreferences.set(key2, Long.valueOf(j));
                }
                return null;
            default:
                EKycPhotoCaptureFragment eKycPhotoCaptureFragment = (EKycPhotoCaptureFragment) this.f15519b;
                List faces = (List) obj;
                j.g(faces, "faces");
                sd.h hVarR1 = eKycPhotoCaptureFragment.r1();
                int size = faces.size();
                if (hVarR1.g()) {
                    ((BaseFragment) ((yd.l) hVarR1.c.get())).n1();
                    if (!((EKycPhotoCaptureFragment) ((yd.l) hVarR1.c.get())).u1() && !z.o(((EKycPhotoCaptureFragment) ((yd.l) hVarR1.c.get())).f14583l0, "capture_docs", true) && ((i = hVarR1.f20046d) == 1 || i == 2)) {
                        ((EKycPhotoCaptureFragment) ((yd.l) hVarR1.c.get())).u1();
                        String str3 = ((EKycPhotoCaptureFragment) ((yd.l) hVarR1.c.get())).f14583l0;
                        yk.a.a();
                        if (size == 0) {
                            EKycPhotoCaptureFragment eKycPhotoCaptureFragment2 = (EKycPhotoCaptureFragment) ((yd.l) hVarR1.c.get());
                            TextView textView = eKycPhotoCaptureFragment2.f14567V;
                            if (textView == null) {
                                j.n("mTextViewBlurryImageWarningSpiel");
                                throw null;
                            }
                            textView.setVisibility(0);
                            TextView textView2 = eKycPhotoCaptureFragment2.f14567V;
                            if (textView2 == null) {
                                j.n("mTextViewBlurryImageWarningSpiel");
                                throw null;
                            }
                            textView2.setText(eKycPhotoCaptureFragment2.getString(R.string.pma_label_ekyc_no_face_detected_warning));
                        } else if (size != 1 && size != 2) {
                            EKycPhotoCaptureFragment eKycPhotoCaptureFragment3 = (EKycPhotoCaptureFragment) ((yd.l) hVarR1.c.get());
                            TextView textView3 = eKycPhotoCaptureFragment3.f14567V;
                            if (textView3 == null) {
                                j.n("mTextViewBlurryImageWarningSpiel");
                                throw null;
                            }
                            textView3.setVisibility(0);
                            TextView textView4 = eKycPhotoCaptureFragment3.f14567V;
                            if (textView4 == null) {
                                j.n("mTextViewBlurryImageWarningSpiel");
                                throw null;
                            }
                            textView4.setText(eKycPhotoCaptureFragment3.getString(R.string.pma_label_ekyc_multiple_face_detected_warning));
                            i11 = 5;
                        } else if (!hVarR1.f20047g.e().isIDClassificationEnabled() || (str = ((EKycPhotoCaptureFragment) ((yd.l) hVarR1.c.get())).f14584n0) == null || str.length() == 0) {
                            ((EKycPhotoCaptureFragment) ((yd.l) hVarR1.c.get())).G1();
                            i11 = 4;
                        } else {
                            String str4 = ((EKycPhotoCaptureFragment) ((yd.l) hVarR1.c.get())).f14584n0;
                            List<String> list3 = (List) ((EKycPhotoCaptureFragment) ((yd.l) hVarR1.c.get())).w0.getValue();
                            j.f(list3, "getModelLabelList(...)");
                            for (String str5 : list3) {
                                j.d(str4);
                                j.d(str5);
                                if (C2576A.x(str4, str5, true)) {
                                    EKycPhotoCaptureFragment eKycPhotoCaptureFragment4 = (EKycPhotoCaptureFragment) ((yd.l) hVarR1.c.get());
                                    File file = eKycPhotoCaptureFragment4.f14580i0;
                                    Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(file != null ? file.getAbsolutePath() : null);
                                    com.paymaya.common.utility.G g8 = com.paymaya.common.utility.G.f10414a;
                                    if (bitmapDecodeFile == null) {
                                        th2 = null;
                                        i4 = 8;
                                    } else {
                                        int width = bitmapDecodeFile.getWidth();
                                        int height = bitmapDecodeFile.getHeight();
                                        int i22 = eKycPhotoCaptureFragment4.f14586p0;
                                        th2 = null;
                                        int i23 = eKycPhotoCaptureFragment4.f14587q0;
                                        i4 = 8;
                                        Matrix matrix = new Matrix();
                                        matrix.postScale(i22 / width, i23 / height);
                                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeFile, 0, 0, width, height, matrix, false);
                                        j.f(bitmapCreateBitmap, "createBitmap(...)");
                                        ByteBuffer byteBuffer = eKycPhotoCaptureFragment4.y0;
                                        if (byteBuffer != null) {
                                            byteBuffer.rewind();
                                            bitmapCreateBitmap.getPixels(eKycPhotoCaptureFragment4.f14590v0, 0, bitmapCreateBitmap.getWidth(), 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
                                            int i24 = 0;
                                            for (int i25 = 0; i25 < i22; i25++) {
                                                int i26 = 0;
                                                while (i26 < i23) {
                                                    int i27 = i24 + 1;
                                                    int i28 = eKycPhotoCaptureFragment4.f14590v0[i24];
                                                    ByteBuffer byteBuffer2 = eKycPhotoCaptureFragment4.y0;
                                                    if (byteBuffer2 != null) {
                                                        f = 128.0f;
                                                        byteBuffer2.putFloat((((i28 >> 16) & 255) + WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) / 128.0f);
                                                    } else {
                                                        f = 128.0f;
                                                    }
                                                    ByteBuffer byteBuffer3 = eKycPhotoCaptureFragment4.y0;
                                                    if (byteBuffer3 != null) {
                                                        byteBuffer3.putFloat((((i28 >> 8) & 255) + WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) / f);
                                                    }
                                                    ByteBuffer byteBuffer4 = eKycPhotoCaptureFragment4.y0;
                                                    if (byteBuffer4 != null) {
                                                        byteBuffer4.putFloat(((i28 & 255) + WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) / f);
                                                    }
                                                    i26++;
                                                    i24 = i27;
                                                }
                                            }
                                        }
                                        int size2 = ((List) eKycPhotoCaptureFragment4.w0.getValue()).size();
                                        for (int i29 = 0; i29 < size2; i29++) {
                                            float[] fArr = ((float[][]) eKycPhotoCaptureFragment4.f14561B0.getValue())[0];
                                            fArr[i29] = s.a(((float[][]) eKycPhotoCaptureFragment4.f14561B0.getValue())[0][i29], ((float[][]) eKycPhotoCaptureFragment4.f14561B0.getValue())[0][i29], 0.4f, fArr[i29]);
                                        }
                                        for (int i30 = 0; i30 < size2; i30++) {
                                            ((float[][]) eKycPhotoCaptureFragment4.f14561B0.getValue())[0][i30] = ((float[][]) eKycPhotoCaptureFragment4.f14561B0.getValue())[0][i30];
                                        }
                                        int size3 = ((List) eKycPhotoCaptureFragment4.w0.getValue()).size();
                                        int i31 = 0;
                                        while (true) {
                                            PriorityQueue priorityQueue = eKycPhotoCaptureFragment4.f14563D0;
                                            if (i31 < size3) {
                                                priorityQueue.add(new AbstractMap.SimpleEntry(((List) eKycPhotoCaptureFragment4.w0.getValue()).get(i31), Float.valueOf(((float[][]) eKycPhotoCaptureFragment4.f14561B0.getValue())[0][i31])));
                                                if (priorityQueue.size() > 21) {
                                                    priorityQueue.poll();
                                                }
                                                i31++;
                                            } else {
                                                int size4 = priorityQueue.size();
                                                int i32 = 0;
                                                while (true) {
                                                    float fFloatValue = 0.0f;
                                                    if (i32 < size4) {
                                                        Map.Entry entry2 = (Map.Entry) priorityQueue.poll();
                                                        ((String[]) eKycPhotoCaptureFragment4.f14592z0.getValue())[i32] = entry2 != null ? (String) entry2.getKey() : null;
                                                        String[] strArr = (String[]) eKycPhotoCaptureFragment4.f14560A0.getValue();
                                                        if (entry2 != null) {
                                                            fFloatValue = ((Number) entry2.getValue()).floatValue();
                                                        }
                                                        strArr[i32] = String.format("%4.2f%%", Arrays.copyOf(new Object[]{Float.valueOf(fFloatValue * 100)}, 1));
                                                        i32++;
                                                    } else {
                                                        String str6 = ((String[]) eKycPhotoCaptureFragment4.f14560A0.getValue())[20];
                                                        String str7 = ((String[]) eKycPhotoCaptureFragment4.f14592z0.getValue())[20];
                                                        if (str7 != null) {
                                                            lowerCase = str7.toLowerCase(Locale.ROOT);
                                                            j.f(lowerCase, "toLowerCase(...)");
                                                        } else {
                                                            lowerCase = "";
                                                        }
                                                        eKycPhotoCaptureFragment4.t0 = lowerCase;
                                                        if (str6 != null) {
                                                            String strSubstring = str6.substring(0, str6.length() - 1);
                                                            j.f(strSubstring, "substring(...)");
                                                            fFloatValue = Float.parseFloat(strSubstring);
                                                        }
                                                        eKycPhotoCaptureFragment4.f14589s0 = fFloatValue;
                                                        eKycPhotoCaptureFragment4.r1();
                                                        String idType = eKycPhotoCaptureFragment4.f14584n0;
                                                        String modelLabel = eKycPhotoCaptureFragment4.t0;
                                                        float f10 = eKycPhotoCaptureFragment4.f14589s0;
                                                        j.g(idType, "idType");
                                                        j.g(modelLabel, "modelLabel");
                                                        Locale locale = Locale.ROOT;
                                                        String lowerCase2 = idType.toLowerCase(locale);
                                                        j.f(lowerCase2, "toLowerCase(...)");
                                                        if (!C2576A.z(lowerCase2, modelLabel, false, 2) || f10 < 90.0f) {
                                                            String lowerCase3 = idType.toLowerCase(locale);
                                                            j.f(lowerCase3, "toLowerCase(...)");
                                                            if (C2576A.z(lowerCase3, modelLabel, false, 2) && f10 >= 60.0f) {
                                                                g8 = com.paymaya.common.utility.G.h;
                                                            }
                                                        } else {
                                                            g8 = com.paymaya.common.utility.G.f10417g;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    String str8 = ((EKycPhotoCaptureFragment) ((yd.l) hVarR1.c.get())).f14584n0;
                                    j.f(str8, "getIDType(...)");
                                    Locale locale2 = Locale.ROOT;
                                    String lowerCase4 = str8.toLowerCase(locale2);
                                    j.f(lowerCase4, "toLowerCase(...)");
                                    String str9 = ((EKycPhotoCaptureFragment) ((yd.l) hVarR1.c.get())).t0;
                                    j.f(str9, "getTopIDLabel(...)");
                                    String lowerCase5 = str9.toLowerCase(locale2);
                                    j.f(lowerCase5, "toLowerCase(...)");
                                    String strValueOf2 = String.valueOf(((EKycPhotoCaptureFragment) ((yd.l) hVarR1.c.get())).f14589s0);
                                    ?? r72 = ((EKycPhotoCaptureFragment) ((yd.l) hVarR1.c.get())).f14591x0;
                                    j.f(r72, "getLabelStrictIdTypingMap(...)");
                                    Object obj12 = r72.get(lowerCase4);
                                    if (obj12 == null) {
                                        obj12 = Boolean.FALSE;
                                    }
                                    if (((Boolean) obj12).booleanValue()) {
                                        int i33 = g.f20045a[g8.ordinal()];
                                        if (i33 == 1) {
                                            ((EKycPhotoCaptureFragment) ((yd.l) hVarR1.c.get())).y1(lowerCase4, lowerCase5, strValueOf2);
                                            ((EKycPhotoCaptureFragment) ((yd.l) hVarR1.c.get())).G1();
                                            EKycPhotoCaptureFragment eKycPhotoCaptureFragment5 = (EKycPhotoCaptureFragment) ((yd.l) hVarR1.c.get());
                                            TextView textView5 = eKycPhotoCaptureFragment5.f14574c0;
                                            if (textView5 == null) {
                                                j.n("mTextViewUsePhoto");
                                                throw th2;
                                            }
                                            textView5.setVisibility(0);
                                            TextView textView6 = eKycPhotoCaptureFragment5.f14574c0;
                                            if (textView6 == null) {
                                                j.n("mTextViewUsePhoto");
                                                throw th2;
                                            }
                                            textView6.setEnabled(true);
                                        } else if (i33 != 2) {
                                            if (hVarR1.f20047g.e().isMandatoryIDClassificationEnabled()) {
                                                EKycPhotoCaptureFragment eKycPhotoCaptureFragment6 = (EKycPhotoCaptureFragment) ((yd.l) hVarR1.c.get());
                                                TextView textView7 = eKycPhotoCaptureFragment6.f14574c0;
                                                if (textView7 == null) {
                                                    j.n("mTextViewUsePhoto");
                                                    throw th2;
                                                }
                                                textView7.setVisibility(i4);
                                                TextView textView8 = eKycPhotoCaptureFragment6.f14574c0;
                                                if (textView8 == null) {
                                                    j.n("mTextViewUsePhoto");
                                                    throw th2;
                                                }
                                                textView8.setEnabled(false);
                                            }
                                            EKycPhotoCaptureFragment eKycPhotoCaptureFragment7 = (EKycPhotoCaptureFragment) ((yd.l) hVarR1.c.get());
                                            eKycPhotoCaptureFragment7.getClass();
                                            C1219h c1219h2 = new C1219h();
                                            c1219h2.t(EnumC1217f.ID_PHOTO_MATCHING);
                                            c1219h2.n(12);
                                            EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
                                            c1219h2.j.put("selected_id", lowerCase4);
                                            c1219h2.j.put("detected_id", lowerCase5);
                                            c1219h2.j.put("confidence_score", strValueOf2);
                                            eKycPhotoCaptureFragment7.o1(c1219h2);
                                            EKycPhotoCaptureFragment eKycPhotoCaptureFragment8 = (EKycPhotoCaptureFragment) ((yd.l) hVarR1.c.get());
                                            TextView textView9 = eKycPhotoCaptureFragment8.f14567V;
                                            if (textView9 == null) {
                                                j.n("mTextViewBlurryImageWarningSpiel");
                                                throw th2;
                                            }
                                            textView9.setVisibility(0);
                                            TextView textView10 = eKycPhotoCaptureFragment8.f14567V;
                                            if (textView10 == null) {
                                                j.n("mTextViewBlurryImageWarningSpiel");
                                                throw th2;
                                            }
                                            textView10.setText(eKycPhotoCaptureFragment8.getString(R.string.pma_label_ekyc_id_not_matched, eKycPhotoCaptureFragment8.f14584n0));
                                        } else {
                                            ((EKycPhotoCaptureFragment) ((yd.l) hVarR1.c.get())).y1(lowerCase4, lowerCase5, strValueOf2);
                                            EKycPhotoCaptureFragment eKycPhotoCaptureFragment9 = (EKycPhotoCaptureFragment) ((yd.l) hVarR1.c.get());
                                            TextView textView11 = eKycPhotoCaptureFragment9.f14567V;
                                            if (textView11 == null) {
                                                j.n("mTextViewBlurryImageWarningSpiel");
                                                throw th2;
                                            }
                                            textView11.setVisibility(0);
                                            TextView textView12 = eKycPhotoCaptureFragment9.f14567V;
                                            if (textView12 == null) {
                                                j.n("mTextViewBlurryImageWarningSpiel");
                                                throw th2;
                                            }
                                            textView12.setText(eKycPhotoCaptureFragment9.getString(R.string.pma_label_ekyc_id_low_confidence));
                                            EKycPhotoCaptureFragment eKycPhotoCaptureFragment10 = (EKycPhotoCaptureFragment) ((yd.l) hVarR1.c.get());
                                            TextView textView13 = eKycPhotoCaptureFragment10.f14574c0;
                                            if (textView13 == null) {
                                                j.n("mTextViewUsePhoto");
                                                throw th2;
                                            }
                                            textView13.setVisibility(0);
                                            TextView textView14 = eKycPhotoCaptureFragment10.f14574c0;
                                            if (textView14 == null) {
                                                j.n("mTextViewUsePhoto");
                                                throw th2;
                                            }
                                            textView14.setEnabled(true);
                                        }
                                    } else {
                                        ((EKycPhotoCaptureFragment) ((yd.l) hVarR1.c.get())).G1();
                                    }
                                    i11 = 4;
                                }
                            }
                            ((EKycPhotoCaptureFragment) ((yd.l) hVarR1.c.get())).G1();
                            i11 = 4;
                        }
                        hVarR1.h = i11;
                    }
                }
                return Unit.f18162a;
        }
    }
}
