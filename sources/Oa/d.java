package Oa;

import We.s;
import android.graphics.ImageFormat;
import android.hardware.Camera;
import android.util.Log;
import android.view.WindowManager;
import androidx.fragment.app.FragmentActivity;
import com.dynatrace.android.agent.conf.SessionSplitConfiguration;
import com.google.android.gms.common.images.Size;
import ee.C1437a;
import h2.w;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4780b;
    public Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4781d;
    public Object e;
    public Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f4782g;
    public final Serializable h;
    public final Object i;
    public Object j;

    public d(String str, String str2, String str3, String str4, w wVar, String str5, String str6, String str7, int i) {
        this.f4779a = 2;
        this.f4780b = str;
        this.c = str2;
        this.e = str3;
        this.f = str4;
        this.i = wVar;
        this.f4782g = str5;
        this.j = str6;
        this.h = str7;
        this.f4781d = i;
    }

    private final void d() {
        synchronized (this.f4782g) {
            g();
            ((a) this.i).getClass();
            Lh.c cVar = (Lh.c) this.j;
            if (cVar != null) {
                ((v3.d) cVar.f2990b).close();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f A[Catch: all -> 0x0016, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x0012, B:12:0x0027, B:13:0x0029, B:15:0x002f, B:16:0x0039, B:20:0x0053, B:19:0x0042, B:21:0x005c, B:11:0x0018), top: B:26:0x0003, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c A[Catch: all -> 0x0016, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x0012, B:12:0x0027, B:13:0x0029, B:15:0x002f, B:16:0x0039, B:20:0x0053, B:19:0x0042, B:21:0x005c, B:11:0x0018), top: B:26:0x0003, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized void h() {
        /*
            r5 = this;
            java.lang.String r0 = "Failed to clear camera preview: "
            monitor-enter(r5)
            java.lang.Object r1 = r5.i     // Catch: java.lang.Throwable -> L16
            Oa.a r1 = (Oa.a) r1     // Catch: java.lang.Throwable -> L16
            r2 = 0
            r1.b(r2)     // Catch: java.lang.Throwable -> L16
            java.lang.Object r1 = r5.f     // Catch: java.lang.Throwable -> L16
            java.lang.Thread r1 = (java.lang.Thread) r1     // Catch: java.lang.Throwable -> L16
            r2 = 0
            if (r1 == 0) goto L29
            r1.join()     // Catch: java.lang.Throwable -> L16 java.lang.InterruptedException -> L18
            goto L27
        L16:
            r0 = move-exception
            goto L65
        L18:
            ph.f1 r1 = yk.a.f21331b     // Catch: java.lang.Throwable -> L16
            r1.getClass()     // Catch: java.lang.Throwable -> L16
            ph.C2070f1.c()     // Catch: java.lang.Throwable -> L16
            java.lang.Object r1 = r5.f     // Catch: java.lang.Throwable -> L16
            java.lang.Thread r1 = (java.lang.Thread) r1     // Catch: java.lang.Throwable -> L16
            r1.interrupt()     // Catch: java.lang.Throwable -> L16
        L27:
            r5.f = r2     // Catch: java.lang.Throwable -> L16
        L29:
            java.lang.Object r1 = r5.c     // Catch: java.lang.Throwable -> L16
            android.hardware.Camera r1 = (android.hardware.Camera) r1     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L5c
            r1.stopPreview()     // Catch: java.lang.Throwable -> L16
            java.lang.Object r1 = r5.c     // Catch: java.lang.Throwable -> L16
            android.hardware.Camera r1 = (android.hardware.Camera) r1     // Catch: java.lang.Throwable -> L16
            r1.setPreviewCallbackWithBuffer(r2)     // Catch: java.lang.Throwable -> L16
            java.lang.Object r1 = r5.c     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L41
            android.hardware.Camera r1 = (android.hardware.Camera) r1     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L41
            r1.setPreviewDisplay(r2)     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L41
            goto L53
        L41:
            r1 = move-exception
            java.lang.String r3 = "MIDemoApp:CameraSource"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L16
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L16
            r4.append(r1)     // Catch: java.lang.Throwable -> L16
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L16
            android.util.Log.e(r3, r0)     // Catch: java.lang.Throwable -> L16
        L53:
            java.lang.Object r0 = r5.c     // Catch: java.lang.Throwable -> L16
            android.hardware.Camera r0 = (android.hardware.Camera) r0     // Catch: java.lang.Throwable -> L16
            r0.release()     // Catch: java.lang.Throwable -> L16
            r5.c = r2     // Catch: java.lang.Throwable -> L16
        L5c:
            java.io.Serializable r0 = r5.h     // Catch: java.lang.Throwable -> L16
            java.util.IdentityHashMap r0 = (java.util.IdentityHashMap) r0     // Catch: java.lang.Throwable -> L16
            r0.clear()     // Catch: java.lang.Throwable -> L16
            monitor-exit(r5)
            return
        L65:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L16
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Oa.d.h():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f A[Catch: all -> 0x0016, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x0012, B:12:0x0027, B:13:0x0029, B:15:0x002f, B:16:0x0039, B:20:0x0053, B:19:0x0042, B:21:0x005c, B:11:0x0018), top: B:26:0x0003, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c A[Catch: all -> 0x0016, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x0012, B:12:0x0027, B:13:0x0029, B:15:0x002f, B:16:0x0039, B:20:0x0053, B:19:0x0042, B:21:0x005c, B:11:0x0018), top: B:26:0x0003, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized void i() {
        /*
            r5 = this;
            java.lang.String r0 = "Failed to clear camera preview: "
            monitor-enter(r5)
            java.lang.Object r1 = r5.i     // Catch: java.lang.Throwable -> L16
            Oa.a r1 = (Oa.a) r1     // Catch: java.lang.Throwable -> L16
            r2 = 0
            r1.b(r2)     // Catch: java.lang.Throwable -> L16
            java.lang.Object r1 = r5.f     // Catch: java.lang.Throwable -> L16
            java.lang.Thread r1 = (java.lang.Thread) r1     // Catch: java.lang.Throwable -> L16
            r2 = 0
            if (r1 == 0) goto L29
            r1.join()     // Catch: java.lang.Throwable -> L16 java.lang.InterruptedException -> L18
            goto L27
        L16:
            r0 = move-exception
            goto L65
        L18:
            ph.f1 r1 = yk.a.f21331b     // Catch: java.lang.Throwable -> L16
            r1.getClass()     // Catch: java.lang.Throwable -> L16
            ph.C2070f1.c()     // Catch: java.lang.Throwable -> L16
            java.lang.Object r1 = r5.f     // Catch: java.lang.Throwable -> L16
            java.lang.Thread r1 = (java.lang.Thread) r1     // Catch: java.lang.Throwable -> L16
            r1.interrupt()     // Catch: java.lang.Throwable -> L16
        L27:
            r5.f = r2     // Catch: java.lang.Throwable -> L16
        L29:
            java.lang.Object r1 = r5.c     // Catch: java.lang.Throwable -> L16
            android.hardware.Camera r1 = (android.hardware.Camera) r1     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L5c
            r1.stopPreview()     // Catch: java.lang.Throwable -> L16
            java.lang.Object r1 = r5.c     // Catch: java.lang.Throwable -> L16
            android.hardware.Camera r1 = (android.hardware.Camera) r1     // Catch: java.lang.Throwable -> L16
            r1.setPreviewCallbackWithBuffer(r2)     // Catch: java.lang.Throwable -> L16
            java.lang.Object r1 = r5.c     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L41
            android.hardware.Camera r1 = (android.hardware.Camera) r1     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L41
            r1.setPreviewDisplay(r2)     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L41
            goto L53
        L41:
            r1 = move-exception
            java.lang.String r3 = "MIDemoApp:CameraSource"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L16
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L16
            r4.append(r1)     // Catch: java.lang.Throwable -> L16
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L16
            android.util.Log.e(r3, r0)     // Catch: java.lang.Throwable -> L16
        L53:
            java.lang.Object r0 = r5.c     // Catch: java.lang.Throwable -> L16
            android.hardware.Camera r0 = (android.hardware.Camera) r0     // Catch: java.lang.Throwable -> L16
            r0.release()     // Catch: java.lang.Throwable -> L16
            r5.c = r2     // Catch: java.lang.Throwable -> L16
        L5c:
            java.io.Serializable r0 = r5.h     // Catch: java.lang.Throwable -> L16
            java.util.IdentityHashMap r0 = (java.util.IdentityHashMap) r0     // Catch: java.lang.Throwable -> L16
            r0.clear()     // Catch: java.lang.Throwable -> L16
            monitor-exit(r5)
            return
        L65:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L16
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Oa.d.i():void");
    }

    public Camera a() throws IOException {
        int i;
        int i4;
        int i6;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        switch (this.f4779a) {
            case 0:
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                int i15 = 0;
                while (true) {
                    if (i15 < Camera.getNumberOfCameras()) {
                        Camera.getCameraInfo(i15, cameraInfo);
                        if (cameraInfo.facing != 0) {
                            i15++;
                        }
                    } else {
                        i15 = -1;
                    }
                }
                if (i15 == -1) {
                    throw new IOException("Could not find requested camera.");
                }
                Camera cameraOpen = Camera.open(i15);
                Camera.Parameters parameters = cameraOpen.getParameters();
                List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
                List<Camera.Size> supportedPictureSizes = parameters.getSupportedPictureSizes();
                ArrayList<c> arrayList = new ArrayList();
                for (Camera.Size size : supportedPreviewSizes) {
                    double d10 = ((double) size.width) / ((double) size.height);
                    Iterator<Camera.Size> it = supportedPictureSizes.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Camera.Size next = it.next();
                            i10 = i15;
                            if (Math.abs(d10 - (((double) next.width) / ((double) next.height))) < 0.009999999776482582d) {
                                arrayList.add(new c(size, next));
                            } else {
                                i15 = i10;
                            }
                        } else {
                            i10 = i15;
                        }
                    }
                    i15 = i10;
                }
                int i16 = i15;
                int[] iArr = null;
                if (arrayList.size() == 0) {
                    Log.w("MIDemoApp:CameraSource", "No preview sizes have a corresponding same-aspect-ratio picture size");
                    Iterator<Camera.Size> it2 = supportedPreviewSizes.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(new c(it2.next(), null));
                    }
                }
                int i17 = Integer.MAX_VALUE;
                c cVar = null;
                int i18 = Integer.MAX_VALUE;
                for (c cVar2 : arrayList) {
                    Size size2 = cVar2.f4777a;
                    int iAbs = Math.abs(size2.getHeight() - 720) + Math.abs(size2.getWidth() - 1280);
                    if (iAbs < i18) {
                        cVar = cVar2;
                        i18 = iAbs;
                    }
                }
                if (cVar == null) {
                    throw new IOException("Could not find suitable preview size.");
                }
                this.e = cVar.f4777a;
                Log.v("MIDemoApp:CameraSource", "Camera preview size: " + ((Size) this.e));
                int i19 = (int) (((double) 30.0f) * 1000.0d);
                for (int[] iArr2 : cameraOpen.getParameters().getSupportedPreviewFpsRange()) {
                    int i20 = i19 - iArr2[0];
                    int iAbs2 = Math.abs(i19 - iArr2[1]) + Math.abs(i20);
                    if (iAbs2 < i17) {
                        iArr = iArr2;
                        i17 = iAbs2;
                    }
                }
                if (iArr == null) {
                    throw new IOException("Could not find suitable preview frames per second range.");
                }
                Camera.Parameters parameters2 = cameraOpen.getParameters();
                Size size3 = cVar.f4778b;
                if (size3 != null) {
                    Log.v("MIDemoApp:CameraSource", "Camera picture size: " + size3);
                    parameters2.setPictureSize(size3.getWidth(), size3.getHeight());
                }
                parameters2.setPreviewSize(((Size) this.e).getWidth(), ((Size) this.e).getHeight());
                parameters2.setPreviewFpsRange(iArr[0], iArr[1]);
                parameters2.setPreviewFormat(17);
                int rotation = ((WindowManager) ((FragmentActivity) this.f4780b).getSystemService("window")).getDefaultDisplay().getRotation();
                if (rotation == 0) {
                    i = 0;
                } else if (rotation == 1) {
                    i = 90;
                } else if (rotation == 2) {
                    i = 180;
                } else if (rotation != 3) {
                    s.y(rotation, "Bad rotation value: ", "MIDemoApp:CameraSource");
                    i = 0;
                } else {
                    i = 270;
                }
                Camera.CameraInfo cameraInfo2 = new Camera.CameraInfo();
                Camera.getCameraInfo(i16, cameraInfo2);
                if (cameraInfo2.facing == 1) {
                    i4 = (cameraInfo2.orientation + i) % SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS;
                    i6 = (360 - i4) % SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS;
                } else {
                    i4 = ((cameraInfo2.orientation - i) + SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS) % SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS;
                    i6 = i4;
                }
                this.f4781d = i4 / 90;
                Log.d("MIDemoApp:CameraSource", "Display rotation is: " + rotation);
                Log.d("MIDemoApp:CameraSource", "Camera face is: " + cameraInfo2.facing);
                Log.d("MIDemoApp:CameraSource", "Camera rotation is: " + cameraInfo2.orientation);
                Log.d("MIDemoApp:CameraSource", "Rotation is: " + this.f4781d);
                cameraOpen.setDisplayOrientation(i6);
                parameters2.setRotation(i4);
                if (parameters2.getSupportedFocusModes().contains("continuous-video")) {
                    parameters2.setFocusMode("continuous-video");
                } else {
                    Log.i("MIDemoApp:CameraSource", "Camera auto focus is not supported on this device.");
                }
                cameraOpen.setParameters(parameters2);
                cameraOpen.setPreviewCallbackWithBuffer(new b(this, 0));
                cameraOpen.addCallbackBuffer(b((Size) this.e));
                cameraOpen.addCallbackBuffer(b((Size) this.e));
                cameraOpen.addCallbackBuffer(b((Size) this.e));
                cameraOpen.addCallbackBuffer(b((Size) this.e));
                return cameraOpen;
            default:
                Camera.CameraInfo cameraInfo3 = new Camera.CameraInfo();
                int i21 = 0;
                while (true) {
                    if (i21 < Camera.getNumberOfCameras()) {
                        Camera.getCameraInfo(i21, cameraInfo3);
                        if (cameraInfo3.facing != 0) {
                            i21++;
                        }
                    } else {
                        i21 = -1;
                    }
                }
                if (i21 == -1) {
                    throw new IOException("Could not find requested camera.");
                }
                Camera cameraOpen2 = Camera.open(i21);
                Camera.Parameters parameters3 = cameraOpen2.getParameters();
                List<Camera.Size> supportedPreviewSizes2 = parameters3.getSupportedPreviewSizes();
                List<Camera.Size> supportedPictureSizes2 = parameters3.getSupportedPictureSizes();
                ArrayList<C1437a> arrayList2 = new ArrayList();
                for (Camera.Size size4 : supportedPreviewSizes2) {
                    double d11 = ((double) size4.width) / ((double) size4.height);
                    Iterator<Camera.Size> it3 = supportedPictureSizes2.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            Camera.Size next2 = it3.next();
                            i14 = i21;
                            if (Math.abs(d11 - (((double) next2.width) / ((double) next2.height))) < 0.009999999776482582d) {
                                arrayList2.add(new C1437a(size4, next2));
                            } else {
                                i21 = i14;
                            }
                        } else {
                            i14 = i21;
                        }
                    }
                    i21 = i14;
                }
                int i22 = i21;
                int[] iArr3 = null;
                if (arrayList2.size() == 0) {
                    Log.w("MIDemoApp:CameraSource", "No preview sizes have a corresponding same-aspect-ratio picture size");
                    Iterator<Camera.Size> it4 = supportedPreviewSizes2.iterator();
                    while (it4.hasNext()) {
                        arrayList2.add(new C1437a(it4.next(), null));
                    }
                }
                int i23 = Integer.MAX_VALUE;
                C1437a c1437a = null;
                int i24 = Integer.MAX_VALUE;
                for (C1437a c1437a2 : arrayList2) {
                    Size size5 = c1437a2.f16649a;
                    int iAbs3 = Math.abs(size5.getHeight() - 720) + Math.abs(size5.getWidth() - 1280);
                    if (iAbs3 < i24) {
                        c1437a = c1437a2;
                        i24 = iAbs3;
                    }
                }
                if (c1437a == null) {
                    throw new IOException("Could not find suitable preview size.");
                }
                this.e = c1437a.f16649a;
                Log.v("MIDemoApp:CameraSource", "Camera preview size: " + ((Size) this.e));
                int i25 = (int) (((double) 30.0f) * 1000.0d);
                for (int[] iArr4 : cameraOpen2.getParameters().getSupportedPreviewFpsRange()) {
                    int i26 = i25 - iArr4[0];
                    int iAbs4 = Math.abs(i25 - iArr4[1]) + Math.abs(i26);
                    if (iAbs4 < i23) {
                        iArr3 = iArr4;
                        i23 = iAbs4;
                    }
                }
                if (iArr3 == null) {
                    throw new IOException("Could not find suitable preview frames per second range.");
                }
                Camera.Parameters parameters4 = cameraOpen2.getParameters();
                Size size6 = c1437a.f16650b;
                if (size6 != null) {
                    Log.v("MIDemoApp:CameraSource", "Camera picture size: " + size6);
                    parameters4.setPictureSize(size6.getWidth(), size6.getHeight());
                }
                parameters4.setPreviewSize(((Size) this.e).getWidth(), ((Size) this.e).getHeight());
                parameters4.setPreviewFpsRange(iArr3[0], iArr3[1]);
                parameters4.setPreviewFormat(17);
                int rotation2 = ((WindowManager) ((FragmentActivity) this.f4780b).getSystemService("window")).getDefaultDisplay().getRotation();
                if (rotation2 == 0) {
                    i11 = 0;
                } else if (rotation2 == 1) {
                    i11 = 90;
                } else if (rotation2 == 2) {
                    i11 = 180;
                } else if (rotation2 != 3) {
                    s.y(rotation2, "Bad rotation value: ", "MIDemoApp:CameraSource");
                    i11 = 0;
                } else {
                    i11 = 270;
                }
                Camera.CameraInfo cameraInfo4 = new Camera.CameraInfo();
                Camera.getCameraInfo(i22, cameraInfo4);
                if (cameraInfo4.facing == 1) {
                    i12 = (cameraInfo4.orientation + i11) % SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS;
                    i13 = (360 - i12) % SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS;
                } else {
                    i12 = ((cameraInfo4.orientation - i11) + SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS) % SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS;
                    i13 = i12;
                }
                this.f4781d = i12 / 90;
                Log.d("MIDemoApp:CameraSource", "Display rotation is: " + rotation2);
                Log.d("MIDemoApp:CameraSource", "Camera face is: " + cameraInfo4.facing);
                Log.d("MIDemoApp:CameraSource", "Camera rotation is: " + cameraInfo4.orientation);
                Log.d("MIDemoApp:CameraSource", "Rotation is: " + this.f4781d);
                cameraOpen2.setDisplayOrientation(i13);
                parameters4.setRotation(i12);
                if (parameters4.getSupportedFocusModes().contains("continuous-video")) {
                    parameters4.setFocusMode("continuous-video");
                } else {
                    Log.i("MIDemoApp:CameraSource", "Camera auto focus is not supported on this device.");
                }
                cameraOpen2.setParameters(parameters4);
                cameraOpen2.setPreviewCallbackWithBuffer(new b(this, 1));
                cameraOpen2.addCallbackBuffer(b((Size) this.e));
                cameraOpen2.addCallbackBuffer(b((Size) this.e));
                cameraOpen2.addCallbackBuffer(b((Size) this.e));
                cameraOpen2.addCallbackBuffer(b((Size) this.e));
                return cameraOpen2;
        }
    }

    public byte[] b(Size size) {
        switch (this.f4779a) {
            case 0:
                byte[] bArr = new byte[((int) Math.ceil(((((long) size.getHeight()) * ((long) size.getWidth())) * ((long) ImageFormat.getBitsPerPixel(17))) / 8.0d)) + 1];
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                if (!byteBufferWrap.hasArray() || byteBufferWrap.array() != bArr) {
                    throw new IllegalStateException("Failed to create valid buffer for camera source.");
                }
                ((IdentityHashMap) this.h).put(bArr, byteBufferWrap);
                return bArr;
            default:
                byte[] bArr2 = new byte[((int) Math.ceil(((((long) size.getHeight()) * ((long) size.getWidth())) * ((long) ImageFormat.getBitsPerPixel(17))) / 8.0d)) + 1];
                ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr2);
                if (!byteBufferWrap2.hasArray() || byteBufferWrap2.array() != bArr2) {
                    throw new IllegalStateException("Failed to create valid buffer for camera source.");
                }
                ((IdentityHashMap) this.h).put(bArr2, byteBufferWrap2);
                return bArr2;
        }
    }

    public void c() {
        switch (this.f4779a) {
            case 0:
                d();
                return;
            default:
                synchronized (this.f4782g) {
                    g();
                    ((a) this.i).getClass();
                    break;
                }
                return;
        }
    }

    public synchronized void e() {
    }

    public void f(Lh.c cVar) {
        synchronized (this.f4782g) {
            Lh.c cVar2 = (Lh.c) this.j;
            if (cVar2 != null) {
                ((v3.d) cVar2.f2990b).close();
            }
            this.j = cVar;
        }
    }

    public synchronized void g() {
        switch (this.f4779a) {
            case 0:
                h();
                break;
            default:
                i();
                break;
        }
    }

    public d(FragmentActivity fragmentActivity, int i) {
        this.f4779a = i;
        switch (i) {
            case 1:
                this.f4782g = new Object();
                this.h = new IdentityHashMap();
                this.f4780b = fragmentActivity;
                this.i = new a(this, (byte) 0);
                break;
            default:
                this.f4782g = new Object();
                this.h = new IdentityHashMap();
                this.f4780b = fragmentActivity;
                this.i = new a(this);
                break;
        }
    }
}
