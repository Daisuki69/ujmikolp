package of;

import G5.ViewOnFocusChangeListenerC0257g;
import S1.C0590d;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.drm.DrmManagerClient;
import android.graphics.Bitmap;
import android.media.Image;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.media3.extractor.ts.TsExtractor;
import bj.C1030a;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.AbstractC1173g;
import com.google.mlkit.common.MlKitException;
import com.paymaya.domain.model.KycFieldType;
import com.paymaya.mayaui.kyczoloz.view.widget.KycMayaDropDown;
import dOYHB6.tiZVw8.numX49;
import h4.C1538b;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterEngineCache;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import w3.C2376a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static o f18839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static long f18840b;
    public static long c;

    public static final void B(View view) {
        kotlin.jvm.internal.j.g(view, numX49.tnTj78("bQuN"));
        view.post(new Ke.f(view, 0));
    }

    public static final void C(AppCompatEditText appCompatEditText, Function1 function1) {
        kotlin.jvm.internal.j.g(appCompatEditText, numX49.tnTj78("bQu6"));
        appCompatEditText.setOnEditorActionListener(new Ke.e(function1, 0));
    }

    public static final void D(KycMayaDropDown kycMayaDropDown, KycFieldType kycFieldType, G8.b bVar, Function2 function2, Function1 function1) {
        kotlin.jvm.internal.j.g(kycFieldType, numX49.tnTj78("bQua"));
        kotlin.jvm.internal.j.g(bVar, numX49.tnTj78("bQuX"));
        kycMayaDropDown.setTag(kycFieldType);
        kycMayaDropDown.setOnDropdownClickListener(new E8.p(bVar, kycFieldType, function1, kycMayaDropDown, 1));
        kycMayaDropDown.getContainerLayout().setOnFocusChangeListener(new F8.c(bVar, kycFieldType, kycMayaDropDown, function2));
    }

    public static final C1538b E(TextView textView) {
        kotlin.jvm.internal.j.h(textView, numX49.tnTj78("bQuG"));
        return new C1538b(textView);
    }

    public static void F(Throwable th2) {
        if (th2 instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th2);
        }
        if (th2 instanceof ThreadDeath) {
            throw ((ThreadDeath) th2);
        }
        if (th2 instanceof LinkageError) {
            throw ((LinkageError) th2);
        }
    }

    public static final void G(Image.Plane plane, int i, int i4, byte[] bArr, int i6, int i10) {
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        int rowStride = ((plane.getRowStride() + buffer.limit()) - 1) / plane.getRowStride();
        if (rowStride == 0) {
            return;
        }
        int i11 = i / (i4 / rowStride);
        int rowStride2 = 0;
        for (int i12 = 0; i12 < rowStride; i12++) {
            int pixelStride = rowStride2;
            for (int i13 = 0; i13 < i11; i13++) {
                bArr[i6] = buffer.get(pixelStride);
                i6 += i10;
                pixelStride += plane.getPixelStride();
            }
            rowStride2 += plane.getRowStride();
        }
    }

    public static Dj.e a(int i, int i4, Dj.a aVar) {
        if ((i4 & 1) != 0) {
            i = 0;
        }
        if ((i4 & 2) != 0) {
            aVar = Dj.a.f1163a;
        }
        if (i == -2) {
            if (aVar != Dj.a.f1163a) {
                return new Dj.o(1, aVar);
            }
            Dj.i.f1191z.getClass();
            return new Dj.e(Dj.h.f1190b);
        }
        if (i != -1) {
            return i != 0 ? i != Integer.MAX_VALUE ? aVar == Dj.a.f1163a ? new Dj.e(i) : new Dj.o(i, aVar) : new Dj.e(Integer.MAX_VALUE) : aVar == Dj.a.f1163a ? new Dj.e(0) : new Dj.o(1, aVar);
        }
        if (aVar == Dj.a.f1163a) {
            return new Dj.o(1, Dj.a.f1164b);
        }
        throw new IllegalArgumentException(numX49.tnTj78("bQu3"));
    }

    public static o b() {
        synchronized (p.class) {
            try {
                o oVar = f18839a;
                if (oVar == null) {
                    return new o();
                }
                f18839a = oVar.f;
                oVar.f = null;
                f18840b -= 8192;
                return oVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void c(o oVar) {
        if (oVar.f != null || oVar.f18838g != null) {
            throw new IllegalArgumentException();
        }
        if (oVar.f18837d) {
            return;
        }
        synchronized (p.class) {
            try {
                long j = f18840b + 8192;
                if (j > 65536) {
                    return;
                }
                f18840b = j;
                oVar.f = f18839a;
                oVar.c = 0;
                oVar.f18836b = 0;
                f18839a = oVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static Object d(Parcel parcel) {
        Parcelable.Creator creator = Bundle.CREATOR;
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static void e(Parcel parcel, Bundle bundle, int i) {
        if (bundle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, i);
        }
    }

    public static final void f(AppCompatEditText appCompatEditText, Function0 function0, Function0 function02) {
        kotlin.jvm.internal.j.g(appCompatEditText, numX49.tnTj78("bQuy"));
        appCompatEditText.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0257g(function0, function02));
    }

    public static FlutterEngine h(Context context) {
        FlutterEngineCache flutterEngineCache = FlutterEngineCache.getInstance();
        kotlin.jvm.internal.j.f(flutterEngineCache, numX49.tnTj78("bQuv"));
        String strTnTj78 = numX49.tnTj78("bQu7");
        FlutterEngine flutterEngine = flutterEngineCache.get(strTnTj78);
        if (flutterEngine != null) {
            return flutterEngine;
        }
        FlutterEngine flutterEngine2 = new FlutterEngine(context);
        flutterEngineCache.put(strTnTj78, flutterEngine2);
        return flutterEngine2;
    }

    public static final void l(int i, int i4) {
        if (i <= 0 || i4 <= 0) {
            String strTnTj78 = numX49.tnTj78("bQuA");
            throw new IllegalArgumentException((i != i4 ? androidx.camera.core.impl.a.h(numX49.tnTj78("bQuY"), i, numX49.tnTj78("bQuT"), i4, strTnTj78) : We.s.g(i, numX49.tnTj78("bQuR"), strTnTj78)).toString());
        }
    }

    public static final void m(AutoCloseable autoCloseable, Throwable th2) throws Exception {
        if (autoCloseable != null) {
            if (th2 != null) {
                try {
                    androidx.camera.core.impl.a.B(autoCloseable);
                    return;
                } catch (Throwable th3) {
                    C1030a.a(th2, th3);
                    return;
                }
            }
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
                return;
            }
            if (autoCloseable instanceof ExecutorService) {
                androidx.core.location.a.y((ExecutorService) autoCloseable);
                return;
            }
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            }
            if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            }
            if (autoCloseable instanceof MediaDrm) {
                ((MediaDrm) autoCloseable).release();
            } else if (autoCloseable instanceof DrmManagerClient) {
                ((DrmManagerClient) autoCloseable).release();
            } else {
                if (!(autoCloseable instanceof ContentProviderClient)) {
                    throw new IllegalArgumentException();
                }
                ((ContentProviderClient) autoCloseable).release();
            }
        }
    }

    public static ByteBuffer n(C2376a c2376a) throws MlKitException {
        int i;
        int i4 = c2376a.f;
        int i6 = 0;
        if (i4 == -1) {
            Bitmap bitmapCopy = (Bitmap) Preconditions.checkNotNull(c2376a.f20685a);
            if (Build.VERSION.SDK_INT >= 26 && bitmapCopy.getConfig() == Bitmap.Config.HARDWARE) {
                bitmapCopy = bitmapCopy.copy(Bitmap.Config.ARGB_8888, bitmapCopy.isMutable());
            }
            Bitmap bitmap = bitmapCopy;
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i10 = width * height;
            int[] iArr = new int[i10];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            int iCeil = (int) Math.ceil(((double) height) / 2.0d);
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(((iCeil + iCeil) * ((int) Math.ceil(((double) width) / 2.0d))) + i10);
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (i11 < height) {
                int i14 = i6;
                while (i14 < width) {
                    int i15 = iArr[i13];
                    int i16 = i15 >> 16;
                    int i17 = i15 >> 8;
                    int i18 = i15 & 255;
                    int i19 = i12 + 1;
                    int i20 = i16 & 255;
                    int i21 = i17 & 255;
                    byteBufferAllocateDirect.put(i12, (byte) Math.min(255, ((((i18 * 25) + ((i21 * TsExtractor.TS_STREAM_TYPE_AC3) + (i20 * 66))) + 128) >> 8) + 16));
                    if (i11 % 2 == 0 && i13 % 2 == 0) {
                        int i22 = ((((i20 * 112) - (i21 * 94)) - (i18 * 18)) + 128) >> 8;
                        int i23 = (((((i20 * (-38)) - (i21 * 74)) + (i18 * 112)) + 128) >> 8) + 128;
                        int i24 = i10 + 1;
                        byteBufferAllocateDirect.put(i10, (byte) Math.min(255, i22 + 128));
                        i10 += 2;
                        byteBufferAllocateDirect.put(i24, (byte) Math.min(255, i23));
                    }
                    i13++;
                    i14++;
                    i12 = i19;
                }
                i11++;
                i6 = 0;
            }
            return byteBufferAllocateDirect;
        }
        if (i4 == 17) {
            return (ByteBuffer) Preconditions.checkNotNull(c2376a.f20686b);
        }
        if (i4 != 35) {
            if (i4 != 842094169) {
                throw new MlKitException(numX49.tnTj78("bQup"), 13);
            }
            ByteBuffer byteBuffer = (ByteBuffer) Preconditions.checkNotNull(c2376a.f20686b);
            byteBuffer.rewind();
            int iLimit = byteBuffer.limit();
            int i25 = iLimit / 6;
            ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(iLimit);
            int i26 = 0;
            while (true) {
                i = i25 * 4;
                if (i26 >= i) {
                    break;
                }
                byteBufferAllocateDirect2.put(i26, byteBuffer.get(i26));
                i26++;
            }
            while (i6 < i25 + i25) {
                byteBufferAllocateDirect2.put(i + i6, byteBuffer.get((i6 / 2) + ((i6 % 2) * i25) + i));
                i6++;
            }
            return byteBufferAllocateDirect2;
        }
        Image.Plane[] planeArr = (Image.Plane[]) Preconditions.checkNotNull(null);
        int i27 = c2376a.c;
        int i28 = c2376a.f20687d;
        int i29 = i27 * i28;
        byte[] bArr = new byte[AbstractC1173g.y(i29, 4, i29)];
        ByteBuffer buffer = planeArr[1].getBuffer();
        ByteBuffer buffer2 = planeArr[2].getBuffer();
        int iPosition = buffer2.position();
        int iLimit2 = buffer.limit();
        buffer2.position(iPosition + 1);
        buffer.limit(iLimit2 - 1);
        int i30 = (i29 + i29) / 4;
        boolean z4 = buffer2.remaining() == i30 + (-2) && buffer2.compareTo(buffer) == 0;
        buffer2.position(iPosition);
        buffer.limit(iLimit2);
        if (z4) {
            planeArr[0].getBuffer().get(bArr, 0, i29);
            ByteBuffer buffer3 = planeArr[1].getBuffer();
            planeArr[2].getBuffer().get(bArr, i29, 1);
            buffer3.get(bArr, i29 + 1, i30 - 1);
        } else {
            G(planeArr[0], i27, i28, bArr, 0, 1);
            G(planeArr[1], i27, i28, bArr, i29 + 1, 2);
            G(planeArr[2], i27, i28, bArr, i29, 2);
        }
        return ByteBuffer.wrap(bArr);
    }

    public static String o(int i, String str) {
        return androidx.media3.datasource.cache.c.h(i, str, numX49.tnTj78("bQu0"));
    }

    public static boolean p(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static final Long s(Cursor cursor) {
        kotlin.jvm.internal.j.g(cursor, numX49.tnTj78("bQug"));
        int columnIndex = cursor.getColumnIndex(numX49.tnTj78("bQuf"));
        if (columnIndex < 0) {
            return null;
        }
        return Long.valueOf(cursor.getLong(columnIndex));
    }

    public static final String t(Cursor cursor, String str) {
        kotlin.jvm.internal.j.g(cursor, numX49.tnTj78("bQu1"));
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex < 0) {
            return null;
        }
        return cursor.getString(columnIndex);
    }

    public static int u(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static final boolean v(Context context) {
        kotlin.jvm.internal.j.g(context, numX49.tnTj78("bQun"));
        return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0;
    }

    public static void w(KycMayaDropDown kycMayaDropDown, KycFieldType kycFieldType, Function1 function1) {
        kotlin.jvm.internal.j.g(kycFieldType, numX49.tnTj78("bQux"));
        kycMayaDropDown.setTag(kycFieldType);
        kycMayaDropDown.setOnDropdownClickListener(new Ag.l(3, function1, kycMayaDropDown));
    }

    public abstract void A(S1.o oVar, Thread thread);

    public abstract boolean i(S1.p pVar, C0590d c0590d, C0590d c0590d2);

    public abstract boolean j(S1.p pVar, Object obj, Object obj2);

    public abstract boolean k(S1.p pVar, S1.o oVar, S1.o oVar2);

    public abstract C0590d q(S1.p pVar);

    public abstract S1.o r(S1.p pVar);

    public abstract void z(S1.o oVar, S1.o oVar2);
}
