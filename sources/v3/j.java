package v3;

import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstall;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcs;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrb;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyb;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyl;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyn;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyu;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.common.MlKitException;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import o1.AbstractC1955a;
import p3.r;
import p3.t;
import t3.C2268a;
import w3.C2376a;
import x3.C2463b;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements h {
    public static final zzcs h = zzcs.zzh(numX49.tnTj78("bbcd"), numX49.tnTj78("bbci"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f20468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f20469b;
    public boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f20470d;
    public final r3.b e;
    public final zzwp f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public zzyl f20471g;

    public j(Context context, r3.b bVar, zzwp zzwpVar) {
        this.f20470d = context;
        this.e = bVar;
        this.f = zzwpVar;
    }

    @Override // v3.h
    public final ArrayList a(C2376a c2376a) throws Throwable {
        if (this.f20471g == null) {
            zzc();
        }
        zzyl zzylVar = (zzyl) Preconditions.checkNotNull(this.f20471g);
        if (!this.f20468a) {
            try {
                zzylVar.zze();
                this.f20468a = true;
            } catch (RemoteException e) {
                throw new MlKitException(13, numX49.tnTj78("bbcE"), e);
            }
        }
        zzyu zzyuVar = new zzyu(c2376a.f, c2376a.f == 35 ? ((Image.Plane[]) Preconditions.checkNotNull(null))[0].getRowStride() : c2376a.c, c2376a.f20687d, AbstractC1955a.g(c2376a.e), SystemClock.elapsedRealtime());
        C2463b.f20895b.getClass();
        try {
            List listZzd = zzylVar.zzd(C2463b.a(c2376a), zzyuVar);
            ArrayList arrayList = new ArrayList();
            Iterator it = listZzd.iterator();
            while (it.hasNext()) {
                arrayList.add(new C2268a(new i((zzyb) it.next(), 0)));
            }
            return arrayList;
        } catch (RemoteException e7) {
            throw new MlKitException(13, numX49.tnTj78("bbcF"), e7);
        }
    }

    public final zzyl b(DynamiteModule.VersionPolicy versionPolicy, String str, String str2) {
        Context context = this.f20470d;
        return zzyn.zza(DynamiteModule.load(context, versionPolicy, str).instantiate(str2)).zzd(ObjectWrapper.wrap(context), new zzyd(this.e.f19848a, false));
    }

    @Override // v3.h
    public final void zzb() {
        zzyl zzylVar = this.f20471g;
        if (zzylVar != null) {
            try {
                zzylVar.zzf();
            } catch (RemoteException e) {
                Log.e(numX49.tnTj78("bbcH"), numX49.tnTj78("bbcO"), e);
            }
            this.f20471g = null;
            this.f20468a = false;
        }
    }

    @Override // v3.h
    public final boolean zzc() throws Throwable {
        boolean zAreModulesAvailable = false;
        if (this.f20471g != null) {
            return this.f20469b;
        }
        Context context = this.f20470d;
        String strTnTj78 = numX49.tnTj78("bbcQ");
        boolean z4 = DynamiteModule.getLocalVersion(context, strTnTj78) > 0;
        zzwp zzwpVar = this.f;
        if (z4) {
            this.f20469b = true;
            try {
                this.f20471g = b(DynamiteModule.PREFER_LOCAL, strTnTj78, "com.google.mlkit.vision.barcode.bundled.internal.ThickBarcodeScannerCreator");
            } catch (RemoteException e) {
                throw new MlKitException(13, numX49.tnTj78("bbct"), e);
            } catch (DynamiteModule.LoadingException e7) {
                throw new MlKitException(13, numX49.tnTj78("bbcU"), e7);
            }
        } else {
            this.f20469b = false;
            Feature[] featureArr = p3.j.f19034a;
            int apkVersion = GoogleApiAvailabilityLight.getInstance().getApkVersion(context);
            zzcs zzcsVar = h;
            if (apkVersion >= 221500000) {
                try {
                    zAreModulesAvailable = ((ModuleAvailabilityResponse) Tasks.await(ModuleInstall.getClient(context).areModulesAvailable(new r(p3.j.b(p3.j.e, zzcsVar), 1)).addOnFailureListener(new t()))).areModulesAvailable();
                } catch (InterruptedException | ExecutionException e10) {
                    Log.e(numX49.tnTj78("bbce"), numX49.tnTj78("bbc8"), e10);
                }
            } else {
                try {
                    Iterator it = zzcsVar.iterator();
                    while (it.hasNext()) {
                        DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, (String) it.next());
                    }
                    zAreModulesAvailable = true;
                } catch (DynamiteModule.LoadingException unused) {
                }
            }
            if (!zAreModulesAvailable) {
                if (!this.c) {
                    p3.j.a(context, zzcs.zzh(numX49.tnTj78("bbcC"), "tflite_dynamite"));
                    this.c = true;
                }
                AbstractC2338a.b(zzwpVar, zzrb.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new MlKitException(numX49.tnTj78("bbc4"), 14);
            }
            try {
                this.f20471g = b(DynamiteModule.PREFER_REMOTE, "com.google.android.gms.vision.barcode", "com.google.android.gms.vision.barcode.mlkit.BarcodeScannerCreator");
            } catch (RemoteException | DynamiteModule.LoadingException e11) {
                AbstractC2338a.b(zzwpVar, zzrb.OPTIONAL_MODULE_INIT_ERROR);
                throw new MlKitException(13, numX49.tnTj78("bbco"), e11);
            }
        }
        AbstractC2338a.b(zzwpVar, zzrb.NO_ERROR);
        return this.f20469b;
    }
}
