package androidx.window.layout.adapter.extensions;

import Bj.InterfaceC0156n0;
import Ci.b;
import D.Z;
import D.d0;
import N5.C0435a;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.util.Log;
import android.view.animation.AccelerateInterpolator;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.util.Consumer;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.ListenableFutureKt;
import b5.o;
import cj.C1132s;
import com.airbnb.lottie.LottieAnimationView;
import com.google.firebase.messaging.C;
import com.paymaya.adkit.presentation.banneradcarousel.view.BannerAdCarousel;
import com.paymaya.adkit.presentation.verticalbannerad.view.VerticalBannerAd;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.domain.store.T;
import com.paymaya.mayaui.banktransfer.view.activity.impl.MayaBankTransferActivity;
import com.paymaya.mayaui.banktransfer.view.fragment.impl.MayaBankTransferFormFragment;
import com.paymaya.mayaui.banktransfer.view.fragment.impl.MayaBankTransferReceiptFragment;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaMerchantPaymentFragment;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaQRPHMerchantPaymentFragment;
import com.paymaya.mayaui.regv2.view.fragment.impl.MayaWelcomeV2Fragment;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopProviderProductsListSearchFragment;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopPurchaseHistoryReceiptFragment;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopReceiptFragment;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopSearchFragment;
import com.shield.android.context.m;
import ef.c;
import eg.C1440b;
import f8.C1471d;
import gf.e;
import gf.f;
import i1.g;
import io.flutter.plugin.platform.u;
import io.split.android.client.storage.db.SplitQueryDaoImpl;
import io.split.android.client.storage.db.SplitRoomDatabase;
import j1.C1659g;
import j2.C1666e;
import j2.h;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import kotlin.jvm.internal.j;
import n2.C1915b;
import pg.l;
import t6.InterfaceC2275f;
import w1.C2365c;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8219b;

    public /* synthetic */ a(Object obj, int i) {
        this.f8218a = i;
        this.f8219b = obj;
    }

    private final void a() {
        long j;
        f fVar = (f) this.f8219b;
        fVar.getClass();
        while (true) {
            long jNanoTime = System.nanoTime();
            synchronized (fVar) {
                try {
                    e eVar = null;
                    long j6 = Long.MIN_VALUE;
                    int i = 0;
                    int i4 = 0;
                    for (e eVar2 : fVar.f16825d) {
                        if (fVar.a(eVar2, jNanoTime) > 0) {
                            i4++;
                        } else {
                            i++;
                            long j7 = jNanoTime - eVar2.f16821q;
                            if (j7 > j6) {
                                eVar = eVar2;
                                j6 = j7;
                            }
                        }
                    }
                    j = fVar.f16824b;
                    if (j6 >= j || i > fVar.f16823a) {
                        fVar.f16825d.remove(eVar);
                        c.i(eVar.e);
                        j = 0;
                    } else if (i > 0) {
                        j -= j6;
                    } else if (i4 <= 0) {
                        fVar.f = false;
                        j = -1;
                    }
                } finally {
                }
            }
            if (j == -1) {
                return;
            }
            if (j > 0) {
                long j9 = j / 1000000;
                long j10 = j - (1000000 * j9);
                synchronized (fVar) {
                    try {
                        fVar.wait(j9, (int) j10);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
    }

    private final void b() {
        boolean z4;
        String str;
        C1915b c1915b = (C1915b) this.f8219b;
        synchronized (((AtomicMarkableReference) c1915b.h)) {
            try {
                z4 = false;
                if (((AtomicMarkableReference) c1915b.h).isMarked()) {
                    str = (String) ((AtomicMarkableReference) c1915b.h).getReference();
                    ((AtomicMarkableReference) c1915b.h).set(str, false);
                    z4 = true;
                } else {
                    str = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z4) {
            ((h) c1915b.c).j((String) c1915b.f18587b, str);
        }
    }

    private final void c() {
        B1.a aVar = (B1.a) this.f8219b;
        Map mapA = null;
        ((AtomicReference) aVar.f337d).set(null);
        synchronized (aVar) {
            try {
                if (((AtomicMarkableReference) aVar.c).isMarked()) {
                    mapA = ((C1666e) ((AtomicMarkableReference) aVar.c).getReference()).a();
                    AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) aVar.c;
                    atomicMarkableReference.set((C1666e) atomicMarkableReference.getReference(), false);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (mapA != null) {
            C1915b c1915b = (C1915b) aVar.e;
            ((h) c1915b.c).h((String) c1915b.f18587b, mapA, aVar.f336b);
        }
    }

    private final void d() {
        Z z4 = (Z) this.f8219b;
        synchronized (((ArrayList) z4.c)) {
            try {
                Iterator it = ((ArrayList) z4.c).iterator();
                while (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    Pattern pattern = d0.f906a;
                }
            } finally {
            }
        }
        synchronized (((ArrayList) z4.f890b)) {
            try {
                Iterator it2 = ((ArrayList) z4.f890b).iterator();
                while (it2.hasNext()) {
                    if (it2.next() != null) {
                        throw new ClassCastException();
                    }
                    Pattern pattern2 = d0.f906a;
                }
                ((ArrayList) z4.f890b).clear();
            } finally {
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8218a) {
            case 0:
                ExtensionWindowBackendApi0.registerLayoutChangeCallback$lambda$0((Consumer) this.f8219b);
                return;
            case 1:
                ListenableFutureKt.launchFuture$lambda$1$lambda$0((InterfaceC0156n0) this.f8219b);
                return;
            case 2:
                MayaShopProviderProductsListSearchFragment mayaShopProviderProductsListSearchFragment = (MayaShopProviderProductsListSearchFragment) this.f8219b;
                Object systemService = mayaShopProviderProductsListSearchFragment.requireActivity().getSystemService("input_method");
                j.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                AppCompatEditText appCompatEditText = mayaShopProviderProductsListSearchFragment.f14082W;
                if (appCompatEditText != null) {
                    inputMethodManager.showSoftInput(appCompatEditText, 1);
                    return;
                } else {
                    j.n("mSearchView");
                    throw null;
                }
            case 3:
                ((MayaShopPurchaseHistoryReceiptFragment) this.f8219b).n2();
                return;
            case 4:
                ((MayaShopReceiptFragment) this.f8219b).n2();
                return;
            case 5:
                MayaShopSearchFragment mayaShopSearchFragment = (MayaShopSearchFragment) this.f8219b;
                Object systemService2 = mayaShopSearchFragment.requireActivity().getSystemService("input_method");
                j.e(systemService2, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                InputMethodManager inputMethodManager2 = (InputMethodManager) systemService2;
                AppCompatEditText appCompatEditText2 = mayaShopSearchFragment.f14157V;
                if (appCompatEditText2 != null) {
                    inputMethodManager2.showSoftInput(appCompatEditText2, 1);
                    return;
                } else {
                    j.n("mSearchView");
                    throw null;
                }
            case 6:
                b bVar = (b) this.f8219b;
                synchronized (((ArrayDeque) bVar.e)) {
                    SharedPreferences.Editor editorEdit = ((SharedPreferences) bVar.f785b).edit();
                    String str = (String) bVar.c;
                    StringBuilder sb2 = new StringBuilder();
                    Iterator it = ((ArrayDeque) bVar.e).iterator();
                    while (it.hasNext()) {
                        sb2.append((String) it.next());
                        sb2.append((String) bVar.f786d);
                    }
                    editorEdit.putString(str, sb2.toString()).commit();
                    break;
                }
                return;
            case 7:
                StringBuilder sb3 = new StringBuilder("Service took too long to process intent: ");
                C c = (C) this.f8219b;
                sb3.append(c.f9753a.getAction());
                sb3.append(" finishing.");
                Log.w("FirebaseMessaging", sb3.toString());
                c.f9754b.trySetResult(null);
                return;
            case 8:
                ((m) this.f8219b).aQ();
                return;
            case 9:
                ViewCompat.animate(((C1471d) this.f8219b).itemView).alpha(0.0f).setInterpolator(new AccelerateInterpolator());
                return;
            case 10:
                RecyclerView recyclerView = ((ea.h) this.f8219b).c;
                if (recyclerView != null) {
                    recyclerView.invalidateItemDecorations();
                    return;
                }
                return;
            case 11:
                MayaWelcomeV2Fragment mayaWelcomeV2Fragment = (MayaWelcomeV2Fragment) this.f8219b;
                if (!mayaWelcomeV2Fragment.isAdded() || mayaWelcomeV2Fragment.getView() == null) {
                    return;
                }
                C0435a c0435a = mayaWelcomeV2Fragment.f13694U;
                j.d(c0435a);
                LottieAnimationView lottieAnimationView = (LottieAnimationView) c0435a.f4048d;
                lottieAnimationView.setRepeatCount(-1);
                lottieAnimationView.d();
                return;
            case 12:
                C1440b c1440b = (C1440b) this.f8219b;
                l lVar = c1440b.c;
                ConnectivityManager connectivityManager = (ConnectivityManager) c1440b.f16669b.f11391b;
                lVar.success(T.c(connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())));
                return;
            case 13:
                BannerAdCarousel.a((BannerAdCarousel) this.f8219b);
                return;
            case 14:
                a();
                return;
            case 15:
                g gVar = (g) this.f8219b;
                gVar.getClass();
                ((C1659g) gVar.f17084d).k(new de.m(gVar, 17));
                return;
            case 16:
                ((u) this.f8219b).e(false);
                return;
            case 17:
                ((SplitQueryDaoImpl) this.f8219b).lambda$new$0();
                return;
            case 18:
                SplitRoomDatabase.lambda$getDatabase$0((String) this.f8219b);
                return;
            case 19:
                b();
                return;
            case 20:
                c();
                return;
            case 21:
                int i = VerticalBannerAd.h;
                ((VerticalBannerAd) this.f8219b).c(C1132s.g(new o("loadingAdUnit1", null), new o("loadingAdUnit2", null), new o("loadingAdUnit3", null)));
                return;
            case 22:
                d();
                return;
            case 23:
                MayaInputLayout mayaInputLayout = ((MayaMerchantPaymentFragment) this.f8219b).f12879r0;
                if (mayaInputLayout != null) {
                    mayaInputLayout.c();
                    return;
                } else {
                    j.n("mAmountMayaInput");
                    throw null;
                }
            case 24:
                MayaInputLayout mayaInputLayout2 = ((MayaQRPHMerchantPaymentFragment) this.f8219b).f12912r0;
                if (mayaInputLayout2 != null) {
                    mayaInputLayout2.c();
                    return;
                } else {
                    j.n("mAmountMayaInput");
                    throw null;
                }
            case 25:
                ((com.tencent.could.huiyansdk.fragments.g) this.f8219b).a();
                return;
            case 26:
                InterfaceC2275f interfaceC2275f = ((MayaBankTransferFormFragment) this.f8219b).f11550B0;
                if (interfaceC2275f != null) {
                    AbstractC1236z.c((MayaBankTransferActivity) interfaceC2275f);
                    return;
                }
                return;
            case 27:
                ((MayaBankTransferReceiptFragment) this.f8219b).n2();
                return;
            case 28:
                ((com.tencent.could.huiyansdk.operate.a) this.f8219b).c();
                return;
            default:
                ((C2365c) this.f8219b).d(false);
                return;
        }
    }
}
