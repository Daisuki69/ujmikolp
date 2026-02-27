package A3;

import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_common.zzaf;
import com.google.android.gms.internal.mlkit_vision_face.zzf;
import com.google.android.gms.internal.mlkit_vision_face.zzh;
import com.google.android.gms.internal.mlkit_vision_face.zzj;
import com.google.android.gms.internal.mlkit_vision_face.zzks;
import com.google.android.gms.internal.mlkit_vision_face.zzkt;
import com.google.android.gms.internal.mlkit_vision_face.zzl;
import com.google.android.gms.internal.mlkit_vision_face.zzm;
import com.google.android.gms.internal.mlkit_vision_face.zzoc;
import com.google.android.gms.internal.mlkit_vision_face.zzp;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o1.AbstractC1955a;
import of.p;
import w3.C2376a;
import y3.C2500a;
import y3.C2503d;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f45a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f46b;
    public final C2503d c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f47d;
    public final zzoc e;
    public zzj f;

    public l(Context context, C2503d c2503d, zzoc zzocVar) {
        this.f46b = context;
        this.c = c2503d;
        this.f47d = GoogleApiAvailabilityLight.getInstance().getApkVersion(context);
        this.e = zzocVar;
    }

    @Override // A3.c
    public final Pair a(C2376a c2376a) throws MlKitException {
        zzf[] zzfVarArrZze;
        if (this.f == null) {
            zzd();
        }
        zzj zzjVar = this.f;
        if (zzjVar == null) {
            throw new MlKitException("Waiting for the face detection module to be downloaded. Please wait.", 14);
        }
        try {
            zzp zzpVar = new zzp(c2376a.c, c2376a.f20687d, 0, SystemClock.elapsedRealtime(), AbstractC1955a.g(c2376a.e));
            if (c2376a.f != 35 || this.f47d < 201500000) {
                zzfVarArrZze = zzjVar.zze(ObjectWrapper.wrap(p.n(c2376a)), zzpVar);
            } else {
                Image.Plane[] planeArr = (Image.Plane[]) Preconditions.checkNotNull(null);
                zzfVarArrZze = zzjVar.zzf(ObjectWrapper.wrap(planeArr[0].getBuffer()), ObjectWrapper.wrap(planeArr[1].getBuffer()), ObjectWrapper.wrap(planeArr[2].getBuffer()), planeArr[0].getPixelStride(), planeArr[1].getPixelStride(), planeArr[2].getPixelStride(), planeArr[0].getRowStride(), planeArr[1].getRowStride(), planeArr[2].getRowStride(), zzpVar);
            }
            ArrayList arrayList = new ArrayList();
            for (zzf zzfVar : zzfVarArrZze) {
                arrayList.add(new C2500a(zzfVar));
            }
            this.c.getClass();
            AtomicBoolean atomicBoolean = h.j;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C2500a) it.next()).f21047b = -1;
            }
            return new Pair(arrayList, null);
        } catch (RemoteException e) {
            throw new MlKitException(13, "Failed to detect with legacy face detector", e);
        }
    }

    @Override // A3.c
    public final void zzb() {
        zzj zzjVar = this.f;
        if (zzjVar != null) {
            try {
                zzjVar.zzd();
            } catch (RemoteException e) {
                Log.e("LegacyFaceDelegate", "Failed to release legacy face detector.", e);
            }
            this.f = null;
        }
    }

    @Override // A3.c
    public final boolean zzd() throws MlKitException {
        Context context = this.f46b;
        C2503d c2503d = this.c;
        boolean z4 = false;
        if (this.f != null) {
            return false;
        }
        try {
            zzm zzmVarZza = zzl.zza(DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, "com.google.android.gms.vision.dynamite").instantiate("com.google.android.gms.vision.face.ChimeraNativeFaceDetectorCreator"));
            IObjectWrapper iObjectWrapperWrap = ObjectWrapper.wrap(context);
            c2503d.getClass();
            if (this.f == null) {
                this.f = zzmVarZza.zzd(iObjectWrapperWrap, new zzh(1, 1, 1, false, false, 0.1f));
            }
            if (this.f == null && !this.f45a) {
                Log.d("LegacyFaceDelegate", "Request face optional module download.");
                Feature[] featureArr = p3.j.f19034a;
                p3.j.a(context, zzaf.zzh("barcode"));
                this.f45a = true;
            }
            zzks zzksVar = zzks.NO_ERROR;
            AtomicReference atomicReference = j.f42a;
            this.e.zzf(new i(z4, zzksVar), zzkt.ON_DEVICE_FACE_LOAD);
            return false;
        } catch (RemoteException e) {
            throw new MlKitException(13, "Failed to create legacy face detector.", e);
        } catch (DynamiteModule.LoadingException e7) {
            throw new MlKitException(13, "Failed to load deprecated vision dynamite module.", e7);
        }
    }
}
