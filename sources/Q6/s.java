package Q6;

import N5.C;
import N5.C0489y;
import Xb.A;
import Xb.u;
import Xb.y;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import b3.C0891l;
import b6.C0922a;
import bg.AbstractC0983W;
import cj.C1110A;
import cj.M;
import com.airbnb.lottie.LottieAnimationView;
import com.appsflyer.AppsFlyerConversionListener;
import com.paymaya.PayMayaApplication;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1229s;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.Profile;
import com.paymaya.mayaui.accountlimits.view.fragment.impl.MayaAccountLimitsFragment;
import com.paymaya.mayaui.common.view.activity.impl.MayaSessionExpiredActivity;
import com.paymaya.mayaui.common.view.dialog.impl.MayaErrorDialogFragment;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.common.view.widget.MayaProfileInputLayout;
import com.paymaya.mayaui.login.view.fragment.impl.MayaRegistrationIdentityFragment;
import com.paymaya.mayaui.paybills.view.activity.impl.MayaPayBillsActivity;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaBillersFragment;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaPayBillsConfirmationFragment;
import com.paymaya.mayaui.regv2.view.activity.impl.MayaRegistrationV2Activity;
import com.paymaya.mayaui.regv2.view.fragment.impl.MayaAccountCreationFragment;
import com.paymaya.mayaui.settings.view.fragment.impl.BaseMayaSettingsFragment;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopPageFragment;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopProviderPageProductsListFragment;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopProviderProductsListSearchFragment;
import com.paymaya.ui.common.view.dialog.impl.ShareSaveDialogFragment;
import com.paymaya.ui.qr.view.fragment.impl.QRScannerFragment;
import d3.InterfaceC1330b;
import db.InterfaceC1348a;
import g9.InterfaceC1507b;
import g9.InterfaceC1509d;
import g9.InterfaceC1511f;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import v.AbstractC2329d;
import zj.C2576A;
import zj.x;

/* JADX INFO: loaded from: classes4.dex */
public final class s implements Ch.c, W6.e, W6.d, AppsFlyerConversionListener, Ui.k, Ch.f, InterfaceC1330b, t4.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5293b;

    public /* synthetic */ s(Object obj, int i) {
        this.f5292a = i;
        this.f5293b = obj;
    }

    public static boolean a(R.k kVar, R.k actual) {
        kotlin.jvm.internal.j.g(actual, "actual");
        String str = kVar.f5424d;
        String str2 = kVar.c;
        String str3 = actual.f5424d;
        String str4 = actual.c;
        if (str4 != null && str2 != null) {
            kotlin.jvm.internal.j.d(str3);
            kotlin.jvm.internal.j.d(str);
            return C2576A.z(str3, str, false, 2);
        }
        boolean zA = kVar.a();
        ArrayList arrayList = kVar.e;
        if (!zA || str4 == null) {
            boolean zA2 = kVar.a();
            ArrayList arrayList2 = actual.e;
            if (zA2 && actual.a()) {
                kotlin.jvm.internal.j.d(arrayList2);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : arrayList2) {
                    if (obj instanceof String) {
                        arrayList3.add(obj);
                    }
                }
                Set setZ = C1110A.Z(arrayList3);
                kotlin.jvm.internal.j.d(arrayList);
                ArrayList arrayList4 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (obj2 instanceof String) {
                        arrayList4.add(obj2);
                    }
                }
                if (!arrayList4.isEmpty()) {
                    Iterator it = arrayList4.iterator();
                    while (it.hasNext()) {
                        if (setZ.contains((String) it.next())) {
                            return true;
                        }
                    }
                }
            } else if (actual.a() && str2 != null) {
                kotlin.jvm.internal.j.d(arrayList2);
                ArrayList arrayList5 = new ArrayList();
                for (Object obj3 : arrayList2) {
                    if (obj3 instanceof String) {
                        arrayList5.add(obj3);
                    }
                }
                return C1110A.v(C1110A.Z(arrayList5), str);
            }
        } else {
            kotlin.jvm.internal.j.d(arrayList);
            yj.e eVar = new yj.e(yj.q.h(yj.q.i(C1110A.u(arrayList)), R.l.f5425b));
            while (eVar.hasNext()) {
                String str5 = (String) eVar.next();
                kotlin.jvm.internal.j.d(str3);
                if (C2576A.z(str3, str5, false, 2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean b(ArrayList arrayList, Object obj) {
        if (!(obj instanceof String)) {
            if (!(obj instanceof Number)) {
                if (!(obj instanceof Boolean)) {
                    return false;
                }
                yj.e eVar = new yj.e(yj.q.h(C1110A.u(arrayList), R.l.h));
                while (eVar.hasNext()) {
                    if (kotlin.jvm.internal.j.b((String) eVar.next(), String.valueOf(((Boolean) obj).booleanValue()))) {
                    }
                }
                return false;
            }
            double dDoubleValue = ((Number) obj).doubleValue();
            yj.e eVar2 = new yj.e(yj.q.h(C1110A.u(arrayList), R.l.f));
            while (eVar2.hasNext()) {
                if (((Number) eVar2.next()).doubleValue() == dDoubleValue) {
                }
            }
            yj.e eVar3 = new yj.e(yj.q.h(C1110A.u(arrayList), R.l.f5426g));
            while (eVar3.hasNext()) {
                String lowerCase = C2576A.b0((String) eVar3.next()).toString().toLowerCase(Locale.ROOT);
                kotlin.jvm.internal.j.f(lowerCase, "toLowerCase(...)");
                Double dE = x.e(lowerCase);
                if (dE != null && dE.doubleValue() == dDoubleValue) {
                    return true;
                }
            }
            return false;
        }
        yj.e eVar4 = new yj.e(yj.q.h(C1110A.u(arrayList), R.l.c));
        while (true) {
            if (!eVar4.hasNext()) {
                yj.e eVar5 = new yj.e(yj.q.h(C1110A.u(arrayList), R.l.e));
                while (eVar5.hasNext()) {
                    double dDoubleValue2 = ((Number) eVar5.next()).doubleValue();
                    String lowerCase2 = C2576A.b0((String) obj).toString().toLowerCase(Locale.ROOT);
                    kotlin.jvm.internal.j.f(lowerCase2, "toLowerCase(...)");
                    Double dE2 = x.e(lowerCase2);
                    if (dE2 == null || dDoubleValue2 != dE2.doubleValue()) {
                    }
                }
                return false;
            }
            String str = (String) eVar4.next();
            String lowerCase3 = C2576A.b0((String) obj).toString().toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.j.f(lowerCase3, "toLowerCase(...)");
            if (kotlin.jvm.internal.j.b(str, lowerCase3)) {
                break;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00c0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c1 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean d(R.j r7, R.k r8, R.k r9) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q6.s.d(R.j, R.k, R.k):boolean");
    }

    public static boolean e(R.k kVar, R.k actual) {
        Double dE;
        double dDoubleValue;
        kotlin.jvm.internal.j.g(actual, "actual");
        boolean zA = kVar.a();
        ArrayList arrayList = kVar.e;
        ArrayList arrayList2 = actual.e;
        if (zA && actual.a()) {
            kotlin.jvm.internal.j.d(arrayList);
            HashSet hashSetT = C1110A.T(arrayList);
            kotlin.jvm.internal.j.d(arrayList2);
            return hashSetT.equals(C1110A.T(arrayList2));
        }
        if (actual.a()) {
            kotlin.jvm.internal.j.d(arrayList2);
            return b(arrayList2, kVar.f5422a);
        }
        if (kVar.a()) {
            kotlin.jvm.internal.j.d(arrayList);
            return b(arrayList, actual.f5422a);
        }
        Number number = kVar.f;
        String str = actual.f5424d;
        Number number2 = actual.f;
        if (number != null) {
            if (number2 != null) {
                dDoubleValue = number2.doubleValue();
            } else {
                Double dE2 = str != null ? x.e(str) : null;
                if (dE2 == null) {
                    return false;
                }
                dDoubleValue = dE2.doubleValue();
            }
            return number.doubleValue() == dDoubleValue;
        }
        String str2 = kVar.f5424d;
        if (number2 == null) {
            if (actual.c != null) {
                return kotlin.jvm.internal.j.b(str2, str);
            }
            return false;
        }
        if (str2 == null || (dE = x.e(str2)) == null) {
            return false;
        }
        return number2.doubleValue() == dE.doubleValue();
    }

    public static boolean f(R.k kVar, R.k actual, boolean z4) {
        double dDoubleValue;
        double dDoubleValue2;
        Object objB;
        kotlin.jvm.internal.j.g(actual, "actual");
        Number number = actual.f;
        if (number != null) {
            dDoubleValue = number.doubleValue();
        } else {
            String str = actual.c;
            Double dE = str != null ? x.e(str) : null;
            if (dE == null) {
                return false;
            }
            dDoubleValue = dE.doubleValue();
        }
        List list = kVar.f5423b;
        if (list != null && (objB = C1110A.B(list)) != null) {
            Double dE2 = objB instanceof String ? x.e((String) objB) : objB instanceof Number ? Double.valueOf(((Number) objB).doubleValue()) : null;
            if (dE2 != null) {
                double dDoubleValue3 = dE2.doubleValue();
                return z4 ? dDoubleValue < dDoubleValue3 : dDoubleValue > dDoubleValue3;
            }
        }
        Number number2 = kVar.f;
        if (number2 != null) {
            dDoubleValue2 = number2.doubleValue();
        } else {
            String str2 = kVar.c;
            Double dE3 = str2 != null ? x.e(str2) : null;
            if (dE3 == null) {
                return false;
            }
            dDoubleValue2 = dE3.doubleValue();
        }
        return z4 ? dDoubleValue < dDoubleValue2 : dDoubleValue > dDoubleValue2;
    }

    @Override // Ch.c
    public void accept(Object obj) {
        switch (this.f5292a) {
            case 0:
                io.reactivex.rxjava3.disposables.b it = (io.reactivex.rxjava3.disposables.b) obj;
                kotlin.jvm.internal.j.g(it, "it");
                ((t) this.f5293b).e(it);
                return;
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 10:
            case 11:
            case 16:
            case 21:
            case 24:
            default:
                String text = (String) obj;
                kotlin.jvm.internal.j.g(text, "text");
                MayaShopProviderProductsListSearchFragment mayaShopProviderProductsListSearchFragment = (MayaShopProviderProductsListSearchFragment) this.f5293b;
                mayaShopProviderProductsListSearchFragment.f14095j0 = text;
                if (mayaShopProviderProductsListSearchFragment.f14097l0) {
                    mayaShopProviderProductsListSearchFragment.f14097l0 = false;
                    return;
                } else {
                    mayaShopProviderProductsListSearchFragment.G1().l();
                    return;
                }
            case 4:
                Ze.a it2 = (Ze.a) obj;
                kotlin.jvm.internal.j.g(it2, "it");
                Pc.d dVar = (Pc.d) ((ShareSaveDialogFragment) this.f5293b).p1();
                if (!it2.f6934b) {
                    ShareSaveDialogFragment shareSaveDialogFragment = (ShareSaveDialogFragment) ((Tc.c) dVar.c.get());
                    Toast.makeText(shareSaveDialogFragment.getActivity(), shareSaveDialogFragment.getString(R.string.pma_label_image_not_saved), 0).show();
                    ((Tc.c) dVar.c.get()).dismiss();
                    return;
                } else {
                    String strO1 = ((ShareSaveDialogFragment) ((Tc.c) dVar.c.get())).o1();
                    if (strO1 != null) {
                        ((ShareSaveDialogFragment) ((Tc.c) dVar.c.get())).q1(strO1);
                        return;
                    }
                    return;
                }
            case 7:
                Throwable it3 = (Throwable) obj;
                kotlin.jvm.internal.j.g(it3, "it");
                Xa.b bVar = (Xa.b) this.f5293b;
                PayMayaError payMayaErrorF = bVar.f(it3, true);
                kotlin.jvm.internal.j.f(payMayaErrorF, "mayaErrorHandling(...)");
                C c = ((MayaAccountCreationFragment) ((InterfaceC1348a) bVar.c.get())).f13677V;
                kotlin.jvm.internal.j.d(c);
                ((MayaProfileInputLayout) c.m).getInputEditText().setText("");
                MayaAccountCreationFragment mayaAccountCreationFragment = (MayaAccountCreationFragment) ((InterfaceC1348a) bVar.c.get());
                mayaAccountCreationFragment.getClass();
                if (mayaAccountCreationFragment.isAdded()) {
                    C1229s c1229sH1 = mayaAccountCreationFragment.H1();
                    FragmentActivity fragmentActivityRequireActivity = mayaAccountCreationFragment.requireActivity();
                    kotlin.jvm.internal.j.f(fragmentActivityRequireActivity, "requireActivity(...)");
                    String strE = AbstractC1213b.e(13);
                    kotlin.jvm.internal.j.f(strE, "errorViewed(...)");
                    C1229s.d(c1229sH1, fragmentActivityRequireActivity, strE, mayaAccountCreationFragment.s(), null, null, payMayaErrorF.mSpiel(), M.h(new Pair(EnumC1212a.SCREEN_NAME, "Registration Error (Dialog)"), new Pair(EnumC1212a.ERROR_CODE, String.valueOf(payMayaErrorF.mErrorCode()))), 24);
                }
                eb.d dVar2 = mayaAccountCreationFragment.f13679X;
                if (dVar2 != null) {
                    mayaAccountCreationFragment.getString(R.string.maya_label_that_didnt_load_right);
                    C7.f fVar = new C7.f(16, mayaAccountCreationFragment, payMayaErrorF);
                    MayaErrorDialogFragment mayaErrorDialogFragmentZ = M2.b.Z(0, null, null, null, null, false, payMayaErrorF, null, false, 447);
                    mayaErrorDialogFragmentZ.f11851d0 = new ab.e(fVar, mayaErrorDialogFragmentZ, 1);
                    FragmentManager supportFragmentManager = ((MayaRegistrationV2Activity) dVar2).getSupportFragmentManager();
                    kotlin.jvm.internal.j.f(supportFragmentManager, "getSupportFragmentManager(...)");
                    AbstractC0983W.D(mayaErrorDialogFragmentZ, supportFragmentManager, "error_dialog");
                    return;
                }
                return;
            case 9:
                Throwable it4 = (Throwable) obj;
                kotlin.jvm.internal.j.g(it4, "it");
                Xb.f fVar2 = (Xb.f) this.f5293b;
                PayMayaError payMayaErrorF2 = fVar2.f(it4, false);
                kotlin.jvm.internal.j.f(payMayaErrorF2, "paymayaErrorHandling(...)");
                int iMErrorCode = payMayaErrorF2.mErrorCode();
                String strMSpiel = payMayaErrorF2.mSpiel();
                kotlin.jvm.internal.j.f(strMSpiel, "mSpiel(...)");
                fVar2.o(iMErrorCode, strMSpiel);
                return;
            case 12:
                kotlin.jvm.internal.j.g((List) obj, "it");
                ((MayaShopProviderPageProductsListFragment) ((bc.g) ((Xb.r) this.f5293b).c.get())).f14061v0 = 1;
                return;
            case 13:
                List productsList = (List) obj;
                kotlin.jvm.internal.j.g(productsList, "productsList");
                ((u) this.f5293b).l(productsList);
                return;
            case 14:
                List p02 = (List) obj;
                kotlin.jvm.internal.j.g(p02, "p0");
                ((y) this.f5293b).m(p02);
                return;
            case 15:
                A a8 = (A) this.f5293b;
                PayMayaError payMayaErrorF3 = a8.f((Throwable) obj, false);
                kotlin.jvm.internal.j.f(payMayaErrorF3, "paymayaErrorHandling(...)");
                a8.l(payMayaErrorF3);
                return;
            case 17:
                Profile profile = (Profile) obj;
                kotlin.jvm.internal.j.g(profile, "profile");
                com.paymaya.data.preference.a aVar = ((Z8.c) this.f5293b).e;
                if (aVar.e().isPartnerOnboardingEnabled() && aVar.K()) {
                    String strP = aVar.p();
                    kotlin.jvm.internal.j.f(strP, "getMayaOnboardingPartner(...)");
                    com.paymaya.common.utility.C.s0(aVar, strP, false);
                }
                ((MayaBaseFragment) ((InterfaceC1507b) ((Z8.c) this.f5293b).c.get())).w1();
                ((Z8.c) this.f5293b).r(profile);
                return;
            case 18:
                Z8.f fVar3 = (Z8.f) this.f5293b;
                PayMayaError payMayaErrorF4 = fVar3.f((Throwable) obj, false);
                kotlin.jvm.internal.j.f(payMayaErrorF4, "paymayaErrorHandling(...)");
                y5.s sVar = (InterfaceC1509d) fVar3.c.get();
                C1219h c1219hH = AbstractC2329d.h(12);
                c1219hH.t(EnumC1217f.VALIDATE_PASSWORD);
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                c1219hH.j.put(Constants.REASON, payMayaErrorF4.mSpiel());
                c1219hH.i();
                ((MayaBaseFragment) sVar).A1(c1219hH);
                MayaInputLayout mayaInputLayout = ((MayaRegistrationIdentityFragment) ((InterfaceC1509d) fVar3.c.get())).f12798c0;
                if (mayaInputLayout == null) {
                    kotlin.jvm.internal.j.n("mMayaInputLayoutPassword");
                    throw null;
                }
                mayaInputLayout.getInputEditText().setText("");
                ((MayaRegistrationIdentityFragment) ((InterfaceC1509d) fVar3.c.get())).P1(payMayaErrorF4);
                return;
            case 19:
                Z8.i iVar = (Z8.i) this.f5293b;
                PayMayaError payMayaErrorF5 = iVar.f((Throwable) obj, false);
                kotlin.jvm.internal.j.f(payMayaErrorF5, "paymayaErrorHandling(...)");
                y5.s sVar2 = (InterfaceC1511f) iVar.c.get();
                C1219h c1219hH2 = AbstractC2329d.h(12);
                EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
                c1219hH2.j.put(Constants.REASON, payMayaErrorF5.mSpiel());
                c1219hH2.i();
                ((MayaBaseFragment) sVar2).A1(c1219hH2);
                int iMErrorCode2 = payMayaErrorF5.mErrorCode();
                if (iMErrorCode2 == -22 || iMErrorCode2 == -31 || iMErrorCode2 == -137) {
                    androidx.media3.datasource.cache.c.u(iVar.f6917d.f11330b, "key_registration_mobile_number", "");
                    ((InterfaceC1511f) iVar.c.get()).j0(payMayaErrorF5);
                    return;
                } else if (iMErrorCode2 != -262) {
                    ((InterfaceC1511f) iVar.c.get()).i0(payMayaErrorF5);
                    return;
                } else {
                    androidx.media3.datasource.cache.c.u(iVar.f6917d.f11330b, "key_registration_mobile_number", "");
                    ((InterfaceC1511f) iVar.c.get()).L0(payMayaErrorF5);
                    return;
                }
            case 20:
                Ze.a permission = (Ze.a) obj;
                kotlin.jvm.internal.j.g(permission, "permission");
                Bb.a aVar2 = (Bb.a) this.f5293b;
                if (permission.f6934b) {
                    ((QRScannerFragment) ((ce.d) aVar2.c.get())).u1();
                    return;
                } else {
                    aVar2.getClass();
                    return;
                }
            case 22:
                Throwable throwable = (Throwable) obj;
                kotlin.jvm.internal.j.g(throwable, "throwable");
                C0922a c0922a = (C0922a) this.f5293b;
                PayMayaError payMayaErrorF6 = c0922a.f(throwable, false);
                kotlin.jvm.internal.j.f(payMayaErrorF6, "paymayaErrorHandling(...)");
                y5.s sVar3 = (e6.a) c0922a.c.get();
                C1219h c1219hH3 = AbstractC2329d.h(12);
                EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
                c1219hH3.j.put(Constants.REASON, payMayaErrorF6.mSpiel());
                ((MayaBaseFragment) sVar3).A1(c1219hH3);
                if (!payMayaErrorF6.isSessionTimeout()) {
                    MayaAccountLimitsFragment mayaAccountLimitsFragment = (MayaAccountLimitsFragment) ((e6.a) c0922a.c.get());
                    mayaAccountLimitsFragment.H1();
                    mayaAccountLimitsFragment.I1();
                    C0489y c0489y = mayaAccountLimitsFragment.f11513Z;
                    if (c0489y == null) {
                        kotlin.jvm.internal.j.n("mViewAccountLimitsError");
                        throw null;
                    }
                    c0489y.f4296b.setVisibility(0);
                }
                c0922a.f = false;
                return;
            case 23:
                Throwable throwable2 = (Throwable) obj;
                kotlin.jvm.internal.j.g(throwable2, "throwable");
                PayMayaError payMayaErrorF7 = ((Bb.f) this.f5293b).f(throwable2, true);
                Bb.f fVar4 = (Bb.f) this.f5293b;
                int iMErrorCode3 = payMayaErrorF7.mErrorCode();
                String strMSpiel2 = payMayaErrorF7.mSpiel();
                kotlin.jvm.internal.j.f(strMSpiel2, "mSpiel(...)");
                fVar4.B(iMErrorCode3, strMSpiel2, ((MayaBillersFragment) ((ga.b) fVar4.c.get())).P1());
                ((MayaBillersFragment) ((ga.b) fVar4.c.get())).R1(true);
                return;
            case 25:
                ba.u uVar = (ba.u) this.f5293b;
                PayMayaError payMayaErrorF8 = uVar.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF8, "mayaErrorHandling(...)");
                String strMName = ((MayaPayBillsConfirmationFragment) ((ga.d) uVar.c.get())).G1().mBiller().mName();
                String str = strMName != null ? strMName : "";
                C1219h c1219hH4 = AbstractC2329d.h(12);
                c1219hH4.t(EnumC1217f.RECEIPT);
                c1219hH4.i();
                EnumC1212a enumC1212a4 = EnumC1212a.ACCOUNT_NUMBER;
                c1219hH4.j.put(Constants.REASON, payMayaErrorF8.mSpiel());
                c1219hH4.j.put("biller", str);
                ((MayaBaseFragment) ((ga.d) uVar.c.get())).A1(c1219hH4);
                ha.p pVar = ((MayaPayBillsConfirmationFragment) ((ga.d) uVar.c.get())).f13411e0;
                if (pVar != null) {
                    MayaPayBillsActivity mayaPayBillsActivity = (MayaPayBillsActivity) pVar;
                    if (!mayaPayBillsActivity.X1()) {
                        mayaPayBillsActivity.finish();
                        return;
                    } else {
                        mayaPayBillsActivity.n1();
                        B5.i.j(mayaPayBillsActivity);
                        return;
                    }
                }
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c7  */
    /* JADX WARN: Type inference failed for: r7v0, types: [cj.C] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.ArrayList] */
    @Override // Ch.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object apply(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q6.s.apply(java.lang.Object):java.lang.Object");
    }

    @Override // Ui.k
    public boolean c(Object obj, HashMap map, U8.c cVar) {
        Wi.a aVarA;
        HashSet hashSet = (HashSet) this.f5293b;
        if (hashSet.isEmpty() || !(obj instanceof String) || (aVarA = Wi.a.a((String) obj)) == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (aVarA.equals((Wi.a) it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // aj.InterfaceC0716a
    public Object get() {
        return new C0891l((B2.b) ((d3.c) this.f5293b).f16259b);
    }

    @Override // t4.j
    public void i() {
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onAppOpenAttribution(Map map) {
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onAttributionFailure(String str) {
    }

    @Override // W6.d
    public void onClose() {
        AbstractC1236z.b((MayaSessionExpiredActivity) this.f5293b);
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onConversionDataFail(String str) {
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onConversionDataSuccess(Map map) {
        if (map.containsKey("af_dp") && map.containsKey("is_first_launch") && ((Boolean) map.get("is_first_launch")).booleanValue()) {
            com.paymaya.data.preference.a aVar = ((PayMayaApplication) this.f5293b).f10202b;
            androidx.media3.datasource.cache.c.u(aVar.f11330b, "key_deeplink", (String) map.get("af_dp"));
        }
    }

    @Override // W6.e
    public void onDismiss() {
        ((BaseMayaSettingsFragment) this.f5293b).H1().q();
    }

    @Override // t4.j
    public void onRefresh() {
        MayaShopPageFragment mayaShopPageFragment = (MayaShopPageFragment) this.f5293b;
        mayaShopPageFragment.Q1().k();
        LottieAnimationView lottieAnimationView = mayaShopPageFragment.f14015q0;
        if (lottieAnimationView != null) {
            lottieAnimationView.d();
        } else {
            kotlin.jvm.internal.j.n("mLottieView");
            throw null;
        }
    }

    public s(dc.l mShopV3ProviderLogoViewHolder) {
        this.f5292a = 11;
        kotlin.jvm.internal.j.g(mShopV3ProviderLogoViewHolder, "mShopV3ProviderLogoViewHolder");
        this.f5293b = mShopV3ProviderLogoViewHolder;
    }

    public s(List list) {
        this.f5292a = 6;
        this.f5293b = new HashSet();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Wi.a aVarA = Wi.a.a((String) it.next());
                if (aVarA != null) {
                    ((HashSet) this.f5293b).add(aVarA);
                }
            }
        }
    }
}
