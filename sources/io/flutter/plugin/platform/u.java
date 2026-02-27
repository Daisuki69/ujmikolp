package io.flutter.plugin.platform;

import android.app.Activity;
import android.content.MutableContextWrapper;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import com.paymaya.domain.store.A0;
import io.flutter.embedding.android.AndroidTouchProcessor;
import io.flutter.embedding.android.FlutterView;
import io.flutter.embedding.android.MotionEventTracker;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.embedding.engine.systemchannels.PlatformViewsChannel;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class u {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Class[] f17246w = {SurfaceView.class};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AndroidTouchProcessor f17248b;
    public Activity c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FlutterView f17249d;
    public FlutterRenderer e;
    public io.flutter.plugin.editing.k f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PlatformViewsChannel f17250g;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f17254o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f17255p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f17256q = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f17260u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f17261v = new t(this);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.firebase.messaging.p f17247a = new com.google.firebase.messaging.p();
    public final HashMap i = new HashMap();
    public final C1617a h = new C1617a();
    public final HashMap j = new HashMap();
    public final SparseArray m = new SparseArray();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final HashSet f17257r = new HashSet();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final HashSet f17258s = new HashSet();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final SparseArray f17253n = new SparseArray();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final SparseArray f17251k = new SparseArray();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final SparseArray f17252l = new SparseArray();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final MotionEventTracker f17259t = MotionEventTracker.getInstance();

    public static void a(u uVar, PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest) {
        uVar.getClass();
        int i = platformViewCreationRequest.direction;
        if (i == 0 || i == 1) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("Trying to create a view with unknown direction value: ");
        sb2.append(platformViewCreationRequest.direction);
        sb2.append("(view id: ");
        throw new IllegalStateException(We.s.o(sb2, ")", platformViewCreationRequest.viewId));
    }

    public static void d(int i) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < i) {
            throw new IllegalStateException(androidx.camera.core.impl.a.c(i4, i, "Trying to use platform views with API ", ", required API level is: "));
        }
    }

    public static n h(FlutterRenderer flutterRenderer) {
        int i = Build.VERSION.SDK_INT;
        if (i < 29) {
            return i >= 29 ? new C1619c(flutterRenderer.createImageTexture()) : new B(flutterRenderer.createSurfaceTexture());
        }
        TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducerCreateSurfaceProducer = flutterRenderer.createSurfaceProducer();
        A0 a02 = new A0(12);
        a02.f11334b = textureRegistry$SurfaceProducerCreateSurfaceProducer;
        return a02;
    }

    public final k b(PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest, boolean z4) {
        l lVar = (l) ((HashMap) this.f17247a.f9799b).get(platformViewCreationRequest.viewType);
        if (lVar == null) {
            throw new IllegalStateException("Trying to create a platform view of unregistered type: " + platformViewCreationRequest.viewType);
        }
        k kVarCreate = lVar.create(z4 ? new MutableContextWrapper(this.c) : this.c, platformViewCreationRequest.viewId, platformViewCreationRequest.params != null ? lVar.getCreateArgsCodec().decodeMessage(platformViewCreationRequest.params) : null);
        View view = kVarCreate.getView();
        if (view == null) {
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        view.setLayoutDirection(platformViewCreationRequest.direction);
        this.f17251k.put(platformViewCreationRequest.viewId, kVarCreate);
        FlutterView flutterView = this.f17249d;
        if (flutterView == null) {
            return kVarCreate;
        }
        kVarCreate.onFlutterViewAttached(flutterView);
        return kVarCreate;
    }

    public final void c() {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.m;
            if (i >= sparseArray.size()) {
                return;
            }
            C1620d c1620d = (C1620d) sparseArray.valueAt(i);
            c1620d.detachFromRenderer();
            c1620d.closeImageReader();
            i++;
        }
    }

    public final void e(boolean z4) {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.m;
            if (i >= sparseArray.size()) {
                break;
            }
            int iKeyAt = sparseArray.keyAt(i);
            C1620d c1620d = (C1620d) sparseArray.valueAt(i);
            if (this.f17257r.contains(Integer.valueOf(iKeyAt))) {
                this.f17249d.attachOverlaySurfaceToRender(c1620d);
                z4 &= c1620d.acquireLatestImage();
            } else {
                if (!this.f17255p) {
                    c1620d.detachFromRenderer();
                }
                c1620d.setVisibility(8);
                this.f17249d.removeView(c1620d);
            }
            i++;
        }
        int i4 = 0;
        while (true) {
            SparseArray sparseArray2 = this.f17252l;
            if (i4 >= sparseArray2.size()) {
                return;
            }
            int iKeyAt2 = sparseArray2.keyAt(i4);
            View view = (View) sparseArray2.get(iKeyAt2);
            if (!this.f17258s.contains(Integer.valueOf(iKeyAt2)) || (!z4 && this.f17256q)) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
            i4++;
        }
    }

    public final float f() {
        return this.c.getResources().getDisplayMetrics().density;
    }

    public final View g(int i) {
        if (l(i)) {
            return ((E) this.i.get(Integer.valueOf(i))).a();
        }
        k kVar = (k) this.f17251k.get(i);
        if (kVar == null) {
            return null;
        }
        return kVar.getView();
    }

    public final void i() {
        for (E e : this.i.values()) {
            int width = e.f.getWidth();
            n nVar = e.f;
            int height = nVar.getHeight();
            boolean zIsFocused = e.a().isFocused();
            z zVarDetachState = e.f17212a.detachState();
            e.h.setSurface(null);
            e.h.release();
            e.h = ((DisplayManager) e.f17213b.getSystemService("display")).createVirtualDisplay("flutter-vd#" + e.e, width, height, e.f17214d, nVar.getSurface(), 0, E.i, null);
            SingleViewPresentation singleViewPresentation = new SingleViewPresentation(e.f17213b, e.h.getDisplay(), e.c, zVarDetachState, e.f17215g, zIsFocused);
            singleViewPresentation.show();
            e.f17212a.cancel();
            e.f17212a = singleViewPresentation;
        }
    }

    public final MotionEvent j(float f, PlatformViewsChannel.PlatformViewTouch platformViewTouch, boolean z4) {
        MotionEvent motionEventPop = this.f17259t.pop(MotionEventTracker.MotionEventId.from(platformViewTouch.motionEventId));
        List<List> list = (List) platformViewTouch.rawPointerCoords;
        ArrayList arrayList = new ArrayList();
        for (List list2 : list) {
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            pointerCoords.orientation = (float) ((Double) list2.get(0)).doubleValue();
            pointerCoords.pressure = (float) ((Double) list2.get(1)).doubleValue();
            pointerCoords.size = (float) ((Double) list2.get(2)).doubleValue();
            double d10 = f;
            pointerCoords.toolMajor = (float) (((Double) list2.get(3)).doubleValue() * d10);
            pointerCoords.toolMinor = (float) (((Double) list2.get(4)).doubleValue() * d10);
            pointerCoords.touchMajor = (float) (((Double) list2.get(5)).doubleValue() * d10);
            pointerCoords.touchMinor = (float) (((Double) list2.get(6)).doubleValue() * d10);
            pointerCoords.x = (float) (((Double) list2.get(7)).doubleValue() * d10);
            pointerCoords.y = (float) (((Double) list2.get(8)).doubleValue() * d10);
            arrayList.add(pointerCoords);
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) arrayList.toArray(new MotionEvent.PointerCoords[platformViewTouch.pointerCount]);
        if (!z4 && motionEventPop != null) {
            if (pointerCoordsArr.length < 1) {
                return motionEventPop;
            }
            motionEventPop.offsetLocation(pointerCoordsArr[0].x - motionEventPop.getX(), pointerCoordsArr[0].y - motionEventPop.getY());
            return motionEventPop;
        }
        List<List> list3 = (List) platformViewTouch.rawPointerPropertiesList;
        ArrayList arrayList2 = new ArrayList();
        for (List list4 : list3) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            pointerProperties.id = ((Integer) list4.get(0)).intValue();
            pointerProperties.toolType = ((Integer) list4.get(1)).intValue();
            arrayList2.add(pointerProperties);
        }
        return MotionEvent.obtain(platformViewTouch.downTime.longValue(), platformViewTouch.eventTime.longValue(), platformViewTouch.action, platformViewTouch.pointerCount, (MotionEvent.PointerProperties[]) arrayList2.toArray(new MotionEvent.PointerProperties[platformViewTouch.pointerCount]), pointerCoordsArr, platformViewTouch.metaState, platformViewTouch.buttonState, platformViewTouch.xPrecision, platformViewTouch.yPrecision, platformViewTouch.deviceId, platformViewTouch.edgeFlags, platformViewTouch.source, platformViewTouch.flags);
    }

    public final int k(double d10) {
        return (int) Math.round(d10 * ((double) f()));
    }

    public final boolean l(int i) {
        return this.i.containsKey(Integer.valueOf(i));
    }
}
