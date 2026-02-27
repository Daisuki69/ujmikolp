package io.flutter.plugin.platform;

import a7.ViewOnAttachStateChangeListenerC0636D;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import io.flutter.embedding.android.FlutterView;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorView;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.embedding.engine.systemchannels.PlatformViewsChannel;
import java.util.HashMap;
import l9.C1803a;

/* JADX INFO: loaded from: classes4.dex */
public final class t implements PlatformViewsChannel.PlatformViewsHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f17245a;

    public t(u uVar) {
        this.f17245a = uVar;
    }

    @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewsHandler
    public final void clearFocus(int i) {
        View view;
        u uVar = this.f17245a;
        if (uVar.l(i)) {
            view = ((E) uVar.i.get(Integer.valueOf(i))).a();
        } else {
            k kVar = (k) uVar.f17251k.get(i);
            if (kVar == null) {
                We.s.y(i, "Clearing focus on an unknown view with id: ", "PlatformViewsController");
                return;
            }
            view = kVar.getView();
        }
        if (view == null) {
            We.s.y(i, "Clearing focus on a null view with id: ", "PlatformViewsController");
        } else {
            view.clearFocus();
        }
    }

    @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewsHandler
    public final void createForPlatformViewLayer(PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest) {
        u uVar = this.f17245a;
        uVar.getClass();
        u.d(19);
        u.a(uVar, platformViewCreationRequest);
        uVar.b(platformViewCreationRequest, false);
        u.d(19);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [io.flutter.plugin.platform.r] */
    @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewsHandler
    public final long createForTextureLayer(final PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest) {
        p pVar;
        long j;
        final int i = 0;
        int i4 = 20;
        final int i6 = 1;
        final u uVar = this.f17245a;
        u.a(uVar, platformViewCreationRequest);
        int i10 = platformViewCreationRequest.viewId;
        SparseArray sparseArray = uVar.f17253n;
        if (sparseArray.get(i10) != null) {
            throw new IllegalStateException(We.s.f(i10, "Trying to create an already created platform view, view id: "));
        }
        if (uVar.e == null) {
            throw new IllegalStateException(We.s.f(i10, "Texture registry is null. This means that platform views controller was detached, view id: "));
        }
        if (uVar.f17249d == null) {
            throw new IllegalStateException(We.s.f(i10, "Flutter view is null. This means the platform views controller doesn't have an attached view, view id: "));
        }
        k kVarB = uVar.b(platformViewCreationRequest, true);
        View view = kVarB.getView();
        if (view.getParent() != null) {
            throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
        }
        if (E1.c.s(view, new C1803a(u.f17246w, i4))) {
            if (platformViewCreationRequest.displayMode == PlatformViewsChannel.PlatformViewCreationRequest.RequestedDisplayMode.TEXTURE_WITH_HYBRID_FALLBACK) {
                u.d(19);
                return -2L;
            }
            if (!uVar.f17260u) {
                u.d(20);
                n nVarH = u.h(uVar.e);
                int iK = uVar.k(platformViewCreationRequest.logicalWidth);
                int iK2 = uVar.k(platformViewCreationRequest.logicalHeight);
                Activity activity = uVar.c;
                int i11 = platformViewCreationRequest.viewId;
                ?? r72 = new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.r
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view2, boolean z4) {
                        switch (i6) {
                            case 0:
                                u uVar2 = uVar;
                                PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest2 = platformViewCreationRequest;
                                if (!z4) {
                                    io.flutter.plugin.editing.k kVar = uVar2.f;
                                    if (kVar != null) {
                                        kVar.b(platformViewCreationRequest2.viewId);
                                    }
                                } else {
                                    uVar2.f17250g.invokeViewFocused(platformViewCreationRequest2.viewId);
                                }
                                break;
                            default:
                                u uVar3 = uVar;
                                if (!z4) {
                                    uVar3.getClass();
                                } else {
                                    uVar3.f17250g.invokeViewFocused(platformViewCreationRequest.viewId);
                                }
                                break;
                        }
                    }
                };
                C c = E.i;
                E e = null;
                if (iK != 0 && iK2 != 0) {
                    DisplayManager displayManager = (DisplayManager) activity.getSystemService("display");
                    DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
                    nVarH.a(iK, iK2);
                    VirtualDisplay virtualDisplayCreateVirtualDisplay = displayManager.createVirtualDisplay(We.s.f(i11, "flutter-vd#"), iK, iK2, displayMetrics.densityDpi, nVarH.getSurface(), 0, E.i, null);
                    if (virtualDisplayCreateVirtualDisplay != null) {
                        e = new E(activity, uVar.h, virtualDisplayCreateVirtualDisplay, kVarB, nVarH, r72, i11);
                    }
                }
                if (e != null) {
                    uVar.i.put(Integer.valueOf(platformViewCreationRequest.viewId), e);
                    View view2 = kVarB.getView();
                    uVar.j.put(view2.getContext(), view2);
                    return nVarH.getId();
                }
                throw new IllegalStateException("Failed creating virtual display for a " + platformViewCreationRequest.viewType + " with id: " + platformViewCreationRequest.viewId);
            }
        }
        u.d(23);
        int iK3 = uVar.k(platformViewCreationRequest.logicalWidth);
        int iK4 = uVar.k(platformViewCreationRequest.logicalHeight);
        if (uVar.f17260u) {
            pVar = new p(uVar.c);
            j = -1;
        } else {
            n nVarH2 = u.h(uVar.e);
            p pVar2 = new p(uVar.c);
            pVar2.f = nVarH2;
            Surface surface = nVarH2.getSurface();
            if (surface != null && !FlutterRenderer.debugDisableSurfaceClear) {
                Canvas canvasLockHardwareCanvas = surface.lockHardwareCanvas();
                try {
                    canvasLockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
                } finally {
                    surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
                }
            }
            long id = nVarH2.getId();
            pVar = pVar2;
            j = id;
        }
        pVar.setTouchProcessor(uVar.f17248b);
        n nVar = pVar.f;
        if (nVar != null) {
            nVar.a(iK3, iK4);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iK3, iK4);
        int iK5 = uVar.k(platformViewCreationRequest.logicalTop);
        int iK6 = uVar.k(platformViewCreationRequest.logicalLeft);
        layoutParams.topMargin = iK5;
        layoutParams.leftMargin = iK6;
        pVar.setLayoutParams(layoutParams);
        View view3 = kVarB.getView();
        view3.setLayoutParams(new FrameLayout.LayoutParams(iK3, iK4));
        view3.setImportantForAccessibility(4);
        pVar.addView(view3);
        pVar.setOnDescendantFocusChangeListener(new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.r
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view22, boolean z4) {
                switch (i) {
                    case 0:
                        u uVar2 = uVar;
                        PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest2 = platformViewCreationRequest;
                        if (!z4) {
                            io.flutter.plugin.editing.k kVar = uVar2.f;
                            if (kVar != null) {
                                kVar.b(platformViewCreationRequest2.viewId);
                            }
                        } else {
                            uVar2.f17250g.invokeViewFocused(platformViewCreationRequest2.viewId);
                        }
                        break;
                    default:
                        u uVar3 = uVar;
                        if (!z4) {
                            uVar3.getClass();
                        } else {
                            uVar3.f17250g.invokeViewFocused(platformViewCreationRequest.viewId);
                        }
                        break;
                }
            }
        });
        uVar.f17249d.addView(pVar);
        sparseArray.append(platformViewCreationRequest.viewId, pVar);
        FlutterView flutterView = uVar.f17249d;
        if (flutterView == null) {
            return j;
        }
        kVarB.onFlutterViewAttached(flutterView);
        return j;
    }

    @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewsHandler
    public final void dispose(int i) {
        o oVar;
        u uVar = this.f17245a;
        k kVar = (k) uVar.f17251k.get(i);
        if (kVar == null) {
            We.s.y(i, "Disposing unknown platform view with id: ", "PlatformViewsController");
            return;
        }
        if (kVar.getView() != null) {
            View view = kVar.getView();
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
        }
        uVar.f17251k.remove(i);
        try {
            kVar.dispose();
        } catch (RuntimeException e) {
            Log.e("PlatformViewsController", "Disposing platform view threw an exception", e);
        }
        if (uVar.l(i)) {
            HashMap map = uVar.i;
            E e7 = (E) map.get(Integer.valueOf(i));
            View viewA = e7.a();
            if (viewA != null) {
                uVar.j.remove(viewA.getContext());
            }
            e7.f17212a.cancel();
            e7.f17212a.detachState();
            e7.h.release();
            e7.f.release();
            map.remove(Integer.valueOf(i));
            return;
        }
        SparseArray sparseArray = uVar.f17253n;
        p pVar = (p) sparseArray.get(i);
        if (pVar == null) {
            SparseArray sparseArray2 = uVar.f17252l;
            FlutterMutatorView flutterMutatorView = (FlutterMutatorView) sparseArray2.get(i);
            if (flutterMutatorView != null) {
                flutterMutatorView.removeAllViews();
                flutterMutatorView.unsetOnDescendantFocusChangeListener();
                ViewGroup viewGroup2 = (ViewGroup) flutterMutatorView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(flutterMutatorView);
                }
                sparseArray2.remove(i);
                return;
            }
            return;
        }
        pVar.removeAllViews();
        n nVar = pVar.f;
        if (nVar != null) {
            nVar.release();
            pVar.f = null;
        }
        ViewTreeObserver viewTreeObserver = pVar.getViewTreeObserver();
        if (viewTreeObserver.isAlive() && (oVar = pVar.f17237g) != null) {
            pVar.f17237g = null;
            viewTreeObserver.removeOnGlobalFocusChangeListener(oVar);
        }
        ViewGroup viewGroup3 = (ViewGroup) pVar.getParent();
        if (viewGroup3 != null) {
            viewGroup3.removeView(pVar);
        }
        sparseArray.remove(i);
    }

    @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewsHandler
    public final void offset(int i, double d10, double d11) {
        u uVar = this.f17245a;
        if (uVar.l(i)) {
            return;
        }
        p pVar = (p) uVar.f17253n.get(i);
        if (pVar == null) {
            We.s.y(i, "Setting offset for unknown platform view with id: ", "PlatformViewsController");
            return;
        }
        int iK = uVar.k(d10);
        int iK2 = uVar.k(d11);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) pVar.getLayoutParams();
        layoutParams.topMargin = iK;
        layoutParams.leftMargin = iK2;
        pVar.setLayoutParams(layoutParams);
    }

    @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewsHandler
    public final void onTouch(PlatformViewsChannel.PlatformViewTouch platformViewTouch) {
        int i = platformViewTouch.viewId;
        u uVar = this.f17245a;
        float f = uVar.c.getResources().getDisplayMetrics().density;
        if (uVar.l(i)) {
            E e = (E) uVar.i.get(Integer.valueOf(i));
            MotionEvent motionEventJ = uVar.j(f, platformViewTouch, true);
            SingleViewPresentation singleViewPresentation = e.f17212a;
            if (singleViewPresentation == null) {
                return;
            }
            singleViewPresentation.dispatchTouchEvent(motionEventJ);
            return;
        }
        k kVar = (k) uVar.f17251k.get(i);
        if (kVar == null) {
            We.s.y(i, "Sending touch to an unknown view with id: ", "PlatformViewsController");
            return;
        }
        View view = kVar.getView();
        if (view == null) {
            We.s.y(i, "Sending touch to a null view with id: ", "PlatformViewsController");
        } else {
            view.dispatchTouchEvent(uVar.j(f, platformViewTouch, false));
        }
    }

    @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewsHandler
    public final void resize(PlatformViewsChannel.PlatformViewResizeRequest platformViewResizeRequest, final PlatformViewsChannel.PlatformViewBufferResized platformViewBufferResized) {
        n nVar;
        double d10 = platformViewResizeRequest.newLogicalWidth;
        u uVar = this.f17245a;
        int iK = uVar.k(d10);
        int iK2 = uVar.k(platformViewResizeRequest.newLogicalHeight);
        int i = platformViewResizeRequest.viewId;
        if (!uVar.l(i)) {
            k kVar = (k) uVar.f17251k.get(i);
            p pVar = (p) uVar.f17253n.get(i);
            if (kVar == null || pVar == null) {
                We.s.y(i, "Resizing unknown platform view with id: ", "PlatformViewsController");
                return;
            }
            if ((iK > pVar.getRenderTargetWidth() || iK2 > pVar.getRenderTargetHeight()) && (nVar = pVar.f) != null) {
                nVar.a(iK, iK2);
            }
            ViewGroup.LayoutParams layoutParams = pVar.getLayoutParams();
            layoutParams.width = iK;
            layoutParams.height = iK2;
            pVar.setLayoutParams(layoutParams);
            View view = kVar.getView();
            if (view != null) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                layoutParams2.width = iK;
                layoutParams2.height = iK2;
                view.setLayoutParams(layoutParams2);
            }
            platformViewBufferResized.run(new PlatformViewsChannel.PlatformViewBufferSize((int) Math.round(((double) pVar.getRenderTargetWidth()) / ((double) uVar.f())), (int) Math.round(((double) pVar.getRenderTargetHeight()) / ((double) uVar.f()))));
            return;
        }
        final float f = uVar.f();
        final E e = (E) uVar.i.get(Integer.valueOf(i));
        io.flutter.plugin.editing.k kVar2 = uVar.f;
        if (kVar2 != null) {
            if (kVar2.e.f1542b == 3) {
                kVar2.f17205o = true;
            }
            SingleViewPresentation singleViewPresentation = e.f17212a;
            if (singleViewPresentation != null && singleViewPresentation.getView() != null) {
                e.f17212a.getView().onInputConnectionLocked();
            }
        }
        Runnable runnable = new Runnable() { // from class: io.flutter.plugin.platform.s
            @Override // java.lang.Runnable
            public final void run() {
                u uVar2 = this.f17242a.f17245a;
                io.flutter.plugin.editing.k kVar3 = uVar2.f;
                E e7 = e;
                if (kVar3 != null) {
                    if (kVar3.e.f1542b == 3) {
                        kVar3.f17205o = false;
                    }
                    SingleViewPresentation singleViewPresentation2 = e7.f17212a;
                    if (singleViewPresentation2 != null && singleViewPresentation2.getView() != null) {
                        e7.f17212a.getView().onInputConnectionUnlocked();
                    }
                }
                double dF = uVar2.c == null ? f : uVar2.f();
                platformViewBufferResized.run(new PlatformViewsChannel.PlatformViewBufferSize((int) Math.round(((double) e7.f.getWidth()) / dF), (int) Math.round(((double) e7.f.getHeight()) / dF)));
            }
        };
        int width = e.f.getWidth();
        n nVar2 = e.f;
        if (iK == width && iK2 == nVar2.getHeight()) {
            e.a().postDelayed(runnable, 0L);
            return;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            View viewA = e.a();
            nVar2.a(iK, iK2);
            e.h.resize(iK, iK2, e.f17214d);
            e.h.setSurface(nVar2.getSurface());
            viewA.postDelayed(runnable, 0L);
            return;
        }
        boolean zIsFocused = e.a().isFocused();
        z zVarDetachState = e.f17212a.detachState();
        e.h.setSurface(null);
        e.h.release();
        DisplayManager displayManager = (DisplayManager) e.f17213b.getSystemService("display");
        nVar2.a(iK, iK2);
        e.h = displayManager.createVirtualDisplay("flutter-vd#" + e.e, iK, iK2, e.f17214d, nVar2.getSurface(), 0, E.i, null);
        View viewA2 = e.a();
        viewA2.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0636D(viewA2, runnable, 1));
        SingleViewPresentation singleViewPresentation2 = new SingleViewPresentation(e.f17213b, e.h.getDisplay(), e.c, zVarDetachState, e.f17215g, zIsFocused);
        singleViewPresentation2.show();
        e.f17212a.cancel();
        e.f17212a = singleViewPresentation2;
    }

    @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewsHandler
    public final void setDirection(int i, int i4) {
        View view;
        if (i4 != 0 && i4 != 1) {
            throw new IllegalStateException(androidx.camera.core.impl.a.h("Trying to set unknown direction value: ", i4, "(view id: ", i, ")"));
        }
        u uVar = this.f17245a;
        if (uVar.l(i)) {
            view = ((E) uVar.i.get(Integer.valueOf(i))).a();
        } else {
            k kVar = (k) uVar.f17251k.get(i);
            if (kVar == null) {
                We.s.y(i, "Setting direction to an unknown view with id: ", "PlatformViewsController");
                return;
            }
            view = kVar.getView();
        }
        if (view == null) {
            We.s.y(i, "Setting direction to a null view with id: ", "PlatformViewsController");
        } else {
            view.setLayoutDirection(i4);
        }
    }

    @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewsHandler
    public final void synchronizeToNativeViewHierarchy(boolean z4) {
        this.f17245a.f17256q = z4;
    }
}
