package androidx.window.area;

import android.content.Context;
import android.view.View;
import androidx.window.core.ExperimentalWindowApi;

/* JADX INFO: loaded from: classes2.dex */
@ExperimentalWindowApi
public interface WindowAreaSessionPresenter extends WindowAreaSession {
    Context getContext();

    void setContentView(View view);
}
