package z3;

import We.s;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.Image;
import android.os.Build;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzac;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzad;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzaf;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzag;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzd;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzg;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzh;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzk;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzl;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzsp;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzst;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzsx;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzv;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzw;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzx;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzy;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzz;
import com.google.android.gms.vision.face.FaceDetectorV2Jni;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: z3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class BinderC2552a extends zzsx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f21365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzx f21366b;
    public final FaceDetectorV2Jni c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f21367d = -1;

    public BinderC2552a(Context context, zzst zzstVar, FaceDetectorV2Jni faceDetectorV2Jni) {
        this.f21365a = context;
        int iZzc = zzstVar.zzc();
        zzaf zzafVarZza = zzag.zza();
        zzafVarZza.zzb("models_bundled");
        zzag zzagVar = (zzag) zzafVarZza.zzn();
        int iZze = zzstVar.zze();
        zzy zzyVarZza = zzz.zza();
        zzaf zzafVarZza2 = zzag.zza();
        zzafVarZza2.zzb("models_bundled");
        zzafVarZza2.zza(iZze == 2 ? "fssd_medium_8bit_v5.tflite" : "fssd_25_8bit_v2.tflite");
        zzyVarZza.zzc((zzag) zzafVarZza2.zzn());
        zzaf zzafVarZza3 = zzag.zza();
        zzafVarZza3.zzb("models_bundled");
        zzafVarZza3.zza(iZze == 2 ? "fssd_medium_8bit_gray_v5.tflite" : "fssd_25_8bit_gray_v2.tflite");
        zzyVarZza.zzb((zzag) zzafVarZza3.zzn());
        zzaf zzafVarZza4 = zzag.zza();
        zzafVarZza4.zzb("models_bundled");
        zzafVarZza4.zza(iZze == 2 ? "fssd_anchors_v5.pb" : "fssd_anchors_v2.pb");
        zzyVarZza.zza((zzag) zzafVarZza4.zzn());
        zzyVarZza.zzd(zzagVar);
        zzz zzzVar = (zzz) zzyVarZza.zzn();
        zzw zzwVarZza = zzx.zza();
        zzwVarZza.zzd(zzzVar);
        zzk zzkVarZza = zzl.zza();
        zzkVarZza.zza(zzagVar);
        zzkVarZza.zzb(zzagVar);
        zzwVarZza.zza(zzkVarZza);
        zzac zzacVarZza = zzad.zza();
        zzacVarZza.zzb(zzagVar);
        zzacVarZza.zzc(zzagVar);
        zzacVarZza.zzd(zzagVar);
        zzacVarZza.zza(zzagVar);
        zzwVarZza.zze(zzacVarZza);
        boolean z4 = false;
        boolean z5 = iZzc == 2;
        zzwVarZza.zzg(z5);
        if (!z5 && zzstVar.zzf()) {
            z4 = true;
        }
        zzwVarZza.zzb(z4);
        zzwVarZza.zzf(zzstVar.zza());
        zzwVarZza.zzh(true);
        if (z5) {
            zzwVarZza.zzk(4);
            zzwVarZza.zzj(4);
        } else {
            int iZze2 = zzstVar.zze();
            if (iZze2 == 1) {
                zzwVarZza.zzk(2);
            } else if (iZze2 == 2) {
                zzwVarZza.zzk(3);
            }
            int iZzd = zzstVar.zzd();
            if (iZzd == 1) {
                zzwVarZza.zzj(2);
            } else if (iZzd == 2) {
                zzwVarZza.zzj(3);
            }
            int iZzb = zzstVar.zzb();
            if (iZzb == 1) {
                zzwVarZza.zzi(2);
            } else if (iZzb == 2) {
                zzwVarZza.zzi(3);
            }
        }
        this.f21366b = (zzx) zzwVarZza.zzn();
        this.c = faceDetectorV2Jni;
    }

    public static int zzf(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 4;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 2;
        }
        throw new IllegalArgumentException(s.f(i, "Unsupported rotation degree: "));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList f(com.google.android.gms.internal.mlkit_vision_face_bundled.zzv r30) {
        /*
            Method dump skipped, instruction units count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.BinderC2552a.f(com.google.android.gms.internal.mlkit_vision_face_bundled.zzv):java.util.ArrayList");
    }

    public final ArrayList g(ByteBuffer byteBuffer, zzsp zzspVar, int i) throws RemoteException {
        zzv zzvVarZzb;
        zzg zzgVarZza = zzh.zza();
        zzgVarZza.zzc(zzspVar.zzd());
        zzgVarZza.zza(zzspVar.zza());
        zzgVarZza.zze(zzf(zzspVar.zzc()));
        zzgVarZza.zzd(i);
        if (zzspVar.zze() > 0) {
            zzgVarZza.zzb(zzspVar.zze() * 1000);
        }
        zzh zzhVar = (zzh) zzgVarZza.zzn();
        boolean zIsDirect = byteBuffer.isDirect();
        FaceDetectorV2Jni faceDetectorV2Jni = this.c;
        if (zIsDirect) {
            zzvVarZzb = faceDetectorV2Jni.zzd(this.f21367d, byteBuffer, zzhVar);
        } else if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            zzvVarZzb = faceDetectorV2Jni.zzb(this.f21367d, byteBuffer.array(), zzhVar);
        } else {
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            zzvVarZzb = faceDetectorV2Jni.zzb(this.f21367d, bArr, zzhVar);
        }
        return zzvVarZzb != null ? f(zzvVarZzb) : new ArrayList();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzsy
    public final List zzb(IObjectWrapper iObjectWrapper, zzsp zzspVar) throws RemoteException {
        zzv zzvVarZzc;
        int iZzb = zzspVar.zzb();
        if (iZzb == -1) {
            return g(zzd.zza((Bitmap) ObjectWrapper.unwrap(iObjectWrapper), true), zzspVar, 2);
        }
        if (iZzb == 17) {
            return g((ByteBuffer) ObjectWrapper.unwrap(iObjectWrapper), zzspVar, 2);
        }
        if (iZzb != 35) {
            if (iZzb == 842094169) {
                return g((ByteBuffer) ObjectWrapper.unwrap(iObjectWrapper), zzspVar, 7);
            }
            String str = "Unsupported image format " + zzspVar.zzb() + " at API " + Build.VERSION.SDK_INT;
            Log.e("ThickFaceDetector", str);
            throw new RemoteException(str);
        }
        Image.Plane[] planes = ((Image) ObjectWrapper.unwrap(iObjectWrapper)).getPlanes();
        ByteBuffer buffer = planes[0].getBuffer();
        ByteBuffer buffer2 = planes[1].getBuffer();
        ByteBuffer buffer3 = planes[2].getBuffer();
        zzg zzgVarZza = zzh.zza();
        zzgVarZza.zzc(zzspVar.zzd());
        zzgVarZza.zza(zzspVar.zza());
        zzgVarZza.zze(zzf(zzspVar.zzc()));
        if (zzspVar.zze() > 0) {
            zzgVarZza.zzb(zzspVar.zze() * 1000);
        }
        zzh zzhVar = (zzh) zzgVarZza.zzn();
        if (buffer.isDirect()) {
            zzvVarZzc = this.c.zze(this.f21367d, buffer, buffer2, buffer3, planes[0].getPixelStride(), planes[1].getPixelStride(), planes[2].getPixelStride(), planes[0].getRowStride(), planes[1].getRowStride(), planes[2].getRowStride(), zzhVar);
        } else if (buffer.hasArray() && buffer.arrayOffset() == 0) {
            zzvVarZzc = this.c.zzc(this.f21367d, buffer.array(), buffer2.array(), buffer3.array(), planes[0].getPixelStride(), planes[1].getPixelStride(), planes[2].getPixelStride(), planes[0].getRowStride(), planes[1].getRowStride(), planes[2].getRowStride(), zzhVar);
        } else {
            byte[] bArr = new byte[buffer.remaining()];
            buffer.get(bArr);
            byte[] bArr2 = new byte[buffer2.remaining()];
            buffer.get(bArr);
            byte[] bArr3 = new byte[buffer3.remaining()];
            buffer.get(bArr);
            zzvVarZzc = this.c.zzc(this.f21367d, bArr, bArr2, bArr3, planes[0].getPixelStride(), planes[1].getPixelStride(), planes[2].getPixelStride(), planes[0].getRowStride(), planes[1].getRowStride(), planes[2].getRowStride(), zzhVar);
        }
        return zzvVarZzc != null ? f(zzvVarZzc) : new ArrayList();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzsy
    public final void zzc() {
        this.f21367d = this.c.zza(this.f21366b, this.f21365a.getAssets());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzsy
    public final void zzd() {
        long j = this.f21367d;
        if (j > 0) {
            this.c.zzf(j);
            this.f21367d = -1L;
        }
    }
}
