package kk;

import Rg.u;
import android.util.Log;
import androidx.fragment.app.FragmentActivity;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f18155b;
    public final /* synthetic */ FragmentActivity c;

    public /* synthetic */ a(u uVar, FragmentActivity fragmentActivity, int i) {
        this.f18154a = i;
        this.c = fragmentActivity;
        this.f18155b = uVar;
    }

    @Override // kk.d
    public final void a() {
        switch (this.f18154a) {
            case 0:
                Log.d("OpenCVManager/Helper", "Trying to install OpenCV Manager via Google Play");
                if (!Ci.b.b(this.c)) {
                    Log.d("OpenCVManager/Helper", "OpenCV package was not installed!");
                    Log.d("OpenCVManager/Helper", "Init finished with status 2");
                    Log.d("OpenCVManager/Helper", "Unbind from service");
                    Log.d("OpenCVManager/Helper", "Calling using callback");
                    this.f18155b.o(2);
                } else {
                    Ci.b.f783g = true;
                    Log.d("OpenCVManager/Helper", "Package installation started");
                }
                break;
            default:
                Log.e("OpenCVManager/Helper", "Nothing to install we just wait current installation");
                break;
        }
    }

    @Override // kk.d
    public final void b() {
        switch (this.f18154a) {
            case 0:
                Log.e("OpenCVManager/Helper", "Installation was not started! Nothing to wait!");
                break;
            default:
                Ci.b.b(this.c);
                break;
        }
    }

    @Override // kk.d
    public final void cancel() {
        switch (this.f18154a) {
            case 0:
                Log.d("OpenCVManager/Helper", "OpenCV library installation was canceled");
                Log.d("OpenCVManager/Helper", "Init finished with status 3");
                Log.d("OpenCVManager/Helper", "Calling using callback");
                this.f18155b.o(3);
                break;
            default:
                Log.d("OpenCVManager/Helper", "Waiting for OpenCV canceled by user");
                Ci.b.f783g = false;
                Log.d("OpenCVManager/Helper", "Init finished with status 3");
                Log.d("OpenCVManager/Helper", "Calling using callback");
                this.f18155b.o(3);
                break;
        }
    }

    @Override // kk.d
    public final String getPackageName() {
        switch (this.f18154a) {
        }
        return "OpenCV Manager";
    }
}
