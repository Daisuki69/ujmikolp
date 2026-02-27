package io.flutter.plugins.firebase.core;

import A7.j;
import N5.K;
import U1.g;
import android.content.Context;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import c1.s;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.paymaya.common.base.MayaAbstractBaseOTPFragmentImpl;
import com.paymaya.common.utility.C;
import com.paymaya.domain.model.Order;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.PayMayaErrorAction;
import com.paymaya.domain.model.PaymentConfirmationSummary;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3ConfirmationBottomSheetFragment;
import com.tencent.could.huiyansdk.fragments.AuthingFragment;
import com.tencent.could.huiyansdk.view.CameraDateBotGatherView;
import io.flutter.plugins.webviewflutter.JavaScriptChannel;
import j2.h;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import n1.C1900f;
import n2.C1915b;
import o2.C1957b;
import pg.t;
import ve.InterfaceC2347a;
import we.InterfaceC2414c;
import we.ViewOnClickListenerC2412a;
import y1.C2496a;
import y1.C2497b;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17272b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.f17271a = i;
        this.c = obj;
        this.f17272b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View viewFindViewById;
        switch (this.f17271a) {
            case 0:
                FlutterFirebaseCorePlugin.lambda$delete$7((String) this.c, (TaskCompletionSource) this.f17272b);
                return;
            case 1:
                FlutterFirebasePluginRegistry.lambda$getPluginConstantsForFirebaseApp$0((g) this.c, (TaskCompletionSource) this.f17272b);
                return;
            case 2:
                ((JavaScriptChannel) this.f17272b).lambda$postMessage$1((String) this.c);
                return;
            case 3:
                C1915b c1915b = (C1915b) this.c;
                ((h) c1915b.c).i((String) c1915b.f18587b, (List) this.f17272b);
                return;
            case 4:
                ((t) this.c).error("NO_INTERNET", "No Internet Connection", ((UnknownHostException) this.f17272b).getLocalizedMessage());
                return;
            case 5:
                ((t) this.c).error("TIMEOUT", "Connection Timeout", ((SocketTimeoutException) this.f17272b).getLocalizedMessage());
                return;
            case 6:
                ((t) this.c).error("NETWORK_ERROR", "Network Error", ((IOException) this.f17272b).getLocalizedMessage());
                return;
            case 7:
                ((l0.f) ((l0.d) this.c).c).onSuccess(this.f17272b);
                return;
            case 8:
                C1900f c1900f = (C1900f) this.c;
                int i = c1900f.f18567d - ((Ff.a) this.f17272b).f1577b;
                c1900f.f18567d = i;
                if (i == 0) {
                    throw null;
                }
                return;
            case 9:
                C1957b c1957b = (C1957b) this.c;
                c1957b.getClass();
                try {
                    s.a().f9250d.a(c1957b.h.f9245a.a(Z0.e.c), 1);
                    break;
                } catch (Exception unused) {
                }
                ((CountDownLatch) this.f17272b).countDown();
                return;
            case 10:
                ((AuthingFragment) this.c).a((ColorMatrixColorFilter) this.f17272b);
                return;
            case 11:
                ((com.tencent.could.huiyansdk.helper.b) this.c).a((Context) this.f17272b);
                return;
            case 12:
                ((com.tencent.could.huiyansdk.manager.f) this.c).b((com.tencent.could.huiyansdk.callback.e) this.f17272b);
                return;
            case 13:
                ((com.tencent.could.huiyansdk.utils.g) this.f17272b).b((String) this.c);
                return;
            case 14:
                ShopV3ConfirmationBottomSheetFragment shopV3ConfirmationBottomSheetFragment = (ShopV3ConfirmationBottomSheetFragment) this.c;
                PayMayaError payMayaError = (PayMayaError) this.f17272b;
                j jVarQ1 = shopV3ConfirmationBottomSheetFragment.q1();
                if (payMayaError.isSessionTimeout()) {
                    ShopV3ConfirmationBottomSheetFragment shopV3ConfirmationBottomSheetFragment2 = (ShopV3ConfirmationBottomSheetFragment) ((InterfaceC2347a) jVarQ1.c.get());
                    K k8 = shopV3ConfirmationBottomSheetFragment2.f14780R;
                    kotlin.jvm.internal.j.d(k8);
                    k8.f3698g.setText(shopV3ConfirmationBottomSheetFragment2.getString(com.paymaya.R.string.pma_error_message_shop_default));
                    ShopV3ConfirmationBottomSheetFragment shopV3ConfirmationBottomSheetFragment3 = (ShopV3ConfirmationBottomSheetFragment) ((InterfaceC2347a) jVarQ1.c.get());
                    shopV3ConfirmationBottomSheetFragment3.p1().setText(shopV3ConfirmationBottomSheetFragment3.getString(com.paymaya.R.string.pma_label_back_to_home));
                    shopV3ConfirmationBottomSheetFragment3.p1().setOnClickListener(new ViewOnClickListenerC2412a(shopV3ConfirmationBottomSheetFragment3, 3));
                    K k10 = ((ShopV3ConfirmationBottomSheetFragment) ((InterfaceC2347a) jVarQ1.c.get())).f14780R;
                    kotlin.jvm.internal.j.d(k10);
                    k10.f3699k.setVisibility(8);
                } else if (payMayaError.isNetworkError()) {
                    ShopV3ConfirmationBottomSheetFragment shopV3ConfirmationBottomSheetFragment4 = (ShopV3ConfirmationBottomSheetFragment) ((InterfaceC2347a) jVarQ1.c.get());
                    K k11 = shopV3ConfirmationBottomSheetFragment4.f14780R;
                    kotlin.jvm.internal.j.d(k11);
                    k11.f3698g.setText(shopV3ConfirmationBottomSheetFragment4.getString(com.paymaya.R.string.pma_dialog_error_no_internet_connection_message));
                    ShopV3ConfirmationBottomSheetFragment shopV3ConfirmationBottomSheetFragment5 = (ShopV3ConfirmationBottomSheetFragment) ((InterfaceC2347a) jVarQ1.c.get());
                    shopV3ConfirmationBottomSheetFragment5.p1().setText(shopV3ConfirmationBottomSheetFragment5.getString(com.paymaya.R.string.pma_label_try_again));
                    shopV3ConfirmationBottomSheetFragment5.p1().setOnClickListener(new ViewOnClickListenerC2412a(shopV3ConfirmationBottomSheetFragment5, 2));
                    K k12 = ((ShopV3ConfirmationBottomSheetFragment) ((InterfaceC2347a) jVarQ1.c.get())).f14780R;
                    kotlin.jvm.internal.j.d(k12);
                    k12.f3699k.setVisibility(0);
                } else {
                    PayMayaErrorAction payMayaErrorActionMAction = payMayaError.mAction();
                    if (payMayaErrorActionMAction == null) {
                        ShopV3ConfirmationBottomSheetFragment shopV3ConfirmationBottomSheetFragment6 = (ShopV3ConfirmationBottomSheetFragment) ((InterfaceC2347a) jVarQ1.c.get());
                        shopV3ConfirmationBottomSheetFragment6.p1().setText(shopV3ConfirmationBottomSheetFragment6.getString(com.paymaya.R.string.pma_label_close));
                        shopV3ConfirmationBottomSheetFragment6.p1().setOnClickListener(new ViewOnClickListenerC2412a(shopV3ConfirmationBottomSheetFragment6, 1));
                    } else if (C.Y(payMayaErrorActionMAction.mUrl())) {
                        InterfaceC2347a interfaceC2347a = (InterfaceC2347a) jVarQ1.c.get();
                        String strMTitle = payMayaErrorActionMAction.mTitle();
                        kotlin.jvm.internal.j.f(strMTitle, "mTitle(...)");
                        ((ShopV3ConfirmationBottomSheetFragment) interfaceC2347a).p1().setText(strMTitle);
                        InterfaceC2347a interfaceC2347a2 = (InterfaceC2347a) jVarQ1.c.get();
                        final String strMUrl = payMayaErrorActionMAction.mUrl();
                        final ShopV3ConfirmationBottomSheetFragment shopV3ConfirmationBottomSheetFragment7 = (ShopV3ConfirmationBottomSheetFragment) interfaceC2347a2;
                        final int i4 = 1;
                        shopV3ConfirmationBottomSheetFragment7.p1().setOnClickListener(new View.OnClickListener() { // from class: we.b
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i4) {
                                    case 0:
                                        ShopV3ConfirmationBottomSheetFragment shopV3ConfirmationBottomSheetFragment8 = shopV3ConfirmationBottomSheetFragment7;
                                        String str = strMUrl;
                                        Callback.onClick_enter(view);
                                        try {
                                            InterfaceC2414c interfaceC2414c = shopV3ConfirmationBottomSheetFragment8.f14783U;
                                            if (interfaceC2414c != null) {
                                                interfaceC2414c.h(str);
                                            }
                                            return;
                                        } finally {
                                        }
                                    default:
                                        ShopV3ConfirmationBottomSheetFragment shopV3ConfirmationBottomSheetFragment9 = shopV3ConfirmationBottomSheetFragment7;
                                        String str2 = strMUrl;
                                        Callback.onClick_enter(view);
                                        try {
                                            InterfaceC2414c interfaceC2414c2 = shopV3ConfirmationBottomSheetFragment9.f14783U;
                                            if (interfaceC2414c2 != null) {
                                                interfaceC2414c2.y(str2);
                                            }
                                            return;
                                        } finally {
                                        }
                                }
                            }
                        });
                    } else {
                        InterfaceC2347a interfaceC2347a3 = (InterfaceC2347a) jVarQ1.c.get();
                        String strMTitle2 = payMayaErrorActionMAction.mTitle();
                        kotlin.jvm.internal.j.f(strMTitle2, "mTitle(...)");
                        ((ShopV3ConfirmationBottomSheetFragment) interfaceC2347a3).p1().setText(strMTitle2);
                        InterfaceC2347a interfaceC2347a4 = (InterfaceC2347a) jVarQ1.c.get();
                        final String strMUrl2 = payMayaErrorActionMAction.mUrl();
                        final ShopV3ConfirmationBottomSheetFragment shopV3ConfirmationBottomSheetFragment8 = (ShopV3ConfirmationBottomSheetFragment) interfaceC2347a4;
                        final int i6 = 0;
                        shopV3ConfirmationBottomSheetFragment8.p1().setOnClickListener(new View.OnClickListener() { // from class: we.b
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i6) {
                                    case 0:
                                        ShopV3ConfirmationBottomSheetFragment shopV3ConfirmationBottomSheetFragment82 = shopV3ConfirmationBottomSheetFragment8;
                                        String str = strMUrl2;
                                        Callback.onClick_enter(view);
                                        try {
                                            InterfaceC2414c interfaceC2414c = shopV3ConfirmationBottomSheetFragment82.f14783U;
                                            if (interfaceC2414c != null) {
                                                interfaceC2414c.h(str);
                                            }
                                            return;
                                        } finally {
                                        }
                                    default:
                                        ShopV3ConfirmationBottomSheetFragment shopV3ConfirmationBottomSheetFragment9 = shopV3ConfirmationBottomSheetFragment8;
                                        String str2 = strMUrl2;
                                        Callback.onClick_enter(view);
                                        try {
                                            InterfaceC2414c interfaceC2414c2 = shopV3ConfirmationBottomSheetFragment9.f14783U;
                                            if (interfaceC2414c2 != null) {
                                                interfaceC2414c2.y(str2);
                                            }
                                            return;
                                        } finally {
                                        }
                                }
                            }
                        });
                    }
                    InterfaceC2347a interfaceC2347a5 = (InterfaceC2347a) jVarQ1.c.get();
                    String strMSpiel = payMayaError.mSpiel();
                    kotlin.jvm.internal.j.f(strMSpiel, "mSpiel(...)");
                    ShopV3ConfirmationBottomSheetFragment shopV3ConfirmationBottomSheetFragment9 = (ShopV3ConfirmationBottomSheetFragment) interfaceC2347a5;
                    shopV3ConfirmationBottomSheetFragment9.getClass();
                    K k13 = shopV3ConfirmationBottomSheetFragment9.f14780R;
                    kotlin.jvm.internal.j.d(k13);
                    k13.f3698g.setText(strMSpiel);
                    K k14 = ((ShopV3ConfirmationBottomSheetFragment) ((InterfaceC2347a) jVarQ1.c.get())).f14780R;
                    kotlin.jvm.internal.j.d(k14);
                    k14.f3699k.setVisibility(0);
                }
                ShopV3ConfirmationBottomSheetFragment shopV3ConfirmationBottomSheetFragment10 = (ShopV3ConfirmationBottomSheetFragment) ((InterfaceC2347a) jVarQ1.c.get());
                shopV3ConfirmationBottomSheetFragment10.o1().setVisibility(8);
                K k15 = shopV3ConfirmationBottomSheetFragment10.f14780R;
                kotlin.jvm.internal.j.d(k15);
                ((Group) k15.f3708u).setVisibility(0);
                K k16 = shopV3ConfirmationBottomSheetFragment10.f14780R;
                kotlin.jvm.internal.j.d(k16);
                ConstraintLayout constraintLayout = k16.e;
                kotlin.jvm.internal.j.f(constraintLayout, "containerLayoutPmaFragme…V3ConfirmationBottomSheet");
                shopV3ConfirmationBottomSheetFragment10.n1(constraintLayout);
                shopV3ConfirmationBottomSheetFragment.r1().i();
                return;
            case 15:
                ShopV3ConfirmationBottomSheetFragment shopV3ConfirmationBottomSheetFragment11 = (ShopV3ConfirmationBottomSheetFragment) this.c;
                Order order = (Order) this.f17272b;
                j jVarQ12 = shopV3ConfirmationBottomSheetFragment11.q1();
                kotlin.jvm.internal.j.g(order, "order");
                ShopV3ConfirmationBottomSheetFragment shopV3ConfirmationBottomSheetFragment12 = (ShopV3ConfirmationBottomSheetFragment) ((InterfaceC2347a) jVarQ12.c.get());
                shopV3ConfirmationBottomSheetFragment12.getClass();
                InterfaceC2414c interfaceC2414c = shopV3ConfirmationBottomSheetFragment12.f14783U;
                if (interfaceC2414c != null) {
                    PaymentConfirmationSummary paymentConfirmationSummary = shopV3ConfirmationBottomSheetFragment12.f14781S;
                    if (paymentConfirmationSummary == null) {
                        kotlin.jvm.internal.j.n("mPaymentConfirmationSummary");
                        throw null;
                    }
                    interfaceC2414c.i(order, paymentConfirmationSummary);
                }
                shopV3ConfirmationBottomSheetFragment12.dismiss();
                shopV3ConfirmationBottomSheetFragment11.r1().i();
                return;
            case 16:
                ((CameraDateBotGatherView) this.c).a((byte[]) this.f17272b);
                return;
            case 17:
                x1.h hVar = (x1.h) this.c;
                SurfaceTexture surfaceTexture = hVar.f20874g;
                Surface surface = hVar.h;
                SurfaceTexture surfaceTexture2 = (SurfaceTexture) this.f17272b;
                hVar.f20874g = surfaceTexture2;
                hVar.h = new Surface(surfaceTexture2);
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                    return;
                }
                return;
            case 18:
                int bottom = ((View) this.c).getBottom();
                ScrollView scrollView = (ScrollView) this.f17272b;
                int height = bottom - scrollView.getHeight();
                if (height < 0) {
                    height = 0;
                }
                scrollView.smoothScrollTo(0, height);
                return;
            case 19:
                ((C2496a) this.c).getClass();
                C2496a.f((C2497b) this.f17272b);
                return;
            case 20:
                BottomSheetDialog bottomSheetDialog = (BottomSheetDialog) ((ShopV3ConfirmationBottomSheetFragment) this.c).getDialog();
                if (bottomSheetDialog == null || (viewFindViewById = bottomSheetDialog.findViewById(com.paymaya.R.id.design_bottom_sheet)) == null) {
                    return;
                }
                BottomSheetBehavior.from(viewFindViewById).setPeekHeight(((ConstraintLayout) this.f17272b).getHeight(), true);
                return;
            default:
                ((MayaAbstractBaseOTPFragmentImpl) this.c).O1((TextView) this.f17272b);
                return;
        }
    }

    public /* synthetic */ a(Object obj, String str, int i) {
        this.f17271a = i;
        this.f17272b = obj;
        this.c = str;
    }
}
