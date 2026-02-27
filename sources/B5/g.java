package B5;

import D8.U;
import K2.w;
import M8.T2;
import N5.A0;
import N5.C0443c1;
import N5.W;
import U2.A;
import U2.x;
import ac.C0679c;
import af.C0690e;
import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.browser.trusted.TrustedWebActivityServiceConnectionPool;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.processing.concurrent.DualSurfaceProcessor;
import androidx.camera.video.internal.BufferProvider;
import androidx.camera.video.internal.audio.AudioSource;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.constraintlayout.motion.widget.ViewTransition;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.widget.NestedScrollView;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.DispatchQueue;
import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.common.util.NetworkTypeObserver;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionManager;
import cj.L;
import com.fluttercandies.flutter_image_compress.exception.CompressError;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.util.Timer;
import com.paymaya.PayMayaApplication;
import com.paymaya.R;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.widget.ForcedAutoCompleteTextView;
import com.paymaya.common.widget.MayaResizingTabLayout;
import com.paymaya.mayaui.common.view.widget.MayaAutoCompleteInputLayout;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaWalletFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycCompletePersonalInformationFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycVerifyWithPhilsysFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycWorkDetailsFragment;
import com.paymaya.mayaui.sendmoney.view.fragment.impl.MayaSendMoneyFragment;
import com.paymaya.ui.common.view.service.impl.PayMayaFirebaseMessagingService;
import dOYHB6.yFtIp6.ht2aO8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.y;
import pg.t;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f363b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g(int i, Object obj, Object obj2) {
        this.f362a = i;
        this.f363b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [byte[], java.io.Serializable] */
    @Override // java.lang.Runnable
    public final void run() throws IOException {
        int rotationDegrees;
        R4.i iVar;
        int i = 0;
        switch (this.f362a) {
            case 0:
                i iVar2 = ((h) this.f363b).f366d;
                if (iVar2.c && iVar2.f369d) {
                    iVar2.c = false;
                    PayMayaApplication payMayaApplication = (PayMayaApplication) ((Application) this.c);
                    ht2aO8.unregisterReceiver(payMayaApplication, payMayaApplication.f10205k);
                    return;
                }
                return;
            case 1:
                Context context = (Context) this.c;
                G0.c cVar = (G0.c) this.f363b;
                Object obj = cVar.e.f19113b;
                kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type kotlin.ByteArray");
                byte[] bArr = (byte[]) obj2;
                Object obj3 = list.get(1);
                kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue = ((Integer) obj3).intValue();
                Object obj4 = list.get(2);
                kotlin.jvm.internal.j.e(obj4, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue2 = ((Integer) obj4).intValue();
                Object obj5 = list.get(3);
                kotlin.jvm.internal.j.e(obj5, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue3 = ((Integer) obj5).intValue();
                Object obj6 = list.get(4);
                kotlin.jvm.internal.j.e(obj6, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue4 = ((Integer) obj6).intValue();
                Object obj7 = list.get(5);
                kotlin.jvm.internal.j.e(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue = ((Boolean) obj7).booleanValue();
                Object obj8 = list.get(6);
                kotlin.jvm.internal.j.e(obj8, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue5 = ((Integer) obj8).intValue();
                Object obj9 = list.get(7);
                kotlin.jvm.internal.j.e(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue2 = ((Boolean) obj9).booleanValue();
                Object obj10 = list.get(8);
                kotlin.jvm.internal.j.e(obj10, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue6 = ((Integer) obj10).intValue();
                if (zBooleanValue) {
                    try {
                        rotationDegrees = new ExifInterface(new ByteArrayInputStream(bArr)).getRotationDegrees();
                    } catch (Exception unused) {
                        rotationDegrees = 0;
                    }
                } else {
                    rotationDegrees = 0;
                }
                if (rotationDegrees != 90 && rotationDegrees != 270) {
                    iIntValue2 = iIntValue;
                    iIntValue = iIntValue2;
                }
                K0.a aVar = (K0.a) J0.a.f2376a.get(iIntValue5);
                if (aVar == null) {
                    jk.b.s("No support format.");
                    cVar.a(null);
                    return;
                }
                int i4 = iIntValue4 + rotationDegrees;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    try {
                        aVar.a(context, bArr, byteArrayOutputStream, iIntValue2, iIntValue, iIntValue3, i4, zBooleanValue2, iIntValue6);
                        cVar.a(byteArrayOutputStream.toByteArray());
                        break;
                    } catch (CompressError e) {
                        jk.b.s(e.getMessage());
                        if (F0.a.c) {
                            e.printStackTrace();
                        }
                        cVar.a(null);
                    } catch (Exception e7) {
                        if (F0.a.c) {
                            e7.printStackTrace();
                        }
                        cVar.a(null);
                    }
                    return;
                } finally {
                    byteArrayOutputStream.close();
                }
                break;
            case 2:
                t tVar = (t) this.f363b;
                if (tVar != null) {
                    tVar.success((Serializable) this.c);
                    return;
                }
                return;
            case 3:
                IndexedValue indexedValue = (IndexedValue) this.c;
                MayaResizingTabLayout mayaResizingTabLayout = (MayaResizingTabLayout) this.f363b;
                mayaResizingTabLayout.selectTab(mayaResizingTabLayout.getTabAt(indexedValue.f18163a));
                return;
            case 4:
                MayaWalletFragment mayaWalletFragment = (MayaWalletFragment) this.f363b;
                ConstraintLayout constraintLayout = mayaWalletFragment.f12252q0;
                if (constraintLayout == null) {
                    kotlin.jvm.internal.j.n("mContainer");
                    throw null;
                }
                TransitionManager.beginDelayedTransition(constraintLayout, (AutoTransition) this.c);
                C0443c1 c0443c1 = mayaWalletFragment.f12223L0;
                if (c0443c1 != null) {
                    c0443c1.f4070b.setVisibility(8);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mViewError");
                    throw null;
                }
            case 5:
                ForcedAutoCompleteTextView forcedAutoCompleteTextView = (ForcedAutoCompleteTextView) this.f363b;
                Context context2 = forcedAutoCompleteTextView.getContext();
                kotlin.jvm.internal.j.f(context2, "getContext(...)");
                Drawable drawableO = jk.b.o(context2, R.attr.mayaContentBorderCard);
                forcedAutoCompleteTextView.setDropDownVerticalOffset(0);
                MayaSendMoneyFragment mayaSendMoneyFragment = (MayaSendMoneyFragment) this.c;
                MayaAutoCompleteInputLayout mayaAutoCompleteInputLayout = mayaSendMoneyFragment.f13782G0;
                if (mayaAutoCompleteInputLayout == null) {
                    kotlin.jvm.internal.j.n("mMayaInputLayoutRecipient");
                    throw null;
                }
                forcedAutoCompleteTextView.setDropDownAnchor(mayaAutoCompleteInputLayout.getFormContainerLayout().getId());
                forcedAutoCompleteTextView.setDropDownBackgroundDrawable(drawableO);
                C0679c c0679c = mayaSendMoneyFragment.f13805o0;
                if (c0679c == null) {
                    kotlin.jvm.internal.j.n("mMayaRecipientAdapter");
                    throw null;
                }
                forcedAutoCompleteTextView.setAdapter(c0679c);
                forcedAutoCompleteTextView.setOnItemClickListener(new Gb.i(forcedAutoCompleteTextView, mayaSendMoneyFragment, i));
                return;
            case 6:
                w wVar = (w) this.f363b;
                Context context3 = (Context) this.c;
                if (wVar.f2584a != null || context3 == null) {
                    return;
                }
                wVar.f2584a = context3.getSharedPreferences("FirebasePerfSharedPrefs", 0);
                return;
            case 7:
                NestedScrollView nestedScrollViewFormContainer = ((W) ((MayaKycCompletePersonalInformationFragment) this.f363b).G1()).f3971b.f3989P;
                kotlin.jvm.internal.j.f(nestedScrollViewFormContainer, "nestedScrollViewFormContainer");
                nestedScrollViewFormContainer.smoothScrollTo(0, ((View) ((y) this.c).f18195a).getTop());
                return;
            case 8:
                int iOrdinal = ((U) this.f363b).ordinal();
                MayaKycVerifyWithPhilsysFragment mayaKycVerifyWithPhilsysFragment = (MayaKycVerifyWithPhilsysFragment) this.c;
                if (iOrdinal == 0) {
                    ((A0) mayaKycVerifyWithPhilsysFragment.G1()).f3545n.setChecked(true);
                    ((A0) mayaKycVerifyWithPhilsysFragment.G1()).f3546o.setChecked(false);
                    LinearLayout linearContainerBirthdayInput = ((A0) mayaKycVerifyWithPhilsysFragment.G1()).f3541d;
                    kotlin.jvm.internal.j.f(linearContainerBirthdayInput, "linearContainerBirthdayInput");
                    linearContainerBirthdayInput.setVisibility(0);
                    LinearLayout linearContainerIdNumberInput = ((A0) mayaKycVerifyWithPhilsysFragment.G1()).e;
                    kotlin.jvm.internal.j.f(linearContainerIdNumberInput, "linearContainerIdNumberInput");
                    linearContainerIdNumberInput.setVisibility(8);
                    return;
                }
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                ((A0) mayaKycVerifyWithPhilsysFragment.G1()).f3545n.setChecked(false);
                ((A0) mayaKycVerifyWithPhilsysFragment.G1()).f3546o.setChecked(true);
                LinearLayout linearContainerBirthdayInput2 = ((A0) mayaKycVerifyWithPhilsysFragment.G1()).f3541d;
                kotlin.jvm.internal.j.f(linearContainerBirthdayInput2, "linearContainerBirthdayInput");
                linearContainerBirthdayInput2.setVisibility(8);
                LinearLayout linearContainerIdNumberInput2 = ((A0) mayaKycVerifyWithPhilsysFragment.G1()).e;
                kotlin.jvm.internal.j.f(linearContainerIdNumberInput2, "linearContainerIdNumberInput");
                linearContainerIdNumberInput2.setVisibility(0);
                return;
            case 9:
                T2.N((MayaKycWorkDetailsFragment) this.f363b, "DNFBP_ALERT", L.c(new Pair(EnumC1212a.FIELD, ((y) this.c).f18195a)), 9);
                return;
            case 10:
                Timer timer = AppStartTrace.f9830w;
                AppStartTrace appStartTrace = (AppStartTrace) this.f363b;
                appStartTrace.getClass();
                appStartTrace.f9834b.c((A) ((x) this.c).g(), U2.i.FOREGROUND_BACKGROUND);
                return;
            case 11:
                S2.f fVar = (S2.f) this.f363b;
                fVar.getClass();
                S2.b bVar = (S2.b) this.c;
                fVar.d(bVar.f5636a, bVar.f5637b);
                return;
            case 12:
                Pf.a aVar2 = (Pf.a) this.c;
                Sf.a aVar3 = (Sf.a) this.f363b;
                aVar3.getClass();
                try {
                    ((Lh.c) aVar3.f5724b).v(aVar2);
                    return;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return;
                }
            case 13:
                ((t) this.f363b).success(this.c);
                return;
            case 14:
                int i6 = PayMayaFirebaseMessagingService.c;
                ((NotificationManager) this.f363b).cancel(((Bundle) this.c).hashCode());
                return;
            case 15:
                af.g gVar = (af.g) this.f363b;
                gVar.getClass();
                af.f fVar2 = (af.f) this.c;
                fVar2.f7150b.run();
                gVar.f = fVar2;
                gVar.e.run();
                return;
            case 16:
                K3.d dVar = (K3.d) this.f363b;
                af.g gVar2 = (af.g) this.c;
                synchronized (dVar) {
                    HashSet hashSet = new HashSet((HashSet) dVar.e);
                    ((HashSet) dVar.f).remove(gVar2);
                    ((HashSet) dVar.e).add(gVar2);
                    af.f fVar3 = gVar2.f;
                    if (fVar3 == null || (iVar = fVar3.f7149a) == null || !((C0690e) iVar.f5470b).j()) {
                        af.f fVar4 = gVar2.f;
                        if ((fVar4 != null ? fVar4.a() : null) != null) {
                            HashMap map = (HashMap) dVar.f2598g;
                            af.f fVar5 = gVar2.f;
                            map.remove(fVar5 != null ? fVar5.a() : null);
                        }
                    }
                    dVar.g(gVar2);
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        dVar.g((af.g) it.next());
                        break;
                    }
                }
                return;
            case 17:
                ((TrustedWebActivityServiceConnectionPool) this.f363b).lambda$connect$0((Uri) this.c);
                return;
            case 18:
                Threads.lambda$runOnMainSync$0((Runnable) this.f363b, (CountDownLatch) this.c);
                return;
            case 19:
                ((DualSurfaceProcessor) this.f363b).lambda$onInputSurface$1((SurfaceRequest) this.c);
                return;
            case 20:
                ((DualSurfaceProcessor) this.f363b).lambda$onOutputSurface$3((SurfaceOutput) this.c);
                return;
            case 21:
                ((AudioSource) this.f363b).lambda$setBufferProvider$0((BufferProvider) this.c);
                return;
            case 22:
                ((AudioSource.AudioSourceCallback) this.f363b).onError((Throwable) this.c);
                return;
            case 23:
                ((AudioSource) this.f363b).lambda$release$4((CallbackToFutureAdapter.Completer) this.c);
                return;
            case 24:
                ((AudioSource) this.f363b).lambda$postMaxAmplitude$11((AudioSource.AudioSourceCallback) this.c);
                return;
            case 25:
                ((ViewTransition) this.f363b).lambda$applyTransition$0((View[]) this.c);
                return;
            case 26:
                ((ResourcesCompat.FontCallback) this.f363b).lambda$callbackSuccessAsync$0((Typeface) this.c);
                return;
            case 27:
                DispatchQueue.dispatchAndEnqueue$lambda$2$lambda$1((DispatchQueue) this.f363b, (Runnable) this.c);
                return;
            case 28:
                ((SimpleBasePlayer) this.f363b).lambda$updateStateForPendingOperation$62((S1.y) this.c);
                return;
            default:
                ((NetworkTypeObserver) this.f363b).lambda$register$0((NetworkTypeObserver.Listener) this.c);
                return;
        }
    }
}
