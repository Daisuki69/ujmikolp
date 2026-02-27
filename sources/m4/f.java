package m4;

import android.content.Intent;
import android.util.Log;
import androidx.media3.exoplayer.upstream.CmcdData;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f18356b;

    public /* synthetic */ f(h hVar, int i) {
        this.f18355a = i;
        this.f18356b = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h hVar = this.f18356b;
        switch (this.f18355a) {
            case 0:
                Log.d(CmcdData.Factory.STREAMING_FORMAT_HLS, "Finishing due to inactivity");
                hVar.c();
                break;
            default:
                Intent intent = new Intent("com.google.zxing.client.android.SCAN");
                intent.putExtra("TIMEOUT", true);
                hVar.f18359a.setResult(0, intent);
                hVar.a();
                break;
        }
    }
}
