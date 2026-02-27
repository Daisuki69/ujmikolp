package p3;

import android.util.Log;
import androidx.browser.trusted.sharing.ShareTarget;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import z1.InterfaceC2546a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class s implements OnFailureListener, InterfaceC2546a {
    public static Xe.a a(String str) throws Exception {
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection());
        Callback.openConnection(uRLConnection);
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
        httpURLConnection.setRequestMethod(ShareTarget.METHOD_GET);
        Callback.connect(httpURLConnection);
        return new Xe.a(httpURLConnection, 1);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
    }
}
