package p3;

import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class t implements OnFailureListener, b2.c {
    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to check feature availability", exc);
    }

    @Override // b2.c
    public Object v(Xh.b bVar) {
        return new v3.e((g) bVar.get(g.class));
    }
}
