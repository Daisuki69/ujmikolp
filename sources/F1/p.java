package F1;

import Rg.u;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.fragment.app.FragmentActivity;
import com.paymaya.domain.store.M;
import org.opencv.core.Core;

/* JADX INFO: loaded from: classes2.dex */
public final class p implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1533b;

    public /* synthetic */ p(Object obj, int i) {
        this.f1532a = i;
        this.f1533b = obj;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        mk.c cVar;
        int i = 0;
        Object obj = this.f1533b;
        switch (this.f1532a) {
            case 0:
                q qVar = (q) obj;
                qVar.f1536b.c("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                qVar.a().post(new o(this, iBinder));
                return;
            case 1:
                J1.h hVar = (J1.h) obj;
                hVar.f2386b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                hVar.a().post(new I1.b(this, iBinder));
                return;
            default:
                Log.d("OpenCVManager/Helper", "Service connection created");
                int i4 = mk.b.f18443a;
                if (iBinder == null) {
                    cVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("org.opencv.engine.OpenCVEngineInterface");
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof mk.c)) {
                        mk.a aVar = new mk.a();
                        aVar.f18442a = iBinder;
                        cVar = aVar;
                    } else {
                        cVar = (mk.c) iInterfaceQueryLocalInterface;
                    }
                }
                Ci.b bVar = (Ci.b) obj;
                bVar.f785b = cVar;
                if (cVar == null) {
                    Log.d("OpenCVManager/Helper", "OpenCV Manager Service connection fails. May be service was not installed?");
                    Ci.b.a((FragmentActivity) bVar.e, (u) bVar.c);
                    return;
                }
                Ci.b.f783g = false;
                try {
                    mk.a aVar2 = (mk.a) cVar;
                    Parcel parcelObtain = Parcel.obtain();
                    Parcel parcelObtain2 = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("org.opencv.engine.OpenCVEngineInterface");
                        aVar2.f18442a.transact(1, parcelObtain, parcelObtain2, 0);
                        parcelObtain2.readException();
                        int i6 = parcelObtain2.readInt();
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        if (i6 < 2) {
                            Log.d("OpenCVManager/Helper", "Init finished with status 4");
                            Log.d("OpenCVManager/Helper", "Unbind from service");
                            ((FragmentActivity) bVar.e).unbindService((p) bVar.f);
                            Log.d("OpenCVManager/Helper", "Calling using callback");
                            ((u) bVar.c).o(4);
                            return;
                        }
                        Log.d("OpenCVManager/Helper", "Trying to get library path");
                        String strF = ((mk.a) ((mk.c) bVar.f785b)).f((String) bVar.f786d);
                        if (strF != null && strF.length() != 0) {
                            Log.d("OpenCVManager/Helper", "Trying to get library list");
                            Ci.b.h = false;
                            String strG = ((mk.a) ((mk.c) bVar.f785b)).g((String) bVar.f786d);
                            Log.d("OpenCVManager/Helper", "Library list: \"" + strG + "\"");
                            Log.d("OpenCVManager/Helper", "First attempt to load libs");
                            if (Ci.b.c(bVar, strF, strG)) {
                                Log.d("OpenCVManager/Helper", "First attempt to load libs is OK");
                                for (String str : Core.a().split(System.getProperty("line.separator"))) {
                                    Log.i("OpenCVManager/Helper", str);
                                }
                            } else {
                                Log.d("OpenCVManager/Helper", "First attempt to load libs fails");
                                i = 255;
                            }
                            Log.d("OpenCVManager/Helper", "Init finished with status " + i);
                            Log.d("OpenCVManager/Helper", "Unbind from service");
                            ((FragmentActivity) bVar.e).unbindService((p) bVar.f);
                            Log.d("OpenCVManager/Helper", "Calling using callback");
                            ((u) bVar.c).o(i);
                            return;
                        }
                        if (Ci.b.h) {
                            ((u) bVar.c).p(1, new com.google.firebase.messaging.p(this, 19));
                            return;
                        } else {
                            ((u) bVar.c).p(0, new M(this, 16));
                            return;
                        }
                    } catch (Throwable th2) {
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        throw th2;
                    }
                } catch (RemoteException e) {
                    e.printStackTrace();
                    Log.d("OpenCVManager/Helper", "Init finished with status 255");
                    Log.d("OpenCVManager/Helper", "Unbind from service");
                    ((FragmentActivity) bVar.e).unbindService((p) bVar.f);
                    Log.d("OpenCVManager/Helper", "Calling using callback");
                    ((u) bVar.c).o(255);
                    return;
                }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Object obj = this.f1533b;
        int i = 1;
        switch (this.f1532a) {
            case 0:
                q qVar = (q) obj;
                qVar.f1536b.c("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                qVar.a().post(new n(this, 1));
                break;
            case 1:
                J1.h hVar = (J1.h) obj;
                hVar.f2386b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                hVar.a().post(new J1.g(this, i));
                break;
            default:
                ((Ci.b) obj).f785b = null;
                break;
        }
    }
}
