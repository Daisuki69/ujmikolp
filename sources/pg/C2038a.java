package pg;

import D8.C0214w;
import G5.InterfaceC0254d;
import L9.C0323a;
import P5.N;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.core.content.ContextCompat;
import com.paymaya.R;
import com.paymaya.domain.model.ContactModel;
import com.paymaya.domain.model.MayaUpdateProfileData;
import com.paymaya.domain.model.Order;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.PaymentConfirmationSummary;
import com.paymaya.domain.model.ProfileCmsData;
import com.paymaya.domain.model.ShopHomeSectionCarousel;
import com.paymaya.domain.model.ShopHomeSectionTemplate;
import com.paymaya.domain.model.UpdateProfileCmsContentData;
import com.paymaya.domain.store.H;
import com.paymaya.domain.store.L;
import com.paymaya.mayaui.banktransfer.view.fragment.impl.MayaBankTransferFormFragment;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.mfa.view.activity.impl.MayaMfaActivity;
import com.paymaya.mayaui.purchasefinancing.view.activity.impl.MayaPurchaseFinancingActivity;
import com.paymaya.ui.ekyc.view.activity.impl.EDDActivity;
import com.paymaya.ui.ekyc.view.activity.impl.EKycPhotoCaptureActivity;
import com.paymaya.ui.ekyc.view.fragment.impl.EDDFinancialDocumentsFragment;
import com.paymaya.ui.ekyc.view.widget.EDDInputFinancialDocument;
import com.paymaya.ui.shopv3.view.activity.impl.ShopV3Activity;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3ConfirmationBottomSheetFragment;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3HomePageFragment;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3PaymentFragment;
import e2.C1421c;
import fh.InterfaceC1486b;
import hh.InterfaceC1570c;
import io.split.android.client.dtos.Split;
import java.lang.annotation.Annotation;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kh.InterfaceC1778e;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import p2.C2005a;
import p2.C2009e;
import ph.C2065e0;
import q2.InterfaceC2160a;
import rh.C2208a;
import s6.InterfaceC2241b;
import sd.C2254c;
import si.C2260b;
import si.C2262d;
import ta.InterfaceC2279a;
import td.InterfaceC2283a;
import u2.C2294b;
import ui.InterfaceC2314a;
import v0.C2333a;
import w4.C2379c;
import we.InterfaceC2428q;
import xi.C2482a;

/* JADX INFO: renamed from: pg.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2038a implements InterfaceC2043f, hh.n, InterfaceC2160a, Ch.c, ch.x, InterfaceC1778e, H, si.e, InterfaceC0254d, InterfaceC2314a, W6.d, ye.c, Bd.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f19100b;
    public Object c;

    public /* synthetic */ C2038a(int i, Object obj, Object obj2) {
        this.f19099a = i;
        this.c = obj;
        this.f19100b = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a A[Catch: IOException -> 0x006c, TryCatch #0 {IOException -> 0x006c, blocks: (B:2:0x0000, B:3:0x000a, B:5:0x000d, B:7:0x001e, B:9:0x0026, B:21:0x0042, B:19:0x003a, B:20:0x003d, B:23:0x0047, B:24:0x004a, B:25:0x0059), top: B:30:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static pg.C2038a h(java.lang.String... r12) {
        /*
            int r0 = r12.length     // Catch: java.io.IOException -> L6c
            okio.ByteString[] r0 = new okio.ByteString[r0]     // Catch: java.io.IOException -> L6c
            okio.Buffer r1 = new okio.Buffer     // Catch: java.io.IOException -> L6c
            r1.<init>()     // Catch: java.io.IOException -> L6c
            r2 = 0
            r3 = r2
        La:
            int r4 = r12.length     // Catch: java.io.IOException -> L6c
            if (r3 >= r4) goto L59
            r4 = r12[r3]     // Catch: java.io.IOException -> L6c
            java.lang.String[] r5 = y.AbstractC2494a.e     // Catch: java.io.IOException -> L6c
            r6 = 34
            r1.writeByte(r6)     // Catch: java.io.IOException -> L6c
            int r7 = r4.length()     // Catch: java.io.IOException -> L6c
            r8 = r2
            r9 = r8
        L1c:
            if (r8 >= r7) goto L45
            char r10 = r4.charAt(r8)     // Catch: java.io.IOException -> L6c
            r11 = 128(0x80, float:1.8E-43)
            if (r10 >= r11) goto L2b
            r10 = r5[r10]     // Catch: java.io.IOException -> L6c
            if (r10 != 0) goto L38
            goto L42
        L2b:
            r11 = 8232(0x2028, float:1.1535E-41)
            if (r10 != r11) goto L32
            java.lang.String r10 = "\\u2028"
            goto L38
        L32:
            r11 = 8233(0x2029, float:1.1537E-41)
            if (r10 != r11) goto L42
            java.lang.String r10 = "\\u2029"
        L38:
            if (r9 >= r8) goto L3d
            r1.writeUtf8(r4, r9, r8)     // Catch: java.io.IOException -> L6c
        L3d:
            r1.writeUtf8(r10)     // Catch: java.io.IOException -> L6c
            int r9 = r8 + 1
        L42:
            int r8 = r8 + 1
            goto L1c
        L45:
            if (r9 >= r7) goto L4a
            r1.writeUtf8(r4, r9, r7)     // Catch: java.io.IOException -> L6c
        L4a:
            r1.writeByte(r6)     // Catch: java.io.IOException -> L6c
            r1.readByte()     // Catch: java.io.IOException -> L6c
            okio.ByteString r4 = r1.readByteString()     // Catch: java.io.IOException -> L6c
            r0[r3] = r4     // Catch: java.io.IOException -> L6c
            int r3 = r3 + 1
            goto La
        L59:
            pg.a r1 = new pg.a     // Catch: java.io.IOException -> L6c
            java.lang.Object r12 = r12.clone()     // Catch: java.io.IOException -> L6c
            java.lang.String[] r12 = (java.lang.String[]) r12     // Catch: java.io.IOException -> L6c
            okio.Options r0 = okio.Options.of(r0)     // Catch: java.io.IOException -> L6c
            r2 = 28
            r3 = 0
            r1.<init>(r2, r12, r0, r3)     // Catch: java.io.IOException -> L6c
            return r1
        L6c:
            r12 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pg.C2038a.h(java.lang.String[]):pg.a");
    }

    @Override // G5.InterfaceC0254d
    public void T() {
        MayaBankTransferFormFragment mayaBankTransferFormFragment = (MayaBankTransferFormFragment) this.f19100b;
        MayaInputLayout mayaInputLayout = mayaBankTransferFormFragment.f11554q0;
        if (mayaInputLayout == null) {
            kotlin.jvm.internal.j.n("mMayaInputLayoutAmount");
            throw null;
        }
        String str = (String) this.c;
        mayaInputLayout.g();
        mayaInputLayout.setHelperErrorText(mayaBankTransferFormFragment.getString(R.string.maya_format_error_insufficient_funds, str));
        mayaInputLayout.r();
        mayaInputLayout.p();
        o6.g gVar = (o6.g) ((MayaBankTransferFormFragment) this.f19100b).R1();
        if (gVar.l() || gVar.k().equals(BigDecimal.ZERO)) {
            MayaBankTransferFormFragment mayaBankTransferFormFragment2 = (MayaBankTransferFormFragment) ((InterfaceC2241b) gVar.c.get());
            TextView textView = mayaBankTransferFormFragment2.f11559z0;
            if (textView == null) {
                kotlin.jvm.internal.j.n("mTextViewTransferFee");
                throw null;
            }
            textView.setTextColor(ContextCompat.getColor(mayaBankTransferFormFragment2.requireContext(), R.color.maya_system_error));
        } else {
            ((MayaBankTransferFormFragment) ((InterfaceC2241b) gVar.c.get())).W1();
        }
        Button button = ((MayaBankTransferFormFragment) this.f19100b).f11556s0;
        if (button != null) {
            button.setEnabled(false);
        } else {
            kotlin.jvm.internal.j.n("mButtonContinue");
            throw null;
        }
    }

    @Override // ye.c
    public void a() {
        switch (this.f19099a) {
            case 25:
                new Handler(Looper.getMainLooper()).postDelayed(new io.flutter.plugins.firebase.core.a(14, (ShopV3ConfirmationBottomSheetFragment) this.f19100b, (PayMayaError) this.c), 500L);
                break;
            default:
                ShopV3ConfirmationBottomSheetFragment shopV3ConfirmationBottomSheetFragment = (ShopV3ConfirmationBottomSheetFragment) this.f19100b;
                Object systemService = shopV3ConfirmationBottomSheetFragment.requireActivity().getSystemService("vibrator");
                kotlin.jvm.internal.j.e(systemService, "null cannot be cast to non-null type android.os.Vibrator");
                Vibrator vibrator = (Vibrator) systemService;
                if (Build.VERSION.SDK_INT >= 26) {
                    vibrator.vibrate(VibrationEffect.createOneShot(100L, -1));
                } else {
                    vibrator.vibrate(100L);
                }
                new Handler(Looper.getMainLooper()).postDelayed(new io.flutter.plugins.firebase.core.a(15, shopV3ConfirmationBottomSheetFragment, (Order) this.c), 500L);
                break;
        }
    }

    @Override // Ch.c
    public void accept(Object obj) {
        switch (this.f19099a) {
            case 6:
                Pair pair = (Pair) obj;
                kotlin.jvm.internal.j.g(pair, "<destruct>");
                Object obj2 = pair.f18160a;
                kotlin.jvm.internal.j.f(obj2, "component1(...)");
                Object obj3 = pair.f18161b;
                kotlin.jvm.internal.j.f(obj3, "component2(...)");
                UpdateProfileCmsContentData updateProfileCmsContentData = ((ProfileCmsData) obj2).getUpdateProfileCmsContentData();
                ((qc.d) this.f19100b).h = updateProfileCmsContentData;
                ((Function2) this.c).invoke(updateProfileCmsContentData, (MayaUpdateProfileData) obj3);
                break;
            case 7:
            case 9:
            case 10:
            default:
                PayMayaError payMayaErrorF = ((C0323a) this.f19100b).f((Throwable) obj, false);
                kotlin.jvm.internal.j.f(payMayaErrorF, "paymayaErrorHandling(...)");
                t channelResult = (t) this.c;
                kotlin.jvm.internal.j.g(channelResult, "channelResult");
                payMayaErrorF.mErrorCode();
                payMayaErrorF.mSpiel();
                yk.a.a();
                channelResult.error("", "Oops! Something’s up. But don’t worry, we’re now looking into it. Please try again later.", null);
                break;
            case 8:
                Throwable it = (Throwable) obj;
                kotlin.jvm.internal.j.g(it, "it");
                rc.i.p((rc.i) this.f19100b, (ContactModel) this.c);
                break;
            case 11:
                Ze.a it2 = (Ze.a) obj;
                kotlin.jvm.internal.j.g(it2, "it");
                InterfaceC2283a interfaceC2283a = (InterfaceC2283a) ((C2254c) this.f19100b).c.get();
                String str = (String) this.c;
                EDDActivity eDDActivity = (EDDActivity) interfaceC2283a;
                eDDActivity.getClass();
                eDDActivity.e.getClass();
                Intent intent = new Intent(eDDActivity.getApplicationContext(), (Class<?>) EKycPhotoCaptureActivity.class);
                intent.putExtra("edd_document_id", str);
                eDDActivity.startActivityForResult(intent, 106);
                break;
            case 12:
                List filteredHistoryList = (List) obj;
                kotlin.jvm.internal.j.g(filteredHistoryList, "filteredHistoryList");
                if (!filteredHistoryList.isEmpty()) {
                    ((ShopV3HomePageFragment) ((ve.c) ((se.e) this.f19100b).c.get())).A1(new ShopHomeSectionCarousel(((ShopHomeSectionTemplate) this.c).getName(), ((ShopHomeSectionTemplate) this.c).getListType(), ((ShopHomeSectionTemplate) this.c).getPosition(), filteredHistoryList, 5, "Buy Again"));
                } else {
                    ((ShopV3HomePageFragment) ((ve.c) ((se.e) this.f19100b).c.get())).C1("Buy Again");
                }
                break;
            case 13:
                Order order = (Order) obj;
                kotlin.jvm.internal.j.g(order, "order");
                se.f fVar = (se.f) this.f19100b;
                PaymentConfirmationSummary paymentConfirmationSummary = (PaymentConfirmationSummary) this.c;
                ((ShopV3PaymentFragment) ((ve.e) fVar.c.get())).n1();
                ShopV3PaymentFragment shopV3PaymentFragment = (ShopV3PaymentFragment) ((ve.e) fVar.c.get());
                shopV3PaymentFragment.getClass();
                InterfaceC2428q interfaceC2428q = shopV3PaymentFragment.f14815d0;
                if (interfaceC2428q != null) {
                    ShopV3Activity shopV3Activity = (ShopV3Activity) interfaceC2428q;
                    com.paymaya.common.utility.C.Q(shopV3Activity, shopV3Activity.getCurrentFocus());
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("payment_confirmation_summary", paymentConfirmationSummary);
                    bundle.putParcelable("purchase_order", order);
                    ShopV3ConfirmationBottomSheetFragment shopV3ConfirmationBottomSheetFragment = new ShopV3ConfirmationBottomSheetFragment();
                    shopV3ConfirmationBottomSheetFragment.setArguments(bundle);
                    shopV3ConfirmationBottomSheetFragment.show(shopV3Activity.getSupportFragmentManager(), shopV3ConfirmationBottomSheetFragment.getTag());
                }
                break;
        }
    }

    @Override // hh.n
    public Object apply(Object obj) {
        switch (this.f19099a) {
            case 2:
                return ((InterfaceC1570c) this.f19100b).a(this.c, obj);
            case 3:
                Object objApply = ((hh.n) this.c).apply(obj);
                jh.e.b(objApply, "The mapper returned a null ObservableSource");
                return new C2065e0((ch.p) objApply, new C2038a(2, (InterfaceC1570c) this.f19100b, obj, false), 3);
            default:
                Object objApply2 = ((hh.n) this.f19100b).apply((ch.l) obj);
                jh.e.b(objApply2, "The selector returned a null ObservableSource");
                return ch.l.wrap((ch.p) objApply2).observeOn((ch.v) this.c);
        }
    }

    @Override // q2.InterfaceC2160a
    public StackTraceElement[] c(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        InterfaceC2160a[] interfaceC2160aArr = (InterfaceC2160a[]) this.f19100b;
        StackTraceElement[] stackTraceElementArrC = stackTraceElementArr;
        for (int i = 0; i < 1; i++) {
            InterfaceC2160a interfaceC2160a = interfaceC2160aArr[i];
            if (stackTraceElementArrC.length <= 1024) {
                break;
            }
            stackTraceElementArrC = interfaceC2160a.c(stackTraceElementArr);
        }
        return stackTraceElementArrC.length > 1024 ? ((C2005a) this.c).c(stackTraceElementArrC) : stackTraceElementArrC;
    }

    @Override // kh.InterfaceC1779f
    public void clear() {
        while (poll() != null && !isEmpty()) {
        }
    }

    public void d(vk.c cVar) {
        ((ArrayList) this.f19100b).add(cVar);
        String name = cVar.getClass().getName();
        HashMap map = (HashMap) this.c;
        if (!map.containsKey(name)) {
            map.put(name, new ArrayList());
        }
        ((List) map.get(name)).add(Integer.valueOf(r0.size() - 1));
    }

    @Override // ui.InterfaceC2314a
    public void e(ArrayList arrayList, ArrayList arrayList2, Split split) {
        switch (this.f19099a) {
            case 19:
                if (((List) this.f19100b).contains(split.name)) {
                    ((C2009e) this.c).e(arrayList, arrayList2, split);
                }
                break;
            default:
                Set<String> set = split.sets;
                if (set == null || set.isEmpty()) {
                    arrayList2.add(split);
                } else {
                    Set<String> set2 = split.sets;
                    A3.i iVar = (A3.i) this.f19100b;
                    boolean zIsEmpty = true;
                    if (iVar.f41b) {
                        if (set2 == null) {
                            zIsEmpty = false;
                        } else {
                            HashSet hashSet = new HashSet((HashSet) iVar.c);
                            hashSet.retainAll(set2);
                            zIsEmpty = true ^ hashSet.isEmpty();
                        }
                    }
                    if (!zIsEmpty) {
                        arrayList2.add(split);
                    } else {
                        ((C2009e) this.c).e(arrayList, arrayList2, split);
                    }
                }
                break;
        }
    }

    public C2294b f() {
        return new C2294b((String) this.f19100b, ((HashMap) this.c) == null ? Collections.EMPTY_MAP : Collections.unmodifiableMap(new HashMap((HashMap) this.c)));
    }

    public C2262d g(boolean z4, Long l6, Long l8) {
        N n7 = (N) this.f19100b;
        return new C2262d((U8.c) n7.f5025a, (Li.b) n7.f5026b, (Li.b) n7.h, z4, (bi.h) n7.c, (Qi.c) this.c, (C2260b) n7.f5027d, l6, l8);
    }

    public void i() {
        EDDFinancialDocumentsFragment eDDFinancialDocumentsFragment = (EDDFinancialDocumentsFragment) this.f19100b;
        sd.e eVarZ1 = eDDFinancialDocumentsFragment.z1();
        List dropdownList = eVarZ1.e.f11394b.a(new N4.d(7));
        EDDInputFinancialDocument eDDInputFinancialDocument = (EDDInputFinancialDocument) this.c;
        kotlin.jvm.internal.j.g(dropdownList, "dropdownList");
        com.paymaya.common.adapter.a aVar = new com.paymaya.common.adapter.a(eDDFinancialDocumentsFragment.getContext(), dropdownList, new C2333a(4));
        Context context = eDDFinancialDocumentsFragment.getContext();
        if (context != null) {
            new AlertDialog.Builder(context).setAdapter(aVar, new zd.k(eDDFinancialDocumentsFragment, eDDInputFinancialDocument, dropdownList, 0)).show();
        }
    }

    @Override // kh.InterfaceC1779f
    public boolean isEmpty() {
        return ((C2208a) ((AtomicReference) this.c).get()) == ((C2208a) ((AtomicReference) this.f19100b).get());
    }

    public synchronized void j(String str, C2482a c2482a) {
        ((ConcurrentHashMap) this.c).put(str, c2482a);
        if (((AtomicBoolean) this.f19100b).get()) {
            c2482a.r();
        }
    }

    public void k(C2379c c2379c) {
        synchronized (this) {
            com.google.firebase.messaging.t tVar = (com.google.firebase.messaging.t) this.f19100b;
            tVar.f9808a.edit().putLong("com.lyft.kronos.cached_current_time", c2379c.f20688a).apply();
            com.google.firebase.messaging.t tVar2 = (com.google.firebase.messaging.t) this.f19100b;
            tVar2.f9808a.edit().putLong("com.lyft.kronos.cached_elapsed_time", c2379c.f20689b).apply();
            com.google.firebase.messaging.t tVar3 = (com.google.firebase.messaging.t) this.f19100b;
            tVar3.f9808a.edit().putLong("com.lyft.kronos.cached_offset", c2379c.c).apply();
            Unit unit = Unit.f18162a;
        }
    }

    public void l(Annotation annotation) {
        if (((HashMap) this.c) == null) {
            this.c = new HashMap();
        }
        ((HashMap) this.c).put(annotation.annotationType(), annotation);
    }

    @Override // kh.InterfaceC1779f
    public boolean offer(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        C2208a c2208a = new C2208a();
        c2208a.f19949a = obj;
        ((C2208a) ((AtomicReference) this.f19100b).getAndSet(c2208a)).lazySet(c2208a);
        return true;
    }

    @Override // W6.d
    public void onClose() {
        ((MayaMfaActivity) this.f19100b).a2();
        ((Function0) this.c).invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    @Override // ch.x
    public void onError(Throwable th2) {
        switch (this.f19099a) {
            case 7:
                ((ch.x) this.f19100b).onError(th2);
                break;
            default:
                ((MayaPurchaseFinancingActivity) ((InterfaceC2279a) ((C0214w) this.f19100b).c.get())).Z1("MAYA_DATA_EXTRACTION_EXTRACT_FAILURE", this.c);
                break;
        }
    }

    @Override // pg.InterfaceC2043f
    public void onMessage(ByteBuffer byteBuffer, g gVar) {
        switch (this.f19099a) {
            case 0:
                C2042e c2042e = (C2042e) this.c;
                try {
                    ((InterfaceC2040c) this.f19100b).onMessage(c2042e.c.decodeMessage(byteBuffer), new C1421c(29, this, gVar, false));
                } catch (RuntimeException e) {
                    Log.e("BasicMessageChannel#" + c2042e.f19104b, "Failed to handle message", e);
                    gVar.reply(null);
                    return;
                }
                break;
            default:
                u uVar = (u) this.c;
                try {
                    ((s) this.f19100b).onMethodCall(uVar.c.a(byteBuffer), new V4.f(this, gVar));
                } catch (RuntimeException e7) {
                    Log.e("MethodChannel#" + uVar.f19115b, "Failed to handle method call", e7);
                    gVar.reply(uVar.c.e(e7.getMessage(), Log.getStackTraceString(e7)));
                }
                break;
        }
    }

    @Override // ch.x, ch.InterfaceC1104c, ch.i
    public void onSubscribe(InterfaceC1486b interfaceC1486b) {
        ((ch.x) this.f19100b).onSubscribe(interfaceC1486b);
    }

    @Override // ch.x
    public void onSuccess(Object obj) {
        try {
            Object objApply = ((L) this.c).apply(obj);
            jh.e.b(objApply, "The mapper function returned a null value.");
            ((ch.x) this.f19100b).onSuccess(objApply);
        } catch (Throwable th2) {
            of.p.F(th2);
            onError(th2);
        }
    }

    @Override // kh.InterfaceC1779f
    public Object poll() {
        C2208a c2208a;
        AtomicReference atomicReference = (AtomicReference) this.c;
        C2208a c2208a2 = (C2208a) atomicReference.get();
        C2208a c2208a3 = (C2208a) c2208a2.get();
        if (c2208a3 != null) {
            Object obj = c2208a3.f19949a;
            c2208a3.f19949a = null;
            atomicReference.lazySet(c2208a3);
            return obj;
        }
        if (c2208a2 == ((C2208a) ((AtomicReference) this.f19100b).get())) {
            return null;
        }
        do {
            c2208a = (C2208a) c2208a2.get();
        } while (c2208a == null);
        Object obj2 = c2208a.f19949a;
        c2208a.f19949a = null;
        atomicReference.lazySet(c2208a);
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0127  */
    @Override // G5.InterfaceC0254d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void u() {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pg.C2038a.u():void");
    }

    public /* synthetic */ C2038a(int i, Object obj, Object obj2, boolean z4) {
        this.f19099a = i;
        this.f19100b = obj;
        this.c = obj2;
    }

    public C2038a(com.paymaya.data.preference.a mPreference, xe.k kVar) {
        this.f19099a = 14;
        kotlin.jvm.internal.j.g(mPreference, "mPreference");
        this.f19100b = mPreference;
        this.c = kVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    @Override // com.paymaya.domain.store.H
    public void onSuccess() {
        ((MayaPurchaseFinancingActivity) ((InterfaceC2279a) ((C0214w) this.f19100b).c.get())).Z1("MAYA_DATA_EXTRACTION_EXTRACT_SUCCESS", this.c);
    }

    public C2038a(N n7, Qi.c cVar) {
        this.f19099a = 16;
        this.f19100b = n7;
        Objects.requireNonNull(cVar);
        this.c = cVar;
    }

    public C2038a(InterfaceC2160a[] interfaceC2160aArr) {
        this.f19099a = 5;
        this.f19100b = interfaceC2160aArr;
        this.c = new C2005a();
    }

    public C2038a(int i) {
        this.f19099a = i;
        switch (i) {
            case 21:
                this.f19100b = new ArrayList();
                this.c = new HashMap();
                break;
            case 27:
                this.f19100b = new AtomicBoolean(false);
                this.c = new ConcurrentHashMap();
                break;
            default:
                AtomicReference atomicReference = new AtomicReference();
                this.f19100b = atomicReference;
                AtomicReference atomicReference2 = new AtomicReference();
                this.c = atomicReference2;
                C2208a c2208a = new C2208a();
                atomicReference2.lazySet(c2208a);
                break;
        }
    }

    public C2038a(String str) {
        this.f19099a = 18;
        this.c = null;
        this.f19100b = str;
    }
}
