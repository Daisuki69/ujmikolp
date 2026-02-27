package com.google.android.libraries.barhopper;

import B3.a;
import android.graphics.Bitmap;
import android.util.Log;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzds;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzer;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class BarhopperV3 implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f9711a;

    private native void closeNative(long j);

    private native long createNativeWithClientOptions(byte[] bArr);

    public static a i(byte[] bArr) {
        bArr.getClass();
        try {
            return a.a(bArr, zzds.zza());
        } catch (zzer e) {
            throw new IllegalStateException("Received unexpected BarhopperResponse buffer: {0}", e);
        }
    }

    private native byte[] recognizeBitmapNative(long j, Bitmap bitmap, RecognitionOptions recognitionOptions);

    private native byte[] recognizeBufferNative(long j, int i, int i4, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions);

    private native byte[] recognizeNative(long j, int i, int i4, byte[] bArr, RecognitionOptions recognitionOptions);

    public final void b(M1.a aVar) {
        if (this.f9711a != 0) {
            Log.w("BarhopperV3", "Native pointer already exists.");
            return;
        }
        long jCreateNativeWithClientOptions = createNativeWithClientOptions(aVar.zzD());
        this.f9711a = jCreateNativeWithClientOptions;
        if (jCreateNativeWithClientOptions == 0) {
            throw new IllegalArgumentException("Failed to create native pointer with client options.");
        }
    }

    public final a c(int i, int i4, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions) {
        long j = this.f9711a;
        if (j != 0) {
            return i(recognizeBufferNative(j, i, i4, byteBuffer, recognitionOptions));
        }
        throw new IllegalStateException("Native pointer does not exist.");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j = this.f9711a;
        if (j != 0) {
            closeNative(j);
            this.f9711a = 0L;
        }
    }

    public final a f(int i, int i4, byte[] bArr, RecognitionOptions recognitionOptions) {
        long j = this.f9711a;
        if (j != 0) {
            return i(recognizeNative(j, i, i4, bArr, recognitionOptions));
        }
        throw new IllegalStateException("Native pointer does not exist.");
    }

    public final a g(Bitmap bitmap, RecognitionOptions recognitionOptions) {
        if (this.f9711a == 0) {
            throw new IllegalStateException("Native pointer does not exist.");
        }
        Bitmap.Config config = bitmap.getConfig();
        Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
        if (config != config2) {
            Log.d("BarhopperV3", "Input bitmap config is not ARGB_8888. Converting it to ARGB_8888 from ".concat(String.valueOf(bitmap.getConfig())));
            bitmap = bitmap.copy(config2, bitmap.isMutable());
        }
        return i(recognizeBitmapNative(this.f9711a, bitmap, recognitionOptions));
    }
}
