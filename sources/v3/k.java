package v3;

import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_common.zzaf;
import com.google.android.gms.internal.mlkit_vision_barcode.zzah;
import com.google.android.gms.internal.mlkit_vision_barcode.zzaj;
import com.google.android.gms.internal.mlkit_vision_barcode.zzal;
import com.google.android.gms.internal.mlkit_vision_barcode.zzan;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrb;
import com.google.android.gms.internal.mlkit_vision_barcode.zzu;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwp;
import com.google.mlkit.common.MlKitException;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import o1.AbstractC1955a;
import of.p;
import t3.C2268a;
import w3.C2376a;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f20472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f20473b;
    public final zzah c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzwp f20474d;
    public zzaj e;

    public k(Context context, r3.b bVar, zzwp zzwpVar) {
        zzah zzahVar = new zzah();
        this.c = zzahVar;
        this.f20473b = context;
        zzahVar.zza = bVar.f19848a;
        this.f20474d = zzwpVar;
    }

    @Override // v3.h
    public final ArrayList a(C2376a c2376a) throws MlKitException {
        zzu[] zzuVarArrZzf;
        String strTnTj78 = numX49.tnTj78("bbcP");
        if (this.e == null) {
            zzc();
        }
        zzaj zzajVar = this.e;
        if (zzajVar == null) {
            throw new MlKitException(numX49.tnTj78("bbc2"), 14);
        }
        zzaj zzajVar2 = (zzaj) Preconditions.checkNotNull(zzajVar);
        zzan zzanVar = new zzan(c2376a.c, c2376a.f20687d, 0, 0L, AbstractC1955a.g(c2376a.e));
        try {
            int i = c2376a.f;
            if (i == -1) {
                zzuVarArrZzf = zzajVar2.zzf(ObjectWrapper.wrap(c2376a.f20685a), zzanVar);
            } else if (i == 17) {
                zzuVarArrZzf = zzajVar2.zze(ObjectWrapper.wrap(c2376a.f20686b), zzanVar);
            } else if (i == 35) {
                Image.Plane[] planeArr = (Image.Plane[]) Preconditions.checkNotNull(null);
                zzanVar.zza = planeArr[0].getRowStride();
                zzuVarArrZzf = zzajVar2.zze(ObjectWrapper.wrap(planeArr[0].getBuffer()), zzanVar);
            } else {
                if (i != 842094169) {
                    throw new MlKitException(strTnTj78 + c2376a.f, 3);
                }
                zzuVarArrZzf = zzajVar2.zze(ObjectWrapper.wrap(p.n(c2376a)), zzanVar);
            }
            ArrayList arrayList = new ArrayList();
            for (zzu zzuVar : zzuVarArrZzf) {
                arrayList.add(new C2268a(new i(zzuVar, 1)));
            }
            return arrayList;
        } catch (RemoteException e) {
            throw new MlKitException(13, numX49.tnTj78("bbcb"), e);
        }
    }

    @Override // v3.h
    public final void zzb() {
        zzaj zzajVar = this.e;
        if (zzajVar != null) {
            try {
                zzajVar.zzd();
            } catch (RemoteException e) {
                Log.e(numX49.tnTj78("bbcL"), numX49.tnTj78("bbcr"), e);
            }
            this.e = null;
        }
    }

    @Override // v3.h
    public final boolean zzc() throws MlKitException {
        Context context = this.f20473b;
        if (this.e != null) {
            return false;
        }
        try {
            zzaj zzajVarZzd = zzal.zza(DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, "com.google.android.gms.vision.dynamite").instantiate("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator")).zzd(ObjectWrapper.wrap(context), this.c);
            this.e = zzajVarZzd;
            zzwp zzwpVar = this.f20474d;
            if (zzajVarZzd == null && !this.f20472a) {
                Log.d("LegacyBarcodeScanner", "Request optional module download.");
                Feature[] featureArr = p3.j.f19034a;
                p3.j.a(context, zzaf.zzh("barcode"));
                this.f20472a = true;
                AbstractC2338a.b(zzwpVar, zzrb.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new MlKitException("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            AbstractC2338a.b(zzwpVar, zzrb.NO_ERROR);
            return false;
        } catch (RemoteException e) {
            throw new MlKitException(13, numX49.tnTj78("bbck"), e);
        } catch (DynamiteModule.LoadingException e7) {
            throw new MlKitException(13, numX49.tnTj78("bbcZ"), e7);
        }
    }
}
