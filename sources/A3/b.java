package A3;

import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.Feature;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.face.ModuleDescriptor;
import com.google.android.gms.internal.mlkit_common.zzaf;
import com.google.android.gms.internal.mlkit_vision_common.zzms;
import com.google.android.gms.internal.mlkit_vision_common.zzmu;
import com.google.android.gms.internal.mlkit_vision_face.zzks;
import com.google.android.gms.internal.mlkit_vision_face.zzkt;
import com.google.android.gms.internal.mlkit_vision_face.zzoc;
import com.google.android.gms.internal.mlkit_vision_face.zzoq;
import com.google.android.gms.internal.mlkit_vision_face.zzou;
import com.google.android.gms.internal.mlkit_vision_face.zzow;
import com.google.android.gms.internal.mlkit_vision_face.zzoy;
import com.google.android.gms.internal.mlkit_vision_face.zzpa;
import com.google.mlkit.common.MlKitException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o1.AbstractC1955a;
import of.p;
import w3.C2376a;
import x3.C2463b;
import y3.C2500a;
import y3.C2503d;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f25a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2503d f26b;
    public boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f27d;
    public boolean e;
    public final zzoc f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public zzoy f28g;

    public b(Context context, C2503d c2503d, zzoc zzocVar) {
        this.f25a = context;
        this.f26b = c2503d;
        this.f = zzocVar;
    }

    @Override // A3.c
    public final Pair a(C2376a c2376a) throws MlKitException {
        ArrayList arrayList;
        C2376a c2376a2 = c2376a;
        if (this.f28g == null) {
            zzd();
        }
        if (!this.c) {
            try {
                zzoy zzoyVar = this.f28g;
                if (zzoyVar != null) {
                    zzoyVar.zze();
                }
                this.c = true;
            } catch (RemoteException e) {
                throw new MlKitException(13, "Failed to init face detector.", e);
            }
        }
        zzoy zzoyVar2 = this.f28g;
        if (zzoyVar2 != null) {
            if (c2376a2.f == -1) {
                ByteBuffer byteBufferN = p.n(c2376a2);
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                int i = c2376a2.c;
                int i4 = c2376a2.f20687d;
                int i6 = c2376a2.e;
                c2376a2 = new C2376a(byteBufferN, i, i4, i6);
                zzmu.zza(zzms.zzb("vision-common"), 17, 3, jElapsedRealtime, i4, i, byteBufferN.limit(), i6);
            }
            zzoq zzoqVar = new zzoq(c2376a2.f, c2376a2.c, c2376a2.f20687d, AbstractC1955a.g(c2376a2.e), SystemClock.elapsedRealtime());
            C2463b.f20895b.getClass();
            try {
                List listZzd = zzoyVar2.zzd(C2463b.a(c2376a2), zzoqVar);
                arrayList = new ArrayList();
                Iterator it = listZzd.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C2500a((zzow) it.next()));
                }
                this.f26b.getClass();
                AtomicBoolean atomicBoolean = h.j;
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((C2500a) it2.next()).f21047b = -1;
                }
            } catch (RemoteException e7) {
                throw new MlKitException(13, "Failed to run face detector.", e7);
            }
        } else {
            arrayList = null;
        }
        return new Pair(arrayList, null);
    }

    public final void b() {
        this.f26b.getClass();
        if (this.f28g == null) {
            zzou zzouVar = new zzou(2, 2, 2, 1, false, 0.1f);
            boolean z4 = this.f27d;
            Context context = this.f25a;
            this.f28g = z4 ? zzpa.zza(DynamiteModule.load(context, DynamiteModule.PREFER_LOCAL, ModuleDescriptor.MODULE_ID).instantiate("com.google.mlkit.vision.face.bundled.internal.ThickFaceDetectorCreator")).zzd(ObjectWrapper.wrap(context), zzouVar) : zzpa.zza(DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, "com.google.android.gms.vision.face").instantiate("com.google.android.gms.vision.face.mlkit.FaceDetectorCreator")).zzd(ObjectWrapper.wrap(context), zzouVar);
        }
    }

    @Override // A3.c
    public final void zzb() {
        try {
            zzoy zzoyVar = this.f28g;
            if (zzoyVar != null) {
                zzoyVar.zzf();
                this.f28g = null;
            }
        } catch (RemoteException e) {
            Log.e("DecoupledFaceDelegate", "Failed to release face detector.", e);
        }
        this.c = false;
    }

    @Override // A3.c
    public final boolean zzd() throws MlKitException {
        if (this.f28g != null) {
            return this.f27d;
        }
        Context context = this.f25a;
        int localVersion = DynamiteModule.getLocalVersion(context, ModuleDescriptor.MODULE_ID);
        zzoc zzocVar = this.f;
        if (localVersion > 0) {
            this.f27d = true;
            try {
                b();
            } catch (RemoteException e) {
                throw new MlKitException(13, "Failed to create thick face detector.", e);
            } catch (DynamiteModule.LoadingException e7) {
                throw new MlKitException(13, "Failed to load the bundled face module.", e7);
            }
        } else {
            this.f27d = false;
            try {
                b();
            } catch (RemoteException e10) {
                boolean z4 = this.f27d;
                zzks zzksVar = zzks.OPTIONAL_MODULE_INIT_ERROR;
                AtomicReference atomicReference = j.f42a;
                zzocVar.zzf(new i(z4, zzksVar), zzkt.ON_DEVICE_FACE_LOAD);
                throw new MlKitException(13, "Failed to create thin face detector.", e10);
            } catch (DynamiteModule.LoadingException e11) {
                if (!this.e) {
                    Feature[] featureArr = p3.j.f19034a;
                    p3.j.a(context, zzaf.zzh("face"));
                    this.e = true;
                }
                boolean z5 = this.f27d;
                zzks zzksVar2 = zzks.OPTIONAL_MODULE_NOT_AVAILABLE;
                AtomicReference atomicReference2 = j.f42a;
                zzocVar.zzf(new i(z5, zzksVar2), zzkt.ON_DEVICE_FACE_LOAD);
                throw new MlKitException(14, "Waiting for the face module to be downloaded. Please wait.", e11);
            }
        }
        boolean z8 = this.f27d;
        zzks zzksVar3 = zzks.NO_ERROR;
        AtomicReference atomicReference3 = j.f42a;
        zzocVar.zzf(new i(z8, zzksVar3), zzkt.ON_DEVICE_FACE_LOAD);
        return this.f27d;
    }
}
