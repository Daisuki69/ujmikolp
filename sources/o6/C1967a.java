package o6;

import Ah.p;
import D.S;
import N5.C0435a;
import N5.C0491z;
import We.s;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import b6.C0922a;
import cj.r;
import cj.w;
import com.paymaya.R;
import com.paymaya.common.base.BaseFragment;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.Amount;
import com.paymaya.domain.model.Bank;
import com.paymaya.domain.model.BankTransfer;
import com.paymaya.domain.model.BankTransferBank;
import com.paymaya.domain.model.BankTransferRecipient;
import com.paymaya.domain.model.BankTransferV3;
import com.paymaya.domain.model.BankTransferV3CreateResponse;
import com.paymaya.domain.model.BankTransferV3Recipient;
import com.paymaya.domain.model.CardProfile;
import com.paymaya.domain.model.EDD;
import com.paymaya.domain.model.EDDFinancialDocument;
import com.paymaya.domain.model.Ekyc;
import com.paymaya.domain.model.FavoriteDetails;
import com.paymaya.domain.model.FundSource;
import com.paymaya.domain.model.InboxHeader;
import com.paymaya.domain.model.InboxMessage;
import com.paymaya.domain.model.MayaUpdateProfileData;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.PaymentConfirmationSummary;
import com.paymaya.domain.model.ProfileCmsData;
import com.paymaya.domain.model.ShopPurchaseOfficialReceipt;
import com.paymaya.domain.model.UpdateProfileCmsContentData;
import com.paymaya.domain.model.UpgradePlusReference;
import com.paymaya.domain.store.C1269l;
import com.paymaya.domain.store.O;
import com.paymaya.mayaui.banktransfer.view.activity.impl.MayaBankTransferActivity;
import com.paymaya.mayaui.banktransfer.view.fragment.impl.MayaBankTransferConfirmationFragment;
import com.paymaya.mayaui.banktransfer.view.fragment.impl.MayaBankTransferFormFragment;
import com.paymaya.mayaui.banktransfer.view.fragment.impl.MayaBankTransferOTPFragment;
import com.paymaya.mayaui.cards.view.fragment.impl.MayaCardsFragment;
import com.paymaya.mayaui.common.view.activity.impl.MayaPermissionActivity;
import com.paymaya.mayaui.common.view.dialog.impl.MayaErrorDialogFragment;
import com.paymaya.mayaui.common.view.widget.MayaCustomCardView;
import com.paymaya.mayaui.inbox.view.activity.impl.MayaInboxV2Activity;
import com.paymaya.mayaui.inbox.view.fragment.impl.MayaInboxPageFragment;
import com.paymaya.mayaui.mfa.view.activity.impl.MayaMfaActivity;
import com.paymaya.mayaui.mfa.view.fragment.impl.MayaMfaFaceAuthFragment;
import com.paymaya.mayaui.profile.view.fragment.impl.BaseMayaProfileFragment;
import com.paymaya.mayaui.userprofileupdate.view.activity.impl.MayaUpdateProfileActivity;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaPersonalDetailsFragment;
import com.paymaya.ui.ekyc.view.fragment.impl.EDDApplicationStatusFragment;
import com.paymaya.ui.ekyc.view.fragment.impl.EDDSearchFragment;
import com.paymaya.ui.ekyc.view.fragment.impl.EDDSubmissionReviewFragment;
import com.paymaya.ui.shopv3.view.activity.impl.ShopV3Activity;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3ConfirmationBottomSheetFragment;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3PaymentFragment;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3PurchaseHistoryReceiptFragment;
import d4.AbstractC1331a;
import fh.InterfaceC1486b;
import hh.InterfaceC1568a;
import hh.InterfaceC1573f;
import ih.EnumC1604b;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import n2.C1915b;
import org.joda.time.DateTime;
import org.json.JSONObject;
import pg.C2038a;
import pg.t;
import ph.A2;
import r8.C2191a;
import rc.C2194a;
import s.AbstractC2217b;
import s6.InterfaceC2240a;
import s6.InterfaceC2241b;
import s6.InterfaceC2243d;
import t6.InterfaceC2270a;
import t6.InterfaceC2275f;
import v.AbstractC2329d;
import v0.C2333a;
import ve.InterfaceC2347a;
import w2.C2373d;
import w2.C2374e;
import wc.InterfaceC2390a;
import we.InterfaceC2407L;
import we.ViewOnClickListenerC2426o;
import wi.C2440a;
import y6.AbstractC2513a;
import y6.C2514b;
import ya.C2516a;
import yc.InterfaceC2524e;
import yi.C2533a;
import zj.C2576A;

/* JADX INFO: renamed from: o6.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1967a implements Ch.c, InterfaceC1568a, InterfaceC1573f, Ch.f, W6.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f18783b;

    public /* synthetic */ C1967a(Object obj, int i) {
        this.f18782a = i;
        this.f18783b = obj;
    }

    public String a(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            C2373d c2373d = (C2373d) this.f18783b;
            C2374e c2374e = new C2374e(stringWriter, c2373d.f20679a, c2373d.f20680b, c2373d.c, c2373d.f20681d);
            c2374e.a(obj);
            c2374e.c();
            c2374e.f20683b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ch.c
    public void accept(Object obj) {
        BankTransferV3 bankTransfer;
        Bundle bundle;
        Bundle bundle2;
        Intent intent;
        Intent intent2;
        Intent intent3;
        Intent intent4;
        int i = 0;
        Object[] objArr = 0;
        BankTransferV3Recipient recipient = null;
        parcelable = null;
        Parcelable parcelable = null;
        String tag = null;
        recipient = null;
        int i4 = 1;
        switch (this.f18782a) {
            case 0:
                BankTransferV3 transfer = (BankTransferV3) obj;
                kotlin.jvm.internal.j.g(transfer, "transfer");
                ((MayaBaseFragment) ((InterfaceC2240a) ((c) this.f18783b).c.get())).w1();
                c cVar = (c) this.f18783b;
                InterfaceC2240a interfaceC2240a = (InterfaceC2240a) cVar.c.get();
                C1219h c1219hH = AbstractC2329d.h(14);
                c1219hH.t(EnumC1217f.CONFIRMATION);
                c1219hH.i();
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                c1219hH.j.put("attribution", ((MayaBaseFragment) ((InterfaceC2240a) cVar.c.get())).n1().f10371a);
                ((MayaBaseFragment) interfaceC2240a).A1(c1219hH);
                Bundle arguments = ((MayaBankTransferConfirmationFragment) ((InterfaceC2240a) cVar.c.get())).getArguments();
                BankTransferV3CreateResponse bankTransferV3CreateResponse = arguments != null ? (BankTransferV3CreateResponse) arguments.getParcelable("bank_transfer_create") : null;
                if (bankTransferV3CreateResponse != null && (bankTransfer = bankTransferV3CreateResponse.getBankTransfer()) != null) {
                    recipient = bankTransfer.getRecipient();
                }
                transfer.prefillRecipientMissingValues(recipient);
                MayaBankTransferConfirmationFragment mayaBankTransferConfirmationFragment = (MayaBankTransferConfirmationFragment) ((InterfaceC2240a) cVar.c.get());
                mayaBankTransferConfirmationFragment.getClass();
                InterfaceC2270a interfaceC2270a = mayaBankTransferConfirmationFragment.f11547f0;
                if (interfaceC2270a != null) {
                    ((MayaBankTransferActivity) interfaceC2270a).c2(transfer);
                    return;
                }
                return;
            case 1:
                FavoriteDetails bankFavorite = (FavoriteDetails) obj;
                kotlin.jvm.internal.j.g(bankFavorite, "bankFavorite");
                g gVar = (g) this.f18783b;
                gVar.getClass();
                gVar.j = false;
                MayaBankTransferFormFragment mayaBankTransferFormFragment = (MayaBankTransferFormFragment) ((InterfaceC2241b) gVar.c.get());
                InterfaceC2275f interfaceC2275f = mayaBankTransferFormFragment.f11550B0;
                if (interfaceC2275f != null) {
                    MayaBankTransferActivity mayaBankTransferActivity = (MayaBankTransferActivity) interfaceC2275f;
                    mayaBankTransferActivity.R1();
                    mayaBankTransferActivity.S1();
                }
                mayaBankTransferFormFragment.L1();
                InterfaceC2275f interfaceC2275f2 = ((MayaBankTransferFormFragment) ((InterfaceC2241b) gVar.c.get())).f11550B0;
                if (interfaceC2275f2 != null) {
                    ((MayaBankTransferActivity) interfaceC2275f2).Y1().h = bankFavorite;
                }
                String strMTemplateJson = bankFavorite.mTemplateJson();
                if (strMTemplateJson == null || C2576A.H(strMTemplateJson)) {
                    return;
                }
                BankTransfer bankTransferFromJson = BankTransfer.fromJson(bankFavorite.mTemplateJson());
                InterfaceC2241b interfaceC2241b = (InterfaceC2241b) gVar.c.get();
                BankTransferRecipient bankTransferRecipientMBankTransferRecipient = bankTransferFromJson.mBankTransferRecipient();
                String strMValue = bankTransferRecipientMBankTransferRecipient != null ? bankTransferRecipientMBankTransferRecipient.mValue() : null;
                AppCompatEditText appCompatEditText = ((MayaBankTransferFormFragment) interfaceC2241b).u0;
                if (appCompatEditText == null) {
                    kotlin.jvm.internal.j.n("mEditTextAccountNumber");
                    throw null;
                }
                appCompatEditText.setText(strMValue);
                InterfaceC2241b interfaceC2241b2 = (InterfaceC2241b) gVar.c.get();
                Amount amountMAmount = bankTransferFromJson.mAmount();
                String formattedValue = amountMAmount != null ? amountMAmount.getFormattedValue() : null;
                AppCompatEditText appCompatEditText2 = ((MayaBankTransferFormFragment) interfaceC2241b2).f11555r0;
                if (appCompatEditText2 == null) {
                    kotlin.jvm.internal.j.n("mEditTextAmount");
                    throw null;
                }
                appCompatEditText2.setText(formattedValue);
                InterfaceC2241b interfaceC2241b3 = (InterfaceC2241b) gVar.c.get();
                String accountFirstAndLastName = bankTransferFromJson.getAccountFirstAndLastName();
                AppCompatEditText appCompatEditText3 = ((MayaBankTransferFormFragment) interfaceC2241b3).y0;
                if (appCompatEditText3 == null) {
                    kotlin.jvm.internal.j.n("mEditTextAccountName");
                    throw null;
                }
                appCompatEditText3.setText(accountFirstAndLastName);
                InterfaceC2241b interfaceC2241b4 = (InterfaceC2241b) gVar.c.get();
                String strMPurpose = bankTransferFromJson.mPurpose();
                AppCompatEditText appCompatEditText4 = ((MayaBankTransferFormFragment) interfaceC2241b4).w0;
                if (appCompatEditText4 == null) {
                    kotlin.jvm.internal.j.n("mEditTextPurpose");
                    throw null;
                }
                appCompatEditText4.setText(strMPurpose);
                BankTransferBank bankTransferBankMBankTransferBank = bankTransferFromJson.mBankTransferBank();
                String strMBankCode = bankTransferBankMBankTransferBank != null ? bankTransferBankMBankTransferBank.mBankCode() : null;
                C1269l c1269l = gVar.f;
                c1269l.getClass();
                J1.e eVar = new J1.e(i4);
                eVar.f2381b = strMBankCode;
                Bank bankC = c1269l.f11457b.c(eVar);
                if (bankC != null) {
                    gVar.f18796k = bankC;
                    InterfaceC2241b interfaceC2241b5 = (InterfaceC2241b) gVar.c.get();
                    Bank bank = gVar.f18796k;
                    String strMBankName = bank != null ? bank.mBankName() : null;
                    TextView textView = ((MayaBankTransferFormFragment) interfaceC2241b5).f11553p0;
                    if (textView != null) {
                        textView.setText(strMBankName);
                        return;
                    } else {
                        kotlin.jvm.internal.j.n("mTextViewBankName");
                        throw null;
                    }
                }
                return;
            case 2:
                ((MayaBaseFragment) ((InterfaceC2243d) ((C0922a) this.f18783b).c.get())).w1();
                C0922a c0922a = (C0922a) this.f18783b;
                PayMayaError payMayaErrorF = c0922a.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF, "mayaErrorHandling(...)");
                if (c0922a.e.e().isAppEventV2BankTransferEnabled()) {
                    ((MayaBankTransferOTPFragment) ((InterfaceC2243d) c0922a.c.get())).Y1(payMayaErrorF);
                }
                if (payMayaErrorF.isSessionTimeout()) {
                    return;
                }
                int iMErrorCode = payMayaErrorF.mErrorCode();
                if (iMErrorCode == -330) {
                    ((MayaBankTransferOTPFragment) ((InterfaceC2243d) c0922a.c.get())).Z1(payMayaErrorF);
                    return;
                } else if (iMErrorCode == -329) {
                    ((MayaBankTransferOTPFragment) ((InterfaceC2243d) c0922a.c.get())).a2(payMayaErrorF);
                    return;
                } else {
                    ((MayaBankTransferOTPFragment) ((InterfaceC2243d) c0922a.c.get())).Z1(payMayaErrorF);
                    return;
                }
            case 3:
            case 5:
            case 12:
            case 14:
            case 16:
            case 20:
            case 21:
            case 22:
            default:
                String str = (String) obj;
                Bb.f fVar = ((EDDSearchFragment) this.f18783b).f14546S;
                if (fVar == null) {
                    kotlin.jvm.internal.j.n("mEDDSearchFragmentPresenter");
                    throw null;
                }
                if (str == null || C2576A.H(str)) {
                    ((EDDSearchFragment) ((yd.j) fVar.c.get())).r1((ArrayList) fVar.e);
                    return;
                }
                ArrayList arrayList = (ArrayList) fVar.e;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (C2576A.x((String) obj2, str, true)) {
                        arrayList2.add(obj2);
                    }
                }
                ((EDDSearchFragment) ((yd.j) fVar.c.get())).r1(arrayList2);
                return;
            case 4:
                List<InboxMessage> list = (List) obj;
                p8.b bVar = (p8.b) this.f18783b;
                bVar.getClass();
                List list2 = list;
                if (list2 == null || list2.isEmpty()) {
                    s8.c cVar2 = (s8.c) bVar.c.get();
                    String str2 = bVar.f;
                    if (str2 != null) {
                        tag = str2.toLowerCase(Locale.ROOT);
                        kotlin.jvm.internal.j.f(tag, "toLowerCase(...)");
                    }
                    MayaInboxPageFragment mayaInboxPageFragment = (MayaInboxPageFragment) cVar2;
                    mayaInboxPageFragment.getClass();
                    kotlin.jvm.internal.j.g(tag, "tag");
                    C0435a c0435a = mayaInboxPageFragment.f12410U;
                    kotlin.jvm.internal.j.d(c0435a);
                    ((TextView) c0435a.e).setText(mayaInboxPageFragment.getString(R.string.maya_label_no_notifications, tag));
                    C0435a c0435a2 = mayaInboxPageFragment.f12410U;
                    kotlin.jvm.internal.j.d(c0435a2);
                    ((TextView) c0435a2.f4048d).setText(mayaInboxPageFragment.getString(R.string.maya_label_no_notifications_subtitle, tag));
                    C0435a c0435a3 = mayaInboxPageFragment.f12410U;
                    kotlin.jvm.internal.j.d(c0435a3);
                    ((Group) c0435a3.f).setVisibility(0);
                    MayaInboxPageFragment mayaInboxPageFragment2 = (MayaInboxPageFragment) ((s8.c) bVar.c.get());
                    C0435a c0435a4 = mayaInboxPageFragment2.f12410U;
                    kotlin.jvm.internal.j.d(c0435a4);
                    ((RecyclerView) c0435a4.f4049g).setVisibility(8);
                    C0435a c0435a5 = mayaInboxPageFragment2.f12410U;
                    kotlin.jvm.internal.j.d(c0435a5);
                    ((RecyclerView) c0435a5.c).setVisibility(8);
                    return;
                }
                ArrayList arrayList3 = new ArrayList(list2);
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                w.o(arrayList3, bVar.f19076g);
                DateTime dateTimeMinusWeeks = new DateTime().minusWeeks(1);
                for (InboxMessage inboxMessage : list) {
                    if (inboxMessage.mDate().isAfter(dateTimeMinusWeeks)) {
                        arrayList4.add(inboxMessage);
                    } else {
                        arrayList5.add(inboxMessage);
                    }
                }
                if (!arrayList4.isEmpty()) {
                    ArrayList arrayList6 = new ArrayList();
                    InboxHeader inboxHeaderBuild = InboxHeader.sBuilder().mHeaderType(0).build();
                    kotlin.jvm.internal.j.f(inboxHeaderBuild, "build(...)");
                    arrayList6.add(inboxHeaderBuild);
                    arrayList6.addAll(arrayList4);
                    MayaInboxPageFragment mayaInboxPageFragment3 = (MayaInboxPageFragment) ((s8.c) bVar.c.get());
                    mayaInboxPageFragment3.getClass();
                    C0435a c0435a6 = mayaInboxPageFragment3.f12410U;
                    kotlin.jvm.internal.j.d(c0435a6);
                    ((RecyclerView) c0435a6.f4049g).setVisibility(0);
                    C2191a c2191a = mayaInboxPageFragment3.f12413X;
                    if (c2191a != null) {
                        ArrayList arrayList7 = c2191a.f19880d;
                        arrayList7.clear();
                        arrayList7.addAll(arrayList6);
                        c2191a.notifyDataSetChanged();
                    }
                    Bundle arguments2 = mayaInboxPageFragment3.getArguments();
                    String string = arguments2 != null ? arguments2.getString("inbox_tag") : null;
                    t8.e eVar2 = mayaInboxPageFragment3.f12412W;
                    Parcelable parcelable2 = (eVar2 == null || (bundle2 = ((MayaInboxV2Activity) eVar2).f12401o) == null) ? null : bundle2.getParcelable(string);
                    if (parcelable2 != null) {
                        C0435a c0435a7 = mayaInboxPageFragment3.f12410U;
                        kotlin.jvm.internal.j.d(c0435a7);
                        RecyclerView.LayoutManager layoutManager = ((RecyclerView) c0435a7.f4049g).getLayoutManager();
                        if (layoutManager != null) {
                            layoutManager.onRestoreInstanceState(parcelable2);
                        }
                    }
                }
                if (!arrayList5.isEmpty()) {
                    ArrayList arrayList8 = new ArrayList();
                    InboxHeader inboxHeaderBuild2 = InboxHeader.sBuilder().mHeaderType(1).build();
                    kotlin.jvm.internal.j.f(inboxHeaderBuild2, "build(...)");
                    arrayList8.add(inboxHeaderBuild2);
                    arrayList8.addAll(arrayList5);
                    MayaInboxPageFragment mayaInboxPageFragment4 = (MayaInboxPageFragment) ((s8.c) bVar.c.get());
                    mayaInboxPageFragment4.getClass();
                    C0435a c0435a8 = mayaInboxPageFragment4.f12410U;
                    kotlin.jvm.internal.j.d(c0435a8);
                    ((RecyclerView) c0435a8.c).setVisibility(0);
                    C2191a c2191a2 = mayaInboxPageFragment4.f12414Y;
                    if (c2191a2 != null) {
                        ArrayList arrayList9 = c2191a2.f19880d;
                        arrayList9.clear();
                        arrayList9.addAll(arrayList8);
                        c2191a2.notifyDataSetChanged();
                    }
                    Bundle arguments3 = mayaInboxPageFragment4.getArguments();
                    String string2 = arguments3 != null ? arguments3.getString("inbox_tag") : null;
                    t8.e eVar3 = mayaInboxPageFragment4.f12412W;
                    if (eVar3 != null && (bundle = ((MayaInboxV2Activity) eVar3).f12401o) != null) {
                        parcelable = bundle.getParcelable(string2);
                    }
                    if (parcelable != null) {
                        C0435a c0435a9 = mayaInboxPageFragment4.f12410U;
                        kotlin.jvm.internal.j.d(c0435a9);
                        RecyclerView.LayoutManager layoutManager2 = ((RecyclerView) c0435a9.c).getLayoutManager();
                        if (layoutManager2 != null) {
                            layoutManager2.onRestoreInstanceState(parcelable);
                        }
                    }
                }
                C0435a c0435a10 = ((MayaInboxPageFragment) ((s8.c) bVar.c.get())).f12410U;
                kotlin.jvm.internal.j.d(c0435a10);
                ((Group) c0435a10.f).setVisibility(8);
                return;
            case 6:
                A2 a22 = (A2) this.f18783b;
                a22.getClass();
                EnumC1604b.d(a22, (InterfaceC1486b) obj);
                return;
            case 7:
                BaseMayaProfileFragment baseMayaProfileFragment = (BaseMayaProfileFragment) this.f18783b;
                t tVar = baseMayaProfileFragment.f13500F0;
                if (tVar != null) {
                    AbstractC1331a.t("session_token", baseMayaProfileFragment.H1().j.s(), tVar);
                }
                baseMayaProfileFragment.f13500F0 = null;
                return;
            case 8:
                MayaUpdateProfileData updateProfileData = (MayaUpdateProfileData) obj;
                kotlin.jvm.internal.j.g(updateProfileData, "updateProfileData");
                C2194a c2194a = (C2194a) this.f18783b;
                String str3 = c2194a.i;
                if (str3 == null) {
                    MayaPersonalDetailsFragment mayaPersonalDetailsFragment = (MayaPersonalDetailsFragment) ((InterfaceC2390a) c2194a.c.get());
                    mayaPersonalDetailsFragment.getClass();
                    Intent intent5 = new Intent();
                    intent5.putExtra("UPDATE_PROFILE_DATA", updateProfileData);
                    mayaPersonalDetailsFragment.requireActivity().setResult(121, intent5);
                    mayaPersonalDetailsFragment.requireActivity().finish();
                    return;
                }
                MayaPersonalDetailsFragment mayaPersonalDetailsFragment2 = (MayaPersonalDetailsFragment) ((InterfaceC2390a) c2194a.c.get());
                mayaPersonalDetailsFragment2.getClass();
                InterfaceC2524e interfaceC2524e = mayaPersonalDetailsFragment2.f14242a0;
                if (interfaceC2524e != null) {
                    MayaUpdateProfileActivity mayaUpdateProfileActivity = (MayaUpdateProfileActivity) interfaceC2524e;
                    mayaUpdateProfileActivity.n1();
                    B5.i.k(mayaUpdateProfileActivity, str3);
                    return;
                }
                return;
            case 9:
                ProfileCmsData it = (ProfileCmsData) obj;
                kotlin.jvm.internal.j.g(it, "it");
                UpdateProfileCmsContentData updateProfileCmsContentData = it.getUpdateProfileCmsContentData();
                rc.m mVar = (rc.m) this.f18783b;
                mVar.f19915l = updateProfileCmsContentData;
                mVar.l();
                return;
            case 10:
                ProfileCmsData it2 = (ProfileCmsData) obj;
                kotlin.jvm.internal.j.g(it2, "it");
                UpdateProfileCmsContentData updateProfileCmsContentData2 = it2.getUpdateProfileCmsContentData();
                rc.o oVar = (rc.o) this.f18783b;
                oVar.f19930n = updateProfileCmsContentData2;
                oVar.l();
                return;
            case 11:
                Ekyc ekyc = (Ekyc) obj;
                kotlin.jvm.internal.j.g(ekyc, "ekyc");
                A7.j jVar = (A7.j) this.f18783b;
                jVar.getClass();
                jVar.f = ekyc;
                yd.d dVar = (yd.d) jVar.c.get();
                String strMReferenceId = ekyc.mReferenceId();
                if (strMReferenceId == null) {
                    strMReferenceId = "";
                }
                EDDApplicationStatusFragment eDDApplicationStatusFragment = (EDDApplicationStatusFragment) dVar;
                eDDApplicationStatusFragment.getClass();
                TextView textView2 = eDDApplicationStatusFragment.mValidationCodeTextView;
                if (textView2 == null) {
                    kotlin.jvm.internal.j.n("mValidationCodeTextView");
                    throw null;
                }
                textView2.setText(strMReferenceId);
                ((EDDApplicationStatusFragment) ((yd.d) jVar.c.get())).w1();
                return;
            case 13:
                Throwable throwable = (Throwable) obj;
                kotlin.jvm.internal.j.g(throwable, "throwable");
                A7.j jVar2 = (A7.j) this.f18783b;
                PayMayaError payMayaErrorF2 = jVar2.f(throwable, false);
                kotlin.jvm.internal.j.f(payMayaErrorF2, "paymayaErrorHandling(...)");
                InterfaceC2347a interfaceC2347a = (InterfaceC2347a) jVar2.c.get();
                String strMSpiel = payMayaErrorF2.mSpiel();
                ShopV3ConfirmationBottomSheetFragment shopV3ConfirmationBottomSheetFragment = (ShopV3ConfirmationBottomSheetFragment) interfaceC2347a;
                C1220i c1220i = shopV3ConfirmationBottomSheetFragment.f10238B;
                FragmentActivity activity = shopV3ConfirmationBottomSheetFragment.getActivity();
                C1219h c1219hD = C1219h.d(EnumC1215d.SHOP);
                c1219hD.t(EnumC1217f.PURCHASE);
                c1219hD.n(12);
                EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
                PaymentConfirmationSummary paymentConfirmationSummary = shopV3ConfirmationBottomSheetFragment.f14781S;
                if (paymentConfirmationSummary == null) {
                    kotlin.jvm.internal.j.n("mPaymentConfirmationSummary");
                    throw null;
                }
                String productCode = paymentConfirmationSummary.getTargetProduct().getProductCode();
                HashMap map = c1219hD.j;
                map.put("product", productCode);
                PaymentConfirmationSummary paymentConfirmationSummary2 = shopV3ConfirmationBottomSheetFragment.f14781S;
                if (paymentConfirmationSummary2 == null) {
                    kotlin.jvm.internal.j.n("mPaymentConfirmationSummary");
                    throw null;
                }
                map.put("provider", paymentConfirmationSummary2.getTargetProduct().getProvider());
                map.put(Constants.REASON, strMSpiel);
                c1220i.c(activity, c1219hD);
                ShopV3ConfirmationBottomSheetFragment shopV3ConfirmationBottomSheetFragment2 = (ShopV3ConfirmationBottomSheetFragment) ((InterfaceC2347a) jVar2.c.get());
                shopV3ConfirmationBottomSheetFragment2.getClass();
                shopV3ConfirmationBottomSheetFragment2.r1().setLoadFinishingAnimationDuration(300L);
                shopV3ConfirmationBottomSheetFragment2.r1().setMStateFinishedListener(new C2038a(25, shopV3ConfirmationBottomSheetFragment2, payMayaErrorF2, objArr == true ? 1 : 0));
                shopV3ConfirmationBottomSheetFragment2.r1().d(R.drawable.pma_ic_exclamation_mark_with_circle);
                return;
            case 15:
                se.f fVar2 = (se.f) this.f18783b;
                PayMayaError payMayaErrorF3 = fVar2.f((Throwable) obj, false);
                kotlin.jvm.internal.j.f(payMayaErrorF3, "paymayaErrorHandling(...)");
                if (payMayaErrorF3.isSessionTimeout()) {
                    return;
                }
                if (payMayaErrorF3.isNetworkError()) {
                    ve.e eVar4 = (ve.e) fVar2.c.get();
                    String strMSpiel2 = payMayaErrorF3.mSpiel();
                    kotlin.jvm.internal.j.f(strMSpiel2, "mSpiel(...)");
                    ShopV3PaymentFragment shopV3PaymentFragment = (ShopV3PaymentFragment) eVar4;
                    shopV3PaymentFragment.getClass();
                    shopV3PaymentFragment.y1(200, strMSpiel2, new ViewOnClickListenerC2426o(shopV3PaymentFragment, 4));
                    return;
                }
                ve.e eVar5 = (ve.e) fVar2.c.get();
                String strMSpiel3 = payMayaErrorF3.mSpiel();
                kotlin.jvm.internal.j.f(strMSpiel3, "mSpiel(...)");
                ShopV3PaymentFragment shopV3PaymentFragment2 = (ShopV3PaymentFragment) eVar5;
                shopV3PaymentFragment2.getClass();
                shopV3PaymentFragment2.y1(100, strMSpiel3, new ViewOnClickListenerC2426o(shopV3PaymentFragment2, i));
                return;
            case 17:
                ShopPurchaseOfficialReceipt receiptLocation = (ShopPurchaseOfficialReceipt) obj;
                kotlin.jvm.internal.j.g(receiptLocation, "receiptLocation");
                A7.j jVar3 = (A7.j) this.f18783b;
                ((BaseFragment) ((ve.k) jVar3.c.get())).n1();
                ve.k kVar = (ve.k) jVar3.c.get();
                String officialReceiptUrl = receiptLocation.getLocation();
                ShopV3PurchaseHistoryReceiptFragment shopV3PurchaseHistoryReceiptFragment = (ShopV3PurchaseHistoryReceiptFragment) kVar;
                shopV3PurchaseHistoryReceiptFragment.getClass();
                kotlin.jvm.internal.j.g(officialReceiptUrl, "officialReceiptUrl");
                InterfaceC2407L interfaceC2407L = shopV3PurchaseHistoryReceiptFragment.f14875V;
                if (interfaceC2407L != null) {
                    ShopV3Activity shopV3Activity = (ShopV3Activity) interfaceC2407L;
                    if (shopV3Activity.f14778l != null) {
                        B5.i.f(shopV3Activity, officialReceiptUrl);
                        return;
                    } else {
                        kotlin.jvm.internal.j.n("mFlowController");
                        throw null;
                    }
                }
                return;
            case 18:
                Ze.a permission = (Ze.a) obj;
                kotlin.jvm.internal.j.g(permission, "permission");
                if (permission.f6934b) {
                    MayaMfaActivity mayaMfaActivity = (MayaMfaActivity) ((v9.a) ((A7.j) this.f18783b).c.get());
                    mayaMfaActivity.getClass();
                    AbstractC1236z.g(mayaMfaActivity, R.id.fragment_container, new MayaMfaFaceAuthFragment());
                    return;
                }
                MayaMfaActivity mayaMfaActivity2 = (MayaMfaActivity) ((v9.a) ((A7.j) this.f18783b).c.get());
                mayaMfaActivity2.n1();
                String string3 = mayaMfaActivity2.getString(R.string.maya_label_take_a_photo);
                String[] strArr = (String[]) Arrays.copyOf(new String[]{"android.permission.CAMERA"}, 1);
                Intent intent6 = new Intent(mayaMfaActivity2, (Class<?>) MayaPermissionActivity.class);
                intent6.putExtra("permissions", strArr);
                intent6.putExtra("title", string3);
                mayaMfaActivity2.f12934u.launch(intent6);
                return;
            case 19:
                Throwable throwable2 = (Throwable) obj;
                kotlin.jvm.internal.j.g(throwable2, "throwable");
                A7.j jVar4 = (A7.j) this.f18783b;
                A7.j.s(jVar4, jVar4.f(throwable2, true), 2);
                return;
            case 23:
                List fundSourceList = (List) obj;
                kotlin.jvm.internal.j.g(fundSourceList, "fundSourceList");
                C2514b c2514b = (C2514b) this.f18783b;
                c2514b.getClass();
                ArrayList arrayList10 = new ArrayList(fundSourceList);
                Iterator it3 = fundSourceList.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        FundSource fundSourceBuild = FundSource.sBuilder().mType("virtual").mStatus("basic").mCardProfile(CardProfile.sBuilder().mScheme("Visa").mBrand("Paymaya").build()).build();
                        kotlin.jvm.internal.j.d(fundSourceBuild);
                        arrayList10.add(fundSourceBuild);
                    } else if (((FundSource) it3.next()).isTypeVirtual()) {
                    }
                }
                MayaCardsFragment mayaCardsFragment = (MayaCardsFragment) ((B6.a) c2514b.c.get());
                mayaCardsFragment.getClass();
                A6.a aVar = mayaCardsFragment.f11599V;
                if (aVar != null) {
                    aVar.c = new ArrayList(arrayList10);
                    aVar.notifyDataSetChanged();
                }
                ArrayList arrayList11 = new ArrayList();
                for (Object obj3 : arrayList10) {
                    if (((FundSource) obj3).isTypePhysical()) {
                        arrayList11.add(obj3);
                    }
                }
                if (arrayList11.size() < 3) {
                    C0491z c0491z = mayaCardsFragment.f11597T;
                    kotlin.jvm.internal.j.d(c0491z);
                    ((FrameLayout) c0491z.f4303b).setVisibility(0);
                    C0491z c0491z2 = mayaCardsFragment.f11597T;
                    kotlin.jvm.internal.j.d(c0491z2);
                    ((MayaCustomCardView) c0491z2.h).setVisibility(0);
                    C0491z c0491z3 = mayaCardsFragment.f11597T;
                    kotlin.jvm.internal.j.d(c0491z3);
                    ((Group) c0491z3.c).setVisibility(8);
                } else {
                    C0491z c0491z4 = mayaCardsFragment.f11597T;
                    kotlin.jvm.internal.j.d(c0491z4);
                    ((FrameLayout) c0491z4.f4303b).setVisibility(8);
                    C0491z c0491z5 = mayaCardsFragment.f11597T;
                    kotlin.jvm.internal.j.d(c0491z5);
                    ((MayaCustomCardView) c0491z5.h).setVisibility(8);
                    C0491z c0491z6 = mayaCardsFragment.f11597T;
                    kotlin.jvm.internal.j.d(c0491z6);
                    ((Group) c0491z6.c).setVisibility(0);
                }
                FragmentActivity activity2 = ((MayaCardsFragment) ((B6.a) c2514b.c.get())).getActivity();
                String dataString = (activity2 == null || (intent4 = activity2.getIntent()) == null) ? null : intent4.getDataString();
                if (dataString != null) {
                    int iW = C.w(dataString);
                    int i6 = iW == 0 ? -1 : AbstractC2513a.f21079a[AbstractC2217b.c(iW)];
                    if (i6 == 1) {
                        ((B6.a) c2514b.c.get()).getClass();
                        FragmentActivity activity3 = ((MayaCardsFragment) ((B6.a) c2514b.c.get())).getActivity();
                        if (activity3 == null || (intent = activity3.getIntent()) == null) {
                            return;
                        }
                        intent.setData(null);
                        return;
                    }
                    if (i6 != 2) {
                        if (i6 != 3) {
                            return;
                        }
                        MayaCardsFragment mayaCardsFragment2 = (MayaCardsFragment) ((B6.a) c2514b.c.get());
                        C1219h c1219h = mayaCardsFragment2.f10248Q;
                        EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
                        c1219h.j.put("from_deep_link", "true");
                        FragmentActivity activity4 = mayaCardsFragment2.getActivity();
                        if (activity4 == null || (intent3 = activity4.getIntent()) == null) {
                            return;
                        }
                        intent3.setData(null);
                        return;
                    }
                    if (c2514b.e.f11330b.getBoolean("key_can_link_card", true)) {
                        ((B6.a) c2514b.c.get()).getClass();
                        return;
                    }
                    ((MayaCardsFragment) ((B6.a) c2514b.c.get())).s1();
                    MayaCardsFragment mayaCardsFragment3 = (MayaCardsFragment) ((B6.a) c2514b.c.get());
                    C1219h c1219h2 = mayaCardsFragment3.f10248Q;
                    EnumC1212a enumC1212a4 = EnumC1212a.ACCOUNT_NUMBER;
                    c1219h2.j.put("from_deep_link", "true");
                    FragmentActivity activity5 = mayaCardsFragment3.getActivity();
                    if (activity5 == null || (intent2 = activity5.getIntent()) == null) {
                        return;
                    }
                    intent2.setData(null);
                    return;
                }
                return;
            case 24:
                Throwable p02 = (Throwable) obj;
                kotlin.jvm.internal.j.g(p02, "p0");
                C2516a c2516a = (C2516a) this.f18783b;
                c2516a.n(p02, new com.squareup.wire.internal.a(c2516a, 26));
                return;
        }
    }

    @Override // Ch.f
    public Object apply(Object obj) {
        ArrayList arrayList;
        CharSequence charSequenceSubSequence;
        p it = (p) obj;
        kotlin.jvm.internal.j.g(it, "it");
        EDD edd = (EDD) ((Lb.a) this.f18783b).h;
        if (edd == null) {
            kotlin.jvm.internal.j.n("mEDD");
            throw null;
        }
        List<String> alternativeIncomeSources = edd.getAlternativeIncomeSources();
        if (alternativeIncomeSources != null) {
            List<String> list = alternativeIncomeSources;
            Lb.a aVar = (Lb.a) this.f18783b;
            arrayList = new ArrayList(cj.t.l(list, 10));
            for (String string : list) {
                String string2 = ((EDDSubmissionReviewFragment) ((yd.k) aVar.c.get())).getString(R.string.pma_item_edd_others_prefix);
                kotlin.jvm.internal.j.f(string2, "getString(...)");
                if (C2576A.z(string, string2, false, 2)) {
                    int length = string2.length();
                    if (length < 0) {
                        throw new IndexOutOfBoundsException(s.g(length, "End index (", ") is less than start index (0)."));
                    }
                    if (length == 0) {
                        charSequenceSubSequence = string.subSequence(0, string.length());
                    } else {
                        StringBuilder sb2 = new StringBuilder(string.length() - length);
                        sb2.append((CharSequence) string, 0, 0);
                        sb2.append((CharSequence) string, length, string.length());
                        charSequenceSubSequence = sb2;
                    }
                    string = C2576A.b0(charSequenceSubSequence.toString()).toString();
                }
                arrayList.add(string);
            }
        } else {
            arrayList = null;
        }
        edd.setAlternativeIncomeSources(arrayList);
        EDD edd2 = (EDD) ((Lb.a) this.f18783b).h;
        if (edd2 == null) {
            kotlin.jvm.internal.j.n("mEDD");
            throw null;
        }
        Gh.c cVar = new Gh.c(1, 0);
        it.f(cVar);
        edd2.setFinancialDocuments((List) cVar.b());
        Lb.a aVar2 = (Lb.a) this.f18783b;
        O o8 = (O) aVar2.e;
        EDD edd3 = (EDD) aVar2.h;
        if (edd3 == null) {
            kotlin.jvm.internal.j.n("mEDD");
            throw null;
        }
        EDD eddCopy$default = EDD.copy$default(edd3, null, null, null, null, null, null, 63, null);
        List<String> alternativeIncomeSources2 = eddCopy$default.getAlternativeIncomeSources();
        if (alternativeIncomeSources2 == null || alternativeIncomeSources2.isEmpty()) {
            eddCopy$default.setAlternativeIncomeSources(r.c(((EDDSubmissionReviewFragment) ((yd.k) aVar2.c.get())).s1()));
        }
        List<String> banks = eddCopy$default.getBanks();
        if (banks == null || banks.isEmpty()) {
            eddCopy$default.setBanks(r.c(((EDDSubmissionReviewFragment) ((yd.k) aVar2.c.get())).s1()));
        }
        List<String> relatedCompanies = eddCopy$default.getRelatedCompanies();
        if (relatedCompanies == null || relatedCompanies.isEmpty()) {
            eddCopy$default.setRelatedCompanies(r.c(((EDDSubmissionReviewFragment) ((yd.k) aVar2.c.get())).s1()));
        }
        List<EDDFinancialDocument> financialDocuments = eddCopy$default.getFinancialDocuments();
        if (financialDocuments == null || financialDocuments.isEmpty()) {
            eddCopy$default.setFinancialDocuments(r.c(new EDDFinancialDocument("NOT_APPLICABLE", null, null, null, 12, null)));
        }
        o8.getClass();
        p<UpgradePlusReference> pVarSubmitEDDInformation = o8.f11377b.submitEDDInformation(eddCopy$default);
        kotlin.jvm.internal.j.f(pVarSubmitEDDInformation, "submitEDDInformation(...)");
        return pVarSubmitEDDInformation;
    }

    public void b(S s9) {
        String str;
        Iterator it = ((CopyOnWriteArrayList) this.f18783b).iterator();
        while (it.hasNext()) {
            zi.c cVar = (zi.c) ((WeakReference) it.next()).get();
            if (cVar != null) {
                cVar.f21451a.getClass();
                int i = s9.f865a;
                int iC = AbstractC2217b.c(i);
                AtomicBoolean atomicBoolean = cVar.c;
                yi.e eVar = cVar.h;
                wg.d dVar = cVar.f21455k;
                C2533a c2533a = cVar.j;
                switch (iC) {
                    case 0:
                        Ri.a.d("Push Subsystem Up event message received.");
                        zi.d dVar2 = cVar.f21452b;
                        dVar2.k();
                        dVar2.j();
                        dVar2.h();
                        c2533a.a();
                        cVar.e.set(false);
                        break;
                    case 1:
                        Ri.a.d("Push Subsystem Down event message received.");
                        cVar.a();
                        c2533a.a();
                        break;
                    case 2:
                        Ri.a.d("Push Subsystem recoverable error received.");
                        cVar.a();
                        if (!atomicBoolean.get()) {
                            c2533a.c();
                        }
                        break;
                    case 3:
                        Ri.a.d("Push Subsystem non recoverable error received.");
                        cVar.a();
                        c2533a.a();
                        eVar.c();
                        break;
                    case 4:
                        Ri.a.d("Push Subsystem Down event message received.");
                        cVar.a();
                        c2533a.a();
                        eVar.c();
                        break;
                    case 5:
                        Ri.a.d("Push Subsystem reset received.");
                        eVar.getClass();
                        Ri.a.d("Disconnecting down SSE client");
                        yi.h hVar = eVar.f21294g;
                        String str2 = hVar.c;
                        if (str2 != null) {
                            hVar.f21304a.k(str2);
                        }
                        yi.j jVar = eVar.f;
                        jVar.f21307a.k(jVar.c);
                        b1.t tVar = eVar.f21293d;
                        if (!((AtomicBoolean) tVar.e).getAndSet(true)) {
                            tVar.c();
                        }
                        if (!atomicBoolean.get()) {
                            c2533a.c();
                        }
                        break;
                    case 6:
                        if (dVar != null) {
                            Ri.a.p("Successful sync event received, updating last sync timestamp");
                            AtomicLong atomicLong = (AtomicLong) dVar.f;
                            ((C2333a) dVar.f20795g).getClass();
                            atomicLong.set(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()));
                        }
                        break;
                    case 7:
                        try {
                            C2440a c2440a = (C2440a) s9;
                            if (dVar != null) {
                                Ri.a.p("Streaming delay event received");
                                long j = c2440a.f20796b;
                                AtomicLong atomicLong2 = (AtomicLong) dVar.e;
                                atomicLong2.set(Math.max(j, ((AtomicLong) dVar.f20794d).get()));
                                Ri.a.p("Setting new max sync period: " + atomicLong2.get() + " seconds");
                            }
                        } catch (ClassCastException unused) {
                            Ri.a.q("Invalid streaming delay event received");
                        }
                        break;
                    default:
                        switch (i) {
                            case 1:
                                str = "PUSH_SUBSYSTEM_UP";
                                break;
                            case 2:
                                str = "PUSH_SUBSYSTEM_DOWN";
                                break;
                            case 3:
                                str = "PUSH_RETRYABLE_ERROR";
                                break;
                            case 4:
                                str = "PUSH_NON_RETRYABLE_ERROR";
                                break;
                            case 5:
                                str = "PUSH_DISABLED";
                                break;
                            case 6:
                                str = "PUSH_RESET";
                                break;
                            case 7:
                                str = "SUCCESSFUL_SYNC";
                                break;
                            case 8:
                                str = "PUSH_DELAY_RECEIVED";
                                break;
                            default:
                                str = "null";
                                break;
                        }
                        Ri.a.g("Invalid SSE event received: ".concat(str));
                        break;
                }
            }
        }
    }

    public JSONObject c() throws Throwable {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File file = (File) this.f18783b;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(h2.f.i(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e) {
                        e = e;
                        Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                        h2.f.b(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    h2.f.b(fileInputStream2, "Error while closing settings cache file.");
                    throw th;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            h2.f.b(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e7) {
            e = e7;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            h2.f.b(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    @Override // W6.e
    public void onDismiss() {
        ((MayaErrorDialogFragment) this.f18783b).dismiss();
    }

    @Override // hh.InterfaceC1568a
    public void run() {
        ((ch.r) this.f18783b).onComplete();
    }

    public C1967a() {
        this.f18782a = 22;
        this.f18783b = new CopyOnWriteArrayList();
    }

    public C1967a(C1915b c1915b) {
        this.f18782a = 3;
        this.f18783b = new File((File) c1915b.f18588d, "com.crashlytics.settings.json");
    }
}
