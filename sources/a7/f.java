package A7;

import Bg.b0;
import Bj.C0151l;
import Bj.C0153m;
import D.C0171d;
import D.CallableC0170c;
import D.CallableC0183p;
import D.J;
import D.S;
import D.X;
import D.Z;
import L9.B;
import L9.D;
import M8.T2;
import N5.F;
import android.content.Context;
import android.util.Log;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.exoplayer.upstream.CmcdData;
import bg.AbstractC0983W;
import bj.AbstractC1039j;
import bj.C1037h;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.dynatrace.android.agent.events.eventsapi.EventMetricsAggregator;
import com.dynatrace.android.callback.OkCallback;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.zxing.NotFoundException;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.AbstractC1234x;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.utility.i0;
import com.paymaya.domain.model.CreditAccount;
import com.paymaya.domain.model.CreditContactReferenceResponse;
import com.paymaya.domain.model.CreditServiceFee;
import com.paymaya.domain.model.MFAChallengeVerificationResult;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.PersonalDetailsData;
import com.paymaya.domain.model.QRPHMerchantPaymentRequest;
import com.paymaya.domain.model.Transfer;
import com.paymaya.domain.model.TransferToken;
import com.paymaya.domain.model.Voucher;
import com.paymaya.domain.store.C1264i0;
import com.paymaya.domain.store.C1292x;
import com.paymaya.domain.store.H;
import com.paymaya.domain.store.V0;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaDashboardFragment;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.MayaCreditTransferFragment;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditActivationConfirmDetailFragment;
import com.paymaya.mayaui.qr.view.activity.impl.MayaQRActivity;
import com.paymaya.mayaui.qr.view.fragment.impl.MayaMLKitQRScannerFragment;
import com.paymaya.mayaui.vouchers.view.fragment.impl.MayaVouchersPageFragment;
import d4.AbstractC1331a;
import dOYHB6.lBzGT9.pYp6Y3;
import io.flutter.plugins.firebase.crashlytics.Constants;
import io.ktor.client.engine.okhttp.StreamAdapterIOException;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.split.android.client.storage.db.GeneralInfoDao;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.net.SocketTimeoutException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;
import n2.C1915b;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import org.joda.time.Instant;
import org.json.JSONException;
import org.json.JSONObject;
import s.AbstractC2217b;
import tj.InterfaceC2288a;
import v.AbstractC2329d;
import w.C2360b;
import w.C2361c;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements H, Callback, Ch.c, InstallReferrerStateListener, X, F1.c, OnCompleteListener, Fg.g, Ah.q, Ah.b, InterfaceC2288a, Ji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f210b;
    public Object c;

    public /* synthetic */ f(int i, Object obj, Object obj2) {
        this.f209a = i;
        this.f210b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static A7.f c(android.content.Context r5) {
        /*
            java.lang.String r0 = "generatefid.lock"
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch: java.nio.channels.OverlappingFileLockException -> L2f java.lang.Error -> L33 java.io.IOException -> L35
            java.io.File r5 = r5.getFilesDir()     // Catch: java.nio.channels.OverlappingFileLockException -> L2f java.lang.Error -> L33 java.io.IOException -> L35
            r2.<init>(r5, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L2f java.lang.Error -> L33 java.io.IOException -> L35
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch: java.nio.channels.OverlappingFileLockException -> L2f java.lang.Error -> L33 java.io.IOException -> L35
            java.lang.String r0 = "rw"
            r5.<init>(r2, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L2f java.lang.Error -> L33 java.io.IOException -> L35
            java.nio.channels.FileChannel r5 = r5.getChannel()     // Catch: java.nio.channels.OverlappingFileLockException -> L2f java.lang.Error -> L33 java.io.IOException -> L35
            java.nio.channels.FileLock r0 = r5.lock()     // Catch: java.nio.channels.OverlappingFileLockException -> L28 java.lang.Error -> L2b java.io.IOException -> L2d
            A7.f r2 = new A7.f     // Catch: java.nio.channels.OverlappingFileLockException -> L22 java.lang.Error -> L24 java.io.IOException -> L26
            r3 = 5
            r2.<init>(r3, r5, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L22 java.lang.Error -> L24 java.io.IOException -> L26
            return r2
        L22:
            r2 = move-exception
            goto L37
        L24:
            r2 = move-exception
            goto L37
        L26:
            r2 = move-exception
            goto L37
        L28:
            r2 = move-exception
        L29:
            r0 = r1
            goto L37
        L2b:
            r2 = move-exception
            goto L29
        L2d:
            r2 = move-exception
            goto L29
        L2f:
            r2 = move-exception
        L30:
            r5 = r1
            r0 = r5
            goto L37
        L33:
            r2 = move-exception
            goto L30
        L35:
            r2 = move-exception
            goto L30
        L37:
            java.lang.String r3 = "CrossProcessLock"
            java.lang.String r4 = "encountered error while creating and acquiring the lock, ignoring"
            android.util.Log.e(r3, r4, r2)
            if (r0 == 0) goto L43
            r0.release()     // Catch: java.io.IOException -> L43
        L43:
            if (r5 == 0) goto L48
            r5.close()     // Catch: java.io.IOException -> L48
        L48:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: A7.f.c(android.content.Context):A7.f");
    }

    private final void i(Task task) {
        F1.q qVar = (F1.q) this.f210b;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
        synchronized (qVar.f) {
            qVar.e.remove(taskCompletionSource);
        }
    }

    @Override // Ah.q, Ah.b
    public void a(io.reactivex.rxjava3.disposables.b bVar) {
        switch (this.f209a) {
            case 16:
                Dh.a.c((AtomicReference) this.f210b, bVar);
                break;
            case 17:
                Dh.a.c((Gh.d) this.f210b, bVar);
                break;
            default:
                ((Ah.b) this.f210b).a(bVar);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ch.c
    public void accept(Object obj) {
        Ah.p<CreditContactReferenceResponse> creditContactReference;
        int i = 2;
        char c = 1;
        char c10 = 1;
        int i4 = 0;
        switch (this.f209a) {
            case 3:
                kotlin.jvm.internal.j.g((MFAChallengeVerificationResult) obj, "it");
                Bb.o oVar = (Bb.o) this.f210b;
                oVar.getClass();
                TransferToken transferTokenMTransferToken = ((Transfer) this.c).mTransferToken();
                String strMId = transferTokenMTransferToken != null ? transferTokenMTransferToken.mId() : null;
                String strB = i0.b();
                String strH = oVar.e.h();
                V0 v02 = oVar.f417d;
                v02.getClass();
                Ah.p<Transfer> pVarExecuteP2PTransferV3WithTransferId = v02.f11400b.executeP2PTransferV3WithTransferId(strMId, Je.d.a(new byte[0]), strB, strH, "2.153.0", "android");
                oVar.e(new Lh.d(new Lh.d(AbstractC1331a.l(pVarExecuteP2PTransferV3WithTransferId, pVarExecuteP2PTransferV3WithTransferId, zh.b.a()), new A5.l(oVar, 8), i), new C2360b(oVar, 9), i4).e());
                return;
            case 15:
                Ze.a permission = (Ze.a) obj;
                kotlin.jvm.internal.j.g(permission, "permission");
                Cc.a aVarP1 = ((MayaVouchersPageFragment) this.f210b).P1();
                Voucher voucher = (Voucher) this.c;
                boolean z4 = permission.f6934b;
                Dc.d dVar = (Dc.d) aVarP1;
                kotlin.jvm.internal.j.g(voucher, "voucher");
                if (!z4) {
                    ((MayaVouchersPageFragment) ((Fc.d) dVar.c.get())).T1();
                    ((MayaVouchersPageFragment) ((Fc.d) dVar.c.get())).S1(voucher);
                    return;
                }
                MayaVouchersPageFragment mayaVouchersPageFragment = (MayaVouchersPageFragment) ((Fc.d) dVar.c.get());
                mayaVouchersPageFragment.getClass();
                long millis = AbstractC1234x.b(voucher.mEndDate()).getMillis();
                String string = mayaVouchersPageFragment.getString(R.string.maya_label_format_voucher_calendar_reminder_description_link, We.s.l("<div><a href=\"paymaya://vouchers?code=", voucher.mCode(), "\">paymaya://vouchers?code=", voucher.mCode(), "</a></div>"));
                kotlin.jvm.internal.j.f(string, "getString(...)");
                Context contextRequireContext = mayaVouchersPageFragment.requireContext();
                kotlin.jvm.internal.j.f(contextRequireContext, "requireContext(...)");
                Long lK = jk.b.k(contextRequireContext);
                Context contextRequireContext2 = mayaVouchersPageFragment.requireContext();
                kotlin.jvm.internal.j.f(contextRequireContext2, "requireContext(...)");
                String strMCampaignName = voucher.mCampaignName();
                kotlin.jvm.internal.j.f(strMCampaignName, "mCampaignName(...)");
                Long lQ = jk.b.q(contextRequireContext2, lK, strMCampaignName, string, millis, millis + 1);
                Context contextRequireContext3 = mayaVouchersPageFragment.requireContext();
                kotlin.jvm.internal.j.f(contextRequireContext3, "requireContext(...)");
                Long lR = jk.b.r(contextRequireContext3, lQ);
                Dc.d dVar2 = (Dc.d) mayaVouchersPageFragment.P1();
                if (lQ == null || lR == null) {
                    ((MayaVouchersPageFragment) ((Fc.d) dVar2.c.get())).T1();
                    ((MayaVouchersPageFragment) ((Fc.d) dVar2.c.get())).S1(voucher);
                    return;
                }
                ((MayaVouchersPageFragment) ((Fc.d) dVar2.c.get())).U1();
                MayaVouchersPageFragment mayaVouchersPageFragment2 = (MayaVouchersPageFragment) ((Fc.d) dVar2.c.get());
                mayaVouchersPageFragment2.getClass();
                C1220i c1220iO1 = mayaVouchersPageFragment2.o1();
                FragmentActivity activity = mayaVouchersPageFragment2.getActivity();
                C1219h c1219hD = C1219h.d(EnumC1215d.VOUCHER_REMINDER);
                c1219hD.n(14);
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                c1219hD.j.put("assignment_id", String.valueOf(voucher.mAssignmentId()));
                c1220iO1.c(activity, c1219hD);
                return;
            case 22:
                PayMayaError payMayaErrorF = ((Ja.b) this.f210b).f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF, "mayaErrorHandling(...)");
                Ja.b bVar = (Ja.b) this.f210b;
                String strValueOf = String.valueOf(payMayaErrorF.mErrorCode());
                String strMSpiel = payMayaErrorF.mSpiel();
                String strAnalyticsEventQRType = ((QRPHMerchantPaymentRequest) this.c).analyticsEventQRType();
                String name = ((QRPHMerchantPaymentRequest) this.c).getMerchantDetails().getName();
                String type = ((QRPHMerchantPaymentRequest) this.c).getType();
                Ja.b.v(bVar, strValueOf, strMSpiel, strAnalyticsEventQRType, name, type == null ? "" : type, 32);
                Ja.b bVar2 = (Ja.b) this.f210b;
                bVar2.getClass();
                if (!bVar2.f2498d.e().isQREventsV2Enabled()) {
                    Ma.a aVar = (Ma.a) bVar2.c.get();
                    C1219h c1219hH = AbstractC2329d.h(12);
                    c1219hH.t(EnumC1217f.CREATE);
                    EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
                    c1219hH.j.put(Constants.REASON, payMayaErrorF.mSpiel());
                    c1219hH.i();
                    ((MayaBaseFragment) aVar).A1(c1219hH);
                }
                if (payMayaErrorF.isSessionTimeout()) {
                    return;
                }
                MayaMLKitQRScannerFragment mayaMLKitQRScannerFragment = (MayaMLKitQRScannerFragment) ((Ma.a) bVar2.c.get());
                mayaMLKitQRScannerFragment.getClass();
                Na.e eVar = mayaMLKitQRScannerFragment.f13591j0;
                if (eVar != null) {
                    ((MayaQRActivity) eVar).a2(mayaMLKitQRScannerFragment.getString(R.string.pma_toast_error_title_merchant_payment_error), payMayaErrorF, new Gb.d(mayaMLKitQRScannerFragment, 20));
                    return;
                }
                return;
            case 23:
                Throwable th2 = (Throwable) obj;
                j jVar = (j) this.f210b;
                PayMayaError payMayaErrorF2 = jVar.f(th2, true);
                kotlin.jvm.internal.j.f(payMayaErrorF2, "mayaErrorHandling(...)");
                String strValueOf2 = String.valueOf(payMayaErrorF2.mErrorCode());
                String strMSpiel2 = payMayaErrorF2.mSpiel();
                QRPHMerchantPaymentRequest qRPHMerchantPaymentRequest = (QRPHMerchantPaymentRequest) this.c;
                String strAnalyticsEventQRType2 = qRPHMerchantPaymentRequest.analyticsEventQRType();
                String name2 = qRPHMerchantPaymentRequest.getMerchantDetails().getName();
                String type2 = qRPHMerchantPaymentRequest.getType();
                ((j) this.f210b).N(strValueOf2, strMSpiel2, strAnalyticsEventQRType2, name2, type2 == null ? "" : type2);
                PayMayaError payMayaErrorF3 = jVar.f(th2, true);
                kotlin.jvm.internal.j.f(payMayaErrorF3, "mayaErrorHandling(...)");
                jVar.d0(payMayaErrorF3);
                return;
            case 28:
                PersonalDetailsData it = (PersonalDetailsData) obj;
                kotlin.jvm.internal.j.g(it, "it");
                ((MayaBaseFragment) ((P9.k) ((B) this.f210b).c.get())).w1();
                ((Function1) this.c).invoke(Boolean.valueOf(it.getMothersMaidenName() != null));
                return;
            default:
                CreditServiceFee creditServiceFee = (CreditServiceFee) obj;
                kotlin.jvm.internal.j.g(creditServiceFee, "creditServiceFee");
                G6.k kVar = (G6.k) this.f210b;
                kVar.getClass();
                CreditAccount creditAccount = (CreditAccount) this.c;
                kotlin.jvm.internal.j.g(creditAccount, "creditAccount");
                if (!kVar.f) {
                    C1292x c1292x = (C1292x) kVar.j;
                    c1292x.getClass();
                    if (S5.c.b(c1292x.f11495d, A5.b.f71P)) {
                        String lowerCase = EventMetricsAggregator.OS_NAME.toLowerCase(Locale.ROOT);
                        kotlin.jvm.internal.j.f(lowerCase, "toLowerCase(...)");
                        creditContactReference = c1292x.c.getContactReference(T2.v(lowerCase, UUID.randomUUID().toString()));
                        kotlin.jvm.internal.j.d(creditContactReference);
                    } else {
                        creditContactReference = c1292x.f11494b.getCreditContactReference();
                        kotlin.jvm.internal.j.d(creditContactReference);
                    }
                    kVar.e(new Lh.d(new Lh.d(new Lh.h(creditContactReference, zh.b.a(), i4), new D(kVar, creditServiceFee, creditAccount, i), i), new D(kVar, creditServiceFee, creditAccount, 3), i4).e());
                    return;
                }
                String lowerCase2 = EventMetricsAggregator.OS_NAME.toLowerCase(Locale.ROOT);
                kotlin.jvm.internal.j.f(lowerCase2, "toLowerCase(...)");
                String string2 = UUID.randomUUID().toString();
                kotlin.jvm.internal.j.f(string2, "toString(...)");
                Ah.p pVarC = ((C1264i0) kVar.f1794g).c(lowerCase2, string2);
                Ah.o oVarA = zh.b.a();
                Gh.d dVar3 = new Gh.d(c == true ? 1 : 0, new D(kVar, creditServiceFee, creditAccount, i4), new D(kVar, creditServiceFee, creditAccount, c10 == true ? 1 : 0));
                try {
                    pVarC.f(new Lh.g(dVar3, oVarA));
                    kVar.e(dVar3);
                    return;
                } catch (NullPointerException e) {
                    throw e;
                } catch (Throwable th3) {
                    throw AbstractC1213b.L(th3, "subscribeActual failed", th3);
                }
        }
    }

    @Override // D.X
    public void b() {
        Object obj = ((Z) this.f210b).e;
        pYp6Y3.requestPermissions((FragmentActivity) this.c, new String[]{"android.permission.POST_NOTIFICATIONS"}, 102);
    }

    public ArrayList d() {
        ArrayList arrayList = (ArrayList) this.c;
        if (arrayList.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList2 = new ArrayList();
        try {
            Xe.a aVarC = ((Xe.d) this.f210b).c();
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add((Integer) ((Callable) it.next()).call());
                }
                aVarC.f();
                aVarC.close();
                return arrayList2;
            } finally {
            }
        } catch (Exception e) {
            e.printStackTrace();
            return arrayList2;
        }
    }

    public K3.b e() throws NotFoundException {
        int[] iArr;
        if (((K3.b) this.c) == null) {
            K3.e eVar = (K3.e) this.f210b;
            K3.b bVar = eVar.f2601d;
            if (bVar == null) {
                C3.e eVar2 = eVar.f2599a;
                int i = eVar2.f712a;
                int i4 = 0;
                boolean z4 = true;
                int i6 = eVar2.f713b;
                if (i < 40 || i6 < 40) {
                    K3.b bVar2 = new K3.b(i, i6);
                    if (eVar.f2600b.length < i) {
                        eVar.f2600b = new byte[i];
                    }
                    int i10 = 0;
                    while (true) {
                        iArr = eVar.c;
                        if (i10 >= 32) {
                            break;
                        }
                        iArr[i10] = 0;
                        i10++;
                    }
                    for (int i11 = 1; i11 < 5; i11++) {
                        byte[] bArrB = eVar2.b((i6 * i11) / 5, eVar.f2600b);
                        int i12 = (i << 2) / 5;
                        for (int i13 = i / 5; i13 < i12; i13++) {
                            int i14 = (bArrB[i13] & 255) >> 3;
                            iArr[i14] = iArr[i14] + 1;
                        }
                    }
                    int iA = K3.e.a(iArr);
                    byte[] bArrA = eVar2.a();
                    for (int i15 = 0; i15 < i6; i15++) {
                        int i16 = i15 * i;
                        for (int i17 = 0; i17 < i; i17++) {
                            if ((bArrA[i16 + i17] & 255) < iA) {
                                bVar2.f(i17, i15);
                            }
                        }
                    }
                    eVar.f2601d = bVar2;
                } else {
                    byte[] bArrA2 = eVar2.a();
                    int i18 = i >> 3;
                    if ((i & 7) != 0) {
                        i18++;
                    }
                    int i19 = i6 >> 3;
                    if ((i6 & 7) != 0) {
                        i19++;
                    }
                    int i20 = i6 - 8;
                    int i21 = i - 8;
                    int i22 = 2;
                    int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i19, i18);
                    int i23 = 0;
                    while (true) {
                        int i24 = 8;
                        if (i23 >= i19) {
                            break;
                        }
                        int i25 = i4;
                        int i26 = i23 << 3;
                        if (i26 > i20) {
                            i26 = i20;
                        }
                        boolean z5 = z4;
                        int i27 = i25;
                        while (i27 < i18) {
                            int i28 = i22;
                            int i29 = i27 << 3;
                            if (i29 > i21) {
                                i29 = i21;
                            }
                            int i30 = (i26 * i) + i29;
                            int i31 = i25;
                            int i32 = i31;
                            int i33 = i32;
                            int i34 = 255;
                            while (i31 < i24) {
                                byte[] bArr = bArrA2;
                                int i35 = i26;
                                int i36 = i25;
                                int i37 = i33;
                                int i38 = i34;
                                while (i36 < i24) {
                                    int i39 = i36;
                                    int i40 = bArr[i30 + i36] & 255;
                                    i32 += i40;
                                    if (i40 < i38) {
                                        i38 = i40;
                                    }
                                    if (i40 > i37) {
                                        i37 = i40;
                                    }
                                    i36 = i39 + 1;
                                    i24 = 8;
                                }
                                if (i37 - i38 > 24) {
                                    while (true) {
                                        i31++;
                                        i30 += i;
                                        if (i31 < 8) {
                                            int i41 = i25;
                                            for (int i42 = 8; i41 < i42; i42 = 8) {
                                                i32 += bArr[i30 + i41] & 255;
                                                i41++;
                                                i38 = i38;
                                            }
                                        }
                                    }
                                }
                                i31++;
                                i30 += i;
                                i34 = i38;
                                bArrA2 = bArr;
                                i26 = i35;
                                i24 = 8;
                                i33 = i37;
                            }
                            byte[] bArr2 = bArrA2;
                            int i43 = i26;
                            int i44 = i32 >> 6;
                            int i45 = i34;
                            if (i33 - i45 <= 24) {
                                i44 = i45 / 2;
                                if (i23 > 0 && i27 > 0) {
                                    int[] iArr3 = iArr2[i23 - 1];
                                    int i46 = i27 - 1;
                                    int i47 = (((iArr2[i23][i46] * 2) + iArr3[i27]) + iArr3[i46]) / 4;
                                    if (i45 < i47) {
                                        i44 = i47;
                                    }
                                }
                            }
                            iArr2[i23][i27] = i44;
                            i27++;
                            i22 = i28;
                            bArrA2 = bArr2;
                            i26 = i43;
                            i24 = 8;
                        }
                        i23++;
                        i4 = i25;
                        z4 = z5;
                    }
                    byte[] bArr3 = bArrA2;
                    int i48 = i4;
                    int i49 = i22;
                    K3.b bVar3 = new K3.b(i, i6);
                    int i50 = i48;
                    while (i50 < i19) {
                        int i51 = i50 << 3;
                        if (i51 > i20) {
                            i51 = i20;
                        }
                        int i52 = i19 - 3;
                        if (i50 < i49) {
                            i52 = 2;
                        } else if (i50 <= i52) {
                            i52 = i50;
                        }
                        int i53 = i48;
                        while (i53 < i18) {
                            int i54 = i53 << 3;
                            if (i54 > i21) {
                                i54 = i21;
                            }
                            int i55 = i18 - 3;
                            if (i53 < 2) {
                                i55 = 2;
                            } else if (i53 <= i55) {
                                i55 = i53;
                            }
                            int i56 = i50;
                            int i57 = -2;
                            int i58 = i48;
                            for (int i59 = 2; i57 <= i59; i59 = 2) {
                                int[] iArr4 = iArr2[i52 + i57];
                                i58 = iArr4[i55 - 2] + iArr4[i55 - 1] + iArr4[i55] + iArr4[i55 + 1] + iArr4[i55 + 2] + i58;
                                i57++;
                            }
                            int i60 = i58 / 25;
                            int i61 = (i51 * i) + i54;
                            int i62 = i51;
                            int i63 = i48;
                            while (true) {
                                if (i63 < 8) {
                                    int i64 = i63;
                                    int i65 = i48;
                                    for (int i66 = 8; i65 < i66; i66 = 8) {
                                        int i67 = i65;
                                        if ((bArr3[i61 + i65] & 255) <= i60) {
                                            bVar3.f(i54 + i67, i62 + i64);
                                        }
                                        i65 = i67 + 1;
                                    }
                                    i63 = i64 + 1;
                                    i61 += i;
                                }
                            }
                            i53++;
                            i51 = i62;
                            i50 = i56;
                        }
                        i49 = 2;
                        i50++;
                    }
                    eVar.f2601d = bVar3;
                }
                bVar = eVar.f2601d;
            }
            this.c = bVar;
        }
        return (K3.b) this.c;
    }

    public K3.a f(K3.a aVar, int i) throws NotFoundException {
        int[] iArr;
        K3.e eVar = (K3.e) this.f210b;
        C3.e eVar2 = eVar.f2599a;
        int i4 = eVar2.f712a;
        if (aVar.f2588b < i4) {
            aVar = new K3.a(i4);
        } else {
            int length = aVar.f2587a.length;
            for (int i6 = 0; i6 < length; i6++) {
                aVar.f2587a[i6] = 0;
            }
        }
        if (eVar.f2600b.length < i4) {
            eVar.f2600b = new byte[i4];
        }
        int i10 = 0;
        while (true) {
            iArr = eVar.c;
            if (i10 >= 32) {
                break;
            }
            iArr[i10] = 0;
            i10++;
        }
        byte[] bArrB = eVar2.b(i, eVar.f2600b);
        for (int i11 = 0; i11 < i4; i11++) {
            int i12 = (bArrB[i11] & 255) >> 3;
            iArr[i12] = iArr[i12] + 1;
        }
        int iA = K3.e.a(iArr);
        if (i4 < 3) {
            for (int i13 = 0; i13 < i4; i13++) {
                if ((bArrB[i13] & 255) < iA) {
                    aVar.j(i13);
                }
            }
        } else {
            int i14 = bArrB[0] & 255;
            int i15 = bArrB[1] & 255;
            int i16 = 1;
            while (i16 < i4 - 1) {
                int i17 = i16 + 1;
                int i18 = bArrB[i17] & 255;
                if ((((i15 << 2) - i14) - i18) / 2 < iA) {
                    aVar.j(i16);
                }
                i14 = i15;
                i16 = i17;
                i15 = i18;
            }
        }
        return aVar;
    }

    public File g() {
        if (((File) this.f210b) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f210b) == null) {
                        U1.g gVar = (U1.g) this.c;
                        gVar.a();
                        this.f210b = new File(gVar.f5904a.getFilesDir(), "PersistedInstallation." + ((U1.g) this.c).g() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.f210b;
    }

    @Override // tj.InterfaceC2288a
    public Object getValue(Object obj, KProperty property) {
        kotlin.jvm.internal.j.g(property, "property");
        return (Boolean) this.f210b;
    }

    public void h(D2.b bVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", bVar.f970a);
            jSONObject.put("Status", AbstractC2217b.c(bVar.f971b));
            jSONObject.put("AuthToken", bVar.c);
            jSONObject.put("RefreshToken", bVar.f972d);
            jSONObject.put("TokenCreationEpochInSecs", bVar.f);
            jSONObject.put("ExpiresInSecs", bVar.e);
            jSONObject.put("FisError", bVar.f973g);
            U1.g gVar = (U1.g) this.c;
            gVar.a();
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", gVar.f5904a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (fileCreateTempFile.renameTo(g())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public void j(String str, String str2, String[] strArr) {
        ((ArrayList) this.c).add(new CallableC0183p(this, str, str2, strArr));
    }

    public void k(String str, List list) {
        ((ArrayList) this.c).add(new J(this, list, str, 1));
    }

    public D2.b l() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(g());
            while (true) {
                try {
                    int i = fileInputStream.read(bArr, 0, 16384);
                    if (i < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                } finally {
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        int iOptInt = jSONObject.optInt("Status", 0);
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        int i4 = D2.b.h;
        byte b8 = (byte) (((byte) (0 | 2)) | 1);
        int i6 = AbstractC2217b.d(5)[iOptInt];
        if (i6 == 0) {
            throw new NullPointerException("Null registrationStatus");
        }
        byte b10 = (byte) (((byte) (b8 | 2)) | 1);
        if (b10 == 3 && i6 != 0) {
            return new D2.b(strOptString, i6, strOptString2, strOptString3, jOptLong2, jOptLong, strOptString4);
        }
        StringBuilder sb2 = new StringBuilder();
        if (i6 == 0) {
            sb2.append(" registrationStatus");
        }
        if ((b10 & 1) == 0) {
            sb2.append(" expiresInSecs");
        }
        if ((b10 & 2) == 0) {
            sb2.append(" tokenCreationEpochInSecs");
        }
        throw new IllegalStateException(AbstractC1331a.o(sb2, "Missing required properties:"));
    }

    @Override // Fg.g
    public void log(String message) {
        kotlin.jvm.internal.j.g(message, "message");
        C2360b c2360b = (C2360b) this.f210b;
        Method method = (Method) this.c;
        if (method == null) {
            c2360b.log(message);
            return;
        }
        try {
            method.invoke(null, "Ktor Client", message);
        } catch (Throwable unused) {
            c2360b.log(message);
        }
    }

    public void m() {
        try {
            ((FileLock) this.c).release();
            ((FileChannel) this.f210b).close();
        } catch (IOException e) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
        }
    }

    public void n(String str, String str2) {
        F f = ((Ic.b) this.f210b).f2279a;
        ((TextView) f.e).setText(str);
        ((TextView) f.c).setText(str2);
        ((TextView) f.c).setVisibility(0);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.f209a) {
            case 12:
                i(task);
                return;
            default:
                J1.h hVar = (J1.h) this.f210b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
                synchronized (hVar.f) {
                    hVar.e.remove(taskCompletionSource);
                    break;
                }
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, java.util.Map] */
    @Override // com.paymaya.domain.store.H, Ah.q, Ah.b
    public void onError(Throwable th2) {
        y5.s sVar;
        switch (this.f209a) {
            case 0:
                ((MayaDashboardFragment) ((F7.a) ((h) this.f210b).c.get())).J1("MAYA_DATA_EXTRACTION_EXTRACT_FAILURE", this.c);
                break;
            case 16:
                ((Ah.q) this.c).onError(th2);
                break;
            case 17:
                ((Ah.b) this.c).onError(th2);
                break;
            case 18:
                Ah.b bVar = (Ah.b) this.f210b;
                try {
                    ((Hh.c) this.c).getClass();
                    bVar.onComplete();
                } catch (Throwable th3) {
                    AbstractC0983W.G(th3);
                    bVar.onError(new CompositeException(th2, th3));
                    return;
                }
                break;
            case 26:
                P9.d dVar = (P9.d) ((L9.l) this.f210b).c.get();
                if (dVar != null) {
                    MayaCreditTransferFragment mayaCreditTransferFragment = (MayaCreditTransferFragment) dVar;
                    mayaCreditTransferFragment.Q1("MAYA_DATA_EXTRACTION_EXTRACT_FAILURE", this.c);
                    L9.l lVar = (L9.l) this.f210b;
                    if (!lVar.f2901o) {
                        lVar.l();
                    } else {
                        mayaCreditTransferFragment.S1();
                    }
                    break;
                }
                break;
            default:
                L9.o oVar = (L9.o) this.f210b;
                if (!oVar.i && (sVar = (P9.g) oVar.c.get()) != null) {
                    NewMayaCreditActivationConfirmDetailFragment newMayaCreditActivationConfirmDetailFragment = (NewMayaCreditActivationConfirmDetailFragment) sVar;
                    newMayaCreditActivationConfirmDetailFragment.H1("MAYA_DATA_EXTRACTION_EXTRACT_FAILURE", this.c);
                    ((MayaBaseFragment) sVar).w1();
                    newMayaCreditActivationConfirmDetailFragment.J1();
                }
                break;
        }
    }

    @Override // okhttp3.Callback
    public void onFailure(Call call, IOException e) {
        IOException iOExceptionB;
        C0151l c0151l = (C0151l) this.c;
        OkCallback.onFailure_enter(call, e);
        try {
            kotlin.jvm.internal.j.g(call, "call");
            kotlin.jvm.internal.j.g(e, "e");
            c0151l.getClass();
            if (C0151l.f628g.get(c0151l) instanceof C0153m) {
                OkCallback.onFailure_exit();
                return;
            }
            C1037h.a aVar = C1037h.f9166b;
            Jg.d dVar = (Jg.d) this.f210b;
            if (e instanceof StreamAdapterIOException) {
                Throwable cause = e.getCause();
                iOExceptionB = cause == null ? e : cause;
            } else {
                boolean z4 = e instanceof SocketTimeoutException;
                iOExceptionB = e;
                if (z4) {
                    String message = e.getMessage();
                    iOExceptionB = (message == null || !C2576A.x(message, "connect", true)) ? b0.b(dVar, e) : b0.a(dVar, e);
                }
            }
            c0151l.resumeWith(AbstractC1039j.a(iOExceptionB));
            OkCallback.onFailure_exit();
        } catch (Throwable th2) {
            OkCallback.onFailure_exit();
            throw th2;
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public void onInstallReferrerServiceDisconnected() {
        C0171d c0171d = (C0171d) this.c;
        if (c0171d.e.f804k) {
            return;
        }
        C0171d.a(c0171d);
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public void onInstallReferrerSetupFinished(int i) {
        C0171d c0171d = (C0171d) this.c;
        if (i == 0) {
            C1915b c1915bB = c0171d.i.b();
            InstallReferrerClient installReferrerClient = (InstallReferrerClient) this.f210b;
            c1915bB.e(new r(2, this, installReferrerClient));
            c1915bB.k("ActivityLifeCycleManager#getInstallReferrer", new CallableC0170c(0, this, installReferrerClient));
            return;
        }
        if (i == 1) {
            S sC = c0171d.c.c();
            String str = c0171d.c.f9439a;
            sC.getClass();
            S.g(str, "Install Referrer data not set, connection to Play Store unavailable");
            return;
        }
        if (i != 2) {
            return;
        }
        S sC2 = c0171d.c.c();
        String str2 = c0171d.c.f9439a;
        sC2.getClass();
        S.g(str2, "Install Referrer data not set, API not supported by Play Store on device");
    }

    @Override // okhttp3.Callback
    public void onResponse(Call call, Response response) {
        OkCallback.onResponse_enter(call, response);
        try {
            kotlin.jvm.internal.j.g(call, "call");
            kotlin.jvm.internal.j.g(response, "response");
            if (!call.isCanceled()) {
                C0151l c0151l = (C0151l) this.c;
                C1037h.a aVar = C1037h.f9166b;
                c0151l.resumeWith(response);
            }
            OkCallback.onResponse_exit();
        } catch (Throwable th2) {
            OkCallback.onResponse_exit();
            throw th2;
        }
    }

    @Override // Ah.q
    public void onSuccess(Object obj) {
        ((Ah.q) this.c).onSuccess(obj);
    }

    public String toString() {
        switch (this.f209a) {
            case 6:
                try {
                    return e().toString();
                } catch (NotFoundException unused) {
                    return "";
                }
            case 21:
                return "ObservableProperty(value=" + ((Boolean) this.f210b) + ')';
            default:
                return super.toString();
        }
    }

    @Override // F1.c
    public Object zza() {
        return new E1.j(((E1.e) ((C2361c) this.f210b).f20518b).f1229a, (E1.k) ((F1.c) this.c).zza());
    }

    public /* synthetic */ f(int i, Object obj, Object obj2, boolean z4) {
        this.f209a = i;
        this.c = obj;
        this.f210b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    @Override // com.paymaya.domain.store.H
    public void onSuccess() {
        switch (this.f209a) {
            case 0:
                ((MayaDashboardFragment) ((F7.a) ((h) this.f210b).c.get())).J1("MAYA_DATA_EXTRACTION_EXTRACT_SUCCESS", this.c);
                break;
            case 26:
                P9.d dVar = (P9.d) ((L9.l) this.f210b).c.get();
                if (dVar != null) {
                    ((MayaCreditTransferFragment) dVar).Q1("MAYA_DATA_EXTRACTION_EXTRACT_SUCCESS", this.c);
                    ((L9.l) this.f210b).l();
                    break;
                }
                break;
            default:
                y5.s sVar = (P9.g) ((L9.o) this.f210b).c.get();
                if (sVar != null) {
                    ((NewMayaCreditActivationConfirmDetailFragment) sVar).H1("MAYA_DATA_EXTRACTION_EXTRACT_SUCCESS", this.c);
                    ((MayaBaseFragment) sVar).w1();
                    ((L9.o) this.f210b).o();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ f(Object obj, int i) {
        this.f209a = i;
        this.f210b = obj;
    }

    public f(Ic.b bVar, com.paymaya.data.preference.a mPreference) {
        this.f209a = 10;
        kotlin.jvm.internal.j.g(mPreference, "mPreference");
        this.f210b = bVar;
        this.c = mPreference;
    }

    @Override // Ah.b
    public void onComplete() {
        switch (this.f209a) {
            case 17:
                ((Ah.b) this.c).onComplete();
                break;
            default:
                ((Ah.b) this.f210b).onComplete();
                break;
        }
    }

    public f(J6.b bVar) {
        this.f209a = 21;
        this.c = bVar;
        this.f210b = Boolean.TRUE;
    }

    public f(GeneralInfoDao generalInfoDao, Gi.d dVar) {
        this.f209a = 24;
        Objects.requireNonNull(generalInfoDao);
        this.f210b = generalInfoDao;
        this.c = dVar;
    }

    public f(Jg.d requestData, C0151l c0151l) {
        this.f209a = 1;
        kotlin.jvm.internal.j.g(requestData, "requestData");
        this.f210b = requestData;
        this.c = c0151l;
    }

    public f(int i) {
        this.f209a = i;
        switch (i) {
            case 25:
                break;
            default:
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                this.f210b = linkedHashMap;
                char[] cArr = F5.b.f1550a;
                String strValueOf = String.valueOf(Instant.now().getMillis());
                this.c = strValueOf;
                if (strValueOf != null) {
                    linkedHashMap.put("x-request-timestamp", strValueOf);
                }
                break;
        }
    }

    public f(Class cls, C2360b c2360b) {
        Method declaredMethod;
        this.f209a = 13;
        this.f210b = c2360b;
        try {
            declaredMethod = cls.getDeclaredMethod(CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, String.class, String.class);
        } catch (Throwable unused) {
            declaredMethod = null;
        }
        this.c = declaredMethod;
    }

    public f(U1.g gVar) {
        this.f209a = 9;
        this.c = gVar;
    }
}
