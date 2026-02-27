package E;

import D.S;
import D.d0;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.dynatrace.android.callback.Callback;
import dOYHB6.tiZVw8.numX49;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.regex.Pattern;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1210b;
    public final S c;

    public c(boolean z4, int i) {
        z4 = (i & 1) != 0 ? false : z4;
        boolean z5 = (i & 2) != 0;
        this.f1209a = z4;
        this.f1210b = z5;
        this.c = null;
    }

    public c0.f a(InputStream inputStream, HttpURLConnection httpURLConnection, long j) throws Exception {
        S s9 = this.c;
        if (s9 != null) {
            S.q(numX49.tnTj78("P4L"));
        }
        byte[] bArr = new byte[16384];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        while (true) {
            int i4 = inputStream.read(bArr);
            if (i4 == -1) {
                break;
            }
            i += i4;
            byteArrayOutputStream.write(bArr, 0, i4);
            if (s9 != null) {
                S.q(numX49.tnTj78("P4r") + i + numX49.tnTj78("P4Z"));
            }
        }
        if (s9 != null) {
            S.q(numX49.tnTj78("P4k") + i);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int contentLength = Callback.getContentLength(httpURLConnection);
        if (contentLength != -1 && contentLength != i) {
            if (s9 != null) {
                S.f(numX49.tnTj78("P4B") + httpURLConnection.getURL());
            }
            return new c0.f(null, c0.e.f9188d, -1L, null);
        }
        if (!this.f1210b) {
            Pattern pattern = d0.f906a;
            long jCurrentTimeMillis = System.currentTimeMillis() - j;
            j.d(byteArray);
            return new c0.f(null, c0.e.c, jCurrentTimeMillis, byteArray);
        }
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
        if (bitmapDecodeByteArray == null) {
            return new c0.f(null, c0.e.f9188d, -1L, null);
        }
        Pattern pattern2 = d0.f906a;
        long jCurrentTimeMillis2 = System.currentTimeMillis() - j;
        if (!this.f1209a) {
            byteArray = null;
        }
        return new c0.f(bitmapDecodeByteArray, c0.e.c, jCurrentTimeMillis2, byteArray);
    }
}
