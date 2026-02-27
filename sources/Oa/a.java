package Oa;

import android.hardware.Camera;
import android.util.Log;
import com.google.android.gms.common.images.Size;
import e2.C1421c;
import java.nio.ByteBuffer;
import ph.C2070f1;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4772a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4773b = new Object();
    public boolean c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ByteBuffer f4774d;
    public final /* synthetic */ Object e;

    public a(d dVar) {
        this.e = dVar;
    }

    private final void a() {
        boolean z4;
        ByteBuffer byteBuffer;
        while (true) {
            synchronized (this.f4773b) {
                while (true) {
                    z4 = this.c;
                    if (!z4 || this.f4774d != null) {
                        break;
                    }
                    try {
                        this.f4773b.wait();
                    } catch (InterruptedException unused) {
                        yk.a.f21331b.getClass();
                        C2070f1.c();
                        Thread.currentThread().interrupt();
                        return;
                    }
                }
                if (!z4) {
                    return;
                }
                byteBuffer = this.f4774d;
                this.f4774d = null;
            }
            try {
                synchronized (((d) this.e).f4782g) {
                    Log.d("MIDemoApp:CameraSource", "Process an image");
                    d dVar = (d) this.e;
                    ((Lh.c) dVar.j).s(byteBuffer, new h(((Size) dVar.e).getWidth(), ((Size) ((d) this.e).e).getHeight(), ((d) this.e).f4781d));
                }
            } catch (Exception e) {
                Log.e("MIDemoApp:CameraSource", "Exception thrown from receiver.", e);
            } finally {
                ((Camera) ((d) this.e).c).addCallbackBuffer(byteBuffer.array());
            }
        }
    }

    private final void c(boolean z4) {
        synchronized (this.f4773b) {
            this.c = z4;
            this.f4773b.notifyAll();
        }
    }

    public final void b(boolean z4) {
        switch (this.f4772a) {
            case 0:
                c(z4);
                return;
            default:
                synchronized (this.f4773b) {
                    this.c = z4;
                    this.f4773b.notifyAll();
                    break;
                }
                return;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4;
        ByteBuffer byteBuffer;
        switch (this.f4772a) {
            case 0:
                a();
                return;
        }
        while (true) {
            synchronized (this.f4773b) {
                while (true) {
                    z4 = this.c;
                    if (z4 && this.f4774d == null) {
                        try {
                            this.f4773b.wait();
                        } catch (InterruptedException unused) {
                            yk.a.f21331b.getClass();
                            C2070f1.c();
                            Thread.currentThread().interrupt();
                            return;
                        }
                    }
                }
                if (!z4) {
                    return;
                }
                byteBuffer = this.f4774d;
                this.f4774d = null;
            }
            try {
                synchronized (((d) this.e).f4782g) {
                    Log.d("MIDemoApp:CameraSource", "Process an image");
                    d dVar = (d) this.e;
                    ((C1421c) dVar.j).k(byteBuffer, new h(((Size) dVar.e).getWidth(), ((Size) ((d) this.e).e).getHeight(), ((d) this.e).f4781d));
                }
            } catch (Exception e) {
                Log.e("MIDemoApp:CameraSource", "Exception thrown from receiver.", e);
            } finally {
                ((Camera) ((d) this.e).c).addCallbackBuffer(byteBuffer.array());
            }
        }
    }

    public a(d dVar, byte b8) {
        this.e = dVar;
    }
}
