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
import java.util.zip.GZIPInputStream;
import kotlin.jvm.internal.j;
import zj.C2576A;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends c {
    public d() {
        super(false, 2);
    }

    @Override // E.c
    public final c0.f a(InputStream inputStream, HttpURLConnection httpURLConnection, long j) throws Exception {
        S.l(numX49.tnTj78("P4P"));
        String contentEncoding = Callback.getContentEncoding(httpURLConnection);
        if (!(contentEncoding != null ? C2576A.z(contentEncoding, numX49.tnTj78("P4b"), false, 2) : false)) {
            return super.a(inputStream, httpURLConnection, j);
        }
        GZIPInputStream gZIPInputStream = new GZIPInputStream(inputStream);
        byte[] bArr = new byte[16384];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i = gZIPInputStream.read(bArr);
            if (i == -1) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
        if (this.c != null) {
            S.q(numX49.tnTj78("P42") + byteArrayOutputStream.size());
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
        j.d(bitmapDecodeByteArray);
        Pattern pattern = d0.f906a;
        return new c0.f(bitmapDecodeByteArray, c0.e.c, System.currentTimeMillis() - j, null);
    }
}
