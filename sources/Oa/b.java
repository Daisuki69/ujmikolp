package Oa;

import android.hardware.Camera;
import android.util.Log;
import java.nio.ByteBuffer;
import java.util.IdentityHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements Camera.PreviewCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4776b;

    public /* synthetic */ b(Object obj, int i) {
        this.f4775a = i;
        this.f4776b = obj;
    }

    private final void a(byte[] bArr, Camera camera) {
        a aVar = (a) ((d) this.f4776b).i;
        synchronized (aVar.f4773b) {
            try {
                ByteBuffer byteBuffer = aVar.f4774d;
                if (byteBuffer != null) {
                    camera.addCallbackBuffer(byteBuffer.array());
                    aVar.f4774d = null;
                }
                if (!((IdentityHashMap) ((d) aVar.e).h).containsKey(bArr)) {
                    Log.d("MIDemoApp:CameraSource", "Skipping frame. Could not find ByteBuffer associated with the image data from the camera.");
                } else {
                    aVar.f4774d = (ByteBuffer) ((IdentityHashMap) ((d) aVar.e).h).get(bArr);
                    aVar.f4773b.notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.hardware.Camera.PreviewCallback
    public final void onPreviewFrame(byte[] bArr, Camera camera) {
        switch (this.f4775a) {
            case 0:
                a(bArr, camera);
                return;
            default:
                a aVar = (a) ((d) this.f4776b).i;
                synchronized (aVar.f4773b) {
                    try {
                        ByteBuffer byteBuffer = aVar.f4774d;
                        if (byteBuffer != null) {
                            camera.addCallbackBuffer(byteBuffer.array());
                            aVar.f4774d = null;
                        }
                        if (!((IdentityHashMap) ((d) aVar.e).h).containsKey(bArr)) {
                            Log.d("MIDemoApp:CameraSource", "Skipping frame. Could not find ByteBuffer associated with the image data from the camera.");
                            return;
                        } else {
                            aVar.f4774d = (ByteBuffer) ((IdentityHashMap) ((d) aVar.e).h).get(bArr);
                            aVar.f4773b.notifyAll();
                            return;
                        }
                    } finally {
                    }
                }
        }
    }
}
