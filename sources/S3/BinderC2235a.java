package s3;

import B3.n;
import M1.b;
import M1.c;
import M1.d;
import M1.e;
import M1.f;
import M1.g;
import M1.h;
import M1.i;
import M1.j;
import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzan;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzba;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbc;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbm;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcc;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf;
import com.google.android.libraries.barhopper.BarhopperV3;
import com.google.android.libraries.barhopper.MultiScaleDecodingOptions;
import com.google.android.libraries.barhopper.MultiScaleDetectionOptions;
import com.google.android.libraries.barhopper.RecognitionOptions;
import dOYHB6.tiZVw8.numX49;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: s3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class BinderC2235a extends zzbm {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f20000d = {5, 7, 7, 7, 5, 5};
    public static final double[][] e = {new double[]{0.075d, 1.0d}, new double[]{0.1d, 1.0d}, new double[]{0.125d, 1.0d}, new double[]{0.2d, 2.0d}, new double[]{0.2d, 0.5d}, new double[]{0.15d, 1.0d}, new double[]{0.2d, 1.0d}, new double[]{0.25d, 1.0d}, new double[]{0.35d, 2.0d}, new double[]{0.35d, 0.5d}, new double[]{0.35d, 3.0d}, new double[]{0.35d, 0.3333d}, new double[]{0.3d, 1.0d}, new double[]{0.4d, 1.0d}, new double[]{0.5d, 1.0d}, new double[]{0.5d, 2.0d}, new double[]{0.5d, 0.5d}, new double[]{0.5d, 3.0d}, new double[]{0.5d, 0.3333d}, new double[]{0.6d, 1.0d}, new double[]{0.8d, 1.0d}, new double[]{1.0d, 1.0d}, new double[]{0.65d, 2.0d}, new double[]{0.65d, 0.5d}, new double[]{0.65d, 3.0d}, new double[]{0.65d, 0.3333d}, new double[]{1.0d, 1.0d}, new double[]{0.8d, 2.0d}, new double[]{0.8d, 0.5d}, new double[]{0.8d, 3.0d}, new double[]{0.8d, 0.3333d}, new double[]{1.0d, 1.0d}, new double[]{0.95d, 2.0d}, new double[]{0.95d, 0.5d}, new double[]{0.95d, 3.0d}, new double[]{0.95d, 0.3333d}};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzba f20002b;
    public BarhopperV3 c;

    public BinderC2235a(Context context, zzba zzbaVar) {
        this.f20001a = context;
        this.f20002b = zzbaVar;
    }

    public static zzan f(n nVar, String str, String str2) {
        if (nVar == null || str == null) {
            return null;
        }
        Matcher matcher = Pattern.compile(str2).matcher(str);
        return new zzan(nVar.d(), nVar.zzd(), nVar.a(), nVar.b(), nVar.zzc(), nVar.c(), nVar.f(), matcher.find() ? matcher.group(1) : null);
    }

    public final B3.a g(ByteBuffer byteBuffer, zzcc zzccVar, RecognitionOptions recognitionOptions) {
        BarhopperV3 barhopperV3 = (BarhopperV3) Preconditions.checkNotNull(this.c);
        if (((ByteBuffer) Preconditions.checkNotNull(byteBuffer)).isDirect()) {
            return barhopperV3.c(zzccVar.zzd(), zzccVar.zza(), byteBuffer, recognitionOptions);
        }
        if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            return barhopperV3.f(zzccVar.zzd(), zzccVar.zza(), byteBuffer.array(), recognitionOptions);
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return barhopperV3.f(zzccVar.zzd(), zzccVar.zza(), bArr, recognitionOptions);
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:506)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:509)
        */
    public final java.util.ArrayList h(com.google.android.gms.dynamic.IObjectWrapper r57, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcc r58, com.google.android.libraries.barhopper.RecognitionOptions r59) {
        /*
            Method dump skipped, instruction units count: 1254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.BinderC2235a.h(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcc, com.google.android.libraries.barhopper.RecognitionOptions):java.util.ArrayList");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbn
    public final List zzb(IObjectWrapper iObjectWrapper, zzcc zzccVar) {
        RecognitionOptions recognitionOptions = new RecognitionOptions();
        zzba zzbaVar = this.f20002b;
        recognitionOptions.a(zzbaVar.zza());
        recognitionOptions.f(zzbaVar.zzb());
        recognitionOptions.b();
        recognitionOptions.c();
        return h(iObjectWrapper, zzccVar, recognitionOptions);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbn
    public final List zzc(IObjectWrapper iObjectWrapper, zzcc zzccVar, zzbc zzbcVar) {
        RecognitionOptions recognitionOptions = new RecognitionOptions();
        zzba zzbaVar = this.f20002b;
        recognitionOptions.a(zzbaVar.zza());
        recognitionOptions.f(zzbaVar.zzb());
        recognitionOptions.b();
        recognitionOptions.c();
        MultiScaleDecodingOptions multiScaleDecodingOptions = new MultiScaleDecodingOptions();
        multiScaleDecodingOptions.a(zzbcVar.zza().zzc());
        multiScaleDecodingOptions.b(zzbcVar.zza().zza());
        multiScaleDecodingOptions.c(zzbcVar.zza().zzb());
        recognitionOptions.d(multiScaleDecodingOptions);
        MultiScaleDetectionOptions multiScaleDetectionOptions = new MultiScaleDetectionOptions();
        multiScaleDetectionOptions.a(zzbcVar.zza().zzc());
        recognitionOptions.e(multiScaleDetectionOptions);
        recognitionOptions.g(zzbcVar.zzb());
        return h(iObjectWrapper, zzccVar, recognitionOptions);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbn
    public final void zzd() {
        Context context = this.f20001a;
        if (this.c != null) {
            return;
        }
        BarhopperV3 barhopperV3 = new BarhopperV3();
        System.loadLibrary(numX49.tnTj78("b2sL"));
        this.c = barhopperV3;
        h hVarA = i.a();
        f fVarA = g.a();
        int i = 16;
        int i4 = 0;
        for (int i6 = 0; i6 < 6; i6++) {
            d dVarA = e.a();
            dVarA.c(i);
            dVarA.d(i);
            for (int i10 = 0; i10 < f20000d[i6]; i10++) {
                double[] dArr = e[i4];
                double d10 = dArr[0] * 320.0d;
                float fSqrt = (float) Math.sqrt(dArr[1]);
                float f = (float) d10;
                dVarA.a(f / fSqrt);
                dVarA.b(f * fSqrt);
                i4++;
            }
            i += i;
            fVarA.a(dVarA);
        }
        hVarA.a(fVarA);
        try {
            InputStream inputStreamOpen = context.getAssets().open("mlkit_barcode_models/barcode_ssd_mobilenet_v1_dmp25_quant.tflite");
            try {
                InputStream inputStreamOpen2 = context.getAssets().open("mlkit_barcode_models/oned_auto_regressor_mobile.tflite");
                try {
                    InputStream inputStreamOpen3 = context.getAssets().open("mlkit_barcode_models/oned_feature_extractor_mobile.tflite");
                    try {
                        BarhopperV3 barhopperV32 = (BarhopperV3) Preconditions.checkNotNull(this.c);
                        j jVarA = M1.a.a();
                        hVarA.b(zzdf.zzs(inputStreamOpen));
                        jVarA.a(hVarA);
                        b bVarA = c.a();
                        bVarA.a(zzdf.zzs(inputStreamOpen2));
                        bVarA.b(zzdf.zzs(inputStreamOpen3));
                        jVarA.b(bVarA);
                        barhopperV32.b((M1.a) jVarA.zzj());
                        if (inputStreamOpen3 != null) {
                            inputStreamOpen3.close();
                        }
                        if (inputStreamOpen2 != null) {
                            inputStreamOpen2.close();
                        }
                        if (inputStreamOpen != null) {
                            inputStreamOpen.close();
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (IOException e7) {
            throw new IllegalStateException(numX49.tnTj78("b2sr"), e7);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbn
    public final void zzf() {
        BarhopperV3 barhopperV3 = this.c;
        if (barhopperV3 != null) {
            barhopperV3.close();
            this.c = null;
        }
    }
}
