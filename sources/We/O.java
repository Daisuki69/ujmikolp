package We;

import android.net.Uri;
import android.os.Looper;
import dOYHB6.tiZVw8.numX49;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
public abstract class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final StringBuilder f6375a = new StringBuilder();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ByteString f6376b = ByteString.encodeUtf8(numX49.tnTj78("bkRL"));
    public static final ByteString c = ByteString.encodeUtf8(numX49.tnTj78("bkRr"));

    public static void a() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(numX49.tnTj78("bkRZ"));
        }
    }

    public static String b(F f) {
        StringBuilder sb2 = f6375a;
        Uri uri = f.f6354a;
        if (uri != null) {
            String string = uri.toString();
            sb2.ensureCapacity(string.length() + 50);
            sb2.append(string);
        } else {
            sb2.ensureCapacity(50);
            sb2.append(f.f6355b);
        }
        sb2.append('\n');
        if (f.a()) {
            sb2.append(numX49.tnTj78("bkRk"));
            sb2.append(f.f6356d);
            sb2.append('x');
            sb2.append(f.e);
            sb2.append('\n');
        }
        if (f.f) {
            sb2.append(numX49.tnTj78("bkRB"));
            sb2.append(f.f6357g);
            sb2.append('\n');
        }
        List list = f.c;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                sb2.append(((M) list.get(i)).a());
                sb2.append('\n');
            }
        }
        String string2 = sb2.toString();
        sb2.setLength(0);
        return string2;
    }
}
