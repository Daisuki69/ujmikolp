package androidx.multidex;

import android.app.Application;
import android.content.Context;
import com.dynatrace.android.callback.Callback;

/* JADX INFO: loaded from: classes2.dex */
public class MultiDexApplication extends Application {
    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        MultiDex.install(this);
    }

    @Override // android.app.Application
    public /* synthetic */ void onCreate() {
        Callback.onCreate(this);
        super.onCreate();
    }
}
