package dOYHB6;

import android.app.Activity;
import android.os.Bundle;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;

/* JADX INFO: loaded from: classes6.dex */
public abstract class o6arq5 extends Activity {
    private static String zMmdx0() {
        return o6arq5.class.getSimpleName();
    }

    public void callOriginal() {
        startActivity(ewaEX1.wtvry9(this, getSuffix()));
        finish();
    }

    protected String getSuffix() {
        throw new UnsupportedOperationException(numX49.tnTj78("bHMR"));
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        iKNpI8.dHTW22(this);
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        iKNpI8.r8PTp0(this);
    }
}
