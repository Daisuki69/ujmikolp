package io.flutter.plugins.firebase.core;

import androidx.annotation.Keep;
import b2.C0859a;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public class FlutterFirebaseCoreRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C0859a> getComponents() {
        return Collections.singletonList(jk.b.e(BuildConfig.LIBRARY_NAME, BuildConfig.LIBRARY_VERSION));
    }
}
