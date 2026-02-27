package n4;

import android.content.Context;
import android.hardware.Camera;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import com.dynatrace.android.agent.conf.SessionSplitConfiguration;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import m4.p;

/* JADX INFO: renamed from: n4.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1922f {
    public static final /* synthetic */ int m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Camera f18607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Camera.CameraInfo f18608b;
    public C1917a c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public H3.b f18609d;
    public boolean e;
    public String f;
    public F.i h;
    public p i;
    public p j;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C1923g f18610g = new C1923g();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f18611k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C1921e f18612l = new C1921e(this);

    public C1922f(Context context) {
    }

    public final int a() {
        int i = this.h.c;
        int i4 = 0;
        if (i != 0) {
            if (i == 1) {
                i4 = 90;
            } else if (i == 2) {
                i4 = 180;
            } else if (i == 3) {
                i4 = 270;
            }
        }
        Camera.CameraInfo cameraInfo = this.f18608b;
        int i6 = cameraInfo.facing == 1 ? (360 - ((cameraInfo.orientation + i4) % SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS)) % SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS : ((cameraInfo.orientation - i4) + SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS) % SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS;
        Log.i(numX49.tnTj78("brEZ"), numX49.tnTj78("brEr") + i6);
        return i6;
    }

    public final void b() {
        if (this.f18607a == null) {
            throw new RuntimeException(numX49.tnTj78("brEV"));
        }
        String strTnTj78 = numX49.tnTj78("brEk");
        try {
            int iA = a();
            this.f18611k = iA;
            this.f18607a.setDisplayOrientation(iA);
        } catch (Exception unused) {
            Log.w(strTnTj78, numX49.tnTj78("brEB"));
        }
        try {
            d(false);
        } catch (Exception unused2) {
            try {
                d(true);
            } catch (Exception unused3) {
                Log.w(strTnTj78, numX49.tnTj78("brEu"));
            }
        }
        Camera.Size previewSize = this.f18607a.getParameters().getPreviewSize();
        if (previewSize == null) {
            this.j = this.i;
        } else {
            this.j = new p(previewSize.width, previewSize.height);
        }
        this.f18612l.f18606b = this.j;
    }

    public final void c() {
        int iM = X5.f.m(this.f18610g.f18613a);
        Camera cameraOpen = iM == -1 ? null : Camera.open(iM);
        this.f18607a = cameraOpen;
        if (cameraOpen == null) {
            throw new RuntimeException(numX49.tnTj78("brES"));
        }
        int iM2 = X5.f.m(this.f18610g.f18613a);
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        this.f18608b = cameraInfo;
        Camera.getCameraInfo(iM2, cameraInfo);
    }

    public final void d(boolean z4) {
        String strTnTj78;
        Camera.Parameters parameters = this.f18607a.getParameters();
        String str = this.f;
        if (str == null) {
            this.f = parameters.flatten();
        } else {
            parameters.unflatten(str);
        }
        String strTnTj782 = numX49.tnTj78("brEj");
        if (parameters == null) {
            Log.w(strTnTj782, numX49.tnTj78("brEd"));
            return;
        }
        Log.i(strTnTj782, numX49.tnTj78("brEi") + parameters.flatten());
        if (z4) {
            Log.w(strTnTj782, numX49.tnTj78("brEE"));
        }
        this.f18610g.getClass();
        int i = I3.a.f2207a;
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        String[] strArr = {numX49.tnTj78("brEF")};
        List<String> list = supportedFocusModes;
        String strTnTj783 = numX49.tnTj78("brEH");
        String strA = I3.a.a(strTnTj783, list, strArr);
        if (!z4 && strA == null) {
            strA = I3.a.a(strTnTj783, list, numX49.tnTj78("brEQ"), numX49.tnTj78("brEO"));
        }
        String strTnTj784 = numX49.tnTj78("brEt");
        if (strA != null) {
            if (strA.equals(parameters.getFocusMode())) {
                Log.i(strTnTj784, numX49.tnTj78("brEU").concat(strA));
            } else {
                parameters.setFocusMode(strA);
            }
        }
        if (!z4) {
            I3.a.b(parameters, false);
            this.f18610g.getClass();
            this.f18610g.getClass();
            this.f18610g.getClass();
        }
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        ArrayList arrayList = new ArrayList();
        if (supportedPreviewSizes == null) {
            Camera.Size previewSize = parameters.getPreviewSize();
            if (previewSize != null) {
                arrayList.add(new p(previewSize.width, previewSize.height));
            }
        } else {
            for (Camera.Size size : supportedPreviewSizes) {
                arrayList.add(new p(size.width, size.height));
            }
        }
        int[] iArr = null;
        if (arrayList.size() == 0) {
            this.i = null;
        } else {
            F.i iVar = this.h;
            int i4 = this.f18611k;
            if (i4 == -1) {
                throw new IllegalStateException(numX49.tnTj78("brEN"));
            }
            boolean z5 = i4 % 180 != 0;
            p pVar = (p) iVar.f1503b;
            if (pVar == null) {
                pVar = null;
            } else if (z5) {
                pVar = new p(pVar.f18369b, pVar.f18368a);
            }
            i iVar2 = (i) iVar.f1504d;
            iVar2.getClass();
            if (pVar != null) {
                Collections.sort(arrayList, new R.b(iVar2, pVar));
            }
            String str2 = numX49.tnTj78("brEe") + pVar;
            String strTnTj785 = numX49.tnTj78("brE8");
            Log.i(strTnTj785, str2);
            Log.i(strTnTj785, numX49.tnTj78("brEC") + arrayList);
            p pVar2 = (p) arrayList.get(0);
            this.i = pVar2;
            parameters.setPreviewSize(pVar2.f18368a, pVar2.f18369b);
        }
        if (Build.DEVICE.equals(numX49.tnTj78("brE4"))) {
            List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
            StringBuilder sb2 = new StringBuilder(numX49.tnTj78("brEo"));
            if (supportedPreviewFpsRange == null || supportedPreviewFpsRange.isEmpty()) {
                strTnTj78 = numX49.tnTj78("brEc");
            } else {
                StringBuilder sb3 = new StringBuilder(numX49.tnTj78("brEK"));
                Iterator<int[]> it = supportedPreviewFpsRange.iterator();
                while (it.hasNext()) {
                    sb3.append(Arrays.toString(it.next()));
                    if (it.hasNext()) {
                        sb3.append(numX49.tnTj78("brEw"));
                    }
                }
                sb3.append(']');
                strTnTj78 = sb3.toString();
            }
            sb2.append(strTnTj78);
            Log.i(strTnTj784, sb2.toString());
            if (supportedPreviewFpsRange != null && !supportedPreviewFpsRange.isEmpty()) {
                Iterator<int[]> it2 = supportedPreviewFpsRange.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    int[] next = it2.next();
                    int i6 = next[0];
                    int i10 = next[1];
                    if (i6 >= 10000 && i10 <= 20000) {
                        iArr = next;
                        break;
                    }
                }
                if (iArr == null) {
                    Log.i(strTnTj784, numX49.tnTj78("brEm"));
                } else {
                    int[] iArr2 = new int[2];
                    parameters.getPreviewFpsRange(iArr2);
                    if (Arrays.equals(iArr2, iArr)) {
                        Log.i(strTnTj784, numX49.tnTj78("brED") + Arrays.toString(iArr));
                    } else {
                        Log.i(strTnTj784, numX49.tnTj78("brEh") + Arrays.toString(iArr));
                        parameters.setPreviewFpsRange(iArr[0], iArr[1]);
                    }
                }
            }
        }
        Log.i(strTnTj782, numX49.tnTj78("brEM") + parameters.flatten());
        this.f18607a.setParameters(parameters);
    }

    public final void e(boolean z4) {
        String flashMode;
        Camera camera = this.f18607a;
        if (camera != null) {
            try {
                Camera.Parameters parameters = camera.getParameters();
                if (z4 != ((parameters == null || (flashMode = parameters.getFlashMode()) == null || (!com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.f16147l.equals(flashMode) && !"torch".equals(flashMode))) ? false : true)) {
                    C1917a c1917a = this.c;
                    if (c1917a != null) {
                        c1917a.c();
                    }
                    Camera.Parameters parameters2 = this.f18607a.getParameters();
                    I3.a.b(parameters2, z4);
                    this.f18610g.getClass();
                    this.f18607a.setParameters(parameters2);
                    C1917a c1917a2 = this.c;
                    if (c1917a2 != null) {
                        c1917a2.f18592a = false;
                        c1917a2.b();
                    }
                }
            } catch (RuntimeException e) {
                Log.e(numX49.tnTj78("brE6"), numX49.tnTj78("brEa"), e);
            }
        }
    }

    public final void f() {
        Camera camera = this.f18607a;
        if (camera == null || this.e) {
            return;
        }
        camera.startPreview();
        this.e = true;
        this.c = new C1917a(this.f18607a, this.f18610g);
        C1923g c1923g = this.f18610g;
        H3.b bVar = new H3.b();
        bVar.f2087a = this;
        bVar.f2088b = new Handler();
        this.f18609d = bVar;
        c1923g.getClass();
    }
}
