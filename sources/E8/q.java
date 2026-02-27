package E8;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.hardware.Camera;
import android.view.View;
import com.paymaya.ui.ekyc.view.fragment.impl.EKycPhotoCaptureFragment;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class q implements Camera.PictureCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1298a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1299b;

    public /* synthetic */ q(EKycPhotoCaptureFragment eKycPhotoCaptureFragment) {
        this.f1299b = eKycPhotoCaptureFragment;
    }

    /* JADX WARN: Type inference failed for: r12v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.i] */
    @Override // android.hardware.Camera.PictureCallback
    public final void onPictureTaken(byte[] bArr, Camera camera) {
        switch (this.f1298a) {
            case 0:
                kotlin.jvm.internal.j.d(bArr);
                ((kotlin.jvm.internal.i) this.f1299b).invoke(bArr);
                return;
            default:
                EKycPhotoCaptureFragment eKycPhotoCaptureFragment = (EKycPhotoCaptureFragment) this.f1299b;
                if (camera != null) {
                    camera.stopPreview();
                }
                Matrix matrix = new Matrix();
                matrix.postRotate(90.0f);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr != null ? bArr.length : 0);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, true);
                kotlin.jvm.internal.j.f(bitmapCreateBitmap, "createBitmap(...)");
                bitmapDecodeByteArray.recycle();
                int width = bitmapCreateBitmap.getWidth();
                View view = eKycPhotoCaptureFragment.f14565T;
                File file = null;
                if (view == null) {
                    kotlin.jvm.internal.j.n("mPreviewWindowView");
                    throw null;
                }
                double height = view.getHeight() * width;
                View view2 = eKycPhotoCaptureFragment.f14565T;
                if (view2 == null) {
                    kotlin.jvm.internal.j.n("mPreviewWindowView");
                    throw null;
                }
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), Math.min(sj.b.b((float) (height / ((double) view2.getWidth()))), bitmapCreateBitmap.getHeight()));
                kotlin.jvm.internal.j.f(bitmapCreateBitmap2, "createBitmap(...)");
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmapCreateBitmap2.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bitmapCreateBitmap.recycle();
                bitmapCreateBitmap2.recycle();
                File file2 = new File(eKycPhotoCaptureFragment.requireContext().getCacheDir(), "Image");
                if (file2.exists() || file2.mkdirs()) {
                    file = new File(file2.getPath() + File.separator + "photo_capture" + System.currentTimeMillis() + ".jpg");
                } else {
                    yk.a.a();
                }
                eKycPhotoCaptureFragment.f14580i0 = file;
                if (file != null) {
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(eKycPhotoCaptureFragment.f14580i0);
                        fileOutputStream.write(byteArray);
                        fileOutputStream.close();
                    } catch (Exception unused) {
                        yk.a.b();
                    }
                    break;
                }
                eKycPhotoCaptureFragment.r1().l();
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ q(Function1 function1) {
        this.f1299b = (kotlin.jvm.internal.i) function1;
    }
}
