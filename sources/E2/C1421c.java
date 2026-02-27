package e2;

import A3.i;
import Ah.p;
import Bj.B0;
import Bj.InterfaceC0156n0;
import C3.m;
import Ch.f;
import D.CallableC0168a;
import D.S;
import D.d0;
import D8.C0214w;
import G5.InterfaceC0254d;
import H.e;
import Kh.T;
import S1.v;
import aj.InterfaceC0716a;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import b3.C0881b;
import b6.C0922a;
import com.google.android.gms.internal.mlkit_vision_common.zzms;
import com.google.android.gms.internal.mlkit_vision_common.zzmu;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.zxing.NotFoundException;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.BankTransferV3;
import com.paymaya.domain.model.BankTransferV3CreateResponse;
import com.paymaya.domain.model.FavoriteCount;
import com.paymaya.domain.model.MFAChallengeVerificationResult;
import com.paymaya.domain.model.QRPHMerchantPaymentTransaction;
import com.paymaya.domain.store.C1258f0;
import com.paymaya.domain.store.C1268k0;
import com.paymaya.domain.store.L;
import com.paymaya.mayaui.banktransfer.view.activity.impl.MayaBankTransferActivity;
import com.paymaya.mayaui.banktransfer.view.fragment.impl.MayaBankTransferConfirmationFragment;
import com.paymaya.mayaui.banktransfer.view.fragment.impl.MayaBankTransferFormFragment;
import com.paymaya.mayaui.banktransfer.view.fragment.impl.MayaBankTransferListFragment;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.merchant.view.activity.impl.MayaQRPHMerchantActivity;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaQRPHMerchantOTPFragment;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaPayBillsBIRFragment;
import com.paymaya.ui.qr.view.fragment.impl.MLKitQRScannerFragment;
import d3.InterfaceC1330b;
import d4.AbstractC1331a;
import dev.fluttercommunity.plus.share.SharePlusPendingIntent;
import e1.InterfaceC1418b;
import e4.C1424a;
import e4.C1425b;
import e4.C1426c;
import fi.InterfaceC1488a;
import h2.l;
import hh.InterfaceC1569b;
import hh.n;
import io.split.android.client.dtos.Split;
import io.split.android.client.storage.db.SplitEntity;
import j0.h;
import j1.C1653a;
import j1.C1659g;
import j1.C1661i;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.j;
import l9.C1815m;
import n2.C1914a;
import n2.C1915b;
import o6.C1967a;
import o6.g;
import org.json.JSONObject;
import p2.C2007c;
import p9.InterfaceC2027l;
import pg.C2038a;
import pg.C2042e;
import pg.InterfaceC2041d;
import pg.r;
import pg.s;
import pg.t;
import s6.InterfaceC2240a;
import s6.InterfaceC2241b;
import s6.InterfaceC2242c;
import t6.InterfaceC2275f;
import v.AbstractC2329d;
import v5.C2342a;
import w3.C2376a;

/* JADX INFO: renamed from: e2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C1421c implements InterfaceC1330b, InterfaceC1488a, SuccessContinuation, InterfaceC0254d, s, InterfaceC1418b, n, InterfaceC1569b, Ch.c, f, InterfaceC2041d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f16555b;
    public Object c;

    public /* synthetic */ C1421c(int i, Object obj, Object obj2) {
        this.f16554a = i;
        this.f16555b = obj;
        this.c = obj2;
    }

    public static ArrayList h(List list, Gi.d dVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Split split = (Split) it.next();
            String strA = dVar.a(split.name);
            String strA2 = dVar.a(io.split.android.client.utils.b.f17635a.k(split));
            if (strA == null || strA2 == null) {
                Ri.a.g("Error encrypting split: " + split.name);
            } else {
                SplitEntity splitEntity = new SplitEntity();
                splitEntity.setName(strA);
                splitEntity.setBody(strA2);
                splitEntity.setUpdatedAt(System.currentTimeMillis() / 1000);
                arrayList.add(splitEntity);
            }
        }
        return arrayList;
    }

    @Override // G5.InterfaceC0254d
    public void T() {
        MayaPayBillsBIRFragment mayaPayBillsBIRFragment = (MayaPayBillsBIRFragment) this.f16555b;
        MayaInputLayout mayaInputLayout = mayaPayBillsBIRFragment.u0;
        if (mayaInputLayout == null) {
            j.n("mTextInputLayoutAmount");
            throw null;
        }
        mayaInputLayout.f();
        MayaInputLayout mayaInputLayout2 = mayaPayBillsBIRFragment.u0;
        if (mayaInputLayout2 == null) {
            j.n("mTextInputLayoutAmount");
            throw null;
        }
        mayaInputLayout2.i();
        MayaInputLayout mayaInputLayout3 = mayaPayBillsBIRFragment.u0;
        if (mayaInputLayout3 == null) {
            j.n("mTextInputLayoutAmount");
            throw null;
        }
        mayaInputLayout3.setHelperErrorText(mayaPayBillsBIRFragment.getString(R.string.maya_error_pay_bills_you_only_have_in_your_wallet, (String) this.c));
        MayaInputLayout mayaInputLayout4 = mayaPayBillsBIRFragment.u0;
        if (mayaInputLayout4 == null) {
            j.n("mTextInputLayoutAmount");
            throw null;
        }
        mayaInputLayout4.p();
        MayaInputLayout mayaInputLayout5 = mayaPayBillsBIRFragment.u0;
        if (mayaInputLayout5 == null) {
            j.n("mTextInputLayoutAmount");
            throw null;
        }
        mayaInputLayout5.g();
        ((ba.s) mayaPayBillsBIRFragment.V1()).v("mAmount", false);
    }

    @Override // fi.InterfaceC1488a
    public void a(i iVar) {
        try {
            ((ThreadPoolExecutor) this.c).submit(new v((zi.c) this.f16555b, iVar));
        } catch (Exception e) {
            Ri.a.q("Error submitting impression logging task: " + e.getLocalizedMessage());
        }
    }

    @Override // Ch.c
    public void accept(Object obj) {
        int i = 0;
        int i4 = 1;
        switch (this.f16554a) {
            case 18:
                MFAChallengeVerificationResult mfaVerificationChallengeResult = (MFAChallengeVerificationResult) obj;
                j.g(mfaVerificationChallengeResult, "mfaVerificationChallengeResult");
                C0214w c0214w = (C0214w) this.f16555b;
                QRPHMerchantPaymentTransaction qRPHMerchantPaymentTransaction = (QRPHMerchantPaymentTransaction) this.c;
                c0214w.getClass();
                if (!j.b(mfaVerificationChallengeResult.getStatus(), "SUCCESS")) {
                    MayaQRPHMerchantOTPFragment mayaQRPHMerchantOTPFragment = (MayaQRPHMerchantOTPFragment) ((o9.i) c0214w.c.get());
                    InterfaceC2027l interfaceC2027l = mayaQRPHMerchantOTPFragment.f12907k0;
                    if (interfaceC2027l != null) {
                        String string = mayaQRPHMerchantOTPFragment.getString(R.string.pma_toast_error_title_error);
                        j.f(string, "getString(...)");
                        String string2 = mayaQRPHMerchantOTPFragment.getString(R.string.pma_toast_error_appboxo_error);
                        j.f(string2, "getString(...)");
                        ((MayaQRPHMerchantActivity) interfaceC2027l).b2(string, string2);
                    }
                } else {
                    p<QRPHMerchantPaymentTransaction> pVarExecuteQRPHMerchantPayment = ((C1268k0) c0214w.f).f11455b.executeQRPHMerchantPayment(qRPHMerchantPaymentTransaction.getPaymentToken().getId());
                    c0214w.e(new T(5, new Lh.d(new Lh.d(AbstractC1331a.l(pVarExecuteQRPHMerchantPayment, pVarExecuteQRPHMerchantPayment, zh.b.a()), new C1258f0(c0214w, 22), 2), new com.paymaya.domain.store.T(c0214w, 24), i), new C1815m(c0214w, i4)).e());
                }
                break;
            case 22:
                o6.c cVar = (o6.c) this.f16555b;
                BankTransferV3 bankTransfer = (BankTransferV3) this.c;
                cVar.f((Throwable) obj, true);
                j.g(bankTransfer, "bankTransfer");
                ((MayaBankTransferConfirmationFragment) ((InterfaceC2240a) cVar.c.get())).J1(bankTransfer, true, false);
                break;
            case 23:
                BankTransferV3CreateResponse response = (BankTransferV3CreateResponse) obj;
                j.g(response, "response");
                response.setBankTransfer((BankTransferV3) this.f16555b);
                g gVar = (g) this.c;
                y5.s sVar = (InterfaceC2241b) gVar.c.get();
                C1219h c1219hH = AbstractC2329d.h(14);
                c1219hH.t(EnumC1217f.CREATE);
                c1219hH.i();
                ((MayaBaseFragment) sVar).A1(c1219hH);
                InterfaceC2275f interfaceC2275f = ((MayaBankTransferFormFragment) ((InterfaceC2241b) gVar.c.get())).f11550B0;
                if (interfaceC2275f != null) {
                    MayaBankTransferActivity mayaBankTransferActivity = (MayaBankTransferActivity) interfaceC2275f;
                    MayaBankTransferConfirmationFragment mayaBankTransferConfirmationFragment = new MayaBankTransferConfirmationFragment();
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("bank_transfer_create", response);
                    mayaBankTransferConfirmationFragment.setArguments(bundle);
                    AbstractC1236z.i(mayaBankTransferActivity, R.id.frame_layout_container, mayaBankTransferConfirmationFragment, R.anim.pma_slide_in_from_right, R.anim.pma_slide_out_to_left, R.anim.pma_slide_in_from_left, R.anim.pma_slide_out_to_right);
                }
                break;
            default:
                j.g((MFAChallengeVerificationResult) obj, "mfaVerificationChallengeResult");
                C0922a c0922a = (C0922a) this.f16555b;
                c0922a.getClass();
                BankTransferV3CreateResponse transaction = (BankTransferV3CreateResponse) this.c;
                j.g(transaction, "transaction");
                c0922a.f = true;
                c0922a.k(transaction);
                break;
        }
    }

    @Override // hh.n
    public Object apply(Object obj) {
        switch (this.f16554a) {
            case 16:
                ch.v vVar = (ch.v) this.c;
                TimeUnit timeUnit = (TimeUnit) this.f16555b;
                return new Vh.g(obj, vVar.c(timeUnit), timeUnit);
            default:
                FavoriteCount it = (FavoriteCount) obj;
                j.g(it, "it");
                ((MayaBankTransferListFragment) ((InterfaceC2242c) ((o6.n) this.f16555b).c.get())).O1();
                return p.c(new C2342a((List) this.c));
        }
    }

    public float b(C1426c c1426c, C1426c c1426c2) {
        int i = (int) c1426c.f727a;
        int i4 = (int) c1426c.f728b;
        int i6 = (int) c1426c2.f727a;
        int i10 = (int) c1426c2.f728b;
        float fM = m(i, i4, i6, i10);
        float fM2 = m((int) c1426c2.f727a, i10, (int) c1426c.f727a, i4);
        return Float.isNaN(fM) ? fM2 / 7.0f : Float.isNaN(fM2) ? fM / 7.0f : (fM + fM2) / 14.0f;
    }

    public void c() {
        S s9 = (S) this.c;
        e eVar = e.f2065b;
        try {
            ((H.d) this.f16555b).getWritableDatabase().execSQL(zj.s.b("\n            DELETE FROM userEventLogs\n            WHERE (normalizedEventName, deviceID) IN (\n                SELECT normalizedEventName, deviceID\n                FROM userEventLogs\n                ORDER BY lastTs ASC \n                LIMIT (\n                SELECT CASE \n                    WHEN COUNT(*) > ? THEN COUNT(*) - ?\n                    ELSE 0\n                END \n                FROM userEventLogs\n                )\n            );\n        "), new Integer[]{11520, 9216});
            s9.getClass();
            S.q("If row count is above 11520 then only keep 9216 rows in userEventLogs");
        } catch (Exception e) {
            s9.getClass();
            S.r("Error cleaning up extra events in userEventLogs.", e);
        }
    }

    public void d() {
        String str = (String) this.f16555b;
        try {
            C1915b c1915b = (C1915b) this.c;
            c1915b.getClass();
            new File((File) c1915b.f18588d, str).createNewFile();
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean e(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            java.lang.String r0 = "deviceID"
            kotlin.jvm.internal.j.g(r4, r0)
            java.lang.String r0 = "normalizedEventName"
            kotlin.jvm.internal.j.g(r5, r0)
            H.e r0 = H.e.f2065b
            java.lang.String[] r4 = new java.lang.String[]{r4, r5}
            java.lang.String r5 = "eventExists"
            java.lang.String r0 = "\n            SELECT EXISTS(\n                SELECT 1 \n                FROM userEventLogs \n                WHERE deviceID = ? AND normalizedEventName = ?\n            ) AS eventExists;\n        "
            java.lang.String r0 = zj.s.b(r0)
            r1 = 0
            java.lang.Object r2 = r3.f16555b     // Catch: java.lang.Exception -> L47
            H.d r2 = (H.d) r2     // Catch: java.lang.Exception -> L47
            android.database.sqlite.SQLiteDatabase r2 = r2.getReadableDatabase()     // Catch: java.lang.Exception -> L47
            android.database.Cursor r4 = r2.rawQuery(r0, r4)     // Catch: java.lang.Exception -> L47
            if (r4 == 0) goto L54
            boolean r0 = r4.moveToFirst()     // Catch: java.lang.Throwable -> L3b
            if (r0 == 0) goto L39
            int r5 = r4.getColumnIndexOrThrow(r5)     // Catch: java.lang.Throwable -> L3b
            int r5 = r4.getInt(r5)     // Catch: java.lang.Throwable -> L3b
            r0 = 1
            if (r5 != r0) goto L39
            goto L3d
        L39:
            r0 = r1
            goto L3d
        L3b:
            r5 = move-exception
            goto L41
        L3d:
            r4.close()     // Catch: java.lang.Exception -> L47
            return r0
        L41:
            throw r5     // Catch: java.lang.Throwable -> L42
        L42:
            r0 = move-exception
            a.AbstractC0617a.p(r4, r5)     // Catch: java.lang.Exception -> L47
            throw r0     // Catch: java.lang.Exception -> L47
        L47:
            r4 = move-exception
            java.lang.Object r5 = r3.c
            D.S r5 = (D.S) r5
            r5.getClass()
            java.lang.String r5 = "Could not fetch records out of database userEventLogs."
            D.S.r(r5, r4)
        L54:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.C1421c.e(java.lang.String, java.lang.String):boolean");
    }

    public C1424a f(float f, float f3, int i, int i4) throws NotFoundException {
        K3.b bVar;
        C1424a c1424aB;
        C1424a c1424aB2;
        int i6 = (int) (f3 * f);
        int iMax = Math.max(0, i - i6);
        K3.b bVar2 = (K3.b) this.f16555b;
        int iMin = Math.min(bVar2.f2589a - 1, i + i6) - iMax;
        float f7 = 3.0f * f;
        if (iMin < f7) {
            throw NotFoundException.c;
        }
        int iMax2 = Math.max(0, i4 - i6);
        int iMin2 = Math.min(bVar2.f2590b - 1, i4 + i6) - iMax2;
        if (iMin2 < f7) {
            throw NotFoundException.c;
        }
        C1425b c1425b = new C1425b((K3.b) this.f16555b, iMax, iMax2, iMin, iMin2, f, (m) this.c);
        int i10 = c1425b.e;
        int i11 = c1425b.c;
        int i12 = i10 + i11;
        int i13 = c1425b.f;
        int i14 = (i13 / 2) + c1425b.f16595d;
        int[] iArr = new int[3];
        for (int i15 = 0; i15 < i13; i15++) {
            int i16 = ((i15 & 1) == 0 ? (i15 + 1) / 2 : -((i15 + 1) / 2)) + i14;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i17 = i11;
            while (true) {
                bVar = c1425b.f16593a;
                if (i17 >= i12 || bVar.b(i17, i16)) {
                    break;
                }
                i17++;
            }
            int i18 = 0;
            while (i17 < i12) {
                if (!bVar.b(i17, i16)) {
                    if (i18 == 1) {
                        i18++;
                    }
                    iArr[i18] = iArr[i18] + 1;
                } else if (i18 == 1) {
                    iArr[1] = iArr[1] + 1;
                } else if (i18 != 2) {
                    i18++;
                    iArr[i18] = iArr[i18] + 1;
                } else {
                    if (c1425b.a(iArr) && (c1424aB2 = c1425b.b(i16, i17, iArr)) != null) {
                        return c1424aB2;
                    }
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i18 = 1;
                }
                i17++;
            }
            if (c1425b.a(iArr) && (c1424aB = c1425b.b(i16, i12, iArr)) != null) {
                return c1424aB;
            }
        }
        ArrayList arrayList = c1425b.f16594b;
        if (arrayList.isEmpty()) {
            throw NotFoundException.c;
        }
        return (C1424a) arrayList.get(0);
    }

    public InterfaceC0156n0 g() {
        return (B0) this.c;
    }

    @Override // aj.InterfaceC0716a
    public Object get() {
        switch (this.f16554a) {
            case 1:
                return new e3.g((C0881b) ((d3.d) this.f16555b).get(), (CoroutineContext) ((d3.c) this.c).f16259b);
            default:
                return new C1659g(new N4.d(27), new M2.b(27), C1653a.f, (C1661i) ((L) this.f16555b).get(), (InterfaceC0716a) this.c);
        }
    }

    public void i(boolean z4, JSONObject jSONObject, String bodyString, boolean z5) {
        j.g(bodyString, "bodyString");
        List<j0.b> list = (List) this.c;
        Context context = (Context) this.f16555b;
        if (!z5) {
            for (j0.b bVar : list) {
                bVar.f17639a = z4;
                bVar.a(jSONObject, bodyString, context);
            }
            return;
        }
        ArrayList<j0.b> arrayList = new ArrayList();
        for (Object obj : list) {
            j0.b bVar2 = (j0.b) obj;
            if (!(bVar2 instanceof h) && !(bVar2 instanceof j0.e) && !(bVar2 instanceof j0.f)) {
                arrayList.add(obj);
            }
        }
        for (j0.b bVar3 : arrayList) {
            bVar3.f17639a = z4;
            if (bVar3 instanceof j0.g) {
                ((j0.g) bVar3).d(jSONObject, context, true);
            } else {
                bVar3.a(jSONObject, bodyString, context);
            }
        }
    }

    public long j(String deviceID, String eventName, String normalizedEventName) {
        j.g(deviceID, "deviceID");
        j.g(eventName, "eventName");
        j.g(normalizedEventName, "normalizedEventName");
        H.d dVar = (H.d) this.f16555b;
        boolean zB = dVar.b();
        S s9 = (S) this.c;
        if (!zB) {
            s9.getClass();
            S.q("There is not enough space left on the device to store data, data discarded");
            return -2L;
        }
        e eVar = e.f2065b;
        String strL = We.s.l("Inserting event ", eventName, " with deviceID = ", deviceID, " in userEventLogs");
        s9.getClass();
        S.q(strL);
        Pattern pattern = d0.f906a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        ContentValues contentValues = new ContentValues();
        contentValues.put("eventName", eventName);
        contentValues.put("normalizedEventName", normalizedEventName);
        contentValues.put("firstTs", Long.valueOf(jCurrentTimeMillis));
        contentValues.put("lastTs", Long.valueOf(jCurrentTimeMillis));
        contentValues.put("count", (Integer) 1);
        contentValues.put("deviceID", deviceID);
        try {
            return dVar.getWritableDatabase().insertWithOnConflict("userEventLogs", null, contentValues, 5);
        } catch (Exception e) {
            S.q("Error adding row to table userEventLogs Recreating DB. Exception: " + e);
            dVar.close();
            if (dVar.f2064d.delete()) {
                return -1L;
            }
            dVar.c.getClass();
            S.f("Could not delete database");
            return -1L;
        }
    }

    public void k(ByteBuffer byteBuffer, Oa.h hVar) {
        try {
            int i = hVar.f4786a;
            int i4 = hVar.f4787b;
            int i6 = hVar.c;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            C2376a c2376a = new C2376a(byteBuffer, i, i4, i6);
            zzmu.zza(zzms.zzb("vision-common"), 17, 3, jElapsedRealtime, i4, i, byteBuffer.limit(), i6);
            ((v3.d) this.f16555b).c(c2376a).addOnSuccessListener(new ee.c(this)).addOnFailureListener(new ee.c(this));
        } catch (Exception unused) {
            yk.a.c();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0094, code lost:
    
        if (r2 != r0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0096, code lost:
    
        r5 = r5 - r19;
        r0 = java.lang.Math.sqrt((r8 * r8) + (r5 * r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a1, code lost:
    
        return Float.NaN;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public float l(int r18, int r19, int r20, int r21) {
        /*
            r17 = this;
            int r0 = r21 - r19
            int r0 = java.lang.Math.abs(r0)
            int r1 = r20 - r18
            int r1 = java.lang.Math.abs(r1)
            r3 = 1
            if (r0 <= r1) goto L11
            r0 = r3
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 == 0) goto L1d
            r4 = r18
            r1 = r19
            r6 = r20
            r5 = r21
            goto L25
        L1d:
            r1 = r18
            r4 = r19
            r5 = r20
            r6 = r21
        L25:
            int r7 = r5 - r1
            int r7 = java.lang.Math.abs(r7)
            int r8 = r6 - r4
            int r9 = java.lang.Math.abs(r8)
            int r10 = -r7
            r11 = 2
            int r10 = r10 / r11
            r12 = -1
            if (r1 >= r5) goto L39
            r13 = r3
            goto L3a
        L39:
            r13 = r12
        L3a:
            if (r4 >= r6) goto L3d
            r12 = r3
        L3d:
            int r5 = r5 + r13
            r14 = r1
            r15 = r4
            r2 = 0
        L41:
            if (r14 == r5) goto L8f
            if (r0 == 0) goto L47
            r11 = r15
            goto L48
        L47:
            r11 = r14
        L48:
            r16 = r0
            if (r0 == 0) goto L4e
            r0 = r14
            goto L4f
        L4e:
            r0 = r15
        L4f:
            r19 = r1
            if (r2 != r3) goto L59
            r1 = r3
            r20 = r4
            r3 = r17
            goto L5e
        L59:
            r1 = 0
            r3 = r17
            r20 = r4
        L5e:
            java.lang.Object r4 = r3.f16555b
            K3.b r4 = (K3.b) r4
            boolean r0 = r4.b(r11, r0)
            if (r1 != r0) goto L7b
            r0 = 2
            if (r2 != r0) goto L79
            int r14 = r14 - r19
            int r15 = r15 - r20
            int r14 = r14 * r14
            int r15 = r15 * r15
            int r15 = r15 + r14
            double r0 = (double) r15
            double r0 = java.lang.Math.sqrt(r0)
        L77:
            float r0 = (float) r0
            return r0
        L79:
            int r2 = r2 + 1
        L7b:
            int r10 = r10 + r9
            if (r10 <= 0) goto L85
            if (r15 == r6) goto L83
            int r15 = r15 + r12
            int r10 = r10 - r7
            goto L85
        L83:
            r0 = 2
            goto L94
        L85:
            int r14 = r14 + r13
            r1 = r19
            r4 = r20
            r0 = r16
            r3 = 1
            r11 = 2
            goto L41
        L8f:
            r3 = r17
            r19 = r1
            r0 = r11
        L94:
            if (r2 != r0) goto La1
            int r5 = r5 - r19
            int r5 = r5 * r5
            int r8 = r8 * r8
            int r8 = r8 + r5
            double r0 = (double) r8
            double r0 = java.lang.Math.sqrt(r0)
            goto L77
        La1:
            r0 = 2143289344(0x7fc00000, float:NaN)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.C1421c.l(int, int, int, int):float");
    }

    public float m(int i, int i4, int i6, int i10) {
        float f;
        float f3;
        float fL = l(i, i4, i6, i10);
        int i11 = i - (i6 - i);
        K3.b bVar = (K3.b) this.f16555b;
        int i12 = 0;
        if (i11 < 0) {
            f = i / (i - i11);
            i11 = 0;
        } else {
            int i13 = bVar.f2589a;
            if (i11 >= i13) {
                float f7 = ((i13 - 1) - i) / (i11 - i);
                int i14 = i13 - 1;
                f = f7;
                i11 = i14;
            } else {
                f = 1.0f;
            }
        }
        float f10 = i4;
        int i15 = (int) (f10 - ((i10 - i4) * f));
        if (i15 < 0) {
            f3 = f10 / (i4 - i15);
        } else {
            int i16 = bVar.f2590b;
            if (i15 >= i16) {
                f3 = ((i16 - 1) - i4) / (i15 - i4);
                i12 = i16 - 1;
            } else {
                i12 = i15;
                f3 = 1.0f;
            }
        }
        return (l(i, i4, (int) (((i11 - i) * f3) + i), i12) + fL) - 1.0f;
    }

    public boolean n(String deviceID, String normalizedEventName) {
        S s9 = (S) this.c;
        j.g(deviceID, "deviceID");
        j.g(normalizedEventName, "normalizedEventName");
        e eVar = e.f2065b;
        Pattern pattern = d0.f906a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            String strB = zj.s.b("\n            UPDATE userEventLogs \n            SET \n                count = count + 1,\n                lastTs = ?\n            WHERE deviceID = ? \n            AND normalizedEventName = ?;\n        ");
            s9.getClass();
            S.q("Updating event " + normalizedEventName + " with deviceID = " + deviceID + " in userEventLogs");
            ((H.d) this.f16555b).getWritableDatabase().execSQL(strB, new Object[]{Long.valueOf(jCurrentTimeMillis), deviceID, normalizedEventName});
            return true;
        } catch (Exception e) {
            s9.getClass();
            S.r("Could not update event in database userEventLogs.", e);
            return false;
        }
    }

    @Override // pg.s
    public void onMethodCall(r call, t result) {
        t tVar;
        j.g(call, "call");
        j.g(result, "result");
        if (!(call.f19113b instanceof Map)) {
            throw new IllegalArgumentException("Map arguments expected");
        }
        hg.b bVar = (hg.b) this.c;
        bVar.getClass();
        AtomicBoolean atomicBoolean = bVar.f17043b;
        if (!atomicBoolean.compareAndSet(true, false) && (tVar = bVar.f17042a) != null) {
            tVar.success("dev.fluttercommunity.plus/share/unavailable");
        }
        SharePlusPendingIntent.f16387a = "";
        atomicBoolean.set(false);
        bVar.f17042a = result;
        try {
            String str = call.f19112a;
            if (str != null) {
                int iHashCode = str.hashCode();
                Ci.b bVar2 = (Ci.b) this.f16555b;
                if (iHashCode != -1811378728) {
                    if (iHashCode != -743768819) {
                        if (iHashCode == 109400031 && str.equals("share")) {
                            Object objA = call.a("text");
                            j.e(objA, "null cannot be cast to non-null type kotlin.String");
                            bVar2.L((String) objA, (String) call.a("subject"));
                            return;
                        }
                    } else if (str.equals("shareUri")) {
                        Object objA2 = call.a("uri");
                        j.e(objA2, "null cannot be cast to non-null type kotlin.String");
                        bVar2.L((String) objA2, null);
                        return;
                    }
                } else if (str.equals("shareFiles")) {
                    Object objA3 = call.a("paths");
                    j.d(objA3);
                    bVar2.M((List) objA3, (String) call.a("text"), (List) call.a("mimeTypes"), (String) call.a("subject"));
                    return;
                }
            }
            result.notImplemented();
        } catch (Throwable th2) {
            bVar.f17043b.set(true);
            bVar.f17042a = null;
            result.error("Share failed", th2.getMessage(), th2);
        }
    }

    @Override // pg.InterfaceC2041d
    public void reply(Object obj) {
        ((pg.g) this.f16555b).reply(((C2042e) ((C2038a) this.c).c).c.encodeMessage(obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) throws Throwable {
        FileWriter fileWriter;
        ?? r32 = 0;
        switch (this.f16554a) {
            case 5:
                if (((C2007c) obj) == null) {
                    Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
                    return Tasks.forResult(null);
                }
                h2.j jVar = (h2.j) this.c;
                l lVar = jVar.f;
                return Tasks.whenAll((Task<?>[]) new Task[]{l.a(lVar), lVar.m.t(lVar.e.f17092a, jVar.e ? (String) this.f16555b : null)});
            case 6:
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                l lVar2 = (l) this.c;
                if (zBooleanValue) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
                    }
                    boolean zBooleanValue2 = bool.booleanValue();
                    h2.t tVar = lVar2.f16878b;
                    if (zBooleanValue2) {
                        tVar.h.trySetResult(null);
                        return ((Task) this.f16555b).onSuccessTask(lVar2.e.f17092a, new L(this, 12));
                    }
                    tVar.getClass();
                    throw new IllegalStateException("An invalid data collection token was used.");
                }
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
                }
                Iterator it = C1915b.s(((File) lVar2.f16880g.f18588d).listFiles(l.f16875t)).iterator();
                while (it.hasNext()) {
                    ((File) it.next()).delete();
                }
                C1915b c1915b = ((C1914a) lVar2.m.c).f18584b;
                C1914a.a(C1915b.s(((File) c1915b.f).listFiles()));
                C1914a.a(C1915b.s(((File) c1915b.f18589g).listFiles()));
                C1914a.a(C1915b.s(((File) c1915b.h).listFiles()));
                lVar2.f16887r.trySetResult(null);
                return Tasks.forResult(null);
            default:
                JSONObject jSONObject = (JSONObject) ((i2.e) this.f16555b).c.f17089a.submit(new CallableC0168a(this, 18)).get();
                if (jSONObject != null) {
                    b1.t tVar2 = (b1.t) this.c;
                    C2007c c2007cV = ((com.google.firebase.messaging.p) tVar2.c).v(jSONObject);
                    long j = c2007cV.c;
                    C1967a c1967a = (C1967a) tVar2.e;
                    c1967a.getClass();
                    boolean zIsLoggable = Log.isLoggable("FirebaseCrashlytics", 2);
                    ?? r22 = zIsLoggable;
                    if (zIsLoggable) {
                        Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
                        r22 = "Writing settings to cache file...";
                    }
                    try {
                        try {
                            try {
                                jSONObject.put("expires_at", j);
                                try {
                                    fileWriter = new FileWriter((File) c1967a.f18783b);
                                } catch (Exception e) {
                                    e = e;
                                    fileWriter = null;
                                    Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                                    r22 = fileWriter;
                                    h2.f.b(r22, "Failed to close settings writer.");
                                    b1.t.k("Loaded settings: ", jSONObject);
                                    String str = (String) ((Oa.d) tVar2.f8334b).f4782g;
                                    SharedPreferences.Editor editorEdit = ((Context) tVar2.f8333a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                                    editorEdit.putString("existing_instance_identifier", str);
                                    editorEdit.apply();
                                    ((AtomicReference) tVar2.h).set(c2007cV);
                                    ((TaskCompletionSource) ((AtomicReference) tVar2.i).get()).trySetResult(c2007cV);
                                    return Tasks.forResult(null);
                                }
                            } catch (Exception e7) {
                                e = e7;
                            }
                            try {
                                fileWriter.write(jSONObject.toString());
                                fileWriter.flush();
                                r22 = fileWriter;
                            } catch (Exception e10) {
                                e = e10;
                                Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                                r22 = fileWriter;
                            }
                            h2.f.b(r22, "Failed to close settings writer.");
                            b1.t.k("Loaded settings: ", jSONObject);
                            String str2 = (String) ((Oa.d) tVar2.f8334b).f4782g;
                            SharedPreferences.Editor editorEdit2 = ((Context) tVar2.f8333a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                            editorEdit2.putString("existing_instance_identifier", str2);
                            editorEdit2.apply();
                            ((AtomicReference) tVar2.h).set(c2007cV);
                            ((TaskCompletionSource) ((AtomicReference) tVar2.i).get()).trySetResult(c2007cV);
                        } catch (Throwable th2) {
                            th = th2;
                            r32 = r22;
                            h2.f.b(r32, "Failed to close settings writer.");
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        h2.f.b(r32, "Failed to close settings writer.");
                        throw th;
                    }
                    break;
                }
                return Tasks.forResult(null);
        }
    }

    @Override // G5.InterfaceC0254d
    public void u() {
        MayaPayBillsBIRFragment mayaPayBillsBIRFragment = (MayaPayBillsBIRFragment) this.f16555b;
        MayaInputLayout mayaInputLayout = mayaPayBillsBIRFragment.u0;
        if (mayaInputLayout == null) {
            j.n("mTextInputLayoutAmount");
            throw null;
        }
        mayaInputLayout.f();
        MayaInputLayout mayaInputLayout2 = mayaPayBillsBIRFragment.u0;
        if (mayaInputLayout2 == null) {
            j.n("mTextInputLayoutAmount");
            throw null;
        }
        mayaInputLayout2.i();
        MayaInputLayout mayaInputLayout3 = mayaPayBillsBIRFragment.u0;
        if (mayaInputLayout3 == null) {
            j.n("mTextInputLayoutAmount");
            throw null;
        }
        mayaInputLayout3.f();
        MayaInputLayout mayaInputLayout4 = mayaPayBillsBIRFragment.u0;
        if (mayaInputLayout4 == null) {
            j.n("mTextInputLayoutAmount");
            throw null;
        }
        mayaInputLayout4.q();
        ((ba.s) mayaPayBillsBIRFragment.V1()).v("mAmount", true);
    }

    public /* synthetic */ C1421c(int i, Object obj, Object obj2, boolean z4) {
        this.f16554a = i;
        this.c = obj;
        this.f16555b = obj2;
    }

    public C1421c(Context context, List responses) {
        this.f16554a = 14;
        j.g(context, "context");
        j.g(responses, "responses");
        this.f16555b = context;
        this.c = responses;
    }

    public C1421c(Ci.b bVar, hg.b manager) {
        this.f16554a = 10;
        j.g(manager, "manager");
        this.f16555b = bVar;
        this.c = manager;
    }

    public C1421c(H.d db2, S logger) {
        this.f16554a = 19;
        e eVar = e.f2065b;
        j.g(db2, "db");
        j.g(logger, "logger");
        this.f16555b = db2;
        this.c = logger;
    }

    public C1421c(int i) {
        this.f16554a = i;
        switch (i) {
            case 21:
                break;
            case 26:
                this.f16555b = new ArrayList();
                this.c = new ArrayList();
                break;
            default:
                this.f16555b = new AtomicInteger();
                this.c = new AtomicInteger();
                break;
        }
    }

    public C1421c(MLKitQRScannerFragment mLKitQRScannerFragment) {
        this.f16554a = 3;
        this.c = mLKitQRScannerFragment;
        this.f16555b = Xh.i.t(new r3.b(0));
    }

    public C1421c(Ri.a aVar, Gi.d dVar) {
        this.f16554a = 13;
        this.f16555b = aVar;
        Objects.requireNonNull(dVar);
        this.c = dVar;
    }

    public C1421c(Context context) {
        this.f16554a = 0;
        this.f16555b = context;
        this.c = null;
    }

    public C1421c(K3.b bVar) {
        this.f16554a = 2;
        this.f16555b = bVar;
    }

    @Override // hh.InterfaceC1569b
    public void accept(Object obj, Object obj2) {
        ((Map) obj).put(((n) this.c).apply(obj2), ((n) this.f16555b).apply(obj2));
    }
}
