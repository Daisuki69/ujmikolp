package Bb;

import G6.u;
import G6.v;
import G6.w;
import K8.InterfaceC0288m;
import Kh.B;
import Kh.J;
import Kh.T;
import M8.C0385n0;
import M8.T2;
import N5.r;
import Q6.s;
import a7.C0659t;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.text.HtmlCompat;
import androidx.core.widget.TextViewCompat;
import androidx.recyclerview.widget.DiffUtil;
import bg.AbstractC0983W;
import cj.C1110A;
import cj.C1132s;
import cj.M;
import cj.t;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.material.imageview.ShapeableImageView;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.e0;
import com.paymaya.data.database.repository.C1246j;
import com.paymaya.data.database.repository.x;
import com.paymaya.domain.model.Amount;
import com.paymaya.domain.model.BackUpIdentity;
import com.paymaya.domain.model.Biller;
import com.paymaya.domain.model.BillerCategory;
import com.paymaya.domain.model.Contact;
import com.paymaya.domain.model.ContactHeaderModel;
import com.paymaya.domain.model.ContactListItem;
import com.paymaya.domain.model.ContactModel;
import com.paymaya.domain.model.CreateChallengeRequest;
import com.paymaya.domain.model.CreateChallengeResponse;
import com.paymaya.domain.model.CreditAgreement;
import com.paymaya.domain.model.Decoration;
import com.paymaya.domain.model.MfaMeta;
import com.paymaya.domain.model.OpenMfaMeta;
import com.paymaya.domain.model.Operator;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.PurchasedTicket;
import com.paymaya.domain.model.QRPHMerchantPaymentRequest;
import com.paymaya.domain.model.Route;
import com.paymaya.domain.model.ShopProvider;
import com.paymaya.domain.model.ThirdPartyMerchantWebViewParameters;
import com.paymaya.domain.model.UserActivity;
import com.paymaya.domain.store.A0;
import com.paymaya.domain.store.C1258f0;
import com.paymaya.domain.store.C1265j;
import com.paymaya.domain.store.C1266j0;
import com.paymaya.domain.store.C1268k0;
import com.paymaya.domain.store.C1270l0;
import com.paymaya.domain.store.C1273n;
import com.paymaya.domain.store.C1293x0;
import com.paymaya.domain.store.E;
import com.paymaya.domain.store.E0;
import com.paymaya.domain.store.G0;
import com.paymaya.domain.store.K;
import com.paymaya.domain.store.L;
import com.paymaya.domain.store.P0;
import com.paymaya.domain.store.W0;
import com.paymaya.domain.store.Z;
import com.paymaya.domain.store.d1;
import com.paymaya.mayaui.common.view.activity.impl.MayaAnimatedFullScreenActivity;
import com.paymaya.mayaui.common.view.activity.impl.MayaSessionExpiredActivity;
import com.paymaya.mayaui.common.view.fragment.impl.MayaContactsSelectionFragment;
import com.paymaya.mayaui.common.view.fragment.impl.MayaWebLoadingFragment;
import com.paymaya.mayaui.common.view.widget.MayaSectionIndexFastScroller;
import com.paymaya.mayaui.inbox.view.activity.impl.MayaInboxV2Activity;
import com.paymaya.mayaui.inbox.view.fragment.impl.MayaInboxFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycDnfbpWhyNeededBottomSheetDialogFragment;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaQRPHDynamicMerchantPaymentFragment;
import com.paymaya.mayaui.mfa.view.activity.impl.MayaMfaActivity;
import com.paymaya.mayaui.mfa.view.fragment.impl.MayaMultiTypeMfaInitialFragment;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaBillersFragment;
import com.paymaya.mayaui.rekyc.view.activity.impl.ReKycSubmittedActivity;
import com.paymaya.mayaui.rekyc.view.fragment.impl.ReKycSubmittedFragment;
import com.paymaya.mayaui.rewardscatalog.view.fragment.MayaRewardsCatalogFragment;
import com.paymaya.mayaui.sendmoney.view.fragment.impl.MayaSendMoneyDecorationPreviewFragment;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopProviderPageFragment;
import com.paymaya.mayaui.travel.view.activity.impl.MayaTravelActivity;
import com.paymaya.mayaui.travel.view.fragment.impl.MayaTravelHomeFragment;
import com.paymaya.mayaui.travel.view.fragment.impl.MayaTravelRouteSelectionFragment;
import com.paymaya.mayaui.travel.view.widget.MayaTravelViewDataSelection;
import com.paymaya.mayaui.xp.view.fragment.MayaXpEntryFragment;
import com.paymaya.ui.mayacredit.view.fragment.impl.MayaCreditSettingsFragment;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import d4.AbstractC1331a;
import ea.C1434a;
import hb.InterfaceC1559b;
import hc.InterfaceC1560a;
import ic.C1599c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Pair;
import l9.C1803a;
import o1.AbstractC1955a;
import oi.C1983a;
import pb.InterfaceC2031a;
import qb.C2168a;
import w.C2360b;
import y5.AbstractC2509a;
import yb.C2518b;
import zj.C2576A;
import zj.C2578C;
import zj.z;

/* JADX INFO: loaded from: classes4.dex */
public class f extends AbstractC2509a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f399d;
    public Object e;

    public /* synthetic */ f(int i) {
        this.f399d = i;
    }

    public void A(List billersList) {
        char cC0;
        kotlin.jvm.internal.j.g(billersList, "billersList");
        if (billersList.isEmpty()) {
            return;
        }
        ((MayaBillersFragment) ((ga.b) this.c.get())).L1();
        ga.b bVar = (ga.b) this.c.get();
        ArrayList arrayList = new ArrayList();
        List listQ = C1110A.Q(new ba.i(), billersList);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : listQ) {
            String strMName = ((Biller) obj).mName();
            if (strMName != null) {
                Locale locale = Locale.getDefault();
                kotlin.jvm.internal.j.f(locale, "getDefault(...)");
                String upperCase = strMName.toUpperCase(locale);
                kotlin.jvm.internal.j.f(upperCase, "toUpperCase(...)");
                cC0 = C2578C.c0(upperCase);
            } else {
                cC0 = '.';
            }
            Character chValueOf = Character.valueOf(cC0);
            Object arrayList2 = linkedHashMap.get(chValueOf);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(chValueOf, arrayList2);
            }
            ((List) arrayList2).add(obj);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            char cCharValue = ((Character) entry.getKey()).charValue();
            List list = (List) entry.getValue();
            String strValueOf = String.valueOf(cCharValue);
            Locale locale2 = Locale.getDefault();
            kotlin.jvm.internal.j.f(locale2, "getDefault(...)");
            String upperCase2 = strValueOf.toUpperCase(locale2);
            kotlin.jvm.internal.j.f(upperCase2, "toUpperCase(...)");
            arrayList.add(new ea.b(upperCase2));
            List list2 = list;
            ArrayList arrayList3 = new ArrayList(t.l(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList3.add(new ea.c((Biller) it.next()));
            }
            arrayList.addAll(arrayList3);
            arrayList.add(C1434a.f16608b);
        }
        MayaBillersFragment mayaBillersFragment = (MayaBillersFragment) bVar;
        mayaBillersFragment.getClass();
        ea.l lVar = mayaBillersFragment.u0;
        if (lVar == null) {
            kotlin.jvm.internal.j.n("mBillersListAdapter");
            throw null;
        }
        lVar.c = arrayList;
        lVar.submitList(arrayList);
        ((MayaBillersFragment) ((ga.b) this.c.get())).R1(false);
    }

    public void B(int i, String str, BillerCategory billerCategory) {
        if (((MayaBillersFragment) ((ga.b) this.c.get())).t1().e().isBillsPayEventsV2Enabled()) {
            Map mapH = M.h(new Pair(EnumC1212a.CATEGORY_SLUG, billerCategory.mSlug()), new Pair(EnumC1212a.CATEGORY_NAME, billerCategory.mName()));
            MayaBillersFragment mayaBillersFragment = (MayaBillersFragment) ((ga.b) this.c.get());
            mayaBillersFragment.getClass();
            C1219h c1219hE = C1219h.e("BILLS_PAY_ERROR_SCREEN");
            String strValueOf = String.valueOf(i);
            HashMap map = c1219hE.j;
            map.put(StateEvent.Name.ERROR_CODE, strValueOf);
            map.put("error_reason", str);
            map.put("page", "Category");
            for (Map.Entry entry : mapH.entrySet()) {
                c1219hE.f((EnumC1212a) entry.getKey(), (String) entry.getValue());
            }
            mayaBillersFragment.o1().b(c1219hE);
        }
    }

    public void C(Amount amount) {
        String strMValue;
        if (amount == null || (strMValue = amount.mValue()) == null || !(!C2576A.H(strMValue))) {
            TextView textView = ((MayaSendMoneyDecorationPreviewFragment) ((Fb.b) this.c.get())).f13769a0;
            if (textView != null) {
                textView.setText("PHP 0.00");
                return;
            } else {
                kotlin.jvm.internal.j.n("mTextViewAmount");
                throw null;
            }
        }
        Fb.b bVar = (Fb.b) this.c.get();
        String currencyFormattedValue = amount.getCurrencyFormattedValue();
        TextView textView2 = ((MayaSendMoneyDecorationPreviewFragment) bVar).f13769a0;
        if (textView2 != null) {
            textView2.setText(currencyFormattedValue);
        } else {
            kotlin.jvm.internal.j.n("mTextViewAmount");
            throw null;
        }
    }

    public void D(String str) {
        Fb.b bVar = (Fb.b) this.c.get();
        String strT = str != null ? z.t(str, Global.NEWLINE, "<br/>") : "";
        MayaSendMoneyDecorationPreviewFragment mayaSendMoneyDecorationPreviewFragment = (MayaSendMoneyDecorationPreviewFragment) bVar;
        mayaSendMoneyDecorationPreviewFragment.getClass();
        TextView textView = mayaSendMoneyDecorationPreviewFragment.f13768Z;
        if (textView != null) {
            textView.setText(HtmlCompat.fromHtml(strT, 0));
        } else {
            kotlin.jvm.internal.j.n("mTextViewMessage");
            throw null;
        }
    }

    public void E(List routes) {
        kotlin.jvm.internal.j.g(routes, "routes");
        List list = routes;
        ArrayList arrayList = new ArrayList(t.l(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new mc.d((Route) it.next()));
        }
        MayaTravelRouteSelectionFragment mayaTravelRouteSelectionFragment = (MayaTravelRouteSelectionFragment) ((jc.e) this.c.get());
        mayaTravelRouteSelectionFragment.getClass();
        C1599c c1599c = mayaTravelRouteSelectionFragment.f14220q0;
        if (c1599c != null) {
            c1599c.e(arrayList);
        }
    }

    public void F(Decoration decoration) {
        Object next;
        int i = 2;
        int i4 = 0;
        String mId = decoration != null ? decoration.getMId() : null;
        String mImageUrl = decoration != null ? decoration.getMImageUrl() : null;
        if (mImageUrl != null && !C2576A.H(mImageUrl)) {
            ((MayaSendMoneyDecorationPreviewFragment) ((Fb.b) this.c.get())).G1(mImageUrl);
            ((MayaSendMoneyDecorationPreviewFragment) ((Fb.b) this.c.get())).I1(mId);
            return;
        }
        if (mId == null || C2576A.H(mId)) {
            ((MayaSendMoneyDecorationPreviewFragment) ((Fb.b) this.c.get())).H1();
            return;
        }
        Cursor cursorQuery = ((E) this.e).c.f11316a.f2811a.query(String.format("SELECT * FROM %1$s WHERE %2$s = 0 ORDER BY %3$s ASC, %4$s DESC", Arrays.copyOf(new Object[]{"decoration", "hidden", "priority", "updated_at"}, 4)));
        kotlin.jvm.internal.j.d(cursorQuery);
        Iterator it = com.paymaya.data.database.repository.n.a(cursorQuery).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (kotlin.jvm.internal.j.b(((Decoration) next).getMId(), mId)) {
                    break;
                }
            }
        }
        Decoration decoration2 = (Decoration) next;
        String mImageUrl2 = decoration2 != null ? decoration2.getMImageUrl() : null;
        if (mImageUrl2 != null && !C2576A.H(mImageUrl2)) {
            ((MayaSendMoneyDecorationPreviewFragment) ((Fb.b) this.c.get())).G1(mImageUrl2);
            ((MayaSendMoneyDecorationPreviewFragment) ((Fb.b) this.c.get())).I1(decoration2.getMId());
            return;
        }
        E e = (E) this.e;
        e.getClass();
        Ah.p<Decoration> decorationById = e.f11345b.getDecorationById(mId, T2.s());
        kotlin.jvm.internal.j.f(decorationById, "getDecorationById(...)");
        e(new Lh.d(new Lh.d(new Lh.h(decorationById, zh.b.a(), 0), new A5.l(this, 7), i), new C2360b(this, 8), i4).e());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // y5.AbstractC2509a
    public void j() {
        int i = 4;
        int i4 = 2;
        int i6 = 1;
        int i10 = 0;
        switch (this.f399d) {
            case 0:
                super.j();
                Bundle arguments = ((MayaSendMoneyDecorationPreviewFragment) ((Fb.b) this.c.get())).getArguments();
                UserActivity userActivity = arguments != null ? (UserActivity) arguments.getParcelable("user_activity") : null;
                if (userActivity != null) {
                    F(userActivity.mDecoration());
                    C(userActivity.mAmount());
                    D(userActivity.mMessage());
                    Group group = ((MayaSendMoneyDecorationPreviewFragment) ((Fb.b) this.c.get())).f13765W;
                    if (group != null) {
                        group.setVisibility(8);
                        return;
                    } else {
                        kotlin.jvm.internal.j.n("mConstraintGroupThemeDesignSelection");
                        throw null;
                    }
                }
                Bundle arguments2 = ((MayaSendMoneyDecorationPreviewFragment) ((Fb.b) this.c.get())).getArguments();
                F(arguments2 != null ? (Decoration) arguments2.getParcelable("decoration") : null);
                Bundle arguments3 = ((MayaSendMoneyDecorationPreviewFragment) ((Fb.b) this.c.get())).getArguments();
                C(arguments3 != null ? (Amount) arguments3.getParcelable("amount") : null);
                Bundle arguments4 = ((MayaSendMoneyDecorationPreviewFragment) ((Fb.b) this.c.get())).getArguments();
                D(arguments4 != null ? arguments4.getString("message") : null);
                Bundle arguments5 = ((MayaSendMoneyDecorationPreviewFragment) ((Fb.b) this.c.get())).getArguments();
                if (arguments5 == null || !arguments5.getBoolean("show_selection", false)) {
                    Group group2 = ((MayaSendMoneyDecorationPreviewFragment) ((Fb.b) this.c.get())).f13765W;
                    if (group2 != null) {
                        group2.setVisibility(8);
                        return;
                    } else {
                        kotlin.jvm.internal.j.n("mConstraintGroupThemeDesignSelection");
                        throw null;
                    }
                }
                Group group3 = ((MayaSendMoneyDecorationPreviewFragment) ((Fb.b) this.c.get())).f13765W;
                if (group3 == null) {
                    kotlin.jvm.internal.j.n("mConstraintGroupThemeDesignSelection");
                    throw null;
                }
                group3.setVisibility(0);
                Fb.b bVar = (Fb.b) this.c.get();
                Bundle arguments6 = ((MayaSendMoneyDecorationPreviewFragment) ((Fb.b) this.c.get())).getArguments();
                ((MayaSendMoneyDecorationPreviewFragment) bVar).f13774f0 = arguments6 != null ? (Decoration) arguments6.getParcelable("decoration") : null;
                Cursor cursorQuery = ((E) this.e).c.f11316a.f2811a.query(String.format("SELECT * FROM %1$s WHERE %2$s = 0 ORDER BY %3$s ASC, %4$s DESC", Arrays.copyOf(new Object[]{"decoration", "hidden", "priority", "updated_at"}, 4)));
                kotlin.jvm.internal.j.d(cursorQuery);
                List decorations = com.paymaya.data.database.repository.n.a(cursorQuery);
                kotlin.jvm.internal.j.g(decorations, "decorations");
                if (decorations.isEmpty()) {
                    return;
                }
                MayaSendMoneyDecorationPreviewFragment mayaSendMoneyDecorationPreviewFragment = (MayaSendMoneyDecorationPreviewFragment) ((Fb.b) this.c.get());
                mayaSendMoneyDecorationPreviewFragment.getClass();
                C2518b c2518b = mayaSendMoneyDecorationPreviewFragment.f13772d0;
                if (c2518b == null) {
                    kotlin.jvm.internal.j.n("mMayaSendMoneyDecorationAdapter");
                    throw null;
                }
                c2518b.c = decorations;
                c2518b.notifyDataSetChanged();
                Fb.b bVar2 = (Fb.b) this.c.get();
                Decoration decoration = ((MayaSendMoneyDecorationPreviewFragment) ((Fb.b) this.c.get())).f13774f0;
                MayaSendMoneyDecorationPreviewFragment mayaSendMoneyDecorationPreviewFragment2 = (MayaSendMoneyDecorationPreviewFragment) bVar2;
                C2518b c2518b2 = mayaSendMoneyDecorationPreviewFragment2.f13772d0;
                if (c2518b2 == null) {
                    kotlin.jvm.internal.j.n("mMayaSendMoneyDecorationAdapter");
                    throw null;
                }
                c2518b2.e(decoration);
                Gb.c cVar = mayaSendMoneyDecorationPreviewFragment2.f13771c0;
                if (cVar != null) {
                    cVar.y0(decoration);
                    return;
                }
                return;
            case 1:
                super.j();
                String strA = ((C0385n0) ((MayaKycDnfbpWhyNeededBottomSheetDialogFragment) ((InterfaceC0288m) this.c.get())).f12514W.getValue()).a();
                kotlin.jvm.internal.j.f(strA, "getSourceKey(...)");
                String strA2 = "";
                String strA3 = strA.equals("AMLC") ? ((e0) this.e).a(R.string.maya_kyc_dnfbp_almc_why_needed_header) : strA.equals("SSNE") ? ((e0) this.e).a(R.string.maya_kyc_dnfbp_ssne_why_needed_header) : "";
                MayaKycDnfbpWhyNeededBottomSheetDialogFragment mayaKycDnfbpWhyNeededBottomSheetDialogFragment = (MayaKycDnfbpWhyNeededBottomSheetDialogFragment) ((InterfaceC0288m) this.c.get());
                mayaKycDnfbpWhyNeededBottomSheetDialogFragment.getClass();
                ((r) mayaKycDnfbpWhyNeededBottomSheetDialogFragment.s1()).f4192d.setText(strA3);
                String strA4 = ((C0385n0) ((MayaKycDnfbpWhyNeededBottomSheetDialogFragment) ((InterfaceC0288m) this.c.get())).f12514W.getValue()).a();
                kotlin.jvm.internal.j.f(strA4, "getSourceKey(...)");
                if (strA4.equals("AMLC")) {
                    strA2 = ((e0) this.e).a(R.string.maya_kyc_dnfbp_almc_why_needed_description);
                } else if (strA4.equals("SSNE")) {
                    strA2 = ((e0) this.e).a(R.string.maya_kyc_dnfbp_ssne_why_needed_description);
                }
                MayaKycDnfbpWhyNeededBottomSheetDialogFragment mayaKycDnfbpWhyNeededBottomSheetDialogFragment2 = (MayaKycDnfbpWhyNeededBottomSheetDialogFragment) ((InterfaceC0288m) this.c.get());
                mayaKycDnfbpWhyNeededBottomSheetDialogFragment2.getClass();
                ((r) mayaKycDnfbpWhyNeededBottomSheetDialogFragment2.s1()).c.setText(strA2);
                return;
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
            case 9:
            case 11:
            case 13:
            case 21:
            case 23:
            default:
                super.j();
                return;
            case 4:
                super.j();
                r();
                return;
            case 8:
                super.j();
                ((MayaContactsSelectionFragment) ((X6.c) this.c.get())).O1();
                n();
                return;
            case 10:
                super.j();
                p();
                return;
            case 12:
                super.j();
                ((Sd.c) this.c.get()).getClass();
                BackUpIdentity backUpIdentityA = ((C1265j) this.e).a();
                if (backUpIdentityA == null) {
                    TextView textView = ((MayaCreditSettingsFragment) ((Sd.c) this.c.get())).f14649T;
                    if (textView == null) {
                        kotlin.jvm.internal.j.n("mTextViewBillingEmail");
                        throw null;
                    }
                    textView.setVisibility(8);
                    ImageView imageView = ((MayaCreditSettingsFragment) ((Sd.c) this.c.get())).f14652W;
                    if (imageView == null) {
                        kotlin.jvm.internal.j.n("mImageViewVerified");
                        throw null;
                    }
                    imageView.setVisibility(8);
                    TextView textView2 = ((MayaCreditSettingsFragment) ((Sd.c) this.c.get())).f14653X;
                    if (textView2 != null) {
                        textView2.setVisibility(0);
                        return;
                    } else {
                        kotlin.jvm.internal.j.n("mTextViewNoEmail");
                        throw null;
                    }
                }
                if (backUpIdentityA.isVerifiedEmail()) {
                    ImageView imageView2 = ((MayaCreditSettingsFragment) ((Sd.c) this.c.get())).f14652W;
                    if (imageView2 == null) {
                        kotlin.jvm.internal.j.n("mImageViewVerified");
                        throw null;
                    }
                    imageView2.setVisibility(0);
                } else {
                    ImageView imageView3 = ((MayaCreditSettingsFragment) ((Sd.c) this.c.get())).f14652W;
                    if (imageView3 == null) {
                        kotlin.jvm.internal.j.n("mImageViewVerified");
                        throw null;
                    }
                    imageView3.setVisibility(8);
                }
                TextView textView3 = ((MayaCreditSettingsFragment) ((Sd.c) this.c.get())).f14649T;
                if (textView3 == null) {
                    kotlin.jvm.internal.j.n("mTextViewBillingEmail");
                    throw null;
                }
                textView3.setVisibility(0);
                TextView textView4 = ((MayaCreditSettingsFragment) ((Sd.c) this.c.get())).f14653X;
                if (textView4 == null) {
                    kotlin.jvm.internal.j.n("mTextViewNoEmail");
                    throw null;
                }
                textView4.setVisibility(8);
                Sd.c cVar2 = (Sd.c) this.c.get();
                String strMValue = backUpIdentityA.mValue();
                kotlin.jvm.internal.j.f(strMValue, "mValue(...)");
                MayaCreditSettingsFragment mayaCreditSettingsFragment = (MayaCreditSettingsFragment) cVar2;
                mayaCreditSettingsFragment.getClass();
                TextView textView5 = mayaCreditSettingsFragment.f14649T;
                if (textView5 != null) {
                    textView5.setText(strMValue);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mTextViewBillingEmail");
                    throw null;
                }
            case 14:
                super.j();
                t();
                return;
            case 15:
                super.j();
                BillerCategory billerCategoryP1 = ((MayaBillersFragment) ((ga.b) this.c.get())).P1();
                ga.b bVar3 = (ga.b) this.c.get();
                String strMName = billerCategoryP1.mName();
                kotlin.jvm.internal.j.f(strMName, "mName(...)");
                MayaBillersFragment mayaBillersFragment = (MayaBillersFragment) bVar3;
                mayaBillersFragment.getClass();
                mayaBillersFragment.w0 = strMName;
                ((MayaBillersFragment) ((ga.b) this.c.get())).R1(false);
                C1273n c1273n = (C1273n) this.e;
                String strMSlug = ((MayaBillersFragment) ((ga.b) this.c.get())).P1().mSlug();
                c1273n.getClass();
                M5.b bVar4 = new M5.b(0);
                bVar4.f3082b = strMSlug;
                C1246j c1246j = c1273n.e;
                B bE = new Kh.z(c1246j.f11312a.d("biller_v2", bVar4), new x(c1246j, i), 0).e(zh.b.a());
                Gh.f fVar = new Gh.f(new ba.m(this, i6), Eh.d.f1366d);
                bE.g(fVar);
                e(fVar);
                o();
                return;
            case 16:
                super.j();
                ReKycSubmittedActivity reKycSubmittedActivity = (ReKycSubmittedActivity) ((InterfaceC1559b) this.c.get());
                reKycSubmittedActivity.getClass();
                AbstractC1236z.g(reKycSubmittedActivity, R.id.fragment_container, new ReKycSubmittedFragment());
                return;
            case 17:
                super.j();
                PurchasedTicket purchasedTicket = (PurchasedTicket) ((MayaTravelActivity) ((InterfaceC1560a) this.c.get())).getIntent().getParcelableExtra("purchased_ticket");
                if (purchasedTicket == null) {
                    MayaTravelActivity mayaTravelActivity = (MayaTravelActivity) ((InterfaceC1560a) this.c.get());
                    mayaTravelActivity.getClass();
                    AbstractC1236z.g(mayaTravelActivity, R.id.frame_layout_container, new MayaTravelHomeFragment());
                    return;
                } else {
                    MayaTravelActivity mayaTravelActivity2 = (MayaTravelActivity) ((InterfaceC1560a) this.c.get());
                    mayaTravelActivity2.getClass();
                    mayaTravelActivity2.n1();
                    B5.i.d0(mayaTravelActivity2, purchasedTicket);
                    return;
                }
            case 18:
                super.j();
                v();
                return;
            case 19:
                super.j();
                QRPHMerchantPaymentRequest qRPHMerchantPaymentRequest = ((MayaQRPHDynamicMerchantPaymentFragment) ((o9.g) this.c.get())).f12898Z;
                if (qRPHMerchantPaymentRequest == null) {
                    kotlin.jvm.internal.j.n("mQRPHMerchantPaymentRequest");
                    throw null;
                }
                o9.g gVar = (o9.g) this.c.get();
                String name = qRPHMerchantPaymentRequest.getMerchantDetails().getName();
                MayaQRPHDynamicMerchantPaymentFragment mayaQRPHDynamicMerchantPaymentFragment = (MayaQRPHDynamicMerchantPaymentFragment) gVar;
                mayaQRPHDynamicMerchantPaymentFragment.getClass();
                kotlin.jvm.internal.j.g(name, "name");
                TextView textView6 = mayaQRPHDynamicMerchantPaymentFragment.f12894V;
                if (textView6 == null) {
                    kotlin.jvm.internal.j.n("mMerchantInfoTextView");
                    throw null;
                }
                textView6.setText(name);
                k();
                return;
            case 20:
                super.j();
                q();
                return;
            case 22:
                super.j();
                MayaInboxV2Activity mayaInboxV2Activity = (MayaInboxV2Activity) ((q8.b) this.c.get());
                mayaInboxV2Activity.getClass();
                AbstractC1236z.g(mayaInboxV2Activity, R.id.fragment_container, new MayaInboxFragment());
                return;
            case 24:
                super.j();
                e(new Lh.h(((C1293x0) this.e).g(), zh.b.a(), 0).e());
                return;
            case 25:
                super.j();
                ((MayaBaseFragment) ((x9.b) this.c.get())).E1();
                y9.c cVar3 = ((MayaMultiTypeMfaInitialFragment) ((x9.b) this.c.get())).f12941V;
                if ((cVar3 != null ? ((MayaMfaActivity) cVar3).g0() : null) != null) {
                    y9.c cVar4 = ((MayaMultiTypeMfaInitialFragment) ((x9.b) this.c.get())).f12941V;
                    OpenMfaMeta openMfaMetaG0 = cVar4 != null ? ((MayaMfaActivity) cVar4).g0() : null;
                    if (openMfaMetaG0 != null) {
                        C1270l0 c1270l0 = (C1270l0) this.e;
                        c1270l0.getClass();
                        Ah.p<CreateChallengeResponse> pVarOpenCreateChallenge = c1270l0.f11459b.openCreateChallenge(new CreateChallengeRequest(openMfaMetaG0.getTransactionType(), openMfaMetaG0.getMethod()));
                        e(new Lh.d(new Lh.d(AbstractC1331a.l(pVarOpenCreateChallenge, pVarOpenCreateChallenge, zh.b.a()), new t9.c(openMfaMetaG0, this), i4), new p8.a(this, 20), i10).e());
                        return;
                    }
                    return;
                }
                y9.c cVar5 = ((MayaMultiTypeMfaInitialFragment) ((x9.b) this.c.get())).f12941V;
                MfaMeta mfaMeta = cVar5 != null ? ((MayaMfaActivity) cVar5).f12930q : null;
                if (mfaMeta != null) {
                    C1270l0 c1270l02 = (C1270l0) this.e;
                    c1270l02.getClass();
                    Ah.p<CreateChallengeResponse> pVarCreateChallenge = c1270l02.f11459b.createChallenge(new CreateChallengeRequest(mfaMeta.getTransactionType(), mfaMeta.getMethod()));
                    e(new Lh.d(new Lh.d(AbstractC1331a.l(pVarCreateChallenge, pVarCreateChallenge, zh.b.a()), new t9.d(mfaMeta, this), i4), new C1983a(this, 19), i10).e());
                    return;
                }
                return;
        }
    }

    public void k() {
        int i = 0;
        int i4 = 2;
        ((MayaBaseFragment) ((o9.g) this.c.get())).D1();
        QRPHMerchantPaymentRequest qRPHMerchantPaymentRequest = ((MayaQRPHDynamicMerchantPaymentFragment) ((o9.g) this.c.get())).f12898Z;
        if (qRPHMerchantPaymentRequest == null) {
            kotlin.jvm.internal.j.n("mQRPHMerchantPaymentRequest");
            throw null;
        }
        Ah.p pVarA = ((C1268k0) this.e).a(qRPHMerchantPaymentRequest);
        e(new T(5, new Lh.d(new Lh.d(AbstractC1331a.l(pVarA, pVarA, zh.b.a()), new com.paymaya.domain.store.T(this, 23), i4), new L(this, 24), i), new C1803a(this, i4)).e());
    }

    public ArrayList l(List contacts) {
        kotlin.jvm.internal.j.g(contacts, "contacts");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = contacts.iterator();
        while (it.hasNext()) {
            Contact contact = (Contact) it.next();
            String strMName = contact.mName();
            kotlin.jvm.internal.j.f(strMName, "mName(...)");
            String strMNumber = contact.mNumber();
            kotlin.jvm.internal.j.f(strMNumber, "mNumber(...)");
            ContactModel contactModel = new ContactModel(strMName, strMNumber, contact.mPhotoUri(), null, null, null, null, 120, null);
            char cCharAt = contact.mName().charAt(0);
            if (Character.isLetter(cCharAt)) {
                String strValueOf = String.valueOf(cCharAt);
                kotlin.jvm.internal.j.e(strValueOf, "null cannot be cast to non-null type java.lang.String");
                String upperCase = strValueOf.toUpperCase(Locale.ROOT);
                kotlin.jvm.internal.j.f(upperCase, "toUpperCase(...)");
                char[] charArray = upperCase.toCharArray();
                kotlin.jvm.internal.j.f(charArray, "toCharArray(...)");
                if (charArray.length == 0) {
                    throw new NoSuchElementException("Array is empty.");
                }
                char c = charArray[0];
                if (linkedHashSet.add(Character.valueOf(c))) {
                    arrayList.add(new ContactHeaderModel(String.valueOf(c)));
                }
                arrayList.add(contactModel);
            } else {
                if (linkedHashSet.add('#')) {
                    arrayList2.add(new ContactHeaderModel("#"));
                }
                arrayList2.add(contactModel);
            }
        }
        return C1110A.L(arrayList2, arrayList);
    }

    public void m() {
        ((MayaContactsSelectionFragment) ((X6.c) this.c.get())).w0 = true;
        new T(5, new Lh.d(new Lh.d(new Lh.d(new Lh.h(new J(new Q6.j(this), 1).h(Th.e.c), zh.b.a(), 0), new u(this, 26), 2), new Gb.d(this, 27), 0), new v(this, 29), 1), new Q6.j(this)).e();
    }

    public void n() {
        if (((MayaContactsSelectionFragment) ((X6.c) this.c.get())).w0) {
            return;
        }
        if (AbstractC1955a.u(((MayaContactsSelectionFragment) ((X6.c) this.c.get())).getContext(), "android.permission.READ_CONTACTS")) {
            m();
            return;
        }
        if (AbstractC1955a.v(((MayaContactsSelectionFragment) ((X6.c) this.c.get())).getActivity(), "android.permission.READ_CONTACTS")) {
            MayaContactsSelectionFragment mayaContactsSelectionFragment = (MayaContactsSelectionFragment) ((X6.c) this.c.get());
            mayaContactsSelectionFragment.getClass();
            new Handler(Looper.getMainLooper()).postDelayed(new E8.l(mayaContactsSelectionFragment, 10), 1000L);
            return;
        }
        ((MayaContactsSelectionFragment) ((X6.c) this.c.get())).w0 = true;
        MayaContactsSelectionFragment mayaContactsSelectionFragment2 = (MayaContactsSelectionFragment) ((X6.c) this.c.get());
        mayaContactsSelectionFragment2.getClass();
        try {
            AbstractC1955a.l(mayaContactsSelectionFragment2).e(zh.b.a()).g(new Gh.e(0, new Gh.f(new w(this, 25), Eh.d.f1366d), new Gc.h(this, 26)));
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th2) {
            AbstractC0983W.G(th2);
            E1.c.k(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public void o() {
        if (((MayaBaseLoadingFragment) ((ga.b) this.c.get())).f10359n0 || ((MayaBillersFragment) ((ga.b) this.c.get())).y0) {
            return;
        }
        ((MayaBillersFragment) ((ga.b) this.c.get())).y0 = true;
        ((MayaBillersFragment) ((ga.b) this.c.get())).O1();
        ((MayaBillersFragment) ((ga.b) this.c.get())).f13379x0 = 1;
        new Lh.d(new T(5, new Lh.d(new Lh.d(new Lh.h(((C1273n) this.e).e(1, ((MayaBillersFragment) ((ga.b) this.c.get())).P1().mSlug()), zh.b.a(), 0), new ba.j(this, 0), 2), new ba.k(this, 0), 0), new ba.h(this, 1)), new ba.l(this, 0), 1).e();
    }

    public void p() {
        Bundle arguments = ((MayaWebLoadingFragment) ((X6.j) this.c.get())).getArguments();
        String string = arguments != null ? arguments.getString("code") : null;
        if (string != null) {
            ((MayaWebLoadingFragment) ((X6.j) this.c.get())).O1();
            d1 d1Var = (d1) this.e;
            d1Var.getClass();
            Ah.p<ThirdPartyMerchantWebViewParameters> thirdPartyMerchantWebViewParametersV2 = d1Var.f11435b.getThirdPartyMerchantWebViewParametersV2(string);
            kotlin.jvm.internal.j.f(thirdPartyMerchantWebViewParametersV2, "getThirdPartyMerchantWebViewParametersV2(...)");
            new Lh.d(new Lh.d(new Lh.h(thirdPartyMerchantWebViewParametersV2, zh.b.a(), 0), new Q6.n(this, 2), 2), new Gc.h(this, 29), 0).e();
        }
    }

    public void q() {
        int i = 1;
        int i4 = 0;
        MayaRewardsCatalogFragment mayaRewardsCatalogFragment = (MayaRewardsCatalogFragment) ((InterfaceC2031a) this.c.get());
        C2168a c2168a = mayaRewardsCatalogFragment.f13719X;
        if (c2168a == null) {
            kotlin.jvm.internal.j.n("mMayaMilesAdapter");
            throw null;
        }
        c2168a.c = true;
        c2168a.f19763b.clear();
        c2168a.notifyDataSetChanged();
        ConstraintLayout constraintLayout = mayaRewardsCatalogFragment.f13728g0;
        if (constraintLayout == null) {
            kotlin.jvm.internal.j.n("mMilesLoadingView");
            throw null;
        }
        constraintLayout.setVisibility(0);
        G0 g02 = (G0) this.e;
        e(new T(5, new Lh.d(new Lh.d(new Lh.h(g02.f11352b.getRewardsCatalog().d(new C1258f0(g02, i)), zh.b.a(), 0), new com.google.firebase.messaging.p(this, 27), 2), new A0(this, 29), i4), new C1803a(this, 8)).e());
    }

    public void r() {
        int i = 5;
        int i4 = 0;
        ConstraintLayout constraintLayout = ((MayaXpEntryFragment) ((Lc.a) this.c.get())).f14337b0;
        if (constraintLayout == null) {
            kotlin.jvm.internal.j.n("mLoadingView");
            throw null;
        }
        constraintLayout.setVisibility(0);
        e(new T(i, new Lh.d(new Lh.d(new Lh.h(((C1266j0) this.e).f11452b.getMayaXp().d(Z.f11412g), zh.b.a(), 0), new w(this, i), 2), new G6.r(this, 7), i4), new G7.t(this, 9)).e());
    }

    public void s(String str) {
        if (str.equals(MayaSessionExpiredActivity.class.getName())) {
            MayaAnimatedFullScreenActivity mayaAnimatedFullScreenActivity = (MayaAnimatedFullScreenActivity) ((S6.b) this.c.get());
            mayaAnimatedFullScreenActivity.n1().a();
            mayaAnimatedFullScreenActivity.finish();
            return;
        }
        MayaAnimatedFullScreenActivity mayaAnimatedFullScreenActivity2 = (MayaAnimatedFullScreenActivity) ((S6.b) this.c.get());
        String stringExtra = mayaAnimatedFullScreenActivity2.getIntent().getStringExtra("extra_next_activity");
        if (stringExtra == null) {
            return;
        }
        Intent intent = new Intent(mayaAnimatedFullScreenActivity2, Class.forName(stringExtra));
        mayaAnimatedFullScreenActivity2.getIntent().removeExtra("extra_next_activity");
        mayaAnimatedFullScreenActivity2.getIntent().putExtras(mayaAnimatedFullScreenActivity2.getIntent());
        mayaAnimatedFullScreenActivity2.f11785n.launch(intent);
        mayaAnimatedFullScreenActivity2.overridePendingTransition(0, 0);
    }

    public void t() {
        ShopProvider shopProvider = ((MayaShopProviderPageFragment) ((bc.f) this.c.get())).f14049z0;
        if (shopProvider != null) {
            String backgroundUrl = shopProvider.getBackgroundUrl();
            if (backgroundUrl == null || C2576A.H(backgroundUrl)) {
                ((MayaShopProviderPageFragment) ((bc.f) this.c.get())).Q1();
                ShapeableImageView shapeableImageView = ((MayaShopProviderPageFragment) ((bc.f) this.c.get())).u0;
                if (shapeableImageView == null) {
                    kotlin.jvm.internal.j.n("mBannerImageView");
                    throw null;
                }
                shapeableImageView.setVisibility(8);
            } else {
                MayaShopProviderPageFragment mayaShopProviderPageFragment = (MayaShopProviderPageFragment) ((bc.f) this.c.get());
                mayaShopProviderPageFragment.getClass();
                mayaShopProviderPageFragment.requireContext();
                ShapeableImageView shapeableImageView2 = mayaShopProviderPageFragment.u0;
                if (shapeableImageView2 == null) {
                    kotlin.jvm.internal.j.n("mBannerImageView");
                    throw null;
                }
                C.f0(backgroundUrl, shapeableImageView2, new R4.i(mayaShopProviderPageFragment, 25));
            }
            String providerName = shopProvider.getName();
            kotlin.jvm.internal.j.g(providerName, "providerName");
            MayaShopProviderPageFragment mayaShopProviderPageFragment2 = (MayaShopProviderPageFragment) ((bc.f) this.c.get());
            ConstraintLayout constraintLayout = mayaShopProviderPageFragment2.f14048x0;
            if (constraintLayout == null) {
                kotlin.jvm.internal.j.n("mViewPagerLoadingView");
                throw null;
            }
            constraintLayout.setVisibility(0);
            mayaShopProviderPageFragment2.f10359n0 = false;
            P0 p02 = (P0) this.e;
            p02.getClass();
            e(new T(5, new Lh.h(new Lh.d(p02.f11381b.getShopProviderSubcategories(providerName).d(Z.f11417p), new Y.e(23, p02, providerName), 2), zh.b.a(), 0), new Xa.c(this, 3)).e());
        } else {
            ((MayaShopProviderPageFragment) ((bc.f) this.c.get())).Q1();
            ShapeableImageView shapeableImageView3 = ((MayaShopProviderPageFragment) ((bc.f) this.c.get())).u0;
            if (shapeableImageView3 == null) {
                kotlin.jvm.internal.j.n("mBannerImageView");
                throw null;
            }
            shapeableImageView3.setVisibility(8);
            ((MayaShopProviderPageFragment) ((bc.f) this.c.get())).S1();
            ((MayaShopProviderPageFragment) ((bc.f) this.c.get())).R1();
        }
        ((MayaShopProviderPageFragment) ((bc.f) this.c.get())).L1();
    }

    public void u() {
        if (((MayaBillersFragment) ((ga.b) this.c.get())).y0) {
            return;
        }
        ea.l lVar = ((MayaBillersFragment) ((ga.b) this.c.get())).u0;
        if (lVar == null) {
            kotlin.jvm.internal.j.n("mBillersListAdapter");
            throw null;
        }
        if (!lVar.f16622d) {
            lVar.e(true);
        }
        ((MayaBillersFragment) ((ga.b) this.c.get())).y0 = true;
        int i = 5;
        new Lh.d(new T(i, new Lh.d(new Lh.d(new Lh.h(((C1273n) this.e).e(((MayaBillersFragment) ((ga.b) this.c.get())).f13379x0 + 1, ((MayaBillersFragment) ((ga.b) this.c.get())).P1().mSlug()), zh.b.a(), 0), new ba.m(this, 0), 2), new s(this, 23), 0), new ba.h(this, 0)), new Q6.n(this, 23), 1).e();
    }

    public void v() {
        int i = 0;
        MayaTravelViewDataSelection mayaTravelViewDataSelectionQ1 = ((MayaTravelRouteSelectionFragment) ((jc.e) this.c.get())).Q1();
        Operator operator = mayaTravelViewDataSelectionQ1 != null ? mayaTravelViewDataSelectionQ1.f14229a : null;
        MayaTravelViewDataSelection mayaTravelViewDataSelectionQ12 = ((MayaTravelRouteSelectionFragment) ((jc.e) this.c.get())).Q1();
        ArrayList arrayList = mayaTravelViewDataSelectionQ12 != null ? mayaTravelViewDataSelectionQ12.f14231d : null;
        if (arrayList != null && !arrayList.isEmpty()) {
            ((MayaTravelRouteSelectionFragment) ((jc.e) this.c.get())).L1();
            E(arrayList);
        } else {
            ((MayaTravelRouteSelectionFragment) ((jc.e) this.c.get())).O1();
            Ah.p<List<Route>> routes = ((W0) this.e).f11403b.getRoutes(operator != null ? operator.mId() : null);
            e(new Lh.d(new Lh.d(AbstractC1331a.l(routes, routes, zh.b.a()), new com.paymaya.domain.store.T(this, 10), 2), new L(this, 11), i).e());
        }
    }

    public void w(MfaMeta mfaMeta) {
        MayaMultiTypeMfaInitialFragment mayaMultiTypeMfaInitialFragment = (MayaMultiTypeMfaInitialFragment) ((x9.b) this.c.get());
        mayaMultiTypeMfaInitialFragment.getClass();
        y9.c cVar = mayaMultiTypeMfaInitialFragment.f12941V;
        if (cVar != null) {
            ((MayaMfaActivity) cVar).f12930q = mfaMeta;
        }
        ((MayaBaseFragment) ((x9.b) this.c.get())).w1();
        y9.c cVar2 = ((MayaMultiTypeMfaInitialFragment) ((x9.b) this.c.get())).f12941V;
        if (cVar2 != null) {
            MayaMfaActivity mayaMfaActivity = (MayaMfaActivity) cVar2;
            AbstractC1236z.f(mayaMfaActivity);
            mayaMfaActivity.l2();
        }
    }

    public void x(PayMayaError payMayaError) {
        final int i = 1;
        final int i4 = 0;
        if (payMayaError.isSessionTimeout()) {
            ga.b bVar = (ga.b) this.c.get();
            String strMSpiel = payMayaError.mSpiel();
            final MayaBillersFragment mayaBillersFragment = (MayaBillersFragment) bVar;
            mayaBillersFragment.getClass();
            MayaBaseLoadingFragment.N1(mayaBillersFragment, 200, strMSpiel, null, new View.OnClickListener() { // from class: ha.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i4) {
                        case 0:
                            MayaBillersFragment mayaBillersFragment2 = mayaBillersFragment;
                            Callback.onClick_enter(view);
                            try {
                                mayaBillersFragment2.O1();
                                mayaBillersFragment2.Q1().o();
                                return;
                            } finally {
                            }
                        default:
                            MayaBillersFragment mayaBillersFragment3 = mayaBillersFragment;
                            Callback.onClick_enter(view);
                            try {
                                mayaBillersFragment3.O1();
                                mayaBillersFragment3.Q1().o();
                                return;
                            } finally {
                            }
                    }
                }
            }, 28);
            return;
        }
        List listA = C1246j.a(((C1273n) this.e).e.f11312a.f2811a.query(String.format("SELECT * FROM %1$s WHERE %2$s = \"%3$s\" ORDER BY %4$s", "biller_v2", "categorySlug", ((MayaBillersFragment) ((ga.b) this.c.get())).P1().mSlug(), AppMeasurementSdk.ConditionalUserProperty.NAME)));
        List list = listA;
        if (list != null && !list.isEmpty()) {
            ((MayaBaseLoadingFragment) ((ga.b) this.c.get())).f10359n0 = true;
            A(listA);
            return;
        }
        if (payMayaError.isNetworkError()) {
            ga.b bVar2 = (ga.b) this.c.get();
            String strMSpiel2 = payMayaError.mSpiel();
            final MayaBillersFragment mayaBillersFragment2 = (MayaBillersFragment) bVar2;
            mayaBillersFragment2.getClass();
            MayaBaseLoadingFragment.N1(mayaBillersFragment2, 100, strMSpiel2, null, new View.OnClickListener() { // from class: ha.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i) {
                        case 0:
                            MayaBillersFragment mayaBillersFragment22 = mayaBillersFragment2;
                            Callback.onClick_enter(view);
                            try {
                                mayaBillersFragment22.O1();
                                mayaBillersFragment22.Q1().o();
                                return;
                            } finally {
                            }
                        default:
                            MayaBillersFragment mayaBillersFragment3 = mayaBillersFragment2;
                            Callback.onClick_enter(view);
                            try {
                                mayaBillersFragment3.O1();
                                mayaBillersFragment3.Q1().o();
                                return;
                            } finally {
                            }
                    }
                }
            }, 28);
            return;
        }
        ga.b bVar3 = (ga.b) this.c.get();
        String strMSpiel3 = payMayaError.mSpiel();
        final MayaBillersFragment mayaBillersFragment3 = (MayaBillersFragment) bVar3;
        mayaBillersFragment3.getClass();
        MayaBaseLoadingFragment.N1(mayaBillersFragment3, 200, strMSpiel3, null, new View.OnClickListener() { // from class: ha.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i4) {
                    case 0:
                        MayaBillersFragment mayaBillersFragment22 = mayaBillersFragment3;
                        Callback.onClick_enter(view);
                        try {
                            mayaBillersFragment22.O1();
                            mayaBillersFragment22.Q1().o();
                            return;
                        } finally {
                        }
                    default:
                        MayaBillersFragment mayaBillersFragment32 = mayaBillersFragment3;
                        Callback.onClick_enter(view);
                        try {
                            mayaBillersFragment32.O1();
                            mayaBillersFragment32.Q1().o();
                            return;
                        } finally {
                        }
                }
            }
        }, 28);
    }

    public void y(CreditAgreement creditAgreement) {
        ((Vd.b) ((Ud.a) this.c.get())).getClass();
        CreditAgreement creditAgreement2 = (CreditAgreement) this.e;
        if (creditAgreement2 != null ? kotlin.jvm.internal.j.b(creditAgreement2.isBlockShowAgreement(), Boolean.TRUE) : false) {
            return;
        }
        ((Vd.b) ((Ud.a) this.c.get())).D(creditAgreement.getKey(), false);
    }

    public void z(List contacts) {
        kotlin.jvm.internal.j.g(contacts, "contacts");
        X6.c cVar = (X6.c) this.c.get();
        ArrayList arrayListL = l(contacts);
        MayaContactsSelectionFragment mayaContactsSelectionFragment = (MayaContactsSelectionFragment) cVar;
        mayaContactsSelectionFragment.getClass();
        U6.c cVar2 = mayaContactsSelectionFragment.u0;
        C0659t c0659t = null;
        if (cVar2 == null) {
            kotlin.jvm.internal.j.n("mMayaContactsSelectionItemAdapter");
            throw null;
        }
        ArrayList arrayList = cVar2.c;
        DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new U6.b(arrayList, arrayListL));
        kotlin.jvm.internal.j.f(diffResultCalculateDiff, "calculateDiff(...)");
        arrayList.clear();
        arrayList.addAll(arrayListL);
        diffResultCalculateDiff.dispatchUpdatesTo(cVar2);
        MayaSectionIndexFastScroller mayaSectionIndexFastScroller = mayaContactsSelectionFragment.f11912s0;
        if (mayaSectionIndexFastScroller == null) {
            kotlin.jvm.internal.j.n("mSectionIndexFastScroller");
            throw null;
        }
        LinearLayout linearLayout = mayaSectionIndexFastScroller.f12087d;
        linearLayout.removeAllViews();
        ArrayList<C0659t> arrayList2 = mayaSectionIndexFastScroller.f12089k;
        arrayList2.clear();
        int i = 0;
        for (Object obj : arrayListL) {
            int i4 = i + 1;
            if (i < 0) {
                C1132s.k();
                throw null;
            }
            ContactListItem item = (ContactListItem) obj;
            kotlin.jvm.internal.j.g(item, "item");
            boolean z4 = item instanceof ContactHeaderModel;
            if (z4) {
                String letter = z4 ? ((ContactHeaderModel) item).getLetter() : "";
                TextView textView = new TextView(mayaSectionIndexFastScroller.getContext());
                TextViewCompat.setTextAppearance(textView, mayaSectionIndexFastScroller.f);
                int i6 = mayaSectionIndexFastScroller.i;
                int i10 = mayaSectionIndexFastScroller.h;
                textView.setPadding(i6, i10, i6, i10);
                textView.setText(letter);
                linearLayout.addView(textView);
                arrayList2.add(new C0659t(letter, textView, i));
            }
            i = i4;
        }
        for (C0659t c0659t2 : arrayList2) {
            c0659t2.f7057d = c0659t;
            if (c0659t != null) {
                c0659t.e = c0659t2;
            }
            c0659t = c0659t2;
        }
        ((MayaContactsSelectionFragment) ((X6.c) this.c.get())).L1();
    }

    public /* synthetic */ f(Object obj, int i) {
        this.f399d = i;
        this.e = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(y5.f fVar, Uh.d dVar, int i) {
        super(dVar);
        this.f399d = i;
        this.e = fVar;
    }

    public f() {
        this.f399d = 23;
        this.e = new ArrayList();
    }

    public f(com.paymaya.data.preference.a aVar, E0 e02) {
        this.f399d = 13;
        this.e = e02;
    }

    public f(J5.b mChatSupportCache) {
        this.f399d = 9;
        kotlin.jvm.internal.j.g(mChatSupportCache, "mChatSupportCache");
        this.e = mChatSupportCache;
    }

    public f(K deviceStore) {
        this.f399d = 7;
        kotlin.jvm.internal.j.g(deviceStore, "deviceStore");
        this.e = deviceStore;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(P0 p02, Uh.d sessionSubject) {
        super(sessionSubject);
        this.f399d = 14;
        kotlin.jvm.internal.j.g(sessionSubject, "sessionSubject");
        this.e = p02;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.paymaya.data.database.repository.k contactRepository, Uh.d dVar) {
        super(dVar);
        this.f399d = 8;
        kotlin.jvm.internal.j.g(contactRepository, "contactRepository");
        this.e = contactRepository;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(C1268k0 c1268k0, Uh.d sessionPublishSubject) {
        super(sessionPublishSubject);
        this.f399d = 19;
        kotlin.jvm.internal.j.g(sessionPublishSubject, "sessionPublishSubject");
        this.e = c1268k0;
    }
}
