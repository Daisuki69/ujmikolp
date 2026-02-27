package C2;

import Xh.q;
import android.net.Uri;
import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.constraintlayout.core.state.Interpolator;
import androidx.constraintlayout.core.state.Transition;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import cj.C1112C;
import cj.t;
import cj.x;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.abt.component.AbtRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.perf.FirebasePerfRegistrar;
import com.google.protobuf.C1193g;
import com.paymaya.PayMayaApplication;
import com.paymaya.domain.model.BankPullListItem;
import com.paymaya.domain.model.BankPullPaymentOption;
import com.paymaya.domain.model.BankPullSettings;
import com.paymaya.domain.model.LinkedPaymentOption;
import com.paymaya.mayaui.newmayacredit.view.activity.impl.NewMayaCreditActivity;
import d2.C1328c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import okhttp3.logging.HttpLoggingInterceptor;
import ph.C2070f1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements b2.c, NativeCustomFormatAd.OnCustomClickListener, ActivityResultCallback, Ch.b, OnApplyWindowInsetsListener, OnFailureListener, HttpLoggingInterceptor.Logger, Z0.f, SuccessContinuation, Ch.c, Ch.a, Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f680a;

    public /* synthetic */ f(int i) {
        this.f680a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2, types: [cj.C] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v7 */
    @Override // Ch.b
    public Object a(Object obj, Object obj2) {
        Map map;
        ?? r82;
        Map paymentTokens = (Map) obj;
        BankPullSettings bankPullSettings = (BankPullSettings) obj2;
        kotlin.jvm.internal.j.g(paymentTokens, "paymentTokens");
        kotlin.jvm.internal.j.g(bankPullSettings, "bankPullSettings");
        List<BankPullPaymentOption> paymentOptions = bankPullSettings.getPaymentOptions();
        int i = 10;
        ArrayList<BankPullPaymentOption> arrayList = new ArrayList(t.l(paymentOptions, 10));
        for (BankPullPaymentOption bankPullPaymentOption : paymentOptions) {
            bankPullPaymentOption.setCurrency(bankPullSettings.getCurrency());
            arrayList.add(bankPullPaymentOption);
        }
        ArrayList arrayList2 = new ArrayList(t.l(arrayList, 10));
        for (BankPullPaymentOption bankPullPaymentOption2 : arrayList) {
            List list = (List) paymentTokens.get(bankPullPaymentOption2.getId());
            boolean z4 = false;
            if ((list != null ? list.size() : 0) >= bankPullPaymentOption2.getMaxLinkedAccounts()) {
                z4 = true;
            }
            arrayList2.add(new BankPullListItem.BankPullItem(bankPullPaymentOption2, z4));
        }
        ArrayList arrayList3 = new ArrayList();
        if (!paymentTokens.isEmpty()) {
            ArrayList<BankPullPaymentOption> arrayList4 = new ArrayList(t.l(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList4.add(BankPullPaymentOption.copy$default((BankPullPaymentOption) it.next(), null, false, 0, null, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131071, null));
            }
            ArrayList arrayList5 = new ArrayList();
            for (BankPullPaymentOption bankPullPaymentOption3 : arrayList4) {
                List list2 = (List) paymentTokens.get(bankPullPaymentOption3.getId());
                List list3 = list2;
                if (list3 == null || list3.isEmpty()) {
                    map = paymentTokens;
                    r82 = C1112C.f9377a;
                } else {
                    List<LinkedPaymentOption> list4 = list2;
                    ArrayList arrayList6 = new ArrayList(t.l(list4, i));
                    r82 = arrayList6;
                    for (LinkedPaymentOption linkedPaymentOption : list4) {
                        ?? r10 = r82;
                        BankPullPaymentOption bankPullPaymentOptionCopy$default = BankPullPaymentOption.copy$default(bankPullPaymentOption3, null, false, 0, null, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131071, null);
                        bankPullPaymentOptionCopy$default.setPaymentOption(linkedPaymentOption);
                        r10.add(new BankPullListItem.BankPullLinkedItem(bankPullPaymentOptionCopy$default));
                        r82 = r10;
                        paymentTokens = paymentTokens;
                    }
                    map = paymentTokens;
                }
                x.p((Iterable) r82, arrayList5);
                paymentTokens = map;
                i = 10;
            }
            arrayList3.addAll(arrayList5);
        }
        return new Pair(arrayList2, arrayList3);
    }

    @Override // Ch.c
    public void accept(Object obj) {
        int i = PayMayaApplication.f10200l;
        C1328c.a().b((Throwable) obj);
        yk.a.a();
        Thread.currentThread().toString();
        yk.a.d();
    }

    @Override // Z0.f
    public Object apply(Object obj) {
        U2.t tVar = (U2.t) obj;
        tVar.getClass();
        try {
            int iH = tVar.h(null);
            byte[] bArr = new byte[iH];
            C1193g c1193g = new C1193g(bArr, iH);
            tVar.i(c1193g);
            if (iH - c1193g.f == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + U2.t.class.getName() + " to a byte array threw an IOException (should never happen).", e);
        }
    }

    public Object b(q qVar) {
        switch (this.f680a) {
            case 11:
                return qVar;
            default:
                return qVar.f6672a;
        }
    }

    @Override // androidx.constraintlayout.core.state.Interpolator
    public float getInterpolation(float f) {
        switch (this.f680a) {
            case 27:
                return Transition.lambda$getInterpolator$1(f);
            case 28:
                return Transition.lambda$getInterpolator$2(f);
            default:
                return Transition.lambda$getInterpolator$3(f);
        }
    }

    @Override // okhttp3.logging.HttpLoggingInterceptor.Logger
    public void log(String str) {
        yk.a.g("OkHttpClient").getClass();
        C2070f1.b();
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public void onActivityResult(Object obj) {
        switch (this.f680a) {
            case 2:
                Uri uri = (Uri) obj;
                if (uri != null) {
                    Function1 function1 = E8.f.f1283b;
                    if (function1 != null) {
                        function1.invoke(uri);
                        return;
                    } else {
                        kotlin.jvm.internal.j.n("onFileSelected");
                        throw null;
                    }
                }
                return;
            case 4:
                Boolean it = (Boolean) obj;
                kotlin.jvm.internal.j.g(it, "it");
                return;
            case 7:
                ActivityResult it2 = (ActivityResult) obj;
                int i = NewMayaCreditActivity.f13081x;
                kotlin.jvm.internal.j.g(it2, "it");
                yk.a.h();
                return;
            default:
                ActivityResult it3 = (ActivityResult) obj;
                kotlin.jvm.internal.j.g(it3, "it");
                yk.a.h();
                return;
        }
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat insets) {
        switch (this.f680a) {
            case 6:
                kotlin.jvm.internal.j.g(view, "view");
                kotlin.jvm.internal.j.g(insets, "insets");
                Insets insets2 = insets.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.displayCutout());
                kotlin.jvm.internal.j.f(insets2, "getInsets(...)");
                view.setPadding(insets2.left, insets2.top, insets2.right, insets2.bottom);
                break;
            default:
                Insets insets3 = insets.getInsets(WindowInsetsCompat.Type.systemBars());
                view.setPadding(insets3.left, 0, insets3.right, insets3.bottom);
                break;
        }
        return WindowInsetsCompat.CONSUMED;
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd.OnCustomClickListener
    public void onCustomClick(NativeCustomFormatAd nativeCustomFormatAd, String str) {
        switch (this.f680a) {
            case 1:
                kotlin.jvm.internal.j.g(nativeCustomFormatAd, "<unused var>");
                kotlin.jvm.internal.j.g(str, "<unused var>");
                break;
            default:
                kotlin.jvm.internal.j.g(nativeCustomFormatAd, "<unused var>");
                kotlin.jvm.internal.j.g(str, "<unused var>");
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception it) {
        kotlin.jvm.internal.j.g(it, "it");
        yk.a.d();
    }

    @Override // Ch.a
    public void run() {
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        switch (this.f680a) {
            case 19:
                break;
            case 20:
                break;
            default:
                break;
        }
        return Tasks.forResult(null);
    }

    @Override // b2.c
    public Object v(Xh.b bVar) {
        switch (this.f680a) {
            case 0:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(bVar);
            case 5:
                return FirebasePerfRegistrar.providesFirebasePerformance(bVar);
            case 17:
                Set setK = bVar.k(V2.a.class);
                V2.c cVar = V2.c.c;
                if (cVar == null) {
                    synchronized (V2.c.class) {
                        try {
                            cVar = V2.c.c;
                            if (cVar == null) {
                                cVar = new V2.c();
                                V2.c.c = cVar;
                            }
                        } finally {
                        }
                        break;
                    }
                }
                return new V2.b(setK, cVar);
            default:
                return AbtRegistrar.lambda$getComponents$0(bVar);
        }
    }
}
