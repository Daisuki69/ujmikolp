package G6;

import D8.C0214w;
import E8.D;
import G5.y;
import L6.E;
import L9.C0323a;
import L9.C0325c;
import M8.T2;
import U2.A;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AlertDialog;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import cg.InterfaceC1101b;
import cj.C1110A;
import com.airbnb.lottie.LottieAnimationView;
import com.dynatrace.android.agent.events.eventsapi.EventMetricsAggregator;
import com.google.firebase.perf.metrics.Counter;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.PerfSession;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.paymaya.PayMayaApplication;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.ContactReferencePatchResponse;
import com.paymaya.domain.model.CreditAccount;
import com.paymaya.domain.model.CreditServiceFee;
import com.paymaya.domain.model.CreditTransactionItem;
import com.paymaya.domain.model.DeviceInformationResponse;
import com.paymaya.domain.model.MerchantPaymentV2;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.RiskChallenge;
import com.paymaya.domain.model.ShareSaveAppInfo;
import com.paymaya.domain.store.C1294y;
import com.paymaya.mayaui.cashin.view.activity.impl.MayaCashInActivity;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaCashInCodeFragment;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaVaultedCardsFragment;
import com.paymaya.mayaui.common.view.dialog.impl.MayaShareSaveDialogFragment;
import com.paymaya.mayaui.common.view.fragment.impl.MayaSessionExpiredFragment;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaDashboardFragment;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaWalletFragment;
import com.paymaya.mayaui.dataprivacy.view.dialog.impl.MayaDataPrivacyDialogFragment;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaV2MerchantPaymentReceiptFragment;
import com.paymaya.mayaui.missions.view.fragment.impl.MayaMissionsInProgressFragment;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditAssignContactReferenceFragment;
import com.paymaya.mayaui.qr.view.activity.impl.MayaQRActivity;
import com.paymaya.mayaui.qr.view.fragment.impl.MayaMLKitQRScannerFragment;
import com.paymaya.mayaui.qr.view.fragment.impl.MayaQRScannerFragment;
import com.paymaya.mayaui.settings.view.activity.impl.MayaSettingsActivity;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaAccountRecoveryFragment;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaChangeMinFragment;
import com.paymaya.mayaui.xp.view.fragment.MayaXpEntryFragment;
import com.paymaya.ui.common.view.fragment.impl.WebFragment;
import d4.AbstractC1331a;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import mx_android.support.v7.media.MediaRouteProviderProtocol;
import o1.AbstractC1955a;
import v.AbstractC2329d;
import zj.z;

/* JADX INFO: loaded from: classes4.dex */
public final class r implements Ch.c, t4.j, W6.d, y, W6.e, InterfaceC1101b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1812b;

    public /* synthetic */ r(Object obj, int i) {
        this.f1811a = i;
        this.f1812b = obj;
    }

    private final void f() {
    }

    private final void g() {
    }

    public A a() {
        List listUnmodifiableList;
        U2.x xVarL = A.L();
        xVarL.n(((Trace) this.f1812b).f9852d);
        xVarL.l(((Trace) this.f1812b).f9854k.f9858a);
        Trace trace = (Trace) this.f1812b;
        xVarL.m(trace.f9854k.b(trace.f9855l));
        for (Counter counter : ((Trace) this.f1812b).e.values()) {
            xVarL.k(counter.f9849b.get(), counter.f9848a);
        }
        ArrayList arrayList = ((Trace) this.f1812b).h;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                xVarL.j(new r((Trace) it.next(), 22).a());
            }
        }
        Map<String, String> attributes = ((Trace) this.f1812b).getAttributes();
        xVarL.i();
        A.w((A) xVarL.f10116b).putAll(attributes);
        Trace trace2 = (Trace) this.f1812b;
        synchronized (trace2.f9853g) {
            try {
                ArrayList arrayList2 = new ArrayList();
                for (PerfSession perfSession : trace2.f9853g) {
                    if (perfSession != null) {
                        arrayList2.add(perfSession);
                    }
                }
                listUnmodifiableList = Collections.unmodifiableList(arrayList2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        U2.w[] wVarArrB = PerfSession.b(listUnmodifiableList);
        if (wVarArrB != null) {
            List listAsList = Arrays.asList(wVarArrB);
            xVarL.i();
            A.y((A) xVarL.f10116b, listAsList);
        }
        return (A) xVarL.g();
    }

    @Override // Ch.c
    public void accept(Object obj) {
        MayaAccountRecoveryFragment mayaAccountRecoveryFragment;
        Sb.g gVar;
        int i = 2;
        int i4 = 0;
        int i6 = 1;
        switch (this.f1811a) {
            case 0:
                s sVar = (s) this.f1812b;
                PayMayaError payMayaErrorF = sVar.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF, "mayaErrorHandling(...)");
                sVar.l(payMayaErrorF);
                return;
            case 1:
                C0214w c0214w = (C0214w) this.f1812b;
                PayMayaError payMayaErrorF2 = c0214w.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF2, "mayaErrorHandling(...)");
                if (payMayaErrorF2.isSessionTimeout()) {
                    return;
                }
                if (!payMayaErrorF2.isNetworkError()) {
                    MayaVaultedCardsFragment mayaVaultedCardsFragment = (MayaVaultedCardsFragment) ((K6.n) c0214w.c.get());
                    mayaVaultedCardsFragment.getClass();
                    MayaBaseLoadingFragment.N1(mayaVaultedCardsFragment, 200, null, null, new E(mayaVaultedCardsFragment, i6), 28);
                    return;
                } else {
                    K6.n nVar = (K6.n) c0214w.c.get();
                    String strMSpiel = payMayaErrorF2.mSpiel();
                    MayaVaultedCardsFragment mayaVaultedCardsFragment2 = (MayaVaultedCardsFragment) nVar;
                    mayaVaultedCardsFragment2.getClass();
                    MayaBaseLoadingFragment.N1(mayaVaultedCardsFragment2, 100, strMSpiel, null, new E(mayaVaultedCardsFragment2, i6), 28);
                    return;
                }
            case 2:
                MayaDashboardFragment mayaDashboardFragment = (MayaDashboardFragment) this.f1812b;
                Iterator it = mayaDashboardFragment.f12167g0.iterator();
                while (it.hasNext()) {
                    mayaDashboardFragment.G1().x((pg.t) it.next());
                }
                mayaDashboardFragment.f12167g0.clear();
                return;
            case 3:
            case 4:
            case 8:
            case 11:
            case 19:
            case 20:
            case 22:
            case 23:
            case 24:
            case 25:
            case 27:
            default:
                List p02 = (List) obj;
                kotlin.jvm.internal.j.g(p02, "p0");
                Q6.p pVar = (Q6.p) this.f1812b;
                pVar.getClass();
                String strS1 = ((MayaShareSaveDialogFragment) ((V6.f) pVar.c.get())).s1();
                Intent intent = ((MayaShareSaveDialogFragment) ((V6.f) pVar.c.get())).f11889W;
                if (intent == null) {
                    kotlin.jvm.internal.j.n("intent");
                    throw null;
                }
                String type = intent.getType();
                if (strS1 == null || type == null || !z.w(type, 2, "image", false)) {
                    ((MayaShareSaveDialogFragment) ((V6.f) pVar.c.get())).v1(p02);
                } else {
                    ArrayList arrayListW = C1110A.W(p02);
                    arrayListW.add(0, ShareSaveAppInfo.Companion.getSAVE_IMAGE());
                    ((MayaShareSaveDialogFragment) ((V6.f) pVar.c.get())).v1(arrayListW);
                }
                Dialog dialog = ((MayaShareSaveDialogFragment) ((V6.f) pVar.c.get())).getDialog();
                if (dialog != null) {
                    dialog.show();
                    return;
                }
                return;
            case 5:
                Ze.a permission = (Ze.a) obj;
                kotlin.jvm.internal.j.g(permission, "permission");
                Ja.b bVar = (Ja.b) this.f1812b;
                if (permission.f6934b) {
                    ((MayaMLKitQRScannerFragment) ((Ma.a) bVar.c.get())).L1();
                    return;
                } else {
                    ((MayaMLKitQRScannerFragment) ((Ma.a) bVar.c.get())).K1(R.string.maya_label_allow_permission_storage_title, R.string.maya_label_allow_permission_storage_description);
                    return;
                }
            case 6:
                MerchantPaymentV2 merchantPaymentV2 = (MerchantPaymentV2) obj;
                A7.j jVar = (A7.j) this.f1812b;
                y5.s sVar2 = (Ma.b) jVar.c.get();
                C1219h c1219hH = AbstractC2329d.h(14);
                c1219hH.t(EnumC1217f.CREATE);
                c1219hH.i();
                ((MayaBaseFragment) sVar2).A1(c1219hH);
                if (merchantPaymentV2 != null) {
                    String status = merchantPaymentV2.getStatus();
                    Locale locale = Locale.getDefault();
                    kotlin.jvm.internal.j.f(locale, "getDefault(...)");
                    String upperCase = status.toUpperCase(locale);
                    kotlin.jvm.internal.j.f(upperCase, "toUpperCase(...)");
                    int iHashCode = upperCase.hashCode();
                    if (iHashCode == 74702359 ? upperCase.equals("REFUNDED") : iHashCode == 733698236 ? upperCase.equals("FAILED_FULFILLMENT") : iHashCode == 2045206500 && upperCase.equals("FAILED_PAYMENT")) {
                        MayaQRScannerFragment mayaQRScannerFragment = (MayaQRScannerFragment) ((Ma.b) jVar.c.get());
                        Na.i iVar = mayaQRScannerFragment.f13610k0;
                        if (iVar != null) {
                            M2.b.Z(0, mayaQRScannerFragment.getString(R.string.maya_merchant_payment_error_title), mayaQRScannerFragment.getString(R.string.maya_merchant_payment_error_subtitle_refund), null, null, false, null, null, false, TypedValues.PositionType.TYPE_SIZE_PERCENT).show(((MayaQRActivity) iVar).getSupportFragmentManager(), "error_dialog");
                            return;
                        }
                        return;
                    }
                    Na.i iVar2 = ((MayaQRScannerFragment) ((Ma.b) jVar.c.get())).f13610k0;
                    if (iVar2 != null) {
                        MayaV2MerchantPaymentReceiptFragment mayaV2MerchantPaymentReceiptFragment = new MayaV2MerchantPaymentReceiptFragment();
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("merchant_payment_v2", merchantPaymentV2);
                        mayaV2MerchantPaymentReceiptFragment.setArguments(bundle);
                        AbstractC1236z.g((MayaQRActivity) iVar2, R.id.fragment_container, mayaV2MerchantPaymentReceiptFragment);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                Bb.f fVar = (Bb.f) this.f1812b;
                PayMayaError payMayaErrorF3 = fVar.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF3, "mayaErrorHandling(...)");
                if (payMayaErrorF3.mStatusCode() == 424) {
                    ConstraintLayout constraintLayout = ((MayaXpEntryFragment) ((Lc.a) fVar.c.get())).f14339d0;
                    if (constraintLayout == null) {
                        kotlin.jvm.internal.j.n("mMaintenanceView");
                        throw null;
                    }
                    constraintLayout.setVisibility(0);
                    ((MayaXpEntryFragment) ((Lc.a) fVar.c.get())).G1();
                    ConstraintLayout constraintLayout2 = ((MayaXpEntryFragment) ((Lc.a) fVar.c.get())).f14336a0;
                    if (constraintLayout2 != null) {
                        constraintLayout2.setVisibility(8);
                        return;
                    } else {
                        kotlin.jvm.internal.j.n("mContentView");
                        throw null;
                    }
                }
                ConstraintLayout constraintLayout3 = ((MayaXpEntryFragment) ((Lc.a) fVar.c.get())).f14338c0;
                if (constraintLayout3 == null) {
                    kotlin.jvm.internal.j.n("mErrorView");
                    throw null;
                }
                constraintLayout3.setVisibility(0);
                ConstraintLayout constraintLayout4 = ((MayaXpEntryFragment) ((Lc.a) fVar.c.get())).f14336a0;
                if (constraintLayout4 == null) {
                    kotlin.jvm.internal.j.n("mContentView");
                    throw null;
                }
                constraintLayout4.setVisibility(8);
                ConstraintLayout constraintLayout5 = ((MayaXpEntryFragment) ((Lc.a) fVar.c.get())).f14339d0;
                if (constraintLayout5 != null) {
                    constraintLayout5.setVisibility(8);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mMaintenanceView");
                    throw null;
                }
            case 9:
                kotlin.jvm.internal.j.g((RiskChallenge) obj, "it");
                ((C0325c) this.f1812b).m();
                return;
            case 10:
                Throwable it2 = (Throwable) obj;
                kotlin.jvm.internal.j.g(it2, "it");
                A7.j jVar2 = (A7.j) this.f1812b;
                PayMayaError payMayaErrorF4 = jVar2.f(it2, true);
                kotlin.jvm.internal.j.f(payMayaErrorF4, "mayaErrorHandling(...)");
                jVar2.a0(payMayaErrorF4);
                jVar2.F(payMayaErrorF4, it2);
                return;
            case 12:
                kotlin.jvm.internal.j.g((ContactReferencePatchResponse) obj, "it");
                ((L9.o) this.f1812b).k();
                return;
            case 13:
                Ze.a p03 = (Ze.a) obj;
                kotlin.jvm.internal.j.g(p03, "p0");
                L9.q qVar = (L9.q) this.f1812b;
                qVar.getClass();
                if (p03.f6934b) {
                    qVar.l();
                    return;
                }
                NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment = (NewMayaCreditAssignContactReferenceFragment) ((P9.h) qVar.c.get());
                if (AbstractC1955a.v(newMayaCreditAssignContactReferenceFragment.getActivity(), "android.permission.READ_CONTACTS")) {
                    new AlertDialog.Builder(newMayaCreditAssignContactReferenceFragment.requireActivity()).setTitle(R.string.maya_label_credit_contact_permission_title).setMessage(R.string.maya_label_credit_contact_permission_message).setNegativeButton(R.string.maya_label_cancel, new E8.E(i6)).setPositiveButton(R.string.maya_label_settings, new D(newMayaCreditAssignContactReferenceFragment, i)).create().show();
                    return;
                }
                return;
            case 14:
                CreditAccount it3 = (CreditAccount) obj;
                kotlin.jvm.internal.j.g(it3, "it");
                k kVar = (k) this.f1812b;
                kVar.getClass();
                C1294y c1294y = (C1294y) kVar.i;
                Ah.p<CreditServiceFee> creditServiceFee = c1294y.f11502d.a(A5.b.f71P) ? c1294y.c.getCreditServiceFee(T2.v(EventMetricsAggregator.OS_NAME.toLowerCase(), UUID.randomUUID().toString())) : c1294y.f11501b.getCreditServiceFee();
                kVar.e(new Lh.d(new Lh.d(AbstractC1331a.l(creditServiceFee, creditServiceFee, zh.b.a()), new A7.f(29, kVar, it3), i), new Gc.h(kVar, 11), i4).e());
                return;
            case 15:
                A7.j jVar3 = (A7.j) this.f1812b;
                PayMayaError payMayaErrorF5 = jVar3.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF5, "mayaErrorHandling(...)");
                ((MayaBaseFragment) ((Rb.b) jVar3.c.get())).w1();
                if (payMayaErrorF5.isSessionTimeout() || (gVar = (mayaAccountRecoveryFragment = (MayaAccountRecoveryFragment) ((Rb.b) jVar3.c.get())).f13923c0) == null) {
                    return;
                }
                ((MayaSettingsActivity) gVar).b2(payMayaErrorF5, mayaAccountRecoveryFragment.getString(R.string.maya_label_thats_not_it));
                return;
            case 16:
                Lb.d dVar = (Lb.d) this.f1812b;
                PayMayaError payMayaErrorF6 = dVar.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF6, "mayaErrorHandling(...)");
                dVar.k(payMayaErrorF6);
                return;
            case 17:
                DeviceInformationResponse p04 = (DeviceInformationResponse) obj;
                kotlin.jvm.internal.j.g(p04, "p0");
                ((A7.j) this.f1812b).c0(p04);
                return;
            case 18:
                C0323a c0323a = (C0323a) this.f1812b;
                PayMayaError payMayaErrorF7 = c0323a.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF7, "mayaErrorHandling(...)");
                c0323a.y(payMayaErrorF7);
                return;
            case 21:
                List consents = (List) obj;
                kotlin.jvm.internal.j.g(consents, "consents");
                MayaDataPrivacyDialogFragment mayaDataPrivacyDialogFragment = (MayaDataPrivacyDialogFragment) ((P7.a) ((M7.c) this.f1812b).c.get());
                mayaDataPrivacyDialogFragment.getClass();
                Q7.a aVar = mayaDataPrivacyDialogFragment.f12266R;
                if (aVar != null) {
                    aVar.b(mayaDataPrivacyDialogFragment.n1(), C1110A.W(consents));
                    return;
                }
                return;
            case 26:
                Pc.g gVar2 = (Pc.g) this.f1812b;
                PayMayaError payMayaErrorF8 = gVar2.f((Throwable) obj, false);
                kotlin.jvm.internal.j.f(payMayaErrorF8, "paymayaErrorHandling(...)");
                ((WebFragment) ((Vc.c) gVar2.c.get())).setHasOptionsMenu(false);
                if (payMayaErrorF8.isSessionTimeout()) {
                    gVar2.f5157g = true;
                    return;
                } else if (!payMayaErrorF8.isNetworkError()) {
                    ((WebFragment) ((Vc.c) gVar2.c.get())).C1();
                    return;
                } else {
                    WebFragment webFragment = (WebFragment) ((Vc.c) gVar2.c.get());
                    webFragment.y1(100, webFragment.getString(R.string.pma_dialog_error_server_default_message_web), new Wc.d(webFragment, i4));
                    return;
                }
            case 28:
                Q6.o oVar = (Q6.o) this.f1812b;
                PayMayaError payMayaErrorF9 = oVar.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF9, "mayaErrorHandling(...)");
                y5.s sVar3 = (X6.f) oVar.c.get();
                C1219h c1219hH2 = AbstractC2329d.h(12);
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                c1219hH2.j.put(Constants.REASON, payMayaErrorF9.mSpiel());
                c1219hH2.f11206k.put(MediaRouteProviderProtocol.SERVICE_DATA_ERROR, payMayaErrorF9.mThrowableMessage());
                c1219hH2.i();
                ((MayaBaseFragment) sVar3).A1(c1219hH2);
                ((MayaSessionExpiredFragment) ((X6.f) oVar.c.get())).N1(payMayaErrorF9);
                return;
        }
    }

    @Override // G5.y
    public void b() {
        M6.i iVar = (M6.i) this.f1812b;
        iVar.e.setVisibility(8);
        ConstraintLayout constraintLayout = iVar.f3114g;
        constraintLayout.setBackground(ContextCompat.getDrawable(constraintLayout.getContext(), R.drawable.maya_bg_color_grey_slide_highlight_rounded));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x039d, code lost:
    
        throw com.google.zxing.FormatException.a();
     */
    /* JADX WARN: Removed duplicated region for block: B:504:0x03c3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:505:? A[LOOP:15: B:206:0x0354->B:505:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public K3.d c(K3.b r25) throws com.google.zxing.ChecksumException, com.google.zxing.FormatException {
        /*
            Method dump skipped, instruction units count: 1760
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: G6.r.c(K3.b):K3.d");
    }

    @Override // G5.y
    public void d() {
        M6.i iVar = (M6.i) this.f1812b;
        iVar.e.setVisibility(0);
        ConstraintLayout constraintLayout = iVar.f3114g;
        constraintLayout.setBackground(ContextCompat.getDrawable(constraintLayout.getContext(), R.drawable.maya_bg_solid_round_primary_content));
    }

    public void e(int i, int[] iArr) {
        int[] iArr2;
        M3.a aVar;
        int[] iArr3;
        int i4;
        int i6 = 1;
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        int length = iArr.length;
        if (length <= 1 || iArr[0] != 0) {
            iArr2 = iArr;
        } else {
            int i10 = 1;
            while (i10 < length && iArr[i10] == 0) {
                i10++;
            }
            if (i10 == length) {
                iArr2 = new int[]{0};
            } else {
                int i11 = length - i10;
                int[] iArr4 = new int[i11];
                System.arraycopy(iArr, i10, iArr4, 0, i11);
                iArr2 = iArr4;
            }
        }
        int[] iArr5 = new int[i];
        int i12 = 0;
        boolean z4 = true;
        while (true) {
            aVar = (M3.a) this.f1812b;
            if (i12 >= i) {
                break;
            }
            int i13 = aVar.f3053a[aVar.f3056g + i12];
            if (i13 == 0) {
                i4 = iArr2[iArr2.length - 1];
            } else if (i13 == 1) {
                int i14 = 0;
                for (int i15 : iArr2) {
                    M3.a aVar2 = M3.a.h;
                    i14 ^= i15;
                }
                i4 = i14;
            } else {
                int iC = iArr2[0];
                int length2 = iArr2.length;
                for (int i16 = 1; i16 < length2; i16++) {
                    iC = aVar.c(i13, iC) ^ iArr2[i16];
                }
                i4 = iC;
            }
            iArr5[(i - 1) - i12] = i4;
            if (i4 != 0) {
                z4 = false;
            }
            i12++;
        }
        if (z4) {
            return;
        }
        M3.b bVar = new M3.b(aVar, iArr5);
        M3.b bVarA = aVar.a(i, 1);
        if (bVarA.d() >= bVar.d()) {
            bVarA = bVar;
            bVar = bVarA;
        }
        M3.b bVar2 = aVar.c;
        M3.b bVar3 = aVar.f3055d;
        M3.b bVar4 = bVarA;
        M3.b bVarA2 = bVar;
        M3.b bVar5 = bVar4;
        M3.b bVar6 = bVar2;
        while (bVar5.d() >= i / 2) {
            if (bVar5.e()) {
                throw new ReedSolomonException("r_{i-1} was zero");
            }
            int iB = aVar.b(bVar5.c(bVar5.d()));
            M3.b bVarA3 = bVar2;
            while (bVarA2.d() >= bVar5.d() && !bVarA2.e()) {
                int iD = bVarA2.d() - bVar5.d();
                int iC2 = aVar.c(bVarA2.c(bVarA2.d()), iB);
                bVarA3 = bVarA3.a(aVar.a(iD, iC2));
                bVarA2 = bVarA2.a(bVar5.h(iD, iC2));
                i6 = i6;
            }
            int i17 = i6;
            M3.b bVarA4 = bVarA3.g(bVar3).a(bVar6);
            if (bVarA2.d() >= bVar5.d()) {
                throw new IllegalStateException("Division algorithm failed to reduce polynomial?");
            }
            M3.b bVar7 = bVarA2;
            bVarA2 = bVar5;
            bVar5 = bVar7;
            bVar6 = bVar3;
            bVar3 = bVarA4;
            i6 = i17;
        }
        int i18 = i6;
        int iC3 = bVar3.c(0);
        if (iC3 == 0) {
            throw new ReedSolomonException("sigmaTilde(0) was zero");
        }
        int iB2 = aVar.b(iC3);
        M3.b bVarF = bVar3.f(iB2);
        M3.b bVarF2 = bVar5.f(iB2);
        M3.b[] bVarArr = new M3.b[2];
        bVarArr[0] = bVarF;
        bVarArr[i18] = bVarF2;
        M3.b bVar8 = bVarArr[0];
        M3.b bVar9 = bVarArr[i18];
        int iD2 = bVar8.d();
        if (iD2 == i18) {
            iArr3 = new int[]{bVar8.c(i18)};
        } else {
            int[] iArr6 = new int[iD2];
            int i19 = 0;
            for (int i20 = 1; i20 < aVar.e && i19 < iD2; i20++) {
                if (bVar8.b(i20) == 0) {
                    iArr6[i19] = aVar.b(i20);
                    i19++;
                }
            }
            if (i19 != iD2) {
                throw new ReedSolomonException("Error locator degree does not match number of roots");
            }
            iArr3 = iArr6;
        }
        int length3 = iArr3.length;
        int[] iArr7 = new int[length3];
        for (int i21 = 0; i21 < length3; i21++) {
            int iB3 = aVar.b(iArr3[i21]);
            int iC4 = 1;
            for (int i22 = 0; i22 < length3; i22++) {
                if (i21 != i22) {
                    int iC5 = aVar.c(iArr3[i22], iB3);
                    iC4 = aVar.c(iC4, (iC5 & 1) == 0 ? iC5 | 1 : iC5 & (-2));
                }
            }
            int iC6 = aVar.c(bVar9.b(iB3), aVar.b(iC4));
            iArr7[i21] = iC6;
            if (aVar.f3056g != 0) {
                iArr7[i21] = aVar.c(iC6, iB3);
            }
        }
        for (int i23 = 0; i23 < iArr3.length; i23++) {
            int length4 = iArr.length - 1;
            int i24 = iArr3[i23];
            if (i24 == 0) {
                throw new IllegalArgumentException();
            }
            int i25 = length4 - aVar.f3054b[i24];
            if (i25 < 0) {
                throw new ReedSolomonException("Bad error location");
            }
            iArr[i25] = iArr[i25] ^ iArr7[i23];
        }
    }

    @Override // aj.InterfaceC0716a
    public Object get() {
        return (PayMayaApplication) ((v) this.f1812b).f1820b;
    }

    public void h(CreditTransactionItem creditTransactionItem, boolean z4, boolean z5) {
        String string;
        S9.b bVar = (S9.b) this.f1812b;
        Context context = bVar.h;
        String string2 = context.getString(R.string.maya_php_currency);
        kotlin.jvm.internal.j.f(string2, "getString(...)");
        if (z5) {
            string = creditTransactionItem.getFormattedValue();
        } else {
            string = context.getString(R.string.maya_label_masked_amount);
            kotlin.jvm.internal.j.f(string, "getString(...)");
        }
        String amount = (z4 ? "" : "- ") + string2 + string;
        kotlin.jvm.internal.j.g(amount, "amount");
        bVar.e.setText(amount);
    }

    @Override // t4.j
    public void i() {
        int i = this.f1811a;
    }

    @Override // W6.d
    public void onClose() {
        L6.n nVar = ((MayaCashInCodeFragment) this.f1812b).f11680p0;
        if (nVar != null) {
            AbstractC1236z.c((MayaCashInActivity) nVar);
        }
    }

    @Override // W6.e
    public void onDismiss() {
        int i = MayaSettingsActivity.f13839r;
        MayaSettingsActivity mayaSettingsActivity = (MayaSettingsActivity) this.f1812b;
        mayaSettingsActivity.getClass();
        AbstractC1236z.e(mayaSettingsActivity, MayaChangeMinFragment.class, false);
    }

    @Override // t4.j
    public void onRefresh() {
        switch (this.f1811a) {
            case 3:
                MayaWalletFragment mayaWalletFragment = (MayaWalletFragment) this.f1812b;
                ((A7.A) mayaWalletFragment.P1()).m(true);
                LottieAnimationView lottieAnimationView = mayaWalletFragment.N0;
                if (lottieAnimationView != null) {
                    lottieAnimationView.d();
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mLottieView");
                    throw null;
                }
            default:
                MayaMissionsInProgressFragment mayaMissionsInProgressFragment = (MayaMissionsInProgressFragment) this.f1812b;
                mayaMissionsInProgressFragment.P1().l();
                LottieAnimationView lottieAnimationView2 = mayaMissionsInProgressFragment.t0;
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.d();
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mLottieView");
                    throw null;
                }
        }
    }

    public r() {
        this.f1811a = 24;
        this.f1812b = new r(M3.a.m, 19);
    }
}
