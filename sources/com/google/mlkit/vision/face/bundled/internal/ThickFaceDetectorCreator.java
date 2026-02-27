package com.google.mlkit.vision.face.bundled.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzst;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzsy;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzta;
import com.google.android.gms.vision.face.FaceDetectorV2Jni;
import z3.BinderC2552a;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
@DynamiteApi
public class ThickFaceDetectorCreator extends zzta {
    static {
        System.loadLibrary("face_detector_v2_jni");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zztb
    public zzsy newFaceDetector(IObjectWrapper iObjectWrapper, zzst zzstVar) throws RemoteException {
        return new BinderC2552a((Context) ObjectWrapper.unwrap(iObjectWrapper), zzstVar, new FaceDetectorV2Jni());
    }
}
